package che.swgc.client.model.entity;

import che.swgc.entity.StarFighter;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import che.swgc.client.compat.model.SinglePartEntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;
import javax.annotation.ParametersAreNonnullByDefault;
import che.swgc.client.compat.animation.Transformation;
import che.swgc.client.compat.animation.Animation;
import net.minecraft.client.animation.Keyframe;
import che.swgc.client.compat.animation.AnimationHelper;
import che.swgc.client.compat.animation.Transformation.Interpolations;
import che.swgc.client.compat.animation.Transformation.Targets;
import che.swgc.client.compat.animation.Animation.Builder;

@javax.annotation.ParametersAreNonnullByDefault
public class Delta7BModel<T extends StarFighter> extends che.swgc.client.compat.model.SinglePartEntityModel<T> {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "delta7b"), "main");
   public static final net.minecraft.client.model.geom.ModelLayerLocation GLASS_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "delta7b"), "glass");
   public static final che.swgc.client.compat.animation.Animation ANIMATION = che.swgc.client.compat.animation.Animation.Builder.create(2.0F)
      .addBoneAnimation(
         "bend1",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-15.0F, 0.0F, 45.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bend1",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(3.0F, 3.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bend2",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bend5",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-65.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bend5",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bend6",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bend6",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-80.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone3",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bend3",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(-15.0F, 0.0F, -45.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bend3",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.TRANSLATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createTranslationalVector(-3.0F, 3.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bend4",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .addBoneAnimation(
         "bone4",
         new che.swgc.client.compat.animation.Transformation(
            che.swgc.client.compat.animation.Transformation.Targets.ROTATE,
            new net.minecraft.client.animation.Keyframe[]{
               new net.minecraft.client.animation.Keyframe(0.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR),
               new net.minecraft.client.animation.Keyframe(1.0F, che.swgc.client.compat.animation.AnimationHelper.createRotationalVector(0.0F, 0.0F, -82.5F), che.swgc.client.compat.animation.Transformation.Interpolations.LINEAR)
            }
         )
      )
      .build();
   private final net.minecraft.client.model.geom.ModelPart root;

   public Delta7BModel(net.minecraft.client.model.geom.ModelPart root) {
      super(net.minecraft.client.renderer.rendertype.RenderType::getEntityCutout);
      this.root = root;
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone2 = partdefinition.addChild(
         "bone2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 539)
            .cuboid(-1.1266F, 0.4192F, -68.1097F, 2.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(430, 78)
            .cuboid(-12.6266F, -14.0158F, 39.1176F, 25.0F, 8.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(300, 480)
            .cuboid(-11.1266F, -7.0158F, 28.6272F, 22.0F, 17.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(366, 479)
            .cuboid(-0.1266F, -5.0158F, 47.1272F, 0.0F, 15.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(456, 533)
            .cuboid(-1.1266F, -5.0158F, 39.1272F, 2.0F, 15.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(440, 245)
            .cuboid(-13.1266F, -7.0158F, 36.1272F, 26.0F, 2.0F, 21.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(512, 420)
            .cuboid(-0.1266F, -18.0158F, 39.1272F, 0.0F, 11.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(172, 456)
            .cuboid(-1.1266F, -15.0158F, 39.1272F, 2.0F, 8.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.1266F, 9.0158F, -25.1272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone2.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(90, 491).cuboid(-20.0F, -4.0F, -2.0F, 23.0F, 7.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(8.3734F, -9.5676F, 45.6552F, -0.5672F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bone2.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 363).cuboid(-0.3F, 0.0F, 0.0917F, 8.0F, 2.0F, 91.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.3948F, -1.0158F, -74.8728F, -0.0456F, -0.2964F, 0.0133F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bone2.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(222, 510).cuboid(37.1168F, 0.0F, 79.1345F, 8.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.1415F, -1.0408F, -74.8728F, -0.0447F, -0.218F, 0.0097F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bone2.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(486, 322).cuboid(-3.5361F, 0.0F, 88.4059F, 11.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.1415F, -1.0158F, -74.8728F, -0.044F, 0.1308F, -0.0057F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bone2.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(360, 508).cuboid(-45.1168F, 0.0F, 79.1345F, 8.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.3948F, -1.0408F, -74.8728F, -0.0447F, 0.218F, -0.0097F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bone2.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(484, 473).cuboid(-7.4639F, 0.0F, 88.4059F, 11.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.3948F, -1.0158F, -74.8728F, -0.044F, -0.1308F, 0.0057F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bone2.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(106, 511).cuboid(44.1168F, -2.0F, 79.1345F, 1.0F, 6.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.1852F, 0.9842F, -74.5804F, 0.0F, -0.2182F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bone2.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 511).cuboid(-45.1168F, -2.0F, 79.1345F, 1.0F, 6.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-4.4385F, 0.9842F, -74.5804F, 0.0F, 0.2182F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bone2.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(440, 145).cuboid(0.7F, 0.0F, 48.0917F, 7.0F, 4.0F, 43.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.3948F, -0.9408F, -74.8728F, 0.0F, -0.2967F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bone2.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(430, 0).cuboid(-7.7F, 0.0F, 48.0917F, 7.0F, 4.0F, 43.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.1415F, -0.9408F, -74.8728F, 0.0F, 0.2967F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bone2.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(198, 270).cuboid(-7.7F, 0.0F, 0.0917F, 8.0F, 2.0F, 91.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.1415F, -1.0158F, -74.8728F, -0.0456F, 0.2964F, -0.0133F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone2.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 270).cuboid(0.0F, 0.0F, 0.0F, 8.0F, 2.0F, 91.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.7835F, -1.0158F, -74.8728F, 0.0F, -0.2967F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone2.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(496, 105).cuboid(-8.0F, 0.0F, 0.0F, 8.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(32.1361F, -1.0158F, 12.1509F, 0.0894F, -0.2173F, -0.0193F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone2.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(422, 508).cuboid(0.0F, 0.0F, 0.0F, 8.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-32.3893F, -1.0158F, 12.1509F, 0.0894F, 0.2173F, 0.0193F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone2.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(430, 47).cuboid(7.8242F, 0.6498F, -7.3815F, 16.0F, 2.0F, 29.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-32.3893F, -1.0158F, 12.1509F, 0.0871F, -0.119F, -0.1418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone2.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(396, 322).cuboid(-23.8242F, 0.6498F, -7.3815F, 16.0F, 2.0F, 29.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(32.1361F, -1.0158F, 12.1509F, 0.0871F, 0.119F, 0.1418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone2.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(90, 456).cuboid(-6.0F, -12.2884F, 39.8589F, 12.0F, 6.0F, 29.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1266F, -0.6158F, -77.8728F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone2.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(198, 363)
            .cuboid(-5.0F, -1.2653F, 10.0757F, 10.0F, 2.0F, 61.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(414, 172)
            .cuboid(-1.0F, -0.2653F, -0.9243F, 2.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1266F, -0.6158F, -77.8728F, -0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bone2.addChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .mirrored()
            .cuboid(-21.6367F, 0.5831F, 4.5228F, 24.0F, 1.0F, 92.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.1266F, -0.6158F, -77.8728F, -0.085F, 0.2879F, -0.1497F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bone2.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-2.3633F, 0.5831F, 4.5228F, 24.0F, 1.0F, 92.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1266F, -0.6158F, -77.8728F, -0.085F, -0.2879F, 0.1497F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bone2.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(220, 185).cuboid(0.0F, 0.0F, 0.0F, 26.0F, 1.0F, 84.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.7835F, -1.0158F, -74.8728F, 0.0399F, -0.2941F, -0.1368F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bone2.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(538, 364).cuboid(12.9203F, -1.7218F, 27.7361F, 12.0F, 6.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-34.2846F, -0.8416F, 11.9129F, 0.0876F, 0.2362F, -0.1984F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone2.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(538, 347).cuboid(-24.9203F, -1.7218F, 27.7361F, 12.0F, 6.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(34.0314F, -0.8416F, 11.9129F, 0.0876F, -0.2362F, 0.1984F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bone2.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(396, 270).cuboid(16.9031F, -1.7218F, -30.222F, 11.0F, 4.0F, 48.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-31.4479F, 10.4913F, 12.996F, 0.1983F, -0.2133F, -0.6885F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bone2.addChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(378, 93).cuboid(-27.9031F, -1.7218F, -30.222F, 11.0F, 4.0F, 48.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(31.1947F, 10.4913F, 12.996F, 0.1983F, 0.2133F, 0.6885F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bone2.addChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 185).cuboid(-26.0F, 0.0F, 0.0F, 26.0F, 1.0F, 84.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.5302F, -1.0158F, -74.8728F, 0.0399F, 0.2941F, 0.1368F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bone2.addChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(232, 0).cuboid(-8.0F, 0.0F, 0.0F, 8.0F, 2.0F, 91.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.5302F, -1.0158F, -74.8728F, 0.0F, 0.2967F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bone2.addChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(406, 473)
            .cuboid(-5.0F, -3.0F, -39.0F, 10.0F, 6.0F, 29.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(484, 525)
            .cuboid(-6.0F, -3.0F, -10.0F, 12.0F, 6.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1266F, -8.0158F, 1.1272F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bone2.addChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(340, 363)
            .cuboid(-3.0F, 0.0F, 7.0F, 6.0F, 2.0F, 61.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(230, 93)
            .cuboid(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 72.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1266F, -1.0158F, -74.8728F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bone2.addChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(366, 497).cuboid(-4.0F, -1.0F, -4.0F, 8.0F, 3.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1266F, -1.0158F, -74.8728F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend1 = bone2.addChild(
         "bend1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(152, 511)
            .cuboid(-1.0F, 0.0F, -2.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(398, 497)
            .cuboid(-1.0F, 0.0F, 1.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-19.3391F, 5.3595F, 8.7214F, 0.0F, 0.0F, 0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend2 = bend1.addChild(
         "bend2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 536)
            .cuboid(-1.0348F, 0.774F, -8.25F, 8.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(474, 420)
            .cuboid(-1.0348F, -1.226F, -1.25F, 5.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0348F, 8.226F, -0.25F, 0.0F, 0.0F, -0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bend2.addChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(338, 167)
            .cuboid(0.0F, -0.5F, -6.0F, 4.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(486, 347)
            .cuboid(0.0F, -2.5F, 1.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.5097F, -1.4079F, -2.25F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone3 = bend2.addChild(
         "bone3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(152, 521).cuboid(-1.0F, -8.5F, -0.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(4.5047F, 0.2866F, 0.25F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend3 = bone2.addChild(
         "bend3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(152, 511)
            .mirrored()
            .cuboid(-1.0F, 0.0F, -2.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(398, 497)
            .mirrored()
            .cuboid(-1.0F, 0.0F, 1.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(19.0859F, 5.3595F, 8.7214F, 0.0F, 0.0F, -0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend4 = bend3.addChild(
         "bend4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 536)
            .mirrored()
            .cuboid(-6.9652F, 0.774F, -8.25F, 8.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(474, 420)
            .mirrored()
            .cuboid(-3.9652F, -1.226F, -1.25F, 5.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.0348F, 8.226F, -0.25F, 0.0F, 0.0F, 0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bend4.addChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(338, 167)
            .mirrored()
            .cuboid(-4.0F, -0.5F, -6.0F, 4.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(486, 347)
            .mirrored()
            .cuboid(-4.0F, -2.5F, 1.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(3.5097F, -1.4079F, -2.25F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone4 = bend4.addChild(
         "bone4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(152, 521)
            .mirrored()
            .cuboid(-1.0F, -8.5F, -0.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(-4.5047F, 0.2866F, 0.25F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend5 = bone2.addChild(
         "bend5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(162, 491)
            .cuboid(1.4167F, -0.742F, -1.0116F, 1.0F, 12.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(284, 510)
            .cuboid(-2.5833F, -0.742F, -1.0116F, 1.0F, 12.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0433F, 3.645F, -51.3619F, -0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend6 = bend5.addChild(
         "bend6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(538, 381)
            .cuboid(-3.1066F, 0.774F, -4.8442F, 6.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(200, 548)
            .cuboid(-1.6066F, -1.226F, -1.8449F, 3.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0232F, 10.484F, -0.1667F, 0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bend6.addChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(538, 398).cuboid(-4.0F, -0.5F, -6.0F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.3683F, -1.4079F, 1.1558F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bend6.addChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(318, 535).cuboid(2.0F, -0.5F, -6.0F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.5814F, -1.4079F, 1.1558F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone = bend6.addChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(290, 510).cuboid(-0.5F, -11.0F, -1.0F, 1.0F, 12.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.1066F, -0.2134F, 4.6946F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition Engine = bone2.addChild(
         "Engine",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(396, 353)
            .cuboid(7.0F, -10.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(200, 537)
            .cuboid(4.5F, -9.0355F, -2.2064F, 10.0F, 10.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(1.3734F, 10.0197F, 40.1272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = Engine.addChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(530, 192).cuboid(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, -3.0F, -9.5F, 0.0F, 0.0F, -2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = Engine.addChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(530, 212).cuboid(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, -3.0F, -9.5F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = Engine.addChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(360, 533).cuboid(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, -3.0F, -9.5F, 0.0F, 0.0F, 2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = Engine.addChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(514, 268)
            .cuboid(-2.5F, -6.0355F, -15.5F, 6.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(540, 155)
            .cuboid(-2.5F, -6.0355F, 3.5F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, -4.0F, -9.5F, 0.0F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = Engine.addChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(530, 0).cuboid(-9.5F, -6.0355F, -19.0F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(8.7929F, 3.9F, -25.0F, 0.0F, 0.3927F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = Engine.addChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(484, 498).cuboid(-6.7426F, -1.7929F, -26.0F, 4.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(8.7929F, 2.9761F, -24.6173F, 0.2849F, 0.274F, 2.3957F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = Engine.addChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(378, 145).cuboid(-2.5F, -0.0355F, -26.0F, 5.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, 2.3228F, -24.3467F, 0.3927F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = Engine.addChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(300, 508).cuboid(2.7426F, -1.7929F, -26.0F, 4.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(10.2071F, 2.9761F, -24.6173F, 0.2849F, -0.274F, -2.3957F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = Engine.addChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(530, 20).cuboid(4.5F, -6.0355F, -19.0F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(10.2071F, 3.9F, -25.0F, 0.0F, -0.3927F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = Engine.addChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(540, 165).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = Engine.addChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(540, 145).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = Engine.addChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(102, 539).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = Engine.addChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(74, 539).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = Engine.addChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(520, 67).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = Engine.addChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(424, 353).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition Engine2 = bone2.addChild(
         "Engine2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(540, 175)
            .cuboid(-12.0F, -10.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(130, 539)
            .cuboid(-14.5F, -9.0355F, -2.2064F, 10.0F, 10.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-1.6266F, 10.0197F, 40.1272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = Engine2.addChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(270, 535).cuboid(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, -3.0F, -9.5F, 0.0F, 0.0F, 2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = Engine2.addChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(222, 535).cuboid(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, -3.0F, -9.5F, 0.0F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = Engine2.addChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(534, 525).cuboid(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, -3.0F, -9.5F, 0.0F, 0.0F, -2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = Engine2.addChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(520, 47)
            .cuboid(-3.5F, -6.0355F, -15.5F, 6.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(532, 545)
            .cuboid(-2.5F, -6.0355F, 3.5F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, -4.0F, -9.5F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = Engine2.addChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(534, 232).cuboid(4.5F, -6.0355F, -19.0F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-8.7929F, 3.9F, -25.0F, 0.0F, -0.3927F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = Engine2.addChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(162, 510).cuboid(2.7426F, -1.7929F, -26.0F, 4.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-8.7929F, 2.9761F, -24.6173F, 0.2849F, -0.274F, -2.3957F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = Engine2.addChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(496, 78).cuboid(-2.5F, -0.0355F, -26.0F, 5.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, 2.3228F, -24.3467F, 0.3927F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = Engine2.addChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 509).cuboid(-6.7426F, -1.7929F, -26.0F, 4.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-10.2071F, 2.9761F, -24.6173F, 0.2849F, 0.274F, 2.3957F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = Engine2.addChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(408, 533).cuboid(-9.5F, -6.0355F, -19.0F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-10.2071F, 3.9F, -25.0F, 0.0F, 0.3927F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = Engine2.addChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(548, 67).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = Engine2.addChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(544, 508).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = Engine2.addChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(504, 544).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = Engine2.addChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(544, 498).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = Engine2.addChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(476, 544).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = Engine2.addChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(542, 308).cuboid(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone5 = bone2.addChild(
         "bone5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(230, 167)
            .cuboid(-26.5F, -4.5335F, 0.6922F, 53.0F, 8.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(230, 176)
            .cuboid(-12.5F, -10.5335F, 0.6922F, 25.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(496, 130)
            .cuboid(-5.0F, -12.4641F, 0.2679F, 10.0F, 8.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(406, 426)
            .cuboid(-6.0F, 3.6144F, -41.9613F, 12.0F, 6.0F, 41.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(330, 176)
            .cuboid(-1.0F, -7.4641F, -14.732F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(470, 353)
            .cuboid(-0.5F, -4.4641F, -14.232F, 1.0F, 8.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.1266F, 1.5177F, 32.2286F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r65 = bone5.addChild(
         "cube_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(378, 172).cuboid(-5.0F, -1.0F, -10.0F, 10.0F, 4.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -9.5335F, -21.1014F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r66 = bone5.addChild(
         "cube_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(452, 353).cuboid(-4.0F, -6.0F, -2.0F, 8.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -8.5335F, -21.1014F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r67 = bone5.addChild(
         "cube_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(302, 426).cuboid(24.9031F, -1.7218F, -30.222F, 4.0F, 6.0F, 48.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-34.158F, -2.2593F, -20.3157F, 0.0886F, -0.2767F, -0.2432F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r68 = bone5.addChild(
         "cube_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(514, 288).cuboid(-2.5F, -6.0355F, -15.5F, 6.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-11.0F, 4.502F, -1.6014F, 0.0F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r69 = bone5.addChild(
         "cube_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 456).cuboid(-2.0F, -3.0F, -24.0F, 3.0F, 11.0F, 42.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.1247F, -3.0425F, -16.0546F, -0.0906F, -0.2761F, 0.3926F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r70 = bone5.addChild(
         "cube_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(198, 426).cuboid(-28.9031F, -1.7218F, -30.222F, 4.0F, 6.0F, 48.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(34.158F, -2.2593F, -20.3157F, 0.0886F, 0.2767F, 0.2432F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r71 = bone5.addChild(
         "cube_r71",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(292, 183)
            .cuboid(0.0F, -4.0F, 5.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(284, 183)
            .cuboid(-1.0F, -5.0F, 5.0F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(440, 192)
            .cuboid(-1.0F, -3.0F, -24.0F, 3.0F, 11.0F, 42.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.1247F, -3.0425F, -16.0546F, -0.0906F, 0.2761F, -0.3926F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r72 = bone5.addChild(
         "cube_r72",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(512, 451).cuboid(-3.5F, -6.0355F, -15.5F, 6.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(11.0F, 4.502F, -1.6014F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r73 = bone5.addChild(
         "cube_r73",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(284, 176)
            .cuboid(-3.0F, -3.5F, -4.5F, 6.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(308, 176)
            .cuboid(-4.0F, -2.5F, -1.5F, 8.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -14.3973F, 2.4503F, -0.3054F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r74 = bone5.addChild(
         "cube_r74",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(514, 308).cuboid(-5.0F, -4.0F, -2.0F, 10.0F, 10.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 1024, 1024);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createGlassLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition glass = partdefinition.addChild(
         "glass",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(474, 353)
            .cuboid(-5.0F, -12.0F, 17.0F, 10.0F, 12.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(534, 252)
            .cuboid(4.5F, -8.025F, 31.9904F, 8.0F, 8.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(530, 130)
            .cuboid(-12.5F, -8.025F, 31.9904F, 8.0F, 8.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 3.0F, -25.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition glass_r1 = glass.addChild(
         "glass_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(474, 387).cuboid(-5.0F, 0.0F, -22.0F, 10.0F, 11.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -12.0F, 17.0F, 0.5498F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition glass_r2 = glass.addChild(
         "glass_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(172, 480).cuboid(-5.0F, -8.0F, 11.0F, 10.0F, 8.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.4851F, 0.0F, 2.6906F, 0.0F, 0.3491F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition glass_r3 = glass.addChild(
         "glass_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(236, 480).cuboid(-5.0F, -8.0F, 11.0F, 10.0F, 8.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.4851F, 0.0F, 2.6906F, 0.0F, -0.3491F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 1024, 1024);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public void setupAnim(StarFighter entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.root.traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      this.updateAnimation(entity.takeoffAnimState, ANIMATION, ageInTicks, entity.flightAnim() ? 1.0F : -1.0F);
   }
}
