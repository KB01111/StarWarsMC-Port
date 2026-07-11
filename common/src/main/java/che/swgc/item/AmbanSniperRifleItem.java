package che.swgc.item;

import che.swgc.SwgcItemAttributes;
import che.swgc.reg.IRegister;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;

@javax.annotation.ParametersAreNonnullByDefault
public class AmbanSniperRifleItem extends BlasterItem {
   public AmbanSniperRifleItem(Properties props) {
      super(props, -65536, 17.0F, 4.0F, 0.0F, 12);
   }

   public AmbanSniperRifleItem() {
      this(IRegister.itemProperties().stacksTo(1).attributes(SwgcItemAttributes.weapon(8.0, -2.8)));
   }

   @Override
   public boolean canShoot(Player player, ItemStack stack) {
      return super.canShoot(player, stack) && (!player.isLocalPlayer() || Minecraft.getInstance().crosshairPickEntity == null);
   }
}
