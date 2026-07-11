package che.swgc.client.sound;

import che.swgc.item.LightsaberItem;
import java.util.HashSet;
import net.minecraft.client.sounds.MovingSoundInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.client.player.OtherLocalPlayer;

public class LightsaberSoundInstance extends net.minecraft.client.sounds.MovingSoundInstance {
   private static final HashSet<net.minecraft.world.entity.LivingEntity> HEARD = new HashSet<>();
   private final net.minecraft.world.entity.LivingEntity entity;

   public LightsaberSoundInstance(net.minecraft.world.entity.LivingEntity entity, net.minecraft.sounds.SoundEvent sound) {
      super(sound, entity.getSoundSource(), entity.getRandom());
      this.entity = entity;
      this.repeat = true;
      HEARD.add(entity);
   }

   public void tick() {
      if (!this.mob.isRemoved() && (LightsaberItem.isActive(this.mob.getMainHandItem()) || LightsaberItem.isActive(this.mob.getOffhandItem()))) {
         this.x = this.mob.getX();
         this.y = this.mob.getY();
         this.z = this.mob.getZ();
         this.volume = 0.25F
            + (float)(this.entity instanceof net.minecraft.client.player.OtherLocalPlayer
                     ? this.mob.position().subtract(this.mob.lastRenderX, this.mob.lastRenderY, this.mob.lastRenderZ)
                     : this.mob.getDeltaMovement())
                  .length()
               * 0.25F;
      } else {
         this.setDone();
         HEARD.remove(this.entity);
      }
   }

   public static boolean isHeard(net.minecraft.world.entity.LivingEntity entity) {
      return HEARD.contains(entity);
   }
}
