package che.swgc.client.renderer.entity.layer;



import che.swgc.force.ForcePossessor;

import che.swgc.force.ForceSecondaryAction;

import com.mojang.blaze3d.vertex.PoseStack;

import com.mojang.blaze3d.vertex.VertexConsumer;

import com.mojang.math.Axis;

import net.minecraft.client.Minecraft;

import net.minecraft.client.model.HumanoidModel;

import net.minecraft.client.model.player.PlayerModel;

import net.minecraft.client.renderer.SubmitNodeCollector;

import net.minecraft.client.renderer.entity.EntityRenderDispatcher;

import net.minecraft.client.renderer.entity.RenderLayerParent;

import net.minecraft.client.renderer.entity.layers.RenderLayer;

import net.minecraft.client.renderer.entity.state.AvatarRenderState;

import net.minecraft.client.renderer.rendertype.RenderTypes;

import net.minecraft.util.Mth;

import net.minecraft.util.RandomSource;

import net.minecraft.world.InteractionHand;

import net.minecraft.world.entity.Entity;

import net.minecraft.world.entity.HumanoidArm;

import net.minecraft.world.entity.LivingEntity;

import net.minecraft.world.entity.player.Player;

import net.minecraft.world.phys.Vec3;

import org.joml.Matrix4f;

import org.joml.Vector3f;



import java.util.Objects;



public class UNLIMITEDPOWERRenderer extends RenderLayer<AvatarRenderState, PlayerModel> {

   private final EntityRenderDispatcher erd;



   public UNLIMITEDPOWERRenderer(RenderLayerParent<AvatarRenderState, PlayerModel> renderer, EntityRenderDispatcher erd) {

      super(renderer);

      this.erd = erd;

   }



   @Override

