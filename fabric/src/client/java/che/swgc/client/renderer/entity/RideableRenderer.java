package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.RideableModel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import net.minecraft.util.Mth;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.core.RotationAxis;

public interface RideableRenderer<T extends net.minecraft.world.entity.LivingEntity> {
   default <M extends net.minecraft.client.model.EntityModel<T> & RideableModel> void translateToModelSeat(M model, T vehicle, com.mojang.blaze3d.vertex.PoseStack poseStack, float partialTick) {
      poseStack.scale(1.0F, -1.0F, -1.0F);
      poseStack.translate(0.0F, -0.876F, 0.0F);
      model.handSwingProgress = vehicle.getHandSwingProgress(partialTick);
      model.riding = vehicle.hasVehicle();
      model.child = vehicle.isBaby();
      model.animateModel(vehicle, vehicle.limbAnimator.position(), vehicle.limbAnimator.getSpeed(), partialTick);
      model.setAngles(
         vehicle,
         vehicle.limbAnimator.position(),
         vehicle.limbAnimator.getSpeed(),
         (float)vehicle.age + partialTick,
         vehicle.getYRot(),
         vehicle.getXRot()
      );
      model.translateToSeat(poseStack);
      poseStack.scale(1.0F, -1.0F, -1.0F);
   }

   void translateToSeat(net.minecraft.world.entity.LivingEntity var1, T var2, com.mojang.blaze3d.vertex.PoseStack var3, float var4);

   default void translateToSeat(net.minecraft.world.entity.LivingEntity rider, net.minecraft.world.entity.Entity uncasted, com.mojang.blaze3d.vertex.PoseStack poseStack, float partialTick) {
      net.minecraft.world.entity.LivingEntity vehicle = (T)uncasted;
      net.minecraft.world.phys.Vec3 vec3 = vehicle.getLerpedPos(partialTick).subtract(rider.getLerpedPos(partialTick));
      poseStack.translate(vec3.x, vec3.y, vec3.z);
      float yRot = net.minecraft.util.Mth.lerp(partialTick, vehicle.prevBodyYaw, vehicle.yBodyRot);
      poseStack.multiply(net.minecraft.core.RotationAxis.NEGATIVE_Y.rotationDegrees(yRot));
      this.translateToSeat(rider, vehicle, poseStack, partialTick);
      poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_Y.rotationDegrees(yRot));
   }
}
