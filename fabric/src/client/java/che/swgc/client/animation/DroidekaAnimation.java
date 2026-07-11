package che.swgc.client.animation;

import che.swgc.client.compat.animation.Transformation;
import che.swgc.client.compat.animation.Animation;
import net.minecraft.client.animation.Keyframe;
import che.swgc.client.compat.animation.AnimationHelper;
import che.swgc.client.compat.animation.Transformation.Interpolations;
import che.swgc.client.compat.animation.Transformation.Targets;
import che.swgc.client.compat.animation.Animation.Builder;

public class DroidekaAnimation {
   public static final che.swgc.client.compat.animation.Animation ROLL_ON = che.swgc.client.compat.animation.Animation.Builder.create(1.0F)
      .addBoneAnimation(
         "bone",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "b",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone3",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(107.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -62.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone2",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "bone4",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 67.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone8",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone9",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-150.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-180.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(242.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone9",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -4.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 7.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 14.4F, 3.6F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.03F, 1.82F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 1.03F, 0.82F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "leg1",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "leg1",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone10",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.4233F, -0.9212F, 1.0603F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "leg2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(165.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone11",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.4233F, -0.9212F, 1.0603F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-115.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "leg3",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(162.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone12",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.4233F, -0.9212F, 1.0603F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-105.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 62.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone5",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "bone6",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -67.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone7",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "x",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "x2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation ROLL_OFF = che.swgc.client.compat.animation.Animation.Builder.create(1.0417F)
      .addBoneAnimation(
         "bone",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "b",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "bone3",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(107.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -62.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -62.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone4",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 67.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 67.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -17.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone8",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone9",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(1200.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(1385.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(1440.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone9",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.03F, 1.82F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 3.4F, 2.6F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "leg1",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(97.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "leg1",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone10",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "leg2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(165.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone11",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-115.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "leg3",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(162.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone12",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-105.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 62.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 62.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone6",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -67.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -67.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone7",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.7917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "x",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "x2",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation FIRE_R = che.swgc.client.compat.animation.Animation.Builder.create(0.75F)
      .looping()
      .addBoneAnimation(
         "bone3",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -10.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -10.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -10.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone4",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone8",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 11.88F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone5",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 10.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-14.1048F, -12.0663F, 12.5142F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(4.37F, -14.79F, 8.35F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 10.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone6",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-37.1639F, 11.4808F, -7.617F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-36.0425F, -3.6789F, 2.3443F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone7",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(50.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation FIRE_L = che.swgc.client.compat.animation.Animation.Builder.create(0.7917F)
      .looping()
      .addBoneAnimation(
         "bone3",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -11.88F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-14.1048F, 12.0663F, -12.5142F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(4.37F, 14.79F, -8.35F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -10.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone4",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-37.1639F, -11.4808F, 7.617F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-36.0425F, 3.6789F, -2.3443F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone8",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(50.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -8.75F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 4.17F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone5",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(4.37F, -14.79F, 8.35F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 10.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(4.37F, -14.79F, 8.35F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone6",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-36.0425F, -3.6789F, 2.3443F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-36.0425F, -3.6789F, 2.3443F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone7",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .build();

   public DroidekaAnimation() {
   }
}
