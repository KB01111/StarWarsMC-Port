#!/usr/bin/env python3
"""Fast Mojang package + member remapping with word-boundary safety."""
import re
from pathlib import Path

ROOT = Path(r"C:\Users\kevin\Projekt\StarWarsMC-Port")
YARN_TINY = ROOT / "tools" / "mappings" / "yarn-1.20.1.tiny"
MEMBER_RE = re.compile(r"\b((?:method|field)_\d+)\b")

PACKAGE_MAP = [
    ("net.minecraft.block.entity.", "net.minecraft.world.level.block.entity."),
    ("net.minecraft.block.", "net.minecraft.world.level.block."),
    ("net.minecraft.entity.damage.", "net.minecraft.world.damagesource."),
    ("net.minecraft.entity.attribute.", "net.minecraft.world.entity.ai.attributes."),
    ("net.minecraft.entity.data.", "net.minecraft.network.syncher."),
    ("net.minecraft.entity.ai.", "net.minecraft.world.entity.ai."),
    ("net.minecraft.entity.player.", "net.minecraft.world.entity.player."),
    ("net.minecraft.entity.mob.", "net.minecraft.world.entity."),
    ("net.minecraft.entity.", "net.minecraft.world.entity."),
    ("net.minecraft.item.", "net.minecraft.world.item."),
    ("net.minecraft.world.gen.", "net.minecraft.world.level.levelgen."),
    ("net.minecraft.world.biome.", "net.minecraft.world.level.biome."),
    ("net.minecraft.world.chunk.", "net.minecraft.world.level.chunk."),
    ("net.minecraft.world.dimension.", "net.minecraft.world.level.dimension."),
    ("net.minecraft.world.storage.", "net.minecraft.world.level.storage."),
    ("net.minecraft.world.explosion.", "net.minecraft.world.level."),
    ("net.minecraft.world.World", "net.minecraft.world.level.Level"),
    ("net.minecraft.util.math.", "net.minecraft.world.phys."),
    ("net.minecraft.util.Hand", "net.minecraft.world.InteractionHand"),
    ("net.minecraft.util.ActionResult", "net.minecraft.world.InteractionResult"),
    ("net.minecraft.util.Identifier", "net.minecraft.resources.ResourceLocation"),
    ("net.minecraft.registry.", "net.minecraft.core."),
    ("net.minecraft.sound.", "net.minecraft.sounds."),
    ("net.minecraft.text.", "net.minecraft.network.chat."),
    ("net.minecraft.scoreboard.", "net.minecraft.world.scores."),
    ("net.minecraft.loot.", "net.minecraft.world.level.storage.loot."),
    ("net.minecraft.structure.", "net.minecraft.world.level.levelgen.structure."),
    ("net.minecraft.particle.", "net.minecraft.core.particles."),
    ("net.minecraft.fluid.", "net.minecraft.world.level.material."),
    ("net.minecraft.server.world.", "net.minecraft.server.level."),
    ("net.minecraft.client.render.", "net.minecraft.client.renderer."),
    ("net.minecraft.client.gui.screen.", "net.minecraft.client.gui.screens."),
    ("net.minecraft.client.texture.", "net.minecraft.client.renderer.texture."),
    ("net.minecraft.client.sound.", "net.minecraft.client.sounds."),
    ("net.minecraft.client.network.", "net.minecraft.client.player."),
    ("net.minecraft.client.world.", "net.minecraft.client.multiplayer."),
    ("net.minecraft.client.option.", "net.minecraft.client."),
    ("net.minecraft.client.input.", "net.minecraft.client."),
    ("net.minecraft.client.util.", "net.minecraft.client."),
    ("net.minecraft.util.annotation.", "net.minecraft."),
    ("net.minecraft.util.", "net.minecraft."),
    ("net.minecraft.shape.", "net.minecraft.world.phys."),
    ("net.minecraft.hit.", "net.minecraft.world.phys."),
]

