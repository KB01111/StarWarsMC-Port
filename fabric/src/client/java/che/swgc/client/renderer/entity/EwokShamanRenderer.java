package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.EwokShamanModel;
import che.swgc.entity.EwokShaman;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class EwokShamanRenderer extends che.swgc.client.render.SwgcMobRenderer<EwokShaman, EwokShamanModel<EwokShaman>> {
   public static final net.minecraft.resources.Identifier TEXTURE = Identifier.fromNamespaceAndPath("swgc", "textures/entity/ewok/shaman.png");

   public EwokShamanRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new EwokShamanModel(ctx.getPart(EwokShamanModel.LAYER_LOCATION)), 0.35F);
      this.addFeature(new net.minecraft.client.renderer.entity.layers.ItemInHandLayer(this, ctx.getHeldItemRenderer()));
   }

   protected void scale(EwokShaman ewok, com.mojang.blaze3d.vertex.PoseStack poseStack, float partialTick) {
      super.scale(ewok, poseStack, partialTick);
      poseStack.scale(1.4F, 1.4F, 1.4F);
   }

   public net.minecraft.resources.Identifier textureLocation(EwokShaman ewok) {
      return TEXTURE;
   }
}
