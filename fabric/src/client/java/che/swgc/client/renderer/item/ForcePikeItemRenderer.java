package che.swgc.client.renderer.item;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.model.item.ForcePikeModel;
import che.swgc.item.ForcePikeItem;
import net.minecraft.util.Util;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemDisplayContext;
import org.joml.Matrix4f;

public class ForcePikeItemRenderer extends SimpleItemRenderer<ForcePikeModel> {
   public ForcePikeItemRenderer(EntityModelSet models) {
      super(new ForcePikeModel(models.bakeLayer(ForcePikeModel.LAYER_LOCATION)), SwgcClientUtils.entityTex("item/force_pike"));
   }

   @Override
   public void render(ItemStack itemStack, ItemDisplayContext ctx, PoseStack poseStack, SubmitNodeCollector src, float partialTick, int packedLight, int packedOverlay) {
      super.render(itemStack, ctx, poseStack, src, partialTick, packedLight, packedOverlay);
      if (ForcePikeItem.isActive(itemStack)) {
         poseStack.pushPose();
         poseStack.translate(0.5F, 1.5F, 0.5F);
         src.submitCustomGeometry(poseStack, RenderTypes.lightning(), (pose, buffer) -> {
            RandomSource random = RandomSource.create(Util.getMillis() / 25L);
            float[] xCoords = new float[4];
            float[] zCoords = new float[4];
            xCoords[0] = xCoords[2] = zCoords[0] = zCoords[2] = 0.0F;
            xCoords[1] = random.nextFloat() * 0.375F - 0.1875F;
            xCoords[2] = random.nextFloat() * 0.375F - 0.1875F;
            zCoords[1] = random.nextFloat() * 0.375F - 0.1875F;
            zCoords[2] = random.nextFloat() * 0.375F - 0.1875F;
            Matrix4f matrix4f = pose.pose();

            for (int layer = 0; layer < 4; layer++) {
               random.setSeed(Util.getMillis() / 25L);

               for (int y = 0; y < 3; y++) {
                  float x0 = xCoords[y];
                  float x1 = xCoords[y + 1];
                  float z0 = zCoords[y];
                  float z1 = zCoords[y + 1];
                  float width = 0.016F + (float)layer * 0.016F;
                  float r = 0.5F - (float)layer * 0.1F;
                  float g = layer == 3 ? 0.0F : 1.0F / (float)(1 + layer * 2);
                  float b = r * 2.0F;
                  quad(matrix4f, buffer, x0, z0, y, x1, z1, width, r, g, b, false, false, true, false);
                  quad(matrix4f, buffer, x0, z0, y, x1, z1, width, r, g, b, true, false, true, true);
                  quad(matrix4f, buffer, x0, z0, y, x1, z1, width, r, g, b, true, true, false, true);
                  quad(matrix4f, buffer, x0, z0, y, x1, z1, width, r, g, b, false, true, false, false);
               }
            }
         });
         poseStack.popPose();
      }
   }

   private static void quad(
      Matrix4f matrix4f,
      com.mojang.blaze3d.vertex.VertexConsumer buffer,
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
