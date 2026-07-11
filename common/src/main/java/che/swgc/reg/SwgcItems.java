package che.swgc.reg;

import che.swgc.SwgcItemData;

import che.swgc.entity.Clone;
import che.swgc.item.AmbanSniperRifleItem;
import che.swgc.item.BlasterItem;
import che.swgc.item.CustomArmorItem;
import che.swgc.item.EntitySpawnItem;
import che.swgc.item.EwokSpearItem;
import che.swgc.item.EwokStaffItem;
import che.swgc.item.ForcePikeItem;
import che.swgc.item.HolocronItem;
import che.swgc.item.LightsaberItem;
import che.swgc.platform.Services;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.Identifier;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.CreativeModeTab.Builder;
import net.minecraft.world.item.Item.Properties;
import org.apache.commons.lang3.function.TriFunction;

public class SwgcItems {
   public static final Supplier<LightsaberItem> LIGHTSABER;
   public static final Supplier<LightsaberItem> DARKSABER;
   public static final Supplier<BlasterItem> DC15A;
   public static final Supplier<BlasterItem> DC15S;
   public static final Supplier<BlasterItem> DC17;
   public static final Supplier<BlasterItem> DH17;
   public static final Supplier<BlasterItem> E5;
   public static final Supplier<BlasterItem> TL50;
   public static final Supplier<BlasterItem> JAWA_BLASTER;
   public static final Supplier<AmbanSniperRifleItem> AMBAN_SNIPER_RIFLE;
   public static final Supplier<ForcePikeItem> FORCE_PIKE;
   public static final Supplier<EwokSpearItem> EWOK_SPEAR;
   public static final Supplier<EwokStaffItem> EWOK_STAFF;
   public static final Map<net.minecraft.world.item.equipment.ArmorType, Supplier<CustomArmorItem>> JEDI_FEMALE_ARMOR;
   public static final Map<net.minecraft.world.item.equipment.ArmorType, Supplier<CustomArmorItem>> JEDI_MALE_ARMOR;
   public static final Map<net.minecraft.world.item.equipment.ArmorType, Supplier<CustomArmorItem>> JEDI_MALE_2_ARMOR;
   public static final Map<net.minecraft.world.item.equipment.ArmorType, Supplier<CustomArmorItem>> SITH_FEMALE_ARMOR;
   public static final Map<net.minecraft.world.item.equipment.ArmorType, Supplier<CustomArmorItem>> SITH_MALE_ARMOR;
   public static final Map<net.minecraft.world.item.equipment.ArmorType, Supplier<CustomArmorItem>> SITH_MALE_2_ARMOR;
   public static final Map<net.minecraft.world.item.equipment.ArmorType, Supplier<CustomArmorItem>> ROYAL_GUARD_ARMOR;
   public static final Supplier<net.minecraft.world.item.BlockItem> GAS_HARVESTER;
   public static final Supplier<HolocronItem> JEDI_HOLOCRON;
   public static final Supplier<HolocronItem> SITH_HOLOCRON;
   public static final Supplier<net.minecraft.world.item.Item> EMPTY_GAS_VESSEL;
   public static final Supplier<net.minecraft.world.item.Item> TIBANNA_VESSEL;
   public static final Supplier<EntitySpawnItem> ATRT;
   public static final Supplier<EntitySpawnItem> ATST;
   public static final Supplier<EntitySpawnItem> DELTA7B;
   public static final Supplier<net.minecraft.world.item.SpawnEggItem> CLONE;
   public static final Set<Supplier<net.minecraft.world.item.SpawnEggItem>> SPAWN_EGGS;
   public static final net.minecraft.resources.ResourceKey<net.minecraft.world.item.CreativeModeTab> LIGHTSABERS;
   public static final net.minecraft.resources.ResourceKey<net.minecraft.world.item.CreativeModeTab> WEAPONS;
   public static final net.minecraft.resources.ResourceKey<net.minecraft.world.item.CreativeModeTab> ARMOR;
   public static final net.minecraft.resources.ResourceKey<net.minecraft.world.item.CreativeModeTab> FUNCTIONAL_BLOCKS;
   public static final net.minecraft.resources.ResourceKey<net.minecraft.world.item.CreativeModeTab> ITEMS;
   public static final net.minecraft.resources.ResourceKey<net.minecraft.world.item.CreativeModeTab> VEHICLES;
   public static final net.minecraft.resources.ResourceKey<net.minecraft.world.item.CreativeModeTab> MOBS;

