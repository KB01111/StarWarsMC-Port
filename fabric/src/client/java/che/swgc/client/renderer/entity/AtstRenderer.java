package che.swgc.client.renderer.entity;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.model.entity.AtstModel;
import che.swgc.entity.Walker;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class AtstRenderer extends che.swgc.client.render.SwgcMobRenderer<Walker, AtstModel<Walker>> implements RideableRenderer<Walker> {
   public static final net.minecraft.resources.Identifier TEXTURE = SwgcClientUtils.entityTex("atst");

   public AtstRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new AtstModel(ctx.getPart(AtstModel.LAYER_LOCATION)), 1.2F);
   }

   public void translateToSeat(net.minecraft.world.entity.LivingEntity rider, Walker vehicle, com.mojang.blaze3d.vertex.PoseStack poseStack, float partialTick) {
      this.translateToModelSeat((AtstModel)this.getModel(), vehicle, poseStack, partialTick);
   }

   public net.minecraft.resources.Identifier textureLocation(Walker entity) {
      return TEXTURE;
   }
}
