package che.swgc.mixin;

import che.swgc.client.SwgcOptions;
import che.swgc.force.ForcePossessor;
import che.swgc.force.ForceSecondaryAction;
import che.swgc.force.LightsaberAttack;
import che.swgc.item.LightsaberItem;
import che.swgc.network.ForceActionPacket;
import che.swgc.reg.SwgcNetworking;
import java.util.Arrays;
import javax.annotation.Nullable;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({net.minecraft.client.Minecraft.class})
public abstract class MixinMinecraft {
   @Shadow
   @Nullable
   public net.minecraft.client.player.LocalPlayer player;

   public MixinMinecraft() {
   }

   @Redirect(
      method = {"handleKeybinds"},
      at = @At(
         value = "FIELD",
         target = "Lnet/minecraft/world/entity/player/Inventory;selected:I"
      )
   )
   private void selected(net.minecraft.world.entity.player.Inventory instance, int value) {
      boolean flag = true;
      if (this.player instanceof ForcePossessor forcePossessor) {
         if (SwgcOptions.getInstance().keyLightsaberAttacks.isDown() && this.player.getMainHandItem().getItem() instanceof LightsaberItem) {
            forcePossessor.swgc$setLightsaberAttack(LightsaberAttack.get(value));
            SwgcNetworking.sendToServer(new ForceActionPacket(forcePossessor.swgc$getLightsaberAttack()));
            flag = false;
         }

         if (SwgcOptions.getInstance().keyForceActions.isDown()) {
            ForceSecondaryAction action = ForceSecondaryAction.get(value, this.player);
            if (action == forcePossessor.swgc$getForceSecondaryAction()) {
               flag = Arrays.stream(ForceSecondaryAction.values()).noneMatch(action1 -> action1.unlocked(this.player));
            } else {
               forcePossessor.swgc$setForceSecondaryAction(action);
               SwgcNetworking.sendToServer(new ForceActionPacket(forcePossessor.swgc$getForceSecondaryAction()));
               flag = false;
            }
         }
      }

      if (flag) {
         instance.selectedSlot = value;
      }
   }
}
