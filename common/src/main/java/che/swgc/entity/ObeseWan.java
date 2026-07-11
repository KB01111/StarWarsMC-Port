package che.swgc.entity;

import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

@javax.annotation.ParametersAreNonnullByDefault
public class ObeseWan extends net.minecraft.world.entity.PathfinderMob {
   private static final net.minecraft.network.syncher.EntityDataAccessor<Float> DATA_OBESITY_ID = net.minecraft.network.syncher.SynchedEntityData.defineId(ObeseWan.class, net.minecraft.network.syncher.EntityDataSerializers.FLOAT);

   public ObeseWan(net.minecraft.world.entity.EntityType<? extends ObeseWan> entityType, net.minecraft.world.level.Level level) {
      super(entityType, level);
      this.setPersistenceRequired();
   }

   public void setObesity(float obesity) {
      this.entityData.set(DATA_OBESITY_ID, obesity);
      this.refreshDimensions();
   }

   public boolean isCollidable() {
      return true;
   }

   public boolean handleFallDamage(float fallDistance, float multiplier, net.minecraft.world.damagesource.DamageSource source) {
      if (fallDistance < 2.0F) {
         return false;
      } else {
         this.level()
            .playSound(
               null,
               this.getX(),
               this.getY(),
               this.getZ(),
               net.minecraft.sounds.SoundEvents.GENERIC_EXPLODE,
               net.minecraft.sounds.SoundSource.HOSTILE,
               2.0F,
               che.swgc.SwgcUtils.soundPitch(this.random)
            );
         this.level().broadcastEntityEvent(this, (byte)61);
         this.level()
            .getEntities(this, this.getBoundingBox().inflate((double)fallDistance * 0.25, 1.0, (double)fallDistance * 0.25))
            .forEach(
               entity -> {
                  entity.hurt(entity.damageSources().mobAttack(this), fallDistance * this.getObesity());
                  entity.push(
                     entity.position().subtract(this.position()).normalize().scale((double)fallDistance * 0.25).add(0.0, 0.25, 0.0)
                  );
               }
            );
         return false;
      }
   }

   public net.minecraft.world.item.ItemStack eatFood(net.minecraft.world.level.Level level, net.minecraft.world.item.ItemStack food) {
      net.minecraft.world.food.FoodProperties props = food.get(net.minecraft.core.component.DataComponents.FOOD);
      if (props != null) {
         this.setObesity(this.getObesity() + (float)props.nutrition() * 0.002F);
      }

      if (level instanceof net.minecraft.server.level.ServerLevel lvl) {
         lvl.sendParticles(new net.minecraft.core.particles.ItemParticleOption(net.minecraft.core.particles.ParticleTypes.ITEM, food.getItem()), this.getX(), this.getEyeY(), this.getZ(), 2, 0.0, 0.0, 0.0, 0.1F);
      }

      food.shrink(1);
      return food;
   }

