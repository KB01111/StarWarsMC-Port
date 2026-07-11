package che.swgc.item;

import che.swgc.SwgcItemAttributes;
import che.swgc.reg.IRegister;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.projectile.hurtingprojectile.SmallFireball;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

@javax.annotation.ParametersAreNonnullByDefault
public class EwokStaffItem extends Item {
   public EwokStaffItem(Properties props) {
      super(props);
   }

   public EwokStaffItem() {
      this(IRegister.itemProperties().rarity(Rarity.UNCOMMON).durability(150).attributes(SwgcItemAttributes.weapon(6.0, -3.2)));
   }

   public InteractionResult use(Level level, Player user, InteractionHand hand) {
      ItemStack stack = user.getItemInHand(hand);
      if (!level.isClientSide()) {
         Vec3 lookAngle = user.getLookAngle();
         Vec3 fireballPos = user.getEyePosition().add(lookAngle);
         SmallFireball fireball = new SmallFireball(level, user, lookAngle);
         fireball.setOwner(user);
         fireball.setDeltaMovement(lookAngle.scale(0.5));
         level.addFreshEntity(fireball);
         level.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 1.0F, 0.8F + user.getRandom().nextFloat() * 0.4F);
         stack.hurtAndBreak(1, user, hand);
         user.getCooldowns().addCooldown(stack, 7);
      }

      return InteractionResult.SUCCESS.heldItemTransformedTo(stack);
   }

   public boolean canRepair(ItemStack tool, ItemStack material) {
      return material.is(Items.BLAZE_POWDER);
   }
}
