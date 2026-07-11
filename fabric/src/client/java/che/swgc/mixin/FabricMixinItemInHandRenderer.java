package che.swgc.mixin;

import che.swgc.client.SwgcHooksClient;
import che.swgc.client.renderer.entity.layer.UNLIMITEDPOWERRenderer;
import che.swgc.force.ForcePossessor;
import che.swgc.item.BlasterItem;
import che.swgc.item.LightsaberItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.player.AbstractLocalPlayer;
import net.minecraft.client.renderer.item.HeldItemRenderer;
import net.minecraft.world.item.ItemDisplayContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({net.minecraft.client.renderer.item.HeldItemRenderer.class})
public abstract class FabricMixinItemInHandRenderer {
   public FabricMixinItemInHandRenderer() {
   }

   @Shadow
   public abstract void renderItem(net.minecraft.world.entity.LivingEntity var1, net.minecraft.world.item.ItemStack var2, net.minecraft.world.item.ItemDisplayContext var3, boolean var4, com.mojang.blaze3d.vertex.PoseStack var5, che.swgc.client.compat.render.MultiBufferSource var6, int var7);

   @Inject(
      method = {"renderArmWithItem"},
      at = {@At("HEAD")}
   )
   private void preRender(
      net.minecraft.client.player.AbstractLocalPlayer abstractClientPlayer,
      float f,
      float g,
      net.minecraft.world.InteractionHand interactionHand,
      float h,
      net.minecraft.world.item.ItemStack itemStack,
      float i,
      com.mojang.blaze3d.vertex.PoseStack poseStack,
      che.swgc.client.compat.render.MultiBufferSource multiBufferSource,
      int j,
      CallbackInfo ci
   ) {
      UNLIMITEDPOWERRenderer.renderFirstPerson(abstractClientPlayer, interactionHand, poseStack, multiBufferSource, f, i, h);
   }

   @Inject(
      method = {"renderArmWithItem"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/world/entity/HumanoidArm;RIGHT:Lnet/minecraft/world/entity/HumanoidArm;",
         ordinal = 1
      )},
      cancellable = true
   )
   private void customItemAnimations(
      net.minecraft.client.player.AbstractLocalPlayer abstractClientPlayer,
      float f,
      float g,
      net.minecraft.world.InteractionHand interactionHand,
      float h,
      net.minecraft.world.item.ItemStack itemStack,
      float i,
      com.mojang.blaze3d.vertex.PoseStack poseStack,
      che.swgc.client.compat.render.MultiBufferSource multiBufferSource,
      int j,
      CallbackInfo ci
   ) {
      net.minecraft.world.entity.HumanoidArm arm = interactionHand == net.minecraft.world.InteractionHand.MAIN_HAND ? abstractClientPlayer.getMainArm() : abstractClientPlayer.getMainArm().getOpposite();
      net.minecraft.world.item.Item item = itemStack.getItem();
      if (item instanceof LightsaberItem && SwgcHooksClient.applyLightsaberTransform((ForcePossessor)abstractClientPlayer, arm, poseStack, f, i)) {
         ci.cancel();
      } else if (item instanceof BlasterItem) {
         SwgcHooksClient.applyBlasterTransform(poseStack, arm, h);
         ci.cancel();
      }

      if (ci.isCancelled()) {
         boolean bl2 = arm == net.minecraft.world.entity.HumanoidArm.RIGHT;
         this.renderItem(abstractClientPlayer, itemStack, bl2 ? net.minecraft.world.item.ItemDisplayContext.FIRST_PERSON_RIGHT_HAND : net.minecraft.world.item.ItemDisplayContext.FIRST_PERSON_LEFT_HAND, !bl2, poseStack, multiBufferSource, j);
         poseStack.pop();
      }
   }
}
