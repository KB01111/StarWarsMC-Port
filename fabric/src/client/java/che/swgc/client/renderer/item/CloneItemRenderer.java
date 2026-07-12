package che.swgc.client.renderer.item;

import che.swgc.SwgcItemData;

import che.swgc.client.model.armor.CloneArmorModel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.item.ItemDisplayContext;

public class CloneItemRenderer implements ItemRenderer {
   private final net.minecraft.client.model.geom.ModelPart head;
   private final net.minecraft.client.model.geom.ModelPart battalion104;

   public CloneItemRenderer(net.minecraft.client.model.geom.EntityModelSet models) {
      this.head = models.bakeLayer(CloneArmorModel.OUTER_LAYER_LOCATION).getChild("head");
      this.battalion104 = models.bakeLayer(CloneArmorModel.CLONE_104TH_BATTALION_LOCATION).getChild("head");
   }

   @Override
   public void render(net.minecraft.world.item.ItemStack stack, net.minecraft.world.item.ItemDisplayContext ctx, com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.SubmitNodeCollector src, float partialTick, int packedLight, int packedOverlay) {
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      poseStack.translate(-0.5F, 0.0F, 0.5F);
      String armor = SwgcItemData.getOrCreate(stack).getCompound("helmet")
         .flatMap(tag -> tag.getString("id").map(id -> id.replace("_helmet", "")))
         .orElse("swgc:clone_phase_2");
      net.minecraft.client.model.geom.ModelPart part = armor.equals("swgc:clone_104th_battalion") ? this.battalion104 : this.head;
      src.submitModelPart(
         part,
         poseStack,
         RenderTypes.armorCutoutNoCull(Identifier.parse(armor).withPath(path -> "textures/models/armor/" + path + "_layer_1.png")),
         packedLight,
         packedOverlay,
         null
      );
   }
}
