package che.swgc.client.model.entity;

import che.swgc.client.animation.AtstAnimation;
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
public class AtstModel extends che.swgc.client.compat.model.SinglePartEntityModel<che.swgc.client.render.SwgcMobRenderState> implements RideableModel {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "atst"), "main");
   private final net.minecraft.client.model.geom.ModelPart root;
   private final net.minecraft.client.model.geom.ModelPart body;
   private final net.minecraft.client.model.geom.ModelPart centers;
   private final net.minecraft.client.model.geom.ModelPart bone;
   private final net.minecraft.client.model.geom.ModelPart seat;
   private final net.minecraft.client.model.geom.ModelPart hideInFirstPerson;
   public float sprint;

   public AtstModel(net.minecraft.client.model.geom.ModelPart root) {
      super(root);
      this.root = root.getChild("root");
      this.body = this.root.getChild("body");
      this.centers = this.body.getChild("Centers");
      this.bone = this.centers.getChild("bone");
      this.seat = this.bone.getChild("seat");
      this.hideInFirstPerson = this.bone.getChild("hide_in_first_person");
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition root = partdefinition.addOrReplaceChild("root", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-9.957F, -2.3087F, -1.3234F));
      net.minecraft.client.model.geom.builders.PartDefinition body = root.addOrReplaceChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(36, 250)
            .addBox(6.0257F, -2.7996F, -16.0356F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(246, 154)
            .addBox(7.2817F, -2.8461F, -21.5226F, 0.0F, 4.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(246, 154)
            .mirror()
            .addBox(-7.2813F, -2.8461F, -21.5226F, 0.0F, 4.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(56, 114)
            .addBox(-6.0653F, -5.5891F, -12.3156F, 6.0F, 2.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(56, 114)
            .mirror()
            .addBox(0.0657F, -5.5891F, -12.3156F, 6.0F, 2.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(70, 246)
            .addBox(1.1422F, -5.0316F, 7.1679F, 6.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 250)
            .mirror()
            .addBox(-8.0253F, -2.7996F, -16.0356F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(70, 246)
            .mirror()
            .addBox(-7.1418F, -5.0316F, 7.1679F, 6.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(9.9568F, -43.0823F, 8.059F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = body.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(198, 257)
            .mirror()
            .addBox(-0.372F, -1.07F, -0.93F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-7.4263F, -4.0967F, -9.2931F, 0.9207F, 0.0F, 0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = body.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(256, 244)
            .mirror()
            .addBox(-0.372F, -1.07F, -0.93F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-7.4263F, -4.0967F, -6.1776F, 0.9207F, 0.0F, 0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = body.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(256, 248)
            .mirror()
            .addBox(-0.372F, -1.07F, -0.93F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-7.4263F, -4.0967F, -3.1086F, 0.9207F, 0.0F, 0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = body.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(122, 257)
            .mirror()
            .addBox(-0.372F, -1.07F, -0.93F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-7.4263F, -4.0967F, -0.0396F, 0.9207F, 0.0F, 0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = body.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(106, 134)
            .mirror()
            .addBox(-0.93F, -4.93F, -18.6F, 2.0F, 4.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-8.5833F, -1.2641F, 6.4239F, 0.0F, 0.0F, 0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = body.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(156, 257)
            .mirror()
            .addBox(-0.372F, -1.07F, -0.93F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-7.4263F, -4.0967F, 2.9364F, 0.9207F, 0.0F, 0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = body.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(12, 250)
            .mirror()
            .addBox(-0.93F, -3.07F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-7.9788F, -3.6821F, 6.5634F, 0.0F, 0.0F, 0.3447F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = body.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(250, 8)
            .mirror()
            .addBox(-0.93F, -1.21F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-7.9788F, -2.5661F, 6.5634F, 0.0F, 0.0F, -0.3447F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = body.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(156, 257).addBox(-1.628F, -1.07F, -0.93F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(7.4267F, -4.0967F, 2.9364F, 0.9207F, 0.0F, -0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = body.addOrReplaceChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(122, 257).addBox(-1.628F, -1.07F, -0.93F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(7.4267F, -4.0967F, -0.0396F, 0.9207F, 0.0F, -0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = body.addOrReplaceChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(256, 248).addBox(-1.628F, -1.07F, -0.93F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(7.4267F, -4.0967F, -3.1086F, 0.9207F, 0.0F, -0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = body.addOrReplaceChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(198, 257).addBox(-1.628F, -1.07F, -0.93F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(7.4267F, -4.0967F, -9.2931F, 0.9207F, 0.0F, -0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = body.addOrReplaceChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(256, 244).addBox(-1.628F, -1.07F, -0.93F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(7.4267F, -4.0967F, -6.1776F, 0.9207F, 0.0F, -0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = body.addOrReplaceChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 134).addBox(-1.07F, -4.93F, -18.6F, 2.0F, 4.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(8.5837F, -1.2641F, 6.4239F, 0.0F, 0.0F, -0.6807F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = body.addOrReplaceChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(250, 8).addBox(-1.07F, -1.21F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(7.9792F, -2.5661F, 6.5634F, 0.0F, 0.0F, 0.3447F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = body.addOrReplaceChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 250).addBox(-1.07F, -3.07F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(7.9792F, -3.6821F, 6.5634F, 0.0F, 0.0F, -0.3447F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = body.addOrReplaceChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(252, 215)
            .mirror()
            .addBox(-3.72F, -0.14F, 11.16F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.2128F, 3.0139F, -5.7126F, 0.0F, 0.0F, 0.624F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = body.addOrReplaceChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(252, 215).addBox(-0.28F, -0.14F, 11.16F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.2132F, 3.0139F, -5.7126F, 0.0F, 0.0F, -0.624F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = body.addOrReplaceChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 156)
            .mirror()
            .addBox(-0.93F, -2.0F, -10.23F, 2.0F, 2.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-6.9558F, 2.3164F, -2.0856F, 0.0F, 0.0F, -0.5411F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = body.addOrReplaceChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 156).addBox(-1.07F, -2.0F, -10.23F, 2.0F, 2.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(6.9562F, 2.3164F, -2.0856F, 0.0F, 0.0F, 0.5411F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = body.addOrReplaceChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 250).addBox(-8.51F, -2.14F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3443F, -0.7061F, 0.7044F, -0.8858F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition Centers = body.addOrReplaceChild(
         "Centers",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(96, 35)
            .addBox(-8.7848F, -1.3027F, 0.5218F, 17.0F, 4.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(172, 51)
            .addBox(-7.7847F, -4.7682F, 17.5408F, 15.0F, 9.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(100, 0)
            .addBox(-7.6452F, 2.2782F, 0.5218F, 15.0F, 2.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(108, 59)
            .addBox(-6.7847F, -3.0227F, 0.5218F, 13.0F, 2.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 211)
            .addBox(-3.1557F, 4.0918F, 18.2848F, 6.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(166, 80)
            .addBox(-5.2847F, -1.3027F, -8.7782F, 11.0F, 4.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(204, 215)
            .addBox(-3.2847F, -3.0227F, -7.6807F, 7.0F, 2.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(228, 122)
            .addBox(-2.7847F, -4.3712F, -7.1972F, 6.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-0.215F, -1.5433F, -12.8374F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = Centers.addOrReplaceChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(192, 173).addBox(-7.2847F, -8.2934F, -8.4514F, 15.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8596F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone = Centers.addOrReplaceChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(150, 216)
            .addBox(-3.2847F, -1.8918F, -3.6807F, 7.0F, 2.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(230, 171)
            .addBox(-2.7847F, -3.2868F, -3.1972F, 6.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(226, 131)
            .addBox(-2.7847F, -3.5341F, -18.0408F, 6.0F, 7.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(204, 9)
            .addBox(-3.7847F, -19.8658F, 5.1018F, 8.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(90, 156)
            .addBox(-2.7847F, -15.8658F, 6.1018F, 6.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(158, 226)
            .addBox(-3.7847F, -14.8658F, 5.1018F, 8.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(206, 40)
            .addBox(-3.7847F, -7.8658F, -1.8982F, 8.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 131)
            .addBox(5.4153F, -10.8658F, -13.8982F, 4.0F, 6.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(98, 219)
            .addBox(-2.7847F, -7.8658F, -9.8982F, 6.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(194, 148)
            .addBox(3.4153F, -9.8658F, -5.8982F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(200, 131)
            .addBox(3.4153F, -11.8658F, -5.8982F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(0, 131)
            .mirror()
            .addBox(-8.9848F, -10.8658F, -13.8982F, 4.0F, 6.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(200, 131)
            .mirror()
            .addBox(-3.9848F, -11.8658F, -5.8982F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirror(false)
            .texOffs(194, 148)
            .mirror()
            .addBox(-3.9848F, -9.8658F, -5.8982F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, -4.2F, -4.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone.addOrReplaceChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(232, 76)
            .mirror()
            .addBox(-7.945F, 0.93F, -12.02F, 1.0F, 3.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(124, 218)
            .mirror()
            .addBox(-7.945F, 0.93F, -4.02F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(124, 218)
            .addBox(8.395F, 0.93F, -4.02F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(232, 76)
            .addBox(8.395F, 0.93F, -12.02F, 1.0F, 3.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5097F, -4.2163F, 3.4523F, 0.0262F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bone.addOrReplaceChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(228, 9)
            .mirror()
            .addBox(-7.0F, -1.95F, -10.725F, 2.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(228, 20)
            .mirror()
            .addBox(-4.0F, -1.95F, -10.725F, 2.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(228, 20)
            .addBox(3.19F, -1.95F, -10.725F, 2.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(228, 9)
            .addBox(6.19F, -1.95F, -10.725F, 2.0F, 2.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3797F, -26.5747F, 17.1242F, 0.1091F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bone.addOrReplaceChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(198, 16)
            .mirror()
            .addBox(-6.695F, -3.67F, -11.645F, 1.0F, 1.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(194, 93)
            .mirror()
            .addBox(-6.745F, -3.145F, -2.645F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(192, 110)
            .mirror()
            .addBox(-6.745F, -3.145F, -7.645F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(198, 16)
            .addBox(7.145F, -3.67F, -11.645F, 1.0F, 1.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(194, 93)
            .addBox(7.195F, -3.145F, -2.645F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(192, 110)
            .addBox(7.195F, -3.145F, -7.645F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5097F, -25.1163F, 2.3023F, 0.0262F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bone.addOrReplaceChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(244, 220)
            .mirror()
            .addBox(1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(244, 220)
            .addBox(6.34F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.4547F, 3.6409F, -18.3158F, -0.3054F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bone.addOrReplaceChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(122, 250)
            .mirror()
            .addBox(1.0F, -1.5F, -2.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(122, 250)
            .addBox(6.34F, -1.5F, -2.5F, 2.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.4547F, 4.9659F, -15.5408F, -1.0734F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bone.addOrReplaceChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(30, 178)
            .mirror()
            .addBox(-3.0F, 2.025F, -6.175F, 6.0F, 8.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(250, 24)
            .mirror()
            .addBox(-3.0F, 11.025F, -6.175F, 6.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(250, 24)
            .addBox(5.19F, 11.025F, -6.175F, 6.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(30, 178)
            .addBox(5.19F, 2.025F, -6.175F, 6.0F, 8.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.8797F, -25.804F, 22.9489F, 0.0262F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bone.addOrReplaceChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(196, 110)
            .addBox(-3.5375F, -18.0044F, -10.9339F, 7.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(166, 93)
            .addBox(-6.5375F, -19.3044F, 0.0661F, 13.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(164, 110)
            .addBox(-6.5375F, -19.3044F, -12.9339F, 13.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(108, 80)
            .addBox(-7.5375F, -17.3044F, -12.9339F, 15.0F, 2.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(160, 113)
            .addBox(-8.4425F, -15.7814F, 12.2936F, 17.0F, 20.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 35)
            .addBox(-9.5375F, -16.7044F, -14.9339F, 19.0F, 2.0F, 29.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-8.5375F, 4.2186F, -19.7064F, 17.0F, 2.0F, 33.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2527F, -9.521F, 4.0F, 0.0262F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bone.addOrReplaceChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(100, 21).addBox(-8.5375F, -16.7486F, 3.1778F, 17.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2527F, -9.521F, 4.0F, 0.1091F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bone.addOrReplaceChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(192, 181).addBox(-8.5375F, -13.3237F, -18.3169F, 17.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2527F, -9.521F, 4.0F, -0.1702F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bone.addOrReplaceChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(150, 156).addBox(-7.7847F, -5.4586F, -20.8381F, 16.0F, 9.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 4.2F, 4.0F, -0.1702F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone3 = bone.addOrReplaceChild("bone3", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-0.3799F, 0.0409F, -21.4158F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bone3.addOrReplaceChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(252, 116)
            .mirror()
            .addBox(-0.7853F, 1.336F, -1.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(98, 206)
            .mirror()
            .addBox(-2.836F, -0.7146F, -7.0F, 2.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1105F, -0.0914F, 0.7587F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone2 = bone.addOrReplaceChild("bone2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.2152F, 0.0719F, -21.3961F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bone2.addOrReplaceChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(98, 206)
            .addBox(0.836F, -0.7146F, -7.0F, 2.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(252, 116)
            .addBox(-0.2147F, 1.336F, -1.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5951F, -0.031F, -0.0197F, 0.1105F, 0.0914F, -0.7587F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hide_in_first_person = bone.addOrReplaceChild("hide_in_first_person", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = hide_in_first_person.addOrReplaceChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(24, 196)
            .addBox(6.37F, -25.63F, -6.65F, 2.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 196)
            .mirror()
            .addBox(-9.82F, -25.63F, -6.65F, 2.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.9403F, 3.5884F, -10.0904F, -0.1702F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = hide_in_first_person.addOrReplaceChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(54, 66).addBox(-0.5F, -6.5F, -15.5F, 1.0F, 22.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.5702F, -18.8985F, 7.3743F, 0.0262F, -9.0E-4F, 0.0349F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = hide_in_first_person.addOrReplaceChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 159).addBox(-0.5F, -2.5F, -16.5F, 3.0F, 14.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.7702F, -18.8985F, 7.3743F, 0.0262F, -9.0E-4F, 0.0349F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = hide_in_first_person.addOrReplaceChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(44, 159)
            .mirror()
            .addBox(-2.5F, -2.5F, -16.5F, 3.0F, 14.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.3398F, -18.8985F, 7.3743F, 0.0262F, 9.0E-4F, -0.0349F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = hide_in_first_person.addOrReplaceChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(54, 66)
            .mirror()
            .addBox(-0.5F, -6.5F, -15.5F, 1.0F, 22.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.1398F, -18.8985F, 7.3743F, 0.0262F, 9.0E-4F, -0.0349F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = hide_in_first_person.addOrReplaceChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(10, 219)
            .mirror()
            .addBox(-0.5F, -7.5F, -2.0F, 1.0F, 21.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.0648F, -17.1654F, -7.5197F, -0.1615F, 9.0E-4F, -0.0349F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = hide_in_first_person.addOrReplaceChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(10, 219).addBox(-0.5F, -7.5F, -2.0F, 1.0F, 21.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.4952F, -17.1654F, -7.5197F, -0.1615F, -9.0E-4F, 0.0349F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = hide_in_first_person.addOrReplaceChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(78, 159)
            .mirror()
            .addBox(-0.5F, -8.5F, -2.0F, 1.0F, 22.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.0648F, -17.1654F, -11.1197F, -0.1615F, 9.0E-4F, -0.0349F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = hide_in_first_person.addOrReplaceChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 159).addBox(-0.5F, -8.5F, -2.0F, 1.0F, 22.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.4952F, -17.1654F, -11.1197F, -0.1615F, -9.0E-4F, 0.0349F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = hide_in_first_person.addOrReplaceChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(172, 64)
            .addBox(-8.4425F, -6.0309F, -18.529F, 17.0F, 14.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(254, 203)
            .addBox(-1.5375F, -10.3237F, -18.3169F, 3.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(194, 134)
            .addBox(-7.5375F, -5.8059F, -18.9539F, 15.0F, 13.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2527F, -9.521F, 4.0F, -0.1702F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = hide_in_first_person.addOrReplaceChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(60, 253)
            .mirror()
            .addBox(-1.5F, -1.0F, -0.5F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.9298F, -19.2418F, -12.3999F, -0.0792F, 0.1508F, 1.0848F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = hide_in_first_person.addOrReplaceChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 253).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.3602F, -19.2418F, -12.3999F, -0.0792F, -0.1508F, -1.0848F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition seat = bone.addOrReplaceChild("seat", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.2152F, -7.8658F, 3.1018F));
      net.minecraft.client.model.geom.builders.PartDefinition chair = body.addOrReplaceChild("chair", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.2002F, -28.6091F, 3.2644F));
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = body.addOrReplaceChild("left_leg", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(8.3092F, 0.0434F, 0.0807F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = left_leg.addOrReplaceChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(24, 250)
            .mirror()
            .addBox(6.51F, -2.14F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-7.7497F, 0.0349F, -0.0297F, -1.2348F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = left_leg.addOrReplaceChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(236, 40)
            .addBox(-0.6515F, -2.047F, 9.3F, 2.0F, 4.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(124, 158)
            .addBox(-0.6515F, -0.8375F, -1.86F, 2.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.271F, 4.5868F, -16.0374F, 0.2704F, -0.3077F, -0.0838F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg4 = left_leg.addOrReplaceChild("left_leg4", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(4.705F, 5.0612F, -16.9437F));
      net.minecraft.client.model.geom.builders.PartDefinition left_leg_r1 = left_leg4.addOrReplaceChild(
         "left_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(252, 209)
            .addBox(-2.14F, -11.7655F, -0.6975F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(82, 214)
            .addBox(-3.303F, -10.63F, -1.023F, 6.0F, 19.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(40, 205)
            .addBox(-2.1865F, -13.63F, -3.906F, 4.0F, 22.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 250)
            .addBox(-2.14F, -8.1855F, -0.2325F, 4.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(48, 253)
            .addBox(-2.14F, -2.512F, -0.6975F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.1F, 0.5F, 14.6F, 1.2785F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = left_leg4.addOrReplaceChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(238, 255).addBox(-0.14F, -2.6515F, -1.953F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.077F, -4.9064F, -1.0813F, -0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = left_leg4.addOrReplaceChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(246, 255).addBox(-0.14F, -1.675F, -1.395F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.077F, -4.9064F, -0.4303F, 0.6283F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = left_leg4.addOrReplaceChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(200, 249).addBox(-2.93F, -5.767F, -5.208F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.3095F, 7.4019F, 30.9403F, 0.5629F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = left_leg4.addOrReplaceChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(242, 198).addBox(1.0457F, -3.28F, -1.86F, 2.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.2163F, 6.6866F, 21.9849F, 0.3622F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = left_leg4.addOrReplaceChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(128, 188).addBox(-3.21F, -6.21F, -6.51F, 6.0F, 9.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.007F, 6.8904F, 28.4293F, 0.5629F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = left_leg4.addOrReplaceChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(98, 188)
            .addBox(-3.21F, -6.21F, -6.51F, 6.0F, 9.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(206, 31)
            .addBox(-3.187F, 3.4875F, -7.626F, 7.0F, 0.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(132, 254)
            .addBox(-2.047F, 1.441F, -3.906F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.007F, 2.5194F, 1.3198F, -0.2531F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = left_leg4.addOrReplaceChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(204, 0).addBox(-4.21F, -0.186F, -4.65F, 7.0F, 0.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.03F, -0.4563F, -5.5503F, 1.3177F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = left_leg4.addOrReplaceChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(206, 257).addBox(-1.907F, -0.326F, 0.744F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.03F, -0.4563F, -5.3253F, 1.3177F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = left_leg4.addOrReplaceChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(56, 215).addBox(-3.28F, -3.21F, -2.79F, 7.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.7855F, 0.1134F, -0.1082F, 0.144F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = left_leg4.addOrReplaceChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(158, 188)
            .addBox(-2.14F, -17.35F, -3.162F, 4.0F, 22.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(254, 29)
            .addBox(-2.14F, -14.6485F, -3.9525F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(170, 238)
            .addBox(-2.14F, -12.21F, -3.72F, 4.0F, 15.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.1F, 4.7216F, 19.2569F, 1.4312F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = left_leg4.addOrReplaceChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(158, 238).addBox(-2.6515F, -13.79F, -0.837F, 4.0F, 11.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.123F, 6.0701F, 21.1169F, 1.4312F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = left_leg4.addOrReplaceChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(232, 212).addBox(-3.7215F, -2.14F, -1.86F, 6.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.4255F, 2.8255F, 6.9063F, 0.6065F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = left_leg4.addOrReplaceChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(180, 237).addBox(-2.14F, -5.4665F, -0.3255F, 4.0F, 11.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.6115F, 4.1224F, 12.9384F, 1.3221F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg2 = left_leg4.addOrReplaceChild(
         "left_leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 245)
            .addBox(0.7333F, 3.4139F, -0.1261F, 2.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(244, 245)
            .addBox(-2.9867F, 3.4139F, -0.1261F, 2.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(230, 154)
            .addBox(-1.1267F, -1.5861F, -1.9861F, 2.0F, 11.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 196)
            .addBox(-3.2667F, 9.1731F, -1.9861F, 6.0F, 9.9809F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(234, 62)
            .addBox(-1.1267F, 18.1989F, -1.9861F, 2.0F, 7.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(44, 231)
            .addBox(0.6868F, 22.0977F, -1.9796F, 2.0F, 15.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(120, 231)
            .addBox(-2.9867F, 22.0977F, -1.9796F, 2.0F, 15.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(3.0637F, 7.5669F, 27.1139F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = left_leg2.addOrReplaceChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(250, 146)
            .addBox(-1.07F, -2.14F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(144, 250)
            .addBox(-4.7435F, -2.14F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.7568F, 22.2177F, 0.6709F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = left_leg2.addOrReplaceChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(254, 255).addBox(-1.07F, -2.14F, -0.93F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0102F, 27.7093F, -1.8354F, -0.4756F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = left_leg2.addOrReplaceChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(82, 256).addBox(-1.07F, -2.14F, -0.93F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0567F, 26.1897F, 1.7258F, -0.6065F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r65 = left_leg2.addOrReplaceChild(
         "cube_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(206, 105).addBox(-3.28F, -1.07F, -0.93F, 7.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0567F, 13.971F, 3.5474F, -0.7636F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r66 = left_leg2.addOrReplaceChild(
         "cube_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(210, 50).addBox(2.207F, -5.1165F, -2.9295F, 7.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-5.5437F, 37.2312F, 1.3402F, 2.2864F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg3 = left_leg2.addOrReplaceChild("left_leg3", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-0.0349F, 38.995F, -0.145F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r67 = left_leg3.addOrReplaceChild(
         "cube_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(202, 187).addBox(-2.0935F, -7.4451F, 0.9055F, 4.0F, 24.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0712F, -4.0656F, -0.6683F, -0.4669F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r68 = left_leg3.addOrReplaceChild(
         "cube_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(228, 235).addBox(-2.047F, -0.1692F, -0.0686F, 4.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0712F, 0.7239F, -2.5283F, -0.4669F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition foot = left_leg3.addOrReplaceChild(
         "foot",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(254, 97)
            .addBox(-2.1369F, 1.9468F, -7.7621F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(164, 96)
            .addBox(-4.3934F, 2.6217F, -13.6851F, 9.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(170, 35)
            .addBox(-5.4384F, 3.7377F, -14.7081F, 4.0F, 2.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(158, 173)
            .addBox(1.4901F, 3.7377F, -14.2331F, 4.0F, 2.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(250, 84)
            .addBox(-3.3919F, 1.2262F, -2.0036F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(110, 250)
            .addBox(1.3046F, 1.2262F, -2.0036F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(232, 98)
            .addBox(-3.2304F, 5.0862F, -1.9106F, 7.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 114)
            .addBox(-6.2774F, 4.9932F, -15.4186F, 13.0F, 2.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.1612F, 10.7311F, -5.3514F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r69 = foot.addOrReplaceChild(
         "cube_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(190, 252).addBox(-1.163F, 7.0245F, -1.5908F, 2.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0899F, -10.0072F, 2.8231F, -0.24F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r70 = foot.addOrReplaceChild(
         "cube_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(204, 224).addBox(-3.21F, -3.21F, -2.79F, 6.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0031F, 1.92F, -0.4175F, 2.6922F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r71 = foot.addOrReplaceChild(
         "cube_r71",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(252, 179).addBox(-1.3459F, -2.0648F, -5.6402F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2F, 4.275F, -16.0F, 0.336F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r72 = foot.addOrReplaceChild(
         "cube_r72",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(104, 240)
            .addBox(-2.2044F, -2.2633F, -7.5081F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(70, 252)
            .addBox(-3.3648F, -2.003F, -5.6796F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 4.275F, -16.0F, 0.33F, 0.0644F, -0.1856F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r73 = foot.addOrReplaceChild(
         "cube_r73",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(88, 240)
            .addBox(-0.0664F, -2.2372F, -7.5081F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(252, 104)
            .addBox(1.2356F, -1.9486F, -5.6796F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 4.275F, -16.0F, 0.33F, -0.0644F, 0.1856F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r74 = foot.addOrReplaceChild(
         "cube_r74",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(230, 105).addBox(-2.1369F, -2.7007F, 1.1234F, 4.0F, 4.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 4.182F, -16.0F, 0.1789F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r75 = foot.addOrReplaceChild(
         "cube_r75",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(214, 257).addBox(-1.3955F, -0.791F, -1.6275F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.3286F, 1.1568F, -6.8321F, 0.2225F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r76 = foot.addOrReplaceChild(
         "cube_r76",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(252, 122).addBox(-1.1599F, -1.3517F, -2.4571F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 4.0F, -16.0F, 0.1789F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = body.addOrReplaceChild("right_leg", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-8.3088F, 0.0434F, 0.0807F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r77 = right_leg.addOrReplaceChild(
         "cube_r77",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 250).addBox(-8.51F, -2.14F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(7.7497F, 0.0349F, -0.0297F, -1.2348F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r78 = right_leg.addOrReplaceChild(
         "cube_r78",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(236, 40)
            .mirror()
            .addBox(-1.3485F, -2.047F, 9.3F, 2.0F, 4.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(124, 158)
            .mirror()
            .addBox(-1.3485F, -0.8375F, -1.86F, 2.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.271F, 4.5868F, -16.0374F, 0.2704F, 0.3077F, 0.0838F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg4 = right_leg.addOrReplaceChild("right_leg4", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-4.705F, 5.0612F, -16.9437F));
      net.minecraft.client.model.geom.builders.PartDefinition right_leg_r1 = right_leg4.addOrReplaceChild(
         "right_leg_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(252, 209)
            .mirror()
            .addBox(-1.86F, -11.7655F, -0.6975F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(82, 214)
            .mirror()
            .addBox(-2.697F, -10.63F, -1.023F, 6.0F, 19.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(40, 205)
            .mirror()
            .addBox(-1.8135F, -13.63F, -3.906F, 4.0F, 22.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(178, 250)
            .mirror()
            .addBox(-1.86F, -8.1855F, -0.2325F, 4.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(48, 253)
            .mirror()
            .addBox(-1.86F, -2.512F, -0.6975F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.1F, 0.5F, 14.6F, 1.2785F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r79 = right_leg4.addOrReplaceChild(
         "cube_r79",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(238, 255)
            .mirror()
            .addBox(-1.86F, -2.6515F, -1.953F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.077F, -4.9064F, -1.0813F, -0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r80 = right_leg4.addOrReplaceChild(
         "cube_r80",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(246, 255)
            .mirror()
            .addBox(-1.86F, -1.675F, -1.395F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.077F, -4.9064F, -0.4303F, 0.6283F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r81 = right_leg4.addOrReplaceChild(
         "cube_r81",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(200, 249)
            .mirror()
            .addBox(0.93F, -5.767F, -5.208F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.3095F, 7.4019F, 30.9403F, 0.5629F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r82 = right_leg4.addOrReplaceChild(
         "cube_r82",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(242, 198)
            .mirror()
            .addBox(-3.0457F, -3.28F, -1.86F, 2.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.2163F, 6.6866F, 21.9849F, 0.3622F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r83 = right_leg4.addOrReplaceChild(
         "cube_r83",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(128, 188)
            .mirror()
            .addBox(-2.79F, -6.21F, -6.51F, 6.0F, 9.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.007F, 6.8904F, 28.4293F, 0.5629F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r84 = right_leg4.addOrReplaceChild(
         "cube_r84",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(98, 188)
            .mirror()
            .addBox(-2.79F, -6.21F, -6.51F, 6.0F, 9.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(206, 31)
            .mirror()
            .addBox(-3.813F, 3.4875F, -7.626F, 7.0F, 0.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(132, 254)
            .mirror()
            .addBox(-1.953F, 1.441F, -3.906F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.007F, 2.5194F, 1.3198F, -0.2531F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r85 = right_leg4.addOrReplaceChild(
         "cube_r85",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(204, 0)
            .mirror()
            .addBox(-2.79F, -0.186F, -4.65F, 7.0F, 0.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.03F, -0.4563F, -5.5503F, 1.3177F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r86 = right_leg4.addOrReplaceChild(
         "cube_r86",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(206, 257)
            .mirror()
            .addBox(-0.093F, -0.326F, 0.744F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.03F, -0.4563F, -5.3253F, 1.3177F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r87 = right_leg4.addOrReplaceChild(
         "cube_r87",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(56, 215)
            .mirror()
            .addBox(-3.72F, -3.21F, -2.79F, 7.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.7855F, 0.1134F, -0.1082F, 0.144F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r88 = right_leg4.addOrReplaceChild(
         "cube_r88",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(158, 188)
            .mirror()
            .addBox(-1.86F, -17.35F, -3.162F, 4.0F, 22.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(254, 29)
            .mirror()
            .addBox(-1.86F, -14.6485F, -3.9525F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(170, 238)
            .mirror()
            .addBox(-1.86F, -12.21F, -3.72F, 4.0F, 15.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.1F, 4.7216F, 19.2569F, 1.4312F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r89 = right_leg4.addOrReplaceChild(
         "cube_r89",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(158, 238)
            .mirror()
            .addBox(-1.3485F, -13.79F, -0.837F, 4.0F, 11.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.123F, 6.0701F, 21.1169F, 1.4312F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r90 = right_leg4.addOrReplaceChild(
         "cube_r90",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(232, 212)
            .mirror()
            .addBox(-2.2785F, -2.14F, -1.86F, 6.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.4255F, 2.8255F, 6.9063F, 0.6065F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r91 = right_leg4.addOrReplaceChild(
         "cube_r91",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(180, 237)
            .mirror()
            .addBox(-1.86F, -5.4665F, -0.3255F, 4.0F, 11.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.6115F, 4.1224F, 12.9384F, 1.3221F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg2 = right_leg4.addOrReplaceChild(
         "right_leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 245)
            .mirror()
            .addBox(-2.7333F, 3.4139F, -0.1261F, 2.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(244, 245)
            .mirror()
            .addBox(0.9867F, 3.4139F, -0.1261F, 2.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(230, 154)
            .mirror()
            .addBox(-0.8733F, -1.5861F, -1.9861F, 2.0F, 11.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(0, 196)
            .mirror()
            .addBox(-2.7333F, 9.1731F, -1.9861F, 6.0F, 9.9809F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(234, 62)
            .mirror()
            .addBox(-0.8733F, 18.1989F, -1.9861F, 2.0F, 7.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(44, 231)
            .mirror()
            .addBox(-2.6868F, 22.0977F, -1.9796F, 2.0F, 15.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(120, 231)
            .mirror()
            .addBox(0.9867F, 22.0977F, -1.9796F, 2.0F, 15.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(-3.0637F, 7.5669F, 27.1139F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r92 = right_leg2.addOrReplaceChild(
         "cube_r92",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(250, 146)
            .mirror()
            .addBox(-0.93F, -2.14F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(144, 250)
            .mirror()
            .addBox(2.7435F, -2.14F, -1.86F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.7568F, 22.2177F, 0.6709F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r93 = right_leg2.addOrReplaceChild(
         "cube_r93",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(254, 255)
            .mirror()
            .addBox(-0.93F, -2.14F, -0.93F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0102F, 27.7093F, -1.8354F, -0.4756F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r94 = right_leg2.addOrReplaceChild(
         "cube_r94",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(82, 256)
            .mirror()
            .addBox(-0.93F, -2.14F, -0.93F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0567F, 26.1897F, 1.7258F, -0.6065F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r95 = right_leg2.addOrReplaceChild(
         "cube_r95",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(206, 105)
            .mirror()
            .addBox(-3.72F, -1.07F, -0.93F, 7.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0567F, 13.971F, 3.5474F, -0.7636F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r96 = right_leg2.addOrReplaceChild(
         "cube_r96",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(210, 50)
            .mirror()
            .addBox(-9.207F, -5.1165F, -2.9295F, 7.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(5.5437F, 37.2312F, 1.3402F, 2.2864F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg3 = right_leg2.addOrReplaceChild("right_leg3", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0349F, 38.995F, -0.145F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r97 = right_leg3.addOrReplaceChild(
         "cube_r97",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(202, 187)
            .mirror()
            .addBox(-1.9065F, -7.4451F, 0.9055F, 4.0F, 24.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0712F, -4.0656F, -0.6683F, -0.4669F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r98 = right_leg3.addOrReplaceChild(
         "cube_r98",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(228, 235)
            .mirror()
            .addBox(-1.953F, -0.1692F, -0.0686F, 4.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0712F, 0.7239F, -2.5283F, -0.4669F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition foot2 = right_leg3.addOrReplaceChild(
         "foot2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(254, 97)
            .mirror()
            .addBox(-1.8631F, 1.9468F, -7.7621F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(164, 96)
            .mirror()
            .addBox(-4.6066F, 2.6217F, -13.6851F, 9.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(170, 35)
            .mirror()
            .addBox(1.4384F, 3.7377F, -14.7081F, 4.0F, 2.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(158, 173)
            .mirror()
            .addBox(-5.4901F, 3.7377F, -14.2331F, 4.0F, 2.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(250, 84)
            .mirror()
            .addBox(1.3919F, 1.2262F, -2.0036F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(110, 250)
            .mirror()
            .addBox(-3.3046F, 1.2262F, -2.0036F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(232, 98)
            .mirror()
            .addBox(-3.7696F, 5.0862F, -1.9106F, 7.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(0, 114)
            .mirror()
            .addBox(-6.7226F, 4.9932F, -15.4186F, 13.0F, 2.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(-0.1612F, 10.7311F, -5.3514F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r99 = foot2.addOrReplaceChild(
         "cube_r99",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(190, 252)
            .mirror()
            .addBox(-0.837F, 7.0245F, -1.5908F, 2.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0899F, -10.0072F, 2.8231F, -0.24F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r100 = foot2.addOrReplaceChild(
         "cube_r100",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(204, 224)
            .mirror()
            .addBox(-2.79F, -3.21F, -2.79F, 6.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0031F, 1.92F, -0.4175F, 2.6922F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r101 = foot2.addOrReplaceChild(
         "cube_r101",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(252, 179)
            .mirror()
            .addBox(-0.6541F, -2.0648F, -5.6402F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, 4.275F, -16.0F, 0.336F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r102 = foot2.addOrReplaceChild(
         "cube_r102",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(104, 240)
            .mirror()
            .addBox(0.2044F, -2.2633F, -7.5081F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(70, 252)
            .mirror()
            .addBox(1.3648F, -2.003F, -5.6796F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 4.275F, -16.0F, 0.33F, -0.0644F, 0.1856F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r103 = foot2.addOrReplaceChild(
         "cube_r103",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(88, 240)
            .mirror()
            .addBox(-1.9336F, -2.2372F, -7.5081F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(252, 104)
            .mirror()
            .addBox(-3.2356F, -1.9486F, -5.6796F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 4.275F, -16.0F, 0.33F, 0.0644F, -0.1856F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r104 = foot2.addOrReplaceChild(
         "cube_r104",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(230, 105)
            .mirror()
            .addBox(-1.8631F, -2.7007F, 1.1234F, 4.0F, 4.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 4.182F, -16.0F, 0.1789F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r105 = foot2.addOrReplaceChild(
         "cube_r105",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(214, 257)
            .mirror()
            .addBox(-0.6045F, -0.791F, -1.6275F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3286F, 1.1568F, -6.8321F, 0.2225F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r106 = foot2.addOrReplaceChild(
         "cube_r106",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(252, 122)
            .mirror()
            .addBox(-0.8401F, -1.3517F, -2.4571F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 4.0F, -16.0F, 0.1789F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 512, 512);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }


   public void setupAnim(che.swgc.client.render.SwgcMobRenderState state) {
      super.setupAnim(state);
      float limbSwing = state.walkAnimationPos;
      float limbSwingAmount = state.walkAnimationSpeed;
      float ageInTicks = state.ageInTicks;
      float netHeadYaw = state.yRot;
      float headPitch = state.xRot;

      Walker entity = (Walker)state.entity;
      this.getPart().getAllParts().forEach(net.minecraft.client.model.geom.ModelPart::resetPose);
      this.updateAnimation(entity.shootAnimState, AtstAnimation.FIRE, ageInTicks);
      this.animateMovement(AtstAnimation.WALK, limbSwing, limbSwingAmount, 1.1F, 1.0F - this.sprint);
      this.animateMovement(AtstAnimation.RUN, limbSwing, limbSwingAmount, 0.9F, this.sprint);
   }

   @Override
   public void translateToSeat(com.mojang.blaze3d.vertex.PoseStack poseStack) {
      this.root.translateAndRotate(poseStack);
      this.body.translateAndRotate(poseStack);
      this.centers.translateAndRotate(poseStack);
      this.bone.translateAndRotate(poseStack);
      this.seat.translateAndRotate(poseStack);
   }
}
