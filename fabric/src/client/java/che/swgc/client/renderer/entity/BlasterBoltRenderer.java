package che.swgc.client.renderer.entity;

import che.swgc.client.model.PlasmaRodModel;
import che.swgc.client.render.SwgcEntityRenderState;
import che.swgc.entity.BlasterBolt;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ARGB;
import net.minecraft.util.Mth;
import net.minecraft.util.Unit;

public class BlasterBoltRenderer extends EntityRenderer<BlasterBolt, SwgcEntityRenderState> {
   private final PlasmaRodModel model;

   public BlasterBoltRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new PlasmaRodModel(context.bakeLayer(PlasmaRodModel.LAYER_LOCATION), true, 0.75F, 0.5F);
   }

   @Override
   public SwgcEntityRenderState createRenderState() {
      return new SwgcEntityRenderState();
   }

   @Override
   public void extractRenderState(BlasterBolt entity, SwgcEntityRenderState state, float partialTick) {
      super.extractRenderState(entity, state, partialTick);
      state.entity = entity;
      state.yaw = Mth.lerp(partialTick, entity.yRotO, entity.getYRot());
      state.pitch = Mth.lerp(partialTick, entity.xRotO, entity.getXRot());
   }

   @Override
   public void submit(SwgcEntityRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
      BlasterBolt entity = (BlasterBolt)state.entity;
      if (entity == null) {
         super.submit(state, poseStack, submitNodeCollector, camera);
         return;
      }

      poseStack.pushPose();
      poseStack.mulPose(Axis.YP.rotationDegrees(state.yaw));
      poseStack.mulPose(Axis.XP.rotationDegrees(-state.pitch + 90.0F));
      poseStack.translate(0.0F, -0.375F, 0.0F);
      Identifier texture = PlasmaRodModel.DEFAULT_TEXTURE;
      submitNodeCollector.submitModel(this.model, Unit.INSTANCE, poseStack, this.model.renderType(texture), state.lightCoords, OverlayTexture.NO_OVERLAY, -1, null, state.outlineColor, null);
      submitNodeCollector.submitModel(this.model, Unit.INSTANCE, poseStack, RenderTypes.beaconBeam(texture, false), state.lightCoords, OverlayTexture.NO_OVERLAY, -1, null, state.outlineColor, null);
      poseStack.popPose();
      super.submit(state, poseStack, submitNodeCollector, camera);
   }
}
