package che.swgc;

import che.swgc.force.ForcePossessor;
import che.swgc.force.ForceSecondaryAction;
import che.swgc.item.LightsaberItem;
import che.swgc.network.ClientboundForceSyncPacket;
import che.swgc.reg.SwgcEntities;
import che.swgc.reg.SwgcGameRules;
import che.swgc.reg.SwgcNetworking;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.DamageTypeTags;

public class SwgcHooks {
   public SwgcHooks() {
   }

   public static void forcePossessorTick(net.minecraft.world.entity.player.Player player) {
      ForcePossessor forcePossessor = (ForcePossessor)player;
      int ticks = forcePossessor.swgc$getForceTicks();
      if (ticks >= 0) {
         forcePossessor.swgc$setForceTicks(++ticks);
         if (forcePossessor.isUsingForce()) {
            Objects.requireNonNull(forcePossessor.swgc$getForceSecondaryAction()).tick(player);
         } else if (!player.level().isClientSide()) {
            Objects.requireNonNull(forcePossessor.swgc$getLightsaberAttack()).tick(player, ticks);
         }
      }
   }

   public static boolean lightsaberBlock(net.minecraft.world.entity.player.Player player, net.minecraft.world.damagesource.DamageSource source) {
      if (!source.is(DamageTypeTags.BYPASSES_SHIELD)
         && ((ForcePossessor)player).isUsingForce()
         && ((ForcePossessor)player).swgc$getForceSecondaryAction() == ForceSecondaryAction.BLOCK) {
         net.minecraft.world.phys.Vec3 pos = source.getSourcePosition();
         if (pos != null) {
            Vec3 flat = pos.subtract(player.position()).normalize();
            flat = new Vec3(flat.x, 0.0, flat.z);
            if (flat.lengthSqr() > 0.0 && flat.normalize().dot(player.getViewVector(1.0F)) < 0.0) {
            player.level()
               .playSound(
                  null,
                  player.getX(),
                  player.getY(),
                  player.getZ(),
                  LightsaberItem.clashSoundStatic(player.getMainHandItem()),
                  SoundSource.PLAYERS,
                  1.0F,
                  0.8F + player.getRandom().nextFloat() * 0.4F
               );
            return true;
            }
         }
      }

      return false;
   }

   public static void kill(@Nullable net.minecraft.world.entity.Entity entity, net.minecraft.world.entity.Entity killed) {
      if (((net.minecraft.server.level.ServerLevel)killed.level()).getGameRules().get(SwgcGameRules.RULE_FORCEOBTAINMENT)
         && entity instanceof net.minecraft.world.entity.player.Player player
         && killed.getType().builtInRegistryHolder().is(SwgcEntities.INNOCENT)
         && player.getRandom().nextFloat() < 0.2F) {
         ((ForcePossessor)player).addForceDarkSide(1);
         SwgcNetworking.sendToClient(player, new ClientboundForceSyncPacket(player));
      }
   }

   public static float playerFall(net.minecraft.world.entity.player.Player player, float distance) {
      int skill = ((ForcePossessor)player).swgc$getForceSkill();
      return skill > 15 ? distance * 15.0F / (float)skill : distance;
   }

   public static void clonePlayers(net.minecraft.world.entity.player.Player player, net.minecraft.world.entity.player.Player originalPlayer) {
      ((ForcePossessor)player).swgc$setForceBrightSide(((ForcePossessor)originalPlayer).swgc$getForceBrightSide());
      ((ForcePossessor)player).swgc$setForceDarkSide(((ForcePossessor)originalPlayer).swgc$getForceDarkSide());
   }

   public static void syncForcePossessor(net.minecraft.world.entity.player.Player player) {
      if (((ForcePossessor)player).possessesForce()) {
         SwgcNetworking.sendToClient(player, new ClientboundForceSyncPacket(player));
      }
   }
}
