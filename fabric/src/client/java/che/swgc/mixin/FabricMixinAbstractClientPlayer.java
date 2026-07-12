package che.swgc.mixin;

import che.swgc.item.BlasterItem;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayer.class)
public class FabricMixinAbstractClientPlayer {
   @Inject(method = "getFieldOfViewModifier", at = @At("RETURN"), cancellable = true)
   private void swgc$blasterZoom(boolean firstPerson, float effectScale, CallbackInfoReturnable<Float> cir) {
      AbstractClientPlayer player = (AbstractClientPlayer)(Object)this;
      ItemStack stack = player.getMainHandItem();
      if (stack.getItem() instanceof BlasterItem blaster && blaster.isAiming(stack)) {
         cir.setReturnValue(cir.getReturnValueF() * blaster.getZoom());
      }
   }
}
