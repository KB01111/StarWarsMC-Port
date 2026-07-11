package che.swgc.platform;

import che.swgc.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

public class FabricPlatformHelper implements IPlatformHelper {
   public FabricPlatformHelper() {
   }

   @Override
   public String getPlatformName() {
      return "Fabric";
   }

   @Override
   public boolean isModLoaded(String modId) {
      return FabricLoader.getInstance().isModLoaded(modId);
   }

   @Override
   public boolean isDevelopmentEnvironment() {
      return FabricLoader.getInstance().isDevelopmentEnvironment();
   }
}
