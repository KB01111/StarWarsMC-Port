package che.swgc.client.gui;

import che.swgc.force.ForceAction;
import che.swgc.force.ForcePossessor;
import che.swgc.force.ForceSecondaryAction;
import che.swgc.force.LightsaberAttack;
import che.swgc.item.BlasterItem;
import che.swgc.item.LightsaberItem;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class ModGui {
   private static final Identifier FORCE_ICONS_LOCATION = Identifier.fromNamespaceAndPath("swgc", "textures/gui/force_icons.png");
   private static final Component BLASTER_CHARGE = Component.translatable("gui.swgc.blaster.charge");

   public ModGui() {
   }

   public static void renderForceHotbar(LocalPlayer player, GuiGraphicsExtractor graphics, int screenWidth, int screenHeight) {
      if (player instanceof ForcePossessor forcePossessor) {
         if (player.getMainHandItem().getItem() instanceof LightsaberItem) {
            renderSingleForceBar(
               graphics,
               forcePossessor.swgc$getLightsaberAttack(),
               LightsaberAttack.values(),
               screenWidth / 2 - 113 - LightsaberAttack.values().length * 20,
               screenHeight - 22,
               22,
               true
            );
         }

         ForceSecondaryAction[] actions = ForceSecondaryAction.getAllUnlocked(player);
         if (actions.length > 0) {
            renderSingleForceBar(graphics, forcePossessor.swgc$getForceSecondaryAction(), actions, screenWidth / 2 + 91, screenHeight - 22, 38, false);
         }
      }
   }

   private static void renderSingleForceBar(GuiGraphicsExtractor graphics, ForceAction action, ForceAction[] actions, int x, int y, int iconY, boolean renderEmpty) {
      int chosenX = 0;

      for (int i = 0; i < actions.length; i++) {
         if (action == actions[i]) {
            chosenX = x + i * 20;
         } else if (i == 0) {
            blitRegion(graphics, x, y, actions[i].getFrame() * 22, 0, 21, 22);
         } else {
            blitRegion(graphics, x + i * 20 + 1, y, actions[i].getFrame() * 22 + 1, 0, 20, 22);
         }
      }

      if (action == null) {
         blitRegion(graphics, x + actions.length * 20, y, 0, 0, 22, 22);
      } else {
         blitRegion(graphics, x + actions.length * 20 + 1, y, 23, 0, 21, 22);
         blitRegion(graphics, chosenX, y, 0, 0, 22, 22);
      }

      x += 3;
      y += 3;

      for (ForceAction action1 : actions) {
         blitRegion(graphics, x, y, ((Enum<?>)action1).ordinal() * 16, iconY, 16, 16);
         x += 20;
      }

      if (renderEmpty) {
         blitRegion(graphics, x, y, LightsaberAttack.values().length * 16, 22, 16, 16);
      }
   }

   private static void blitRegion(GuiGraphicsExtractor graphics, int x, int y, int u, int v, int width, int height) {
      graphics.blit(FORCE_ICONS_LOCATION, x, y, width, height, u, v, width, height);
   }

   public static void renderBlasterCharge(GuiGraphicsExtractor graphics, net.minecraft.world.entity.player.Player player, Font font) {
      if (player.getMainHandItem().getItem() instanceof BlasterItem blaster) {
         int ammo = blaster.getAmmo(player.getMainHandItem());
         int empty = blaster.maxAmmo - ammo;
         graphics.text(font, BLASTER_CHARGE, 1, 1, blaster.boltColor, false);

         int y;
         for (y = 1; ammo >= 10; ammo -= 10) {
            graphics.text(font, che.swgc.SwgcComponents.FULL_LINE, 1, y += 9, blaster.boltColor, false);
         }

         if (ammo > 0) {
            graphics.text(
               font,
               che.swgc.SwgcComponents.repeatedNTimes(che.swgc.SwgcComponents.FULL_UNIT, ammo)
                  .append(che.swgc.SwgcComponents.repeatedNTimes(che.swgc.SwgcComponents.EMPTY_UNIT, Math.min(empty, 10 - ammo))),
               1,
               y += 9,
               blaster.boltColor,
               false
            );
            empty += ammo - 10;
         }

         while (empty >= 10) {
            graphics.text(font, che.swgc.SwgcComponents.EMPTY_LINE, 1, y += 9, blaster.boltColor, false);
            empty -= 10;
         }

         if (empty > 0) {
            graphics.text(font, che.swgc.SwgcComponents.repeatedNTimes(che.swgc.SwgcComponents.EMPTY_UNIT, empty), 1, y + 9, blaster.boltColor, false);
         }
      }
   }
}
