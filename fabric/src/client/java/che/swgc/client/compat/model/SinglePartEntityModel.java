package che.swgc.client.compat.model;

import che.swgc.client.compat.animation.Animation;
import che.swgc.client.render.SwgcEntityModel;
import che.swgc.client.render.SwgcMobRenderState;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.AnimationState;

public abstract class SinglePartEntityModel<S extends SwgcMobRenderState> extends SwgcEntityModel<S> {
   public float handSwingProgress;

   protected SinglePartEntityModel(ModelPart root) {
      super(root);
   }

   protected void animateMovement(Animation animation, float limbSwing, float limbSwingAmount, float speed, float scale) {
      animation.applyWalk(this.root, limbSwing, limbSwingAmount, speed, scale);
   }

   protected void updateAnimation(AnimationState state, Animation animation, float ageInTicks) {
      animation.apply(this.root, state, ageInTicks);
   }
}
