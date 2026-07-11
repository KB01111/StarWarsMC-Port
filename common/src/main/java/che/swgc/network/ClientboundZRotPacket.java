package che.swgc.network;

import che.swgc.entity.StarFighter;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.client.Minecraft;

public record ClientboundZRotPacket(int id, float rot) implements SwgcPacket.Clientbound {
   public ClientboundZRotPacket(net.minecraft.network.FriendlyByteBuf buf) {
      this(buf.readVarInt(), buf.readFloat());
   }

   @Override
   public void handle(net.minecraft.client.Minecraft mc) {
      if (mc.level != null && mc.level.getEntity(this.id) instanceof StarFighter starFighter) {
         starFighter.zRot = this.rot;
      }
   }

   @Override
   public void encode(net.minecraft.network.FriendlyByteBuf buf) {
      buf.writeVarInt(this.id);
      buf.writeFloat(this.rot);
   }
}
