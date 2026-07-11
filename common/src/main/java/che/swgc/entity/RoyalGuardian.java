package che.swgc.entity;

import che.swgc.SwgcUtils;
import che.swgc.item.ForcePikeItem;
import che.swgc.reg.SwgcItems;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.ServerLevelAccessor;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

@javax.annotation.ParametersAreNonnullByDefault
public class RoyalGuardian extends CommandableMob {
   public boolean firstAttack;

   public RoyalGuardian(net.minecraft.world.entity.EntityType<? extends RoyalGuardian> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
   }

   @Nullable
   @Override
   public net.minecraft.world.entity.SpawnGroupData finalizeSpawn(net.minecraft.world.level.ServerLevelAccessor lvl, net.minecraft.world.DifficultyInstance difficulty, net.minecraft.world.entity.EntitySpawnReason spawnType, @Nullable net.minecraft.world.entity.SpawnGroupData groupData) {
      net.minecraft.world.entity.SpawnGroupData ret = super.finalizeSpawn(lvl, difficulty, spawnType, groupData);

      for (net.minecraft.world.item.equipment.ArmorType type : net.minecraft.world.item.equipment.ArmorType.values()) {
         this.setItemSlot(SwgcUtils.armorSlot(type), SwgcItems.ROYAL_GUARD_ARMOR.get(type).get().getDefaultInstance());
      }

      this.setItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND, SwgcItems.FORCE_PIKE.get().getDefaultInstance());
      return ret;
   }

   public void swing(net.minecraft.world.InteractionHand hand, boolean sendToClient) {
      super.swing(hand, sendToClient);
      this.firstAttack = !this.firstAttack;
   }

   @Override
   protected void registerAttackGoals() {
      this.goalSelector.addGoal(1, new RoyalGuardian.RoyalGuardianAttackGoal(this, 1.0, true));
   }

   @Override
   public boolean isDroid() {
      return false;
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      return createCommandableAttributes()
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 20.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.3F)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, 1.0);
   }

   public static class RoyalGuardianAttackGoal extends net.minecraft.world.entity.ai.goal.MeleeAttackGoal {
      public RoyalGuardianAttackGoal(net.minecraft.world.entity.PathfinderMob mob, double speedModifier, boolean followingTargetEvenIfNotSeen) {
         super(mob, speedModifier, followingTargetEvenIfNotSeen);
      }

      public void start() {
         super.start();
         ForcePikeItem.setActive(this.mob.getMainHandItem(), true);
      }

      public void stop() {
         super.stop();
         ForcePikeItem.setActive(this.mob.getMainHandItem(), false);
      }
   }
}
