package che.swgc.client.renderer.entity.layer;

import che.swgc.client.model.entity.DroidekaModel;
import che.swgc.client.render.SwgcMobRenderState;
import che.swgc.entity.Droideka;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import org.joml.Matrix4f;

public class DroidekaForceFieldLayer extends RenderLayer<SwgcMobRenderState, DroidekaModel> {
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("swgc", "textures/entity/droideka/force_field.png");
   private static final float HALF_SIZE = 8.0F;

   public DroidekaForceFieldLayer(RenderLayerParent<SwgcMobRenderState, DroidekaModel> renderer) {
      super(renderer);
   }

   @Override
   public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int lightCoords, SwgcMobRenderState state, float yRot, float xRot) {
      if (!(state.entity instanceof Droideka droideka)) {
         return;
      }

      float partialTick = state.ageInTicks % 1.0F;
      float scale = droideka.getShieldAnim(partialTick);
      if (scale <= 0.0F) {
         return;
      }

      poseStack.pushPose();
      poseStack.translate(0.0F, 0.7F, 0.0F);
      float scaled = scale * scale;
      poseStack.scale(scaled, scaled, scaled);
      float health = Math.min(Math.abs(droideka.getForceField()) / 16.0F, 1.0F) * scaled;
      submitNodeCollector.submitCustomGeometry(poseStack, RenderTypes.eyes(TEXTURE), (pose, buffer) -> {
         Matrix4f matrix = pose.pose();
         float size = HALF_SIZE / 16.0F;
         int color = ((int)(health * 255.0F) << 16) | ((int)(health * 255.0F) << 8) | (int)(health * 255.0F) | 0xFF000000;
         addCubeFace(buffer, matrix, -size, -size, -size, size, -size, -size, size, size, -size, -size, size, -size, color);
         addCubeFace(buffer, matrix, -size, -size, size, -size, size, size, size, size, size, size, -size, size, color);
         addCubeFace(buffer, matrix, -size, size, -size, -size, size, size, size, size, size, size, size, -size, color);
         addCubeFace(buffer, matrix, -size, -size, -size, size, -size, -size, size, -size, size, -size, -size, size, color);
         addCubeFace(buffer, matrix, -size, -size, -size, -size, -size, size, -size, size, size, -size, size, -size, color);
         addCubeFace(buffer, matrix, size, -size, -size, size, -size, size, size, size, size, size, size, -size, color);
      });
      poseStack.popPose();
   }

   private static void addCubeFace(
      com.mojang.blaze3d.vertex.VertexConsumer buffer,
      Matrix4f matrix,
      float x0,
      float y0,
      float z0,
      float x1,
      float y1,
      float z1,
      float x2,
      float y2,
      float z2,
      float x3,
      float y3,
      float z3,
      int color
   ) {
      int r = (color >> 16) & 0xFF;
      int g = (color >> 8) & 0xFF;
      int b = color & 0xFF;
      int a = (color >> 24) & 0xFF;
      buffer.addVertex(matrix, x0, y0, z0).setColor(r, g, b, a);
      buffer.addVertex(matrix, x1, y1, z1).setColor(r, g, b, a);
      buffer.addVertex(matrix, x2, y2, z2).setColor(r, g, b, a);
      buffer.addVertex(matrix, x3, y3, z3).setColor(r, g, b, a);
   }
}
