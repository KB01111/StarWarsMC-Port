package che.swgc.client.renderer.entity;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.model.entity.AtrtModel;
import che.swgc.entity.Walker;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class AtrtRenderer extends che.swgc.client.render.SwgcMobRenderer<Walker, AtrtModel> implements RideableRenderer<Walker> {
   public static final net.minecraft.resources.Identifier TEXTURE = SwgcClientUtils.entityTex("atrt");

   public AtrtRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new AtrtModel(ctx.bakeLayer(AtrtModel.LAYER_LOCATION)), 0.8F);
   }

   public void translateToSeat(net.minecraft.world.entity.LivingEntity rider, Walker vehicle, com.mojang.blaze3d.vertex.PoseStack poseStack, float partialTick) {
      this.translateToModelSeat((AtrtModel)this.getModel(), vehicle, poseStack, partialTick);
   }

   public net.minecraft.resources.Identifier getTextureLocation(che.swgc.client.render.SwgcMobRenderState state) {
      return TEXTURE;
   }
}
