package che.swgc.entity;

import che.swgc.network.SimpleSwgcActionPacket;
import che.swgc.reg.SwgcNetworking;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.entity.ai.attributes.Attributes;

public interface RiderControlledLongAttack {
   boolean isLongAttacking();

   void setLongAttacking(boolean var1);

   int getLongAttackCooldown();

   void setLongAttackCooldown(int var1);

   default void longAttackTick(net.minecraft.world.entity.LivingEntity self, net.minecraft.world.entity.player.Player player) {
      if (player.isLocalPlayer() && net.minecraft.client.Minecraft.getInstance().options.keyAttack.isDown() != this.isLongAttacking()) {
         this.setLongAttacking(!this.isLongAttacking());
         SwgcNetworking.sendToServer(new SimpleSwgcActionPacket(-125));
      }

      if (this.isLongAttacking()) {
         int cooldown = this.getLongAttackCooldown();
         if (++cooldown == (int)(20.0 / self.getAttributeBaseValue(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED))) {
            this.longAttack(player);
            this.setLongAttackCooldown(0);
         } else {
            this.setLongAttackCooldown(cooldown);
         }
      }
   }

   void longAttack(net.minecraft.world.entity.player.Player var1);

   default void shootAndAdd(net.minecraft.world.entity.LivingEntity self, net.minecraft.world.entity.player.Player jockey, net.minecraft.world.entity.projectile.Projectile projectile, double aimDistance, float velocity, float inaccuracy, net.minecraft.sounds.SoundEvent sound) {
      net.minecraft.world.phys.HitResult hitResult = net.minecraft.world.entity.projectile.ProjectileUtil.getHitResultOnViewVector(jockey, entity -> !entity.hasPassenger(jockey), aimDistance);
      net.minecraft.world.phys.Vec3 vec3 = (hitResult instanceof net.minecraft.world.phys.EntityHitResult entityHitResult ? entityHitResult.getEntity().getBoundingBox().getCenter() : hitResult.getLocation())
         .subtract(projectile.position());
      projectile.shoot(vec3.x, vec3.y, vec3.z, velocity + (float)self.getDeltaMovement().length(), inaccuracy);
      self.level().addFreshEntity(projectile);
      self.playSound(sound, 1.0F, che.swgc.SwgcUtils.soundPitch(self.getRandom()));
   }
}
