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
import net.minecraft.util.Unit;

@javax.annotation.ParametersAreNonnullByDefault
public class DarkSaberItemRenderer extends LightsaberItemRenderer {
   private static final Identifier TEXTURE = SwgcClientUtils.entityTex("item/lightsaber/dark");
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
      src.submitModel(this.model, ITEM_RENDER_STATE, poseStack, RenderTypes.entitySolid(TEXTURE), packedLight, packedOverlay, 0, null);
      if (ctx != ItemDisplayContext.GUI && anim > 0.0F) {
         this.model.translateToBlade(poseStack);
         poseStack.scale(-1.0F, -anim, 1.0F);
         // Blade VFX stubbed for 26.2 submit pipeline; hilt model renders above.
      }

      poseStack.popPose();
   }
}
