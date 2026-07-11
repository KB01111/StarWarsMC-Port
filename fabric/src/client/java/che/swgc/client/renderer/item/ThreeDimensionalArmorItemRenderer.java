package che.swgc.client.renderer.item;

import che.swgc.item.CustomArmorItem;
import java.util.Set;

import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.equipment.ArmorType;

public class ThreeDimensionalArmorItemRenderer implements ItemRenderer {
   private final net.minecraft.client.model.geom.ModelPart[] parts;

   public ThreeDimensionalArmorItemRenderer(net.minecraft.client.model.geom.EntityModelSet entityModels, CustomArmorItem item) {
      net.minecraft.client.model.geom.ModelPart root = entityModels.bakeLayer(new net.minecraft.client.model.geom.ModelLayerLocation(item.layerId, item.layerName));

      this.parts = (switch (item.getType()) {
         case HELMET -> Set.of("head", "hat");
         case CHESTPLATE -> Set.of("body", "right_arm", "left_arm");
         default -> Set.of("right_leg", "left_leg");
      }).stream().map(root::getChild).toArray(net.minecraft.client.model.geom.ModelPart[]::new);
   }

   @Override
   public void render(net.minecraft.world.item.ItemStack stack, net.minecraft.world.item.ItemDisplayContext ctx, com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.SubmitNodeCollector src, float partialTick, int packedLight, int packedOverlay) {
      che.swgc.item.CustomArmorItem item = (che.swgc.item.CustomArmorItem)stack.getItem();
      net.minecraft.client.renderer.rendertype.RenderType renderType = renderType(item);
      poseStack.pushPose();
      poseStack.scale(-1.0F, -1.0F, 1.0F);

      poseStack.translate(-0.5F, switch (item.getType()) {
         case HELMET -> -0.001F;
         case CHESTPLATE -> -0.751F;
         case BOOTS -> -1.501F;
         case LEGGINGS -> -1.3135F;
         default -> throw new IncompatibleClassChangeError();
      }, 0.5F);

      for (net.minecraft.client.model.geom.ModelPart part : this.parts) {
         src.submitModelPart(part, poseStack, renderType, packedLight, packedOverlay, null);
      }

      poseStack.popPose();
   }

   public static net.minecraft.client.renderer.rendertype.RenderType renderType(che.swgc.item.CustomArmorItem item) {
      return RenderTypes.armorCutoutNoCull(
         item.layerId.withPath(path -> "textures/models/armor/" + path + "_layer_" + (item.getType() == ArmorType.LEGGINGS ? "2" : "1") + ".png")
      );
   }
}
