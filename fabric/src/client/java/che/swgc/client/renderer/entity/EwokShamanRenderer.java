package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.EwokShamanModel;
import che.swgc.entity.EwokShaman;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.MobRenderer;
import che.swgc.client.renderer.entity.layer.SwgcItemInHandLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class EwokShamanRenderer extends che.swgc.client.render.SwgcMobRenderer<EwokShaman, EwokShamanModel> {
   public static final net.minecraft.resources.Identifier TEXTURE = Identifier.fromNamespaceAndPath("swgc", "textures/entity/ewok/shaman.png");

   public EwokShamanRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new EwokShamanModel(ctx.bakeLayer(EwokShamanModel.LAYER_LOCATION)), 0.35F);
      this.addLayer(new SwgcItemInHandLayer<>(this));
   }

   @Override
   protected void scale(che.swgc.client.render.SwgcMobRenderState state, PoseStack poseStack) {
      super.scale(state, poseStack);
      poseStack.scale(1.4F, 1.4F, 1.4F);
   }

   public net.minecraft.resources.Identifier getTextureLocation(che.swgc.client.render.SwgcMobRenderState state) {
      return TEXTURE;
   }
}
