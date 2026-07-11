package che.swgc.client.model.entity;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;

public class ObeseWanModel<T extends net.minecraft.world.entity.LivingEntity> extends net.minecraft.client.model.HumanoidModel<T> {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "obese_wan"), "main");

   public ObeseWanModel(net.minecraft.client.model.geom.ModelPart root) {
      super(root, net.minecraft.client.renderer.rendertype.RenderType::getEntityCutout);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild("hat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 16)
            .cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.5F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 0)
            .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(32, 8)
            .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 32)
            .cuboid(-5.0F, 4.0F, -4.0F, 10.0F, 8.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body_r1 = body.addChild(
         "body_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 8)
            .cuboid(-4.0F, -2.0F, -2.0F, 8.0F, 4.425F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 0)
            .cuboid(-4.0F, -2.0F, -2.0F, 8.0F, 4.075F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 2.7003F, -1.058F, -0.4014F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 46)
            .cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(16, 46)
            .cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 16)
            .cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 32)
            .cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F)),
         net.minecraft.client.model.geom.PartPose.pivot(5.0F, 2.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 48)
            .cuboid(-2.0F, 5.0F, -2.0F, 4.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 36)
            .cuboid(-2.0F, 5.0F, -2.0F, 4.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(48, 16)
            .cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 26)
            .cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 48)
            .cuboid(-2.0F, 5.0F, -2.0F, 4.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 36)
            .cuboid(-2.0F, 5.0F, -2.0F, 4.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(48, 16)
            .cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 26)
            .cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.0F, 12.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }
}
