package che.swgc.item;



import che.swgc.SwgcItemData;

import che.swgc.entity.BlasterBolt;

import che.swgc.reg.SwgcItems;

import che.swgc.reg.SwgcSounds;

import che.swgc.reg.IRegister;

import javax.annotation.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.world.InteractionHand;

import net.minecraft.world.entity.LivingEntity;

import net.minecraft.world.entity.player.Player;

import net.minecraft.world.entity.player.Inventory;

import net.minecraft.world.item.Item;

import net.minecraft.world.item.ItemStack;

import net.minecraft.world.level.Level;

import net.minecraft.core.BlockPos;

import net.minecraft.world.phys.Vec3;

import net.minecraft.world.level.block.state.BlockState;

import net.minecraft.stats.Stats;

import net.minecraft.world.item.Item.Properties;



@javax.annotation.ParametersAreNonnullByDefault

public class BlasterItem extends net.minecraft.world.item.Item {

   public final int boltColor;

   public final float damage;

   public final float velocity;

   public final float inaccuracy;

   public final int maxAmmo;



   public BlasterItem(net.minecraft.world.item.Item.Properties props, int boltColor, float damage, float velocity, float inaccuracy, int maxAmmo) {

      super(props);

      this.boltColor = boltColor;

      this.damage = damage;

      this.velocity = velocity;

      this.inaccuracy = inaccuracy;

      this.maxAmmo = maxAmmo;

   }



   public BlasterItem(int boltColor, float damage, float velocity, float inaccuracy, int maxAmmo) {

      this(IRegister.itemProperties().stacksTo(1), boltColor, damage, velocity, inaccuracy, maxAmmo);

   }



   public net.minecraft.world.InteractionResult use(net.minecraft.world.level.Level lvl, net.minecraft.world.entity.player.Player user, net.minecraft.world.InteractionHand hand) {

      net.minecraft.world.item.ItemStack stack = user.getItemInHand(hand);

      if (!this.isAiming(stack)) {

         this.setAiming(stack, true);

         return net.minecraft.world.InteractionResult.CONSUME.heldItemTransformedTo(stack);

      } else {

         return net.minecraft.world.InteractionResult.FAIL;

      }

   }



   public int getUseDuration(net.minecraft.world.item.ItemStack stack, net.minecraft.world.entity.LivingEntity entity) {

      return 72000;

   }



   public boolean isCorrectToolForDrops(net.minecraft.world.level.block.state.BlockState state, net.minecraft.world.level.Level lvl, net.minecraft.core.BlockPos pos, net.minecraft.world.entity.player.Player player) {

      return false;

   }



   public int getAmmo(net.minecraft.world.item.ItemStack stack) {

      net.minecraft.nbt.CompoundTag tag = SwgcItemData.getOrCreate(stack);

      return tag.contains("Ammo") ? tag.getIntOr("Ammo", this.maxAmmo) : this.maxAmmo;

   }



   public void setAmmo(net.minecraft.world.item.ItemStack stack, int ammo) {

      SwgcItemData.update(stack, tag -> tag.putInt("Ammo", ammo));

   }



   public void shoot(net.minecraft.world.level.Level lvl, net.minecraft.world.entity.LivingEntity entity, net.minecraft.world.item.ItemStack stack, @Nullable net.minecraft.world.phys.Vec3 direction) {

      if (!lvl.isClientSide()) {

         if (entity instanceof net.minecraft.world.entity.player.Player player && !player.getAbilities().instabuild) {

            int ammo = this.getAmmo(stack);

            if (ammo <= 0) {

               return;

            }



            this.setAmmo(stack, ammo - 1);

         }



         BlasterBolt blasterBolt = new BlasterBolt(lvl);

         blasterBolt.setColor(this.boltColor);

         blasterBolt.setDamage(this.damage);

         blasterBolt.setOwner(entity);

         blasterBolt.setPos(entity.getEyePosition().add(entity.getLookAngle()));

         if (direction != null) {

            blasterBolt.shoot(direction.x, direction.y, direction.z, this.velocity, this.inaccuracy);

         } else {

            blasterBolt.shootFromRotation(entity, entity.getXRot(), entity.getYRot(), 0.0F, 3.0F, this.inaccuracy);

         }



         lvl.addFreshEntity(blasterBolt);

         lvl.playSound(entity, entity.getX(), entity.getY(), entity.getZ(), SwgcSounds.BLASTER_SHOOT.get(), entity.getSoundSource(), 1.0F, 0.8F + entity.getRandom().nextFloat() * 0.4F);

         if (entity instanceof net.minecraft.world.entity.player.Player player) {

            player.awardStat(net.minecraft.stats.Stats.ITEM_USED.get(this));

         }

      }

   }



   public boolean canShoot(net.minecraft.world.entity.player.Player player, net.minecraft.world.item.ItemStack stack) {

      return player.getAbilities().instabuild || this.getAmmo(stack) > 0;

   }



   public float getZoom() {

      return (1.0F + 9.0F * this.inaccuracy) * 0.05F;

   }



   public boolean isAiming(net.minecraft.world.item.ItemStack stack) {

      return SwgcItemData.getOrCreate(stack).getBooleanOr("Aiming", false);

   }



   public void setAiming(net.minecraft.world.item.ItemStack stack, boolean value) {

      SwgcItemData.update(stack, tag -> tag.putBoolean("Aiming", value));

   }



   @Nullable

   public static net.minecraft.world.item.ItemStack findAmmo(net.minecraft.world.entity.player.Inventory inventory) {

      for (net.minecraft.world.item.ItemStack stack : inventory.getNonEquipmentItems()) {

         if (stack.is(SwgcItems.TIBANNA_VESSEL.get())) {

            return stack;

         }

      }



      return null;

   }

}


