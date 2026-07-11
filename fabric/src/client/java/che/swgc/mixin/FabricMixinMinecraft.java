package che.swgc.mixin;

import che.swgc.client.SwgcHooksClient;
import che.swgc.force.ForcePossessor;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({net.minecraft.client.Minecraft.class})
public class FabricMixinMinecraft {
   @Shadow
   @Nullable
   public net.minecraft.client.player.LocalPlayer player;

   public FabricMixinMinecraft() {
   }

   @Inject(
      method = {"startUseItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void startUseItem(CallbackInfo ci) {
      if (this.player instanceof ForcePossessor forcePossessor
         && SwgcHooksClient.rmb(this.player, forcePossessor, forcePossessor.swgc$getForceSecondaryAction())) {
         ci.cancel();
      }
   }
}
