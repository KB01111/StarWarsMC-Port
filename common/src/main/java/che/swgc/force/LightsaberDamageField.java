package che.swgc.force;

import che.swgc.item.LightsaberItem;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.util.Mth;

public record LightsaberDamageField(double radius, double height, float yDegree1, float yDegree2, int damage, int ticks) {
   public LightsaberDamageField(float yDegree1, float yDegree2, int damage, int ticks) {
      this(1.5, 2.0, yDegree1, yDegree2, damage, ticks);
   }

   public void damage(net.minecraft.server.level.ServerLevel lvl, net.minecraft.world.entity.LivingEntity entity) {
      net.minecraft.world.item.ItemStack stack = entity.getMainHandItem();
      boolean dualWielding = LightsaberItem.isActive(stack) && LightsaberItem.isActive(entity.getOffhandItem());
      float yBodyRot = entity.getMainArm() == net.minecraft.world.entity.HumanoidArm.RIGHT ? entity.yBodyRot : -entity.yBodyRot + this.yDegree1 - this.yDegree2;
      lvl.getEntities(
            entity,
            new net.minecraft.world.phys.AABB(
               entity.getX() - this.radius,
               entity.getY(),
               entity.getZ() - this.radius,
               entity.getX() + this.radius,
               entity.getY() + this.height,
               entity.getZ() + this.radius
            ),
            entity1 -> this.intersects(entity.position(), entity1.getBoundingBox(), yBodyRot)
                  || dualWielding && this.intersects(entity.position(), entity1.getBoundingBox(), yBodyRot + 180.0F)
         )
         .forEach(
            entity1 -> {
               if (entity1.isAttackable()) {
                  entity1.hurtServer(
                     lvl,
                     entity instanceof net.minecraft.world.entity.player.Player player ? player.damageSources().playerAttack(player) : entity.damageSources().mobAttack(entity),
                     (float)this.damage
                  );
                  lvl.playSound(
                     null,
                     entity1.getX(),
                     entity1.getY(),
                     entity1.getZ(),
                     LightsaberItem.clashSoundStatic(stack),
                     entity.getSoundSource(),
                     1.0F,
                     0.8F + entity.getRandom().nextFloat() * 0.4F
                  );
               }
            }
         );
   }

   public boolean intersects(net.minecraft.world.phys.Vec3 pos, net.minecraft.world.phys.AABB aabb, float yRot) {
      if (!(pos.y > aabb.maxY) && !(pos.y + this.height < aabb.minY)) {
         double minX = aabb.minX - pos.x;
         double maxX = aabb.maxX - pos.x;
         double minZ = aabb.minZ - pos.z;
         double maxZ = aabb.maxZ - pos.z;
         return this.intersectsAnyOfOppositeSides(minX, maxX, minZ, maxZ, yRot) || this.intersectsAnyOfOppositeSides(minZ, maxZ, minX, maxX, yRot - 90.0F);
      } else {
         return false;
      }
   }

   private boolean intersectsAnyOfOppositeSides(double minX, double maxX, double y1, double y2, float yRot) {
      if (net.minecraft.util.Mth.sign(y1) != net.minecraft.util.Mth.sign(y2)) {
         return minX <= this.radius && maxX >= -this.radius;
      } else {
         double distance = Math.abs(y1) < Math.abs(y2) ? y1 : y2;
         if (Math.abs(distance) > this.radius) {
            return false;
         } else {
            double x = Math.sqrt(this.radius * this.radius - distance * distance);
            if (!(x < minX) && !(-x > maxX)) {
               float angle = (float)net.minecraft.util.Mth.atan2(x, distance) * 180.0F / (float) Math.PI;
               return subtractAngles(angle, yRot + this.yDegree1) >= 0.0F && subtractAngles(angle, yRot + this.yDegree2) <= 0.0F
                  || subtractAngles(-angle, yRot + this.yDegree1) >= 0.0F && subtractAngles(-angle, yRot + this.yDegree2) <= 0.0F;
            } else {
               return false;
            }
         }
      }
   }

   private static float subtractAngles(float angle, float reference) {
      return net.minecraft.util.Mth.wrapDegrees(angle - reference);
   }
}
