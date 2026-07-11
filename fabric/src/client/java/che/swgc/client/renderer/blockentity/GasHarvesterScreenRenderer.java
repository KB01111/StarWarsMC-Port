package che.swgc.client.renderer.blockentity;

import che.swgc.block.GasHarvesterBlock;
import che.swgc.block.entity.GasHarvesterBlockEntity;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.Font;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.core.RotationAxis;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.item.ItemRenderer;
import net.minecraft.client.gui.Font.TextLayerType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider.Context;

public class GasHarvesterScreenRenderer implements net.minecraft.client.renderer.blockentity.BlockEntityRenderer<GasHarvesterBlockEntity> {
   private final net.minecraft.client.renderer.item.ItemRenderer itemRenderer;
   private final net.minecraft.client.gui.Font font;

   public GasHarvesterScreenRenderer(net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider.Context ctx) {
      this.itemRenderer = ctx.getItemRenderer();
      this.font = ctx.getFont();
   }

   public void render(GasHarvesterBlockEntity blockEntity, float partialTick, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource src, int packedLight, int packedOverlay) {
      GasHarvesterBlock.VesselState vesselState = (GasHarvesterBlock.VesselState)blockEntity.getCachedState().get(GasHarvesterBlock.VESSEL_STATE);
      if (vesselState != GasHarvesterBlock.VesselState.ABSENT) {
         poseStack.push();
         poseStack.translate(0.5F, 0.0F, 0.5F);
         poseStack.multiply(
            net.minecraft.core.RotationAxis.NEGATIVE_Y.rotationDegrees(((net.minecraft.core.Direction)blockEntity.getCachedState().get(GasHarvesterBlock.FACING)).asRotation())
         );
         poseStack.push();
         poseStack.translate(-0.07F, 0.44F, 0.27F);
         poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_X.rotationDegrees(67.5F));
         this.itemRenderer.renderItem(vesselState.getItem(), net.minecraft.world.item.ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, packedLight, packedOverlay, poseStack, src, blockEntity.getWorld(), 0);
         poseStack.pop();
         poseStack.push();
         poseStack.translate(0.0F, 0.80625F, 0.43125F);
         poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_X.rotationDegrees(-45.0F));
         poseStack.translate(-0.3F, 0.4375F, 0.01F);
         float scale = Math.min(0.6F / (float)this.font.getWidth(che.swgc.SwgcComponents.FULL_LINE), 0.1875F / 9.0F);
         poseStack.scale(scale, -scale, scale);
         if (vesselState == GasHarvesterBlock.VesselState.EMPTY) {
            float process = blockEntity.getHarvestProgress(partialTick);
            int fullUnits = (int)(process * 10.0F);
            this.font
               .draw(
                  che.swgc.SwgcComponents.repeatedNTimes(che.swgc.SwgcComponents.FULL_UNIT, fullUnits)
                     .append(che.swgc.SwgcComponents.repeatedNTimes(che.swgc.SwgcComponents.EMPTY_UNIT, 10 - fullUnits)),
                  0.0F,
                  0.0F,
                  60927,
                  false,
                  poseStack.peek().getPositionMatrix(),
                  src,
                  net.minecraft.client.gui.Font.TextLayerType.NORMAL,
                  0,
                  15728880
               );
            this.font
               .draw(
                  net.minecraft.network.chat.Component.literal((int)(process * 100.0F) + "%"),
                  0.0F,
                  9.0F,
                  60927,
                  false,
                  poseStack.peek().getPositionMatrix(),
                  src,
                  net.minecraft.client.gui.Font.TextLayerType.NORMAL,
                  0,
                  15728880
               );
         } else {
            this.font
               .draw(
                  che.swgc.SwgcComponents.FULL_LINE,
                  0.0F,
                  0.0F,
                  60927,
                  false,
                  poseStack.peek().getPositionMatrix(),
                  src,
                  net.minecraft.client.gui.Font.TextLayerType.NORMAL,
                  0,
                  15728880
               );
            this.font
               .draw(
                  net.minecraft.network.chat.Component.literal("100%"), 0.0F, 9.0F, 60927, false, poseStack.peek().getPositionMatrix(), src, net.minecraft.client.gui.Font.TextLayerType.NORMAL, 0, 15728880
               );
         }

         poseStack.pop();
         poseStack.pop();
      }
   }
}
