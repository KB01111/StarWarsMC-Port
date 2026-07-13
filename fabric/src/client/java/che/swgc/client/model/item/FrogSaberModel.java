package che.swgc.client.model.item;

import javax.annotation.Nullable;
import net.minecraft.resources.Identifier;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.ItemDisplayContext;

public class FrogSaberModel extends LightsaberModel {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(new net.minecraft.resources.Identifier("modid", "frog"), "lightsab");
   private final net.minecraft.client.model.geom.ModelPart frog;

   public FrogSaberModel(net.minecraft.client.model.geom.ModelPart root) {
      super(root);
      this.frog = root.getChild("frog_saber");
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition frog_saber = partdefinition.addOrReplaceChild("frog_saber", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-0.0556F, 18.8778F, 0.1111F));
      net.minecraft.client.model.geom.builders.PartDefinition eyes = frog_saber.addOrReplaceChild(
         "eyes",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-3.0F, -4.0F, -8.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 5)
            .addBox(1.0F, -4.0F, -8.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-0.4444F, -0.8778F, 3.8889F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone = frog_saber.addOrReplaceChild("bone", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0556F, -0.8778F, 1.8889F));
      net.minecraft.client.model.geom.builders.PartDefinition head = bone.addOrReplaceChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(23, 13)
            .addBox(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 13)
            .addBox(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition tongue = bone.addOrReplaceChild(
         "tongue",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(17, 13).addBox(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.9F, 2.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body = bone.addOrReplaceChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(3, 1)
            .addBox(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(23, 22)
            .addBox(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 2.0F, 1.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition croaking_body = bone.addOrReplaceChild(
         "croaking_body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(26, 5).addBox(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 1.0F, -4.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = frog_saber.addOrReplaceChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 32)
            .addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 40)
            .addBox(-4.0F, 3.01F, -5.0F, 8.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(4.0556F, 0.1222F, -3.6111F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = frog_saber.addOrReplaceChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 38)
            .addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(2, 40)
            .addBox(-4.0F, 3.01F, -5.0F, 8.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-3.9444F, 0.1222F, -3.6111F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = frog_saber.addOrReplaceChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(14, 25)
            .addBox(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(2, 32)
            .addBox(-2.0F, 3.01F, -4.0F, 8.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(3.5556F, 0.1222F, 2.8889F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = frog_saber.addOrReplaceChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 25)
            .addBox(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 32)
            .addBox(-6.0F, 3.01F, -4.0F, 8.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-3.4444F, 0.1222F, 2.8889F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 20.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 48, 48);
   }

   @Override
   public void setupAnim(@Nullable net.minecraft.client.player.LocalPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.root.traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      if (this.ctx == net.minecraft.world.item.ItemDisplayContext.GUI) {
         this.root.pivotY -= 8.0F;
         this.root.yRot += (float) Math.PI;
      } else if (this.activation <= 0.0F) {
         if (this.ctx == net.minecraft.world.item.ItemDisplayContext.THIRD_PERSON_RIGHT_HAND || this.ctx == net.minecraft.world.item.ItemDisplayContext.THIRD_PERSON_LEFT_HAND) {
            this.root.pivotY -= 6.0F;
         }
      } else if (this.ctx == net.minecraft.world.item.ItemDisplayContext.FIRST_PERSON_LEFT_HAND || this.ctx == net.minecraft.world.item.ItemDisplayContext.THIRD_PERSON_LEFT_HAND) {
         this.root.yRot--;
      } else if (this.ctx == net.minecraft.world.item.ItemDisplayContext.FIRST_PERSON_RIGHT_HAND || this.ctx == net.minecraft.world.item.ItemDisplayContext.THIRD_PERSON_RIGHT_HAND) {
         this.root.yRot++;
      }

      this.frog.xScale = this.frog.yScale = this.frog.zScale = 1.2F;
   }
}
