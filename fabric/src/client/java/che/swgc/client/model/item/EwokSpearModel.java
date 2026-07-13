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

public class EwokSpearModel extends net.minecraft.client.model.Model {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "ewok_spear"), "main");
   public EwokSpearModel(net.minecraft.client.model.geom.ModelPart root) {
      super(root, net.minecraft.client.renderer.rendertype.RenderTypes::entityCutout);
   }

   public net.minecraft.client.renderer.rendertype.RenderType getLayer(net.minecraft.resources.Identifier texture) {
      return this.renderType(texture);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition pike = partdefinition.addOrReplaceChild(
         "pike",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-0.5F, 0.0F, -10.0F, 1.0F, 1.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 24)
            .addBox(-1.0F, -0.5F, -10.1F, 2.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 24)
            .addBox(0.0F, -1.0F, -16.1F, 0.0F, 3.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 11.0498F, 0.25F, -1.5708F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }

   public void render(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.root().render(poseStack, vertexConsumer, packedLight, packedOverlay, net.minecraft.util.ARGB.color((int)(alpha * 255.0F), (int)(red * 255.0F), (int)(green * 255.0F), (int)(blue * 255.0F)));
   }
}
