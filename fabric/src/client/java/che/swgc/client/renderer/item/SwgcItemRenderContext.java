package che.swgc.client.renderer.item;

import net.minecraft.world.item.ItemDisplayContext;

public final class SwgcItemRenderContext {
   private static final ThreadLocal<ItemDisplayContext> CURRENT = new ThreadLocal<>();

   private SwgcItemRenderContext() {
   }

   public static void set(ItemDisplayContext context) {
      CURRENT.set(context);
   }

   public static ItemDisplayContext get() {
      ItemDisplayContext context = CURRENT.get();
      return context != null ? context : ItemDisplayContext.NONE;
   }

   public static void clear() {
      CURRENT.remove();
   }
}
