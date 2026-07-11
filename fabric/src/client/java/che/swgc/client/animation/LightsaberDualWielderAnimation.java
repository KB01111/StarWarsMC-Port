package che.swgc.client.animation;

import che.swgc.client.compat.animation.Transformation;
import che.swgc.client.compat.animation.Animation;
import net.minecraft.client.animation.Keyframe;
import che.swgc.client.compat.animation.AnimationHelper;
import che.swgc.client.compat.animation.Transformation.Interpolations;
import che.swgc.client.compat.animation.Transformation.Targets;
import che.swgc.client.compat.animation.Animation.Builder;

public class LightsaberDualWielderAnimation {
   public static final che.swgc.client.compat.animation.Animation IDLE = che.swgc.client.compat.animation.Animation.Builder.create(2.0F)
      .looping()
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5095F, 4.9952F, -0.2187F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.6155F, 4.9952F, -0.2187F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5382F, 5.434F, -0.0129F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-0.0269F, 5.4294F, 0.2248F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5095F, 4.9952F, -0.2187F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.25F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.47F, -0.28F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.75F, 0.25F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.75F, 0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.25F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0159F, -5.1988F, 2.0539F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0159F, -5.1988F, 2.0539F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.519F, -5.0999F, 2.0414F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.6409F, -5.1988F, 2.0539F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0159F, -5.1988F, 2.0539F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, 6.82F, 9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.9868F, 12.5909F, 17.0199F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.2764F, 9.7318F, 7.9669F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.4862F, 16.3764F, 8.7015F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, 6.82F, 9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.12F, -0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.25F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.88F, 0.06F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(87.845F, -2.8028F, -7.3927F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(87.2917F, 0.2271F, 4.9901F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(98.393F, 2.6561F, 4.894F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, -17.4313F, -9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.3397F, -23.4931F, -13.2345F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.7432F, -19.5472F, -12.0602F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.2462F, -22.401F, -9.5685F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, -17.4313F, -9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.12F, -0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.25F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.63F, 0.06F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0429F, 7.4713F, 5.6574F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0429F, 7.4713F, 5.6574F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0429F, 7.4713F, 5.6574F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.25F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.25F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.25F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1208F, -12.4517F, -1.1069F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.6208F, -12.4517F, -1.1069F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1208F, -12.4517F, -1.1069F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.75F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.75F, 0.0F, -1.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.75F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(87.845F, 2.8028F, 7.3927F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(87.2917F, -0.2271F, -4.9901F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(98.393F, -2.6561F, -4.894F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation WALK = che.swgc.client.compat.animation.Animation.Builder.create(0.8333F)
      .looping()
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(102.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)}
         )
      )
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "\u043b\u0435\u0437\u0432\u0438\u0435",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.538F, -5.0664F, 0.4282F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.5829F, -0.3301F, 2.4781F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.538F, 5.0664F, -0.4282F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.5829F, 0.3301F, -2.4781F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.538F, -5.0664F, 0.4282F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5137F, 12.5599F, 1.6288F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.4875F, -1.0901F, -2.2495F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5137F, -12.5599F, -1.6288F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.4875F, 1.0901F, 2.2495F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5137F, 12.5599F, 1.6288F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(17.2511F, 29.0846F, 18.5807F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(17.2016F, 37.018F, 14.6813F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(34.1423F, 31.6053F, 24.7063F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(33.0837F, 37.7373F, 24.5946F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(17.2511F, 29.0846F, 18.5807F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.039F, -1.6351F, 0.4994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.039F, -1.6351F, 0.4994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.039F, -1.6351F, 0.4994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(104.0775F, 9.1362F, -5.3808F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(14.3105F, -10.6198F, -12.7369F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.0421F, -18.0653F, -13.6698F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(39.9915F, -27.1596F, -29.1524F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(22.6987F, -18.4277F, -16.0856F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(14.3105F, -10.6198F, -12.7369F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0391F, -0.8915F, 0.6624F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0391F, -0.8915F, 0.6624F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0391F, -0.8915F, 0.6624F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(40.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-16.7802F, 0.1876F, 1.4365F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.25F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.25F, 1.0F, -4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.1864F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.25F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-16.7802F, -0.1876F, -1.4365F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.0433F, -2.4863F, -2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(40.0433F, -2.4863F, -2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-16.7802F, -0.1876F, -1.4365F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.25F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.25F, 1.0F, -4.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(104.0775F, -9.1362F, 5.3808F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation RUN = che.swgc.client.compat.animation.Animation.Builder.create(0.5833F)
      .looping()
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(99.9337F, 3.6265F, 8.249F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(117.4337F, 3.6265F, 8.249F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(99.9337F, 3.6265F, 8.249F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, 0.2434F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "\u043b\u0435\u0437\u0432\u0438\u0435",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, -3.1924F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 3.1924F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(24.0964F, 0.94F, 7.3021F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(21.5859F, 1.3962F, 4.3456F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(24.0964F, -0.94F, -7.3021F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(21.5859F, -1.3962F, -4.3456F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(24.0964F, 0.94F, 7.3021F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.75F, 1.25F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.75F, 1.25F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.9074F, -18.515F, -5.1483F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.679F, -6.0371F, -5.1905F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.9074F, 18.515F, 5.1483F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.679F, 6.0371F, 5.1905F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.9074F, -18.515F, -5.1483F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(48.8676F, 27.4063F, 51.5561F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(51.0706F, 32.2898F, 58.1238F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(28.8676F, 27.4063F, 51.5561F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(20.691F, 23.6861F, 46.932F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(48.8676F, 27.4063F, 51.5561F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.1236F, -1.9923F, 1.9917F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.12F, -1.89F, 2.19F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.1236F, -1.9923F, 1.9917F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.12F, -2.29F, 1.79F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.1236F, -1.9923F, 1.9917F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(106.1202F, 4.5437F, 11.6326F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.2566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(28.8676F, -27.4063F, -51.5561F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(20.691F, -23.6861F, -46.932F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(48.8676F, -27.4063F, -51.5561F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(51.0706F, -32.2898F, -58.1238F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(28.8676F, -27.4063F, -51.5561F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.1236F, -1.9923F, 1.9917F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.12F, -2.29F, 1.79F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.1236F, -1.9923F, 1.9917F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.12F, -1.89F, 2.19F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.1236F, -1.9923F, 1.9917F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-37.556F, -2.3531F, -2.9059F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.98F, 6.25F, 0.17F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(53.521F, 17.7125F, 4.2738F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(31.48F, 6.25F, 0.17F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-37.556F, -2.3531F, -2.9059F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0284F, -0.1978F, -1.403F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.11F, -0.11F, -0.92F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2952F, 0.0131F, 2.052F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.11F, 1.89F, -3.92F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0284F, -0.1978F, -1.403F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(53.521F, -17.7125F, -4.2738F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(31.48F, -6.25F, -0.17F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-37.556F, 2.3531F, 2.9059F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.98F, -6.25F, -0.17F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(53.521F, -17.7125F, -4.2738F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2952F, 0.0131F, 2.052F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.11F, 1.89F, -3.92F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.0284F, -0.1978F, -1.403F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.11F, -0.11F, -0.92F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2952F, 0.0131F, 2.052F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(106.1202F, -4.5437F, -11.6326F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, -0.2566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation ATTACK_R1 = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.3378F, 14.9416F, -5.1754F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.375F, 19.9402F, -5.2995F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-3.7926F, -0.0545F, -4.8292F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(1.704F, -17.67F, 4.4085F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(6.6302F, -5.1752F, 4.7787F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, 6.82F, 9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-73.4996F, 34.7369F, -65.9629F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-106.7989F, 34.6078F, -121.4239F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-43.744F, -5.425F, -95.3439F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.6717F, -0.694F, -120.2009F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-47.6444F, -26.4275F, -37.8694F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, 6.82F, 9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.04F, -2.64F, -0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.04F, -2.64F, -0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.7484F, -2.9169F, -3.6804F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.9633F, -2.2188F, -3.3286F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(102.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(103.0862F, 17.0723F, 3.904F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(103.09F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(110.2952F, -1.067F, -0.244F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.5159F, 0.9359F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, -17.4313F, -9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.4861F, 7.3109F, -25.3166F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(46.1687F, -40.087F, -36.0545F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(18.9238F, -32.6269F, -29.752F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, -17.4313F, -9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.75F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.75F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.103F, -9.9701F, -4.2994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.103F, -9.9701F, -4.2994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation ATTACK_L1 = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.3378F, -14.9416F, 5.1754F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.375F, -19.9402F, 5.2995F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-3.7926F, 0.0545F, 4.8292F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(1.704F, 17.67F, -4.4085F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(6.6302F, 5.1752F, -4.7787F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, 17.4313F, 9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.4861F, -7.3109F, 25.3166F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(46.1687F, 40.087F, 36.0545F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(18.9238F, 32.6269F, 29.752F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, 17.4313F, 9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, -6.82F, -9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-73.4996F, -34.7369F, 65.9629F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-106.7989F, -34.6078F, 121.4239F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-43.744F, 5.425F, 95.3439F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.6717F, 0.694F, 120.2009F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-47.6444F, 26.4275F, 37.8694F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, -6.82F, -9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.04F, -2.64F, -0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.04F, -2.64F, -0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.7484F, -2.9169F, -3.6804F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.9633F, -2.2188F, -3.3286F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.75F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.75F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.103F, -9.9701F, -4.2994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.103F, -9.9701F, -4.2994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(102.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(103.0862F, -17.0723F, -3.904F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(103.09F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(110.2952F, 1.067F, 0.244F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, -0.5159F, 0.9359F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation ATTACK_R2 = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(115.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(105.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, 0.1463F, 0.5674F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, 0.2094F, 0.7315F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "\u043b\u0435\u0437\u0432\u0438\u0435",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5016F, 12.3534F, 2.8034F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.5523F, -57.5533F, 7.1822F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-0.1744F, -17.5633F, 1.5628F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.4229F, -14.8621F, -2.4106F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.456F, 43.3743F, -0.7444F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.6134F, 17.6063F, -0.9582F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, 6.82F, 9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-89.5459F, -8.0216F, -33.5264F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-61.5308F, -2.5521F, -80.659F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-36.9825F, 0.3567F, -23.3957F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, 6.82F, 9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.9564F, -1.6428F, -0.3725F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.4033F, -2.821F, -1.4335F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.065F, -2.6347F, -0.5058F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(115.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(105.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, 0.1463F, 0.5674F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, 0.2094F, 0.7315F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, -17.4313F, -9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(13.7771F, -19.4835F, -30.6879F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, -17.4313F, -9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.75F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.75F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.103F, -9.9701F, -4.2994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.103F, -9.9701F, -4.2994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation ATTACK_L2 = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(115.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(105.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, 0.1463F, 0.5674F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, 0.2094F, 0.7315F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "\u043c\u0435\u0447",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "\u043b\u0435\u0437\u0432\u0438\u0435",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5016F, -12.3534F, -2.8034F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.5523F, 57.5533F, -7.1822F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-0.1744F, 17.5633F, -1.5628F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.4229F, 14.8621F, 2.4106F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.456F, -43.3743F, 0.7444F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.6134F, -17.6063F, 0.9582F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, 17.4313F, 9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(13.7771F, 19.4835F, 30.6879F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, 17.4313F, 9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, -6.82F, -9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-89.5459F, 8.0216F, 33.5264F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-61.5308F, 2.5521F, 80.659F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-36.9825F, -0.3567F, 23.3957F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, -6.82F, -9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.9564F, -1.6428F, -0.3725F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.4033F, -2.821F, -1.4335F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.065F, -2.6347F, -0.5058F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.75F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.75F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.103F, -9.9701F, -4.2994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.103F, -9.9701F, -4.2994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(115.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(105.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, 0.1463F, 0.5674F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, 0.2094F, 0.7315F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation ATTACK_BOTH1 = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.5F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -0.25F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, 6.82F, 9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-90.3812F, 67.4429F, -68.225F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-87.8217F, -6.0801F, -158.5998F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-35.0598F, -24.9055F, -177.1925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, 6.82F, 9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -3.0F, 0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.0F, -1.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.12F, 0.13F, -1.16F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(78.1303F, 7.6139F, -11.9791F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(107.1325F, 23.322F, -9.3185F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(115.4635F, 32.4653F, 1.5918F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.26F, 1.99F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, 0.24F, 0.99F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.05F, 0.24F, 1.49F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, -17.4313F, -9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-90.3812F, -67.4429F, 68.225F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-87.8217F, 6.0801F, 158.5998F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-35.0598F, 24.9055F, 177.1925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, -17.4313F, -9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -3.0F, 0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(2.0F, -1.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.12F, 0.13F, -1.16F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0429F, 7.4713F, 5.6574F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0429F, 7.4713F, 5.6574F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.25F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.25F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1208F, -12.4517F, -1.1069F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1208F, -12.4517F, -1.1069F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.75F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.75F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(78.1303F, -7.6139F, 11.9791F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(107.1325F, -23.322F, 9.3185F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(115.4635F, -32.4653F, -1.5918F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, -0.26F, 1.99F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, 0.24F, 0.99F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.05F, 0.24F, 1.49F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation ATTACK_BOTH2 = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-15.1461F, -4.0633F, 5.7864F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-3.4335F, 6.9166F, -3.0869F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.22F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.6279F, -9.8318F, -1.8353F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, 6.82F, 9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(17.3937F, 70.4165F, 55.6063F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-54.5326F, 34.8834F, -85.4779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-18.7771F, 13.7608F, -43.997F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(8.1227F, 6.82F, 9.9925F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.88F, -2.05F, -0.05F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -3.0F, -2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -2.12F, -2.12F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(86.5181F, 7.0995F, -7.8799F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(116.7893F, -3.6065F, -16.896F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(112.6263F, -0.067F, -36.0702F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2F, 0.24F, 0.99F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, -17.4313F, -9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-140.5904F, -42.3276F, 63.672F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0826F, -17.7182F, 112.4862F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-46.2503F, 2.6084F, 68.8097F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.2413F, -17.4313F, -9.0741F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.87F, -1.0F, -0.58F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, -2.69F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0429F, 7.4713F, 5.6574F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0429F, 7.4713F, 5.6574F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.25F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.25F, 0.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1208F, -12.4517F, -1.1069F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1208F, -12.4517F, -1.1069F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.75F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.75F, 0.0F, -1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(86.5181F, -7.0995F, 7.8799F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(116.7893F, 3.6065F, 16.896F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(117.9261F, -9.9833F, 3.8261F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.05F, 0.24F, 0.99F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation OBI_ANI = che.swgc.client.compat.animation.Animation.Builder.create(0.6667F)
      .looping()
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 17.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.65F, 0.56F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, -7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, -17.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5417F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.65F, -0.56F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, 7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, -7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, -12.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(6.2F, 1.3F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, 12.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(6.2F, -1.3F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, -7.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-27.1268F, 0.6139F, 69.8139F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-12.7545F, 13.5047F, 94.7508F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.3016F, 12.7518F, 97.1988F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.6984F, 12.7518F, 97.1988F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.7384F, -3.4476F, 86.3917F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-38.8979F, -9.8989F, 74.5047F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.9924F, -7.2386F, 72.1504F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-11.0648F, 0.1699F, 73.3214F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-27.1268F, 0.6139F, 69.8139F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.5F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.5F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, -1080.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.05F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2F, -1.76F, -0.26F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.05F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2F, -1.76F, 0.24F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.7384F, 3.4476F, -86.3917F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-38.8979F, 9.8989F, -74.5047F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.9924F, 7.2386F, -72.1504F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-11.0648F, -0.1699F, -73.3214F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-27.1268F, -0.6139F, -69.8139F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-12.7545F, -13.5047F, -94.7508F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.3016F, -12.7518F, -97.1988F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.6984F, -12.7518F, -97.1988F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.7384F, 3.4476F, -86.3917F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)}
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.75F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.103F, -9.9701F, -4.2994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)}
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3136F, -0.1334F, -0.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)}
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 1080.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.05F, -0.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2F, -1.76F, -0.26F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.05F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2F, -1.76F, 0.24F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2F, -1.7566F, -0.0097F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.8F, -1.7566F, -0.0097F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.05F, -0.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation BLOCK = che.swgc.client.compat.animation.Animation.Builder.create(0.0F)
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(2.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 27.5F, -10.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.8095F, -21.1285F, 13.3002F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-34.4562F, -29.6398F, 47.6345F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.0F, -2.0F, 3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(82.5229F, 14.3338F, 13.2625F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-27.2161F, 27.0999F, -130.5013F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, -2.0F, 2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(29.0671F, 15.0408F, 30.6993F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -2.0F, 1.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.9804F, -13.2847F, 5.9804F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0F, 0.0F, -3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(83.9318F, -10.2498F, 19.8771F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.95F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation[] ATTACKS = new che.swgc.client.compat.animation.Animation[]{ATTACK_R1, ATTACK_L1, ATTACK_BOTH1, ATTACK_R2, ATTACK_L2, ATTACK_BOTH2};

   public LightsaberDualWielderAnimation() {
   }
}
