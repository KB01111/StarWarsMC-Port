package che.swgc.client.animation;

import che.swgc.client.compat.animation.Transformation;
import che.swgc.client.compat.animation.Animation;
import net.minecraft.client.animation.Keyframe;
import che.swgc.client.compat.animation.AnimationHelper;
import che.swgc.client.compat.animation.Transformation.Interpolations;
import che.swgc.client.compat.animation.Transformation.Targets;
import che.swgc.client.compat.animation.Animation.Builder;

public class BlasterRifleAnimation {
   public static final che.swgc.client.compat.animation.Animation IDLE = che.swgc.client.compat.animation.Animation.Builder.create(3.0F)
      .looping()
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-41.2305F, -71.4623F, -15.4401F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-41.2305F, -71.4623F, -20.4401F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-41.2305F, -71.4623F, -15.4401F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -3.5F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-71.1857F, -53.4386F, 74.5277F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-79.5005F, -54.4898F, 81.2558F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-71.1857F, -53.4386F, 74.5277F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.25F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.19F, 0.19F, 0.19F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.19F, 0.19F, 0.19F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.19F, 0.19F, 0.19F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone5",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation WALK = che.swgc.client.compat.animation.Animation.Builder.create(0.6667F)
      .looping()
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
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-32.8314F, -59.0974F, -31.9746F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-28.8596F, -57.7108F, -32.8583F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-36.3381F, -55.1382F, -36.6886F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.1757F, -57.3576F, -37.5885F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-32.8314F, -59.0974F, -31.9746F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.25F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-99.0223F, -46.5904F, 97.246F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-95.4545F, -50.675F, 97.7979F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-104.3415F, -37.395F, 107.4774F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-98.578F, -44.5729F, 95.7495F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-99.0223F, -46.5904F, 97.246F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.25F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.12F, 0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.19F, 0.19F, 0.19F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
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
      .build();
   public static final che.swgc.client.compat.animation.Animation RUNNING = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .looping()
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
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-93.5668F, -64.2198F, 19.3323F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-95.0093F, -63.6629F, 19.266F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-93.2576F, -61.8037F, 26.156F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-91.5612F, -62.3294F, 26.6177F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-93.5668F, -64.2198F, 19.3323F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.0F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.0F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-99.549F, -20.387F, 83.0857F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-96.7688F, -18.3102F, 89.8722F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-94.0884F, -26.196F, 95.8353F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-95.8522F, -29.3493F, 93.4113F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-99.549F, -20.387F, 83.0857F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -3.0F, 2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -3.0F, 2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.74F, -3.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.29F, -3.0F, 0.44F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -3.0F, 2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.19F, 0.19F, 0.19F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
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
      .build();
   public static final che.swgc.client.compat.animation.Animation JUMP = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
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
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-41.2305F, -71.4623F, -15.4401F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-28.9636F, -68.6149F, -35.0526F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-42.2927F, -70.5068F, -24.3842F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-43.4748F, -70.518F, -33.4F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-41.2305F, -71.4623F, -15.4401F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-71.1857F, -53.4386F, 74.5277F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-101.6422F, -46.4892F, 96.5275F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-92.1966F, -45.3176F, 88.2222F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-110.3408F, -27.5274F, 96.5814F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-71.1857F, -53.4386F, 74.5277F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.19F, 0.19F, 0.19F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
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
      .build();
   public static final che.swgc.client.compat.animation.Animation SHOT = che.swgc.client.compat.animation.Animation.Builder.create(0.25F)
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-3.33F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.4718F, 0.6518F, -4.9574F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(9.9627F, 0.8672F, -4.9244F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.8113F, 0.5074F, -4.9732F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.4718F, 0.6518F, -4.9574F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-88.9954F, -4.2774F, -0.0588F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-94.0093F, -4.2662F, 0.3149F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-96.5161F, -4.2484F, 0.501F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-88.9954F, -4.2774F, -0.0588F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -3.0F, 3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -3.0F, 3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-53.9494F, 16.8055F, 65.221F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-56.1969F, 21.3322F, 64.4861F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-59.8497F, 28.0596F, 62.9569F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-53.9494F, 16.8055F, 65.221F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.0F, -3.0F, -4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.0F, -3.0F, -4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.19F, 0.19F, 0.19F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "bone5",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .build();

   public BlasterRifleAnimation() {
   }
}
