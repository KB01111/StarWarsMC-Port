package che.swgc.mixin;

import che.swgc.entity.StarFighter;
import che.swgc.item.BlasterItem;
import net.minecraft.client.Mouse;
import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({net.minecraft.client.Mouse.class})
public class MixinMouseHandler {
   public MixinMouseHandler() {
   }

   @Redirect(
      method = {"turnPlayer"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/player/LocalPlayer;turn(DD)V"
      )
   )
   public void turn(net.minecraft.client.player.LocalPlayer instance, double yRot, double xRot) {
      if (instance.getVehicle() instanceof StarFighter starfighter && Math.abs(starfighter.getZRot()) > 3.0F) {
         double sin = Math.sin((double)starfighter.getZRot() * Math.PI / -180.0);
         double cos = Math.cos((double)starfighter.getZRot() * Math.PI / -180.0);
         instance.changeLookDirection(yRot * cos - xRot * sin, xRot * cos + yRot * sin);
         return;
      }

      if (instance.getMainHandItem().getItem() instanceof BlasterItem blaster && blaster.isAiming(instance.getMainHandItem())) {
         float zoom = blaster.getZoom();
         instance.changeLookDirection((double)zoom * yRot, (double)zoom * xRot);
         return;
      }

      instance.changeLookDirection(yRot, xRot);
   }
}
