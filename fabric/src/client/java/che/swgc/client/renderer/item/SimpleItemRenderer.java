package che.swgc.client.renderer.item;

import che.swgc.client.model.item.BlasterModel;
import che.swgc.client.model.item.EwokSpearModel;
import che.swgc.client.model.item.EwokStaffModel;
import che.swgc.client.model.item.StaticItemModel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.Identifier;
import net.minecraft.client.model.Model;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.world.item.ItemDisplayContext;

public class SimpleItemRenderer<T extends net.minecraft.client.model.Model> implements ItemRenderer {
   private final T model;
   private final net.minecraft.resources.Identifier texture;

   public SimpleItemRenderer(T model, net.minecraft.resources.Identifier texture) {
      this.model = model;
      if (model instanceof StaticItemModel staticItemModel) {
         staticItemModel.animateItem();
      }

      this.texture = texture;
   }

   @Override
   public void render(net.minecraft.world.item.ItemStack itemStack, net.minecraft.world.item.ItemDisplayContext ctx, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource src, float partialTick, int packedLight, int packedOverlay) {
      poseStack.pushPose();
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      poseStack.translate(-0.5F, -1.501F, 0.5F);
      this.model.render(poseStack, src.getBuffer(this.model.renderType(this.texture)), packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);
      poseStack.popPose();
   }

   public static SimpleItemRenderer<BlasterModel> blaster(net.minecraft.client.model.geom.EntityModelSet models, String modelName) {
      return new SimpleItemRenderer<>(
         new BlasterModel(models.bakeLayer(new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", modelName), "blaster"))),
         Identifier.fromNamespaceAndPath("swgc", "textures/entity/item/blaster/" + modelName + ".png")
      );
   }

   public static SimpleItemRenderer<EwokSpearModel> ewokSpear(net.minecraft.client.model.geom.EntityModelSet models) {
      return new SimpleItemRenderer<>(new EwokSpearModel(models.bakeLayer(EwokSpearModel.LAYER_LOCATION)), Identifier.fromNamespaceAndPath("swgc", "textures/entity/ewok_spear.png"));
   }

   public static SimpleItemRenderer<EwokStaffModel> ewokStaff(net.minecraft.client.model.geom.EntityModelSet models) {
      return new SimpleItemRenderer<>(
         new EwokStaffModel(models.bakeLayer(EwokStaffModel.LAYER_LOCATION)), Identifier.fromNamespaceAndPath("swgc", "textures/entity/item/ewok_staff.png")
      );
   }
}
