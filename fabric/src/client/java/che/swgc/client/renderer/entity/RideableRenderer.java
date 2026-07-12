package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.RideableModel;
import che.swgc.client.render.SwgcMobRenderState;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.model.EntityModel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public interface RideableRenderer<T extends LivingEntity> {
   default void translateToModelSeat(RideableModel model, T vehicle, PoseStack poseStack, float partialTick) {
      poseStack.scale(1.0F, -1.0F, -1.0F);
      poseStack.translate(0.0F, -0.876F, 0.0F);
      SwgcMobRenderState state = new SwgcMobRenderState();
      state.entity = vehicle;
      state.walkAnimationPos = vehicle.walkAnimation.position(partialTick);
      state.walkAnimationSpeed = vehicle.walkAnimation.speed(partialTick);
      state.ageInTicks = vehicle.tickCount + partialTick;
      state.yRot = vehicle.getYRot();
      state.xRot = vehicle.getXRot();
      @SuppressWarnings("unchecked")
      EntityModel<SwgcMobRenderState> entityModel = (EntityModel<SwgcMobRenderState>)model;
      entityModel.setupAnim(state);

      model.translateToSeat(poseStack);
      poseStack.scale(1.0F, -1.0F, -1.0F);
   }

   void translateToSeat(LivingEntity rider, T vehicle, PoseStack poseStack, float partialTick);

   default void translateToSeat(LivingEntity rider, Entity uncasted, PoseStack poseStack, float partialTick) {
      @SuppressWarnings("unchecked")
      T vehicle = (T)uncasted;
      var vec3 = vehicle.getPosition(partialTick).subtract(rider.getPosition(partialTick));
      poseStack.translate(vec3.x, vec3.y, vec3.z);
      float yRot = Mth.lerp(partialTick, vehicle.yBodyRotO, vehicle.yBodyRot);
      poseStack.mulPose(Axis.YN.rotationDegrees(yRot));
      this.translateToSeat(rider, vehicle, poseStack, partialTick);
      poseStack.mulPose(Axis.YP.rotationDegrees(yRot));
   }
}
