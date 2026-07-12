import argparse
import shutil
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
DEFAULT_JAR = ROOT / "libs" / "swgc-fabric-1.20.1-1.0.1.1.jar"
COMMON_RES = ROOT / "common" / "src" / "main" / "resources"


def parse_args():
    parser = argparse.ArgumentParser(description="Extract SWGC JAR and restore binary assets.")
    parser.add_argument("--jar", type=Path, default=DEFAULT_JAR, help="Path to source JAR")
    parser.add_argument("--root", type=Path, default=ROOT, help="Worktree root")
    return parser.parse_args()


def copy_tree(src: Path, dst: Path):
    if dst.exists():
        shutil.rmtree(dst)
    shutil.copytree(src, dst)


def main():
    args = parse_args()
    root = args.root
    jar = args.jar
    extract_dir = root / "extracted"

    if not jar.is_file():
        raise SystemExit(f"JAR not found: {jar}")

    if extract_dir.exists():
        shutil.rmtree(extract_dir)
    extract_dir.mkdir(parents=True)

    with zipfile.ZipFile(jar, "r") as zf:
        for member in zf.namelist():
            member_path = (extract_dir / member).resolve()
            if not member_path.is_relative_to(extract_dir):
                raise ValueError(f"Zip entry has unsafe path: {member}")
        zf.extractall(extract_dir)

    classes = list(extract_dir.rglob("*.class"))
    pngs = list(extract_dir.rglob("*.png"))
    oggs = list(extract_dir.rglob("*.ogg"))
    nbts = list(extract_dir.rglob("*.nbt"))
    print(f"Extracted to {extract_dir}")
    print(f"Total files: {sum(1 for _ in extract_dir.rglob('*') if _.is_file())}")
    print(f"Class files: {len(classes)}")
    print(f"PNG files: {len(pngs)}")
    print(f"OGG files: {len(oggs)}")
    print(f"NBT files: {len(nbts)}")

    COMMON_RES.mkdir(parents=True, exist_ok=True)

    for subdir in ["assets", "data"]:
        src = extract_dir / subdir
        if src.exists():
            copy_tree(src, COMMON_RES / subdir)

    meta_src = extract_dir / "META-INF"
    if meta_src.exists():
        copy_tree(meta_src, root / "META-INF")

    for fname in ["fabric.mod.json", "pack.mcmeta", "swgc.refmap.json", "swgc.mixins.json", "swgc.fabric.mixins.json"]:
        src = extract_dir / fname
        if src.exists():
            shutil.copy2(src, root / fname)

    pack_mcmeta = extract_dir / "pack.mcmeta"
    if pack_mcmeta.exists():
        shutil.copy2(pack_mcmeta, COMMON_RES / "pack.mcmeta")

    print(f"Assets copied to {COMMON_RES}")


if __name__ == "__main__":
    main()
