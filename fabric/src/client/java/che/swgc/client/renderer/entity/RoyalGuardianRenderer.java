package che.swgc.client.renderer.entity;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.model.entity.RoyalGuardianModel;
import che.swgc.entity.RoyalGuardian;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.resources.Identifier;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class RoyalGuardianRenderer extends che.swgc.client.render.SwgcMobRenderer<RoyalGuardian, RoyalGuardianModel<RoyalGuardian>> {
   public static final net.minecraft.resources.Identifier TEXTURE = SwgcClientUtils.entityTex("royal_guardian");

   public RoyalGuardianRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new RoyalGuardianModel(ctx.getPart(RoyalGuardianModel.LAYER_LOCATION)), 0.5F);
      this.addFeature(new net.minecraft.client.renderer.entity.layers.ItemInHandLayer(this, ctx.getHeldItemRenderer()));
   }

   public net.minecraft.resources.Identifier textureLocation(RoyalGuardian royalGuardian) {
      return TEXTURE;
   }
}
