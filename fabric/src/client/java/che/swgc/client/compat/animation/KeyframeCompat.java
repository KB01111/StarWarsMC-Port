package che.swgc.client.compat.animation;

import che.swgc.client.compat.animation.AnimationChannel;
import net.minecraft.client.animation.Keyframe;
import org.joml.Vector3f;

public final class KeyframeCompat {
   public static Keyframe create(float timestamp, Vector3f target, AnimationChannel.Interpolation interpolation) {
      return new Keyframe(timestamp, target, interpolation);
   }
}
