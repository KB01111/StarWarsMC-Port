package che.swgc.force;

import che.swgc.item.LightsaberItem;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import javax.annotation.ParametersAreNonnullByDefault;

@javax.annotation.ParametersAreNonnullByDefault
public enum ForceSecondaryAction implements ForceAction {
   BLOCK("block", 0, 0, (player, data) -> {
      if (!LightsaberItem.isActive(player.getMainHandItem())) {
         ((ForcePossessor)player).swgc$stopAllForceActions();
      }
   }, (player, rmbx) -> LightsaberItem.isActive(player.getMainHandItem()) ? new int[0] : null) {
      @Override
      public boolean unlocked(net.minecraft.world.entity.player.Player player) {
         return player.getMainHandItem().getItem() instanceof LightsaberItem;
      }
   },
   TELEKINESIS(
      "telekinesis",
      1,
      0,
      (player, data) -> {
         net.minecraft.world.entity.Entity entity;
         if (data.length >= 3) {
            net.minecraft.core.BlockPos pos = new net.minecraft.core.BlockPos(data[0], data[1], data[2]);
            entity = net.minecraft.world.entity.item.FallingBlockEntity.fall(player.level(), pos, player.level().getBlockState(pos));
            float strength = player.level().getBlockState(pos).getDestroySpeed(player.level(), pos);
            ((net.minecraft.world.entity.item.FallingBlockEntity)entity).setHurtsEntities(strength * 0.4F, (int)(strength * 8.0F));
            entity.move(net.minecraft.world.entity.MoverType.PLAYER, new net.minecraft.world.phys.Vec3(0.0, 0.1, 0.0));
            entity.push(new net.minecraft.world.phys.Vec3(0.0, 0.2, 0.0));
            ((ForcePossessor)player).swgc$setForceSecondaryActionData(new int[]{entity.getId(), 2});
         } else {
            entity = player.level().getEntity(data[0]);
            if (entity == null) {
               ((ForcePossessor)player).swgc$stopAllForceActions();
               return;
            }
         }

         net.minecraft.world.phys.Vec3 delta = player.getEyePosition()
            .add(player.getLookAngle().scale((double)data[1] * 0.5))
            .subtract(entity.getEyePosition().add(entity.getDeltaMovement()));
         double scale = (
               entity instanceof net.minecraft.world.entity.item.FallingBlockEntity fallingBlock
                  ? 0.0075 / (double)Math.max(fallingBlock.getBlockState().getDestroySpeed(player.level(), fallingBlock.blockPosition()), 0.1F)
                  : 0.003 / entity.getBoundingBox().getSize()
            )
            * (double)((ForcePossessor)player).swgc$getForceSkill()
            / delta.length();
         if (scale < 1.0) {
            delta = delta.scale(scale);
         }

         entity.push(delta);
         if (entity instanceof net.minecraft.world.entity.LivingEntity livingEntity) {
            livingEntity.setLastHurtByMob(player);
         }
      },
      (player, rmbx) -> {
         net.minecraft.world.phys.HitResult hitResult = net.minecraft.world.entity.projectile.ProjectileUtil.getHitResultOnViewVector(player, entity1 -> !entity1.isSpectator(), 16.0);

         return switch (hitResult.getType()) {
            case BLOCK -> {
               net.minecraft.core.BlockPos pos = ((net.minecraft.world.phys.BlockHitResult)hitResult).getBlockPos();
               yield (float)((ForcePossessor)player).swgc$getForceSkill() >= player.level().getBlockState(pos).getDestroySpeed(player.level(), pos) * 8.0F
                  ? new int[]{pos.getX(), pos.getY(), pos.getZ()}
                  : null;
            }
            case ENTITY -> new int[]{
            ((net.minecraft.world.phys.EntityHitResult)hitResult).getEntity().getId(), telekinesisDistance(player.distanceTo(((net.minecraft.world.phys.EntityHitResult)hitResult).getEntity()), 32)
         };
            case MISS -> null;
            default -> throw new IncompatibleClassChangeError();
         };
      }
   ),
   PUSH(
      "push",
      30,
      0,
      (player, data) -> player.level()
            .getEntities(player, player.getBoundingBox().expandTowards(player.getLookAngle().scale(8.0)))
            .forEach(
               entity -> entity.push(
                     entity.position()
                        .subtract(player.position())
                        .normalize()
                        .scale((double)((float)((ForcePossessor)player).swgc$getForceSkill() * 0.00512F))
                  )
            ),
      (player, rmbx) -> new int[0]
   ),
   JUMP(
      "jump",
      25,
      0,
      (player, data) -> {
         if (player.onGround()) {
            ((ForcePossessor)player).swgc$setForceTicks(0);
         } else if (((ForcePossessor)player).swgc$getForceTicks() > ((ForcePossessor)player).swgc$getForceSkill() / 5) {
            ((ForcePossessor)player).swgc$stopAllForceActions();
         } else {
            player.push(new net.minecraft.world.phys.Vec3(0.0, 0.08F, 0.0));
         }
      },
      (player, rmbx) -> {
         if (player.onGround()) {
            return new int[0];
         } else {
            player.sendSystemMessage(
               net.minecraft.network.chat.Component.translatable("force.swgc.jump.notOnGround", new Object[]{net.minecraft.client.Minecraft.getInstance().options.keyUse.getTranslatedKeyMessage()})
            );
            return null;
         }
      }
   ),
   UNLIMITED_POWER(
      "unlimited_power",
      true,
      true,
      0,
      55,
      (player, data) -> {
         net.minecraft.world.entity.Entity entity;
         if ((player.getAbilities().invulnerable || player.getFoodData().getFoodLevel() > 6)
            && (entity = player.level().getEntity(data[0])) != null
            && entity.distanceToSqr(player) <= 64.0) {
            if (data[1] != 0) {
               TELEKINESIS.tick(player);
            }

            entity.hurt(entity.damageSources().playerAttack(player), 2.0F);
            entity.invulnerableTime = 15;
            if (data[1] == 0) {
               entity.setDeltaMovement(net.minecraft.world.phys.Vec3.ZERO);
            }

            if (!player.getAbilities().invulnerable
               && player.getRandom().nextInt(((ForcePossessor)player).swgc$getForceDarkSide() * ((ForcePossessor)player).swgc$getForceDarkSide())
                  < 2048) {
               player.getFoodData().setFoodLevel(player.getFoodData().getFoodLevel() - 1);
            }

            player.level()
               .playSound(player, player.getX(), player.getY(), player.getZ(), net.minecraft.sounds.SoundEvents.LIGHTNING_BOLT_THUNDER, net.minecraft.sounds.SoundSource.PLAYERS, 0.5F, 0.8F + player.getRandom().nextFloat() * 0.4F);
         } else {
            ((ForcePossessor)player).swgc$stopAllForceActions();
         }
      },
      (player, rmbx) -> {
         if (!player.getAbilities().invulnerable && player.getFoodData().getFoodLevel() <= 6) {
            return null;
         } else {
            net.minecraft.world.phys.Vec3 eyePos = player.getEyePosition();
            net.minecraft.world.phys.Vec3 view = player.getLookAngle().scale(8.0);
            net.minecraft.world.phys.EntityHitResult hitResult = net.minecraft.world.entity.projectile.ProjectileUtil.getEntityHitResult(
               player.level(), player, eyePos, eyePos.add(view), player.getBoundingBox().expandTowards(view), net.minecraft.world.entity.Entity::isAttackable, 1.0F
            );
            return hitResult != null
               ? new int[]{hitResult.getEntity().getId(), rmbx ? telekinesisDistance(player.distanceTo(hitResult.getEntity()), 16) : 0}
               : null;
         }
      }
   );

