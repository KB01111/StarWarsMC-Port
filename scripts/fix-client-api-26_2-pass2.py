#!/usr/bin/env python3
"""Second-pass MC 26.2 client API fixes."""
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client"

REPLACEMENTS = (
    ("extends net.minecraft.client.model.Model {", "extends net.minecraft.client.model.Model.Simple {"),
    ("super(root, net.minecraft.client.renderer.rendertype.RenderTypes::entityCutout);", "super(root);"),
    ("super(root, net.minecraft.client.renderer.rendertype.RenderTypes::entitySolid);", "super(root);"),
    ("super(renderType);", "super(root, renderType);"),
    ("Minecraft.getInstance().world", "Minecraft.getInstance().level"),
    (".getTime()", ".getGameTime()"),
    ("entity.age", "entity.tickCount"),
    ("entity.isInSneakingPose()", "entity.isCrouching()"),
    ("entity.isInSwimmingPose()", "entity.isSwimming()"),
    ("entity.getRoll()", "entity.getXRot()"),
    ("ctx.getItemRenderer())", "ctx)"),
    ("ItemInHandLayer(this, ctx)", "ItemInHandLayer<>(this)"),
    ("new net.minecraft.resources.Identifier(\"modid\", \"frog\")", "Identifier.fromNamespaceAndPath(\"swgc\", \"frog\")"),
    ("getCachedState()", "getBlockState()"),
    ("OverlayTexture.DEFAULT_UV", "OverlayTexture.NO_OVERLAY"),
    ("ModelLayers.PLAYER_INNER_ARMOR", "ModelLayers.PLAYER_ARMOR.head()"),
    ("ModelLayers.PLAYER_OUTER_ARMOR", "ModelLayers.PLAYER_ARMOR.chest()"),
)

# Fix SinglePartEntityModel wrong super with RenderTypes
SINGLE_PART_WRONG_SUPER = re.compile(
    r"super\(root, net\.minecraft\.client\.renderer\.rendertype\.RenderTypes::[^)]+\);"
)

# PlasmaRodModel super
PLASMA_SUPER = re.compile(
    r"(public PlasmaRodModel\([^)]+\) \{\s*\n\s*)super\(root\);"
)

# Raw Queue -> Queue<Vector3f>
QUEUE_RAW = "Queue values = new ArrayDeque<>();"
QUEUE_TYPED = "Queue<Vector3f> values = new ArrayDeque<>();"

# LightsaberModel BiConsumer
BICONSUMER = re.compile(
    r"BiConsumer register = \(id, definition\)"
)


def fix_file(path: Path) -> bool:
    text = path.read_text(encoding="utf-8")
    updated = text
    for old, new in REPLACEMENTS:
        updated = updated.replace(old, new)
    updated = SINGLE_PART_WRONG_SUPER.sub("super(root);", updated)
    updated = PLASMA_SUPER.sub(
        r"\1super(root, net.minecraft.client.renderer.rendertype.RenderTypes::entitySolid);",
        updated,
    )
    updated = updated.replace(QUEUE_RAW, QUEUE_TYPED)
    updated = BICONSUMER.sub(
        "BiConsumer<String, java.util.function.Supplier<net.minecraft.client.model.geom.builders.LayerDefinition>> register = (id, definition)",
        updated,
    )
    # outline.loadPose(rod) without storePose
    updated = re.sub(
        r"\.loadPose\(this\.rod\)(?!\.storePose)",
        ".loadPose(this.rod.storePose())",
        updated,
    )
    # ModelPart render 8-arg color (rod/outline not root)
    updated = re.sub(
        r"(\w+)\.render\(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha\);",
        r"\1.render(poseStack, vertexConsumer, packedLight, packedOverlay, "
        r"((int)(alpha * 255.0F) << 24) | ((int)(red * 255.0F) << 16) | "
        r"((int)(green * 255.0F) << 8) | (int)(blue * 255.0F));",
        updated,
    )
    updated = re.sub(
        r"(\w+)\.render\(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha / \(float\)i\);",
        r"\1.render(poseStack, vertexConsumer, packedLight, packedOverlay, "
        r"((int)((alpha / (float)i) * 255.0F) << 24) | ((int)(red * 255.0F) << 16) | "
        r"((int)(green * 255.0F) << 8) | (int)(blue * 255.0F));",
        updated,
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
