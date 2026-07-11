package che.swgc.mixin;

import che.swgc.client.SwgcHooksClient;
import net.minecraft.world.entity.LivingEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({net.minecraft.client.renderer.entity.LivingEntityRenderer.class})
public abstract class FabricMixinLivingEntityRenderer<T extends net.minecraft.world.entity.LivingEntity, M extends net.minecraft.client.model.EntityModel<T>> {
   public FabricMixinLivingEntityRenderer() {
   }

   @Shadow
   public abstract M getModel();

   @Inject(
      method = {"render(Lnet/minecraft/world/entity/LivingEntity;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/vertex/PoseStack;pushPose()V",
         shift = Shift.AFTER
      )}
   )
   public void translateToRideable(T entity, float entityYaw, float partialTicks, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource buffer, int packedLight, CallbackInfo ci) {
      SwgcHooksClient.preRenderLiving(this.getModel(), entity, poseStack, partialTicks);
   }
}
