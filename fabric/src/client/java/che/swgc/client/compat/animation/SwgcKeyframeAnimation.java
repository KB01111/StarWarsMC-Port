package che.swgc.client.compat.animation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.AnimationState;
import org.joml.Vector3f;

/** Package-local KeyframeAnimation.bake is not accessible; minimal copy for SWGC animations. */
final class SwgcKeyframeAnimation {
   private final AnimationDefinition definition;
   private final List<Entry> entries;

   private SwgcKeyframeAnimation(AnimationDefinition definition, List<Entry> entries) {
      this.definition = definition;
      this.entries = List.copyOf(entries);
   }

   static SwgcKeyframeAnimation bake(ModelPart root, AnimationDefinition definition) {
      List<Entry> entries = new ArrayList<>();
      Function<String, ModelPart> partLookup = root.createPartLookup();

      for (Map.Entry<String, List<AnimationChannel>> entry : definition.boneAnimations().entrySet()) {
         ModelPart part = partLookup.apply(entry.getKey());
         if (part == null) {
            throw new IllegalArgumentException("Cannot animate " + entry.getKey() + ", which does not exist in model");
         }

         for (AnimationChannel channel : entry.getValue()) {
            entries.add(new Entry(part, channel.target(), channel.keyframes()));
         }
      }

      return new SwgcKeyframeAnimation(definition, entries);
   }

   void applyStatic() {
      this.apply(0L, 1.0F);
   }

   void applyWalk(float animationPos, float animationSpeed, float speedFactor, float scaleFactor) {
      long time = (long)(animationPos * 50.0F * speedFactor);
      float scale = Math.min(animationSpeed * scaleFactor, 1.0F);
      this.apply(time, scale);
   }

   void apply(AnimationState animationState, float currentTime) {
      animationState.ifStarted(state -> this.apply((long)state.getTimeInMillis(currentTime), 1.0F));
   }

   private void apply(long millisSinceStart, float targetScale) {
      float secondsSinceStart = this.getElapsedSeconds(millisSinceStart);
      Vector3f scratchVector = new Vector3f();

      for (Entry entry : this.entries) {
         entry.apply(secondsSinceStart, targetScale, scratchVector);
      }
   }

   private float getElapsedSeconds(long millisSinceStart) {
      float secondsSinceStart = (float)millisSinceStart / 1000.0F;
      return this.definition.looping() ? secondsSinceStart % this.definition.lengthInSeconds() : secondsSinceStart;
   }

   private record Entry(ModelPart part, AnimationChannel.Target target, Keyframe[] keyframes) {
      void apply(float secondsSinceStart, float targetScale, Vector3f scratchVector) {
         int prev = Math.max(0, Mth.binarySearch(0, this.keyframes.length, i -> secondsSinceStart <= this.keyframes[i].timestamp()) - 1);
         int next = Math.min(this.keyframes.length - 1, prev + 1);
         Keyframe previousFrame = this.keyframes[prev];
         Keyframe nextFrame = this.keyframes[next];
         float keyframeTimeDelta = secondsSinceStart - previousFrame.timestamp();
         float lerpAlpha;
         if (next != prev) {
            lerpAlpha = keyframeTimeDelta / (nextFrame.timestamp() - previousFrame.timestamp());
         } else {
            lerpAlpha = 0.0F;
         }

         nextFrame.interpolation().apply(scratchVector, lerpAlpha, this.keyframes, prev, next, targetScale);
         this.target.apply(this.part, scratchVector);
      }
   }
}
