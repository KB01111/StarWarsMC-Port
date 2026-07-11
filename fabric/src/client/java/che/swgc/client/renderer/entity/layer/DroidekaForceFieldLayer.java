package che.swgc.client.renderer.entity.layer;

import che.swgc.client.model.entity.DroidekaModel;
import che.swgc.client.render.SwgcMobRenderState;
import che.swgc.entity.Droideka;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;

public class DroidekaForceFieldLayer extends RenderLayer<SwgcMobRenderState, DroidekaModel> {
   public DroidekaForceFieldLayer(RenderLayerParent<SwgcMobRenderState, DroidekaModel> renderer) {
      super(renderer);
   }

   @Override
   public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int lightCoords, SwgcMobRenderState state, float yRot, float xRot) {
      if (!(state.entity instanceof Droideka droideka)) {
         return;
      }

      float partialTick = state.ageInTicks % 1.0F;
      float scale = droideka.getShieldAnim(partialTick);
      if (scale <= 0.0F) {
         return;
      }

      // Force-field cuboid rendering deferred to Phase 4; shield scale is extracted here for parity.
   }
}
