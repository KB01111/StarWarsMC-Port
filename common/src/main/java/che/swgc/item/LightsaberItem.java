package che.swgc.item;

import che.swgc.SwgcItemAttributes;
import che.swgc.SwgcItemData;

import che.swgc.platform.Services;
import che.swgc.reg.IRegister;
import che.swgc.reg.SwgcItems;
import che.swgc.reg.SwgcSounds;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.ChatFormatting;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import java.util.function.Consumer;

@javax.annotation.ParametersAreNonnullByDefault
public class LightsaberItem extends Item {
   public static final net.minecraft.resources.Identifier YODA_ID = net.minecraft.resources.Identifier.fromNamespaceAndPath("swgc", "yoda");
   public static final net.minecraft.resources.Identifier OBEEWAN_ID = net.minecraft.resources.Identifier.fromNamespaceAndPath("swgc", "obeewan");
   private static final HashMap<net.minecraft.resources.Identifier, Integer> VARIANTS = new HashMap<>();
   protected static final ItemAttributeModifiers ACTIVE_MODIFIERS = SwgcItemAttributes.weapon(12.0, -2.4);
   @Nullable
   public final String defaultHilt;

   public LightsaberItem(@Nullable String defaultHilt, net.minecraft.world.item.Item.Properties properties) {
      super(properties);
      this.defaultHilt = defaultHilt;
   }

   public LightsaberItem(@Nullable String defaultHilt) {
      this(defaultHilt, IRegister.itemProperties().rarity(Rarity.UNCOMMON).stacksTo(1));
   }

   public void appendHoverText(ItemStack stack, Item.Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltipAdder, TooltipFlag flag) {
      super.appendHoverText(stack, context, display, tooltipAdder, flag);
      if (this.defaultHilt != null && flag.isAdvanced()) {
         tooltipAdder.accept(Component.translatable("item.swgc.lightsaber.hilt", getHilt(stack)).withStyle(ChatFormatting.GRAY));
      }
   }

   public void postHurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
      if (isActive(stack)) {
         target.level()
            .playSound(
               null,
               target.getX(),
               target.getY(),
               target.getZ(),
               this.clashSound(stack),
               attacker.getSoundSource(),
               1.0F,
               0.8F + attacker.getRandom().nextFloat() * 0.4F
            );
      }

