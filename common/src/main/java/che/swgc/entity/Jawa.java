package che.swgc.entity;



import che.swgc.item.BlasterItem;

import che.swgc.item.LightsaberItem;

import che.swgc.reg.SwgcItems;

import java.util.EnumSet;

import javax.annotation.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.world.ContainerHelper;

import net.minecraft.world.DifficultyInstance;

import net.minecraft.world.InteractionHand;

import net.minecraft.world.InteractionResult;

import net.minecraft.world.damagesource.DamageSource;

import net.minecraft.world.entity.EntityType;

import net.minecraft.world.entity.Mob;

import net.minecraft.world.entity.SpawnGroupData;

import net.minecraft.world.entity.ai.goal.FloatGoal;

import net.minecraft.world.entity.ai.goal.Goal;

import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;

import net.minecraft.world.entity.ai.goal.RandomStrollGoal;

import net.minecraft.world.entity.ai.goal.RangedAttackGoal;

import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;

import net.minecraft.world.entity.item.ItemEntity;

import net.minecraft.world.entity.monster.RangedAttackMob;

import net.minecraft.world.entity.npc.Npc;

import net.minecraft.world.entity.player.Player;

import net.minecraft.world.inventory.MerchantMenu;

import net.minecraft.world.item.ItemStack;

import net.minecraft.world.item.Items;

import net.minecraft.world.item.trading.ItemCost;

import net.minecraft.world.item.trading.Merchant;

import net.minecraft.world.item.trading.MerchantOffer;

import net.minecraft.world.item.trading.MerchantOffers;

import net.minecraft.world.level.Level;

import net.minecraft.core.NonNullList;

import net.minecraft.sounds.SoundEvent;

import net.minecraft.sounds.SoundEvents;

import net.minecraft.util.Mth;

import net.minecraft.world.entity.EntitySpawnReason;

import net.minecraft.world.entity.ai.attributes.Attributes;

import net.minecraft.world.level.ServerLevelAccessor;

import net.minecraft.server.level.ServerLevel;

import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;



@javax.annotation.ParametersAreNonnullByDefault

public class Jawa extends StarWarsWeaponWieldingPathfindingMob implements net.minecraft.world.entity.monster.RangedAttackMob, net.minecraft.world.item.trading.Merchant, net.minecraft.world.entity.npc.Npc {

   private final net.minecraft.core.NonNullList<net.minecraft.world.item.ItemStack> inventory = net.minecraft.core.NonNullList.withSize(9, net.minecraft.world.item.ItemStack.EMPTY);

   private net.minecraft.world.item.trading.MerchantOffers offers;

   @Nullable

   private net.minecraft.world.entity.player.Player tradingPlayer;



   public Jawa(net.minecraft.world.entity.EntityType<? extends Jawa> entityType, net.minecraft.world.level.Level level) {

      super(entityType, level);

   }



   @Override

   protected net.minecraft.world.InteractionResult mobInteract(net.minecraft.world.entity.player.Player player, net.minecraft.world.InteractionHand hand) {

      if (!this.level().isClientSide() && this.canTrade() && this.tradingPlayer == null && !this.getOffers().isEmpty()) {

         this.setTradingPlayer(player);

         this.openTradingScreen(player, this.getDisplayName(), 1);

         return net.minecraft.world.InteractionResult.SUCCESS;

      } else {

         return super.mobInteract(player, hand);

      }

   }



   @Override

   public void aiStep() {

      this.updateSwingTime();

      super.aiStep();

   }



   @Override

   protected void registerGoals() {

      super.registerGoals();

      this.goalSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.FloatGoal(this));

      this.goalSelector.addGoal(2, new Jawa.TradeWithPlayerGoal());

      this.goalSelector.addGoal(3, new Jawa.FindWantedItemGoal());

      this.goalSelector.addGoal(4, new Jawa.JawaRangedAttackGoal(1.0, 15, 32.0F));

