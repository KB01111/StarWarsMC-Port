package che.swgc.mixin;

import che.swgc.item.BlasterItem;
import com.mojang.authlib.GameProfile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({net.minecraft.client.player.LocalPlayer.class})
public abstract class FabricMixinAbstractClientPlayer extends net.minecraft.world.entity.player.Player {
   private FabricMixinAbstractClientPlayer(net.minecraft.world.level.Level level, GameProfile gameProfile) {
      super(level, gameProfile);
   }

   @Inject(
      method = {"getFieldOfViewModifier"},
      at = {@At("TAIL")},
      cancellable = true
   )
   public void getFieldOfViewModifier(CallbackInfoReturnable<Float> cir) {
      net.minecraft.world.item.ItemStack stack = this.getMainHandItem();
      if (stack.getItem() instanceof BlasterItem blaster && blaster.isAiming(stack)) {
         cir.setReturnValue(cir.getReturnValueF() * blaster.getZoom());
      }
   }
}
