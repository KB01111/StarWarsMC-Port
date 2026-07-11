package che.swgc.client.model.item;

import java.util.function.Function;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.client.model.Model;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;

public class BlasterModel extends net.minecraft.client.model.Model {
   public static net.minecraft.client.model.geom.ModelLayerLocation DC15S_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "dc15s"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation DC17_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "dc17"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation TL50_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "tl50"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation DH17_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "dh17"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation E5_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "e5"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation DC15A_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "dc15a"), "blaster");
   public static net.minecraft.client.model.geom.ModelLayerLocation JAWA_LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "jawa"), "blaster");
   private final net.minecraft.client.model.geom.ModelPart root;

   public BlasterModel(net.minecraft.client.model.geom.ModelPart root, Function<net.minecraft.resources.Identifier, net.minecraft.client.renderer.rendertype.RenderType> renderType) {
      super(renderType);
      this.root = root;
   }

   public BlasterModel(net.minecraft.client.model.geom.ModelPart root) {
      this(root, net.minecraft.client.renderer.rendertype.RenderType::getEntitySolid);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDc15sLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition DC_15S = partdefinition.addChild(
         "DC_15S",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 85)
            .cuboid(-2.4412F, -14.9576F, 2.4968F, 6.0F, 11.0F, 35.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(162, 70)
            .cuboid(-3.9412F, -15.3576F, -12.4032F, 9.0F, 11.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(82, 85)
            .cuboid(-2.4412F, -5.9576F, 4.4968F, 6.0F, 3.0F, 34.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(176, 26)
            .cuboid(-4.4412F, -12.9576F, 34.4968F, 10.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 43)
            .cuboid(-4.4412F, -8.9576F, 3.4968F, 10.0F, 5.0F, 37.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(132, 154)
            .cuboid(-5.4412F, -12.9576F, -12.5032F, 12.0F, 7.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(94, 70)
            .cuboid(-5.4412F, -13.9576F, -11.5032F, 12.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(94, 0)
            .cuboid(-4.4412F, -10.9576F, 3.4968F, 10.0F, 4.0F, 31.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(168, 197)
            .cuboid(-5.7412F, -14.0576F, -12.4032F, 2.0F, 6.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(98, 207)
            .cuboid(-10.7412F, -13.5576F, -11.9032F, 5.0F, 5.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(196, 197)
            .cuboid(3.1588F, -12.9576F, -11.0032F, 4.0F, 5.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(94, 35)
            .cuboid(-3.4412F, -12.3576F, 3.4968F, 8.0F, 4.0F, 31.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(172, 62)
            .cuboid(-4.4412F, -11.9576F, 3.4968F, 10.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-6.0588F, 9.9576F, 0.0032F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = DC_15S.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(202, 26).cuboid(-5.0F, -2.0F, 0.5F, 10.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5588F, -10.6576F, 36.4968F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = DC_15S.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 173).cuboid(-3.0F, 0.0F, 3.0F, 6.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5588F, -4.3576F, 34.3968F, 0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = DC_15S.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(162, 97).cuboid(-4.5F, -2.5F, -10.5F, 9.0F, 7.0F, 17.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5588F, -10.0656F, 12.9387F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = DC_15S.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(34, 207).cuboid(-4.0F, -3.0F, -4.0F, 8.0F, 6.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5588F, -4.3576F, -8.4032F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone6 = DC_15S.addChild(
         "bone6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(68, 138)
            .cuboid(-2.0F, -0.3773F, -0.5059F, 4.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(68, 147)
            .cuboid(-2.0F, 3.2227F, -1.0059F, 4.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.5588F, -4.5803F, 4.0027F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bone6.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 178).cuboid(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -0.7773F, -1.0059F, 0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone5 = DC_15S.addChild(
         "bone5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(132, 177).cuboid(-4.5F, 5.0F, -7.0F, 8.0F, 24.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.0588F, -10.9576F, 10.4968F, 0.3054F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bone5.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(168, 177).cuboid(-5.0F, -4.0F, -10.0F, 9.0F, 6.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 29.0F, 0.0F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bone5.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(214, 101).cuboid(-6.0F, 3.0F, 10.0F, 9.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.0F, 8.0F, 0.0F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bone5.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(208, 121)
            .cuboid(-5.0F, 1.0F, 8.0F, 8.0F, 7.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(154, 122)
            .cuboid(-4.5F, -4.0F, -9.0F, 7.0F, 10.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 7.0F, 0.0F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bone5.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(214, 92).cuboid(-2.5F, -1.0F, -0.5F, 5.0F, 3.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 2.7627F, -19.7258F, -1.6581F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bone5.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(214, 169).cuboid(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 7.7627F, -20.1258F, -1.1781F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bone5.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(214, 107).cuboid(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 12.5627F, -18.3258F, -0.3054F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone5.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(66, 207).cuboid(-3.0F, 3.0F, -16.0F, 5.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 6.1F, 0.7F, 0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone3 = DC_15S.addChild(
         "bone3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(212, 72)
            .cuboid(-4.5F, -2.5F, -2.5F, 9.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-4.0F, -2.1F, -41.5F, 8.0F, 4.0F, 39.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(188, 169)
            .cuboid(-5.0F, -1.5F, -1.5F, 10.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(208, 135)
            .cuboid(-4.0F, -1.5F, -48.5F, 8.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5588F, -1.9576F, -10.2032F, -0.0262F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone4 = bone3.addChild(
         "bone4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(208, 145)
            .cuboid(-5.04F, -1.4F, -1.4F, 10.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(212, 82)
            .cuboid(-4.54F, -2.4F, -2.4F, 9.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 165)
            .cuboid(1.26F, -2.4F, -24.4F, 3.0F, 5.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(176, 0)
            .cuboid(-1.34F, -2.4F, -24.4F, 3.0F, 4.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(172, 35)
            .cuboid(-4.34F, -2.4F, -24.4F, 3.0F, 5.0F, 22.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.04F, -0.1F, -47.1F, 2.9671F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone2 = DC_15S.addChild(
         "bone2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(136, 70)
            .cuboid(-4.0001F, -2.9455F, -3.649F, 8.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(50, 165)
            .cuboid(-3.0001F, -1.9455F, -5.649F, 6.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(68, 131)
            .cuboid(-2.5001F, -1.4455F, -44.149F, 5.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 131)
            .cuboid(-3.5001F, -2.4455F, -31.849F, 7.0F, 7.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(212, 62)
            .cuboid(-5.0001F, -1.9455F, -3.449F, 10.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(82, 122)
            .cuboid(-4.5001F, -1.4455F, -31.849F, 9.0F, 5.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(196, 213)
            .cuboid(-3.0001F, -3.9455F, -3.449F, 6.0F, 10.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(68, 154)
            .cuboid(-2.5001F, -3.4455F, -31.849F, 5.0F, 9.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.5589F, -11.0121F, -12.8542F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone2.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 190).cuboid(-3.0F, -2.0F, 43.0F, 5.0F, 5.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.4999F, 0.5545F, -86.649F, 0.0F, 0.0436F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone2.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 211).cuboid(-1.0F, -3.5F, -6.5F, 2.0F, 6.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.7999F, -5.9003F, -37.3924F, 0.043F, -0.0076F, 0.1744F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone2.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 209).cuboid(-1.0F, -3.5F, -6.5F, 2.0F, 6.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.8001F, -5.9003F, -37.3924F, 0.043F, 0.0076F, -0.1744F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone2.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(188, 152).cuboid(-3.0F, -2.0F, 43.0F, 5.0F, 5.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.4999F, 0.5545F, -86.649F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone2.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(84, 190).cuboid(-3.0F, -2.0F, 43.0F, 5.0F, 5.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.4999F, 0.5545F, -86.649F, -0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone2.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 192).cuboid(-3.0F, -2.0F, 43.0F, 5.0F, 5.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.4999F, 0.5545F, -86.649F, 0.0F, -0.0436F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 256, 256);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDc17Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition DC17 = partdefinition.addChild(
         "DC17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 48)
            .cuboid(-6.0F, -16.0F, -25.0F, 12.0F, 7.0F, 41.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(23, 172)
            .cuboid(-3.5F, -14.5F, -29.0F, 7.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(124, 41)
            .cuboid(-6.0F, -18.0F, 12.0F, 12.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(106, 48)
            .cuboid(-4.0F, -20.0F, -18.0F, 8.0F, 4.0F, 34.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(124, 0)
            .cuboid(-6.0F, -22.0F, -7.0F, 12.0F, 4.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(124, 27)
            .cuboid(-5.0F, -21.0F, -18.0F, 10.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(152, 175)
            .cuboid(-5.0F, -18.5F, -18.0F, 10.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 140)
            .cuboid(-5.0F, -21.5F, -18.0F, 10.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(42, 140)
            .cuboid(-6.0F, -20.0F, 16.0F, 12.0F, 16.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(166, 37)
            .cuboid(-7.0F, -18.3F, 15.3F, 14.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 170)
            .cuboid(-7.0F, -18.3F, 18.3F, 14.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(56, 170)
            .cuboid(-7.0F, -18.3F, 12.3F, 14.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(140, 142)
            .cuboid(-6.0F, -16.1F, 18.3F, 12.0F, 12.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-8.0F, -11.0F, -24.0F, 16.0F, 2.0F, 46.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(100, 96)
            .cuboid(-7.0F, -9.0F, -10.0F, 14.0F, 2.0F, 31.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 96)
            .cuboid(-5.5F, -9.0F, -23.0F, 11.0F, 5.0F, 39.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(140, 129)
            .cuboid(-3.5F, -4.0F, -21.0F, 7.0F, 1.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(176, 175)
            .cuboid(-3.5F, -3.0F, -19.0F, 1.0F, 1.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(110, 177)
            .cuboid(2.5F, -3.0F, -19.0F, 1.0F, 1.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(76, 178)
            .cuboid(2.5F, -2.0F, -17.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(144, 94)
            .cuboid(2.5F, -1.0F, -16.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(152, 94)
            .cuboid(-3.5F, -1.0F, -16.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 180)
            .cuboid(-3.5F, -2.0F, -17.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(140, 86)
            .cuboid(-5.5F, -4.0F, -9.0F, 11.0F, 1.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(140, 158)
            .cuboid(-5.5F, -9.0F, -25.0F, 11.0F, 3.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-6.0F, 10.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = DC17.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(152, 167).cuboid(-5.5F, -2.5F, -2.0F, 11.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -6.5F, -21.8F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = DC17.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(152, 178)
            .cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(178, 134)
            .cuboid(-6.5F, -0.5F, -2.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.0F, -1.5F, -13.5F, 0.6545F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = DC17.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(178, 129)
            .cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(162, 178)
            .cuboid(-6.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.0F, -1.5F, -17.5F, -0.6545F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = DC17.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(148, 94)
            .cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(140, 94)
            .cuboid(-6.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.0F, 0.0F, -15.5F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = DC17.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(92, 166).cuboid(-6.0F, -3.5F, -5.0F, 12.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -16.3F, 18.3F, -0.5672F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = DC17.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(158, 41).cuboid(-6.0F, -3.5F, -5.0F, 12.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -13.3F, 20.0F, -0.9599F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = DC17.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 160).cuboid(-7.0F, -3.5F, -1.0F, 14.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -14.5F, 14.0F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = DC17.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(166, 27).cuboid(-7.0F, -3.5F, -1.0F, 14.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -14.5F, 20.0F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = DC17.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 160).cuboid(-7.0F, -3.5F, -1.0F, 14.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -14.5F, 17.0F, 0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = DC17.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(74, 140).cuboid(-4.0F, -2.0F, -2.0F, 8.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -18.4F, -17.5F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = DC17.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(172, 151).cuboid(-6.0F, -1.0F, -2.5F, 12.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -18.4F, 13.6F, 0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone5 = DC17.addChild(
         "bone5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(144, 177)
            .cuboid(-1.0F, -1.6868F, 0.386F, 2.0F, 7.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 152)
            .cuboid(-1.0F, -1.6868F, 2.386F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.5F, -4.3132F, 0.614F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone5.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 152).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 5.3132F, 1.386F, -0.3491F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone4 = DC17.addChild(
         "bone4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(174, 154).cuboid(-3.0F, -3.0F, 8.0F, 5.0F, 10.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.5F, -2.0F, -15.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone4.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 177).cuboid(-3.0F, 4.0F, -1.0F, 5.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 5.6F, 11.4F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone4.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(88, 172).cuboid(-3.0F, -1.0F, -2.0F, 5.0F, 5.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 6.0F, 11.0F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone4.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(172, 142).cuboid(-4.0F, 1.0F, -1.0F, 7.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 3.5F, 23.7F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone4.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(176, 86).cuboid(-3.0F, 1.0F, -1.0F, 5.0F, 7.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 3.8F, 23.7F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone4.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 173).cuboid(-3.0F, -2.0F, -1.0F, 5.0F, 11.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 6.3F, 21.0F, -1.3963F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone4.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 178).cuboid(-3.0F, 4.0F, -1.0F, 5.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -6.5F, 12.1F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone3 = DC17.addChild("bone3", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.5F, -2.0F, -15.0F));
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bone3.addChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 173).cuboid(-5.0F, 0.0F, 0.0F, 9.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 2.6F, 30.9F, 1.309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bone3.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(124, 167).cuboid(-5.0F, -3.0F, -2.0F, 9.0F, 5.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -1.8F, 33.4F, 0.6545F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bone3.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(106, 86).cuboid(-5.0F, 21.0F, -4.0F, 9.0F, 2.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.3F, 31.0F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bone3.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 152).cuboid(-5.0F, 12.0F, -8.0F, 9.0F, 11.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.3F, 30.7F, 0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone3.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(74, 152).cuboid(-5.0F, 1.0F, -6.0F, 9.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -6.7F, 22.4F, 0.7418F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bone3.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(100, 129).cuboid(-5.0F, -3.0F, -8.0F, 9.0F, 26.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -1.0F, 29.0F, 0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bone2 = DC17.addChild(
         "bone2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(110, 172)
            .cuboid(-2.0F, -9.0F, 37.0F, 3.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 168)
            .cuboid(-5.0F, -12.0F, 39.0F, 9.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.5F, -2.0F, -15.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 256, 256);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createTl50Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone = partdefinition.addChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-2.01F, -4.02F, -15.92F, 4.0F, 8.0F, 26.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(158, 84)
            .cuboid(-3.015F, -5.383F, -17.91F, 6.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(142, 38)
            .cuboid(-5.025F, 2.577F, -17.91F, 10.0F, 2.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(150, 154)
            .cuboid(-3.015F, -5.413F, -17.91F, 6.0F, 8.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 34)
            .cuboid(-0.219F, -0.438F, 4.97F, 4.0F, 8.0F, 21.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(50, 34)
            .cuboid(-3.801F, -0.438F, 4.97F, 4.0F, 8.0F, 21.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(60, 0)
            .cuboid(-2.01F, -1.05F, 25.87F, 4.0F, 10.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 63)
            .cuboid(-1.01F, -2.05F, 43.77F, 2.0F, 12.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(106, 21)
            .cuboid(-2.01F, 6.348F, 23.88F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(120, 111)
            .cuboid(-2.01F, 6.358F, 19.9F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(122, 21)
            .cuboid(-2.01F, 6.358F, 17.91F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 4.1F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(178, 21).cuboid(-0.5F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -5.1F, 22.8F, 0.0F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bone.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(72, 142).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, -5.4F, 22.8F, 0.0F, 0.0F, -0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bone.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(72, 138).cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -5.4F, 22.8F, 0.0F, 0.0F, 0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bone.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(72, 175).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 8.5F, 43.6F, -0.6545F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bone.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(172, 17).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -0.7F, 43.4F, 0.48F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bone.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(170, 108).cuboid(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 10.6935F, 23.8813F, 0.9861F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bone.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(160, 17).cuboid(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 11.6935F, 22.7813F, 0.5323F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bone.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(158, 108).cuboid(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 11.9935F, 21.1813F, -0.1222F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bone.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(148, 17).cuboid(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 11.4935F, 19.8813F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bone.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(100, 60).cuboid(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 10.1935F, 18.8813F, -1.2217F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bone.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(130, 171).cuboid(-2.01F, -5.005F, -1.99F, 4.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 7.761F, 19.303F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(92, 157).cuboid(-2.01F, -6.03F, -2.985F, 4.0F, 12.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 13.93F, 30.845F, 0.4363F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 174).cuboid(-2.5F, -2.5F, -0.5F, 5.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0167F, -1.7971F, 30.21F, 0.0F, 0.0F, -0.7418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(114, 155).cuboid(-2.01F, -2.01F, -5.97F, 4.0F, 4.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -1.99F, 23.88F, 0.0F, 0.0F, -0.7418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(154, 67).cuboid(-1.005F, -1.005F, -11.945F, 2.0F, 2.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.99F, 5.771F, 2.985F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(154, 50).cuboid(-1.005F, -1.005F, -11.945F, 2.0F, 2.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.99F, 5.771F, 2.985F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(78, 137).cuboid(-2.5777F, -2.3677F, -3.98F, 4.0F, 6.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0995F, -2.786F, 9.95F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 133).cuboid(-1.4423F, -2.3677F, -3.98F, 4.0F, 6.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0995F, -2.786F, 9.95F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bone.addChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(170, 172).cuboid(-1.005F, -1.005F, -1.99F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.1921F, 1.672F, -18.2682F, 0.0F, 0.0F, 0.6545F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bone.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(158, 172).cuboid(-1.005F, -1.005F, -1.99F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.7879F, 1.672F, -18.4672F, 0.0F, 0.0F, 0.6545F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bone.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(146, 172).cuboid(-1.005F, -1.005F, -1.99F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2021F, -1.91F, -19.2632F, 0.0F, 0.0F, 0.6545F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bone.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 157).cuboid(-2.01F, -3.025F, -4.975F, 4.0F, 8.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.99F, -0.995F, -12.935F, 0.0F, 0.0F, 0.3054F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(36, 156).cuboid(-2.01F, -3.025F, -4.975F, 4.0F, 8.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.99F, -0.995F, -12.935F, 0.0F, 0.0F, -0.3054F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(60, 29)
            .cuboid(-3.0F, -15.5F, -1.0F, 6.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(76, 29)
            .cuboid(-3.0F, -15.6F, -10.0F, 6.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(142, 21)
            .cuboid(0.2F, -22.8F, -8.2F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(148, 0)
            .cuboid(0.2F, -20.8F, -8.2F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(150, 137)
            .cuboid(-2.2F, -22.8F, -8.2F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 153)
            .cuboid(-2.2F, -20.8F, -8.2F, 2.0F, 1.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(154, 128)
            .cuboid(3.0F, -19.0F, 11.0F, 2.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(168, 128)
            .cuboid(4.3F, -18.5F, 11.0F, 1.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 174)
            .cuboid(4.5F, -19.4F, 11.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(114, 137)
            .cuboid(0.2F, -17.8F, -8.2F, 2.0F, 2.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 138)
            .cuboid(-2.2F, -17.8F, -8.2F, 2.0F, 2.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(112, 171)
            .cuboid(-1.0F, -10.0F, 54.8F, 2.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bb_main.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(40, 117).cuboid(-0.5F, -1.5F, -9.0F, 1.0F, 3.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.6642F, -9.5F, 52.881F, -0.3403F, 0.0698F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bb_main.addChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 170).cuboid(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.6642F, -9.5F, 52.881F, 0.0087F, 0.0698F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bb_main.addChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(158, 96).cuboid(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.6642F, -9.5F, 52.881F, 0.0087F, -0.0698F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bb_main.addChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 50).cuboid(-0.5F, -1.5F, -9.0F, 1.0F, 3.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.6642F, -9.5F, 52.881F, -0.3403F, -0.0698F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bb_main.addChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(154, 111).cuboid(-1.0F, -2.0F, -8.0F, 2.0F, 2.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -7.4F, 54.2F, -0.3491F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bb_main.addChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(92, 29).cuboid(-1.0F, 0.0742F, -1.1647F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -24.7F, 19.6F, 1.1868F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bb_main.addChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(178, 29)
            .cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(178, 25)
            .cuboid(2.3F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.4F, -17.0F, 58.9F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bb_main.addChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(72, 150)
            .cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(72, 146)
            .cuboid(6.7F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.6F, -17.0F, 7.0F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bb_main.addChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(146, 158).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -27.2F, -15.5F, 0.0F, 0.0F, 0.576F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bb_main.addChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(146, 155).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.8F, -27.2F, -15.5F, 0.0F, 0.0F, -0.6632F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bb_main.addChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(154, 88).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, -26.0F, -15.5F, 0.0F, 0.0F, -0.7418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = bb_main.addChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(112, 60).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -26.0F, -15.5F, 0.0F, 0.0F, 0.7418F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = bb_main.addChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(154, 84)
            .cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(150, 111)
            .cuboid(-0.5F, -1.5F, 6.9F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-4.1F, -20.9F, -16.6F, 0.0F, 0.0F, 0.3142F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = bb_main.addChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 170).cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.8F, -20.8F, -15.6F, 0.0F, 0.0F, 0.3142F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = bb_main.addChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(100, 50).cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.8F, -20.8F, -15.6F, 0.0F, 0.0F, -0.3142F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = bb_main.addChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(138, 21)
            .cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 133)
            .cuboid(-0.5F, -1.5F, 6.9F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.1F, -20.9F, -16.6F, 0.0F, 0.0F, -0.3142F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = bb_main.addChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(136, 111).cuboid(0.0F, -1.0F, -4.0F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(4.1F, -16.5F, 15.0F, 0.0F, 0.0F, 0.6632F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = bb_main.addChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(50, 180)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(146, 178)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -20.6F, -2.3F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = bb_main.addChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(44, 180)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(178, 106)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -20.6F, 1.3F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = bb_main.addChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(38, 180)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(164, 178)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -20.6F, -7.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = bb_main.addChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(32, 180)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(158, 178)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -20.6F, -3.2F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = bb_main.addChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(26, 180)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(152, 178)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -20.6F, 5.2F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = bb_main.addChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(20, 180)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(178, 104)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -20.6F, 2.2F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = bb_main.addChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(180, 19)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(178, 102)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -21.9F, -3.1F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = bb_main.addChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(180, 17)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(178, 100)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -21.9F, 1.4F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = bb_main.addChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(102, 179)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(178, 98)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -21.9F, 5.3F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = bb_main.addChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(96, 179)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(178, 96)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -21.9F, -7.1F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = bb_main.addChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(90, 179)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(178, 36)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -21.9F, 2.2F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = bb_main.addChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(84, 179)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(174, 135)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -21.9F, -2.3F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = bb_main.addChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(78, 179)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(134, 27)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -21.3F, -2.7F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = bb_main.addChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(72, 179)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(128, 27)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -21.3F, -7.5F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = bb_main.addChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(176, 178)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(168, 135)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -21.3F, 5.8F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = bb_main.addChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(170, 178)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(122, 27)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2F, -21.3F, 1.8F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = bb_main.addChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 175).cuboid(-2.0F, -2.0F, -1.0F, 4.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -10.0F, 32.0F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = bb_main.addChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 113).cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.9497F, -12.8231F, 28.9F, 0.0F, 0.0F, -0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = bb_main.addChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 93).cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.9497F, -12.8231F, 28.9F, 0.0F, 0.0F, 0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = bb_main.addChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(106, 0).cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.9497F, -20.1769F, 28.9F, 0.0F, 0.0F, 0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = bb_main.addChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(100, 29).cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 20.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.9497F, -20.1769F, 28.9F, 0.0F, 0.0F, -0.5672F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = bb_main.addChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(104, 175)
            .cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(88, 175)
            .cuboid(-1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.0F, -14.0F, -9.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = bb_main.addChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(96, 175)
            .cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(80, 175)
            .cuboid(-1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.0F, -14.0F, -9.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = bb_main.addChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(178, 33).cuboid(-1.0F, -0.3973F, -0.2565F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -10.55F, 21.9F, -0.6283F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r65 = bb_main.addChild(
         "cube_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(72, 154).cuboid(-1.0F, -1.5983F, -0.246F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -10.55F, 21.9F, 0.1571F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r66 = bb_main.addChild(
         "cube_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(120, 91).cuboid(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.5F, -10.9F, 45.9F, -0.253F, 0.2757F, 0.9794F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r67 = bb_main.addChild(
         "cube_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 117).cuboid(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5F, -10.9F, 45.9F, -0.253F, -0.2757F, -0.9794F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r68 = bb_main.addChild(
         "cube_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(78, 117).cuboid(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5F, -21.0F, 45.9F, 0.0611F, 0.0174F, 1.0045F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r69 = bb_main.addChild(
         "cube_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 71).cuboid(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.5F, -21.0F, 45.9F, 0.0611F, -0.0174F, -1.0045F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r70 = bb_main.addChild(
         "cube_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(80, 91).cuboid(-0.5F, -4.0F, -5.5F, 1.0F, 7.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.2084F, -16.0F, 30.4895F, 0.0F, 0.0175F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r71 = bb_main.addChild(
         "cube_r71",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(40, 91).cuboid(-0.5F, -4.0F, -5.5F, 1.0F, 7.0F, 19.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.2084F, -16.0F, 30.4895F, 0.0F, -0.0175F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r72 = bb_main.addChild(
         "cube_r72",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(78, 63).cuboid(-0.5F, -5.0F, -9.0F, 1.0F, 10.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.6642F, -16.0F, 52.881F, 0.0F, 0.0698F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r73 = bb_main.addChild(
         "cube_r73",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(40, 63).cuboid(-0.5F, -5.0F, -9.0F, 1.0F, 10.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.6642F, -16.0F, 52.881F, 0.0F, -0.0698F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 256, 256);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDh17Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(88, 102)
            .cuboid(-1.015F, -26.822F, -20.685F, 2.0F, 2.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(110, 92)
            .cuboid(-2.03F, -24.882F, 12.08F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 77)
            .cuboid(-2.03F, -26.458F, 6.17F, 4.0F, 4.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 48)
            .cuboid(-1.0F, -29.0F, -3.0F, 2.0F, 2.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(96, 41)
            .cuboid(-1.0F, -29.6F, 10.8F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(42, 122)
            .cuboid(0.3F, -28.7F, 22.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 122).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -30.8F, 13.3F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 48).cuboid(-1.0F, -1.0F, -13.5F, 1.0F, 1.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.6F, -27.5F, 10.5F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 76).cuboid(-1.0F, -1.0F, -13.5F, 1.0F, 1.0F, 25.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.6F, -27.5F, 10.5F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bb_main.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 43).cuboid(-0.5764F, -1.0F, -0.8681F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -32.4959F, 16.8F, -1.5708F, 0.0F, 1.0647F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bb_main.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(18, 121).cuboid(-0.1016F, -1.0F, -0.1775F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -32.4959F, 16.8F, -1.5708F, 0.0F, -0.6109F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bb_main.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 109).cuboid(-0.8984F, -1.0F, -0.1775F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -32.4959F, 16.8F, -1.5708F, 0.0F, 0.6109F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bb_main.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(6, 122).cuboid(-0.4045F, -1.0F, -0.8636F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -32.4959F, 16.8F, -1.5708F, 0.0F, -1.117F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bb_main.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(54, 87).cuboid(-0.5151F, -1.0F, -0.9452F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -32.4959F, 16.8F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bb_main.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(76, 121).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2849F, -32.7411F, 9.8F, -1.5708F, 0.0F, -1.117F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bb_main.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(54, 90).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0151F, -32.9411F, 9.8F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bb_main.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(46, 117).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.2849F, -32.7411F, 9.8F, -1.5708F, 0.0F, 1.0647F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bb_main.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(30, 121).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5113F, -32.4603F, 9.8F, -1.5708F, 0.0F, 0.6109F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bb_main.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 121).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5113F, -32.4603F, 9.8F, -1.5708F, 0.0F, -0.6109F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bb_main.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(28, 117)
            .cuboid(-0.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 117)
            .cuboid(-2.5F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -11.4513F, 15.535F, 1.2828F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bb_main.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(120, 119).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -27.6F, 24.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bb_main.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(120, 115).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -27.6F, -3.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bb_main.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 117).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.0F, -31.0071F, 9.8F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bb_main.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(70, 116).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -31.0071F, 16.8F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bb_main.addChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(120, 111).cuboid(-0.4484F, -0.4484F, 0.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -32.0216F, 5.0664F, -0.2443F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bb_main.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(112, 119).cuboid(-0.4484F, -0.4484F, 0.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -32.1319F, 5.0664F, 0.0F, -0.2443F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bb_main.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(104, 119).cuboid(-0.4484F, -0.4484F, 0.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -32.0216F, 5.0664F, 0.2443F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bb_main.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 118).cuboid(-0.4484F, -0.4484F, 0.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -32.1319F, 5.0664F, 0.0F, 0.2443F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bb_main.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(114, 100).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -33.6F, 12.5F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bb_main.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(114, 53)
            .cuboid(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(114, 47)
            .cuboid(-1.5F, -1.5F, 5.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -32.0F, 13.3F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bb_main.addChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 28).cuboid(-0.5F, -1.5F, -9.5F, 2.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -31.3F, 17.3F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bb_main.addChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(110, 100)
            .cuboid(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(54, 93)
            .cuboid(3.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.7F, -18.4F, 15.2F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bb_main.addChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(114, 73).cuboid(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.5F, -25.7F, 1.5F, 0.0F, -1.0647F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bb_main.addChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 40).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, -21.0F, 13.1F, 0.4014F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bb_main.addChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 109)
            .cuboid(-1.0F, 2.0F, -6.0F, 3.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 87)
            .cuboid(1.0F, 2.0F, -6.0F, 3.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(72, 102)
            .cuboid(-1.0F, -5.0F, -5.0F, 3.0F, 9.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(56, 102)
            .cuboid(1.0F, -5.0F, -5.0F, 3.0F, 9.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5F, -15.6F, 19.0F, 0.4451F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bb_main.addChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 116).cuboid(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.0F, -20.5291F, 15.3402F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bb_main.addChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 116).cuboid(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.0F, -20.5291F, 15.3402F, -0.2618F, 0.0045F, 0.0169F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bb_main.addChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(114, 66)
            .cuboid(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(114, 59)
            .cuboid(-4.0F, -5.0F, -1.0F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.5F, -21.5F, 15.5F, -0.6894F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bb_main.addChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(88, 118)
            .cuboid(-1.0F, -5.0F, -1.0F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(38, 117)
            .cuboid(1.0F, -5.0F, -1.0F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5F, -18.1F, 17.8F, 0.4451F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bb_main.addChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 37).cuboid(-1.0F, -0.2651F, -0.2541F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -21.025F, 10.15F, -0.6632F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = bb_main.addChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(36, 122).cuboid(-1.0F, -1.7328F, -0.2477F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -21.025F, 10.15F, -0.0087F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = bb_main.addChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 34).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -18.4F, 11.8F, 2.0508F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = bb_main.addChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 31).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -17.95F, 10.3F, 1.6581F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = bb_main.addChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 28).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -18.05F, 8.5F, 1.3701F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = bb_main.addChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 122).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -18.85F, 7.05F, 0.8203F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = bb_main.addChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(109, 103).cuboid(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.03F, -21.2637F, 13.4379F, -0.9687F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = bb_main.addChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(70, 121).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -20.25F, 6.1F, 0.3229F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = bb_main.addChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 113).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -21.8F, 6.1F, -0.3316F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = bb_main.addChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(88, 112).cuboid(-2.03F, -2.03F, -0.985F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -24.231F, 4.988F, 1.0908F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = bb_main.addChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(108, 111).cuboid(-2.03F, -3.03F, -1.97F, 4.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -22.367F, 15.702F, -0.7069F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = bb_main.addChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(110, 41).cuboid(-1.1843F, -0.4977F, -0.985F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.97F, -26.004F, 27.249F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = bb_main.addChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(10, 117).cuboid(-1.1543F, -0.4977F, -0.985F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.197F, -27.777F, 27.249F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = bb_main.addChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(80, 116).cuboid(-1.015F, -2.03F, -0.985F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.985F, -24.625F, 27.249F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = bb_main.addChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(100, 112).cuboid(-1.015F, -2.03F, -0.985F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.985F, -26.595F, 27.249F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = bb_main.addChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(110, 84).cuboid(-1.015F, -1.015F, 0.0F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.807F, -20.685F, 0.0F, -0.2443F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = bb_main.addChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(110, 76).cuboid(-1.015F, -1.015F, 0.0F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.807F, -20.685F, 0.0F, 0.2443F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = bb_main.addChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(34, 109).cuboid(-1.015F, -1.015F, 0.0F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.61F, -20.685F, 0.2443F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = bb_main.addChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(18, 109).cuboid(-1.015F, -1.015F, 0.0F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.61F, -20.685F, -0.2443F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = bb_main.addChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 14).cuboid(-2.03F, -2.03F, -19.7F, 4.0F, 4.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.61F, 3.94F, 0.0F, 0.0F, 1.9635F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = bb_main.addChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 0).cuboid(-2.03F, -2.03F, -19.7F, 4.0F, 4.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.61F, 3.94F, 0.0F, 0.0F, 1.7017F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = bb_main.addChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 95).cuboid(-2.03F, -2.03F, -19.7F, 4.0F, 4.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.61F, 3.94F, 0.0F, 0.0F, 1.4399F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = bb_main.addChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 95).cuboid(-2.03F, -2.03F, -19.7F, 4.0F, 4.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.61F, 3.94F, 0.0F, 0.0F, 1.1345F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = bb_main.addChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 77).cuboid(-2.03F, 0.97F, -5.91F, 4.0F, 4.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -19.908F, 17.413F, -1.1345F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = bb_main.addChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-2.03F, -2.03F, -19.7F, 4.0F, 4.0F, 44.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.61F, 3.94F, 0.0F, 0.0F, 0.7854F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createE5Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(34, 29)
            .cuboid(-0.8F, -28.634F, 1.343F, 2.0F, 3.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(40, 85)
            .cuboid(-2.2F, -29.1327F, 8.4428F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(34, 44)
            .cuboid(-1.8F, -28.6327F, 1.343F, 2.0F, 3.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(64, 91)
            .cuboid(-0.85F, -31.6327F, 8.4431F, 1.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(94, 33)
            .cuboid(-1.7F, -28.528F, 12.8516F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(96, 11)
            .cuboid(0.1F, -28.528F, 12.8516F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(96, 21)
            .cuboid(0.1F, -26.728F, 12.8516F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 83)
            .cuboid(-1.699F, -26.728F, 12.8516F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 92)
            .cuboid(-1.8F, -28.6328F, 13.857F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(94, 29)
            .cuboid(-0.8F, -28.6327F, 13.8572F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 95)
            .cuboid(-0.8F, -31.0327F, 11.9572F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 85)
            .cuboid(-1.3F, -28.4327F, -2.557F, 2.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 75)
            .cuboid(-0.798F, -20.2165F, -2.9877F, 1.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(96, 3)
            .cuboid(-0.8F, -30.5327F, -2.3571F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(96, 7)
            .cuboid(-0.799F, -30.5327F, -1.7571F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(86, 29)
            .cuboid(-0.799F, -31.1327F, 1.343F, 1.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 96)
            .cuboid(-0.8F, -31.6327F, 0.2429F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 92)
            .cuboid(-1.3F, -31.6327F, -1.7571F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(56, 59)
            .cuboid(-0.8F, -28.6327F, -13.5571F, 2.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 61)
            .cuboid(-1.8F, -28.635F, -13.5571F, 2.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(82, 69)
            .cuboid(-0.8F, -27.4327F, -1.957F, 5.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(86, 46)
            .cuboid(-1.301F, -32.3327F, -3.7571F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 52)
            .cuboid(-1.999F, -28.4327F, -7.2571F, 4.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(82, 63)
            .cuboid(-2.0F, -26.9327F, -7.257F, 4.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(52, 85)
            .cuboid(-1.799F, -28.0327F, -2.557F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(64, 85)
            .cuboid(-0.799F, -28.0327F, -2.557F, 2.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(96, 23)
            .cuboid(-0.798F, -31.1327F, 0.7429F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 96)
            .cuboid(-0.801F, -30.6327F, 0.7429F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(14, 85)
            .cuboid(-0.8F, -31.0327F, -12.0429F, 1.0F, 1.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(96, 14)
            .cuboid(0.1F, -28.528F, -14.3484F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(96, 25)
            .cuboid(0.099F, -26.728F, -14.3484F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(6, 96)
            .cuboid(-1.7F, -26.728F, -14.3484F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(90, 95)
            .cuboid(-1.7F, -28.528F, -14.3484F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(88, 85)
            .cuboid(-0.799F, -30.5327F, -12.0571F, 1.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 40)
            .cuboid(-1.0844F, -31.0223F, -25.043F, 1.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(50, 73)
            .cuboid(-0.6156F, -30.9777F, -25.043F, 1.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 96)
            .cuboid(-1.3F, -31.5327F, -26.8429F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 96)
            .cuboid(-0.8F, -29.5327F, -26.8429F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(76, 85)
            .cuboid(-0.8F, -27.6327F, -30.043F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(86, 36)
            .cuboid(-1.299F, -28.1328F, -28.043F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 75)
            .cuboid(-0.799F, -26.9327F, -5.257F, 1.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 91)
            .cuboid(-1.8F, -24.3327F, -8.0571F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(94, 46)
            .cuboid(-0.8F, -23.6327F, -7.657F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 38).cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7F, -19.5327F, -3.7571F, 0.0F, 0.2793F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 6).cuboid(-0.499F, -0.382F, -2.989F, 1.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -16.6685F, 1.7651F, -0.096F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 0).cuboid(-0.5F, -0.382F, -1.011F, 1.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -16.6685F, 1.7651F, 1.021F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bb_main.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 17).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -17.642F, -5.7354F, 1.3614F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bb_main.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 19).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -17.9366F, -6.5233F, 1.0647F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bb_main.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 27).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -18.4142F, -6.9845F, 0.4712F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bb_main.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(54, 95).cuboid(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -20.6327F, -3.2571F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bb_main.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 41).cuboid(-1.499F, -1.8F, 3.5F, 3.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -26.5327F, -19.6571F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bb_main.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 18).cuboid(-0.502F, -4.7999F, -5.5F, 3.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7F, -27.5327F, -13.657F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bb_main.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 85).cuboid(-1.501F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -25.5559F, -16.9844F, -0.7243F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bb_main.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(40, 91)
            .cuboid(-0.5F, -4.8F, -5.5F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(70, 91)
            .cuboid(-0.5F, -3.8F, -7.5F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(86, 12)
            .cuboid(-0.5F, -3.8F, -10.4F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.2F, -27.5327F, -14.157F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bb_main.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(90, 79)
            .cuboid(-1.499F, -3.8F, -5.5F, 3.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(90, 73)
            .cuboid(-1.499F, -3.8F, -8.8F, 3.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 59)
            .cuboid(-1.5F, -1.8F, -8.8001F, 3.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(58, 14)
            .cuboid(-1.5F, -1.2F, -8.8F, 3.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -27.1327F, -16.3571F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bb_main.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 92).cuboid(-1.0F, -1.2514F, -0.7003F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -27.1327F, -25.0338F, 0.8727F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bb_main.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(8, 92).cuboid(-1.0F, -1.2514F, -0.7003F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -27.1327F, -25.0338F, 0.8727F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bb_main.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 92).cuboid(-1.0F, -1.2514F, -0.7003F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -27.1327F, -25.0338F, 0.8727F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bb_main.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(90, 91).cuboid(-1.0F, -1.2514F, -0.7003F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -27.1327F, -25.0338F, 0.8727F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bb_main.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(28, 96)
            .cuboid(-0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-0.5F, -0.5F, 17.0F, 1.0F, 1.0F, 28.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -30.5327F, -31.043F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bb_main.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(26, 73)
            .cuboid(-0.2656F, -0.5223F, -5.0F, 1.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 28)
            .cuboid(-0.7344F, -0.4777F, -5.0F, 1.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.35F, -30.5F, -20.043F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bb_main.addChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 0).cuboid(-1.5F, -1.5F, -5.5001F, 3.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.6F, -27.1327F, -19.6571F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bb_main.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 47).cuboid(-1.5F, -1.5F, -5.5002F, 3.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -27.1327F, -19.6571F, 0.0F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bb_main.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 54).cuboid(-0.999F, -3.0F, -0.5F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -29.9233F, -0.8367F, 1.7715F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bb_main.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 36).cuboid(-1.0001F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3071F, -32.6398F, -0.2571F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bb_main.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(36, 96).cuboid(-0.4999F, -0.5F, -0.5001F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5929F, -31.6327F, -0.2571F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bb_main.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 96).cuboid(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0071F, -32.3398F, -0.2571F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bb_main.addChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(22, 83).cuboid(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -17.3381F, -4.9833F, 1.0123F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bb_main.addChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(78, 91).cuboid(0.0F, -3.5F, -0.5F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -16.4698F, -3.9517F, -0.5934F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bb_main.addChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 24).cuboid(-0.003F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -16.8985F, -4.4278F, 0.6981F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bb_main.addChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(82, 52).cuboid(0.0F, -4.5F, -4.5F, 1.0F, 5.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -21.7951F, -2.7712F, -1.8226F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bb_main.addChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(58, 91).cuboid(-0.55F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.4F, -28.6327F, 9.4429F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bb_main.addChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 47).cuboid(-0.5F, -3.0F, -1.0F, 1.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.0F, -28.6327F, 9.4429F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bb_main.addChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 96).cuboid(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -25.2605F, 7.162F, -1.85F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bb_main.addChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 29).cuboid(0.01F, -0.5F, -4.5F, 1.0F, 2.0F, 16.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -24.2742F, 2.9921F, -2.9496F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bb_main.addChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(84, 91).cuboid(-0.001F, -3.5F, -1.5F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -20.1283F, -2.4369F, -1.0385F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bb_main.addChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(74, 73).cuboid(-0.002F, -4.5F, -8.5F, 1.0F, 5.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -14.5373F, 1.914F, -0.9512F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDc15aLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 63)
            .cuboid(-2.21F, -27.554F, -44.12F, 4.0F, 5.0F, 28.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(64, 63)
            .cuboid(-1.21F, -23.69F, -7.16F, 2.0F, 3.0F, 27.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(64, 93)
            .cuboid(-2.21F, -29.85F, -1.79F, 4.0F, 3.0F, 23.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 96)
            .cuboid(-2.21F, -28.85F, 20.48F, 4.0F, 2.0F, 21.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(88, 119)
            .cuboid(-2.21F, -29.64F, 34.01F, 4.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(52, 167)
            .cuboid(0.327F, -34.63F, 1.253F, 2.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(60, 167)
            .cuboid(-2.537F, -34.63F, 1.253F, 2.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(124, 173)
            .cuboid(-1.0F, -26.0F, 41.4F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(52, 174)
            .cuboid(1.0F, -30.8F, 33.8F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 154)
            .cuboid(1.0F, -30.5F, 35.0F, 1.0F, 1.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(22, 154)
            .cuboid(-2.4F, -30.5F, 35.0F, 1.0F, 1.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(58, 174)
            .cuboid(-2.4F, -30.8F, 33.8F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 172)
            .cuboid(1.0F, -29.0F, 32.8F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 172)
            .cuboid(-2.4F, -29.0F, 32.8F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(142, 150)
            .cuboid(0.6F, -27.0F, 4.3F, 2.0F, 5.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(158, 32)
            .cuboid(2.1F, -26.0F, 5.0F, 2.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 141)
            .cuboid(0.0F, -21.7F, -7.2F, 1.0F, 1.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(96, 155)
            .cuboid(0.0F, -21.7F, 6.8F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(132, 173)
            .cuboid(0.0F, -21.7F, 16.9F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(162, 173)
            .cuboid(-1.4F, -21.7F, 16.9F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(158, 0)
            .cuboid(-1.4F, -21.7F, 6.8F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(26, 141)
            .cuboid(-1.4F, -21.7F, -7.2F, 1.0F, 1.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(52, 153)
            .cuboid(-3.2F, -27.0F, 4.3F, 2.0F, 5.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(158, 42)
            .cuboid(-4.7F, -26.0F, 5.0F, 2.0F, 3.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 174)
            .cuboid(-1.6F, -23.0F, 4.8F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(22, 174)
            .cuboid(0.2F, -23.0F, 4.8F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 174)
            .cuboid(-0.6F, -23.0F, 4.8F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(162, 100)
            .cuboid(-1.2F, -18.0F, 2.0F, 2.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(88, 169)
            .cuboid(-1.2F, -19.0F, 4.8F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(174, 149)
            .cuboid(0.2F, -22.0F, 14.9F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(174, 153)
            .cuboid(-1.6F, -22.0F, 14.9F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(174, 66)
            .cuboid(-0.6F, -23.0F, 14.9F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(30, 169)
            .cuboid(-0.6F, -21.0F, 14.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(68, 169)
            .cuboid(-1.2F, -23.1F, -34.0F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(120, 137)
            .cuboid(-2.2F, -29.0F, -27.0F, 5.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(114, 173)
            .cuboid(-2.2F, -28.2F, -43.1F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(158, 10).cuboid(-0.5F, -2.5F, -5.0F, 2.0F, 5.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7258F, -25.8343F, -56.6171F, 1.5775F, -0.001F, -0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(164, 73)
            .cuboid(-1.5F, -2.5F, -1.0F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(120, 150)
            .cuboid(-0.5F, -2.5F, -5.0F, 1.0F, 5.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2258F, -24.7343F, -56.6171F, 1.5775F, -0.001F, -0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(164, 161).cuboid(-0.5F, -5.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.147F, -21.952F, -53.4F, -0.8619F, -0.001F, 0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bb_main.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(162, 119).cuboid(-1.5F, -4.5F, -2.5F, 2.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.353F, -23.752F, -48.6F, -1.56F, -0.001F, 0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bb_main.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(162, 108).cuboid(-1.5F, -2.5F, -2.5F, 2.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.353F, -26.248F, -48.6F, 1.56F, -0.001F, -0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bb_main.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(152, 164).cuboid(-0.5F, -2.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.147F, -28.048F, -53.4F, 0.8619F, -0.001F, -0.014F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bb_main.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(164, 149).cuboid(-0.5F, -5.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.253F, -20.552F, -55.1F, -0.8727F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bb_main.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(142, 164).cuboid(-0.5F, -5.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.653F, -20.552F, -55.1F, -0.8727F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bb_main.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(164, 61).cuboid(-0.5F, -2.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.653F, -29.448F, -55.1F, 0.8727F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bb_main.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(78, 141).cuboid(-0.5F, -2.5F, -2.5F, 1.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.253F, -29.448F, -55.1F, 0.8727F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bb_main.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(134, 165).cuboid(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.253F, -20.352F, -57.6F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bb_main.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 165).cuboid(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.653F, -20.352F, -57.6F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bb_main.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(118, 165).cuboid(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.653F, -29.648F, -57.6F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bb_main.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(110, 165).cuboid(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.253F, -29.648F, -57.6F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bb_main.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(88, 137).cuboid(-0.5F, -1.5F, -10.0F, 1.0F, 3.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.3F, -23.9F, -49.1F, 0.0F, 0.0F, 0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bb_main.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 36).cuboid(-0.5F, -1.5F, -10.0F, 1.0F, 3.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.7F, -23.9F, -49.1F, 0.0F, 0.0F, -0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bb_main.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 18).cuboid(-0.5F, -1.5F, -10.0F, 1.0F, 3.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.7F, -26.1F, -49.1F, 0.0F, 0.0F, 0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bb_main.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 0).cuboid(-0.5F, -1.5F, -10.0F, 1.0F, 3.0F, 15.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.3F, -26.1F, -49.1F, 0.0F, 0.0F, -0.48F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bb_main.addChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(104, 131).cuboid(-3.0F, -0.5F, -2.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.8F, -28.0F, -27.5F, 0.6807F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bb_main.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(174, 71)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(68, 167)
            .cuboid(1.4F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.4F, -23.9F, -30.8F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bb_main.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(88, 131).cuboid(-2.0F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.2F, -30.0F, -12.5F, 0.0F, 0.0F, -1.5272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bb_main.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 81).cuboid(-1.0F, 0.0F, -5.5F, 3.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.5F, -28.0F, -21.5F, 0.0F, 0.0F, -1.5272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bb_main.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(150, 81)
            .cuboid(-2.0F, 0.0F, -3.5F, 5.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(122, 63)
            .cuboid(-2.0F, 0.0F, -20.5F, 4.0F, 1.0F, 17.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.2F, -28.0F, -12.5F, 0.0F, 0.0F, -1.5272F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bb_main.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(156, 91).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -19.0231F, -24.4525F, 0.0175F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bb_main.addChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(80, 153).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -20.133F, -23.45F, 1.6319F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bb_main.addChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(74, 153).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -19.233F, -23.55F, 1.309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bb_main.addChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(150, 91).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -19.0231F, -23.8525F, 0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bb_main.addChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(174, 157).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -22.2F, -34.3F, 0.6981F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bb_main.addChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(174, 162)
            .cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(106, 169)
            .cuboid(0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -20.4518F, -27.6154F, -0.9948F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bb_main.addChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(174, 160)
            .cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(40, 171)
            .cuboid(0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -21.8518F, -30.7154F, -1.0996F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bb_main.addChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 172)
            .cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(40, 169)
            .cuboid(0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -14.1518F, -32.7154F, -1.0908F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bb_main.addChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(106, 171)
            .cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(116, 163)
            .cuboid(0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -13.4518F, -29.4154F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bb_main.addChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(10, 165)
            .cuboid(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 165)
            .cuboid(0.7F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -22.5146F, -28.7028F, -0.5323F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bb_main.addChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(50, 113)
            .cuboid(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(162, 130)
            .cuboid(0.7F, 0.0F, -1.0F, 1.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.8F, -14.3F, -32.6F, -0.2705F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = bb_main.addChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(52, 141)
            .cuboid(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(152, 137)
            .cuboid(0.2F, -0.5F, -2.5F, 1.0F, 1.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -14.8173F, -28.7882F, 1.3003F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = bb_main.addChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(74, 155)
            .cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(158, 22)
            .cuboid(0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -14.8173F, -32.9882F, 1.3177F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = bb_main.addChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 174).cuboid(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -23.5F, -26.0F, 0.6981F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = bb_main.addChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(174, 61).cuboid(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3F, -20.5F, -26.3F, 0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = bb_main.addChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(174, 132).cuboid(-0.5F, 0.5F, -0.5F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7F, -19.0F, -24.4F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = bb_main.addChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(174, 128).cuboid(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -21.5F, -23.6F, 0.0785F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = bb_main.addChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(174, 124)
            .cuboid(-0.5F, -1.0F, -1.4F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(174, 120)
            .cuboid(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -19.5F, 15.65F, 1.5708F, -1.1956F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = bb_main.addChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(174, 116)
            .cuboid(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(174, 112)
            .cuboid(-0.5F, -1.0F, -1.4F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -19.6044F, 16.1848F, -1.5708F, -1.213F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = bb_main.addChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(104, 173).cuboid(-2.5F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.9F, -17.3F, 9.0F, 0.0F, 0.0F, -0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = bb_main.addChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(98, 165).cuboid(-0.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.4F, -17.3F, 9.0F, 0.0F, 0.0F, 0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = bb_main.addChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 165).cuboid(-2.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.0F, -17.4F, 9.0F, 0.0F, 0.0F, -0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = bb_main.addChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(74, 165).cuboid(-2.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.9F, -17.5F, 9.0F, 0.0F, 0.0F, -0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = bb_main.addChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 173).cuboid(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.2F, -18.2F, 9.0F, 0.0F, 0.0F, -0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = bb_main.addChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 165).cuboid(-0.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5F, -17.4F, 9.0F, 0.0F, 0.0F, 0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = bb_main.addChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 165).cuboid(-0.5F, 0.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.4F, -17.5F, 9.0F, 0.0F, 0.0F, 0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = bb_main.addChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(78, 173).cuboid(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7F, -18.2F, 9.0F, 0.0F, 0.0F, 0.7767F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = bb_main.addChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(144, 54).cuboid(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -17.1F, 3.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = bb_main.addChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 169).cuboid(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.25F, -17.05F, 9.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = bb_main.addChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 54).cuboid(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -17.0F, 1.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = bb_main.addChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(116, 161)
            .cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(158, 52)
            .cuboid(-1.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -21.6F, -6.3F, 0.7418F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = bb_main.addChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(116, 159)
            .cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(116, 157)
            .cuboid(-1.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -21.6F, 19.0F, 0.7418F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = bb_main.addChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(78, 169).cuboid(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -22.2F, 19.4F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = bb_main.addChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 169).cuboid(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -22.2F, -6.7F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = bb_main.addChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(34, 174).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.9F, -22.3F, -6.7F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = bb_main.addChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(170, 173).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.9F, -22.3F, 19.4F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = bb_main.addChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 154).cuboid(-0.5F, -21.0721F, -0.4504F, 1.0F, 21.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, -27.6F, -1.7F, -1.5184F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = bb_main.addChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(174, 164)
            .cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(116, 155)
            .cuboid(3.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.25F, -27.55F, -1.55F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = bb_main.addChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(174, 108)
            .cuboid(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(70, 174)
            .cuboid(2.9F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.9F, -29.487F, 34.2617F, -0.3752F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = bb_main.addChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 154).cuboid(-0.5F, -21.0982F, -0.7493F, 1.0F, 21.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.7F, -27.3F, -1.7F, -1.5184F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = bb_main.addChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 119).cuboid(-2.21F, -2.21F, -5.37F, 4.0F, 4.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.06F, 28.64F, 0.0F, 0.0F, -0.1309F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r65 = bb_main.addChild(
         "cube_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 119).cuboid(-2.21F, -2.21F, -5.37F, 4.0F, 4.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.06F, 28.64F, 0.0F, 0.0F, -0.4363F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r66 = bb_main.addChild(
         "cube_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(118, 115).cuboid(-2.21F, -2.21F, -5.37F, 4.0F, 4.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.06F, 28.64F, 0.0F, 0.0F, 0.4363F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r67 = bb_main.addChild(
         "cube_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(118, 93).cuboid(-2.21F, -2.21F, -5.37F, 4.0F, 4.0F, 18.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.06F, 28.64F, 0.0F, 0.0F, 0.1309F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r68 = bb_main.addChild(
         "cube_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(162, 52).cuboid(-2.21F, -1.42F, -2.685F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -31.957F, 3.222F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r69 = bb_main.addChild(
         "cube_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(162, 91).cuboid(-2.21F, -3.21F, -0.895F, 4.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -30.525F, 0.0F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r70 = bb_main.addChild(
         "cube_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 96).cuboid(-1.21F, -6.84F, -2.685F, 2.0F, 12.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -17.9F, -29.885F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r71 = bb_main.addChild(
         "cube_r71",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-2.21F, -2.21F, -16.11F, 4.0F, 4.0F, 59.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -25.06F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 256, 256);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createJawaLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone = partdefinition.addChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(64, 14)
            .cuboid(-4.0F, -19.3F, 6.9F, 8.0F, 2.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(60, 54)
            .cuboid(-4.0F, -18.8F, 6.0F, 8.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(106, 59)
            .cuboid(-2.5F, -19.3F, 13.9F, 5.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(86, 49)
            .cuboid(-2.0F, -18.3F, 9.3F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(124, 111)
            .cuboid(-1.0F, -18.8F, -4.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 45)
            .cuboid(1.0F, -23.0F, 13.0F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 50)
            .cuboid(-2.0F, -23.0F, 13.0F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(44, 116)
            .cuboid(-1.5F, -24.5F, 6.0F, 3.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 89).cuboid(-1.5F, -1.1018F, -0.3077F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.0F, 5.7213F, 0.8552F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bone.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(120, 98).cuboid(-1.5F, -0.8982F, -1.6923F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.0F, -4.7213F, 0.8552F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bone.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(14, 124).cuboid(-1.5F, -1.1018F, -1.6923F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.0F, -4.7213F, -0.8552F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bone.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(82, 121).cuboid(-1.5F, -1.1018F, -1.6923F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.0F, -4.7213F, -0.8552F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bone.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 124).cuboid(-1.5F, 0.1018F, -1.6923F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.0F, -4.7213F, 0.8552F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bone.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(92, 121).cuboid(-1.5F, -1.1018F, -0.3077F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -22.5392F, -7.3884F, 0.8552F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = bone.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(124, 76).cuboid(-0.5F, -0.3439F, -0.2452F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0892F, -22.5F, -6.3014F, -0.8552F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = bone.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(124, 80).cuboid(-0.5F, -1.6561F, -0.2452F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0892F, -22.5F, -6.3014F, 0.8552F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = bone.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 85).cuboid(-1.5F, -0.8982F, -0.3077F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.3608F, -7.3884F, -0.8552F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r10 = bone.addChild(
         "cube_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 123).cuboid(-1.5F, 0.1018F, -0.3077F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.0F, 5.7213F, -0.8552F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r11 = bone.addChild(
         "cube_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(74, 23).cuboid(-1.0F, -1.1018F, -0.3077F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.5F, 5.7213F, 0.8552F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r12 = bone.addChild(
         "cube_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 23).cuboid(-1.0F, 0.1018F, -0.3077F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.5F, 5.7213F, -0.8552F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r13 = bone.addChild(
         "cube_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(36, 112).cuboid(-1.5F, -1.2356F, -1.6453F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.0F, 8.5509F, 1.3439F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r14 = bone.addChild(
         "cube_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(34, 124).cuboid(-1.5F, -1.7644F, -1.6453F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.0F, 8.5509F, -1.3439F, 0.0F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r15 = bone.addChild(
         "cube_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(36, 108).cuboid(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -21.8246F, 8.6509F, 1.3439F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r16 = bone.addChild(
         "cube_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 107).cuboid(-1.5F, -0.5F, -1.0F, 3.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.9132F, 9.7378F, -1.3439F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r17 = bone.addChild(
         "cube_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(70, 97)
            .cuboid(-2.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(44, 98)
            .cuboid(1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -19.7601F, 17.478F, -1.9548F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r18 = bone.addChild(
         "cube_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(76, 87)
            .cuboid(-2.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(76, 90)
            .cuboid(1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -19.8421F, 17.0094F, -0.8203F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r19 = bone.addChild(
         "cube_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(78, 54).cuboid(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -18.2539F, -2.6831F, 0.0F, -1.0123F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r20 = bone.addChild(
         "cube_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(70, 120).cuboid(-2.5F, -2.0F, -1.0F, 4.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -16.7604F, 11.4372F, -0.4538F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r21 = bone.addChild(
         "cube_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(76, 93).cuboid(-5.0F, -1.0F, -6.0F, 5.0F, 2.0F, 7.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.5F, -15.6F, 19.8F, -0.4538F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r22 = bone.addChild(
         "cube_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 0).cuboid(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -18.8F, 19.5F, -0.1396F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r23 = bone.addChild(
         "cube_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(114, 16).cuboid(-2.5F, -3.0F, 1.5F, 5.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -18.3424F, 20.7899F, -1.0996F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r24 = bone.addChild(
         "cube_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(106, 67).cuboid(-2.5F, -3.0F, 0.5F, 5.0F, 4.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -18.3424F, 18.6898F, -1.0996F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r25 = bone.addChild(
         "cube_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 30).cuboid(-2.5F, -3.0F, -5.5F, 5.0F, 4.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -11.3819F, 25.6503F, -0.4712F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r26 = bone.addChild(
         "cube_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 13).cuboid(-2.5F, -1.0F, 5.0F, 5.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -24.0565F, 30.8533F, -1.5533F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r27 = bone.addChild(
         "cube_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(90, 0).cuboid(-2.5F, -1.0F, 4.0F, 5.0F, 7.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -17.0F, 20.1F, 0.1047F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r28 = bone.addChild(
         "cube_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 80).cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -12.5415F, 13.8595F, 0.576F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r29 = bone.addChild(
         "cube_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 71).cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -15.7F, 11.5F, 0.6807F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r30 = bone.addChild(
         "cube_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(76, 84).cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -17.8F, -2.2F, 1.4312F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r31 = bone.addChild(
         "cube_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 76).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -19.7F, -3.3F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r32 = bone.addChild(
         "cube_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(82, 80)
            .cuboid(1.0F, -1.0F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 112)
            .cuboid(1.0F, -1.0F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.31F, -22.8517F, 0.5F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r33 = bone.addChild(
         "cube_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(52, 84)
            .cuboid(-2.0F, -1.0F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(76, 112)
            .cuboid(-2.0F, -1.0F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.4554F, -23.1687F, 0.5F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r34 = bone.addChild(
         "cube_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(86, 36)
            .cuboid(1.1121F, -0.9536F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 116)
            .cuboid(1.1121F, -0.9536F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2312F, -23.2716F, 0.5F, 0.0F, 0.0F, -1.9635F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r35 = bone.addChild(
         "cube_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 88)
            .cuboid(-2.1121F, -1.0464F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(30, 116)
            .cuboid(-2.1121F, -1.0464F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0858F, -22.7489F, 0.5F, 0.0F, 0.0F, -1.9635F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r36 = bone.addChild(
         "cube_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 107).cuboid(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.0F, -17.9814F, 6.711F, 1.5708F, 0.5149F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r37 = bone.addChild(
         "cube_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(106, 76).cuboid(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.0F, -18.6186F, 6.711F, -1.5708F, 0.5149F, -1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r38 = bone.addChild(
         "cube_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(94, 13).cuboid(1.12F, -0.9429F, -5.49F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.036F, -17.2632F, 3.39F, 0.0F, 0.0F, -1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r39 = bone.addChild(
         "cube_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 97).cuboid(-2.12F, -0.9019F, -5.49F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.0458F, -17.2789F, 3.39F, 0.0F, 0.0F, 1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r40 = bone.addChild(
         "cube_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 98).cuboid(0.0F, -0.9355F, -8.5F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.3057F, -18.3357F, 6.4F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r41 = bone.addChild(
         "cube_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(100, 93).cuboid(0.0F, -1.0785F, -8.5F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.9177F, -17.2797F, 6.4F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r42 = bone.addChild(
         "cube_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 101).cuboid(-2.12F, -1.1071F, -5.49F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.8864F, -18.8872F, 3.39F, 0.0F, 0.0F, -1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r43 = bone.addChild(
         "cube_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(70, 102).cuboid(1.12F, -0.0621F, -5.49F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0313F, -19.2871F, 3.39F, 0.0F, 0.0F, 1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r44 = bone.addChild(
         "cube_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(90, 103).cuboid(-1.0F, -1.0605F, -8.5F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.8768F, -17.2963F, 6.4F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r45 = bone.addChild(
         "cube_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(106, 49).cuboid(-1.0F, -0.9565F, -8.5F, 1.0F, 1.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.266F, -18.3163F, 6.4F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r46 = bone.addChild(
         "cube_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(26, 85)
            .cuboid(1.1121F, -0.9536F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(90, 113)
            .cuboid(1.1121F, -0.9536F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -23.3071F, 0.5F, 0.0F, 0.0F, -1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r47 = bone.addChild(
         "cube_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(86, 23)
            .cuboid(-2.1121F, -1.0464F, -5.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(114, 8)
            .cuboid(-2.1121F, -1.0464F, 9.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1454F, -22.7133F, 0.5F, 0.0F, 0.0F, -1.1781F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r48 = bone.addChild(
         "cube_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(110, 111)
            .cuboid(1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(82, 54)
            .cuboid(1.0F, -1.0F, -15.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.31F, -23.1687F, 10.5F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r49 = bone.addChild(
         "cube_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(112, 0)
            .cuboid(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(82, 67)
            .cuboid(-2.0F, -1.0F, -15.5F, 1.0F, 2.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.4554F, -22.8517F, 10.5F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r50 = bone.addChild(
         "cube_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(104, 119)
            .cuboid(-4.0F, -2.5F, 0.0F, 5.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(58, 120)
            .cuboid(-4.0F, -2.5F, 8.6F, 5.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(118, 119)
            .cuboid(-4.0F, -2.5F, 6.7F, 5.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 119)
            .cuboid(-4.0F, -2.5F, 16.0F, 5.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.6F, -23.0F, -4.0F, 0.0F, 0.0F, -3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r51 = bone.addChild(
         "cube_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-2.0F, -2.8171F, -6.3256F, 2.0F, 1.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.551F, -21.9394F, -14.1544F, -0.1396F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r52 = bone.addChild(
         "cube_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 15).cuboid(-2.0F, 1.8171F, -6.3256F, 2.0F, 1.0F, 14.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.551F, -21.9394F, -14.1544F, 0.1396F, 0.0F, 1.5708F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r53 = bone.addChild(
         "cube_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(26, 71).cuboid(-0.5F, -1.5F, -3.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.7705F, -21.163F, -17.061F, 0.0735F, 0.1772F, -0.3959F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r54 = bone.addChild(
         "cube_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 56).cuboid(-2.0F, 0.0F, -2.5F, 1.0F, 2.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.7187F, -21.8498F, -17.8086F, -7.0E-4F, 0.1916F, -0.7952F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r55 = bone.addChild(
         "cube_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 40).cuboid(1.0F, 0.0F, -2.5F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.7187F, -21.8498F, -17.8086F, -7.0E-4F, -0.1916F, 0.7952F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r56 = bone.addChild(
         "cube_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 74).cuboid(-0.5F, -1.5F, -3.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.7705F, -21.163F, -17.061F, 0.0735F, -0.1772F, 0.3959F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r57 = bone.addChild(
         "cube_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(56, 70).cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.7705F, -24.7157F, -17.061F, -0.0735F, 0.1772F, 0.3959F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r58 = bone.addChild(
         "cube_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 26).cuboid(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7323F, -20.1308F, -14.0849F, -0.0173F, -0.1783F, 1.4605F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r59 = bone.addChild(
         "cube_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 26).cuboid(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7323F, -20.1308F, -14.0849F, -0.0173F, 0.1783F, -1.4605F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r60 = bone.addChild(
         "cube_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 60).cuboid(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7323F, -25.7479F, -14.0849F, 0.0173F, -0.1783F, -1.4605F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r61 = bone.addChild(
         "cube_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(56, 56).cuboid(-0.5F, -1.0F, -6.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7323F, -25.7479F, -14.0849F, 0.0173F, 0.1783F, 1.4605F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r62 = bone.addChild(
         "cube_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 45).cuboid(-2.0F, -2.0F, -2.5F, 1.0F, 2.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.7187F, -24.0289F, -17.8086F, 7.0E-4F, 0.1916F, 0.7952F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r63 = bone.addChild(
         "cube_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 0).cuboid(-0.5F, -0.5F, -3.0F, 1.0F, 2.0F, 12.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.7705F, -24.7157F, -17.061F, -0.0735F, -0.1772F, -0.3959F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r64 = bone.addChild(
         "cube_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 41).cuboid(1.0F, -2.0F, -2.5F, 1.0F, 2.0F, 13.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.7187F, -24.0289F, -17.8086F, 7.0E-4F, -0.1916F, -0.7952F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 256, 256);
   }

   public void render(com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }
}
