#!/usr/bin/env python3
"""Fix incorrect Yarn->Mojang 26.2 remappings from full_remap.py."""
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]

JAVA_DIRS = [
    ROOT / "common" / "src" / "main" / "java",
    ROOT / "fabric" / "src" / "main" / "java",
    ROOT / "fabric" / "src" / "client" / "java",
]

# Longest-first string replacements (packages, classes, members).
FIXES = [
    # --- Bad remap artifacts ---
    ("net.minecraft.world.level.storage.loot.condition.BlockBehaviour.Properties", "net.minecraft.world.level.block.state.BlockBehaviour.Properties"),
    ("net.minecraft.world.scores.Scoreboard0", "net.minecraft.world.level.block.state.StateDefinition"),
    ("net.minecraft.world.level.block.state.StateManager", "net.minecraft.world.level.block.state.StateDefinition"),
    ("net.minecraft.world.level.block.state.property.Properties", "net.minecraft.world.level.block.state.properties.BlockStateProperties"),
    ("net.minecraft.world.level.block.state.property", "net.minecraft.world.level.block.state.properties"),

    # --- util.math wrongly mapped to world.phys ---
    ("net.minecraft.world.phys.BlockPos.Mutable", "net.minecraft.core.BlockPos.Mutable"),
    ("net.minecraft.world.phys.Direction.Type", "net.minecraft.core.Direction.Plane"),
    ("net.minecraft.world.phys.random.Random", "net.minecraft.util.RandomSource"),
    ("net.minecraft.world.phys.MathHelper", "net.minecraft.util.Mth"),
    ("net.minecraft.world.phys.ChunkPos", "net.minecraft.world.level.ChunkPos"),
    ("net.minecraft.world.phys.BlockBox", "net.minecraft.world.level.levelgen.structure.BoundingBox"),
    ("net.minecraft.world.phys.Vec3i", "net.minecraft.core.Vec3i"),
    ("net.minecraft.world.phys.BlockPos", "net.minecraft.core.BlockPos"),
    ("net.minecraft.world.phys.Direction", "net.minecraft.core.Direction"),

    # --- shape wrongly mapped to world.phys ---
    ("net.minecraft.world.phys.VoxelShapes", "net.minecraft.world.phys.shapes.Shapes"),
    ("net.minecraft.world.phys.VoxelShape", "net.minecraft.world.phys.shapes.VoxelShape"),
    ("net.minecraft.world.phys.Box", "net.minecraft.world.phys.AABB"),

    # --- Block / state ---
    ("net.minecraft.world.level.block.BlockState", "net.minecraft.world.level.block.state.BlockState"),
    ("net.minecraft.world.level.block.BlockWithEntity", "net.minecraft.world.level.block.BaseEntityBlock"),
    ("net.minecraft.world.level.block.BlockRenderType", "net.minecraft.world.level.block.RenderShape"),
    ("net.minecraft.sounds.BlockSoundGroup", "net.minecraft.world.level.block.SoundType"),
    ("net.minecraft.world.level.block.ShapeContext", "net.minecraft.world.level.block.CollisionContext"),
    ("net.minecraft.world.level.block.enums", "net.minecraft.world.level.block.state.properties"),

    # --- Items ---
    ("net.minecraft.world.item.ItemPlacementContext", "net.minecraft.world.item.context.BlockPlaceContext"),
    ("net.minecraft.world.item.ItemUsageContext", "net.minecraft.world.item.context.UseOnContext"),
    ("net.minecraft.world.item.Item.Settings", "net.minecraft.world.item.Item.Properties"),
    ("net.minecraft.world.item.ItemGroup", "net.minecraft.world.item.CreativeModeTab"),
    # Vanishable removed in modern MC — stripped separately
    ("net.minecraft.world.item.ArmorMaterial", "net.minecraft.world.item.ArmorMaterial"),

    # --- NBT ---
    ("net.minecraft.nbt.NbtCompound", "net.minecraft.nbt.CompoundTag"),
    ("net.minecraft.nbt.NbtList", "net.minecraft.nbt.ListTag"),
    ("net.minecraft.nbt.NbtString", "net.minecraft.nbt.StringTag"),

    # --- Entity attributes ---
    ("net.minecraft.world.entity.ai.attributes.DefaultAttributeContainer", "net.minecraft.world.entity.ai.attributes.AttributeSupplier"),
    ("net.minecraft.world.entity.ai.attributes.EntityAttributeModifier", "net.minecraft.world.entity.ai.attributes.AttributeModifier"),
    ("net.minecraft.world.entity.ai.attributes.EntityAttribute", "net.minecraft.world.entity.ai.attributes.Attribute"),

    # --- Entity AI / goals ---
    ("net.minecraft.world.entity.ai.goal.ProjectileAttackGoal", "net.minecraft.world.entity.ai.goal.RangedAttackGoal"),
    ("net.minecraft.world.entity.ai.goal.LookAtEntityGoal", "net.minecraft.world.entity.ai.goal.LookAtPlayerGoal"),
    ("net.minecraft.world.entity.ai.goal.WanderAroundGoal", "net.minecraft.world.entity.ai.goal.RandomStrollGoal"),
    ("net.minecraft.world.entity.ai.goal.ActiveTargetGoal", "net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal"),
    ("net.minecraft.world.entity.ai.goal.RevengeGoal", "net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal"),
    ("net.minecraft.world.entity.ai.goal.SwimGoal", "net.minecraft.world.entity.ai.goal.FloatGoal"),
    ("net.minecraft.world.entity.ai.RangedAttackMob", "net.minecraft.world.entity.RangedAttackMob"),
    ("net.minecraft.world.entity.ai.control.BodyControl", "net.minecraft.world.entity.ai.control.BodyRotationControl"),
    ("net.minecraft.world.entity.PathAwareEntity", "net.minecraft.world.entity.PathfinderMob"),

    # --- Entity types ---
    ("net.minecraft.world.entity.CreeperEntity", "net.minecraft.world.entity.monster.Creeper"),
    ("net.minecraft.world.entity.HostileEntity", "net.minecraft.world.entity.monster.Monster"),
    ("net.minecraft.world.entity.projectile.SmallFireballEntity", "net.minecraft.world.entity.projectile.SmallFireball"),
    ("net.minecraft.world.entity.projectile.PersistentProjectileEntity", "net.minecraft.world.entity.projectile.AbstractArrow"),
    ("net.minecraft.world.entity.projectile.ProjectileEntity", "net.minecraft.world.entity.projectile.Projectile"),
    ("net.minecraft.world.entity.FallingBlockEntity", "net.minecraft.world.entity.item.FallingBlockEntity"),
    ("net.minecraft.world.entity.EntityData", "net.minecraft.world.entity.SpawnGroupData"),
    ("net.minecraft.world.entity.SpawnReason", "net.minecraft.world.entity.MobSpawnType"),

    # --- World / levelgen ---
    ("net.minecraft.world.LocalDifficulty", "net.minecraft.world.DifficultyInstance"),
    ("net.minecraft.world.ServerWorldAccess", "net.minecraft.world.level.ServerLevelAccessor"),
    ("net.minecraft.world.StructureWorldAccess", "net.minecraft.world.level.WorldGenLevel"),
    ("net.minecraft.world.level.levelgen.StructureAccessor", "net.minecraft.world.level.StructureManager"),
    ("net.minecraft.server.level.ServerWorld", "net.minecraft.server.level.ServerLevel"),
    ("net.minecraft.world.level.block.entity.MobSpawnerBlockEntity", "net.minecraft.world.level.block.entity.SpawnerBlockEntity"),

    # --- Registry / tags ---
    ("net.minecraft.core.entry.RegistryEntry", "net.minecraft.core.Holder"),
    ("net.minecraft.core.tag.ItemTags", "net.minecraft.tags.ItemTags"),
    ("net.minecraft.core.RegistryKey", "net.minecraft.resources.ResourceKey"),

    # --- Network ---
    ("net.minecraft.network.PacketByteBuf", "net.minecraft.network.FriendlyByteBuf"),
    ("net.minecraft.server.network.ServerPlayerEntity", "net.minecraft.server.level.ServerPlayer"),

    # --- Client / misc API ---
    ("net.minecraft.client.item.TooltipContext", "net.minecraft.world.item.Item.TooltipContext"),
    ("net.minecraft.TypedActionResult", "net.minecraft.world.InteractionResultHolder"),
    ("net.minecraft.UseAction", "net.minecraft.world.item.UseAnim"),
    ("net.minecraft.Formatting", "net.minecraft.ChatFormatting"),
    ("net.minecraft.sounds.SoundCategory", "net.minecraft.sounds.SoundSource"),
    ("net.minecraft.recipe.Ingredient", "net.minecraft.world.item.crafting.Ingredient"),
    ("net.minecraft.world.GameRules", "net.minecraft.world.level.GameRules"),
    ("net.minecraft.Arm", "net.minecraft.world.entity.HumanoidArm"),
    ("net.minecraft.util.Identifier", "net.minecraft.resources.ResourceLocation"),

    # --- Annotation ---
    ("@net.minecraft.MethodsReturnNonnullByDefault", "@javax.annotation.ParametersAreNonnullByDefault"),
    ("import net.minecraft.MethodsReturnNonnullByDefault;", "import javax.annotation.ParametersAreNonnullByDefault;"),

    # --- Obfuscated class remnants (yarn intermediary) ---
    ("class_2353.HORIZONTAL", "net.minecraft.core.Direction.Plane.HORIZONTAL"),
    ("class_1666.CREATIVE_ONLY", "net.minecraft.world.entity.projectile.AbstractArrow.Pickup.CREATIVE_ONLY"),
    ("class_1666.DISALLOWED", "net.minecraft.world.entity.projectile.AbstractArrow.Pickup.DISALLOWED"),
    ("class_1666.ALLOWED", "net.minecraft.world.entity.projectile.AbstractArrow.Pickup.ALLOWED"),
    ("class_240.MISS", "net.minecraft.world.phys.HitResult.Type.MISS"),
    ("class_242.NONE", "net.minecraft.world.level.ClipContext.Fluid.NONE"),

    # --- Method renames ---
    ("getStateManager()", "getStateDefinition()"),
    ("writeNbt(", "saveAdditional("),
    ("readNbt(", "loadAdditional("),
    (".nonOpaque()", ".noOcclusion()"),
    ("BlockBehaviour.Properties.create()", "BlockBehaviour.Properties.of()"),
    ("state.BlockBehaviour.Properties.create()", "state.BlockBehaviour.Properties.of()"),

    # --- Simple class renames (short identifiers) ---
    ("Scoreboard0", "StateDefinition"),
    ("BlockWithEntity", "BaseEntityBlock"),
    ("BlockRenderType", "RenderShape"),
    ("BlockSoundGroup", "SoundType"),
    ("ShapeContext", "CollisionContext"),
    ("ItemPlacementContext", "BlockPlaceContext"),
    ("ItemUsageContext", "UseOnContext"),
    ("NbtCompound", "CompoundTag"),
    ("NbtList", "ListTag"),
    ("NbtString", "StringTag"),
    ("DefaultAttributeContainer", "AttributeSupplier"),
    ("EntityAttributeModifier", "AttributeModifier"),
    ("EntityAttribute", "Attribute"),
    ("PathAwareEntity", "PathfinderMob"),
    ("CreeperEntity", "Creeper"),
    ("HostileEntity", "Monster"),
    ("ProjectileEntity", "Projectile"),
    ("SmallFireballEntity", "SmallFireball"),
    ("PersistentProjectileEntity", "AbstractArrow"),
    # EntityData handled in pass 3 with full qualified name only
    # SpawnReason short name removed — collides with EntitySpawnReason
    ("LocalDifficulty", "DifficultyInstance"),
    ("ServerWorldAccess", "ServerLevelAccessor"),
    ("StructureWorldAccess", "WorldGenLevel"),
    ("ServerWorld", "ServerLevel"),
    ("MobSpawnerBlockEntity", "SpawnerBlockEntity"),
    ("RegistryEntry", "Holder"),
    ("PacketByteBuf", "FriendlyByteBuf"),
    ("ServerPlayerEntity", "ServerPlayer"),
    ("TooltipContext", "Item.TooltipContext"),
    ("TypedActionResult", "InteractionResultHolder"),
    ("UseAction", "UseAnim"),
    # Formatting short name removed — collides with ChatFormatting
    ("SoundCategory", "SoundSource"),
    ("BodyControl", "BodyRotationControl"),
    ("MathHelper", "Mth"),
    ("BlockBox", "BoundingBox"),
    ("VoxelShapes", "Shapes"),
    ("RaycastContext", "ClipContext"),

    # --- Pass 3: fix triple-application / substring collision bugs ---
    ("net.minecraft.network.syncher.SpawnGroupDataAccessorHandler", "net.minecraft.network.syncher.EntityDataSerializer"),
    ("net.minecraft.network.syncher.SpawnGroupDataAccessor", "net.minecraft.network.syncher.EntityDataAccessor"),
    ("net.minecraft.network.syncher.SynchedSpawnGroupData", "net.minecraft.network.syncher.SynchedEntityData"),
    ("net.minecraft.network.syncher.SpawnGroupDataSerializers", "net.minecraft.network.syncher.EntityDataSerializers"),
    ("net.minecraft.network.syncher.SpawnGroupDataSerializer", "net.minecraft.network.syncher.EntityDataSerializer"),
    ("net.minecraft.world.entity.EntityEntityEntitySpawnReason", "net.minecraft.world.entity.EntitySpawnReason"),
    ("net.minecraft.world.entity.EntityEntitySpawnReason", "net.minecraft.world.entity.EntitySpawnReason"),
    ("net.minecraft.world.entity.ai.goal.RandomRandomRandomLookAroundGoal", "net.minecraft.world.entity.ai.goal.RandomLookAroundGoal"),
    ("net.minecraft.world.entity.ai.goal.RandomRandomLookAroundGoal", "net.minecraft.world.entity.ai.goal.RandomLookAroundGoal"),
    ("SpawnGroupDataAccessorHandler", "EntityDataSerializer"),
    ("SpawnGroupDataAccessor", "EntityDataAccessor"),
    ("SynchedSpawnGroupData", "SynchedEntityData"),
    ("SpawnGroupDataSerializers", "EntityDataSerializers"),
    ("SpawnGroupDataSerializer", "EntityDataSerializer"),
    ("EntityEntityEntitySpawnReason", "EntitySpawnReason"),
    ("EntityEntitySpawnReason", "EntitySpawnReason"),
    ("RandomRandomRandomLookAroundGoal", "RandomLookAroundGoal"),
    ("RandomRandomLookAroundGoal", "RandomLookAroundGoal"),

    # EntityData spawn class only (word boundary via full qualified name)
    ("net.minecraft.world.entity.EntityData", "net.minecraft.world.entity.SpawnGroupData"),
    ("net.minecraft.world.entity.ai.pathing.PathNodeMaker051", "net.minecraft.world.entity.EquipmentSlot"),
    ("net.minecraft.world.entity.MobSpawnType", "net.minecraft.world.entity.EntitySpawnReason"),
    ("net.minecraft.world.level.block.CollisionContext", "net.minecraft.world.phys.shapes.CollisionContext"),
    ("net.minecraft.advancement.criterion.Criterion3", "net.minecraft.world.item.Item.Properties"),
    ("net.minecraft.ChatChatFormatting", "net.minecraft.ChatFormatting"),
    ("net.minecraft.world.level.block.HorizontalConnectingBlock", "net.minecraft.world.level.block.CrossCollisionBlock"),
    ("net.minecraft.world.level.levelgen.structure.SimpleStructurePiece", "net.minecraft.world.level.levelgen.structure.StructurePiece"),
    ("net.minecraft.world.level.levelgen.structure.StructurePiecesHolder", "net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder"),
    ("net.minecraft.world.entity.projectile.AbstractArrow.Pickup", "net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup"),
    ("net.minecraft.world.entity.projectile.AbstractArrow", "net.minecraft.world.entity.projectile.arrow.AbstractArrow"),
    ("net.minecraft.world.entity.RangedAttackMob", "net.minecraft.world.entity.monster.RangedAttackMob"),
    ("net.minecraft.world.entity.Monster", "net.minecraft.world.entity.monster.Monster"),
    ("net.minecraft.world.entity.Tameable", "net.minecraft.world.entity.TamableAnimal"),
    ("net.minecraft.network.chat.MutableText", "net.minecraft.network.chat.MutableComponent"),
    ("net.minecraft.client.player.PlayerListEntry", "net.minecraft.client.multiplayer.PlayerInfo"),
    ("net.minecraft.world.entity.EntityPose", "net.minecraft.world.entity.Pose"),
    ("net.minecraft.world.entity.ai.goal.WanderAroundFarGoal", "net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal"),
    ("net.minecraft.world.item.ArmorItem.Type", "net.minecraft.world.item.equipment.ArmorType"),
    ("net.minecraft.world.level.levelgen.structure.StructureContext", "net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext"),

    ("SpawnGroupDataAccessorHandler", "EntityDataSerializer"),
    ("SpawnGroupDataAccessor", "EntityDataAccessor"),
    ("SynchedSpawnGroupData", "SynchedEntityData"),
    ("SpawnGroupDataSerializers", "EntityDataSerializers"),
    ("RecipeBookResults3", "AttributeSupplier.Builder"),
    ("PathNodeMaker051", "EquipmentSlot"),
    ("RecipeBookResults3", "AttributeSupplier.Builder"),
    ("ChatChatFormatting", "ChatFormatting"),
    ("HorizontalConnectingBlock", "CrossCollisionBlock"),
    ("SimpleStructurePiece", "StructurePiece"),
    ("StructurePiecesHolder", "StructurePiecesBuilder"),
    ("MutableText", "MutableComponent"),
    ("PlayerListEntry", "PlayerInfo"),
    ("EntityPose", "Pose"),
    ("WanderAroundFarGoal", "WaterAvoidingRandomStrollGoal"),
    ("appendProperties(", "createBlockStateDefinition("),
    ("getRenderType(", "getRenderShape("),
    ("protected void onUse(", "protected net.minecraft.world.InteractionResult useWithoutItem("),
    ("net.minecraft.world.level.block.state.properties.DirectionProperty", "net.minecraft.world.level.block.state.properties.EnumProperty"),
    ("DirectionProperty", "EnumProperty"),
    ("Tameable", "TamableAnimal"),

    # --- Pass 4: package moves and bad remap artifacts ---
    ("net.minecraft.core.tag.", "net.minecraft.tags."),
    ("net.minecraft.enchantment.", "net.minecraft.world.item.enchantment."),
    ("net.minecraft.world.entity.ItemEntity", "net.minecraft.world.entity.item.ItemEntity"),
    ("net.minecraft.world.level.block.entity.LockableContainerBlockEntity", "net.minecraft.world.level.block.entity.BaseContainerBlockEntity"),
    ("net.minecraft.village.TradeOfferList", "net.minecraft.world.item.trading.MerchantOffers"),
    ("net.minecraft.village.TradeOffer", "net.minecraft.world.item.trading.MerchantOffer"),
    ("net.minecraft.village.Merchant", "net.minecraft.world.item.trading.Merchant"),
    ("net.minecraft.world.entity.player.PlayerInventory", "net.minecraft.world.entity.player.Inventory"),
    ("net.minecraft.client.gui.screens.ingame.BookEditScreen8", "net.minecraft.world.entity.Entity.MoveFunction"),
    ("net.minecraft.world.entity.projectile.SmallFireball", "net.minecraft.world.entity.projectile.hurtingprojectile.SmallFireball"),
    # ArmorItem must stay — CustomArmorItem extends it
    ("net.minecraft.UserCache", "net.minecraft.server.players.ProfileResolver"),
    ("getUserCache()", "getProfileResolver()"),
    ("net.minecraft.world.entity.EntityEntitySpawnReason", "net.minecraft.world.entity.EntitySpawnReason"),
    ("EntityEntitySpawnReason", "EntitySpawnReason"),
    ("net.minecraft.ChatChatFormatting", "net.minecraft.ChatFormatting"),
    ("ChatChatFormatting", "ChatFormatting"),
    ("net.minecraft.stat.", "net.minecraft.stats."),
    ("net.minecraft.world.event.GameEvent", "net.minecraft.world.level.gameevent.GameEvent"),
    ("net.minecraft.world.ClipContext", "net.minecraft.world.level.ClipContext"),
    ("net.minecraft.TypedActionResult", "net.minecraft.world.InteractionResultHolder"),
    ("net.minecraft.UseAction", "net.minecraft.world.item.UseAnim"),
    ("net.minecraft.world.level.levelgen.chunk.ChunkGenerator", "net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator"),
    ("net.minecraft.world.entity.projectile.AbstractFireballEntity", "net.minecraft.world.entity.projectile.hurtingprojectile.AbstractHurtingProjectile"),
    ("net.minecraft.world.entity.LightningEntity", "net.minecraft.world.entity.LightningBolt"),
    ("net.minecraft.world.entity.projectile.AbstractArrow.PickupPermission", "net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup"),
    ("PickupPermission", "AbstractArrow.Pickup"),
    ("net.minecraft.world.item.Item.Item.Item.Item.Item.TooltipContext", "net.minecraft.world.item.Item.TooltipContext"),
    ("net.minecraft.world.item.Item.Item.Item.Item.TooltipContext", "net.minecraft.world.item.Item.TooltipContext"),
    ("net.minecraft.world.item.Item.Item.Item.TooltipContext", "net.minecraft.world.item.Item.TooltipContext"),
    ("net.minecraft.world.item.Item.Item.TooltipContext", "net.minecraft.world.item.Item.TooltipContext"),
    ("InteractionResultHolder.consume(", "InteractionResultHolder.consume("),
    ("InteractionResultHolder.pass(", "InteractionResultHolder.pass("),
    ("InteractionResultHolder.fail(", "InteractionResultHolder.fail("),
    ("InteractionResultHolder.success(", "InteractionResultHolder.success("),

    # --- Pass 5: remaining Mojang 26.2 API names ---
    ("net.minecraft.core.Mth", "net.minecraft.util.Mth"),
    ("net.minecraft.resources.ResourceLocation", "net.minecraft.resources.Identifier"),
    ("net.minecraft.network.syncher.TrackedDataHandlerRegistry", "net.minecraft.network.syncher.EntityDataSerializers"),
    ("net.minecraft.network.syncher.TrackedDataHandler", "net.minecraft.network.syncher.EntityDataSerializer"),
    ("net.minecraft.network.syncher.TrackedData", "net.minecraft.network.syncher.EntityDataAccessor"),
    ("net.minecraft.network.syncher.DataTracker", "net.minecraft.network.syncher.SynchedEntityData"),
    ("net.minecraft.network.chat.Text", "net.minecraft.network.chat.Component"),
    ("net.minecraft.world.scores.AbstractTeam", "net.minecraft.world.scores.PlayerTeam"),
    ("net.minecraft.world.entity.Entity.PositionUpdater", "net.minecraft.world.entity.Entity.MoveFunction"),
    ("net.minecraft.world.entity.ai.control.MoveControl.State", "net.minecraft.world.entity.ai.control.MoveControl.Operation"),
    ("net.minecraft.world.entity.ai.goal.Goal.Control", "net.minecraft.world.entity.ai.goal.Goal.Flag"),
    ("net.minecraft.client.MinecraftClient", "net.minecraft.client.Minecraft"),
    ("net.minecraft.world.item.trading.TradeOfferList", "net.minecraft.world.item.trading.MerchantOffers"),
    ("net.minecraft.world.item.trading.TradeOffer", "net.minecraft.world.item.trading.MerchantOffer"),
    ("net.minecraft.world.entity.Npc", "net.minecraft.world.entity.npc.Npc"),
    ("net.minecraft.world.item.FoodComponent", "net.minecraft.world.item.component.FoodProperties"),
    ("net.minecraft.core.particles.ParticleEffect", "net.minecraft.core.particles.ParticleOptions"),
    ("net.minecraft.core.particles.BlockStateParticleEffect", "net.minecraft.core.particles.BlockParticleOption"),
    ("net.minecraft.core.particles.ItemStackParticleEffect", "net.minecraft.core.particles.ItemParticleOption"),
    ("net.minecraft.world.entity.projectile.arrow.AbstractArrow.AbstractArrow.Pickup", "net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup"),
    ("net.minecraft.world.item.ItemConvertible", "net.minecraft.world.level.ItemLike"),
    ("implements net.minecraft.world.entity.TamableAnimal,", "implements net.minecraft.world.entity.OwnableEntity,"),
    ("MiningTieredItem", "DiggerItem"),
    ("net.minecraft.world.InteractionResultHolder", "net.minecraft.world.InteractionResultHolder"),
    ("ItemInteractionResult", "InteractionResultHolder"),
    ("net.minecraft.Rarity", "net.minecraft.world.item.Rarity"),
    ("net.minecraft.core.random.Random", "net.minecraft.util.RandomSource"),
    ("net.minecraft.world.ClipContext", "net.minecraft.world.level.ClipContext"),
    ("net.minecraft.ChatChatFormatting", "net.minecraft.ChatFormatting"),
    ("ChatChatFormatting", "ChatFormatting"),
    ("net.minecraft.world.item.Item.Item.TooltipContext", "net.minecraft.world.item.Item.TooltipContext"),
    ("public class CustomArmorItem extends net.minecraft.world.item.ArmorItem", "public class CustomArmorItem extends net.minecraft.world.item.Item"),
    (".registerData(", ".defineId("),
    ("onTrackedDataSet(", "onSyncedDataUpdated("),
    ("getOrCreateNbt(", "getOrCreateTag("),
    ("method_48926()", "level()"),
    ("isMainPlayer()", "isLocalPlayer()"),
    ("getNetworkHandler()", "getConnection()"),
    ("targetedEntity", "crosshairPickEntity"),
    ("getBoundKeyLocalizedText()", "getTranslatedKeyMessage()"),
    ("putUuid(", "putUUID("),
    (".getUuid()", ".getUUID()"),
    (".spawnEntity(", ".addFreshEntity("),
    ("TrackedDataHandlerRegistry", "EntityDataSerializers"),
    ("TrackedDataHandler", "EntityDataSerializer"),
    ("TrackedData", "EntityDataAccessor"),
    ("DataTracker", "SynchedEntityData"),
    ("MinecraftClient", "Minecraft"),
    ("AbstractTeam", "PlayerTeam"),
    ("PositionUpdater", "MoveFunction"),
    ("FoodComponent", "FoodProperties"),
    ("ParticleEffect", "ParticleOptions"),
    ("BlockStateParticleEffect", "BlockParticleOption"),
    ("ItemStackParticleEffect", "ItemParticleOption"),
    ("TradeOfferList", "MerchantOffers"),
    ("TradeOffer", "MerchantOffer"),
    ("ItemConvertible", "ItemLike"),
    ("MoveControl.State", "MoveControl.Operation"),
    ("Goal.Control", "Goal.Flag"),

    # --- Pass 6: structure, registry, and collision fixes ---
    ("net.minecraft.core.BoundingBox", "net.minecraft.world.level.levelgen.structure.BoundingBox"),
    ("net.minecraft.world.level.levelgen.structure.StructureTemplate", "net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate"),
    ("net.minecraft.world.level.levelgen.structure.StructurePlacementData", "net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings"),
    ("net.minecraft.world.level.levelgen.structure.processor", "net.minecraft.world.level.levelgen.structure.templatesystem"),
    ("net.minecraft.world.level.block.HorizontalFacingBlock", "net.minecraft.world.level.block.HorizontalDirectionalBlock"),
    ("net.minecraft.world.level.block.TrapdoorBlock", "net.minecraft.world.level.block.TrapDoorBlock"),
    ("net.minecraft.world.level.block.state.properties.BlockHalf", "net.minecraft.world.level.block.state.properties.Half"),
    ("net.minecraft.world.level.block.state.properties.StructureBlockMode", "net.minecraft.world.level.block.state.properties.StructureMode"),
    ("net.minecraft.world.level.GameRules", "net.minecraft.world.level.gamerules.GameRules"),
    ("net.minecraft.world.level.levelgen.structure.StructurePieceType", "net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType"),
    ("net.minecraft.world.level.block.entity.BlockEntityType.BlockEntityFactory", "net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier"),
    ("net.minecraft.world.entity.ai.goal.RandomRandomLookAroundGoal", "net.minecraft.world.entity.ai.goal.RandomLookAroundGoal"),
    ("RandomRandomLookAroundGoal", "RandomLookAroundGoal"),
    ("net.minecraft.world.ClipContext.FluidHandling", "net.minecraft.world.level.ClipContext.Fluid"),
    ("net.minecraft.world.ClipContext.ShapeType", "net.minecraft.world.level.ClipContext.Block"),
    ("net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup", "net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup"),
    ("createCuboidShape(", "Block.box("),
    ("Shapes.union(", "Shapes.or("),
    ("EnumProperty.of(", "EnumProperty.create("),
    ("net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreStructureProcessor", "net.minecraft.world.level.levelgen.structure.templatesystem.structureprocessor.BlockIgnoreProcessor"),
    ("BlockIgnoreStructureProcessor", "BlockIgnoreProcessor"),
    ("public net.minecraft.world.InteractionResult onUse(", "public net.minecraft.world.InteractionResult useWithoutItem("),

    # --- Pass 7: method and member renames ---
    ("getDefaultStack()", "getDefaultInstance()"),
    (".sounds(", ".sound("),
    ("checkType(", "createTickerHelper("),
    ("createBlockEntity(", "newBlockEntity("),
    ("shouldCancelInteraction()", "isSpectator()"),
    ("source.getSource()", "source.getEntity()"),
    ("getScoreboardTeam()", "getTeam()"),
    ("getHeightOffset()", "getMyRidingOffset()"),
    ("getRotationVector().multiply(", "getLookAngle().scale("),
    ("net.minecraft.world.level.levelgen.structure.templatesystem.structureprocessor.BlockIgnoreProcessor", "net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor"),
    ("import net.minecraft.world.item.ArmorItem;", ""),

    # --- Pass 8: verified MC 26.2 API ---
    ("net.minecraft.world.InteractionResultHolder<net.minecraft.world.item.ItemStack>", "net.minecraft.world.InteractionResult"),
    ("InteractionResultHolder<net.minecraft.world.item.ItemStack>", "net.minecraft.world.InteractionResult"),
    ("import net.minecraft.world.InteractionResultHolder;\n", ""),
    ("InteractionResultHolder.consume(", "InteractionResult.CONSUME.heldItemTransformedTo("),
    ("InteractionResultHolder.success(", "InteractionResult.SUCCESS.heldItemTransformedTo("),
    ("net.minecraft.world.item.UseAnim", "net.minecraft.world.item.ItemUseAnimation"),
    ("import net.minecraft.world.item.UseAnim;", "import net.minecraft.world.item.ItemUseAnimation;"),
    ("getUseAnim(", "getUseAnimation("),
    ("import net.minecraft.Util;", "import net.minecraft.util.Util;"),
    ("net.minecraft.Util", "net.minecraft.util.Util"),
    ("net.minecraft.world.item.component.FoodProperties", "net.minecraft.world.food.FoodProperties"),
    ("net.minecraft.world.level.ClipContext.ClipContext.", "net.minecraft.world.level.ClipContext."),
    ("net.minecraft.core.Registries.", "net.minecraft.core.registries.BuiltInRegistries."),
    ("import net.minecraft.core.Registries;", "import net.minecraft.core.registries.BuiltInRegistries;"),
    ("StructurePieceType.ManagerAware", "StructurePieceType.StructureTemplateType"),
    ("StructurePieceType.Simple", "StructurePieceType.ContextlessType"),
    ("import net.minecraft.core.Direction.Type;", "import net.minecraft.core.Direction.Plane;"),
    ("Direction.Type", "Direction.Plane"),
    ("net.minecraft.world.item.DiggerItem", "net.minecraft.world.item.ShovelItem"),
    ("import net.minecraft.world.item.DiggerItem;", ""),
    ("net.minecraft.world.level.gamerules.GameRules.BooleanRule", "net.minecraft.world.level.gamerules.GameRule"),
    ("GameRules.BooleanRule", "GameRule"),
    ("net.minecraft.world.level.gamerules.GameRules.Key", "net.minecraft.world.level.gamerules.GameRule"),
    ("GameRules.Key", "GameRule"),
    ("net.minecraft.world.level.gamerules.GameRules.Category", "net.minecraft.world.level.gamerules.GameRuleCategory"),
    ("GameRules.Category", "GameRuleCategory"),
    ("getGameRules().getBoolean(", "getGameRules().get("),
    ("player.forwardSpeed", "player.zza"),
    ("player.sidewaysSpeed", "player.xxa"),
    ("lastAttackedTicks", "attackStrengthTicker"),
    ("this.age", "this.tickCount"),
    ("sendEntityStatus(", "broadcastEntityEvent("),
    (".rotateZ(", ".zRot("),
    (".rotateX(", ".xRot("),
    (".rotateY(", ".yRot("),
    ("InteractionResult.success(this.level().isClientSide())", "(this.level().isClientSide() ? InteractionResult.SUCCESS : InteractionResult.SUCCESS_SERVER)"),
    ("setBlock(pos,", "setBlock(pos,"),
    ("lvl.setBlock(", "lvl.setBlock("),
    ("state.get(", "state.getValue("),
    ("getItemUseAnimationation", "getUseAnimation"),
    ("ItemItemUseAnimationation", "ItemUseAnimation"),
    ("passenger.getMyRidingOffset()", "0.0"),
    ("tickControlled(", "tickRidden("),
    ("getControlledMovementInput(", "getRiddenInput("),
    ("getSaddledSpeed(", "getRiddenSpeed("),
    ("canSprintAsVehicle()", "canSprint()"),
    ("interactMob(", "mobInteract("),
    ("getPos()", "position()"),
    ("getVelocity()", "getDeltaMovement()"),
    ("setVelocity(", "setDeltaMovement("),
    ("getBlockPos()", "blockPosition()"),
    ("getEyePos()", "getEyePosition()"),
    ("getRotationVector()", "getLookAngle()"),
    ("setPersistent()", "setPersistenceRequired()"),
    ("hasNoGravity()", "isNoGravity()"),
    ("!this.hasNoDrag()", "this.getAirDrag() > 0.0F"),
    ("handleStatus(", "handleEntityEvent("),
    ("calculateBoundingBox()", "makeBoundingBox()"),
    (".stretch(", ".expandTowards("),
    ("getMovementSpeed()", "getSpeed()"),
    ("setMovementSpeed(", "setSpeed("),
    ("getYaw()", "getYRot()"),
    ("setYaw(", "setYRot("),
    ("getPitch()", "getXRot()"),
    ("setPitch(", "setXRot("),
    ("bodyYaw", "yBodyRot"),
    ("headYaw", "yHeadRot"),
    ("prevX", "xOld"),
    ("prevZ", "zOld"),
    (".horizontalLengthSquared()", ".horizontalDistanceSqr()"),
    ("setBlockState(", "setBlock("),
    ("setPosition(", "setPos("),
    ("Attributes.GENERIC_", "Attributes."),
    ("getMaxUseTime(", "getUseDuration("),
    ("EnumProperty FACING = net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_FACING", "EnumProperty<net.minecraft.core.Direction> FACING = net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_FACING"),
    ("protected net.minecraft.world.level.block.state.BlockState getStateForPlacement(", "public net.minecraft.world.level.block.state.BlockState getStateForPlacement("),
    ("case EAST ->", "case net.minecraft.core.Direction.EAST ->"),
    ("case SOUTH ->", "case net.minecraft.core.Direction.SOUTH ->"),
    ("case WEST ->", "case net.minecraft.core.Direction.WEST ->"),
    ("case NORTH ->", "case net.minecraft.core.Direction.NORTH ->"),
    ("BlockEntityType.Builder.create(factory, Arrays.stream(blocks).map(Supplier::get).toArray(net.minecraft.world.level.block.Block[]::new)).build(null)", "new BlockEntityType<>(factory, java.util.Set.of(Arrays.stream(blocks).map(Supplier::get).toArray(net.minecraft.world.level.block.Block[]::new)))"),
    ("import net.minecraft.world.level.block.entity.BlockEntityType.Builder;\n", ""),
    ("state.with(", "state.setValue("),
    ("getDefaultState().with(", "getDefaultState().setValue("),
    ("extends net.minecraft.world.item.ArmorItem", "extends net.minecraft.world.item.Item"),

    # --- Pass 9: entity/goal/nbt/item API (MC 26.2 verified) ---
    ("mutableCopy()", "mutable()"),
    ("goalSelector.add(", "goalSelector.addGoal("),
    ("goalSelector.remove(", "goalSelector.removeGoal("),
    ("targetSelector.add(", "targetSelector.addGoal("),
    ("targetSelector.remove(", "targetSelector.removeGoal("),
    ("Mth.lerpAngleDegrees(", "Mth.rotLerp("),
    ("net.minecraft.util.Mth.lerpAngleDegrees(", "net.minecraft.util.Mth.rotLerp("),
    ("hasSolidTopSurface(", "isFaceSturdy("),
    (".hasSolidTopSurface(this.level(), pos, this)", ".isFaceSturdy(this.level(), pos, net.minecraft.core.Direction.UP)"),
    ("options.attackKey", "options.keyAttack"),
    ("hitResult.position()", "hitResult.getLocation()"),
    ("ProjectileUtil.getCollision(", "ProjectileUtil.getHitResultOnViewVector("),
    ("getAttacker()", "getEntity()"),
    ("isTeammate(", "isAlliedTo("),
    ("isPartOf(", "isAlliedTo("),
    ("squaredDistanceTo(", "distanceToSqr("),
    ("Vec3.ofBottomCenter(", "Vec3.atBottomCenterOf("),
    ("getDefaultName()", "getName().getString()"),
    ("this.uuidString", "this.getStringUUID()"),
    ("canStart()", "canUse()"),
    ("shouldContinue()", "canContinueToUse()"),
    ("setControls(", "setFlags("),
    ("navigation.isIdle()", "navigation.isDone()"),
    ("startMovingTo(", "moveTo("),
    ("getTickCount(", "adjustedTickDelay("),
    ("getWanderTarget()", "getPosition()"),
    ("this.targetX", "this.wantedX"),
    ("this.targetY", "this.wantedY"),
    ("this.targetZ", "this.wantedZ"),
    ("this.ignoringChance", "this.forceTrigger"),
    ("tickHandSwing()", "updateSwingTime()"),
    ("tickMovement()", "aiStep()"),
    ("isOnGround()", "onGround()"),
    ("startIfNotRunning(", "startIfStopped("),
    ("cannotDespawn()", "isPersistenceRequired()"),
    ("getNextAirUnderwater(", "decreaseAirSupply("),
    ("initGoals()", "registerGoals()"),
    ("getServer()", "level().getServer()"),
    ("getByUuid(", "fetchById("),
    ("profile.getName()", "profile.name()"),
    ("tag.contains(\"Owner\", 11)", "tag.contains(\"Owner\")"),
    ("tag.contains(\"Command\", 8)", "tag.contains(\"Command\")"),
    ("tag.contains(\"Offers\", 10)", "tag.contains(\"Offers\")"),
    ("tag.contains(\"Spear\", 10)", "tag.contains(\"Spear\")"),
    ("tag.putUUID(\"Owner\", uuid)", "tag.putString(\"Owner\", uuid.toString())"),
    ("EntityDataSerializers.OPTIONAL_UUID", "EntityDataSerializers.OPTIONAL_LIVING_ENTITY_REFERENCE"),
    ("EntityDataSerializers.register(", "EntityDataSerializers.registerSerializer("),
    ("SoundEvents.ENTITY_GENERIC_EXPLODE", "SoundEvents.GENERIC_EXPLODE"),
    ("getPickBlockStack()", "getPickResult()"),
    ("getRotationVec(", "getViewVector("),
    ("source.getPosition()", "source.getSourcePosition()"),
    ("super.clientTick()", "super.tick()"),
    ("this.experiencePoints = ", "// experience via getBaseExperienceReward: "),
    ("getUseDuration(net.minecraft.world.item.ItemStack $$0)", "getUseDuration(net.minecraft.world.item.ItemStack stack, net.minecraft.world.entity.LivingEntity entity)"),
    ("getUseDuration(ItemStack $$0)", "getUseDuration(ItemStack stack, LivingEntity entity)"),
    ("public boolean canMine(", "public boolean isCorrectToolForDrops("),
    ("instanceof net.minecraft.world.item.DiggerItem", "instanceof net.minecraft.world.item.ShovelItem"),
    ("instanceof DiggerItem", "instanceof ShovelItem"),
    ("readCustomDataFromNbt(", "readAdditionalSaveData("),
    ("writeCustomDataToNbt(", "addAdditionalSaveData("),
    ("saveAdditional(net.minecraft.nbt.CompoundTag", "addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput"),
    ("loadAdditional(net.minecraft.nbt.CompoundTag", "readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput"),
    ("public void readAdditionalSaveData(net.minecraft.nbt.CompoundTag", "protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput"),
    ("public void addAdditionalSaveData(net.minecraft.nbt.CompoundTag", "protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput"),
    ("protected void readAdditionalSaveData(net.minecraft.nbt.CompoundTag", "protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput"),
    ("protected void addAdditionalSaveData(net.minecraft.nbt.CompoundTag", "protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput"),
    ("public boolean damage(net.minecraft.world.damagesource.DamageSource source, float amount)", "public boolean hurtServer(net.minecraft.server.level.ServerLevel level, net.minecraft.world.damagesource.DamageSource source, float amount)"),
    ("public boolean hurtOrSimulate(net.minecraft.world.damagesource.DamageSource source, float amount)", "public boolean hurtServer(net.minecraft.server.level.ServerLevel level, net.minecraft.world.damagesource.DamageSource source, float amount)"),
    ("this.hurtOrSimulate(source, amount)", "super.hurtServer(level, source, amount)"),
    ("super.hurtOrSimulate(source, amount)", "super.hurtServer(level, source, amount)"),
    ("super.hurt(source, amount)", "super.hurtServer(level, source, amount)"),
    ("super.initialize(", "super.finalizeSpawn("),
    ("public net.minecraft.world.entity.SpawnGroupData initialize(", "public net.minecraft.world.entity.SpawnGroupData finalizeSpawn("),
    ("@Nullable net.minecraft.nbt.CompoundTag tag)", "@Nullable net.minecraft.world.entity.SpawnGroupData spawnData)"),
    ("@Nullable net.minecraft.nbt.CompoundTag dataTag)", "@Nullable net.minecraft.world.entity.SpawnGroupData spawnData)"),
    (", true, entity ->", ", true, (entity, serverLevel) ->"),
    (", false, mob ->", ", false, (mob, serverLevel) ->"),
    ("this.state ==", "this.operation =="),
    ("this.state =", "this.operation ="),
    ("this.entity.", "this.mob."),
    ("this.entity;", "this.mob;"),
    ("this.speed *", "this.speedModifier *"),
    ("this.wrapDegrees(", "this.rotlerp("),
    ("EntityDataAccessor<Optional<UUID>> DATA_OWNER_ID", "EntityDataAccessor<Optional<net.minecraft.world.entity.EntityReference<net.minecraft.world.entity.LivingEntity>>> DATA_OWNER_ID"),
    ("Optional<UUID>> DATA_OWNER_ID", "Optional<net.minecraft.world.entity.EntityReference<net.minecraft.world.entity.LivingEntity>>> DATA_OWNER_ID"),
    ("setOwnerUUID(", "setOwnerUuid("),
    ("getOwnerUUID(", "getOwnerUuid("),
    ("getMainHandStack()", "getMainHandItem()"),
    ("getOffHandStack()", "getOffhandItem()"),
    ("setStackInHand(", "setItemInHand("),
    ("equipStack(", "setItemSlot("),
    ("isPressed()", "isDown()"),
    ("isAttacking()", "isAggressive()"),
    ("enchantMainHandItem(", "enchantSpawnedWeapon("),
    ("getClampedDifficultyInstance()", "getEffectiveDifficulty()"),
    ("profile.name()", "profile.getName()"),
    (", @Nullable net.minecraft.world.entity.SpawnGroupData spawnData, @Nullable net.minecraft.world.entity.SpawnGroupData spawnData)", ", @Nullable net.minecraft.world.entity.SpawnGroupData spawnData)"),
    ("super.finalizeSpawn(lvl, difficulty, spawnType, data, tag)", "super.finalizeSpawn(lvl, difficulty, spawnType, data)"),
    ("super.finalizeSpawn(level, difficulty, reason, spawnData, tag)", "super.finalizeSpawn(level, difficulty, reason, spawnData)"),

    # --- Pass 11: combat/goal/AABB follow-ups ---
    (".isOf(", ".is("),
    ("swingHand(", "swing("),
    ("setAttacking(", "setAggressive("),
    ("getWidth()", "getBbWidth()"),
    ("shootAt(", "performRangedAttack("),
    ("getFollowRange()", "getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE)"),
    ("AABB.from(", "new net.minecraft.world.phys.AABB("),
    (".expand(", ".inflate("),
    ("setGroupRevenge(", "setAlertOthers("),
    ("getCooldown()", "getAttackInterval()"),
    ("resetCooldown()", "resetAttackInterval()"),
    ("hurtServer(net.minecraft.server.level.ServerLevel level,", "hurtServer(net.minecraft.server.level.ServerLevel serverLevel,"),
    ("super.hurtServer(level,", "super.hurtServer(serverLevel,"),
    ("enchantSpawnedWeapon(this.random, difficulty.getEffectiveDifficulty())", "enchantSpawnedWeapon(lvl, this.random, difficulty)"),
    ("super.finalizeSpawn(lvl, difficulty, type, groupData, tag)", "super.finalizeSpawn(lvl, difficulty, type, groupData)"),
    ("tryAttack(", "doHurtTarget((net.minecraft.server.level.ServerLevel)this.level(), "),
    ("setDeltaMovement(vec3.x, vec3.y, vec3.z, 3.0F, 0.5F)", "shoot(vec3.x, vec3.y, vec3.z, 3.0F, 0.5F)"),

    # --- Pass 12: projectile/serializer/combat cleanup ---
    ("EntityDataSerializers.INTEGER", "EntityDataSerializers.INT"),
    ("EntityDataSerializers.FLOAT", "EntityDataSerializers.FLOAT"),
    ("EntityDataSerializers.BOOLEAN", "EntityDataSerializers.BOOLEAN"),
    ("isTouchingWater()", "isInWater()"),
    ("onCollision(", "onHit("),
    ("canHit(", "canHitEntity("),
    ("super.canHit(", "super.canHitEntity("),
    ("resetAttackInterval()", "resetAttackCooldown()"),
    ("GENERIC_EXPLODE.value().value()", "GENERIC_EXPLODE.value()"),
    ("public boolean damage(net.minecraft.world.damagesource.DamageSource", "public boolean hurtServer(net.minecraft.server.level.ServerLevel serverLevel, net.minecraft.world.damagesource.DamageSource"),
    ("public void attack(net.minecraft.world.entity.LivingEntity target, float", "public void performRangedAttack(net.minecraft.world.entity.LivingEntity target, float"),
    (", @Nullable net.minecraft.world.entity.SpawnGroupData groupData, @Nullable net.minecraft.world.entity.SpawnGroupData spawnData)", ", @Nullable net.minecraft.world.entity.SpawnGroupData groupData)"),
    ("getEquipmentSlot()", "getSlot()"),
    ("getEquippedStack(", "getItemBySlot("),
    ("net.minecraft.world.item.ArmorItem", "che.swgc.item.CustomArmorItem"),
    ("instanceof net.minecraft.world.item.ArmorItem", "instanceof che.swgc.item.CustomArmorItem"),
]

