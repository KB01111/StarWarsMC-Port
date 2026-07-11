package che.swgc;

import che.swgc.platform.Services;
import che.swgc.reg.SwgcBlockEntities;
import che.swgc.reg.SwgcBlocks;
import che.swgc.reg.SwgcEntities;
import che.swgc.reg.SwgcGameRules;
import che.swgc.reg.SwgcItems;
import che.swgc.reg.SwgcSounds;
import che.swgc.reg.SwgcStructures;

public class CommonClass {
   public CommonClass() {
   }

   public static void init() {
      che.swgc.Constants.LOG
         .info(
            "Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName()
         );
      if (Services.PLATFORM.isModLoaded("swgc")) {
         che.swgc.Constants.LOG.info("Hello to swgc");
      }

      SwgcBlocks.init();
      SwgcItems.init();
      SwgcEntities.init();
      SwgcBlockEntities.init();
      SwgcStructures.init();
      SwgcGameRules.init();
      SwgcSounds.init();
   }
}
