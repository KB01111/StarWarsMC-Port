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

public class RoyalGuardArmorModel {
   public static final net.minecraft.client.model.geom.ModelLayerLocation OUTER_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "royal_guard"), "outer_armor");
   public static final net.minecraft.client.model.geom.ModelLayerLocation INNER_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "royal_guard"), "inner_armor");

   public RoyalGuardArmorModel() {
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createOuterLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addOrReplaceChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0F, -7.9F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.5F))
            .texOffs(0, 16)
            .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addOrReplaceChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addOrReplaceChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 32)
            .addBox(-4.0F, 0.0F, -2.5F, 8.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(62, 15)
            .addBox(-2.8F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = body.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 50).addBox(-1.2F, -4.0F, -5.55F, 3.0F, 8.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.3318F, 3.7837F, 3.05F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = body.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 49).addBox(-1.8F, -4.0F, -5.55F, 3.0F, 8.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.3318F, 3.7837F, 3.05F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addOrReplaceChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(56, 41)
            .addBox(-3.3F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.4F))
            .texOffs(0, 49)
            .addBox(-3.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 63)
            .addBox(-0.3793F, 3.1362F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.38F)),
         net.minecraft.client.model.geom.PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak_r1 = right_arm.addOrReplaceChild(
         "cloak_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(52, 59).addBox(-2.225F, -2.9F, -2.225F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.37F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.3312F, 5.6861F, 0.225F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addOrReplaceChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(52, 50)
            .addBox(-0.7F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.4F))
            .texOffs(48, 0)
            .addBox(-1.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(62, 20)
            .addBox(-0.6707F, 3.1362F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.38F)),
         net.minecraft.client.model.geom.PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak_r2 = left_arm.addOrReplaceChild(
         "cloak_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(56, 32).addBox(-1.775F, -2.9F, -2.225F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.37F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.3312F, 5.6861F, 0.225F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(26, 33).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 17).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createInnerLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = CommonModelLayers.emptyHumanoidMesh();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(32, 0)
            .addBox(-0.1082F, -0.8379F, -2.5F, 2.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.19F))
            .texOffs(16, 16)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = right_leg.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 17)
            .addBox(-1.7F, -6.15F, -2.375F, 3.0F, 12.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F))
            .texOffs(32, 17)
            .addBox(-1.7F, -6.15F, 1.625F, 3.0F, 12.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8652F, 5.1943F, -0.125F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 0)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(46, 0)
            .addBox(-1.8918F, -0.8379F, -2.5F, 2.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.19F)),
         net.minecraft.client.model.geom.PartPose.offset(2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = left_leg.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, -6.15F, -2.625F, 3.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.8652F, 5.1943F, 0.125F, 0.0F, 0.0F, -0.0873F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 32);
   }
}
