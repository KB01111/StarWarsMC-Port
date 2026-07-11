package che.swgc.block.entity;

import che.swgc.block.GasHarvesterBlock;
import che.swgc.reg.SwgcBlockEntities;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class GasHarvesterBlockEntity extends net.minecraft.world.level.block.entity.BlockEntity {
   protected int harvestTicks;

   public GasHarvesterBlockEntity(net.minecraft.world.level.block.entity.BlockEntityType<?> type, net.minecraft.core.BlockPos pos, net.minecraft.world.level.block.state.BlockState state) {
      super(type, pos, state);
   }

   public GasHarvesterBlockEntity(net.minecraft.core.BlockPos pos, net.minecraft.world.level.block.state.BlockState state) {
      this(SwgcBlockEntities.GAS_HARVESTER.get(), pos, state);
   }

   protected int doneTicks() {
      return 400;
   }

   public static void tick(net.minecraft.world.level.Level lvl, net.minecraft.core.BlockPos pos, net.minecraft.world.level.block.state.BlockState state, GasHarvesterBlockEntity blockEntity) {
      if (state.getValue(GasHarvesterBlock.VESSEL_STATE) == GasHarvesterBlock.VesselState.EMPTY && ++blockEntity.harvestTicks >= blockEntity.doneTicks()) {
         blockEntity.harvestTicks = 0;
         lvl.setBlock(pos, state.setValue(GasHarvesterBlock.VESSEL_STATE, GasHarvesterBlock.VesselState.FILLED), 3);
      }
   }

   public float getHarvestProgress(float partialTick) {
      return ((float)this.harvestTicks + partialTick) / (float)this.doneTicks();
   }

   protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput tag) {
      tag.putInt("HarvestTicks", this.harvestTicks);
   }
}
