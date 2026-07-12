package che.swgc.mixin;

import che.swgc.force.ForcePossessor;
import che.swgc.item.LightsaberItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.sounds.SoundSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity {
   @Inject(method = "swing", at = @At("HEAD"))
   private void swgc$lightsaberSwingSound(InteractionHand hand, CallbackInfo ci) {
      if (hand != InteractionHand.MAIN_HAND) {
         return;
      }

      LivingEntity self = (LivingEntity)(Object)this;
      if (self instanceof ForcePossessor forcePossessor && forcePossessor.isLightsaberAttacking()) {
         return;
      }

      if (LightsaberItem.isActive(self.getMainHandItem())) {
         if (self instanceof ForcePossessor forcePossessor) {
            forcePossessor.swgc$nextBaseAttack();
         }

         self.level()
            .playSound(
               null,
               self.getX(),
               self.getY(),
               self.getZ(),
               LightsaberItem.swingSoundStatic(self.getMainHandItem()),
               SoundSource.PLAYERS,
               0.5F,
               che.swgc.SwgcUtils.soundPitch(self.getRandom())
            );
      }
   }
}
