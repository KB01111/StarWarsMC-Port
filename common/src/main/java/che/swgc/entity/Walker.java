package che.swgc.entity;

import che.swgc.reg.SwgcSounds;
import java.util.function.Supplier;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity.MoveFunction;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

@javax.annotation.ParametersAreNonnullByDefault
public class Walker extends AbstractArmedVehicle {
   private final Supplier<? extends net.minecraft.world.item.Item> item;
   public final int projectileColor;
   public final net.minecraft.world.entity.AnimationState shootAnimState = new net.minecraft.world.entity.AnimationState();
   private float sprint;
   private float sprintO;

   public Walker(net.minecraft.world.entity.EntityType<? extends Walker> entityType, net.minecraft.world.level.Level level, Supplier<? extends net.minecraft.world.item.Item> item, int projectileColor) {
      super(entityType, level);
      this.item = item;
      this.projectileColor = projectileColor;
      this.setPersistenceRequired();
   }

   public void aiStep() {
      this.sprintO = this.sprint;
      this.sprint = this.isSprinting() ? Math.min(this.sprint + 0.1F, 1.0F) : Math.max(this.sprint - 0.1F, 0.0F);
      super.aiStep();
   }

   protected void playStepSound(net.minecraft.core.BlockPos $$0, net.minecraft.world.level.block.state.BlockState $$1) {
      this.playSound(SwgcSounds.ATRT_STEP.get(), 2.0F, che.swgc.SwgcUtils.soundPitch(this.random));
   }

   protected float calculateNextStepSoundDistance() {
      return 2.27F;
   }

   public net.minecraft.world.item.ItemStack getPickResult() {
      return this.item.get().getDefaultInstance();
   }

   @Override
   protected void tickRidden(net.minecraft.world.entity.player.Player player, net.minecraft.world.phys.Vec3 travelVector) {
      super.tickRidden(player, travelVector);
      this.setYRot(player.getYRot());
      this.setXRot(player.getXRot());
   }

   @Override
   protected float getRiddenSpeed(net.minecraft.world.entity.player.Player player) {
      float ret = super.getRiddenSpeed(player);
      if (!this.isSprinting()) {
         ret *= 0.9F;
      }

      return ret;
   }

   @Override
   protected void positionRider(net.minecraft.world.entity.Entity passenger, net.minecraft.world.entity.Entity.MoveFunction callback) {
      if (this.hasPassenger(passenger)) {
         float yRad = this.yBodyRot * (float) Math.PI / 180.0F;
         callback.accept(
            passenger,
            this.getX() - (double)(net.minecraft.util.Mth.sin(yRad) * 0.5F),
            this.getY() + this.getPassengerAttachmentPoint(passenger, this.getDimensions(net.minecraft.world.entity.Pose.STANDING), 1.0F).y - 0.25,
            this.getZ() + (double)(net.minecraft.util.Mth.cos(yRad) * 0.5F)
         );
      }
   }

   public net.minecraft.world.phys.Vec3 updatePassengerForDismount(net.minecraft.world.entity.LivingEntity $$0) {
      return this.position();
   }

   public boolean canSprint() {
      return true;
   }

   public float getSprint(float partialTick) {
      return net.minecraft.util.Mth.lerp(partialTick, this.sprintO, this.sprint);
   }

   @Override
   public void longAttack(net.minecraft.world.entity.player.Player jockey) {
      if (this.level().isClientSide()) {
         this.shootAnimState.start(this.tickCount);
      } else {
         this.yBodyRot = jockey.getYRot();
         BlasterBolt blasterBolt = new BlasterBolt(this.level());
         float rotRad = this.yBodyRot * (float) Math.PI / 180.0F;
         blasterBolt.setPos(
            this.getX() - (double)(2.25F * net.minecraft.util.Mth.sin(rotRad)),
            this.getY() + 3.0,
            this.getZ() + (double)(2.25F * net.minecraft.util.Mth.cos(rotRad))
         );
         blasterBolt.setOwner(jockey);
         blasterBolt.setDamage((float)this.getAttributeBaseValue(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE));
         blasterBolt.setColor(this.projectileColor);
         this.shootAndAdd(this, jockey, blasterBolt, 64.0, 3.0F, 0.0F, SwgcSounds.BLASTER_SHOOT.get());
      }
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAtrtAttributes() {
      return createMobAttributes()
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 100.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.225)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, 9.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED, 4.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE, 1.0);
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAtstAttributes() {
      return createMobAttributes()
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 150.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.225)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, 12.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED, 1.0)
         .add(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE, 1.0);
   }
}
