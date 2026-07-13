package che.swgc;

import che.swgc.client.SwgcClientRegister;
import che.swgc.client.SwgcHooksClient;
import che.swgc.client.SwgcOptions;
import che.swgc.client.SwgcSplashManager;
import che.swgc.client.gui.ModGui;
import che.swgc.client.gui.SwgcHudElements;
import che.swgc.client.renderer.item.SwgcItemSpecialRenderer;
import che.swgc.force.ForcePossessor;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.Objects;
import java.util.stream.Stream;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.fabricmc.fabric.api.event.client.player.ClientPreAttackCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.special.SpecialModelRenderers;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackType;

public class FabricClientClass implements ClientModInitializer {
   public FabricClientClass() {
   }

   @Override
   public void onInitializeClient() {
      SwgcOptions.init(i -> {
      });
      readSettings();
      ClientLifecycleEvents.CLIENT_STOPPING.register(client -> saveSettings());
      ResourceManagerHelper.get(PackType.CLIENT_RESOURCES).registerReloadListener(SwgcSplashManager.INSTANCE);
      SwgcOptions.getInstance().regKeys(KeyMappingHelper::registerKeyMapping);
      FabricNetworkingClient.initClient();
      SpecialModelRenderers.ID_MAPPER.put(Identifier.fromNamespaceAndPath("swgc", "item"), SwgcItemSpecialRenderer.MAP_CODEC);
      SwgcClientRegister.registerEntityLayers(ModelLayerRegistry::registerModelLayer);
      SwgcClientRegister.registerItemRenderers(Minecraft.getInstance().getEntityModels());
      SwgcClientRegister.registerEntityRenderers((type, factory) -> {}, (type, factory) -> {});
      SwgcHudElements.EVENT.register((graphics, tickDelta) -> {
         LocalPlayer player = Minecraft.getInstance().player;
         if (player == null) {
            return;
         }

         ModGui.renderForceHotbar(player, graphics, graphics.guiWidth(), graphics.guiHeight());
         ModGui.renderBlasterCharge(graphics, player, Minecraft.getInstance().font);
      });
      ClientTickEvents.END_CLIENT_TICK.register(client -> {
         if (client.level != null) {
            client.level.players().forEach(SwgcHooks::forcePossessorTick);
         }

         SwgcHooksClient.forcePossessorTick();
         SwgcHooksClient.handleKeys();
         if (!client.options.keyUse.isDown()) {
            SwgcHooksClient.updateBlasterAim();
         }
      });
      ClientPreAttackCallback.EVENT.register((client, player, clickCount) -> {
         ForcePossessor forcePossessor = (ForcePossessor)player;
         return SwgcHooksClient.lmb(player, forcePossessor, forcePossessor.swgc$getForceSecondaryAction());
      });
   }

   private static void readSettings() {
      try (Stream<String> lines = Files.lines(Minecraft.getInstance().gameDirectory.toPath().resolve("config/swgc-client.toml"))) {
         lines.forEach(line -> {
            if (!line.isEmpty() && line.charAt(0) != '#') {
               SwgcOptions.getInstance().lightsaberDetailing.set(Integer.valueOf(line.substring(line.indexOf(61) + 2)));
            }
         });
      } catch (IOException ignored) {
      }
   }

   private static void saveSettings() {
      try (PrintStream output = new PrintStream(Minecraft.getInstance().gameDirectory.toPath().resolve("config/swgc-client.toml").toFile())) {
         output.println("#Range: 0 ~ 7");
         output.println("lightsaberDetailing = " + SwgcOptions.getInstance().lightsaberDetailing.get());
      } catch (IOException ignored) {
      }
   }
}
