package che.swgc.client.renderer.entity;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.model.entity.Delta7BModel;
import che.swgc.client.renderer.entity.layer.VehicleGlassLayer;
import che.swgc.entity.StarFighter;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.RotationAxis;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class Delta7BRenderer extends che.swgc.client.render.SwgcMobRenderer<StarFighter, Delta7BModel<StarFighter>> implements RideableRenderer<StarFighter> {
   public static final net.minecraft.resources.Identifier TEXTURE = SwgcClientUtils.entityTex("delta7b");

   public Delta7BRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context context) {
      super(context, new Delta7BModel(context.getPart(Delta7BModel.LAYER_LOCATION)), 2.0F);
      this.addFeature(new VehicleGlassLayer(this, context.getPart(Delta7BModel.GLASS_LOCATION)));
   }

   protected void setupRotations(StarFighter entityLiving, com.mojang.blaze3d.vertex.PoseStack poseStack, float ageInTicks, float rotationYaw, float partialTicks) {
      super.setupTransforms(entityLiving, poseStack, ageInTicks, rotationYaw, partialTicks);
      poseStack.translate(0.0F, 1.0F, 0.0F);
      poseStack.multiply(net.minecraft.core.RotationAxis.NEGATIVE_X.rotationDegrees(entityLiving.getPitch(partialTicks)));
      poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_Z.rotationDegrees(entityLiving.getZRot(partialTicks)));
      poseStack.translate(0.0F, -1.0F, 0.0F);
   }

   public void translateToSeat(net.minecraft.world.entity.LivingEntity rider, StarFighter vehicle, com.mojang.blaze3d.vertex.PoseStack poseStack, float partialTick) {
      poseStack.translate(0.0F, rider.getHeight() * 0.5F, 0.0F);
      poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_X.rotationDegrees(vehicle.getPitch(partialTick)));
      poseStack.multiply(net.minecraft.core.RotationAxis.NEGATIVE_Z.rotationDegrees(vehicle.getZRot(partialTick)));
      poseStack.translate(0.0F, 0.125F - rider.getHeight() * 0.5F, 0.0F);
   }

   public net.minecraft.resources.Identifier textureLocation(StarFighter starFighter) {
      return TEXTURE;
   }
}
