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
public class EwokShamanModel extends EwokModel implements che.swgc.client.compat.model.ModelWithArms {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "ewok_shaman"), "main");

   public EwokShamanModel(net.minecraft.client.model.geom.ModelPart root) {
      super(root);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addOrReplaceChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(-4.0F, -3.9332F, -3.374F, 8.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(58, 27)
            .addBox(-3.0F, 2.0668F, 2.626F, 6.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 28)
            .addBox(-3.0F, 1.5668F, -2.424F, 6.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 13.9332F, 0.374F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition head = body.addOrReplaceChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(30, 36)
            .addBox(-1.5F, -10.2F, -1.1F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, -3.9332F, -0.374F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = head.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 49).addBox(-1.5F, -1.5F, -1.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.0F, -8.1F, 1.3F, -0.5861F, -1.2176F, 0.2127F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = head.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(26, 49).addBox(-0.5F, -1.5F, -1.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, -8.1F, 1.3F, -0.5861F, 1.2176F, -0.2127F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = head.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 42).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -7.8866F, -4.2194F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = head.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 16).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -9.8F, 0.4F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = head.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 0).addBox(1.0F, 1.0F, -2.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.7F, -13.1F, 2.0F, 0.6108F, 0.4943F, 0.1062F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = head.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 1.0F, -2.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.7F, -13.1F, 2.0F, 0.6108F, -0.4943F, -0.1062F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = body.addOrReplaceChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 36)
            .addBox(-1.0812F, -1.4833F, -2.0167F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(56, 30)
            .addBox(-1.1062F, -1.4833F, -2.0167F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-5.9188F, -2.4499F, -0.3574F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm2 = right_arm.addOrReplaceChild(
         "right_arm2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(44, 38)
            .addBox(-1.7685F, -0.0498F, -1.525F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 50)
            .addBox(-1.7935F, -0.0498F, -1.525F, 0.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.6873F, 2.5666F, -0.4917F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = right_arm2.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(62, 49).addBox(2.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.8685F, -0.0498F, 2.475F, -0.4712F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = right_arm2.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(58, 19).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2685F, -0.3997F, -0.2935F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = right_arm2.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(30, 43).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 2.3F, 0.0F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = body.addOrReplaceChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(36, 24)
            .addBox(-1.9188F, -1.4833F, -2.0167F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 56)
            .addBox(1.1062F, -1.4833F, -2.0167F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(5.9188F, -2.4499F, -0.3574F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm2 = left_arm.addOrReplaceChild(
         "left_arm2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(48, 6)
            .addBox(-1.2315F, -0.0498F, -1.525F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 64)
            .addBox(1.7935F, -0.0498F, -1.525F, 0.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-0.6873F, 2.5666F, -0.4917F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = left_arm2.addOrReplaceChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(62, 54).addBox(-4.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.8685F, -0.0498F, 2.475F, -0.4712F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = left_arm2.addOrReplaceChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(58, 23).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2685F, -0.3997F, -0.2935F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = left_arm2.addOrReplaceChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(42, 43).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 2.3F, 0.0F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition item = left_arm2.addOrReplaceChild("item", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 2.3F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = body.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 54)
            .addBox(-2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(50, 22)
            .addBox(2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 28)
            .addBox(-2.0F, 6.0E-4F, -2.0044F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, 2.0662F, -0.3696F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = right_leg.addOrReplaceChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(8, 58).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.025F, -2.1021F, -0.8647F, -0.7941F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = right_leg.addOrReplaceChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 57).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.0F, 6.0E-4F, -3.0044F, 0.3403F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg2 = right_leg.addOrReplaceChild(
         "right_leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(32, 0)
            .addBox(-2.0F, 0.0F, -1.3F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(60, 9)
            .addBox(-2.0F, 3.0F, -2.3F, 4.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(46, 49)
            .addBox(-2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 50)
            .addBox(2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 4.0006F, -0.7044F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = right_leg2.addOrReplaceChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 61).addBox(-4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.0F, -1.0285F, -2.1931F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = right_leg2.addOrReplaceChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 62).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.3739F, 0.1058F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = right_leg2.addOrReplaceChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 6).addBox(-4.0F, -4.0F, -3.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.0F, -1.0285F, 3.5931F, 1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = body.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(20, 56)
            .addBox(2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 56)
            .addBox(-2.025F, 6.0E-4F, -2.0044F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 34)
            .addBox(-2.0F, 6.0E-4F, -2.0044F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, 2.0662F, -0.3696F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = left_leg.addOrReplaceChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(58, 15).addBox(0.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.025F, -2.1021F, -0.8647F, -0.7941F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = left_leg.addOrReplaceChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(58, 11).addBox(0.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.0F, 6.0E-4F, -3.0044F, 0.3403F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg2 = left_leg.addOrReplaceChild(
         "left_leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(32, 8)
            .addBox(-2.0F, 0.0F, -1.3F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(62, 59)
            .addBox(-2.0F, 3.0F, -2.3F, 4.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(54, 43)
            .addBox(2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(54, 51)
            .addBox(-2.025F, 0.0F, -1.3F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 4.0006F, -0.7044F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = left_leg2.addOrReplaceChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(62, 46).addBox(0.0F, -4.0F, 2.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.0F, -1.0285F, -2.1931F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = left_leg2.addOrReplaceChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(62, 43).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.3739F, 0.1058F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = left_leg2.addOrReplaceChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(10, 62).addBox(0.0F, -4.0F, -3.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.0F, -1.0285F, 3.5931F, 1.1345F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void setupAnim(che.swgc.client.render.SwgcMobRenderState state) {
      super.setupAnim(state);
      float limbSwing = state.walkAnimationPos;
      float limbSwingAmount = state.walkAnimationSpeed;
      float ageInTicks = state.ageInTicks;
      float netHeadYaw = state.yRot;
      float headPitch = state.xRot;

      che.swgc.entity.AbstractEwok entity = (che.swgc.entity.AbstractEwok)state.entity;
      this.getPart().getAllParts().forEach(net.minecraft.client.model.geom.ModelPart::resetPose);
      this.updateAnimation(entity.jumpAnimState, EwokShamanAnimation.JUMP, ageInTicks);
      float f = 1.0F - (float)entity.jumpAnimState.getTimeInMillis(ageInTicks) / 250.0F;
      if (f > 0.0F) {
         if (entity.attackAnimState.isStarted()) {
            che.swgc.client.compat.animation.Animation anim = entity.firstAttack ? EwokShamanAnimation.ATTACK : EwokShamanAnimation.ATTACK2;
            this.updateAnimation(entity.attackAnimState, anim, ageInTicks);
            if ((float)entity.attackAnimState.getTimeInMillis(ageInTicks) >= anim.comp_597() * 1000.0F) {
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
