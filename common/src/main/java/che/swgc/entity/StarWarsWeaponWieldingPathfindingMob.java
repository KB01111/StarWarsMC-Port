package che.swgc.entity;

import che.swgc.force.StarWarsWeaponWielder;
import che.swgc.item.BlasterItem;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.util.Mth;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.AnimationState;

@javax.annotation.ParametersAreNonnullByDefault
public abstract class StarWarsWeaponWieldingPathfindingMob extends net.minecraft.world.entity.PathfinderMob implements StarWarsWeaponWielder, net.minecraft.world.entity.monster.RangedAttackMob {
   private final net.minecraft.world.entity.AnimationState jumpAnimState = new net.minecraft.world.entity.AnimationState();
   private float sprint;
   private float sprintO;

   protected StarWarsWeaponWieldingPathfindingMob(net.minecraft.world.entity.EntityType<? extends StarWarsWeaponWieldingPathfindingMob> entityType, net.minecraft.world.level.Level level) {
      super(entityType, level);
   }

   public void aiStep() {
      this.sprintO = this.sprint;
      this.sprint = this.isSprinting() ? Math.min(this.sprint + 0.1F, 1.0F) : Math.max(this.sprint - 0.1F, 0.0F);
      super.aiStep();
   }

   @Override
   public net.minecraft.world.entity.AnimationState swgc$getJumpAnimState() {
      return this.jumpAnimState;
   }

   @Override
   public float swgc$getSprint(float partialTick) {
      return net.minecraft.util.Mth.lerp(partialTick, this.sprintO, this.sprint);
   }

   public void performRangedAttack(net.minecraft.world.entity.LivingEntity target, float distance) {
      net.minecraft.world.item.ItemStack blaster = this.getMainHandItem();
      if (blaster.getItem() instanceof BlasterItem blasterItem) {
         blasterItem.shoot(
            this.level(), this, blaster, target.getBoundingBox().getCenter().subtract(this.getEyePosition().add(this.getLookAngle()))
         );
         this.swing(net.minecraft.world.InteractionHand.MAIN_HAND, true);
      }
   }
}
