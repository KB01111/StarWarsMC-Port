package che.swgc.client.renderer.item;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;

public final class SwgcItemRendererRegistry {
   public static final SwgcItemRendererRegistry INSTANCE = new SwgcItemRendererRegistry();
   private final Map<Item, ItemRenderer> renderers = new HashMap<>();

   private SwgcItemRendererRegistry() {
   }

   public void register(ItemLike itemLike, Function<EntityModelSet, ? extends ItemRenderer> factory) {
      this.renderers.put(itemLike.asItem(), factory.apply(net.minecraft.client.Minecraft.getInstance().getEntityModels()));
   }

   public void register(ItemLike itemLike, ItemRenderer renderer) {
      this.renderers.put(itemLike.asItem(), renderer);
   }

   public @org.jspecify.annotations.Nullable ItemRenderer getRenderer(Item item) {
      return this.renderers.get(item);
   }
}