   protected void registerGoals() {
      this.goalSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.FloatGoal(this));
      this.goalSelector.addGoal(2, new ObeseWan.AnnihilatorJumpGoal());
      this.goalSelector.addGoal(3, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this, new Class[0]));
      this.goalSelector.addGoal(4, new ObeseWan.EmbezzleFoodGoal());
      this.goalSelector.addGoal(5, new ObeseWan.LootChestsGoal());
      this.goalSelector.addGoal(6, new net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal(this, 0.6));
      this.goalSelector.addGoal(7, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(this, net.minecraft.world.entity.player.Player.class, 16.0F));
      this.goalSelector.addGoal(8, new net.minecraft.world.entity.ai.goal.RandomLookAroundGoal(this));
   }

   public void handleEntityEvent(byte id) {
      if (id != 61) {
         super.handleEntityEvent(id);
      } else {
         net.minecraft.core.BlockPos.MutableBlockPos pos = this.getOnPos().mutable();

         while (!this.level().isOutsideBuildHeight(pos)) {
            net.minecraft.world.level.block.state.BlockState state = this.level().getBlockState(pos);
            if (!state.isAir()) {
               net.minecraft.core.particles.ParticleOptions particle = new net.minecraft.core.particles.BlockParticleOption(net.minecraft.core.particles.ParticleTypes.BLOCK, state);

               for (double layer = 0.5; layer < 4.01; layer += 0.5) {
                  for (double yRot = 0.0; yRot < 6.28; yRot += Math.PI / 8) {
                     this.level()
                        .addParticle(
                           particle,
                           this.getX() + Math.sin(yRot) * layer,
                           (double)pos.getY() + 1.01,
                           this.getZ() + Math.cos(yRot) * layer,
                           0.0,
                           layer * 0.5,
                           0.0
                        );
                  }
               }
               break;
            }

            pos.move(net.minecraft.core.Direction.DOWN);
         }
      }
   }

   protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(DATA_OBESITY_ID, 1.0F);
   }

   public float getObesity() {
      return (Float)this.entityData.get(DATA_OBESITY_ID);
   }

   protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput compound) {
      super.readAdditionalSaveData(compound);
      this.setObesity(compound.getFloatOr("Obesity", 1.0F));
   }

   protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput compound) {
      super.addAdditionalSaveData(compound);
      compound.putFloat("Obesity", this.getObesity());
   }

   public void onSyncedDataUpdated(net.minecraft.network.syncher.EntityDataAccessor<?> key) {
      super.onSyncedDataUpdated(key);
      if (key == DATA_OBESITY_ID) {
         this.refreshDimensions();
      }
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      return createMobAttributes().add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 52.0).add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.35).add(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE, 1.0);
   }

   private class AnnihilatorJumpGoal extends net.minecraft.world.entity.ai.goal.Goal {
      private AnnihilatorJumpGoal() {
      }

      public boolean canUse() {
         return ObeseWan.this.getTarget() != null;
      }

      public void start() {
         ObeseWan.this.navigation.stop();
         ObeseWan.this.setDeltaMovement(
            Objects.requireNonNull(ObeseWan.this.getTarget())
               .position()
               .subtract(ObeseWan.this.position())
               .scale(0.1)
               .add(0.0, 1.6, 0.0)
         );
      }

      public boolean canContinueToUse() {
         return !ObeseWan.this.onGround();
      }
   }

   private class EmbezzleFoodGoal extends net.minecraft.world.entity.ai.goal.Goal {
      private int recalcTime;
      net.minecraft.world.entity.player.Player fatass;

      private EmbezzleFoodGoal() {
      }

      public boolean canUse() {
         Player nearest = null;
         double nearestDistance = 64.0 * 64.0;

         for (Player candidate : ObeseWan.this.level().players()) {
            double distance = ObeseWan.this.distanceToSqr(candidate);
            if (distance < nearestDistance) {
               nearestDistance = distance;
               nearest = candidate;
            }
         }

         this.fatass = nearest;
         return this.fatass != null && this.canContinueToUse();
      }

      public void start() {
         super.start();
         this.recalcTime = 0;
      }

      public void tick() {
         ObeseWan.this.getLookControl().setLookAt(this.fatass);
         if ((double)ObeseWan.this.distanceTo(this.fatass) <= 3.0 + ObeseWan.this.getBoundingBox().getSize()) {
            for (net.minecraft.world.item.ItemStack stack : this.fatass.getInventory().getNonEquipmentItems()) {
               if (stack.has(net.minecraft.core.component.DataComponents.FOOD)) {
                  this.fatass.sendSystemMessage(net.minecraft.network.chat.Component.translatable("obeseWan.hungy"));
                  ObeseWan.this.eatFood(ObeseWan.this.level(), stack);
                  break;
               }
            }
         } else if (--this.recalcTime <= 0) {
            this.recalcTime = this.adjustedTickDelay(10);
            ObeseWan.this.navigation.moveTo(this.fatass, 1.0);
         }
      }

      public boolean canContinueToUse() {
         return ObeseWan.this.distanceTo(this.fatass) <= 64.0F && this.fatass.getInventory().getNonEquipmentItems().stream().anyMatch(stack -> stack.has(net.minecraft.core.component.DataComponents.FOOD));
      }
   }

   private class LootChestsGoal extends net.minecraft.world.entity.ai.goal.Goal {
      net.minecraft.world.level.block.entity.BaseContainerBlockEntity blockEntity;

      private LootChestsGoal() {
      }

      public boolean canUse() {
         for (int x = -16; x <= 16; x++) {
            for (int y = -2; y <= 2; y++) {
               for (int z = -16; z <= 16; z++) {
                  net.minecraft.core.BlockPos pos = ObeseWan.this.blockPosition().offset(x, y, z);
                  net.minecraft.world.level.block.entity.BlockEntity var6 = ObeseWan.this.level().getBlockEntity(pos);
                  if (var6 instanceof net.minecraft.world.level.block.entity.BaseContainerBlockEntity) {
                     net.minecraft.world.level.block.entity.BaseContainerBlockEntity blockEntity1 = (net.minecraft.world.level.block.entity.BaseContainerBlockEntity)var6;

                     for (int i = 0; i < blockEntity1.getContainerSize(); i++) {
                        if (blockEntity1.getItem(i).has(net.minecraft.core.component.DataComponents.FOOD)) {
                           this.blockEntity = blockEntity1;
                           return ObeseWan.this.navigation.moveTo((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), 1.0);
                        }
                     }
                  }
               }
            }
         }

         return false;
      }

      public void tick() {
         net.minecraft.core.BlockPos pos = this.blockEntity.blockPosition();
         if (Math.sqrt(ObeseWan.this.distanceToSqr(net.minecraft.world.phys.Vec3.atCenterOf(pos))) <= 4.0 + ObeseWan.this.getBoundingBox().getSize()) {
            if (ObeseWan.this.getNavigation().isInProgress()) {
               ObeseWan.this.getNavigation().stop();
            }

            ObeseWan.this.getLookControl().setLookAt(net.minecraft.world.phys.Vec3.atCenterOf(pos));

            for (int i = 0; i < this.blockEntity.getContainerSize(); i++) {
               net.minecraft.world.item.ItemStack stack = this.blockEntity.getItem(i);
               if (stack.has(net.minecraft.core.component.DataComponents.FOOD)) {
                  ObeseWan.this.eatFood(ObeseWan.this.level(), stack);
                  break;
               }
            }
         } else if (ObeseWan.this.navigation.isDone()) {
            ObeseWan.this.navigation.moveTo((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), 1.0);
         }
      }

      public boolean canContinueToUse() {
         if (!this.blockEntity.isRemoved() && ObeseWan.this.navigation.isInProgress()) {
            for (int i = 0; i < this.blockEntity.getContainerSize(); i++) {
               if (this.blockEntity.getItem(i).has(net.minecraft.core.component.DataComponents.FOOD)) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      }
   }
}
