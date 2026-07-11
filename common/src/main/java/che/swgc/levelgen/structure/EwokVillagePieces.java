package che.swgc.levelgen.structure;

import che.swgc.reg.SwgcEntities;
import che.swgc.reg.SwgcStructures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Plane;
import net.minecraft.core.Vec3i;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CrossCollisionBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StructureMode;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.StructureBlockInfo;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

@ParametersAreNonnullByDefault
public class EwokVillagePieces {
   public EwokVillagePieces() {
   }

   public static void addPieces(StructureTemplateManager templateManager, BlockPos pos, StructurePiecesBuilder pieces, RandomSource random) {
      double angle = random.nextDouble() * (float) (Math.PI * 2);
      EwokVillagePieces.EwokHousePiece last = house(0, templateManager, pos, random, 0, angle);
      pieces.addPiece(last);
      ArrayList<Integer> arrayList = new ArrayList<>(IntStream.range(1, 6).boxed().toList());

      for (int i = random.nextIntBetweenInclusive(2, 5); i > 0; i--) {
         EwokVillagePieces.EwokHousePiece house = house(
            last.getGenDepth() + 1, templateManager, pos, random, arrayList.remove(random.nextInt(arrayList.size())), --angle
         );
         last.fillOpenings(house, pieces, random);
         last = house;
      }
   }

   private static EwokVillagePieces.EwokHousePiece house(int depth, StructureTemplateManager templateManager, BlockPos pos, RandomSource random, int house, double angle) {
      return new EwokVillagePieces.EwokHousePiece(
         depth, templateManager, house, pos.offset((int)(24.0 * Math.sin(angle)), 0, (int)(24.0 * Math.cos(angle))), Rotation.getRandom(random)
      );
   }

   @Nullable
   private static BlockPos getBlockPos(CompoundTag tag, String key) {
      return tag.contains(key + "X") && tag.contains(key + "Y") && tag.contains(key + "Z")
         ? new BlockPos(tag.getIntOr(key + "X", 0), tag.getIntOr(key + "Y", 0), tag.getIntOr(key + "Z", 0))
         : null;
   }

   private static void putBlockPos(CompoundTag tag, String key, BlockPos pos) {
      tag.putInt(key + "X", pos.getX());
      tag.putInt(key + "Y", pos.getY());
      tag.putInt(key + "Z", pos.getZ());
   }

   private static void spawn(EntityType<? extends Mob> type, ServerLevelAccessor lvl, BlockPos pos) {
      Mob entity = type.create(lvl.getLevel(), EntitySpawnReason.STRUCTURE);
      if (entity != null) {
         entity.snapTo(pos, 0.0F, 0.0F);
         entity.finalizeSpawn(lvl, lvl.getCurrentDifficultyAt(pos), EntitySpawnReason.STRUCTURE, null);
         lvl.addFreshEntity(entity);
      }
   }

   public static class BridgePiece extends StructurePiece {
      private final BlockPos start;
      private final BlockPos size;

      protected BridgePiece(int genDepth, Direction orientation, EwokVillagePieces.EwokHousePiece house, EwokVillagePieces.EwokHousePiece house1) {
         super(
            (StructurePieceType)SwgcStructures.EWOK_BRIDGE.get(),
            genDepth,
            BoundingBox.fromCorners((Vec3i)house.bridges.get(orientation), (Vec3i)house1.bridges.get(orientation.getOpposite()))
         );
         this.setOrientation(orientation);
         this.start = house.bridges.get(orientation);
         BlockPos size = house1.bridges.get(orientation.getOpposite()).subtract(this.start);
         switch (orientation) {
            case NORTH:
               size = new BlockPos(size.getX(), size.getY(), -size.getZ());
               break;
            case EAST:
               size = new BlockPos(size.getZ(), size.getY(), size.getX());
               break;
            case WEST:
               size = new BlockPos(-size.getZ(), size.getY(), size.getX());
         }

         this.size = size;
      }

      public BridgePiece(CompoundTag tag) {
         super((StructurePieceType)SwgcStructures.EWOK_BRIDGE.get(), tag);
         this.start = EwokVillagePieces.getBlockPos(tag, "Start");
         this.size = EwokVillagePieces.getBlockPos(tag, "Size");
      }

      @Override
      protected void addAdditionalSaveData(StructurePieceSerializationContext ctx, CompoundTag tag) {
         EwokVillagePieces.putBlockPos(tag, "Start", this.start);
         EwokVillagePieces.putBlockPos(tag, "Size", this.size);
      }

