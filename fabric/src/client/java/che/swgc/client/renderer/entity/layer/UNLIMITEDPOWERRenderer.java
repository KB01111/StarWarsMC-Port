package che.swgc.client.renderer.entity.layer;

import che.swgc.force.ForcePossessor;
import che.swgc.force.ForceSecondaryAction;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import net.minecraft.client.renderer.entity.layers.FeatureRendererContext;
import net.minecraft.client.renderer.entity.layers.FeatureRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.VertexConsumer;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.util.RandomSource;
import net.minecraft.core.RotationAxis;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class UNLIMITEDPOWERRenderer<T extends net.minecraft.world.entity.LivingEntity, M extends net.minecraft.client.model.HumanoidModel<T>> extends net.minecraft.client.renderer.entity.layers.FeatureRenderer<T, M> {
   private final net.minecraft.client.renderer.entity.EntityRenderDispatcher erd;

   public UNLIMITEDPOWERRenderer(net.minecraft.client.renderer.entity.layers.FeatureRendererContext<T, M> renderer, net.minecraft.client.renderer.entity.EntityRenderDispatcher erd) {
      super(renderer);
      this.erd = erd;
   }

   public void render(
      com.mojang.blaze3d.vertex.PoseStack poseStack,
      che.swgc.client.compat.render.MultiBufferSource src,
      int packedLight,
      T entity,
      float limbSwing,
      float limbSwingAmount,
      float partialTick,
      float ageInTicks,
      float netHeadYaw,
      float headPitch
   ) {
      poseStack.push();
      (entity.getMainHandItem().isEmpty() == (entity.getMainArm() == net.minecraft.world.entity.HumanoidArm.LEFT)
            ? ((net.minecraft.client.model.HumanoidModel)this.getContextModel()).leftArm
            : ((net.minecraft.client.model.HumanoidModel)this.getContextModel()).rightArm)
         .rotate(poseStack);
      poseStack.translate(0.0F, 0.625F, 0.0F);
      render(poseStack, this.erd, src, entity, partialTick, ageInTicks);
      poseStack.pop();
   }

   public static void render(com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.entity.EntityRenderDispatcher erd, che.swgc.client.compat.render.MultiBufferSource src, net.minecraft.world.entity.Entity entity, float partialTick, float ageInTicks) {
      net.minecraft.world.entity.Entity target;
      if (((ForcePossessor)entity).isUsingForce()
         && ((ForcePossessor)entity).swgc$getForceSecondaryAction() == ForceSecondaryAction.UNLIMITED_POWER
         && (target = entity.level().getEntityById(Objects.requireNonNull(((ForcePossessor)entity).swgc$getForceSecondaryActionData())[0])) != null) {
         Vector3f pos = poseStack.peek().getPositionMatrix().getTranslation(new Vector3f());
         Vector3f vector3f = target.getLerpedPos(partialTick)
            .add(erd.getRenderer(entity).getPositionOffset(entity, partialTick))
            .add(0.0, (double)(target.getHeight() * 0.5F), 0.0)
            .subtract(erd.camera.position())
            .yRot((erd.camera.getYRot() + 180.0F) * (float) Math.PI / 180.0F)
            .xRot(erd.camera.getXRot() * (float) Math.PI / -180.0F)
            .toVector3f()
            .sub(pos);
         Matrix4f matrix4f = new Matrix4f()
            .translate(pos)
            .yRot((float)net.minecraft.util.Mth.atan2((double)vector3f.x, (double)vector3f.z))
            .xRot(
               (float) (Math.PI / 2)
                  - (float)Math.atan2((double)vector3f.y, (double)net.minecraft.util.Mth.sqrt(vector3f.x * vector3f.x + vector3f.z * vector3f.z))
            )
            .scale(1.0F, vector3f.length() * 0.125F, 1.0F);
         net.minecraft.util.RandomSource random = net.minecraft.util.RandomSource.create((long)(ageInTicks * 2.0F));
         net.minecraft.client.renderer.VertexConsumer buffer = src.getBuffer(net.minecraft.client.renderer.rendertype.RenderType.getLightning());
         float[] xCoords = new float[3];
         float[] zCoords = new float[3];
         xCoords[0] = zCoords[0] = 0.0F;

         for (int i = 1; i < 3; i++) {
            xCoords[i] = xCoords[i - 1] + random.nextFloat() * 0.5F - 0.25F;
            zCoords[i] = zCoords[i - 1] + random.nextFloat() * 0.5F - 0.25F;
         }

         for (int layer = 0; layer < 4; layer++) {
            random.setSeed((long)(ageInTicks * 2.0F));

            for (int i = 0; i < 3; i++) {
               int y1 = i > 0 ? i + 2 : 7;
               float x1 = xCoords[i];
               float z1 = zCoords[i];

               for (int y = i; y <= y1; y++) {
                  float x0 = x1;
                  float z0 = z1;
                  if (y == 7) {
                     z1 = 0.0F;
                     x1 = 0.0F;
                  } else if (i == 0) {
                     x1 += random.nextFloat() * 0.5F - 0.25F;
                     z1 += random.nextFloat() * 0.5F - 0.25F;
                  } else {
                     x1 += random.nextFloat() - 0.5F;
                     z1 += random.nextFloat() - 0.5F;
                  }

                  float width0 = 0.016F + (float)layer * 0.016F;
                  if (i == 0) {
                     width0 *= (float)y * 0.1F + 1.0F;
                  }

                  float width1 = 0.016F + (float)layer * 0.016F;
                  if (i == 0) {
                     width1 *= (float)(y - 1) * 0.1F + 1.0F;
                  }

                  float rg = layer == 3 ? 0.0F : 1.0F / (float)(1 + layer * 2);
                  float b = 1.0F - (float)layer * 0.2F;
                  quad(matrix4f, buffer, x0, z0, y, x1, z1, width0, width1, rg, b, false, false, true, false);
                  quad(matrix4f, buffer, x0, z0, y, x1, z1, width0, width1, rg, b, true, false, true, true);
                  quad(matrix4f, buffer, x0, z0, y, x1, z1, width0, width1, rg, b, true, true, false, true);
                  quad(matrix4f, buffer, x0, z0, y, x1, z1, width0, width1, rg, b, false, true, false, false);
               }
            }
         }
      }
   }

   private static void quad(
      Matrix4f matrix4f,
      net.minecraft.client.renderer.VertexConsumer buffer,
      float x0,
      float z0,
      int y,
      float x1,
      float z1,
      float width0,
      float width1,
      float rg,
      float b,
      boolean right0,
      boolean front0,
      boolean right1,
      boolean front1
   ) {
      buffer.vertex(matrix4f, x0 + (right0 ? width1 : -width1), (float)y, z0 + (front0 ? width1 : -width1)).color(rg, rg, b, 1.0F).next();
      buffer.vertex(matrix4f, x0 + (right1 ? width1 : -width1), (float)y, z0 + (front1 ? width1 : -width1)).color(rg, rg, b, 1.0F).next();
      buffer.vertex(matrix4f, x1 + (right1 ? width0 : -width0), (float)(y + 1), z1 + (front1 ? width0 : -width0))
         .color(rg, rg, b, 1.0F)
         .next();
      buffer.vertex(matrix4f, x1 + (right0 ? width0 : -width0), (float)(y + 1), z1 + (front0 ? width0 : -width0))
         .color(rg, rg, b, 1.0F)
         .next();
   }

   public static void renderFirstPerson(
      @Nullable net.minecraft.world.entity.player.Player player, net.minecraft.world.InteractionHand hand, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource src, float partialTick, float equipProgress, float swingProgress
   ) {
      if (hand == net.minecraft.world.InteractionHand.MAIN_HAND) {
         if (player != null
            && ((ForcePossessor)player).isUsingForce()
            && ((ForcePossessor)player).swgc$getForceSecondaryAction() == ForceSecondaryAction.UNLIMITED_POWER) {
            poseStack.push();
            float f = player.getMainArm() == net.minecraft.world.entity.HumanoidArm.RIGHT ? 1.0F : -1.0F;
            float f1 = net.minecraft.util.Mth.sqrt(equipProgress);
            float f2 = -0.3F * net.minecraft.util.Mth.sin(f1 * (float) Math.PI);
            float f3 = 0.4F * net.minecraft.util.Mth.sin(f1 * (float) (Math.PI * 2));
            float f4 = -0.4F * net.minecraft.util.Mth.sin(equipProgress * (float) Math.PI);
            poseStack.translate(f * (f2 + 0.64000005F), f3 - 0.6F + swingProgress * -0.6F, f4 - 0.71999997F);
            poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_Y.rotationDegrees(f * 45.0F));
            float f5 = net.minecraft.util.Mth.sin(equipProgress * equipProgress * (float) Math.PI);
            float f6 = net.minecraft.util.Mth.sin(f1 * (float) Math.PI);
            poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_Y.rotationDegrees(f * f6 * 70.0F));
            poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_Z.rotationDegrees(f * f5 * -20.0F));
            poseStack.translate(f * -1.0F, 3.6F, 3.5F);
            poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_Z.rotationDegrees(f * 120.0F));
            poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_X.rotationDegrees(200.0F));
            poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_Y.rotationDegrees(f * -135.0F));
            poseStack.translate(f * 5.3F, 0.875F, 0.0F);
            render(poseStack, net.minecraft.client.Minecraft.getInstance().getEntityRenderDispatcher(), src, player, partialTick, (float)player.age + partialTick);
            poseStack.pop();
         }
      }
   }
}
