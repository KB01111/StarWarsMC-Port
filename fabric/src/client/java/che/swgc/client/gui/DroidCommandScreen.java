package che.swgc.client.gui;

import che.swgc.entity.CommandableMob;
import che.swgc.network.MobCommandPacket;
import che.swgc.reg.SwgcNetworking;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.ingame.InventoryScreen;
import net.minecraft.screen.ScreenTexts;

public class DroidCommandScreen extends net.minecraft.client.gui.screens.Screen {
   private final CommandableMob mob;
   private CommandableMob.Command command;

   public DroidCommandScreen(CommandableMob mob) {
      super(mob.getScreenTitle());
      this.mob = mob;
      this.command = mob.getCommand();
   }

   protected void init() {
      super.init();
      this.addDrawableChild(net.minecraft.client.gui.widget.ButtonWidget.builder(net.minecraft.network.chat.Component.translatable("gui.swgc.command", new Object[]{this.command.getComponent()}), button -> {
         CommandableMob.Command[] commands = CommandableMob.Command.values();
         this.command = commands[this.command.ordinal() == commands.length - 1 ? 0 : this.command.ordinal() + 1];
         button.setMessage(net.minecraft.network.chat.Component.translatable("gui.swgc.command", new Object[]{this.command.getComponent()}));
      }).dimensions(this.width / 2, 32, 160, 20).build());
      this.addDrawableChild(
         net.minecraft.client.gui.widget.ButtonWidget.builder(
               net.minecraft.screen.ScreenTexts.DONE,
               button -> {
                  SwgcNetworking.sendToServer(
                     new MobCommandPacket(
                        this.mob.getId(), this.command, Objects.requireNonNull(this.client).getLanguageManager().getLanguage().equals("ru_ru")
                     )
                  );
                  this.close();
               }
            )
            .dimensions(this.width / 2, 60, 79, 20)
            .build()
      );
      this.addDrawableChild(
         net.minecraft.client.gui.widget.ButtonWidget.builder(net.minecraft.screen.ScreenTexts.CANCEL, button -> this.close()).dimensions(this.width / 2 + 81, 60, 79, 20).build()
      );
   }

   public void render(net.minecraft.client.gui.GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
      this.renderBackground(guiGraphics);
      int x = this.width / 2 - 64;
      net.minecraft.client.gui.screens.ingame.InventoryScreen.drawEntity(guiGraphics, x, 192, (int)(128.0F / this.mob.getHeight()), (float)(x - mouseX), (float)(160 - mouseY), this.mob);
      guiGraphics.drawCenteredTextWithShadow(this.textRenderer, this.getTitle(), this.width / 2, 20, -1);
      super.render(guiGraphics, mouseX, mouseY, partialTick);
   }
}
