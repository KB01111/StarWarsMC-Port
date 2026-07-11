package che.swgc.client.model.entity;

import che.swgc.client.animation.RoyalGuardianAnimation;
import che.swgc.entity.RoyalGuardian;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.resources.Identifier;
import che.swgc.client.compat.model.ModelWithArms;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.model.SinglePartEntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;
import javax.annotation.ParametersAreNonnullByDefault;
import che.swgc.client.compat.animation.Animation;

@javax.annotation.ParametersAreNonnullByDefault
public class RoyalGuardianModel<T extends RoyalGuardian> extends che.swgc.client.compat.model.SinglePartEntityModel<T> implements che.swgc.client.compat.model.ModelWithArms {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "royal_gurdian"), "main");
   private final net.minecraft.client.model.geom.ModelPart root;
   private final net.minecraft.client.model.geom.ModelPart armor;
   private final net.minecraft.client.model.geom.ModelPart body;
   private final net.minecraft.client.model.geom.ModelPart head;
   private final net.minecraft.client.model.geom.ModelPart rightArm;
   private final net.minecraft.client.model.geom.ModelPart leftArm;
   public net.minecraft.world.entity.HumanoidArm mainArm;
   public float sprint;

   public RoyalGuardianModel(net.minecraft.client.model.geom.ModelPart root) {
      this.root = root;
      this.armor = root.getChild("armor");
      this.body = this.armor.getChild("body");
      this.head = this.body.getChild("head");
      this.rightArm = this.body.getChild("right_arm");
      this.leftArm = this.body.getChild("left_arm");
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition armor = partdefinition.addChild("armor", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = armor.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 32)
            .cuboid(-4.0041F, -11.9974F, -2.4076F, 8.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(62, 15)
            .cuboid(-2.8041F, -0.9974F, -1.9076F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0041F, -12.0026F, -0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = body.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 50).cuboid(-1.2F, -4.0F, -5.55F, 3.0F, 8.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-4.336F, -8.2137F, 3.1424F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = body.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 49).cuboid(-1.8F, -4.0F, -5.55F, 3.0F, 8.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.3277F, -8.2137F, 3.1424F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = body.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(52, 50)
            .cuboid(-0.7032F, -0.3114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.4F))
            .uv(48, 0)
            .cuboid(-1.0032F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 20)
            .cuboid(-0.6738F, 3.8248F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.38F)),
         net.minecraft.client.model.geom.PartPose.pivot(4.999F, -10.6861F, 0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak_r1 = left_arm.addChild(
         "cloak_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(56, 32).cuboid(-1.775F, -2.9F, -2.225F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.37F)),
         net.minecraft.client.model.geom.PartPose.of(1.3281F, 6.3747F, 0.225F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = body.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(56, 41)
            .cuboid(-3.2968F, -0.3114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.4F))
            .uv(0, 49)
            .cuboid(-2.9968F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 63)
            .cuboid(-0.3761F, 3.8248F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.38F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.0073F, -10.6861F, 0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak_r2 = right_arm.addChild(
         "cloak_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 59).cuboid(-2.225F, -2.9F, -2.225F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.37F)),
         net.minecraft.client.model.geom.PartPose.of(-1.3281F, 6.3747F, 0.225F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition head = body.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-4.0F, -7.9F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.5F))
            .uv(0, 16)
            .cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.0041F, -11.9974F, 0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = armor.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 17)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(42, 33)
            .cuboid(-1.8918F, -0.8379F, -2.5F, 2.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.19F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, -12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = left_leg.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 0).cuboid(-1.3F, -6.15F, -2.625F, 3.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F)),
         net.minecraft.client.model.geom.PartPose.of(0.8652F, 5.1943F, 0.125F, 0.0F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = armor.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 15)
            .cuboid(-0.1082F, -0.8379F, -2.5F, 2.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.19F))
            .uv(26, 33)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, -12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = right_leg.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(24, 62)
            .cuboid(-1.7F, -6.15F, -2.375F, 3.0F, 12.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F))
            .uv(16, 62)
            .cuboid(-1.7F, -6.15F, 1.625F, 3.0F, 12.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8652F, 5.1943F, -0.125F, 0.0F, 0.0F, 0.0873F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public void prepareMobModel(T entity, float limbSwing, float limbSwingAmount, float partialTick) {
      super.animateModel(entity, limbSwing, limbSwingAmount, partialTick);
      this.mainArm = entity.getMainArm();
      this.sprint = entity.swgc$getSprint(partialTick);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.root.traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      this.updateAnimation(entity.swgc$getJumpAnimState(), RoyalGuardianAnimation.JUMP, ageInTicks);
      if (this.handSwingProgress > 0.0F) {
         che.swgc.client.compat.animation.Animation anim = entity.firstAttack ? RoyalGuardianAnimation.ATTACK : RoyalGuardianAnimation.ATTACK2;
         this.animateMovement(anim, this.handSwingProgress, 1.0F, anim.comp_597() * 20.0F, 1.0F);
      } else {
         this.animateMovement(RoyalGuardianAnimation.WALK, limbSwing, limbSwingAmount, 2.0F, 1.0F - this.sprint);
         this.animateMovement(RoyalGuardianAnimation.RUN, limbSwing, limbSwingAmount, 1.0F, this.sprint);
         this.animateMovement(RoyalGuardianAnimation.IDLE, ageInTicks, 1.0F - limbSwingAmount, 1.0F, 1.0F);
      }

      this.head.yRot += netHeadYaw * (float) Math.PI / 180.0F;
      this.head.xRot += headPitch * (float) Math.PI / 180.0F;
   }

   public void setArmAngle(net.minecraft.world.entity.HumanoidArm arm, com.mojang.blaze3d.vertex.PoseStack poseStack) {
      this.root.rotate(poseStack);
      this.armor.rotate(poseStack);
      this.body.rotate(poseStack);
      (arm == net.minecraft.world.entity.HumanoidArm.LEFT ? this.leftArm : this.rightArm).rotate(poseStack);
   }
}
