package che.swgc.client.renderer.item;

import che.swgc.client.compat.render.DeferredItemBuffers;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class SwgcItemSpecialRenderer implements SpecialModelRenderer<ItemStack> {
   public static final MapCodec<SwgcItemSpecialRenderer.Unbaked> MAP_CODEC = MapCodec.unit(new SwgcItemSpecialRenderer.Unbaked());

   @Override
   public @Nullable ItemStack extractArgument(ItemStack stack) {
      return stack;
   }

   @Override
   public void submit(
      @Nullable ItemStack stack,
      PoseStack poseStack,
      SubmitNodeCollector submitNodeCollector,
      int lightCoords,
      int overlayCoords,
      boolean hasFoil,
      int outlineColor
   ) {
      if (stack == null) {
         return;
      }

      ItemRenderer renderer = SwgcItemRendererRegistry.INSTANCE.getRenderer(stack.getItem());
      if (renderer == null) {
         return;
      }

      DeferredItemBuffers buffers = new DeferredItemBuffers();
      renderer.render(stack, SwgcItemRenderContext.get(), poseStack, buffers, 0.0F, lightCoords, overlayCoords);
      buffers.flush(poseStack, submitNodeCollector.order(0), outlineColor);
   }

   @Override
   public void getExtents(Consumer<Vector3fc> output) {
      output.accept(new org.joml.Vector3f(-0.5F, 0.0F, -0.5F));
      output.accept(new org.joml.Vector3f(0.5F, 2.0F, 0.5F));
   }

   public record Unbaked() implements SpecialModelRenderer.Unbaked<ItemStack> {
      @Override
      public @Nullable SwgcItemSpecialRenderer bake(SpecialModelRenderer.BakingContext context) {
         return new SwgcItemSpecialRenderer();
      }

      @Override
      public MapCodec<? extends SpecialModelRenderer.Unbaked<ItemStack>> type() {
         return MAP_CODEC;
      }
   }
}
