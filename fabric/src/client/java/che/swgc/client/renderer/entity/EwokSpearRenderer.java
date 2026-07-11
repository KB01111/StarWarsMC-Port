package che.swgc.client.renderer.entity;

import che.swgc.client.model.item.EwokSpearModel;
import che.swgc.entity.EwokSpear;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.VertexConsumer;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.renderer.OverlayTexture;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.RotationAxis;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.item.ItemRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class EwokSpearRenderer extends net.minecraft.client.renderer.entity.EntityRenderer<EwokSpear> {
   public static final net.minecraft.resources.Identifier TEXTURE = Identifier.fromNamespaceAndPath("swgc", "textures/entity/ewok_spear.png");
   private final EwokSpearModel model;

   public EwokSpearRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx);
      this.model = new EwokSpearModel(ctx.getPart(EwokSpearModel.LAYER_LOCATION));
   }

   public void render(EwokSpear spear, float entityYaw, float partialTick, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource src, int packedLight) {
      poseStack.push();
      poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_Y.rotationDegrees(net.minecraft.util.Mth.lerp(partialTick, spear.prevYaw, spear.getYRot()) + 180.0F));
      poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_X.rotationDegrees(net.minecraft.util.Mth.lerp(partialTick, spear.prevPitch, spear.getXRot()) + 90.0F));
      net.minecraft.client.renderer.VertexConsumer buffer = net.minecraft.client.renderer.item.ItemRenderer.getDirectItemGlintConsumer(src, this.model.getLayer(this.textureLocation(spear)), false, spear.isFoil());
      this.model.render(poseStack, buffer, packedLight, net.minecraft.client.renderer.OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
      poseStack.pop();
      super.render(spear, entityYaw, partialTick, poseStack, src, packedLight);
   }

   public net.minecraft.resources.Identifier textureLocation(EwokSpear ewokSpear) {
      return TEXTURE;
   }
}
