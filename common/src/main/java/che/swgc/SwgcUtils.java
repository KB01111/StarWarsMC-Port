package che.swgc;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.equipment.ArmorType;

public class SwgcUtils {
   public SwgcUtils() {
   }

   public static float soundPitch(net.minecraft.util.RandomSource random) {
      return 0.8F + random.nextFloat() * 0.4F;
   }

   public static boolean mechsImmuneTo(net.minecraft.world.damagesource.DamageSource damageSource) {
      return damageSource.is(net.minecraft.world.damagesource.DamageTypes.MAGIC)
         || damageSource.is(net.minecraft.world.damagesource.DamageTypes.INDIRECT_MAGIC)
         || !damageSource.is(net.minecraft.world.damagesource.DamageTypes.LAVA) && damageSource.is(DamageTypeTags.IS_FIRE);
   }

   public static EquipmentSlot armorSlot(ArmorType type) {
      return switch (type) {
         case HELMET -> EquipmentSlot.HEAD;
         case CHESTPLATE -> EquipmentSlot.CHEST;
         case LEGGINGS -> EquipmentSlot.LEGS;
         case BOOTS -> EquipmentSlot.FEET;
         case BODY -> EquipmentSlot.CHEST;
      };
   }
}
