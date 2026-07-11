package che.swgc.client;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

public class SwgcClientRegister {
   public SwgcClientRegister() {
   }

   public static void registerEntityLayers(BiConsumer<ModelLayerLocation, Supplier<LayerDefinition>> register) {
   }

   public static void registerEntityRenderers(EntityRendererRegister entities, BlockEntityRendererRegister blockEntities) {
   }

   @FunctionalInterface
   public interface BlockEntityRendererRegister {
      void registerBlockEntityRenderer(net.minecraft.world.level.block.entity.BlockEntityType<?> type, Object factory);
   }

   @FunctionalInterface
   public interface EntityRendererRegister {
      <T extends Entity> void register(EntityType<T> type, EntityRendererProvider<T> factory);
   }
}
