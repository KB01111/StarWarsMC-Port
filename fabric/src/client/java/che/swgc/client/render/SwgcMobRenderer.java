package che.swgc.client.render;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Mob;

public abstract class SwgcMobRenderer<T extends Mob, M extends EntityModel<SwgcMobRenderState>> extends MobRenderer<T, SwgcMobRenderState, M> {
   protected SwgcMobRenderer(EntityRendererProvider.Context context, M model, float shadowRadius) {
      super(context, model, shadowRadius);
   }

   @Override
   public SwgcMobRenderState createRenderState() {
      return new SwgcMobRenderState();
   }

   @Override
   public void extractRenderState(T entity, SwgcMobRenderState state, float partialTick) {
      super.extractRenderState(entity, state, partialTick);
      state.entity = entity;
   }

   @Override
   public abstract Identifier getTextureLocation(SwgcMobRenderState state);
}
