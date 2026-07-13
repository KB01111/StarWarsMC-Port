package che.swgc.client.model.entity;

import che.swgc.client.animation.DroidekaAnimation;
import che.swgc.client.model.item.StaticItemModel;
import che.swgc.entity.Droideka;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
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
import che.swgc.client.compat.animation.Animation;

@javax.annotation.ParametersAreNonnullByDefault
public class DroidekaModel<T extends Droideka> extends che.swgc.client.compat.model.SinglePartEntityModel<T> implements StaticItemModel {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "droideka"), "main");
   private final net.minecraft.client.model.geom.ModelPart root;
   private final net.minecraft.client.model.geom.ModelPart body;
   private final net.minecraft.client.model.geom.ModelPart head;

   public DroidekaModel(net.minecraft.client.model.geom.ModelPart root) {
      super(net.minecraft.client.renderer.rendertype.RenderType::getEntitySolid);
      this.root = root;
      this.body = root.getChild("bone9");
      this.head = this.body.getChild("bone3").getChild("b").getChild("bone").getChild("neck").getChild("head");
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone9 = partdefinition.addChild(
         "bone9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(38, 28)
            .addBox(-2.0F, 2.8086F, -0.7167F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(22, 56)
            .addBox(-2.0F, -2.1913F, -2.7167F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 56)
            .addBox(-2.0F, -2.1913F, 4.2833F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 53)
            .addBox(3.0F, -2.1913F, -0.7167F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(54, 7)
            .addBox(-4.0F, -2.1913F, -0.7167F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-3.0F, -2.1913F, -1.7167F, 6.0F, 5.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(40, 23)
            .addBox(-2.0F, -4.1913F, 1.7833F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(76, 23)
            .addBox(-4.0F, -5.1913F, 4.4904F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(76, 27)
            .addBox(2.0F, -5.1913F, 4.4904F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(40, 9)
            .addBox(2.0F, -3.1913F, -1.7167F, 1.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(40, 16)
            .addBox(-3.0F, -3.1913F, -1.7167F, 1.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(56, 55)
            .addBox(-3.0F, -4.1913F, -0.7167F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(58, 50)
            .addBox(2.0F, -4.1913F, -0.7167F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 70)
            .addBox(-4.0F, -2.6913F, -2.7167F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(46, 71)
            .addBox(2.0F, -2.6913F, -2.7167F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 15.4F, -1.9F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone9.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(78, 74)
            .addBox(-1.0F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(78, 69)
            .addBox(-3.05F, -1.5F, -1.0F, 0.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(66, 34)
            .addBox(-3.025F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.025F, -1.1913F, 5.0833F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bone9.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(80, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.0F, -3.1913F, 4.7833F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bone9.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(76, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.0F, -3.1913F, 4.7833F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bone9.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(42, 76).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.3536F, -3.6913F, 4.4298F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bone9.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 81).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(5.7678F, -3.6913F, 3.0156F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bone9.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 81).addBox(0.0F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-5.7678F, -3.6913F, 3.0156F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bone9.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(76, 19).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.3536F, -3.6913F, 4.4298F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bone9.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(18, 37).addBox(-2.0F, -1.0F, -3.5F, 4.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -2.6117F, 0.9145F, 0.48F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone3 = bone9.addChild("bone3", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, -4.1913F, 3.7833F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bone3.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(76, 49).addBox(-1.0F, -5.8349F, -0.9902F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 1.0026F, -1.0392F, -0.829F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bone3.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(48, 76)
            .addBox(-1.0F, -6.0026F, 1.0392F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(66, 55)
            .addBox(-1.0F, -3.0026F, 0.0392F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 1.0026F, -1.0392F, -0.48F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition b = bone3.addChild("b", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, -3.4F, 3.3947F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = b.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(66, 75).addBox(0.7781F, -5.0451F, -0.3639F, 2.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.1062F, 0.2149F, 0.0617F, 0.7844F, 0.0436F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = b.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 75).addBox(-2.7781F, -5.0451F, -0.3639F, 2.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.1062F, 0.2149F, 0.0617F, -0.7844F, -0.0436F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = b.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 70).addBox(-1.0F, -6.0451F, -1.1005F, 2.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.1062F, 0.2149F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone = b.addChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(54, 15)
            .addBox(-2.0F, -1.8359F, -7.3061F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 20)
            .addBox(-2.0F, -4.8359F, -9.3061F, 4.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, -4.8F, -0.1327F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 78).addBox(0.7513F, -4.0377F, -0.3371F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -1.0938F, 0.0477F, 1.1475F, 0.3897F, 0.7006F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 78).addBox(-1.7513F, -4.0377F, -0.3371F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -1.0938F, 0.0477F, 1.1475F, -0.3897F, -0.7006F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(52, 41).addBox(0.0F, -2.5F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, 4.1507F, -5.7083F, 0.48F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 66).addBox(1.7065F, -1.3589F, -3.0F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -2.8833F, -0.8678F, -0.3806F, 0.0992F, 0.2427F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 50).addBox(-2.0F, -0.8709F, -3.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -2.8833F, -0.8678F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bone.addChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(10, 66).addBox(-3.7064F, -1.3589F, -3.0F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -2.8833F, -0.8678F, -0.3806F, -0.0992F, -0.2427F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bone.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 46).addBox(1.7065F, -1.3589F, -3.0F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.9507F, 0.971F, -0.7681F, 0.1841F, 0.1872F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bone.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, -0.8709F, -3.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.9507F, 0.971F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bone.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(64, 10).addBox(-3.7064F, -1.3589F, -3.0F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.9507F, 0.971F, -0.7681F, -0.1841F, -0.1872F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 38).addBox(0.0F, -1.0F, -2.5F, 2.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.673F, -3.3523F, -6.8061F, 0.0F, 0.0F, -0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bone.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 37).addBox(-2.0F, -1.0F, -2.5F, 2.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.673F, -3.3523F, -6.8061F, 0.0F, 0.0F, 0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bone.addChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(22, 77).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -2.2774F, -4.8158F, -0.6981F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bone.addChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(72, 4).addBox(-1.0F, -5.0377F, -1.0625F, 2.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -1.0938F, 0.0477F, 1.0036F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition neck = bone.addChild(
         "neck",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(10, 56).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -3.8359F, -8.8061F, 0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition head = neck.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(52, 36)
            .addBox(-2.0F, -0.9293F, -2.681F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(42, 55)
            .addBox(-2.0F, 0.1427F, -5.0699F, 4.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(60, 33)
            .addBox(-0.5F, 2.5327F, -6.2831F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.0707F, -1.819F, -0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = head.addChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(70, 0).addBox(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, 2.3427F, -3.3699F, 0.9163F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = head.addChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(56, 4).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.8195F, -0.0581F, -3.481F, 0.0F, 0.0F, 0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = head.addChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(66, 30).addBox(-2.0F, -1.0F, 0.5F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.673F, 0.5543F, -3.181F, 0.0F, 0.0F, 0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = head.addChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.5686F, -3.6841F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = head.addChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(54, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.8195F, -0.0581F, -3.481F, 0.0F, 0.0F, -0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = head.addChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(66, 26).addBox(0.0F, -1.0F, 0.5F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.673F, 0.5543F, -3.181F, 0.0F, 0.0F, -0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition x2 = bone.addChild("x2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, -1.4969F, 1.7171F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = x2.addChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(14, 51).addBox(-2.0F, -0.8709F, -3.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 3.0352F, 0.2132F, -1.1781F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = x2.addChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(66, 18).addBox(-3.7064F, -1.3589F, -3.0F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 3.0352F, 0.2132F, -1.1657F, -0.2415F, -0.1022F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = x2.addChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(66, 14).addBox(1.7065F, -1.3589F, -3.0F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 3.0352F, 0.2132F, -1.1657F, 0.2415F, 0.1022F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition x = x2.addChild("x", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 2.7011F, 0.9632F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = x.addChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(30, 44)
            .addBox(1.0F, -0.8709F, -3.0F, 1.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 44)
            .addBox(-0.5F, -0.8709F, -3.0F, 1.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(42, 0)
            .addBox(2.5F, -0.8709F, -3.0F, 1.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5F, 5.4392F, -1.8981F, -1.9635F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = x.addChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(66, 22).addBox(1.7065F, -1.3589F, -3.0F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 3.0008F, -0.8163F, -1.5708F, 0.2618F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = x.addChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 66).addBox(-3.7064F, -1.3589F, -3.0F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 3.0008F, -0.8163F, -1.5708F, -0.2618F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = x.addChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 51).addBox(-2.0F, -0.8709F, -3.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 3.0008F, -0.8163F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = x.addChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(54, 27).addBox(2.7064F, -1.3589F, -3.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 5.4392F, -1.8981F, -1.9759F, 0.2415F, -0.1022F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = x.addChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(54, 21).addBox(-3.7064F, -1.3589F, -3.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 5.4392F, -1.8981F, -1.9759F, -0.2415F, 0.1022F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = bone.addChild("left_arm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(1.2153F, -0.0612F, -4.6899F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = left_arm.addChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(44, 47)
            .addBox(1.0F, -1.593F, -1.0F, 6.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(76, 14)
            .addBox(0.0F, -1.593F, -1.0F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2153F, -0.1817F, 0.3837F, 0.0F, 0.0F, -0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = left_arm.addChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 45).addBox(-0.229F, 0.7484F, -1.0F, 6.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2153F, -0.1817F, 0.3837F, 0.0F, 0.0F, -0.6545F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone2 = left_arm.addChild(
         "bone2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(30, 67)
            .addBox(-1.0F, 1.6F, -0.7F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 79)
            .addBox(-0.5F, -0.4F, -0.2F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(60, 71)
            .addBox(1.0F, -1.4F, -1.2F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(5.5847F, -2.3747F, 0.0837F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = bone2.addChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.9393F, 0.6F, -1.5536F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = bone2.addChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(74, 34).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 6.4418F, -0.2645F, 0.3491F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = bone2.addChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(8, 79).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 5.7F, 0.0F, -0.4363F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone4 = bone2.addChild("bone4", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 6.7F, -0.5F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = bone4.addChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(6, 79).addBox(-0.5F, -3.5F, 0.5F, 1.0F, 7.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.7F, -2.5F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = bone4.addChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(78, 0)
            .addBox(-1.1F, -0.6F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(62, 77)
            .addBox(0.1F, -0.6F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone8 = bone4.addChild(
         "bone8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(46, 65)
            .addBox(-1.6F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(38, 61)
            .addBox(-1.1F, 4.4F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.6F, 3.0F, -1.5F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = bone8.addChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 64).addBox(0.0F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 7.9F, -0.7F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = bone8.addChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 59).addBox(0.0F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, 7.9F, -0.7F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = bone8.addChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(54, 65).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 2.9F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = bone8.addChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(38, 64).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, 2.9F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = bone.addChild("right_arm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-1.2153F, -0.0612F, -4.6899F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = right_arm.addChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(44, 47)
            .mirrored()
            .addBox(-7.0F, -1.593F, -1.0F, 6.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .texOffs(76, 14)
            .mirrored()
            .addBox(-1.0F, -1.593F, -1.0F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2153F, -0.1817F, 0.3837F, 0.0F, 0.0F, 0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = right_arm.addChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 45)
            .mirrored()
            .addBox(-5.771F, 0.7484F, -1.0F, 6.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2153F, -0.1817F, 0.3837F, 0.0F, 0.0F, 0.6545F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone5 = right_arm.addChild(
         "bone5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(30, 67)
            .mirrored()
            .addBox(-1.0F, 1.6F, -0.7F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .texOffs(12, 79)
            .mirrored()
            .addBox(-0.5F, -0.4F, -0.2F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .texOffs(60, 71)
            .mirrored()
            .addBox(-2.0F, -1.4F, -1.2F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offset(-5.5847F, -2.3747F, 0.0837F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = bone5.addChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 75)
            .mirrored()
            .addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.9393F, 0.6F, -1.5536F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = bone5.addChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(74, 34)
            .mirrored()
            .addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 6.4418F, -0.2645F, 0.3491F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = bone5.addChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(8, 79)
            .mirrored()
            .addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 5.7F, 0.0F, -0.4363F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone6 = bone5.addChild("bone6", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 6.7F, -0.5F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = bone6.addChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(6, 79)
            .mirrored()
            .addBox(-0.5F, -3.5F, 0.5F, 1.0F, 7.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.7F, -2.5F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = bone6.addChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(78, 0)
            .mirrored()
            .addBox(0.1F, -0.6F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .texOffs(62, 77)
            .mirrored()
            .addBox(-1.1F, -0.6F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone7 = bone6.addChild(
         "bone7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(46, 65)
            .mirrored()
            .addBox(-0.4F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false)
            .texOffs(38, 61)
            .mirrored()
            .addBox(0.1F, 4.4F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.6F, 3.0F, -1.5F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = bone7.addChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(78, 64)
            .mirrored()
            .addBox(-1.0F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 7.9F, -0.7F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = bone7.addChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(78, 59)
            .mirrored()
            .addBox(-1.0F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.2F, 7.9F, -0.7F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = bone7.addChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(54, 65)
            .mirrored()
            .addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 2.9F, 0.0F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = bone7.addChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(38, 64)
            .mirrored()
            .addBox(-1.0F, -2.5F, -1.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.2F, 2.9F, 0.0F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition leg1 = bone9.addChild(
         "leg1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, 0.2F, 0.2F, 2.0F, 2.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.1913F, 5.0833F, -0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = leg1.addChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.0694F, 3.6747F, -0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r65 = leg1.addChild(
         "cube_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(72, 80)
            .addBox(1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(50, 80)
            .addBox(3.05F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(74, 55)
            .addBox(1.025F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.025F, 1.2F, 7.5F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone10 = leg1.addChild(
         "bone10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(68, 50)
            .addBox(0.0F, -1.0F, -0.1F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(42, 59)
            .addBox(0.0F, 0.0F, 2.7F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(70, 65)
            .addBox(-0.025F, 0.0F, 2.7F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(70, 70)
            .addBox(1.025F, 0.0F, 2.7F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, 1.2F, 7.5F, -1.0472F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r66 = bone10.addChild(
         "cube_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 41).addBox(0.0F, 0.0F, -3.9F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.0F, 6.6F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition leg2 = bone9.addChild(
         "leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 28).addBox(-1.0F, 0.2F, 0.2F, 2.0F, 2.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.1F, -0.1913F, -1.9167F, 2.9671F, -0.7854F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r67 = leg2.addChild(
         "cube_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.0694F, 3.6747F, -0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r68 = leg2.addChild(
         "cube_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(78, 79)
            .addBox(-1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 79)
            .addBox(-3.05F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(6, 75)
            .addBox(-3.025F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.025F, 1.2F, 7.5F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone11 = leg2.addChild(
         "bone11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(8, 70)
            .addBox(0.0F, -1.0F, -0.1F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(52, 60)
            .addBox(0.0F, 0.0F, 2.7F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, 1.2F, 7.5F, -0.9599F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r69 = bone11.addChild(
         "cube_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(70, 60)
            .addBox(0.0F, 0.0F, -3.9F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(70, 44)
            .addBox(-1.05F, 0.0F, -3.9F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 61)
            .addBox(-1.025F, 0.0F, -3.9F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.025F, 0.0F, 6.6F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition leg3 = bone9.addChild(
         "leg3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, 0.2F, 0.2F, 2.0F, 2.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.1F, -0.1913F, -1.9167F, 2.9671F, 0.7854F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r70 = leg3.addChild(
         "cube_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 11).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.0694F, 3.6747F, -0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r71 = leg3.addChild(
         "cube_r71",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(46, 80)
            .addBox(1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(42, 80)
            .addBox(3.05F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(14, 75)
            .addBox(1.025F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.025F, 1.2F, 7.5F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone12 = leg3.addChild(
         "bone12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 70)
            .addBox(-1.0F, -1.0F, -0.1F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(10, 61)
            .addBox(-1.0F, 0.0F, 2.7F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, 1.2F, 7.5F, -0.9599F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r72 = bone12.addChild(
         "cube_r72",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(70, 39)
            .addBox(0.0F, 0.0F, -3.9F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(38, 70)
            .addBox(1.05F, 0.0F, -3.9F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 61)
            .addBox(0.025F, 0.0F, -3.9F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.025F, 0.0F, 6.6F, -0.2618F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.getPart().traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      if (this.handSwingProgress > 0.0F) {
         che.swgc.client.compat.animation.Animation anim = entity.preferredHand == (entity.getMainArm() == net.minecraft.world.entity.HumanoidArm.RIGHT ? net.minecraft.world.InteractionHand.MAIN_HAND : net.minecraft.world.InteractionHand.OFF_HAND)
            ? DroidekaAnimation.FIRE_R
            : DroidekaAnimation.FIRE_L;
         this.animateMovement(anim, this.handSwingProgress, 1.0F, anim.comp_597() * 20.0F, 1.0F);
      }

      if (entity.zRot != 0) {
         this.updateAnimation(entity.zRotAnimState, DroidekaAnimation.ROLL_ON, ageInTicks);
         if (entity.zRotAnimState.getTimeRunning() > 1000L) {
            this.body.xRot += limbSwing;
         }
      } else {
         this.updateAnimation(entity.zRotAnimState, DroidekaAnimation.ROLL_OFF, ageInTicks);
      }

      this.head.yRot += netHeadYaw * (float) Math.PI / 180.0F;
      this.head.xRot += headPitch * (float) Math.PI / 180.0F;
   }

   @Override
   public void animateItem() {
      this.animateMovement(DroidekaAnimation.ROLL_OFF, 0.0F, 1.0F, 0.0F, 1.0F);
   }
}
