package che.swgc.client.model.entity;

import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;

public class JawaModel<T extends net.minecraft.world.entity.LivingEntity> extends net.minecraft.client.model.player.PlayerModel<T> {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "jawa"), "main");

   public JawaModel(net.minecraft.client.model.geom.ModelPart root) {
      super(root, true);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition head = partdefinition.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 10).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 11.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition hat = partdefinition.addChild(
         "hat",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.5F, -2.5F, 5.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 11.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition ear = partdefinition.addChild("ear", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 11.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition jacket = partdefinition.addChild(
         "jacket",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, 0.0F, -1.5F, 5.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 11.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition backpaks = jacket.addChild("backpaks", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-1.4F, 5.1F, -12.2F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = backpaks.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 8).addBox(-2.9952F, 1.0336F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.8569F, -2.1791F, 11.1F, 0.0F, 0.0F, 1.4573F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = backpaks.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 8).addBox(-1.6239F, 0.0769F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.4569F, -2.3791F, 11.1F, 0.0F, 0.0F, 1.1956F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = backpaks.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 8).addBox(0.1366F, -0.5687F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, -3.8F, 11.0F, 0.0F, 0.0F, -0.9512F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = backpaks.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 8).addBox(-1.1209F, -0.3434F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, -3.8F, 11.0F, 0.0F, 0.0F, -0.8116F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = backpaks.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 8).addBox(1.186F, -0.2672F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.3569F, -2.2791F, 11.1F, 0.0F, 0.0F, 0.9338F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = backpaks.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 8).addBox(-0.2219F, -0.2979F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.3569F, -2.1791F, 11.1F, 0.0F, 0.0F, 1.0559F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = backpaks.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.7F, -2.2F, 11.0F, 0.0F, 0.0F, -0.6894F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = backpaks.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.7F, -1.1F, 11.0F, 0.0F, 0.0F, -0.5498F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = backpaks.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, 0.0F, 11.0F, 0.0F, 0.0F, -0.288F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cloak = partdefinition.addChild("cloak", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = partdefinition.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(36, 23)
            .addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 28)
            .addBox(-1.0F, 2.5F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-3.0F, 11.5F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_sleeve = partdefinition.addChild(
         "right_sleeve",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 18)
            .mirrored()
            .addBox(-1.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.offset(-3.0F, 11.5F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = partdefinition.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(36, 23)
            .addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 28)
            .addBox(-1.0F, 2.5F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(3.0F, 11.5F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_sleeve = partdefinition.addChild(
         "left_sleeve",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 18).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(3.0F, 11.5F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = partdefinition.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 33)
            .addBox(-1.0F, 3.8F, -0.9F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 6)
            .addBox(-1.0F, 5.8F, -1.9F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 32)
            .addBox(-1.0F, -0.2F, -0.9F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-1.0F, 17.2F, -0.1F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_pants = partdefinition.addChild(
         "right_pants",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 27)
            .addBox(-1.5F, 3.8F, -1.4F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 26)
            .addBox(-1.5F, -0.2F, -1.4F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-1.0F, 17.2F, -0.1F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = partdefinition.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 32)
            .addBox(-1.0F, -0.2F, -0.9F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 33)
            .addBox(-1.0F, 3.8F, -0.9F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 6)
            .addBox(-1.0F, 5.8F, -1.9F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(1.0F, 17.2F, -0.1F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_pants = partdefinition.addChild(
         "left_pants",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(12, 26)
            .addBox(-1.5F, -0.2F, -1.4F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 27)
            .addBox(-1.5F, 3.8F, -1.4F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(1.0F, 17.2F, -0.1F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }

   public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      super.setAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      this.head.pivotY += 11.0F;
      this.hat.pivotY += 11.0F;
      this.body.pivotY += 11.0F;
      this.jacket.pivotY += 11.0F;
      this.rightArm.pivotX += 2.0F;
      this.rightArm.pivotY += 9.5F;
      this.rightSleeve.pivotX += 2.0F;
      this.rightSleeve.pivotY += 9.5F;
      this.leftArm.pivotX -= 2.0F;
      this.leftArm.pivotY += 9.5F;
      this.leftSleeve.pivotX -= 2.0F;
      this.leftSleeve.pivotY += 9.5F;
      this.rightLeg.pivotY += 5.0F;
      this.rightPants.pivotY += 5.0F;
      this.leftLeg.pivotY += 5.0F;
      this.leftPants.pivotY += 5.0F;
   }

   public void setArmAngle(net.minecraft.world.entity.HumanoidArm side, com.mojang.blaze3d.vertex.PoseStack poseStack) {
      super.setArmAngle(side, poseStack);
      poseStack.scale(0.6F, 0.6F, 0.6F);
   }
}
