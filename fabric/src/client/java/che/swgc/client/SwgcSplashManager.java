package che.swgc.client;

import che.swgc.platform.Services;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.ParametersAreNonnullByDefault;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.ResourceManager;

@ParametersAreNonnullByDefault
public class SwgcSplashManager implements IdentifiableResourceReloadListener {
   public static final SwgcSplashManager INSTANCE = new SwgcSplashManager();
   private static final Identifier SPLASHES_LOCATION = Identifier.fromNamespaceAndPath("swgc", "texts/splashes.txt");
   private List<String> splashes = List.of();

   private SwgcSplashManager() {
   }

   public List<String> getSplashes() {
      return this.splashes;
   }

   @Override
   public Identifier getFabricId() {
      return Identifier.fromNamespaceAndPath("swgc", "swgc_splashes");
   }

   @Override
   public CompletableFuture<Void> reload(
      PreparableReloadListener.SharedState state,
      Executor backgroundExecutor,
      PreparableReloadListener.PreparationBarrier preparationBarrier,
      Executor gameExecutor
   ) {
      ResourceManager resourceManager = state.resourceManager();
      return CompletableFuture.supplyAsync(() -> this.loadSplashes(resourceManager), backgroundExecutor)
         .thenCompose(preparationBarrier::wait)
         .thenAcceptAsync(splashes -> this.splashes = splashes, gameExecutor);
   }

   private List<String> loadSplashes(ResourceManager resourceManager) {
      try (BufferedReader reader = resourceManager.openAsReader(SPLASHES_LOCATION)) {
         int excludeSplash = "Forge".equals(Services.PLATFORM.getPlatformName()) ? 1136674271 : -1156085269;
         return reader.lines().map(String::trim).filter(s -> s.hashCode() != excludeSplash).collect(Collectors.toList());
      } catch (IOException exception) {
         return Collections.emptyList();
      }
   }
}
