package che.swgc.mixin;

import che.swgc.client.SwgcHooksClient;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntityRenderer.class)
public abstract class FabricMixinLivingEntityRenderer<T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>> {
   @Shadow
   public abstract M getModel();

   @Inject(method = "submit", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;pushPose()V", shift = At.Shift.AFTER))
   private void swgc$translateToRideable(S state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, net.minecraft.client.renderer.state.level.CameraRenderState camera, CallbackInfo ci) {
      LivingEntity entity = resolveLivingEntity(state);
      if (entity != null) {
         SwgcHooksClient.preRenderLiving(this.getModel(), entity, poseStack, state.ageInTicks % 1.0F);
      }
   }

   private static LivingEntity resolveLivingEntity(LivingEntityRenderState state) {
      if (state instanceof che.swgc.client.render.SwgcMobRenderState swgcState && swgcState.entity instanceof LivingEntity living) {
         return living;
      }

      if (!(state instanceof AvatarRenderState avatarState)) {
         return null;
      }

      Minecraft minecraft = Minecraft.getInstance();
      if (minecraft.level == null) {
         return null;
      }

      if (minecraft.player != null && minecraft.player.getId() == avatarState.id) {
         return minecraft.player;
      }

      net.minecraft.world.entity.Entity entity = minecraft.level.getEntity(avatarState.id);
      return entity instanceof LivingEntity living ? living : null;
   }
}
