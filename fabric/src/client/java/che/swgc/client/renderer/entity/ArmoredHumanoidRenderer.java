package che.swgc.client.renderer.entity;

import che.swgc.client.model.CommonModelLayers;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.Mob;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocations;
import net.minecraft.client.model.player.PlayerModel;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.entity.model.ArmorEntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ArmorFeatureRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

@javax.annotation.ParametersAreNonnullByDefault
public class ArmoredHumanoidRenderer<T extends net.minecraft.world.entity.Mob> extends che.swgc.client.render.SwgcMobRenderer<T, net.minecraft.client.model.player.PlayerModel<T>> {
   public ArmoredHumanoidRenderer(net.minecraft.client.renderer.entity.EntityRendererProvider.Context ctx) {
      super(ctx, new net.minecraft.client.model.player.PlayerModel(ctx.getPart(CommonModelLayers.PLAYER_EMPTY_LOCATION), false), 0.5F);
      this.addFeature(
         new net.minecraft.client.renderer.entity.layers.ArmorFeatureRenderer(
            this, new net.minecraft.client.renderer.entity.model.ArmorEntityModel(ctx.getPart(net.minecraft.client.model.geom.ModelLayerLocations.PLAYER_INNER_ARMOR)), new net.minecraft.client.renderer.entity.model.ArmorEntityModel(ctx.getPart(net.minecraft.client.model.geom.ModelLayerLocations.PLAYER_OUTER_ARMOR)), ctx.getModelManager()
         )
      );
      this.addFeature(new net.minecraft.client.renderer.entity.layers.ItemInHandLayer(this, ctx.getHeldItemRenderer()));
   }

   protected void scale(T entity, com.mojang.blaze3d.vertex.PoseStack poseStack, float f) {
      poseStack.scale(0.9375F, 0.9375F, 0.9375F);
   }

   @Nullable
   protected net.minecraft.client.renderer.rendertype.RenderType getRenderShape(T $$0, boolean bodyVisible, boolean visible, boolean glowing) {
      return null;
   }

   public net.minecraft.resources.Identifier textureLocation(T entity) {
      return null;
   }
}
