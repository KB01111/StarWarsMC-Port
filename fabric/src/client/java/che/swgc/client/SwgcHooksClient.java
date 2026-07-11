package che.swgc.client;

import che.swgc.force.ForcePossessor;
import che.swgc.force.ForceSecondaryAction;
import che.swgc.platform.Services;
import che.swgc.force.LightsaberAttack;
import che.swgc.item.BlasterItem;
import che.swgc.item.CustomArmorItem;
import che.swgc.item.LightsaberItem;
import che.swgc.network.ForceActionPacket;
import che.swgc.network.ForceSecondaryActionPacket;
import che.swgc.network.SimpleSwgcActionPacket;
import che.swgc.reg.SwgcNetworking;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

@ParametersAreNonnullByDefault
public class SwgcHooksClient {
   public SwgcHooksClient() {
   }

   public static void forcePossessorTick() {
      Player player = Minecraft.getInstance().player;
      if (player instanceof ForcePossessor forcePossessor
         && (
            forcePossessor.isLightsaberAttacking() && !Minecraft.getInstance().options.keyAttack.isDown()
               || forcePossessor.isUsingForce() && !Services.CLIENT.isSecondaryActionInputDown(Objects.requireNonNull(forcePossessor.swgc$getForceSecondaryAction()))
         )) {
         forcePossessor.swgc$stopAllForceActions();
         SwgcNetworking.sendToServer(new SimpleSwgcActionPacket(1));
      }
   }

   public static boolean preRenderLiving(EntityModel<?> model, LivingEntity entity, PoseStack poseStack, float partialTick) {
      if (model instanceof PlayerModel playerModel) {
         updatePartVisibility(entity.getItemBySlot(EquipmentSlot.HEAD).getItem(), 0, playerModel.head, playerModel.hat);
         Item item = entity.getItemBySlot(EquipmentSlot.CHEST).getItem();
         updatePartVisibility(item, 2, playerModel.body, playerModel.jacket);
         updatePartVisibility(item, 4, playerModel.rightArm, playerModel.rightSleeve);
         updatePartVisibility(item, 6, playerModel.leftArm, playerModel.leftSleeve);
         item = entity.getItemBySlot(EquipmentSlot.LEGS).getItem();
         updatePartVisibility(item, 8, playerModel.rightLeg, playerModel.rightPants);
         updatePartVisibility(item, 10, playerModel.leftLeg, playerModel.leftPants);
      }

      return false;
   }

   private static void updatePartVisibility(Item item, int partId, ModelPart part, ModelPart overlay) {
      if (item instanceof CustomArmorItem armor) {
         part.visible = armor.shouldRenderPlayerPart(partId);
         if (overlay.visible) {
            overlay.visible = armor.shouldRenderPlayerPart(partId + 1);
         }
      } else {
         part.visible = true;
      }
   }

   public static boolean applyLightsaberTransform(ForcePossessor forcePossessor, HumanoidArm arm, PoseStack poseStack, float partialTick, float equipProcess) {
      if (forcePossessor.isLightsaberAttacking() && forcePossessor.swgc$getLightsaberAttack() == LightsaberAttack.OBI_ANI) {
         poseStack.translate(arm == HumanoidArm.RIGHT ? 0.56F : -0.56F, -0.4F, -0.72F);
         poseStack.mulPose(Axis.XP.rotationDegrees(((float)forcePossessor.swgc$getForceTicks() + partialTick) * -72.0F));
         poseStack.translate(0.0F, -0.12F, 0.0F);
         return true;
      } else if (forcePossessor.isUsingForce() && forcePossessor.swgc$getForceSecondaryAction() == ForceSecondaryAction.BLOCK) {
         poseStack.translate(arm == HumanoidArm.RIGHT ? 0.56F : -0.56F, -0.52F - equipProcess * 0.6F, -0.72F);
         poseStack.mulPose(Axis.ZP.rotationDegrees(arm == HumanoidArm.RIGHT ? 60.0F : -60.0F));
         return true;
      } else {
         return false;
      }
   }

   public static void applyBlasterTransform(PoseStack poseStack, HumanoidArm arm, float swingProcess) {
      float sin = Mth.sin(swingProcess * (float)Math.PI);
      poseStack.translate(arm == HumanoidArm.RIGHT ? 0.56F : -0.56F, -0.52F, -0.72F + sin * 0.4F);
      poseStack.mulPose(Axis.XP.rotationDegrees((swingProcess > 0.5F ? 2.0F - 2.0F * swingProcess : sin) * 15.0F));
   }

