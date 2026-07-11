package che.swgc.client.compat.animation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.AnimationState;

public final class Animation {
   private final AnimationDefinition definition;
   private final float length;

   private Animation(AnimationDefinition definition, float length) {
      this.definition = definition;
      this.length = length;
   }

   public float comp_597() {
      return this.length;
   }

   public AnimationDefinition definition() {
      return this.definition;
   }

   public void applyWalk(ModelPart root, float limbSwing, float limbSwingAmount, float speed, float scale) {
      KeyframeAnimation.bake(root, this.definition).applyWalk(limbSwing, limbSwingAmount, speed, scale);
   }

   public void apply(ModelPart root, AnimationState state, float ageInTicks) {
      KeyframeAnimation.bake(root, this.definition).apply(state, ageInTicks);
   }

   public void applyStatic(ModelPart root) {
      KeyframeAnimation.bake(root, this.definition).applyStatic();
   }

   public static final class Builder {
      private final float length;
      private boolean looping;
      private final Map<String, List<AnimationChannel>> channels = new HashMap<>();

      private Builder(float length) {
         this.length = length;
      }

      public static Builder create(float length) {
         return new Builder(length);
      }

      public Builder looping() {
         this.looping = true;
         return this;
      }

      public Builder addBoneAnimation(String bone, Transformation transformation) {
         this.channels.computeIfAbsent(bone, ignored -> new ArrayList<>()).add(transformation.toChannel());
         return this;
      }

      public Animation build() {
         AnimationDefinition.Builder builder = this.looping ? AnimationDefinition.Builder.withLength(this.length).looping() : AnimationDefinition.Builder.withLength(this.length);
         this.channels.forEach((bone, channelList) -> channelList.forEach(channel -> builder.addAnimation(bone, channel)));
         return new Animation(builder.build(), this.length);
      }
   }
}