   public SwgcItems() {
   }

   public static void init() {
   }

   private static Supplier<net.minecraft.world.item.Item> ingredient(IRegister<net.minecraft.world.item.Item> register, String name) {
      return register.register(name, () -> new net.minecraft.world.item.Item(IRegister.itemProperties()));
   }

   private static void spawnEgg(
      Set<Supplier<net.minecraft.world.item.SpawnEggItem>> set,
      IRegister<net.minecraft.world.item.Item> register,
      Supplier<? extends net.minecraft.world.entity.EntityType<? extends net.minecraft.world.entity.Mob>> type,
      String id,
      int bgColor,
      int highlightColor
   ) {
      set.add(register.register(id + "_spawn_egg", () -> Services.ITEMS.createSpawnEgg(type, bgColor, highlightColor)));
   }

   private static Map<net.minecraft.world.item.equipment.ArmorType, Supplier<CustomArmorItem>> regArmorSet(
      IRegister<net.minecraft.world.item.Item> register,
      CustomArmorItem.Materials material,
      Predicate<Integer> renderPlayerPart,
      TriFunction<net.minecraft.world.item.equipment.ArmorMaterial, net.minecraft.world.item.equipment.ArmorType, Predicate<Integer>, CustomArmorItem> factory,
      net.minecraft.world.item.equipment.ArmorType... excludeTypes
   ) {
      return regArmorSet(register, material.armor(), material.getName(), renderPlayerPart, factory, excludeTypes);
   }

   private static Map<net.minecraft.world.item.equipment.ArmorType, Supplier<CustomArmorItem>> regArmorSet(
      IRegister<net.minecraft.world.item.Item> register,
      net.minecraft.world.item.equipment.ArmorMaterial material,
      String registryName,
      Predicate<Integer> renderPlayerPart,
      TriFunction<net.minecraft.world.item.equipment.ArmorMaterial, net.minecraft.world.item.equipment.ArmorType, Predicate<Integer>, CustomArmorItem> factory,
      net.minecraft.world.item.equipment.ArmorType... excludeTypes
   ) {
      EnumMap<ArmorType, Supplier<CustomArmorItem>> map = new EnumMap<>(ArmorType.class);

      for (net.minecraft.world.item.equipment.ArmorType type : net.minecraft.world.item.equipment.ArmorType.values()) {
         boolean flag = true;

         for (net.minecraft.world.item.equipment.ArmorType type1 : excludeTypes) {
            if (type == type1) {
               flag = false;
               break;
            }
         }

         if (flag) {
            map.put(
               type,
               register.register(
                  registryName.substring("swgc".length() + 1) + "_" + type.getName(),
                  () -> (CustomArmorItem)factory.apply(material, type, renderPlayerPart)
               )
            );
         }
      }

      return Map.copyOf(map);
   }

   private static void regCloneArmorSet(IRegister<net.minecraft.world.item.Item> register, CustomArmorItem.Materials material) {
      CustomArmorItem.regCloneSet(
         material.armor(),
         regArmorSet(
            register,
            material.armor(),
            material.getName(),
            CustomArmorItem.RENDER_NOTHING,
            (material1, type, renderPlayerPart) -> Services.ITEMS
                  .createArmor(
                     material1,
                     type,
                     renderPlayerPart,
                     Identifier.fromNamespaceAndPath("swgc", "clone"),
                     material == CustomArmorItem.Materials.CLONE_104TH_BATTALION ? "104th_battalion" : "outer_armor",
                     Identifier.fromNamespaceAndPath("swgc", "simple_armor"),
                     "inner_armor"
                  )
         )
      );
   }

