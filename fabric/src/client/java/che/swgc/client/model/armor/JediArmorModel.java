package che.swgc.client.model.armor;

import che.swgc.client.model.CommonModelLayers;
import net.minecraft.resources.Identifier;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class JediArmorModel {
   public static final net.minecraft.client.model.geom.ModelLayerLocation FEMALE_OUTER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "jedi_female"), "outer_armor");
   public static final net.minecraft.client.model.geom.ModelLayerLocation FEMALE_INNER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "jedi_female"), "inner_armor");
   public static final net.minecraft.client.model.geom.ModelLayerLocation MALE_OUTER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "jedi_male"), "outer_armor");
   public static final net.minecraft.client.model.geom.ModelLayerLocation MALE_INNER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "jedi_male"), "inner_armor");
   public static final net.minecraft.client.model.geom.ModelLayerLocation MALE_2_OUTER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "jedi_male_2"), "outer_armor");

   public JediArmorModel() {
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createFemaleOuterLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addOrReplaceChild("head", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.ZERO);
      net.minecraft.client.model.geom.builders.PartDefinition hat = head.addOrReplaceChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.ZERO);
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addOrReplaceChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0041F, 0.0026F, -1.9076F, 8.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 19)
            .addBox(-3.0041F, 8.0026F, -1.3576F, 6.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.5F))
            .texOffs(42, 46)
            .addBox(-3.0041F, 10.0026F, -1.5076F, 6.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0041F, -0.0026F, -0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addOrReplaceChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 19).addBox(-3.0F, -2.0F, -1.6F, 6.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0041F, 12.0026F, 2.7924F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addOrReplaceChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(52, 49).addBox(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.0041F, 11.4614F, -0.6011F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addOrReplaceChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 46).addBox(-3.0F, -4.1F, -0.3F, 6.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0041F, 8.5026F, -1.2076F, 0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addOrReplaceChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(30, 51).addBox(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.7409F, 9.1517F, 0.1924F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r5 = body.addOrReplaceChild(
         "body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 51).addBox(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.7326F, 9.1517F, 0.1924F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r6 = body.addOrReplaceChild(
         "body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 12).addBox(-1.0F, -2.1F, -1.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.4829F, 6.7586F, 0.0924F, 0.0F, 0.0F, 0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r7 = body.addOrReplaceChild(
         "body_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(42, 49).addBox(-1.0F, -2.1F, -1.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.4912F, 6.7586F, 0.0924F, 0.0F, 0.0F, -0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r8 = body.addOrReplaceChild(
         "body_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 13).addBox(-3.0F, 0.0F, -2.6F, 6.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0041F, 5.0026F, 1.6924F, -0.0567F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition oh_my = body.addOrReplaceChild("oh_my", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-0.0041F, 3.5026F, -1.8076F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = oh_my.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 6).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.4784F, 0.0403F, 0.0774F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = oh_my.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, -0.4784F, -0.0403F, -0.0774F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addOrReplaceChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 25)
            .addBox(-1.9881F, -1.3913F, -2.0F, 3.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 38)
            .addBox(-1.9881F, 1.6087F, -2.0F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(0, 49)
            .addBox(0.0326F, 5.7448F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F)),
         net.minecraft.client.model.geom.PartPose.offset(-5.0119F, 1.3913F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r1 = right_arm.addOrReplaceChild(
         "right_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 41).addBox(-0.8F, -1.9F, -2.175F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5193F, 7.2947F, 0.175F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addOrReplaceChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(14, 25)
            .addBox(-1.0119F, -1.3913F, -2.0F, 3.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(14, 41)
            .addBox(-1.0119F, 1.6087F, -2.0F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(10, 49)
            .addBox(-1.0326F, 5.7448F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F)),
         net.minecraft.client.model.geom.PartPose.offset(5.0119F, 1.3913F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r1 = left_arm.addOrReplaceChild(
         "left_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(42, 38).addBox(-2.2F, -1.9F, -2.175F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.5193F, 7.2947F, 0.175F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 9).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 9).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createFemaleInnerLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = CommonModelLayers.emptyHumanoidMesh();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.0225F, 0.7929F, -2.0F, 4.0F, 9.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.12F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg_r1 = right_leg.addOrReplaceChild(
         "right_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 0).addBox(-1.8F, -5.0F, -2.05F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.6F, 4.0F, 0.05F, 0.0F, 0.0F, 0.1134F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 16)
            .mirror()
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(16, 0)
            .addBox(-1.9775F, 0.7929F, -2.0F, 4.0F, 9.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.12F)),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg_r1 = left_leg.addOrReplaceChild(
         "left_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 6).addBox(-2.2F, -5.0F, -2.05F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.6F, 4.0F, 0.05F, 0.0F, 0.0F, -0.1134F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMaleOuterLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addOrReplaceChild("head", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.ZERO);
      net.minecraft.client.model.geom.builders.PartDefinition hat = head.addOrReplaceChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.ZERO);
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addOrReplaceChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0F, 0.0F, -2.0F, 8.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 6)
            .addBox(-3.0F, 4.0F, -2.0F, 6.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-4.0F, 8.2F, -2.0F, 8.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(10, 53)
            .addBox(-3.075F, 8.3F, -1.9F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(48, 44)
            .addBox(-0.375F, 8.3F, -1.9F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(52, 8)
            .addBox(-0.175F, 8.2F, 1.0F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addOrReplaceChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(52, 5).addBox(-3.0F, -2.0F, -0.6F, 6.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 12.0F, 1.7F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addOrReplaceChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(10, 56).addBox(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.0F, 11.1888F, -0.9415F, -0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addOrReplaceChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 0).addBox(-3.0F, -4.1F, -0.3F, 6.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 9.0582F, -1.3438F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addOrReplaceChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 47).addBox(-1.0F, -2.5F, -1.95F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.05F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.0607F, 2.7001F, -0.05F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r5 = body.addOrReplaceChild(
         "body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 47).addBox(-1.0F, -2.5F, -1.95F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.05F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.0607F, 2.7001F, -0.05F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r6 = body.addOrReplaceChild(
         "body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.6988F, 8.6005F, 0.0F, 0.0F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r7 = body.addOrReplaceChild(
         "body_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(52, 52).addBox(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.6988F, 8.6005F, 0.0F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r8 = body.addOrReplaceChild(
         "body_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 28).addBox(-1.0F, -3.1F, -1.5F, 2.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.828F, 7.0241F, 0.0F, 0.0F, 0.0F, -0.0698F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r9 = body.addOrReplaceChild(
         "body_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 20).addBox(-1.0F, -3.1F, -1.5F, 2.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.828F, 7.0241F, 0.0F, 0.0F, 0.0F, 0.0698F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r10 = body.addOrReplaceChild(
         "body_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 47).addBox(-3.0F, 0.0F, -2.6F, 6.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 5.0F, 2.6F, -0.0567F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition shell = body.addOrReplaceChild(
         "shell",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(22, 56).addBox(-2.0F, -0.4F, -0.025F, 4.0F, 6.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, -2.1F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addOrReplaceChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 24)
            .addBox(-2.9968F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 20)
            .addBox(-3.0218F, -0.3114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(52, 44)
            .addBox(-0.0011F, 4.7248F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.12F)),
         net.minecraft.client.model.geom.PartPose.offset(-5.0032F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r1 = right_arm.addOrReplaceChild(
         "right_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 39).addBox(-2.125F, -1.9F, -2.125F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2531F, 6.3747F, 0.125F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r2 = right_arm.addOrReplaceChild(
         "right_arm_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 11).addBox(-2.2F, -2.9F, -2.175F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.699F, 0.7702F, 0.15F, 0.0F, 0.0F, 1.309F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addOrReplaceChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 24)
            .addBox(-1.0032F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 11)
            .addBox(-0.9782F, -0.3114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(48, 36)
            .addBox(-0.9989F, 4.7248F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.12F)),
         net.minecraft.client.model.geom.PartPose.offset(5.0032F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r1 = left_arm.addOrReplaceChild(
         "left_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 39).addBox(-1.875F, -1.9F, -2.125F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.2531F, 6.3747F, 0.125F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r2 = left_arm.addOrReplaceChild(
         "left_arm_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(40, 47).addBox(0.2F, -2.9F, -2.175F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.699F, 0.7702F, 0.15F, 0.0F, 0.0F, -1.309F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 8).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMaleInnerLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = CommonModelLayers.emptyHumanoidMesh();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg_r1 = right_leg.addOrReplaceChild(
         "right_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, -2.45F, -2.1F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, 2.15F, 0.1F, 0.0F, 0.0F, 0.1309F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 16)
            .mirror()
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg_r1 = left_leg.addOrReplaceChild(
         "left_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .mirror()
            .addBox(-1.9F, -2.45F, -2.1F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2F, 2.15F, 0.1F, 0.0F, 0.0F, -0.1309F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMale2OuterLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addOrReplaceChild("head", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition hat = head.addOrReplaceChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addOrReplaceChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(26, 16)
            .addBox(-4.0041F, 0.0026F, -1.9076F, 8.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(48, 52)
            .addBox(-0.0041F, 12.0026F, -2.6076F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 33)
            .addBox(-3.0041F, 4.0026F, -1.9076F, 6.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-4.0791F, 7.2026F, -2.4076F, 8.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 57)
            .addBox(-3.5791F, 8.3026F, -2.5076F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(58, 21)
            .addBox(-0.8791F, 8.3026F, -2.5076F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(50, 21)
            .addBox(0.3209F, 8.3026F, 1.6924F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(48, 38)
            .addBox(-3.0041F, 12.0026F, 1.6424F, 6.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0041F, -0.0026F, -0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addOrReplaceChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 29).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0041F, 12.0026F, 2.6424F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addOrReplaceChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(56, 52).addBox(0.7659F, -3.4975F, -0.7827F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0038F, 6.2769F, -1.4328F, 0.0438F, 0.0038F, 0.0872F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r1 = body.addOrReplaceChild(
         "left_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 8).addBox(-4.1F, -1.4F, -2.475F, 9.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.4556F, 4.5243F, 0.0924F, 0.0F, 0.0F, -1.2043F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addOrReplaceChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 40).addBox(-1.4948F, -5.2111F, -2.45F, 3.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.3907F, 4.8175F, 0.1052F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addOrReplaceChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(10, 49).addBox(-1.25F, -3.3F, -1.1F, 3.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.7684F, 6.2606F, 1.6382F, -0.0436F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r5 = body.addOrReplaceChild(
         "body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 49).addBox(-1.75F, -3.3F, -1.1F, 3.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.7767F, 6.2606F, 1.6382F, -0.0436F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r6 = body.addOrReplaceChild(
         "body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 38).addBox(-1.5052F, -5.2111F, -2.45F, 3.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.399F, 4.8175F, 0.1052F, 0.0F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r7 = body.addOrReplaceChild(
         "body_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(38, 55).addBox(-3.7659F, -3.4975F, -0.7827F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0045F, 6.2769F, -1.4328F, 0.0438F, -0.0038F, -0.0872F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r8 = body.addOrReplaceChild(
         "body_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 24).addBox(-3.0F, -3.5F, -0.3F, 6.0F, 3.4F, 1.6F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0041F, 8.4631F, -1.3037F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r9 = body.addOrReplaceChild(
         "body_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(10, 57).addBox(-1.5F, -2.9772F, -0.7605F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5041F, 13.097F, -2.0284F, -0.1745F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r10 = body.addOrReplaceChild(
         "body_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(30, 55).addBox(-1.5F, -1.0944F, -0.5792F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5041F, 13.097F, -2.0284F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r11 = body.addOrReplaceChild(
         "body_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 57).addBox(-1.5F, -2.9772F, -0.7605F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.4959F, 13.097F, -2.0284F, -0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r12 = body.addOrReplaceChild(
         "body_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 44).addBox(-1.5563F, 0.0781F, -1.6628F, 2.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.449F, 3.7175F, 0.1052F, 0.0F, 0.0F, -0.0698F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r13 = body.addOrReplaceChild(
         "body_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(52, 32).addBox(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.7029F, 8.603F, -0.0576F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r14 = body.addOrReplaceChild(
         "body_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 15).addBox(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.6946F, 8.603F, -0.0576F, 0.0F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r15 = body.addOrReplaceChild(
         "body_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 9).addBox(-3.0F, 0.0F, -2.6F, 6.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0041F, 5.0026F, 2.6924F, -0.0567F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r1 = body.addOrReplaceChild(
         "right_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 0).addBox(-4.9F, -1.4F, -2.475F, 9.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.4639F, 4.5243F, 0.0924F, 0.0F, 0.0F, 1.2043F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addOrReplaceChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(28, 0)
            .mirror()
            .addBox(-2.9968F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(20, 49)
            .mirror()
            .addBox(-0.0011F, 4.7748F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .mirror(false)
            .texOffs(32, 24)
            .mirror()
            .addBox(-2.9968F, -0.4114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(-5.0032F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r2 = right_arm.addOrReplaceChild(
         "right_arm_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(32, 47)
            .mirror()
            .addBox(-2.125F, -1.9F, -2.125F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.11F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2781F, 6.3747F, 0.125F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addOrReplaceChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(28, 0)
            .addBox(-1.0032F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 49)
            .addBox(-0.9989F, 4.7748F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .texOffs(32, 24)
            .addBox(-1.0032F, -0.4114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.offset(5.0032F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r2 = left_arm.addOrReplaceChild(
         "left_arm_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 47).addBox(-1.875F, -1.9F, -2.125F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.11F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.2781F, 6.3747F, 0.125F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }
}
