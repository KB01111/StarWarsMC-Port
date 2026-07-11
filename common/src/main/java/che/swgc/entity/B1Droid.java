package che.swgc.entity;

import che.swgc.item.BlasterItem;
import che.swgc.reg.SwgcItems;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

public class B1Droid extends CommandableMob implements net.minecraft.world.entity.monster.RangedAttackMob {
   public B1Droid(net.minecraft.world.entity.EntityType<? extends B1Droid> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
   }

   @Nullable
   public net.minecraft.world.entity.SpawnGroupData finalizeSpawn(net.minecraft.world.level.ServerLevelAccessor lvl, net.minecraft.world.DifficultyInstance difficulty, net.minecraft.world.entity.EntitySpawnReason type, @Nullable net.minecraft.world.entity.SpawnGroupData groupData) {
      net.minecraft.world.entity.SpawnGroupData data = super.finalizeSpawn(lvl, difficulty, type, groupData);
      this.setLeftHanded(false);
      this.setItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND, SwgcItems.E5.get().getDefaultInstance());
      return data;
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

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      return createCommandableAttributes()
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 20.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR, 2.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.3F);
   }
}
