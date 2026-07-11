package che.swgc;

import che.swgc.network.ClientboundForceSyncPacket;
import che.swgc.network.ClientboundZRotPacket;
import che.swgc.network.ForceActionPacket;
import che.swgc.network.ForceSecondaryActionPacket;
import che.swgc.network.MobCommandPacket;
import che.swgc.network.SimpleSwgcActionPacket;
import che.swgc.network.SwgcPacket;
import che.swgc.reg.SwgcNetworking;
import java.util.HashMap;
import java.util.function.Function;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

public class FabricNetworking {
   private static final HashMap<Class<? extends SwgcPacket>, CustomPacketPayload.Type<SwgcFabricPayload>> TYPE_BY_CLASS = new HashMap<>();

   public FabricNetworking() {
   }

   public static void init() {
      regPayload(PayloadTypeRegistry.serverboundPlay(), "action", SimpleSwgcActionPacket.class, SimpleSwgcActionPacket::new);
      regPayload(PayloadTypeRegistry.serverboundPlay(), "secaction", ForceSecondaryActionPacket.class, ForceSecondaryActionPacket::new);
      regPayload(PayloadTypeRegistry.serverboundPlay(), "forceaction", ForceActionPacket.class, ForceActionPacket::new);
      regPayload(PayloadTypeRegistry.serverboundPlay(), "command", MobCommandPacket.class, MobCommandPacket::new);
      regPayload(PayloadTypeRegistry.clientboundPlay(), "player", SwgcPacket.ClientboundPlayerWrapper.class, SwgcPacket.ClientboundPlayerWrapper::new);
      regPayload(PayloadTypeRegistry.clientboundPlay(), "force", ClientboundForceSyncPacket.class, ClientboundForceSyncPacket::new);
      regPayload(PayloadTypeRegistry.clientboundPlay(), "caction", SimpleSwgcActionPacket.Clientbound.class, SimpleSwgcActionPacket.Clientbound::new);
      regPayload(PayloadTypeRegistry.clientboundPlay(), "zrot", ClientboundZRotPacket.class, ClientboundZRotPacket::new);
      SwgcNetworking.init(
         packet -> ClientPlayNetworking.send(new SwgcFabricPayload(packet)),
         (player, packet) -> ServerPlayNetworking.send(player, new SwgcFabricPayload(packet)),
         (tracked, packet) -> PlayerLookup.tracking(tracked).forEach(trackingPlayer -> ServerPlayNetworking.send(trackingPlayer, new SwgcFabricPayload(packet)))
      );
      regServerboundHandler(SimpleSwgcActionPacket.class);
      regServerboundHandler(ForceSecondaryActionPacket.class);
      regServerboundHandler(ForceActionPacket.class);
      regServerboundHandler(MobCommandPacket.class);
   }

   private static <T extends SwgcPacket> void regPayload(
      PayloadTypeRegistry<RegistryFriendlyByteBuf> registry,
      String name,
      Class<T> packetClass,
      Function<FriendlyByteBuf, T> decoder
   ) {
      Identifier id = Identifier.fromNamespaceAndPath("swgc", name);
      CustomPacketPayload.Type<SwgcFabricPayload> type = new CustomPacketPayload.Type<>(id);
      TYPE_BY_CLASS.put(packetClass, type);
      registry.register(
         type,
         StreamCodec.of((buf, payload) -> payload.packet().encode(buf), buffer -> new SwgcFabricPayload(decoder.apply(buffer)))
      );
   }

   static <T extends SwgcPacket.Clientbound> CustomPacketPayload.Type<SwgcFabricPayload> typeFor(Class<T> packetClass) {
      return TYPE_BY_CLASS.get(packetClass);
   }

   private static <T extends SwgcPacket.Serverbound> void regServerboundHandler(Class<T> packetClass) {
      ServerPlayNetworking.registerGlobalReceiver(
         TYPE_BY_CLASS.get(packetClass),
         (payload, context) -> context.server().execute(() -> ((T)payload.packet()).handle(context.player()))
      );
   }

   public record SwgcFabricPayload(SwgcPacket packet) implements CustomPacketPayload {
      @Override
      public Type<? extends CustomPacketPayload> type() {
         return TYPE_BY_CLASS.get(packet.getClass());
      }
   }
}
