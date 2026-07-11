package che.swgc.client.animation;

import che.swgc.client.compat.animation.Transformation;
import che.swgc.client.compat.animation.Animation;
import net.minecraft.client.animation.Keyframe;
import che.swgc.client.compat.animation.AnimationHelper;
import che.swgc.client.compat.animation.Transformation.Interpolations;
import che.swgc.client.compat.animation.Transformation.Targets;
import che.swgc.client.compat.animation.Animation.Builder;

public class B2Animation {
   public static final che.swgc.client.compat.animation.Animation IDLE = che.swgc.client.compat.animation.Animation.Builder.create(10.0F)
      .looping()
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(9.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(10.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(7.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(7.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(8.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(8.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(9.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(9.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(10.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_forearm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(7.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(7.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-135.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(8.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-90.0F, -45.0F, -90.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(8.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-90.0F, -45.0F, -90.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(9.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-135.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(9.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(10.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(9.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(10.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_forearm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(9.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(10.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "Corpus1",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 6.25F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(9.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(10.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation WALK = che.swgc.client.compat.animation.Animation.Builder.create(1.0F)
      .looping()
      .addBoneAnimation(
         "left_leg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-46.25F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(11.25F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_forearm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_leg2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(87.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_foot",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(1.25F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_forearm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_leg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(11.25F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-46.25F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_leg2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(87.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_foot",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(1.25F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation RUN = che.swgc.client.compat.animation.Animation.Builder.create(1.0F)
      .looping()
      .addBoneAnimation(
         "left_leg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-97.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.9167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-97.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "right_forearm",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-122.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "right_palm",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "left_leg2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(77.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(32.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(87.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(95.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(95.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.9167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(95.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(77.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_foot",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(40.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(40.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(40.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.9167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "left_forearm",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-37.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "Corpus1",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -4.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -3.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -4.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -3.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_leg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-97.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.9167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_leg2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(87.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(95.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(95.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(95.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(77.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.9167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(32.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_foot",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(32.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.9167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation JUMP = che.swgc.client.compat.animation.Animation.Builder.create(1.5F)
      .looping()
      .addBoneAnimation(
         "left_leg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-85.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-95.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_forearm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-125.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-112.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-129.29F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_leg2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(87.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(130.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(97.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_foot",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-95.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "left_forearm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-125.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-112.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-129.29F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -4.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 11.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_leg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-82.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_leg2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(87.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(127.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(97.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "right_foot",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-31.67F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.7083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation FIRE = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .looping()
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-0.2468F, -9.6157F, 1.9386F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-87.9924F, -4.9969F, -0.1749F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-87.9692F, -9.9938F, -0.3526F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-87.9924F, -4.9969F, -0.1749F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_forearm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -90.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -90.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_leg2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_arm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "left_forearm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "Corpus1",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "right_leg2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .build();

   public B2Animation() {
   }
}
