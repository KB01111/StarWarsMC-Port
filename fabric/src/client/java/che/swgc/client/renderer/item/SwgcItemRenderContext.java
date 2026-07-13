package che.swgc.client.renderer.item;

import net.minecraft.world.item.ItemDisplayContext;

public final class SwgcItemRenderContext {
   private static final ThreadLocal<ItemDisplayContext> CONTEXT = new ThreadLocal<>();

   private SwgcItemRenderContext() {
   }

   public static void set(ItemDisplayContext context) {
      CONTEXT.set(context);
   }

   public static ItemDisplayContext get() {
      ItemDisplayContext context = CONTEXT.get();
      return context != null ? context : ItemDisplayContext.GROUND;
   }

   public static void clear() {
      CONTEXT.remove();
   }
}
