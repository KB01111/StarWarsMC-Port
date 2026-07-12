package che.swgc.mixin;

import che.swgc.client.model.entity.StarWarsWeaponWielderModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.layers.CapeLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CapeLayer.class)
public class MixinCapeLayer {
   @Inject(method = "submit", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;translate(FFF)V"))
   private void swgc$render(PoseStack poseStack, SubmitNodeCollector buffer, int packedLight, AvatarRenderState state, float yRot, float xRot, CallbackInfo ci) {
      PlayerModel model = ((CapeLayer)(Object)this).getParentModel();
      if (model instanceof StarWarsWeaponWielderModel.Wrapper wrapper && wrapper.swgc$areAnimationsOverridden()) {
         model.body.translateAndRotate(poseStack);
      }
   }
}
