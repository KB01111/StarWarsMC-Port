package che.swgc.client.renderer.item;

import java.util.function.Function;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.world.level.ItemLike;

public final class SwgcItemRendererRegistry {
   public static final SwgcItemRendererRegistry INSTANCE = new SwgcItemRendererRegistry();

   private SwgcItemRendererRegistry() {
   }

   public void register(ItemLike itemLike, SwgcItemRendererRegistry.DynamicItemRenderer renderer) {
   }

   public void register(ItemLike itemLike, Function<EntityModelSet, ? extends ItemRenderer> factory) {
   }

   @FunctionalInterface
   public interface DynamicItemRenderer {
      void render(
         net.minecraft.world.item.ItemStack stack,
         net.minecraft.world.item.ItemDisplayContext mode,
         com.mojang.blaze3d.vertex.PoseStack matrices,
         che.swgc.client.compat.render.MultiBufferSource vertexConsumers,
         int light,
         int overlay
      );
   }
}
