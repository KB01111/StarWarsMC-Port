package che.swgc.reg;

import che.swgc.entity.B1Droid;
import che.swgc.entity.B2Droid;
import che.swgc.entity.BlasterBolt;
import che.swgc.entity.Clone;
import che.swgc.entity.Droideka;
import che.swgc.entity.Ewok;
import che.swgc.entity.EwokShaman;
import che.swgc.entity.EwokSpear;
import che.swgc.entity.Jawa;
import che.swgc.entity.ObeseWan;
import che.swgc.entity.RoyalGuardian;
import che.swgc.entity.StarFighter;
import che.swgc.entity.ThrownLightsaber;
import che.swgc.entity.Walker;
import che.swgc.platform.Services;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

public class SwgcEntities {
   public static final Supplier<EntityType<Walker>> ATRT;
   public static final Supplier<EntityType<Walker>> ATST;
   public static final Supplier<EntityType<StarFighter>> DELTA7B;
   public static final Supplier<EntityType<B1Droid>> B1;
   public static final Supplier<EntityType<B2Droid>> B2;
   public static final Supplier<EntityType<Droideka>> DROIDEKA;
   public static final Supplier<EntityType<Clone>> CLONE;
   public static final Supplier<EntityType<RoyalGuardian>> ROYAL_GURDIAN;
   public static final Supplier<EntityType<Ewok>> EWOK;
   public static final Supplier<EntityType<EwokShaman>> EWOK_SHAMAN;
   public static final Supplier<EntityType<Jawa>> JAWA;
   public static final Supplier<EntityType<ObeseWan>> OBESE_WAN;
   public static final Supplier<EntityType<ThrownLightsaber>> THROWN_LIGHTSABER;
   public static final Supplier<EntityType<BlasterBolt>> BLASTER_BOLT;
   public static final Supplier<EntityType<EwokSpear>> EWOK_SPEAR;
   public static final TagKey<EntityType<?>> INNOCENT = TagKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath("swgc", "innocent"));

   public SwgcEntities() {
   }

   public static void init() {
   }

   private static <T extends Entity> Supplier<EntityType<T>> reg(IRegister<EntityType<?>> register, String name, EntityType.Builder<T> builder) {
      ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath("swgc", name));
      return register.register(name, () -> builder.build(key));
   }

   public static void regAttributes(BiConsumer<EntityType<? extends LivingEntity>, AttributeSupplier> register) {
      register.accept(ATRT.get(), Walker.createAtrtAttributes().build());
      register.accept(ATST.get(), Walker.createAtstAttributes().build());
      register.accept(DELTA7B.get(), StarFighter.createAttributes().build());
      register.accept(B1.get(), B1Droid.createAttributes().build());
      register.accept(B2.get(), B2Droid.createAttributes().build());
      register.accept(DROIDEKA.get(), Droideka.createAttributes().build());
      register.accept(CLONE.get(), Clone.createAttributes().build());
      register.accept(ROYAL_GURDIAN.get(), RoyalGuardian.createAttributes().build());
      register.accept(EWOK.get(), Ewok.createAttributes().build());
      register.accept(EWOK_SHAMAN.get(), EwokShaman.createAttributes().build());
      register.accept(JAWA.get(), Jawa.createAttributes().build());
      register.accept(OBESE_WAN.get(), ObeseWan.createAttributes().build());
   }

   static {
      IRegister<EntityType<?>> register = Services.REGISTERS.entities();
      ATRT = reg(
         register,
         "atrt",
         EntityType.Builder.<Walker>of((EntityType<Walker> type, net.minecraft.world.level.Level lvl) -> new Walker(type, lvl, SwgcItems.ATRT, -16776961), MobCategory.MISC).sized(1.6F, 4.7F)
      );
      ATST = reg(
         register,
         "atst",
         EntityType.Builder.<Walker>of((EntityType<Walker> type, net.minecraft.world.level.Level lvl) -> new Walker(type, lvl, SwgcItems.ATST, -65536), MobCategory.MISC).sized(2.3F, 6.5F)
      );
      DELTA7B = reg(register, "delta7b", EntityType.Builder.of(StarFighter::new, MobCategory.MISC).sized(2.5F, 2.0F));
      B1 = reg(register, "b1", EntityType.Builder.of(B1Droid::new, MobCategory.MISC).sized(0.3F, 1.9F));
      B2 = reg(register, "b2", EntityType.Builder.of(B2Droid::new, MobCategory.MISC).sized(0.8F, 2.5F));
      DROIDEKA = reg(register, "droideka", EntityType.Builder.of(Droideka::new, MobCategory.MISC).sized(0.5F, 1.6F));
      CLONE = reg(register, "clone", EntityType.Builder.of(Clone::new, MobCategory.MISC).sized(0.6F, 1.8F));
      ROYAL_GURDIAN = reg(register, "royal_guardian", EntityType.Builder.of(RoyalGuardian::new, MobCategory.MISC).sized(0.6F, 1.8F));
      EWOK = reg(register, "ewok", EntityType.Builder.of(Ewok::new, MobCategory.MISC).sized(0.375F, 1.4F));
      EWOK_SHAMAN = reg(register, "ewok_shaman", EntityType.Builder.of(EwokShaman::new, MobCategory.MISC).sized(0.7F, 1.93F));
      JAWA = reg(register, "jawa", EntityType.Builder.of(Jawa::new, MobCategory.MISC).sized(0.4F, 1.1F));
      OBESE_WAN = reg(register, "obese_wan", EntityType.Builder.of(ObeseWan::new, MobCategory.MISC).sized(0.6F, 1.8F));
      THROWN_LIGHTSABER = reg(register, "thrown_lightsaber", EntityType.Builder.<ThrownLightsaber>of(ThrownLightsaber::new, MobCategory.MISC).sized(1.0F, 0.125F));
      BLASTER_BOLT = reg(register, "blaster_bolt", EntityType.Builder.<BlasterBolt>of(BlasterBolt::new, MobCategory.MISC).sized(0.125F, 0.125F));
      EWOK_SPEAR = reg(register, "ewok_spear", EntityType.Builder.<EwokSpear>of(EwokSpear::new, MobCategory.MISC).sized(0.3F, 0.3F));
   }
}
