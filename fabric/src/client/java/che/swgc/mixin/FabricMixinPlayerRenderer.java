package che.swgc.mixin;

import che.swgc.client.renderer.entity.layer.UNLIMITEDPOWERRenderer;
import net.minecraft.client.renderer.entity.PlayerEntityRenderer;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.player.AbstractLocalPlayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({net.minecraft.client.renderer.entity.PlayerEntityRenderer.class})
public abstract class FabricMixinPlayerRenderer extends net.minecraft.client.renderer.entity.LivingEntityRenderer<net.minecraft.client.player.AbstractLocalPlayer, net.minecraft.client.model.player.PlayerModel<net.minecraft.client.player.AbstractLocalPlayer>> {
   private FabricMixinPlayerRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context context, net.minecraft.client.model.player.PlayerModel<net.minecraft.client.player.AbstractLocalPlayer> entityModel, float f) {
      super(context, entityModel, f);
   }

   @Inject(
      method = {"<init>"},
      at = {@At("TAIL")}
   )
   public void init(net.minecraft.client.renderer.entity.EntityRendererProvider.Context context, boolean bl, CallbackInfo ci) {
      this.addFeature(new UNLIMITEDPOWERRenderer(this, context.getRenderDispatcher()));
   }
}
