import zipfile
import shutil
from pathlib import Path

root = Path(r"C:\Users\kevin\Projekt\StarWarsMC-Port")
jar = root / "libs" / "swgc-fabric-1.20.1-1.0.1.1.jar"
extract_dir = root / "extracted"

if extract_dir.exists():
    shutil.rmtree(extract_dir)
extract_dir.mkdir(parents=True)

with zipfile.ZipFile(jar, "r") as zf:
    zf.extractall(extract_dir)

classes = list(extract_dir.rglob("*.class"))
pngs = list(extract_dir.rglob("*.png"))
oggs = list(extract_dir.rglob("*.ogg"))
print(f"Extracted to {extract_dir}")
print(f"Total files: {sum(1 for _ in extract_dir.rglob('*') if _.is_file())}")
print(f"Class files: {len(classes)}")
print(f"PNG files: {len(pngs)}")
print(f"OGG files: {len(oggs)}")

# Copy assets to workspace root (replace incomplete extraction)
for subdir in ["assets", "data", "META-INF"]:
    src = extract_dir / subdir
    if src.exists():
        dst = root / subdir
        if dst.exists():
            shutil.rmtree(dst)
        shutil.copytree(src, dst)

for fname in ["fabric.mod.json", "pack.mcmeta", "swgc.refmap.json", "swgc.mixins.json", "swgc.fabric.mixins.json"]:
    src = extract_dir / fname
    if src.exists():
        shutil.copy2(src, root / fname)

print("Assets copied to workspace root")
