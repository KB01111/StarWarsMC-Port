#!/usr/bin/env python3
"""Run extract -> decompile -> remap -> fix -> split and report inventory diff."""
import argparse
import re
import subprocess
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
SCRIPTS = ROOT / "scripts"


def parse_args():
    parser = argparse.ArgumentParser(description="Run the full SWGC decompile pipeline.")
    parser.add_argument("--skip-split", action="store_true", help="Skip split_modules step")
    parser.add_argument("--full-replace", action="store_true", help="Pass --full-replace to split_modules")
    return parser.parse_args()


def run_step(name: str, script: str, *extra_args: str) -> None:
    cmd = [sys.executable, str(SCRIPTS / script), *extra_args]
    print(f"\n=== {name} ===")
    print("Running:", " ".join(cmd))
    result = subprocess.run(cmd, cwd=ROOT)
    if result.returncode != 0:
        raise SystemExit(f"{name} failed with exit code {result.returncode}")


def parse_inventory(path: Path) -> set[str]:
    if not path.is_file():
        return set()
    classes: set[str] = set()
    current_pkg = ""
    for line in path.read_text(encoding="utf-8").splitlines():
        if line.startswith("## `"):
            m = re.match(r"## `([^`]+)`", line)
            if m:
                current_pkg = m.group(1)
        elif line.startswith("- `") and line.endswith("`"):
            cls = line[3:-1]
            if current_pkg == "(root)":
                classes.add(cls)
            else:
                classes.add(f"{current_pkg}/{cls}")
    return classes


def port_java_files() -> set[str]:
    found: set[str] = set()
    for base in [
        ROOT / "common" / "src" / "main" / "java" / "che" / "swgc",
        ROOT / "fabric" / "src" / "main" / "java" / "che" / "swgc",
        ROOT / "fabric" / "src" / "client" / "java" / "che" / "swgc",
    ]:
        if not base.exists():
            continue
        for java in base.rglob("*.java"):
            rel = java.relative_to(base)
            pkg = str(rel.parent).replace("\\", "/")
            if pkg == ".":
                found.add(rel.name)
            else:
                found.add(f"{pkg}/{rel.name}")
    return found


def count_assets() -> dict[str, int]:
    res = ROOT / "common" / "src" / "main" / "resources"
    extracted = ROOT / "extracted"
    counts = {}
    for label, base in [("resources", res), ("extracted", extracted)]:
        if base.exists():
            counts[f"{label}_png"] = len(list(base.rglob("*.png")))
            counts[f"{label}_ogg"] = len(list(base.rglob("*.ogg")))
            counts[f"{label}_nbt"] = len(list(base.rglob("*.nbt")))
    counts["decompiled_java"] = len(list((ROOT / "decompiled").rglob("*.java")))
    counts["remapped_java"] = len(list((ROOT / "remapped").rglob("*.java")))
    return counts


def main():
    args = parse_args()

    run_step("Extract JAR", "extract_jar.py")
    run_step("Decompile", "decompile.py")
    run_step("Remap", "remap_pipeline.py")
    run_step("Fix 26.2 mappings", "fix_26_2_mappings.py")

    if not args.skip_split:
        split_args = ["--full-replace"] if args.full_replace else ["--merge-only"]
        run_step("Split modules", "split_modules.py", *split_args)

    inventory = parse_inventory(ROOT / "CLASS_INVENTORY.md")
    port = port_java_files()
    missing = sorted(inventory - port)
    extra = sorted(port - inventory)

    counts = count_assets()
    print("\n=== Pipeline Summary ===")
    print(f"Inventory classes: {len(inventory)}")
    print(f"Port Java files: {len(port)}")
    print(f"Decompiled Java: {counts.get('decompiled_java', 0)}")
    print(f"Remapped Java: {counts.get('remapped_java', 0)}")
    print(f"Resources PNG: {counts.get('resources_png', 0)}")
    print(f"Resources OGG: {counts.get('resources_ogg', 0)}")
    print(f"Resources NBT: {counts.get('resources_nbt', 0)}")
    if missing:
        print(f"\nMissing from port ({len(missing)}):")
        for cls in missing[:20]:
            print(f"  - {cls}")
        if len(missing) > 20:
            print(f"  ... and {len(missing) - 20} more")
    else:
        print("\nAll inventoried classes present in port tree.")
    if extra:
        print(f"\nExtra port files not in inventory ({len(extra)}) — expected for platform stubs.")


if __name__ == "__main__":
    main()
