package che.swgc.client.renderer.item;

import net.minecraft.resources.Identifier;
import che.swgc.client.model.item.ForcePikeModel;
import che.swgc.item.ForcePikeItem;
import net.minecraft.util.Util;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.rendertype.RenderType;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemDisplayContext;
import org.joml.Matrix4f;

public class ForcePikeItemRenderer extends SimpleItemRenderer<ForcePikeModel> {
   public ForcePikeItemRenderer(net.minecraft.client.model.geom.EntityModelSet models) {
      super(new ForcePikeModel(models.bakeLayer(ForcePikeModel.LAYER_LOCATION)), Identifier.fromNamespaceAndPath("swgc", "textures/entity/item/force_pike.png"));
   }

   @Override
   public void render(net.minecraft.world.item.ItemStack itemStack, net.minecraft.world.item.ItemDisplayContext ctx, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource src, float partialTick, int packedLight, int packedOverlay) {
      super.render(itemStack, ctx, poseStack, src, partialTick, packedLight, packedOverlay);
      if (ForcePikeItem.isActive(itemStack)) {
         poseStack.pushPose();
         poseStack.translate(0.5F, 1.5F, 0.5F);
         net.minecraft.util.RandomSource random = net.minecraft.util.RandomSource.create(net.minecraft.util.Util.getMillis() / 25L);
         float[] xCoords = new float[4];
         float[] zCoords = new float[4];
         xCoords[0] = xCoords[2] = zCoords[0] = zCoords[2] = 0.0F;
         xCoords[1] = random.nextFloat() * 0.375F - 0.1875F;
         xCoords[2] = random.nextFloat() * 0.375F - 0.1875F;
         zCoords[1] = random.nextFloat() * 0.375F - 0.1875F;
         zCoords[2] = random.nextFloat() * 0.375F - 0.1875F;
         VertexConsumer buffer = src.getBuffer(net.minecraft.client.renderer.rendertype.RenderTypes.lightning());
         Matrix4f pose = poseStack.last().pose();

         for (int layer = 0; layer < 4; layer++) {
            random.setSeed(net.minecraft.util.Util.getMillis() / 25L);

            for (int y = 0; y < 3; y++) {
               float x0 = xCoords[y];
               float x1 = xCoords[y + 1];
               float z0 = zCoords[y];
               float z1 = zCoords[y + 1];
               float width = 0.016F + (float)layer * 0.016F;
               float r = 0.5F - (float)layer * 0.1F;
               float g = layer == 3 ? 0.0F : 1.0F / (float)(1 + layer * 2);
               float b = r * 2.0F;
               quad(pose, buffer, x0, z0, y, x1, z1, width, r, g, b, false, false, true, false);
               quad(pose, buffer, x0, z0, y, x1, z1, width, r, g, b, true, false, true, true);
               quad(pose, buffer, x0, z0, y, x1, z1, width, r, g, b, true, true, false, true);
               quad(pose, buffer, x0, z0, y, x1, z1, width, r, g, b, false, true, false, false);
            }
         }

         poseStack.popPose();
      }
   }

   private static void quad(
      Matrix4f matrix4f,
      VertexConsumer buffer,
      float x0,
      float z0,
      int y,
      float x1,
      float z1,
      float width,
      float r,
      float g,
      float b,
      boolean right0,
      boolean front0,
      boolean right1,
      boolean front1
   ) {
      float yf = (float)y * -0.125F;
      buffer.addVertex(matrix4f, x0 + (right0 ? width : -width), yf, z0 + (front0 ? width : -width)).setColor(r, g, b, 1.0F);
      buffer.addVertex(matrix4f, x0 + (right1 ? width : -width), yf, z0 + (front1 ? width : -width)).setColor(r, g, b, 1.0F);
      buffer.addVertex(matrix4f, x1 + (right1 ? width : -width), yf - 0.125F, z1 + (front1 ? width : -width)).setColor(r, g, b, 1.0F);
      buffer.addVertex(matrix4f, x1 + (right0 ? width : -width), yf - 0.125F, z1 + (front0 ? width : -width)).setColor(r, g, b, 1.0F);
   }
}
