package che.swgc.item;

import che.swgc.SwgcItemAttributes;
import che.swgc.entity.EwokSpear;
import che.swgc.reg.IRegister;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

@javax.annotation.ParametersAreNonnullByDefault
public class EwokSpearItem extends Item {
   public EwokSpearItem(Properties props) {
      super(props);
   }

   public EwokSpearItem() {
      this(IRegister.itemProperties().durability(200).attributes(SwgcItemAttributes.weapon(6.0, -2.9)));
   }

   public boolean isCorrectToolForDrops(BlockState state, Level level, BlockPos pos, Player player) {
      return !player.isCreative();
   }

   public ItemUseAnimation getUseAnimation(ItemStack stack) {
      return ItemUseAnimation.SPEAR;
   }

   public int getUseDuration(ItemStack stack, LivingEntity entity) {
      return 72000;
   }

   public void onStoppedUsing(ItemStack stack, Level level, LivingEntity user, int ticksRemaining) {
      int charge = this.getUseDuration(stack, user) - ticksRemaining;
      if (charge >= 10 && !level.isClientSide()) {
         InteractionHand hand = user.getUsedItemHand();
         stack.hurtAndBreak(1, user, hand);
         EwokSpear spear = new EwokSpear(level, user, stack);
         spear.shootFromRotation(user, user.getXRot(), user.getYRot(), 0.0F, 2.5F, 1.0F);
         level.addFreshEntity(spear);
         if (user instanceof Player player) {
            if (player.getAbilities().instabuild) {
               spear.pickup = Pickup.CREATIVE_ONLY;
            } else {
               player.getInventory().removeItem(stack);
            }

            player.awardStat(Stats.ITEM_USED.get(this));
         }
      }
   }

   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      ItemStack stack = player.getItemInHand(hand);
      if (stack.getDamageValue() >= stack.getMaxDamage() - 1) {
         return InteractionResult.FAIL;
      } else if (
         EnchantmentHelper.getItemEnchantmentLevel(
            level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(net.minecraft.world.item.enchantment.Enchantments.RIPTIDE),
            stack
         ) > 0 && !player.isInWaterOrRain()
      ) {
         return InteractionResult.FAIL;
      } else {
         player.startUsingItem(hand);
         return InteractionResult.CONSUME.heldItemTransformedTo(stack);
      }
   }

   public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
      stack.hurtAndBreak(1, attacker, EquipmentSlot.MAINHAND);
      return true;
   }

   public boolean postMine(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity miner) {
      if (state.getDestroySpeed(level, pos) != 0.0F) {
         stack.hurtAndBreak(2, miner, EquipmentSlot.MAINHAND);
      }

      return true;
   }

   public int getEnchantability() {
      return 18;
   }
}
