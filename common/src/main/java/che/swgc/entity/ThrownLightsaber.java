package che.swgc.entity;

import che.swgc.SwgcItemData;
import che.swgc.item.LightsaberItem;
import che.swgc.reg.SwgcEntities;
import che.swgc.reg.SwgcItems;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;

@javax.annotation.ParametersAreNonnullByDefault
public class ThrownLightsaber extends net.minecraft.world.entity.projectile.Projectile {
   private static final net.minecraft.network.syncher.EntityDataAccessor<net.minecraft.world.item.ItemStack> DATA_LIGHTSABER_ID = net.minecraft.network.syncher.SynchedEntityData.defineId(ThrownLightsaber.class, net.minecraft.network.syncher.EntityDataSerializers.ITEM_STACK);
   private boolean returning = false;
   private double whooshCounter = 4.0;

   public ThrownLightsaber(net.minecraft.world.entity.EntityType<? extends ThrownLightsaber> entityType, net.minecraft.world.level.Level level) {
      super(entityType, level);
      this.setNoGravity(true);
   }

   public ThrownLightsaber(net.minecraft.world.level.Level level, net.minecraft.world.entity.Entity owner) {
      this(SwgcEntities.THROWN_LIGHTSABER.get(), level);
      this.setPos(owner.getEyePosition());
      this.setOwner(owner);
   }

   @Override
   public boolean shouldRenderAtSqrDistance(double distance) {
      return true;
   }

   @Override
   public void tick() {
      super.tick();
      net.minecraft.world.phys.HitResult result = net.minecraft.world.entity.projectile.ProjectileUtil.getHitResultOnViewVector(this, this::canHitEntity, 64.0);
      if (result.getType() != net.minecraft.world.phys.HitResult.Type.MISS) {
         this.onHit(result);
      }

      net.minecraft.world.phys.Vec3 dm = this.getDeltaMovement().scale(this.isInWater() ? 0.8 : 0.92);
      if (!this.isNoGravity()) {
         dm = dm.add(0.0, -0.04, 0.0);
      }

      double speed = dm.length();
      if (this.returning) {
         net.minecraft.world.entity.Entity owner = this.getOwner();
         if (owner != null) {
            dm = dm.add(owner.getEyePosition().subtract(this.getEyePosition()).normalize().scale(0.2));
         }
      } else if (speed < 0.1) {
         this.returning = true;
      }

      if ((this.whooshCounter -= speed) <= 0.0) {
         this.playSound(LightsaberItem.swingSoundStatic(this.getLightsaber()), 0.5F, che.swgc.SwgcUtils.soundPitch(this.random));
         this.whooshCounter = 8.0;
      }

      this.setDeltaMovement(dm);
      this.setPos(this.position().add(dm));
      this.getLightsaber().inventoryTick(this.level(), this, net.minecraft.world.entity.EquipmentSlot.MAINHAND);
      this.setYRot(this.getYRot() + 72.0F);
   }

   protected void onEntityHit(net.minecraft.world.phys.EntityHitResult result) {
      result.getEntity().hurt(this.damageSources().thrown(this, this.getOwner()), 7.0F);
   }

   @Override
   protected boolean canHitEntity(net.minecraft.world.entity.Entity target) {
      return !this.ownedBy(target) && super.canHitEntity(target);
   }

   @Override
   public void playerTouch(net.minecraft.world.entity.player.Player player) {
      if (!this.level().isClientSide()
         && this.tickCount > 4
         && this.ownedBy(player)
         && (player.getAbilities().instabuild || player.getInventory().add(this.getLightsaber()))) {
         this.level()
            .playSound(
               null,
               this.getX(),
               this.getY(),
               this.getZ(),
               net.minecraft.sounds.SoundEvents.ITEM_PICKUP,
               net.minecraft.sounds.SoundSource.PLAYERS,
               0.2F,
               0.6F + this.random.nextFloat() * 2.8F
            );
         this.discard();
      }
   }

   @Override
   public net.minecraft.world.item.ItemStack getPickResult() {
      return this.getLightsaber();
   }

   public net.minecraft.world.item.ItemStack getLightsaber() {
      return this.entityData.get(DATA_LIGHTSABER_ID);
   }

   public void setLightsaber(net.minecraft.world.item.ItemStack lightsaber) {
      this.entityData.set(DATA_LIGHTSABER_ID, lightsaber);
   }

   @Override
   protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {
      builder.define(DATA_LIGHTSABER_ID, SwgcItems.LIGHTSABER.get().getDefaultInstance());
   }

   @Override
   protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput compound) {
      super.readAdditionalSaveData(compound);
      compound.read("Lightsaber", net.minecraft.world.item.ItemStack.CODEC).ifPresent(this::setLightsaber);
      this.returning = compound.getBooleanOr("Returning", false);
   }

   @Override
   protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput compound) {
      super.addAdditionalSaveData(compound);
      compound.store("Lightsaber", net.minecraft.world.item.ItemStack.CODEC, this.getLightsaber());
      compound.putBoolean("Returning", this.returning);
   }
}
