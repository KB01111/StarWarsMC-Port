package che.swgc.client.model;

import net.minecraft.resources.Identifier;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class CommonModelLayers {
   public static final net.minecraft.client.model.geom.ModelLayerLocation PLAYER_EMPTY_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "player_empty"), "main");
   public static final net.minecraft.client.model.geom.ModelLayerLocation SIMPLE_INNER_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "simple_armor"), "inner_armor");

   public CommonModelLayers() {
   }

   public static net.minecraft.client.model.geom.builders.MeshDefinition emptyHumanoidMesh() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      partdefinition.addChild("head", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.NONE);
      partdefinition.addChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.NONE);
      partdefinition.addChild("body", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.NONE);
      partdefinition.addChild("right_arm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-5.0F, 2.0F, 0.0F));
      partdefinition.addChild("left_arm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(5.0F, 2.0F, 0.0F));
      partdefinition.addChild("right_leg", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-1.9F, 12.0F, 0.0F));
      partdefinition.addChild("left_leg", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(1.9F, 12.0F, 0.0F));
      return meshdefinition;
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createEmptyPlayerModel() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = emptyHumanoidMesh();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      partdefinition.addChild("ear", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.NONE);
      partdefinition.addChild("cloak", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.NONE);
      partdefinition.addChild("left_sleeve", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(5.0F, 2.0F, 0.0F));
      partdefinition.addChild("right_sleeve", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-5.0F, 2.0F, 0.0F));
      partdefinition.addChild("left_pants", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(1.9F, 12.0F, 0.0F));
      partdefinition.addChild("right_pants", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-1.9F, 12.0F, 0.0F));
      partdefinition.addChild("jacket", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.NONE);
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createSimpleInnerLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = emptyHumanoidMesh();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 16)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 16)
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 16)
            .mirrored()
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(16, 16)
            .mirrored()
            .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 32);
   }
}
