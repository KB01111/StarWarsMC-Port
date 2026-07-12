package che.swgc.client.renderer.entity;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.render.SwgcMobRenderState;
import che.swgc.client.render.SwgcMobRenderer;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Mob;

@ParametersAreNonnullByDefault
public class GlowmaskMobRenderer<T extends Mob, M extends EntityModel<SwgcMobRenderState>> extends SwgcMobRenderer<T, M> {
   private final Identifier texture;

   public GlowmaskMobRenderer(EntityRendererProvider.Context ctx, M model, String texture, float shadowRadius) {
      super(ctx, model, shadowRadius);
      this.texture = SwgcClientUtils.entityTex(texture);
      this.addLayer(
         new EyesLayer<SwgcMobRenderState, M>(this) {
            @Override
            public net.minecraft.client.renderer.rendertype.RenderType renderType() {
               return RenderTypes.eyes(
                  GlowmaskMobRenderer.this.texture.withPath(path -> path.replace(".png", "_glowmask.png"))
               );
            }
         }
      );
   }

   @Override
   public Identifier getTextureLocation(SwgcMobRenderState state) {
      return this.texture;
   }
}
