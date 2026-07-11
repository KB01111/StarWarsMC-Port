package che.swgc.mixin;

import che.swgc.client.SwgcOptions;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import net.minecraft.client.gui.screens.options.VideoSettingsScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VideoSettingsScreen.class)
public class FabricMixinVideoSettingsScreen {
   @Inject(method = "qualityOptions", at = @At("TAIL"), cancellable = true)
   private static void swgc$qualityOptions(Options options, CallbackInfoReturnable<OptionInstance<?>[]> cir) {
      OptionInstance<?>[] vanilla = cir.getReturnValue();
      OptionInstance<?>[] ret = new OptionInstance[vanilla.length + 1];
      System.arraycopy(vanilla, 0, ret, 0, vanilla.length);
      ret[vanilla.length] = SwgcOptions.getInstance().lightsaberDetailing;
      cir.setReturnValue(ret);
   }
}
