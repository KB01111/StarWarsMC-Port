package che.swgc.entity;

import che.swgc.reg.SwgcItems;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;

@javax.annotation.ParametersAreNonnullByDefault
public class Ewok extends AbstractEwok implements net.minecraft.world.entity.monster.RangedAttackMob {
   private static final net.minecraft.network.syncher.EntityDataAccessor<String> DATA_VARIANT_ID = net.minecraft.network.syncher.SynchedEntityData.defineId(Ewok.class, net.minecraft.network.syncher.EntityDataSerializers.STRING);

   public Ewok(net.minecraft.world.entity.EntityType<? extends Ewok> type, net.minecraft.world.level.Level lvl) {
      super(type, lvl);
      this.rangedAttackGoal = new AbstractEwok.EwokRangedAttackGoal(1.0, 30, 24.0F);
   }

   @Override
   public net.minecraft.world.item.ItemStack getDefaultWeapon() {
      return SwgcItems.EWOK_SPEAR.get().getDefaultInstance();
   }

   @Override
   public void performRangedAttack(net.minecraft.world.entity.LivingEntity livingEntity, float v) {
      EwokSpear spear = new EwokSpear(this.level(), this, this.getMainHandItem());
      net.minecraft.world.phys.Vec3 vec3 = livingEntity.position().add(0.0, (double)(livingEntity.getBbHeight() * 0.75F), 0.0).subtract(spear.position());
      float power = 2.0F;
      if (this.level() instanceof net.minecraft.server.level.ServerLevel serverLevel) {
         power += Math.min(serverLevel.getCurrentDifficultyAt(this.blockPosition()).getEffectiveDifficulty() * 0.25F, 1.0F);
      }

      spear.shoot(vec3.x, vec3.y, vec3.z, power, 0.0F);
      this.level().addFreshEntity(spear);
   }

   @Nullable
   @Override
   public net.minecraft.world.entity.SpawnGroupData finalizeSpawn(net.minecraft.world.level.ServerLevelAccessor lvl, net.minecraft.world.DifficultyInstance difficulty, net.minecraft.world.entity.EntitySpawnReason spawnType, @Nullable net.minecraft.world.entity.SpawnGroupData data) {
      this.setVariant(Ewok.Variant.values()[lvl.getRandom().nextInt(Ewok.Variant.values().length)]);
      return super.finalizeSpawn(lvl, difficulty, spawnType, data);
   }

   @Override
   protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput tag) {
      super.readAdditionalSaveData(tag);

      try {
         this.setVariant(Ewok.Variant.valueOf(tag.getStringOr("Variant", Ewok.Variant.ORANGE.name())));
      } catch (IllegalArgumentException var3) {
      }
   }

   @Override
   protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.putString("Variant", this.getVariant().name());
   }

   @Override
   protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(DATA_VARIANT_ID, Ewok.Variant.ORANGE.name());
   }

   public Ewok.Variant getVariant() {
      return Ewok.Variant.valueOf(this.entityData.get(DATA_VARIANT_ID));
   }

   public void setVariant(Ewok.Variant variant) {
      this.entityData.set(DATA_VARIANT_ID, variant.name());
   }

   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {
      return createMobAttributes().add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 16.0).add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.3).add(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE, 1.0);
   }

   public static enum Variant {
      DARK_GREEN,
      DARK_ORANGE,
      GREEN,
      ORANGE,
      WINE;
   }
}
