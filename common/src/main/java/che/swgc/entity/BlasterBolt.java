package che.swgc.entity;

import che.swgc.reg.SwgcEntities;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

@javax.annotation.ParametersAreNonnullByDefault
public class BlasterBolt extends net.minecraft.world.entity.projectile.Projectile {
   private static final net.minecraft.network.syncher.EntityDataAccessor<Integer> DATA_COLOR_ID = net.minecraft.network.syncher.SynchedEntityData.defineId(BlasterBolt.class, net.minecraft.network.syncher.EntityDataSerializers.INT);
   private float damage = 8.0F;

   public BlasterBolt(net.minecraft.world.entity.EntityType<? extends BlasterBolt> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
   }

   public BlasterBolt(net.minecraft.world.level.Level lvl) {
      this(SwgcEntities.BLASTER_BOLT.get(), lvl);
   }

   public BlasterBolt(net.minecraft.world.level.Level lvl, net.minecraft.world.entity.LivingEntity owner) {
      this(lvl);
      this.setOwner(owner);
      this.setPos(owner.getEyePosition().add(this.getLookAngle()));
   }

   public void tick() {
      super.tick();
      if (this.tickCount >= 1200) {
         this.discard();
      } else {
         if (this.isInWater()) {
            this.discard();
         }

         net.minecraft.world.phys.HitResult result = net.minecraft.world.entity.projectile.ProjectileUtil.getHitResultOnMoveVector(this, this::canHitEntity);
         if (result.getType() != net.minecraft.world.phys.HitResult.Type.MISS) {
            this.onHit(result);
         }
      }
   }

   protected boolean canHitEntity(net.minecraft.world.entity.Entity entity) {
      if (!super.canHitEntity(entity)) {
         return false;
      } else {
         net.minecraft.world.entity.Entity owner = this.getOwner();
         return owner == null
            || !entity.isAlliedTo(owner)
               && (owner instanceof net.minecraft.world.entity.player.Player player ? !(entity instanceof net.minecraft.world.entity.player.Player player1) || player.canHarmPlayer(player1) : !entity.isAlliedTo(owner));
      }
   }

   protected void onHitEntity(net.minecraft.world.phys.EntityHitResult hitResult) {
      if (this.level() instanceof net.minecraft.server.level.ServerLevel serverLevel) {
         hitResult.getEntity()
            .hurtServer(
               serverLevel,
               this.damageSources().mobProjectile(this, this.getOwner() instanceof net.minecraft.world.entity.LivingEntity livingEntity ? livingEntity : null),
               this.damage
            );
         this.discard();
      } else {
         this.setDeltaMovement(this.getDeltaMovement().scale(-1.0));
         this.setOwner(this);
      }
   }

   protected void onHitBlock(net.minecraft.world.phys.BlockHitResult hitResult) {
      super.onHitBlock(hitResult);
      this.discard();
   }

   public boolean shouldRender(double distance) {
      return distance <= 4096.0;
   }

   public int getColor() {
      return this.entityData.get(DATA_COLOR_ID);
   }

   public void setColor(int color) {
      this.entityData.set(DATA_COLOR_ID, color);
   }

   public void setDamage(float damage) {
      this.damage = damage;
   }

   protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {
      builder.define(DATA_COLOR_ID, -16776961);
   }

   protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput input) {
      super.readAdditionalSaveData(input);
      this.setColor(input.getIntOr("Color", -16776961));
      this.damage = input.getFloatOr("Damage", 8.0F);
   }

   protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput output) {
      super.addAdditionalSaveData(output);
      output.putInt("Color", this.getColor());
      output.putFloat("Damage", this.damage);
   }
}
