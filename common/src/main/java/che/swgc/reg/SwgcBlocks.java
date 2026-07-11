package che.swgc.reg;

import che.swgc.block.GasHarvesterBlock;
import che.swgc.platform.Services;
import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;

public class SwgcBlocks {
   public static final Supplier<GasHarvesterBlock> GAS_HARVESTER;

   public SwgcBlocks() {
   }

   public static void init() {
   }

   static {
      IRegister register = Services.REGISTERS.blocks();
      GAS_HARVESTER = register.register("gas_harvester", GasHarvesterBlock::new);
   }
}
