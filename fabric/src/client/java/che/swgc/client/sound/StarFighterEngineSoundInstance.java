package che.swgc.client.sound;

import che.swgc.entity.StarFighter;
import net.minecraft.client.sounds.MovingSoundInstance;
import net.minecraft.sounds.SoundEvent;

public class StarFighterEngineSoundInstance extends net.minecraft.client.sounds.MovingSoundInstance {
   private final StarFighter entity;

   public StarFighterEngineSoundInstance(StarFighter entity, net.minecraft.sounds.SoundEvent sound) {
      super(sound, entity.getSoundSource(), entity.getRandom());
      this.entity = entity;
      this.repeat = true;
      entity.engineHeard = true;
   }

   public void tick() {
      if (!this.mob.isRemoved() && this.mob.isNoGravity()) {
         this.x = this.mob.getX();
         this.y = this.mob.getY();
         this.z = this.mob.getZ();
         this.volume = 0.5F + this.mob.getSpeed();
         this.xRot = 0.3F + this.mob.getSpeed() * 0.3F;
      } else {
         this.setDone();
         this.mob.engineHeard = false;
      }
   }
}
