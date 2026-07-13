package che.swgc.mixin;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({net.minecraft.world.entity.player.Player.class})
public abstract class FabricMixinPlayer extends net.minecraft.world.entity.LivingEntity {
   private FabricMixinPlayer(net.minecraft.world.entity.EntityType<? extends net.minecraft.world.entity.LivingEntity> entityType, net.minecraft.world.level.Level level) {
      super(entityType, level);
   }

   @Inject(
      method = {"hurtServer"},
      at = {@At("HEAD")}
   )
   public void hurtServer(
      net.minecraft.server.level.ServerLevel serverLevel,
      net.minecraft.world.damagesource.DamageSource damageSource,
      float f,
      CallbackInfoReturnable<Boolean> cir
   ) {
      che.swgc.SwgcHooks.lightsaberBlock((net.minecraft.world.entity.player.Player)(Object)this, damageSource);
   }

   @ModifyVariable(
      method = {"causeFallDamage"},
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   public double fallDistance(double value) {
      return che.swgc.SwgcHooks.playerFall((net.minecraft.world.entity.player.Player)(Object)this, (float)value);
   }
}
