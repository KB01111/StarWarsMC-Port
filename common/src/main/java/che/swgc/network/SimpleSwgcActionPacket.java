package che.swgc.network;

import che.swgc.entity.RiderControlledLongAttack;
import che.swgc.force.ForcePossessor;
import che.swgc.item.BlasterItem;
import che.swgc.reg.SwgcItems;
import che.swgc.reg.SwgcNetworking;
import java.util.Objects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;

public class SimpleSwgcActionPacket implements SwgcPacket.Serverbound {
   final byte id;

   public SimpleSwgcActionPacket(int id) {
      this.id = (byte)id;
   }

   public SimpleSwgcActionPacket(net.minecraft.network.FriendlyByteBuf buf) {
      this.id = buf.readByte();
   }

   @Override
   public void encode(net.minecraft.network.FriendlyByteBuf buf) {
      buf.writeVarInt(this.id);
   }

   @Override
   public void handle(net.minecraft.server.level.ServerPlayer sender) {
      handle(sender, this.id);
      if (this.id >= 0) {
         SwgcNetworking.sendToTracking(sender, new SimpleSwgcActionPacket.Clientbound(this.id, sender.getId()));
      }
   }

   public static void handle(net.minecraft.world.entity.player.Player player, int id) {
      net.minecraft.world.item.ItemStack stack = player.getMainHandItem();
      switch (id) {
         case -128:
            if (stack.getItem() instanceof BlasterItem blasterx && player.getAttackStrengthScale(0.5F) > 0.9F && blasterx.canShoot(player, stack)) {
               blasterx.shoot(player.level(), player, stack, null);
            }
            break;
         case -127:
            net.minecraft.world.item.ItemStack stack1 = BlasterItem.findAmmo(player.getInventory());
            if (stack1 != null && stack.getItem() instanceof BlasterItem blaster) {
               blaster.setAmmo(stack, blaster.maxAmmo);
               if (!player.getAbilities().instabuild) {
                  stack1.shrink(1);
                  if (!player.getInventory().add(SwgcItems.EMPTY_GAS_VESSEL.get().getDefaultInstance())) {
                     player.drop(SwgcItems.EMPTY_GAS_VESSEL.get().getDefaultInstance(), false);
                  }
               }
            }
            break;
         case -126:
            if (stack.getItem() instanceof BlasterItem blaster) {
               blaster.setAiming(stack, false);
            }
            break;
         case -125:
            if (player.getVehicle() instanceof RiderControlledLongAttack vehicle) {
               vehicle.setLongAttacking(!vehicle.isLongAttacking());
            }
            break;
         case 0:
            ((ForcePossessor)player).startLightsaberAttacking();
            break;
         case 1:
            ((ForcePossessor)player).swgc$stopAllForceActions();
      }
   }

   public static class Clientbound implements SwgcPacket.Clientbound {
      private final byte id;
      private final int playerId;

      public Clientbound(byte id, int playerId) {
         this.id = id;
         this.playerId = playerId;
      }

      public Clientbound(net.minecraft.network.FriendlyByteBuf buf) {
         this(buf.readByte(), buf.readVarInt());
      }

      @Override
      public void encode(net.minecraft.network.FriendlyByteBuf buf) {
         buf.writeByte(this.id);
         buf.writeVarInt(this.playerId);
      }

      @Override
      public void handle(net.minecraft.client.Minecraft mc) {
         if (Objects.requireNonNull(mc.level).getEntity(this.playerId) instanceof net.minecraft.world.entity.player.Player player) {
            SimpleSwgcActionPacket.handle(player, this.id);
         }
      }
   }
}
