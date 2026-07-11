package che.swgc.reg;

import che.swgc.platform.Services;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.sounds.SoundEvent;

public class SwgcSounds {
   public static final Supplier<SoundEvent> ATRT_STEP;
   public static final Supplier<SoundEvent> STARFIGHTER_ENGINE;
   public static final Supplier<SoundEvent> ROGER_EN;
   public static final Supplier<SoundEvent> ROGER_RU;
   public static final Supplier<SoundEvent> EWOK_AMBIENT;
   public static final Supplier<SoundEvent> EWOK_HUNT;
   public static final Supplier<SoundEvent> EWOK_HURT;
   public static final Supplier<SoundEvent> BLASTER_SHOOT;
   public static final Supplier<SoundEvent> LIGHTSABER_CLASH;
   public static final Supplier<SoundEvent> LIGHTSABER_HUM;
   public static final Supplier<SoundEvent> LIGHTSABER_IN;
   public static final Supplier<SoundEvent> LIGHTSABER_OUT;
   public static final Supplier<SoundEvent> LIGHTSABER_SWING;
   public static final Supplier<SoundEvent> OBEEWAN_CLASH;
   public static final Supplier<SoundEvent> OBEEWAN_HUM;
   public static final Supplier<SoundEvent> OBEEWAN_IN;
   public static final Supplier<SoundEvent> OBEEWAN_OUT;
   public static final Supplier<SoundEvent> OBEEWAN_SWING;

   public SwgcSounds() {
   }

   public static void init() {
   }

   static {
      IRegister<SoundEvent> register = Services.REGISTERS.sounds();
      Function<String, Supplier<SoundEvent>> func = id -> register.register(id, () -> SoundEvent.createVariableRangeEvent(net.minecraft.resources.Identifier.fromNamespaceAndPath("swgc", id)));
      ATRT_STEP = func.apply("entity.atrt.step");
      STARFIGHTER_ENGINE = func.apply("entity.starfighter.engine");
      ROGER_EN = func.apply("entity.droid.roger_en");
      ROGER_RU = func.apply("entity.droid.roger_ru");
      EWOK_AMBIENT = func.apply("entity.ewok.ambient");
      EWOK_HUNT = func.apply("entity.ewok.hunt");
      EWOK_HURT = func.apply("entity.ewok.hurt");
      BLASTER_SHOOT = func.apply("item.blaster.shoot");
      LIGHTSABER_CLASH = func.apply("item.lightsaber.clash");
      LIGHTSABER_HUM = func.apply("item.lightsaber.hum");
      LIGHTSABER_IN = func.apply("item.lightsaber.in");
      LIGHTSABER_OUT = func.apply("item.lightsaber.out");
      LIGHTSABER_SWING = func.apply("item.lightsaber.swing");
      OBEEWAN_CLASH = func.apply("item.obeewan.clash");
      OBEEWAN_HUM = func.apply("item.obeewan.hum");
      OBEEWAN_IN = func.apply("item.obeewan.in");
      OBEEWAN_OUT = func.apply("item.obeewan.out");
      OBEEWAN_SWING = func.apply("item.obeewan.swing");
   }
}
