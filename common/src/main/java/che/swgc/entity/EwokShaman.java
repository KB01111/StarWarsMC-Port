package che.swgc.entity;

import che.swgc.reg.SwgcItems;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.projectile.hurtingprojectile.SmallFireball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

@javax.annotation.ParametersAreNonnullByDefault
public class EwokShaman extends AbstractEwok implements net.minecraft.world.entity.monster.RangedAttackMob {
   public EwokShaman(net.minecraft.world.entity.EntityType<? extends EwokShaman> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
      this.rangedAttackGoal = new AbstractEwok.EwokRangedAttackGoal(1.0, 7, 24.0F);
   }

   @Override
   public net.minecraft.world.item.ItemStack getDefaultWeapon() {
      return SwgcItems.EWOK_STAFF.get().getDefaultInstance();
   }

   @Override
   public void performRangedAttack(net.minecraft.world.entity.LivingEntity livingEntity, float v) {
      net.minecraft.world.phys.Vec3 pos = this.getEyePosition().add(this.getLookAngle());
      net.minecraft.world.phys.Vec3 dm = livingEntity.getBoundingBox().getCenter().subtract(pos);
      net.minecraft.world.entity.projectile.hurtingprojectile.SmallFireball fireball = new net.minecraft.world.entity.projectile.hurtingprojectile.SmallFireball(this.level(), this, dm.normalize());
      fireball.setOwner(this);
      fireball.setDeltaMovement(dm.normalize().scale(0.5));
      this.level().addFreshEntity(fireball);
      this.playSound(net.minecraft.sounds.SoundEvents.FIRECHARGE_USE, 1.0F, che.swgc.SwgcUtils.soundPitch(this.random));
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      return createMobAttributes().add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 32.0).add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.3).add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, 1.0);
   }
}
