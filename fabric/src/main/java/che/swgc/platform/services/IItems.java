package che.swgc.platform.services;

import che.swgc.item.AmbanSniperRifleItem;
import che.swgc.item.BlasterItem;
import che.swgc.item.CustomArmorItem;
import che.swgc.item.EwokSpearItem;
import che.swgc.item.EwokStaffItem;
import che.swgc.item.ForcePikeItem;
import che.swgc.item.LightsaberItem;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.resources.Identifier;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.item.equipment.ArmorType;

@javax.annotation.ParametersAreNonnullByDefault
public interface IItems {
   LightsaberItem createLightsaber();

   LightsaberItem createDarkSaber();

   BlasterItem createBlaster(int var1, float var2, float var3, float var4, int var5, String var6);

   AmbanSniperRifleItem createAmbanSniperRifle();

   ForcePikeItem createForcePike();

   CustomArmorItem createArmor(net.minecraft.world.item.equipment.ArmorMaterial var1, net.minecraft.world.item.equipment.ArmorType var2, Predicate<Integer> var3, net.minecraft.resources.Identifier var4, String var5, net.minecraft.resources.Identifier var6, String var7);

   default CustomArmorItem createArmor(net.minecraft.world.item.equipment.ArmorMaterial material, net.minecraft.world.item.equipment.ArmorType type, Predicate<Integer> renderPlayerPart) {
      net.minecraft.resources.Identifier rl = net.minecraft.resources.Identifier.parse(che.swgc.item.CustomArmorItem.Materials.nameOf(material));
      return this.createArmor(material, type, renderPlayerPart, rl, "outer_armor", rl, "inner_armor");
   }

   default CustomArmorItem createArmorSimpleInner(net.minecraft.world.item.equipment.ArmorMaterial material, net.minecraft.world.item.equipment.ArmorType type, Predicate<Integer> renderPlayerPart) {
      return this.createArmor(
         material,
         type,
         renderPlayerPart,
         net.minecraft.resources.Identifier.parse(che.swgc.item.CustomArmorItem.Materials.nameOf(material)),
         "outer_armor",
         net.minecraft.resources.Identifier.fromNamespaceAndPath("swgc", "simple_armor"),
         "inner_armor"
      );
   }

   EwokSpearItem createEwokSpear();

   EwokStaffItem createEwokStaff();

   net.minecraft.world.item.SpawnEggItem createCloneItem();

   net.minecraft.world.item.SpawnEggItem createSpawnEgg(Supplier<? extends net.minecraft.world.entity.EntityType<? extends net.minecraft.world.entity.Mob>> var1, int var2, int var3);

   @Nullable
   net.minecraft.world.item.SpawnEggItem spawnEggByType(net.minecraft.world.entity.EntityType<?> var1);
}
