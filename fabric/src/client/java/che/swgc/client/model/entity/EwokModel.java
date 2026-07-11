package che.swgc.client.model.entity;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.animation.EwokAnimation;
import che.swgc.entity.AbstractEwok;
import java.util.Set;
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
public class EwokModel<T extends AbstractEwok> extends che.swgc.client.compat.model.SinglePartEntityModel<T> implements che.swgc.client.compat.model.ModelWithArms {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "ewok"), "main");
   private final net.minecraft.client.model.geom.ModelPart root;
   protected final net.minecraft.client.model.geom.ModelPart body;
   protected final net.minecraft.client.model.geom.ModelPart head;
   protected final net.minecraft.client.model.geom.ModelPart right_arm;
   protected final net.minecraft.client.model.geom.ModelPart right_arm2;
   protected final net.minecraft.client.model.geom.ModelPart left_arm;
   protected final net.minecraft.client.model.geom.ModelPart left_arm2;
   protected final net.minecraft.client.model.geom.ModelPart item;
   protected final net.minecraft.client.model.geom.ModelPart right_leg;
   protected final net.minecraft.client.model.geom.ModelPart right_leg2;
   protected final net.minecraft.client.model.geom.ModelPart left_leg;
   protected final net.minecraft.client.model.geom.ModelPart left_leg2;
   public net.minecraft.world.entity.HumanoidArm mainArm;
   public float sprint;

   public EwokModel(net.minecraft.client.model.geom.ModelPart root) {
      this.root = root;
      this.body = root.getChild("body");
      this.head = this.body.getChild("head");
      this.right_arm = this.body.getChild("right_arm");
      this.right_arm2 = this.right_arm.getChild("right_arm2");
      this.left_arm = this.body.getChild("left_arm");
      this.left_arm2 = this.left_arm.getChild("left_arm2");
      this.item = this.left_arm2.getChild("item");
      this.right_leg = this.body.getChild("right_leg");
      this.right_leg2 = this.right_leg.getChild("right_leg2");
      this.left_leg = this.body.getChild("left_leg");
      this.left_leg2 = this.left_leg.getChild("left_leg2");
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 24)
            .cuboid(-4.0F, -6.0F, -3.0F, 8.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 36)
            .cuboid(-3.0F, 0.0F, 3.0F, 6.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 40)
            .cuboid(-3.0F, -0.5F, -2.05F, 6.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 16.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition head = body.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 24).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, -6.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = head.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 0).cuboid(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.0F, -8.1F, 1.3F, -0.5861F, -1.2176F, 0.2127F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = head.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 63).cuboid(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.0F, -8.1F, 1.3F, -0.5861F, 1.2176F, -0.2127F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = body.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 16)
            .cuboid(-1.0812F, -1.4833F, -2.0167F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(60, 47)
            .cuboid(-1.1062F, -1.4833F, -2.0167F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.9188F, -4.5167F, 0.0167F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm2 = right_arm.addChild(
         "right_arm2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(52, 42)
            .cuboid(-1.7685F, -0.0498F, -1.525F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 65)
            .cuboid(-1.7935F, -0.0498F, -1.525F, 0.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.6873F, 2.5666F, -0.4917F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = right_arm2.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 64).cuboid(2.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.8685F, -0.0498F, 2.475F, -0.4712F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = right_arm2.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 55).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2685F, -0.3997F, -0.2935F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = right_arm2.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 40).cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 2.3F, 0.0F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = body.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 49)
            .cuboid(-1.9188F, -1.4833F, -2.0167F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 62)
            .cuboid(1.1062F, -1.4833F, -2.0167F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(5.9188F, -4.5167F, 0.0167F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm2 = left_arm.addChild(
         "left_arm2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 54)
            .cuboid(-1.2315F, -0.0498F, -1.525F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 66)
            .cuboid(1.7935F, -0.0498F, -1.525F, 0.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.6873F, 2.5666F, -0.4917F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = left_arm2.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 64).cuboid(-4.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.8685F, -0.0498F, 2.475F, -0.4712F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = left_arm2.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 59).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.2685F, -0.3997F, -0.2935F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = left_arm2.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 36).cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 2.3F, 0.0F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition item = left_arm2.addChild("item", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 2.3F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = body.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(54, 56)
            .cuboid(-2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(46, 56)
            .cuboid(2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 46)
            .cuboid(-2.0F, 6.0E-4F, -2.0044F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, -6.0E-4F, 0.0044F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = right_leg.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 62).cuboid(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.025F, -2.1021F, -0.8647F, -0.7941F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = right_leg.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 32).cuboid(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, 6.0E-4F, -3.0044F, 0.3403F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg2 = right_leg.addChild(
         "right_leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 46)
            .cuboid(-2.0F, 0.0F, -1.3F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(64, 45)
            .cuboid(-2.0F, 3.0F, -2.3F, 4.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 54)
            .cuboid(-2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 54)
            .cuboid(2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 4.0006F, -0.7044F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = right_leg2.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 9).cuboid(-4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, -1.0285F, -2.1931F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = right_leg2.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 12).cuboid(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -0.3739F, 0.1058F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = right_leg2.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 6).cuboid(-4.0F, -4.0F, -3.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, -1.0285F, 3.5931F, 1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = body.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 59)
            .cuboid(2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(60, 24)
            .cuboid(-2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 8)
            .cuboid(-2.0F, 6.0E-4F, -2.0044F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, -6.0E-4F, 0.0044F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = left_leg.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 20).cuboid(0.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.025F, -2.1021F, -0.8647F, -0.7941F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = left_leg.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 16).cuboid(0.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, 6.0E-4F, -3.0044F, 0.3403F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg2 = left_leg.addChild(
         "left_leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 0)
            .cuboid(-2.0F, 0.0F, -1.3F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(26, 65)
            .cuboid(-2.0F, 3.0F, -2.3F, 4.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 57)
            .cuboid(2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 57)
            .cuboid(-2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 4.0006F, -0.7044F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = left_leg2.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 42).cuboid(0.0F, -4.0F, 2.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, -1.0285F, -2.1931F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = left_leg2.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 39).cuboid(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -0.3739F, 0.1058F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = left_leg2.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 36).cuboid(0.0F, -4.0F, -3.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, -1.0285F, 3.5931F, 1.1345F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public void prepareMobModel(T entity, float limbSwing, float limbSwingAmount, float partialTick) {
      super.animateModel(entity, limbSwing, limbSwingAmount, partialTick);
      this.mainArm = entity.getMainArm();
      this.sprint = entity.getSprint(partialTick);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.root.traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      this.updateAnimation(entity.jumpAnimState, EwokAnimation.JUMP, ageInTicks);
      float f = 1.0F - (float)entity.jumpAnimState.getTimeRunning() / 250.0F;
      if (f > 0.0F) {
         if (entity.attackAnimState.isRunning()) {
            che.swgc.client.compat.animation.Animation anim = entity.firstAttack ? EwokAnimation.ATTACK : EwokAnimation.ATTACK2;
            this.updateAnimation(entity.attackAnimState, anim, ageInTicks);
            if ((float)entity.attackAnimState.getTimeRunning() >= anim.comp_597() * 1000.0F) {
               entity.attackAnimState.stop();
            }
         } else {
            this.animateMovement(EwokAnimation.WALK, limbSwing, limbSwingAmount, 1.5F, f * (1.0F - this.sprint));
            this.animateMovement(EwokAnimation.RUN, limbSwing, limbSwingAmount, 1.0F, f * this.sprint);
            this.animateMovement(EwokAnimation.IDLE, ageInTicks, 1.0F - limbSwingAmount * (1.5F - this.sprint * 0.5F), 1.0F, f);
         }
      }

      if (this.mainArm == net.minecraft.world.entity.HumanoidArm.RIGHT) {
         SwgcClientUtils.mirrorModel(
            Set.of(this.root, this.body, this.head, this.item),
            this.right_arm,
            this.left_arm,
            this.right_arm2,
            this.left_arm2,
            this.right_leg,
            this.left_leg,
            this.right_leg2,
            this.left_leg2
         );
      }

      this.head.yRot += netHeadYaw * (float) Math.PI / 180.0F;
      this.head.xRot += headPitch * (float) Math.PI / 180.0F;
   }

   public void setArmAngle(net.minecraft.world.entity.HumanoidArm humanoidArm, com.mojang.blaze3d.vertex.PoseStack poseStack) {
      this.root.rotate(poseStack);
      this.body.rotate(poseStack);
      if (humanoidArm == net.minecraft.world.entity.HumanoidArm.LEFT) {
         this.left_arm.rotate(poseStack);
         this.left_arm2.rotate(poseStack);
      } else {
         this.right_arm.rotate(poseStack);
         this.right_arm2.rotate(poseStack);
      }

      if (this.mainArm == humanoidArm) {
         this.item.rotate(poseStack);
         poseStack.translate(humanoidArm == net.minecraft.world.entity.HumanoidArm.LEFT ? -0.0625F : 0.0625F, -0.5625F, 0.125F);
      } else {
         poseStack.translate(0.0F, 0.144F, 0.0F);
      }
   }
}
