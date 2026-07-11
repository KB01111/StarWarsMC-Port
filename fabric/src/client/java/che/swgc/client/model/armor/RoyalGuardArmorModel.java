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
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-4.0F, -7.9F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.5F))
            .uv(0, 16)
            .cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 32)
            .cuboid(-4.0F, 0.0F, -2.5F, 8.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(62, 15)
            .cuboid(-2.8F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = body.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 50).cuboid(-1.2F, -4.0F, -5.55F, 3.0F, 8.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-4.3318F, 3.7837F, 3.05F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = body.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 49).cuboid(-1.8F, -4.0F, -5.55F, 3.0F, 8.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.3318F, 3.7837F, 3.05F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(56, 41)
            .cuboid(-3.3F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.4F))
            .uv(0, 49)
            .cuboid(-3.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 63)
            .cuboid(-0.3793F, 3.1362F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.38F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak_r1 = right_arm.addChild(
         "cloak_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 59).cuboid(-2.225F, -2.9F, -2.225F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.37F)),
         net.minecraft.client.model.geom.PartPose.of(-1.3312F, 5.6861F, 0.225F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(52, 50)
            .cuboid(-0.7F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.4F))
            .uv(48, 0)
            .cuboid(-1.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 20)
            .cuboid(-0.6707F, 3.1362F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.38F)),
         net.minecraft.client.model.geom.PartPose.pivot(5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak_r2 = left_arm.addChild(
         "cloak_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(56, 32).cuboid(-1.775F, -2.9F, -2.225F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.37F)),
         net.minecraft.client.model.geom.PartPose.of(1.3312F, 5.6861F, 0.225F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(26, 33).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 17).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createInnerLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = CommonModelLayers.emptyHumanoidMesh();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 0)
            .cuboid(-0.1082F, -0.8379F, -2.5F, 2.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.19F))
            .uv(16, 16)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = right_leg.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 17)
            .cuboid(-1.7F, -6.15F, -2.375F, 3.0F, 12.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F))
            .uv(32, 17)
            .cuboid(-1.7F, -6.15F, 1.625F, 3.0F, 12.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8652F, 5.1943F, -0.125F, 0.0F, 0.0F, 0.0873F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 0)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(46, 0)
            .cuboid(-1.8918F, -0.8379F, -2.5F, 2.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.19F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = left_leg.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-1.3F, -6.15F, -2.625F, 3.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.22F)),
         net.minecraft.client.model.geom.PartPose.of(0.8652F, 5.1943F, 0.125F, 0.0F, 0.0F, -0.0873F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 32);
   }
}
