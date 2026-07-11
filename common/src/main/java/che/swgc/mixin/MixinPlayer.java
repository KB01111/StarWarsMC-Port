package che.swgc.mixin;

import che.swgc.force.ForcePossessor;
import che.swgc.force.ForceSecondaryAction;
import che.swgc.force.LightsaberAttack;
import che.swgc.force.StarWarsWeaponWielder;
import che.swgc.network.ClientboundForceSyncPacket;
import che.swgc.reg.SwgcGameRules;
import che.swgc.reg.SwgcNetworking;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.AnimationState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({net.minecraft.world.entity.player.Player.class})
public abstract class MixinPlayer extends net.minecraft.world.entity.LivingEntity implements ForcePossessor, StarWarsWeaponWielder {
   @Unique
   private int swgc$forceBrightSide;
   @Unique
   private int swgc$forceDarkSide;
   @Unique
   private int swgc$forceTicks = -1;
   @Unique
   @Nullable
   private int[] swgc$forceSecondaryActionData = null;
   @Unique
   private byte swgc$baseAttack;
   @Unique
   @Nullable
   private LightsaberAttack swgc$lightsaberAttack = null;
   @Unique
   @Nullable
   private ForceSecondaryAction swgc$forceSecondaryAction = null;
   @Unique
   private final net.minecraft.world.entity.AnimationState swgc$jumpAnimState = new net.minecraft.world.entity.AnimationState();
   @Unique
   private float swgc$sprint;
   @Unique
   private float swgc$sprintO;

   private MixinPlayer(net.minecraft.world.entity.EntityType<? extends net.minecraft.world.entity.LivingEntity> entityType, net.minecraft.world.level.Level level) {
      super(entityType, level);
   }

   @Override
   public int swgc$getForceBrightSide() {
      return this.swgc$forceBrightSide;
   }

   @Override
   public int swgc$getForceDarkSide() {
      return this.swgc$forceDarkSide;
   }

   @Override
   public int swgc$getForceTicks() {
      return this.swgc$forceTicks;
   }

   @Nullable
   @Override
   public int[] swgc$getForceSecondaryActionData() {
      return this.swgc$forceSecondaryActionData;
   }

   @Override
   public byte swgc$getBaseAttack() {
      return this.swgc$baseAttack;
   }

   @Nullable
   @Override
   public LightsaberAttack swgc$getLightsaberAttack() {
      return this.swgc$lightsaberAttack;
   }

   @Nullable
   @Override
   public ForceSecondaryAction swgc$getForceSecondaryAction() {
      return this.swgc$forceSecondaryAction;
   }

   @Override
   public void swgc$setForceBrightSide(int forceBrightSide) {
      this.swgc$forceBrightSide = forceBrightSide;
   }

   @Override
   public void swgc$setForceDarkSide(int forceDarkSide) {
      this.swgc$forceDarkSide = forceDarkSide;
   }

   @Override
   public void swgc$setForceTicks(int forceTicks) {
      this.swgc$forceTicks = forceTicks;
   }

   @Override
   public void swgc$setForceSecondaryActionData(@Nullable int[] forceSecondaryActionData) {
      this.swgc$forceSecondaryActionData = forceSecondaryActionData;
   }

   @Override
   public void swgc$nextBaseAttack() {
      this.swgc$baseAttack++;
   }

   @Override
   public void swgc$setLightsaberAttack(@Nullable LightsaberAttack attack) {
      if (this.swgc$lightsaberAttack != attack) {
         this.swgc$stopAllForceActions();
         this.swgc$lightsaberAttack = attack;
      }
   }

   @Override
   public void swgc$setForceSecondaryAction(@Nullable ForceSecondaryAction forceSecondaryAction) {
      if (this.swgc$forceSecondaryAction != forceSecondaryAction) {
         this.swgc$stopAllForceActions();
         this.swgc$forceSecondaryAction = forceSecondaryAction;
      }
   }

   @Override
   public void swgc$stopAllForceActions() {
      if (this.isLightsaberAttacking()) {
         Objects.requireNonNull(this.swgc$getLightsaberAttack()).finish(this, this.swgc$getForceTicks());
      }

      this.swgc$setForceSecondaryActionData(null);
      this.swgc$setForceTicks(-1);
      this.stopUsingItem();
   }

   @Override
   public net.minecraft.world.entity.AnimationState swgc$getJumpAnimState() {
      return this.swgc$jumpAnimState;
   }

   @Override
   public float swgc$getSprint(float partialTick) {
      return net.minecraft.util.Mth.lerp(partialTick, this.swgc$sprintO, this.swgc$sprint);
   }

   @Inject(
      method = {"aiStep"},
      at = {@At("TAIL")}
   )
   public void aiStep(CallbackInfo ci) {
      this.swgc$sprintO = this.swgc$sprint;
      this.swgc$sprint = this.isSprinting() ? Math.min(this.swgc$sprint + 0.1F, 1.0F) : Math.max(this.swgc$sprint - 0.1F, 0.0F);
   }

   @Inject(
      method = {"giveExperiencePoints"},
      at = {@At("TAIL")}
   )
   public void giveExperiencePoints(int pts, CallbackInfo ci) {
      if (!this.level().isClientSide()
         && ((net.minecraft.server.level.ServerLevel)this.level()).getGameRules().get(SwgcGameRules.RULE_FORCEOBTAINMENT)
         && (double)this.random.nextFloat() > Math.pow(0.992, (double)pts)) {
         this.addForceBrightSide(1);
         SwgcNetworking.sendToTracking((net.minecraft.world.entity.player.Player)(Object)this, new ClientboundForceSyncPacket((net.minecraft.world.entity.player.Player)(Object)this));
      }
   }

   @Inject(
      method = {"readAdditionalSaveData"},
      at = {@At("TAIL")}
   )
   protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput tag, CallbackInfo ci) {
      this.swgc$forceBrightSide = tag.getIntOr("swgc.ForceSkill", 0);
      this.swgc$forceDarkSide = tag.getIntOr("swgc.ForceDarkSide", 0);
   }

   @Inject(
      method = {"addAdditionalSaveData"},
      at = {@At("TAIL")}
   )
   protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput tag, CallbackInfo ci) {
      if (this.swgc$forceBrightSide != 0) {
         tag.putInt("swgc.ForceSkill", this.swgc$forceBrightSide);
      }

      if (this.swgc$forceDarkSide != 0) {
         tag.putInt("swgc.ForceDarkSide", this.swgc$forceDarkSide);
      }
   }
}
