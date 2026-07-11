package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.DroidekaModel;
import che.swgc.client.renderer.entity.layer.DroidekaForceFieldLayer;
import che.swgc.entity.Droideka;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class DroidekaRenderer extends GlowmaskMobRenderer<Droideka, DroidekaModel<Droideka>> {
   public DroidekaRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new DroidekaModel<>(ctx.getPart(DroidekaModel.LAYER_LOCATION)), "droideka/droideka", 0.3F);
      this.addFeature(new DroidekaForceFieldLayer(this));
   }
}
