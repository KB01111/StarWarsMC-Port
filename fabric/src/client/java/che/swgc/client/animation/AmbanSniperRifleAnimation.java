package che.swgc.client.animation;

import che.swgc.client.compat.animation.Transformation;
import che.swgc.client.compat.animation.Animation;
import net.minecraft.client.animation.Keyframe;
import che.swgc.client.compat.animation.AnimationHelper;
import che.swgc.client.compat.animation.Transformation.Interpolations;
import che.swgc.client.compat.animation.Transformation.Targets;
import che.swgc.client.compat.animation.Animation.Builder;

public class AmbanSniperRifleAnimation {
   public static final che.swgc.client.compat.animation.Animation IDLE = che.swgc.client.compat.animation.Animation.Builder.create(3.0F)
      .looping()
      .addBoneAnimation(
         "bone5",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.15F, 0.15F, 0.15F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.15F, 0.15F, 0.15F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.25F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.4431F, -50.6346F, 23.2941F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-54.2012F, -54.7549F, 18.3897F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.4431F, -50.6346F, 23.2941F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.5F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-83.1034F, -3.0891F, 46.3512F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-85.1126F, -7.561F, 54.4717F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-83.1034F, -3.0891F, 46.3512F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.5F, 1.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation WALK = che.swgc.client.compat.animation.Animation.Builder.create(0.6667F)
      .looping()
      .addBoneAnimation(
         "bone5",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.15F, 0.15F, 0.15F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.8263F, 7.3838F, 2.5185F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.8263F, -7.3838F, -2.5185F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.8263F, 7.3838F, 2.5185F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.329F, -7.4928F, -2.5215F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.329F, 7.4928F, 2.5215F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.329F, -7.4928F, -2.5215F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.4431F, -50.6346F, 23.2941F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.4431F, -50.6346F, 23.2941F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-83.1034F, -3.0891F, 46.3512F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-83.1034F, -3.0891F, 46.3512F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(19.8159F, 2.1539F, 2.7324F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(26.0817F, 2.7345F, 3.9078F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.7017F, -1.3507F, 3.2852F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.44F, 0.4F, 3.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(19.8159F, 2.1539F, 2.7324F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 1.0F, -4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.7017F, 1.3507F, -3.2852F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.44F, -0.4F, -3.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(19.8159F, -2.1539F, -2.7324F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(26.0817F, -2.7345F, -3.9078F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.7017F, 1.3507F, -3.2852F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 1.0F, -4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation RUNNING = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .looping()
      .addBoneAnimation(
         "bone5",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.15F, 0.15F, 0.15F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.15F, 0.15F, 0.15F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.15F, 0.15F, 0.15F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(18.3825F, -11.1343F, -6.2386F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(18.3825F, 11.1343F, 6.2386F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(18.3825F, -11.1343F, -6.2386F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.2365F, 12.5867F, 3.0534F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.2365F, -12.5867F, -3.0534F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.2365F, 12.5867F, 3.0534F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.4431F, -50.6346F, 23.2941F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.4431F, -50.6346F, 23.2941F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-83.1034F, -3.0891F, 46.3512F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-83.1034F, -3.0891F, 46.3512F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(48.2773F, 9.8782F, 6.3385F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(49.0873F, 6.9861F, 1.7329F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-35.1027F, 4.094F, -2.8728F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(48.2773F, 9.8782F, 6.3385F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, 1.0F, -6.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-35.1027F, -4.094F, 2.8728F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(48.2773F, -9.8782F, -6.3385F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(49.0873F, -6.9861F, -1.7329F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-35.1027F, -4.094F, 2.8728F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, 1.0F, -6.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation JUMP = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "DC 17",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.15F, 0.15F, 0.15F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.15F, 0.15F, 0.15F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "DC-15S",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "DC-15S",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "DC-15S",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.19F, 0.19F, 0.19F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "bone5",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.4431F, -50.6346F, 23.2941F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.4431F, -50.6346F, 23.2941F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-79.4078F, -42.9888F, 37.2113F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-86.3968F, -37.9534F, 41.4307F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-60.4431F, -50.6346F, 23.2941F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-83.1034F, -3.0891F, 46.3512F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-83.1034F, -3.0891F, 46.3512F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-90.0055F, 4.1516F, 46.287F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-95.2726F, 9.5306F, 45.5507F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-83.1034F, -3.0891F, 46.3512F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.4798F, -0.2042F, 0.4974F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-0.0202F, -0.2042F, 0.4974F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.4798F, -0.2042F, 0.4974F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5024F, -4.1811F, 8.5852F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.4798F, -0.2042F, 0.4974F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.4798F, 0.2042F, -0.4974F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-0.0202F, 0.2042F, -0.4974F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.6533F, -12.1878F, -2.1491F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.519F, -1.5886F, -5.7017F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.4798F, 0.2042F, -0.4974F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 2.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation SHOT = che.swgc.client.compat.animation.Animation.Builder.create(0.25F)
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2826F, -1.827F, -12.4751F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.7242F, -1.2854F, -12.5414F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.8396F, -2.3652F, -12.3858F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2826F, -1.827F, -12.4751F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-104.7261F, 22.5727F, 21.8528F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-107.256F, 23.4833F, 20.863F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-112.4191F, 25.1782F, 18.7343F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-104.7261F, 22.5727F, 21.8528F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(2.5F, -5.0F, 4.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(2.5F, -5.0F, 4.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(2.5F, -5.9962F, 4.5872F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(2.5F, -5.0F, 4.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-62.0018F, 40.614F, 67.1575F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-63.3265F, 42.9106F, 66.275F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-66.2991F, 47.4514F, 64.1645F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-62.0018F, 40.614F, 67.1575F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.0F, -4.0F, -4.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.0F, -4.0F, -4.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.0F, -4.9962F, -4.4128F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.0F, -4.0F, -4.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0024F, 2.4976F, 0.1091F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.716F, -4.8862F, -2.5067F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1924F, -5.1715F, -1.8463F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.716F, -4.8862F, -2.5067F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(104.6324F, 26.9341F, -18.3338F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 1.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .build();

   public AmbanSniperRifleAnimation() {
   }
}
