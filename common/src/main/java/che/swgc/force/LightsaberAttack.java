package che.swgc.force;

import che.swgc.entity.ThrownLightsaber;
import che.swgc.item.LightsaberItem;
import java.util.Arrays;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

@javax.annotation.ParametersAreNonnullByDefault
public enum LightsaberAttack implements ForceAction {
   OBI_ANI(
      "obi_ani",
      new LightsaberDamageField(-30.0F, -180.0F, 7, 4),
      new LightsaberDamageField(-15.0F, -165.0F, 7, 3),
      new LightsaberDamageField(30.0F, -120.0F, 7, 4),
      new LightsaberDamageField(-15.0F, -165.0F, 7, 3)
   ),
   THROW(
      "throw",
      (entity, tickx) -> {
      },
      (entity, tickx) -> {
         ThrownLightsaber thrown = new ThrownLightsaber(entity.level(), entity);
         thrown.setLightsaber(entity.getMainHandItem());
         thrown.shootFromRotation(
            entity,
            entity.getXRot(),
            entity.getYRot(),
            0.0F,
            Math.min((float)tickx.intValue() * 0.05F, 1.0F)
               * (entity instanceof ForcePossessor forcePossessor ? Math.min((float)forcePossessor.swgc$getForceSkill() * 0.08F, 4.0F) : 3.0F),
            0.0F
         );
         entity.level().addFreshEntity(thrown);
         if (entity instanceof net.minecraft.world.entity.player.Player player && !player.getAbilities().instabuild) {
            player.setItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND, net.minecraft.world.item.ItemStack.EMPTY);
         }
      }
   );

   private final String name;
   private final BiConsumer<net.minecraft.world.entity.LivingEntity, Integer> tick;
   private final BiConsumer<net.minecraft.world.entity.LivingEntity, Integer> finish;

   private LightsaberAttack(String name, BiConsumer<net.minecraft.world.entity.LivingEntity, Integer> tick, BiConsumer<net.minecraft.world.entity.LivingEntity, Integer> finish) {
      this.name = name;
      this.tick = tick;
      this.finish = finish;
   }

   private LightsaberAttack(String name, LightsaberDamageField... damageFields) {
      this.name = name;
      int length = Arrays.stream(damageFields).mapToInt(LightsaberDamageField::ticks).sum();
      this.tick = (entity, tickx) -> {
         int tick1 = tickx % length;
         int i = 0;

         for (LightsaberDamageField damageField : damageFields) {
            boolean whoosh = i == tick1;
            if (whoosh || (i += damageField.ticks()) > tick1) {
               if (entity.level() instanceof net.minecraft.server.level.ServerLevel serverLevel) {
                  damageField.damage(serverLevel, entity);
               }
               if (whoosh) {
                  entity.level()
                     .playSound(
                        entity,
                        entity.getX(),
                        entity.getY(),
                        entity.getZ(),
                        LightsaberItem.swingSoundStatic(entity.getMainHandItem()),
                        entity.getSoundSource(),
                        0.25F,
                        0.8F + entity.getRandom().nextFloat() * 0.4F
                     );
               }
            }
         }
      };
      this.finish = (entity, tickx) -> {
      };
   }

   @Override
   public String getName() {
      return this.name;
   }

   public void tick(net.minecraft.world.entity.LivingEntity entity, int tick) {
      this.tick.accept(entity, tick);
   }

   public void finish(net.minecraft.world.entity.LivingEntity entity, int tick) {
      this.finish.accept(entity, tick);
   }

   @Nullable
   public static LightsaberAttack get(int index) {
      int length = values().length;
      int i = index % (length + 1);

      while (i < 0) {
         i += length + 1;
      }

      return i < length ? values()[i] : null;
   }

   @Nullable
   public static LightsaberAttack change(@Nullable LightsaberAttack lightsaberAttack, int change) {
      return get((lightsaberAttack != null ? lightsaberAttack.ordinal() : -1) + change);
   }
}
