#!/usr/bin/env python3
"""Third-pass MC 26.2 client fixes."""
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client"

REPLACEMENTS = (
    ("addFeature(", "addLayer("),
    ("RenderType.getLightning()", "RenderTypes.lightning()"),
    ("RenderType.getBeaconBeam(", "RenderTypes.beaconBeam("),
    ("ARGB.getRed(", "ARGB.red("),
    ("ARGB.getGreen(", "ARGB.green("),
    ("ARGB.getBlue(", "ARGB.blue("),
    ("poseStack.push()", "poseStack.pushPose()"),
    ("poseStack.pop()", "poseStack.popPose()"),
    ("poseStack.peek()", "poseStack.last()"),
    ("getLayer(this.texture)", "renderType(this.texture)"),
)

ITEM_MODEL_SUPER = re.compile(
    r"(public \w+Model\(net\.minecraft\.client\.model\.geom\.ModelPart root\) \{\s*\n\s*)super\(root\);"
)


def fix_item_models(text: str) -> str:
    if "extends net.minecraft.client.model.Model.Simple" in text:
        return ITEM_MODEL_SUPER.sub(
            r"\1super(root, net.minecraft.client.renderer.rendertype.RenderTypes::entityCutout);",
            text,
        )
    return text


def fix_simple_item_renderer(text: str) -> str:
    old = (
        "this.model.render(poseStack, src.getBuffer(this.model.renderType(this.texture)), "
        "packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);"
    )
    new = (
        "this.model.renderToBuffer(poseStack, src.getBuffer(this.model.renderType(this.texture)), "
        "packedLight, packedOverlay, -1);"
    )
    return text.replace(old, new)


def fix_file(path: Path) -> bool:
    text = path.read_text(encoding="utf-8")
    updated = text
    for old, new in REPLACEMENTS:
        updated = updated.replace(old, new)
    updated = fix_item_models(updated)
    if path.name == "SimpleItemRenderer.java":
        updated = fix_simple_item_renderer(updated)
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
