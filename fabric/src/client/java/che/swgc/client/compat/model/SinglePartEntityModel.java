package che.swgc.client.compat.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.function.Function;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ARGB;

public abstract class SinglePartEntityModel<T> extends Model<T> {
   protected final ModelPart root;

   protected SinglePartEntityModel(ModelPart root) {
      this(root, RenderTypes::entityCutout);
   }

   protected SinglePartEntityModel(ModelPart root, Function<Identifier, RenderType> renderType) {
      super(root, renderType);
      this.root = root;
   }

   public RenderType getLayer(Identifier texture) {
      return this.renderType(texture);
   }

   public void render(PoseStack poseStack, VertexConsumer consumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      int color = ARGB.color((int)(alpha * 255.0F), (int)(red * 255.0F), (int)(green * 255.0F), (int)(blue * 255.0F));
      this.renderToBuffer(poseStack, consumer, packedLight, packedOverlay, color);
   }
}
