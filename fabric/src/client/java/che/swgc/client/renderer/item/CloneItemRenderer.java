package che.swgc.client.renderer.item;

import che.swgc.SwgcItemData;

import che.swgc.client.model.armor.CloneArmorModel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
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
   public void render(net.minecraft.world.item.ItemStack stack, net.minecraft.world.item.ItemDisplayContext ctx, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource src, float partialTick, int packedLight, int packedOverlay) {
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      poseStack.translate(-0.5F, 0.0F, 0.5F);
      String armor = SwgcItemData.getOrCreate(stack).contains("helmet", 10)
         ? SwgcItemData.getOrCreate(stack).getCompound("helmet").getString("id").replace("_helmet", "")
         : "swgc:clone_phase_2";
      (armor.equals("swgc:clone_104th_Battalion") ? this.battalion104 : this.head)
         .render(
            poseStack,
            src.getBuffer(net.minecraft.client.renderer.rendertype.RenderTypes.armorCutoutNoCull(new net.minecraft.resources.Identifier(armor).withPath(path -> "textures/models/armor/" + path + "_layer_1.png"))),
            packedLight,
            packedOverlay
         );
   }
}
