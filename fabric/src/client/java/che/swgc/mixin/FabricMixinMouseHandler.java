package che.swgc.mixin;

import che.swgc.client.SwgcHooksClient;
import net.minecraft.client.MouseHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({net.minecraft.client.MouseHandler.class})
public class FabricMixinMouseHandler {
   public FabricMixinMouseHandler() {
   }

   @Inject(
      method = {"onScroll"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/player/LocalPlayer;isSpectator()Z"
      )},
      locals = LocalCapture.CAPTURE_FAILHARD,
      cancellable = true
   )
   private void onScroll(long l, double d, double e, CallbackInfo ci, double f, int i) {
      if (SwgcHooksClient.mouseScroll(f, i)) {
         ci.cancel();
      }
   }
}
