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
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addOrReplaceChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 59)
            .addBox(-1.0F, -9.0F, -4.0F, 2.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .texOffs(0, 17)
            .addBox(-4.5F, -8.0F, -4.5F, 9.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .texOffs(60, 0)
            .addBox(-4.0F, -8.6F, 0.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .texOffs(36, 7)
            .addBox(-5.0F, -2.0F, -5.0F, 3.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .texOffs(42, 23)
            .addBox(-4.75F, -6.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(60, 10)
            .addBox(-4.25F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 7)
            .mirror()
            .addBox(2.0F, -2.0F, -5.0F, 3.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .mirror(false)
            .texOffs(42, 23)
            .mirror()
            .addBox(3.75F, -6.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(60, 10)
            .mirror()
            .addBox(3.25F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(60, 0)
            .mirror()
            .addBox(3.0F, -8.6F, 0.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addOrReplaceChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addOrReplaceChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 27)
            .addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 27)
            .addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(32, 0)
            .addBox(-4.5F, 7.75F, -2.5F, 9.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.075F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addOrReplaceChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 18).addBox(-4.0F, -3.0F, 0.0F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0152F, 3.5F, -2.8986F, 0.044F, 0.0869F, 0.0076F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addOrReplaceChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 23).addBox(-3.0174F, 0.0F, 0.1992F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5152F, 7.25F, -3.1486F, 0.0873F, 0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addOrReplaceChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(35, 11)
            .mirror()
            .addBox(0.0F, -3.0F, 0.0F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0152F, 3.5F, -2.8986F, 0.044F, -0.0869F, -0.0076F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addOrReplaceChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(36, 23)
            .mirror()
            .addBox(1.0174F, 0.0F, 0.1992F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5152F, 7.25F, -3.1486F, 0.0873F, -0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addOrReplaceChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 43)
            .addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 43)
            .addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(40, 59)
            .addBox(-2.5F, 1.5F, 1.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition rightArm_r1 = right_arm.addOrReplaceChild(
         "rightArm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 59).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addOrReplaceChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 43)
            .mirror()
            .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(32, 43)
            .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(40, 59)
            .mirror()
            .addBox(-0.5F, 1.5F, 1.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition leftArm_r1 = left_arm.addOrReplaceChild(
         "leftArm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 68)
            .mirror()
            .addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(48, 18)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(48, 34)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(60, 5)
            .addBox(-1.5F, 5.5F, -2.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(48, 18)
            .mirror()
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(48, 50)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(60, 5)
            .mirror()
            .addBox(-1.5F, 5.5F, -2.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition create104thBattalionLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addOrReplaceChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 59)
            .addBox(-1.0F, -9.0F, -4.0F, 2.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .texOffs(0, 17)
            .addBox(-4.5F, -8.0F, -4.5F, 9.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .texOffs(64, 30)
            .addBox(-4.0F, -8.6F, 0.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .texOffs(36, 7)
            .addBox(-5.0F, -2.0F, -5.0F, 3.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .texOffs(42, 23)
            .addBox(-4.75F, -6.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(64, 45)
            .addBox(-4.25F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 7)
            .mirror()
            .addBox(2.0F, -2.0F, -5.0F, 3.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .mirror(false)
            .texOffs(42, 23)
            .mirror()
            .addBox(3.75F, -6.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(64, 45)
            .mirror()
            .addBox(3.25F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(64, 30)
            .mirror()
            .addBox(3.0F, -8.6F, 0.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition group = head.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(64, 49)
            .addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 7)
            .addBox(-0.5F, -6.5F, -0.5F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .texOffs(64, 53)
            .addBox(-0.5F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-5.25F, -5.0F, 1.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition head_r1 = group.addOrReplaceChild(
         "head_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 59).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -6.0F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addOrReplaceChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addOrReplaceChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 27)
            .addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 27)
            .addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(32, 0)
            .addBox(-4.5F, 7.75F, -2.5F, 9.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.075F))
            .texOffs(0, 59)
            .addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.299F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addOrReplaceChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 18).addBox(-4.0F, -3.0F, 0.0F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0152F, 3.5F, -2.8986F, 0.044F, 0.0869F, 0.0076F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r2 = body.addOrReplaceChild(
         "body_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(32, 14)
            .addBox(-2.5174F, 0.5F, 0.1992F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .texOffs(36, 23)
            .addBox(-3.0174F, 0.0F, 0.1992F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5152F, 7.25F, -3.1486F, 0.0873F, 0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r3 = body.addOrReplaceChild(
         "body_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(32, 14)
            .mirror()
            .addBox(1.5174F, 0.5F, 0.1992F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .mirror(false)
            .texOffs(36, 23)
            .mirror()
            .addBox(1.0174F, 0.0F, 0.1992F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5152F, 7.25F, -3.1486F, 0.0873F, -0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r4 = body.addOrReplaceChild(
         "body_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(36, 18)
            .mirror()
            .addBox(0.0F, -3.0F, 0.0F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0152F, 3.5F, -2.8986F, 0.044F, -0.0869F, -0.0076F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition group3 = body.addOrReplaceChild("group3", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, 2.0F));
      net.minecraft.client.model.geom.builders.PartDefinition Body_r5 = group3.addOrReplaceChild(
         "Body_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(64, 18)
            .mirror()
            .addBox(0.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.3F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.0436F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition group2 = body.addOrReplaceChild("group2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, 2.0F));
      net.minecraft.client.model.geom.builders.PartDefinition Body_r6 = group2.addOrReplaceChild(
         "Body_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(64, 18).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.3F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0436F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addOrReplaceChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 43)
            .addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 43)
            .addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(64, 35)
            .addBox(-2.5F, 1.5F, 1.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition rightArm_r1 = right_arm.addOrReplaceChild(
         "rightArm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 0).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addOrReplaceChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 43)
            .mirror()
            .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(32, 43)
            .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(64, 35)
            .mirror()
            .addBox(-0.5F, 1.5F, 1.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition leftArm_r1 = left_arm.addOrReplaceChild(
         "leftArm_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 9).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(48, 18)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(48, 34)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(64, 40)
            .addBox(-1.5F, 5.5F, -2.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(48, 18)
            .mirror()
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(48, 50)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(64, 40)
            .mirror()
            .addBox(-1.5F, 5.5F, -2.5F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 128, 128);
   }
}
