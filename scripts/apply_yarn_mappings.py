#!/usr/bin/env python3
"""Apply Yarn 1.20.1 intermediary->named mappings to decompiled SWGC sources."""
import io
import re
import urllib.request
import zipfile
from pathlib import Path

ROOT = Path(r"C:\Users\kevin\Projekt\StarWarsMC-Port")
TINY_FILE = ROOT / "tools" / "mappings" / "yarn-1.20.1.tiny"
YARN_URL = "https://maven.fabricmc.net/net/fabricmc/yarn/1.20.1+build.10/yarn-1.20.1+build.10-v2.jar"


def download_yarn():
    if TINY_FILE.exists() and TINY_FILE.stat().st_size > 100000:
        return TINY_FILE.read_text(encoding="utf-8")
    print(f"Downloading {YARN_URL}")
    req = urllib.request.Request(YARN_URL, headers={"User-Agent": "swgc-port"})
    with urllib.request.urlopen(req, timeout=60) as r:
        data = r.read()
    with zipfile.ZipFile(io.BytesIO(data)) as zf:
        tiny_name = [n for n in zf.namelist() if n.endswith(".tiny")][0]
        content = zf.read(tiny_name).decode("utf-8")
    TINY_FILE.parent.mkdir(parents=True, exist_ok=True)
    TINY_FILE.write_text(content, encoding="utf-8")
    return content


def parse_tiny_v2(content: str) -> dict:
    """Parse tiny v2: returns dict of intermediary -> named (dot-separated)."""
    mappings = {}
    current_inter = None
    current_named = None

    for line in content.splitlines():
        if line.startswith("c\t"):
            parts = line.split("\t")
            if len(parts) >= 3:
                current_inter = parts[1].replace("/", ".")
                current_named = parts[2].replace("/", ".")
                mappings[current_inter] = current_named
                # Also short form: class_XXXX
                short = current_inter.split(".")[-1]
                if short.startswith("class_"):
                    mappings[short] = current_named
        elif line.startswith("f\t") and current_inter:
            parts = line.split("\t")
            if len(parts) >= 4:
                inter_field = parts[2]
                named_field = parts[3]
                mappings[f"{current_inter}.{inter_field}"] = named_field
                short = current_inter.split(".")[-1]
                mappings[f"{short}.{inter_field}"] = f"{current_named.split('.')[-1]}.{named_field}"
        elif line.startswith("m\t") and current_inter:
            parts = line.split("\t")
            if len(parts) >= 4:
                inter_desc = parts[2]
                named_method = parts[3]
                mappings[f"{current_inter}.{inter_desc}"] = named_method
                short = current_inter.split(".")[-1]
                mappings[f"{short}.{inter_desc}"] = named_method

    return mappings


def remap_file(content: str, mappings: dict) -> str:
    # Phase 1: Replace full intermediary class paths
    # Phase 2: Replace short class_XXXX references
    # Phase 3: Replace field/method references

    # Build replacement list sorted by length (longest first)
    replacements = sorted(mappings.items(), key=lambda x: -len(x[0]))

    for inter, named in replacements:
        # Handle inner classes: net.minecraft.class_1761$class_7913 -> net.minecraft.item.CreativeModeTab$ItemDisplayBuilder
        inter_dot = inter.replace("$", ".")
        named_dot = named.replace("$", ".")
        content = content.replace(inter_dot, named_dot)
        if "$" in inter:
            content = content.replace(inter, named)

    return content


def main():
    content = download_yarn()
    mappings = parse_tiny_v2(content)
    print(f"Parsed {len(mappings)} mapping entries")

    class_count = sum(1 for k in mappings if k.startswith("net.minecraft.class_") or (k.startswith("class_") and "." not in k))
    print(f"Class entries: {class_count}")

    modules = [
        ROOT / "common" / "src" / "main" / "java",
        ROOT / "fabric" / "src" / "main" / "java",
        ROOT / "fabric" / "src" / "client" / "java",
    ]

    total_remapped = 0
    for java_dir in modules:
        if not java_dir.exists():
            continue
        for fpath in java_dir.rglob("*.java"):
            original = fpath.read_text(encoding="utf-8")
            remapped = remap_file(original, mappings)
            if remapped != original:
                fpath.write_text(remapped, encoding="utf-8")
                total_remapped += 1

    print(f"Remapped {total_remapped} files")


if __name__ == "__main__":
    main()
