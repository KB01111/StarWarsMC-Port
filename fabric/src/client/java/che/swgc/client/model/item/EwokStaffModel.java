package che.swgc.client.model.item;

import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.client.model.Model;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;

public class EwokStaffModel extends net.minecraft.client.model.Model {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "ewok_staff"), "main");
   private final net.minecraft.client.model.geom.ModelPart root;

   public EwokStaffModel(net.minecraft.client.model.geom.ModelPart root) {
      super(net.minecraft.client.renderer.rendertype.RenderType::getEntityCutout);
      this.root = root;
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition staff = partdefinition.addChild(
         "staff",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 0)
            .cuboid(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 14)
            .cuboid(-0.4511F, 0.0F, 9.7376F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 10)
            .cuboid(-0.9577F, -0.4F, -7.3014F, 0.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 16)
            .cuboid(0.4423F, -0.6F, -7.3014F, 0.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 22)
            .cuboid(-0.7577F, 0.0F, -6.9014F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.2685F, 11.2499F, 0.3F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = staff.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 18).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.225F, 0.5F, -7.4F, 1.0472F, 0.7854F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = staff.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 5).cuboid(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.225F, 0.5F, -9.9F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = staff.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 18).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1724F, 0.5F, -3.9488F, 0.0F, 0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = staff.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 12).cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7207F, 0.5F, -9.2514F, 0.0F, -0.1745F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = staff.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 6).cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2577F, 0.5F, -9.2514F, 0.0F, 0.1745F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = staff.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2542F, 0.0F, 6.2945F, 0.0F, 0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = staff.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 10).cuboid(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1915F, 0.0F, 3.4219F, 0.0F, -0.1309F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public void render(com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }
}
