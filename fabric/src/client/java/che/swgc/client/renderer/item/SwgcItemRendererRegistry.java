package che.swgc.client.renderer.item;

import che.swgc.item.CustomArmorItem;
import che.swgc.reg.SwgcItems;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.FabricModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.special.SpecialModelRenderers;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.ItemLike;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;

public final class SwgcItemRendererRegistry {
   public static final SwgcItemRendererRegistry INSTANCE = new SwgcItemRendererRegistry();
   private static final Identifier BUILTIN_ITEM_TYPE = Identifier.fromNamespaceAndPath("swgc", "builtin_item");
   private static final Map<Identifier, Function<EntityModelSet, ItemRenderer>> FACTORIES = new HashMap<>();
   private static final Map<ModelLayerLocation, HumanoidModel<HumanoidRenderState>> ARMOR_MODELS = new HashMap<>();

   private SwgcItemRendererRegistry() {
   }

   public void register(ItemLike itemLike, SwgcItemRendererRegistry.DynamicItemRenderer renderer) {
      Identifier rendererId = Identifier.fromNamespaceAndPath("swgc", BuiltInRegHelper.getPath(itemLike));
      registerRenderer(rendererId, models -> new DynamicItemRendererAdapter(renderer));
   }

   public void register(ItemLike itemLike, Function<EntityModelSet, ? extends ItemRenderer> factory) {
      Identifier rendererId = Identifier.fromNamespaceAndPath("swgc", BuiltInRegHelper.getPath(itemLike));
      registerRenderer(rendererId, factory);
   }

   public void registerRenderer(Identifier rendererId, Function<EntityModelSet, ? extends ItemRenderer> factory) {
      FACTORIES.put(rendererId, models -> factory.apply(models));
   }

   public Function<EntityModelSet, ItemRenderer> getFactory(Identifier rendererId) {
      return FACTORIES.get(rendererId);
   }

   public static void registerAll() {
      SpecialModelRenderers.ID_MAPPER.put(BUILTIN_ITEM_TYPE, SwgcItemSpecialRenderer.Unbaked.MAP_CODEC);

      INSTANCE.register(SwgcItems.LIGHTSABER.get(), LightsaberItemRenderer::new);
      INSTANCE.register(SwgcItems.DARKSABER.get(), DarkSaberItemRenderer::new);
      Set.of(SwgcItems.DC15A, SwgcItems.DC15S, SwgcItems.DC17, SwgcItems.DH17, SwgcItems.E5, SwgcItems.TL50)
         .forEach(
            supplier -> INSTANCE.register(
                  supplier.get(),
                  models -> SimpleItemRenderer.blaster(models, BuiltInRegHelper.getPath(supplier.get()))
               )
         );
      INSTANCE.register(SwgcItems.JAWA_BLASTER.get(), models -> SimpleItemRenderer.blaster(models, "jawa"));
      INSTANCE.register(SwgcItems.FORCE_PIKE.get(), ForcePikeItemRenderer::new);
      INSTANCE.register(SwgcItems.EWOK_SPEAR.get(), SimpleItemRenderer::ewokSpear);
      INSTANCE.register(SwgcItems.EWOK_STAFF.get(), SimpleItemRenderer::ewokStaff);
      INSTANCE.register(SwgcItems.CLONE.get(), CloneItemRenderer::new);

      CustomArmorItem.cloneSets().values().forEach(SwgcItemRendererRegistry::register3dArmorRenderer);
      register3dArmorRenderer(SwgcItems.ROYAL_GUARD_ARMOR);
      register3dArmorRenderer(SwgcItems.JEDI_FEMALE_ARMOR);
      register3dArmorRenderer(SwgcItems.JEDI_MALE_ARMOR);
      register3dArmorRenderer(SwgcItems.JEDI_MALE_2_ARMOR);
      register3dArmorRenderer(SwgcItems.SITH_FEMALE_ARMOR);
      register3dArmorRenderer(SwgcItems.SITH_MALE_ARMOR);
      register3dArmorRenderer(SwgcItems.SITH_MALE_2_ARMOR);
   }

   private static void register3dArmorRenderer(Map<ArmorType, ? extends java.util.function.Supplier<? extends CustomArmorItem>> map) {
      map.values().forEach(supplier -> {
         CustomArmorItem item = supplier.get();
         INSTANCE.register(item, models -> new ThreeDimensionalArmorItemRenderer(models, item));
         ArmorRenderer.register(
            (poseStack, submitNodeCollector, stack, humanoidRenderState, slot, light, contextModel) -> renderWornArmor(
                  poseStack, submitNodeCollector, stack, humanoidRenderState, light, contextModel
               ),
            item
         );
      });
   }

   private static void renderWornArmor(
      PoseStack poseStack,
      SubmitNodeCollector submitNodeCollector,
      ItemStack stack,
      HumanoidRenderState humanoidRenderState,
      int light,
      HumanoidModel<?> contextModel
   ) {
      CustomArmorItem item = (CustomArmorItem)stack.getItem();
      ModelLayerLocation layer = new ModelLayerLocation(item.layerId, item.layerName);
      HumanoidModel<HumanoidRenderState> armorModel = ARMOR_MODELS.computeIfAbsent(
         layer, location -> new HumanoidModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(location))
      );
      ((FabricModel)contextModel).copyTransforms(armorModel);
      armorModel.setupAnim(humanoidRenderState);
      var renderType = ThreeDimensionalArmorItemRenderer.renderType(item);
      var parts = switch (item.getType()) {
         case HELMET -> Set.of(armorModel.head, armorModel.hat);
         case CHESTPLATE -> Set.of(armorModel.body, armorModel.rightArm, armorModel.leftArm);
         default -> Set.of(armorModel.rightLeg, armorModel.leftLeg);
      };

      for (var part : parts) {
         submitNodeCollector.order(0).submitModelPart(part, poseStack, renderType, light, net.minecraft.client.renderer.texture.OverlayTexture.NO_OVERLAY, null);
      }
   }

   @FunctionalInterface
   public interface DynamicItemRenderer {
      void render(
         net.minecraft.world.item.ItemStack stack,
         net.minecraft.world.item.ItemDisplayContext mode,
         com.mojang.blaze3d.vertex.PoseStack matrices,
         net.minecraft.client.renderer.SubmitNodeCollector vertexConsumers,
         int light,
         int overlay
      );
   }

   private static final class DynamicItemRendererAdapter implements ItemRenderer {
      private final DynamicItemRenderer delegate;

      private DynamicItemRendererAdapter(DynamicItemRenderer delegate) {
         this.delegate = delegate;
      }

      @Override
      public void render(
         ItemStack stack,
         net.minecraft.world.item.ItemDisplayContext ctx,
         com.mojang.blaze3d.vertex.PoseStack poseStack,
         net.minecraft.client.renderer.SubmitNodeCollector src,
         float partialTick,
         int packedLight,
         int packedOverlay
      ) {
         this.delegate.render(stack, ctx, poseStack, src, packedLight, packedOverlay);
      }
   }

   private static final class BuiltInRegHelper {
      private BuiltInRegHelper() {
      }

      static String getPath(ItemLike itemLike) {
         return net.minecraft.core.registries.BuiltInRegistries.ITEM.getKey(itemLike.asItem()).getPath();
      }
   }
}
