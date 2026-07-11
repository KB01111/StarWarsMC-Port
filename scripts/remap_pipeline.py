#!/usr/bin/env python3
"""Rebuild mod sources: intermediary decompiled -> Yarn named -> Mojang 26.2 packages."""
import re
import shutil
from pathlib import Path

ROOT = Path(r"C:\Users\kevin\Projekt\StarWarsMC-Port")
YARN_TINY = ROOT / "tools" / "mappings" / "yarn-1.20.1.tiny"
SRC = ROOT / "decompiled"
OUT = ROOT / "remapped"

FULL_CLASS_RE = re.compile(r"net\.minecraft\.(?:class_\d+)(?:\.class_\d+)*")
BARE_CLASS_RE = re.compile(r"\bclass_\d+\b")
MEMBER_RE = re.compile(r"\b((?:method|field)_\d+)\b")

YARN_TO_MOJANG = [
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
    ("net.minecraft.util.math.BlockPos", "net.minecraft.core.BlockPos"),
    ("net.minecraft.util.math.Direction", "net.minecraft.core.Direction"),
    ("net.minecraft.util.math.Vec3i", "net.minecraft.core.Vec3i"),
    ("net.minecraft.util.math.ChunkPos", "net.minecraft.world.level.ChunkPos"),
    ("net.minecraft.util.math.Box", "net.minecraft.world.phys.AABB"),
    ("net.minecraft.util.math.Vec3d", "net.minecraft.world.phys.Vec3"),
    ("net.minecraft.util.math.", "net.minecraft.core."),
    ("net.minecraft.util.shape.VoxelShapes", "net.minecraft.world.phys.shapes.Shapes"),
    ("net.minecraft.util.shape.VoxelShape", "net.minecraft.world.phys.shapes.VoxelShape"),
    ("net.minecraft.util.shape.", "net.minecraft.world.phys.shapes."),
    ("net.minecraft.shape.VoxelShapes", "net.minecraft.world.phys.shapes.Shapes"),
    ("net.minecraft.shape.VoxelShape", "net.minecraft.world.phys.shapes.VoxelShape"),
    ("net.minecraft.shape.", "net.minecraft.world.phys.shapes."),
    ("net.minecraft.util.Hand", "net.minecraft.world.InteractionHand"),
    ("net.minecraft.util.ActionResult", "net.minecraft.world.InteractionResult"),
    ("net.minecraft.util.Identifier", "net.minecraft.resources.Identifier"),
    ("net.minecraft.util.math.MathHelper", "net.minecraft.util.Mth"),
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
    ("net.minecraft.hit.", "net.minecraft.world.phys."),
    ("net.minecraft.state.property.DirectionProperty", "net.minecraft.world.level.block.state.properties.EnumProperty"),
    ("net.minecraft.state.property", "net.minecraft.world.level.block.state.properties"),
    ("net.minecraft.state.", "net.minecraft.world.level.block.state."),
    ("net.minecraft.advancement.", "net.minecraft.advancements."),
    ("net.minecraft.stat.", "net.minecraft.stats."),
    ("net.minecraft.village.", "net.minecraft.world.item.trading."),
    ("net.minecraft.enchantment.", "net.minecraft.world.item.enchantment."),
]

