package che.swgc.mixin;

import che.swgc.client.SwgcHooksClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MouseHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MouseHandler.class)
public class FabricMixinMouseHandler {
   @Inject(method = "onScroll", at = @At("HEAD"), cancellable = true)
   private void swgc$onScroll(long window, double horizontal, double vertical, CallbackInfo ci) {
      if (vertical == 0.0) {
         return;
      }

      Minecraft minecraft = Minecraft.getInstance();
      if (minecraft.player == null || minecraft.player.isSpectator()) {
         return;
      }

      int direction = vertical > 0.0 ? -1 : 1;
      if (SwgcHooksClient.mouseScroll(vertical, direction)) {
         ci.cancel();
      }
   }
}
