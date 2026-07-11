package che.swgc.item;

import che.swgc.SwgcItemAttributes;
import che.swgc.SwgcItemData;
import che.swgc.reg.IRegister;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.stats.Stats;

@javax.annotation.ParametersAreNonnullByDefault
public class ForcePikeItem extends Item {
   public static final ItemAttributeModifiers ACTIVE_MODIFIERS = SwgcItemAttributes.weapon(10.0, -3.0);

   public ForcePikeItem(Properties properties) {
      super(properties);
   }

   public ForcePikeItem() {
      this(IRegister.itemProperties().durability(512));
   }

   public InteractionResult use(Level level, Player player, InteractionHand usedHand) {
      ItemStack stack = player.getItemInHand(usedHand);
      setActive(stack, !isActive(stack));
      player.awardStat(Stats.ITEM_USED.get(this));
      return InteractionResult.CONSUME.heldItemTransformedTo(stack);
   }

   public static boolean isActive(ItemStack stack) {
      return SwgcItemData.getOrCreate(stack).getBooleanOr("Active", false);
   }

   public static void setActive(ItemStack stack, boolean value) {
      SwgcItemData.update(stack, tag -> tag.putBoolean("Active", value));
      if (value) {
         stack.set(DataComponents.ATTRIBUTE_MODIFIERS, ACTIVE_MODIFIERS);
      } else {
         stack.remove(DataComponents.ATTRIBUTE_MODIFIERS);
      }
   }
}
