package che.swgc.client.compat.render;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.rendertype.RenderType;

@FunctionalInterface
public interface MultiBufferSource {
   VertexConsumer getBuffer(RenderType renderType);
}
