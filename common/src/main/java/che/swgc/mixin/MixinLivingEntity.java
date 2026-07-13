package che.swgc.mixin;

import che.swgc.force.ForcePossessor;
import che.swgc.item.LightsaberItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({net.minecraft.world.entity.LivingEntity.class})
public abstract class MixinLivingEntity extends net.minecraft.world.entity.Entity {
   @Shadow
   public boolean swinging;
   @Shadow
   public int swingTime;

   private MixinLivingEntity(net.minecraft.world.entity.EntityType<?> $$0, net.minecraft.world.level.Level $$1) {
      super($$0, $$1);
   }

   @Shadow
   public abstract net.minecraft.world.item.ItemStack getMainHandItem();

   @Inject(
      method = {"updateSwingTime"},
      at = {@At("TAIL")}
   )
   public void updateSwingTime(CallbackInfo ci) {
      if (this.swinging
         && this.swingTime == 0
         && (!(this instanceof ForcePossessor forcePossessor) || !forcePossessor.isLightsaberAttacking())
         && LightsaberItem.isActive(this.getMainHandItem())) {
         if (this instanceof ForcePossessor forcePossessorx) {
            forcePossessorx.swgc$nextBaseAttack();
         }

         this.level()
            .playSound(
               null,
               this.getX(),
               this.getY(),
               this.getZ(),
               LightsaberItem.swingSoundStatic(this.getMainHandItem()),
               net.minecraft.sounds.SoundSource.PLAYERS,
               0.5F,
               che.swgc.SwgcUtils.soundPitch(this.random)
            );
      }
   }
}
