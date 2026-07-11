package che.swgc.force;

import javax.annotation.Nullable;

public interface ForcePossessor {
   int swgc$getForceBrightSide();

   int swgc$getForceDarkSide();

   default int swgc$getForceSkill() {
      return this.swgc$getForceBrightSide() + this.swgc$getForceDarkSide();
   }

   default boolean possessesForce() {
      return this.swgc$getForceSkill() > 0;
   }

   int swgc$getForceTicks();

   @Nullable
   int[] swgc$getForceSecondaryActionData();

   default boolean isUsingForce() {
      return this.swgc$getForceSecondaryActionData() != null;
   }

   default boolean isLightsaberAttacking() {
      return !this.isUsingForce() && this.swgc$getForceTicks() >= 0;
   }

   byte swgc$getBaseAttack();

   @Nullable
   LightsaberAttack swgc$getLightsaberAttack();

   @Nullable
   ForceSecondaryAction swgc$getForceSecondaryAction();

   float swgc$getSprint(float var1);

   void swgc$setForceBrightSide(int var1);

   void swgc$setForceDarkSide(int var1);

   default void addForceBrightSide(int increment) {
      this.swgc$setForceBrightSide(this.swgc$getForceBrightSide() + increment);
   }

   default void addForceDarkSide(int increment) {
      this.swgc$setForceDarkSide(this.swgc$getForceDarkSide() + increment);
   }

   void swgc$setForceTicks(int var1);

   void swgc$setForceSecondaryActionData(@Nullable int[] var1);

   void swgc$nextBaseAttack();

   void swgc$setLightsaberAttack(@Nullable LightsaberAttack var1);

   void swgc$setForceSecondaryAction(@Nullable ForceSecondaryAction var1);

   void swgc$stopAllForceActions();

   default void startLightsaberAttacking() {
      this.swgc$stopAllForceActions();
      this.swgc$setForceTicks(0);
   }
}
