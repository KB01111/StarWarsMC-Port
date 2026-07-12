package che.swgc.client.renderer.blockentity;

import che.swgc.SwgcComponents;
import che.swgc.block.GasHarvesterBlock;
import che.swgc.block.entity.GasHarvesterBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemDisplayContext;

public class GasHarvesterScreenRenderer implements BlockEntityRenderer<GasHarvesterBlockEntity, GasHarvesterRenderState> {
   private static final int TEXT_COLOR = 60927;
   private final ItemModelResolver itemModelResolver;
   private final Font font;

   public GasHarvesterScreenRenderer(BlockEntityRendererProvider.Context ctx) {
      this.itemModelResolver = ctx.itemModelResolver();
      this.font = ctx.font();
   }

   @Override
   public GasHarvesterRenderState createRenderState() {
      return new GasHarvesterRenderState();
   }

   @Override
   public void extractRenderState(
      GasHarvesterBlockEntity blockEntity,
      GasHarvesterRenderState state,
      float partialTicks,
      net.minecraft.world.phys.Vec3 cameraPosition,
      net.minecraft.client.renderer.feature.ModelFeatureRenderer.CrumblingOverlay breakProgress
   ) {
      BlockEntityRenderer.super.extractRenderState(blockEntity, state, partialTicks, cameraPosition, breakProgress);
      state.vesselState = blockEntity.getBlockState().getValue(GasHarvesterBlock.VESSEL_STATE);
      state.facing = blockEntity.getBlockState().getValue(GasHarvesterBlock.FACING);
      state.vesselItem = state.vesselState.getItem();
      state.harvestProgress = blockEntity.getHarvestProgress(partialTicks);
   }

   @Override
   public void submit(GasHarvesterRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
      if (state.vesselState == GasHarvesterBlock.VesselState.ABSENT) {
         return;
      }

      poseStack.pushPose();
      poseStack.translate(0.5F, 0.0F, 0.5F);
      poseStack.mulPose(Axis.YN.rotationDegrees(state.facing.toYRot()));
      poseStack.translate(-0.07F, 0.44F, 0.27F);
      poseStack.mulPose(Axis.XP.rotationDegrees(67.5F));
      var itemState = new net.minecraft.client.renderer.item.ItemStackRenderState();
      this.itemModelResolver.updateForNonLiving(itemState, state.vesselItem, ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, null);
      itemState.submit(poseStack, submitNodeCollector, state.lightCoords, OverlayTexture.NO_OVERLAY, 0);
      poseStack.popPose();

      poseStack.pushPose();
      poseStack.translate(0.5F, 0.0F, 0.5F);
      poseStack.mulPose(Axis.YN.rotationDegrees(state.facing.toYRot()));
      poseStack.translate(0.0F, 0.80625F, 0.43125F);
      poseStack.mulPose(Axis.XP.rotationDegrees(-45.0F));
      poseStack.translate(-0.3F, 0.4375F, 0.01F);
      float scale = Math.min(0.6F / (float)this.font.width(SwgcComponents.FULL_LINE), 0.1875F / 9.0F);
      poseStack.scale(scale, -scale, scale);

      if (state.vesselState == GasHarvesterBlock.VesselState.EMPTY) {
         float process = state.harvestProgress;
         int fullUnits = (int)(process * 10.0F);
         Component progressBar = SwgcComponents.repeatedNTimes(SwgcComponents.FULL_UNIT, fullUnits)
            .append(SwgcComponents.repeatedNTimes(SwgcComponents.EMPTY_UNIT, 10 - fullUnits));
         submitText(submitNodeCollector, poseStack, progressBar, 0.0F, 0.0F, state.lightCoords);
         submitText(submitNodeCollector, poseStack, Component.literal((int)(process * 100.0F) + "%"), 0.0F, 9.0F, state.lightCoords);
      } else {
         submitText(submitNodeCollector, poseStack, SwgcComponents.FULL_LINE, 0.0F, 0.0F, state.lightCoords);
         submitText(submitNodeCollector, poseStack, Component.literal("100%"), 0.0F, 9.0F, state.lightCoords);
      }

      poseStack.popPose();
   }

   private void submitText(SubmitNodeCollector submitNodeCollector, PoseStack poseStack, Component text, float x, float y, int lightCoords) {
      submitNodeCollector.submitText(
         poseStack,
         x,
         y,
         text.getVisualOrderText(),
         false,
         Font.DisplayMode.NORMAL,
         lightCoords,
         TEXT_COLOR,
         0,
         0
      );
   }
}