# Regex-style fixes applied after string replacements
IMPORT_CLEANUPS = [
    # Vanishable was a marker interface; drop implements clause
]


def fix_file(text: str) -> str:
    import re
    for old, new in sorted(FIXES, key=lambda x: -len(x[0])):
        text = text.replace(old, new)
    # Vanishable marker interface removed in modern MC
    text = text.replace(" implements net.minecraft.world.item.Vanishable", "")
    text = text.replace(" implements Vanishable", "")
    text = re.sub(r"import net\.minecraft\.world\.item\.Item\.Item\.TooltipContext;", "import net.minecraft.world.item.Item.TooltipContext;", text)
    text = text.replace("net.minecraft.world.item.Item.Item.TooltipContext", "net.minecraft.world.item.Item.TooltipContext")
    text = re.sub(r"import net\.minecraft\.world\.entity\.ai\.control\.MoveControl\.Operation;\n", "", text)
    # Entity sync API 26.2
    text = text.replace("protected void initSynchedEntityData()", "protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder)")
    text = text.replace("public void initSynchedEntityData()", "protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder)")
    text = text.replace("super.initSynchedEntityData()", "super.defineSynchedData(builder)")
    text = re.sub(r"this\.dataTracker\.startTracking\(([^,]+),\s*([^)]+)\)", r"builder.define(\1, \2)", text)
    text = text.replace("this.dataTracker.get(", "this.entityData.get(")
    text = text.replace("this.dataTracker.set(", "this.entityData.set(")
    # Fix inverted hasNoDrag replacement
    text = re.sub(r"InteractionResultHolder\.fail\([^)]*\)", "InteractionResult.FAIL", text)
    text = re.sub(r"InteractionResultHolder\.pass\([^)]*\)", "InteractionResult.PASS", text)
    text = re.sub(r"InteractionResult\.FAIL\w+\)", "InteractionResult.FAIL", text)
    text = re.sub(r"InteractionResult\.PASS\w+\)", "InteractionResult.PASS", text)
    text = text.replace("!this.(getAirDrag() == 0.0F)", "this.getAirDrag() > 0.0F")
    text = text.replace("block.entity.new net.minecraft.world.level.block.entity.BlockEntityType", "new net.minecraft.world.level.block.entity.BlockEntityType")
    text = text.replace("ItemItemUseAnimationation", "ItemUseAnimation")
    text = text.replace("getItemUseAnimationation", "getUseAnimation")
    text = text.replace("isClientSide()Side()", "isClientSide()")
    text = text.replace("(net.minecraft.world.level.block.state.BlockState, 3)", "(net.minecraft.world.level.block.state.BlockState)")
    # EntityDataAccessor get/set (not Entity.get for components)
    text = re.sub(r"this\.get\((DATA_\w+)\)", r"this.entityData.get(\1)", text)
    text = re.sub(r"this\.set\((DATA_\w+)", r"this.entityData.set(\1", text)
    text = re.sub(r"\(UUID\)\(\(Optional\)this\.entityData\.get\(DATA_OWNER_ID\)\)\.orElse\(null\)",
                  r"this.entityData.get(DATA_OWNER_ID).map(net.minecraft.world.entity.EntityReference::getUUID).orElse(null)", text)
    text = re.sub(r"this\.entityData\.set\(DATA_OWNER_ID, Optional\.ofNullable\(ownerUuid\)\)",
                  r"this.entityData.set(DATA_OWNER_ID, ownerUuid == null ? Optional.empty() : Optional.of(net.minecraft.world.entity.EntityReference.of(ownerUuid)))", text)
    text = re.sub(r"(\w+)\.getOrCreateTag\(\)", r"SwgcItemData.getOrCreate(\1)", text)
    text = re.sub(r"(\w+)\.getOrCreateTag\(\)\.put", r"SwgcItemData.update(\1, tag -> tag.put", text)
    text = text.replace("BodyRotationControl extends net.minecraft.world.entity.ai.control.BodyRotationControl", "BodyRotationControl extends net.minecraft.world.entity.ai.control.BodyRotationControl")
    text = re.sub(
        r"(public void clientTick\(\) \{[^}]*?)super\.tick\(\)",
        r"\1super.clientTick()",
        text,
        flags=re.DOTALL,
    )
    text = re.sub(
        r"return \(src\.getEntity\(\) == null \|\| !this\.isAlliedTo\(src\.getEntity\(\)\)\) && super\.hurt\(src, amount\);",
        r"return (src.getEntity() == null || !this.isAlliedTo(src.getEntity())) && super.hurtServer(level, src, amount);",
        text,
    )
    text = text.replace(
        "projectile.setDeltaMovement(vec3.x, vec3.y, vec3.z, velocity + (float)self.getDeltaMovement().length(), inaccuracy);",
        "projectile.shoot(vec3.x, vec3.y, vec3.z, velocity + (float)self.getDeltaMovement().length(), inaccuracy);",
    )
    text = text.replace(
        "blasterBolt.setDeltaMovement(direction.x, direction.y, direction.z, this.velocity, this.inaccuracy);",
        "blasterBolt.shoot(direction.x, direction.y, direction.z, this.velocity, this.inaccuracy);",
    )
    text = text.replace(
        "blasterBolt.setDeltaMovement(entity, entity.getXRot(), entity.getYRot(), 0.0F, 3.0F, this.inaccuracy);",
        "blasterBolt.shootFromRotation(entity, entity.getXRot(), entity.getYRot(), 0.0F, 3.0F, this.inaccuracy);",
    )
    text = re.sub(
        r"public boolean isAlliedTo\(net\.minecraft\.world\.entity\.Entity entity\) \{[^}]+\}\n\n",
        "",
        text,
        flags=re.DOTALL,
    )
    text = re.sub(
        r"   public boolean isAlliedTo\(net\.minecraft\.world\.entity\.Entity entity\) \{[^}]+\}\n",
        "",
        text,
        flags=re.DOTALL,
    )
    text = text.replace("doHurtTarget((net.minecraft.server.level.ServerLevel)this.level(), target);", "doHurtTarget((net.minecraft.server.level.ServerLevel)this.level(), target));")
    # Fix getOrCreateTag chain put - add closing for update lambda where single statement
    text = re.sub(r"SwgcItemData\.update\((\w+), tag -> tag\.put(\w+)\(([^)]+)\)\);",
                  r"SwgcItemData.update(\1, tag -> tag.put\2(\3));", text)
    # Enum entity data serializer removed in 26.2 — use STRING
    text = text.replace("EntityDataSerializer.ofEnum(CommandableMob.Command.class)",
                        "EntityDataSerializers.STRING")
    text = text.replace("EntityDataSerializer.ofEnum(Ewok.Variant.class)",
                        "EntityDataSerializers.STRING")
    text = text.replace("CommandableMob.Command.SERIALIZER", "EntityDataSerializers.STRING")
    text = text.replace("Ewok.Variant.SERIALIZER", "EntityDataSerializers.STRING")
    text = text.replace("EntityDataAccessor<CommandableMob.Command> DATA_COMMAND_ID",
                        "EntityDataAccessor<String> DATA_COMMAND_ID")
    text = text.replace("EntityDataAccessor<Ewok.Variant> DATA_VARIANT_ID",
                        "EntityDataAccessor<String> DATA_VARIANT_ID")
    text = text.replace("builder.define(DATA_COMMAND_ID, CommandableMob.Command.STAND_STILL)",
                        "builder.define(DATA_COMMAND_ID, CommandableMob.Command.STAND_STILL.name())")
    text = text.replace("return (CommandableMob.Command)this.entityData.get(DATA_COMMAND_ID)",
                        "return CommandableMob.Command.valueOf(this.entityData.get(DATA_COMMAND_ID))")
    text = text.replace("this.entityData.set(DATA_COMMAND_ID, command)",
                        "this.entityData.set(DATA_COMMAND_ID, command.name())")
    text = text.replace("CommandableMob.Command.valueOf(tag.getString(\"Command\"))",
                        "CommandableMob.Command.valueOf(tag.getStringOr(\"Command\", \"STAND_STILL\"))")
    text = text.replace("CommandableMob.Command.valueOf(tag.getStringOr(\"Command\", \"STAND_STILL\")))",
                        "CommandableMob.Command.valueOf(tag.getStringOr(\"Command\", \"STAND_STILL\"))")
    if "SwgcItemData" in text and "import che.swgc.SwgcItemData;" not in text:
        text = text.replace("package che.swgc;\n", "package che.swgc;\n\nimport che.swgc.SwgcItemData;\n", 1)
        if "import che.swgc.SwgcItemData;" not in text:
            text = re.sub(r"(package [^;]+;\n)", r"\1\nimport che.swgc.SwgcItemData;\n", text, count=1)
    return text


def main():
    total = 0
    for d in JAVA_DIRS:
        if not d.exists():
            continue
        n = 0
        for f in d.rglob("*.java"):
            orig = f.read_text(encoding="utf-8")
            fixed = fix_file(orig)
            if fixed != orig:
                f.write_text(fixed, encoding="utf-8")
                n += 1
        print(f"{d.relative_to(ROOT)}: {n} files")
        total += n
    print(f"Total: {total} files updated")


if __name__ == "__main__":
    main()
