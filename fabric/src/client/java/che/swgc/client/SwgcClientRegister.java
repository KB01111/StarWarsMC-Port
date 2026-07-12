package che.swgc.client;

import che.swgc.client.model.CommonModelLayers;
import che.swgc.client.model.PlasmaRodModel;
import che.swgc.client.model.armor.CloneArmorModel;
import che.swgc.client.model.armor.JediArmorModel;
import che.swgc.client.model.armor.RoyalGuardArmorModel;
import che.swgc.client.model.armor.SithArmorModel;
import che.swgc.client.model.entity.AtrtModel;
import che.swgc.client.model.entity.AtstModel;
import che.swgc.client.model.entity.B1Model;
import che.swgc.client.model.entity.B2Model;
import che.swgc.client.model.entity.Delta7BModel;
import che.swgc.client.model.entity.DroidekaModel;
import che.swgc.client.model.entity.EwokModel;
import che.swgc.client.model.entity.EwokShamanModel;
import che.swgc.client.model.entity.JawaModel;
import che.swgc.client.model.entity.ObeseWanModel;
import che.swgc.client.model.entity.RoyalGuardianModel;
import che.swgc.client.model.item.BlasterModel;
import che.swgc.client.model.item.EwokSpearModel;
import che.swgc.client.model.item.EwokStaffModel;
import che.swgc.client.model.item.ForcePikeModel;
import che.swgc.client.model.item.LightsaberModel;
import che.swgc.client.renderer.blockentity.GasHarvesterScreenRenderer;
import che.swgc.client.renderer.entity.AtrtRenderer;
import che.swgc.client.renderer.entity.AtstRenderer;
import che.swgc.client.renderer.entity.B1Renderer;
import che.swgc.client.renderer.entity.BlasterBoltRenderer;
import che.swgc.client.renderer.entity.Delta7BRenderer;
import che.swgc.client.renderer.entity.DroidekaRenderer;
import che.swgc.client.renderer.entity.EwokRenderer;
import che.swgc.client.renderer.entity.EwokShamanRenderer;
import che.swgc.client.renderer.entity.EwokSpearRenderer;
import che.swgc.client.renderer.entity.GlowmaskMobRenderer;
import che.swgc.client.renderer.entity.JawaRenderer;
import che.swgc.client.renderer.entity.ObeseWanRenderer;
import che.swgc.client.renderer.entity.RoyalGuardianRenderer;
import che.swgc.client.renderer.entity.ThrownLightsaberRenderer;
import che.swgc.client.renderer.entity.ArmoredHumanoidRenderer;
import che.swgc.reg.SwgcBlockEntities;
import che.swgc.reg.SwgcEntities;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

public final class SwgcClientRegister {
   private SwgcClientRegister() {
   }

