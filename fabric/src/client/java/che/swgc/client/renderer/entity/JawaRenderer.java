package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.JawaModel;
import che.swgc.entity.Jawa;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;

public class JawaRenderer extends GlowmaskMobRenderer<Jawa, JawaModel> {
   public JawaRenderer(EntityRendererProvider.Context ctx) {
      super(ctx, new JawaModel(ctx.bakeLayer(JawaModel.LAYER_LOCATION)), "jawa", 0.25F);
      this.addLayer(new ItemInHandLayer<>(this));
   }
}
