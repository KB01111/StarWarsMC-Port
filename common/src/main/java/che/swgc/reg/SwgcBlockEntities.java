package che.swgc.reg;

import che.swgc.block.entity.GasHarvesterBlockEntity;
import che.swgc.platform.Services;
import java.util.Arrays;
import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier;

public class SwgcBlockEntities {
   public static final Supplier<net.minecraft.world.level.block.entity.BlockEntityType<GasHarvesterBlockEntity>> GAS_HARVESTER;

   public SwgcBlockEntities() {
   }

   public static void init() {
   }

   private static <T extends net.minecraft.world.level.block.entity.BlockEntity> Supplier<net.minecraft.world.level.block.entity.BlockEntityType<T>> reg(
      IRegister<net.minecraft.world.level.block.entity.BlockEntityType<?>> register, String name, net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier<T> factory, Supplier<? extends net.minecraft.world.level.block.Block>... blocks
   ) {
      return register.register(
         name, () -> new net.minecraft.world.level.block.entity.BlockEntityType<>(factory, java.util.Set.of(Arrays.stream(blocks).map(Supplier::get).toArray(net.minecraft.world.level.block.Block[]::new)))
      );
   }

   static {
      IRegister register = Services.REGISTERS.blockEntities();
      GAS_HARVESTER = reg(register, "gas_harvester", GasHarvesterBlockEntity::new, SwgcBlocks.GAS_HARVESTER);
   }
}
