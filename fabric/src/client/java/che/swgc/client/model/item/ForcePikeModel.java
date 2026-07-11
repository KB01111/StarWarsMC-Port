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

public class ForcePikeModel extends net.minecraft.client.model.Model {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "force_pike"), "main");
   private final net.minecraft.client.model.geom.ModelPart root;

   public ForcePikeModel(net.minecraft.client.model.geom.ModelPart root) {
      super(net.minecraft.client.renderer.rendertype.RenderType::getEntitySolid);
      this.root = root;
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 0)
            .cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(4, 0)
            .cuboid(-1.0F, -8.7F, -1.0F, 2.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .uv(4, 8)
            .cuboid(-1.0F, -23.7F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .uv(12, 5)
            .cuboid(-1.0F, -26.7F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .uv(0, 0)
            .cuboid(-0.5F, -26.0F, -0.5F, 1.0F, 23.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public void render(com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.VertexConsumer vertexConsumer, int i, int i1, float v, float v1, float v2, float v3) {
      this.root.render(poseStack, vertexConsumer, i, i1, v, v1, v2, v3);
   }
}
