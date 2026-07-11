package che.swgc.client.renderer.entity;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.model.entity.B1Model;
import che.swgc.entity.B1Droid;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.resources.Identifier;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class B1Renderer extends che.swgc.client.render.SwgcMobRenderer<B1Droid, B1Model<B1Droid>> {
   public static final net.minecraft.resources.Identifier TEXTURE = SwgcClientUtils.entityTex("b1");

   public B1Renderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new B1Model(ctx.getPart(B1Model.LAYER_LOCATION)), 0.15F);
      this.addFeature(new net.minecraft.client.renderer.entity.layers.ItemInHandLayer(this, ctx.getHeldItemRenderer()));
   }

   public net.minecraft.resources.Identifier textureLocation(B1Droid b1Droid) {
      return TEXTURE;
   }
}
