#!/usr/bin/env python3
"""
Remap yarn 1.20.1 named classes to Mojang official names via intermediary bridge.
Uses yarn 1.20.1 (intermediary->yarn) + Mojang 1.20.1 (intermediary->official) to build yarn->official.
"""
import io
import re
import urllib.request
import zipfile
from pathlib import Path

ROOT = Path(r"C:\Users\kevin\Projekt\StarWarsMC-Port")
YARN_TINY = ROOT / "tools" / "mappings" / "yarn-1.20.1.tiny"
MOJANG_TINY = ROOT / "tools" / "mappings" / "mojang-1.20.1.tiny"

MOJANG_URL = "https://maven.fabricmc.net/net/minecraft/mappings/1.20.1/mappings-1.20.1.tiny"


def download_mojang():
    if MOJANG_TINY.exists() and MOJANG_TINY.stat().st_size > 100000:
        return MOJANG_TINY.read_text(encoding="utf-8")
    print(f"Downloading {MOJANG_URL}")
    req = urllib.request.Request(MOJANG_URL, headers={"User-Agent": "swgc-port"})
    with urllib.request.urlopen(req, timeout=60) as r:
        content = r.read().decode("utf-8")
    MOJANG_TINY.parent.mkdir(parents=True, exist_ok=True)
    MOJANG_TINY.write_text(content, encoding="utf-8")
    return content


def parse_inter_to_named(content: str, named_col: int = 2) -> dict:
    """Parse tiny v2 with intermediary in col 1, named in col named_col."""
    mappings = {}
    current_inter = None
    current_named = None

    for line in content.splitlines():
        if line.startswith("c\t"):
            parts = line.split("\t")
            if len(parts) >= 3:
                current_inter = parts[1].replace("/", ".")
                current_named = parts[named_col].replace("/", ".")
                mappings[current_inter] = current_named
        elif line.startswith("f\t") and current_inter:
            parts = line.split("\t")
            if len(parts) >= 4:
                mappings[f"{current_inter}.{parts[2]}"] = parts[named_col]
        elif line.startswith("m\t") and current_inter:
            parts = line.split("\t")
            if len(parts) >= 4:
                mappings[f"{current_inter}.{parts[2]}"] = parts[named_col]

    return mappings


def build_yarn_to_mojang(yarn_content: str, mojang_content: str) -> dict:
    """Build yarn named -> mojang official mapping via intermediary bridge."""
    # Yarn tiny: intermediary -> named (col 2)
    yarn_map = parse_inter_to_named(yarn_content, 2)
    # Mojang tiny v1 format: obfuscated -> official (need different parser)

    # Parse mojang tiny v1
    mojang_map = {}  # intermediary -> official
    current_inter = None
    current_official = None

    for line in mojang_content.splitlines():
        if line.startswith("CLASS"):
            parts = line.split("\t")
            if len(parts) >= 3:
                current_inter = parts[1].replace("/", ".")
                current_official = parts[2].replace("/", ".")
                mojang_map[current_inter] = current_official
        elif line.startswith("FIELD") and current_inter:
            parts = line.split("\t")
            if len(parts) >= 5:
                mojang_map[f"{current_inter}.{parts[3]}"] = parts[4]
        elif line.startswith("METHOD") and current_inter:
            parts = line.split("\t")
            if len(parts) >= 6:
                mojang_map[f"{current_inter}.{parts[4]}"] = parts[5]

    # Build yarn -> mojang via intermediary
    yarn_to_mojang = {}
    for inter, yarn_name in yarn_map.items():
        if inter in mojang_map:
            yarn_to_mojang[yarn_name] = mojang_map[inter]

    return yarn_to_mojang


def apply_mappings(java_dir: Path, mappings: dict):
    replacements = sorted(mappings.items(), key=lambda x: -len(x[0]))
    count = 0
    for fpath in java_dir.rglob("*.java"):
        text = fpath.read_text(encoding="utf-8")
        orig = text
        for yarn, mojang in replacements:
            yarn_dot = yarn.replace("$", ".")
            mojang_dot = mojang.replace("$", ".")
            text = text.replace(yarn_dot, mojang_dot)
            if "$" in yarn:
                text = text.replace(yarn, mojang)
        if text != orig:
            fpath.write_text(text, encoding="utf-8")
            count += 1
    return count


def main():
    yarn_content = YARN_TINY.read_text(encoding="utf-8")
    mojang_content = download_mojang()

    yarn_to_mojang = build_yarn_to_mojang(yarn_content, mojang_content)
    print(f"Built {len(yarn_to_mojang)} yarn->mojang mappings")

    # Save for reference
    mapping_out = ROOT / "tools" / "mappings" / "yarn-to-mojang.txt"
    with open(mapping_out, "w", encoding="utf-8") as f:
        for k, v in sorted(yarn_to_mojang.items()):
            f.write(f"{k} -> {v}\n")

    total = 0
    for module in [
        ROOT / "common" / "src" / "main" / "java",
        ROOT / "fabric" / "src" / "main" / "java",
        ROOT / "fabric" / "src" / "client" / "java",
    ]:
        if module.exists():
            n = apply_mappings(module, yarn_to_mojang)
            print(f"{module.relative_to(ROOT)}: {n} files")
            total += n

    print(f"Total remapped: {total}")


if __name__ == "__main__":
    main()
