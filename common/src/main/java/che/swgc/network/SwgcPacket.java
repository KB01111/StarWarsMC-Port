package che.swgc.network;

import che.swgc.reg.SwgcNetworking;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;

public interface SwgcPacket {
   void encode(net.minecraft.network.FriendlyByteBuf var1);

   public interface Clientbound extends SwgcPacket {
      void handle(net.minecraft.client.Minecraft var1);
   }

   public static class ClientboundPlayerWrapper implements SwgcPacket.Clientbound {
      private final int playerId;
      private final SwgcPacket.PlayerBidirectional packet;

      private ClientboundPlayerWrapper(int playerId, SwgcPacket.PlayerBidirectional packet) {
         this.playerId = playerId;
         this.packet = packet;
      }

      public ClientboundPlayerWrapper(net.minecraft.network.FriendlyByteBuf buf) {
         this.playerId = buf.readInt();
         String className = buf.readUtf();

         SwgcPacket.PlayerBidirectional packet;
         try {
            Class clazz = Class.forName(className);

            try {
               packet = (SwgcPacket.PlayerBidirectional)clazz.getConstructor(net.minecraft.network.FriendlyByteBuf.class).newInstance(buf);
            } catch (NoSuchMethodException var6) {
               packet = (SwgcPacket.PlayerBidirectional)clazz.getConstructor().newInstance();
            }
         } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException | ClassCastException | ClassNotFoundException var7) {
            che.swgc.Constants.LOG.error("couldn't decode {} (player bidirectional packet) sent from server", className);
            packet = null;
         }

         this.packet = packet;
      }

      @Override
      public void encode(net.minecraft.network.FriendlyByteBuf buf) {
         buf.writeInt(this.playerId);
         buf.writeUtf(this.packet.getClass().getName());
         this.packet.encode(buf);
      }

      @Override
      public void handle(net.minecraft.client.Minecraft mc) {
         if (mc.level != null && mc.level.getEntity(this.playerId) instanceof net.minecraft.world.entity.player.Player player) {
            this.packet.handle(player);
         }
      }
   }

   public interface PlayerBidirectional extends SwgcPacket.Serverbound {
      void handle(net.minecraft.world.entity.player.Player var1);

      @Override
      default void handle(net.minecraft.server.level.ServerPlayer sender) {
         this.handle((net.minecraft.world.entity.player.Player)sender);
         SwgcNetworking.sendToTracking(sender, this.toClient(sender.getId()));
      }

      default SwgcPacket.Clientbound toClient(int playerId) {
         return new SwgcPacket.ClientboundPlayerWrapper(playerId, this);
      }
   }

   public interface Serverbound extends SwgcPacket {
      void handle(net.minecraft.server.level.ServerPlayer var1);
   }
}
