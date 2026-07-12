package che.swgc.mixin;

import che.swgc.client.model.entity.StarWarsWeaponWielderModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerModel.class)
public class MixinPlayerModel implements StarWarsWeaponWielderModel.Wrapper {
   @Unique
   private final StarWarsWeaponWielderModel swgc$starWarsWeaponWielderModel = new StarWarsWeaponWielderModel();
   @Unique
   private net.minecraft.world.entity.HumanoidArm swgc$scaleOffhand;
   @Unique
   private boolean swgc$overridden;

   @Override
   public boolean swgc$areAnimationsOverridden() {
      return this.swgc$overridden;
   }

   @Inject(method = "setupAnim", at = @At("HEAD"), cancellable = true)
   private void swgc$preAnim(AvatarRenderState state, CallbackInfo ci) {
      LivingEntity entity = this.swgc$resolveEntity(state);
      if (entity == null) {
         return;
      }

      if (this.swgc$starWarsWeaponWielderModel.shouldOverride(entity)) {
         this.swgc$overridden = true;
         che.swgc.client.render.SwgcMobRenderState weaponState = new che.swgc.client.render.SwgcMobRenderState();
         weaponState.entity = entity;
         weaponState.walkAnimationPos = state.walkAnimationPos;
         weaponState.walkAnimationSpeed = state.walkAnimationSpeed;
         weaponState.ageInTicks = state.ageInTicks;
         weaponState.yRot = state.yRot;
         weaponState.xRot = state.xRot;
         this.swgc$starWarsWeaponWielderModel.setupAnim(weaponState);
         ci.cancel();
      } else {
         this.swgc$overridden = false;
      }
   }

   @Unique
   private LivingEntity swgc$resolveEntity(AvatarRenderState state) {
      Minecraft minecraft = Minecraft.getInstance();
      if (minecraft.level == null) {
         return null;
      }

      if (minecraft.player != null && minecraft.player.getId() == state.id) {
         return minecraft.player;
      }

      var entity = minecraft.level.getEntity(state.id);
      return entity instanceof LivingEntity living ? living : null;
   }
}
