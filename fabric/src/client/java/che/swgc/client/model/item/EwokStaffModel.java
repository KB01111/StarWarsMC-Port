package che.swgc.client.model.item;

import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.client.model.Model;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;

public class EwokStaffModel extends net.minecraft.client.model.Model {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "ewok_staff"), "main");
   public EwokStaffModel(net.minecraft.client.model.geom.ModelPart root) {
      super(root, net.minecraft.client.renderer.rendertype.RenderTypes::entityCutout);
   }

   public net.minecraft.client.renderer.rendertype.RenderType getLayer(net.minecraft.resources.Identifier texture) {
      return this.renderType(texture);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition staff = partdefinition.addOrReplaceChild(
         "staff",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(12, 0)
            .addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 14)
            .addBox(-0.4511F, 0.0F, 9.7376F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 10)
            .addBox(-0.9577F, -0.4F, -7.3014F, 0.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 16)
            .addBox(0.4423F, -0.6F, -7.3014F, 0.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 22)
            .addBox(-0.7577F, 0.0F, -6.9014F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2685F, 11.2499F, 0.3F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = staff.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 18).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.225F, 0.5F, -7.4F, 1.0472F, 0.7854F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = staff.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 5).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.225F, 0.5F, -9.9F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = staff.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1724F, 0.5F, -3.9488F, 0.0F, 0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = staff.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.7207F, 0.5F, -9.2514F, 0.0F, -0.1745F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = staff.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 6).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2577F, 0.5F, -9.2514F, 0.0F, 0.1745F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = staff.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2542F, 0.0F, 6.2945F, 0.0F, 0.0873F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = staff.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1915F, 0.0F, 3.4219F, 0.0F, -0.1309F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public void render(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.root().render(poseStack, vertexConsumer, packedLight, packedOverlay, net.minecraft.util.ARGB.color((int)(alpha * 255.0F), (int)(red * 255.0F), (int)(green * 255.0F), (int)(blue * 255.0F)));
   }
}
