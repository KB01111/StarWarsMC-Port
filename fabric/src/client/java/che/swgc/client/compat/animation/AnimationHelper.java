package che.swgc.client.compat.animation;

import che.swgc.client.compat.animation.AnimationChannel;
import net.minecraft.client.animation.Keyframe;
import org.joml.Vector3f;

public final class AnimationHelper {
   public static Vector3f createRotationalVector(float x, float y, float z) {
      return new Vector3f((float)Math.toRadians(x), (float)Math.toRadians(y), (float)Math.toRadians(z));
   }

   public static Vector3f createTranslationalVector(float x, float y, float z) {
      return new Vector3f(x / 16.0F, y / 16.0F, z / 16.0F);
   }

   public static Vector3f createScalaringVector(float x, float y, float z) {
      return new Vector3f(x, y, z);
   }

   public static Keyframe keyframe(float timestamp, Vector3f target, AnimationChannel.Interpolation interpolation) {
      return new Keyframe(timestamp, target, interpolation);
   }
}
