package che.swgc.entity;

import che.swgc.reg.SwgcSounds;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

@javax.annotation.ParametersAreNonnullByDefault
public class Droideka extends CommandableMob implements net.minecraft.world.entity.monster.RangedAttackMob {
   private static final net.minecraft.network.syncher.EntityDataAccessor<Float> DATA_FORCE_FIELD_ID = net.minecraft.network.syncher.SynchedEntityData.defineId(Droideka.class, net.minecraft.network.syncher.EntityDataSerializers.FLOAT);
   private static final net.minecraft.world.entity.EntityDimensions ROLLING_DIMENSIONS = net.minecraft.world.entity.EntityDimensions.fixed(0.625F, 0.625F);
   private float shieldAnim;
   private float shieldAnimO;
   private int ammoLeft = 40;
   private int cooldownTicks;
   public int roll;
   public final net.minecraft.world.entity.AnimationState rollAnimState = new net.minecraft.world.entity.AnimationState();

   public Droideka(net.minecraft.world.entity.EntityType<? extends Droideka> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
      this.rollAnimState.start(Integer.MIN_VALUE);
   }

   @Override
   protected void mobTick() {
      net.minecraft.world.entity.Pose pose = this.getSpeed() > 0.0F && this.getDeltaMovement().horizontalDistanceSqr() >= 1.0E-5 ? net.minecraft.world.entity.Pose.CROUCHING : net.minecraft.world.entity.Pose.STANDING;
      if (this.getPose() == pose) {
         this.roll = 0;
      } else if (this.roll > 3) {
         this.setPose(pose);
         this.roll = 0;
      } else {
         this.roll++;
      }

      if (--this.cooldownTicks == 0) {
         this.ammoLeft = 40;
      }
   }

   @Override
   public void aiStep() {
      super.aiStep();
      this.shieldAnimO = this.shieldAnim;
      if (this.getForceField() > 0.0F) {
         if (this.shieldAnim < 0.99F) {
            this.shieldAnim += 0.1F;
         }
      } else if (this.shieldAnim > 0.01F) {
         this.shieldAnim -= 0.1F;
      }

      if (this.level().isClientSide() && (this.roll == 0) == (this.getPose() == net.minecraft.world.entity.Pose.CROUCHING)) {
         this.roll = this.roll != 0 ? 0 : 1;
         this.rollAnimState.start(this.tickCount);
      }
   }

   @Override
   protected void registerAttackGoals() {
      this.goalSelector.addGoal(1, new Droideka.DroidekaAttackGoal(16.0F));
   }

   @Override
   public boolean canSprint() {
      return false;
   }

   public void performRangedAttack(net.minecraft.world.entity.LivingEntity target, float distance) {
      if (this.ammoLeft > 0) {
         net.minecraft.world.InteractionHand hand = net.minecraft.world.InteractionHand.MAIN_HAND;
         this.swing(hand, true);
         BlasterBolt blasterBolt = new BlasterBolt(this.level());
         blasterBolt.setOwner(this);
         blasterBolt.setPos(
            this.position()
               .add(
                  new net.minecraft.world.phys.Vec3(
                        this.getMainArm() == net.minecraft.world.entity.HumanoidArm.RIGHT ? 0.4F : -0.4F,
                        0.85F,
                        0.62F
                     )
                     .yRot(-this.yBodyRot * (float) Math.PI / 180.0F)
               )
         );
         blasterBolt.setColor(-65536);
         blasterBolt.setDamage((float)this.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE));
         net.minecraft.world.phys.Vec3 vec3 = target.getBoundingBox().getCenter().subtract(blasterBolt.position());
         blasterBolt.shoot(vec3.x, vec3.y, vec3.z, 3.0F, 0.0F);
         this.level().addFreshEntity(blasterBolt);
         if (--this.ammoLeft <= 0) {
            this.cooldownTicks = 70;
         }

         this.playSound(SwgcSounds.BLASTER_SHOOT.get(), 1.0F, che.swgc.SwgcUtils.soundPitch(this.random));
      }
   }

   @Override
   public boolean hurtServer(net.minecraft.server.level.ServerLevel serverLevel, net.minecraft.world.damagesource.DamageSource src, float dmg) {
      float forceField = this.getForceField();
      if (forceField > 0.0F
         && !this.isInvulnerableTo(serverLevel, src)
         && !this.level().isClientSide()
         && !src.is(net.minecraft.tags.DamageTypeTags.IS_FIRE)
         && !src.is(net.minecraft.world.damagesource.DamageTypes.GENERIC_KILL)) {
         this.playSound(SwgcSounds.LIGHTSABER_CLASH.get(), 1.0F, 1.0F);
         if (!(src.getDirectEntity() instanceof BlasterBolt)) {
            this.setForceField(Math.max(forceField - dmg, 0.0F));
         }

         return false;
      } else {
         return super.hurtServer(serverLevel, src, dmg);
      }
   }

   @Override
   protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput tag) {
      super.readAdditionalSaveData(tag);
      this.setForceField(-Math.abs(tag.getFloatOr("ForceField", 0.0F)));
   }

   @Override
   protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.putFloat("ForceField", this.getForceField());
   }

   @Override
   protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(DATA_FORCE_FIELD_ID, -16.0F);
   }

   public float getForceField() {
      return (Float)this.entityData.get(DATA_FORCE_FIELD_ID);
   }

   public void setForceField(float forceField) {
      this.entityData.set(DATA_FORCE_FIELD_ID, forceField);
   }

   public float getShieldAnim(float partialTick) {
      return net.minecraft.util.Mth.lerp(partialTick, this.shieldAnimO, this.shieldAnim);
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      return createCommandableAttributes()
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 20.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR, 2.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, 3.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.45F);
   }

   public class DroidekaAttackGoal extends net.minecraft.world.entity.ai.goal.RangedAttackGoal {
      public DroidekaAttackGoal(float radius) {
         super(Droideka.this, 0.0, 5, radius);
      }

      public void start() {
         super.start();
         float forceField = Droideka.this.getForceField();
         if (forceField < 0.0F) {
            Droideka.this.setForceField(-forceField);
         }
      }

      public void stop() {
         super.stop();
         float forceField = Droideka.this.getForceField();
         if (forceField > 0.0F) {
            Droideka.this.setForceField(-forceField);
         }
      }
   }
}
