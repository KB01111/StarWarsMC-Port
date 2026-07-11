package che.swgc;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

public class SwgcComponents {
   public static final net.minecraft.network.chat.Component EMPTY_UNIT = net.minecraft.network.chat.Component.translatable("gui.swgc.empty_unit");
   public static final net.minecraft.network.chat.Component EMPTY_LINE = repeatedNTimes(EMPTY_UNIT, 10);
   public static final net.minecraft.network.chat.Component FULL_UNIT = net.minecraft.network.chat.Component.translatable("gui.swgc.full_unit");
   public static final net.minecraft.network.chat.Component FULL_LINE = repeatedNTimes(FULL_UNIT, 10);

   public SwgcComponents() {
   }

   public static net.minecraft.network.chat.MutableComponent repeatedNTimes(net.minecraft.network.chat.Component component, int n) {
      if (n <= 0) {
         return net.minecraft.network.chat.Component.empty();
      } else {
         net.minecraft.network.chat.MutableComponent component1 = component.copy();

         for (int i = 1; i < n; i++) {
            component1.append(component);
         }

         return component1;
      }
   }
}
