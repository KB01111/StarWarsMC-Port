#!/usr/bin/env python3
"""Bulk-fix MC 26.2 client API drift in fabric client sources."""
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1] / "fabric" / "src" / "client" / "java"

REPLACEMENTS = [
    ("che.swgc.client.compat.animation.AnimationChannel", "net.minecraft.client.animation.AnimationChannel"),
    ("che.swgc.client.compat.animation.AnimationDefinition", "net.minecraft.client.animation.AnimationDefinition"),
    ("net.minecraft.client.renderer.VertexConsumer", "com.mojang.blaze3d.vertex.VertexConsumer"),
    ("net.minecraft.client.player.AbstractLocalPlayer", "net.minecraft.client.player.LocalPlayer"),
    ("net.minecraft.core.RotationAxis", "com.mojang.math.Axis"),
    ("net.minecraft.core.Axis", "com.mojang.math.Axis"),
    ("net.minecraft.client.renderer.OverlayTexture", "net.minecraft.client.renderer.texture.OverlayTexture"),
    ("net.minecraft.core.ColorHelper.Argb", "net.minecraft.util.ARGB"),
    ("net.minecraft.client.renderer.entity.layers.ArmorFeatureRenderer", "net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer"),
    ("net.minecraft.client.renderer.entity.model.ArmorEntityModel", "net.minecraft.client.model.HumanoidModel"),
    ("net.minecraft.client.model.geom.ModelLayerLocations", "net.minecraft.client.model.geom.ModelLayers"),
    ("net.minecraft.client.renderer.entity.layers.FeatureRendererContext", "net.minecraft.client.renderer.entity.RenderLayerParent"),
    ("net.minecraft.client.gui.widget.ButtonWidget", "net.minecraft.client.gui.components.Button"),
    ("net.minecraft.screen.ScreenTexts", "net.minecraft.client.gui.components.CommonComponents"),
    ("net.minecraft.client.gui.screens.ingame.InventoryScreen", "net.minecraft.client.gui.screens.inventory.InventoryScreen"),
    ("net.minecraft.client.renderer.item.ItemRenderer", "net.minecraft.client.renderer.entity.ItemRenderer"),
    ("net.minecraft.client.gui.Font.TextLayerType", "net.minecraft.client.gui.Font.DisplayMode"),
    ("PlayerModel<T>", "PlayerModel"),
    ("PlayerModel<net.minecraft.world.entity.LivingEntity>", "PlayerModel"),
    ("ctx.getPart(", "ctx.bakeLayer("),
    ("context.getPart(", "context.bakeLayer("),
    ("setupAnim(@Nullable net.minecraft.client.player.LocalPlayer player", "setupAnim(S state"),
    ("setupAnim(T entity", "setupAnim(S state"),
]


def fix_file(path: Path) -> bool:
    text = path.read_text(encoding="utf-8")
    original = text
    for old, new in REPLACEMENTS:
        text = text.replace(old, new)
    if text != original:
        path.write_text(text, encoding="utf-8")
        return True
    return False


def main() -> None:
    n = 0
    for path in sorted(ROOT.rglob("*.java")):
        if fix_file(path):
            print(f"updated {path.relative_to(ROOT)}")
            n += 1
    print(f"Total: {n} files")


if __name__ == "__main__":
    main()
