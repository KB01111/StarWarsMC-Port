package che.swgc.network;

import che.swgc.force.ForcePossessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;

public record ForceSecondaryActionPacket(int[] data) implements SwgcPacket.PlayerBidirectional {
   public ForceSecondaryActionPacket(net.minecraft.network.FriendlyByteBuf buf) {
      this(buf.readVarIntArray());
   }

   @Override
   public void encode(net.minecraft.network.FriendlyByteBuf buf) {
      buf.writeVarIntArray(this.data);
   }

   @Override
   public void handle(net.minecraft.world.entity.player.Player player) {
      ForcePossessor forcePossessor = (ForcePossessor)player;
      if (!forcePossessor.isUsingForce()) {
         forcePossessor.swgc$stopAllForceActions();
         forcePossessor.swgc$setForceTicks(0);
      }

      forcePossessor.swgc$setForceSecondaryActionData(this.data);
   }
}
