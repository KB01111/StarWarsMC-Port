package che.swgc.mixin;

import che.swgc.entity.StarFighter;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.GameRenderer;
import com.mojang.math.Axis;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class FabricMixinGameRenderer {
   @Inject(method = "renderLevel", at = @At("HEAD"))
   void setRoll(float partialTicks, long finishTimeNano, PoseStack poseStack, CallbackInfo ci) {
      Entity entity = Minecraft.getInstance().getCameraEntity();
      if (entity != null && entity.getVehicle() instanceof StarFighter starFighter) {
         poseStack.mulPose(Axis.ZN.rotationDegrees(starFighter.getZRot(partialTicks)));
      }
   }
}
