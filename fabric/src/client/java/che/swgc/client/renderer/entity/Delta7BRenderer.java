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
import com.mojang.math.Axis;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class Delta7BRenderer extends che.swgc.client.render.SwgcMobRenderer<StarFighter, Delta7BModel> implements RideableRenderer<StarFighter> {
   public static final net.minecraft.resources.Identifier TEXTURE = SwgcClientUtils.entityTex("delta7b");

   public Delta7BRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context context) {
      super(context, new Delta7BModel(context.bakeLayer(Delta7BModel.LAYER_LOCATION)), 2.0F);
      this.addLayer(new VehicleGlassLayer<>(this, context.bakeLayer(Delta7BModel.GLASS_LOCATION), SwgcClientUtils.entityTex("delta7b_glass")));
   }

   @Override
   protected void setupRotations(che.swgc.client.render.SwgcMobRenderState state, PoseStack poseStack, float bodyRot, float entityScale) {
      super.setupRotations(state, poseStack, bodyRot, entityScale);
      if (state.entity instanceof StarFighter entityLiving) {
         float partialTicks = state.ageInTicks % 1.0F;
         poseStack.translate(0.0F, 1.0F, 0.0F);
         poseStack.mulPose(Axis.XN.rotationDegrees(net.minecraft.util.Mth.lerp(partialTicks, entityLiving.xRotO, entityLiving.getXRot())));
         poseStack.mulPose(Axis.ZP.rotationDegrees(entityLiving.getZRot(partialTicks)));
         poseStack.translate(0.0F, -1.0F, 0.0F);
      }
   }

   public void translateToSeat(net.minecraft.world.entity.LivingEntity rider, StarFighter vehicle, PoseStack poseStack, float partialTick) {
      poseStack.translate(0.0F, rider.getBbHeight() * 0.5F, 0.0F);
      poseStack.mulPose(com.mojang.math.Axis.XP.rotationDegrees(net.minecraft.util.Mth.lerp(partialTick, vehicle.xRotO, vehicle.getXRot())));
      poseStack.mulPose(com.mojang.math.Axis.ZN.rotationDegrees(vehicle.getZRot(partialTick)));
      poseStack.translate(0.0F, 0.125F - rider.getBbHeight() * 0.5F, 0.0F);
   }

   public net.minecraft.resources.Identifier getTextureLocation(che.swgc.client.render.SwgcMobRenderState state) {
      return TEXTURE;
   }
}
