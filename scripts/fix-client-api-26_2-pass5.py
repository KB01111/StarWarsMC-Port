#!/usr/bin/env python3
"""Fifth-pass bulk fixes for remaining MC 26.2 client errors."""
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client"

REPLACEMENTS = (
    ("prevYaw", "yRotO"),
    ("prevPitch", "xRotO"),
    ("RenderTypes.entityCutoutNoCull(", "RenderTypes.entityCutout("),
    ("RenderType.lightning()", "RenderTypes.lightning()"),
    ("RenderType.getArmorCutoutNoCull(", "RenderTypes.armorCutoutNoCull("),
    ("changeLookDirection(", "turn("),
    (".contains(\"helmet\", 10)", ".contains(\"helmet\")"),
    ("new net.minecraft.resources.Identifier(armor)", "Identifier.parse(armor)"),
    ("builder.addBoneAnimation(bone, channel)", "builder.addBoneAnimation(bone, channel.toChannel())"),
    ("camera.getXRot()", "camera.xRot()"),
    ("camera.getYRot()", "camera.yRot()"),
)

SCALE_OVERRIDE = re.compile(
    r"protected void scale\((\w+) \w+, com\.mojang\.blaze3d\.vertex\.PoseStack poseStack, float partialTick\)",
)


def fix_scale_signature(text: str) -> str:
    return SCALE_OVERRIDE.sub(
        "protected void scale(che.swgc.client.render.SwgcMobRenderState state, com.mojang.blaze3d.vertex.PoseStack poseStack)",
        text,
    )


def fix_super_scale(text: str) -> str:
    return re.sub(
        r"super\.scale\(\w+, poseStack, partialTick(?:Time)?\);",
        "super.scale(state, poseStack);",
        text,
    )


def fix_file(path: Path) -> bool:
    text = path.read_text(encoding="utf-8")
    updated = text
    for old, new in REPLACEMENTS:
        updated = updated.replace(old, new)
    updated = fix_scale_signature(updated)
    updated = fix_super_scale(updated)
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
