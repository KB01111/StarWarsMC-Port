package che.swgc.client.renderer.entity.layer;

import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.layers.FeatureRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;

public class VehicleGlassLayer<T extends net.minecraft.world.entity.LivingEntity, M extends net.minecraft.client.model.EntityModel<T>> extends net.minecraft.client.renderer.entity.layers.FeatureRenderer<T, M> {
   private final net.minecraft.client.model.geom.ModelPart model;

   public VehicleGlassLayer(net.minecraft.client.renderer.entity.LivingEntityRenderer<T, M> renderer, net.minecraft.client.model.geom.ModelPart model) {
      super(renderer);
      this.model = model;
   }

   public void render(
      com.mojang.blaze3d.vertex.PoseStack poseStack,
      che.swgc.client.compat.render.MultiBufferSource src,
      int packedLight,
      T entity,
      float limbSwing,
      float limbSwingAmount,
      float partialTick,
      float ageInTicks,
      float netHeadYaw,
      float headPitch
   ) {
      net.minecraft.client.player.LocalPlayer player = net.minecraft.client.Minecraft.getInstance().player;
      if (player != null ? !entity.isInvisibleTo(net.minecraft.client.Minecraft.getInstance().player) : !entity.isInvisible()) {
         this.model
            .render(poseStack, src.getBuffer(net.minecraft.client.renderer.rendertype.RenderType.getEntityCutoutNoCull(this.getTexture(entity))), packedLight, net.minecraft.client.renderer.entity.LivingEntityRenderer.getOverlay(entity, 0.0F));
      }
   }
}