   private final String name;
   public final boolean lmb;
   public final boolean rmb;
   public final int requiredSkill;
   public final int requiredDarkSide;
   private final BiConsumer<net.minecraft.world.entity.player.Player, int[]> consumer;
   private final BiFunction<net.minecraft.world.entity.player.Player, Boolean, int[]> dataSupplier;

   private static int telekinesisDistance(float distance, int maxValue) {
      return (int)net.minecraft.util.Mth.clamp(distance * 2.0F, 2.0F, (float)maxValue);
   }

   private ForceSecondaryAction(
      String name, boolean lmb, boolean rmb, int requiredSkill, int requiredDarkSide, BiConsumer<net.minecraft.world.entity.player.Player, int[]> consumer, BiFunction<net.minecraft.world.entity.player.Player, Boolean, int[]> dataSupplier
   ) {
      this.name = name;
      this.lmb = lmb;
      this.rmb = rmb;
      this.requiredSkill = requiredSkill;
      this.requiredDarkSide = requiredDarkSide;
      this.consumer = consumer;
      this.dataSupplier = dataSupplier;
   }

   private ForceSecondaryAction(String name, int requiredSkill, int requiredDarkSide, BiConsumer<net.minecraft.world.entity.player.Player, int[]> consumer, BiFunction<net.minecraft.world.entity.player.Player, Boolean, int[]> dataSupplier) {
      this(name, false, true, requiredSkill, requiredDarkSide, consumer, dataSupplier);
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public int getFrame() {
      return this.requiredDarkSide > 0 ? 3 : (this.requiredSkill > 0 ? 2 : ForceAction.super.getFrame());
   }

   @Nullable
   public int[] getData(net.minecraft.world.entity.player.Player player, boolean rmb) {
      return this.dataSupplier.apply(player, rmb);
   }

   public void tick(net.minecraft.world.entity.player.Player player) {
      this.consumer.accept(player, ((ForcePossessor)player).swgc$getForceSecondaryActionData());
   }

   public boolean unlocked(net.minecraft.world.entity.player.Player player) {
      return ((ForcePossessor)player).swgc$getForceSkill() >= this.requiredSkill && ((ForcePossessor)player).swgc$getForceDarkSide() >= this.requiredDarkSide;
   }

   public boolean getInput() {
      return this.lmb && net.minecraft.client.Minecraft.getInstance().options.keyAttack.isDown() || this.rmb && net.minecraft.client.Minecraft.getInstance().options.keyUse.isDown();
   }

   public static ForceSecondaryAction[] getAllUnlocked(net.minecraft.world.entity.player.Player player) {
      return Arrays.stream(values()).filter(action -> action.unlocked(player)).toArray(ForceSecondaryAction[]::new);
   }

   @Nullable
   public static ForceSecondaryAction get(int index, net.minecraft.world.entity.player.Player player) {
      ForceSecondaryAction[] values = getAllUnlocked(player);
      int length = values.length;
      int i = index % (length + 1);

      while (i < 0) {
         i += length + 1;
      }

      return i < length ? values[i] : null;
   }

   @Nullable
   public static ForceSecondaryAction change(@Nullable ForceSecondaryAction action, int change, net.minecraft.world.entity.player.Player player) {
      int index = action != null ? action.ordinal() : -1;

      for (int i = Math.abs(change); i > 0; i--) {
         do {
            index = index >= 0 && index < values().length ? index + net.minecraft.util.Mth.sign((double)change) : (change >= 0 ? 0 : values().length - 1);
         } while (index < 0 || index >= values().length || values()[index].unlocked(player));
      }

      return index >= 0 && index < values().length ? values()[index] : null;
   }
}
