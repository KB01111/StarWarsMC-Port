package che.swgc.levelgen.structure;

import che.swgc.reg.SwgcStructures;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;

@ParametersAreNonnullByDefault
public class EwokVillageStructure extends Structure {
   public static final MapCodec<EwokVillageStructure> CODEC = Structure.simpleCodec(EwokVillageStructure::new);

   protected EwokVillageStructure(StructureSettings settings) {
      super(settings);
   }

   @Override
   protected Optional<GenerationStub> findGenerationPoint(GenerationContext generationContext) {
      return onTopOfChunkCenter(generationContext, Heightmap.Types.WORLD_SURFACE_WG, builder -> this.generatePieces(builder, generationContext));
   }

   protected void generatePieces(StructurePiecesBuilder builder, GenerationContext ctx) {
      ChunkPos chunkPos = ctx.chunkPos();
      int sizeX = chunkPos.getMaxBlockX() - chunkPos.getMinBlockX() + 1;
      int sizeZ = chunkPos.getMaxBlockZ() - chunkPos.getMinBlockZ() + 1;
      BlockPos pos = chunkPos.getMiddleBlockPosition(getLowestY(ctx, sizeX, sizeZ));
      EwokVillagePieces.addPieces(ctx.structureTemplateManager(), pos, builder, ctx.random());
   }

   @Override
   public StructureType<?> type() {
      return SwgcStructures.EWOK_VILLAGE.get();
   }
}
