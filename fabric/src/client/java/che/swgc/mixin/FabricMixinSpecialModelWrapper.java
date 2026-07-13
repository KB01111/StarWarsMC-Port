package che.swgc.mixin;

import che.swgc.client.renderer.item.SwgcItemRenderContext;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.client.renderer.item.SpecialModelWrapper;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SpecialModelWrapper.class)
public abstract class FabricMixinSpecialModelWrapper {
   @Inject(method = "update", at = @At("HEAD"))
   private void swgc$setDisplayContext(
      ItemStackRenderState output,
      ItemStack item,
      net.minecraft.client.renderer.item.ItemModelResolver resolver,
      ItemDisplayContext displayContext,
      net.minecraft.client.multiplayer.ClientLevel level,
      net.minecraft.world.entity.ItemOwner owner,
      int seed,
      CallbackInfo ci
   ) {
      SwgcItemRenderContext.set(displayContext);
   }

   @Inject(method = "update", at = @At("RETURN"))
   private void swgc$clearDisplayContext(
      ItemStackRenderState output,
      ItemStack item,
      net.minecraft.client.renderer.item.ItemModelResolver resolver,
      ItemDisplayContext displayContext,
      net.minecraft.client.multiplayer.ClientLevel level,
      net.minecraft.world.entity.ItemOwner owner,
      int seed,
      CallbackInfo ci
   ) {
      SwgcItemRenderContext.clear();
   }
}
