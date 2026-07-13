package che.swgc.entity;

import che.swgc.SwgcItemData;
import che.swgc.SwgcUtils;

import che.swgc.force.StarWarsWeaponWielder;
import che.swgc.item.BlasterItem;
import che.swgc.item.CustomArmorItem;
import che.swgc.reg.SwgcEntities;
import che.swgc.reg.SwgcItems;
import java.util.EnumMap;
import java.util.function.Function;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.monster.RangedAttackMob;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.ServerLevelAccessor;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

@javax.annotation.ParametersAreNonnullByDefault
public class Clone extends CommandableMob implements net.minecraft.world.entity.monster.RangedAttackMob, StarWarsWeaponWielder {
   public Clone(net.minecraft.world.entity.EntityType<? extends Clone> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
   }

   public void setCustomName(@Nullable net.minecraft.network.chat.Component name) {
      if (!this.getScreenTitle().equals(name)) {
         super.setCustomName(name);
      }
   }

   @Nullable
   @Override
   public net.minecraft.world.entity.SpawnGroupData finalizeSpawn(net.minecraft.world.level.ServerLevelAccessor lvl, net.minecraft.world.DifficultyInstance difficulty, net.minecraft.world.entity.EntitySpawnReason spawnType, @Nullable net.minecraft.world.entity.SpawnGroupData groupData) {
      net.minecraft.world.entity.SpawnGroupData ret = super.finalizeSpawn(lvl, difficulty, spawnType, groupData);
      CustomArmorItem.getCloneSet(CustomArmorItem.Materials.CLONE_PHASE_2.armor())
         .orElseThrow()
         .forEach((type, supplier) -> this.setItemSlot(SwgcUtils.armorSlot(type), supplier.get().getDefaultInstance()));
      this.setItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND, SwgcItems.DC15S.get().getDefaultInstance());
      this.setLeftHanded(false);
      return ret;
   }

   @Override
   public void aiStep() {
      this.sprintO = this.sprint;
      this.sprint = this.isSprinting() ? Math.min(this.sprint + 0.1F, 1.0F) : Math.max(this.sprint - 0.1F, 0.0F);
      super.aiStep();
   }

   @Nullable
   @Override
   public net.minecraft.world.item.ItemStack getPickResult() {
      net.minecraft.world.item.ItemStack stack = super.getPickResult();
      return stack != null ? addSpawnEggData(stack, type -> this.getItemBySlot(SwgcUtils.armorSlot(type)), this.getMainHandItem()) : null;
   }

   public void performRangedAttack(net.minecraft.world.entity.LivingEntity target, float distance) {
      net.minecraft.world.item.ItemStack blaster = this.getMainHandItem();
      if (blaster.getItem() instanceof BlasterItem blasterItem) {
         blasterItem.shoot(
            this.level(), this, blaster, target.getBoundingBox().getCenter().subtract(this.getEyePosition().add(this.getLookAngle()))
         );
         this.swing(net.minecraft.world.InteractionHand.MAIN_HAND, true);
      }
   }

   @Override
   public boolean isDroid() {
      return false;
   }

   @Override
   public net.minecraft.network.chat.Component getScreenTitle() {
      net.minecraft.network.chat.Component component = this.getCustomName();
      if (component != null) {
         return component;
      } else {
         String clone = getArmor(type -> this.getItemBySlot(SwgcUtils.armorSlot(type)));
         return (net.minecraft.network.chat.Component)(clone != null ? net.minecraft.network.chat.Component.translatable(clone, new Object[]{this.getName().getString()}) : this.getName().getString());
      }
   }

   @Nullable
   public static String getArmor(Function<net.minecraft.world.item.equipment.ArmorType, net.minecraft.world.item.ItemStack> getter) {
      net.minecraft.world.item.ItemStack head = getter.apply(net.minecraft.world.item.equipment.ArmorType.HELMET);
      if (!(head.getItem() instanceof che.swgc.item.CustomArmorItem armor)) {
         return null;
      } else {
         for (net.minecraft.world.item.equipment.ArmorType type : new net.minecraft.world.item.equipment.ArmorType[]{net.minecraft.world.item.equipment.ArmorType.CHESTPLATE, net.minecraft.world.item.equipment.ArmorType.LEGGINGS, net.minecraft.world.item.equipment.ArmorType.BOOTS}) {
            net.minecraft.world.item.ItemStack stack = getter.apply(type);
            if (stack == null || !(stack.getItem() instanceof che.swgc.item.CustomArmorItem armor1) || armor.getMaterial() != armor1.getMaterial()) {
               return null;
            }
         }

         return CustomArmorItem.getCloneId(armor.getMaterial(), CustomArmorItem.Materials.nameOf(armor.getMaterial()));
      }
   }

   public static EnumMap<net.minecraft.world.item.equipment.ArmorType, net.minecraft.world.item.ItemStack> readArmor(net.minecraft.nbt.CompoundTag tag) {
      EnumMap ret = new EnumMap<>(net.minecraft.world.item.equipment.ArmorType.class);

      for (net.minecraft.world.item.equipment.ArmorType type : net.minecraft.world.item.equipment.ArmorType.values()) {
         if (tag.contains(type.getName())) {
            ret.put(type, SwgcItemData.loadStack(tag.getCompoundOrEmpty(type.getName())));
         }
      }

      return ret;
   }

   public static net.minecraft.world.item.ItemStack addSpawnEggData(net.minecraft.world.item.ItemStack stack, Function<net.minecraft.world.item.equipment.ArmorType, net.minecraft.world.item.ItemStack> armor, @Nullable net.minecraft.world.item.ItemStack weapon) {
      String clone = getArmor(armor);
      net.minecraft.network.chat.Component displayName = clone != null
         ? net.minecraft.network.chat.Component.translatable(clone, SwgcEntities.CLONE.get().getDescription())
         : SwgcEntities.CLONE.get().getDescription();
      stack.set(DataComponents.CUSTOM_NAME, displayName);

      SwgcItemData.update(stack, tag -> {
         for (net.minecraft.world.item.equipment.ArmorType type : net.minecraft.world.item.equipment.ArmorType.values()) {
            net.minecraft.world.item.ItemStack armorPiece = armor.apply(type);
            if (armorPiece != null && !armorPiece.isEmpty()) {
               tag.put(type.getName(), SwgcItemData.saveStack(armorPiece));
            }
         }

         if (weapon != null) {
            tag.put("Weapon", SwgcItemData.saveStack(weapon));
         }
      });

      return stack;
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      return createCommandableAttributes().add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 20.0).add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.3F);
   }
}
