package che.swgc.client.render;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.rendertype.RenderTypes;

public abstract class SwgcEntityModel<S extends SwgcMobRenderState> extends EntityModel<S> {
   protected final ModelPart root;

   protected SwgcEntityModel(ModelPart root) {
      super(root);
      this.root = root;
   }

   public ModelPart getPart() {
      return this.root;
   }
}