   public static boolean lmb(Player player, ForcePossessor forcePossessor, @Nullable ForceSecondaryAction action) {
      if (player.isSpectator()) {
         return false;
      } else if (forcePossessor.isUsingForce()) {
         return true;
      } else {
         int[] data;
         if (action != null && action.lmb && (data = action.getData(player, false)) != null) {
            forcePossessor.swgc$stopAllForceActions();
            forcePossessor.swgc$setForceSecondaryActionData(data);
            forcePossessor.swgc$setForceTicks(0);
            SwgcNetworking.sendToServer(new ForceSecondaryActionPacket(data));
            return true;
         } else {
            ItemStack stack = player.getMainHandItem();
            if (forcePossessor.swgc$getLightsaberAttack() != null
               && !forcePossessor.isLightsaberAttacking()
               && !player.isUsingItem()
               && LightsaberItem.isActive(stack)
               && player.level().getGameTime() - LightsaberItem.getActivatedTick(stack) >= 4L) {
               forcePossessor.startLightsaberAttacking();
               SwgcNetworking.sendToServer(new SimpleSwgcActionPacket(0));
               return true;
            } else {
               stack = player.getMainHandItem();
               if (stack.getItem() instanceof BlasterItem blaster && blaster.canShoot(player, stack)) {
                  SwgcNetworking.sendToServer(new SimpleSwgcActionPacket(-128));
               }

               return false;
            }
         }
      }
   }

   public static boolean rmb(Player player, ForcePossessor forcePossessor, @Nullable ForceSecondaryAction action) {
      if (player.isSpectator()) {
         return false;
      } else if (forcePossessor.isUsingForce()) {
         return true;
      } else {
         int[] data;
         if (action != null && action.rmb && !forcePossessor.isUsingForce() && (data = action.getData(player, true)) != null) {
            forcePossessor.swgc$stopAllForceActions();
            forcePossessor.swgc$setForceSecondaryActionData(data);
            forcePossessor.swgc$setForceTicks(0);
            SwgcNetworking.sendToServer(new ForceSecondaryActionPacket(data));
            return true;
         } else {
            return false;
         }
      }
   }

   public static void handleKeys() {
      Player player = Minecraft.getInstance().player;
      if (player != null) {
         ItemStack stack = player.getMainHandItem();
         if (SwgcOptions.getInstance().keyRecharge.consumeClick()
            && stack.getItem() instanceof BlasterItem blasterItem
            && blasterItem.getAmmo(stack) < blasterItem.maxAmmo
            && BlasterItem.findAmmo(player.getInventory()) != null) {
            SwgcNetworking.sendToServer(new SimpleSwgcActionPacket(-127));
         }
      }
   }

   public static boolean mouseScroll(double scroll, int direction) {
      Player player = Minecraft.getInstance().player;
      if (player instanceof ForcePossessor forcePossessor) {
         if (forcePossessor.isUsingForce()) {
            int[] data = Objects.requireNonNull(forcePossessor.swgc$getForceSecondaryActionData());
            if (data.length == 2) {
               int max = forcePossessor.swgc$getForceSecondaryAction() == ForceSecondaryAction.TELEKINESIS
                  ? 32
                  : (forcePossessor.swgc$getForceSecondaryAction() == ForceSecondaryAction.UNLIMITED_POWER && data[1] != 0 ? 15 : 0);
               if (max != 0) {
                  data[1] = Mth.clamp(data[1] + Mth.ceil(scroll * 2.0), 2, max);
                  SwgcNetworking.sendToServer(new ForceSecondaryActionPacket(forcePossessor.swgc$getForceSecondaryActionData()));
                  return true;
               }
            }
         } else {
            if (SwgcOptions.getInstance().keyLightsaberAttacks.isDown() && player.getMainHandItem().getItem() instanceof LightsaberItem) {
               forcePossessor.swgc$setLightsaberAttack(LightsaberAttack.change(forcePossessor.swgc$getLightsaberAttack(), -direction));
               SwgcNetworking.sendToServer(new ForceActionPacket(forcePossessor.swgc$getLightsaberAttack()));
               return true;
            }

            if (SwgcOptions.getInstance().keyForceActions.isDown()) {
               ForceSecondaryAction action = ForceSecondaryAction.change(forcePossessor.swgc$getForceSecondaryAction(), -direction, player);
               if (forcePossessor.swgc$getForceSecondaryAction() == action) {
                  return Arrays.stream(ForceSecondaryAction.values()).anyMatch(action1 -> action1.unlocked(player));
               }

               forcePossessor.swgc$setForceSecondaryAction(action);
               SwgcNetworking.sendToServer(new ForceActionPacket(forcePossessor.swgc$getForceSecondaryAction()));
               return true;
            }
         }
      }

      return false;
   }

   public static void updateBlasterAim() {
      Player player = Minecraft.getInstance().player;
      ItemStack stack;
      if (player != null && (stack = player.getMainHandItem()).getItem() instanceof BlasterItem blaster && blaster.isAiming(stack)) {
         blaster.setAiming(stack, false);
         SwgcNetworking.sendToServer(new SimpleSwgcActionPacket(-126));
      }
   }
}
