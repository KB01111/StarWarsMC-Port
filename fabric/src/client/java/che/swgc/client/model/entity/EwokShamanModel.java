package che.swgc.client.model.entity;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.animation.EwokShamanAnimation;
import che.swgc.entity.AbstractEwok;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.resources.Identifier;
import che.swgc.client.compat.model.ModelWithArms;
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
public class EwokShamanModel<T extends AbstractEwok> extends EwokModel<T> implements che.swgc.client.compat.model.ModelWithArms {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "ewok_shaman"), "main");

   public EwokShamanModel(net.minecraft.client.model.geom.ModelPart root) {
      super(root);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 16)
            .cuboid(-4.0F, -3.9332F, -3.374F, 8.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(58, 27)
            .cuboid(-3.0F, 2.0668F, 2.626F, 6.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 28)
            .cuboid(-3.0F, 1.5668F, -2.424F, 6.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 13.9332F, 0.374F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition head = body.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(30, 36)
            .cuboid(-1.5F, -10.2F, -1.1F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, -3.9332F, -0.374F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = head.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(36, 49).cuboid(-1.5F, -1.5F, -1.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.0F, -8.1F, 1.3F, -0.5861F, -1.2176F, 0.2127F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = head.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(26, 49).cuboid(-0.5F, -1.5F, -1.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.0F, -8.1F, 1.3F, -0.5861F, 1.2176F, -0.2127F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = head.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 42).cuboid(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -7.8866F, -4.2194F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = head.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 16).cuboid(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -9.8F, 0.4F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = head.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 0).cuboid(1.0F, 1.0F, -2.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7F, -13.1F, 2.0F, 0.6108F, 0.4943F, 0.1062F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = head.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 48).cuboid(-2.0F, 1.0F, -2.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7F, -13.1F, 2.0F, 0.6108F, -0.4943F, -0.1062F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = body.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 36)
            .cuboid(-1.0812F, -1.4833F, -2.0167F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(56, 30)
            .cuboid(-1.1062F, -1.4833F, -2.0167F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.9188F, -2.4499F, -0.3574F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm2 = right_arm.addChild(
         "right_arm2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(44, 38)
            .cuboid(-1.7685F, -0.0498F, -1.525F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 50)
            .cuboid(-1.7935F, -0.0498F, -1.525F, 0.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.6873F, 2.5666F, -0.4917F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = right_arm2.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 49).cuboid(2.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.8685F, -0.0498F, 2.475F, -0.4712F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = right_arm2.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 19).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2685F, -0.3997F, -0.2935F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = right_arm2.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(30, 43).cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 2.3F, 0.0F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = body.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(36, 24)
            .cuboid(-1.9188F, -1.4833F, -2.0167F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 56)
            .cuboid(1.1062F, -1.4833F, -2.0167F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(5.9188F, -2.4499F, -0.3574F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm2 = left_arm.addChild(
         "left_arm2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 6)
            .cuboid(-1.2315F, -0.0498F, -1.525F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 64)
            .cuboid(1.7935F, -0.0498F, -1.525F, 0.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.6873F, 2.5666F, -0.4917F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = left_arm2.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 54).cuboid(-4.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.8685F, -0.0498F, 2.475F, -0.4712F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = left_arm2.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 23).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.2685F, -0.3997F, -0.2935F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = left_arm2.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(42, 43).cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 2.3F, 0.0F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition item = left_arm2.addChild("item", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 2.3F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = body.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 54)
            .cuboid(-2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(50, 22)
            .cuboid(2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 28)
            .cuboid(-2.0F, 6.0E-4F, -2.0044F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 2.0662F, -0.3696F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = right_leg.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(8, 58).cuboid(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.025F, -2.1021F, -0.8647F, -0.7941F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = right_leg.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 57).cuboid(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, 6.0E-4F, -3.0044F, 0.3403F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg2 = right_leg.addChild(
         "right_leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 0)
            .cuboid(-2.0F, 0.0F, -1.3F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(60, 9)
            .cuboid(-2.0F, 3.0F, -2.3F, 4.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(46, 49)
            .cuboid(-2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 50)
            .cuboid(2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 4.0006F, -0.7044F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = right_leg2.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 61).cuboid(-4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, -1.0285F, -2.1931F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = right_leg2.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 62).cuboid(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -0.3739F, 0.1058F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = right_leg2.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 6).cuboid(-4.0F, -4.0F, -3.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, -1.0285F, 3.5931F, 1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = body.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(20, 56)
            .cuboid(2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 56)
            .cuboid(-2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 34)
            .cuboid(-2.0F, 6.0E-4F, -2.0044F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 2.0662F, -0.3696F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = left_leg.addChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 15).cuboid(0.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.025F, -2.1021F, -0.8647F, -0.7941F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = left_leg.addChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 11).cuboid(0.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, 6.0E-4F, -3.0044F, 0.3403F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg2 = left_leg.addChild(
         "left_leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 8)
            .cuboid(-2.0F, 0.0F, -1.3F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 59)
            .cuboid(-2.0F, 3.0F, -2.3F, 4.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(54, 43)
            .cuboid(2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(54, 51)
            .cuboid(-2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 4.0006F, -0.7044F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = left_leg2.addChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 46).cuboid(0.0F, -4.0F, 2.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, -1.0285F, -2.1931F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = left_leg2.addChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 43).cuboid(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -0.3739F, 0.1058F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = left_leg2.addChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(10, 62).cuboid(0.0F, -4.0F, -3.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, -1.0285F, 3.5931F, 1.1345F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   @Override
   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.getPart().traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      this.updateAnimation(entity.jumpAnimState, EwokShamanAnimation.JUMP, ageInTicks);
      float f = 1.0F - (float)entity.jumpAnimState.getTimeRunning() / 250.0F;
      if (f > 0.0F) {
         if (entity.attackAnimState.isRunning()) {
            che.swgc.client.compat.animation.Animation anim = entity.firstAttack ? EwokShamanAnimation.ATTACK : EwokShamanAnimation.ATTACK2;
            this.updateAnimation(entity.attackAnimState, anim, ageInTicks);
            if ((float)entity.attackAnimState.getTimeRunning() >= anim.comp_597() * 1000.0F) {
               entity.attackAnimState.stop();
            }
         } else {
            this.animateMovement(EwokShamanAnimation.WALK, limbSwing, limbSwingAmount, 1.5F, f * (1.0F - this.sprint));
            this.animateMovement(EwokShamanAnimation.RUN, limbSwing, limbSwingAmount, 1.0F, f * this.sprint);
            this.animateMovement(EwokShamanAnimation.IDLE, 0.0F, 1.0F - limbSwingAmount * (1.5F - this.sprint * 0.5F), 1.0F, f);
         }
      }

      if (this.mainArm == net.minecraft.world.entity.HumanoidArm.RIGHT) {
         SwgcClientUtils.mirrorModel(
            Set.of(this.getPart(), this.body, this.head, this.item),
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
}
