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

public class EwokSpearModel extends net.minecraft.client.model.Model {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "ewok_spear"), "main");
   private final net.minecraft.client.model.geom.ModelPart root;

   public EwokSpearModel(net.minecraft.client.model.geom.ModelPart root) {
      super(net.minecraft.client.renderer.rendertype.RenderType::getEntityCutout);
      this.root = root;
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition pike = partdefinition.addChild(
         "pike",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-0.5F, 0.0F, -10.0F, 1.0F, 1.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 24)
            .cuboid(-1.0F, -0.5F, -10.1F, 2.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 24)
            .cuboid(0.0F, -1.0F, -16.1F, 0.0F, 3.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 11.0498F, 0.25F, -1.5708F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }

   public void render(com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }
}
