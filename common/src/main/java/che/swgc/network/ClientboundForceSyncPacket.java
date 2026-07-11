package che.swgc.network;

import che.swgc.force.ForcePossessor;
import che.swgc.force.ForceSecondaryAction;
import che.swgc.force.LightsaberAttack;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.client.Minecraft;

public record ClientboundForceSyncPacket(
   int playerId,
   int forceTicks,
   int brightSide,
   int darkSide,
   @Nullable int[] secondaryActionData,
   @Nullable LightsaberAttack lightsaberAttack,
   @Nullable ForceSecondaryAction secondaryAction
) implements SwgcPacket.Clientbound {
   public ClientboundForceSyncPacket(net.minecraft.world.entity.player.Player player) {
      this(
         player.getId(),
         ((ForcePossessor)player).swgc$getForceTicks(),
         ((ForcePossessor)player).swgc$getForceBrightSide(),
         ((ForcePossessor)player).swgc$getForceDarkSide(),
         ((ForcePossessor)player).swgc$getForceSecondaryActionData(),
         ((ForcePossessor)player).swgc$getLightsaberAttack(),
         ((ForcePossessor)player).swgc$getForceSecondaryAction()
      );
   }

   public ClientboundForceSyncPacket(net.minecraft.network.FriendlyByteBuf buf) {
      this(
         buf.readVarInt(),
         buf.readVarInt(),
         buf.readVarInt(),
         buf.readVarInt(),
         (int[])buf.readNullable(net.minecraft.network.FriendlyByteBuf::readVarIntArray),
         ForceActionPacket.readNullableEnum(LightsaberAttack.class, buf),
         ForceActionPacket.readNullableEnum(ForceSecondaryAction.class, buf)
      );
   }

   @Override
   public void encode(net.minecraft.network.FriendlyByteBuf buf) {
      buf.writeVarInt(this.playerId);
      buf.writeVarInt(this.forceTicks);
      buf.writeVarInt(this.brightSide);
      buf.writeVarInt(this.darkSide);
      buf.writeNullable(this.secondaryActionData, net.minecraft.network.FriendlyByteBuf::writeVarIntArray);

      for (Enum action : new Enum[]{this.lightsaberAttack, this.secondaryAction}) {
         buf.writeVarInt(action != null ? action.ordinal() : -1);
      }
   }

   @Override
   public void handle(net.minecraft.client.Minecraft mc) {
      if (Objects.requireNonNull(mc.level).getEntity(this.playerId) instanceof ForcePossessor forcePossessor) {
         forcePossessor.swgc$setForceTicks(this.forceTicks);
         forcePossessor.swgc$setForceBrightSide(this.brightSide);
         forcePossessor.swgc$setForceDarkSide(this.darkSide);
         forcePossessor.swgc$setForceSecondaryActionData(this.secondaryActionData);
         forcePossessor.swgc$setLightsaberAttack(this.lightsaberAttack);
         forcePossessor.swgc$setForceSecondaryAction(this.secondaryAction);
      }
   }
}
