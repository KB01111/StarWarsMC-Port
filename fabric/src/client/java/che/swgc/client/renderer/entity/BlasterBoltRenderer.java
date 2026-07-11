package che.swgc.client.renderer.entity;

import che.swgc.client.model.PlasmaRodModel;
import che.swgc.entity.BlasterBolt;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.renderer.OverlayTexture;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.RotationAxis;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.core.ColorHelper.Argb;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class BlasterBoltRenderer extends net.minecraft.client.renderer.entity.EntityRenderer<BlasterBolt> {
   private final PlasmaRodModel model;

   public BlasterBoltRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context context) {
      super(context);
      this.model = new PlasmaRodModel(context.getPart(PlasmaRodModel.LAYER_LOCATION), true, 0.75F, 0.5F);
   }

   public void render(BlasterBolt entity, float entityYaw, float partialTick, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource buffer, int packedLight) {
      poseStack.push();
      poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_Y.rotationDegrees(entityYaw));
      poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_X.rotationDegrees(-net.minecraft.util.Mth.lerp(partialTick, entity.prevPitch, entity.getXRot()) + 90.0F));
      poseStack.translate(0.0F, -0.375F, 0.0F);
      net.minecraft.resources.Identifier texture = this.textureLocation(entity);
      this.model.render(poseStack, buffer.getBuffer(this.model.getLayer(texture)), 15728640, net.minecraft.client.renderer.OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
      this.model.render(poseStack, buffer.getBuffer(net.minecraft.client.renderer.rendertype.RenderType.getBeaconBeam(texture, false)), 15728640, net.minecraft.client.renderer.OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
      int color = entity.getColor();
      this.model
         .setupAndRenderOutline(
            poseStack,
            buffer.getBuffer(net.minecraft.client.renderer.rendertype.RenderType.getBeaconBeam(texture, true)),
            15728640,
            net.minecraft.client.renderer.OverlayTexture.DEFAULT_UV,
            (float)net.minecraft.core.ColorHelper.Argb.getRed(color) / 255.0F,
            (float)net.minecraft.core.ColorHelper.Argb.getGreen(color) / 255.0F,
            (float)net.minecraft.core.ColorHelper.Argb.getBlue(color) / 255.0F,
            1.0F
         );
      poseStack.pop();
      super.render(entity, entityYaw, partialTick, poseStack, buffer, packedLight);
   }

   public net.minecraft.resources.Identifier textureLocation(BlasterBolt entity) {
      return PlasmaRodModel.DEFAULT_TEXTURE;
   }
}