      @Override
      public void postProcess(
         WorldGenLevel lvl,
         StructureManager structureManager,
         ChunkGenerator chunkGenerator,
         RandomSource randomSource,
         BoundingBox boundingBox,
         ChunkPos chunkPos,
         BlockPos blockPos
      ) {
         double x = (double)this.size.getX();
         if (x >= 0.0) {
            x = 0.0;
         } else {
            x = -x;
         }

         double y0 = (double)this.size.getY();
         if (y0 >= 0.0) {
            y0 = 0.0;
         } else {
            y0 = -y0;
         }

         double var25;
         double y1 = var25 = y0 - 0.1;

         for (int z = 0; z <= this.size.getZ(); z++) {
            double minY = Math.min(var25, y1);
            double maxY = Math.max(var25, y1);
            int y = (int)minY;
            if (y == (int)maxY) {
               boolean bottom = minY % 1.0 < 0.5;
               boolean full = bottom && maxY % 1.0 >= 0.5;

               for (int x1 = (int)x - 2; (double)x1 <= x + 2.0; x1++) {
                  this.placeBlock(lvl, full ? Blocks.SPRUCE_PLANKS.defaultBlockState() : this.halfBlock(randomSource, bottom), x1, y, z, boundingBox);
                  if (randomSource.nextFloat() < 0.05F) {
                     EwokVillagePieces.spawn(SwgcEntities.EWOK.get(), lvl, this.getWorldPos(x1, y + 1, z));
                  }
               }
            } else {
               for (int x1x = (int)x - 2; (double)x1x <= x + 2.0; x1x++) {
                  this.placeBlock(lvl, this.halfBlock(randomSource, false), x1x, y, z, boundingBox);
                  this.placeBlock(lvl, this.halfBlock(randomSource, true), x1x, y + 1, z, boundingBox);
                  if (randomSource.nextFloat() < 0.05F) {
                     EwokVillagePieces.spawn(SwgcEntities.EWOK.get(), lvl, this.getWorldPos(x1x, y + 1, z));
                  }
               }
            }

            x += (double)this.size.getX() / (double)this.size.getZ();
            if (z < this.size.getZ() - 1) {
               var25 = y1;
               y1 += (double)this.size.getY() / (double)(this.size.getZ() - 1);
            }
         }
      }

