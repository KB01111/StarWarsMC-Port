package che.swgc.client.renderer.item;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.model.item.LightsaberModel;
import che.swgc.item.LightsaberItem;
import net.minecraft.world.item.ItemStack;
import che.swgc.client.render.SwgcMobRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import org.joml.Matrix4f;

@javax.annotation.ParametersAreNonnullByDefault
public class DarkSaberItemRenderer extends LightsaberItemRenderer {
   private static final Identifier TEXTURE = SwgcClientUtils.entityTex("item/lightsaber/dark");
   private static final float BLADE_THICKNESS = 0.1875F;
   private static final float OUTLINE_THICKNESS = 0.125F;
   private static final float Y0 = 3.0F;
   private static final float Y1 = 2.25F;
   private static final float OUTLINE_Y0;
   private static final float OUTLINE_Y1;
   private static final SwgcMobRenderState ITEM_RENDER_STATE = new SwgcMobRenderState();
   private final LightsaberModel model;

   public DarkSaberItemRenderer(EntityModelSet models) {
      super(models);
      this.model = new LightsaberModel(models.bakeLayer(LightsaberModel.DARK_LOCATION));
   }

   @Override
   public void render(ItemStack stack, ItemDisplayContext ctx, PoseStack poseStack, SubmitNodeCollector src, float partialTick, int packedLight, int packedOverlay) {
      boolean active = LightsaberItem.isActive(stack);
      float anim = this.getAnim(stack, active, partialTick);
      poseStack.pushPose();
      poseStack.translate(0.5F, 1.501F, 0.5F);
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      boolean firstPerson = ctx == ItemDisplayContext.FIRST_PERSON_RIGHT_HAND || ctx == ItemDisplayContext.FIRST_PERSON_LEFT_HAND;
      ITEM_RENDER_STATE.entity = firstPerson || ctx == ItemDisplayContext.GUI ? Minecraft.getInstance().player : null;
      ITEM_RENDER_STATE.ageInTicks = Minecraft.getInstance().level != null ? Minecraft.getInstance().level.getGameTime() + partialTick : partialTick;
      this.model.setupAnim(ITEM_RENDER_STATE);
      src.submitModel(this.model, ITEM_RENDER_STATE, poseStack, RenderTypes.entitySolid(TEXTURE), packedLight, packedOverlay, 0, null);
      if (ctx != ItemDisplayContext.GUI && anim > 0.0F) {
         this.model.translateToBlade(poseStack);
         poseStack.scale(-1.0F, -anim, 1.0F);
         src.submitCustomGeometry(poseStack, RenderTypes.debugQuads(), (pose, buffer) -> {
            Matrix4f matrix = pose.pose();
            buffer.addVertex(matrix, 0.0F, 0.0F, 0.0F).setColor(0, 0, 0, 255);
            buffer.addVertex(matrix, 0.0F, Y0, 0.0F).setColor(0, 0, 0, 255);
            buffer.addVertex(matrix, 0.0F, Y1, -BLADE_THICKNESS).setColor(0, 0, 0, 255);
            buffer.addVertex(matrix, 0.0F, 0.0F, -BLADE_THICKNESS).setColor(0, 0, 0, 255);
            buffer.addVertex(matrix, 0.0F, 0.0F, 0.0F).setColor(255, 255, 255, 255);
            buffer.addVertex(matrix, 0.0F, 0.0F, OUTLINE_THICKNESS).setColor(255, 255, 255, 0);
            buffer.addVertex(matrix, 0.0F, Y0, OUTLINE_THICKNESS).setColor(255, 255, 255, 0);
            buffer.addVertex(matrix, 0.0F, Y0, 0.0F).setColor(255, 255, 255, 255);
            buffer.addVertex(matrix, 0.0F, Y0, 0.0F).setColor(255, 255, 255, 255);
            buffer.addVertex(matrix, 0.0F, Y0, OUTLINE_THICKNESS).setColor(255, 255, 255, 0);
            buffer.addVertex(matrix, 0.0F, OUTLINE_Y0, OUTLINE_THICKNESS).setColor(255, 255, 255, 0);
            buffer.addVertex(matrix, 0.0F, OUTLINE_Y0, 0.0F).setColor(255, 255, 255, 0);
            buffer.addVertex(matrix, 0.0F, Y0, 0.0F).setColor(255, 255, 255, 255);
            buffer.addVertex(matrix, 0.0F, OUTLINE_Y0, 0.0F).setColor(255, 255, 255, 0);
            buffer.addVertex(matrix, 0.0F, OUTLINE_Y1, -0.3125F).setColor(255, 255, 255, 0);
            buffer.addVertex(matrix, 0.0F, Y1, -BLADE_THICKNESS).setColor(255, 255, 255, 255);
            buffer.addVertex(matrix, 0.0F, Y1, -BLADE_THICKNESS).setColor(255, 255, 255, 255);
            buffer.addVertex(matrix, 0.0F, OUTLINE_Y1, -0.3125F).setColor(255, 255, 255, 0);
            buffer.addVertex(matrix, 0.0F, 0.0F, -0.3125F).setColor(255, 255, 255, 0);
            buffer.addVertex(matrix, 0.0F, 0.0F, -BLADE_THICKNESS).setColor(255, 255, 255, 255);
         });
      }

      poseStack.popPose();
   }

   static {
      float coef = -4.0F;
      float sqrt = Mth.sqrt(coef * coef + 1.0F);
      OUTLINE_Y0 = Y0 + OUTLINE_THICKNESS * sqrt;
      OUTLINE_Y1 = Y1 + OUTLINE_THICKNESS * (coef + sqrt);
   }
}
