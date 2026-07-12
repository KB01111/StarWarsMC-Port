package che.swgc.mixin;

import che.swgc.client.renderer.item.SwgcItemRenderContext;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemStackRenderState.class)
public abstract class FabricMixinItemStackRenderState {
   @Inject(method = "submit", at = @At("HEAD"))
   private void swgc$captureDisplayContext(
      PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int lightCoords, int overlayCoords, int outlineColor, CallbackInfo ci
   ) {
      SwgcItemRenderContext.set(((ItemStackRenderStateAccessor)(Object)this).swgc$getDisplayContext());
   }

   @Inject(method = "submit", at = @At("RETURN"))
   private void swgc$clearDisplayContext(
      PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int lightCoords, int overlayCoords, int outlineColor, CallbackInfo ci
   ) {
      SwgcItemRenderContext.clear();
   }
}
