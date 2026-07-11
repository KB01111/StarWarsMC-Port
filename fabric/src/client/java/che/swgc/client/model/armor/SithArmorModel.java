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

public class SithArmorModel {
   public static final net.minecraft.client.model.geom.ModelLayerLocation FEMALE_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "sith_female"), "outer_armor");
   public static final net.minecraft.client.model.geom.ModelLayerLocation MALE_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "sith_male"), "outer_armor");
   public static final net.minecraft.client.model.geom.ModelLayerLocation MALE_2_OUTER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "sith_male_2"), "outer_armor");
   public static final net.minecraft.client.model.geom.ModelLayerLocation MALE_2_INNER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "sith_male_2"), "inner_armor");

   public SithArmorModel() {
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createFemaleLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-4.0F, -7.9F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild(
         "hat",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 17).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.5F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(33, 18)
            .cuboid(-4.0041F, 0.0026F, -1.9076F, 8.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(47, 52)
            .cuboid(-3.0041F, 8.0026F, -1.3076F, 6.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(41, 62)
            .cuboid(-1.7041F, 7.9026F, -1.8076F, 1.4F, 2.2F, 1.2F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(65, 32)
            .cuboid(-3.0041F, 10.0026F, -1.5076F, 6.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(47, 45)
            .cuboid(-4.0041F, 0.0026F, -1.9076F, 8.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0041F, -0.0026F, -0.0924F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 41).cuboid(-3.0F, -2.0F, -0.6F, 6.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 12.0026F, 1.6924F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 59).cuboid(-1.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0041F, 11.4614F, -0.7011F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 11).cuboid(-3.0F, -3.1F, -0.3F, 6.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 8.1026F, -1.2076F, 0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(11, 64).cuboid(-1.0F, -2.1F, -1.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.3912F, 6.7586F, 0.0924F, 0.0F, 0.0F, -0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r5 = body.addChild(
         "body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 64).cuboid(-1.0F, -2.1F, -1.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.3829F, 6.7586F, 0.0924F, 0.0F, 0.0F, 0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r6 = body.addChild(
         "body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(65, 35).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.7326F, 9.1517F, 0.0924F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r7 = body.addChild(
         "body_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(65, 25).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.7409F, 9.1517F, 0.0924F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r8 = body.addChild(
         "body_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 18).cuboid(-3.0F, 0.0F, -2.6F, 6.0F, 3.0F, 2.6F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 5.0026F, 2.0924F, -0.0567F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak = body.addChild("cloak", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(-0.0041F, 1.5901F, 2.1664F, 0.0873F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition cloak_r1 = cloak.addChild(
         "cloak_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(33, 11).cuboid(-4.0F, 0.0F, 0.0125F, 8.0F, 0.0F, 6.325F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak2 = cloak.addChild("cloak2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(0.0F, 6.325F, 0.0F, 0.1309F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition cloak_r2 = cloak2.addChild(
         "cloak_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(33, 0).cuboid(-4.0F, 0.0F, 0.0125F, 8.0F, 0.0F, 10.325F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition oh_my = body.addChild("oh_my", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-0.0041F, 3.5026F, -1.8076F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = oh_my.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 58).cuboid(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, 0.0F, 0.0F, -0.4784F, 0.0403F, 0.0774F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = oh_my.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 62).cuboid(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, 0.0F, 0.0F, -0.4784F, -0.0403F, -0.0774F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition shell = body.addChild(
         "shell",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(19, 51).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 12.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.0041F, 12.0026F, -2.0076F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 45)
            .cuboid(-2.0032F, -1.3114F, -2.0F, 3.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(50, 28)
            .cuboid(-2.2937F, -1.1773F, -2.025F, 3.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F)),
         net.minecraft.client.model.geom.PartPose.pivot(-4.9968F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r1 = right_arm.addChild(
         "right_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(47, 58).cuboid(-1.4F, -1.4F, -2.2F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F)),
         net.minecraft.client.model.geom.PartPose.of(-0.4032F, -0.5114F, 0.2F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(17, 34).cuboid(-1.0119F, -1.3913F, -2.0F, 3.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(5.0119F, 1.3913F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r1 = left_arm.addChild(
         "left_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 51).cuboid(-1.4F, -1.4F, -2.2F, 5.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F)),
         net.minecraft.client.model.geom.PartPose.of(0.3881F, -0.5913F, 0.2F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(33, 28).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 34).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMaleLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild("head", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 0)
            .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 39)
            .cuboid(-3.0F, 4.0F, -2.0F, 6.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 32)
            .cuboid(-4.0F, 7.2F, -2.0F, 8.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 24)
            .cuboid(-5.0F, 0.025F, -1.85F, 10.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.5F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 45).cuboid(-3.0F, -2.0F, -0.6F, 6.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 12.0F, 1.725F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(56, 35).cuboid(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, 11.1888F, -0.9415F, -0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 19).cuboid(-3.0F, -4.1F, -0.3F, 6.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 9.0583F, -1.3188F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(30, 48).cuboid(-1.0F, -2.5F, -1.95F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.0607F, 2.5251F, -0.025F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r5 = body.addChild(
         "body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(18, 47).cuboid(-1.0F, -2.5F, -1.95F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-4.0607F, 2.5251F, -0.025F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r6 = body.addChild(
         "body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(56, 0).cuboid(-1.0F, -3.1F, -1.5F, 2.0F, 5.0F, 3.3F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.828F, 6.9242F, -0.15F, 0.0F, 0.0F, -0.0698F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r7 = body.addChild(
         "body_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 55).cuboid(-1.0F, -3.1F, -1.5F, 2.0F, 5.0F, 3.3F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.828F, 6.9242F, -0.15F, 0.0F, 0.0F, 0.0698F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r8 = body.addChild(
         "body_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 57).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.6988F, 8.6005F, 0.0F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r9 = body.addChild(
         "body_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(56, 48).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.6988F, 8.6005F, 0.0F, 0.0F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r10 = body.addChild(
         "body_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 14).cuboid(-3.0F, 0.0F, -2.6F, 6.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 5.0F, 2.6F, -0.0567F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_part_cloak = body.addChild(
         "right_part_cloak", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(0.0F, 9.9875F, 1.974F, 0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r11 = right_part_cloak.addChild(
         "body_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 48).cuboid(-3.8026F, 0.3904F, -7.8484F, 5.0F, 0.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.3338F, 7.6294F, 0.3387F, -1.5678F, 0.0226F, 0.2608F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_part_cloak2 = right_part_cloak.addChild(
         "right_part_cloak2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(3.7515F, 6.325F, 0.0F, 0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r12 = right_part_cloak2.addChild(
         "body_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 8).cuboid(-1.0F, 0.0F, -1.1625F, 2.0F, 0.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-11.1282F, 0.3288F, -0.1367F, -1.5611F, -0.7293F, 0.249F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r13 = right_part_cloak2.addChild(
         "body_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 24).cuboid(-4.8026F, 0.1866F, -3.5612F, 6.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.9913F, 1.0444F, 0.4647F, -1.5636F, 0.056F, 0.2559F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_part_cloak = body.addChild(
         "left_part_cloak", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(0.0F, 9.9875F, 1.974F, 0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r14 = left_part_cloak.addChild(
         "body_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 48)
            .mirrored()
            .cuboid(-1.1974F, 0.3904F, -7.8484F, 5.0F, 0.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(2.3338F, 7.6294F, 0.3387F, -1.5678F, -0.0226F, -0.2608F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_part_cloak2 = left_part_cloak.addChild(
         "left_part_cloak2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(-3.7515F, 6.325F, 0.0F, 0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r15 = left_part_cloak2.addChild(
         "body_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 8)
            .mirrored()
            .cuboid(-1.0F, 0.0F, -1.1625F, 2.0F, 0.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(11.1282F, 0.3288F, -0.1367F, -1.5611F, 0.7293F, -0.249F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r16 = left_part_cloak2.addChild(
         "body_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(28, 24)
            .mirrored()
            .cuboid(-1.1974F, 0.1866F, -3.5612F, 6.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(5.9913F, 1.0444F, 0.4647F, -1.5636F, -0.056F, -0.2559F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition central_part_cloak = body.addChild(
         "central_part_cloak", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(0.0F, 9.9875F, 1.974F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r17 = central_part_cloak.addChild(
         "body_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 44).cuboid(-2.7F, 0.0F, -2.1625F, 5.0F, 0.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 1.6557F, 0.0518F, -1.5272F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition central_part_cloak2 = central_part_cloak.addChild(
         "central_part_cloak2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(0.0F, 6.325F, 0.0F, 0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r18 = central_part_cloak2.addChild(
         "body_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 16).cuboid(-6.8026F, 0.1866F, -3.5612F, 8.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.8026F, 0.7578F, 0.8424F, -1.5272F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition group8 = body.addChild(
         "group8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 59).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, -2.1F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 32)
            .cuboid(-2.9968F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(14, 56)
            .cuboid(-3.0968F, -0.3114F, -2.0875F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(26, 57)
            .cuboid(0.1989F, -0.1752F, -2.1125F, 1.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 52)
            .cuboid(-3.0718F, -0.3114F, -0.9375F, 4.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(42, 55)
            .cuboid(0.2238F, -0.1752F, -0.9125F, 1.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.0032F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r1 = right_arm.addChild(
         "right_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(42, 48).cuboid(-1.8F, -1.9F, -3.175F, 4.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.6031F, 5.3747F, 2.2375F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r2 = right_arm.addChild(
         "right_arm_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 39).cuboid(-1.8F, -0.9F, -3.175F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.413F, -1.1004F, 2.2125F, 0.0F, 0.0F, 0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r3 = right_arm.addChild(
         "right_arm_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(56, 24).cuboid(-1.8F, -1.9F, -2.175F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.6281F, 5.3747F, 0.0875F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r4 = right_arm.addChild(
         "right_arm_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(56, 30).cuboid(-1.8F, -0.9F, -2.175F, 4.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.438F, -1.1004F, 0.1125F, 0.0F, 0.0F, 0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 32)
            .mirrored()
            .cuboid(-1.0032F, -0.3114F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(14, 56)
            .mirrored()
            .cuboid(-0.9032F, -0.3114F, -2.0875F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(26, 57)
            .mirrored()
            .cuboid(-1.1988F, -0.1752F, -2.1125F, 1.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(0, 52)
            .mirrored()
            .cuboid(-0.9282F, -0.3114F, -0.9375F, 4.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(42, 55)
            .mirrored()
            .cuboid(-1.2239F, -0.1752F, -0.9125F, 1.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(5.0032F, 1.3114F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r1 = left_arm.addChild(
         "left_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(42, 48)
            .mirrored()
            .cuboid(-2.2F, -1.9F, -3.175F, 4.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(1.6031F, 5.3747F, 2.2375F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r2 = left_arm.addChild(
         "left_arm_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(52, 39)
            .mirrored()
            .cuboid(-2.2F, -0.9F, -3.175F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.413F, -1.1004F, 2.2125F, 0.0F, 0.0F, -0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r3 = left_arm.addChild(
         "left_arm_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(56, 24)
            .mirrored()
            .cuboid(-2.2F, -1.9F, -2.175F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(1.6281F, 5.3747F, 0.0875F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r4 = left_arm.addChild(
         "left_arm_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(56, 30)
            .mirrored()
            .cuboid(-2.2F, -0.9F, -2.175F, 4.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.438F, -1.1004F, 0.1125F, 0.0F, 0.0F, -0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 8).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMale2OuterLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild("head", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition head_r1 = head.addChild(
         "head_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(1, 0).cuboid(-3.9F, -4.9F, -4.1F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -3.0F, 0.0F, 0.0F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition headwear_r1 = hat.addChild(
         "headwear_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 16).cuboid(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.5F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -4.0F, 0.0F, 0.0F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild("body", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0041F, -0.0026F, -0.0924F));
      net.minecraft.client.model.geom.builders.PartDefinition cloak = body.addChild(
         "cloak",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 6).cuboid(-5.0F, 0.183F, -2.092F, 10.0F, 7.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 0.0026F, 0.0924F, -0.0873F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak2 = cloak.addChild(
         "cloak2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 45).cuboid(-5.0F, 0.0F, 0.0F, 10.0F, 7.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 7.183F, -2.092F, -0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = cloak2.addChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(18, 66).cuboid(-3.0F, 0.0F, 0.0F, 3.0F, 7.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = cloak2.addChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 61).cuboid(0.0F, 0.0F, 0.0F, 3.0F, 7.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak3 = cloak2.addChild(
         "cloak3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(36, 45).cuboid(-5.0F, 0.0F, 0.0F, 10.0F, 7.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 7.0F, 0.0F, -0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = cloak3.addChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(10, 66).cuboid(-4.0F, -0.5F, 0.0F, 4.0F, 7.5F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = cloak3.addChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 60).cuboid(0.0F, -0.5F, 0.0F, 4.0F, 7.5F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition actual_body = body.addChild(
         "actual_body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 32)
            .cuboid(-4.0041F, 0.0026F, -1.9076F, 8.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 39)
            .cuboid(-3.0041F, 4.0026F, -1.9076F, 6.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 38)
            .cuboid(-4.0791F, 8.2026F, -1.8326F, 8.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 0)
            .cuboid(-5.0041F, 0.1026F, -1.4076F, 10.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r5 = actual_body.addChild(
         "body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 22).cuboid(-3.0F, -2.0F, -0.6F, 6.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 12.0026F, 1.6924F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r6 = actual_body.addChild(
         "body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 0).cuboid(-3.0F, -3.1F, -0.3F, 6.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 8.0631F, -1.3037F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r7 = actual_body.addChild(
         "body_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 61).cuboid(-1.0F, -2.5F, -1.95F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.of(4.0565F, 2.7277F, 0.0674F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r8 = actual_body.addChild(
         "body_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 60).cuboid(-1.0F, -2.5F, -1.95F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.of(-4.0648F, 2.7277F, 0.0674F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r9 = actual_body.addChild(
         "body_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(62, 13)
            .cuboid(-1.0F, -4.1F, -1.5F, 2.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 64)
            .cuboid(-1.0F, -3.8F, -1.5F, 2.0F, 5.7F, 3.3F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.8239F, 7.4267F, -0.0576F, 0.0F, 0.0F, 0.0698F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r10 = actual_body.addChild(
         "body_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 62).cuboid(-1.0F, -4.1F, -1.5F, 2.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.8322F, 7.4267F, -0.0576F, 0.0F, 0.0F, -0.0698F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r11 = actual_body.addChild(
         "body_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 31).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.6946F, 8.603F, 0.1424F, 0.0F, 0.0F, -0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r12 = actual_body.addChild(
         "body_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 25).cuboid(-1.0F, 0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.7029F, 8.603F, 0.1424F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r13 = actual_body.addChild(
         "body_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 52).cuboid(-3.0F, 0.0F, -2.6F, 6.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0041F, 5.0026F, 1.6924F, -0.0567F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild("right_arm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-4.9968F, 1.3114F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition right_arm1 = right_arm.addChild(
         "right_arm1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 40)
            .cuboid(-1.3038F, -0.4364F, -1.7227F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(34, 52)
            .cuboid(-1.2038F, 4.6636F, -1.6954F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(50, 52)
            .cuboid(-1.1038F, -0.4364F, -1.7954F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm_r1 = right_arm1.addChild(
         "left_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 55).cuboid(-1.8F, -0.9F, -2.175F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0375F, -1.2504F, 0.3796F, 0.0F, 0.0F, -0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild("left_arm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(4.9968F, 1.3114F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition left_arm1 = left_arm.addChild(
         "left_arm1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 40)
            .mirrored()
            .cuboid(-2.6962F, -0.4364F, -1.7227F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(34, 52)
            .mirrored()
            .cuboid(-2.7962F, 4.6636F, -1.6954F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .mirrored(false)
            .uv(50, 52)
            .mirrored()
            .cuboid(-2.8962F, -0.4364F, -1.7954F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm_r1 = left_arm1.addChild(
         "right_arm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 55)
            .mirrored()
            .cuboid(-2.2F, -0.9F, -2.175F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.0375F, -1.2504F, 0.3796F, 0.0F, 0.0F, 0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild("right_leg", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition right_leg_r1 = right_leg.addChild(
         "right_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 6).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild("left_leg", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition left_leg_r1 = left_leg.addChild(
         "left_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 22).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMale2InnerLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = CommonModelLayers.emptyHumanoidMesh();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild("right_leg", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition right_leg1 = right_leg.addChild(
         "right_leg1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 16)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 19)
            .cuboid(-0.7525F, 1.7929F, -1.95F, 3.0F, 9.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.12F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg_r1 = right_leg1.addChild(
         "right_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-2.0F, -6.0F, -2.05F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F)),
         net.minecraft.client.model.geom.PartPose.of(0.6F, 5.0F, 0.05F, 0.0F, 0.0F, -0.1134F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild("left_leg", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition left_leg1 = left_leg.addChild(
         "left_leg1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 16)
            .mirrored()
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(16, 19)
            .mirrored()
            .cuboid(-2.2475F, 1.7929F, -1.95F, 3.0F, 9.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.12F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg_r1 = left_leg1.addChild(
         "left_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .mirrored()
            .cuboid(-2.0F, -6.0F, -2.05F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.6F, 5.0F, 0.05F, 0.0F, 0.0F, 0.1134F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 32);
   }
}
