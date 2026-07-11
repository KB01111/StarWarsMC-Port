package che.swgc.client.renderer.item;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.Function;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class SwgcItemSpecialRenderer implements SpecialModelRenderer<ItemStack> {
   private final ItemRenderer renderer;

   public SwgcItemSpecialRenderer(ItemRenderer renderer) {
      this.renderer = renderer;
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

      float partialTick = Minecraft.getInstance().isPaused() ? 0.0F : Minecraft.getInstance().getDeltaTracker().getGameTimeDeltaPartialTick(false);
      this.renderer.render(stack, ItemDisplayContext.NONE, poseStack, submitNodeCollector, partialTick, lightCoords, overlayCoords);
   }

   @Override
   public void getExtents(Consumer<Vector3fc> output) {
   }

   @Override
   public ItemStack extractArgument(ItemStack stack) {
      return stack;
   }

   public record Unbaked(Identifier renderer) implements SpecialModelRenderer.Unbaked<ItemStack> {
      public static final MapCodec<Unbaked> MAP_CODEC = RecordCodecBuilder.mapCodec(
         instance -> instance.group(Identifier.CODEC.fieldOf("renderer").forGetter(Unbaked::renderer)).apply(instance, Unbaked::new)
      );

      @Override
      public @Nullable SpecialModelRenderer<ItemStack> bake(SpecialModelRenderer.BakingContext context) {
         Function<EntityModelSet, ItemRenderer> factory = SwgcItemRendererRegistry.INSTANCE.getFactory(this.renderer);
         return factory == null ? null : new SwgcItemSpecialRenderer(factory.apply(context.entityModelSet()));
      }

      @Override
      public MapCodec<? extends SpecialModelRenderer.Unbaked<ItemStack>> type() {
         return MAP_CODEC;
      }
   }
}
