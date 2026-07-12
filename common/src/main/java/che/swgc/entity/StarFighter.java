package che.swgc.entity;

import che.swgc.platform.Services;
import che.swgc.network.ClientboundZRotPacket;
import che.swgc.reg.SwgcItems;
import che.swgc.reg.SwgcNetworking;
import che.swgc.reg.SwgcSounds;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.AABB;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.phys.Vec3;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity.MoveFunction;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

@javax.annotation.ParametersAreNonnullByDefault
public class StarFighter extends AbstractArmedVehicle {
   public float zRot;
   public float zRotO;
   private int landTick;
   public final net.minecraft.world.entity.AnimationState takeoffAnimState = new net.minecraft.world.entity.AnimationState();
   public boolean engineHeard;

   public StarFighter(net.minecraft.world.entity.EntityType<? extends StarFighter> type, net.minecraft.world.level.Level lv) {
      super(type, lv);
      this.setPersistenceRequired();
      this.moveControl = new StarFighter.StarFighterMoveControl(this);
      this.takeoffAnimState.start(-1024);
   }

   public void tick() {
      if (this.level().isClientSide() && this.isNoGravity() && !this.engineHeard) {
         Services.CLIENT.startStarFighterNoise(this);
      }

      float zRotO = this.getZRot();
      if (this.landTick <= 40 && (!this.level().isClientSide() || this.getControllingPassenger() instanceof net.minecraft.world.entity.player.Player player && player.isLocalPlayer())) {
         this.zRot = this.zRot + (zRotO - this.zRotO) * 0.96F;
      }

      this.zRotO = zRotO;
      super.tick();
      if (!this.level().isClientSide() && zRotO != this.getZRot()) {
         SwgcNetworking.sendToTracking(
            (net.minecraft.world.entity.Entity)(this.getControllingPassenger() instanceof net.minecraft.world.entity.player.Player player ? player : this), new ClientboundZRotPacket(this.getId(), this.zRot)
         );
      }
   }

   public void travel(net.minecraft.world.phys.Vec3 travelVector) {
      super.travel(travelVector);
      if (this.getAirDrag() > 0.0F && this.isNoGravity() && this.level().getFluidState(this.blockPosition()).isEmpty()) {
         this.setDeltaMovement(this.getDeltaMovement().multiply(1.0, 0.93, 1.0));
      }
   }

   public boolean isCollidable() {
      return true;
   }

   public net.minecraft.world.item.ItemStack getPickResult() {
      return SwgcItems.DELTA7B.get().getDefaultInstance();
   }

   public void handleEntityEvent(byte id) {
      switch (id) {
         case 61:
            if (this.landTick < 20) {
               this.landTick = 20;
            }

            this.takeoffAnimState.start(this.tickCount + 40);
            break;
         case 62:
            this.landTick = 0;
            this.takeoffAnimState.start(this.tickCount);
            net.minecraft.world.phys.Vec3 dm = this.getDeltaMovement();

            for (double radius = 0.3333333333333333; radius < 1.01; radius += 0.3333333333333333) {
               for (double angle = 0.0; angle < 6.2; angle += Math.PI / 18) {
                  this.level()
                     .addParticle(
                        net.minecraft.core.particles.ParticleTypes.POOF,
                        this.getX(),
                        this.getY(),
                        this.getZ(),
                        radius * (dm.x + Math.sin(angle)),
                        0.05,
                        radius * (dm.z + Math.cos(angle))
                     );
               }
            }
            break;
         default:
            super.handleEntityEvent(id);
      }
   }

   protected void updatePassengerPosition(net.minecraft.world.entity.Entity passenger, net.minecraft.world.entity.Entity.MoveFunction callback) {
      if (this.hasPassenger(passenger)) {
         net.minecraft.world.phys.Vec3 vec3 = this.position()
            .add(0.0, 0.0 - 0.25, 0.0)
            .add(
               new net.minecraft.world.phys.Vec3(0.0, 0.875, 0.0)
                  .zRot(this.getZRot() * (float) Math.PI / 180.0F)
                  .xRot(this.getXRot() * (float) Math.PI / -180.0F)
                  .yRot(this.yBodyRot * (float) Math.PI / -180.0F)
            );
         callback.accept(passenger, vec3.x, vec3.y, vec3.z);
      }
   }

