package che.swgc.mixin;

import che.swgc.client.SwgcSplashManager;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.gui.components.SplashRenderer;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public abstract class MixinTitleScreen {
   @Shadow
   private @Nullable SplashRenderer splash;

   @Inject(method = "init", at = @At("TAIL"))
   private void swgc$customSplash(CallbackInfo ci) {
      List<String> splashes = SwgcSplashManager.INSTANCE.getSplashes();
      if (!splashes.isEmpty() && ThreadLocalRandom.current().nextBoolean()) {
         String line = splashes.get(ThreadLocalRandom.current().nextInt(splashes.size()));
         this.splash = new SplashRenderer(Component.literal(line));
      }
   }
}
