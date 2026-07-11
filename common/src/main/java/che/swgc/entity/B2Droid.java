package che.swgc.entity;

import che.swgc.reg.SwgcSounds;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

public class B2Droid extends CommandableMob implements net.minecraft.world.entity.monster.RangedAttackMob {
   public B2Droid(net.minecraft.world.entity.EntityType<? extends CommandableMob> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
   }

   public void performRangedAttack(net.minecraft.world.entity.LivingEntity target, float distance) {
      BlasterBolt blasterBolt = new BlasterBolt(this.level(), this);
      blasterBolt.setColor(-65536);
      blasterBolt.setDamage((float)this.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE));
      net.minecraft.world.phys.Vec3 vec3 = target.getBoundingBox().getCenter().subtract(blasterBolt.position());
      blasterBolt.shoot(vec3.x, vec3.y, vec3.z, 3.0F, 0.5F);
      this.level().addFreshEntity(blasterBolt);
      this.playSound(SwgcSounds.BLASTER_SHOOT.get(), 1.0F, che.swgc.SwgcUtils.soundPitch(this.random));
      this.swing(net.minecraft.world.InteractionHand.MAIN_HAND, true);
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      return createCommandableAttributes()
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 30.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR, 5.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, 9.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.25);
   }
}