      private BlockState halfBlock(RandomSource random, boolean bottom) {
         return random.nextInt(4) == 0
            ? Blocks.SPRUCE_TRAPDOOR.defaultBlockState().setValue(TrapDoorBlock.HALF, bottom ? Half.BOTTOM : Half.TOP)
            : Blocks.SPRUCE_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, bottom ? SlabType.BOTTOM : SlabType.TOP);
      }
   }

   public static class EwokHousePiece extends TemplateStructurePiece {
      @Nullable
      private final StructureTemplate tree;
      private final HashMap<Direction, BlockPos> bridges = new HashMap<>();

      public EwokHousePiece(int depth, StructureTemplateManager manager, int house, BlockPos pos, Rotation rot) {
         super((StructurePieceType)SwgcStructures.EWOK_HOUSE.get(), depth, manager, Identifier.fromNamespaceAndPath("swgc", getName(house)), getName(house), makeSettings(rot), pos);
         this.move(-this.boundingBox.getXSpan() / 2, 0, -this.boundingBox.getZSpan() / 2);
         this.tree = house >= 1 && house <= 5 ? null : manager.getOrCreate(Identifier.fromNamespaceAndPath("swgc", "ewok_village/ewok_shaman_tree"));

         for (StructureBlockInfo info : this.template.filterBlocks(this.templatePosition, this.placeSettings, Blocks.STRUCTURE_BLOCK)) {
            if (info.nbt() != null) {
               StructureMode mode = info.nbt().read("mode", StructureMode.LEGACY_CODEC).orElseThrow();
               if (mode == StructureMode.DATA) {
                  String metadata = info.nbt().getStringOr("metadata", "");
                  if (metadata.startsWith("bridge_")) {
                     Direction direction = this.getRotation().rotate(Direction.valueOf(metadata.substring(7).toUpperCase()));
                     this.bridges.put(direction, info.pos().relative(direction));
                  }
               }
            }
         }
      }

      public EwokHousePiece(StructureTemplateManager manager, CompoundTag tag) {
         super((StructurePieceType)SwgcStructures.EWOK_HOUSE.get(), tag, manager, path -> makeSettings(Rotation.valueOf(tag.getStringOr("Rot", "NONE"))));
         this.tree = this.templateName.equals("ewok_village/ewok_shaman_house")
            ? manager.getOrCreate(Identifier.fromNamespaceAndPath("swgc", "ewok_village/ewok_shaman_tree"))
            : null;

         for (Direction direction : Plane.HORIZONTAL) {
            BlockPos bridgePos = EwokVillagePieces.getBlockPos(tag, direction.getName());
            if (bridgePos != null) {
               this.bridges.put(direction, bridgePos);
            }
         }
      }

      @Override
      protected Identifier makeTemplateLocation() {
         return Identifier.fromNamespaceAndPath("swgc", this.templateName);
      }

      private static String getName(int house) {
         return house >= 1 && house <= 5 ? "ewok_village/ewok_house_" + house : "ewok_village/ewok_shaman_house";
      }

      private static StructurePlaceSettings makeSettings(Rotation rot) {
         return new StructurePlaceSettings().setRotation(rot).addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR);
      }

      @Override
      protected void addAdditionalSaveData(StructurePieceSerializationContext ctx, CompoundTag tag) {
         super.addAdditionalSaveData(ctx, tag);
         tag.putString("Rot", this.placeSettings.getRotation().name());
         this.bridges.forEach((direction, bridgePos) -> EwokVillagePieces.putBlockPos(tag, direction.getName(), bridgePos));
      }

      @Override
      protected void handleDataMarker(String dataMarker, BlockPos blockPos, ServerLevelAccessor lvl, RandomSource randomSource, BoundingBox boundingBox) {
         switch (dataMarker) {
            case "pot":
               lvl.setBlock(blockPos, Blocks.DECORATED_POT.defaultBlockState(), 2);
               break;
            case "ewok":
               EwokVillagePieces.spawn(SwgcEntities.EWOK.get(), lvl, blockPos);
               break;
            case "shaman":
               EwokVillagePieces.spawn(SwgcEntities.EWOK_SHAMAN.get(), lvl, blockPos);
               break;
            case "shaman_tree":
               lvl.setBlock(blockPos, Blocks.OAK_LOG.defaultBlockState(), 2);
               if (this.tree != null) {
                  BlockPos treePos = blockPos.offset(-5, 1, -6);
                  StructurePlaceSettings settings = new StructurePlaceSettings();
                  this.boundingBox.encapsulate(this.tree.getBoundingBox(settings, treePos));
                  this.tree.placeInWorld(lvl, treePos, treePos, settings, randomSource, 2);
               }
               break;
            default:
               if (dataMarker.startsWith("bridge_")) {
                  Direction direction = this.getRotation().rotate(Direction.valueOf(dataMarker.substring(7).toUpperCase()));
                  boolean genLadder = this.bridges.containsKey(direction);
                  lvl.setBlock(
                     blockPos, Blocks.SPRUCE_FENCE_GATE.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, direction)
                        .setValue(FenceGateBlock.OPEN, genLadder),
                     2
                  );
                  updateFence(lvl, blockPos, direction.getClockWise());
                  updateFence(lvl, blockPos, direction.getCounterClockWise());
                  if (this.bridges.containsKey(direction)) {
                     MutableBlockPos ladders = this.bridges.get(direction).below().mutable();
                     MutableBlockPos trapdoors = ladders.relative(direction.getOpposite()).mutable();
                     BlockState ladder = Blocks.LADDER.defaultBlockState().setValue(LadderBlock.FACING, direction);
                     BlockState trapdoor = Blocks.SPRUCE_TRAPDOOR
                           .defaultBlockState()
                           .setValue(HorizontalDirectionalBlock.FACING, direction.getOpposite())
                        .setValue(TrapDoorBlock.OPEN, true);
                     lvl.setBlock(trapdoors, Blocks.SPRUCE_PLANKS.defaultBlockState(), 2);
                     lvl.setBlock(ladders, ladder, 2, 3);

                     for (;
                        boundingBox.isInside(trapdoors.move(Direction.DOWN))
                           && boundingBox.isInside(ladders.move(Direction.DOWN))
                           && this.isReplaceableByStructures(lvl.getBlockState(ladders));
                        lvl.setBlock(ladders, ladder, 2, 3)
                     ) {
                        if (this.isReplaceableByStructures(lvl.getBlockState(trapdoors))) {
                           lvl.setBlock(trapdoors, trapdoor, 2, 3);
                        }
                     }
                  }
               }
         }
      }

      private static void updateFence(ServerLevelAccessor lv, BlockPos pos, Direction direction) {
         BlockPos fencePos = pos.relative(direction);

         lv.setBlock(fencePos, lv.getBlockState(fencePos).setValue(switch (direction) {
            case net.minecraft.core.Direction.NORTH -> CrossCollisionBlock.SOUTH;
            case net.minecraft.core.Direction.EAST -> CrossCollisionBlock.WEST;
            case net.minecraft.core.Direction.WEST -> CrossCollisionBlock.EAST;
            default -> CrossCollisionBlock.NORTH;
         }, true), 2);
      }

      @Override
      public void postProcess(
         WorldGenLevel lv, StructureManager structureManager, ChunkGenerator generator, RandomSource random, BoundingBox box, ChunkPos chunkPos, BlockPos pos
      ) {
         if (this.bridges.size() > 1) {
            if (this.bridges.size() <= 2 && !((double)random.nextFloat() < 0.1)) {
               this.bridges.clear();
            } else {
               Entry<Direction, BlockPos> entry = List.copyOf(this.bridges.entrySet()).get(random.nextInt(this.bridges.size()));
               this.bridges.clear();
               this.bridges.put(entry.getKey(), entry.getValue());
            }
         }

         super.postProcess(lv, structureManager, generator, random, box, chunkPos, pos);

         for (int x = 0; x < this.template.getSize().getX(); x++) {
            for (int z = 0; z < this.template.getSize().getZ(); z++) {
               BlockState state = lv.getBlockState(this.getWorldPos(x, 0, z));
               if (!state.isAir()) {
                  this.fillColumnDown(lv, state, x, -1, z, box);
               }
            }
         }
      }

      public void fillOpenings(StructurePiece piece, StructurePiecesBuilder pieces, RandomSource random) {
         EwokVillagePieces.EwokHousePiece house = (EwokVillagePieces.EwokHousePiece)piece;
         Direction direction = null;
         float f = Float.MAX_VALUE;

         for (Direction direction1 : Plane.HORIZONTAL) {
            if (this.bridges.containsKey(direction1)) {
               BlockPos relative = house.bridges.get(direction1.getOpposite()).subtract((Vec3i)this.bridges.get(direction1));
               int distance = relative.get(direction1.getAxis());
               if (Mth.sign((double)distance) == direction1.getAxisDirection().getStep()
                  && Math.abs(relative.getY()) <= Math.abs(distance)) {
                  float f1 = Math.abs((float)relative.get(direction1.getClockWise().getAxis()) / (float)distance);
                  if (f1 < f) {
                     f = f1;
                     direction = direction1;
                  }
               }
            }
         }

         if (direction != null) {
            int depth = house.getGenDepth();
            house.setGenDepth(depth + 1);
            pieces.addPiece(new EwokVillagePieces.BridgePiece(depth, direction, this, house));
            this.bridges.remove(direction);
            house.bridges.remove(direction.getOpposite());
         }

         pieces.addPiece(house);
      }
   }

   public static class SimpleEwokHousePiece extends TemplateStructurePiece {
      public SimpleEwokHousePiece(int depth, StructureTemplateManager manager, int house, BlockPos pos) {
         super((StructurePieceType)SwgcStructures.EWOK_HOUSE.get(), depth, manager, Identifier.fromNamespaceAndPath("swgc", getName(house)), getName(house), makeSettings(), pos);
      }

      public SimpleEwokHousePiece(StructureTemplateManager manager, CompoundTag tag) {
         super((StructurePieceType)SwgcStructures.EWOK_HOUSE.get(), tag, manager, path -> makeSettings());
      }

      @Override
      protected Identifier makeTemplateLocation() {
         return Identifier.fromNamespaceAndPath("swgc", this.templateName);
      }

      private static String getName(int house) {
         return house >= 1 && house <= 5 ? "ewok_village/ewok_house_" + house : "ewok_village/ewok_shaman_house";
      }

      private static StructurePlaceSettings makeSettings() {
         return new StructurePlaceSettings().addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR);
      }

      @Override
      protected void handleDataMarker(String s, BlockPos blockPos, ServerLevelAccessor serverLevelAccessor, RandomSource randomSource, BoundingBox boundingBox) {
      }

      @Override
      public void postProcess(
         WorldGenLevel level, StructureManager structureManager, ChunkGenerator generator, RandomSource random, BoundingBox box, ChunkPos chunkPos, BlockPos pos
      ) {
         super.postProcess(level, structureManager, generator, random, box, chunkPos, pos);
      }
   }
}
