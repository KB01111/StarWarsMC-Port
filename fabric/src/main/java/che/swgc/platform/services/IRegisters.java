package che.swgc.platform.services;

import che.swgc.reg.IRegister;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.resources.ResourceKey;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.item.CreativeModeTab.Builder;
import net.minecraft.world.level.gamerules.GameRule;
import net.minecraft.world.level.gamerules.GameRuleCategory;

@javax.annotation.ParametersAreNonnullByDefault
public interface IRegisters {
   IRegister<net.minecraft.world.level.block.Block> blocks();

   IRegister<net.minecraft.world.item.Item> items();

   IRegister<net.minecraft.world.entity.EntityType<?>> entities();

   IRegister<net.minecraft.world.level.block.entity.BlockEntityType<?>> blockEntities();

   IRegister<net.minecraft.world.level.levelgen.structure.StructureType<?>> structures();

   IRegister<net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType> structurePieces();

   net.minecraft.world.level.gamerules.GameRule<Boolean> regBooleanGameRule(String var1, net.minecraft.world.level.gamerules.GameRuleCategory var2, boolean var3);

   IRegister<net.minecraft.sounds.SoundEvent> sounds();

   BiFunction<String, UnaryOperator<net.minecraft.world.item.CreativeModeTab.Builder>, net.minecraft.resources.ResourceKey<net.minecraft.world.item.CreativeModeTab>> creativeModTabs();
}
