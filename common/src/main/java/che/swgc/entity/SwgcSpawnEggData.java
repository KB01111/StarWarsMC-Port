package che.swgc.entity;

import che.swgc.SwgcItemData;
import che.swgc.SwgcUtils;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;

@ParametersAreNonnullByDefault
public final class SwgcSpawnEggData {
   private SwgcSpawnEggData() {
   }

   public static void apply(Entity entity, CompoundTag tag) {
      if (tag.isEmpty()) {
         return;
      }

      if (entity instanceof CommandableMob commandableMob) {
         applyCommandableData(commandableMob, tag);
      }

      if (entity instanceof Clone clone) {
         applyCloneData(clone, tag);
      }
   }

   private static void applyCommandableData(CommandableMob mob, CompoundTag tag) {
      tag.getString("Owner").ifPresent(owner -> {
         try {
            mob.setOwnerUuid(UUID.fromString(owner));
         } catch (IllegalArgumentException ignored) {
         }
      });

      tag.getString("Command").ifPresent(command -> {
         try {
            mob.command(CommandableMob.Command.valueOf(command));
         } catch (IllegalArgumentException ignored) {
         }
      });
   }

   private static void applyCloneData(Clone clone, CompoundTag tag) {
      Clone.readArmor(tag).forEach((type, stack) -> clone.setItemSlot(SwgcUtils.armorSlot(type), stack));
      if (tag.contains("Weapon")) {
         clone.setItemInHand(InteractionHand.MAIN_HAND, SwgcItemData.loadStack(tag.getCompoundOrEmpty("Weapon")));
      }
   }
}