      this.goalSelector.addGoal(5, new net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));

      this.goalSelector.addGoal(6, new net.minecraft.world.entity.ai.goal.RandomStrollGoal(this, 0.8));

      this.goalSelector.addGoal(7, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(this, net.minecraft.world.entity.player.Player.class, 16.0F));

      this.goalSelector.addGoal(8, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(this, Jawa.class, 16.0F));

   }



   @Nullable

   @Override

   public net.minecraft.world.entity.SpawnGroupData finalizeSpawn(net.minecraft.world.level.ServerLevelAccessor level, net.minecraft.world.DifficultyInstance difficulty, net.minecraft.world.entity.EntitySpawnReason reason, @Nullable net.minecraft.world.entity.SpawnGroupData spawnData) {

      super.finalizeSpawn(level, difficulty, reason, spawnData);

      this.inventory.set(0, SwgcItems.JAWA_BLASTER.get().getDefaultInstance());

      this.setCanPickUpLoot(true);

      return spawnData;

   }



   @Override

   public boolean hurtServer(net.minecraft.server.level.ServerLevel serverLevel, net.minecraft.world.damagesource.DamageSource source, float amount) {

      this.setTradingPlayer(null);

      return super.hurtServer(serverLevel, source, amount);

   }



   @Override

   public void die(net.minecraft.world.damagesource.DamageSource damageSource) {

      super.die(damageSource);

      this.setTradingPlayer(null);

   }



   @Override

   protected void dropCustomDeathLoot(net.minecraft.server.level.ServerLevel serverLevel, net.minecraft.world.damagesource.DamageSource damageSource, boolean recentlyHit) {

      super.dropCustomDeathLoot(serverLevel, damageSource, recentlyHit);



      for (net.minecraft.world.item.ItemStack stack : this.inventory) {

         if (!stack.isEmpty() && (!stack.is(SwgcItems.JAWA_BLASTER.get()) || this.random.nextFloat() < net.minecraft.world.entity.Mob.MAX_PICKUP_LOOT_CHANCE)) {

            this.drop(stack, false, false);

         }

      }

   }



   public boolean canGather(net.minecraft.world.item.ItemStack stack) {

      return stack.is(net.minecraft.world.item.Items.EMERALD)

         || this.inventory

            .stream()

            .anyMatch(stack.getItem() instanceof BlasterItem ? stack1 -> !(stack1.getItem() instanceof BlasterItem) : net.minecraft.world.item.ItemStack::isEmpty);

   }



   @Override

   protected void pickUpItem(net.minecraft.server.level.ServerLevel serverLevel, net.minecraft.world.entity.item.ItemEntity itemEntity) {

      net.minecraft.world.item.ItemStack itemStack = itemEntity.getItem();

      if (itemStack.is(net.minecraft.world.item.Items.EMERALD)) {

         itemEntity.discard();

         return;

      }



      int pickedUp = 0;



      for (int i = 0; i < this.inventory.size(); i++) {

         net.minecraft.world.item.ItemStack stack = this.inventory.get(i);

         if (stack.isEmpty()) {

            this.inventory.set(i, itemStack);

            pickedUp += itemStack.getCount();

            itemEntity.discard();

            break;

         }



         if (net.minecraft.world.item.ItemStack.matches(stack, itemStack)) {

            int toAdd = stack.getMaxStackSize() - stack.getCount();

            if (toAdd > 0) {

               int moved = Math.min(toAdd, itemStack.getCount());

               pickedUp += moved;

               stack.grow(moved);

               itemStack.shrink(moved);

               if (itemStack.isEmpty()) {

                  itemEntity.discard();

                  break;

               }

            }

         }

      }



      if (!itemEntity.isRemoved()) {

         for (int i = 0; i < this.inventory.size(); i++) {

            if (!(this.inventory.get(i).getItem() instanceof BlasterItem)) {

               this.drop(this.inventory.get(i), false, false);

               this.inventory.set(i, itemStack);

               pickedUp += itemStack.getCount();

               itemEntity.discard();

               break;

            }

         }

      }



      if (pickedUp > 0) {

         this.offers = null;

      }

   }



   @Override

   public void setTradingPlayer(@Nullable net.minecraft.world.entity.player.Player player) {

      this.tradingPlayer = player;

   }



   @Nullable

   @Override

   public net.minecraft.world.entity.player.Player getTradingPlayer() {

      return this.tradingPlayer;

   }



   @Override

   public net.minecraft.world.item.trading.MerchantOffers getOffers() {

      if (this.offers == null) {

         this.offers = new net.minecraft.world.item.trading.MerchantOffers();

         this.updateOffers();

      }



      return this.offers;

   }



   @Override

   public void overrideOffers(@Nullable net.minecraft.world.item.trading.MerchantOffers offers) {

      this.offers = offers;

   }



   @Override

   public void notifyTrade(net.minecraft.world.item.trading.MerchantOffer offer) {

      offer.increaseUses();



      for (net.minecraft.world.item.ItemStack stack : this.inventory) {

         if (net.minecraft.world.item.ItemStack.isSameItemSameComponents(stack, offer.getResult())) {

            stack.shrink(offer.getResult().getCount());

            return;

         }

      }

   }



   @Override

   public void notifyTradeUpdated(net.minecraft.world.item.ItemStack sold) {

   }



   @Override

   public int getVillagerXp() {

      return 0;

   }



   @Override

   public void overrideXp(int xp) {

   }



   @Override

   public boolean showProgressBar() {

      return false;

   }



   @Override

   public boolean isClientSide() {

      return false;

   }



   @Override

   public boolean stillValid(net.minecraft.world.entity.player.Player player) {

      return this.tradingPlayer == player && this.isAlive();

   }



   public boolean canTrade() {

      return this.isAlive() && !this.isInWater() && this.onGround() && !this.isAggressive();

   }



   @Override

   public net.minecraft.sounds.SoundEvent getNotifyTradeSound() {

      return net.minecraft.sounds.SoundEvents.EMPTY;

   }



   private void updateOffers() {

      this.tryAddOffer(this.getItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND));

      this.inventory.forEach(this::tryAddOffer);

   }



   private void tryAddOffer(net.minecraft.world.item.ItemStack stack) {

      if (!stack.isEmpty() && !stack.is(SwgcItems.JAWA_BLASTER.get())) {

         int cost;

         if (stack.getItem() instanceof BlasterItem blaster) {

            cost = net.minecraft.util.Mth.ceil(blaster.damage * 2.0F + (float)blaster.maxAmmo * 0.1F);

         } else if (stack.getItem() instanceof LightsaberItem) {

            cost = this.random.nextIntBetweenInclusive(28, 56);

         } else if (stack.getItem() instanceof che.swgc.item.CustomArmorItem) {
            cost = this.random.nextIntBetweenInclusive(5, 15);

         } else {

            cost = net.minecraft.util.Mth.ceil((2.0 + this.random.nextDouble() * 14.0) / Math.sqrt((double)stack.getCount()));

         }



         this.offers.add(new net.minecraft.world.item.trading.MerchantOffer(new net.minecraft.world.item.trading.ItemCost(net.minecraft.world.item.Items.EMERALD, cost), stack.copyWithCount(1), stack.getCount(), 0, 0.0F));

      }

   }



   @Override

   protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput compound) {

      super.readAdditionalSaveData(compound);

      net.minecraft.world.ContainerHelper.loadAllItems(compound, this.inventory);

      compound.read("Offers", net.minecraft.world.item.trading.MerchantOffers.CODEC).ifPresent(saved -> this.offers = saved);

   }



   @Override

   protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput compound) {

      super.addAdditionalSaveData(compound);

      net.minecraft.world.ContainerHelper.saveAllItems(compound, this.inventory, false);

      if (this.offers != null) {

         compound.store("Offers", net.minecraft.world.item.trading.MerchantOffers.CODEC, this.offers);

      }

   }



   public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder createAttributes() {

      return createMobAttributes().add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 20.0).add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.3);

   }



   class FindWantedItemGoal extends net.minecraft.world.entity.ai.goal.Goal {

      private net.minecraft.world.entity.item.ItemEntity wanted;



      FindWantedItemGoal() {

         this.setFlags(EnumSet.of(net.minecraft.world.entity.ai.goal.Goal.Flag.MOVE));

      }



      public boolean canUse() {

         for (net.minecraft.world.entity.item.ItemEntity item : Jawa.this.level()

            .getEntities(

               net.minecraft.world.level.entity.EntityTypeTest.forClass(net.minecraft.world.entity.item.ItemEntity.class),

               Jawa.this.getBoundingBox().inflate(16.0, 4.0, 16.0),

               entity -> Jawa.this.canGather(entity.getItem())

            )) {

            if (Jawa.this.navigation.moveTo(item, 1.0)) {

               this.wanted = item;

               return true;

            }

         }



         return false;

      }



      public boolean canContinueToUse() {

         return !this.wanted.isRemoved()

            && Jawa.this.canGather(this.wanted.getItem())

            && (Jawa.this.navigation.isDone() ? Jawa.this.navigation.moveTo(this.wanted, 1.0) : Jawa.this.navigation.isInProgress());

      }

   }



   class JawaRangedAttackGoal extends net.minecraft.world.entity.ai.goal.RangedAttackGoal {

      public JawaRangedAttackGoal(double speedModifier, int attackInterval, float attackRadius) {

         super(Jawa.this, speedModifier, attackInterval, attackRadius);

      }



      public void start() {

         super.start();



         for (int i = 0; i < Jawa.this.inventory.size(); i++) {

            net.minecraft.world.item.ItemStack stack = Jawa.this.inventory.get(i);

            if (stack.getItem() instanceof BlasterItem) {

               Jawa.this.inventory.set(i, Jawa.this.getMainHandItem());

               Jawa.this.setItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND, stack);

               break;

            }

         }



         Jawa.this.setAggressive(true);

      }



      public void stop() {

         super.stop();

         int i = Math.max(Jawa.this.inventory.indexOf(net.minecraft.world.item.ItemStack.EMPTY), 0);

         net.minecraft.world.item.ItemStack stack = Jawa.this.inventory.get(i);

         Jawa.this.inventory.set(i, Jawa.this.getMainHandItem());

         Jawa.this.setItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND, stack);

         Jawa.this.setAggressive(false);

      }

   }



   class TradeWithPlayerGoal extends net.minecraft.world.entity.ai.goal.Goal {

      public TradeWithPlayerGoal() {

         this.setFlags(EnumSet.of(net.minecraft.world.entity.ai.goal.Goal.Flag.JUMP, net.minecraft.world.entity.ai.goal.Goal.Flag.MOVE));

      }



      public boolean canUse() {

         if (!Jawa.this.canTrade()) {

            return false;

         } else {

            net.minecraft.world.entity.player.Player player = Jawa.this.getTradingPlayer();

            return player != null && Jawa.this.distanceToSqr(player) <= 16.0 && player.containerMenu instanceof net.minecraft.world.inventory.MerchantMenu;

         }

      }



      public void start() {

         Jawa.this.getNavigation().stop();

      }



      public void stop() {

         Jawa.this.setTradingPlayer(null);

      }

   }

}


