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
public class ObeseWanRenderer extends che.swgc.client.render.SwgcMobRenderer<ObeseWan, ObeseWanModel<ObeseWan>> {
   public static final net.minecraft.resources.Identifier TEXTURE = Identifier.fromNamespaceAndPath("swgc", "textures/entity/obese_wan.png");

   public ObeseWanRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new ObeseWanModel(ctx.getPart(ObeseWanModel.LAYER_LOCATION)), 0.25F);
   }

   protected void scale(ObeseWan livingEntity, com.mojang.blaze3d.vertex.PoseStack poseStack, float partialTickTime) {
      super.scale(livingEntity, poseStack, partialTickTime);
      float width = 0.9375F * livingEntity.getObesity();
      poseStack.scale(width, 0.9375F, width);
   }

   public net.minecraft.resources.Identifier textureLocation(ObeseWan obeseWan) {
      return TEXTURE;
   }
}
