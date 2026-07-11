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
      if (!this.mob.isRemoved() && this.mob.isNoGravity()) {
         this.x = this.mob.getX();
         this.y = this.mob.getY();
         this.z = this.mob.getZ();
         this.volume = 0.5F + this.mob.getSpeed();
         this.pitch = 0.3F + this.mob.getSpeed() * 0.3F;
      } else {
         this.stop();
         this.mob.engineHeard = false;
      }
   }
}
