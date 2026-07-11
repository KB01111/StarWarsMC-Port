package che.swgc.mixin;

import che.swgc.client.SwgcOptions;
import net.minecraft.client.GameOptions;
import net.minecraft.client.gui.screens.option.VideoOptionsScreen;
import net.minecraft.client.SimpleOption;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({net.minecraft.client.gui.screens.option.VideoOptionsScreen.class})
public class FabricMixinVideoSettingsScreen {
   public FabricMixinVideoSettingsScreen() {
   }

   @Inject(
      method = {"options"},
      at = {@At("TAIL")},
      cancellable = true
   )
   private static void options(net.minecraft.client.GameOptions options, CallbackInfoReturnable<net.minecraft.client.SimpleOption<?>[]> cir) {
      net.minecraft.client.SimpleOption[] vanilla = (net.minecraft.client.SimpleOption<?>[])cir.getReturnValue();
      net.minecraft.client.SimpleOption[] ret = new net.minecraft.client.SimpleOption[vanilla.length + 1];
      System.arraycopy(vanilla, 0, ret, 0, vanilla.length);
      ret[vanilla.length] = SwgcOptions.getInstance().lightsaberDetailing;
      cir.setReturnValue(ret);
   }
}
