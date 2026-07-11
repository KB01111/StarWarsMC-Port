package che.swgc.client.renderer.item;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.model.item.LightsaberModel;
import che.swgc.item.LightsaberItem;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.VertexConsumer;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.model.geom.EntityModelSet;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.item.ItemDisplayContext;
import org.joml.Matrix4f;

@javax.annotation.ParametersAreNonnullByDefault
public class DarkSaberItemRenderer extends LightsaberItemRenderer {
   private static final net.minecraft.resources.Identifier TEXTURE = SwgcClientUtils.entityTex("item/lightsaber/dark");
   private static final float BLADE_THICKNESS = 0.1875F;
   private static final float OUTLINE_THICKNESS = 0.125F;
   private static final float THICKNESS = 0.3125F;
   private static final float Y0 = 3.0F;
   private static final float Y1 = 2.25F;
   private static final float OUTLINE_Y0;
   private static final float OUTLINE_Y1;
   private final LightsaberModel model;

   public DarkSaberItemRenderer(net.minecraft.client.model.geom.EntityModelSet models) {
      super(models);
      this.model = new LightsaberModel(models.bakeLayer(LightsaberModel.DARK_LOCATION));
   }

   @Override
   public void render(net.minecraft.world.item.ItemStack stack, net.minecraft.world.item.ItemDisplayContext ctx, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource src, float partialTick, int packedLight, int packedOverlay) {
      boolean active = LightsaberItem.isActive(stack);
      float anim = this.getAnim(stack, active, partialTick);
      poseStack.push();
      poseStack.translate(0.5F, 1.501F, 0.5F);
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      this.model.render(poseStack, src.getBuffer(net.minecraft.client.renderer.rendertype.RenderType.getEntitySolid(TEXTURE)), packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);
      if (ctx != net.minecraft.world.item.ItemDisplayContext.GUI && anim > 0.0F) {
         this.model.translateToBlade(poseStack);
         poseStack.scale(-1.0F, -anim, 1.0F);
         net.minecraft.client.renderer.VertexConsumer buffer = src.getBuffer(net.minecraft.client.renderer.rendertype.RenderType.getDebugQuads());
         Matrix4f pose = poseStack.peek().getPositionMatrix();
         buffer.vertex(pose, 0.0F, 0.0F, 0.0F).color(0, 0, 0, 255).next();
         buffer.vertex(pose, 0.0F, 3.0F, 0.0F).color(0, 0, 0, 255).next();
         buffer.vertex(pose, 0.0F, 2.25F, -0.1875F).color(0, 0, 0, 255).next();
         buffer.vertex(pose, 0.0F, 0.0F, -0.1875F).color(0, 0, 0, 255).next();
         buffer.vertex(pose, 0.0F, 0.0F, 0.0F).color(255, 255, 255, 255).next();
         buffer.vertex(pose, 0.0F, 0.0F, 0.125F).color(255, 255, 255, 0).next();
         buffer.vertex(pose, 0.0F, 3.0F, 0.125F).color(255, 255, 255, 0).next();
         buffer.vertex(pose, 0.0F, 3.0F, 0.0F).color(255, 255, 255, 255).next();
         buffer.vertex(pose, 0.0F, 3.0F, 0.0F).color(255, 255, 255, 255).next();
         buffer.vertex(pose, 0.0F, 3.0F, 0.125F).color(255, 255, 255, 0).next();
         buffer.vertex(pose, 0.0F, OUTLINE_Y0, 0.125F).color(255, 255, 255, 0).next();
         buffer.vertex(pose, 0.0F, OUTLINE_Y0, 0.0F).color(255, 255, 255, 0).next();
         buffer.vertex(pose, 0.0F, 3.0F, 0.0F).color(255, 255, 255, 255).next();
         buffer.vertex(pose, 0.0F, OUTLINE_Y0, 0.0F).color(255, 255, 255, 0).next();
         buffer.vertex(pose, 0.0F, OUTLINE_Y1, -0.3125F).color(255, 255, 255, 0).next();
         buffer.vertex(pose, 0.0F, 2.25F, -0.1875F).color(255, 255, 255, 255).next();
         buffer.vertex(pose, 0.0F, 2.25F, -0.1875F).color(255, 255, 255, 255).next();
         buffer.vertex(pose, 0.0F, OUTLINE_Y1, -0.3125F).color(255, 255, 255, 0).next();
         buffer.vertex(pose, 0.0F, 0.0F, -0.3125F).color(255, 255, 255, 0).next();
         buffer.vertex(pose, 0.0F, 0.0F, -0.1875F).color(255, 255, 255, 255).next();
      }

      poseStack.pop();
   }

   static {
      float coef = -4.0F;
      float sqrt = net.minecraft.util.Mth.sqrt(coef * coef + 1.0F);
      OUTLINE_Y0 = 3.0F + 0.125F * sqrt;
      OUTLINE_Y1 = 2.25F + 0.125F * (coef + sqrt);
   }
}
