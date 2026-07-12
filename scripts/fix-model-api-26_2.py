#!/usr/bin/env python3
"""Fix MC 26.2 model / AnimationState API in fabric client sources."""
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client"

REPLACEMENTS = (
    (".rotate(poseStack)", ".translateAndRotate(poseStack)"),
    (".pivotX", ".x"),
    (".pivotY", ".y"),
    (".pivotZ", ".z"),
    ("setPivot(", "setPos("),
    ("setAngles(", "setRotation("),
    ("setDefaultTransform(", "setInitialPose("),
    (".copyTransform(", ".loadPose("),
    ("RenderType::getEntitySolid", "RenderTypes::entitySolid"),
    ("RenderType::getEntityCutoutNoCull", "RenderTypes::entityCutout"),
    ("RenderType::getEntityCutout", "RenderTypes::entityCutout"),
    ("RenderTypes::entityCutoutNoCull", "RenderTypes::entityCutout"),
    (".isRunning()", ".isStarted()"),
    (".getTimeRunning()", ".getTimeInMillis(ageInTicks)"),
    ("PlayerModel<?>", "PlayerModel"),
)

# super(renderType) without root -> super(root, renderType) for net.minecraft.client.model.Model subclasses
MODEL_SUPER_FIX = re.compile(
    r"super\(([^)]+renderType[^)]*)\);\s*\n(\s*)this\.root = root;",
    re.MULTILINE,
)

# SinglePartEntityModel: super(RenderTypes::...) -> super(root)
SINGLE_PART_SUPER_FIX = re.compile(
    r"super\(net\.minecraft\.client\.renderer\.rendertype\.RenderTypes::[^)]+\);",
)

# Model item: super(RenderTypes::...) only -> super(root, RenderTypes::...)
ITEM_MODEL_SUPER_FIX = re.compile(
    r"super\(net\.minecraft\.client\.renderer\.rendertype\.RenderTypes::([^)]+)\);\s*\n(\s*)this\.root = root;",
)

# ForcePikeModel style: super(root); only -> super(root, RenderTypes::entitySolid);
FORCE_PIKE_SUPER = re.compile(
    r"(public ForcePikeModel\([^)]+\) \{\s*\n\s*)super\(root\);",
)

# Missing super(root) for SinglePartEntityModel
MISSING_SUPER = re.compile(
    r"(public (\w+Model)\(net\.minecraft\.client\.model\.geom\.ModelPart root\) \{\s*\n)(\s*)this\.root = ",
)

RENDER_8_ARG = re.compile(
    r"this\.root\.render\(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha\);"
)

RENDER_8_ARG_V = re.compile(
    r"this\.root\.render\(poseStack, vertexConsumer, i, i1, v, v1, v2, v3\);"
)


def fix_copy_transform(text: str) -> str:
    return re.sub(
        r"\.loadPose\(([^.)]+)\)(?!\.storePose\(\))",
        r".loadPose(\1.storePose())",
        text,
    )


def fix_render_color(text: str) -> str:
    packed = (
        "this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, "
        "((int)(alpha * 255.0F) << 24) | ((int)(red * 255.0F) << 16) | "
        "((int)(green * 255.0F) << 8) | (int)(blue * 255.0F));"
    )
    text = RENDER_8_ARG.sub(packed, text)
    packed_v = (
        "this.root.render(poseStack, vertexConsumer, i, i1, "
        "((int)(v3 * 255.0F) << 24) | ((int)(v * 255.0F) << 16) | "
        "((int)(v1 * 255.0F) << 8) | (int)(v2 * 255.0F));"
    )
    return RENDER_8_ARG_V.sub(packed_v, text)


def fix_animation_run(text: str) -> str:
    return re.sub(
        r"(\w+(?:AnimState|swgc\$get\w+AnimState\(\)))\.run\(",
        r"\1.ifStarted(",
        text,
    )


def fix_file(path: Path) -> bool:
    text = path.read_text(encoding="utf-8")
    updated = text
    for old, new in REPLACEMENTS:
        updated = updated.replace(old, new)

    updated = fix_animation_run(updated)
    updated = fix_copy_transform(updated)
    updated = MODEL_SUPER_FIX.sub(r"super(root, \1);\n\2this.root = root;", updated)
    updated = ITEM_MODEL_SUPER_FIX.sub(
        r"super(root, net.minecraft.client.renderer.rendertype.RenderTypes::\1);\n\2this.root = root;",
        updated,
    )
    updated = FORCE_PIKE_SUPER.sub(
        r"\1super(root, net.minecraft.client.renderer.rendertype.RenderTypes::entitySolid);",
        updated,
    )

    if "SinglePartEntityModel" in updated:
        updated = SINGLE_PART_SUPER_FIX.sub("super(root);", updated)
        updated = MISSING_SUPER.sub(r"\1\3super(root);\n\3this.root = ", updated)

    updated = fix_render_color(updated)

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
