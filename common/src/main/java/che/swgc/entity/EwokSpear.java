package che.swgc.entity;

import che.swgc.SwgcItemData;
import che.swgc.reg.SwgcEntities;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup;

@javax.annotation.ParametersAreNonnullByDefault
public class EwokSpear extends net.minecraft.world.entity.projectile.arrow.AbstractArrow {
   private static final net.minecraft.network.syncher.EntityDataAccessor<Byte> ID_LOYALTY = net.minecraft.network.syncher.SynchedEntityData.defineId(EwokSpear.class, net.minecraft.network.syncher.EntityDataSerializers.BYTE);
   private static final net.minecraft.network.syncher.EntityDataAccessor<Boolean> ID_FOIL = net.minecraft.network.syncher.SynchedEntityData.defineId(EwokSpear.class, net.minecraft.network.syncher.EntityDataSerializers.BOOLEAN);
   private net.minecraft.world.item.ItemStack spear;
   private double spearDamage = 3.0;
   private boolean dealtDamage;
   public int clientSideReturnTickCount;

   public EwokSpear(net.minecraft.world.entity.EntityType<? extends EwokSpear> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
      this.spear = new net.minecraft.world.item.ItemStack(net.minecraft.world.item.Items.TRIDENT);
      this.spearDamage = 3.0;
      this.setBaseDamage(this.spearDamage);
   }

   public EwokSpear(net.minecraft.world.level.Level lvl, net.minecraft.world.entity.LivingEntity owner, net.minecraft.world.item.ItemStack spear) {
      super(SwgcEntities.EWOK_SPEAR.get(), owner, lvl, spear, spear.copy());
      this.spear = spear.copy();
      int loyalty = 0;
      if (lvl instanceof net.minecraft.server.level.ServerLevel serverLevel) {
         loyalty = net.minecraft.world.item.enchantment.EnchantmentHelper.getTridentReturnToOwnerAcceleration(serverLevel, spear, owner);
      }

      this.entityData.set(ID_LOYALTY, (byte)loyalty);
      this.entityData.set(ID_FOIL, spear.hasFoil());
      this.spearDamage = 4.0;
      this.setBaseDamage(this.spearDamage);
   }

