package che.swgc.client.model;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.SwgcOptions;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.client.model.Model;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;

public class PlasmaRodModel extends net.minecraft.client.model.Model.Simple {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "plasma_rod"), "main");
   public static final net.minecraft.resources.Identifier DEFAULT_TEXTURE = SwgcClientUtils.entityTex("plasma_rod");
   public final net.minecraft.client.model.geom.ModelPart rod;
   private final net.minecraft.client.model.geom.ModelPart outline;
   public boolean bottomOutline;
   public float outlineThickness;

   public PlasmaRodModel(net.minecraft.client.model.geom.ModelPart root, boolean bottomOutline, float outlineThickness, float lengthInBlocks) {
      super(root, net.minecraft.client.renderer.rendertype.RenderTypes::entitySolid);
      this.rod = root.getChild("rod");
      this.outline = root.getChild("outline");
      this.bottomOutline = bottomOutline;
      this.outlineThickness = outlineThickness;
      this.rod.yScale = lengthInBlocks;
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshDefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partDefinition = meshDefinition.getRoot();
      partDefinition.addOrReplaceChild("rod", net.minecraft.client.model.geom.builders.CubeListBuilder.create().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 16.0F, 2.0F), net.minecraft.client.model.geom.PartPose.ZERO);
      partDefinition.addOrReplaceChild(
         "outline",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(8, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 16.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-2.0F, -16.0F, -2.0F)),
         net.minecraft.client.model.geom.PartPose.ZERO
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshDefinition, 16, 32);
   }

   public void render(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.rod.render(poseStack, vertexConsumer, packedLight, packedOverlay, ((int)(alpha * 255.0F) << 24) | ((int)(red * 255.0F) << 16) | ((int)(green * 255.0F) << 8) | (int)(blue * 255.0F));
   }

   public void setupAndRenderOutline(
      com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.renderOutline(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }

   public void setupAndRenderOutline(
      com.mojang.blaze3d.vertex.PoseStack poseStack,
      SubmitNodeCollector src,
      net.minecraft.client.renderer.rendertype.RenderType renderType,
      int packedLight,
      int packedOverlay,
      float red,
      float green,
      float blue,
      float alpha
   ) {
      src.submitCustomGeometry(poseStack, renderType, (pose, buffer) -> this.renderOutline(poseStack, buffer, packedLight, packedOverlay, red, green, blue, alpha));
   }

   private void renderOutline(
      com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha
   ) {
      this.outline.loadPose(this.rod.storePose());
      if (!this.bottomOutline) {
         this.outline.y += 0.01F;
      }

      int layers = (Integer)SwgcOptions.getInstance().lightsaberDetailing.get();
      if (layers == 0) {
         if (this.bottomOutline) {
            this.outline.y = this.outline.y - this.outlineThickness * 0.5F;
            this.outline.yScale = this.outline.yScale + this.outlineThickness / 16.0F;
         } else {
            this.outline.yScale = this.outline.yScale + this.outlineThickness / 32.0F;
         }

         this.outline.xScale = this.outline.xScale + this.outlineThickness * 0.5F;
         this.outline.zScale = this.outline.zScale + this.outlineThickness * 0.5F;
         this.outline.render(poseStack, vertexConsumer, packedLight, packedOverlay, ((int)(alpha * 255.0F) << 24) | ((int)(red * 255.0F) << 16) | ((int)(green * 255.0F) << 8) | (int)(blue * 255.0F));
      } else {
         int var14;
         float thicknessIncrement = this.outlineThickness / (float)(var14 = 1 << layers);
         float lengthIncrement = thicknessIncrement / (float)(this.bottomOutline ? 8 : 16);
         float yIncrement = this.bottomOutline ? lengthIncrement * 8.0F : 0.0F;

         for (int i = 1; i <= var14; i++) {
            this.outline.y -= yIncrement;
            this.outline.xScale += thicknessIncrement;
            this.outline.yScale += lengthIncrement;
            this.outline.zScale += thicknessIncrement;
            this.outline.render(poseStack, vertexConsumer, packedLight, packedOverlay, ((int)((alpha / (float)i) * 255.0F) << 24) | ((int)(red * 255.0F) << 16) | ((int)(green * 255.0F) << 8) | (int)(blue * 255.0F));
         }
      }
   }
}
