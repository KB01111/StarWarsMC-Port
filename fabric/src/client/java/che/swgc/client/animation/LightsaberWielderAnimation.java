package che.swgc.client.animation;

import che.swgc.client.compat.animation.Transformation;
import che.swgc.client.compat.animation.Animation;
import net.minecraft.client.animation.Keyframe;
import che.swgc.client.compat.animation.AnimationHelper;
import che.swgc.client.compat.animation.Transformation.Interpolations;
import che.swgc.client.compat.animation.Transformation.Targets;
import che.swgc.client.compat.animation.Animation.Builder;

public class LightsaberWielderAnimation {
   public static final che.swgc.client.compat.animation.Animation ACTIVATION = che.swgc.client.compat.animation.Animation.Builder.create(1.25F)
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 2.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.3336F, 2.4366F, 1.5032F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, -10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-3.25F, -10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.5F, -10.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.049F, -1.9977F, 0.0814F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.05F, -1.0F, 0.08F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.05F, -1.0F, 0.08F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -17.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5002F, -17.4672F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(9.9913F, -4.7662F, -0.7529F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(11.2413F, -4.7662F, -0.7529F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(9.9913F, -4.7662F, -0.7529F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-0.4848F, 10.6845F, 7.0089F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-48.4021F, -1.2092F, -0.8637F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-46.1732F, -13.7782F, -9.1103F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-41.6981F, -15.7939F, -7.9809F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-44.1981F, -15.7939F, -7.9809F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-41.6981F, -15.7939F, -7.9809F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.1236F, -0.9923F, -0.0083F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.4858F, -1.9736F, -0.9977F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.039F, -1.6351F, -0.5006F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.1716F, -1.1719F, -0.105F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.1716F, -1.1719F, -0.105F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-1.1089F, 6.289F, -10.9119F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-43.1793F, 13.5445F, 14.8154F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.2086F, 23.8556F, 37.5347F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-26.1212F, 18.5352F, 41.6672F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.75F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-27.6212F, 18.5352F, 41.6672F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-26.1212F, 18.5352F, 41.6672F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.1872F, -0.9821F, -0.0192F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2314F, -2.104F, -1.3453F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0391F, -1.8915F, -1.3376F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.032F, -1.6156F, -1.1795F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.032F, -1.6156F, -1.1795F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1091F, 2.4976F, 2.5024F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0433F, 2.4863F, 2.2773F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(6.1378F, 2.3847F, 1.5383F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(6.1378F, 2.3847F, 1.5383F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0284F, -0.1978F, 0.597F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.1076F, -0.4021F, -0.861F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2135F, -0.15F, 0.3474F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2135F, -0.15F, 0.3474F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.4407F, -9.9904F, -2.5385F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-0.9249F, -15.1718F, -3.0368F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.7008F, -19.9434F, -3.5421F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.2992F, -19.9434F, -3.5421F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-4.2992F, -19.9434F, -3.5421F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2952F, 0.0131F, -0.948F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.7648F, 0.8381F, -1.9066F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.3136F, -0.1334F, -2.779F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8086F, -0.3287F, -0.8582F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8086F, -0.3287F, -0.8582F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation IDLE = che.swgc.client.compat.animation.Animation.Builder.create(4.0F)
      .looping()
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.1187F, 4.9131F, -4.7151F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.1187F, 4.9131F, -4.7151F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.1187F, 4.9131F, -4.7151F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-7.4312F, 4.9131F, -4.7151F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.1187F, 4.9131F, -4.7151F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(9.3611F, -22.0591F, 1.384F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(4.3611F, -22.0591F, 1.384F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(9.3611F, -22.0591F, 1.384F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-74.3763F, -47.4568F, 8.2394F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-74.6218F, -62.9512F, 12.8631F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-74.3763F, -47.4568F, 8.2394F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.4841F, -3.2126F, 0.4093F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.48F, -2.21F, -1.59F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.4841F, -3.2126F, 0.4093F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-46.021F, 17.8888F, 31.952F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-61.2195F, 30.4267F, 20.4161F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-46.021F, 17.8888F, 31.952F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.349F, -2.9714F, 0.9448F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.35F, -2.97F, 0.94F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.349F, -2.9714F, 0.9448F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1091F, 2.4976F, 2.5024F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.6091F, 2.4976F, 2.5024F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1091F, 2.4976F, 2.5024F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0284F, -0.1978F, 0.597F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.03F, 0.05F, -1.15F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0284F, -0.1978F, 0.597F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.4407F, -9.9904F, -2.5385F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.4407F, -9.9904F, -2.5385F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.4407F, -9.9904F, -2.5385F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2952F, 0.0131F, -0.948F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3F, 0.01F, -2.95F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2952F, 0.0131F, -0.948F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0822F, 11.8518F, 34.5722F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(99.9458F, 12.5292F, 28.2067F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(2.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(99.1525F, 13.2327F, 42.5448F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(3.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(96.5083F, 12.5292F, 28.2067F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(90.0822F, 11.8518F, 34.5722F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(4.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation JEDI_JUMP = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
      .looping()
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(360.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 6.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 14.0F, 15.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 27.0F, -6.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 6.0F, -8.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 6.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(52.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(48.5399F, -2.9609F, 28.8057F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(47.4746F, 11.972F, 15.4211F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(48.5399F, -2.9609F, 28.8057F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "", new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.0, 0.0, 0.0), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(33.8389F, -6.4926F, -23.8997F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(32.4746F, -11.972F, -15.4211F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(33.8389F, -6.4926F, -23.8997F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-12.7105F, 14.3593F, 7.0361F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-65.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-12.7105F, 14.3593F, 7.0361F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightLeg",
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
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-52.3944F, -3.9649F, -3.0487F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-105.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-52.3944F, -3.9649F, -3.0487F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.59F, -2.98F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.59F, -2.98F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.59F, -2.98F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation ATTACK1 = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
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
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-46.1732F, -13.7782F, -9.1103F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-89.5459F, -8.0216F, -33.5264F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-61.5308F, -2.5521F, -80.659F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-36.9825F, 0.3567F, -23.3957F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-46.1732F, -13.7782F, -9.1103F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.039F, -1.6351F, -0.5006F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.0436F, -2.6428F, -0.3725F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.5967F, -3.821F, -1.4335F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.065F, -2.6347F, -0.5058F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.039F, -1.6351F, -0.5006F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.2086F, 23.8556F, 37.5347F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-114.5773F, 27.0034F, -39.5586F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-107.3977F, 9.4692F, -70.4433F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-31.8165F, 20.0426F, 30.569F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.2086F, 23.8556F, 37.5347F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0391F, -1.8915F, -1.3376F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.5873F, -3.772F, -1.1104F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.5762F, -4.2379F, 0.2528F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.375F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.7568F, -2.8649F, -0.4013F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0391F, -1.8915F, -1.3376F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
      .build();
   public static final che.swgc.client.compat.animation.Animation ATTACK2 = che.swgc.client.compat.animation.Animation.Builder.create(0.5F)
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
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-46.1732F, -13.7782F, -9.1103F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-73.4996F, 34.7369F, -65.9629F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-106.7989F, 34.6078F, -121.4239F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-43.744F, -5.425F, -95.3439F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.6717F, -0.694F, -120.2009F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-47.6444F, -26.4275F, -37.8694F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-46.1732F, -13.7782F, -9.1103F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.039F, -1.6351F, -0.5006F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.04F, -2.64F, -0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.04F, -2.64F, -0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(3.7484F, -2.9169F, -3.6804F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(4.9633F, -2.2188F, -3.3286F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.039F, -1.6351F, -0.5006F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.2086F, 23.8556F, 37.5347F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-101.287F, 58.5023F, -53.1548F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-147.4103F, 28.7461F, -117.7699F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-78.3998F, 10.8509F, -92.4539F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-69.4485F, -10.6996F, -110.1366F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-57.1232F, 13.296F, -15.6275F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-29.2086F, 23.8556F, 37.5347F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0391F, -1.8915F, -1.3376F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.96F, -2.89F, -2.34F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-2.8558F, -3.1441F, -2.481F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.9791F, -1.1784F, -0.5753F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0416F, -1.3708F, 1.9706F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-1.5004F, 0.233F, 0.5307F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0391F, -1.8915F, -1.3376F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
      .build();
   public static final che.swgc.client.compat.animation.Animation BLOCK = che.swgc.client.compat.animation.Animation.Builder.create(0.0F)
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-2.1187F, 4.9131F, -4.7151F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(11.1012F, -21.3839F, 6.5121F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-93.4329F, 41.6682F, 77.4716F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.5159F, 0.7874F, -1.5907F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-113.6713F, 57.4801F, 35.9086F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-7.651F, -1.9714F, -2.0552F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1091F, 2.4976F, 2.5024F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0284F, -0.1978F, 0.597F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.4407F, -9.9904F, -2.5385F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2952F, 0.0131F, -0.948F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(67.5807F, 4.3518F, 34.5614F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
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
      .build();
   public static final che.swgc.client.compat.animation.Animation FORCE = che.swgc.client.compat.animation.Animation.Builder.create(0.0F)
      .addBoneAnimation(
         "root",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 12.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "head",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, -30.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)})
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.1716F, 10.4417F, 22.267F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.853F, -1.4409F, 0.3002F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-69.6754F, -25.3266F, -57.72F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.6489F, -2.4821F, -0.9062F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.1091F, 2.4976F, 2.5024F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "rightLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0284F, -0.1978F, 0.597F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.4407F, -9.9904F, -2.5385F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
         )
      )
      .addBoneAnimation(
         "leftLeg",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.2952F, 0.0131F, -0.948F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)}
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
      .build();
   public static final che.swgc.client.compat.animation.Animation WALK = che.swgc.client.compat.animation.Animation.Builder.create(0.8333F)
      .looping()
      .addBoneAnimation(
         "body",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5901F, -12.5589F, 0.0889F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.5829F, -0.3301F, 2.4781F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5901F, 12.5589F, -0.0889F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.5829F, 0.3301F, -2.4781F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(2.5901F, -12.5589F, 0.0889F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(9.7511F, 29.0846F, 18.5807F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(4.6938F, 29.6758F, 11.8632F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(16.1049F, 28.6274F, 21.3873F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(26.6584F, 32.2038F, 26.1002F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(9.7511F, 29.0846F, 18.5807F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.039F, -1.6351F, 0.4994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.04F, -1.64F, 0.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.039F, -1.6351F, 0.4994F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(14.3105F, -10.6198F, -12.7369F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2083F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(12.4F, -1.88F, -10.65F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-19.5087F, 6.855F, -8.5552F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.625F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-22.6F, -1.88F, -10.65F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.04F, -0.89F, -0.34F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.ROTATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(102.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -0.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)}
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .addBoneAnimation(
         "",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.8333F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation RUN = che.swgc.client.compat.animation.Animation.Builder.create(0.5833F)
      .looping()
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
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-77.8522F, 48.9362F, -44.9884F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-49.5253F, 29.6349F, -28.4684F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.5371F, 19.4808F, -18.2169F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-18.044F, 24.1095F, -21.8638F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-77.8522F, 48.9362F, -44.9884F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(2.1872F, -0.9821F, -0.0192F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.125F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.15F, -0.98F, 0.78F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.9372F, -0.9821F, -0.0192F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4583F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(1.15F, -0.98F, 0.58F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(2.1872F, -0.9821F, -0.0192F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
         "rightItem",
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
         "rightItem",
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
         "rightItem",
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
         "",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.SCALE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.2917F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(1.3F, 3.5, 1.3F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
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
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-5.0F, 17.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.65F, 0.56F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(7.4F, -4.84F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(10.0F, -12.5F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(6.2F, 1.3F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(5.0F, 5.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
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
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-30.0F, 0.0F, -7.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-45.0F, 10.0F, -7.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-57.5F, 10.0F, -7.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-57.03F, 9.38F, -17.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-30.0F, 0.0F, -7.5F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "leftArm",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -2.0F, 2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.75F, -3.0F, 3.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.75F, -2.0F, 2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 2.0F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
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
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(92.5F, -1080.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -1.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.0833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.1667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.25F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.3F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.3333F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.05F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.4167F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2F, -1.76F, -0.26F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.05F, -1.76F, -0.01F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.5833F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-0.2F, -1.76F, 0.24F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC),
               new net.minecraft.client.animation.Keyframe(0.6667F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.8F, -1.7566F, 0.9903F), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)
            }
         )
      )
      .addBoneAnimation(
         "rightItem",
         new che.swgc.client.compat.animation.Transformation(che.swgc.client.compat.animation.Transformation.Targets.SCALE, new net.minecraft.client.animation.Keyframe[]{new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createScalingVector(0.5, 0.5, 0.5), che.swgc.client.compat.animation.Transformation.Interpolations.CUBIC)})
      )
      .build();
   public static final che.swgc.client.compat.animation.Animation[] ATTACKS = new che.swgc.client.compat.animation.Animation[]{ATTACK1, ATTACK2};

   public LightsaberWielderAnimation() {
   }
}
