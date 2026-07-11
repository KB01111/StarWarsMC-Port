package che.swgc.client.renderer.entity.layer;

import che.swgc.client.model.entity.DroidekaModel;
import che.swgc.entity.Droideka;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.layers.FeatureRendererContext;
import net.minecraft.client.renderer.entity.layers.FeatureRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.renderer.OverlayTexture;
import net.minecraft.client.model.geom.ModelPart.Cuboid;

public class DroidekaForceFieldLayer extends net.minecraft.client.renderer.entity.layers.FeatureRenderer<Droideka, DroidekaModel<Droideka>> {
   private static final net.minecraft.resources.Identifier TEXTURE = Identifier.fromNamespaceAndPath("swgc", "textures/entity/droideka/force_field.png");
   private static final net.minecraft.client.model.geom.ModelPart.Cuboid CUBE = new net.minecraft.client.model.geom.ModelPart.Cuboid(
      0, 0, -8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 7.0F, 7.0F, 7.0F, false, 64.0F, 32.0F, Set.of(net.minecraft.core.Direction.values())
   );

   public DroidekaForceFieldLayer(net.minecraft.client.renderer.entity.layers.FeatureRendererContext<Droideka, DroidekaModel<Droideka>> renderer) {
      super(renderer);
   }

   public void render(
      com.mojang.blaze3d.vertex.PoseStack poseStack,
      che.swgc.client.compat.render.MultiBufferSource src,
      int packedLight,
      Droideka entity,
      float limbSwing,
      float limbSwingAmount,
      float partialTick,
      float ageInTicks,
      float netHeadYaw,
      float headPitch
   ) {
      float scale = entity.getShieldAnim(partialTick);
      if (!(scale <= 0.0F)) {
         poseStack.push();
         poseStack.translate(0.0F, 0.7F, 0.0F);
         float var13;
         poseStack.scale(var13 = scale * scale, var13, var13);
         float health = Math.min(Math.abs(entity.getForceField()) / 16.0F, 1.0F) * var13;
         CUBE.renderCuboid(
            poseStack.peek(), src.getBuffer(net.minecraft.client.renderer.rendertype.RenderType.getEyes(TEXTURE)), 16711680, net.minecraft.client.renderer.OverlayTexture.DEFAULT_UV, health, health, health, 1.0F
         );
         poseStack.pop();
      }
   }
}
