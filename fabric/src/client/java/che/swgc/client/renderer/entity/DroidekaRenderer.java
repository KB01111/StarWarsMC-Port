package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.DroidekaModel;
import che.swgc.client.renderer.entity.layer.DroidekaForceFieldLayer;
import che.swgc.entity.Droideka;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

@ParametersAreNonnullByDefault
public class DroidekaRenderer extends GlowmaskMobRenderer<Droideka, DroidekaModel> {
   public DroidekaRenderer(EntityRendererProvider.Context ctx) {
      super(ctx, new DroidekaModel(ctx.bakeLayer(DroidekaModel.LAYER_LOCATION)), "droideka/droideka", 0.3F);
      this.addLayer(new DroidekaForceFieldLayer(this));
   }
}
