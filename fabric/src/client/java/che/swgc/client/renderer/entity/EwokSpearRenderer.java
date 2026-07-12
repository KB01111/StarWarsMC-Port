package che.swgc.client.renderer.entity;

import che.swgc.client.model.item.EwokSpearModel;
import che.swgc.client.render.SwgcEntityRenderState;
import che.swgc.entity.EwokSpear;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.util.Unit;

public class EwokSpearRenderer extends EntityRenderer<EwokSpear, SwgcEntityRenderState> {
   public static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("swgc", "textures/entity/ewok_spear.png");
   private final EwokSpearModel model;

   public EwokSpearRenderer(EntityRendererProvider.Context ctx) {
      super(ctx);
      this.model = new EwokSpearModel(ctx.bakeLayer(EwokSpearModel.LAYER_LOCATION));
   }

   @Override
   public SwgcEntityRenderState createRenderState() {
      return new SwgcEntityRenderState();
   }

   @Override
   public void extractRenderState(EwokSpear entity, SwgcEntityRenderState state, float partialTick) {
      super.extractRenderState(entity, state, partialTick);
      state.entity = entity;
   }

   @Override
   public void submit(SwgcEntityRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
      EwokSpear spear = (EwokSpear)state.entity;
      if (spear == null) {
         super.submit(state, poseStack, submitNodeCollector, camera);
         return;
      }

      float partialTick = state.ageInTicks % 1.0F;
      poseStack.pushPose();
      poseStack.mulPose(Axis.YP.rotationDegrees(Mth.rotLerp(partialTick, spear.yRotO, spear.getYRot()) + 180.0F));
      poseStack.mulPose(Axis.XP.rotationDegrees(Mth.lerp(partialTick, spear.xRotO, spear.getXRot()) + 90.0F));
      submitNodeCollector.submitModel(
         this.model,
         Unit.INSTANCE,
         poseStack,
         RenderTypes.entityCutout(TEXTURE),
         state.lightCoords,
         OverlayTexture.NO_OVERLAY,
         -1,
         null,
         state.outlineColor,
         null
      );
      poseStack.popPose();
      super.submit(state, poseStack, submitNodeCollector, camera);
   }
}
