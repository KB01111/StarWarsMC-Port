package che.swgc.client.sound;

import che.swgc.entity.StarFighter;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.sounds.SoundEvent;

public class StarFighterEngineSoundInstance extends AbstractTickableSoundInstance {
   private final StarFighter entity;

   public StarFighterEngineSoundInstance(StarFighter entity, SoundEvent sound) {
      super(sound, entity.getSoundSource(), entity.getRandom());
      this.entity = entity;
      this.looping = true;
      entity.engineHeard = true;
   }

   @Override
   public void tick() {
      if (!this.entity.isRemoved() && this.entity.isNoGravity()) {
         this.x = this.entity.getX();
         this.y = this.entity.getY();
         this.z = this.entity.getZ();
         this.volume = 0.5F + this.entity.getSpeed();
         this.pitch = 0.3F + this.entity.getSpeed() * 0.3F;
      } else {
         this.stop();
         this.entity.engineHeard = false;
      }
   }
}
