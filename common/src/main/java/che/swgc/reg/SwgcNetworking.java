package che.swgc.reg;

import che.swgc.network.SwgcPacket;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;

public class SwgcNetworking {
   private static Consumer<SwgcPacket.Serverbound> TO_SERVER;
   private static BiConsumer<net.minecraft.server.level.ServerPlayer, SwgcPacket.Clientbound> TO_CLIENT;
   private static BiConsumer<net.minecraft.world.entity.Entity, SwgcPacket.Clientbound> TO_TRACKING;

   public SwgcNetworking() {
   }

   public static void init(
      Consumer<SwgcPacket.Serverbound> toServer,
      BiConsumer<net.minecraft.server.level.ServerPlayer, SwgcPacket.Clientbound> toClient,
      BiConsumer<net.minecraft.world.entity.Entity, SwgcPacket.Clientbound> toTracking
   ) {
      TO_SERVER = toServer;
      TO_CLIENT = toClient;
      TO_TRACKING = toTracking;
   }

   public static void sendToServer(SwgcPacket.Serverbound packet) {
      TO_SERVER.accept(packet);
   }

   public static void sendToClient(net.minecraft.world.entity.player.Player player, SwgcPacket.Clientbound packet) {
      TO_CLIENT.accept((net.minecraft.server.level.ServerPlayer)player, packet);
   }

   public static void sendToTracking(net.minecraft.world.entity.Entity tracked, SwgcPacket.Clientbound packet) {
      TO_TRACKING.accept(tracked, packet);
   }
}
