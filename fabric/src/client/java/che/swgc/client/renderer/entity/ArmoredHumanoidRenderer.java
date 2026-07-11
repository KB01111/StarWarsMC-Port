package che.swgc.client.renderer.entity;

import che.swgc.client.model.CommonModelLayers;
import che.swgc.client.render.SwgcMobRenderState;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.ArmorModelSet;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Mob;

@javax.annotation.ParametersAreNonnullByDefault
public class ArmoredHumanoidRenderer<T extends Mob> extends che.swgc.client.render.SwgcMobRenderer<T, HumanoidModel<SwgcMobRenderState>> {
   public ArmoredHumanoidRenderer(EntityRendererProvider.Context ctx) {
      super(ctx, new HumanoidModel<>(ctx.bakeLayer(CommonModelLayers.PLAYER_EMPTY_LOCATION), RenderTypes::entityCutout), 0.5F);
      ArmorModelSet<HumanoidModel<SwgcMobRenderState>> armorModels = ArmorModelSet.bake(
         ModelLayers.PLAYER_ARMOR,
         ctx.getModelSet(),
         part -> new HumanoidModel<>(part, RenderTypes::entityCutout)
      );
      this.addLayer(new HumanoidArmorLayer<>(this, armorModels, ctx.getEquipmentRenderer()));
      this.addLayer(new ItemInHandLayer<>(this));
   }

   protected void scale(T entity, com.mojang.blaze3d.vertex.PoseStack poseStack, float f) {
      poseStack.scale(0.9375F, 0.9375F, 0.9375F);
   }

   @Nullable
   protected net.minecraft.client.renderer.rendertype.RenderType getRenderShape(T entity, boolean bodyVisible, boolean visible, boolean glowing) {
      return null;
   }

   public Identifier getTextureLocation(SwgcMobRenderState state) {
      return Identifier.fromNamespaceAndPath("minecraft", "textures/entity/steve.png");
   }
}
