package che.swgc.entity;

import che.swgc.reg.SwgcSounds;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.ServerLevelAccessor;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

@javax.annotation.ParametersAreNonnullByDefault
public abstract class AbstractEwok extends net.minecraft.world.entity.PathfinderMob {
   protected net.minecraft.world.entity.ai.goal.Goal meleeAttackGoal = new AbstractEwok.EwokMeleeAttackGoal(1.0);
   @Nullable
   protected net.minecraft.world.entity.ai.goal.Goal rangedAttackGoal = null;
   public final net.minecraft.world.entity.AnimationState attackAnimState = new net.minecraft.world.entity.AnimationState();
   public final net.minecraft.world.entity.AnimationState jumpAnimState = new net.minecraft.world.entity.AnimationState();
   private float sprint;
   private float sprintO;
   public boolean firstAttack;

   public AbstractEwok(net.minecraft.world.entity.EntityType<? extends AbstractEwok> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
      this.setPersistenceRequired();
      // experience via getBaseExperienceReward: 5;
   }

   public void aiStep() {
      super.aiStep();
      this.sprintO = this.sprint;
      this.sprint = this.isSprinting() ? Math.min(this.sprint + 0.1F, 1.0F) : Math.max(this.sprint - 0.1F, 0.0F);
   }

   protected void registerGoals() {
      this.goalSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.FloatGoal(this));
      this.goalSelector.addGoal(4, new AbstractEwok.EwokHurtByTargetGoal(this));
      this.goalSelector.addGoal(5, new net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal(this, net.minecraft.world.entity.monster.Monster.class, false, (mob, serverLevel) -> !(mob instanceof net.minecraft.world.entity.monster.Creeper)));
      this.goalSelector.addGoal(6, new net.minecraft.world.entity.ai.goal.RandomStrollGoal(this, 0.9));
      this.goalSelector.addGoal(7, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(this, net.minecraft.world.entity.player.Player.class, 16.0F));
      this.goalSelector.addGoal(8, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(this, AbstractEwok.class, 8.0F));
   }

   protected void reassessWeaponGoal() {
      if (this.getMainHandItem().is(this.getDefaultWeapon().getItem())) {
         this.goalSelector.addGoal(2, this.meleeAttackGoal);
         if (this.rangedAttackGoal != null) {
            this.goalSelector.addGoal(3, this.rangedAttackGoal);
         }
      } else {
         this.goalSelector.removeGoal(this.meleeAttackGoal);
         if (this.rangedAttackGoal != null) {
            this.goalSelector.removeGoal(this.rangedAttackGoal);
         }
      }
   }

   @Override
   public boolean hurtServer(net.minecraft.server.level.ServerLevel serverLevel, net.minecraft.world.damagesource.DamageSource src, float amount) {
      return (src.getEntity() == null || !this.isAlliedTo(src.getEntity())) && super.hurtServer(serverLevel, src, amount);
   }

   protected net.minecraft.sounds.SoundEvent getAmbientSound() {
      return (this.isAggressive() ? SwgcSounds.EWOK_HUNT : SwgcSounds.EWOK_AMBIENT).get();
   }

   protected net.minecraft.sounds.SoundEvent getHurtSound(net.minecraft.world.damagesource.DamageSource damageSource) {
      return SwgcSounds.EWOK_HURT.get();
   }

   public boolean canSprint() {
      return true;
   }

   public void setItemSlot(net.minecraft.world.entity.EquipmentSlot slot, net.minecraft.world.item.ItemStack stack) {
      super.setItemSlot(slot, stack);
      if (!this.level().isClientSide() && slot == net.minecraft.world.entity.EquipmentSlot.MAINHAND) {
         this.reassessWeaponGoal();
      }
   }

   @Nullable
   public net.minecraft.world.entity.SpawnGroupData finalizeSpawn(net.minecraft.world.level.ServerLevelAccessor lvl, net.minecraft.world.DifficultyInstance difficulty, net.minecraft.world.entity.EntitySpawnReason spawnType, @Nullable net.minecraft.world.entity.SpawnGroupData data, @Nullable net.minecraft.world.entity.SpawnGroupData spawnData) {
      super.finalizeSpawn(lvl, difficulty, spawnType, data);
      net.minecraft.world.item.ItemStack weapon = this.getDefaultWeapon();
      if (!weapon.isEmpty()) {
         this.setItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND, weapon);
         this.enchantSpawnedWeapon(lvl, this.random, difficulty);
      }

      return data;
   }

      public void swing(net.minecraft.world.InteractionHand hand, boolean sendToClient) {
      super.swing(hand, sendToClient);
      this.attackAnimState.start(this.tickCount);
      this.firstAttack = !this.firstAttack;
   }

   protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput tag) {
      super.readAdditionalSaveData(tag);
      this.reassessWeaponGoal();
   }

   public abstract net.minecraft.world.item.ItemStack getDefaultWeapon();

   public float getMeleeDistance() {
      return 6.0F;
   }

   public float getAttackReachSqr() {
      return 4.0F;
   }

   public float getSprint(float partialTick) {
      return net.minecraft.util.Mth.lerp(partialTick, this.sprintO, this.sprint);
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createEwokAttributes() {
      return createMobAttributes().add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.3).add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, 1.0).add(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE, 48.0);
   }

   public static class EwokHurtByTargetGoal extends net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal {
      public EwokHurtByTargetGoal(net.minecraft.world.entity.PathfinderMob mob) {
         super(mob, new Class[]{Ewok.class});
         this.setAlertOthers(new Class[0]);
      }

      protected void callSameTypeForRevenge() {
         double radius = this.mob.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE);
         this.mob
            .level()
            .getEntities(
               net.minecraft.world.level.entity.EntityTypeTest.forClass(Ewok.class),
               net.minecraft.world.phys.AABB.unitCubeFromLowerCorner(this.mob.position()).inflate(radius, 10.0, radius),
               ewok -> !this.mob.isAlliedTo(ewok) && ewok.getTarget() == null
            )
            .forEach(ewok -> ewok.setTarget(this.mob));
      }
   }

   public class EwokMeleeAttackGoal extends net.minecraft.world.entity.ai.goal.MeleeAttackGoal {
      public EwokMeleeAttackGoal(double speedModifier) {
         super(AbstractEwok.this, speedModifier, true);
      }

      public boolean canUse() {
         return super.canUse()
            && (
               !(AbstractEwok.this instanceof net.minecraft.world.entity.monster.RangedAttackMob)
                  || !(AbstractEwok.this.distanceTo(Objects.requireNonNull(AbstractEwok.this.getTarget())) > AbstractEwok.this.getMeleeDistance())
            );
      }

      public void start() {
         super.start();
         AbstractEwok.this.setAggressive(true);
         if (AbstractEwok.this.canSprint()) {
            AbstractEwok.this.setSprinting(true);
         }
      }

      public boolean canContinueToUse() {
         return super.canContinueToUse()
            && (
               !(AbstractEwok.this instanceof net.minecraft.world.entity.monster.RangedAttackMob)
                  || AbstractEwok.this.getTarget() == null
                  || !(AbstractEwok.this.distanceTo(AbstractEwok.this.getTarget()) > AbstractEwok.this.getMeleeDistance())
            );
      }

      protected void attack(net.minecraft.world.entity.LivingEntity target, double distance) {
         double reach = this.getSquaredMaxAttackDistance(target);
         if (distance <= reach && this.getAttackInterval() <= 0) {
            this.resetAttackCooldown();
            this.mob.swing(net.minecraft.world.InteractionHand.MAIN_HAND, true);
            this.mob.doHurtTarget((net.minecraft.server.level.ServerLevel)this.mob.level(), target);
         }
      }

      protected double getSquaredMaxAttackDistance(net.minecraft.world.entity.LivingEntity entity) {
         return (double)(AbstractEwok.this.getAttackReachSqr() + entity.getBbWidth());
      }

      public void stop() {
         super.stop();
         AbstractEwok.this.setAggressive(false);
         AbstractEwok.this.setSprinting(false);
      }
   }

   public class EwokRangedAttackGoal extends net.minecraft.world.entity.ai.goal.RangedAttackGoal {
      public EwokRangedAttackGoal(double speedModifier, int attackInterval, float maxRadius) {
         super((net.minecraft.world.entity.monster.RangedAttackMob)AbstractEwok.this, speedModifier, attackInterval, maxRadius);
      }

      public void start() {
         super.start();
         AbstractEwok.this.setAggressive(true);
      }

      public boolean canUse() {
         return super.canUse()
            && AbstractEwok.this.distanceTo(Objects.requireNonNull(AbstractEwok.this.getTarget())) > AbstractEwok.this.getMeleeDistance();
      }

      public boolean canContinueToUse() {
         return super.canContinueToUse()
            && (
               AbstractEwok.this.getTarget() == null || AbstractEwok.this.distanceTo(AbstractEwok.this.getTarget()) > AbstractEwok.this.getMeleeDistance()
            );
      }

      public void stop() {
         super.stop();
         AbstractEwok.this.setAggressive(false);
      }
   }
}
