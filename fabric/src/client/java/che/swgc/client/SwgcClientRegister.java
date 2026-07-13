package che.swgc.client;

import che.swgc.client.model.CommonModelLayers;
import che.swgc.client.model.PlasmaRodModel;
import che.swgc.client.model.armor.CloneArmorModel;
import che.swgc.client.model.item.BlasterModel;
import che.swgc.client.model.item.EwokSpearModel;
import che.swgc.client.model.item.EwokStaffModel;
import che.swgc.client.model.item.ForcePikeModel;
import che.swgc.client.model.item.LightsaberModel;
import che.swgc.client.renderer.item.CloneItemRenderer;
import che.swgc.client.renderer.item.DarkSaberItemRenderer;
import che.swgc.client.renderer.item.ForcePikeItemRenderer;
import che.swgc.client.renderer.item.LightsaberItemRenderer;
import che.swgc.client.renderer.item.SimpleItemRenderer;
import che.swgc.client.renderer.item.SwgcItemRendererRegistry;
import che.swgc.client.renderer.item.ThreeDimensionalArmorItemRenderer;
import che.swgc.item.CustomArmorItem;
import che.swgc.reg.SwgcItems;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;

public class SwgcClientRegister {
   public SwgcClientRegister() {
   }

   public static void registerEntityLayers(BiConsumer<ModelLayerLocation, Supplier<LayerDefinition>> register) {
      LightsaberModel.regLayers(register);
      register.accept(PlasmaRodModel.LAYER_LOCATION, PlasmaRodModel::createBodyLayer);
      register.accept(BlasterModel.DC15A_LAYER_LOCATION, BlasterModel::createDc15aLayer);
      register.accept(BlasterModel.DC15S_LAYER_LOCATION, BlasterModel::createDc15sLayer);
      register.accept(BlasterModel.DC17_LAYER_LOCATION, BlasterModel::createDc17Layer);
      register.accept(BlasterModel.DH17_LAYER_LOCATION, BlasterModel::createDh17Layer);
      register.accept(BlasterModel.E5_LAYER_LOCATION, BlasterModel::createE5Layer);
      register.accept(BlasterModel.TL50_LAYER_LOCATION, BlasterModel::createTl50Layer);
      register.accept(BlasterModel.JAWA_LAYER_LOCATION, BlasterModel::createJawaLayer);
      register.accept(ForcePikeModel.LAYER_LOCATION, ForcePikeModel::createBodyLayer);
      register.accept(EwokSpearModel.LAYER_LOCATION, EwokSpearModel::createBodyLayer);
      register.accept(EwokStaffModel.LAYER_LOCATION, EwokStaffModel::createBodyLayer);
      register.accept(CloneArmorModel.OUTER_LAYER_LOCATION, CloneArmorModel::createOuterLayer);
      register.accept(CloneArmorModel.CLONE_104TH_BATTALION_LOCATION, CloneArmorModel::create104thBattalionLayer);
      register.accept(CommonModelLayers.PLAYER_EMPTY_LOCATION, CommonModelLayers::createEmptyPlayerModel);
      register.accept(CommonModelLayers.SIMPLE_INNER_LAYER_LOCATION, CommonModelLayers::createSimpleInnerLayer);
   }

   public static void registerItemRenderers(EntityModelSet models) {
      SwgcItemRendererRegistry registry = SwgcItemRendererRegistry.INSTANCE;
      registry.register(SwgcItems.LIGHTSABER, modelSet -> new LightsaberItemRenderer(modelSet));
      registry.register(SwgcItems.DARKSABER, DarkSaberItemRenderer::new);
      registry.register(SwgcItems.DC15A, modelSet -> SimpleItemRenderer.blaster(modelSet, "dc15a"));
      registry.register(SwgcItems.DC15S, modelSet -> SimpleItemRenderer.blaster(modelSet, "dc15s"));
      registry.register(SwgcItems.DC17, modelSet -> SimpleItemRenderer.blaster(modelSet, "dc17"));
      registry.register(SwgcItems.DH17, modelSet -> SimpleItemRenderer.blaster(modelSet, "dh17"));
      registry.register(SwgcItems.E5, modelSet -> SimpleItemRenderer.blaster(modelSet, "e5"));
      registry.register(SwgcItems.TL50, modelSet -> SimpleItemRenderer.blaster(modelSet, "tl50"));
      registry.register(SwgcItems.JAWA_BLASTER, modelSet -> SimpleItemRenderer.blaster(modelSet, "jawa"));
      registry.register(SwgcItems.FORCE_PIKE, ForcePikeItemRenderer::new);
      registry.register(SwgcItems.EWOK_SPEAR, SimpleItemRenderer::ewokSpear);
      registry.register(SwgcItems.EWOK_STAFF, SimpleItemRenderer::ewokStaff);
      registry.register(SwgcItems.CLONE, CloneItemRenderer::new);
      registerArmorSet(registry, models, SwgcItems.JEDI_FEMALE_ARMOR);
      registerArmorSet(registry, models, SwgcItems.JEDI_MALE_ARMOR);
      registerArmorSet(registry, models, SwgcItems.JEDI_MALE_2_ARMOR);
      registerArmorSet(registry, models, SwgcItems.SITH_FEMALE_ARMOR);
      registerArmorSet(registry, models, SwgcItems.SITH_MALE_ARMOR);
      registerArmorSet(registry, models, SwgcItems.SITH_MALE_2_ARMOR);
      registerArmorSet(registry, models, SwgcItems.ROYAL_GUARD_ARMOR);
      for (CustomArmorItem.Materials material : CustomArmorItem.Materials.values()) {
         if (material == CustomArmorItem.Materials.JEDI_FEMALE) {
            break;
         }

         CustomArmorItem.getCloneSet(material.armor())
            .ifPresent(
               cloneArmor -> cloneArmor.values().forEach(supplier -> registry.register(supplier, modelSet -> new ThreeDimensionalArmorItemRenderer(modelSet, supplier.get())))
            );
      }
   }

   private static void registerArmorSet(SwgcItemRendererRegistry registry, EntityModelSet models, Map<?, Supplier<CustomArmorItem>> armor) {
      for (Supplier<CustomArmorItem> supplier : armor.values()) {
         CustomArmorItem item = supplier.get();
         registry.register(item, new ThreeDimensionalArmorItemRenderer(models, item));
      }
   }

   public static void registerEntityRenderers(EntityRendererRegister entities, BlockEntityRendererRegister blockEntities) {
   }

   @FunctionalInterface
   public interface BlockEntityRendererRegister {
      void registerBlockEntityRenderer(net.minecraft.world.level.block.entity.BlockEntityType<?> type, Object factory);
   }

   @FunctionalInterface
   public interface EntityRendererRegister {
      <T extends Entity> void register(EntityType<T> type, EntityRendererProvider<T> factory);
   }
}
