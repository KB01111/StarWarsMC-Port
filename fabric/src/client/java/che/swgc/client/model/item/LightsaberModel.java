package che.swgc.client.model.item;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import com.mojang.blaze3d.vertex.PoseStack;
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
import net.minecraft.client.player.AbstractLocalPlayer;
import net.minecraft.world.item.ItemDisplayContext;

@javax.annotation.ParametersAreNonnullByDefault
public class LightsaberModel extends che.swgc.client.compat.model.SinglePartEntityModel<net.minecraft.client.player.AbstractLocalPlayer> {
   public static final net.minecraft.client.model.geom.ModelLayerLocation DARK_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "dark"), "lightsaber");
   protected final net.minecraft.client.model.geom.ModelPart root;
   protected net.minecraft.client.model.geom.ModelPart blade;
   public net.minecraft.world.item.ItemStack stack;
   public float activation;
   public net.minecraft.world.item.ItemDisplayContext ctx;

   public LightsaberModel(net.minecraft.client.model.geom.ModelPart root, Function<net.minecraft.resources.Identifier, net.minecraft.client.renderer.rendertype.RenderType> renderType) {
      super(renderType);
      this.root = root;
      if (root.hasChild("blade")) {
         this.blade = root.getChild("blade");
      }
   }

   public LightsaberModel(net.minecraft.client.model.geom.ModelPart root) {
      this(root, net.minecraft.client.renderer.rendertype.RenderType::getEntityCutoutNoCull);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public void setupAnim(@Nullable net.minecraft.client.player.AbstractLocalPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void translateToBlade(com.mojang.blaze3d.vertex.PoseStack poseStack) {
      this.blade.rotate(poseStack);
   }

   public static void regLayers(BiConsumer<net.minecraft.client.model.geom.ModelLayerLocation, Supplier<net.minecraft.client.model.geom.builders.LayerDefinition>> biConsumer) {
      BiConsumer register = (id, definition) -> biConsumer.accept(new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", id), "lightsaber"), definition);
      register.accept("yoda", LightsaberModel::createYodaLayer);
      register.accept("quigon", LightsaberModel::createQuiGonLayer);
      register.accept("kenobi", LightsaberModel::createKenobiLayer);
      register.accept("anakin", LightsaberModel::createAnakinLayer);
      register.accept("windu", LightsaberModel::createWinduLayer);
      register.accept("revan", LightsaberModel::createRevanLayer);
      register.accept("padawan", LightsaberModel::createPadawanLayer);
      register.accept("padawan2", LightsaberModel::createPadawan2Layer);
      register.accept("dooku", LightsaberModel::createDookuLayer);
      register.accept("vader", LightsaberModel::createVaderLayer);
      register.accept("jarrus", LightsaberModel::createJarrusLayer);
      register.accept("mastiff", LightsaberModel::createMastiffLayer);
      register.accept("diorite", LightsaberModel::createDioriteLayer);
      register.accept("luke", LightsaberModel::createLukeLayer);
      register.accept("katana", LightsaberModel::createKatanaLayer);
      register.accept("punk", LightsaberModel::createPunkLayer);
      register.accept("kestis", LightsaberModel::createKestisLayer);
      register.accept("kestis2", LightsaberModel::createKestis2Layer);
      register.accept("liquid", LightsaberModel::createLiquidLayer);
      register.accept("sidious", LightsaberModel::createSidiousLayer);
      register.accept("ki_adi", LightsaberModel::createKiAdiLayer);
      register.accept("darth", LightsaberModel::createDarthLayer);
      register.accept("ezra", LightsaberModel::createEzraLayer);
      register.accept("rampant", LightsaberModel::createRampantLayer);
      register.accept("skebobe", LightsaberModel::createSkebobeLayer);
      register.accept("maulkiller", LightsaberModel::createMaulkillerLayer);
      register.accept("malgus", LightsaberModel::createMalgusLayer);
      register.accept("cassiopeia", LightsaberModel::createCassiopeiaLayer);
      register.accept("wookiee", LightsaberModel::createWookieeLayer);
      register.accept("brick", LightsaberModel::createBrickLayer);
      register.accept("crew", LightsaberModel::createCrewLayer);
      register.accept("general", LightsaberModel::createGeneralLayer);
      register.accept("shield", LightsaberModel::createShieldLayer);
      register.accept("warrior", LightsaberModel::createWarriorLayer);
      biConsumer.accept(DARK_LOCATION, LightsaberModel::createDarkLayer);
      biConsumer.accept(ObeewanSaberModel.LAYER_LOCATION, ObeewanSaberModel::createBodyLayer);
      biConsumer.accept(FrogSaberModel.LAYER_LOCATION, FrogSaberModel::createBodyLayer);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createYodaLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -13.0F, -2.0F, 3.0F, 14.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 7)
            .cuboid(-1.5F, -15.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 14)
            .mirrored()
            .cuboid(0.6F, -4.4F, -2.1F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirrored(false)
            .uv(12, 14)
            .cuboid(-1.6F, -4.4F, -2.1F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(12, 14)
            .mirrored()
            .cuboid(0.6F, -4.4F, 0.1F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirrored(false)
            .uv(12, 14)
            .cuboid(-1.6F, -4.4F, 0.1F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(12, 0)
            .cuboid(-1.5F, -9.75F, -2.0F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(16, 14)
            .cuboid(-0.5F, -9.0F, 0.8F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 11)
            .cuboid(-1.0F, -14.0F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 23.0F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 17).cuboid(-1.8F, -0.8359F, -0.6591F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.2F, -8.875F, -0.15F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 8.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createQuiGonLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -19.0F, -2.0F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-1.5F, -19.0F, -2.0F, 3.0F, 7.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 16)
            .cuboid(-1.5F, -12.75F, -2.0F, 3.0F, 10.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.09F))
            .uv(24, 0)
            .cuboid(-1.5F, -9.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 3)
            .cuboid(-1.5F, -8.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 3)
            .cuboid(-1.5F, -4.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 0)
            .cuboid(-1.5F, -5.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 0)
            .cuboid(-1.5F, -7.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 3)
            .cuboid(-1.5F, -6.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 3)
            .cuboid(-1.5F, -12.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 0)
            .cuboid(-1.5F, -11.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 3)
            .cuboid(-1.5F, -10.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(22, 20)
            .cuboid(-1.5F, -3.0F, -1.0F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(0, 21)
            .cuboid(-1.5F, -22.5F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(4, 25)
            .cuboid(-0.5F, -5.5F, -2.7F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 6)
            .cuboid(-1.0F, -21.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 10)
            .cuboid(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(22, 16)
            .cuboid(-1.5F, -20.5F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(22, 24)
            .cuboid(-1.0F, -19.75F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 23.0F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 25).cuboid(1.091F, -2.091F, 1.05F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -11.0F, -0.5F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.5F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createKenobiLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -9.0F, -2.0F, 3.0F, 15.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 5)
            .cuboid(-1.5F, -1.0F, -2.0F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(0, 22)
            .cuboid(-1.0F, 6.0F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 12)
            .cuboid(-1.5F, 6.5F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 22)
            .cuboid(-0.5F, -1.0F, -2.75F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(0, 18)
            .cuboid(-1.5F, -11.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-2.0F, -15.0F, -2.5F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 17)
            .cuboid(-1.5F, -14.0F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 5)
            .cuboid(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 22)
            .cuboid(-1.0F, -10.0F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 15.5F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 0.5F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createAnakinLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, 3.0F, -1.5F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 12)
            .cuboid(-1.5F, -3.8F, -1.5F, 3.0F, 7.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .uv(12, 10)
            .cuboid(0.65F, 7.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 16)
            .cuboid(1.0F, 3.1F, -0.5F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 10)
            .cuboid(-0.5F, 7.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 10)
            .cuboid(-1.65F, 7.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 10)
            .cuboid(-1.65F, 7.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 10)
            .cuboid(-0.5F, 7.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 10)
            .cuboid(0.65F, 7.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 10)
            .cuboid(0.65F, 7.0F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 10)
            .cuboid(-1.65F, 7.0F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(16, 17)
            .cuboid(-0.5F, -3.8F, -2.2F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 17)
            .cuboid(0.5F, -3.8F, -2.2F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 13)
            .cuboid(-0.5F, -2.3F, -1.7F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 6)
            .cuboid(-1.5F, -4.4F, -1.5F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .uv(12, 8)
            .cuboid(-1.5F, -4.4F, 0.5F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 10).cuboid(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(1.5F, 5.3F, 0.0F, -0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 3).cuboid(-1.5F, -0.2F, -1.8F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.202F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -4.2F, 0.7F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 0).cuboid(-1.5F, -0.2F, -0.2F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.201F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -4.2F, -0.7F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = group.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 15).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -0.8F, 1.05F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 8.1F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createWinduLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 13)
            .cuboid(-1.0F, -3.7F, -1.0F, 2.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .uv(0, 0)
            .cuboid(-1.5F, 3.0F, -1.5F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 17)
            .cuboid(0.65F, 3.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(16, 17)
            .cuboid(-0.5F, 3.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(16, 17)
            .cuboid(-1.65F, 3.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(16, 17)
            .cuboid(-1.65F, 3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(16, 17)
            .cuboid(-1.65F, 3.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(16, 17)
            .cuboid(-0.5F, 3.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(16, 17)
            .cuboid(0.65F, 3.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(16, 17)
            .cuboid(0.65F, 3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 8)
            .cuboid(-1.0F, 8.0F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 19)
            .cuboid(-1.5F, -3.45F, 0.35F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(0, 20)
            .cuboid(-0.5F, 8.5F, 0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-1.5F, -4.4F, -1.4F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(0, 8)
            .cuboid(-1.5F, 1.1F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.09F))
            .uv(8, 13)
            .cuboid(-1.5F, -4.4F, -0.6F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(8, 16)
            .cuboid(-1.0F, -5.3F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 13)
            .cuboid(0.45F, -2.5F, 0.4F, 1.0F, 2.5F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .uv(18, 13)
            .cuboid(-0.5F, -2.5F, 0.4F, 1.0F, 2.5F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .uv(18, 13)
            .cuboid(-1.45F, -2.5F, 0.4F, 1.0F, 2.5F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 13.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.7F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createRevanLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -6.0F, -1.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 5)
            .cuboid(-2.0F, -2.75F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .uv(12, 5)
            .cuboid(-2.0F, 0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .uv(12, 5)
            .cuboid(-2.0F, 2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .uv(12, 0)
            .cuboid(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 12)
            .cuboid(-0.5F, 11.0F, 0.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(12, 12)
            .cuboid(0.75F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(12, 12)
            .cuboid(-0.5F, 11.0F, -1.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(12, 12)
            .cuboid(-1.75F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 10).cuboid(-1.0303F, -0.7197F, 0.8F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 1.0F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 5.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createPadawanLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone = partdefinition.addChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 0).cuboid(-9.5F, -18.5F, 6.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(8.0F, 24.5F, -8.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 0).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-8.0F, -11.0F, 9.25F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 10.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createPadawan2Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 11)
            .cuboid(-1.5F, -6.25F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 6)
            .cuboid(-1.5F, 10.0F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .uv(0, 0)
            .cuboid(-1.5F, 2.0F, -1.5F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 0)
            .cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(18, 18)
            .cuboid(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .uv(20, 23)
            .cuboid(-0.7F, -5.9F, 1.58F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 23)
            .cuboid(-0.7F, -5.9F, -1.58F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.002F))
            .uv(0, 19)
            .cuboid(-1.5F, -4.9F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(0, 19)
            .cuboid(-1.5F, -4.9F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(0, 25)
            .cuboid(-1.5F, -8.1F, -1.5F, 1.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(0, 11)
            .cuboid(-1.5F, -6.0F, -1.5F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(18, 20)
            .cuboid(-1.0F, -3.0F, 0.01F, 1.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(20, 20)
            .cuboid(-1.0F, -3.0F, 3.19F, 1.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.6F, -5.0F, -1.6F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 5.75F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDookuLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 19)
            .cuboid(-1.5F, 11.8037F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(12, 23)
            .cuboid(0.0F, 11.3537F, 1.0F, 0.0F, 8.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 25)
            .cuboid(0.0F, 0.0F, 3.8765F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-1.5F, 13.0537F, -1.5F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 3.9463F, 7.75F, -2.7053F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 9)
            .cuboid(-2.0F, -3.0F, -0.5F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 8)
            .cuboid(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(18, 25)
            .cuboid(0.0F, -2.0F, 2.5F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 7.0965F, -0.8474F, -0.4363F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 14)
            .cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 13)
            .cuboid(0.0F, -5.0F, 2.5F, 0.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 12.0537F, -1.5F, -0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 22)
            .cuboid(-1.0F, 4.5F, -0.5F, 2.0F, 3.5F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(17, 23)
            .cuboid(1.751F, 6.0F, 1.25F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(14, 23)
            .cuboid(-1.751F, 6.0F, 1.25F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 14)
            .cuboid(-1.5F, 5.5F, 0.25F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(12, 0)
            .cuboid(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 19.0537F, -1.5F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = group.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(22, 25).cuboid(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.002F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 1.5842F, 4.1998F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = group.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 19).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 5.8211F, -0.8455F, -0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = group.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(14, 25).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 5.2839F, -0.0021F, 0.5672F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = group.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(8, 22).cuboid(0.0F, -7.5F, 2.5F, 0.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 7.5965F, -0.8474F, -0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = group.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 25).cuboid(0.0F, -1.0F, -0.3F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.002F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.5F, 4.3765F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition toggle = group.addChild(
         "toggle",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 3).cuboid(-0.5F, 0.0F, -0.5624F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 19.3537F, 1.87F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = toggle.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 0).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 0.764F, 0.4376F, -1.1071F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.75F, 4.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createVaderLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -7.0F, -1.5F, 3.0F, 14.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(10, 17)
            .cuboid(-1.65F, -0.5F, -1.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(10, 17)
            .cuboid(-0.5F, -0.5F, -1.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(10, 17)
            .cuboid(0.65F, -0.5F, -1.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(10, 17)
            .cuboid(0.65F, -0.5F, -0.5F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(10, 17)
            .cuboid(0.65F, -0.5F, 0.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(10, 17)
            .cuboid(-0.5F, -0.5F, 0.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(10, 17)
            .cuboid(-1.65F, -0.5F, 0.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(10, 17)
            .cuboid(-1.65F, -0.5F, -0.5F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(14, 17)
            .cuboid(-0.5F, -4.0F, -2.0F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 9)
            .cuboid(-2.0F, -11.0F, 1.0F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-2.0F, -9.0F, -2.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 17.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(18, 17).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -4.5F, 1.25F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 17).cuboid(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -7.0F, 2.0F, 0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 14)
            .cuboid(-2.0F, 1.0F, 1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(12, 5)
            .cuboid(-2.0F, 0.0F, 0.3F, 4.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F, 0.0F, 0.3F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -9.0F, -2.0F, 0.589F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.4F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createJarrusLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -10.0F, -1.5F, 3.0F, 17.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-3.0F, -6.0F, -3.0F, 6.0F, 0.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 6)
            .cuboid(-1.5F, -12.0F, -1.5F, 3.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 8)
            .cuboid(-2.0F, -2.75F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 17.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMastiffLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -18.0F, -1.5F, 3.0F, 25.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-1.5F, -18.0F, -1.5F, 3.0F, 25.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .uv(24, 0)
            .cuboid(-1.5F, -19.2F, 1.7F, 3.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 6)
            .cuboid(-1.0F, -20.2F, 1.7F, 2.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 17.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 4).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -3.5F, 1.25F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 2).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.75F, 6.0F, 0.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, -1.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDioriteLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -11.05F, -1.5F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 15)
            .cuboid(-1.65F, -10.55F, -1.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 15)
            .cuboid(-0.5F, -10.55F, -1.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 15)
            .cuboid(0.65F, -10.55F, -1.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 15)
            .cuboid(0.65F, -10.55F, -0.5F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 15)
            .cuboid(0.65F, -10.55F, 0.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 15)
            .cuboid(-0.5F, -10.55F, 0.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 15)
            .cuboid(-1.65F, -10.55F, 0.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 15)
            .cuboid(-1.65F, -10.55F, -0.5F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 0)
            .cuboid(-2.0F, -11.8F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .uv(12, 10)
            .cuboid(-1.5F, -2.05F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(20, 17)
            .cuboid(-1.75F, -6.05F, -1.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(-1.75F, -6.05F, 0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(-1.75F, -6.05F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(-0.5F, -6.05F, 0.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(-1.5F, -6.05F, 0.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(0.5F, -6.05F, 0.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(0.75F, -6.05F, 0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(0.75F, -6.05F, -1.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(0.75F, -6.05F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(0.5F, -6.05F, -1.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(-1.5F, -6.05F, -1.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .uv(20, 17)
            .cuboid(-0.5F, -6.05F, -1.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 23.95F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(20, 15)
            .cuboid(1.0F, -4.8487F, 3.8487F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 19)
            .cuboid(1.0F, -3.6466F, 2.6466F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.25F, 1.45F, 0.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 20).cuboid(-4.0355F, -4.0355F, 0.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 1.45F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 16.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createLukeLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 5)
            .cuboid(-1.5F, -17.75F, -2.0F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .uv(20, 3)
            .cuboid(-0.5F, -18.5F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(12, 5)
            .cuboid(-1.5F, -10.0F, -2.0F, 3.0F, 6.5F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 0)
            .cuboid(-1.0F, -3.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 14)
            .cuboid(-1.5F, -2.5F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 21)
            .cuboid(-0.5F, -10.0F, -2.75F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(28, 3)
            .cuboid(-0.15F, -10.0F, -2.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .uv(28, 6)
            .cuboid(-0.15F, -9.25F, -2.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .uv(12, 19)
            .cuboid(-1.5F, -19.5F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-2.5F, -23.25F, -3.0F, 5.0F, 0.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 16)
            .cuboid(-1.5F, -23.5F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 21)
            .cuboid(-1.0F, -21.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 0)
            .cuboid(-1.0F, -20.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 23)
            .cuboid(-1.65F, -2.5F, -2.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 23)
            .cuboid(-0.5F, -2.5F, -2.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 23)
            .cuboid(0.65F, -2.5F, -2.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 23)
            .cuboid(0.65F, -2.5F, -1.0F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 23)
            .cuboid(0.65F, -2.5F, 0.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 23)
            .cuboid(-0.5F, -2.5F, 0.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 23)
            .cuboid(-1.65F, -2.5F, 0.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 23)
            .cuboid(-1.65F, -2.5F, -1.0F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.5F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 1.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createKatanaLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -5.0F, -1.5F, 3.0F, 17.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 0)
            .cuboid(-1.5F, -5.0F, -1.5F, 3.0F, 17.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .uv(12, 0)
            .cuboid(-1.0F, -3.0F, -3.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 24)
            .cuboid(-3.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(2, 20)
            .cuboid(-1.0F, -3.0F, 1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 20)
            .cuboid(1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 11).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 1.5F, 1.25F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 24).cuboid(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(3.0F, -2.5F, 1.0F, 0.0F, -0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(18, 24).cuboid(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(3.0F, -2.5F, -1.0F, 0.0F, 0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = group.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 23).cuboid(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(-1.0F, -2.5F, 3.0F, 0.0F, -0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = group.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(6, 23).cuboid(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(1.0F, -2.5F, 3.0F, 0.0F, 0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = group.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(26, 27).cuboid(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(-3.0F, -2.5F, -1.0F, 0.0F, -0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = group.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 27).cuboid(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(-3.0F, -2.5F, 1.0F, 0.0F, 0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = group.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 6).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(-1.0F, -2.5F, -3.0F, 0.0F, 0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = group.addChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 13).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.of(1.0F, -2.5F, -3.0F, 0.0F, -0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createPunkLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, 1.0F, -1.5F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.15F))
            .uv(12, 0)
            .cuboid(-1.5F, 8.75F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 22)
            .cuboid(-1.5F, 8.75F, 0.7F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.199F))
            .uv(0, 22)
            .cuboid(-1.5F, 9.5F, 0.7F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.199F))
            .uv(0, 22)
            .cuboid(-1.5F, 10.25F, 0.7F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.199F))
            .uv(12, 6)
            .cuboid(-1.5F, -1.25F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 24)
            .cuboid(0.8F, -0.75F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 0)
            .cuboid(1.1F, -0.75F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.35F))
            .uv(24, 0)
            .cuboid(1.1F, -0.75F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.35F))
            .uv(12, 24)
            .cuboid(-1.0F, -4.25F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 18)
            .cuboid(-1.5F, -2.25F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(0, 18)
            .cuboid(-1.5F, -3.25F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(0, 11)
            .cuboid(-1.5F, -7.75F, -1.5F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 12)
            .cuboid(-1.5F, -8.25F, -1.5F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(24, 0)
            .mirrored()
            .cuboid(-2.1F, -0.75F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.35F))
            .mirrored(false)
            .uv(0, 24)
            .mirrored()
            .cuboid(-1.8F, -0.75F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .mirrored(false)
            .uv(24, 0)
            .mirrored()
            .cuboid(-2.1F, -0.75F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.35F))
            .mirrored(false),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.25F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(8, 22).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -8.25F, 2.0F, -0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 4.5F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createKestisLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 13)
            .cuboid(-1.5F, 0.9F, -1.4F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(0, 11)
            .cuboid(-1.5F, 14.75F, -1.4F, 3.0F, 7.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(18, 7)
            .cuboid(-1.0F, 20.75F, -0.9F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 9)
            .cuboid(-0.5F, 24.75F, -0.4F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-1.5F, 11.0F, -1.4F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-1.5F, 3.25F, -1.4F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(0, 21)
            .cuboid(-1.5F, 21.55F, -1.4F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 2.35F, -0.1F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 11).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 12.5F, 1.6F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 5.6F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createKestis2Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 14)
            .cuboid(-1.5F, 10.0F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .uv(0, 18)
            .cuboid(-1.5F, -8.1F, -1.5F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(0, 0)
            .cuboid(-1.5F, 4.0F, -1.5F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 7)
            .cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .uv(12, 21)
            .cuboid(0.5F, -5.1F, -1.5F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.099F))
            .uv(12, 21)
            .cuboid(-1.5F, -5.1F, -1.5F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.099F))
            .uv(0, 9)
            .cuboid(-1.5F, -6.0F, -1.5F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 0).cuboid(-0.5F, -0.5F, -1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.85F, -5.25F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(24, 0)
            .cuboid(-0.5F, -0.5F, -1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 1)
            .cuboid(-0.5F, -0.5F, 1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.85F, -3.25F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 1).cuboid(-0.5F, -0.5F, 1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.85F, -5.45F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = group.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 0).cuboid(-0.5F, -0.5F, -1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.85F, -5.25F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = group.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 1).cuboid(-0.5F, -0.5F, 1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.85F, -5.45F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = group.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(24, 0)
            .cuboid(-0.5F, -0.5F, -1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 1)
            .cuboid(-0.5F, -0.5F, 1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.85F, -3.25F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = group.addChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(20, 19)
            .cuboid(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.199F))
            .uv(16, 19)
            .cuboid(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 2.5F, 1.35F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = group.addChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 19).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.75F, 10.6F, 0.0F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 6.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createLiquidLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, 4.0F, -1.5F, 3.0F, 7.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 6)
            .cuboid(-1.0F, 11.0F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-1.5F, 1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(12, 9)
            .cuboid(-0.5F, 2.0F, 0.85F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 10)
            .cuboid(-1.5F, -5.0F, -1.5F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createSidiousLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, 2.0F, -1.5F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 12)
            .cuboid(-1.5F, 2.0F, -1.5F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(12, 8)
            .cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 14)
            .cuboid(-1.5F, 10.75F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(12, 19)
            .cuboid(-1.0F, 12.75F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 10.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 22).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 11.75F, 1.75F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 19).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, 13.25F, -1.25F, 0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(11, 3)
            .cuboid(-2.5F, -0.75F, -2.5F, 5.0F, 0.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(11, 3)
            .cuboid(-2.5F, 0.75F, -2.5F, 5.0F, 0.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -0.15F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = group.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 24)
            .cuboid(-0.85F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(16, 22)
            .cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.of(1.5F, 2.5F, 1.5F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = group.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 24)
            .cuboid(-0.15F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 22)
            .cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.of(-1.5F, 2.5F, 1.5F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 9.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createKiAdiLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, -7.2F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 12)
            .cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 25)
            .cuboid(-1.5F, -1.5F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 31)
            .cuboid(-1.0F, -1.9F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 27)
            .cuboid(-1.5F, -2.9F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-2.0F, -23.9F, -2.0F, 4.0F, 21.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 27)
            .cuboid(-1.5F, -24.5F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 6)
            .cuboid(-1.0F, -25.0F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 17)
            .cuboid(-2.0F, -26.0F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 29)
            .cuboid(-1.5F, -26.5F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 9)
            .cuboid(-1.0F, -26.9F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 22)
            .cuboid(-2.0F, -27.8F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 31)
            .cuboid(-1.5F, -28.2F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 6)
            .cuboid(-2.0F, -30.2F, -2.0F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 0)
            .cuboid(-2.5F, -31.2F, -2.5F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 12)
            .cuboid(-0.9F, -8.3F, -2.8F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 15)
            .cuboid(-0.9F, -8.7F, 1.7F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 18).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.6F, -12.6F, 0.0F, 0.0F, 1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 25).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-2.1F, -16.1F, -0.5F, 0.0F, 1.5708F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDarthLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, -0.7F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-2.0F, -16.0F, -2.0F, 4.0F, 13.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 22)
            .cuboid(-1.5F, -3.0F, -1.4F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 36)
            .cuboid(0.2F, -2.1F, -1.9F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 36)
            .cuboid(-1.2F, -2.1F, -1.9F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 13)
            .cuboid(-1.9F, -2.1F, -1.1F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 16)
            .cuboid(-1.9F, -2.1F, 0.3F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 22)
            .cuboid(-1.2F, -2.1F, 1.1F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 7)
            .cuboid(0.2F, -2.1F, 1.1F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 10)
            .cuboid(0.8F, -2.1F, 0.3F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 19)
            .cuboid(0.8F, -2.1F, -1.1F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 0)
            .cuboid(-2.5F, -14.9F, -2.5F, 5.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 7)
            .cuboid(-2.5F, -7.2F, -2.5F, 5.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 14)
            .cuboid(-1.5F, -24.0F, -1.5F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 4)
            .cuboid(-0.5F, -20.9F, -1.7F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 17)
            .cuboid(-2.0F, -24.7F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 36)
            .cuboid(0.6F, -23.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(10, 34)
            .cuboid(-1.6F, -23.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 30)
            .cuboid(0.8F, -24.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 30)
            .cuboid(-1.8F, -24.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(22, 25)
            .cuboid(2.1F, -25.1F, -2.0F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 28)
            .cuboid(-2.1F, -25.1F, -2.0F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 14)
            .cuboid(-1.5F, -28.7F, -1.9F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 25)
            .cuboid(-2.0F, -27.7F, -2.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(26, 34)
            .cuboid(1.0F, -26.7F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 0)
            .cuboid(-2.0F, -26.7F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(36, 22)
            .cuboid(-2.0F, -27.7F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 38)
            .cuboid(1.0F, -27.7F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 34)
            .cuboid(-2.0F, -25.7F, 1.0F, 4.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(8, 29).cuboid(1.0F, -1.0F, -1.0F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.0F, -24.1F, -3.0F, 0.0F, -1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 19).cuboid(1.0F, -1.0F, -1.0F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.0F, -24.1F, 1.1F, 0.0F, -1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 28).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -23.0F, 0.8F, 0.0F, -1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bb_main.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(30, 24).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, -23.0F, -1.8F, 0.0F, -1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bb_main.addChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(32, 32).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, -22.0F, 1.6F, 0.0F, 1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bb_main.addChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(18, 34).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.5F, -22.0F, -0.6F, 0.0F, 1.5708F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createEzraLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone = partdefinition.addChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 29)
            .cuboid(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-3.0F, -24.0F, -3.0F, 6.0F, 13.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 21)
            .cuboid(-3.0F, -38.0F, -3.0F, 6.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(32, 10)
            .cuboid(-3.0F, -49.0F, -3.0F, 6.0F, 5.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 40)
            .cuboid(-3.0F, -42.0F, -3.0F, 6.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 19)
            .cuboid(-4.0F, -40.0F, -4.0F, 8.0F, 2.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 0)
            .cuboid(-4.0F, -44.0F, -4.0F, 8.0F, 2.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 37)
            .cuboid(3.0F, -23.0F, -2.0F, 1.0F, 9.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 29)
            .cuboid(-3.0F, -29.5F, -3.0F, 6.0F, 5.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(54, 56)
            .cuboid(2.2F, -28.5F, -1.0F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(48, 29)
            .cuboid(-2.0F, -37.0F, -2.0F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(44, 50)
            .cuboid(-2.0F, -26.0F, -2.0F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(56, 19)
            .cuboid(-2.0F, -12.0F, -2.5F, 4.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(56, 0)
            .cuboid(-2.5F, -12.0F, -2.0F, 1.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(44, 56)
            .cuboid(-2.0F, -12.0F, 1.5F, 4.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 56)
            .cuboid(1.5F, -12.0F, -2.0F, 1.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(30, 57)
            .cuboid(-2.0F, -34.0F, -2.5F, 4.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(56, 10)
            .cuboid(1.5F, -34.0F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 57)
            .cuboid(-2.0F, -34.0F, 1.5F, 4.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(10, 56)
            .cuboid(-2.5F, -34.0F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 41)
            .cuboid(-3.5F, -5.2F, -2.0F, 7.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(22, 48).cuboid(-4.0F, -3.0F, -2.0F, 7.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -2.2F, -0.5F, 0.0F, 1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bone.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(24, 10).cuboid(2.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.0F, -24.5F, 1.0F, -0.829F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, -25.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createRampantLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(12, 17)
            .cuboid(-1.5F, -9.25F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 6)
            .cuboid(-1.5F, 10.0F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .uv(0, 0)
            .cuboid(-1.5F, 2.0F, -1.5F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 0)
            .cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .uv(-1, 19)
            .cuboid(-1.0F, -0.5F, 1.0F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .uv(0, 11)
            .cuboid(-1.5F, -8.5F, -1.5F, 3.0F, 4.5F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 11)
            .cuboid(-1.3F, -4.3F, -1.3F, 2.6F, 3.6F, 2.6F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.8F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createSkebobeLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -23.0F, -2.0F, 3.0F, 20.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-1.9F, -19.5F, -2.6F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 10)
            .cuboid(-1.5F, -10.0F, -2.0F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .uv(4, 23)
            .cuboid(-1.0F, -3.0F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 10)
            .cuboid(-1.5F, -2.5F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 17)
            .cuboid(-0.5F, -23.3F, -2.35F, 1.0F, 14.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(16, 17)
            .cuboid(-0.5F, -23.3F, 0.35F, 1.0F, 14.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(21, 18)
            .cuboid(0.8F, -23.3F, -0.95F, 1.0F, 14.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(0, 23)
            .cuboid(-1.8F, -23.3F, -0.95F, 1.0F, 14.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(24, 15)
            .cuboid(-0.5F, -9.0F, -2.75F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .uv(12, 5)
            .cuboid(-2.0F, -24.0F, -2.5F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 26.0F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition saber = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 2.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMaulkillerLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -19.0F, -2.0F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 4)
            .cuboid(-1.5F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 12)
            .cuboid(-1.5F, -10.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(0, 25)
            .cuboid(-1.5F, -11.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(8, 17)
            .cuboid(-1.5F, -8.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(24, 0)
            .cuboid(-1.5F, -4.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(20, 21)
            .cuboid(-1.5F, -5.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(20, 17)
            .cuboid(-1.5F, -7.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(8, 21)
            .cuboid(-1.5F, -6.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(12, 4)
            .cuboid(-1.5F, -21.5F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 25)
            .cuboid(-1.5F, -13.2F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 25)
            .cuboid(-1.5F, -15.2F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 29)
            .cuboid(-1.0F, -20.5F, -1.5F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 29)
            .cuboid(-0.5F, -20.5F, 0.7F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(30, 29)
            .cuboid(-0.5F, -20.5F, -1.7F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 29)
            .cuboid(1.2F, -20.5F, -1.0F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(26, 29)
            .cuboid(-1.2F, -20.5F, -1.0F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 11)
            .cuboid(-1.0F, -12.0F, -1.5F, 2.0F, 12.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 8)
            .cuboid(-1.5F, -3.5F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 29)
            .cuboid(-0.5F, -1.0F, -2.8F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 8)
            .cuboid(-2.3F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 29)
            .cuboid(1.3F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-1.5F, -2.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 8)
            .cuboid(-0.5F, -1.0F, 0.8F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 11)
            .cuboid(-2.0F, -1.6F, -2.5F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 23.5F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 29).cuboid(1.091F, -2.091F, 1.05F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -15.9F, -3.2F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 8).cuboid(1.091F, -2.091F, 1.05F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -13.8F, -3.4F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 29).cuboid(1.091F, -2.091F, 1.05F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -14.1F, -0.5F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 2.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMalgusLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 18)
            .cuboid(-1.464F, -0.455F, -1.562F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(20, 0)
            .cuboid(-1.464F, -5.755F, -1.562F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .uv(28, 28)
            .cuboid(-1.464F, -3.28F, 0.438F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 31)
            .cuboid(-1.464F, -3.28F, -1.562F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 20)
            .cuboid(-1.464F, -1.28F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 24)
            .cuboid(-1.464F, -3.78F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 27)
            .cuboid(-1.464F, -5.28F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(4, 31)
            .cuboid(0.536F, -3.28F, -1.562F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 31)
            .cuboid(0.536F, -3.28F, 0.438F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-2.464F, 0.545F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .uv(0, 0)
            .cuboid(-2.464F, 1.845F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .uv(0, 0)
            .cuboid(-2.464F, 3.545F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .uv(16, 31)
            .cuboid(-0.464F, -2.855F, 1.138F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 31)
            .cuboid(-0.464F, -2.855F, -1.262F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 31)
            .cuboid(1.236F, -2.855F, -0.562F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(14, 31)
            .cuboid(-1.164F, -2.855F, -0.562F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 6)
            .cuboid(-1.464F, 5.045F, -1.562F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .uv(28, 11)
            .cuboid(-2.464F, -8.155F, -0.562F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 20)
            .cuboid(-4.464F, -10.155F, -0.062F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 28)
            .cuboid(1.536F, -8.155F, -0.562F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 20)
            .cuboid(1.536F, -10.155F, -0.062F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, 6)
            .cuboid(-1.864F, 2.245F, -1.062F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 6)
            .cuboid(-1.964F, 11.645F, -2.062F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.6F)),
         net.minecraft.client.model.geom.PartPose.pivot(-0.036F, 9.555F, 0.062F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 13).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.6F)),
         net.minecraft.client.model.geom.PartPose.of(0.036F, 13.645F, -0.062F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(28, 18).cuboid(1.091F, -2.091F, 1.05F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.036F, 1.945F, -0.062F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 8.275F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createCassiopeiaLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 12.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -19.0F, -1.5F, 3.0F, 19.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-2.0F, -12.0F, -2.0F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 7)
            .cuboid(-2.0F, -2.9F, -2.0F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 14)
            .cuboid(-2.0F, -19.1F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(12, 19).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -9.8F, -1.3F, 0.0F, 0.0F, 0.7854F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createWookieeLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(26, 11)
            .cuboid(-0.2F, -20.0F, -0.3F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(26, 11)
            .cuboid(-0.8F, -20.0F, -0.3F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 0).cuboid(-0.1F, -8.95F, -0.1F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(1.5F, -9.05F, 0.4F, -3.1416F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(0, 20).cuboid(-0.1F, -8.95F, -0.1F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.7F, -9.05F, 0.4F, -3.1416F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 10)
            .cuboid(-0.9F, -10.95F, -0.1F, 1.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 17)
            .cuboid(-0.9F, -7.95F, -0.9F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 0)
            .cuboid(-0.1F, -10.95F, -0.1F, 1.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 17)
            .cuboid(-0.1F, -7.95F, -0.9F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-0.8F, -8.55F, -0.8F, 1.0F, 13.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(4, 0)
            .cuboid(-0.8F, -11.55F, -0.2F, 1.0F, 15.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 0)
            .cuboid(-0.2F, -8.55F, -0.8F, 1.0F, 13.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 0)
            .cuboid(-0.2F, -11.55F, -0.2F, 1.0F, 17.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -8.45F, 0.0F, -3.1416F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bb_main.addChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(8, 24)
            .cuboid(-0.1F, 3.45F, -0.9F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 20)
            .cuboid(-0.1F, 3.45F, -0.1F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 13)
            .cuboid(-0.9F, 3.45F, -0.1F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 5)
            .cuboid(-0.9F, 3.45F, -0.9F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(24, 0)
            .cuboid(-0.3F, 3.95F, -0.7F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 7)
            .cuboid(-0.3F, 3.95F, -0.3F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(4, 20)
            .cuboid(-0.7F, 3.95F, -0.3F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(20, 19)
            .cuboid(-0.7F, 3.95F, -0.7F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.0F, -10.45F, 0.0F, -3.1416F, 0.0F, 3.1416F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBrickLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 6.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -18.0F, -1.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 1)
            .cuboid(0.0F, -11.0F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 6)
            .cuboid(0.75F, -14.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 6)
            .cuboid(0.55F, -13.25F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 8)
            .cuboid(0.75F, -16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 5)
            .cuboid(1.55F, -17.0F, -1.5F, 0.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createCrewLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 6.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -18.0F, -1.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-1.6F, -20.0F, -1.5F, 0.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 8)
            .cuboid(-1.6F, -19.0F, -1.51F, 2.0F, 4.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 12)
            .cuboid(-1.6F, -19.0F, 1.51F, 2.0F, 4.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 8)
            .cuboid(0.75F, -13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 19)
            .cuboid(-0.5F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createGeneralLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone = partdefinition.addChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.0F, -14.0F, -2.0F, 3.0F, 14.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 17)
            .cuboid(-1.25F, -12.5F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-1.0F, -20.0F, -2.0F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(26, 26)
            .cuboid(-1.0F, -23.0F, -2.0F, 0.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 10)
            .cuboid(2.0F, -23.0F, -2.0F, 0.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(28, -2)
            .cuboid(0.5F, -22.0F, -4.0F, 0.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 16)
            .cuboid(0.5F, -22.0F, 1.0F, 0.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 10)
            .cuboid(-1.0F, -16.0F, 1.0F, 3.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 16)
            .cuboid(2.0F, -16.0F, -2.0F, 0.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 29)
            .cuboid(-1.0F, -16.0F, -2.0F, 3.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 17)
            .cuboid(-0.5F, -14.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 20)
            .cuboid(-0.5F, -16.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(18, 13)
            .cuboid(0.0F, -15.5F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.5F, 24.0F, -0.5F, 0.0F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 4.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createShieldLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 6.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -18.1F, -1.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 6)
            .cuboid(-1.5F, -21.1F, -1.5F, 3.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 9)
            .cuboid(-1.5F, -21.1F, 1.5F, 3.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 12)
            .cuboid(-1.5F, -21.1F, 0.5F, 0.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(14, 12)
            .cuboid(-1.5F, -21.1F, -1.5F, 0.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 16)
            .cuboid(1.5F, -21.1F, -1.5F, 0.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 12)
            .cuboid(1.5F, -21.1F, 0.5F, 0.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(20, 11).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.75F, -11.65F, 0.5F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(17, 18).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(0.75F, -15.5F, 0.0F, 0.7854F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createWarriorLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 6.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-1.5F, -18.0F, -1.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 3)
            .cuboid(0.75F, -11.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(-11, 21)
            .cuboid(-5.5F, -16.0F, -5.5F, 11.0F, 0.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(11, 11)
            .cuboid(5.5F, -16.0F, -0.5F, 1.0F, 0.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(11, 11)
            .cuboid(-6.5F, -16.0F, -0.5F, 1.0F, 0.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(11, 11)
            .cuboid(-0.5F, -16.0F, 5.5F, 1.0F, 0.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(11, 11)
            .cuboid(-0.5F, -16.0F, -6.5F, 1.0F, 0.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDarkLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.pivot(0.0F, 7.5F, 0.9F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(0, 0)
            .cuboid(-0.1F, -17.5F, -0.1F, 1.0F, 17.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(4, 0)
            .cuboid(-0.1F, -16.5F, -0.9F, 1.0F, 16.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 0)
            .cuboid(-0.9F, -17.5F, -0.1F, 1.0F, 17.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 0)
            .cuboid(-0.9F, -16.5F, -0.9F, 1.0F, 16.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 18)
            .cuboid(-0.8F, -4.0F, -0.8F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(4, 18)
            .cuboid(-0.8F, -4.0F, -0.2F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 18)
            .cuboid(-0.2F, -4.0F, -0.2F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 18)
            .cuboid(-0.2F, -4.0F, -0.8F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 20)
            .cuboid(-0.5F, -10.5F, 0.4F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(8, 18)
            .cuboid(-0.2F, -8.0F, -0.2F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(4, 18)
            .cuboid(-0.8F, -8.0F, -0.2F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(0, 18)
            .cuboid(-0.8F, -8.0F, -0.8F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(12, 18)
            .cuboid(-0.2F, -8.0F, -0.8F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.pivot(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 5).cuboid(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1F, -15.8394F, 1.8491F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().uv(16, 15).cuboid(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1F, -15.8394F, 1.7491F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .uv(16, 10)
            .cuboid(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .uv(16, 0)
            .cuboid(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.of(-0.1F, -13.3F, 0.1F, 0.4189F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.of(meshdefinition, 32, 32);
   }
}
