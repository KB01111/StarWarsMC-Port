package che.swgc.entity;

import che.swgc.SwgcItemData;

import che.swgc.client.SwgcClientUtils;
import che.swgc.force.StarWarsWeaponWielder;
import che.swgc.platform.Services;
import com.mojang.authlib.GameProfile;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.scores.Team;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.client.Minecraft;
import net.minecraft.server.players.ProfileResolver;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityReference;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

@javax.annotation.ParametersAreNonnullByDefault
public class CommandableMob extends net.minecraft.world.entity.PathfinderMob implements net.minecraft.world.entity.OwnableEntity, StarWarsWeaponWielder {
   private static final net.minecraft.network.syncher.EntityDataAccessor<Optional<net.minecraft.world.entity.EntityReference<net.minecraft.world.entity.LivingEntity>>> DATA_OWNER_ID = net.minecraft.network.syncher.SynchedEntityData.defineId(CommandableMob.class, net.minecraft.network.syncher.EntityDataSerializers.OPTIONAL_LIVING_ENTITY_REFERENCE);
   private static final net.minecraft.network.syncher.EntityDataAccessor<String> DATA_COMMAND_ID = net.minecraft.network.syncher.SynchedEntityData.defineId(CommandableMob.class, EntityDataSerializers.STRING);
   @Nullable
   protected net.minecraft.core.BlockPos patrolPos = null;
   private final CommandableMob.PatrolGoal patrolGoal = new CommandableMob.PatrolGoal(1.0);
   private final CommandableMob.FollowOwnerGoal followOwnerGoal = new CommandableMob.FollowOwnerGoal(8.0);
   private final net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal<net.minecraft.world.entity.LivingEntity> attackEnemiesGoal = new net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal(this, net.minecraft.world.entity.LivingEntity.class, true, (entity, serverLevel) -> entity instanceof net.minecraft.world.entity.monster.Monster);
   private final net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal<net.minecraft.world.entity.LivingEntity> attackAnyoneGoal = new net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal(
      this, net.minecraft.world.entity.LivingEntity.class, true, (entity, serverLevel) -> !(entity instanceof Walker) && !(entity instanceof StarFighter)
   );
   private final net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal hurtByTargetGoal = new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this, new Class[0]);
   private final net.minecraft.world.entity.AnimationState jumpAnimState = new net.minecraft.world.entity.AnimationState();
   protected float sprint;
   protected float sprintO;

   public CommandableMob(net.minecraft.world.entity.EntityType<? extends CommandableMob> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
   }

   protected net.minecraft.world.InteractionResult mobInteract(net.minecraft.world.entity.player.Player player, net.minecraft.world.InteractionHand hand) {
      if (player.isLocalPlayer() && player.getUUID().equals(this.getOwnerUuid())) {
         SwgcClientUtils.openDroidScreen(this);
         return net.minecraft.world.InteractionResult.CONSUME;
      } else {
         return net.minecraft.world.InteractionResult.PASS;
      }
   }

   protected void registerGoals() {
      this.registerAttackGoals();
      this.goalSelector.addGoal(5, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(this, net.minecraft.world.entity.player.Player.class, 16.0F));
      this.goalSelector.addGoal(6, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(this, CommandableMob.class, 16.0F));
      this.goalSelector.addGoal(7, new net.minecraft.world.entity.ai.goal.RandomLookAroundGoal(this));
   }

   protected void registerAttackGoals() {
      if (this instanceof net.minecraft.world.entity.monster.RangedAttackMob rangedAttackMob) {
         this.goalSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.RangedAttackGoal(rangedAttackMob, 1.0, 15, 16.0F));
      }
   }

   protected void mobTick() {
      double followRange = this.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE);
      net.minecraft.world.entity.LivingEntity target = this.getTarget();
      if (target != null) {
         if (!(this.distanceToPatrolPos(target.position()) > followRange)) {
            if (this.canSprint()) {
               this.setSprinting(this.distanceTo(target) > 8.0F);
            }

            return;
         }

         this.setTarget(null);
      }

      if (this.canSprint()) {
         this.setSprinting(this.distanceToPatrolPos(this.position()) > followRange);
      }
   }

   public void aiStep() {
      this.updateSwingTime();
      if (this.onGround()) {
         this.jumpAnimState.stop();
      } else {
         this.jumpAnimState.startIfStopped(this.tickCount);
      }

      this.sprintO = this.sprint;
      this.sprint = this.isSprinting() ? Math.min(this.sprint + 0.1F, 1.0F) : Math.max(this.sprint - 0.1F, 0.0F);
      super.aiStep();
   }

   public boolean canSprint() {
      return true;
   }

   public boolean hurtServer(net.minecraft.server.level.ServerLevel serverLevel, net.minecraft.world.damagesource.DamageSource source, float amount) {
      return (!this.isDroid() || !che.swgc.SwgcUtils.mechsImmuneTo(source)) && super.hurtServer(serverLevel, source, amount);
   }

   protected int decreaseAirSupply(int currentAir) {
      return this.isDroid() ? currentAir : super.decreaseAirSupply(currentAir);
   }

   @Nullable
   public net.minecraft.world.item.ItemStack getPickResult() {
      net.minecraft.world.item.Item item = Services.ITEMS.spawnEggByType(this.getType());
      if (item == null) {
         return null;
      } else {
         net.minecraft.world.item.ItemStack stack = item.getDefaultInstance();
         if (this.getOwnerUuid() != null) {
            SwgcItemData.update(stack, tag -> tag.putString("Owner", this.getOwnerUuid().toString()));
         }

         SwgcItemData.update(stack, tag -> tag.putString("Command", this.getCommand().name()));
         return stack;
      }
   }

   @Nullable
   public net.minecraft.world.entity.SpawnGroupData finalizeSpawn(net.minecraft.world.level.ServerLevelAccessor lvl, net.minecraft.world.DifficultyInstance difficulty, net.minecraft.world.entity.EntitySpawnReason type, @Nullable net.minecraft.world.entity.SpawnGroupData groupData) {
      return super.finalizeSpawn(lvl, difficulty, type, groupData);
   }

   @Override
   public net.minecraft.world.entity.EntityReference<net.minecraft.world.entity.LivingEntity> getOwnerReference() {
      return this.entityData.get(DATA_OWNER_ID).orElse(null);
   }

   public boolean isPersistenceRequired() {
      return this.getOwnerUuid() != null || super.isPersistenceRequired();
   }

   @Override
   public net.minecraft.world.entity.AnimationState swgc$getJumpAnimState() {
      return this.jumpAnimState;
   }

   @Override
   public float swgc$getSprint(float partialTick) {
      return net.minecraft.util.Mth.lerp(partialTick, this.sprintO, this.sprint);
   }

   @Nullable
   public net.minecraft.world.scores.PlayerTeam getTeam() {
      net.minecraft.world.entity.LivingEntity owner = this.getOwner();
      return owner != null ? owner.getTeam() : null;
   }

   @Override
   protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput input) {
      super.readAdditionalSaveData(input);
      net.minecraft.world.entity.EntityReference<net.minecraft.world.entity.LivingEntity> ownerRef =
         net.minecraft.world.entity.EntityReference.readWithOldOwnerConversion(input, "Owner", this.level());
      if (ownerRef != null) {
         this.entityData.set(DATA_OWNER_ID, Optional.of(ownerRef));
      }
      input.getString("Command").ifPresent(command -> {
         try {
            this.command(CommandableMob.Command.valueOf(command));
         } catch (IllegalArgumentException ignored) {
         }
      });
      input.getIntArray("PatrolPos").ifPresent(ints -> {
         if (ints.length >= 3) {
            this.patrolPos = new net.minecraft.core.BlockPos(ints[0], ints[1], ints[2]);
         }
      });
   }

   @Override
   protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput output) {
      super.addAdditionalSaveData(output);
      net.minecraft.world.entity.EntityReference.store(this.getOwnerReference(), output, "Owner");
      output.putString("Command", this.getCommand().name());
      if (this.patrolPos != null) {
         output.putIntArray("PatrolPos", new int[]{this.patrolPos.getX(), this.patrolPos.getY(), this.patrolPos.getZ()});
      }
   }

   protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(DATA_OWNER_ID, Optional.empty());
      builder.define(DATA_COMMAND_ID, CommandableMob.Command.STAND_STILL.name());
   }

   @Nullable
   public UUID getOwnerUuid() {
      return this.entityData.get(DATA_OWNER_ID).map(net.minecraft.world.entity.EntityReference::getUUID).orElse(null);
   }

   public void setOwnerUuid(@Nullable UUID ownerUuid) {
      this.entityData.set(DATA_OWNER_ID, ownerUuid == null ? Optional.empty() : Optional.of(net.minecraft.world.entity.EntityReference.of(ownerUuid)));
   }

   public CommandableMob.Command getCommand() {
      return CommandableMob.Command.valueOf(this.entityData.get(DATA_COMMAND_ID));
   }

   public void command(CommandableMob.Command command) {
      this.entityData.set(DATA_COMMAND_ID, command.name());
      this.patrolPos = command.patrol ? this.blockPosition() : null;
      this.goalSelector.removeGoal(this.patrolGoal);
      this.goalSelector.removeGoal(this.followOwnerGoal);
      this.goalSelector.removeGoal(this.attackEnemiesGoal);
      this.goalSelector.removeGoal(this.attackAnyoneGoal);
      this.goalSelector.removeGoal(this.hurtByTargetGoal);
      switch (command) {
         case HOLD_POSITION:
            this.goalSelector.addGoal(2, this.hurtByTargetGoal);
            this.goalSelector.addGoal(3, this.patrolGoal);
            break;
         case FOLLOW:
            this.goalSelector.addGoal(2, this.followOwnerGoal);
            break;
         case COMBAT_AID:
            this.goalSelector.addGoal(2, this.attackAnyoneGoal);
            this.goalSelector.addGoal(3, this.followOwnerGoal);
            break;
         case ELIMINATE_MOBS:
            this.goalSelector.addGoal(2, this.attackEnemiesGoal);
            this.goalSelector.addGoal(3, this.hurtByTargetGoal);
            this.goalSelector.addGoal(4, this.patrolGoal);
      }
   }

   public double distanceToPatrolPos(net.minecraft.world.phys.Vec3 vec3) {
      if (this.getCommand() == CommandableMob.Command.STAND_STILL) {
         return 0.0;
      } else {
         net.minecraft.world.entity.LivingEntity owner;
         return this.patrolPos != null
            ? vec3.distanceTo(net.minecraft.world.phys.Vec3.atBottomCenterOf(this.patrolPos))
            : ((owner = this.getOwner()) != null ? Math.sqrt(owner.distanceToSqr(vec3)) : 0.0);
      }
   }

   public float getRunAmount(float partialTick) {
      return net.minecraft.util.Mth.lerp(partialTick, this.sprintO, this.sprint);
   }

   public boolean isDroid() {
      return true;
   }

   public net.minecraft.network.chat.Component getScreenTitle() {
      net.minecraft.network.chat.Component customName = this.getCustomName();
      return (net.minecraft.network.chat.Component)(customName != null
         ? customName
         : net.minecraft.network.chat.Component.translatable("gui.swgc.command.droid", new Object[]{this.getName().getString(), this.getStringUUID()}));
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createCommandableAttributes() {
      return createMobAttributes().add(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE, 32.0);
   }

   public static enum Command {
      HOLD_POSITION(true, true),
      FOLLOW(false, false),
      COMBAT_AID(false, true),
      STAND_STILL(false, false),
      ELIMINATE_MOBS(true, true);

      public final boolean patrol;
      public final boolean attackBack;

      private Command(boolean patrol, boolean attackBack) {
         this.patrol = patrol;
         this.attackBack = attackBack;
      }

      public net.minecraft.network.chat.MutableComponent getComponent() {
         return net.minecraft.network.chat.Component.translatable("gui.swgc.command." + this.name().toLowerCase());
      }
   }

   public class FollowOwnerGoal extends net.minecraft.world.entity.ai.goal.Goal {
      private final double minDistance;
      private net.minecraft.world.entity.LivingEntity owner;
      private int recalcTime;

      public FollowOwnerGoal(double maxDistance) {
         this.minDistance = maxDistance;
         this.setFlags(EnumSet.of(net.minecraft.world.entity.ai.goal.Goal.Flag.MOVE));
      }

      public boolean canUse() {
         net.minecraft.world.entity.LivingEntity entity = CommandableMob.this.getOwner();
         if (entity != null && !entity.isSpectator() && !((double)CommandableMob.this.distanceTo(entity) <= this.minDistance)) {
            this.owner = entity;
            return true;
         } else {
            return false;
         }
      }

      public boolean canContinueToUse() {
         return !CommandableMob.this.navigation.isDone() && (double)CommandableMob.this.distanceTo(this.owner) > this.minDistance;
      }

      public void tick() {
         super.tick();
         if (--this.recalcTime <= 0) {
            this.recalcTime = this.adjustedTickDelay(10);
            CommandableMob.this.getNavigation().moveTo(this.owner, 1.0);
         }
      }
   }

   public class PatrolGoal extends net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal {
      public PatrolGoal(double speedModifier) {
         super(CommandableMob.this, speedModifier);
      }

      public boolean canUse() {
         if (CommandableMob.this.patrolPos != null
            && CommandableMob.this.distanceToPatrolPos(CommandableMob.this.position()) > CommandableMob.this.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE)) {
            this.wantedX = (double)CommandableMob.this.patrolPos.getX();
            this.wantedY = (double)CommandableMob.this.patrolPos.getY();
            this.wantedZ = (double)CommandableMob.this.patrolPos.getZ();
            this.forceTrigger = false;
            return true;
         } else {
            return super.canUse();
         }
      }

      @Nullable
      protected net.minecraft.world.phys.Vec3 getPosition() {
         net.minecraft.world.phys.Vec3 pos = super.getPosition();
         return pos != null && CommandableMob.this.distanceToPatrolPos(pos) <= CommandableMob.this.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE) ? pos : null;
      }
   }
}
