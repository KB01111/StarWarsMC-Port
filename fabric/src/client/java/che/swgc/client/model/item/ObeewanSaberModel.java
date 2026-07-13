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
import net.minecraft.client.player.LocalPlayer;

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
   public void setupAnim(@Nullable net.minecraft.client.player.LocalPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(20, 0)
            .addBox(-1.464F, -0.455F, -1.562F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(20, 9)
            .addBox(-1.464F, -5.755F, -1.562F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(20, 15)
            .addBox(-1.464F, -3.28F, 0.438F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 15)
            .addBox(-1.464F, -3.28F, -1.562F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 15)
            .addBox(-1.464F, -1.28F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 19)
            .addBox(-1.464F, -3.78F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 23)
            .addBox(-1.464F, -5.28F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(42, 0)
            .addBox(-1.464F, -5.28F, 0.463F, 3.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .texOffs(42, 0)
            .addBox(-1.464F, -5.28F, -1.587F, 3.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F))
            .texOffs(12, 26)
            .addBox(0.536F, -3.28F, -1.562F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 10)
            .addBox(0.536F, -3.28F, 0.438F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.464F, 2.045F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .texOffs(0, 0)
            .addBox(-2.464F, 3.545F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .texOffs(0, 0)
            .addBox(-2.464F, 0.545F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .texOffs(16, 31)
            .addBox(-0.464F, -2.855F, 1.138F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 31)
            .addBox(-0.464F, -2.855F, -1.262F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 31)
            .addBox(1.236F, -2.855F, -0.562F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(14, 31)
            .addBox(-1.164F, -2.855F, -0.562F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(-1.964F, 11.045F, -2.062F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .texOffs(16, 18)
            .addBox(-1.464F, 5.045F, -1.562F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F)),
         net.minecraft.client.model.geom.PartPose.offset(-0.036F, 9.555F, 0.062F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_antenna = group.addOrReplaceChild(
         "right_antenna",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 27).addBox(0.011F, -0.655F, -2.262F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(1.75F, 13.0F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_antenna = group.addOrReplaceChild(
         "left_antenna",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 30).addBox(0.061F, -0.655F, -2.262F, 0.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-1.75F, 13.0F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition wings = group.addOrReplaceChild("wings", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition right_top_wing = wings.addOrReplaceChild("right_top_wing", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(1.286F, -3.055F, 0.438F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = right_top_wing.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 26)
            .mirror()
            .addBox(4.5805F, -2.3646F, -0.1F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.25F, -8.1F, -0.4F, -0.2411F, -0.2549F, 0.7728F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_top_wing = wings.addOrReplaceChild("left_top_wing", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-1.214F, -3.055F, 0.438F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = left_top_wing.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 26).addBox(-7.5805F, -2.3646F, -0.1F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.25F, -8.1F, -0.4F, -0.2411F, 0.2549F, -0.7728F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_bottom_wing = wings.addOrReplaceChild("right_bottom_wing", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(1.286F, -3.055F, -0.562F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = right_bottom_wing.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 26)
            .mirror()
            .addBox(4.5805F, -2.3646F, 0.1F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.25F, -8.1F, 0.4F, 0.2411F, 0.2549F, 0.7728F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_bottom_wing = wings.addOrReplaceChild("left_bottom_wing", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(-1.214F, -3.055F, -0.562F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = left_bottom_wing.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 26).addBox(-7.5805F, -2.3646F, 0.1F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.25F, -8.1F, 0.4F, 0.2411F, -0.2549F, -0.7728F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 8.275F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }
}