CLASS_ALIASES = [
    ("net.minecraft.world.entity.player.PlayerEntity", "net.minecraft.world.entity.player.Player"),
    ("net.minecraft.world.entity.MobEntity", "net.minecraft.world.entity.Mob"),
    ("net.minecraft.world.entity.SpawnGroup", "net.minecraft.world.entity.MobCategory"),
    ("net.minecraft.world.entity.SpawnReason", "net.minecraft.world.entity.EntitySpawnReason"),
    ("net.minecraft.structure.StructurePiecesCollector", "net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder"),
    ("net.minecraft.registry.RegistryKeys", "net.minecraft.core.registries.Registries"),
    ("net.minecraft.registry.tag.TagKey", "net.minecraft.tags.TagKey"),
    ("net.minecraft.registry.Registries", "net.minecraft.core.registries.BuiltInRegistries"),
    ("net.minecraft.registry.Registry", "net.minecraft.core.Registry"),
    ("net.minecraft.registry.entry.RegistryEntry", "net.minecraft.core.Holder"),
    ("net.minecraft.client.network.ClientPlayerEntity", "net.minecraft.client.player.LocalPlayer"),
    ("net.minecraft.client.network.AbstractClientPlayerEntity", "net.minecraft.client.player.AbstractClientPlayer"),
    ("net.minecraft.server.network.ServerPlayerEntity", "net.minecraft.server.level.ServerPlayer"),
    ("net.minecraft.network.PacketByteBuf", "net.minecraft.network.FriendlyByteBuf"),
    ("net.minecraft.world.gen.structure.templatesystem.StructurePlacementData", "net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"),
    ("net.minecraft.block.HorizontalFacingBlock", "net.minecraft.world.level.block.HorizontalDirectionalBlock"),
    ("net.minecraft.block.TrapdoorBlock", "net.minecraft.world.level.block.TrapDoorBlock"),
    ("net.minecraft.state.property.BlockHalf", "net.minecraft.world.level.block.state.properties.Half"),
    ("net.minecraft.state.property.StructureBlockMode", "net.minecraft.world.level.block.state.properties.StructureMode"),
    ("net.minecraft.util.Util", "net.minecraft.Util"),
    ("net.minecraft.item.ItemConvertible", "net.minecraft.world.level.ItemLike"),
    ("net.minecraft.world.entity.MovementType", "net.minecraft.world.entity.MoverType"),
    ("net.minecraft.world.level.ClipContext.FluidHandling", "net.minecraft.world.level.ClipContext.Fluid"),
    ("net.minecraft.world.level.ClipContext.ShapeType", "net.minecraft.world.level.ClipContext.Block"),
    ("net.minecraft.world.level.GameRules", "net.minecraft.world.level.gamerules.GameRules"),
    ("net.minecraft.core.BlockPos.Mutable", "net.minecraft.core.BlockPos.MutableBlockPos"),
    ("net.minecraft.world.Heightmap.Type", "net.minecraft.world.level.levelgen.Heightmap.Types"),
    ("net.minecraft.world.level.levelgen.structure.Structure.Context", "net.minecraft.world.level.levelgen.structure.Structure.GenerationContext"),
    ("net.minecraft.world.level.levelgen.structure.Structure.StructurePosition", "net.minecraft.world.level.levelgen.structure.Structure.GenerationStub"),
    ("net.minecraft.world.level.levelgen.structure.Structure.Config", "net.minecraft.world.level.levelgen.structure.Structure.StructureSettings"),
    ("net.minecraft.world.level.block.state.properties.Properties", "net.minecraft.world.level.block.state.properties.BlockStateProperties"),
    ("net.minecraft.world.level.block.state.property", "net.minecraft.world.level.block.state.properties"),
    ("net.minecraft.world.level.block.BlockState", "net.minecraft.world.level.block.state.BlockState"),
    ("net.minecraft.world.level.block.BlockWithEntity", "net.minecraft.world.level.block.BaseEntityBlock"),
    ("net.minecraft.world.level.block.BlockRenderType", "net.minecraft.world.level.block.RenderShape"),
    ("net.minecraft.sounds.BlockSoundGroup", "net.minecraft.world.level.block.SoundType"),
    ("net.minecraft.world.level.block.ShapeContext", "net.minecraft.world.phys.shapes.CollisionContext"),
    ("net.minecraft.world.level.block.state.StateManager", "net.minecraft.world.level.block.state.StateDefinition"),
    ("net.minecraft.world.item.ItemPlacementContext", "net.minecraft.world.item.context.BlockPlaceContext"),
    ("net.minecraft.nbt.NbtCompound", "net.minecraft.nbt.CompoundTag"),
    ("net.minecraft.world.entity.ai.attributes.DefaultAttributeContainer", "net.minecraft.world.entity.ai.attributes.AttributeSupplier"),
    ("net.minecraft.world.BlockView", "net.minecraft.world.level.BlockGetter"),
    ("net.minecraft.BlockRotation", "net.minecraft.world.level.block.Rotation"),
    ("net.minecraft.StringIdentifiable", "net.minecraft.util.StringRepresentable"),
    ("net.minecraft.world.level.block.AbstractBlock.Settings", "net.minecraft.world.level.block.state.BlockBehaviour.Properties"),
    ("net.minecraft.world.level.block.state.properties.DirectionProperty", "net.minecraft.world.level.block.state.properties.EnumProperty"),
    ("net.minecraft.core.tag.TagKey", "net.minecraft.tags.TagKey"),
    ("net.minecraft.core.RegistryKeys", "net.minecraft.core.registries.Registries"),
    ("net.minecraft.world.level.levelgen.structure.StructurePiecesCollector", "net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder"),
    ("net.minecraft.inventory.Inventories", "net.minecraft.world.ContainerHelper"),
    ("net.minecraft.screen.MerchantScreenHandler", "net.minecraft.world.inventory.MerchantMenu"),
    ("net.minecraft.collection.DefaultedList", "net.minecraft.core.NonNullList"),
    ("net.minecraft.util.annotation.MethodsReturnNonnullByDefault", "javax.annotation.ParametersAreNonnullByDefault"),
]


def parse_tiny(path: Path):
    full = {}
    bare = {}
    bare_candidates = {}
    members = {}
    for line in path.read_text(encoding="utf-8").splitlines():
        line = line.lstrip("\t")
        if line.startswith("c\t"):
            parts = line.split("\t")
            if len(parts) >= 3:
                inter_path, named_path = parts[1], parts[2]
                inter_key = inter_path.replace("/", ".")
                named_val = named_path.replace("/", ".").replace("$", ".")
                full[inter_key] = named_val
                dot_key = inter_path.replace("/", ".").replace("$", ".")
                full[dot_key] = named_val
                bare_name = inter_path.split("/")[-1]
                bare_candidates.setdefault(bare_name, set()).add(named_val)
        elif line.startswith(("m\t", "f\t")):
            parts = line.split("\t")
            if len(parts) >= 4:
                inter, named = parts[2], parts[3]
                if inter.startswith(("method_", "field_")) and inter != named:
                    members[inter] = named
    bare = {k: next(iter(v)) for k, v in bare_candidates.items() if len(v) == 1}
    return full, bare, members


