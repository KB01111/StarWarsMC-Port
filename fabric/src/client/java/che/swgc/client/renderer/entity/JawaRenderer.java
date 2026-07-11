package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.JawaModel;
import che.swgc.entity.Jawa;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

public class JawaRenderer extends GlowmaskMobRenderer<Jawa, net.minecraft.client.model.player.PlayerModel<Jawa>> {
   public JawaRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new JawaModel(ctx.getPart(JawaModel.LAYER_LOCATION)), "jawa", 0.25F);
      this.addFeature(new net.minecraft.client.renderer.entity.layers.ItemInHandLayer(this, ctx.getHeldItemRenderer()));
   }
}
