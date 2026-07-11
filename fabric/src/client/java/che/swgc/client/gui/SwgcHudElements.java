package che.swgc.client.gui;

import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.minecraft.resources.Identifier;

public final class SwgcHudElements {
   private SwgcHudElements() {
   }

   public static void register() {
   }

   public static final class EVENT {
      public static void register(SwgcHudElement handler) {
         HudElementRegistry.attachElementAfter(
            VanillaHudElements.HOTBAR,
            Identifier.fromNamespaceAndPath("swgc", "mod_gui"),
            (extractor, tickCounter) -> handler.render(extractor, tickCounter.getGameTimeDeltaPartialTick(false))
         );
      }
   }

   @FunctionalInterface
   public interface SwgcHudElement {
      void render(net.minecraft.client.gui.GuiGraphicsExtractor extractor, float tickDelta);
   }
}
