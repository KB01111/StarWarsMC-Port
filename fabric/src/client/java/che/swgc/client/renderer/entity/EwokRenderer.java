package che.swgc.client.renderer.entity;

import che.swgc.client.model.entity.EwokModel;
import che.swgc.entity.Ewok;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.resources.Identifier;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.MobRenderer;
import che.swgc.client.renderer.entity.layer.SwgcItemInHandLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class EwokRenderer extends che.swgc.client.render.SwgcMobRenderer<Ewok, EwokModel> {
   public EwokRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new EwokModel(ctx.bakeLayer(EwokModel.LAYER_LOCATION)), 0.2F);
      this.addLayer(new SwgcItemInHandLayer<>(this));
   }

   public net.minecraft.resources.Identifier getTextureLocation(che.swgc.client.render.SwgcMobRenderState state) {
      if (!(state.entity instanceof Ewok ewok)) {
         return Identifier.fromNamespaceAndPath("swgc", "textures/entity/ewok/orange.png");
      }

      return Identifier.fromNamespaceAndPath("swgc", "textures/entity/ewok/" + ewok.getVariant().name().toLowerCase(Locale.ROOT) + ".png");   }
}
