package che.swgc;

import che.swgc.force.ForcePossessor;
import che.swgc.network.ClientboundForceSyncPacket;
import che.swgc.reg.SwgcEntities;
import che.swgc.reg.SwgcNetworking;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.server.level.ServerLevel;

public class FabricCommonClass implements ModInitializer {
   public FabricCommonClass() {
   }

   public void onInitialize() {
      che.swgc.Constants.LOG.info("Hello Fabric world!");
      che.swgc.CommonClass.init();
      che.swgc.FabricNetworking.init();
      SwgcEntities.regAttributes(FabricDefaultAttributeRegistry::register);
      ServerTickEvents.END_LEVEL_TICK.register((ServerLevel lvl) -> lvl.players().forEach(che.swgc.SwgcHooks::forcePossessorTick));
      ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register((world, entity, killedEntity, damageSource) -> che.swgc.SwgcHooks.kill(entity, killedEntity));
      EntityTrackingEvents.START_TRACKING.register((trackedEntity, player) -> {
         if (trackedEntity instanceof net.minecraft.world.entity.player.Player player1 && ((ForcePossessor)player1).possessesForce()) {
            SwgcNetworking.sendToClient(player, new ClientboundForceSyncPacket(player1));
         }
      });
      ServerPlayerEvents.COPY_FROM.register((oldPlayer, newPlayer, alive) -> {
         che.swgc.SwgcHooks.clonePlayers(oldPlayer, newPlayer);
         SwgcNetworking.sendToClient(newPlayer, new ClientboundForceSyncPacket(newPlayer));
      });
   }
}
