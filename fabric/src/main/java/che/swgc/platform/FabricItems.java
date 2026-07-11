package che.swgc.platform;

import che.swgc.item.AmbanSniperRifleItem;
import che.swgc.item.BlasterItem;
import che.swgc.item.CustomArmorItem;
import che.swgc.item.EwokSpearItem;
import che.swgc.item.EwokStaffItem;
import che.swgc.item.ForcePikeItem;
import che.swgc.item.LightsaberItem;
import che.swgc.platform.services.IItems;
import che.swgc.reg.IRegister;
import che.swgc.reg.SwgcEntities;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.resources.Identifier;

@javax.annotation.ParametersAreNonnullByDefault
public class FabricItems implements IItems {
   public FabricItems() {
   }

   @Override
   public LightsaberItem createLightsaber() {
      return new LightsaberItem("yoda");
   }

   @Override
   public LightsaberItem createDarkSaber() {
      return new LightsaberItem(null, IRegister.itemProperties().stacksTo(1).rarity(net.minecraft.world.item.Rarity.EPIC));
   }

   @Override
   public BlasterItem createBlaster(int boltColor, float damage, float velocity, float inaccuracy, int maxAmmo, String modelName) {
      return new BlasterItem(boltColor, damage, velocity, inaccuracy, maxAmmo);
   }

   @Override
   public AmbanSniperRifleItem createAmbanSniperRifle() {
      return new AmbanSniperRifleItem();
   }

   @Override
   public ForcePikeItem createForcePike() {
      return new ForcePikeItem();
   }

   @Override
   public CustomArmorItem createArmor(
      ArmorMaterial material, ArmorType type, Predicate<Integer> renderPlayerPart, Identifier outerId, String outerLayer, Identifier innerId, String innerLayer
   ) {
      return type == ArmorType.LEGGINGS
         ? new CustomArmorItem(material, type, innerId, innerLayer, renderPlayerPart, CustomArmorItem.armorProperties(material, type, 20))
         : new CustomArmorItem(material, type, outerId, outerLayer, renderPlayerPart, CustomArmorItem.armorProperties(material, type, 20));
   }

   @Override
   public EwokSpearItem createEwokSpear() {
      return new EwokSpearItem();
   }

   @Override
   public EwokStaffItem createEwokStaff() {
      return new EwokStaffItem();
   }

   @Override
   public SpawnEggItem createCloneItem() {
      return this.createSpawnEgg(SwgcEntities.CLONE, 15856113, 2236962);
   }

   @Override
   public SpawnEggItem createSpawnEgg(Supplier<? extends EntityType<? extends Mob>> type, int bgColor, int highlightColor) {
      return new SpawnEggItem(IRegister.itemProperties().spawnEgg(type.get()));
   }

   @Nullable
   @Override
   public SpawnEggItem spawnEggByType(EntityType<?> type) {
      return SpawnEggItem.byId(type).map(holder -> (SpawnEggItem) holder.value()).orElse(null);
   }
}
