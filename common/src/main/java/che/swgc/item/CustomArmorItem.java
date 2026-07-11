package che.swgc.item;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import che.swgc.reg.IRegister;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.util.Util;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.network.chat.Component;

@javax.annotation.ParametersAreNonnullByDefault
public class CustomArmorItem extends Item {
   public static final Predicate<Integer> RENDER_NOTHING = part -> false;
   public static final Predicate<Integer> RENDER_HEAD_ONLY = part -> part == 0;
   private static final HashMap<ArmorMaterial, Map<ArmorType, ? extends Supplier<? extends CustomArmorItem>>> CLONE_SETS = new HashMap<>();
   public final Identifier layerId;
   public final String layerName;
   private final Predicate<Integer> renderPlayerPart;
   private final ArmorMaterial material;
   private final ArmorType type;

   public CustomArmorItem(
      ArmorMaterial material, ArmorType type, Identifier layerId, String layerName, Predicate<Integer> renderPlayerPart, Properties properties
   ) {
      super(properties);
      this.material = material;
      this.type = type;
      this.layerId = layerId;
      this.layerName = layerName;
      this.renderPlayerPart = renderPlayerPart;
   }

   public static Properties armorProperties(ArmorMaterial material, ArmorType type, int baseDurability) {
      return IRegister.itemProperties()
         .humanoidArmor(material, type)
         .durability(type.getDurability(baseDurability));
   }

   public ArmorMaterial getMaterial() {
      return this.material;
   }

   public ArmorType getType() {
      return this.type;
   }

   public boolean shouldRenderPlayerPart(int part) {
      return this.renderPlayerPart.test(part);
   }

   public Component getName(ItemStack stack) {
      String clone = getCloneId(this.material, Materials.nameOf(this.material));
      return clone != null
         ? Component.translatable(clone, Component.translatable("item.swgc." + this.type.getName()))
         : super.getName(stack);
   }

   @Nullable
   public static String getCloneId(@Nullable ArmorMaterial material, @Nullable String materialName) {
      return material != null && materialName != null && materialName.substring(materialName.indexOf(58) + 1).startsWith("clone_")
         ? Util.makeDescriptionId("clone", Identifier.parse(materialName).withPath(path -> path.substring(6)))
         : null;
   }

   public static Map<ArmorMaterial, Map<ArmorType, ? extends Supplier<? extends CustomArmorItem>>> cloneSets() {
      return Map.copyOf(CLONE_SETS);
   }

   public static Optional<Map<ArmorType, ? extends Supplier<? extends CustomArmorItem>>> getCloneSet(ArmorMaterial material) {
      return Optional.ofNullable(CLONE_SETS.get(material));
   }

   public static void regCloneSet(ArmorMaterial material, Map<ArmorType, ? extends Supplier<? extends CustomArmorItem>> set) {
      CLONE_SETS.put(material, set);
   }

   public static enum Materials {
      CLONE_PHASE_2("phase_2"),
      CLONE_7TH_LEGION("7th_legion"),
      CLONE_13TH_BATTALION("13th_battalion"),
      CLONE_31ST_LEGION("31st_legion"),
      CLONE_41ST_ELITE_CORPS("41st_elite_corps"),
      CLONE_87TH_SENTINEL_CORPS("87th_sentinel_corps"),
      CLONE_91ST_RECON_CORPS("91st_recon_corps"),
      CLONE_104TH_BATTALION("104th_battalion"),
      CLONE_187TH_LEGION("187th_legion"),
      CLONE_212TH_BATTALION("212th_battalion"),
      CLONE_305TH_LEGION("305th_legion"),
      CLONE_332ND_COMPANY("332nd_company"),
      CLONE_442ND_BATTALION("442nd_battalion"),
      CLONE_497TH_BATTALION("497th_battalion"),
      CLONE_501ST_LEGION("501st_legion"),
      CLONE_615TH_LEGION("615th_legion"),
      CLONE_CORUSCANT_GUARD("coruscant_guard"),
      JEDI_FEMALE("jedi_female", cloneDefense(2, 4, 6, 0), 24, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, Items.STRING),
      ROYAL_GUARD("royal_guard", cloneDefense(3, 6, 8, 3), 6, SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 0.0F, Items.IRON_INGOT),
      JEDI_MALE("jedi_male", cloneDefense(2, 4, 6, 0), 24, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, Items.STRING),
      JEDI_MALE_2("jedi_male_2", cloneDefense(2, 4, 6, 0), 24, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, Items.STRING),
      SITH_FEMALE("sith_female", cloneDefense(2, 4, 6, 0), 24, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, Items.STRING),
      SITH_MALE("sith_male", cloneDefense(2, 4, 6, 0), 24, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, Items.STRING),
      SITH_MALE_2("sith_male_2", cloneDefense(2, 4, 6, 0), 24, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, Items.STRING);

      private final String registryName;
      private final ArmorMaterial armor;

      Materials(String id) {
         this("clone_" + id, cloneDefense(3, 5, 7, 2), 6, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.0F, Items.IRON_INGOT);
      }

      Materials(String id, Map<ArmorType, Integer> defense, int enchantability, Holder<SoundEvent> sound, float toughness, float knockbackResistance, Item repairItem) {
         this.registryName = "swgc:" + id;
         this.armor = new ArmorMaterial(
            20,
            defense,
            enchantability,
            sound,
            toughness,
            knockbackResistance,
            TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.parse(this.registryName + "_repair")),
            ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse(this.registryName))
         );
      }

      public ArmorMaterial armor() {
         return this.armor;
      }

      public String getName() {
         return this.registryName;
      }

      @Nullable
      public static String nameOf(@Nullable ArmorMaterial material) {
         if (material == null) {
            return null;
         }
         for (Materials value : values()) {
            if (value.armor == material) {
               return value.registryName;
            }
         }
         return null;
      }

      private static Map<ArmorType, Integer> cloneDefense(int boots, int leggings, int chest, int helmet) {
         return Map.of(
            ArmorType.BOOTS, boots,
            ArmorType.LEGGINGS, leggings,
            ArmorType.CHESTPLATE, chest,
            ArmorType.HELMET, helmet
         );
      }
   }
}
