package che.swgc.client.compat.animation;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.Keyframe;

public final class Transformation {
   private final AnimationChannel channel;

   public Transformation(Targets target, Keyframe[] keyframes) {
      this.channel = new AnimationChannel(target.toTarget(), keyframes);
   }

   public AnimationChannel toChannel() {
      return this.channel;
   }

   public static final class Targets {
      public static final Target ROTATE = new Target(AnimationChannel.Targets.ROTATION);
      public static final Target TRANSLATE = new Target(AnimationChannel.Targets.POSITION);
      public static final Target SCALE = new Target(AnimationChannel.Targets.SCALE);
   }

   public record Target(AnimationChannel.Target target) {
      public AnimationChannel.Target toTarget() {
         return this.target;
      }
   }

   public static final class Interpolations {
      public static final AnimationChannel.Interpolation LINEAR = AnimationChannel.Interpolations.LINEAR;
      public static final AnimationChannel.Interpolation CUBIC = AnimationChannel.Interpolations.CATMULLROM;
   }
}
