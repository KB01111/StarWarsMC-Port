package che.swgc.client.model.entity;

import che.swgc.client.animation.AtrtAnimation;
import che.swgc.entity.Walker;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.resources.Identifier;
import net.minecraft.client.Minecraft;
import com.mojang.blaze3d.vertex.PoseStack;
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
import net.minecraft.client.player.LocalPlayer;

@javax.annotation.ParametersAreNonnullByDefault
public class AtrtModel<T extends Walker> extends che.swgc.client.compat.model.SinglePartEntityModel<T> implements RideableModel {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "atrt"), "main");
   private final net.minecraft.client.model.geom.ModelPart root;
   private final net.minecraft.client.model.geom.ModelPart body;
   private final net.minecraft.client.model.geom.ModelPart seat;
   private final net.minecraft.client.model.geom.ModelPart hideInFirstPerson;
   public float sprint;

   public AtrtModel(net.minecraft.client.model.geom.ModelPart root) {
      this.root = root.getChild("root");
      this.body = this.root.getChild("body");
      this.seat = this.body.getChild("seat");
      this.hideInFirstPerson = this.body.getChild("hide_in_first_person");
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition root = partdefinition.addChild("root", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = root.addChild("right_leg", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-9.0F, -46.0F, -11.0F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = right_leg.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(22, 115)
            .cuboid(-1.475F, -6.125F, -0.925F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(94, 126)
            .cuboid(-0.95F, -3.1F, -0.45F, 2.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.025F, -0.5216F, 5.0293F, 0.0615F, -0.0628F, 0.3967F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = right_leg.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 69).cuboid(-1.625F, -3.5F, -4.5F, 8.0F, 7.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.275F, 0.3264F, 0.8655F, 0.0698F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = right_leg.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(72, 89)
            .cuboid(-3.075F, -7.3595F, 0.1333F, 6.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(88, 0)
            .cuboid(-2.475F, -7.3595F, -0.4917F, 5.0F, 11.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.025F, 5.184F, 6.5593F, 1.2174F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = right_leg.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(124, 122).cuboid(-2.975F, -0.5894F, -0.9649F, 5.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.475F, 6.209F, 6.8593F, 1.8413F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = right_leg.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(124, 118).cuboid(-2.975F, -3.2095F, -1.1167F, 5.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.475F, 6.334F, 7.0843F, 1.2174F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = right_leg.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 22).cuboid(-2.5F, -1.45F, -0.275F, 5.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 4.9123F, 2.8506F, 0.7287F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone = right_leg.addChild("bone", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 5.0F, 10.5F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bone.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(84, 107).cuboid(-11.55F, -0.5F, -2.5F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.0F, 5.8663F, 4.0732F, -1.4879F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bone.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(112, 86).cuboid(-3.5F, -0.5F, -1.5F, 7.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.05F, -5.0794F, -0.4757F, -2.9801F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bone.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(92, 93).cuboid(-3.5F, -1.425F, 0.75F, 7.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.05F, 0.0272F, 4.9185F, -2.1555F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bone.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(112, 82).cuboid(-3.5F, 1.3F, -2.8F, 7.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.05F, 0.9686F, 6.9294F, -1.3832F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bone.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(82, 40).cuboid(-0.625F, -4.0F, -4.5F, 7.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.925F, 0.2014F, 1.2405F, -0.7898F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(108, 7)
            .cuboid(-9.5F, -6.475F, -0.5375F, 1.0F, 8.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(54, 17)
            .cuboid(-9.975F, -0.525F, -0.9625F, 2.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.0F, 6.1669F, -0.4563F, 0.7636F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(42, 110)
            .cuboid(0.925F, -11.3595F, 0.1333F, 2.0F, 15.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(50, 114)
            .cuboid(-2.925F, -7.3595F, 0.1333F, 2.0F, 11.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(128, 52)
            .cuboid(-1.475F, 2.4928F, -0.2016F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 83)
            .cuboid(-1.475F, -11.3595F, -0.4917F, 3.0F, 15.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.025F, 9.434F, 3.5093F, 0.4756F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(129, 31).cuboid(-1.975F, -4.6642F, -2.1142F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.475F, 10.1591F, 3.8093F, 0.1353F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(129, 27).cuboid(-1.975F, -0.5894F, -1.2899F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.475F, 10.1591F, 3.8093F, 0.7941F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(58, 132)
            .cuboid(0.975F, -2.675F, 0.8F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 132)
            .cuboid(-0.4F, -2.675F, 0.8F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.9F, 12.8117F, 8.4456F, 1.7322F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 132)
            .cuboid(-0.325F, -6.2F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(88, 66)
            .cuboid(-1.9F, -6.2F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 16.2F, 10.325F, 0.2051F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(83, 128).cuboid(-1.975F, -3.2095F, -1.1168F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.475F, 10.1591F, 3.8093F, 0.4756F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bone.addChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(96, 16)
            .cuboid(-1.625F, -2.5F, -3.5F, 2.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(22, 95)
            .cuboid(-8.65F, -2.5F, -3.5F, 2.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.1F, -0.2486F, 0.6405F, -0.7898F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone2 = bone.addChild("bone2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 14.5F, 7.0F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bone2.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(112, 17)
            .cuboid(-1.625F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(112, 7)
            .cuboid(-6.6F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.05F, 0.0264F, -0.1595F, -0.7898F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bone2.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(94, 121).cuboid(-1.5F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.45F, 11.7137F, 0.6463F, -0.4145F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bone2.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 115)
            .cuboid(-2.0F, -10.675F, -0.875F, 3.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 112)
            .cuboid(-2.0F, -9.0F, -3.85F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.475F, 13.725F, 0.625F, -0.048F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone2.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(74, 59).cuboid(-1.5F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.575F, 15.3887F, -2.3713F, 0.1789F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bone2.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(36, 110)
            .cuboid(-2.0F, -18.0F, -4.0F, 1.0F, 17.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(108, 28)
            .cuboid(-5.775F, -18.0F, -4.0F, 1.0F, 17.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.35F, 24.025F, 1.45F, -0.048F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bone2.addChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 72).cuboid(-2.0F, -24.0F, -5.0F, 3.0F, 22.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 23.575F, 1.95F, -0.048F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bone2.addChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 40).cuboid(-1.5F, -1.775F, 2.425F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.475F, 22.075F, -4.05F, 0.9599F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone3 = bone2.addChild(
         "bone3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(38, 101)
            .cuboid(-4.95F, 4.75F, -10.975F, 3.0F, 3.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(74, 66)
            .cuboid(-4.475F, 4.6F, -10.25F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(114, 52)
            .cuboid(2.425F, 4.6F, -10.25F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(92, 66)
            .cuboid(-2.0F, 5.075F, -10.25F, 4.0F, 2.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 29)
            .cuboid(-5.95F, 5.75F, -10.75F, 4.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(92, 99)
            .cuboid(2.05F, 5.75F, -10.75F, 4.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 103)
            .cuboid(1.95F, 4.75F, -10.975F, 3.0F, 3.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 18.75F, -2.25F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bone3.addChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(114, 58)
            .cuboid(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(58, 114)
            .cuboid(-7.525F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.25F, 0.0749F, -0.0203F, 2.1293F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bone3.addChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(24, 83)
            .cuboid(-3.7F, -1.875F, -5.0F, 2.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 83)
            .cuboid(0.8F, -1.875F, -5.0F, 2.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 17)
            .cuboid(-4.0F, -1.0F, -5.0F, 7.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.475F, 3.325F, -1.8F, 0.9599F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bone3.addChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 128).cuboid(-1.0F, -0.1F, -1.475F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.1F, 6.4666F, -13.6937F, 0.7636F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bone3.addChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(70, 124).cuboid(-1.425F, -3.45F, -8.425F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 5.375F, -3.675F, 0.3709F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bone3.addChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(122, 47)
            .cuboid(-1.0F, -0.825F, -2.0F, 2.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 107)
            .cuboid(-2.0F, -0.675F, -2.0F, 4.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 4.5983F, -7.6459F, 0.6327F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bone3.addChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(108, 0)
            .cuboid(-1.1375F, -0.5375F, -2.6375F, 3.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(84, 113)
            .cuboid(-1.3625F, -0.9625F, -2.8375F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.5625F, 5.9203F, -12.6665F, 0.5689F, -0.1809F, -0.1146F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bone3.addChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(104, 107)
            .cuboid(-1.85F, -0.5375F, -2.6125F, 3.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(112, 99)
            .cuboid(-0.65F, -0.9625F, -2.8375F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.6F, 5.9203F, -12.6665F, 0.5698F, 0.1883F, 0.1193F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bone3.addChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(30, 72).cuboid(-3.0F, -2.0F, -4.0F, 6.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 6.525F, -3.275F, 0.2574F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body = root.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-5.975F, -15.0986F, 2.8655F, 12.0F, 10.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(38, 37)
            .cuboid(-6.975F, -8.9986F, 10.8905F, 14.0F, 4.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(38, 49)
            .cuboid(-7.475F, -15.5486F, 13.3155F, 15.0F, 4.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(50, 110)
            .cuboid(-3.55F, -9.5486F, -8.5595F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 37)
            .cuboid(-4.35F, -16.0986F, -7.1345F, 9.0F, 10.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 129)
            .cuboid(2.55F, -9.5486F, -8.5595F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(112, 129)
            .cuboid(-0.35F, -8.0508F, -8.6823F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(38, 59)
            .cuboid(-3.9F, -6.8236F, 2.5155F, 8.0F, 3.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, -45.0F, -11.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = body.addChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(114, 118)
            .mirrored()
            .cuboid(-0.5F, -1.925F, -2.1F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(126, 58)
            .mirrored()
            .cuboid(-0.25F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(6.225F, -8.1899F, 5.6961F, 0.9468F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = body.addChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 73).cuboid(-2.6F, 2.05F, 0.0F, 6.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.125F, -21.8762F, 0.7201F, -1.3875F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = body.addChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 97).cuboid(-0.3F, -1.225F, -0.3F, 5.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.625F, -19.0264F, -1.61F, -0.6838F, -0.1935F, -0.5044F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = body.addChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 14).cuboid(-3.025F, -0.575F, -0.4F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-7.2432F, -22.1785F, 0.3425F, -0.981F, 0.576F, 0.1006F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = body.addChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 18).cuboid(-0.975F, -0.575F, -0.4F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(7.5682F, -22.1035F, 0.2425F, -0.981F, -0.576F, -0.1006F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = body.addChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(82, 47).cuboid(-4.7F, -1.225F, -0.3F, 5.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.3F, -19.1014F, -1.51F, -0.6838F, 0.1935F, 0.5044F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = body.addChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(114, 114)
            .cuboid(-3.55F, -2.125F, -8.2F, 6.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(54, 0)
            .cuboid(-4.075F, -3.5F, -6.5F, 7.0F, 7.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.825F, -12.9496F, 3.2276F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = body.addChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(82, 29).cuboid(7.1F, -5.7F, -3.275F, 8.0F, 6.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-11.0F, -1.1236F, 0.7905F, -0.192F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = body.addChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 124)
            .cuboid(-11.375F, -5.775F, 7.075F, 2.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(126, 8)
            .cuboid(-10.975F, -5.75F, 7.7F, 1.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(10.35F, -13.4736F, 12.6405F, 0.2574F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = body.addChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 129).cuboid(-0.5F, -16.15F, -1.925F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1F, -23.9754F, 15.8594F, -0.5018F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = body.addChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 131).cuboid(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1F, -23.9754F, 15.8594F, -0.2836F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = body.addChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 100).cuboid(-0.5F, -10.375F, -1.05F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1F, -23.9754F, 15.8594F, -0.4145F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = body.addChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(108, 131).cuboid(-0.5F, -7.425F, -0.825F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1F, -23.2504F, 19.0344F, -0.4145F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = body.addChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(18, 103).cuboid(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1F, -23.2504F, 19.0344F, -0.2836F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = body.addChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(94, 47)
            .cuboid(-10.9F, -5.5F, 6.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(74, 64)
            .cuboid(-10.9F, -5.5F, 10.325F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(100, 114)
            .cuboid(-11.375F, -6.325F, 6.5F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(56, 101)
            .cuboid(-11.375F, -4.5F, 6.5F, 2.0F, 8.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(10.35F, -18.3236F, 7.5905F, -0.1353F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = body.addChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(92, 76).cuboid(-2.5F, -0.925F, -1.1F, 10.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.35F, -10.2899F, -0.7289F, 0.9468F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = body.addChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(70, 104).cuboid(-0.6F, -2.0F, -0.425F, 1.0F, 7.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.775F, -10.0986F, -8.7595F, 0.1395F, 0.2464F, 0.0342F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = body.addChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(100, 52).cuboid(0.0F, -2.0F, -0.5F, 1.0F, 7.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-4.775F, -10.0986F, -8.7595F, 0.1395F, -0.2464F, -0.0342F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = body.addChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 34).cuboid(-1.0F, -1.5F, -1.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.2F, -9.5508F, -8.0573F, 0.0057F, -0.6894F, -0.0036F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = body.addChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 127).cuboid(1.0F, -2.0F, -0.5F, 2.0F, 7.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5F, -9.8486F, -9.0345F, 0.0F, 0.0044F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = body.addChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 95).cuboid(-3.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.25F, -8.7986F, -8.9595F, 0.0041F, -0.0015F, 0.3491F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = body.addChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 90).cuboid(1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.65F, -8.7986F, -8.9595F, 0.0041F, 0.0015F, -0.3491F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = body.addChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(126, 0)
            .cuboid(1.0F, -2.0F, -0.5F, 3.0F, 7.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 124)
            .cuboid(-6.0F, -2.0F, -0.5F, 3.0F, 7.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.2F, -10.0486F, -9.0345F, 0.0044F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = body.addChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(124, 126)
            .cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(102, 126)
            .cuboid(3.25F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.125F, -14.4236F, -7.3595F, 0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = body.addChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(46, 132)
            .cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(42, 132)
            .cuboid(-12.75F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(6.125F, -10.6986F, 12.2905F, 0.5629F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = body.addChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(8, 129)
            .cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(4, 129)
            .cuboid(11.75F, -1.0F, 0.0F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-6.125F, -9.2236F, 14.7405F, 2.3736F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = body.addChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(74, 128)
            .cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(30, 128)
            .cuboid(-12.75F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(6.125F, -13.5986F, 12.5155F, 0.1222F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = body.addChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(114, 118)
            .cuboid(-0.5F, -1.925F, -2.1F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(126, 58)
            .cuboid(-1.75F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-6.225F, -8.1899F, 5.6711F, 0.9468F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = body.addChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 25).cuboid(-1.625F, -2.5F, -3.5F, 25.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-11.0F, -1.1236F, 0.7905F, 0.0698F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition gun = body.addChild(
         "gun",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(116, 90)
            .cuboid(-0.025F, -0.175F, -3.6F, 1.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(70, 117)
            .cuboid(-0.025F, 1.25F, -4.225F, 1.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(42, 127)
            .cuboid(0.0F, 2.2F, -7.075F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(92, 82)
            .cuboid(0.475F, 1.975F, -13.075F, 0.0F, 1.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(100, 120)
            .cuboid(-0.05F, -0.379F, -8.0349F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(38, 95)
            .cuboid(-0.025F, -0.25F, -13.6F, 1.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(118, 76)
            .cuboid(-0.025F, 0.15F, -18.55F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.3F, -4.6968F, -4.8725F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = gun.addChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 129).cuboid(0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.475F, 2.45F, -9.95F, -0.1527F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r65 = gun.addChild(
         "cube_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 112).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.975F, 0.0F, 0.0F, 0.0F, 0.0161F, 0.8289F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r66 = gun.addChild(
         "cube_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(130, 113).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.2F, 3.0F, -1.85F, 0.2793F, 0.0F, -0.6981F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r67 = gun.addChild(
         "cube_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 128).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 0.7F, -9.025F, 0.0F, -0.0161F, -0.8289F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r68 = gun.addChild(
         "cube_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(22, 122).cuboid(-1.0F, -1.5F, -5.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.95F, 2.621F, -3.1349F, -0.1004F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r69 = gun.addChild(
         "cube_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(128, 64)
            .cuboid(-0.5F, -1.5F, -2.875F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(82, 121)
            .cuboid(-0.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.475F, 1.146F, -3.4349F, 0.9861F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r70 = gun.addChild(
         "cube_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(30, 69).cuboid(-0.5F, -1.275F, -3.15F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.475F, 1.146F, -3.4349F, 0.2836F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r71 = gun.addChild(
         "cube_r71",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(130, 76).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.275F, 3.0F, -1.85F, 0.2793F, 0.0F, 0.6981F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r72 = gun.addChild(
         "cube_r72",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(84, 104).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, 0.0F, -0.0161F, -0.8289F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition seat = body.addChild(
         "seat",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 57).cuboid(-3.975F, 0.0014F, -5.6345F, 8.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, -15.7F, 8.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hide_in_first_person = body.addChild("hide_in_first_person", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r73 = hide_in_first_person.addChild(
         "cube_r73",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(80, 49).cuboid(0.0F, -8.775F, 0.4F, 1.0F, 8.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-4.775F, -10.0986F, -8.7595F, 0.2655F, -0.2446F, -0.0657F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r74 = hide_in_first_person.addChild(
         "cube_r74",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 95).cuboid(-5.0F, -2.0F, -0.5F, 10.0F, 7.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.2F, -16.7737F, -9.9464F, 0.1789F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r75 = hide_in_first_person.addChild(
         "cube_r75",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(72, 72).cuboid(-0.625F, -8.775F, 0.4F, 1.0F, 8.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.775F, -10.0986F, -8.7595F, 0.2655F, 0.2446F, 0.0657F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r76 = hide_in_first_person.addChild(
         "cube_r76",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(114, 37).cuboid(-1.5F, -0.5F, -0.5F, 1.0F, 4.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.35F, -22.8489F, -7.2297F, 0.0F, 0.0F, -0.3578F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r77 = hide_in_first_person.addChild(
         "cube_r77",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(22, 132)
            .cuboid(0.4F, 1.95F, -1.8F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(114, 27)
            .cuboid(0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.825F, -22.8489F, -7.2297F, 0.0F, 0.0F, 0.3578F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r78 = hide_in_first_person.addChild(
         "cube_r78",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 68).cuboid(-0.35F, -0.35F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.3748F, -24.0921F, -3.8797F, 0.0F, 0.0F, -0.096F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r79 = hide_in_first_person.addChild(
         "cube_r79",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 131).cuboid(-0.65F, -2.35F, 0.125F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.8248F, -24.0921F, -5.2547F, -0.3476F, 0.0328F, 0.0902F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r80 = hide_in_first_person.addChild(
         "cube_r80",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 107).cuboid(-3.35F, 3.125F, 0.45F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.125F, -27.5489F, -7.8297F, 0.0F, 0.0F, -0.3578F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r81 = hide_in_first_person.addChild(
         "cube_r81",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(66, 128).cuboid(-0.65F, -0.35F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.8248F, -24.0921F, -3.8797F, 0.0F, 0.0F, 0.096F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r82 = hide_in_first_person.addChild(
         "cube_r82",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 132).cuboid(-1.4F, 1.95F, -1.8F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.3F, -22.8489F, -7.2297F, 0.0F, 0.0F, -0.3578F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r83 = hide_in_first_person.addChild(
         "cube_r83",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 122).cuboid(2.35F, 3.125F, 0.45F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.575F, -27.5489F, -7.8297F, 0.0F, 0.0F, 0.3578F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r84 = hide_in_first_person.addChild(
         "cube_r84",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(102, 131).cuboid(-0.35F, -2.35F, 0.125F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.3748F, -24.0921F, -5.2547F, -0.3476F, -0.0328F, -0.0902F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r85 = hide_in_first_person.addChild(
         "cube_r85",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 97).cuboid(-1.575F, -5.95F, 2.975F, 5.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.65F, -25.2261F, -7.8747F, -0.4625F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r86 = hide_in_first_person.addChild(
         "cube_r86",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 66).cuboid(-1.575F, -3.8F, 0.3F, 5.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.65F, -24.8511F, -6.4498F, -0.8552F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r87 = hide_in_first_person.addChild(
         "cube_r87",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 44).cuboid(-1.5F, -0.5F, -0.55F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.075F, -22.5739F, -7.2547F, -0.3136F, -0.2245F, 0.0721F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r88 = hide_in_first_person.addChild(
         "cube_r88",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(112, 90).cuboid(0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.5F, -22.5489F, -7.3047F, -0.3136F, 0.2245F, -0.0721F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r89 = hide_in_first_person.addChild(
         "cube_r89",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(112, 126).cuboid(-2.075F, -0.5F, -0.5F, 5.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.125F, -22.6489F, -7.6047F, -0.3054F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r90 = hide_in_first_person.addChild(
         "cube_r90",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(100, 47).cuboid(-4.5F, -2.0F, -0.5F, 10.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.275F, -19.9191F, -9.1351F, -0.6763F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = root.addChild("left_leg", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(9.0F, -46.0F, -11.0F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r91 = left_leg.addChild(
         "cube_r91",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(22, 115)
            .mirrored()
            .cuboid(-1.525F, -6.125F, -0.925F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(94, 126)
            .mirrored()
            .cuboid(-1.05F, -3.1F, -0.45F, 2.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.025F, -0.5216F, 5.0293F, 0.0615F, 0.0628F, -0.3967F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r92 = left_leg.addChild(
         "cube_r92",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(72, 89)
            .mirrored()
            .cuboid(-2.925F, -7.3595F, 0.1333F, 6.0F, 11.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(88, 0)
            .mirrored()
            .cuboid(-2.525F, -7.3595F, -0.4917F, 5.0F, 11.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.025F, 5.184F, 6.5593F, 1.2174F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r93 = left_leg.addChild(
         "cube_r93",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(124, 122)
            .mirrored()
            .cuboid(-2.025F, -0.5894F, -0.9649F, 5.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.475F, 6.209F, 6.8593F, 1.8413F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r94 = left_leg.addChild(
         "cube_r94",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(124, 118)
            .mirrored()
            .cuboid(-2.025F, -3.2095F, -1.1167F, 5.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.475F, 6.334F, 7.0843F, 1.2174F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r95 = left_leg.addChild(
         "cube_r95",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(126, 22)
            .mirrored()
            .cuboid(-2.5F, -1.45F, -0.275F, 5.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 4.9123F, 2.8506F, 0.7287F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r96 = left_leg.addChild(
         "cube_r96",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 69)
            .mirrored()
            .cuboid(-6.375F, -3.5F, -4.5F, 8.0F, 7.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(2.275F, 0.3264F, 0.8655F, 0.0698F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone4 = left_leg.addChild("bone4", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 5.0F, 10.5F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r97 = bone4.addChild(
         "cube_r97",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(84, 107)
            .mirrored()
            .cuboid(6.55F, -0.5F, -2.5F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-9.0F, 5.8663F, 4.0732F, -1.4879F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r98 = bone4.addChild(
         "cube_r98",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(112, 86)
            .mirrored()
            .cuboid(-3.5F, -0.5F, -1.5F, 7.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.05F, -5.0794F, -0.4757F, -2.9801F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r99 = bone4.addChild(
         "cube_r99",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(92, 93)
            .mirrored()
            .cuboid(-3.5F, -1.425F, 0.75F, 7.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.05F, 0.0272F, 4.9185F, -2.1555F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r100 = bone4.addChild(
         "cube_r100",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(112, 82)
            .mirrored()
            .cuboid(-3.5F, 1.3F, -2.8F, 7.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.05F, 0.9686F, 6.9294F, -1.3832F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r101 = bone4.addChild(
         "cube_r101",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(82, 40)
            .mirrored()
            .cuboid(-6.375F, -4.0F, -4.5F, 7.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(2.925F, 0.2014F, 1.2405F, -0.7898F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r102 = bone4.addChild(
         "cube_r102",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(108, 7)
            .mirrored()
            .cuboid(8.5F, -6.475F, -0.5375F, 1.0F, 8.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(54, 17)
            .mirrored()
            .cuboid(7.975F, -0.525F, -0.9625F, 2.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-9.0F, 6.1669F, -0.4563F, 0.7636F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r103 = bone4.addChild(
         "cube_r103",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(42, 110)
            .mirrored()
            .cuboid(-2.925F, -11.3595F, 0.1333F, 2.0F, 15.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(50, 114)
            .mirrored()
            .cuboid(0.925F, -7.3595F, 0.1333F, 2.0F, 11.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(128, 52)
            .mirrored()
            .cuboid(-1.525F, 2.4928F, -0.2016F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(48, 83)
            .mirrored()
            .cuboid(-1.525F, -11.3595F, -0.4917F, 3.0F, 15.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.025F, 9.434F, 3.5093F, 0.4756F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r104 = bone4.addChild(
         "cube_r104",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(129, 31)
            .mirrored()
            .cuboid(-1.025F, -4.6642F, -2.1142F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.475F, 10.1591F, 3.8093F, 0.1353F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r105 = bone4.addChild(
         "cube_r105",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(129, 27)
            .mirrored()
            .cuboid(-1.025F, -0.5894F, -1.2899F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.475F, 10.1591F, 3.8093F, 0.7941F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r106 = bone4.addChild(
         "cube_r106",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(58, 132)
            .mirrored()
            .cuboid(-1.975F, -2.675F, 0.8F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(62, 132)
            .mirrored()
            .cuboid(-0.6F, -2.675F, 0.8F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.9F, 12.8117F, 8.4456F, 1.7322F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r107 = bone4.addChild(
         "cube_r107",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 132)
            .mirrored()
            .cuboid(-0.675F, -6.2F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(88, 66)
            .mirrored()
            .cuboid(0.9F, -6.2F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 16.2F, 10.325F, 0.2051F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r108 = bone4.addChild(
         "cube_r108",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(83, 128)
            .mirrored()
            .cuboid(-1.025F, -3.2095F, -1.1168F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.475F, 10.1591F, 3.8093F, 0.4756F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r109 = bone4.addChild(
         "cube_r109",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(96, 16)
            .mirrored()
            .cuboid(-0.375F, -2.5F, -3.5F, 2.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(22, 95)
            .mirrored()
            .cuboid(6.65F, -2.5F, -3.5F, 2.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-4.1F, -0.2486F, 0.6405F, -0.7898F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone5 = bone4.addChild("bone5", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 14.5F, 7.0F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r110 = bone5.addChild(
         "cube_r110",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(112, 17)
            .mirrored()
            .cuboid(-0.375F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(112, 7)
            .mirrored()
            .cuboid(4.6F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-3.05F, 0.0264F, -0.1595F, -0.7898F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r111 = bone5.addChild(
         "cube_r111",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(94, 121)
            .mirrored()
            .cuboid(-0.5F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.45F, 11.7137F, 0.6463F, -0.4145F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r112 = bone5.addChild(
         "cube_r112",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 115)
            .mirrored()
            .cuboid(-1.0F, -10.675F, -0.875F, 3.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(0, 112)
            .mirrored()
            .cuboid(-1.0F, -9.0F, -3.85F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.475F, 13.725F, 0.625F, -0.048F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r113 = bone5.addChild(
         "cube_r113",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(74, 59)
            .mirrored()
            .cuboid(-0.5F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.575F, 15.3887F, -2.3713F, 0.1789F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r114 = bone5.addChild(
         "cube_r114",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(36, 110)
            .mirrored()
            .cuboid(1.0F, -18.0F, -4.0F, 1.0F, 17.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(108, 28)
            .mirrored()
            .cuboid(4.775F, -18.0F, -4.0F, 1.0F, 17.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-3.35F, 24.025F, 1.45F, -0.048F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r115 = bone5.addChild(
         "cube_r115",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(60, 72)
            .mirrored()
            .cuboid(-1.0F, -24.0F, -5.0F, 3.0F, 22.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 23.575F, 1.95F, -0.048F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r116 = bone5.addChild(
         "cube_r116",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(128, 40)
            .mirrored()
            .cuboid(-0.5F, -1.775F, 2.425F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.475F, 22.075F, -4.05F, 0.9599F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone6 = bone5.addChild(
         "bone6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(38, 101)
            .mirrored()
            .cuboid(1.95F, 4.75F, -10.975F, 3.0F, 3.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(74, 66)
            .mirrored()
            .cuboid(2.475F, 4.6F, -10.25F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(114, 52)
            .mirrored()
            .cuboid(-4.425F, 4.6F, -10.25F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(92, 66)
            .mirrored()
            .cuboid(-2.0F, 5.075F, -10.25F, 4.0F, 2.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(62, 29)
            .mirrored()
            .cuboid(1.95F, 5.75F, -10.75F, 4.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(92, 99)
            .mirrored()
            .cuboid(-6.05F, 5.75F, -10.75F, 4.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(0, 103)
            .mirrored()
            .cuboid(-4.95F, 4.75F, -10.975F, 3.0F, 3.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 18.75F, -2.25F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r117 = bone6.addChild(
         "cube_r117",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(114, 58)
            .mirrored()
            .cuboid(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(58, 114)
            .mirrored()
            .cuboid(5.525F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-3.25F, 0.0749F, -0.0203F, 2.1293F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r118 = bone6.addChild(
         "cube_r118",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(24, 83)
            .mirrored()
            .cuboid(1.7F, -1.875F, -5.0F, 2.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(0, 83)
            .mirrored()
            .cuboid(-2.8F, -1.875F, -5.0F, 2.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(62, 17)
            .mirrored()
            .cuboid(-3.0F, -1.0F, -5.0F, 7.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.475F, 3.325F, -1.8F, 0.9599F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r119 = bone6.addChild(
         "cube_r119",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(20, 128)
            .mirrored()
            .cuboid(-1.0F, -0.1F, -1.475F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-0.1F, 6.4666F, -13.6937F, 0.7636F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r120 = bone6.addChild(
         "cube_r120",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(70, 124)
            .mirrored()
            .cuboid(-1.575F, -3.45F, -8.425F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 5.375F, -3.675F, 0.3709F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r121 = bone6.addChild(
         "cube_r121",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(122, 47)
            .mirrored()
            .cuboid(-1.0F, -0.825F, -2.0F, 2.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(18, 107)
            .mirrored()
            .cuboid(-2.0F, -0.675F, -2.0F, 4.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 4.5983F, -7.6459F, 0.6327F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r122 = bone6.addChild(
         "cube_r122",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(108, 0)
            .mirrored()
            .cuboid(-1.8625F, -0.5375F, -2.6375F, 3.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(84, 113)
            .mirrored()
            .cuboid(-0.6375F, -0.9625F, -2.8375F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-3.5625F, 5.9203F, -12.6665F, 0.5689F, 0.1809F, 0.1146F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r123 = bone6.addChild(
         "cube_r123",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(104, 107)
            .mirrored()
            .cuboid(-1.15F, -0.5375F, -2.6125F, 3.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .uv(112, 99)
            .mirrored()
            .cuboid(-1.35F, -0.9625F, -2.8375F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(3.6F, 5.9203F, -12.6665F, 0.5698F, -0.1883F, -0.1193F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r124 = bone6.addChild(
         "cube_r124",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(30, 72)
            .mirrored()
            .cuboid(-3.0F, -2.0F, -4.0F, 6.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 6.525F, -3.275F, 0.2574F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 256, 256);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public void prepareMobModel(T entity, float limbSwing, float limbSwingAmount, float partialTick) {
      super.animateModel(entity, limbSwing, limbSwingAmount, partialTick);
      this.sprint = entity.getSprint(partialTick);
      net.minecraft.client.player.LocalPlayer player = net.minecraft.client.Minecraft.getInstance().player;
      this.hideInFirstPerson.visible = player == null || !net.minecraft.client.Minecraft.getInstance().options.getPerspective().isFirstPerson() || !entity.hasPassenger(player);
   }

   public void setupAnim(T t, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.getPart().traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      this.updateAnimation(t.shootAnimState, AtrtAnimation.SHOT, ageInTicks);
      this.animateMovement(AtrtAnimation.WALK, limbSwing, limbSwingAmount, 1.0F, 1.0F - this.sprint);
      this.animateMovement(AtrtAnimation.RUNNING, limbSwing, limbSwingAmount, 1.0F, this.sprint);
   }

   @Override
   public void translateToSeat(com.mojang.blaze3d.vertex.PoseStack poseStack) {
      this.root.rotate(poseStack);
      this.body.rotate(poseStack);
      this.seat.rotate(poseStack);
   }
}
