package che.swgc.reg;

import che.swgc.levelgen.structure.EwokVillagePieces;
import che.swgc.levelgen.structure.EwokVillageStructure;
import che.swgc.platform.Services;
import java.util.function.Supplier;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType.ContextlessType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType.StructureTemplateType;

public class SwgcStructures {
   public static final Supplier<StructureType<EwokVillageStructure>> EWOK_VILLAGE;
   public static final Supplier<StructureTemplateType> EWOK_HOUSE;
   public static final Supplier<ContextlessType> EWOK_BRIDGE;

   public SwgcStructures() {
   }

   public static void init() {
   }

   static {
      IRegister<StructureType<?>> structures = Services.REGISTERS.structures();
      EWOK_VILLAGE = structures.register("ewok_village", () -> (StructureType<EwokVillageStructure>)() -> EwokVillageStructure.CODEC);
      IRegister<StructurePieceType> types = Services.REGISTERS.structurePieces();
      EWOK_HOUSE = types.register("evh", () -> (StructureTemplateType)EwokVillagePieces.EwokHousePiece::new);
      EWOK_BRIDGE = types.register("evb", () -> (ContextlessType)EwokVillagePieces.BridgePiece::new);
   }
}
