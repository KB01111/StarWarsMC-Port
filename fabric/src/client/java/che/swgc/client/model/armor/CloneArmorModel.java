package che.swgc.client.model.armor;

import net.minecraft.resources.Identifier;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class CloneArmorModel {
   public static final net.minecraft.client.model.geom.ModelLayerLocation OUTER_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "clone"), "outer_armor");
   public static final net.minecraft.client.model.geom.ModelLayerLocation CLONE_104TH_BATTALION_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "clone"), "104th_battalion");

   public CloneArmorModel() {
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createOuterLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 59)
            .cuboid(-1.0F, -9.0F, -4.0F, 2.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .uv(0, 17)
            .cuboid(-4.5F, -8.0F, -4.5F, 9.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .uv(60, 0)
            .cuboid(-4.0F, -8.6F, 0.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .uv(36, 7)
            .cuboid(-5.0F, -2.0F, -5.0F, 3.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .uv(42, 23)
            .cuboid(-4.75F, -6.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(60, 10)
            .cuboid(-4.25F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 7)
            .mirrored()
            .cuboid(2.0F, -2.0F, -5.0F, 3.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .mirrored(false)
            .uv(42, 23)
            .mirrored()
            .cuboid(3.75F, -6.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(60, 10)
            .mirrored()
            .cuboid(3.25F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(60, 0)
            .mirrored()
            .cuboid(3.0F, -8.6F, 0.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 27)
            .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 27)
            .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(32, 0)
            .cuboid(-4.5F, 7.75F, -2.5F, 9.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.075F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(36, 18).cuboid(-4.0F, -3.0F, 0.0F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0152F, 3.5F, -2.8986F, 0.044F, 0.0869F, 0.0076F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(36, 23).cuboid(-3.0174F, 0.0F, 0.1992F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5152F, 7.25F, -3.1486F, 0.0873F, 0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(35, 11)
            .mirrored()
            .cuboid(0.0F, -3.0F, 0.0F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.0152F, 3.5F, -2.8986F, 0.044F, -0.0869F, -0.0076F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(36, 23)
            .mirrored()
            .cuboid(1.0174F, 0.0F, 0.1992F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.5152F, 7.25F, -3.1486F, 0.0873F, -0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 43)
            .cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 43)
            .cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(40, 59)
            .cuboid(-2.5F, 1.5F, 1.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition rightArm_r1 = right_arm.addChild(
         "rightArm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 59).cuboid(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 43)
            .mirrored()
            .cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(32, 43)
            .cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(40, 59)
            .mirrored()
            .cuboid(-0.5F, 1.5F, 1.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition leftArm_r1 = left_arm.addChild(
         "leftArm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 68)
            .mirrored()
            .cuboid(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 18)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 34)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(60, 5)
            .cuboid(-1.5F, 5.5F, -2.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 18)
            .mirrored()
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(48, 50)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(60, 5)
            .mirrored()
            .cuboid(-1.5F, 5.5F, -2.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition create104thBattalionLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 59)
            .cuboid(-1.0F, -9.0F, -4.0F, 2.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .uv(0, 17)
            .cuboid(-4.5F, -8.0F, -4.5F, 9.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .uv(64, 30)
            .cuboid(-4.0F, -8.6F, 0.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .uv(36, 7)
            .cuboid(-5.0F, -2.0F, -5.0F, 3.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .uv(42, 23)
            .cuboid(-4.75F, -6.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(42, 23)
            .cuboid(-4.75F, -6.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(64, 45)
            .cuboid(-4.25F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 7)
            .mirrored()
            .cuboid(2.0F, -2.0F, -5.0F, 3.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .mirrored(false)
            .uv(42, 23)
            .mirrored()
            .cuboid(3.75F, -6.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(64, 45)
            .mirrored()
            .cuboid(3.25F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(64, 30)
            .mirrored()
            .cuboid(3.0F, -8.6F, 0.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition group = head.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(64, 49)
            .cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 7)
            .cuboid(-0.5F, -6.5F, -0.5F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .uv(64, 53)
            .cuboid(-0.5F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.25F, -5.0F, 1.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition head_r1 = group.addChild(
         "head_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 59).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -6.0F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 27)
            .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 27)
            .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(32, 0)
            .cuboid(-4.5F, 7.75F, -2.5F, 9.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.075F))
            .uv(0, 59)
            .cuboid(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.299F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(36, 18).cuboid(-4.0F, -3.0F, 0.0F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0152F, 3.5F, -2.8986F, 0.044F, 0.0869F, 0.0076F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 14)
            .cuboid(-2.5174F, 0.5F, 0.1992F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .uv(36, 23)
            .cuboid(-3.0174F, 0.0F, 0.1992F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5152F, 7.25F, -3.1486F, 0.0873F, 0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 14)
            .mirrored()
            .cuboid(1.5174F, 0.5F, 0.1992F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .mirrored(false)
            .uv(36, 23)
            .mirrored()
            .cuboid(1.0174F, 0.0F, 0.1992F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.5152F, 7.25F, -3.1486F, 0.0873F, -0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(36, 18)
            .mirrored()
            .cuboid(0.0F, -3.0F, 0.0F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.0152F, 3.5F, -2.8986F, 0.044F, -0.0869F, -0.0076F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition group3 = body.addChild("group3", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, 2.0F));
      net.minecraft.client.model.geom.builders.PartDefinition Body_r5 = group3.addChild(
         "Body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(64, 18)
            .mirrored()
            .cuboid(0.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.3F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.0436F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition group2 = body.addChild("group2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, 2.0F));
      net.minecraft.client.model.geom.builders.PartDefinition Body_r6 = group2.addChild(
         "Body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 18).cuboid(-4.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.3F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0436F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 43)
            .cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 43)
            .cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(64, 35)
            .cuboid(-2.5F, 1.5F, 1.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition rightArm_r1 = right_arm.addChild(
         "rightArm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 0).cuboid(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 43)
            .mirrored()
            .cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(32, 43)
            .cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(64, 35)
            .mirrored()
            .cuboid(-0.5F, 1.5F, 1.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition leftArm_r1 = left_arm.addChild(
         "leftArm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 9).cuboid(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 18)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 34)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(64, 40)
            .cuboid(-1.5F, 5.5F, -2.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 18)
            .mirrored()
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(48, 50)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(64, 40)
            .mirrored()
            .cuboid(-1.5F, 5.5F, -2.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }
}
