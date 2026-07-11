#!/usr/bin/env python3
"""Port SWGC client renderers/models to MC 26.2 render-state API."""
from __future__ import annotations

import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client" / "java"

REPLACEMENTS = [
    ("poseStack.multiply(", "poseStack.mulPose("),
    ("RotationAxis.", "Axis."),
    ("net.minecraft.core.RotationAxis", "com.mojang.math.Axis"),
    ("context.getPart(", "context.bakeLayer("),
    ("super(net.minecraft.client.renderer.rendertype.RenderType::getEntitySolid)", "super(root)"),
    ("che.swgc.client.compat.render.MultiBufferSource", "net.minecraft.client.renderer.MultiBufferSource"),
    ("EntityModelLoader", "EntityModelSet"),
    ("getEntityModelLoader()", "getEntityModels()"),
    ("BuiltinItemRendererRegistry", "SwgcItemRendererRegistry"),
    ("EntityModelLayerRegistry", "ModelLayerRegistry"),
    ("HudRenderCallback", "SwgcHudElements"),
    ("ItemConvertible", "ItemLike"),
    ("ArmorItem.Type", "EquipmentSlot"),
    ("BipedEntityModel", "HumanoidModel"),
    ("EntityModelLayer", "ModelLayerLocation"),
    ("textureLocation(", "getTextureLocation("),
    ("setupRotations(", "setupTransforms("),
    (".setValue(", ".set("),
    (".getValue()", ".get()"),
]

RENDERER_TEXTURE_RE = re.compile(
    r"public\s+Identifier\s+getTextureLocation\s*\(\s*(\w+(?:\.\w+)?)\s+\w+\s*\)"
)

MODEL_SETUP_RE = re.compile(
    r"public\s+void\s+setupAnim\s*\(\s*T\s+\w+,\s*float"
)


def port_file(path: Path) -> bool:
    text = path.read_text(encoding="utf-8")
    original = text

    for old, new in REPLACEMENTS:
        text = text.replace(old, new)

    # Renderer model type params: FooModel<EntityType> -> FooModel
    if "/renderer/" in path.as_posix():
        text = re.sub(
            r"(SwgcMobRenderer<\w+,\s*\w+Model)<[^>]+>",
            r"\1",
            text,
        )
        text = re.sub(
            r"new\s+(\w+Model)<[^>]+>\(",
            r"new \1(",
            text,
        )

    # Fix getTextureLocation to use SwgcMobRenderState in entity renderers
    if "/renderer/entity/" in path.as_posix() and "getTextureLocation" in text:
        text = re.sub(
            r"public\s+net\.minecraft\.resources\.Identifier\s+getTextureLocation\s*\(\s*\w+(?:\.\w+)?\s+\w+\s*\)",
            "public net.minecraft.resources.Identifier getTextureLocation(che.swgc.client.render.SwgcMobRenderState state)",
            text,
        )
        text = text.replace("return TEXTURE;", "return TEXTURE;")

    # Model setupAnim: use render state
    if "/model/" in path.as_posix() and "setupAnim(T entity" in text:
        text = text.replace(
            "setupAnim(T entity, float limbSwing",
            "setupAnim(S state, float limbSwing",
        )
        text = text.replace(
            "setupAnim(T entity, float limbAngle",
            "setupAnim(S state, float limbAngle",
        )
        # Replace entity. with state.entity. when state has entity field
        if ("state.entity" not in text) and (("SwgcMobRenderState" in text) or ("extends CommandableMob" in text)):
            text = re.sub(r'\bentity\.', 'state.entity.', text)

    if text != original:
        path.write_text(text, encoding="utf-8")
        return True
    return False


def main() -> None:
    changed = 0
    for path in sorted(ROOT.rglob("*.java")):
        if port_file(path):
            print(f"updated {path.relative_to(ROOT)}")
            changed += 1
    print(f"Total: {changed} files updated")


if __name__ == "__main__":
    main()
