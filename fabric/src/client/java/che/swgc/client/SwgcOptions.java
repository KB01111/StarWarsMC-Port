package che.swgc.client;

import java.util.function.Consumer;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import net.minecraft.resources.Identifier;

public class SwgcOptions {
   public static final KeyMapping.Category SWGC_CATEGORY = KeyMapping.Category.register(Identifier.fromNamespaceAndPath("swgc", "swgc"));
   private static SwgcOptions INSTANCE;
   public final OptionInstance<Integer> lightsaberDetailing;
   public final KeyMapping keyLightsaberAttacks = new KeyMapping("key.swgc.lightsaberAttacks", 341, SWGC_CATEGORY);
   public final KeyMapping keyForceActions = new KeyMapping("key.swgc.forceActions", 342, SWGC_CATEGORY);
   public final KeyMapping keyRecharge = new KeyMapping("key.swgc.recharge", 82, SWGC_CATEGORY);

   public SwgcOptions(Consumer<Integer> onLightsaberDetailing) {
      this.lightsaberDetailing = new OptionInstance<>(
         "options.swgc.lightsaberDetailing",
         OptionInstance.noTooltip(),
         (text, value) -> Options.genericValueLabel(text, 1 << value),
         new OptionInstance.IntRange(0, 7),
         4,
         value -> onLightsaberDetailing.accept(value)
      );
   }

   public static void init(Consumer<Integer> onLightsaberDetailing) {
      INSTANCE = new SwgcOptions(onLightsaberDetailing);
   }

   public void regKeys(Consumer<KeyMapping> register) {
      register.accept(this.keyLightsaberAttacks);
      register.accept(this.keyForceActions);
      register.accept(this.keyRecharge);
   }

   public static SwgcOptions getInstance() {
      return INSTANCE;
   }
}