   @Override
   protected void tickRidden(net.minecraft.world.entity.player.Player player, net.minecraft.world.phys.Vec3 travelVector) {
      super.tickRidden(player, travelVector);
      if (this.isNoGravity()) {
         label65: {
            float speed = this.getSpeed();
            if (speed <= 0.2F && player.zza <= 0.0F) {
               net.minecraft.core.BlockPos.MutableBlockPos pos = this.blockPosition().mutable();

               for (int i = 0; i < 4; i++) {
                  if (this.level().getBlockState(pos.move(net.minecraft.core.Direction.DOWN, 1)).isFaceSturdy(this.level(), pos, net.minecraft.core.Direction.UP)) {
                     this.setSpeed(speed * 0.9F);
                     if (++this.landTick == 20) {
                        this.level().broadcastEntityEvent(this, (byte)61);
                     } else if (this.landTick > 60) {
                        this.setNoGravity(false);
                     }
                     break label65;
                  }
               }
            }

            if ((speed = speed * 0.95F + player.zza * 0.05F * (float)this.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.FLYING_SPEED)) > 0.0F) {
               this.setSpeed(speed);
            }

            this.landTick = 0;
         }

         this.setYRot(player.getYRot());
         this.yHeadRot = this.yBodyRot = this.getYRot();
         if (this.landTick > 40) {
            this.setXRot(net.minecraft.util.Mth.wrapDegrees(this.getXRot()) * 0.7F);
            if (!this.level().isClientSide() || player.isLocalPlayer()) {
               this.setZRot(net.minecraft.util.Mth.wrapDegrees(this.getZRot()) * 0.7F);
            }
         } else {
            this.setXRot(player.getXRot());
            if (!this.level().isClientSide() || player.isLocalPlayer()) {
               if (player.xxa != 0.0F) {
                  this.setZRot(this.getZRot() + player.xxa * 1.8F);
               } else {
                  float zWrapped = net.minecraft.util.Mth.wrapDegrees(this.getZRot());
                  float tilt = Math.abs(zWrapped);
                  if (tilt < 15.0F) {
                     this.setZRot(zWrapped * tilt / 15.0F);
                     this.zRotO = net.minecraft.util.Mth.wrapDegrees(this.zRotO);
                  }
               }
            }
         }
      } else if (player.zza > 0.0F) {
         if (++this.landTick > 30) {
            this.setNoGravity(true);
            this.level().broadcastEntityEvent(this, (byte)62);
            this.playSound(net.minecraft.sounds.SoundEvents.GENERIC_EXPLODE.value(), 2.0F, che.swgc.SwgcUtils.soundPitch(this.random));
            this.landTick = 0;
         }
      } else {
         this.landTick = 0;
      }
   }

   @Override
   protected net.minecraft.world.phys.Vec3 getRiddenInput(net.minecraft.world.entity.player.Player player, net.minecraft.world.phys.Vec3 travelVector) {
      float rad = player.getXRot() * (float) Math.PI / -180.0F;
      return new net.minecraft.world.phys.Vec3(0.0, (double)net.minecraft.util.Mth.sin(rad), (double)net.minecraft.util.Mth.cos(rad));
   }

   @Override
   protected float getRiddenSpeed(net.minecraft.world.entity.player.Player player) {
      return this.getSpeed();
   }

   public net.minecraft.world.phys.Vec3 updatePassengerForDismount(net.minecraft.world.entity.LivingEntity passenger) {
      return new net.minecraft.world.phys.Vec3(this.getX(), this.getBoundingBox().maxY + 0.01, this.getZ());
   }

   @Override
   public void longAttack(net.minecraft.world.entity.player.Player jockey) {
      BlasterBolt blasterBolt = new BlasterBolt(this.level());
      this.updatePassengerPosition(jockey, (passenger, x, y, z) -> passenger.setPos(x, y, z));
      blasterBolt.setPos(jockey.getEyePosition().add(jockey.getLookAngle().scale(5.0)));
      blasterBolt.setOwner(jockey);
      blasterBolt.setDamage((float)this.getAttributeBaseValue(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE));
      blasterBolt.setColor(-16711936);
      this.shootAndAdd(this, jockey, blasterBolt, 128.0, 3.0F, 0.0F, SwgcSounds.BLASTER_SHOOT.get());
   }

   public float getZRot() {
      return this.zRot;
   }

   public float getZRot(float partialTick) {
      return partialTick == 1.0F ? this.getZRot() : net.minecraft.util.Mth.rotLerp(partialTick, this.zRotO, this.getZRot());
   }

   public void setZRot(float zRot) {
      this.zRot = zRot;
   }

   public boolean flightAnim() {
      return this.isNoGravity() && this.landTick < 20;
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      return createMobAttributes()
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 160.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, 13.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED, 5.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE, 1.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.FLYING_SPEED, 3.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.05);
   }

   public static class StarFighterMoveControl extends net.minecraft.world.entity.ai.control.MoveControl {
      public StarFighterMoveControl(net.minecraft.world.entity.Mob mob) {
         super(mob);
      }

      public void tick() {
         if (this.operation == net.minecraft.world.entity.ai.control.MoveControl.Operation.MOVE_TO) {
            double x = this.wantedX - this.mob.getX();
            double y = this.wantedY - this.mob.getY();
            double z = this.wantedZ - this.mob.getZ();
            float yRot = (float)net.minecraft.util.Mth.atan2(z, x) * 180.0F / (float) Math.PI - 90.0F;
            float xRot = (float)net.minecraft.util.Mth.atan2(y, Math.sqrt(x * x + z * z));
            this.mob.setYRot(this.rotlerp(this.mob.getYRot(), yRot, 18.0F));
            this.mob.setXRot(this.rotlerp(this.mob.getXRot(), xRot, 3.0F));
            this.mob.setSpeed((float)(this.speedModifier * this.mob.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.FLYING_SPEED)));
         } else {
            this.operation = net.minecraft.world.entity.ai.control.MoveControl.Operation.WAIT;
         }
      }
   }
}
