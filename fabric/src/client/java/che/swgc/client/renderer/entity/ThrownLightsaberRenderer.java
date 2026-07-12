package che.swgc.client.renderer.entity;

import che.swgc.client.render.SwgcEntityRenderState;
import che.swgc.entity.ThrownLightsaber;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemDisplayContext;

public class ThrownLightsaberRenderer extends EntityRenderer<ThrownLightsaber, SwgcEntityRenderState> {
   public ThrownLightsaberRenderer(EntityRendererProvider.Context context) {
      super(context);
   }

   @Override
   public SwgcEntityRenderState createRenderState() {
      return new SwgcEntityRenderState();
   }

   @Override
   public void extractRenderState(ThrownLightsaber entity, SwgcEntityRenderState state, float partialTick) {
      super.extractRenderState(entity, state, partialTick);
      state.entity = entity;
   }

   @Override
   public void submit(SwgcEntityRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
      if (!(state.entity instanceof ThrownLightsaber entity)) {
         super.submit(state, poseStack, submitNodeCollector, camera);
         return;
      }

      float partialTick = state.ageInTicks % 1.0F;
      float entityYaw = Mth.lerp(partialTick, entity.yRotO, entity.getYRot());
      float entityPitch = Mth.lerp(partialTick, entity.xRotO, entity.getXRot());
      poseStack.pushPose();
      poseStack.mulPose(Axis.YP.rotationDegrees(entityYaw));
      poseStack.mulPose(Axis.XP.rotationDegrees(entityPitch));
      var itemState = new net.minecraft.client.renderer.item.ItemStackRenderState();
      Minecraft.getInstance().getItemModelResolver().updateForNonLiving(itemState, entity.getLightsaber(), ItemDisplayContext.GROUND, null);
      itemState.submit(poseStack, submitNodeCollector, state.lightCoords, OverlayTexture.NO_OVERLAY, entity.getId());
      poseStack.popPose();
      super.submit(state, poseStack, submitNodeCollector, camera);
   }
}
