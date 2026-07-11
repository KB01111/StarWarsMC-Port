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
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild("head", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-4.0041F, 0.0026F, -1.9076F, 8.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 19)
            .cuboid(-3.0041F, 8.0026F, -1.3576F, 6.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.5F))
            .uv(42, 46)
            .cuboid(-3.0041F, 10.0026F, -1.5076F, 6.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0041F, -0.0026F, -0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 19).cuboid(-3.0F, -2.0F, -1.6F, 6.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 12.0026F, 2.7924F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 49).cuboid(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0041F, 11.4614F, -0.6011F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 46).cuboid(-3.0F, -4.1F, -0.3F, 6.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 8.5026F, -1.2076F, 0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(30, 51).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.7409F, 9.1517F, 0.1924F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r5 = body.addChild(
         "body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 51).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.7326F, 9.1517F, 0.1924F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r6 = body.addChild(
         "body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 12).cuboid(-1.0F, -2.1F, -1.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.4829F, 6.7586F, 0.0924F, 0.0F, 0.0F, 0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r7 = body.addChild(
         "body_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(42, 49).cuboid(-1.0F, -2.1F, -1.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.4912F, 6.7586F, 0.0924F, 0.0F, 0.0F, -0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r8 = body.addChild(
         "body_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 13).cuboid(-3.0F, 0.0F, -2.6F, 6.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 5.0026F, 1.6924F, -0.0567F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition oh_my = body.addChild("oh_my", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-0.0041F, 3.5026F, -1.8076F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = oh_my.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 6).cuboid(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, 0.0F, 0.0F, -0.4784F, 0.0403F, 0.0774F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = oh_my.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 0).cuboid(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, 0.0F, 0.0F, -0.4784F, -0.0403F, -0.0774F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 25)
            .cuboid(-1.9881F, -1.3913F, -2.0F, 3.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 38)
            .cuboid(-1.9881F, 1.6087F, -2.0F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(0, 49)
            .cuboid(0.0326F, 5.7448F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.0119F, 1.3913F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r1 = right_arm.addChild(
         "right_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 41).cuboid(-0.8F, -1.9F, -2.175F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5193F, 7.2947F, 0.175F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(14, 25)
            .cuboid(-1.0119F, -1.3913F, -2.0F, 3.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(14, 41)
            .cuboid(-1.0119F, 1.6087F, -2.0F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(10, 49)
            .cuboid(-1.0326F, 5.7448F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F)),
         net.minecraft.client.model.geom.PartPose.pivot(5.0119F, 1.3913F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r1 = left_arm.addChild(
         "left_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(42, 38).cuboid(-2.2F, -1.9F, -2.175F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F)),
         net.minecraft.client.model.geom.PartPose.of(1.5193F, 7.2947F, 0.175F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 9).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 9).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createFemaleInnerLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = CommonModelLayers.emptyHumanoidMesh();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 16)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-2.0225F, 0.7929F, -2.0F, 4.0F, 9.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.12F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg_r1 = right_leg.addChild(
         "right_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 0).cuboid(-1.8F, -5.0F, -2.05F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.of(-0.6F, 4.0F, 0.05F, 0.0F, 0.0F, 0.1134F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 16)
            .mirrored()
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(16, 0)
            .cuboid(-1.9775F, 0.7929F, -2.0F, 4.0F, 9.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.12F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg_r1 = left_leg.addChild(
         "left_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 6).cuboid(-2.2F, -5.0F, -2.05F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.of(0.6F, 4.0F, 0.05F, 0.0F, 0.0F, -0.1134F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMaleOuterLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild("head", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 6)
            .cuboid(-3.0F, 4.0F, -2.0F, 6.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 0)
            .cuboid(-4.0F, 8.2F, -2.0F, 8.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(10, 53)
            .cuboid(-3.075F, 8.3F, -1.9F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(48, 44)
            .cuboid(-0.375F, 8.3F, -1.9F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(52, 8)
            .cuboid(-0.175F, 8.2F, 1.0F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 5).cuboid(-3.0F, -2.0F, -0.6F, 6.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 12.0F, 1.7F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(10, 56).cuboid(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, 11.1888F, -0.9415F, -0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 0).cuboid(-3.0F, -4.1F, -0.3F, 6.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 9.0582F, -1.3438F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 47).cuboid(-1.0F, -2.5F, -1.95F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.05F)),
         net.minecraft.client.model.geom.PartPose.of(-4.0607F, 2.7001F, -0.05F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r5 = body.addChild(
         "body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 47).cuboid(-1.0F, -2.5F, -1.95F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.05F)),
         net.minecraft.client.model.geom.PartPose.of(4.0607F, 2.7001F, -0.05F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r6 = body.addChild(
         "body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 53).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.6988F, 8.6005F, 0.0F, 0.0F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r7 = body.addChild(
         "body_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 52).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.6988F, 8.6005F, 0.0F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r8 = body.addChild(
         "body_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 28).cuboid(-1.0F, -3.1F, -1.5F, 2.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.828F, 7.0241F, 0.0F, 0.0F, 0.0F, -0.0698F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r9 = body.addChild(
         "body_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 20).cuboid(-1.0F, -3.1F, -1.5F, 2.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.828F, 7.0241F, 0.0F, 0.0F, 0.0F, 0.0698F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r10 = body.addChild(
         "body_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 47).cuboid(-3.0F, 0.0F, -2.6F, 6.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 5.0F, 2.6F, -0.0567F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition shell = body.addChild(
         "shell",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(22, 56).cuboid(-2.0F, -0.4F, -0.025F, 4.0F, 6.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, -2.1F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 24)
            .cuboid(-2.9968F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 20)
            .cuboid(-3.0218F, -0.3114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(52, 44)
            .cuboid(-0.0011F, 4.7248F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.12F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.0032F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r1 = right_arm.addChild(
         "right_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 39).cuboid(-2.125F, -1.9F, -2.125F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2531F, 6.3747F, 0.125F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r2 = right_arm.addChild(
         "right_arm_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 11).cuboid(-2.2F, -2.9F, -2.175F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F)),
         net.minecraft.client.model.geom.PartPose.of(-0.699F, 0.7702F, 0.15F, 0.0F, 0.0F, 1.309F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 24)
            .cuboid(-1.0032F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 11)
            .cuboid(-0.9782F, -0.3114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(48, 36)
            .cuboid(-0.9989F, 4.7248F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.12F)),
         net.minecraft.client.model.geom.PartPose.pivot(5.0032F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r1 = left_arm.addChild(
         "left_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 39).cuboid(-1.875F, -1.9F, -2.125F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.of(1.2531F, 6.3747F, 0.125F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r2 = left_arm.addChild(
         "left_arm_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(40, 47).cuboid(0.2F, -2.9F, -2.175F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F)),
         net.minecraft.client.model.geom.PartPose.of(0.699F, 0.7702F, 0.15F, 0.0F, 0.0F, -1.309F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 8).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 8).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMaleInnerLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = CommonModelLayers.emptyHumanoidMesh();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg_r1 = right_leg.addChild(
         "right_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-2.1F, -2.45F, -2.1F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, 2.15F, 0.1F, 0.0F, 0.0F, 0.1309F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 16)
            .mirrored()
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg_r1 = left_leg.addChild(
         "left_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .mirrored()
            .cuboid(-1.9F, -2.45F, -2.1F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.2F, 2.15F, 0.1F, 0.0F, 0.0F, -0.1309F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMale2OuterLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild("head", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(26, 16)
            .cuboid(-4.0041F, 0.0026F, -1.9076F, 8.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 52)
            .cuboid(-0.0041F, 12.0026F, -2.6076F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 33)
            .cuboid(-3.0041F, 4.0026F, -1.9076F, 6.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 16)
            .cuboid(-4.0791F, 7.2026F, -2.4076F, 8.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 57)
            .cuboid(-3.5791F, 8.3026F, -2.5076F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(58, 21)
            .cuboid(-0.8791F, 8.3026F, -2.5076F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(50, 21)
            .cuboid(0.3209F, 8.3026F, 1.6924F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 38)
            .cuboid(-3.0041F, 12.0026F, 1.6424F, 6.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0041F, -0.0026F, -0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 29).cuboid(-3.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 12.0026F, 2.6424F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(56, 52).cuboid(0.7659F, -3.4975F, -0.7827F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0038F, 6.2769F, -1.4328F, 0.0438F, 0.0038F, 0.0872F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r1 = body.addChild(
         "left_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 8).cuboid(-4.1F, -1.4F, -2.475F, 9.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.of(3.4556F, 4.5243F, 0.0924F, 0.0F, 0.0F, -1.2043F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 40).cuboid(-1.4948F, -5.2111F, -2.45F, 3.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.of(2.3907F, 4.8175F, 0.1052F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(10, 49).cuboid(-1.25F, -3.3F, -1.1F, 3.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.of(0.7684F, 6.2606F, 1.6382F, -0.0436F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r5 = body.addChild(
         "body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 49).cuboid(-1.75F, -3.3F, -1.1F, 3.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7767F, 6.2606F, 1.6382F, -0.0436F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r6 = body.addChild(
         "body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 38).cuboid(-1.5052F, -5.2111F, -2.45F, 3.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.of(-2.399F, 4.8175F, 0.1052F, 0.0F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r7 = body.addChild(
         "body_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(38, 55).cuboid(-3.7659F, -3.4975F, -0.7827F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0045F, 6.2769F, -1.4328F, 0.0438F, -0.0038F, -0.0872F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r8 = body.addChild(
         "body_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 24).cuboid(-3.0F, -3.5F, -0.3F, 6.0F, 3.4F, 1.6F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 8.4631F, -1.3037F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r9 = body.addChild(
         "body_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(10, 57).cuboid(-1.5F, -2.9772F, -0.7605F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5041F, 13.097F, -2.0284F, -0.1745F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r10 = body.addChild(
         "body_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(30, 55).cuboid(-1.5F, -1.0944F, -0.5792F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5041F, 13.097F, -2.0284F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r11 = body.addChild(
         "body_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 57).cuboid(-1.5F, -2.9772F, -0.7605F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.4959F, 13.097F, -2.0284F, -0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r12 = body.addChild(
         "body_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 44).cuboid(-1.5563F, 0.0781F, -1.6628F, 2.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.449F, 3.7175F, 0.1052F, 0.0F, 0.0F, -0.0698F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r13 = body.addChild(
         "body_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 32).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.7029F, 8.603F, -0.0576F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r14 = body.addChild(
         "body_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 15).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.6946F, 8.603F, -0.0576F, 0.0F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r15 = body.addChild(
         "body_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 9).cuboid(-3.0F, 0.0F, -2.6F, 6.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 5.0026F, 2.6924F, -0.0567F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r1 = body.addChild(
         "right_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-4.9F, -1.4F, -2.475F, 9.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.of(-3.4639F, 4.5243F, 0.0924F, 0.0F, 0.0F, 1.2043F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(28, 0)
            .mirrored()
            .cuboid(-2.9968F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(20, 49)
            .mirrored()
            .cuboid(-0.0011F, 4.7748F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .mirrored(false)
            .uv(32, 24)
            .mirrored()
            .cuboid(-2.9968F, -0.4114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(-5.0032F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r2 = right_arm.addChild(
         "right_arm_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 47)
            .mirrored()
            .cuboid(-2.125F, -1.9F, -2.125F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.11F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-1.2781F, 6.3747F, 0.125F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(28, 0)
            .cuboid(-1.0032F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 49)
            .cuboid(-0.9989F, 4.7748F, -2.0F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .uv(32, 24)
            .cuboid(-1.0032F, -0.4114F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.pivot(5.0032F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r2 = left_arm.addChild(
         "left_arm_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 47).cuboid(-1.875F, -1.9F, -2.125F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.11F)),
         net.minecraft.client.model.geom.PartPose.of(1.2781F, 6.3747F, 0.125F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 24).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 24).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }
}
