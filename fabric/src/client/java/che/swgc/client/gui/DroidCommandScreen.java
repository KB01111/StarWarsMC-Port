package che.swgc.client.gui;

import che.swgc.entity.CommandableMob;
import che.swgc.network.MobCommandPacket;
import che.swgc.reg.SwgcNetworking;
import java.util.Objects;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;

public class DroidCommandScreen extends Screen {
   private final CommandableMob mob;
   private CommandableMob.Command command;

   public DroidCommandScreen(CommandableMob mob) {
      super(mob.getScreenTitle());
      this.mob = mob;
      this.command = mob.getCommand();
   }

   @Override
   protected void init() {
      super.init();
      this.addRenderableWidget(Button.builder(Component.translatable("gui.swgc.command", this.command.getComponent()), button -> {
         CommandableMob.Command[] commands = CommandableMob.Command.values();
         this.command = commands[this.command.ordinal() == commands.length - 1 ? 0 : this.command.ordinal() + 1];
         button.setMessage(Component.translatable("gui.swgc.command", this.command.getComponent()));
      }).bounds(this.width / 2, 32, 160, 20).build());
      this.addRenderableWidget(
         Button.builder(
               CommonComponents.GUI_DONE,
               button -> {
                  SwgcNetworking.sendToServer(
                     new MobCommandPacket(
                        this.mob.getId(), this.command, Objects.requireNonNull(this.minecraft).getLanguageManager().getSelected().equals("ru_ru")
                     )
                  );
                  this.onClose();
               }
            )
            .bounds(this.width / 2, 60, 79, 20)
            .build()
      );
      this.addRenderableWidget(
         Button.builder(CommonComponents.GUI_CANCEL, button -> this.onClose()).bounds(this.width / 2 + 81, 60, 79, 20).build()
      );
   }

   @Override
   public void extractRenderState(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTick) {
      this.extractBackground(guiGraphics, mouseX, mouseY, partialTick);
      int x = this.width / 2 - 64;
      InventoryScreen.extractEntityInInventoryFollowsMouse(guiGraphics, x, 192, x + 128, 320, (int)(128.0F / this.mob.getBbHeight()), 0.0625F, mouseX, mouseY, this.mob);
      guiGraphics.centeredText(this.font, this.getTitle(), this.width / 2, 20, -1);
      super.extractRenderState(guiGraphics, mouseX, mouseY, partialTick);
   }
}