   static {
      IRegister<Item> register = Services.REGISTERS.items();
      LIGHTSABER = register.register("lightsaber", Services.ITEMS::createLightsaber);
      DARKSABER = register.register("darksaber", Services.ITEMS::createDarkSaber);
      DC15A = register.register("dc15a", () -> Services.ITEMS.createBlaster(-16776961, 8.0F, 3.0F, 1.0F, 60, "dc15a"));
      DC15S = register.register("dc15s", () -> Services.ITEMS.createBlaster(-16776961, 6.0F, 3.0F, 1.0F, 40, "dc15s"));
      DC17 = register.register("dc17", () -> Services.ITEMS.createBlaster(-16776961, 9.0F, 3.0F, 0.5F, 20, "dc17"));
      DH17 = register.register("dh17", () -> Services.ITEMS.createBlaster(-65536, 8.0F, 3.0F, 0.5F, 20, "dh17"));
      E5 = register.register("e5", () -> Services.ITEMS.createBlaster(-65536, 7.0F, 3.0F, 1.0F, 24, "e5"));
      TL50 = register.register("tl50", () -> Services.ITEMS.createBlaster(-16776961, 10.0F, 3.0F, 0.25F, 12, "tl50"));
      JAWA_BLASTER = register.register("jawa_blaster", () -> Services.ITEMS.createBlaster(-65536, 6.0F, 3.0F, 0.6F, 20, "jawa"));
      AMBAN_SNIPER_RIFLE = register.register("amban_sniper_rifle", Services.ITEMS::createAmbanSniperRifle);
      FORCE_PIKE = register.register("force_pike", Services.ITEMS::createForcePike);
      EWOK_SPEAR = register.register("ewok_spear", Services.ITEMS::createEwokSpear);
      EWOK_STAFF = register.register("ewok_staff", Services.ITEMS::createEwokStaff);

      for (CustomArmorItem.Materials material : CustomArmorItem.Materials.values()) {
         if (material == CustomArmorItem.Materials.JEDI_FEMALE) {
            break;
         }

         regCloneArmorSet(register, material);
      }

      JEDI_FEMALE_ARMOR = regArmorSet(
         register, CustomArmorItem.Materials.JEDI_FEMALE, CustomArmorItem.RENDER_NOTHING, Services.ITEMS::createArmor, net.minecraft.world.item.equipment.ArmorType.HELMET
      );
      JEDI_MALE_ARMOR = regArmorSet(
         register, CustomArmorItem.Materials.JEDI_MALE, CustomArmorItem.RENDER_NOTHING, Services.ITEMS::createArmor, net.minecraft.world.item.equipment.ArmorType.HELMET
      );
      JEDI_MALE_2_ARMOR = regArmorSet(
         register,
         CustomArmorItem.Materials.JEDI_MALE_2,
         CustomArmorItem.RENDER_NOTHING,
         (material, type, renderPart) -> Services.ITEMS
               .createArmor(
                  material, type, renderPart, Identifier.fromNamespaceAndPath("swgc", "jedi_male_2"), "outer_armor", Identifier.fromNamespaceAndPath("swgc", "jedi_male"), "inner_armor"
               ),
         net.minecraft.world.item.equipment.ArmorType.HELMET
      );
      SITH_FEMALE_ARMOR = regArmorSet(register, CustomArmorItem.Materials.SITH_FEMALE, CustomArmorItem.RENDER_HEAD_ONLY, Services.ITEMS::createArmorSimpleInner);
      SITH_MALE_ARMOR = regArmorSet(
         register, CustomArmorItem.Materials.SITH_MALE, CustomArmorItem.RENDER_NOTHING, Services.ITEMS::createArmorSimpleInner, net.minecraft.world.item.equipment.ArmorType.HELMET
      );
      SITH_MALE_2_ARMOR = regArmorSet(register, CustomArmorItem.Materials.SITH_MALE_2, CustomArmorItem.RENDER_HEAD_ONLY, Services.ITEMS::createArmor);
      ROYAL_GUARD_ARMOR = regArmorSet(register, CustomArmorItem.Materials.ROYAL_GUARD, CustomArmorItem.RENDER_NOTHING, Services.ITEMS::createArmor);
      GAS_HARVESTER = register.register("gas_harvester", () -> new net.minecraft.world.item.BlockItem(SwgcBlocks.GAS_HARVESTER.get(), IRegister.itemProperties().useBlockDescriptionPrefix()));
      JEDI_HOLOCRON = register.register("jedi_holocron", HolocronItem::jedi);
      SITH_HOLOCRON = register.register("sith_holocron", HolocronItem::sith);
      EMPTY_GAS_VESSEL = ingredient(register, "empty_gas_vessel");
      TIBANNA_VESSEL = ingredient(register, "tibanna_vessel");
      ATRT = register.register("atrt", () -> new EntitySpawnItem(SwgcEntities.ATRT));
      ATST = register.register("atst", () -> new EntitySpawnItem(SwgcEntities.ATST));
      DELTA7B = register.register("delta7b", () -> new EntitySpawnItem(SwgcEntities.DELTA7B));
      CLONE = register.register("clone", Services.ITEMS::createCloneItem);
      Set<Supplier<SpawnEggItem>> spawnEggs = new HashSet<>();
      spawnEgg(spawnEggs, register, SwgcEntities.B1, "b1", 16567164, 15117159);
      spawnEgg(spawnEggs, register, SwgcEntities.B2, "b2", 6383479, 16724736);
      spawnEgg(spawnEggs, register, SwgcEntities.DROIDEKA, "droideka", 11032115, 11975102);
      spawnEgg(spawnEggs, register, SwgcEntities.ROYAL_GURDIAN, "royal_guardian", 12325889, 6100007);
      spawnEgg(spawnEggs, register, SwgcEntities.EWOK, "ewok", 6635313, 15324867);
      spawnEgg(spawnEggs, register, SwgcEntities.EWOK_SHAMAN, "ewok_shaman", 2039846, 15324867);
      spawnEgg(spawnEggs, register, SwgcEntities.JAWA, "jawa", 3812386, 16754269);
      SPAWN_EGGS = Set.copyOf(spawnEggs);
      BiFunction<String, UnaryOperator<Builder>, ResourceKey<CreativeModeTab>> tabs = Services.REGISTERS.creativeModTabs();
      LIGHTSABERS = tabs.apply("lightsabers", builder -> builder.icon(() -> LightsaberItem.variant("yoda")).displayItems((params, output) -> {
            LightsaberItem.getAllHilts().forEach(hilt -> output.accept(LightsaberItem.variant(hilt)));
            output.accept((net.minecraft.world.level.ItemLike)DARKSABER.get());
         }));
      WEAPONS = tabs.apply("weapons", builder -> builder.icon(() -> DC15S.get().getDefaultInstance()).displayItems((params, output) -> {
            output.accept((net.minecraft.world.level.ItemLike)DC15A.get());
            output.accept((net.minecraft.world.level.ItemLike)DC15S.get());
            output.accept((net.minecraft.world.level.ItemLike)DC17.get());
            output.accept((net.minecraft.world.level.ItemLike)DH17.get());
            output.accept((net.minecraft.world.level.ItemLike)E5.get());
            output.accept((net.minecraft.world.level.ItemLike)TL50.get());
            output.accept((net.minecraft.world.level.ItemLike)JAWA_BLASTER.get());
            output.accept((net.minecraft.world.level.ItemLike)AMBAN_SNIPER_RIFLE.get());
            output.accept((net.minecraft.world.level.ItemLike)FORCE_PIKE.get());
            output.accept((net.minecraft.world.level.ItemLike)EWOK_SPEAR.get());
            output.accept((net.minecraft.world.level.ItemLike)EWOK_STAFF.get());
         }));
      ARMOR = tabs.apply(
         "armor",
         builder -> builder.icon(
                  () -> CustomArmorItem.getCloneSet(CustomArmorItem.Materials.CLONE_PHASE_2.armor()).orElseThrow().get(net.minecraft.world.item.equipment.ArmorType.HELMET).get().getDefaultInstance()
               )
               .displayItems(
                  (parameters, output) -> {
                     for (Map<ArmorType, Supplier<CustomArmorItem>> set : Set.of(
                        JEDI_FEMALE_ARMOR, JEDI_MALE_ARMOR, JEDI_MALE_2_ARMOR, SITH_FEMALE_ARMOR, SITH_MALE_ARMOR, SITH_MALE_2_ARMOR, ROYAL_GUARD_ARMOR
                     )) {
                        for (net.minecraft.world.item.equipment.ArmorType type : net.minecraft.world.item.equipment.ArmorType.values()) {
                           Supplier<? extends Item> supplier = set.get(type);
                           if (supplier != null) {
                              output.accept((net.minecraft.world.level.ItemLike)supplier.get());
                           }
                        }
                     }

                     CustomArmorItem.cloneSets().values().forEach(set -> {
                        for (net.minecraft.world.item.equipment.ArmorType typex : net.minecraft.world.item.equipment.ArmorType.values()) {
                           output.accept((net.minecraft.world.level.ItemLike)set.get(typex).get());
                        }
                     });
                  }
               )
      );
      FUNCTIONAL_BLOCKS = tabs.apply(
         "functional_blocks",
         builder -> builder.icon(() -> GAS_HARVESTER.get().getDefaultInstance())
               .displayItems((params, output) -> output.accept((net.minecraft.world.level.ItemLike)GAS_HARVESTER.get()))
      );
      ITEMS = tabs.apply("items", builder -> builder.icon(() -> JEDI_HOLOCRON.get().getDefaultInstance()).displayItems((params, output) -> {
            output.accept((net.minecraft.world.level.ItemLike)JEDI_HOLOCRON.get());
            output.accept((net.minecraft.world.level.ItemLike)SITH_HOLOCRON.get());
            output.accept((net.minecraft.world.level.ItemLike)EMPTY_GAS_VESSEL.get());
            output.accept((net.minecraft.world.level.ItemLike)TIBANNA_VESSEL.get());
         }));
      VEHICLES = tabs.apply("vehicles", builder -> builder.icon(() -> ATRT.get().getDefaultInstance()).displayItems((params, output) -> {
            output.accept((net.minecraft.world.level.ItemLike)ATRT.get());
            output.accept((net.minecraft.world.level.ItemLike)ATST.get());
            output.accept((net.minecraft.world.level.ItemLike)DELTA7B.get());
         }));
      MOBS = tabs.apply(
         "mobs",
         builder -> builder.icon(() -> Objects.requireNonNull(Services.ITEMS.spawnEggByType(SwgcEntities.DROIDEKA.get())).getDefaultInstance())
               .displayItems(
                  (params, output) -> {
                     SPAWN_EGGS.forEach(supplier -> {
                        net.minecraft.world.item.ItemStack stack = supplier.get().getDefaultInstance();
                        SwgcItemData.update(stack, tag -> tag.putString("Owner", Objects.requireNonNull(Minecraft.getInstance().player).getUUID().toString()));
                        output.accept(stack);
                     });
                     CustomArmorItem.cloneSets()
                        .forEach(
                           (material, armor) -> {
                              net.minecraft.world.item.ItemStack stack = CLONE.get().getDefaultInstance();
                              SwgcItemData.update(stack, tag -> tag.putString("Owner", Objects.requireNonNull(Minecraft.getInstance().player).getUUID().toString()));
                              output.accept(
                                 Clone.addSpawnEggData(
                                    stack,
                                    type -> ((CustomArmorItem)((Supplier)armor.get(type)).get()).getDefaultInstance(),
                                    material != CustomArmorItem.Materials.CLONE_PHASE_2.armor()
                                          && material != CustomArmorItem.Materials.CLONE_104TH_BATTALION.armor()
                                          && material != CustomArmorItem.Materials.CLONE_615TH_LEGION.armor()
                                       ? DC15A.get().getDefaultInstance()
                                       : null
                                 )
                              );
                           }
                        );
                  }
               )
      );
   }
}