   @Override
   protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(ID_LOYALTY, (byte)0);
      builder.define(ID_FOIL, false);
   }

   @Override
   public void tick() {
      if (this.inGroundTime > 4) {
         this.dealtDamage = true;
      }

      net.minecraft.world.entity.Entity owner = this.getOwner();
      int loyalty = this.entityData.get(ID_LOYALTY) & 255;
      if (loyalty > 0 && (this.dealtDamage || this.isNoPhysics()) && owner != null) {
         if (!this.isAcceptableReturnOwner()) {
            if (!this.level().isClientSide() && this.pickup == net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup.ALLOWED && this.level() instanceof net.minecraft.server.level.ServerLevel serverLevel) {
               this.spawnAtLocation(serverLevel, this.asItemStack(), 0.1F);
            }

            this.discard();
         } else {
            this.setNoPhysics(true);
            net.minecraft.world.phys.Vec3 toOwner = owner.getEyePosition().subtract(this.position());
            this.setPos(this.getX(), this.getY() + toOwner.y * 0.015 * (double)loyalty, this.getZ());
            this.setDeltaMovement(this.getDeltaMovement().scale(0.95).add(toOwner.normalize().scale(0.05 * (double)loyalty)));
            if (this.clientSideReturnTickCount == 0) {
               this.playSound(net.minecraft.sounds.SoundEvents.TRIDENT_RETURN, 10.0F, 1.0F);
            }

            this.clientSideReturnTickCount++;
         }
      }

      super.tick();
   }

   private boolean isAcceptableReturnOwner() {
      net.minecraft.world.entity.Entity owner = this.getOwner();
      return owner != null && owner.isAlive() && (!(owner instanceof net.minecraft.server.level.ServerPlayer) || !owner.isSpectator());
   }

   protected net.minecraft.world.item.ItemStack asItemStack() {
      return this.spear.copy();
   }

   @Override
   protected net.minecraft.world.item.ItemStack getDefaultPickupItem() {
      return this.asItemStack();
   }

   public boolean isFoil() {
      return this.entityData.get(ID_FOIL);
   }

   @Override
   protected boolean canHitEntity(net.minecraft.world.entity.Entity entity) {
      if (this.dealtDamage) {
         return false;
      }

      net.minecraft.world.entity.Entity owner = this.getOwner();
      return (
            owner == null
               || (owner instanceof net.minecraft.world.entity.player.Player player ? !(entity instanceof net.minecraft.world.entity.player.Player player1) || player.canHarmPlayer(player1) : !owner.isAlliedTo(entity))
         )
         && super.canHitEntity(entity);
   }

   @Override
   protected void onHitEntity(net.minecraft.world.phys.EntityHitResult hitResult) {
      net.minecraft.world.entity.Entity entity = hitResult.getEntity();
      float dmg = (float)(this.getDeltaMovement().length() * this.spearDamage);
      if (entity instanceof net.minecraft.world.entity.LivingEntity && this.level() instanceof net.minecraft.server.level.ServerLevel serverLevel) {
         dmg = net.minecraft.world.item.enchantment.EnchantmentHelper.modifyDamage(serverLevel, this.spear, entity, this.damageSources().trident(this, this.getOwner()), dmg);
      }

      net.minecraft.world.entity.Entity owner = this.getOwner();
      net.minecraft.world.damagesource.DamageSource src = this.damageSources().trident(this, owner == null ? this : owner);
      this.dealtDamage = true;
      entity.hurt(src, dmg);
      if (entity.getType() == net.minecraft.world.entity.EntityTypes.ENDERMAN) {
         return;
      }

      if (entity instanceof net.minecraft.world.entity.LivingEntity living && owner instanceof net.minecraft.world.entity.LivingEntity && this.level() instanceof net.minecraft.server.level.ServerLevel serverLevel) {
         net.minecraft.world.item.enchantment.EnchantmentHelper.doPostAttackEffectsWithItemSource(serverLevel, living, src, this.spear);
      }

      this.setDeltaMovement(this.getDeltaMovement().multiply(-0.01, -0.1, -0.01));
      net.minecraft.sounds.SoundEvent sound = net.minecraft.sounds.SoundEvents.TRIDENT_HIT;
      float volume = 1.0F;
      if (this.level() instanceof net.minecraft.server.level.ServerLevel serverLevel && this.level().isThundering() && this.isChanneling()) {
         net.minecraft.core.BlockPos pos = entity.blockPosition();
         if (this.level().getEffectiveSkyBrightness(pos) >= 15) {
            net.minecraft.world.entity.LightningBolt bolt = new net.minecraft.world.entity.LightningBolt(net.minecraft.world.entity.EntityTypes.LIGHTNING_BOLT, serverLevel);
            if (bolt != null) {
               bolt.setPos(net.minecraft.world.phys.Vec3.atBottomCenterOf(pos));
               bolt.setCause(owner instanceof net.minecraft.server.level.ServerPlayer player ? player : null);
               serverLevel.addFreshEntity(bolt);
               sound = net.minecraft.sounds.SoundEvents.TRIDENT_THUNDER.value();
               volume = 5.0F;
            }
         }
      }

      this.playSound(sound, volume, 1.0F);
   }

   public boolean isChanneling() {
      if (!(this.level() instanceof net.minecraft.server.level.ServerLevel serverLevel)) {
         return false;
      }

      var registry = serverLevel.registryAccess().lookupOrThrow(net.minecraft.core.registries.Registries.ENCHANTMENT);
      return net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(registry.getOrThrow(net.minecraft.world.item.enchantment.Enchantments.CHANNELING), this.spear) > 0;
   }

   @Override
   protected boolean tryPickup(net.minecraft.world.entity.player.Player player) {
      return super.tryPickup(player) || this.isNoPhysics() && this.ownedBy(player) && player.getInventory().add(this.asItemStack());
   }

   @Override
   public void playerTouch(net.minecraft.world.entity.player.Player player) {
      if (this.ownedBy(player) || this.getOwner() == null) {
         super.playerTouch(player);
      }
   }

   @Override
   protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput tag) {
      super.readAdditionalSaveData(tag);
      tag.read("Spear", net.minecraft.world.item.ItemStack.CODEC).ifPresent(stack -> this.spear = stack);
      this.dealtDamage = tag.getBooleanOr("DealtDamage", false);
      if (this.level() instanceof net.minecraft.server.level.ServerLevel serverLevel) {
         this.entityData.set(ID_LOYALTY, (byte)net.minecraft.world.item.enchantment.EnchantmentHelper.getTridentReturnToOwnerAcceleration(serverLevel, this.spear, this.getOwner()));
      }
   }

   @Override
   protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.store("Spear", net.minecraft.world.item.ItemStack.CODEC, this.spear);
      tag.putBoolean("DealtDamage", this.dealtDamage);
   }

   @Override
   protected void tickDespawn() {
      int loyalty = this.entityData.get(ID_LOYALTY) & 255;
      if (this.pickup != net.minecraft.world.entity.projectile.arrow.AbstractArrow.Pickup.ALLOWED || loyalty <= 0) {
         super.tickDespawn();
      }
   }

   @Override
   public boolean shouldRenderAtSqrDistance(double distance) {
      return true;
   }
}
