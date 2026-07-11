package che.swgc.client.model.item;

import che.swgc.client.animation.FrogSaberAnimation;
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
import net.minecraft.client.player.AbstractLocalPlayer;
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
      net.minecraft.client.model.geom.builders.PartDefinition frog_saber = partdefinition.addChild("frog_saber", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-0.0556F, 18.8778F, 0.1111F));
      net.minecraft.client.model.geom.builders.PartDefinition eyes = frog_saber.addChild(
         "eyes",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-3.0F, -4.0F, -8.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 5)
            .cuboid(1.0F, -4.0F, -8.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.4444F, -0.8778F, 3.8889F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone = frog_saber.addChild("bone", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0556F, -0.8778F, 1.8889F));
      net.minecraft.client.model.geom.builders.PartDefinition head = bone.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(23, 13)
            .cuboid(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 13)
            .cuboid(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition tongue = bone.addChild(
         "tongue",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(17, 13).cuboid(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.9F, 2.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition body = bone.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(3, 1)
            .cuboid(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(23, 22)
            .cuboid(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 2.0F, 1.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition croaking_body = bone.addChild(
         "croaking_body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(26, 5).cuboid(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 1.0F, -4.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = frog_saber.addChild(
         "left_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 32)
            .cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 40)
            .cuboid(-4.0F, 3.01F, -5.0F, 8.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(4.0556F, 0.1222F, -3.6111F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = frog_saber.addChild(
         "right_arm",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 38)
            .cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(2, 40)
            .cuboid(-4.0F, 3.01F, -5.0F, 8.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-3.9444F, 0.1222F, -3.6111F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = frog_saber.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(14, 25)
            .cuboid(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(2, 32)
            .cuboid(-2.0F, 3.01F, -4.0F, 8.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(3.5556F, 0.1222F, 2.8889F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = frog_saber.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 25)
            .cuboid(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 32)
            .cuboid(-6.0F, 3.01F, -4.0F, 8.0F, 0.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-3.4444F, 0.1222F, 2.8889F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 20.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 48, 48);
   }

   @Override
   public void setupAnim(@Nullable net.minecraft.client.player.AbstractLocalPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
      this.animateMovement(this.activation > 0.0F ? FrogSaberAnimation.WORK : FrogSaberAnimation.IDLE, ageInTicks, 1.0F, 1.0F, 1.0F);
   }
}
