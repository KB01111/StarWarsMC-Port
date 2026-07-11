package che.swgc.client.renderer.blockentity;

import che.swgc.block.GasHarvesterBlock;
import che.swgc.block.entity.GasHarvesterBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.level.Level;

public class GasHarvesterScreenRenderer implements BlockEntityRenderer<GasHarvesterBlockEntity, GasHarvesterRenderState> {
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
   }

   @Override
   public void submit(GasHarvesterRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
      if (state.vesselState == GasHarvesterBlock.VesselState.ABSENT) {
         return;
      }

      poseStack.pushPose();
      poseStack.translate(0.5F, 0.0F, 0.5F);
      poseStack.mulPose(com.mojang.math.Axis.YN.rotationDegrees(state.facing.toYRot()));
      poseStack.translate(-0.07F, 0.44F, 0.27F);
      poseStack.mulPose(com.mojang.math.Axis.XP.rotationDegrees(67.5F));
      var itemState = new net.minecraft.client.renderer.item.ItemStackRenderState();
      this.itemModelResolver.updateForNonLiving(itemState, state.vesselItem, ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, null);
      itemState.submit(poseStack, submitNodeCollector, state.lightCoords, OverlayTexture.NO_OVERLAY, 0);
      poseStack.popPose();
   }
}
