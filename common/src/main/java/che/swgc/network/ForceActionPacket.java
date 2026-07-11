package che.swgc.network;

import che.swgc.force.ForceAction;
import che.swgc.force.ForcePossessor;
import che.swgc.force.ForceSecondaryAction;
import che.swgc.force.LightsaberAttack;
import javax.annotation.Nullable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;

public class ForceActionPacket implements SwgcPacket.PlayerBidirectional {
   private final boolean force;
   @Nullable
   private final ForceAction action;

   public ForceActionPacket(@Nullable LightsaberAttack action) {
      this.force = false;
      this.action = action;
   }

   public ForceActionPacket(@Nullable ForceSecondaryAction action) {
      this.force = true;
      this.action = action;
   }

   public ForceActionPacket(net.minecraft.network.FriendlyByteBuf buf) {
      this.force = buf.readBoolean();
      if (this.force) {
         this.action = readNullableEnum(ForceSecondaryAction.class, buf);
      } else {
         this.action = readNullableEnum(LightsaberAttack.class, buf);
      }
   }

   @Override
   public void encode(net.minecraft.network.FriendlyByteBuf buf) {
      buf.writeBoolean(this.force);
      if (this.action == null) {
         buf.writeVarInt(-1);
      } else {
         buf.writeEnum((Enum)this.action);
      }
   }

   @Override
   public void handle(net.minecraft.world.entity.player.Player player) {
      if (this.force) {
         ((ForcePossessor)player).swgc$setForceSecondaryAction((ForceSecondaryAction)this.action);
      } else {
         ((ForcePossessor)player).swgc$setLightsaberAttack((LightsaberAttack)this.action);
      }
   }

   public static <T extends Enum<T>> T readNullableEnum(Class<T> clazz, net.minecraft.network.FriendlyByteBuf buf) {
      int i = buf.readVarInt();
      return i != -1 ? clazz.getEnumConstants()[i] : null;
   }
}
