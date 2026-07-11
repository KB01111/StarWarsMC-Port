import subprocess
import sys
from pathlib import Path

root = Path(r"C:\Users\kevin\Projekt\StarWarsMC-Port")
extract_dir = root / "extracted"
decompiled_dir = root / "decompiled"
vineflower_jar = root / "tools" / "vineflower.jar"

# Download vineflower if needed
vineflower_jar.parent.mkdir(parents=True, exist_ok=True)
if not vineflower_jar.exists():
    import urllib.request
    url = "https://github.com/Vineflower/vineflower/releases/download/1.10.1/vineflower-1.10.1.jar"
    print(f"Downloading Vineflower from {url}")
    urllib.request.urlretrieve(url, vineflower_jar)

if decompiled_dir.exists():
    import shutil
    shutil.rmtree(decompiled_dir)
decompiled_dir.mkdir(parents=True)

# Decompile che/swgc classes
input_dir = extract_dir / "che" / "swgc"
if not input_dir.exists():
    print(f"ERROR: {input_dir} not found")
    sys.exit(1)

output_dir = decompiled_dir / "che" / "swgc"
output_dir.mkdir(parents=True, exist_ok=True)

cmd = [
    "java", "-jar", str(vineflower_jar),
    "-dgs=1", "-hdc=0", "-rbr=0", "-asc=1", "-udv=0",
    str(input_dir),
    str(output_dir),
]
print("Running:", " ".join(cmd))
result = subprocess.run(cmd, capture_output=True, text=True)
print(result.stdout)
if result.returncode != 0:
    print("STDERR:", result.stderr)
    sys.exit(result.returncode)

# Inventory
java_files = sorted(decompiled_dir.rglob("*.java"))
print(f"\nDecompiled {len(java_files)} Java files")

# Package inventory
packages = {}
for f in java_files:
    rel = f.relative_to(decompiled_dir / "che" / "swgc")
    pkg = str(rel.parent).replace("\\", "/") if rel.parent != Path(".") else "(root)"
    packages.setdefault(pkg, []).append(rel.name)

inventory_path = root / "CLASS_INVENTORY.md"
with open(inventory_path, "w", encoding="utf-8") as out:
    out.write("# SWGC Class Inventory (decompiled from 1.20.1)\n\n")
    out.write(f"Total Java files: {len(java_files)}\n\n")
    for pkg in sorted(packages.keys()):
        classes = sorted(packages[pkg])
        out.write(f"## `{pkg}` ({len(classes)} classes)\n\n")
        for cls in classes:
            out.write(f"- `{cls}`\n")
        out.write("\n")

print(f"Inventory written to {inventory_path}")