CLASS_RENAMES = [
    ("net.minecraft.world.entity.player.PlayerEntity", "net.minecraft.world.entity.player.Player"),
    ("net.minecraft.world.entity.MobEntity", "net.minecraft.world.entity.Mob"),
    ("net.minecraft.world.phys.Vec3d", "net.minecraft.world.phys.Vec3"),
    ("net.minecraft.network.syncher.TrackedData", "net.minecraft.network.syncher.EntityDataAccessor"),
    ("net.minecraft.network.syncher.TrackedDataHandlerRegistry", "net.minecraft.network.syncher.EntityDataSerializers"),
    ("net.minecraft.network.syncher.DataTracker", "net.minecraft.network.syncher.SynchedEntityData"),
    ("net.minecraft.world.entity.ai.attributes.EntityAttributes", "net.minecraft.world.entity.ai.attributes.Attributes"),
    ("net.minecraft.world.scores.AbstractTeam", "net.minecraft.world.scores.Team"),
    ("net.minecraft.client.player.ClientPlayerEntity", "net.minecraft.client.player.LocalPlayer"),
    ("net.minecraft.client.player.AbstractClientPlayerEntity", "net.minecraft.client.player.AbstractClientPlayer"),
    ("net.minecraft.client.renderer.entity.EntityRendererFactory$Context", "net.minecraft.client.renderer.entity.EntityRendererProvider$Context"),
    ("net.minecraft.client.renderer.entity.EntityRendererFactory", "net.minecraft.client.renderer.entity.EntityRendererProvider"),
    ("net.minecraft.world.item.Item$Settings", "net.minecraft.world.item.Item$Properties"),
]

POST_FIX = [
    ("method_48926()", "level()"),
    ("getWorld()", "level()"),
    (".PlayerEntity", ".Player"),
    ("PlayerEntity ", "Player "),
    ("<PlayerEntity>", "<Player>"),
    (".MobEntity", ".Mob"),
    ("MobEntity ", "Mob "),
    ("<MobEntity>", "<Mob>"),
    ("RandomChanceWithLootingLootCondition1", "BlockBehaviour.Properties"),
    ("net.minecraft.world.level.block.BlockBehaviour.Properties", "net.minecraft.world.level.block.state.BlockBehaviour$Properties"),
]


def parse_members(content: str) -> dict:
    combined = {}
    for line in content.splitlines():
        line = line.lstrip("\t")
        if line.startswith(("m\t", "f\t")):
            p = line.split("\t")
            if len(p) >= 4 and (p[2].startswith("method_") or p[2].startswith("field_")) and p[2] != p[3]:
                combined[p[2]] = p[3]
    return combined


def remap(text: str, members: dict) -> str:
    for old, new in sorted(CLASS_RENAMES, key=lambda x: -len(x[0])):
        text = text.replace(old, new)
    for old, new in sorted(PACKAGE_MAP, key=lambda x: -len(x[0])):
        text = text.replace(old, new)
    text = MEMBER_RE.sub(lambda m: members.get(m.group(1), m.group(1)), text)
    for old, new in POST_FIX:
        text = text.replace(old, new)
    return text


def main():
    members = parse_members(YARN_TINY.read_text(encoding="utf-8"))
    print(f"Members: {len(members)}")
    total = 0
    for d in [
        ROOT / "common" / "src" / "main" / "java",
        ROOT / "fabric" / "src" / "main" / "java",
        ROOT / "fabric" / "src" / "client" / "java",
    ]:
        n = 0
        for f in d.rglob("*.java"):
            o = f.read_text(encoding="utf-8")
            r = remap(o, members)
            if r != o:
                f.write_text(r, encoding="utf-8")
                n += 1
        print(f"{d.relative_to(ROOT)}: {n}")
        total += n
    print(f"Total: {total}")


if __name__ == "__main__":
    main()
