package che.swgc.network;

import che.swgc.entity.CommandableMob;
import che.swgc.reg.SwgcSounds;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;

public record MobCommandPacket(int droidId, CommandableMob.Command command, boolean russian) implements SwgcPacket.Serverbound {
   public MobCommandPacket(net.minecraft.network.FriendlyByteBuf buf) {
      this(buf.readVarInt(), buf.readEnum(CommandableMob.Command.class), buf.readBoolean());
   }

   @Override
   public void encode(net.minecraft.network.FriendlyByteBuf buf) {
      buf.writeVarInt(this.droidId);
      buf.writeEnum(this.command);
      buf.writeBoolean(this.russian);
   }

   @Override
   public void handle(net.minecraft.server.level.ServerPlayer sender) {
      if (sender.level().getEntity(this.droidId) instanceof CommandableMob commandableMob) {
         commandableMob.command(this.command);
         if (commandableMob.isDroid()) {
            commandableMob.playSound(
               (this.russian ? SwgcSounds.ROGER_RU : SwgcSounds.ROGER_EN).get(), 1.0F, 0.9F + commandableMob.getRandom().nextFloat() * 0.2F
            );
         }
      }
   }
}
