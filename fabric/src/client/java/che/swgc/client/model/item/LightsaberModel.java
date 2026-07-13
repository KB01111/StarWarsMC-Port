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
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.ItemDisplayContext;

@javax.annotation.ParametersAreNonnullByDefault
public class LightsaberModel extends che.swgc.client.compat.model.SinglePartEntityModel<net.minecraft.client.player.LocalPlayer> {
   public static final net.minecraft.client.model.geom.ModelLayerLocation DARK_LOCATION = new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", "dark"), "lightsaber");
   protected net.minecraft.client.model.geom.ModelPart blade;
   public net.minecraft.world.item.ItemStack stack;
   public float activation;
   public net.minecraft.world.item.ItemDisplayContext ctx;

   public LightsaberModel(net.minecraft.client.model.geom.ModelPart root, Function<net.minecraft.resources.Identifier, net.minecraft.client.renderer.rendertype.RenderType> renderType) {
      super(root, renderType);
      if (root.hasChild("blade")) {
         this.blade = root.getChild("blade");
      }
   }

   public LightsaberModel(net.minecraft.client.model.geom.ModelPart root) {
      this(root, net.minecraft.client.renderer.rendertype.RenderTypes::entityCutout);
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public void setupAnim(@Nullable net.minecraft.client.player.LocalPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void translateToBlade(com.mojang.blaze3d.vertex.PoseStack poseStack) {
      this.blade.translateAndRotate(poseStack);
   }

   public static void regLayers(BiConsumer<net.minecraft.client.model.geom.ModelLayerLocation, Supplier<net.minecraft.client.model.geom.builders.LayerDefinition>> biConsumer) {
      java.util.function.BiConsumer<String, Supplier<net.minecraft.client.model.geom.builders.LayerDefinition>> register = (id, definition) -> biConsumer.accept(new net.minecraft.client.model.geom.ModelLayerLocation(Identifier.fromNamespaceAndPath("swgc", id), "lightsaber"), definition);
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
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -13.0F, -2.0F, 3.0F, 14.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 7)
            .addBox(-1.5F, -15.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 14)
            .mirror()
            .addBox(0.6F, -4.4F, -2.1F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirror(false)
            .texOffs(12, 14)
            .addBox(-1.6F, -4.4F, -2.1F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(12, 14)
            .mirror()
            .addBox(0.6F, -4.4F, 0.1F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .mirror(false)
            .texOffs(12, 14)
            .addBox(-1.6F, -4.4F, 0.1F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(12, 0)
            .addBox(-1.5F, -9.75F, -2.0F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .texOffs(16, 14)
            .addBox(-0.5F, -9.0F, 0.8F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 11)
            .addBox(-1.0F, -14.0F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 23.0F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 17).addBox(-1.8F, -0.8359F, -0.6591F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.2F, -8.875F, -0.15F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 8.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createQuiGonLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -19.0F, -2.0F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-1.5F, -19.0F, -2.0F, 3.0F, 7.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 16)
            .addBox(-1.5F, -12.75F, -2.0F, 3.0F, 10.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.09F))
            .texOffs(24, 0)
            .addBox(-1.5F, -9.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 3)
            .addBox(-1.5F, -8.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 3)
            .addBox(-1.5F, -4.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 0)
            .addBox(-1.5F, -5.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 0)
            .addBox(-1.5F, -7.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 3)
            .addBox(-1.5F, -6.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 3)
            .addBox(-1.5F, -12.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 0)
            .addBox(-1.5F, -11.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 3)
            .addBox(-1.5F, -10.0F, -1.0F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(22, 20)
            .addBox(-1.5F, -3.0F, -1.0F, 3.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(0, 21)
            .addBox(-1.5F, -22.5F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(4, 25)
            .addBox(-0.5F, -5.5F, -2.7F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 6)
            .addBox(-1.0F, -21.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 10)
            .addBox(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(22, 16)
            .addBox(-1.5F, -20.5F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(22, 24)
            .addBox(-1.0F, -19.75F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 23.0F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 25).addBox(1.091F, -2.091F, 1.05F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -11.0F, -0.5F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.5F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createKenobiLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -9.0F, -2.0F, 3.0F, 15.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 5)
            .addBox(-1.5F, -1.0F, -2.0F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .texOffs(0, 22)
            .addBox(-1.0F, 6.0F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 12)
            .addBox(-1.5F, 6.5F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 22)
            .addBox(-0.5F, -1.0F, -2.75F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(0, 18)
            .addBox(-1.5F, -11.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-2.0F, -15.0F, -2.5F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 17)
            .addBox(-1.5F, -14.0F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 5)
            .addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 22)
            .addBox(-1.0F, -10.0F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 15.5F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 0.5F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createAnakinLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, 3.0F, -1.5F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 12)
            .addBox(-1.5F, -3.8F, -1.5F, 3.0F, 7.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .texOffs(12, 10)
            .addBox(0.65F, 7.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 16)
            .addBox(1.0F, 3.1F, -0.5F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 10)
            .addBox(-0.5F, 7.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 10)
            .addBox(-1.65F, 7.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 10)
            .addBox(-1.65F, 7.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 10)
            .addBox(-0.5F, 7.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 10)
            .addBox(0.65F, 7.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 10)
            .addBox(0.65F, 7.0F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 10)
            .addBox(-1.65F, 7.0F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(16, 17)
            .addBox(-0.5F, -3.8F, -2.2F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 17)
            .addBox(0.5F, -3.8F, -2.2F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 13)
            .addBox(-0.5F, -2.3F, -1.7F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(-1.5F, -4.4F, -1.5F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .texOffs(12, 8)
            .addBox(-1.5F, -4.4F, 0.5F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.5F, 5.3F, 0.0F, -0.2182F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 3).addBox(-1.5F, -0.2F, -1.8F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.202F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -4.2F, 0.7F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 0).addBox(-1.5F, -0.2F, -0.2F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.201F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -4.2F, -0.7F, -0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = group.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 15).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.8F, 1.05F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 8.1F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createWinduLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 13)
            .addBox(-1.0F, -3.7F, -1.0F, 2.0F, 5.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .texOffs(0, 0)
            .addBox(-1.5F, 3.0F, -1.5F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 17)
            .addBox(0.65F, 3.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(16, 17)
            .addBox(-0.5F, 3.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(16, 17)
            .addBox(-1.65F, 3.0F, -1.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(16, 17)
            .addBox(-1.65F, 3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(16, 17)
            .addBox(-1.65F, 3.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(16, 17)
            .addBox(-0.5F, 3.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(16, 17)
            .addBox(0.65F, 3.0F, 0.65F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(16, 17)
            .addBox(0.65F, 3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 8)
            .addBox(-1.0F, 8.0F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 19)
            .addBox(-1.5F, -3.45F, 0.35F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(0, 20)
            .addBox(-0.5F, 8.5F, 0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-1.5F, -4.4F, -1.4F, 3.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(0, 8)
            .addBox(-1.5F, 1.1F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.09F))
            .texOffs(8, 13)
            .addBox(-1.5F, -4.4F, -0.6F, 3.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(8, 16)
            .addBox(-1.0F, -5.3F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 13)
            .addBox(0.45F, -2.5F, 0.4F, 1.0F, 2.5F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .texOffs(18, 13)
            .addBox(-0.5F, -2.5F, 0.4F, 1.0F, 2.5F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .texOffs(18, 13)
            .addBox(-1.45F, -2.5F, 0.4F, 1.0F, 2.5F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 13.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 7.7F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createRevanLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -6.0F, -1.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 5)
            .addBox(-2.0F, -2.75F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .texOffs(12, 5)
            .addBox(-2.0F, 0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .texOffs(12, 5)
            .addBox(-2.0F, 2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.25F))
            .texOffs(12, 0)
            .addBox(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 12)
            .addBox(-0.5F, 11.0F, 0.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(12, 12)
            .addBox(0.75F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(12, 12)
            .addBox(-0.5F, 11.0F, -1.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(12, 12)
            .addBox(-1.75F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 10).addBox(-1.0303F, -0.7197F, 0.8F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 5.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createPadawanLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone = partdefinition.addOrReplaceChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 0).addBox(-9.5F, -18.5F, 6.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(8.0F, 24.5F, -8.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-8.0F, -11.0F, 9.25F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 10.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createPadawan2Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(12, 11)
            .addBox(-1.5F, -6.25F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(-1.5F, 10.0F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .texOffs(0, 0)
            .addBox(-1.5F, 2.0F, -1.5F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 0)
            .addBox(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(18, 18)
            .addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .texOffs(20, 23)
            .addBox(-0.7F, -5.9F, 1.58F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 23)
            .addBox(-0.7F, -5.9F, -1.58F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.002F))
            .texOffs(0, 19)
            .addBox(-1.5F, -4.9F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(0, 19)
            .addBox(-1.5F, -4.9F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(0, 25)
            .addBox(-1.5F, -8.1F, -1.5F, 1.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(0, 11)
            .addBox(-1.5F, -6.0F, -1.5F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(18, 20)
            .addBox(-1.0F, -3.0F, 0.01F, 1.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(20, 20)
            .addBox(-1.0F, -3.0F, 3.19F, 1.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.6F, -5.0F, -1.6F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 5.75F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDookuLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(12, 19)
            .addBox(-1.5F, 11.8037F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .texOffs(12, 23)
            .addBox(0.0F, 11.3537F, 1.0F, 0.0F, 8.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 25)
            .addBox(0.0F, 0.0F, 3.8765F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.5F, 13.0537F, -1.5F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 3.9463F, 7.75F, -2.7053F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 9)
            .addBox(-2.0F, -3.0F, -0.5F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 8)
            .addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(18, 25)
            .addBox(0.0F, -2.0F, 2.5F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 7.0965F, -0.8474F, -0.4363F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 14)
            .addBox(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 13)
            .addBox(0.0F, -5.0F, 2.5F, 0.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 12.0537F, -1.5F, -0.1309F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 22)
            .addBox(-1.0F, 4.5F, -0.5F, 2.0F, 3.5F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(17, 23)
            .addBox(1.751F, 6.0F, 1.25F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(14, 23)
            .addBox(-1.751F, 6.0F, 1.25F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 14)
            .addBox(-1.5F, 5.5F, 0.25F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .texOffs(12, 0)
            .addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 19.0537F, -1.5F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = group.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(22, 25).addBox(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.002F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 1.5842F, 4.1998F, 0.6109F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = group.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 19).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 5.8211F, -0.8455F, -0.0436F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = group.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(14, 25).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 5.2839F, -0.0021F, 0.5672F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = group.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(8, 22).addBox(0.0F, -7.5F, 2.5F, 0.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 7.5965F, -0.8474F, -0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = group.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 25).addBox(0.0F, -1.0F, -0.3F, 0.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.002F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.5F, 4.3765F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition toggle = group.addOrReplaceChild(
         "toggle",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 3).addBox(-0.5F, 0.0F, -0.5624F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 19.3537F, 1.87F, 0.3927F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = toggle.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 0.764F, 0.4376F, -1.1071F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 7.75F, 4.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createVaderLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -7.0F, -1.5F, 3.0F, 14.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(10, 17)
            .addBox(-1.65F, -0.5F, -1.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(10, 17)
            .addBox(-0.5F, -0.5F, -1.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(10, 17)
            .addBox(0.65F, -0.5F, -1.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(10, 17)
            .addBox(0.65F, -0.5F, -0.5F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(10, 17)
            .addBox(0.65F, -0.5F, 0.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(10, 17)
            .addBox(-0.5F, -0.5F, 0.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(10, 17)
            .addBox(-1.65F, -0.5F, 0.65F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(10, 17)
            .addBox(-1.65F, -0.5F, -0.5F, 1.0F, 6.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(14, 17)
            .addBox(-0.5F, -4.0F, -2.0F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 9)
            .addBox(-2.0F, -11.0F, 1.0F, 4.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-2.0F, -9.0F, -2.0F, 4.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 17.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(18, 17).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -4.5F, 1.25F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 17).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -7.0F, 2.0F, 0.5236F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(12, 14)
            .addBox(-2.0F, 1.0F, 1.0F, 4.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(12, 5)
            .addBox(-2.0F, 0.0F, 0.3F, 4.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F, 0.0F, 0.3F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -9.0F, -2.0F, 0.589F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 7.4F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createJarrusLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -10.0F, -1.5F, 3.0F, 17.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-3.0F, -6.0F, -3.0F, 6.0F, 0.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(-1.5F, -12.0F, -1.5F, 3.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 8)
            .addBox(-2.0F, -2.75F, -0.5F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 17.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 7.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMastiffLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -18.0F, -1.5F, 3.0F, 25.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-1.5F, -18.0F, -1.5F, 3.0F, 25.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.2F))
            .texOffs(24, 0)
            .addBox(-1.5F, -19.2F, 1.7F, 3.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 6)
            .addBox(-1.0F, -20.2F, 1.7F, 2.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 17.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 4).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -3.5F, 1.25F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.75F, 6.0F, 0.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, -1.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDioriteLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -11.05F, -1.5F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 15)
            .addBox(-1.65F, -10.55F, -1.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 15)
            .addBox(-0.5F, -10.55F, -1.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 15)
            .addBox(0.65F, -10.55F, -1.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 15)
            .addBox(0.65F, -10.55F, -0.5F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 15)
            .addBox(0.65F, -10.55F, 0.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 15)
            .addBox(-0.5F, -10.55F, 0.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 15)
            .addBox(-1.65F, -10.55F, 0.65F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 15)
            .addBox(-1.65F, -10.55F, -0.5F, 1.0F, 3.75F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 0)
            .addBox(-2.0F, -11.8F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .texOffs(12, 10)
            .addBox(-1.5F, -2.05F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(20, 17)
            .addBox(-1.75F, -6.05F, -1.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(-1.75F, -6.05F, 0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(-1.75F, -6.05F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(-0.5F, -6.05F, 0.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(-1.5F, -6.05F, 0.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(0.5F, -6.05F, 0.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(0.75F, -6.05F, 0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(0.75F, -6.05F, -1.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(0.75F, -6.05F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(0.5F, -6.05F, -1.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(-1.5F, -6.05F, -1.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F))
            .texOffs(20, 17)
            .addBox(-0.5F, -6.05F, -1.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.249F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 23.95F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(20, 15)
            .addBox(1.0F, -4.8487F, 3.8487F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 19)
            .addBox(1.0F, -3.6466F, 2.6466F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.25F, 1.45F, 0.0F, 0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 20).addBox(-4.0355F, -4.0355F, 0.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 1.45F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 16.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createLukeLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 5)
            .addBox(-1.5F, -17.75F, -2.0F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F))
            .texOffs(20, 3)
            .addBox(-0.5F, -18.5F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .texOffs(12, 5)
            .addBox(-1.5F, -10.0F, -2.0F, 3.0F, 6.5F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 0)
            .addBox(-1.0F, -3.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 14)
            .addBox(-1.5F, -2.5F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 21)
            .addBox(-0.5F, -10.0F, -2.75F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(28, 3)
            .addBox(-0.15F, -10.0F, -2.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .texOffs(28, 6)
            .addBox(-0.15F, -9.25F, -2.75F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .texOffs(12, 19)
            .addBox(-1.5F, -19.5F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.5F, -23.25F, -3.0F, 5.0F, 0.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 16)
            .addBox(-1.5F, -23.5F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 21)
            .addBox(-1.0F, -21.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 0)
            .addBox(-1.0F, -20.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 23)
            .addBox(-1.65F, -2.5F, -2.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 23)
            .addBox(-0.5F, -2.5F, -2.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 23)
            .addBox(0.65F, -2.5F, -2.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 23)
            .addBox(0.65F, -2.5F, -1.0F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 23)
            .addBox(0.65F, -2.5F, 0.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 23)
            .addBox(-0.5F, -2.5F, 0.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 23)
            .addBox(-1.65F, -2.5F, 0.15F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 23)
            .addBox(-1.65F, -2.5F, -1.0F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.5F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 1.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createKatanaLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -5.0F, -1.5F, 3.0F, 17.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 0)
            .addBox(-1.5F, -5.0F, -1.5F, 3.0F, 17.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .texOffs(12, 0)
            .addBox(-1.0F, -3.0F, -3.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 24)
            .addBox(-3.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(2, 20)
            .addBox(-1.0F, -3.0F, 1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 20)
            .addBox(1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 11).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 1.5F, 1.25F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 24).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, -2.5F, 1.0F, 0.0F, -0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(18, 24).addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(3.0F, -2.5F, -1.0F, 0.0F, 0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = group.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, -2.5F, 3.0F, 0.0F, -0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = group.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(6, 23).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, -2.5F, 3.0F, 0.0F, 0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = group.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(26, 27).addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.0F, -2.5F, -1.0F, 0.0F, -0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = group.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 27).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-3.0F, -2.5F, 1.0F, 0.0F, 0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = group.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 6).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.0F, -2.5F, -3.0F, 0.0F, 0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r9 = group.addOrReplaceChild(
         "cube_r9",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 13).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, -2.5F, -3.0F, 0.0F, -0.4363F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 7.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createPunkLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, 1.0F, -1.5F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.15F))
            .texOffs(12, 0)
            .addBox(-1.5F, 8.75F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 22)
            .addBox(-1.5F, 8.75F, 0.7F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.199F))
            .texOffs(0, 22)
            .addBox(-1.5F, 9.5F, 0.7F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.199F))
            .texOffs(0, 22)
            .addBox(-1.5F, 10.25F, 0.7F, 3.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.199F))
            .texOffs(12, 6)
            .addBox(-1.5F, -1.25F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 24)
            .addBox(0.8F, -0.75F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 0)
            .addBox(1.1F, -0.75F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.35F))
            .texOffs(24, 0)
            .addBox(1.1F, -0.75F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.35F))
            .texOffs(12, 24)
            .addBox(-1.0F, -4.25F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(-1.5F, -2.25F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(0, 18)
            .addBox(-1.5F, -3.25F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(0, 11)
            .addBox(-1.5F, -7.75F, -1.5F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 12)
            .addBox(-1.5F, -8.25F, -1.5F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(24, 0)
            .mirror()
            .addBox(-2.1F, -0.75F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.35F))
            .mirror(false)
            .texOffs(0, 24)
            .mirror()
            .addBox(-1.8F, -0.75F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .mirror(false)
            .texOffs(24, 0)
            .mirror()
            .addBox(-2.1F, -0.75F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.35F))
            .mirror(false),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.25F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(8, 22).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -8.25F, 2.0F, -0.0873F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 4.5F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createKestisLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(12, 13)
            .addBox(-1.5F, 0.9F, -1.4F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(0, 11)
            .addBox(-1.5F, 14.75F, -1.4F, 3.0F, 7.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(18, 7)
            .addBox(-1.0F, 20.75F, -0.9F, 2.0F, 4.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 9)
            .addBox(-0.5F, 24.75F, -0.4F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-1.5F, 11.0F, -1.4F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-1.5F, 3.25F, -1.4F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(0, 21)
            .addBox(-1.5F, 21.55F, -1.4F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 2.35F, -0.1F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 11).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 12.5F, 1.6F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 5.6F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createKestis2Layer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(12, 14)
            .addBox(-1.5F, 10.0F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .texOffs(0, 18)
            .addBox(-1.5F, -8.1F, -1.5F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(0, 0)
            .addBox(-1.5F, 4.0F, -1.5F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 7)
            .addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .texOffs(12, 21)
            .addBox(0.5F, -5.1F, -1.5F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.099F))
            .texOffs(12, 21)
            .addBox(-1.5F, -5.1F, -1.5F, 1.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.099F))
            .texOffs(0, 9)
            .addBox(-1.5F, -6.0F, -1.5F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -0.5F, -1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.85F, -5.25F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(24, 0)
            .addBox(-0.5F, -0.5F, -1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 1)
            .addBox(-0.5F, -0.5F, 1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.85F, -3.25F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 1).addBox(-0.5F, -0.5F, 1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.85F, -5.45F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = group.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -0.5F, -1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.85F, -5.25F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = group.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 1).addBox(-0.5F, -0.5F, 1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.85F, -5.45F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = group.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(24, 0)
            .addBox(-0.5F, -0.5F, -1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 1)
            .addBox(-0.5F, -0.5F, 1.597F, 1.0F, 1.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.85F, -3.25F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r7 = group.addOrReplaceChild(
         "cube_r7",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(20, 19)
            .addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.199F))
            .texOffs(16, 19)
            .addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 2.5F, 1.35F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r8 = group.addOrReplaceChild(
         "cube_r8",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 19).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.75F, 10.6F, 0.0F, -0.7854F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 6.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createLiquidLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, 4.0F, -1.5F, 3.0F, 7.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(-1.0F, 11.0F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-1.5F, 1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(12, 9)
            .addBox(-0.5F, 2.0F, 0.85F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 10)
            .addBox(-1.5F, -5.0F, -1.5F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 7.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createSidiousLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, 2.0F, -1.5F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 12)
            .addBox(-1.5F, 2.0F, -1.5F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(12, 8)
            .addBox(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 14)
            .addBox(-1.5F, 10.75F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .texOffs(12, 19)
            .addBox(-1.0F, 12.75F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 10.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 11.75F, 1.75F, 0.0F, 0.0F, 0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 19).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, 13.25F, -1.25F, 0.1745F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(11, 3)
            .addBox(-2.5F, -0.75F, -2.5F, 5.0F, 0.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(11, 3)
            .addBox(-2.5F, 0.75F, -2.5F, 5.0F, 0.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -0.15F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = group.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 24)
            .addBox(-0.85F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(16, 22)
            .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.5F, 2.5F, 1.5F, 0.0F, -0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = group.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 24)
            .addBox(-0.15F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 22)
            .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.2F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-1.5F, 2.5F, 1.5F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 9.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createKiAdiLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, -7.2F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 12)
            .addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 25)
            .addBox(-1.5F, -1.5F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 31)
            .addBox(-1.0F, -1.9F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 27)
            .addBox(-1.5F, -2.9F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.0F, -23.9F, -2.0F, 4.0F, 21.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 27)
            .addBox(-1.5F, -24.5F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 6)
            .addBox(-1.0F, -25.0F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 17)
            .addBox(-2.0F, -26.0F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 29)
            .addBox(-1.5F, -26.5F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 9)
            .addBox(-1.0F, -26.9F, -1.0F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 22)
            .addBox(-2.0F, -27.8F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 31)
            .addBox(-1.5F, -28.2F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 6)
            .addBox(-2.0F, -30.2F, -2.0F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 0)
            .addBox(-2.5F, -31.2F, -2.5F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 12)
            .addBox(-0.9F, -8.3F, -2.8F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 15)
            .addBox(-0.9F, -8.7F, 1.7F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 18).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.6F, -12.6F, 0.0F, 0.0F, 1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 25).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-2.1F, -16.1F, -0.5F, 0.0F, 1.5708F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDarthLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, -0.7F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-2.0F, -16.0F, -2.0F, 4.0F, 13.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 22)
            .addBox(-1.5F, -3.0F, -1.4F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 36)
            .addBox(0.2F, -2.1F, -1.9F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 36)
            .addBox(-1.2F, -2.1F, -1.9F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 13)
            .addBox(-1.9F, -2.1F, -1.1F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 16)
            .addBox(-1.9F, -2.1F, 0.3F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 22)
            .addBox(-1.2F, -2.1F, 1.1F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 7)
            .addBox(0.2F, -2.1F, 1.1F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 10)
            .addBox(0.8F, -2.1F, 0.3F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 19)
            .addBox(0.8F, -2.1F, -1.1F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 0)
            .addBox(-2.5F, -14.9F, -2.5F, 5.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 7)
            .addBox(-2.5F, -7.2F, -2.5F, 5.0F, 2.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 14)
            .addBox(-1.5F, -24.0F, -1.5F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 4)
            .addBox(-0.5F, -20.9F, -1.7F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 17)
            .addBox(-2.0F, -24.7F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 36)
            .addBox(0.6F, -23.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(10, 34)
            .addBox(-1.6F, -23.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 30)
            .addBox(0.8F, -24.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 30)
            .addBox(-1.8F, -24.0F, -1.5F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(22, 25)
            .addBox(2.1F, -25.1F, -2.0F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 28)
            .addBox(-2.1F, -25.1F, -2.0F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 14)
            .addBox(-1.5F, -28.7F, -1.9F, 3.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 25)
            .addBox(-2.0F, -27.7F, -2.0F, 4.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(26, 34)
            .addBox(1.0F, -26.7F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 0)
            .addBox(-2.0F, -26.7F, -1.0F, 1.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(36, 22)
            .addBox(-2.0F, -27.7F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 38)
            .addBox(1.0F, -27.7F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 34)
            .addBox(-2.0F, -25.7F, 1.0F, 4.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(8, 29).addBox(1.0F, -1.0F, -1.0F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, -24.1F, -3.0F, 0.0F, -1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 19).addBox(1.0F, -1.0F, -1.0F, 0.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, -24.1F, 1.1F, 0.0F, -1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 28).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -23.0F, 0.8F, 0.0F, -1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bb_main.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(30, 24).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, -23.0F, -1.8F, 0.0F, -1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r5 = bb_main.addOrReplaceChild(
         "cube_r5",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(32, 32).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, -22.0F, 1.6F, 0.0F, 1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r6 = bb_main.addOrReplaceChild(
         "cube_r6",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(18, 34).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.5F, -22.0F, -0.6F, 0.0F, 1.5708F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createEzraLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone = partdefinition.addOrReplaceChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 29)
            .addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-3.0F, -24.0F, -3.0F, 6.0F, 13.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 21)
            .addBox(-3.0F, -38.0F, -3.0F, 6.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(32, 10)
            .addBox(-3.0F, -49.0F, -3.0F, 6.0F, 5.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 40)
            .addBox(-3.0F, -42.0F, -3.0F, 6.0F, 2.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 19)
            .addBox(-4.0F, -40.0F, -4.0F, 8.0F, 2.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-4.0F, -44.0F, -4.0F, 8.0F, 2.0F, 8.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(48, 37)
            .addBox(3.0F, -23.0F, -2.0F, 1.0F, 9.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 29)
            .addBox(-3.0F, -29.5F, -3.0F, 6.0F, 5.0F, 6.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(54, 56)
            .addBox(2.2F, -28.5F, -1.0F, 2.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(48, 29)
            .addBox(-2.0F, -37.0F, -2.0F, 4.0F, 4.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(44, 50)
            .addBox(-2.0F, -26.0F, -2.0F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(56, 19)
            .addBox(-2.0F, -12.0F, -2.5F, 4.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(56, 0)
            .addBox(-2.5F, -12.0F, -2.0F, 1.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(44, 56)
            .addBox(-2.0F, -12.0F, 1.5F, 4.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 56)
            .addBox(1.5F, -12.0F, -2.0F, 1.0F, 6.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(30, 57)
            .addBox(-2.0F, -34.0F, -2.5F, 4.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(56, 10)
            .addBox(1.5F, -34.0F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 57)
            .addBox(-2.0F, -34.0F, 1.5F, 4.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(10, 56)
            .addBox(-2.5F, -34.0F, -2.0F, 1.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 41)
            .addBox(-3.5F, -5.2F, -2.0F, 7.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bone.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(22, 48).addBox(-4.0F, -3.0F, -2.0F, 7.0F, 5.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -2.2F, -0.5F, 0.0F, 1.5708F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bone.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(24, 10).addBox(2.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.0F, -24.5F, 1.0F, -0.829F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, -25.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 128, 128);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createRampantLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(12, 17)
            .addBox(-1.5F, -9.25F, -1.5F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(-1.5F, 10.0F, -1.5F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.15F))
            .texOffs(0, 0)
            .addBox(-1.5F, 2.0F, -1.5F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 0)
            .addBox(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.1F))
            .texOffs(-1, 19)
            .addBox(-1.0F, -0.5F, 1.0F, 2.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .texOffs(0, 11)
            .addBox(-1.5F, -8.5F, -1.5F, 3.0F, 4.5F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 11)
            .addBox(-1.3F, -4.3F, -1.3F, 2.6F, 3.6F, 2.6F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 7.8F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createSkebobeLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -23.0F, -2.0F, 3.0F, 20.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-1.9F, -19.5F, -2.6F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 10)
            .addBox(-1.5F, -10.0F, -2.0F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.25F))
            .texOffs(4, 23)
            .addBox(-1.0F, -3.0F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 10)
            .addBox(-1.5F, -2.5F, -2.0F, 3.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 17)
            .addBox(-0.5F, -23.3F, -2.35F, 1.0F, 14.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(16, 17)
            .addBox(-0.5F, -23.3F, 0.35F, 1.0F, 14.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(21, 18)
            .addBox(0.8F, -23.3F, -0.95F, 1.0F, 14.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(0, 23)
            .addBox(-1.8F, -23.3F, -0.95F, 1.0F, 14.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(24, 15)
            .addBox(-0.5F, -9.0F, -2.75F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.001F))
            .texOffs(12, 5)
            .addBox(-2.0F, -24.0F, -2.5F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 26.0F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition saber = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 2.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMaulkillerLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -19.0F, -2.0F, 3.0F, 8.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 4)
            .addBox(-1.5F, -9.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 12)
            .addBox(-1.5F, -10.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(0, 25)
            .addBox(-1.5F, -11.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(8, 17)
            .addBox(-1.5F, -8.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(24, 0)
            .addBox(-1.5F, -4.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(20, 21)
            .addBox(-1.5F, -5.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(20, 17)
            .addBox(-1.5F, -7.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(8, 21)
            .addBox(-1.5F, -6.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(12, 4)
            .addBox(-1.5F, -21.5F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 25)
            .addBox(-1.5F, -13.2F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 25)
            .addBox(-1.5F, -15.2F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 29)
            .addBox(-1.0F, -20.5F, -1.5F, 2.0F, 2.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 29)
            .addBox(-0.5F, -20.5F, 0.7F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(30, 29)
            .addBox(-0.5F, -20.5F, -1.7F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 29)
            .addBox(1.2F, -20.5F, -1.0F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(26, 29)
            .addBox(-1.2F, -20.5F, -1.0F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 11)
            .addBox(-1.0F, -12.0F, -1.5F, 2.0F, 12.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 8)
            .addBox(-1.5F, -3.5F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 29)
            .addBox(-0.5F, -1.0F, -2.8F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 8)
            .addBox(-2.3F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 29)
            .addBox(1.3F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-1.5F, -2.0F, -2.0F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 8)
            .addBox(-0.5F, -1.0F, 0.8F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 11)
            .addBox(-2.0F, -1.6F, -2.5F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 23.5F, 0.5F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 29).addBox(1.091F, -2.091F, 1.05F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -15.9F, -3.2F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 8).addBox(1.091F, -2.091F, 1.05F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -13.8F, -3.4F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = group.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 29).addBox(1.091F, -2.091F, 1.05F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -14.1F, -0.5F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 2.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createMalgusLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition group = partdefinition.addOrReplaceChild(
         "group",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 18)
            .addBox(-1.464F, -0.455F, -1.562F, 3.0F, 6.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(20, 0)
            .addBox(-1.464F, -5.755F, -1.562F, 3.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.1F))
            .texOffs(28, 28)
            .addBox(-1.464F, -3.28F, 0.438F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 31)
            .addBox(-1.464F, -3.28F, -1.562F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 20)
            .addBox(-1.464F, -1.28F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 24)
            .addBox(-1.464F, -3.78F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 27)
            .addBox(-1.464F, -5.28F, -1.562F, 3.0F, 1.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(4, 31)
            .addBox(0.536F, -3.28F, -1.562F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 31)
            .addBox(0.536F, -3.28F, 0.438F, 1.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-2.464F, 0.545F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .texOffs(0, 0)
            .addBox(-2.464F, 1.845F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .texOffs(0, 0)
            .addBox(-2.464F, 3.545F, -2.562F, 5.0F, 1.0F, 5.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.9F))
            .texOffs(16, 31)
            .addBox(-0.464F, -2.855F, 1.138F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 31)
            .addBox(-0.464F, -2.855F, -1.262F, 1.0F, 2.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 31)
            .addBox(1.236F, -2.855F, -0.562F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(14, 31)
            .addBox(-1.164F, -2.855F, -0.562F, 0.0F, 2.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 6)
            .addBox(-1.464F, 5.045F, -1.562F, 3.0F, 9.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.3F))
            .texOffs(28, 11)
            .addBox(-2.464F, -8.155F, -0.562F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 20)
            .addBox(-4.464F, -10.155F, -0.062F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 28)
            .addBox(1.536F, -8.155F, -0.562F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 20)
            .addBox(1.536F, -10.155F, -0.062F, 3.0F, 11.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, 6)
            .addBox(-1.864F, 2.245F, -1.062F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(-1.964F, 11.645F, -2.062F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.6F)),
         net.minecraft.client.model.geom.PartPose.offset(-0.036F, 9.555F, 0.062F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = group.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 13).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(-0.6F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.036F, 13.645F, -0.062F, 0.0F, 0.7854F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = group.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(28, 18).addBox(1.091F, -2.091F, 1.05F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.036F, 1.945F, -0.062F, 0.0F, 0.0F, -0.7854F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 8.275F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 64, 64);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createCassiopeiaLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 12.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -19.0F, -1.5F, 3.0F, 19.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-2.0F, -12.0F, -2.0F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 7)
            .addBox(-2.0F, -2.9F, -2.0F, 4.0F, 3.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 14)
            .addBox(-2.0F, -19.1F, -2.0F, 4.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(12, 19).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -9.8F, -1.3F, 0.0F, 0.0F, 0.7854F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createWookieeLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 7.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(26, 11)
            .addBox(-0.2F, -20.0F, -0.3F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(26, 11)
            .addBox(-0.8F, -20.0F, -0.3F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 0).addBox(-0.1F, -8.95F, -0.1F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(1.5F, -9.05F, 0.4F, -3.1416F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(0, 20).addBox(-0.1F, -8.95F, -0.1F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.7F, -9.05F, 0.4F, -3.1416F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 10)
            .addBox(-0.9F, -10.95F, -0.1F, 1.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 17)
            .addBox(-0.9F, -7.95F, -0.9F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 0)
            .addBox(-0.1F, -10.95F, -0.1F, 1.0F, 9.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 17)
            .addBox(-0.1F, -7.95F, -0.9F, 1.0F, 6.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-0.8F, -8.55F, -0.8F, 1.0F, 13.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(-0.8F, -11.55F, -0.2F, 1.0F, 15.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 0)
            .addBox(-0.2F, -8.55F, -0.8F, 1.0F, 13.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 0)
            .addBox(-0.2F, -11.55F, -0.2F, 1.0F, 17.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -8.45F, 0.0F, -3.1416F, 0.0F, 3.1416F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r4 = bb_main.addOrReplaceChild(
         "cube_r4",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(8, 24)
            .addBox(-0.1F, 3.45F, -0.9F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 20)
            .addBox(-0.1F, 3.45F, -0.1F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 13)
            .addBox(-0.9F, 3.45F, -0.1F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 5)
            .addBox(-0.9F, 3.45F, -0.9F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(-0.3F, 3.95F, -0.7F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 7)
            .addBox(-0.3F, 3.95F, -0.3F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(4, 20)
            .addBox(-0.7F, 3.95F, -0.3F, 1.0F, 5.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(20, 19)
            .addBox(-0.7F, 3.95F, -0.7F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.0F, -10.45F, 0.0F, -3.1416F, 0.0F, 3.1416F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createBrickLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 6.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -18.0F, -1.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 1)
            .addBox(0.0F, -11.0F, -1.0F, 2.0F, 3.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(0.75F, -14.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 6)
            .addBox(0.55F, -13.25F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 8)
            .addBox(0.75F, -16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 5)
            .addBox(1.55F, -17.0F, -1.5F, 0.0F, 2.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createCrewLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 6.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -18.0F, -1.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-1.6F, -20.0F, -1.5F, 0.0F, 5.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 8)
            .addBox(-1.6F, -19.0F, -1.51F, 2.0F, 4.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 12)
            .addBox(-1.6F, -19.0F, 1.51F, 2.0F, 4.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 8)
            .addBox(0.75F, -13.0F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 19)
            .addBox(-0.5F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createGeneralLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition bone = partdefinition.addOrReplaceChild(
         "bone",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.0F, -14.0F, -2.0F, 3.0F, 14.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 17)
            .addBox(-1.25F, -12.5F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-1.0F, -20.0F, -2.0F, 3.0F, 4.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(26, 26)
            .addBox(-1.0F, -23.0F, -2.0F, 0.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 10)
            .addBox(2.0F, -23.0F, -2.0F, 0.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(28, -2)
            .addBox(0.5F, -22.0F, -4.0F, 0.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 16)
            .addBox(0.5F, -22.0F, 1.0F, 0.0F, 6.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 10)
            .addBox(-1.0F, -16.0F, 1.0F, 3.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 16)
            .addBox(2.0F, -16.0F, -2.0F, 0.0F, 3.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 29)
            .addBox(-1.0F, -16.0F, -2.0F, 3.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 17)
            .addBox(-0.5F, -14.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 20)
            .addBox(-0.5F, -16.5F, -1.5F, 2.0F, 1.0F, 2.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(18, 13)
            .addBox(0.0F, -15.5F, -1.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.5F, 24.0F, -0.5F, 0.0F, 3.1416F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 4.0F, 0.0F));
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createShieldLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 6.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -18.1F, -1.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-2.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 6)
            .addBox(-1.5F, -21.1F, -1.5F, 3.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 9)
            .addBox(-1.5F, -21.1F, 1.5F, 3.0F, 3.0F, 0.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 12)
            .addBox(-1.5F, -21.1F, 0.5F, 0.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(14, 12)
            .addBox(-1.5F, -21.1F, -1.5F, 0.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 16)
            .addBox(1.5F, -21.1F, -1.5F, 0.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 12)
            .addBox(1.5F, -21.1F, 0.5F, 0.0F, 3.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(20, 11).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.75F, -11.65F, 0.5F, 1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(17, 18).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(0.75F, -15.5F, 0.0F, 0.7854F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createWarriorLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 6.0F, 0.0F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-1.5F, -18.0F, -1.5F, 3.0F, 18.0F, 3.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 3)
            .addBox(0.75F, -11.5F, -0.5F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(-11, 21)
            .addBox(-5.5F, -16.0F, -5.5F, 11.0F, 0.0F, 11.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(11, 11)
            .addBox(5.5F, -16.0F, -0.5F, 1.0F, 0.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(11, 11)
            .addBox(-6.5F, -16.0F, -0.5F, 1.0F, 0.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(11, 11)
            .addBox(-0.5F, -16.0F, 5.5F, 1.0F, 0.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(11, 11)
            .addBox(-0.5F, -16.0F, -6.5F, 1.0F, 0.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }

   public static net.minecraft.client.model.geom.builders.LayerDefinition createDarkLayer() {
      net.minecraft.client.model.geom.builders.MeshDefinition meshdefinition = new net.minecraft.client.model.geom.builders.MeshDefinition();
      net.minecraft.client.model.geom.builders.PartDefinition partdefinition = meshdefinition.getRoot();
      net.minecraft.client.model.geom.builders.PartDefinition blade = partdefinition.addOrReplaceChild("blade", net.minecraft.client.model.geom.builders.CubeListBuilder.create(), net.minecraft.client.model.geom.PartPose.offset(0.0F, 7.5F, 0.9F));
      net.minecraft.client.model.geom.builders.PartDefinition bb_main = partdefinition.addOrReplaceChild(
         "bb_main",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-0.1F, -17.5F, -0.1F, 1.0F, 17.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(4, 0)
            .addBox(-0.1F, -16.5F, -0.9F, 1.0F, 16.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 0)
            .addBox(-0.9F, -17.5F, -0.1F, 1.0F, 17.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 0)
            .addBox(-0.9F, -16.5F, -0.9F, 1.0F, 16.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(-0.8F, -4.0F, -0.8F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(4, 18)
            .addBox(-0.8F, -4.0F, -0.2F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 18)
            .addBox(-0.2F, -4.0F, -0.2F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 18)
            .addBox(-0.2F, -4.0F, -0.8F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 20)
            .addBox(-0.5F, -10.5F, 0.4F, 1.0F, 1.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(8, 18)
            .addBox(-0.2F, -8.0F, -0.2F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(4, 18)
            .addBox(-0.8F, -8.0F, -0.2F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(0, 18)
            .addBox(-0.8F, -8.0F, -0.8F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(12, 18)
            .addBox(-0.2F, -8.0F, -0.8F, 1.0F, 4.0F, 1.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r1 = bb_main.addOrReplaceChild(
         "cube_r1",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 5).addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1F, -15.8394F, 1.8491F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r2 = bb_main.addOrReplaceChild(
         "cube_r2",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create().texOffs(16, 15).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1F, -15.8394F, 1.7491F, -1.5708F, 0.0F, 0.0F)
      );
      net.minecraft.client.model.geom.builders.PartDefinition cube_r3 = bb_main.addOrReplaceChild(
         "cube_r3",
         net.minecraft.client.model.geom.builders.CubeListBuilder.create()
            .texOffs(16, 10)
            .addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F))
            .texOffs(16, 0)
            .addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 4.0F, new net.minecraft.client.model.geom.builders.CubeDeformation(0.0F)),
         net.minecraft.client.model.geom.PartPose.offsetAndRotation(-0.1F, -13.3F, 0.1F, 0.4189F, 0.0F, 0.0F)
      );
      return net.minecraft.client.model.geom.builders.LayerDefinition.create(meshdefinition, 32, 32);
   }
}
