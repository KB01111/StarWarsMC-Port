package che.swgc.client.animation;

import che.swgc.client.compat.animation.Transformation;
import che.swgc.client.compat.animation.Animation;
import net.minecraft.client.animation.Keyframe;
import che.swgc.client.compat.animation.AnimationHelper;
import che.swgc.client.compat.animation.Transformation.Interpolations;
import che.swgc.client.compat.animation.Transformation.Targets;
import che.swgc.client.compat.animation.Animation.Builder;

public class FrogSaberAnimation {
   public static final che.swgc.client.compat.animation.Animation IDLE = che.swgc.client.compat.animation.Animation.Builder.create(2.0F)
      .looping()
      .addBoneAnimation(
         "eyes",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.2F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.2F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "left_leg",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "right_leg",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "bone",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 1.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -1.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 1.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.2F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.2F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation WORK = che.swgc.client.compat.animation.Animation.Builder.create(1.0F)
      .looping()
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "eyes",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.6F, 1.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.6F, 1.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.6F, 1.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "eyes",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 1.8F, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 1.8F, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 1.8F, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "tongue",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(105.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(105.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(105.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "tongue",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -9.4F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -9.4F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -9.4F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "croaking_body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(27.5F, 0.0F, -67.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-12.5F, 0.0F, -67.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(27.5F, 0.0F, -67.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 67.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(32.5F, 0.0F, 67.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 67.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_leg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(116.1568F, 29.7621F, 13.7011F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(112.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(116.1568F, 29.7621F, 13.7011F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_leg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_leg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(112.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(115.0313F, -25.2519F, -11.2664F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(112.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_leg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "frog_saber",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.8F, 0.9F, 1.0), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.8F, 0.9F, 1.0), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.8F, 0.9F, 1.0), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .build();

   public FrogSaberAnimation() {
   }
}
