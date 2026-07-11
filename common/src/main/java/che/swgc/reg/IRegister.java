package che.swgc.reg;

import com.google.common.base.Suppliers;
import java.util.function.Supplier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

@FunctionalInterface
public interface IRegister<T> {
   String MOD_ID = "swgc";

   <R extends T> Supplier<R> register(String var1, Supplier<R> var2);

   static <T> IRegister<T> ofRegistry(Registry<T> registry) {
      return new IRegister<T>() {
         @Override
         public <R extends T> Supplier<R> register(String name, Supplier<R> factory) {
            Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, name);
            return Suppliers.ofInstance(Registry.register(registry, id, factory.get()));
         }
      };
   }

   static IRegister<Block> ofBlockRegistry(Registry<Block> registry) {
      return new IRegister<Block>() {
         @Override
         public <R extends Block> Supplier<R> register(String name, Supplier<R> factory) {
            ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name));
            BlockBehaviour.Properties props = BlockBehaviour.Properties.of().setId(key);
            BLOCK_PROPS.set(props);
            try {
               R block = factory.get();
               return Suppliers.ofInstance((R)Registry.register(registry, key, block));
            } finally {
               BLOCK_PROPS.remove();
            }
         }
      };
   }

   static IRegister<Item> ofItemRegistry(Registry<Item> registry) {
      return new IRegister<Item>() {
         @Override
         public <R extends Item> Supplier<R> register(String name, Supplier<R> factory) {
            ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
            ITEM_PROPS.set(new Item.Properties().setId(key));
            try {
               R item = factory.get();
               return Suppliers.ofInstance((R)Registry.register(registry, key, item));
            } finally {
               ITEM_PROPS.remove();
            }
         }
      };
   }

   static BlockBehaviour.Properties blockProperties() {
      BlockBehaviour.Properties props = BLOCK_PROPS.get();
      return props != null ? props : BlockBehaviour.Properties.of();
   }

   static Item.Properties itemProperties() {
      Item.Properties props = ITEM_PROPS.get();
      return props != null ? props : new Item.Properties();
   }

   ThreadLocal<BlockBehaviour.Properties> BLOCK_PROPS = new ThreadLocal<>();
   ThreadLocal<Item.Properties> ITEM_PROPS = new ThreadLocal<>();
}