      return;
   }

   public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot) {
      super.inventoryTick(stack, level, entity, slot);
      boolean active = isActive(stack);
      boolean isSelected = entity instanceof LivingEntity living && (living.getMainHandItem() == stack || living.getOffhandItem() == stack);
      if (level.isClientSide() && entity instanceof LivingEntity living && isSelected && active) {
         Services.CLIENT.tryStartLightsaberHum(living, this.humSound(stack));
      }
   }

   public boolean isCorrectToolForDrops(net.minecraft.world.level.block.state.BlockState state, net.minecraft.world.level.Level level, net.minecraft.core.BlockPos pos, net.minecraft.world.entity.player.Player player) {
      return false;
   }

   public net.minecraft.world.item.ItemStack getDefaultInstance() {
      return this.defaultHilt != null ? variant(super.getDefaultInstance(), YODA_ID) : super.getDefaultInstance();
   }

   public int getUseDuration(ItemStack stack, net.minecraft.world.entity.LivingEntity entity) {
      return 72000;
   }

   public InteractionResult use(Level level, Player player, InteractionHand usedHand) {
      ItemStack stack = player.getItemInHand(usedHand);
      if (canUse(stack, level.getGameTime())) {
         boolean active = !isActive(stack);
         this.setActive(stack, active, player, player.getRandom());
         ItemStack stack1 = player.getItemInHand(usedHand == InteractionHand.MAIN_HAND ? InteractionHand.OFF_HAND : InteractionHand.MAIN_HAND);
         if (stack1.getItem() instanceof LightsaberItem && active != isActive(stack1)) {
            this.setActive(stack1, active, player, player.getRandom());
         }

         player.awardStat(Stats.ITEM_USED.get(this));
         return InteractionResult.CONSUME.heldItemTransformedTo(stack);
      } else {
         return InteractionResult.PASS;
      }
   }

   private static boolean canUse(net.minecraft.world.item.ItemStack stack, long time) {
      long tick = time - getActivatedTick(stack);
      if (tick > 0L) {
         return tick >= 4L;
      } else {
         setActivatedTick(stack, time - 25L);
         return true;
      }
   }

   public net.minecraft.sounds.SoundEvent activateSound(net.minecraft.world.item.ItemStack stack) {
      return (isBee(stack) ? SwgcSounds.OBEEWAN_OUT : SwgcSounds.LIGHTSABER_OUT).get();
   }

   public net.minecraft.sounds.SoundEvent humSound(net.minecraft.world.item.ItemStack stack) {
      return (isBee(stack) ? SwgcSounds.OBEEWAN_HUM : SwgcSounds.LIGHTSABER_HUM).get();
   }

   public net.minecraft.sounds.SoundEvent swingSound(net.minecraft.world.item.ItemStack stack) {
      return (isBee(stack) ? SwgcSounds.OBEEWAN_SWING : SwgcSounds.LIGHTSABER_SWING).get();
   }

   public net.minecraft.sounds.SoundEvent clashSound(net.minecraft.world.item.ItemStack stack) {
      return (isBee(stack) ? SwgcSounds.OBEEWAN_CLASH : SwgcSounds.LIGHTSABER_CLASH).get();
   }

   public net.minecraft.sounds.SoundEvent deactivateSound(net.minecraft.world.item.ItemStack stack) {
      return (isBee(stack) ? SwgcSounds.OBEEWAN_IN : SwgcSounds.LIGHTSABER_IN).get();
   }

   public static net.minecraft.sounds.SoundEvent swingSoundStatic(net.minecraft.world.item.ItemStack stack) {
      return stack.getItem() instanceof LightsaberItem lightsaber ? lightsaber.swingSound(stack) : SwgcSounds.LIGHTSABER_SWING.get();
   }

   public static net.minecraft.sounds.SoundEvent clashSoundStatic(net.minecraft.world.item.ItemStack stack) {
      return stack.getItem() instanceof LightsaberItem lightsaber ? lightsaber.clashSound(stack) : SwgcSounds.LIGHTSABER_CLASH.get();
   }

   public static boolean isActive(net.minecraft.world.item.ItemStack stack) {
      return stack.getItem() instanceof LightsaberItem && SwgcItemData.getOrCreate(stack).getBooleanOr("Active", false);
   }

   public static void setActive(ItemStack stack, boolean value) {
      SwgcItemData.update(stack, tag -> tag.putBoolean("Active", value));
      if (value) {
         stack.set(DataComponents.ATTRIBUTE_MODIFIERS, ACTIVE_MODIFIERS);
      } else {
         stack.remove(DataComponents.ATTRIBUTE_MODIFIERS);
      }
   }

   public static long getActivatedTick(net.minecraft.world.item.ItemStack stack) {
      return SwgcItemData.getOrCreate(stack).getLongOr("ActivatedTick", 0L);
   }

   public static void setActivatedTick(net.minecraft.world.item.ItemStack stack, long activatedTick) {
      SwgcItemData.getOrCreate(stack).putLong("ActivatedTick", activatedTick);
   }

   public void setActive(net.minecraft.world.item.ItemStack stack, boolean value, net.minecraft.world.entity.Entity wielder, net.minecraft.util.RandomSource random) {
      net.minecraft.world.level.Level lvl = wielder.level();
      if (!lvl.isClientSide()) {
         setActive(stack, value);
         setActivatedTick(stack, lvl.getGameTime());
         lvl.playSound(
            null,
            wielder.getX(),
            wielder.getY() + wielder.getBbHeight() * 0.375,
            wielder.getZ(),
            value ? this.activateSound(stack) : this.deactivateSound(stack),
            net.minecraft.sounds.SoundSource.PLAYERS,
            1.0F,
            che.swgc.SwgcUtils.soundPitch(random)
         );
      }
   }

   public static int getColor(net.minecraft.world.item.ItemStack stack) {
      return SwgcItemData.getOrCreate(stack).getIntOr("Color", 0);
   }

   public static void setColor(net.minecraft.world.item.ItemStack stack, int color) {
      SwgcItemData.getOrCreate(stack).putInt("Color", color);
   }

   public static net.minecraft.resources.Identifier getHilt(net.minecraft.world.item.ItemStack stack) {
      return Identifier.fromNamespaceAndPath("swgc", SwgcItemData.getOrCreate(stack).getStringOr("Hilt", "yoda"));
   }

   public static void setHilt(net.minecraft.world.item.ItemStack stack, net.minecraft.resources.Identifier hilt) {
      SwgcItemData.getOrCreate(stack).putString("Hilt", hilt.toString());
   }

   private static boolean isBee(net.minecraft.world.item.ItemStack stack) {
      return getHilt(stack).equals(OBEEWAN_ID);
   }

   public static net.minecraft.world.item.ItemStack variant(net.minecraft.world.item.ItemStack stack, net.minecraft.resources.Identifier id) {
      setHilt(stack, id);
      if (VARIANTS.containsKey(id)) {
         setColor(stack, VARIANTS.get(id));
      }

      return stack;
   }

   public static net.minecraft.world.item.ItemStack variant(net.minecraft.resources.Identifier id) {
      return variant(new net.minecraft.world.item.ItemStack((net.minecraft.world.level.ItemLike)SwgcItems.LIGHTSABER.get()), id);
   }

   public static net.minecraft.world.item.ItemStack variant(String id) {
      return variant(Identifier.fromNamespaceAndPath("swgc", id));
   }

   public static void regVariant(net.minecraft.resources.Identifier id, int color) {
      VARIANTS.put(id, color);
   }

   public static void regVariant(String id, int color) {
      regVariant(Identifier.fromNamespaceAndPath("swgc", id), color);
   }

   public static Set<net.minecraft.resources.Identifier> getAllHilts() {
      return VARIANTS.keySet();
   }

   static {
      regVariant("yoda", -16711936);
      regVariant("quigon", -16711936);
      regVariant("kenobi", -16776961);
      regVariant("anakin", -16776961);
      regVariant("windu", -4783889);
      regVariant("revan", -4783889);
      regVariant("padawan", -16711936);
      regVariant("padawan2", -16776961);
      regVariant("dooku", -65536);
      regVariant("vader", -65536);
      regVariant("jarrus", -16776961);
      regVariant("mastiff", -8404993);
      regVariant("diorite", -16728177);
      regVariant("luke", -16711936);
      regVariant("katana", -256);
      regVariant("punk", -16776961);
      regVariant("kestis", -4783889);
      regVariant("kestis2", -16776961);
      regVariant("liquid", -16776961);
      regVariant("sidious", -65536);
      regVariant("ki_adi", -16776961);
      regVariant("darth", -65536);
      regVariant("ezra", -16711936);
      regVariant("rampant", -16711936);
      regVariant("skebobe", -6332672);
      regVariant("maulkiller", -16776961);
      regVariant("malgus", -65536);
      regVariant("cassiopeia", -16776961);
      regVariant("obeewan", -13620425);
      regVariant("frog", -532590);
      regVariant("wookiee", -16711936);
      regVariant("brick", -16711936);
      regVariant("crew", -16711936);
      regVariant("general", -4783889);
      regVariant("shield", -65536);
      regVariant("warrior", -16776961);
   }
}
