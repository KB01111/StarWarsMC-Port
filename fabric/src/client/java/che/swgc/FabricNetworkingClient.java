package che.swgc;

import che.swgc.network.ClientboundForceSyncPacket;
import che.swgc.network.ClientboundZRotPacket;
import che.swgc.network.SimpleSwgcActionPacket;
import che.swgc.network.SwgcPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public final class FabricNetworkingClient {
   private FabricNetworkingClient() {
   }

   public static void initClient() {
      regClientboundHandler(SwgcPacket.ClientboundPlayerWrapper.class);
      regClientboundHandler(ClientboundForceSyncPacket.class);
      regClientboundHandler(SimpleSwgcActionPacket.Clientbound.class);
      regClientboundHandler(ClientboundZRotPacket.class);
   }

   private static <T extends SwgcPacket.Clientbound> void regClientboundHandler(Class<T> packetClass) {
      ClientPlayNetworking.registerGlobalReceiver(
         FabricNetworking.typeFor(packetClass),
         (payload, context) -> context.client().execute(() -> ((T)payload.packet()).handle(context.client()))
      );
   }
}
