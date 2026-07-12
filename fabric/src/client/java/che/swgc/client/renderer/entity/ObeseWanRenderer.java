package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.ObeseWanModel;
import che.swgc.entity.ObeseWan;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class ObeseWanRenderer extends che.swgc.client.render.SwgcMobRenderer<ObeseWan, ObeseWanModel> {
   public static final net.minecraft.resources.Identifier TEXTURE = Identifier.fromNamespaceAndPath("swgc", "textures/entity/obese_wan.png");

   public ObeseWanRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new ObeseWanModel(ctx.bakeLayer(ObeseWanModel.LAYER_LOCATION)), 0.25F);
   }

   @Override
   protected void scale(che.swgc.client.render.SwgcMobRenderState state, PoseStack poseStack) {
      super.scale(state, poseStack);
      ObeseWan livingEntity = (ObeseWan)state.entity;
      if (livingEntity != null) {
         float width = 0.9375F * livingEntity.getObesity();
         poseStack.scale(width, 0.9375F, width);
      }
   }

   public net.minecraft.resources.Identifier getTextureLocation(che.swgc.client.render.SwgcMobRenderState state) {
      return TEXTURE;
   }
}
