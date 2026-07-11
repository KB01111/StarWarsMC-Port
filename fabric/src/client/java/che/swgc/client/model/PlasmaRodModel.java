package che.swgc.client.model;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.SwgcOptions;
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

public class PlasmaRodModel extends net.minecraft.client.model.Model {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "plasma_rod"), "main");
   public static final net.minecraft.resources.Identifier DEFAULT_TEXTURE = SwgcClientUtils.entityTex("plasma_rod");
   public final net.minecraft.client.model.geom.ModelPart rod;
   private final net.minecraft.client.model.geom.ModelPart outline;
   public boolean bottomOutline;
   public float outlineThickness;

   public PlasmaRodModel(net.minecraft.client.model.geom.ModelPart root, boolean bottomOutline, float outlineThickness, float lengthInBlocks) {
      super(net.minecraft.client.renderer.rendertype.RenderType::getEntitySolid);
      this.rod = root.getChild("rod");
      this.outline = root.getChild("outline");
      this.bottomOutline = bottomOutline;
      this.outlineThickness = outlineThickness;
      this.rod.yScale = lengthInBlocks;
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshDefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partDefinition = meshDefinition.getRoot();
      partDefinition.addChild("rod", net.minecraft.client.model.geom.builders.CubeListBuilder.create().cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 16.0F, 2.0F), net.minecraft.client.model.geom.PartPose.NONE);
      partDefinition.addChild(
         "outline",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(8, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 16.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-2.0F, -16.0F, -2.0F)),
         net.minecraft.client.model.geom.PartPose.NONE
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshDefinition, 16, 32);
   }

   public void render(com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.rod.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   public void setupAndRenderOutline(
      com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.outline.copyTransform(this.rod);
      if (!this.bottomOutline) {
         this.outline.pivotY += 0.01F;
      }

      int layers = (Integer)SwgcOptions.getInstance().lightsaberDetailing.getValue();
      if (layers == 0) {
         if (this.bottomOutline) {
            this.outline.pivotY = this.outline.pivotY - this.outlineThickness * 0.5F;
            this.outline.yScale = this.outline.yScale + this.outlineThickness / 16.0F;
         } else {
            this.outline.yScale = this.outline.yScale + this.outlineThickness / 32.0F;
         }

         this.outline.xScale = this.outline.xScale + this.outlineThickness * 0.5F;
         this.outline.zScale = this.outline.zScale + this.outlineThickness * 0.5F;
         this.outline.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      } else {
         int var14;
         float thicknessIncrement = this.outlineThickness / (float)(var14 = 1 << layers);
         float lengthIncrement = thicknessIncrement / (float)(this.bottomOutline ? 8 : 16);
         float yIncrement = this.bottomOutline ? lengthIncrement * 8.0F : 0.0F;

         for (int i = 1; i <= var14; i++) {
            this.outline.pivotY -= yIncrement;
            this.outline.xScale += thicknessIncrement;
            this.outline.yScale += lengthIncrement;
            this.outline.zScale += thicknessIncrement;
            this.outline.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha / (float)i);
         }
      }
   }
}
