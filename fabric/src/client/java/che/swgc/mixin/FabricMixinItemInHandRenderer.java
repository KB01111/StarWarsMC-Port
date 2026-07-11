package che.swgc.mixin;

import che.swgc.client.SwgcHooksClient;
import che.swgc.client.renderer.entity.layer.UNLIMITEDPOWERRenderer;
import che.swgc.force.ForcePossessor;
import che.swgc.item.BlasterItem;
import che.swgc.item.LightsaberItem;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import com.mojang.blaze3d.vertex.PoseStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemInHandRenderer.class)
public abstract class FabricMixinItemInHandRenderer {
   @Shadow
   public abstract void renderItem(
      net.minecraft.world.entity.LivingEntity entity,
      ItemStack stack,
      ItemDisplayContext displayContext,
      boolean leftHanded,
      PoseStack poseStack,
      SubmitNodeCollector submitNodeCollector,
      int lightCoords
   );

   @Inject(method = "submitArmWithItem", at = @At("HEAD"))
   private void swgc$preRender(
      net.minecraft.client.player.AbstractClientPlayer player,
      float frameInterp,
      float xRot,
      InteractionHand hand,
      float attack,
      ItemStack itemStack,
      float inverseArmHeight,
      PoseStack poseStack,
      SubmitNodeCollector submitNodeCollector,
      int lightCoords,
      CallbackInfo ci
   ) {
      UNLIMITEDPOWERRenderer.renderFirstPerson(player, hand, poseStack, submitNodeCollector, frameInterp, inverseArmHeight, attack);
   }

   @Inject(
      method = "submitArmWithItem",
      at = @At(
         value = "FIELD",
         target = "Lnet/minecraft/world/entity/HumanoidArm;RIGHT:Lnet/minecraft/world/entity/HumanoidArm;",
         ordinal = 1
      ),
      cancellable = true
   )
   private void swgc$customItemAnimations(
      net.minecraft.client.player.AbstractClientPlayer player,
      float frameInterp,
      float xRot,
      InteractionHand hand,
      float attack,
      ItemStack itemStack,
      float inverseArmHeight,
      PoseStack poseStack,
      SubmitNodeCollector submitNodeCollector,
      int lightCoords,
      CallbackInfo ci
   ) {
      HumanoidArm arm = hand == InteractionHand.MAIN_HAND ? player.getMainArm() : player.getMainArm().getOpposite();
      Item item = itemStack.getItem();
      if (item instanceof LightsaberItem && SwgcHooksClient.applyLightsaberTransform((ForcePossessor)player, arm, poseStack, frameInterp, inverseArmHeight)) {
         ci.cancel();
      } else if (item instanceof BlasterItem) {
         SwgcHooksClient.applyBlasterTransform(poseStack, arm, attack);
         ci.cancel();
      }

      if (ci.isCancelled()) {
         boolean right = arm == HumanoidArm.RIGHT;
         this.renderItem(
            player,
            itemStack,
            right ? ItemDisplayContext.FIRST_PERSON_RIGHT_HAND : ItemDisplayContext.FIRST_PERSON_LEFT_HAND,
            !right,
            poseStack,
            submitNodeCollector,
            lightCoords
         );
         poseStack.popPose();
      }
   }
}
