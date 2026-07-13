package che.swgc.client.model.item;

import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.client.model.Model;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
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
   public ForcePikeModel(net.minecraft.client.model.geom.ModelPart root) {
      super(root, net.minecraft.client.renderer.rendertype.RenderTypes::entitySolid);
   }

   public net.minecraft.client.renderer.rendertype.RenderType getLayer(net.minecraft.resources.Identifier texture) {
      return this.renderType(texture);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(12, 0)
            .addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(-1.0F, -8.7F, -1.0F, 2.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .texOffs(4, 8)
            .addBox(-1.0F, -23.7F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .texOffs(12, 5)
            .addBox(-1.0F, -26.7F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .texOffs(0, 0)
            .addBox(-0.5F, -26.0F, -0.5F, 1.0F, 23.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public void render(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int i, int i1, float v, float v1, float v2, float v3) {
      this.root().render(poseStack, vertexConsumer, i, i1, net.minecraft.util.ARGB.color((int)(v3 * 255.0F), (int)(v * 255.0F), (int)(v1 * 255.0F), (int)(v2 * 255.0F)));
   }
}
