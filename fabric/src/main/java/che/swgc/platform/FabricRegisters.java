package che.swgc.platform;

import che.swgc.platform.services.IRegisters;
import che.swgc.reg.IRegister;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.resources.ResourceKey;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab.Builder;
import net.minecraft.world.level.gamerules.GameRule;
import net.minecraft.world.level.gamerules.GameRuleCategory;

@javax.annotation.ParametersAreNonnullByDefault
public class FabricRegisters implements IRegisters {
   public FabricRegisters() {
   }

   @Override
   public IRegister<net.minecraft.world.level.block.Block> blocks() {
      return IRegister.ofBlockRegistry(net.minecraft.core.registries.BuiltInRegistries.BLOCK);
   }

   @Override
   public IRegister<net.minecraft.world.item.Item> items() {
      return IRegister.ofItemRegistry(net.minecraft.core.registries.BuiltInRegistries.ITEM);
   }

   @Override
   public IRegister<net.minecraft.world.entity.EntityType<?>> entities() {
      return IRegister.ofRegistry(net.minecraft.core.registries.BuiltInRegistries.ENTITY_TYPE);
   }

   @Override
   public IRegister<net.minecraft.world.level.block.entity.BlockEntityType<?>> blockEntities() {
      return IRegister.ofRegistry(net.minecraft.core.registries.BuiltInRegistries.BLOCK_ENTITY_TYPE);
   }

   @Override
   public IRegister<net.minecraft.world.level.levelgen.structure.StructureType<?>> structures() {
      return IRegister.ofRegistry(net.minecraft.core.registries.BuiltInRegistries.STRUCTURE_TYPE);
   }

   @Override
   public IRegister<net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType> structurePieces() {
      return IRegister.ofRegistry(net.minecraft.core.registries.BuiltInRegistries.STRUCTURE_PIECE);
   }

   @Override
   public net.minecraft.world.level.gamerules.GameRule<Boolean> regBooleanGameRule(String name, net.minecraft.world.level.gamerules.GameRuleCategory category, boolean defaultValue) {
      return GameRuleBuilder.forBoolean(defaultValue).category(category).buildAndRegister(Identifier.fromNamespaceAndPath("swgc", name));
   }

   @Override
   public IRegister<net.minecraft.sounds.SoundEvent> sounds() {
      return IRegister.ofRegistry(net.minecraft.core.registries.BuiltInRegistries.SOUND_EVENT);
   }

   @Override
   public BiFunction<String, UnaryOperator<net.minecraft.world.item.CreativeModeTab.Builder>, net.minecraft.resources.ResourceKey<net.minecraft.world.item.CreativeModeTab>> creativeModTabs() {
      return (id, builder) -> {
         Identifier rl = Identifier.fromNamespaceAndPath("swgc", id);
         net.minecraft.core.Registry.register(
            net.minecraft.core.registries.BuiltInRegistries.CREATIVE_MODE_TAB,
            rl,
            builder.apply(FabricCreativeModeTab.builder()).title(net.minecraft.network.chat.Component.translatable("itemGroup.swgc." + id)).build()
         );
         return net.minecraft.resources.ResourceKey.create(net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB, rl);
      };
   }
}
