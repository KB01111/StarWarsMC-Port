package che.swgc.force;

import net.minecraft.util.StringRepresentable;
import javax.annotation.ParametersAreNonnullByDefault;

@javax.annotation.ParametersAreNonnullByDefault
public interface ForceAction extends net.minecraft.util.StringRepresentable {
   String getName();

   default String getSerializedName() {
      return this.getName();
   }

   default int getFrame() {
      return 1;
   }
}
