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
public class Delta7BModel extends che.swgc.client.compat.model.SinglePartEntityModel<che.swgc.client.render.SwgcMobRenderState> {
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
      super(root);
      this.root = root;
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone2 = partdefinition.addOrReplaceChild(
         "bone2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(48, 539)
            .addBox(-1.1266F, 0.4192F, -68.1097F, 2.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(430, 78)
            .addBox(-12.6266F, -14.0158F, 39.1176F, 25.0F, 8.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(300, 480)
            .addBox(-11.1266F, -7.0158F, 28.6272F, 22.0F, 17.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(366, 479)
            .addBox(-0.1266F, -5.0158F, 47.1272F, 0.0F, 15.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(456, 533)
            .addBox(-1.1266F, -5.0158F, 39.1272F, 2.0F, 15.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(440, 245)
            .addBox(-13.1266F, -7.0158F, 36.1272F, 26.0F, 2.0F, 21.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(512, 420)
            .addBox(-0.1266F, -18.0158F, 39.1272F, 0.0F, 11.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(172, 456)
            .addBox(-1.1266F, -15.0158F, 39.1272F, 2.0F, 8.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.1266F, 9.0158F, -25.1272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone2.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(90, 491).addBox(-20.0F, -4.0F, -2.0F, 23.0F, 7.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(8.3734F, -9.5676F, 45.6552F, -0.5672F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bone2.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 363).addBox(-0.3F, 0.0F, 0.0917F, 8.0F, 2.0F, 91.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-5.3948F, -1.0158F, -74.8728F, -0.0456F, -0.2964F, 0.0133F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bone2.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(222, 510).addBox(37.1168F, 0.0F, 79.1345F, 8.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(5.1415F, -1.0408F, -74.8728F, -0.0447F, -0.218F, 0.0097F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bone2.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(486, 322).addBox(-3.5361F, 0.0F, 88.4059F, 11.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(5.1415F, -1.0158F, -74.8728F, -0.044F, 0.1308F, -0.0057F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bone2.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(360, 508).addBox(-45.1168F, 0.0F, 79.1345F, 8.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-5.3948F, -1.0408F, -74.8728F, -0.0447F, 0.218F, -0.0097F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bone2.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(484, 473).addBox(-7.4639F, 0.0F, 88.4059F, 11.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-5.3948F, -1.0158F, -74.8728F, -0.044F, -0.1308F, 0.0057F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bone2.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 511).addBox(44.1168F, -2.0F, 79.1345F, 1.0F, 6.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.1852F, 0.9842F, -74.5804F, 0.0F, -0.2182F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bone2.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 511).addBox(-45.1168F, -2.0F, 79.1345F, 1.0F, 6.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.4385F, 0.9842F, -74.5804F, 0.0F, 0.2182F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bone2.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(440, 145).addBox(0.7F, 0.0F, 48.0917F, 7.0F, 4.0F, 43.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-5.3948F, -0.9408F, -74.8728F, 0.0F, -0.2967F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bone2.addOrReplaceChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(430, 0).addBox(-7.7F, 0.0F, 48.0917F, 7.0F, 4.0F, 43.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(5.1415F, -0.9408F, -74.8728F, 0.0F, 0.2967F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bone2.addOrReplaceChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(198, 270).addBox(-7.7F, 0.0F, 0.0917F, 8.0F, 2.0F, 91.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(5.1415F, -1.0158F, -74.8728F, -0.0456F, 0.2964F, -0.0133F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone2.addOrReplaceChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 270).addBox(0.0F, 0.0F, 0.0F, 8.0F, 2.0F, 91.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-5.7835F, -1.0158F, -74.8728F, 0.0F, -0.2967F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone2.addOrReplaceChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(496, 105).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(32.1361F, -1.0158F, 12.1509F, 0.0894F, -0.2173F, -0.0193F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone2.addOrReplaceChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(422, 508).addBox(0.0F, 0.0F, 0.0F, 8.0F, 2.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-32.3893F, -1.0158F, 12.1509F, 0.0894F, 0.2173F, 0.0193F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone2.addOrReplaceChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(430, 47).addBox(7.8242F, 0.6498F, -7.3815F, 16.0F, 2.0F, 29.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-32.3893F, -1.0158F, 12.1509F, 0.0871F, -0.119F, -0.1418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone2.addOrReplaceChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(396, 322).addBox(-23.8242F, 0.6498F, -7.3815F, 16.0F, 2.0F, 29.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(32.1361F, -1.0158F, 12.1509F, 0.0871F, 0.119F, 0.1418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone2.addOrReplaceChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(90, 456).addBox(-6.0F, -12.2884F, 39.8589F, 12.0F, 6.0F, 29.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1266F, -0.6158F, -77.8728F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone2.addOrReplaceChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(198, 363)
            .addBox(-5.0F, -1.2653F, 10.0757F, 10.0F, 2.0F, 61.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(414, 172)
            .addBox(-1.0F, -0.2653F, -0.9243F, 2.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1266F, -0.6158F, -77.8728F, -0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bone2.addOrReplaceChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .mirror()
            .addBox(-21.6367F, 0.5831F, 4.5228F, 24.0F, 1.0F, 92.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1266F, -0.6158F, -77.8728F, -0.085F, 0.2879F, -0.1497F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bone2.addOrReplaceChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 0).addBox(-2.3633F, 0.5831F, 4.5228F, 24.0F, 1.0F, 92.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1266F, -0.6158F, -77.8728F, -0.085F, -0.2879F, 0.1497F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bone2.addOrReplaceChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(220, 185).addBox(0.0F, 0.0F, 0.0F, 26.0F, 1.0F, 84.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-5.7835F, -1.0158F, -74.8728F, 0.0399F, -0.2941F, -0.1368F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bone2.addOrReplaceChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(538, 364).addBox(12.9203F, -1.7218F, 27.7361F, 12.0F, 6.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-34.2846F, -0.8416F, 11.9129F, 0.0876F, 0.2362F, -0.1984F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone2.addOrReplaceChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(538, 347).addBox(-24.9203F, -1.7218F, 27.7361F, 12.0F, 6.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(34.0314F, -0.8416F, 11.9129F, 0.0876F, -0.2362F, 0.1984F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bone2.addOrReplaceChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(396, 270).addBox(16.9031F, -1.7218F, -30.222F, 11.0F, 4.0F, 48.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-31.4479F, 10.4913F, 12.996F, 0.1983F, -0.2133F, -0.6885F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bone2.addOrReplaceChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(378, 93).addBox(-27.9031F, -1.7218F, -30.222F, 11.0F, 4.0F, 48.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(31.1947F, 10.4913F, 12.996F, 0.1983F, 0.2133F, 0.6885F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bone2.addOrReplaceChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 185).addBox(-26.0F, 0.0F, 0.0F, 26.0F, 1.0F, 84.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(5.5302F, -1.0158F, -74.8728F, 0.0399F, 0.2941F, 0.1368F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bone2.addOrReplaceChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(232, 0).addBox(-8.0F, 0.0F, 0.0F, 8.0F, 2.0F, 91.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(5.5302F, -1.0158F, -74.8728F, 0.0F, 0.2967F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bone2.addOrReplaceChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(406, 473)
            .addBox(-5.0F, -3.0F, -39.0F, 10.0F, 6.0F, 29.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(484, 525)
            .addBox(-6.0F, -3.0F, -10.0F, 12.0F, 6.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1266F, -8.0158F, 1.1272F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bone2.addOrReplaceChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(340, 363)
            .addBox(-3.0F, 0.0F, 7.0F, 6.0F, 2.0F, 61.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(230, 93)
            .addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 72.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1266F, -1.0158F, -74.8728F, 0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bone2.addOrReplaceChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(366, 497).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 3.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1266F, -1.0158F, -74.8728F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend1 = bone2.addOrReplaceChild(
         "bend1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(152, 511)
            .addBox(-1.0F, 0.0F, -2.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(398, 497)
            .addBox(-1.0F, 0.0F, 1.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-19.3391F, 5.3595F, 8.7214F, 0.0F, 0.0F, 0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend2 = bend1.addOrReplaceChild(
         "bend2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 536)
            .addBox(-1.0348F, 0.774F, -8.25F, 8.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(474, 420)
            .addBox(-1.0348F, -1.226F, -1.25F, 5.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0348F, 8.226F, -0.25F, 0.0F, 0.0F, -0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bend2.addOrReplaceChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(338, 167)
            .addBox(0.0F, -0.5F, -6.0F, 4.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(486, 347)
            .addBox(0.0F, -2.5F, 1.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.5097F, -1.4079F, -2.25F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone3 = bend2.addOrReplaceChild(
         "bone3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(152, 521).addBox(-1.0F, -8.5F, -0.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(4.5047F, 0.2866F, 0.25F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend3 = bone2.addOrReplaceChild(
         "bend3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(152, 511)
            .mirror()
            .addBox(-1.0F, 0.0F, -2.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(398, 497)
            .mirror()
            .addBox(-1.0F, 0.0F, 1.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(19.0859F, 5.3595F, 8.7214F, 0.0F, 0.0F, -0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend4 = bend3.addOrReplaceChild(
         "bend4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 536)
            .mirror()
            .addBox(-6.9652F, 0.774F, -8.25F, 8.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(474, 420)
            .mirror()
            .addBox(-3.9652F, -1.226F, -1.25F, 5.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0348F, 8.226F, -0.25F, 0.0F, 0.0F, 0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bend4.addOrReplaceChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(338, 167)
            .mirror()
            .addBox(-4.0F, -0.5F, -6.0F, 4.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(486, 347)
            .mirror()
            .addBox(-4.0F, -2.5F, 1.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.5097F, -1.4079F, -2.25F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone4 = bend4.addOrReplaceChild(
         "bone4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(152, 521)
            .mirror()
            .addBox(-1.0F, -8.5F, -0.5F, 2.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(-4.5047F, 0.2866F, 0.25F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend5 = bone2.addOrReplaceChild(
         "bend5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(162, 491)
            .addBox(1.4167F, -0.742F, -1.0116F, 1.0F, 12.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(284, 510)
            .addBox(-2.5833F, -0.742F, -1.0116F, 1.0F, 12.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0433F, 3.645F, -51.3619F, -0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bend6 = bend5.addOrReplaceChild(
         "bend6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(538, 381)
            .addBox(-3.1066F, 0.774F, -4.8442F, 6.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(200, 548)
            .addBox(-1.6066F, -1.226F, -1.8449F, 3.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0232F, 10.484F, -0.1667F, 0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bend6.addOrReplaceChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(538, 398).addBox(-4.0F, -0.5F, -6.0F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(5.3683F, -1.4079F, 1.1558F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bend6.addOrReplaceChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(318, 535).addBox(2.0F, -0.5F, -6.0F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-5.5814F, -1.4079F, 1.1558F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone = bend6.addOrReplaceChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(290, 510).addBox(-0.5F, -11.0F, -1.0F, 1.0F, 12.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-0.1066F, -0.2134F, 4.6946F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition Engine = bone2.addOrReplaceChild(
         "Engine",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(396, 353)
            .addBox(7.0F, -10.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(200, 537)
            .addBox(4.5F, -9.0355F, -2.2064F, 10.0F, 10.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(1.3734F, 10.0197F, 40.1272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = Engine.addOrReplaceChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(530, 192).addBox(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, -3.0F, -9.5F, 0.0F, 0.0F, -2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = Engine.addOrReplaceChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(530, 212).addBox(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, -3.0F, -9.5F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = Engine.addOrReplaceChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(360, 533).addBox(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, -3.0F, -9.5F, 0.0F, 0.0F, 2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = Engine.addOrReplaceChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(514, 268)
            .addBox(-2.5F, -6.0355F, -15.5F, 6.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(540, 155)
            .addBox(-2.5F, -6.0355F, 3.5F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, -4.0F, -9.5F, 0.0F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = Engine.addOrReplaceChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(530, 0).addBox(-9.5F, -6.0355F, -19.0F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(8.7929F, 3.9F, -25.0F, 0.0F, 0.3927F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = Engine.addOrReplaceChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(484, 498).addBox(-6.7426F, -1.7929F, -26.0F, 4.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(8.7929F, 2.9761F, -24.6173F, 0.2849F, 0.274F, 2.3957F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = Engine.addOrReplaceChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(378, 145).addBox(-2.5F, -0.0355F, -26.0F, 5.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, 2.3228F, -24.3467F, 0.3927F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = Engine.addOrReplaceChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(300, 508).addBox(2.7426F, -1.7929F, -26.0F, 4.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(10.2071F, 2.9761F, -24.6173F, 0.2849F, -0.274F, -2.3957F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = Engine.addOrReplaceChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(530, 20).addBox(4.5F, -6.0355F, -19.0F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(10.2071F, 3.9F, -25.0F, 0.0F, -0.3927F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = Engine.addOrReplaceChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(540, 165).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = Engine.addOrReplaceChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(540, 145).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = Engine.addOrReplaceChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(102, 539).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = Engine.addOrReplaceChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(74, 539).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = Engine.addOrReplaceChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(520, 67).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = Engine.addOrReplaceChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(424, 353).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition Engine2 = bone2.addOrReplaceChild(
         "Engine2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(540, 175)
            .addBox(-12.0F, -10.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(130, 539)
            .addBox(-14.5F, -9.0355F, -2.2064F, 10.0F, 10.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-1.6266F, 10.0197F, 40.1272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = Engine2.addOrReplaceChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(270, 535).addBox(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, -3.0F, -9.5F, 0.0F, 0.0F, 2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = Engine2.addOrReplaceChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(222, 535).addBox(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, -3.0F, -9.5F, 0.0F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = Engine2.addOrReplaceChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(534, 525).addBox(-2.5F, -6.0355F, -15.5F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, -3.0F, -9.5F, 0.0F, 0.0F, -2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = Engine2.addOrReplaceChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(520, 47)
            .addBox(-3.5F, -6.0355F, -15.5F, 6.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(532, 545)
            .addBox(-2.5F, -6.0355F, 3.5F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, -4.0F, -9.5F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = Engine2.addOrReplaceChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(534, 232).addBox(4.5F, -6.0355F, -19.0F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-8.7929F, 3.9F, -25.0F, 0.0F, -0.3927F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = Engine2.addOrReplaceChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(162, 510).addBox(2.7426F, -1.7929F, -26.0F, 4.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-8.7929F, 2.9761F, -24.6173F, 0.2849F, -0.274F, -2.3957F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = Engine2.addOrReplaceChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(496, 78).addBox(-2.5F, -0.0355F, -26.0F, 5.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, 2.3228F, -24.3467F, 0.3927F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = Engine2.addOrReplaceChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 509).addBox(-6.7426F, -1.7929F, -26.0F, 4.0F, 1.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-10.2071F, 2.9761F, -24.6173F, 0.2849F, 0.274F, 2.3957F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = Engine2.addOrReplaceChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(408, 533).addBox(-9.5F, -6.0355F, -19.0F, 5.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-10.2071F, 3.9F, -25.0F, 0.0F, 0.3927F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = Engine2.addOrReplaceChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(548, 67).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = Engine2.addOrReplaceChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(544, 508).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, -2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = Engine2.addOrReplaceChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(504, 544).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = Engine2.addOrReplaceChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(544, 498).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 2.3562F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = Engine2.addOrReplaceChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(476, 544).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = Engine2.addOrReplaceChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(542, 308).addBox(-2.5F, -6.0355F, -6.0F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone5 = bone2.addOrReplaceChild(
         "bone5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(230, 167)
            .addBox(-26.5F, -4.5335F, 0.6922F, 53.0F, 8.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(230, 176)
            .addBox(-12.5F, -10.5335F, 0.6922F, 25.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(496, 130)
            .addBox(-5.0F, -12.4641F, 0.2679F, 10.0F, 8.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(406, 426)
            .addBox(-6.0F, 3.6144F, -41.9613F, 12.0F, 6.0F, 41.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(330, 176)
            .addBox(-1.0F, -7.4641F, -14.732F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(470, 353)
            .addBox(-0.5F, -4.4641F, -14.232F, 1.0F, 8.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-0.1266F, 1.5177F, 32.2286F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r65 = bone5.addOrReplaceChild(
         "cube_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(378, 172).addBox(-5.0F, -1.0F, -10.0F, 10.0F, 4.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -9.5335F, -21.1014F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r66 = bone5.addOrReplaceChild(
         "cube_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(452, 353).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -8.5335F, -21.1014F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r67 = bone5.addOrReplaceChild(
         "cube_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(302, 426).addBox(24.9031F, -1.7218F, -30.222F, 4.0F, 6.0F, 48.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-34.158F, -2.2593F, -20.3157F, 0.0886F, -0.2767F, -0.2432F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r68 = bone5.addOrReplaceChild(
         "cube_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(514, 288).addBox(-2.5F, -6.0355F, -15.5F, 6.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-11.0F, 4.502F, -1.6014F, 0.0F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r69 = bone5.addOrReplaceChild(
         "cube_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 456).addBox(-2.0F, -3.0F, -24.0F, 3.0F, 11.0F, 42.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-5.1247F, -3.0425F, -16.0546F, -0.0906F, -0.2761F, 0.3926F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r70 = bone5.addOrReplaceChild(
         "cube_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(198, 426).addBox(-28.9031F, -1.7218F, -30.222F, 4.0F, 6.0F, 48.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(34.158F, -2.2593F, -20.3157F, 0.0886F, 0.2767F, 0.2432F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r71 = bone5.addOrReplaceChild(
         "cube_r71",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(292, 183)
            .addBox(0.0F, -4.0F, 5.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(284, 183)
            .addBox(-1.0F, -5.0F, 5.0F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(440, 192)
            .addBox(-1.0F, -3.0F, -24.0F, 3.0F, 11.0F, 42.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(5.1247F, -3.0425F, -16.0546F, -0.0906F, 0.2761F, -0.3926F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r72 = bone5.addOrReplaceChild(
         "cube_r72",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(512, 451).addBox(-3.5F, -6.0355F, -15.5F, 6.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(11.0F, 4.502F, -1.6014F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r73 = bone5.addOrReplaceChild(
         "cube_r73",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(284, 176)
            .addBox(-3.0F, -3.5F, -4.5F, 6.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(308, 176)
            .addBox(-4.0F, -2.5F, -1.5F, 8.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -14.3973F, 2.4503F, -0.3054F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r74 = bone5.addOrReplaceChild(
         "cube_r74",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(514, 308).addBox(-5.0F, -4.0F, -2.0F, 10.0F, 10.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 1024, 1024);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createGlassLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition glass = partdefinition.addOrReplaceChild(
         "glass",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(474, 353)
            .addBox(-5.0F, -12.0F, 17.0F, 10.0F, 12.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(534, 252)
            .addBox(4.5F, -8.025F, 31.9904F, 8.0F, 8.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(530, 130)
            .addBox(-12.5F, -8.025F, 31.9904F, 8.0F, 8.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 3.0F, -25.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition glass_r1 = glass.addOrReplaceChild(
         "glass_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(474, 387).addBox(-5.0F, 0.0F, -22.0F, 10.0F, 11.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -12.0F, 17.0F, 0.5498F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition glass_r2 = glass.addOrReplaceChild(
         "glass_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(172, 480).addBox(-5.0F, -8.0F, 11.0F, 10.0F, 8.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.4851F, 0.0F, 2.6906F, 0.0F, 0.3491F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition glass_r3 = glass.addOrReplaceChild(
         "glass_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(236, 480).addBox(-5.0F, -8.0F, 11.0F, 10.0F, 8.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.4851F, 0.0F, 2.6906F, 0.0F, -0.3491F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 1024, 1024);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public void setupAnim(che.swgc.client.render.SwgcMobRenderState state) {
      super.setupAnim(state);
      che.swgc.entity.StarFighter entity = (che.swgc.entity.StarFighter)state.entity;
      this.root.getAllParts().forEach(net.minecraft.client.model.geom.ModelPart::resetPose);
      this.updateAnimation(entity.takeoffAnimState, ANIMATION, state.ageInTicks);
   }
}
