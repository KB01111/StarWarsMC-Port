package che.swgc.client.renderer.entity;

import che.swgc.client.SwgcClientUtils;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.Mob;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.layers.FeatureRendererContext;
import net.minecraft.client.renderer.entity.layers.EyesFeatureRenderer;
import net.minecraft.client.model.EntityModel;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class GlowmaskMobRenderer<T extends net.minecraft.world.entity.Mob, M extends net.minecraft.client.model.EntityModel<T>> extends che.swgc.client.render.SwgcMobRenderer<T, M> {
   private final net.minecraft.resources.Identifier texture;

   public GlowmaskMobRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx, M model, String texture, float shadowRadius) {
      super(ctx, model, shadowRadius);
      this.texture = SwgcClientUtils.entityTex(texture);
      this.addFeature(
         new net.minecraft.client.renderer.entity.layers.EyesFeatureRenderer<T, M>(this) {
            private final net.minecraft.client.renderer.rendertype.RenderType renderType = net.minecraft.client.renderer.rendertype.RenderType.getEyes(
               GlowmaskMobRenderer.this.texture.withPath(path -> path.replace(".png", "_glowmask.png"))
            );

            public net.minecraft.client.renderer.rendertype.RenderType getEyesTexture() {
               return this.renderType;
            }
         }
      );
   }

   public net.minecraft.resources.Identifier textureLocation(T entity) {
      return this.texture;
   }
}
