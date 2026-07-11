package che.swgc.client.model.entity;

import che.swgc.client.animation.B2Animation;
import che.swgc.entity.CommandableMob;
import javax.annotation.ParametersAreNonnullByDefault;
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

@javax.annotation.ParametersAreNonnullByDefault
public class B2Model<T extends CommandableMob> extends che.swgc.client.compat.model.SinglePartEntityModel<T> {
   public static final net.minecraft.client.model.geom.ModelLayerLocation LAYER_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "sb2"), "main");
   private final net.minecraft.client.model.geom.ModelPart root;
   private final net.minecraft.client.model.geom.ModelPart head;

   public B2Model(net.minecraft.client.model.geom.ModelPart root) {
      super(net.minecraft.client.renderer.rendertype.RenderType::getEntityCutout);
      this.root = root;
      this.head = root.getChild("body").getChild("Corpus1").getChild("head");
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBodyLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition body = partdefinition.addChild(
         "body",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(98, 37)
            .cuboid(-2.0F, -6.5F, -1.0F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 128)
            .cuboid(-1.5F, -8.5131F, -3.4176F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(94, 129)
            .cuboid(-1.0F, -6.5131F, -2.7176F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 120)
            .cuboid(-2.0F, -11.5131F, -4.2176F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(78, 69)
            .cuboid(-3.0F, -8.5F, -1.2F, 6.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(68, 0)
            .cuboid(-4.0F, -11.5F, -1.0F, 8.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(78, 43)
            .cuboid(-3.0F, -12.5F, -1.2F, 6.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(120, 112)
            .cuboid(-1.5F, -12.5131F, -3.4176F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 9.1254F, 1.53F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r1 = body.addChild(
         "metric_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(120, 28).cuboid(-2.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.7376F, -9.5131F, -2.2925F, 0.0F, -0.9599F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r2 = body.addChild(
         "metric_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(122, 70)
            .cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(128, 3)
            .cuboid(-1.5F, 3.0F, -0.5F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.9508F, -11.5131F, -1.9021F, 0.0F, 0.9599F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r3 = body.addChild(
         "metric_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(116, 89)
            .cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(128, 0)
            .cuboid(-1.5F, 3.0F, -0.5F, 3.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.9508F, -11.5131F, -1.9021F, 0.0F, -0.9599F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r4 = body.addChild(
         "metric_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 18).cuboid(-4.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -2.4131F, -0.2176F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r5 = body.addChild(
         "metric_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(34, 7).cuboid(-4.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -2.4131F, -0.2176F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r6 = body.addChild(
         "metric_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(120, 32).cuboid(-2.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.7376F, -9.5131F, -2.2925F, 0.0F, 0.9599F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r7 = body.addChild(
         "metric_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(124, 129).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.164F, -5.5131F, -1.6117F, 0.0F, 0.9599F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r8 = body.addChild(
         "metric_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(100, 129).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.164F, -5.5131F, -1.6117F, 0.0F, -0.9599F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r9 = body.addChild(
         "metric_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(98, 51).cuboid(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.2633F, -2.5906F, -0.2308F, 0.4853F, -0.2655F, -0.3633F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r10 = body.addChild(
         "metric_r10",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(98, 43).cuboid(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.2633F, -2.5906F, -0.2308F, 0.4853F, 0.2655F, 0.3633F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r11 = body.addChild(
         "metric_r11",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(14, 94).cuboid(-1.0F, -3.0F, -2.0F, 2.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -2.4131F, -0.2176F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition Corpus1 = body.addChild(
         "Corpus1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(30, 20)
            .cuboid(-6.4932F, -15.1638F, -0.4706F, 13.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(34, 0)
            .cuboid(-6.4932F, -7.1659F, -6.8449F, 13.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(50, 62)
            .cuboid(-2.4932F, -2.7159F, -4.7699F, 5.0F, 1.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(92, 83)
            .cuboid(-2.4932F, -1.8769F, -3.9882F, 5.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(64, 30)
            .cuboid(-3.9932F, -1.8638F, 0.0294F, 8.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(72, 48)
            .cuboid(-1.4932F, -12.3898F, 3.8886F, 3.0F, 10.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(122, 53)
            .cuboid(-5.9932F, -8.3898F, 5.2886F, 5.0F, 4.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(122, 62)
            .cuboid(1.0068F, -8.3898F, 5.2886F, 5.0F, 4.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.0068F, -11.6362F, -0.8294F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r12 = Corpus1.addChild(
         "metric_r12",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(74, 123)
            .cuboid(-4.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(120, 58)
            .cuboid(19.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-8.9932F, -8.9769F, 0.6118F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r13 = Corpus1.addChild(
         "metric_r13",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(122, 66)
            .cuboid(-4.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(120, 108)
            .cuboid(19.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-8.9932F, -8.9769F, 0.6118F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r14 = Corpus1.addChild(
         "metric_r14",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 22).cuboid(-3.0F, -2.5F, 0.0F, 6.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0068F, -2.1828F, 4.0219F, -0.6981F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r15 = Corpus1.addChild(
         "metric_r15",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(54, 36).cuboid(-2.0F, -1.5F, -4.0F, 4.0F, 4.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(5.9562F, -1.1172F, -0.2622F, 0.0F, 0.0F, 1.0036F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r16 = Corpus1.addChild(
         "metric_r16",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 52).cuboid(-2.0F, -1.5F, -4.0F, 4.0F, 4.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-5.9426F, -1.1172F, -0.2622F, 0.0F, 0.0F, -1.0036F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r17 = Corpus1.addChild(
         "metric_r17",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 106).cuboid(-6.0761F, 1.0743F, -6.5468F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(7.1568F, -7.9909F, 0.3096F, 0.0F, 0.0F, -0.637F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r18 = Corpus1.addChild(
         "metric_r18",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 7).cuboid(6.8833F, -0.2151F, -3.1346F, 4.0F, 3.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.6932F, -6.9741F, -1.1276F, 0.0F, 0.0F, 0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r19 = Corpus1.addChild(
         "metric_r19",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 109)
            .cuboid(-1.75F, 1.0011F, -6.5718F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(88, 7)
            .cuboid(-1.75F, -6.0729F, -0.5802F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(108, 108)
            .cuboid(-0.75F, -0.256F, 4.0718F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(7.1568F, -7.9909F, 0.3096F, 0.0F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r20 = Corpus1.addChild(
         "metric_r20",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 25).cuboid(-4.0064F, -0.0048F, -5.5F, 4.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(10.2253F, -5.8995F, -0.1622F, 0.0F, 0.0F, 0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r21 = Corpus1.addChild(
         "metric_r21",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 128).cuboid(-0.0131F, -1.0001F, 0.0F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(8.2086F, -8.7494F, -4.7601F, -0.3054F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r22 = Corpus1.addChild(
         "metric_r22",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 76).cuboid(-1.0131F, -1.0E-4F, 0.0F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(9.2076F, -11.8973F, -3.6622F, -0.3491F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r23 = Corpus1.addChild(
         "metric_r23",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(98, 29).cuboid(-1.75F, -2.5602F, -5.6885F, 4.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(7.1568F, -7.9909F, 0.3096F, -0.3927F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r24 = Corpus1.addChild(
         "metric_r24",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(48, 49).cuboid(-2.0084F, -3.0065F, -4.5F, 2.0F, 3.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(10.2291F, -5.8997F, -0.1622F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r25 = Corpus1.addChild(
         "metric_r25",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 71).cuboid(-2.0084F, -3.0065F, -3.5F, 2.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(10.2291F, -8.8997F, -0.1622F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r26 = Corpus1.addChild(
         "metric_r26",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 109)
            .cuboid(-1.75F, -1.7879F, -5.8327F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(78, 36)
            .cuboid(-3.75F, -6.6315F, -1.5303F, 6.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(7.1568F, -7.9909F, 0.3096F, -1.1781F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r27 = Corpus1.addChild(
         "metric_r27",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(98, 68)
            .cuboid(-1.75F, -6.7123F, -1.876F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(102, 94)
            .cuboid(-0.75F, -3.0603F, 3.9408F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(7.1568F, -7.9909F, 0.3096F, -0.7854F, 0.0F, 0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r28 = Corpus1.addChild(
         "metric_r28",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 75)
            .mirrored()
            .cuboid(-4.0F, -8.0F, -4.0F, 4.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.of(-1.4932F, -2.3898F, 7.8886F, 0.0875F, -0.6935F, -0.9654F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r29 = Corpus1.addChild(
         "metric_r29",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 75).cuboid(0.0F, -8.0F, -4.0F, 4.0F, 8.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.5068F, -2.3898F, 7.8886F, 0.0875F, 0.6935F, 0.9654F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r30 = Corpus1.addChild(
         "metric_r30",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 72).cuboid(-0.9869F, -1.0E-4F, 0.0F, 2.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-9.194F, -11.8973F, -3.6622F, -0.3491F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r31 = Corpus1.addChild(
         "metric_r31",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(128, 6).cuboid(-1.9869F, -1.0001F, 0.0F, 2.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-8.195F, -8.7494F, -4.7601F, -0.3054F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r32 = Corpus1.addChild(
         "metric_r32",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(64, 18).cuboid(0.0084F, -3.0065F, -3.5F, 2.0F, 3.0F, 9.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-10.2155F, -8.8997F, -0.1622F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r33 = Corpus1.addChild(
         "metric_r33",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 49).cuboid(0.0084F, -3.0065F, -4.5F, 2.0F, 3.0F, 10.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-10.2155F, -5.8997F, -0.1622F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r34 = Corpus1.addChild(
         "metric_r34",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 11).cuboid(0.0064F, -0.0048F, -5.5F, 4.0F, 3.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-10.2117F, -5.8995F, -0.1622F, 0.0F, 0.0F, -0.2618F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r35 = Corpus1.addChild(
         "metric_r35",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 101)
            .cuboid(-2.25F, -3.0603F, 3.9408F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(92, 0)
            .cuboid(-2.25F, -6.7123F, -1.876F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-7.1432F, -7.9909F, 0.3096F, -0.7854F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r36 = Corpus1.addChild(
         "metric_r36",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(108, 59)
            .cuboid(-2.25F, -0.256F, 4.0718F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(26, 107)
            .cuboid(-2.25F, 1.0011F, -6.5718F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 87)
            .cuboid(-2.25F, -6.0729F, -0.5802F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-7.1432F, -7.9909F, 0.3096F, 0.0F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r37 = Corpus1.addChild(
         "metric_r37",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(80, 97)
            .cuboid(0.0F, -5.5F, -1.0F, 0.0F, 11.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(62, 106)
            .cuboid(-0.5F, -4.5F, -1.0F, 1.0F, 10.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0068F, -9.0898F, 7.5886F, -0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r38 = Corpus1.addChild(
         "metric_r38",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 64).cuboid(-10.8833F, -0.2151F, -3.1346F, 4.0F, 3.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7068F, -6.9741F, -1.1276F, 0.0F, 0.0F, -0.3927F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r39 = Corpus1.addChild(
         "metric_r39",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(106, 0).cuboid(2.0761F, 1.0743F, -6.5468F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-7.1432F, -7.9909F, 0.3096F, 0.0F, 0.0F, 0.637F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r40 = Corpus1.addChild(
         "metric_r40",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(118, 19).cuboid(-4.0907F, 5.0972F, -3.6886F, 5.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0068F, -6.9741F, -1.1276F, 0.0F, 0.9599F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r41 = Corpus1.addChild(
         "metric_r41",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 86).cuboid(-0.9093F, 5.0972F, -3.6886F, 5.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0068F, -6.9741F, -1.1276F, 0.0F, -0.9599F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r42 = Corpus1.addChild(
         "metric_r42",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(88, 129)
            .cuboid(2.853F, -7.0465F, -5.4424F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(128, 116)
            .cuboid(3.6145F, -6.285F, -5.4293F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(128, 50)
            .cuboid(3.2225F, -6.6769F, -5.6589F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0068F, -6.9741F, -1.1276F, -0.2849F, 0.274F, 0.7459F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r43 = Corpus1.addChild(
         "metric_r43",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(88, 13).cuboid(-3.0F, 2.0E-4F, -5.6617F, 5.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5068F, -6.9741F, -1.1276F, 0.48F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r44 = Corpus1.addChild(
         "metric_r44",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 39)
            .cuboid(-4.0968F, 3.3828F, -3.7435F, 4.0F, 5.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(112, 36)
            .cuboid(-1.5024F, 2.7794F, -5.9379F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.6932F, -6.9741F, -1.1276F, 0.1106F, -0.0702F, -1.0075F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r45 = Corpus1.addChild(
         "metric_r45",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(30, 36)
            .cuboid(0.0968F, 3.3828F, -3.7435F, 4.0F, 5.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(88, 29)
            .cuboid(-1.4975F, 2.7794F, -5.9379F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7068F, -6.9741F, -1.1276F, 0.1106F, 0.0702F, 1.0075F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r46 = Corpus1.addChild(
         "metric_r46",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(68, 97).cuboid(-2.25F, -2.5602F, -5.6885F, 4.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-7.1432F, -7.9909F, 0.3096F, -0.3927F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r47 = Corpus1.addChild(
         "metric_r47",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(106, 74)
            .cuboid(-2.25F, -1.7879F, -5.8327F, 4.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(76, 62)
            .cuboid(-2.25F, -6.6315F, -1.5303F, 6.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-7.1432F, -7.9909F, 0.3096F, -1.1781F, 0.0F, -0.1745F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r48 = Corpus1.addChild(
         "metric_r48",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(24, 62)
            .cuboid(-4.0F, -8.9674F, -2.0886F, 9.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(30, 28)
            .cuboid(-6.0F, -3.7411F, -7.3149F, 13.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.4932F, -6.9741F, -1.1276F, -1.1781F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r49 = Corpus1.addChild(
         "metric_r49",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(30, 11).cuboid(-6.0F, -9.084F, -2.498F, 13.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.4932F, -6.9741F, -1.1276F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r50 = Corpus1.addChild(
         "metric_r50",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-7.0F, -4.9893F, -5.3555F, 13.0F, 7.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5068F, -6.9741F, -1.1276F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition head = Corpus1.addChild(
         "head",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(106, 18)
            .cuboid(-1.5F, -1.8084F, -0.8718F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(30, 83)
            .cuboid(-1.5F, -3.8084F, 2.1282F, 3.0F, 3.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(78, 112)
            .cuboid(-1.55F, -1.8084F, 0.1282F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(60, 124)
            .cuboid(1.55F, -1.8084F, 0.1282F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0068F, -5.9942F, -5.647F, 1.1781F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = head.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(42, 128)
            .cuboid(0.0F, -6.5735F, -5.9054F, 0.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(30, 128)
            .cuboid(1.525F, -6.5735F, -5.9054F, 0.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(114, 98)
            .cuboid(-1.5F, -6.5735F, -5.9054F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 3.8003F, 2.6347F, -1.2654F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = head.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(28, 42)
            .cuboid(1.525F, -7.4089F, 0.8049F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 39)
            .cuboid(-1.525F, -7.4089F, 0.8049F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(110, 53)
            .cuboid(-1.5F, -7.4089F, -1.1951F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 3.8003F, 2.6347F, 0.3054F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = head.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(74, 127)
            .cuboid(-1.1F, -6.4225F, -0.1732F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(86, 97)
            .cuboid(-1.525F, -7.2198F, 0.048F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(26, 94)
            .cuboid(1.525F, -7.2198F, 0.048F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(54, 7)
            .cuboid(-1.5F, -7.2198F, 0.048F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 3.8003F, 2.6347F, 0.7418F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_arm = Corpus1.addChild("right_arm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-11.4535F, -9.919F, 0.6483F));
      net.minecraft.client.model.geom.builders.PartDefinition metric_r51 = right_arm.addChild(
         "metric_r51",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 126).cuboid(-0.035F, -1.0129F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.6004F, 9.6814F, -0.0346F, 0.0F, 0.0F, -0.6894F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r52 = right_arm.addChild(
         "metric_r52",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(46, 89).cuboid(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2617F, 10.6956F, -0.0346F, -0.7854F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r53 = right_arm.addChild(
         "metric_r53",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(106, 130)
            .cuboid(-0.035F, -1.0129F, -1.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(108, 65)
            .cuboid(-0.035F, -1.0129F, -5.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.9661F, 6.7037F, 2.9653F, 0.0F, 0.0F, -0.6894F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r54 = right_arm.addChild(
         "metric_r54",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(68, 105).cuboid(-0.0262F, -1.9818F, -2.5F, 1.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-3.3377F, -0.0188F, -0.0346F, 0.0F, 0.0F, 0.3578F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r55 = right_arm.addChild(
         "metric_r55",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(78, 75).cuboid(-1.5F, -3.0F, -2.5F, 2.0F, 6.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5141F, 2.7839F, -0.0346F, 0.0F, 0.0F, -0.1222F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r56 = right_arm.addChild(
         "metric_r56",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 22).cuboid(-1.4825F, -1.0E-4F, -2.0F, 3.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.3316F, 6.9453F, 3.7616F, -0.6109F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r57 = right_arm.addChild(
         "metric_r57",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(46, 71).cuboid(-0.9916F, -12.0065F, -1.5F, 3.0F, 13.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7538F, 9.9476F, -1.0347F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r58 = right_arm.addChild(
         "metric_r58",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(90, 94).cuboid(-1.4651F, -2.0E-4F, 0.0F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2792F, 4.9455F, -3.8346F, 0.3927F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r59 = right_arm.addChild(
         "metric_r59",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(84, 123).cuboid(-0.035F, -1.0129F, -1.5F, 1.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.4792F, 6.9455F, -0.0346F, 0.0F, 0.0F, -0.1222F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r60 = right_arm.addChild(
         "metric_r60",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(86, 48)
            .cuboid(-0.9916F, -3.0065F, -0.5F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(44, 97)
            .cuboid(-0.9916F, -3.0065F, -5.0963F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7789F, 1.9476F, 1.2616F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r61 = right_arm.addChild(
         "metric_r61",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 103).cuboid(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7459F, -0.8738F, 1.6484F, -0.6981F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r62 = right_arm.addChild(
         "metric_r62",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(102, 102).cuboid(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7459F, -0.8738F, -1.7214F, 0.6981F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r63 = right_arm.addChild(
         "metric_r63",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(102, 22).cuboid(-1.9916F, -3.0065F, -0.5F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.762F, 0.0193F, -1.0365F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_forearm = right_arm.addChild("right_forearm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-0.7903F, 10.7191F, -0.0346F));
      net.minecraft.client.model.geom.builders.PartDefinition metric_r64 = right_forearm.addChild(
         "metric_r64",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 109).cuboid(-0.9916F, -0.0065F, -0.5F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.6846F, -0.9967F, -1.5F, 0.0F, 0.0F, -0.4712F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r65 = right_forearm.addChild(
         "metric_r65",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 113).cuboid(-1.5F, -4.0F, -1.5F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.9998F, 5.2316F, 1.8646F, 0.0F, 0.6109F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r66 = right_forearm.addChild(
         "metric_r66",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(104, 91).cuboid(-1.5F, -1.5F, -1.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.0207F, 7.3311F, 2.3829F, 0.5558F, 0.268F, 1.1764F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r67 = right_forearm.addChild(
         "metric_r67",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 59).cuboid(-1.5F, -1.5F, 0.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.0207F, 7.3311F, -2.3867F, -0.5558F, -0.268F, 1.1764F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r68 = right_forearm.addChild(
         "metric_r68",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(68, 112).cuboid(-1.5F, -4.0F, -0.5F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.9998F, 5.2316F, -1.8684F, 0.0F, -0.6109F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r69 = right_forearm.addChild(
         "metric_r69",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(48, 128)
            .cuboid(-0.9916F, -1.0065F, -2.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(74, 119)
            .cuboid(-0.9916F, -1.0065F, -0.8963F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.7885F, 7.2286F, 1.1963F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r70 = right_forearm.addChild(
         "metric_r70",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(90, 86).cuboid(-0.9916F, -3.0065F, -0.5F, 4.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0885F, 4.2286F, -1.0F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r71 = right_forearm.addChild(
         "metric_r71",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(112, 65).cuboid(-1.5F, -4.0F, -1.5F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.6002F, 5.2316F, 1.8684F, 0.0F, 0.6109F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r72 = right_forearm.addChild(
         "metric_r72",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(98, 118).cuboid(-1.5F, -4.0F, -1.5F, 3.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5566F, 10.2314F, 1.2684F, 0.0F, 0.6109F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r73 = right_forearm.addChild(
         "metric_r73",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(50, 112).cuboid(-1.5F, -4.0F, -0.5F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.6002F, 5.2316F, -1.8684F, 0.0F, -0.6109F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r74 = right_forearm.addChild(
         "metric_r74",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(118, 72).cuboid(-1.5F, -4.0F, -0.5F, 3.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5566F, 10.2314F, -1.2684F, 0.0F, -0.6109F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r75 = right_forearm.addChild(
         "metric_r75",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 102).cuboid(-0.9916F, -3.0065F, -0.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5322F, 9.2284F, -1.0F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r76 = right_forearm.addChild(
         "metric_r76",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(60, 89).cuboid(-0.9916F, -3.0065F, -0.5F, 4.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.4885F, 4.2286F, -1.0F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_palm = right_forearm.addChild("right_palm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(-0.0322F, 9.2284F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition metric_r77 = right_palm.addChild(
         "metric_r77",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(118, 48).cuboid(-0.9916F, -2.0065F, -0.5F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7446F, 0.666F, -1.0F, 0.0F, 0.0F, 0.7505F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r78 = right_palm.addChild(
         "metric_r78",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 80).cuboid(-0.9916F, -3.0065F, -0.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 3.0F, -1.0F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition fingers3 = right_palm.addChild(
         "fingers3", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(-1.4741F, 2.9892F, 0.0F, 0.0F, 0.0F, -0.829F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r79 = fingers3.addChild(
         "metric_r79",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(8, 125).cuboid(-0.9916F, -3.0065F, -0.5F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.9741F, 3.0108F, -1.0F, 0.0F, 0.0F, 0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition fingers4 = fingers3.addChild("fingers4", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 2.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition metric_r80 = fingers4.addChild(
         "metric_r80",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(124, 89).cuboid(0.0087F, -0.0044F, -1.5F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.3003F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition lefy_b_f2 = fingers3.addChild(
         "lefy_b_f2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(4.3777F, -0.0518F, -0.7F, 0.0F, 0.0F, 1.1345F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r81 = lefy_b_f2.addChild(
         "metric_r81",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(112, 72).cuboid(-0.9916F, -2.0065F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.6481F, 2.1286F, 0.0F, 0.0F, 0.0F, 0.7505F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_b_f2 = lefy_b_f2.addChild(
         "right_b_f2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(1.4646F, 1.3676F, 0.0F, 0.0F, 0.0F, 0.8727F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r82 = right_b_f2.addChild(
         "metric_r82",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 101).cuboid(-0.9916F, -2.0065F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.65F, 2.125F, 0.0F, 0.0F, 0.0F, 0.7505F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_arm = Corpus1.addChild("left_arm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(11.4671F, -9.919F, 0.6483F));
      net.minecraft.client.model.geom.builders.PartDefinition metric_r83 = left_arm.addChild(
         "metric_r83",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 22).cuboid(-0.965F, -1.0129F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.6004F, 9.6814F, -0.0346F, 0.0F, 0.0F, 0.6894F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r84 = left_arm.addChild(
         "metric_r84",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(30, 91).cuboid(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.2617F, 10.6956F, -0.0346F, -0.7854F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r85 = left_arm.addChild(
         "metric_r85",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(110, 130)
            .cuboid(-0.965F, -1.0129F, -1.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(130, 108)
            .cuboid(-0.965F, -1.0129F, -5.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.9661F, 6.7037F, 2.9653F, 0.0F, 0.0F, 0.6894F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r86 = left_arm.addChild(
         "metric_r86",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(38, 106).cuboid(-0.9738F, -1.9818F, -2.5F, 1.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(3.3377F, -0.0188F, -0.0346F, 0.0F, 0.0F, -0.3578F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r87 = left_arm.addChild(
         "metric_r87",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 83).cuboid(-0.5F, -3.0F, -2.5F, 2.0F, 6.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.5141F, 2.7839F, -0.0346F, 0.0F, 0.0F, 0.1222F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r88 = left_arm.addChild(
         "metric_r88",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(78, 117).cuboid(-1.5175F, -1.0E-4F, -2.0F, 3.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.3316F, 6.9453F, 3.7616F, -0.6109F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r89 = left_arm.addChild(
         "metric_r89",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(62, 71).cuboid(-2.0084F, -12.0065F, -1.5F, 3.0F, 13.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7538F, 9.9476F, -1.0347F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r90 = left_arm.addChild(
         "metric_r90",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(96, 59).cuboid(-1.5349F, -2.0E-4F, 0.0F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.2792F, 4.9455F, -3.8346F, 0.3927F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r91 = left_arm.addChild(
         "metric_r91",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(92, 123).cuboid(-0.965F, -1.0129F, -1.5F, 1.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.4792F, 6.9455F, -0.0346F, 0.0F, 0.0F, 0.1222F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r92 = left_arm.addChild(
         "metric_r92",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(78, 86)
            .cuboid(-2.0084F, -3.0065F, -0.5F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(56, 97)
            .cuboid(-2.0084F, -3.0065F, -5.0963F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7789F, 1.9476F, 1.2616F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r93 = left_arm.addChild(
         "metric_r93",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(104, 12).cuboid(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7459F, -0.8738F, 1.6484F, -0.6981F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r94 = left_arm.addChild(
         "metric_r94",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(104, 6).cuboid(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7459F, -0.8738F, -1.7214F, 0.6981F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r95 = left_arm.addChild(
         "metric_r95",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(86, 103).cuboid(-2.0084F, -3.0065F, -0.5F, 4.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.762F, 0.0193F, -1.0365F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_forearm = left_arm.addChild("left_forearm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.7903F, 10.7191F, -0.0346F));
      net.minecraft.client.model.geom.builders.PartDefinition metric_r96 = left_forearm.addChild(
         "metric_r96",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(110, 28).cuboid(-0.0084F, -0.0065F, -0.5F, 1.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.6846F, -0.9967F, -1.5F, 0.0F, 0.0F, 0.4712F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r97 = left_forearm.addChild(
         "metric_r97",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 115).cuboid(-1.5F, -4.0F, -1.5F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.9998F, 5.2316F, 1.8646F, 0.0F, -0.6109F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r98 = left_forearm.addChild(
         "metric_r98",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(118, 77).cuboid(-2.5F, -1.5F, -1.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.0207F, 7.3311F, 2.3829F, 0.5558F, -0.268F, -1.1764F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r99 = left_forearm.addChild(
         "metric_r99",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(106, 80).cuboid(-2.5F, -1.5F, 0.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.0207F, 7.3311F, -2.3867F, -0.5558F, 0.268F, -1.1764F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r100 = left_forearm.addChild(
         "metric_r100",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(108, 114).cuboid(-1.5F, -4.0F, -0.5F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.9998F, 5.2316F, -1.8684F, 0.0F, 0.6109F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r101 = left_forearm.addChild(
         "metric_r101",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(130, 33)
            .cuboid(-0.0084F, -1.0065F, -2.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 130)
            .cuboid(-0.0084F, -1.0065F, -0.8963F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.7885F, 7.2286F, 1.1963F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r102 = left_forearm.addChild(
         "metric_r102",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 93).cuboid(-3.0084F, -3.0065F, -0.5F, 4.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0885F, 4.2286F, -1.0F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r103 = left_forearm.addChild(
         "metric_r103",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(114, 91).cuboid(-1.5F, -4.0F, -1.5F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.6002F, 5.2316F, 1.8684F, 0.0F, -0.6109F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r104 = left_forearm.addChild(
         "metric_r104",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(54, 119).cuboid(-1.5F, -4.0F, -1.5F, 3.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5566F, 10.2314F, 1.2684F, 0.0F, -0.6109F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r105 = left_forearm.addChild(
         "metric_r105",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(34, 113).cuboid(-1.5F, -4.0F, -0.5F, 3.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.6002F, 5.2316F, -1.8684F, 0.0F, 0.6109F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r106 = left_forearm.addChild(
         "metric_r106",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 119).cuboid(-1.5F, -4.0F, -0.5F, 3.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5566F, 10.2314F, -1.2684F, 0.0F, 0.6109F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r107 = left_forearm.addChild(
         "metric_r107",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(118, 0).cuboid(-1.0084F, -3.0065F, -0.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5322F, 9.2284F, -1.0F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r108 = left_forearm.addChild(
         "metric_r108",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(92, 75).cuboid(-3.0084F, -3.0065F, -0.5F, 4.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.4885F, 4.2286F, -1.0F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_palm = left_forearm.addChild("left_palm", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0322F, 9.2284F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition metric_r109 = left_palm.addChild(
         "metric_r109",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(118, 114).cuboid(-1.0084F, -2.0065F, -0.5F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.7446F, 0.666F, -1.0F, 0.0F, 0.0F, -0.7505F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r110 = left_palm.addChild(
         "metric_r110",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(88, 117).cuboid(-1.0084F, -3.0065F, -0.5F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 3.0F, -1.0F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition fingers2 = left_palm.addChild("fingers2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(1.4741F, 2.9892F, 0.0F, 0.0F, 0.0F, 0.829F));
      net.minecraft.client.model.geom.builders.PartDefinition metric_r111 = fingers2.addChild(
         "metric_r111",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(116, 125).cuboid(-0.0084F, -3.0065F, -0.5F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.9741F, 3.0108F, -1.0F, 0.0F, 0.0F, -0.0087F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition fingers5 = fingers2.addChild("fingers5", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 2.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition metric_r112 = fingers5.addChild(
         "metric_r112",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(108, 125).cuboid(-1.0087F, -0.0044F, -1.5F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3003F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition lefy_b_f3 = fingers2.addChild(
         "lefy_b_f3", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(-4.3777F, -0.0518F, -0.7F, 0.0F, 0.0F, -1.1345F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r113 = lefy_b_f3.addChild(
         "metric_r113",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(130, 31).cuboid(-1.0084F, -2.0065F, -0.5F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.6481F, 2.1286F, 0.0F, 0.0F, 0.0F, -0.7505F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_b_f2 = lefy_b_f3.addChild(
         "left_b_f2", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.of(-1.4646F, 1.3676F, 0.0F, 0.0F, 0.0F, -0.8727F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r114 = left_b_f2.addChild(
         "metric_r114",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 126).cuboid(-0.0084F, -2.0065F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.65F, 2.125F, 0.0F, 0.0F, 0.0F, -0.7505F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg = body.addChild(
         "left_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(100, 108)
            .cuboid(-0.5F, -0.3684F, -2.0891F, 2.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 39)
            .cuboid(-0.525F, -0.3684F, -2.0891F, 0.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(74, 89)
            .cuboid(-0.525F, -0.3684F, -0.0891F, 0.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 122)
            .cuboid(-0.5F, 0.6316F, -0.0891F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 75)
            .cuboid(1.0F, 0.2316F, -1.5891F, 1.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(14, 130)
            .cuboid(1.0F, 4.9066F, -1.9641F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(2.875F, -2.4131F, -0.2176F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r115 = left_leg.addChild(
         "metric_r115",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(8, 130).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, 5.9066F, -0.9641F, 0.0F, 0.0F, 0.5236F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r116 = left_leg.addChild(
         "metric_r116",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(124, 125).cuboid(-1.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(2.0F, 0.2316F, -0.0891F, 0.0F, 0.0F, -0.5716F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r117 = left_leg.addChild(
         "metric_r117",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(52, 130)
            .cuboid(1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(128, 42)
            .cuboid(-0.025F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.025F, 4.5316F, -0.5891F, -0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r118 = left_leg.addChild(
         "metric_r118",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(118, 119).cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 0.8684F, 2.5891F, -0.2138F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r119 = left_leg.addChild(
         "metric_r119",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(122, 36).cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 4.6316F, 1.9109F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r120 = left_leg.addChild(
         "metric_r120",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(130, 37)
            .cuboid(1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 130)
            .cuboid(-1.075F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(124, 94)
            .cuboid(-1.025F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.525F, 7.8816F, -1.0891F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r121 = left_leg.addChild(
         "metric_r121",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(26, 99).cuboid(-1.0F, -1.5F, -2.5F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 0.5F, 0.5F, -0.9599F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_leg2 = left_leg.addChild(
         "left_leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(10, 115)
            .cuboid(-1.0F, 0.25F, -1.0F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(38, 99)
            .cuboid(-0.5F, 3.25F, -1.0F, 1.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.5F, 7.8816F, -1.0891F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r122 = left_leg2.addChild(
         "metric_r122",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 12).cuboid(-1.0F, -4.0F, -1.5F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 7.2F, 0.7F, 0.0F, 0.0F, 0.1222F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r123 = left_leg2.addChild(
         "metric_r123",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(44, 113).cuboid(0.0F, -4.0F, -1.5F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 7.2F, 0.675F, 0.0F, 0.0F, -0.1222F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r124 = left_leg2.addChild(
         "metric_r124",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 115).cuboid(-1.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 4.5695F, 1.1288F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r125 = left_leg2.addChild(
         "metric_r125",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(130, 29).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.25F, 2.0F, 1.0472F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition left_foot = left_leg2.addChild(
         "left_foot",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(118, 43)
            .cuboid(-1.0F, 0.0F, -1.6F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(10, 121)
            .cuboid(-1.0F, 1.0F, -4.6F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(128, 84)
            .cuboid(1.025F, 1.0F, -4.6F, 0.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(128, 112)
            .cuboid(-1.025F, 1.0F, -4.6F, 0.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.25F, 0.6F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r126 = left_foot.addChild(
         "metric_r126",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(108, 121).cuboid(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.9829F, -2.8385F, 0.3491F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg = body.addChild(
         "right_leg",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(110, 43)
            .cuboid(-1.5F, -0.3684F, -2.0891F, 2.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(38, 120)
            .cuboid(0.525F, -0.3684F, -2.0891F, 0.0F, 8.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(96, 109)
            .cuboid(0.525F, -0.3684F, -0.0891F, 0.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(100, 123)
            .cuboid(-1.5F, 0.6316F, -0.0891F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(118, 12)
            .cuboid(-2.0F, 0.2316F, -1.5891F, 1.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(130, 26)
            .cuboid(-2.0F, 4.9066F, -1.9641F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-2.875F, -2.4131F, -0.2176F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r127 = right_leg.addChild(
         "metric_r127",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(130, 18).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, 5.9066F, -0.9641F, 0.0F, 0.0F, -0.5236F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r128 = right_leg.addChild(
         "metric_r128",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 104).cuboid(0.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.0F, 0.2316F, -0.0891F, 0.0F, 0.0F, 0.5716F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r129 = right_leg.addChild(
         "metric_r129",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(78, 130)
            .cuboid(-1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(128, 46)
            .cuboid(-0.975F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-1.025F, 4.5316F, -0.5891F, -0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r130 = right_leg.addChild(
         "metric_r130",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 120).cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 0.8684F, 2.5891F, -0.2138F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r131 = right_leg.addChild(
         "metric_r131",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(52, 124).cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 4.6316F, 1.9109F, -0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r132 = right_leg.addChild(
         "metric_r132",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(130, 57)
            .cuboid(-1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(56, 130)
            .cuboid(1.075F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(126, 80)
            .cuboid(-0.975F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.525F, 7.8816F, -1.0891F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r133 = right_leg.addChild(
         "metric_r133",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(104, 83).cuboid(-1.0F, -1.5F, -2.5F, 2.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 0.5F, 0.5F, -0.9599F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_leg2 = right_leg.addChild(
         "right_leg2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(118, 6)
            .cuboid(-1.0F, 0.25F, -1.0F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(68, 124)
            .cuboid(-0.5F, 3.25F, -1.0F, 1.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.5F, 7.8816F, -1.0891F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r134 = right_leg2.addChild(
         "metric_r134",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 119).cuboid(0.0F, -4.0F, -1.5F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 7.2F, 0.7F, 0.0F, 0.0F, -0.1222F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r135 = right_leg2.addChild(
         "metric_r135",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(126, 98).cuboid(-1.0F, -4.0F, -1.5F, 1.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 7.2F, 0.675F, 0.0F, 0.0F, 0.1222F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r136 = right_leg2.addChild(
         "metric_r136",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(74, 130).cuboid(0.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, 4.5695F, 1.1288F, -0.2618F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r137 = right_leg2.addChild(
         "metric_r137",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(130, 70).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.25F, 2.0F, 1.0472F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition right_foot = right_leg2.addChild(
         "right_foot",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(64, 119)
            .cuboid(-1.0F, 0.0F, -1.6F, 2.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 124)
            .cuboid(-1.0F, 1.0F, -4.6F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(60, 129)
            .cuboid(-1.025F, 1.0F, -4.6F, 0.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(82, 129)
            .cuboid(1.025F, 1.0F, -4.6F, 0.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.25F, 0.6F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition metric_r138 = right_foot.addChild(
         "metric_r138",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(42, 124).cuboid(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.9829F, -2.8385F, 0.3491F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 256, 256);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.getPart().traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      float partialTick = ageInTicks % 1.0F;
      if (this.handSwingProgress > 0.0F) {
         this.animateMovement(B2Animation.FIRE, this.handSwingProgress, 1.0F, B2Animation.FIRE.comp_597() * 20.0F, 1.0F);
      }

      entity.swgc$getJumpAnimState().run(state -> this.updateAnimation(state, B2Animation.JUMP, ageInTicks));
      float run = entity.getRunAmount(partialTick);
      if (run < 1.0F) {
         this.animateMovement(B2Animation.WALK, limbSwing, 1.5F * limbSwingAmount, 2.0F, 1.0F - run);
      }

      if (run > 0.0F) {
         this.animateMovement(B2Animation.RUN, limbSwing, limbSwingAmount, 1.0F, run);
      }

      this.animateMovement(B2Animation.IDLE, ageInTicks, 1.0F - limbSwingAmount * (1.5F - 0.5F * run), 1.0F, 1.0F);
      this.head.resetTransform();
      this.head.yRot += netHeadYaw * (float) Math.PI / 180.0F;
      this.head.xRot += headPitch * (float) Math.PI / 180.0F;
   }
}
