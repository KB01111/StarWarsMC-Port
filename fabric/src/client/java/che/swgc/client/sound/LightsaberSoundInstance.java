package che.swgc.client.sound;

import che.swgc.item.LightsaberItem;
import java.util.HashSet;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;

public class LightsaberSoundInstance extends AbstractTickableSoundInstance {
   private static final HashSet<LivingEntity> HEARD = new HashSet<>();
   private final LivingEntity entity;

   public LightsaberSoundInstance(LivingEntity entity, SoundEvent sound) {
      super(sound, entity.getSoundSource(), entity.getRandom());
      this.entity = entity;
      this.looping = true;
      HEARD.add(entity);
   }

   @Override
   public void tick() {
      if (!this.entity.isRemoved()
         && (LightsaberItem.isActive(this.entity.getMainHandItem()) || LightsaberItem.isActive(this.entity.getOffhandItem()))) {
         this.x = this.entity.getX();
         this.y = this.entity.getY();
         this.z = this.entity.getZ();
         this.volume = 0.25F
            + (float)(this.entity instanceof RemotePlayer
                     ? this.entity.position().subtract(this.entity.xOld, this.entity.yOld, this.entity.zOld)
                     : this.entity.getDeltaMovement())
                  .length()
               * 0.25F;
      } else {
         this.stop();
         HEARD.remove(this.entity);
      }
   }

   public static boolean isHeard(LivingEntity entity) {
      return HEARD.contains(entity);
   }
}
