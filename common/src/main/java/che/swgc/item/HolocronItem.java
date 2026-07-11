package che.swgc.item;

import che.swgc.force.ForcePossessor;
import che.swgc.reg.IRegister;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.ChatFormatting;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import java.util.function.Consumer;

@javax.annotation.ParametersAreNonnullByDefault
public class HolocronItem extends Item {
   private final ChatFormatting color;
   private final Function<ForcePossessor, Integer> getter;
   private final BiConsumer<ForcePossessor, Integer> adder;
   private final int[] ranks;

   public HolocronItem(Properties props, ChatFormatting color, Function<ForcePossessor, Integer> getter, BiConsumer<ForcePossessor, Integer> adder, int... ranks) {
      super(props);
      this.color = color;
      this.getter = getter;
      this.adder = adder;
      this.ranks = ranks;
   }

   public HolocronItem(ChatFormatting color, Function<ForcePossessor, Integer> getter, BiConsumer<ForcePossessor, Integer> adder, int... ranks) {
      this(IRegister.itemProperties().stacksTo(1), color, getter, adder, ranks);
   }

   public static HolocronItem jedi() {
      return new HolocronItem(ChatFormatting.AQUA, ForcePossessor::swgc$getForceBrightSide, ForcePossessor::addForceBrightSide, 10, 24, 42, 54, 72);
   }

   public static HolocronItem sith() {
      return new HolocronItem(ChatFormatting.DARK_RED, ForcePossessor::swgc$getForceDarkSide, ForcePossessor::addForceDarkSide, 8, 18, 40, 55, 70);
   }

   public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltipAdder, TooltipFlag flag) {
      super.appendHoverText(stack, context, display, tooltipAdder, flag);
      tooltipAdder.accept(Component.translatable("item.swgc.holocron.desc").withStyle(this.color));
   }

   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      this.adder.accept((ForcePossessor)player, 5);
      level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.PLAYERS, 1.0F, 0.8F + player.getRandom().nextFloat() * 0.4F);
      String id = this.getDescriptionId() + ".rank";
      player.sendSystemMessage(
         Component.translatable(id, Component.translatable(id + this.getRank(this.getter.apply((ForcePossessor)player)))).withStyle(this.color)
      );
      ItemStack stack = player.getItemInHand(hand);
      if (!player.getAbilities().instabuild) {
         stack.shrink(1);
      }

      return InteractionResult.SUCCESS.heldItemTransformedTo(stack);
   }

   public int getRank(int pts) {
      for (int i = 0; i < this.ranks.length; i++) {
         if (pts < this.ranks[i]) {
            return i;
         }
      }

      return this.ranks.length;
   }
}
