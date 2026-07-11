#!/usr/bin/env python3
"""
Remap decompiled intermediary (class_XXXX) names to Mojang official names for MC 26.2.
Downloads Fabric layered mappings and applies to all Java source files.
"""
import re
import sys
import urllib.request
from pathlib import Path

ROOT = Path(r"C:\Users\kevin\Projekt\StarWarsMC-Port")
MAPPINGS_DIR = ROOT / "tools" / "mappings"
MC_VERSION = "26.2"

# Fabric maven provides intermediary->official mappings
MAPPINGS_URL = f"https://maven.fabricmc.net/net/fabricmc/yarn/{MC_VERSION}+build.1/yarn-{MC_VERSION}+build.1-v2.jar"

# Fallback: use Mojang official mappings from Fabric
FALLBACK_URLS = [
    f"https://maven.fabricmc.net/net/fabricmc/yarn/{MC_VERSION}+build.1/yarn-{MC_VERSION}+build.1-v2.jar",
    "https://maven.fabricmc.net/net/minecraft/mappings/26.2/mappings-26.2.tiny",
    "https://maven.fabricmc.net/net/minecraft/mappings/1.21.4/mappings-1.21.4.tiny",
]


def download_mappings():
    MAPPINGS_DIR.mkdir(parents=True, exist_ok=True)
    tiny_file = MAPPINGS_DIR / "mappings.tiny"

    if tiny_file.exists() and tiny_file.stat().st_size > 1000:
        print(f"Using cached mappings: {tiny_file}")
        return tiny_file

    for url in FALLBACK_URLS:
        try:
            print(f"Trying {url}")
            req = urllib.request.Request(url, headers={"User-Agent": "swgc-port/1.0"})
            with urllib.request.urlopen(req, timeout=30) as resp:
                data = resp.read()
            if url.endswith(".jar"):
                import zipfile, io
                with zipfile.ZipFile(io.BytesIO(data)) as zf:
                    for name in zf.namelist():
                        if name.endswith(".tiny") or name == "mappings/mappings.tiny":
                            tiny_file.write_bytes(zf.read(name))
                            print(f"Extracted {name} from jar")
                            return tiny_file
            else:
                tiny_file.write_bytes(data)
                return tiny_file
        except Exception as e:
            print(f"  Failed: {e}")

    return None


def parse_tiny_v2(content: str) -> dict:
    """Parse tiny v2 mappings: intermediary -> named (official)."""
    mapping = {}
    current_class = None
    in_inter_to_named = False

    for line in content.splitlines():
        line = line.strip()
        if not line or line.startswith("#"):
            continue

        if line.startswith("tiny\t"):
            parts = line.split("\t")
            if len(parts) >= 3:
                # tiny v2 format: tiny\t2\tfrom\tto
                in_inter_to_named = "intermediary" in parts and "named" in parts
            continue

        if line.startswith("c\t"):
            # class mapping: c\tintermediaryName\tnamedName
            parts = line.split("\t")
            if len(parts) >= 3:
                inter = parts[1]
                named = parts[2]
                if inter.startswith("class_") or inter.startswith("net/"):
                    mapping[inter.replace("/", ".")] = named.replace("/", ".")
                    # Also map inner classes
                    current_class = inter.replace("/", ".")
            continue

        if line.startswith("m\t") and current_class:
            # method mapping
            parts = line.split("\t")
            if len(parts) >= 4:
                inter_method = parts[2]
                named_method = parts[3]
                mapping[f"{current_class}.{inter_method}"] = named_method

        if line.startswith("f\t") and current_class:
            # field mapping
            parts = line.split("\t")
            if len(parts) >= 4:
                inter_field = parts[2]
                named_field = parts[3]
                mapping[f"{current_class}.{inter_field}"] = named_field

    return mapping