IMPORT_RE = re.compile(r"^import\s+(net\.minecraft\.(?:class_\d+)(?:\.class_\d+)*)\s*;", re.MULTILINE)


def build_import_bare_map(text: str, full: dict) -> dict:
    local = {}
    for m in IMPORT_RE.finditer(text):
        path = m.group(1)
        key_dollar = "net.minecraft." + path[len("net.minecraft."):].replace(".", "$class_")
        named = full.get(path, full.get(key_dollar))
        if named:
            bare_id = path.split(".")[-1]
            if bare_id.startswith("class_"):
                local[bare_id] = named
    return local


def remap_classes(text: str, full: dict, bare: dict) -> str:
    local = build_import_bare_map(text, full)

    def full_repl(m):
        key = m.group(0)
        key_dollar = "net.minecraft." + key[len("net.minecraft."):].replace(".", "$class_")
        return full.get(key, full.get(key_dollar, key))

    text = FULL_CLASS_RE.sub(full_repl, text)
    merged = {**bare, **local}

    def bare_repl(m):
        return merged.get(m.group(0), m.group(0))

    text = BARE_CLASS_RE.sub(bare_repl, text)
    return text


def apply_maps(text: str, members: dict) -> str:
    text = MEMBER_RE.sub(lambda m: members.get(m.group(1), m.group(1)), text)
    for old, new in sorted(YARN_TO_MOJANG, key=lambda x: -len(x[0])):
        text = text.replace(old, new)
    for old, new in sorted(CLASS_ALIASES, key=lambda x: -len(x[0])):
        text = text.replace(old, new)
    post = [
        ("getStateManager()", "getStateDefinition()"),
        ("writeNbt(", "saveAdditional("),
        ("readNbt(", "loadAdditional("),
        (".nonOpaque()", ".noOcclusion()"),
        ("BlockBehaviour.Properties.create()", "BlockBehaviour.Properties.of()"),
        ("appendProperties(", "createBlockStateDefinition("),
        ("getOutlineShape(", "getShape("),
        ("getRenderType(", "getRenderShape("),
        ("Ingredient.ofItems(", "Ingredient.of("),
        ("createTranslationKey(", "makeDescriptionId("),
        ("TagKey.of(", "TagKey.create("),
        ("ResourceLocation(", "Identifier("),
        ("net.minecraft.resources.ResourceLocation", "net.minecraft.resources.Identifier"),
        ("@net.minecraft.util.annotation.MethodsReturnNonnullByDefault", "@javax.annotation.ParametersAreNonnullByDefault"),
        ("@class_6328", "@javax.annotation.ParametersAreNonnullByDefault"),
        ("method_42699(", "codec("),
        ("method_38676(", "findGenerationPoint("),
        ("method_41612(", "onTopChunkHeightCheck("),
        ("method_41618(", "type("),
        ("comp_568()", "chunkPos()"),
        ("comp_562()", "chunkGenerator()"),
        ("comp_569()", "heightAccessor()"),
        ("comp_564()", "random()"),
        ("comp_565()", "structureTemplateManager()"),
        ("comp_566()", "random()"),
        ("method_33943(", "getMiddleBlockPosition("),
        ("method_25503(", "mutable()"),
        ("method_8326(", "getMinBlockX()"),
        ("method_8327(", "getMaxBlockX()"),
        ("method_8328(", "getMinBlockZ()"),
        ("method_8329(", "getMaxBlockZ()"),
        ("method_16397(", "getFirstFreeHeight("),
        ("method_10264()", "getY()"),
        ("method_33098(", "setY("),
        ("method_40092(", "create("),
        ("field_41266", "ENTITY_TYPE"),
        ("field_13194", "WORLD_SURFACE_WG"),
    ]
    for old, new in post:
        text = text.replace(old, new)
    return text


def dedupe_annotations(text: str) -> str:
    seen = False
    out = []
    for line in text.splitlines():
        if "ParametersAreNonnullByDefault" in line and ("import " in line or line.strip().startswith("@")):
            if seen:
                continue
            seen = True
        out.append(line)
    return "\n".join(out) + ("\n" if text.endswith("\n") else "")


def main():
    full, bare, members = parse_tiny(YARN_TINY)
    print(f"Loaded {len(full)} full, {len(bare)} bare, {len(members)} members")
    if OUT.exists():
        shutil.rmtree(OUT)
    count = 0
    for src in SRC.rglob("*.java"):
        rel = src.relative_to(SRC)
        dst = OUT / rel
        dst.parent.mkdir(parents=True, exist_ok=True)
        text = src.read_text(encoding="utf-8")
        text = remap_classes(text, full, bare)
        text = apply_maps(text, members)
        text = dedupe_annotations(text)
        dst.write_text(text, encoding="utf-8")
        count += 1
    print(f"Remapped {count} files -> {OUT}")


if __name__ == "__main__":
    main()
