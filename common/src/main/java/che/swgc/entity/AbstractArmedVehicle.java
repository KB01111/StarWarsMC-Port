package che.swgc.entity;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.ParametersAreNonnullByDefault;

@javax.annotation.ParametersAreNonnullByDefault
public abstract class AbstractArmedVehicle extends net.minecraft.world.entity.Mob implements RiderControlledLongAttack {
   private static final net.minecraft.network.syncher.EntityDataAccessor<Boolean> DATA_LONG_ATTACKING_ID = net.minecraft.network.syncher.SynchedEntityData.defineId(AbstractArmedVehicle.class, net.minecraft.network.syncher.EntityDataSerializers.BOOLEAN);

   public AbstractArmedVehicle(net.minecraft.world.entity.EntityType<? extends AbstractArmedVehicle> entityType, net.minecraft.world.level.Level level) {
      super(entityType, level);
   }

   public net.minecraft.world.InteractionResult mobInteract(net.minecraft.world.entity.player.Player player, net.minecraft.world.InteractionHand hand) {
      if (this.canAddPassenger(player) && !player.isSpectator()) {
         if (!this.level().isClientSide()) {
            player.startRiding(this);
         }

         return this.level().isClientSide() ? InteractionResult.SUCCESS : InteractionResult.SUCCESS_SERVER;
      } else {
         return net.minecraft.world.InteractionResult.PASS;
      }
   }

   protected net.minecraft.world.entity.ai.control.BodyRotationControl createBodyRotationControl() {
      return new AbstractArmedVehicle.BodyRotationControl();
   }

   public boolean hurtServer(net.minecraft.server.level.ServerLevel serverLevel, net.minecraft.world.damagesource.DamageSource source, float amount) {
      return !this.hasPassenger(source.getEntity()) && !che.swgc.SwgcUtils.mechsImmuneTo(source) && super.hurtServer(serverLevel, source, amount);
   }

   public boolean isOnFire() {
      return false;
   }

   protected int decreaseAirSupply(int currentAir) {
      return currentAir;
   }

   public net.minecraft.sounds.SoundSource getSoundSource() {
      net.minecraft.world.entity.Entity passenger = this.getControllingPassenger();
      return passenger != null ? passenger.getSoundSource() : super.getSoundSource();
   }

   @Nullable
   public net.minecraft.world.scores.PlayerTeam getTeam() {
      net.minecraft.world.entity.Entity driver = this.getControllingPassenger();
      return driver != null ? driver.getTeam() : super.getTeam();
   }

   @Nullable
   public net.minecraft.world.entity.LivingEntity getControllingPassenger() {
      return this.getFirstPassenger() instanceof net.minecraft.world.entity.LivingEntity ret ? ret : null;
   }

   protected void tickRidden(net.minecraft.world.entity.player.Player player, net.minecraft.world.phys.Vec3 travelVector) {
      super.tickRidden(player, travelVector);
      if (this.canSprint() && this.isSprinting() != player.isSprinting()) {
         this.setSprinting(!this.isSprinting());
      }

      this.longAttackTick(this, player);
   }

   protected net.minecraft.world.phys.Vec3 getRiddenInput(net.minecraft.world.entity.player.Player player, net.minecraft.world.phys.Vec3 travelVector) {
      return new net.minecraft.world.phys.Vec3((double)player.xxa, 0.0, (double)player.zza);
   }

   protected float getRiddenSpeed(net.minecraft.world.entity.player.Player player) {
      return (float)this.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED);
   }

   protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(DATA_LONG_ATTACKING_ID, false);
   }

   @Override
   public boolean isLongAttacking() {
      return (Boolean)this.entityData.get(DATA_LONG_ATTACKING_ID);
   }

   @Override
   public void setLongAttacking(boolean longAttacking) {
      this.entityData.set(DATA_LONG_ATTACKING_ID, longAttacking);
   }

   @Override
   public int getLongAttackCooldown() {
      return this.attackStrengthTicker;
   }

   @Override
   public void setLongAttackCooldown(int longAttackCooldown) {
      this.attackStrengthTicker = longAttackCooldown;
   }

   protected class BodyRotationControl extends net.minecraft.world.entity.ai.control.BodyRotationControl {
      public BodyRotationControl() {
         super(AbstractArmedVehicle.this);
      }

      public void clientTick() {
         if (AbstractArmedVehicle.this.position()
               .subtract(AbstractArmedVehicle.this.xOld, 0.0, AbstractArmedVehicle.this.zOld)
               .horizontalDistanceSqr()
            > 2.5000003E-7) {
            super.clientTick();
         }
      }
   }
}
