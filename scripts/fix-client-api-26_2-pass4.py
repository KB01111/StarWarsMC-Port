#!/usr/bin/env python3
"""Fourth-pass renderer API fixes for MC 26.2."""
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client"

REPLACEMENTS = (
    ("Axis.NEGATIVE_X", "Axis.XN"),
    ("Axis.POSITIVE_X", "Axis.XP"),
    ("Axis.NEGATIVE_Y", "Axis.YN"),
    ("Axis.POSITIVE_Y", "Axis.YP"),
    ("Axis.NEGATIVE_Z", "Axis.ZN"),
    ("Axis.POSITIVE_Z", "Axis.ZP"),
    (".getPitch(", ".getXRot("),
    (".getHeight()", ".getBbHeight()"),
    ("submitNodeCollector.getBuffer(", "submitNodeCollector.order(0).getBuffer("),
)

REMOVE_ITEM_LAYER = (
    "EwokRenderer.java",
    "EwokShamanRenderer.java",
    "RoyalGuardianRenderer.java",
)


def fix_file(path: Path) -> bool:
    text = path.read_text(encoding="utf-8")
    updated = text
    for old, new in REPLACEMENTS:
        updated = updated.replace(old, new)
    if path.name in REMOVE_ITEM_LAYER:
        updated = updated.replace(
            "      this.addLayer(new net.minecraft.client.renderer.entity.layers.ItemInHandLayer<>(this));\n",
            "",
        )
        updated = updated.replace(
            "      this.addLayer(new ItemInHandLayer<>(this));\n",
            "",
        )
    if updated != text:
        path.write_text(updated, encoding="utf-8")
        print(path.relative_to(ROOT.parent.parent))
        return True
    return False


def main() -> None:
    count = 0
    for path in ROOT.rglob("*.java"):
        if fix_file(path):
            count += 1
    print(f"Updated {count} files")


if __name__ == "__main__":
    main()
