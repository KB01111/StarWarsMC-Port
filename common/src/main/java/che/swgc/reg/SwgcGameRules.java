package che.swgc.reg;

import che.swgc.platform.Services;
import net.minecraft.world.level.gamerules.GameRule;

public class SwgcGameRules {
   public static final net.minecraft.world.level.gamerules.GameRule<Boolean> RULE_FORCEOBTAINMENT = Services.REGISTERS.regBooleanGameRule("forceObtainment", net.minecraft.world.level.gamerules.GameRuleCategory.PLAYER, true);

   public SwgcGameRules() {
   }

   public static void init() {
   }
}
