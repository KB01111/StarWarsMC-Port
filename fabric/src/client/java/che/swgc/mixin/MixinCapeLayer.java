package che.swgc.mixin;

import che.swgc.client.model.entity.StarWarsWeaponWielderModel;
import net.minecraft.client.renderer.entity.layers.FeatureRendererContext;
import net.minecraft.client.renderer.entity.layers.FeatureRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.player.AbstractLocalPlayer;
import net.minecraft.client.renderer.entity.layers.CapeFeatureRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({net.minecraft.client.renderer.entity.layers.CapeFeatureRenderer.class})
public abstract class MixinCapeLayer extends net.minecraft.client.renderer.entity.layers.FeatureRenderer<net.minecraft.client.player.AbstractLocalPlayer, net.minecraft.client.model.player.PlayerModel<net.minecraft.client.player.AbstractLocalPlayer>> {
   private MixinCapeLayer(net.minecraft.client.renderer.entity.layers.FeatureRendererContext<net.minecraft.client.player.AbstractLocalPlayer, net.minecraft.client.model.player.PlayerModel<net.minecraft.client.player.AbstractLocalPlayer>> renderer) {
      super(renderer);
   }

   @Inject(
      method = {"render(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/client/player/AbstractClientPlayer;FFFFFF)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/vertex/PoseStack;translate(FFF)V"
      )}
   )
   public void render(
      com.mojang.blaze3d.vertex.PoseStack poseStack,
      che.swgc.client.compat.render.MultiBufferSource buffer,
      int packedLight,
      net.minecraft.client.player.AbstractLocalPlayer livingEntity,
      float limbSwing,
      float limbSwingAmount,
      float partialTicks,
      float ageInTicks,
      float netHeadYaw,
      float headPitch,
      CallbackInfo ci
   ) {
      if (((StarWarsWeaponWielderModel.Wrapper)this.getContextModel()).swgc$areAnimationsOverridden()) {
         ((net.minecraft.client.model.player.PlayerModel)this.getContextModel()).body.rotate(poseStack);
      }
   }
}
