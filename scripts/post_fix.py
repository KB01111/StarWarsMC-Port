#!/usr/bin/env python3
"""Fix common bad remaps from automated migration."""
from pathlib import Path

ROOT = Path(r"C:\Users\kevin\Projekt\StarWarsMC-Port")

FIXES = [
    ("net.minecraft.world.level.storage.loot.condition.BlockBehaviour.Properties", "net.minecraft.world.level.block.state.BlockBehaviour.Properties"),
    ("net.minecraft.world.level.storage.loot.entry.LootPoolEntry13", "net.minecraft.world.item.CreativeModeTab.ItemDisplayBuilder"),
    ("net.minecraft.world.entity.ai.pathing.PathMinHeap198", "net.minecraft.world.level.GameRules.Category"),
    ("class_4313<class_4310>", "GameRules.Key<GameRules.BooleanValue>"),
    ("net.minecraft.shape.", "net.minecraft.world.phys."),
    ("net.minecraft.state.", "net.minecraft.world.level.block.state."),
    ("net.minecraft.world.BlockView", "net.minecraft.world.level.BlockGetter"),
    ("net.minecraft.BlockRotation", "net.minecraft.world.level.block.Rotation"),
    ("net.minecraft.StringIdentifiable", "net.minecraft.util.StringRepresentable"),
    ("net.minecraft.world.level.block.AbstractBlock.Settings", "net.minecraft.world.level.block.state.BlockBehaviour.Properties"),
    ("net.minecraft.world.phys.Vec3d", "net.minecraft.world.phys.Vec3"),
    ("net.minecraft.network.syncher.TrackedData", "net.minecraft.network.syncher.EntityDataAccessor"),
    ("net.minecraft.network.syncher.TrackedDataHandlerRegistry", "net.minecraft.network.syncher.EntityDataSerializers"),
    ("net.minecraft.network.syncher.DataTracker", "net.minecraft.network.syncher.SynchedEntityData"),
    ("net.minecraft.world.entity.ai.attributes.EntityAttributes", "net.minecraft.world.entity.ai.attributes.Attributes"),
    ("net.minecraft.world.scores.AbstractTeam", "net.minecraft.world.scores.Team"),
    ("net.minecraft.network.chat.Text", "net.minecraft.network.chat.Component"),
    ("Text.translatable", "Component.translatable"),
    ("net.minecraft.MethodsReturnNonnullByDefault", "net.minecraft.MethodsReturnNonnullByDefault"),
    ("net.minecraft.client.MinecraftClient", "net.minecraft.client.Minecraft"),
    ("net.minecraft.client.renderer.model.json.ModelTransformationMode", "net.minecraft.world.item.ItemDisplayContext"),
    ("net.minecraft.client.math.MatrixStack", "com.mojang.blaze3d.vertex.PoseStack"),
    ("net.minecraft.client.renderer.VertexConsumerProvider", "net.minecraft.client.renderer.MultiBufferSource"),
    ("net.minecraft.client.renderer.entity.model.", "net.minecraft.client.model."),
    ("net.minecraft.client.renderer.entity.MobEntityRenderer", "net.minecraft.client.renderer.entity.MobRenderer"),
    ("PlayerEntityModel", "PlayerModel"),
    ("MobEntityRenderer", "MobRenderer"),
]

def main():
    total = 0
    for d in ROOT.rglob("*.java"):
        if "scripts" in d.parts or "decompiled" in d.parts or "extracted" in d.parts:
            continue
        text = d.read_text(encoding="utf-8")
        orig = text
        for old, new in sorted(FIXES, key=lambda x: -len(x[0])):
            text = text.replace(old, new)
        if text != orig:
            d.write_text(text, encoding="utf-8")
            total += 1
    print(f"Fixed {total} files")

if __name__ == "__main__":
    main()