   public static void registerEntityLayers(BiConsumer<ModelLayerLocation, Supplier<LayerDefinition>> register) {
      register.accept(CommonModelLayers.PLAYER_EMPTY_LOCATION, CommonModelLayers::createEmptyPlayerModel);
      register.accept(CommonModelLayers.SIMPLE_INNER_LAYER_LOCATION, CommonModelLayers::createSimpleInnerLayer);
      register.accept(AtrtModel.LAYER_LOCATION, AtrtModel::createBodyLayer);
      register.accept(AtstModel.LAYER_LOCATION, AtstModel::createBodyLayer);
      register.accept(B1Model.LAYER_LOCATION, B1Model::createBodyLayer);
      register.accept(B2Model.LAYER_LOCATION, B2Model::createBodyLayer);
      register.accept(Delta7BModel.LAYER_LOCATION, Delta7BModel::createBodyLayer);
      register.accept(Delta7BModel.GLASS_LOCATION, Delta7BModel::createGlassLayer);
      register.accept(DroidekaModel.LAYER_LOCATION, DroidekaModel::createBodyLayer);
      register.accept(EwokModel.LAYER_LOCATION, EwokModel::createBodyLayer);
      register.accept(EwokShamanModel.LAYER_LOCATION, EwokShamanModel::createBodyLayer);
      register.accept(JawaModel.LAYER_LOCATION, JawaModel::createBodyLayer);
      register.accept(ObeseWanModel.LAYER_LOCATION, ObeseWanModel::createBodyLayer);
      register.accept(PlasmaRodModel.LAYER_LOCATION, PlasmaRodModel::createBodyLayer);
      register.accept(RoyalGuardianModel.LAYER_LOCATION, RoyalGuardianModel::createBodyLayer);
      register.accept(CloneArmorModel.OUTER_LAYER_LOCATION, CloneArmorModel::createOuterLayer);
      register.accept(CloneArmorModel.CLONE_104TH_BATTALION_LOCATION, CloneArmorModel::create104thBattalionLayer);
      register.accept(JediArmorModel.FEMALE_OUTER_LOCATION, JediArmorModel::createFemaleOuterLayer);
      register.accept(JediArmorModel.FEMALE_INNER_LOCATION, JediArmorModel::createFemaleInnerLayer);
      register.accept(JediArmorModel.MALE_OUTER_LOCATION, JediArmorModel::createMaleOuterLayer);
      register.accept(JediArmorModel.MALE_INNER_LOCATION, JediArmorModel::createMaleInnerLayer);
      register.accept(JediArmorModel.MALE_2_OUTER_LOCATION, JediArmorModel::createMale2OuterLayer);
      register.accept(SithArmorModel.FEMALE_LOCATION, SithArmorModel::createFemaleLayer);
      register.accept(SithArmorModel.MALE_LOCATION, SithArmorModel::createMaleLayer);
      register.accept(SithArmorModel.MALE_2_OUTER_LOCATION, SithArmorModel::createMale2OuterLayer);
      register.accept(SithArmorModel.MALE_2_INNER_LOCATION, SithArmorModel::createMale2InnerLayer);
      register.accept(RoyalGuardArmorModel.OUTER_LAYER_LOCATION, RoyalGuardArmorModel::createOuterLayer);
      register.accept(RoyalGuardArmorModel.INNER_LAYER_LOCATION, RoyalGuardArmorModel::createInnerLayer);
      register.accept(BlasterModel.DC15S_LAYER_LOCATION, BlasterModel::createDc15sLayer);
      register.accept(BlasterModel.DC17_LAYER_LOCATION, BlasterModel::createDc17Layer);
      register.accept(BlasterModel.TL50_LAYER_LOCATION, BlasterModel::createTl50Layer);
      register.accept(BlasterModel.DH17_LAYER_LOCATION, BlasterModel::createDh17Layer);
      register.accept(BlasterModel.E5_LAYER_LOCATION, BlasterModel::createE5Layer);
      register.accept(BlasterModel.DC15A_LAYER_LOCATION, BlasterModel::createDc15aLayer);
      register.accept(BlasterModel.JAWA_LAYER_LOCATION, BlasterModel::createJawaLayer);
      register.accept(EwokSpearModel.LAYER_LOCATION, EwokSpearModel::createBodyLayer);
      register.accept(EwokStaffModel.LAYER_LOCATION, EwokStaffModel::createBodyLayer);
      register.accept(ForcePikeModel.LAYER_LOCATION, ForcePikeModel::createBodyLayer);
      LightsaberModel.regLayers(register);
   }

   public static void registerEntityRenderers(EntityRendererRegister entities, BlockEntityRendererRegister blockEntities) {
      entities.register(SwgcEntities.ATRT.get(), AtrtRenderer::new);
      entities.register(SwgcEntities.ATST.get(), AtstRenderer::new);
      entities.register(SwgcEntities.DELTA7B.get(), Delta7BRenderer::new);
      entities.register(SwgcEntities.B1.get(), B1Renderer::new);
      entities.register(SwgcEntities.B2.get(), ctx -> new GlowmaskMobRenderer<>(ctx, new B2Model(ctx.bakeLayer(B2Model.LAYER_LOCATION)), "b2", 0.4F));
      entities.register(SwgcEntities.DROIDEKA.get(), DroidekaRenderer::new);
      entities.register(SwgcEntities.CLONE.get(), ArmoredHumanoidRenderer::new);
      entities.register(SwgcEntities.ROYAL_GURDIAN.get(), RoyalGuardianRenderer::new);
      entities.register(SwgcEntities.EWOK.get(), EwokRenderer::new);
      entities.register(SwgcEntities.EWOK_SHAMAN.get(), EwokShamanRenderer::new);
      entities.register(SwgcEntities.JAWA.get(), JawaRenderer::new);
      entities.register(SwgcEntities.OBESE_WAN.get(), ObeseWanRenderer::new);
      entities.register(SwgcEntities.THROWN_LIGHTSABER.get(), ThrownLightsaberRenderer::new);
      entities.register(SwgcEntities.BLASTER_BOLT.get(), BlasterBoltRenderer::new);
      entities.register(SwgcEntities.EWOK_SPEAR.get(), EwokSpearRenderer::new);
      blockEntities.registerBlockEntityRenderer(SwgcBlockEntities.GAS_HARVESTER.get(), GasHarvesterScreenRenderer::new);
   }

   @FunctionalInterface
   public interface BlockEntityRendererRegister {
      <T extends net.minecraft.world.level.block.entity.BlockEntity, S extends net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState> void registerBlockEntityRenderer(
         net.minecraft.world.level.block.entity.BlockEntityType<T> type,
         net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider<T, S> factory
      );
   }

   @FunctionalInterface
   public interface EntityRendererRegister {
      <T extends Entity> void register(EntityType<T> type, EntityRendererProvider<T> factory);
   }
}
