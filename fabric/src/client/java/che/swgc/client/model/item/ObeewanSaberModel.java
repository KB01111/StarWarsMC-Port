package che.swgc.client.model.item;

import javax.annotation.Nullable;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.RandomSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.player.AbstractLocalPlayer;

public class ObeewanSaberModel extends LightsaberModel {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "obeewan"), "lightsaber");
   private final net.minecraft.client.model.geom.ModelPart wings;
   private final net.minecraft.client.model.geom.ModelPart right_antenna;
   private final net.minecraft.client.model.geom.ModelPart left_antenna;
   private final net.minecraft.client.model.geom.ModelPart right_top_wing;
   private final net.minecraft.client.model.geom.ModelPart left_top_wing;
   private final net.minecraft.client.model.geom.ModelPart right_bottom_wing;
   private final net.minecraft.client.model.geom.ModelPart left_bottom_wing;

   public ObeewanSaberModel(net.minecraft.client.model.geom.ModelPart root) {
      super(root);
      net.minecraft.client.model.geom.ModelPart group = root.getChild("group");
      this.right_antenna = group.getChild("right_antenna");
      this.left_antenna = group.getChild("left_antenna");
      this.wings = group.getChild("wings");
      this.right_top_wing = this.wings.getChild("right_top_wing");
      this.left_top_wing = this.wings.getChild("left_top_wing");
      this.right_bottom_wing = this.wings.getChild("right_bottom_wing");
      this.left_bottom_wing = this.wings.getChild("left_bottom_wing");
   }

   @Override
   public void setupAnim(@Nullable net.minecraft.client.player.AbstractLocalPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.wings.traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      float anim = ageInTicks % 200.0F;
      if (anim < 10.0F) {
         anim = net.minecraft.util.Mth.sin(anim * 0.6F * (float) Math.PI) * 0.4F;
      } else if (anim > 100.0F && anim < 102.5F) {
         anim = net.minecraft.util.Mth.sin(anim * 0.8F * (float) Math.PI) * 0.25F;
      } else {
         anim = 0.0F;
      }

      if (anim != 0.0F) {
         this.right_top_wing.yRot -= anim;
         this.left_top_wing.yRot += anim;
         this.right_bottom_wing.yRot += anim;
         this.left_bottom_wing.yRot -= anim;
      }

      anim = ageInTicks * 0.025F * (float) Math.PI;
      net.minecraft.util.RandomSource random = net.minecraft.util.RandomSource.create((long)this.stack.hashCode());
      this.right_antenna.xRot = net.minecraft.util.Mth.sin(anim + (float) (Math.PI * 2) * random.nextFloat()) * 0.4F;
      this.right_antenna.yRot = net.minecraft.util.Mth.sin(anim + (float) (Math.PI * 2) * random.nextFloat()) * 0.4F;
      this.left_antenna.xRot = net.minecraft.util.Mth.sin(anim + (float) (Math.PI * 2) * random.nextFloat()) * 0.4F;
      this.left_antenna.yRot = net.minecraft.util.Mth.sin(anim + (float) (Math.PI * 2) * random.nextFloat()) * 0.4F;
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(20, 0)
            .cuboid(-1.464F, -0.455F, -1.562F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(20, 9)
            .cuboid(-1.464F, -5.755F, -1.562F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(20, 15)
            .cuboid(-1.464F, -3.28F, 0.438F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 15)
            .cuboid(-1.464F, -3.28F, -1.562F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 15)
            .cuboid(-1.464F, -1.28F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 19)
            .cuboid(-1.464F, -3.78F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 23)
            .cuboid(-1.464F, -5.28F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(42, 0)
            .cuboid(-1.464F, -5.28F, 0.463F, 3.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .uv(42, 0)
            .cuboid(-1.464F, -5.28F, -1.587F, 3.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .uv(12, 26)
            .cuboid(0.536F, -3.28F, -1.562F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 10)
            .cuboid(0.536F, -3.28F, 0.438F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-2.464F, 2.045F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .uv(0, 0)
            .cuboid(-2.464F, 3.545F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .uv(0, 0)
            .cuboid(-2.464F, 0.545F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .uv(16, 31)
            .cuboid(-0.464F, -2.855F, 1.138F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 31)
            .cuboid(-0.464F, -2.855F, -1.262F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 31)
            .cuboid(1.236F, -2.855F, -0.562F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(14, 31)
            .cuboid(-1.164F, -2.855F, -0.562F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 18)
            .cuboid(-1.964F, 11.045F, -2.062F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .uv(16, 18)
            .cuboid(-1.464F, 5.045F, -1.562F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.036F, 9.555F, 0.062F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_antenna = group.addChild(
         "right_antenna",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 27).cuboid(0.011F, -0.655F, -2.262F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(1.75F, 13.0F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_antenna = group.addChild(
         "left_antenna",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 30).cuboid(0.061F, -0.655F, -2.262F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-1.75F, 13.0F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition wings = group.addChild("wings", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition right_top_wing = wings.addChild("right_top_wing", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(1.286F, -3.055F, 0.438F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = right_top_wing.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 26)
            .mirrored()
            .cuboid(4.5805F, -2.3646F, -0.1F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-1.25F, -8.1F, -0.4F, -0.2411F, -0.2549F, 0.7728F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_top_wing = wings.addChild("left_top_wing", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-1.214F, -3.055F, 0.438F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = left_top_wing.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 26).cuboid(-7.5805F, -2.3646F, -0.1F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.25F, -8.1F, -0.4F, -0.2411F, 0.2549F, -0.7728F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_bottom_wing = wings.addChild("right_bottom_wing", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(1.286F, -3.055F, -0.562F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = right_bottom_wing.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 26)
            .mirrored()
            .cuboid(4.5805F, -2.3646F, 0.1F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-1.25F, -8.1F, 0.4F, 0.2411F, 0.2549F, 0.7728F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_bottom_wing = wings.addChild("left_bottom_wing", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-1.214F, -3.055F, -0.562F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = left_bottom_wing.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 26).cuboid(-7.5805F, -2.3646F, 0.1F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.25F, -8.1F, 0.4F, 0.2411F, -0.2549F, -0.7728F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 8.275F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }
}
