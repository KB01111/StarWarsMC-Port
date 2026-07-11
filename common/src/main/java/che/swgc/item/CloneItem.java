package che.swgc.item;

import che.swgc.SwgcItemData;
import che.swgc.entity.Clone;
import che.swgc.reg.IRegister;
import che.swgc.reg.SwgcEntities;
import java.util.EnumMap;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorType;

@javax.annotation.ParametersAreNonnullByDefault
public class CloneItem extends EntitySpawnItem {
   public CloneItem(Properties properties) {
      super(SwgcEntities.CLONE, properties);
   }

   public CloneItem() {
      this(IRegister.itemProperties());
   }

   @Override
   public Component getName(ItemStack stack) {
      CompoundTag tag = SwgcItemData.getOrCreate(stack);
      if (!tag.isEmpty()) {
         EnumMap<ArmorType, ItemStack> items = Clone.readArmor(tag);
         String armor = Clone.getArmor(items::get);
         if (armor != null) {
            return Component.translatable(armor, super.getName(stack));
         }
      }

      return super.getName(stack);
   }
}
