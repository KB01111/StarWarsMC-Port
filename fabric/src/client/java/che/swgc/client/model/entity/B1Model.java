package che.swgc.client.model.entity;

import che.swgc.client.animation.B1Animation;
import che.swgc.client.model.item.StaticItemModel;
import che.swgc.entity.CommandableMob;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import che.swgc.client.compat.model.ModelWithArms;
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

@javax.annotation.ParametersAreNonnullByDefault
public class B1Model<T extends CommandableMob> extends che.swgc.client.compat.model.SinglePartEntityModel<T> implements che.swgc.client.compat.model.ModelWithArms, StaticItemModel {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "b1"), "main");
   private final net.minecraft.client.model.geom.ModelPart root;
   private final net.minecraft.client.model.geom.ModelPart body;
   private final net.minecraft.client.model.geom.ModelPart chest;
   private final net.minecraft.client.model.geom.ModelPart neck;
   private final net.minecraft.client.model.geom.ModelPart rightArm;
   private final net.minecraft.client.model.geom.ModelPart rightForearm;
   private final net.minecraft.client.model.geom.ModelPart rightHand;
   private final net.minecraft.client.model.geom.ModelPart leftArm;
   private final net.minecraft.client.model.geom.ModelPart leftForearm;
   private final net.minecraft.client.model.geom.ModelPart leftHand;

   public B1Model(net.minecraft.client.model.geom.ModelPart root) {
      super(net.minecraft.client.renderer.rendertype.RenderType::getEntitySolid);
      this.root = root;
      this.body = root.getChild("body");
      this.chest = this.body.getChild("korpus");
      this.neck = this.chest.getChild("neck");
      this.rightArm = this.chest.getChild("right_arm");
      this.rightForearm = this.rightArm.getChild("right_forearm");
      this.rightHand = this.rightForearm.getChild("right_palm");
      this.leftArm = this.chest.getChild("left_arm");
      this.leftForearm = this.leftArm.getChild("left_forearm");
      this.leftHand = this.leftForearm.getChild("left_palm");
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(114, 27)
            .addBox(-0.5F, -13.0F, -2.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(96, 109)
            .addBox(-1.0F, -15.0F, -2.0F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(108, 32)
            .addBox(-1.0F, -15.0F, 0.0F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(110, 102)
            .addBox(-1.0F, -15.0F, -1.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 83)
            .addBox(-1.5F, -13.5F, -1.0F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = body.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(108, 9).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, -18.5237F, 0.2164F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = body.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 109).addBox(-0.557F, -3.2455F, -0.5F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.9029F, -14.5162F, -1.0591F, -0.1183F, 0.0562F, 0.4417F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = body.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(108, 65).addBox(-1.7971F, -5.7386F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.0729F, -16.3249F, -0.821F, -0.0928F, 0.0924F, 0.7811F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = body.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(70, 109).addBox(0.7971F, -5.7386F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.0729F, -16.3249F, -0.821F, -0.0928F, -0.0924F, -0.7811F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = body.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(70, 110)
            .addBox(0.7971F, -5.7386F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(108, 66)
            .addBox(-3.6029F, -5.7386F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.9029F, -14.5162F, -1.0591F, -0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = body.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(102, 109).addBox(-0.443F, -3.2455F, -0.5F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.9029F, -14.5162F, -1.0591F, -0.1183F, -0.0562F, -0.4417F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = body.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(108, 60).addBox(0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, -16.3512F, -0.8792F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = body.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 56).addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.0F, -13.0F, -0.5F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = body.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(14, 93).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -18.4588F, 0.6934F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition korpus = body.addChild(
         "korpus",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(86, 11)
            .addBox(-2.0F, -1.95F, -3.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(102, 69)
            .addBox(-1.0F, -5.65F, -0.5F, 2.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(82, 62)
            .addBox(-3.0F, -6.95F, 0.5F, 6.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(86, 47)
            .addBox(-2.6F, -5.25F, 2.0F, 5.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(48, 85)
            .addBox(0.5F, -7.45F, -4.5F, 1.0F, 6.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 75)
            .addBox(-2.5F, -6.95F, -4.0F, 5.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(86, 16)
            .addBox(1.3F, -6.7F, -4.4F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(86, 25)
            .addBox(-2.3F, -6.7F, -4.4F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(60, 85)
            .addBox(-1.5F, -7.45F, -4.5F, 1.0F, 6.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(26, 93)
            .addBox(-0.5F, -4.45F, -4.3F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(110, 104)
            .addBox(-0.5F, -6.45F, -4.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(98, 66)
            .addBox(-1.5F, 0.05F, 0.475F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(98, 91)
            .addBox(-1.4772F, -7.5404F, 0.475F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 95)
            .addBox(2.0F, -8.95F, 1.0F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(102, 83)
            .addBox(1.5F, -9.95F, 1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(26, 61)
            .addBox(3.0F, -11.95F, 1.0F, 0.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(110, 107)
            .addBox(2.5F, -13.95F, 1.0F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, -19.05F, 2.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = korpus.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(102, 79).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.6934F, -6.4088F, 1.475F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = korpus.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(102, 75).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.6934F, -6.4088F, 1.475F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = korpus.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 86).addBox(-0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.2071F, -0.3642F, 1.475F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = korpus.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(98, 69).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.65F, -4.35F, -4.25F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = korpus.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(84, 96).addBox(-2.5F, 0.5F, -0.5F, 5.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1F, -7.3684F, 1.5814F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = korpus.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(90, 83).addBox(-2.5F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1F, 0.2321F, 1.567F, -0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = korpus.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 83).addBox(-1.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.2071F, -0.3642F, 1.475F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone = korpus.addChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(82, 71).addBox(-1.5F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, -1.95F, -3.3F, -0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition neck = korpus.addChild(
         "neck",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(106, 94)
            .addBox(1.0F, -6.0F, -0.4929F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(26, 67)
            .addBox(1.0F, -6.0F, 0.9071F, 1.0F, 6.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5F, -6.45F, -2.7071F, -0.3491F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = neck.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 95).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.5F, -6.5F, 0.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition head = neck.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(96, 16)
            .addBox(-1.5F, 0.105F, -5.4912F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(14, 85)
            .addBox(-1.5F, -1.895F, -2.4912F, 3.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 102)
            .addBox(-1.55F, 0.105F, -4.4912F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 102)
            .addBox(1.55F, 0.105F, -4.4912F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(110, 110)
            .addBox(-1.5F, 1.105F, 1.5088F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(74, 111)
            .addBox(0.5F, 1.105F, 1.5088F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.5F, -6.505F, -0.0017F, 0.9163F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = head.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(96, 32)
            .mirrored()
            .addBox(-1.5F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .texOffs(96, 32)
            .addBox(-4.55F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(30, 91)
            .addBox(-4.525F, -1.5F, -0.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.025F, 0.2874F, -4.4245F, 0.3054F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = head.addChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(8, 107).addBox(-0.5F, -0.5F, 0.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.6F, 1.8021F, -6.4822F, 0.7418F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = head.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(8, 99)
            .addBox(-1.5F, -1.5F, 0.5F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(22, 98)
            .addBox(1.55F, -1.5F, 0.5F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(98, 32)
            .addBox(-1.475F, -1.5F, 0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.025F, 1.8021F, -6.1822F, 0.7418F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = korpus.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(28, 47)
            .addBox(-0.3F, 0.2017F, -0.7983F, 1.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(98, 36)
            .addBox(-0.7F, 0.2017F, -0.5983F, 1.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(80, 52)
            .addBox(-0.5F, 0.2017F, -1.1983F, 1.0F, 6.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-3.5F, -5.9517F, -2.0017F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = right_arm.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(108, 18).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.0233F, -0.0233F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = right_arm.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 60).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.0233F, 0.0267F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = right_arm.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(104, 94).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.0267F, -0.0233F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = right_arm.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(98, 94).addBox(0.5F, 1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, 0.0267F, 0.0267F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = right_arm.addChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(102, 101).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, 0.0017F, 0.0017F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_forearm = right_arm.addChild(
         "right_forearm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(84, 92)
            .addBox(-0.5F, 0.305F, -0.795F, 1.0F, 4.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(74, 108)
            .addBox(-0.5F, 3.605F, -0.995F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 6.2967F, -0.0033F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = right_forearm.addChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(6, 110).addBox(0.5F, 1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, 0.03F, 0.03F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = right_forearm.addChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(90, 110).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.02F, 0.03F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = right_forearm.addChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 89).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.03F, -0.02F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = right_forearm.addChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(108, 92).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.02F, -0.02F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = right_forearm.addChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(8, 103).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, 0.005F, 0.005F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = right_forearm.addChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(108, 70).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 2.505F, 0.105F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_palm = right_forearm.addChild(
         "right_palm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(104, 36).addBox(-0.6F, -0.4F, -1.55F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 4.405F, -0.145F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_thumb = right_palm.addChild(
         "right_thumb",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 112).addBox(-0.7F, -0.1305F, -1.2914F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.4F, 0.5F, -0.55F, 0.1309F, 0.0F, -0.3491F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = right_thumb.addChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(112, 42).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -0.1305F, -0.5843F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_finger_joint1 = right_palm.addChild(
         "right_finger_joint1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(4, 112)
            .addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 112)
            .addBox(0.0F, 0.0F, 0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(58, 28)
            .addBox(0.0F, 1.0F, -0.4F, 1.0F, 0.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-0.6F, 0.6F, -0.05F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_finger_joint2 = right_finger_joint1.addChild(
         "right_finger_joint2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(112, 67)
            .addBox(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(112, 69)
            .addBox(0.0F, 0.0F, 3.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 2.0F, -3.0F, 0.0F, 0.0F, -1.0036F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = korpus.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(84, 99)
            .addBox(-0.7F, 0.2017F, -0.7983F, 1.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(90, 99)
            .addBox(-0.3F, 0.2017F, -0.5983F, 1.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(100, 0)
            .addBox(-0.5F, 0.2017F, -1.1983F, 1.0F, 6.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(3.5F, -5.9517F, -2.0017F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = left_arm.addChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(110, 75).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.0233F, -0.0233F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = left_arm.addChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 112).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.0233F, 0.0267F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = left_arm.addChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 111).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.0267F, -0.0233F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = left_arm.addChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(38, 110).addBox(-1.5F, 1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, 0.0267F, 0.0267F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = left_arm.addChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 24).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, 0.0017F, 0.0017F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_forearm = left_arm.addChild(
         "left_forearm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(100, 11)
            .addBox(-0.5F, 0.305F, -0.795F, 1.0F, 4.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(62, 109)
            .addBox(-0.5F, 3.605F, -0.995F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 6.2967F, -0.0033F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = left_forearm.addChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(110, 79).addBox(-1.5F, 1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, 0.03F, 0.03F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = left_forearm.addChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 114).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.02F, 0.03F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = left_forearm.addChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(82, 113).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.03F, -0.02F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = left_forearm.addChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(110, 77).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.02F, -0.02F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = left_forearm.addChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 28).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, 0.005F, 0.005F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = left_forearm.addChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(58, 109).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 2.505F, 0.105F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_palm = left_forearm.addChild(
         "left_palm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 44).addBox(-0.4F, -0.4F, -1.55F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 4.405F, -0.145F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_thumb = left_palm.addChild(
         "left_thumb",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(112, 36).addBox(-0.3F, 0.0F, -0.3F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.4F, 0.5F, -1.55F, 0.1309F, 0.0F, 0.3491F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = left_thumb.addChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(114, 19).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2F, 0.0F, 0.4071F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_finger_joint1 = left_palm.addChild(
         "left_finger_joint1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(38, 112)
            .addBox(-1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(112, 39)
            .addBox(-1.0F, -1.0F, 3.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(14, 84)
            .addBox(-1.0F, 0.0F, 2.6F, 1.0F, 0.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.6F, 1.6F, -3.05F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_finger_joint2 = left_finger_joint1.addChild(
         "left_finger_joint2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(20, 114)
            .addBox(-1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(114, 21)
            .addBox(-1.0F, 0.0F, 3.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0036F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = body.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(96, 101)
            .addBox(-0.6997F, -1.0089F, -1.0021F, 1.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(102, 0)
            .addBox(-0.2997F, -1.0089F, -0.702F, 1.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-2.1003F, -11.9911F, -0.498F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = right_leg.addChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 107).addBox(0.0F, -1.5F, -1.5F, 1.0F, 0.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.4997F, -1.0339F, -0.0271F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = right_leg.addChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(42, 112).addBox(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.4997F, -0.9839F, -0.0271F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = right_leg.addChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 107).addBox(0.0F, 1.5F, -1.5F, 1.0F, 0.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.4997F, -0.9839F, 0.023F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = right_leg.addChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(68, 109).addBox(0.0F, -1.5F, 1.5F, 1.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.4997F, -1.0339F, 0.023F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = right_leg.addChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(46, 96).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0E-4F, -1.0089F, -0.002F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_shin = right_leg.addChild(
         "right_shin",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(44, 107)
            .addBox(-0.4991F, -0.1016F, -1.0062F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(52, 112)
            .addBox(-0.4991F, -0.1016F, -0.0062F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-6.0E-4F, 5.0927F, 0.0041F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = right_shin.addChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(110, 94).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.0E-4F, -0.0266F, -0.0312F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = right_shin.addChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(114, 31).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.0E-4F, 0.0234F, -0.0312F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = right_shin.addChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(114, 29).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.0E-4F, -0.0266F, 0.0188F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = right_shin.addChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(84, 110).addBox(0.5F, 1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.9991F, 0.0234F, 0.0188F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = right_shin.addChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 48).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.0E-4F, -0.0016F, -0.7062F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = right_shin.addChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(62, 112).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(9.0E-4F, 2.4732F, 0.0348F, -0.5672F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = right_shin.addChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(114, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0045F, 5.9054F, -0.2953F, 0.7833F, -0.0075F, 0.011F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_foot = right_shin.addChild(
         "right_foot",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(86, 91)
            .addBox(-1.0F, -0.2777F, -2.928F, 2.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(110, 81)
            .addBox(-1.0F, -1.2777F, 0.072F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(9.0E-4F, 6.1761F, -0.4782F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = right_foot.addChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(84, 107).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.3447F, -0.544F, 0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = body.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(102, 8)
            .addBox(-0.3003F, -1.0089F, -1.0021F, 1.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(22, 102)
            .addBox(-0.7003F, -1.0089F, -0.702F, 1.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(2.1003F, -11.9911F, -0.498F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = left_leg.addChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(100, 112).addBox(0.0F, -1.5F, 1.5F, 1.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5003F, -1.0339F, 0.023F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = left_leg.addChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(108, 3).addBox(0.0F, 1.5F, -1.5F, 1.0F, 0.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5003F, -0.9839F, 0.023F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = left_leg.addChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(56, 112).addBox(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5003F, -0.9839F, -0.0271F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = left_leg.addChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(108, 0).addBox(0.0F, -1.5F, -1.5F, 1.0F, 0.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5003F, -1.0339F, -0.0271F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = left_leg.addChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(56, 96).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.0E-4F, -1.0089F, -0.002F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_shin = left_leg.addChild(
         "left_shin",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(48, 107)
            .addBox(-0.5009F, -0.1016F, -1.0062F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(112, 64)
            .addBox(-0.5009F, -0.1016F, -0.0062F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(6.0E-4F, 5.0927F, 0.0041F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = left_shin.addChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(110, 100).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.0E-4F, -0.0266F, -0.0312F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = left_shin.addChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 114).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.0E-4F, 0.0234F, -0.0312F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r65 = left_shin.addChild(
         "cube_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(114, 33).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.0E-4F, -0.0266F, 0.0188F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r66 = left_shin.addChild(
         "cube_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(110, 98).addBox(0.5F, 1.0F, -1.0F, 1.0F, 0.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0009F, 0.0234F, 0.0188F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r67 = left_shin.addChild(
         "cube_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 52).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.0E-4F, -0.0016F, -0.7062F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r68 = left_shin.addChild(
         "cube_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(66, 112).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-9.0E-4F, 2.4732F, 0.0348F, -0.5672F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r69 = left_shin.addChild(
         "cube_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(114, 25).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0045F, 5.9054F, -0.2953F, 0.7833F, 0.0075F, -0.011F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_foot = left_shin.addChild(
         "left_foot",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(72, 92)
            .addBox(-1.0F, -0.2777F, -2.928F, 2.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(110, 96)
            .addBox(-1.0F, -1.2777F, 0.072F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-9.0E-4F, 6.1761F, -0.4782F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r70 = left_foot.addChild(
         "cube_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(108, 6).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.3447F, -0.544F, 0.5236F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.getPart().traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      float partialTick = ageInTicks % 1.0F;
      float idle = 1.0F;
      if (this.handSwingProgress > 0.0F) {
         this.animateMovement(B1Animation.FIRE, this.handSwingProgress, 1.0F, B1Animation.FIRE.comp_597() * 20.0F, 1.0F);
         idle--;
      }

      if (entity.swgc$getJumpAnimState().isRunning()) {
         this.updateAnimation(entity.swgc$getJumpAnimState(), B1Animation.JUMP, ageInTicks);
         idle--;
      }

      float run = entity.getRunAmount(partialTick);
      if (run < 1.0F) {
         this.animateMovement(B1Animation.WALK, limbSwing, 1.5F * limbSwingAmount, 2.0F, 1.0F - run);
      }

      if (run > 0.0F) {
         this.animateMovement(B1Animation.RUN, limbSwing, limbSwingAmount, 1.0F, run);
      }

      idle -= limbSwingAmount * (1.5F - 0.5F * run);
      this.animateMovement(B1Animation.IDLE, ageInTicks, idle, 1.0F, 1.0F);
      this.neck.yRot = netHeadYaw * (float) Math.PI / 180.0F;
      this.neck.xRot = headPitch * (float) Math.PI / 180.0F;
      this.neck.zRot = 0.0F;
   }

   @Override
   public void animateItem() {
      this.animateMovement(B1Animation.SPAWN, 0.0F, 1.0F, 0.0F, 1.0F);
   }

   public void setArmAngle(net.minecraft.world.entity.HumanoidArm humanoidArm, com.mojang.blaze3d.vertex.PoseStack poseStack) {
      this.root.rotate(poseStack);
      this.body.rotate(poseStack);
      this.chest.rotate(poseStack);
      if (humanoidArm == net.minecraft.world.entity.HumanoidArm.RIGHT) {
         this.rightArm.rotate(poseStack);
         this.rightForearm.rotate(poseStack);
         this.rightHand.rotate(poseStack);
      } else {
         this.leftArm.rotate(poseStack);
         this.leftForearm.rotate(poseStack);
         this.leftHand.rotate(poseStack);
      }

      poseStack.translate(0.0F, -0.4F, 0.03F);
   }
}
