package che.swgc.client.renderer.item;

import net.minecraft.world.item.ItemStack;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.world.item.ItemDisplayContext;

public interface ItemRenderer {
   void render(net.minecraft.world.item.ItemStack var1, ItemDisplayContext var2, com.mojang.blaze3d.vertex.PoseStack var3, che.swgc.client.compat.render.MultiBufferSource var4, float var5, int var6, int var7);
}
