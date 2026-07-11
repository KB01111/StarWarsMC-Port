package che.swgc.mixin;

import che.swgc.entity.StarFighter;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.core.RotationAxis;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({net.minecraft.client.renderer.GameRenderer.class})
public class FabricMixinGameRenderer {
   public FabricMixinGameRenderer() {
   }

   @Inject(
      method = {"renderLevel"},
      at = {@At(
         value = "FIELD",
         target = "Lcom/mojang/math/Axis;XP:Lcom/mojang/math/Axis;"
      )}
   )
   void setRoll(float partialTicks, long finishTimeNano, com.mojang.blaze3d.vertex.PoseStack poseStack, CallbackInfo ci) {
      net.minecraft.world.entity.Entity entity = net.minecraft.client.Minecraft.getInstance().cameraEntity;
      if (entity != null && entity.getVehicle() instanceof StarFighter starFighter) {
         poseStack.multiply(net.minecraft.core.RotationAxis.NEGATIVE_Z.rotationDegrees(starFighter.getZRot(partialTicks)));
      }
   }
}