def parse_tiny_v1(content: str) -> dict:
    """Parse tiny v1 (official Mojang) format."""
    mapping = {}
    current_class_inter = None
    current_class_named = None

    for line in content.splitlines():
        if not line or line.startswith("#"):
            continue

        if line.startswith("CLASS"):
            parts = line.split("\t")
            if len(parts) >= 3:
                current_class_inter = parts[1].replace("/", ".")
                current_class_named = parts[2].replace("/", ".")
                mapping[current_class_inter] = current_class_named
            continue

        if line.startswith("FIELD") and current_class_inter:
            parts = line.split("\t")
            if len(parts) >= 5:
                inter_field = parts[3]
                named_field = parts[4]
                mapping[f"{current_class_inter}.{inter_field}"] = named_field

        if line.startswith("METHOD") and current_class_inter:
            parts = line.split("\t")
            if len(parts) >= 6:
                inter_method = parts[4]
                named_method = parts[5]
                mapping[f"{current_class_inter}.{inter_method}"] = named_method

    return mapping


def parse_mappings_file(path: Path) -> dict:
    content = path.read_text(encoding="utf-8", errors="replace")
    if content.startswith("tiny\t"):
        return parse_tiny_v2(content)
    return parse_tiny_v1(content)


def apply_mappings(java_dir: Path, class_map: dict):
    """Apply class and member remapping to Java files."""
    # Sort by length descending to avoid partial replacements
    class_renames = {k: v for k, v in class_map.items() if not "." in k or k.startswith("class_")}
    class_only = {k: v for k, v in class_map.items() if k.startswith("class_") or ("/" not in k and "." not in k.split(".")[-1] if "." in k else True)}

    # Build clean class map (class_XXXX -> OfficialName)
    clean_class = {}
    for k, v in class_map.items():
        if k.startswith("class_") and "." not in k:
            clean_class[k] = v
        elif k.startswith("net.minecraft"):
            pass  # already named

    # Also handle inner classes: class_1761$class_7913 -> CreativeModeTab.ItemDisplayBuilder
    inner_class = {}
    for k, v in class_map.items():
        if "$" in k or (k.count(".") > 0 and k.split(".")[0].startswith("class_")):
            inner_class[k.replace("$", ".")] = v.replace("$", ".")

    print(f"Class mappings: {len(clean_class)}")
    print(f"Inner class mappings: {len(inner_class)}")
    print(f"Total mappings: {len(class_map)}")

    files = list(java_dir.rglob("*.java"))
    print(f"Processing {len(files)} Java files in {java_dir}")

    for fpath in files:
        content = fpath.read_text(encoding="utf-8", errors="replace")
        original = content

        # Replace inner classes first (longer names)
        for inter, named in sorted(inner_class.items(), key=lambda x: -len(x[0])):
            content = content.replace(inter, named)

        # Replace class references
        for inter, named in sorted(clean_class.items(), key=lambda x: -len(x[0])):
            content = content.replace(inter, named)

        # Replace field/method references (class_XXXX.field_YYYY patterns)
        field_method_map = {k: v for k, v in class_map.items() if k.count(".") == 1 and k.split(".")[0].startswith("class_")}
        for inter, named in sorted(field_method_map.items(), key=lambda x: -len(x[0])):
            # Need to remap the class part too
            cls, member = inter.split(".", 1)
            if cls in clean_class:
                new_ref = f"{clean_class[cls]}.{named}"
                content = content.replace(inter, new_ref)

        if content != original:
            fpath.write_text(content, encoding="utf-8")

    print("Remapping complete")


def main():
    # Try to get mappings from Fabric Loom cache after gradle setup
    loom_cache = Path.home() / ".gradle" / "caches" / "fabric-loom"
    mapping_file = download_mappings()

    if mapping_file is None:
        print("WARNING: Could not download mappings. Will try gradle-generated mappings.")
        # Search loom cache
        if loom_cache.exists():
            for tiny in loom_cache.rglob("*.tiny"):
                if tiny.stat().st_size > 10000:
                    mapping_file = tiny
                    print(f"Found in loom cache: {tiny}")
                    break

    if mapping_file is None:
        print("ERROR: No mappings available. Run gradle first to populate loom cache.")
        sys.exit(1)

    class_map = parse_mappings_file(mapping_file)
    print(f"Parsed {len(class_map)} mapping entries")

    # Apply to all module source dirs
    for module_dir in [
        ROOT / "common" / "src" / "main" / "java",
        ROOT / "fabric" / "src" / "main" / "java",
        ROOT / "fabric" / "src" / "client" / "java",
        ROOT / "decompiled",  # also remap decompiled for reference
    ]:
        if module_dir.exists():
            apply_mappings(module_dir, class_map)


if __name__ == "__main__":
    main()
