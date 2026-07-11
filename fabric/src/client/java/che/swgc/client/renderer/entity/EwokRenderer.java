package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.EwokModel;
import che.swgc.entity.Ewok;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.resources.Identifier;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class EwokRenderer extends che.swgc.client.render.SwgcMobRenderer<Ewok, EwokModel<Ewok>> {
   public EwokRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new EwokModel(ctx.getPart(EwokModel.LAYER_LOCATION)), 0.2F);
      this.addFeature(new net.minecraft.client.renderer.entity.layers.ItemInHandLayer(this, ctx.getHeldItemRenderer()));
   }

   public net.minecraft.resources.Identifier textureLocation(Ewok ewok) {
      return Identifier.fromNamespaceAndPath("swgc", "textures/entity/ewok/" + ewok.getVariant().name().toLowerCase() + ".png");
   }
}