   public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int lightCoords, AvatarRenderState state, float yRot, float xRot) {

      LivingEntity entity = resolveEntity(state);

      if (entity == null) {

         return;

      }



      poseStack.pushPose();

      HumanoidModel<?> model = this.getParentModel();

      (entity.getMainHandItem().isEmpty() == (entity.getMainArm() == HumanoidArm.LEFT) ? model.leftArm : model.rightArm).translateAndRotate(poseStack);

      poseStack.translate(0.0F, 0.625F, 0.0F);

      render(poseStack, this.erd, submitNodeCollector, entity, state.ageInTicks % 1.0F, state.ageInTicks);

      poseStack.popPose();

   }



   private static LivingEntity resolveEntity(AvatarRenderState state) {

      Minecraft minecraft = Minecraft.getInstance();

      if (minecraft.level == null) {

         return null;

      }



      if (minecraft.player != null && minecraft.player.getId() == state.id) {

         return minecraft.player;

      }



      Entity entity = minecraft.level.getEntity(state.id);

      return entity instanceof LivingEntity living ? living : null;

   }



   public static void render(PoseStack poseStack, EntityRenderDispatcher erd, SubmitNodeCollector src, Entity entity, float partialTick, float ageInTicks) {

      Entity target;

      if (((ForcePossessor)entity).isUsingForce()

         && ((ForcePossessor)entity).swgc$getForceSecondaryAction() == ForceSecondaryAction.UNLIMITED_POWER

         && (target = entity.level().getEntity(Objects.requireNonNull(((ForcePossessor)entity).swgc$getForceSecondaryActionData())[0])) != null) {

         Vector3f pos = poseStack.last().pose().getTranslation(new Vector3f());

         Vector3f vector3f = target.getPosition(partialTick)

            .add(Vec3.ZERO)

            .add(0.0, target.getBbHeight() * 0.5F, 0.0)

            .subtract(erd.camera.position())

            .yRot((erd.camera.yRot() + 180.0F) * (float)Math.PI / 180.0F)

            .xRot(erd.camera.xRot() * (float)Math.PI / -180.0F)

            .toVector3f()

            .sub(pos);

         Matrix4f matrix4f = new Matrix4f()

            .translate(pos)

            .yRot((float)Mth.atan2(vector3f.x, vector3f.z))

            .xRot((float)(Math.PI / 2) - (float)Math.atan2(vector3f.y, (double)Mth.sqrt(vector3f.x * vector3f.x + vector3f.z * vector3f.z)))

            .scale(1.0F, vector3f.length() * 0.125F, 1.0F);

         src.submitCustomGeometry(poseStack, RenderTypes.lightning(), (pose, buffer) -> {

            RandomSource random = RandomSource.create((long)(ageInTicks * 2.0F));

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



                     float width0 = 0.016F + layer * 0.016F;

                     if (i == 0) {

                        width0 *= y * 0.1F + 1.0F;

                     }



                     float width1 = 0.016F + layer * 0.016F;

                     if (i == 0) {

                        width1 *= (y - 1) * 0.1F + 1.0F;

                     }



                     float rg = layer == 3 ? 0.0F : 1.0F / (1 + layer * 2);

                     float b = 1.0F - layer * 0.2F;

                     quad(matrix4f, buffer, x0, z0, y, x1, z1, width0, width1, rg, b, false, false, true, false);

                     quad(matrix4f, buffer, x0, z0, y, x1, z1, width0, width1, rg, b, true, false, true, true);

                     quad(matrix4f, buffer, x0, z0, y, x1, z1, width0, width1, rg, b, true, true, false, true);

                     quad(matrix4f, buffer, x0, z0, y, x1, z1, width0, width1, rg, b, false, true, false, false);

                  }

               }

            }

         });

      }

   }



   private static void quad(

      Matrix4f matrix4f,

      VertexConsumer buffer,

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

      buffer.addVertex(matrix4f, x0 + (right0 ? width1 : -width1), y, z0 + (front0 ? width1 : -width1)).setColor(rg, rg, b, 1.0F);

      buffer.addVertex(matrix4f, x0 + (right1 ? width1 : -width1), y, z0 + (front1 ? width1 : -width1)).setColor(rg, rg, b, 1.0F);

      buffer.addVertex(matrix4f, x1 + (right1 ? width0 : -width0), y + 1, z1 + (front1 ? width0 : -width0)).setColor(rg, rg, b, 1.0F);

      buffer.addVertex(matrix4f, x1 + (right0 ? width0 : -width0), y + 1, z1 + (front0 ? width0 : -width0)).setColor(rg, rg, b, 1.0F);

   }



   public static void renderFirstPerson(

      Player player,

      InteractionHand hand,

      PoseStack poseStack,

      SubmitNodeCollector src,

      float partialTick,

      float equipProgress,

      float swingProgress

   ) {

      if (hand != InteractionHand.MAIN_HAND) {

         return;

      }



      if (player instanceof ForcePossessor forcePossessor

         && forcePossessor.isUsingForce()

         && forcePossessor.swgc$getForceSecondaryAction() == ForceSecondaryAction.UNLIMITED_POWER) {

         poseStack.pushPose();

         float f = player.getMainArm() == HumanoidArm.RIGHT ? 1.0F : -1.0F;

         float f1 = Mth.sqrt(equipProgress);

         float f2 = -0.3F * Mth.sin(f1 * (float)Math.PI);

         float f3 = 0.4F * Mth.sin(f1 * (float)(Math.PI * 2));

         float f4 = -0.4F * Mth.sin(equipProgress * (float)Math.PI);

         poseStack.translate(f * (f2 + 0.64000005F), f3 - 0.6F + swingProgress * -0.6F, f4 - 0.71999997F);

         poseStack.mulPose(Axis.YP.rotationDegrees(f * 45.0F));

         float f5 = Mth.sin(equipProgress * equipProgress * (float)Math.PI);

         float f6 = Mth.sin(f1 * (float)Math.PI);

         poseStack.mulPose(Axis.YP.rotationDegrees(f * f6 * 70.0F));

         poseStack.mulPose(Axis.ZP.rotationDegrees(f * f5 * -20.0F));

         poseStack.translate(f * -1.0F, 3.6F, 3.5F);

         poseStack.mulPose(Axis.ZP.rotationDegrees(f * 120.0F));

         poseStack.mulPose(Axis.XP.rotationDegrees(200.0F));

         poseStack.mulPose(Axis.YP.rotationDegrees(f * -135.0F));

         poseStack.translate(f * 5.3F, 0.875F, 0.0F);

         render(poseStack, Minecraft.getInstance().getEntityRenderDispatcher(), src, player, partialTick, player.tickCount + partialTick);

         poseStack.popPose();

      }

   }

}

