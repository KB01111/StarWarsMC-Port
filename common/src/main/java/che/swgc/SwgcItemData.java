package che.swgc;

import java.util.function.Consumer;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;

public final class SwgcItemData {
   private SwgcItemData() {
   }

   public static CompoundTag getOrCreate(ItemStack stack) {
      return stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
   }

   public static void update(ItemStack stack, Consumer<CompoundTag> consumer) {
      CustomData.update(DataComponents.CUSTOM_DATA, stack, consumer);
   }

   public static ItemStack loadStack(CompoundTag tag) {
      return ItemStack.CODEC.parse(NbtOps.INSTANCE, tag).result().orElse(ItemStack.EMPTY);
   }

   public static CompoundTag saveStack(ItemStack stack) {
      return (CompoundTag) ItemStack.CODEC.encodeStart(NbtOps.INSTANCE, stack).result().orElseGet(CompoundTag::new);
   }
}
