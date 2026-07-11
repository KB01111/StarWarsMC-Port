package che.swgc.client.renderer.entity;

import che.swgc.client.render.SwgcEntityRenderState;
import che.swgc.entity.ThrownLightsaber;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

/** Thrown lightsaber uses the vanilla thrown-item pipeline once ItemSupplier wiring lands in Phase 4. */
public class ThrownLightsaberRenderer extends EntityRenderer<ThrownLightsaber, SwgcEntityRenderState> {
   public ThrownLightsaberRenderer(EntityRendererProvider.Context context) {
      super(context);
   }

   @Override
   public SwgcEntityRenderState createRenderState() {
      return new SwgcEntityRenderState();
   }
}
