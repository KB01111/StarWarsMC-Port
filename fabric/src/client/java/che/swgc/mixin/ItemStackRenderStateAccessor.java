package che.swgc.mixin;

import net.minecraft.world.item.ItemDisplayContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.renderer.item.ItemStackRenderState;

@Mixin(ItemStackRenderState.class)
public interface ItemStackRenderStateAccessor {
   @Accessor("displayContext")
   ItemDisplayContext swgc$getDisplayContext();
}
