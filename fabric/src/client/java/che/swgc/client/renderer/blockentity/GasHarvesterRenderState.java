package che.swgc.client.renderer.blockentity;

import che.swgc.block.GasHarvesterBlock;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;

public class GasHarvesterRenderState extends BlockEntityRenderState {
   public GasHarvesterBlock.VesselState vesselState = GasHarvesterBlock.VesselState.ABSENT;
   public Direction facing = Direction.NORTH;
   public ItemStack vesselItem = ItemStack.EMPTY;
}
