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
public class RoyalGuardianModel extends che.swgc.client.compat.model.SinglePartEntityModel<che.swgc.client.render.SwgcMobRenderState> implements che.swgc.client.compat.model.ModelWithArms {
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
      super(root);
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
      net.minecraft.client.model.geom.builders.PartDefinition armor = partdefinition.addOrReplaceChild("armor", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = armor.addOrReplaceChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 32)
            .addBox(-4.0041F, -11.9974F, -2.4076F, 8.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(62, 15)
            .addBox(-2.8041F, -0.9974F, -1.9076F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0041F, -12.0026F, -0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = body.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 50).addBox(-1.2F, -4.0F, -5.55F, 3.0F, 8.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.336F, -8.2137F, 3.1424F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = body.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 49).addBox(-1.8F, -4.0F, -5.55F, 3.0F, 8.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.3277F, -8.2137F, 3.1424F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = body.addOrReplaceChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(52, 50)
            .addBox(-0.7032F, -0.3114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.4F))
            .texOffs(48, 0)
            .addBox(-1.0032F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(62, 20)
            .addBox(-0.6738F, 3.8248F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.38F)),
         net.minecraft.client.model.geom.PartPose.offset(4.999F, -10.6861F, 0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak_r1 = left_arm.addOrReplaceChild(
         "cloak_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(56, 32).addBox(-1.775F, -2.9F, -2.225F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.37F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.3281F, 6.3747F, 0.225F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = body.addOrReplaceChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(56, 41)
            .addBox(-3.2968F, -0.3114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.4F))
            .texOffs(0, 49)
            .addBox(-2.9968F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 63)
            .addBox(-0.3761F, 3.8248F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.38F)),
         net.minecraft.client.model.geom.PartPose.offset(-5.0073F, -10.6861F, 0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak_r2 = right_arm.addOrReplaceChild(
         "cloak_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(52, 59).addBox(-2.225F, -2.9F, -2.225F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.37F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.3281F, 6.3747F, 0.225F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition head = body.addOrReplaceChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0F, -7.9F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.5F))
            .texOffs(0, 16)
            .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-0.0041F, -11.9974F, 0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = armor.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(32, 17)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(42, 33)
            .addBox(-1.8918F, -0.8379F, -2.5F, 2.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.19F)),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, -12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = left_leg.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 0).addBox(-1.3F, -6.15F, -2.625F, 3.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.8652F, 5.1943F, 0.125F, 0.0F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = armor.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(48, 15)
            .addBox(-0.1082F, -0.8379F, -2.5F, 2.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.19F))
            .texOffs(26, 33)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, -12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = right_leg.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(24, 62)
            .addBox(-1.7F, -6.15F, -2.375F, 3.0F, 12.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F))
            .texOffs(16, 62)
            .addBox(-1.7F, -6.15F, 1.625F, 3.0F, 12.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8652F, 5.1943F, -0.125F, 0.0F, 0.0F, 0.0873F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 128, 128);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }


   public void setupAnim(che.swgc.client.render.SwgcMobRenderState state) {
      super.setupAnim(state);
      float limbSwing = state.walkAnimationPos;
      float limbSwingAmount = state.walkAnimationSpeed;
      float ageInTicks = state.ageInTicks;
      float netHeadYaw = state.yRot;
      float headPitch = state.xRot;

      RoyalGuardian entity = (RoyalGuardian)state.entity;
      this.root.getAllParts().forEach(net.minecraft.client.model.geom.ModelPart::resetPose);
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
      this.root.translateAndRotate(poseStack);
      this.armor.translateAndRotate(poseStack);
      this.body.translateAndRotate(poseStack);
      (arm == net.minecraft.world.entity.HumanoidArm.LEFT ? this.leftArm : this.rightArm).translateAndRotate(poseStack);
   }
}
