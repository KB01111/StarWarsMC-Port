package che.swgc.client.model.item;

import java.util.function.Function;
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

public class BlasterModel extends net.minecraft.client.model.Model.Simple {
   public static net.minecraft.client.model.geom.ModelLayerLocation DC15S_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "dc15s"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation DC17_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "dc17"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation TL50_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "tl50"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation DH17_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "dh17"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation E5_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "e5"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation DC15A_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "dc15a"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation JAWA_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "jawa"), "blaster");
   private final net.minecraft.client.model.geom.ModelPart root;

   public BlasterModel(net.minecraft.client.model.geom.ModelPart root, Function<net.minecraft.resources.Identifier, net.minecraft.client.renderer.rendertype.RenderType> renderType) {
      super(root, renderType);
      this.root = root;
   }

   public BlasterModel(net.minecraft.client.model.geom.ModelPart root) {
      this(root, net.minecraft.client.renderer.rendertype.RenderTypes::entitySolid);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDc15sLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition DC_15S = partdefinition.addOrReplaceChild(
         "DC_15S",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 85)
            .addBox(-2.4412F, -14.9576F, 2.4968F, 6.0F, 11.0F, 35.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(162, 70)
            .addBox(-3.9412F, -15.3576F, -12.4032F, 9.0F, 11.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(82, 85)
            .addBox(-2.4412F, -5.9576F, 4.4968F, 6.0F, 3.0F, 34.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(176, 26)
            .addBox(-4.4412F, -12.9576F, 34.4968F, 10.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 43)
            .addBox(-4.4412F, -8.9576F, 3.4968F, 10.0F, 5.0F, 37.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(132, 154)
            .addBox(-5.4412F, -12.9576F, -12.5032F, 12.0F, 7.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(94, 70)
            .addBox(-5.4412F, -13.9576F, -11.5032F, 12.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(94, 0)
            .addBox(-4.4412F, -10.9576F, 3.4968F, 10.0F, 4.0F, 31.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(168, 197)
            .addBox(-5.7412F, -14.0576F, -12.4032F, 2.0F, 6.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(98, 207)
            .addBox(-10.7412F, -13.5576F, -11.9032F, 5.0F, 5.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(196, 197)
            .addBox(3.1588F, -12.9576F, -11.0032F, 4.0F, 5.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(94, 35)
            .addBox(-3.4412F, -12.3576F, 3.4968F, 8.0F, 4.0F, 31.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(172, 62)
            .addBox(-4.4412F, -11.9576F, 3.4968F, 10.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-6.0588F, 9.9576F, 0.0032F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = DC_15S.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(202, 26).addBox(-5.0F, -2.0F, 0.5F, 10.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5588F, -10.6576F, 36.4968F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = DC_15S.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 173).addBox(-3.0F, 0.0F, 3.0F, 6.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5588F, -4.3576F, 34.3968F, 0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = DC_15S.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(162, 97).addBox(-4.5F, -2.5F, -10.5F, 9.0F, 7.0F, 17.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5588F, -10.0656F, 12.9387F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = DC_15S.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(34, 207).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 6.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5588F, -4.3576F, -8.4032F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone6 = DC_15S.addOrReplaceChild(
         "bone6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(68, 138)
            .addBox(-2.0F, -0.3773F, -0.5059F, 4.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(68, 147)
            .addBox(-2.0F, 3.2227F, -1.0059F, 4.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.5588F, -4.5803F, 4.0027F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bone6.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 178).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.7773F, -1.0059F, 0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone5 = DC_15S.addOrReplaceChild(
         "bone5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(132, 177).addBox(-4.5F, 5.0F, -7.0F, 8.0F, 24.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0588F, -10.9576F, 10.4968F, 0.3054F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bone5.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(168, 177).addBox(-5.0F, -4.0F, -10.0F, 9.0F, 6.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 29.0F, 0.0F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bone5.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(214, 101).addBox(-6.0F, 3.0F, 10.0F, 9.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, 8.0F, 0.0F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bone5.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(208, 121)
            .addBox(-5.0F, 1.0F, 8.0F, 8.0F, 7.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(154, 122)
            .addBox(-4.5F, -4.0F, -9.0F, 7.0F, 10.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, 7.0F, 0.0F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bone5.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(214, 92).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 3.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, 2.7627F, -19.7258F, -1.6581F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bone5.addOrReplaceChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(214, 169).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, 7.7627F, -20.1258F, -1.1781F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bone5.addOrReplaceChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(214, 107).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, 12.5627F, -18.3258F, -0.3054F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone5.addOrReplaceChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(66, 207).addBox(-3.0F, 3.0F, -16.0F, 5.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 6.1F, 0.7F, 0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone3 = DC_15S.addOrReplaceChild(
         "bone3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(212, 72)
            .addBox(-4.5F, -2.5F, -2.5F, 9.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-4.0F, -2.1F, -41.5F, 8.0F, 4.0F, 39.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(188, 169)
            .addBox(-5.0F, -1.5F, -1.5F, 10.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(208, 135)
            .addBox(-4.0F, -1.5F, -48.5F, 8.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5588F, -1.9576F, -10.2032F, -0.0262F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone4 = bone3.addOrReplaceChild(
         "bone4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(208, 145)
            .addBox(-5.04F, -1.4F, -1.4F, 10.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(212, 82)
            .addBox(-4.54F, -2.4F, -2.4F, 9.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 165)
            .addBox(1.26F, -2.4F, -24.4F, 3.0F, 5.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(176, 0)
            .addBox(-1.34F, -2.4F, -24.4F, 3.0F, 4.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(172, 35)
            .addBox(-4.34F, -2.4F, -24.4F, 3.0F, 5.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.04F, -0.1F, -47.1F, 2.9671F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone2 = DC_15S.addOrReplaceChild(
         "bone2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(136, 70)
            .addBox(-4.0001F, -2.9455F, -3.649F, 8.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(50, 165)
            .addBox(-3.0001F, -1.9455F, -5.649F, 6.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(68, 131)
            .addBox(-2.5001F, -1.4455F, -44.149F, 5.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 131)
            .addBox(-3.5001F, -2.4455F, -31.849F, 7.0F, 7.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(212, 62)
            .addBox(-5.0001F, -1.9455F, -3.449F, 10.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(82, 122)
            .addBox(-4.5001F, -1.4455F, -31.849F, 9.0F, 5.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(196, 213)
            .addBox(-3.0001F, -3.9455F, -3.449F, 6.0F, 10.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(68, 154)
            .addBox(-2.5001F, -3.4455F, -31.849F, 5.0F, 9.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.5589F, -11.0121F, -12.8542F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone2.addOrReplaceChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 190).addBox(-3.0F, -2.0F, 43.0F, 5.0F, 5.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.4999F, 0.5545F, -86.649F, 0.0F, 0.0436F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone2.addOrReplaceChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(128, 211).addBox(-1.0F, -3.5F, -6.5F, 2.0F, 6.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.7999F, -5.9003F, -37.3924F, 0.043F, -0.0076F, 0.1744F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone2.addOrReplaceChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 209).addBox(-1.0F, -3.5F, -6.5F, 2.0F, 6.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.8001F, -5.9003F, -37.3924F, 0.043F, 0.0076F, -0.1744F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone2.addOrReplaceChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(188, 152).addBox(-3.0F, -2.0F, 43.0F, 5.0F, 5.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.4999F, 0.5545F, -86.649F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone2.addOrReplaceChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(84, 190).addBox(-3.0F, -2.0F, 43.0F, 5.0F, 5.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.4999F, 0.5545F, -86.649F, -0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone2.addOrReplaceChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 192).addBox(-3.0F, -2.0F, 43.0F, 5.0F, 5.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.4999F, 0.5545F, -86.649F, 0.0F, -0.0436F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 256, 256);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDc17Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition DC17 = partdefinition.addOrReplaceChild(
         "DC17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 48)
            .addBox(-6.0F, -16.0F, -25.0F, 12.0F, 7.0F, 41.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(23, 172)
            .addBox(-3.5F, -14.5F, -29.0F, 7.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(124, 41)
            .addBox(-6.0F, -18.0F, 12.0F, 12.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(106, 48)
            .addBox(-4.0F, -20.0F, -18.0F, 8.0F, 4.0F, 34.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(124, 0)
            .addBox(-6.0F, -22.0F, -7.0F, 12.0F, 4.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(124, 27)
            .addBox(-5.0F, -21.0F, -18.0F, 10.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(152, 175)
            .addBox(-5.0F, -18.5F, -18.0F, 10.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 140)
            .addBox(-5.0F, -21.5F, -18.0F, 10.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(42, 140)
            .addBox(-6.0F, -20.0F, 16.0F, 12.0F, 16.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(166, 37)
            .addBox(-7.0F, -18.3F, 15.3F, 14.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 170)
            .addBox(-7.0F, -18.3F, 18.3F, 14.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(56, 170)
            .addBox(-7.0F, -18.3F, 12.3F, 14.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(140, 142)
            .addBox(-6.0F, -16.1F, 18.3F, 12.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-8.0F, -11.0F, -24.0F, 16.0F, 2.0F, 46.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(100, 96)
            .addBox(-7.0F, -9.0F, -10.0F, 14.0F, 2.0F, 31.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 96)
            .addBox(-5.5F, -9.0F, -23.0F, 11.0F, 5.0F, 39.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(140, 129)
            .addBox(-3.5F, -4.0F, -21.0F, 7.0F, 1.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(176, 175)
            .addBox(-3.5F, -3.0F, -19.0F, 1.0F, 1.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(110, 177)
            .addBox(2.5F, -3.0F, -19.0F, 1.0F, 1.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(76, 178)
            .addBox(2.5F, -2.0F, -17.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(144, 94)
            .addBox(2.5F, -1.0F, -16.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(152, 94)
            .addBox(-3.5F, -1.0F, -16.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 180)
            .addBox(-3.5F, -2.0F, -17.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(140, 86)
            .addBox(-5.5F, -4.0F, -9.0F, 11.0F, 1.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(140, 158)
            .addBox(-5.5F, -9.0F, -25.0F, 11.0F, 3.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(-6.0F, 10.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = DC17.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(152, 167).addBox(-5.5F, -2.5F, -2.0F, 11.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -6.5F, -21.8F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = DC17.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(152, 178)
            .addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 134)
            .addBox(-6.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, -1.5F, -13.5F, 0.6545F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = DC17.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(178, 129)
            .addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(162, 178)
            .addBox(-6.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, -1.5F, -17.5F, -0.6545F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = DC17.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(148, 94)
            .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(140, 94)
            .addBox(-6.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, 0.0F, -15.5F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = DC17.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(92, 166).addBox(-6.0F, -3.5F, -5.0F, 12.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -16.3F, 18.3F, -0.5672F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = DC17.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(158, 41).addBox(-6.0F, -3.5F, -5.0F, 12.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -13.3F, 20.0F, -0.9599F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = DC17.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 160).addBox(-7.0F, -3.5F, -1.0F, 14.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -14.5F, 14.0F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = DC17.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(166, 27).addBox(-7.0F, -3.5F, -1.0F, 14.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -14.5F, 20.0F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = DC17.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 160).addBox(-7.0F, -3.5F, -1.0F, 14.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -14.5F, 17.0F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = DC17.addOrReplaceChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(74, 140).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -18.4F, -17.5F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = DC17.addOrReplaceChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(172, 151).addBox(-6.0F, -1.0F, -2.5F, 12.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -18.4F, 13.6F, 0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone5 = DC17.addOrReplaceChild(
         "bone5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(144, 177)
            .addBox(-1.0F, -1.6868F, 0.386F, 2.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 152)
            .addBox(-1.0F, -1.6868F, 2.386F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.5F, -4.3132F, 0.614F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone5.addOrReplaceChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 152).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 5.3132F, 1.386F, -0.3491F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone4 = DC17.addOrReplaceChild(
         "bone4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(174, 154).addBox(-3.0F, -3.0F, 8.0F, 5.0F, 10.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.5F, -2.0F, -15.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone4.addOrReplaceChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(126, 177).addBox(-3.0F, 4.0F, -1.0F, 5.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 5.6F, 11.4F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone4.addOrReplaceChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(88, 172).addBox(-3.0F, -1.0F, -2.0F, 5.0F, 5.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 6.0F, 11.0F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone4.addOrReplaceChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(172, 142).addBox(-4.0F, 1.0F, -1.0F, 7.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 3.5F, 23.7F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone4.addOrReplaceChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(176, 86).addBox(-3.0F, 1.0F, -1.0F, 5.0F, 7.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 3.8F, 23.7F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone4.addOrReplaceChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 173).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 11.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 6.3F, 21.0F, -1.3963F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone4.addOrReplaceChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 178).addBox(-3.0F, 4.0F, -1.0F, 5.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -6.5F, 12.1F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone3 = DC17.addOrReplaceChild("bone3", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.5F, -2.0F, -15.0F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bone3.addOrReplaceChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 173).addBox(-5.0F, 0.0F, 0.0F, 9.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 2.6F, 30.9F, 1.309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bone3.addOrReplaceChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(124, 167).addBox(-5.0F, -3.0F, -2.0F, 9.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -1.8F, 33.4F, 0.6545F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bone3.addOrReplaceChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 86).addBox(-5.0F, 21.0F, -4.0F, 9.0F, 2.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.3F, 31.0F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bone3.addOrReplaceChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 152).addBox(-5.0F, 12.0F, -8.0F, 9.0F, 11.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.3F, 30.7F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone3.addOrReplaceChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(74, 152).addBox(-5.0F, 1.0F, -6.0F, 9.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -6.7F, 22.4F, 0.7418F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bone3.addOrReplaceChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(100, 129).addBox(-5.0F, -3.0F, -8.0F, 9.0F, 26.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -1.0F, 29.0F, 0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone2 = DC17.addOrReplaceChild(
         "bone2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(110, 172)
            .addBox(-2.0F, -9.0F, 37.0F, 3.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 168)
            .addBox(-5.0F, -12.0F, 39.0F, 9.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.5F, -2.0F, -15.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 256, 256);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createTl50Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone = partdefinition.addOrReplaceChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-2.01F, -4.02F, -15.92F, 4.0F, 8.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(158, 84)
            .addBox(-3.015F, -5.383F, -17.91F, 6.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(142, 38)
            .addBox(-5.025F, 2.577F, -17.91F, 10.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(150, 154)
            .addBox(-3.015F, -5.413F, -17.91F, 6.0F, 8.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 34)
            .addBox(-0.219F, -0.438F, 4.97F, 4.0F, 8.0F, 21.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(50, 34)
            .addBox(-3.801F, -0.438F, 4.97F, 4.0F, 8.0F, 21.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(60, 0)
            .addBox(-2.01F, -1.05F, 25.87F, 4.0F, 10.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 63)
            .addBox(-1.01F, -2.05F, 43.77F, 2.0F, 12.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(106, 21)
            .addBox(-2.01F, 6.348F, 23.88F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(120, 111)
            .addBox(-2.01F, 6.358F, 19.9F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(122, 21)
            .addBox(-2.01F, 6.358F, 17.91F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 4.1F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(178, 21).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -5.1F, 22.8F, 0.0F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bone.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(72, 142).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, -5.4F, 22.8F, 0.0F, 0.0F, -0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bone.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(72, 138).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -5.4F, 22.8F, 0.0F, 0.0F, 0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bone.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(72, 175).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 8.5F, 43.6F, -0.6545F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bone.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(172, 17).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.7F, 43.4F, 0.48F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bone.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(170, 108).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 10.6935F, 23.8813F, 0.9861F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bone.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(160, 17).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 11.6935F, 22.7813F, 0.5323F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bone.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(158, 108).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 11.9935F, 21.1813F, -0.1222F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bone.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(148, 17).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 11.4935F, 19.8813F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bone.addOrReplaceChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(100, 60).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 10.1935F, 18.8813F, -1.2217F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bone.addOrReplaceChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(130, 171).addBox(-2.01F, -5.005F, -1.99F, 4.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 7.761F, 19.303F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone.addOrReplaceChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(92, 157).addBox(-2.01F, -6.03F, -2.985F, 4.0F, 12.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 13.93F, 30.845F, 0.4363F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone.addOrReplaceChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 174).addBox(-2.5F, -2.5F, -0.5F, 5.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0167F, -1.7971F, 30.21F, 0.0F, 0.0F, -0.7418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone.addOrReplaceChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(114, 155).addBox(-2.01F, -2.01F, -5.97F, 4.0F, 4.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -1.99F, 23.88F, 0.0F, 0.0F, -0.7418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone.addOrReplaceChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(154, 67).addBox(-1.005F, -1.005F, -11.945F, 2.0F, 2.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.99F, 5.771F, 2.985F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone.addOrReplaceChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(154, 50).addBox(-1.005F, -1.005F, -11.945F, 2.0F, 2.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.99F, 5.771F, 2.985F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone.addOrReplaceChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 137).addBox(-2.5777F, -2.3677F, -3.98F, 4.0F, 6.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0995F, -2.786F, 9.95F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone.addOrReplaceChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 133).addBox(-1.4423F, -2.3677F, -3.98F, 4.0F, 6.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0995F, -2.786F, 9.95F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bone.addOrReplaceChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(170, 172).addBox(-1.005F, -1.005F, -1.99F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.1921F, 1.672F, -18.2682F, 0.0F, 0.0F, 0.6545F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bone.addOrReplaceChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(158, 172).addBox(-1.005F, -1.005F, -1.99F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.7879F, 1.672F, -18.4672F, 0.0F, 0.0F, 0.6545F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bone.addOrReplaceChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(146, 172).addBox(-1.005F, -1.005F, -1.99F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2021F, -1.91F, -19.2632F, 0.0F, 0.0F, 0.6545F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bone.addOrReplaceChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(64, 157).addBox(-2.01F, -3.025F, -4.975F, 4.0F, 8.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.99F, -0.995F, -12.935F, 0.0F, 0.0F, 0.3054F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone.addOrReplaceChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 156).addBox(-2.01F, -3.025F, -4.975F, 4.0F, 8.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.99F, -0.995F, -12.935F, 0.0F, 0.0F, -0.3054F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(60, 29)
            .addBox(-3.0F, -15.5F, -1.0F, 6.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(76, 29)
            .addBox(-3.0F, -15.6F, -10.0F, 6.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(142, 21)
            .addBox(0.2F, -22.8F, -8.2F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(148, 0)
            .addBox(0.2F, -20.8F, -8.2F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(150, 137)
            .addBox(-2.2F, -22.8F, -8.2F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 153)
            .addBox(-2.2F, -20.8F, -8.2F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(154, 128)
            .addBox(3.0F, -19.0F, 11.0F, 2.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(168, 128)
            .addBox(4.3F, -18.5F, 11.0F, 1.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 174)
            .addBox(4.5F, -19.4F, 11.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(114, 137)
            .addBox(0.2F, -17.8F, -8.2F, 2.0F, 2.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 138)
            .addBox(-2.2F, -17.8F, -8.2F, 2.0F, 2.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(112, 171)
            .addBox(-1.0F, -10.0F, 54.8F, 2.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bb_main.addOrReplaceChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(40, 117).addBox(-0.5F, -1.5F, -9.0F, 1.0F, 3.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.6642F, -9.5F, 52.881F, -0.3403F, 0.0698F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bb_main.addOrReplaceChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 170).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.6642F, -9.5F, 52.881F, 0.0087F, 0.0698F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bb_main.addOrReplaceChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(158, 96).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.6642F, -9.5F, 52.881F, 0.0087F, -0.0698F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bb_main.addOrReplaceChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(116, 50).addBox(-0.5F, -1.5F, -9.0F, 1.0F, 3.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.6642F, -9.5F, 52.881F, -0.3403F, -0.0698F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bb_main.addOrReplaceChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(154, 111).addBox(-1.0F, -2.0F, -8.0F, 2.0F, 2.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -7.4F, 54.2F, -0.3491F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bb_main.addOrReplaceChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(92, 29).addBox(-1.0F, 0.0742F, -1.1647F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -24.7F, 19.6F, 1.1868F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bb_main.addOrReplaceChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(178, 29)
            .addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 25)
            .addBox(2.3F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.4F, -17.0F, 58.9F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bb_main.addOrReplaceChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(72, 150)
            .addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(72, 146)
            .addBox(6.7F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.6F, -17.0F, 7.0F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bb_main.addOrReplaceChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(146, 158).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -27.2F, -15.5F, 0.0F, 0.0F, 0.576F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bb_main.addOrReplaceChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(146, 155).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.8F, -27.2F, -15.5F, 0.0F, 0.0F, -0.6632F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bb_main.addOrReplaceChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(154, 88).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, -26.0F, -15.5F, 0.0F, 0.0F, -0.7418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = bb_main.addOrReplaceChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(112, 60).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -26.0F, -15.5F, 0.0F, 0.0F, 0.7418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = bb_main.addOrReplaceChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(154, 84)
            .addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(150, 111)
            .addBox(-0.5F, -1.5F, 6.9F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-4.1F, -20.9F, -16.6F, 0.0F, 0.0F, 0.3142F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = bb_main.addOrReplaceChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 170).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.8F, -20.8F, -15.6F, 0.0F, 0.0F, 0.3142F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = bb_main.addOrReplaceChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(100, 50).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.8F, -20.8F, -15.6F, 0.0F, 0.0F, -0.3142F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = bb_main.addOrReplaceChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(138, 21)
            .addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 133)
            .addBox(-0.5F, -1.5F, 6.9F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.1F, -20.9F, -16.6F, 0.0F, 0.0F, -0.3142F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = bb_main.addOrReplaceChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(136, 111).addBox(0.0F, -1.0F, -4.0F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(4.1F, -16.5F, 15.0F, 0.0F, 0.0F, 0.6632F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = bb_main.addOrReplaceChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(50, 180)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(146, 178)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -20.6F, -2.3F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = bb_main.addOrReplaceChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(44, 180)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 106)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -20.6F, 1.3F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = bb_main.addOrReplaceChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(38, 180)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(164, 178)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -20.6F, -7.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = bb_main.addOrReplaceChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(32, 180)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(158, 178)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -20.6F, -3.2F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = bb_main.addOrReplaceChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(26, 180)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(152, 178)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -20.6F, 5.2F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = bb_main.addOrReplaceChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(20, 180)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 104)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -20.6F, 2.2F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = bb_main.addOrReplaceChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(180, 19)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 102)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -21.9F, -3.1F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = bb_main.addOrReplaceChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(180, 17)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 100)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -21.9F, 1.4F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = bb_main.addOrReplaceChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(102, 179)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 98)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -21.9F, 5.3F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = bb_main.addOrReplaceChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(96, 179)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 96)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -21.9F, -7.1F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = bb_main.addOrReplaceChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(90, 179)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(178, 36)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -21.9F, 2.2F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = bb_main.addOrReplaceChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(84, 179)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(174, 135)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -21.9F, -2.3F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = bb_main.addOrReplaceChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(78, 179)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(134, 27)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -21.3F, -2.7F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = bb_main.addOrReplaceChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(72, 179)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(128, 27)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -21.3F, -7.5F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = bb_main.addOrReplaceChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(176, 178)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(168, 135)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -21.3F, 5.8F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = bb_main.addOrReplaceChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(170, 178)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(122, 27)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.2F, -21.3F, 1.8F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = bb_main.addOrReplaceChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 175).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -10.0F, 32.0F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = bb_main.addOrReplaceChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 113).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.9497F, -12.8231F, 28.9F, 0.0F, 0.0F, -0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = bb_main.addOrReplaceChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 93).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.9497F, -12.8231F, 28.9F, 0.0F, 0.0F, 0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = bb_main.addOrReplaceChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 0).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.9497F, -20.1769F, 28.9F, 0.0F, 0.0F, 0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = bb_main.addOrReplaceChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(100, 29).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.9497F, -20.1769F, 28.9F, 0.0F, 0.0F, -0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = bb_main.addOrReplaceChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(104, 175)
            .addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(88, 175)
            .addBox(-1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.0F, -14.0F, -9.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = bb_main.addOrReplaceChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(96, 175)
            .addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(80, 175)
            .addBox(-1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, -14.0F, -9.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = bb_main.addOrReplaceChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(178, 33).addBox(-1.0F, -0.3973F, -0.2565F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -10.55F, 21.9F, -0.6283F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r65 = bb_main.addOrReplaceChild(
         "cube_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(72, 154).addBox(-1.0F, -1.5983F, -0.246F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -10.55F, 21.9F, 0.1571F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r66 = bb_main.addOrReplaceChild(
         "cube_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(120, 91).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.5F, -10.9F, 45.9F, -0.253F, 0.2757F, 0.9794F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r67 = bb_main.addOrReplaceChild(
         "cube_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(116, 117).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5F, -10.9F, 45.9F, -0.253F, -0.2757F, -0.9794F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r68 = bb_main.addOrReplaceChild(
         "cube_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 117).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5F, -21.0F, 45.9F, 0.0611F, 0.0174F, 1.0045F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r69 = bb_main.addOrReplaceChild(
         "cube_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(116, 71).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.5F, -21.0F, 45.9F, 0.0611F, -0.0174F, -1.0045F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r70 = bb_main.addOrReplaceChild(
         "cube_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(80, 91).addBox(-0.5F, -4.0F, -5.5F, 1.0F, 7.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.2084F, -16.0F, 30.4895F, 0.0F, 0.0175F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r71 = bb_main.addOrReplaceChild(
         "cube_r71",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(40, 91).addBox(-0.5F, -4.0F, -5.5F, 1.0F, 7.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.2084F, -16.0F, 30.4895F, 0.0F, -0.0175F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r72 = bb_main.addOrReplaceChild(
         "cube_r72",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 63).addBox(-0.5F, -5.0F, -9.0F, 1.0F, 10.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.6642F, -16.0F, 52.881F, 0.0F, 0.0698F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r73 = bb_main.addOrReplaceChild(
         "cube_r73",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(40, 63).addBox(-0.5F, -5.0F, -9.0F, 1.0F, 10.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.6642F, -16.0F, 52.881F, 0.0F, -0.0698F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 256, 256);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDh17Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(88, 102)
            .addBox(-1.015F, -26.822F, -20.685F, 2.0F, 2.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(110, 92)
            .addBox(-2.03F, -24.882F, 12.08F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 77)
            .addBox(-2.03F, -26.458F, 6.17F, 4.0F, 4.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 48)
            .addBox(-1.0F, -29.0F, -3.0F, 2.0F, 2.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(96, 41)
            .addBox(-1.0F, -29.6F, 10.8F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(42, 122)
            .addBox(0.3F, -28.7F, 22.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 122).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -30.8F, 13.3F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(58, 48).addBox(-1.0F, -1.0F, -13.5F, 1.0F, 1.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.6F, -27.5F, 10.5F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(58, 76).addBox(-1.0F, -1.0F, -13.5F, 1.0F, 1.0F, 25.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.6F, -27.5F, 10.5F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bb_main.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(122, 43).addBox(-0.5764F, -1.0F, -0.8681F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -32.4959F, 16.8F, -1.5708F, 0.0F, 1.0647F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bb_main.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(18, 121).addBox(-0.1016F, -1.0F, -0.1775F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -32.4959F, 16.8F, -1.5708F, 0.0F, -0.6109F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bb_main.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 109).addBox(-0.8984F, -1.0F, -0.1775F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -32.4959F, 16.8F, -1.5708F, 0.0F, 0.6109F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bb_main.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(6, 122).addBox(-0.4045F, -1.0F, -0.8636F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -32.4959F, 16.8F, -1.5708F, 0.0F, -1.117F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bb_main.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(54, 87).addBox(-0.5151F, -1.0F, -0.9452F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -32.4959F, 16.8F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bb_main.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(76, 121).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2849F, -32.7411F, 9.8F, -1.5708F, 0.0F, -1.117F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bb_main.addOrReplaceChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(54, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0151F, -32.9411F, 9.8F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bb_main.addOrReplaceChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(46, 117).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2849F, -32.7411F, 9.8F, -1.5708F, 0.0F, 1.0647F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bb_main.addOrReplaceChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(30, 121).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5113F, -32.4603F, 9.8F, -1.5708F, 0.0F, 0.6109F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bb_main.addOrReplaceChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 121).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5113F, -32.4603F, 9.8F, -1.5708F, 0.0F, -0.6109F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bb_main.addOrReplaceChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(28, 117)
            .addBox(-0.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 117)
            .addBox(-2.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -11.4513F, 15.535F, 1.2828F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bb_main.addOrReplaceChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(120, 119).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -27.6F, 24.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bb_main.addOrReplaceChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(120, 115).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -27.6F, -3.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bb_main.addOrReplaceChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 117).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, -31.0071F, 9.8F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bb_main.addOrReplaceChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(70, 116).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -31.0071F, 16.8F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bb_main.addOrReplaceChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(120, 111).addBox(-0.4484F, -0.4484F, 0.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -32.0216F, 5.0664F, -0.2443F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bb_main.addOrReplaceChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(112, 119).addBox(-0.4484F, -0.4484F, 0.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -32.1319F, 5.0664F, 0.0F, -0.2443F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bb_main.addOrReplaceChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(104, 119).addBox(-0.4484F, -0.4484F, 0.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -32.0216F, 5.0664F, 0.2443F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bb_main.addOrReplaceChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 118).addBox(-0.4484F, -0.4484F, 0.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -32.1319F, 5.0664F, 0.0F, 0.2443F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bb_main.addOrReplaceChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(114, 100).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -33.6F, 12.5F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bb_main.addOrReplaceChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(114, 53)
            .addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(114, 47)
            .addBox(-1.5F, -1.5F, 5.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -32.0F, 13.3F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bb_main.addOrReplaceChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 28).addBox(-0.5F, -1.5F, -9.5F, 2.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -31.3F, 17.3F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bb_main.addOrReplaceChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(110, 100)
            .addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(54, 93)
            .addBox(3.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.7F, -18.4F, 15.2F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bb_main.addOrReplaceChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(114, 73).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.5F, -25.7F, 1.5F, 0.0F, -1.0647F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bb_main.addOrReplaceChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(122, 40).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.0F, -21.0F, 13.1F, 0.4014F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bb_main.addOrReplaceChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 109)
            .addBox(-1.0F, 2.0F, -6.0F, 3.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 87)
            .addBox(1.0F, 2.0F, -6.0F, 3.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(72, 102)
            .addBox(-1.0F, -5.0F, -5.0F, 3.0F, 9.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(56, 102)
            .addBox(1.0F, -5.0F, -5.0F, 3.0F, 9.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5F, -15.6F, 19.0F, 0.4451F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bb_main.addOrReplaceChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 116).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, -20.5291F, 15.3402F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bb_main.addOrReplaceChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 116).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, -20.5291F, 15.3402F, -0.2618F, 0.0045F, 0.0169F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bb_main.addOrReplaceChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(114, 66)
            .addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(114, 59)
            .addBox(-4.0F, -5.0F, -1.0F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.5F, -21.5F, 15.5F, -0.6894F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bb_main.addOrReplaceChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(88, 118)
            .addBox(-1.0F, -5.0F, -1.0F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(38, 117)
            .addBox(1.0F, -5.0F, -1.0F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5F, -18.1F, 17.8F, 0.4451F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bb_main.addOrReplaceChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(122, 37).addBox(-1.0F, -0.2651F, -0.2541F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -21.025F, 10.15F, -0.6632F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = bb_main.addOrReplaceChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 122).addBox(-1.0F, -1.7328F, -0.2477F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -21.025F, 10.15F, -0.0087F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = bb_main.addOrReplaceChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(122, 34).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -18.4F, 11.8F, 2.0508F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = bb_main.addOrReplaceChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(122, 31).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -17.95F, 10.3F, 1.6581F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = bb_main.addOrReplaceChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(122, 28).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -18.05F, 8.5F, 1.3701F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = bb_main.addOrReplaceChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -18.85F, 7.05F, 0.8203F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = bb_main.addOrReplaceChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(109, 103).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.03F, -21.2637F, 13.4379F, -0.9687F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = bb_main.addOrReplaceChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(70, 121).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -20.25F, 6.1F, 0.3229F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = bb_main.addOrReplaceChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 113).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -21.8F, 6.1F, -0.3316F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = bb_main.addOrReplaceChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(88, 112).addBox(-2.03F, -2.03F, -0.985F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -24.231F, 4.988F, 1.0908F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = bb_main.addOrReplaceChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(108, 111).addBox(-2.03F, -3.03F, -1.97F, 4.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -22.367F, 15.702F, -0.7069F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = bb_main.addOrReplaceChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(110, 41).addBox(-1.1843F, -0.4977F, -0.985F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.97F, -26.004F, 27.249F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = bb_main.addOrReplaceChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(10, 117).addBox(-1.1543F, -0.4977F, -0.985F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.197F, -27.777F, 27.249F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = bb_main.addOrReplaceChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(80, 116).addBox(-1.015F, -2.03F, -0.985F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.985F, -24.625F, 27.249F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = bb_main.addOrReplaceChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(100, 112).addBox(-1.015F, -2.03F, -0.985F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.985F, -26.595F, 27.249F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = bb_main.addOrReplaceChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(110, 84).addBox(-1.015F, -1.015F, 0.0F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.807F, -20.685F, 0.0F, -0.2443F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = bb_main.addOrReplaceChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(110, 76).addBox(-1.015F, -1.015F, 0.0F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.807F, -20.685F, 0.0F, 0.2443F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = bb_main.addOrReplaceChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(34, 109).addBox(-1.015F, -1.015F, 0.0F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.61F, -20.685F, 0.2443F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = bb_main.addOrReplaceChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(18, 109).addBox(-1.015F, -1.015F, 0.0F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.61F, -20.685F, -0.2443F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = bb_main.addOrReplaceChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 14).addBox(-2.03F, -2.03F, -19.7F, 4.0F, 4.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.61F, 3.94F, 0.0F, 0.0F, 1.9635F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = bb_main.addOrReplaceChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 0).addBox(-2.03F, -2.03F, -19.7F, 4.0F, 4.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.61F, 3.94F, 0.0F, 0.0F, 1.7017F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = bb_main.addOrReplaceChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 95).addBox(-2.03F, -2.03F, -19.7F, 4.0F, 4.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.61F, 3.94F, 0.0F, 0.0F, 1.4399F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = bb_main.addOrReplaceChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 95).addBox(-2.03F, -2.03F, -19.7F, 4.0F, 4.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.61F, 3.94F, 0.0F, 0.0F, 1.1345F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = bb_main.addOrReplaceChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 77).addBox(-2.03F, 0.97F, -5.91F, 4.0F, 4.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -19.908F, 17.413F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = bb_main.addOrReplaceChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 0).addBox(-2.03F, -2.03F, -19.7F, 4.0F, 4.0F, 44.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.61F, 3.94F, 0.0F, 0.0F, 0.7854F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createE5Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(34, 29)
            .addBox(-0.8F, -28.634F, 1.343F, 2.0F, 3.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(40, 85)
            .addBox(-2.2F, -29.1327F, 8.4428F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(34, 44)
            .addBox(-1.8F, -28.6327F, 1.343F, 2.0F, 3.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(64, 91)
            .addBox(-0.85F, -31.6327F, 8.4431F, 1.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(94, 33)
            .addBox(-1.7F, -28.528F, 12.8516F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(96, 11)
            .addBox(0.1F, -28.528F, 12.8516F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(96, 21)
            .addBox(0.1F, -26.728F, 12.8516F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 83)
            .addBox(-1.699F, -26.728F, 12.8516F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 92)
            .addBox(-1.8F, -28.6328F, 13.857F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(94, 29)
            .addBox(-0.8F, -28.6327F, 13.8572F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(48, 95)
            .addBox(-0.8F, -31.0327F, 11.9572F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 85)
            .addBox(-1.3F, -28.4327F, -2.557F, 2.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 75)
            .addBox(-0.798F, -20.2165F, -2.9877F, 1.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(96, 3)
            .addBox(-0.8F, -30.5327F, -2.3571F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(96, 7)
            .addBox(-0.799F, -30.5327F, -1.7571F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(86, 29)
            .addBox(-0.799F, -31.1327F, 1.343F, 1.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 96)
            .addBox(-0.8F, -31.6327F, 0.2429F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 92)
            .addBox(-1.3F, -31.6327F, -1.7571F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(56, 59)
            .addBox(-0.8F, -28.6327F, -13.5571F, 2.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 61)
            .addBox(-1.8F, -28.635F, -13.5571F, 2.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(82, 69)
            .addBox(-0.8F, -27.4327F, -1.957F, 5.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(86, 46)
            .addBox(-1.301F, -32.3327F, -3.7571F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(62, 52)
            .addBox(-1.999F, -28.4327F, -7.2571F, 4.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(82, 63)
            .addBox(-2.0F, -26.9327F, -7.257F, 4.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(52, 85)
            .addBox(-1.799F, -28.0327F, -2.557F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(64, 85)
            .addBox(-0.799F, -28.0327F, -2.557F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(96, 23)
            .addBox(-0.798F, -31.1327F, 0.7429F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 96)
            .addBox(-0.801F, -30.6327F, 0.7429F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(14, 85)
            .addBox(-0.8F, -31.0327F, -12.0429F, 1.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(96, 14)
            .addBox(0.1F, -28.528F, -14.3484F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(96, 25)
            .addBox(0.099F, -26.728F, -14.3484F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(6, 96)
            .addBox(-1.7F, -26.728F, -14.3484F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(90, 95)
            .addBox(-1.7F, -28.528F, -14.3484F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(88, 85)
            .addBox(-0.799F, -30.5327F, -12.0571F, 1.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(62, 40)
            .addBox(-1.0844F, -31.0223F, -25.043F, 1.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(50, 73)
            .addBox(-0.6156F, -30.9777F, -25.043F, 1.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 96)
            .addBox(-1.3F, -31.5327F, -26.8429F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 96)
            .addBox(-0.8F, -29.5327F, -26.8429F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(76, 85)
            .addBox(-0.8F, -27.6327F, -30.043F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(86, 36)
            .addBox(-1.299F, -28.1328F, -28.043F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 75)
            .addBox(-0.799F, -26.9327F, -5.257F, 1.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(48, 91)
            .addBox(-1.8F, -24.3327F, -8.0571F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(94, 46)
            .addBox(-0.8F, -23.6327F, -7.657F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 38).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.7F, -19.5327F, -3.7571F, 0.0F, 0.2793F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(86, 6).addBox(-0.499F, -0.382F, -2.989F, 1.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -16.6685F, 1.7651F, -0.096F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -0.382F, -1.011F, 1.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -16.6685F, 1.7651F, 1.021F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bb_main.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 17).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -17.642F, -5.7354F, 1.3614F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bb_main.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 19).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -17.9366F, -6.5233F, 1.0647F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bb_main.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -18.4142F, -6.9845F, 0.4712F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bb_main.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(54, 95).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -20.6327F, -3.2571F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bb_main.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(86, 41).addBox(-1.499F, -1.8F, 3.5F, 3.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -26.5327F, -19.6571F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bb_main.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(86, 18).addBox(-0.502F, -4.7999F, -5.5F, 3.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.7F, -27.5327F, -13.657F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bb_main.addOrReplaceChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 85).addBox(-1.501F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -25.5559F, -16.9844F, -0.7243F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bb_main.addOrReplaceChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(40, 91)
            .addBox(-0.5F, -4.8F, -5.5F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(70, 91)
            .addBox(-0.5F, -3.8F, -7.5F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(86, 12)
            .addBox(-0.5F, -3.8F, -10.4F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2F, -27.5327F, -14.157F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bb_main.addOrReplaceChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(90, 79)
            .addBox(-1.499F, -3.8F, -5.5F, 3.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(90, 73)
            .addBox(-1.499F, -3.8F, -8.8F, 3.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 59)
            .addBox(-1.5F, -1.8F, -8.8001F, 3.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(58, 14)
            .addBox(-1.5F, -1.2F, -8.8F, 3.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -27.1327F, -16.3571F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bb_main.addOrReplaceChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 92).addBox(-1.0F, -1.2514F, -0.7003F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -27.1327F, -25.0338F, 0.8727F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bb_main.addOrReplaceChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(8, 92).addBox(-1.0F, -1.2514F, -0.7003F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -27.1327F, -25.0338F, 0.8727F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bb_main.addOrReplaceChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 92).addBox(-1.0F, -1.2514F, -0.7003F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -27.1327F, -25.0338F, 0.8727F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bb_main.addOrReplaceChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(90, 91).addBox(-1.0F, -1.2514F, -0.7003F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -27.1327F, -25.0338F, 0.8727F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bb_main.addOrReplaceChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(28, 96)
            .addBox(-0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-0.5F, -0.5F, 17.0F, 1.0F, 1.0F, 28.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -30.5327F, -31.043F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bb_main.addOrReplaceChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(26, 73)
            .addBox(-0.2656F, -0.5223F, -5.0F, 1.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(62, 28)
            .addBox(-0.7344F, -0.4777F, -5.0F, 1.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.35F, -30.5F, -20.043F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bb_main.addOrReplaceChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(58, 0).addBox(-1.5F, -1.5F, -5.5001F, 3.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.6F, -27.1327F, -19.6571F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bb_main.addOrReplaceChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 47).addBox(-1.5F, -1.5F, -5.5002F, 3.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -27.1327F, -19.6571F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bb_main.addOrReplaceChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 54).addBox(-0.999F, -3.0F, -0.5F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -29.9233F, -0.8367F, 1.7715F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bb_main.addOrReplaceChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 36).addBox(-1.0001F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3071F, -32.6398F, -0.2571F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bb_main.addOrReplaceChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 96).addBox(-0.4999F, -0.5F, -0.5001F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5929F, -31.6327F, -0.2571F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bb_main.addOrReplaceChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 96).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0071F, -32.3398F, -0.2571F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bb_main.addOrReplaceChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(22, 83).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -17.3381F, -4.9833F, 1.0123F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bb_main.addOrReplaceChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 91).addBox(0.0F, -3.5F, -0.5F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -16.4698F, -3.9517F, -0.5934F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bb_main.addOrReplaceChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(86, 24).addBox(-0.003F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -16.8985F, -4.4278F, 0.6981F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bb_main.addOrReplaceChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(82, 52).addBox(0.0F, -4.5F, -4.5F, 1.0F, 5.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -21.7951F, -2.7712F, -1.8226F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bb_main.addOrReplaceChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(58, 91).addBox(-0.55F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.4F, -28.6327F, 9.4429F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bb_main.addOrReplaceChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 47).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, -28.6327F, 9.4429F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bb_main.addOrReplaceChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 96).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -25.2605F, 7.162F, -1.85F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bb_main.addOrReplaceChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 29).addBox(0.01F, -0.5F, -4.5F, 1.0F, 2.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -24.2742F, 2.9921F, -2.9496F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bb_main.addOrReplaceChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(84, 91).addBox(-0.001F, -3.5F, -1.5F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -20.1283F, -2.4369F, -1.0385F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bb_main.addOrReplaceChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(74, 73).addBox(-0.002F, -4.5F, -8.5F, 1.0F, 5.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -14.5373F, 1.914F, -0.9512F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDc15aLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 63)
            .addBox(-2.21F, -27.554F, -44.12F, 4.0F, 5.0F, 28.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(64, 63)
            .addBox(-1.21F, -23.69F, -7.16F, 2.0F, 3.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(64, 93)
            .addBox(-2.21F, -29.85F, -1.79F, 4.0F, 3.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 96)
            .addBox(-2.21F, -28.85F, 20.48F, 4.0F, 2.0F, 21.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(88, 119)
            .addBox(-2.21F, -29.64F, 34.01F, 4.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(52, 167)
            .addBox(0.327F, -34.63F, 1.253F, 2.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(60, 167)
            .addBox(-2.537F, -34.63F, 1.253F, 2.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(124, 173)
            .addBox(-1.0F, -26.0F, 41.4F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(52, 174)
            .addBox(1.0F, -30.8F, 33.8F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 154)
            .addBox(1.0F, -30.5F, 35.0F, 1.0F, 1.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(22, 154)
            .addBox(-2.4F, -30.5F, 35.0F, 1.0F, 1.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(58, 174)
            .addBox(-2.4F, -30.8F, 33.8F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 172)
            .addBox(1.0F, -29.0F, 32.8F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 172)
            .addBox(-2.4F, -29.0F, 32.8F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(142, 150)
            .addBox(0.6F, -27.0F, 4.3F, 2.0F, 5.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(158, 32)
            .addBox(2.1F, -26.0F, 5.0F, 2.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 141)
            .addBox(0.0F, -21.7F, -7.2F, 1.0F, 1.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(96, 155)
            .addBox(0.0F, -21.7F, 6.8F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(132, 173)
            .addBox(0.0F, -21.7F, 16.9F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(162, 173)
            .addBox(-1.4F, -21.7F, 16.9F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(158, 0)
            .addBox(-1.4F, -21.7F, 6.8F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(26, 141)
            .addBox(-1.4F, -21.7F, -7.2F, 1.0F, 1.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(52, 153)
            .addBox(-3.2F, -27.0F, 4.3F, 2.0F, 5.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(158, 42)
            .addBox(-4.7F, -26.0F, 5.0F, 2.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 174)
            .addBox(-1.6F, -23.0F, 4.8F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(22, 174)
            .addBox(0.2F, -23.0F, 4.8F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 174)
            .addBox(-0.6F, -23.0F, 4.8F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(162, 100)
            .addBox(-1.2F, -18.0F, 2.0F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(88, 169)
            .addBox(-1.2F, -19.0F, 4.8F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(174, 149)
            .addBox(0.2F, -22.0F, 14.9F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(174, 153)
            .addBox(-1.6F, -22.0F, 14.9F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(174, 66)
            .addBox(-0.6F, -23.0F, 14.9F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(30, 169)
            .addBox(-0.6F, -21.0F, 14.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(68, 169)
            .addBox(-1.2F, -23.1F, -34.0F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(120, 137)
            .addBox(-2.2F, -29.0F, -27.0F, 5.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(114, 173)
            .addBox(-2.2F, -28.2F, -43.1F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(158, 10).addBox(-0.5F, -2.5F, -5.0F, 2.0F, 5.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.7258F, -25.8343F, -56.6171F, 1.5775F, -0.001F, -0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(164, 73)
            .addBox(-1.5F, -2.5F, -1.0F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(120, 150)
            .addBox(-0.5F, -2.5F, -5.0F, 1.0F, 5.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2258F, -24.7343F, -56.6171F, 1.5775F, -0.001F, -0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(164, 161).addBox(-0.5F, -5.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.147F, -21.952F, -53.4F, -0.8619F, -0.001F, 0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bb_main.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(162, 119).addBox(-1.5F, -4.5F, -2.5F, 2.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.353F, -23.752F, -48.6F, -1.56F, -0.001F, 0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bb_main.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(162, 108).addBox(-1.5F, -2.5F, -2.5F, 2.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.353F, -26.248F, -48.6F, 1.56F, -0.001F, -0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bb_main.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(152, 164).addBox(-0.5F, -2.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.147F, -28.048F, -53.4F, 0.8619F, -0.001F, -0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bb_main.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(164, 149).addBox(-0.5F, -5.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.253F, -20.552F, -55.1F, -0.8727F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bb_main.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(142, 164).addBox(-0.5F, -5.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.653F, -20.552F, -55.1F, -0.8727F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bb_main.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(164, 61).addBox(-0.5F, -2.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.653F, -29.448F, -55.1F, 0.8727F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bb_main.addOrReplaceChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 141).addBox(-0.5F, -2.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.253F, -29.448F, -55.1F, 0.8727F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bb_main.addOrReplaceChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(134, 165).addBox(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.253F, -20.352F, -57.6F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bb_main.addOrReplaceChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(126, 165).addBox(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.653F, -20.352F, -57.6F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bb_main.addOrReplaceChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(118, 165).addBox(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.653F, -29.648F, -57.6F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bb_main.addOrReplaceChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(110, 165).addBox(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.253F, -29.648F, -57.6F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bb_main.addOrReplaceChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(88, 137).addBox(-0.5F, -1.5F, -10.0F, 1.0F, 3.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.3F, -23.9F, -49.1F, 0.0F, 0.0F, 0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bb_main.addOrReplaceChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(126, 36).addBox(-0.5F, -1.5F, -10.0F, 1.0F, 3.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.7F, -23.9F, -49.1F, 0.0F, 0.0F, -0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bb_main.addOrReplaceChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(126, 18).addBox(-0.5F, -1.5F, -10.0F, 1.0F, 3.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.7F, -26.1F, -49.1F, 0.0F, 0.0F, 0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bb_main.addOrReplaceChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(126, 0).addBox(-0.5F, -1.5F, -10.0F, 1.0F, 3.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.3F, -26.1F, -49.1F, 0.0F, 0.0F, -0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bb_main.addOrReplaceChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(104, 131).addBox(-3.0F, -0.5F, -2.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.8F, -28.0F, -27.5F, 0.6807F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bb_main.addOrReplaceChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(174, 71)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(68, 167)
            .addBox(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.4F, -23.9F, -30.8F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bb_main.addOrReplaceChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(88, 131).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.2F, -30.0F, -12.5F, 0.0F, 0.0F, -1.5272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bb_main.addOrReplaceChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(122, 81).addBox(-1.0F, 0.0F, -5.5F, 3.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.5F, -28.0F, -21.5F, 0.0F, 0.0F, -1.5272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bb_main.addOrReplaceChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(150, 81)
            .addBox(-2.0F, 0.0F, -3.5F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(122, 63)
            .addBox(-2.0F, 0.0F, -20.5F, 4.0F, 1.0F, 17.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.2F, -28.0F, -12.5F, 0.0F, 0.0F, -1.5272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bb_main.addOrReplaceChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(156, 91).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -19.0231F, -24.4525F, 0.0175F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bb_main.addOrReplaceChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(80, 153).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -20.133F, -23.45F, 1.6319F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bb_main.addOrReplaceChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(74, 153).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -19.233F, -23.55F, 1.309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bb_main.addOrReplaceChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(150, 91).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -19.0231F, -23.8525F, 0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bb_main.addOrReplaceChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(174, 157).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -22.2F, -34.3F, 0.6981F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bb_main.addOrReplaceChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(174, 162)
            .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(106, 169)
            .addBox(0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -20.4518F, -27.6154F, -0.9948F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bb_main.addOrReplaceChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(174, 160)
            .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(40, 171)
            .addBox(0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -21.8518F, -30.7154F, -1.0996F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bb_main.addOrReplaceChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 172)
            .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(40, 169)
            .addBox(0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -14.1518F, -32.7154F, -1.0908F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bb_main.addOrReplaceChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(106, 171)
            .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(116, 163)
            .addBox(0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -13.4518F, -29.4154F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bb_main.addOrReplaceChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(10, 165)
            .addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 165)
            .addBox(0.7F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -22.5146F, -28.7028F, -0.5323F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bb_main.addOrReplaceChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(50, 113)
            .addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(162, 130)
            .addBox(0.7F, 0.0F, -1.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.8F, -14.3F, -32.6F, -0.2705F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = bb_main.addOrReplaceChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(52, 141)
            .addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(152, 137)
            .addBox(0.2F, -0.5F, -2.5F, 1.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -14.8173F, -28.7882F, 1.3003F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = bb_main.addOrReplaceChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(74, 155)
            .addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(158, 22)
            .addBox(0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -14.8173F, -32.9882F, 1.3177F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = bb_main.addOrReplaceChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(64, 174).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -23.5F, -26.0F, 0.6981F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = bb_main.addOrReplaceChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(174, 61).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.3F, -20.5F, -26.3F, 0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = bb_main.addOrReplaceChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(174, 132).addBox(-0.5F, 0.5F, -0.5F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.7F, -19.0F, -24.4F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = bb_main.addOrReplaceChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(174, 128).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -21.5F, -23.6F, 0.0785F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = bb_main.addOrReplaceChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(174, 124)
            .addBox(-0.5F, -1.0F, -1.4F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(174, 120)
            .addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -19.5F, 15.65F, 1.5708F, -1.1956F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = bb_main.addOrReplaceChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(174, 116)
            .addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(174, 112)
            .addBox(-0.5F, -1.0F, -1.4F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -19.6044F, 16.1848F, -1.5708F, -1.213F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = bb_main.addOrReplaceChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(104, 173).addBox(-2.5F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.9F, -17.3F, 9.0F, 0.0F, 0.0F, -0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = bb_main.addOrReplaceChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(98, 165).addBox(-0.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.4F, -17.3F, 9.0F, 0.0F, 0.0F, 0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = bb_main.addOrReplaceChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(86, 165).addBox(-2.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, -17.4F, 9.0F, 0.0F, 0.0F, -0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = bb_main.addOrReplaceChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(74, 165).addBox(-2.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.9F, -17.5F, 9.0F, 0.0F, 0.0F, -0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = bb_main.addOrReplaceChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 173).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.2F, -18.2F, 9.0F, 0.0F, 0.0F, -0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = bb_main.addOrReplaceChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 165).addBox(-0.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5F, -17.4F, 9.0F, 0.0F, 0.0F, 0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = bb_main.addOrReplaceChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 165).addBox(-0.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.4F, -17.5F, 9.0F, 0.0F, 0.0F, 0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = bb_main.addOrReplaceChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 173).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.7F, -18.2F, 9.0F, 0.0F, 0.0F, 0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = bb_main.addOrReplaceChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(144, 54).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -17.1F, 3.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = bb_main.addOrReplaceChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 169).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.25F, -17.05F, 9.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = bb_main.addOrReplaceChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(126, 54).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -17.0F, 1.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = bb_main.addOrReplaceChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(116, 161)
            .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(158, 52)
            .addBox(-1.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -21.6F, -6.3F, 0.7418F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = bb_main.addOrReplaceChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(116, 159)
            .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(116, 157)
            .addBox(-1.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -21.6F, 19.0F, 0.7418F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = bb_main.addOrReplaceChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 169).addBox(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -22.2F, 19.4F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = bb_main.addOrReplaceChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(96, 169).addBox(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -22.2F, -6.7F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = bb_main.addOrReplaceChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(34, 174).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.9F, -22.3F, -6.7F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = bb_main.addOrReplaceChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(170, 173).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.9F, -22.3F, 19.4F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = bb_main.addOrReplaceChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 154).addBox(-0.5F, -21.0721F, -0.4504F, 1.0F, 21.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.0F, -27.6F, -1.7F, -1.5184F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = bb_main.addOrReplaceChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(174, 164)
            .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(116, 155)
            .addBox(3.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.25F, -27.55F, -1.55F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = bb_main.addOrReplaceChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(174, 108)
            .addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(70, 174)
            .addBox(2.9F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.9F, -29.487F, 34.2617F, -0.3752F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = bb_main.addOrReplaceChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(48, 154).addBox(-0.5F, -21.0982F, -0.7493F, 1.0F, 21.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.7F, -27.3F, -1.7F, -1.5184F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = bb_main.addOrReplaceChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 119).addBox(-2.21F, -2.21F, -5.37F, 4.0F, 4.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.06F, 28.64F, 0.0F, 0.0F, -0.1309F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r65 = bb_main.addOrReplaceChild(
         "cube_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 119).addBox(-2.21F, -2.21F, -5.37F, 4.0F, 4.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.06F, 28.64F, 0.0F, 0.0F, -0.4363F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r66 = bb_main.addOrReplaceChild(
         "cube_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(118, 115).addBox(-2.21F, -2.21F, -5.37F, 4.0F, 4.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.06F, 28.64F, 0.0F, 0.0F, 0.4363F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r67 = bb_main.addOrReplaceChild(
         "cube_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(118, 93).addBox(-2.21F, -2.21F, -5.37F, 4.0F, 4.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.06F, 28.64F, 0.0F, 0.0F, 0.1309F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r68 = bb_main.addOrReplaceChild(
         "cube_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(162, 52).addBox(-2.21F, -1.42F, -2.685F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -31.957F, 3.222F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r69 = bb_main.addOrReplaceChild(
         "cube_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(162, 91).addBox(-2.21F, -3.21F, -0.895F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -30.525F, 0.0F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r70 = bb_main.addOrReplaceChild(
         "cube_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 96).addBox(-1.21F, -6.84F, -2.685F, 2.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -17.9F, -29.885F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r71 = bb_main.addOrReplaceChild(
         "cube_r71",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 0).addBox(-2.21F, -2.21F, -16.11F, 4.0F, 4.0F, 59.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -25.06F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 256, 256);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createJawaLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone = partdefinition.addOrReplaceChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(64, 14)
            .addBox(-4.0F, -19.3F, 6.9F, 8.0F, 2.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(60, 54)
            .addBox(-4.0F, -18.8F, 6.0F, 8.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(106, 59)
            .addBox(-2.5F, -19.3F, 13.9F, 5.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(86, 49)
            .addBox(-2.0F, -18.3F, 9.3F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(124, 111)
            .addBox(-1.0F, -18.8F, -4.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 45)
            .addBox(1.0F, -23.0F, 13.0F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 50)
            .addBox(-2.0F, -23.0F, 13.0F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(44, 116)
            .addBox(-1.5F, -24.5F, 6.0F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(122, 89).addBox(-1.5F, -1.1018F, -0.3077F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.0F, 5.7213F, 0.8552F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bone.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(120, 98).addBox(-1.5F, -0.8982F, -1.6923F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.0F, -4.7213F, 0.8552F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bone.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(14, 124).addBox(-1.5F, -1.1018F, -1.6923F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.0F, -4.7213F, -0.8552F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bone.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(82, 121).addBox(-1.5F, -1.1018F, -1.6923F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.0F, -4.7213F, -0.8552F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bone.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 124).addBox(-1.5F, 0.1018F, -1.6923F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.0F, -4.7213F, 0.8552F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bone.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(92, 121).addBox(-1.5F, -1.1018F, -0.3077F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -22.5392F, -7.3884F, 0.8552F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bone.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(124, 76).addBox(-0.5F, -0.3439F, -0.2452F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0892F, -22.5F, -6.3014F, -0.8552F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bone.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(124, 80).addBox(-0.5F, -1.6561F, -0.2452F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0892F, -22.5F, -6.3014F, 0.8552F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bone.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(122, 85).addBox(-1.5F, -0.8982F, -0.3077F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.3608F, -7.3884F, -0.8552F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bone.addOrReplaceChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 123).addBox(-1.5F, 0.1018F, -0.3077F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.0F, 5.7213F, -0.8552F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bone.addOrReplaceChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(74, 23).addBox(-1.0F, -1.1018F, -0.3077F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.5F, 5.7213F, 0.8552F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone.addOrReplaceChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(64, 23).addBox(-1.0F, 0.1018F, -0.3077F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.5F, 5.7213F, -0.8552F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone.addOrReplaceChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 112).addBox(-1.5F, -1.2356F, -1.6453F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.0F, 8.5509F, 1.3439F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone.addOrReplaceChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(34, 124).addBox(-1.5F, -1.7644F, -1.6453F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.0F, 8.5509F, -1.3439F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone.addOrReplaceChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(36, 108).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -21.8246F, 8.6509F, 1.3439F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone.addOrReplaceChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(62, 107).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.9132F, 9.7378F, -1.3439F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone.addOrReplaceChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(70, 97)
            .addBox(-2.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(44, 98)
            .addBox(1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -19.7601F, 17.478F, -1.9548F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone.addOrReplaceChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(76, 87)
            .addBox(-2.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(76, 90)
            .addBox(1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -19.8421F, 17.0094F, -0.8203F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bone.addOrReplaceChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(78, 54).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -18.2539F, -2.6831F, 0.0F, -1.0123F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bone.addOrReplaceChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(70, 120).addBox(-2.5F, -2.0F, -1.0F, 4.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -16.7604F, 11.4372F, -0.4538F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bone.addOrReplaceChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(76, 93).addBox(-5.0F, -1.0F, -6.0F, 5.0F, 2.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.5F, -15.6F, 19.8F, -0.4538F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bone.addOrReplaceChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 0).addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -18.8F, 19.5F, -0.1396F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone.addOrReplaceChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(114, 16).addBox(-2.5F, -3.0F, 1.5F, 5.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -18.3424F, 20.7899F, -1.0996F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bone.addOrReplaceChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 67).addBox(-2.5F, -3.0F, 0.5F, 5.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -18.3424F, 18.6898F, -1.0996F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bone.addOrReplaceChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 30).addBox(-2.5F, -3.0F, -5.5F, 5.0F, 4.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -11.3819F, 25.6503F, -0.4712F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bone.addOrReplaceChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 13).addBox(-2.5F, -1.0F, 5.0F, 5.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -24.0565F, 30.8533F, -1.5533F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bone.addOrReplaceChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(90, 0).addBox(-2.5F, -1.0F, 4.0F, 5.0F, 7.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -17.0F, 20.1F, 0.1047F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bone.addOrReplaceChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(52, 80).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -12.5415F, 13.8595F, 0.576F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bone.addOrReplaceChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(52, 71).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -15.7F, 11.5F, 0.6807F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bone.addOrReplaceChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(76, 84).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -17.8F, -2.2F, 1.4312F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bone.addOrReplaceChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(52, 76).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -19.7F, -3.3F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bone.addOrReplaceChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(82, 80)
            .addBox(1.0F, -1.0F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(62, 112)
            .addBox(1.0F, -1.0F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.31F, -22.8517F, 0.5F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bone.addOrReplaceChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(52, 84)
            .addBox(-2.0F, -1.0F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(76, 112)
            .addBox(-2.0F, -1.0F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.4554F, -23.1687F, 0.5F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bone.addOrReplaceChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(86, 36)
            .addBox(1.1121F, -0.9536F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 116)
            .addBox(1.1121F, -0.9536F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2312F, -23.2716F, 0.5F, 0.0F, 0.0F, -1.9635F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = bone.addOrReplaceChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 88)
            .addBox(-2.1121F, -1.0464F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(30, 116)
            .addBox(-2.1121F, -1.0464F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0858F, -22.7489F, 0.5F, 0.0F, 0.0F, -1.9635F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = bone.addOrReplaceChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(44, 107).addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, -17.9814F, 6.711F, 1.5708F, 0.5149F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = bone.addOrReplaceChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 76).addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, -18.6186F, 6.711F, -1.5708F, 0.5149F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = bone.addOrReplaceChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(94, 13).addBox(1.12F, -0.9429F, -5.49F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.036F, -17.2632F, 3.39F, 0.0F, 0.0F, -1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = bone.addOrReplaceChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(50, 97).addBox(-2.12F, -0.9019F, -5.49F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.0458F, -17.2789F, 3.39F, 0.0F, 0.0F, 1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = bone.addOrReplaceChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 98).addBox(0.0F, -0.9355F, -8.5F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.3057F, -18.3357F, 6.4F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = bone.addOrReplaceChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(100, 93).addBox(0.0F, -1.0785F, -8.5F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.9177F, -17.2797F, 6.4F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = bone.addOrReplaceChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 101).addBox(-2.12F, -1.1071F, -5.49F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.8864F, -18.8872F, 3.39F, 0.0F, 0.0F, -1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = bone.addOrReplaceChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(70, 102).addBox(1.12F, -0.0621F, -5.49F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0313F, -19.2871F, 3.39F, 0.0F, 0.0F, 1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = bone.addOrReplaceChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(90, 103).addBox(-1.0F, -1.0605F, -8.5F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.8768F, -17.2963F, 6.4F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = bone.addOrReplaceChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(106, 49).addBox(-1.0F, -0.9565F, -8.5F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.266F, -18.3163F, 6.4F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = bone.addOrReplaceChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(26, 85)
            .addBox(1.1121F, -0.9536F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(90, 113)
            .addBox(1.1121F, -0.9536F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -23.3071F, 0.5F, 0.0F, 0.0F, -1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = bone.addOrReplaceChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(86, 23)
            .addBox(-2.1121F, -1.0464F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(114, 8)
            .addBox(-2.1121F, -1.0464F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1454F, -22.7133F, 0.5F, 0.0F, 0.0F, -1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = bone.addOrReplaceChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(110, 111)
            .addBox(1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(82, 54)
            .addBox(1.0F, -1.0F, -15.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.31F, -23.1687F, 10.5F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = bone.addOrReplaceChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(112, 0)
            .addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(82, 67)
            .addBox(-2.0F, -1.0F, -15.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.4554F, -22.8517F, 10.5F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = bone.addOrReplaceChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(104, 119)
            .addBox(-4.0F, -2.5F, 0.0F, 5.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(58, 120)
            .addBox(-4.0F, -2.5F, 8.6F, 5.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(118, 119)
            .addBox(-4.0F, -2.5F, 6.7F, 5.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 119)
            .addBox(-4.0F, -2.5F, 16.0F, 5.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.6F, -23.0F, -4.0F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = bone.addOrReplaceChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.8171F, -6.3256F, 2.0F, 1.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.551F, -21.9394F, -14.1544F, -0.1396F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = bone.addOrReplaceChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, 1.8171F, -6.3256F, 2.0F, 1.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.551F, -21.9394F, -14.1544F, 0.1396F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = bone.addOrReplaceChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(26, 71).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.7705F, -21.163F, -17.061F, 0.0735F, 0.1772F, -0.3959F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = bone.addOrReplaceChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 56).addBox(-2.0F, 0.0F, -2.5F, 1.0F, 2.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.7187F, -21.8498F, -17.8086F, -7.0E-4F, 0.1916F, -0.7952F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = bone.addOrReplaceChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 40).addBox(1.0F, 0.0F, -2.5F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.7187F, -21.8498F, -17.8086F, -7.0E-4F, -0.1916F, 0.7952F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = bone.addOrReplaceChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.7705F, -21.163F, -17.061F, 0.0735F, -0.1772F, 0.3959F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = bone.addOrReplaceChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(56, 70).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.7705F, -24.7157F, -17.061F, -0.0735F, 0.1772F, 0.3959F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = bone.addOrReplaceChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 26).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.7323F, -20.1308F, -14.0849F, -0.0173F, -0.1783F, 1.4605F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = bone.addOrReplaceChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(60, 26).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.7323F, -20.1308F, -14.0849F, -0.0173F, 0.1783F, -1.4605F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = bone.addOrReplaceChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 60).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.7323F, -25.7479F, -14.0849F, 0.0173F, -0.1783F, -1.4605F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = bone.addOrReplaceChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(56, 56).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.7323F, -25.7479F, -14.0849F, 0.0173F, 0.1783F, 1.4605F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = bone.addOrReplaceChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 45).addBox(-2.0F, -2.0F, -2.5F, 1.0F, 2.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.7187F, -24.0289F, -17.8086F, 7.0E-4F, 0.1916F, 0.7952F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = bone.addOrReplaceChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(2.7705F, -24.7157F, -17.061F, -0.0735F, -0.1772F, -0.3959F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = bone.addOrReplaceChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 41).addBox(1.0F, -2.0F, -2.5F, 1.0F, 2.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.7187F, -24.0289F, -17.8086F, 7.0E-4F, -0.1916F, -0.7952F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 256, 256);
   }

   public void render(com.mojang.blaze3d.vertex.PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, ((int)(alpha * 255.0F) << 24) | ((int)(red * 255.0F) << 16) | ((int)(green * 255.0F) << 8) | (int)(blue * 255.0F));
   }
}
