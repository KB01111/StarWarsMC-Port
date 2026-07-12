package che.swgc.client.renderer.entity.layer;

import che.swgc.client.render.SwgcMobRenderState;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Unit;

public class VehicleGlassLayer<M extends EntityModel<SwgcMobRenderState>> extends RenderLayer<SwgcMobRenderState, M> {
   private final Model.Simple glassModel;
   private final Identifier texture;

   public VehicleGlassLayer(RenderLayerParent<SwgcMobRenderState, M> renderer, ModelPart model, Identifier texture) {
      super(renderer);
      this.glassModel = new Model.Simple(model, RenderTypes::entityCutout);
      this.texture = texture;
   }

   @Override
   public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int lightCoords, SwgcMobRenderState state, float yRot, float xRot) {
      if (state.isInvisibleToPlayer && Minecraft.getInstance().player != null) {
         return;
      }

      submitNodeCollector.submitModel(
         this.glassModel,
         Unit.INSTANCE,
         poseStack,
         RenderTypes.entityCutout(this.texture),
         lightCoords,
         LivingEntityRenderer.getOverlayCoords(state, 0.0F),
         -1,
         null,
         state.outlineColor,
         null
      );
   }
}
