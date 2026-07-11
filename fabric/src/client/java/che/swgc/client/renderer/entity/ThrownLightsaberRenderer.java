package che.swgc.client.renderer.entity;

import che.swgc.entity.ThrownLightsaber;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.renderer.OverlayTexture;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.RotationAxis;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.item.ItemRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class ThrownLightsaberRenderer extends net.minecraft.client.renderer.entity.EntityRenderer<ThrownLightsaber> {
   private final net.minecraft.client.renderer.item.ItemRenderer itemRenderer;

   public ThrownLightsaberRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context context) {
      super(context);
      this.itemRenderer = context.getItemRenderer();
   }

   public void render(ThrownLightsaber entity, float entityYaw, float partialTick, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource buffer, int packedLight) {
      poseStack.push();
      poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_Y.rotationDegrees(entityYaw));
      poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_X.rotationDegrees(net.minecraft.util.Mth.lerp(partialTick, entity.prevPitch, entity.getXRot())));
      this.itemRenderer
         .renderItem(
            entity.getLightsaber(), net.minecraft.world.item.ItemDisplayContext.GROUND, packedLight, net.minecraft.client.renderer.OverlayTexture.DEFAULT_UV, poseStack, buffer, entity.level(), entity.getId()
         );
      poseStack.pop();
      super.render(entity, entityYaw, partialTick, poseStack, buffer, packedLight);
   }

   public net.minecraft.resources.Identifier textureLocation(ThrownLightsaber entity) {
      return null;
   }
}
