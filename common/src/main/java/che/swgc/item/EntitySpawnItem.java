package che.swgc.item;

import che.swgc.SwgcItemData;
import che.swgc.entity.SwgcSpawnEggData;
import che.swgc.reg.IRegister;
import java.util.function.Supplier;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.entity.SpawnerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.HitResult;

@javax.annotation.ParametersAreNonnullByDefault
public class EntitySpawnItem extends Item {
   private final Supplier<? extends EntityType<?>> type;

   public EntitySpawnItem(Supplier<? extends EntityType<?>> type, Item.Properties properties) {
      super(properties);
      this.type = type;
      DispenserBlock.registerBehavior(
         this,
         (source, stack) -> {
            Direction direction = source.state().getValue(DispenserBlock.FACING);
            BlockPos spawnPos = source.pos().relative(direction);

            try {
               Entity entity = this.type.get()
                  .spawn(
                     source.level(),
                     stack,
                     null,
                     spawnPos,
                     EntitySpawnReason.DISPENSER,
                     direction != Direction.UP,
                     false
                  );
               if (entity != null) {
                  SwgcSpawnEggData.apply(entity, SwgcItemData.getOrCreate(stack));
               }
            } catch (Exception exception) {
               che.swgc.Constants.LOG.error("Error while dispensing spawn egg from dispenser at {}", source.pos(), exception);
               return ItemStack.EMPTY;
            }

            stack.shrink(1);
            source.level().gameEvent(null, GameEvent.ENTITY_PLACE, source.pos());
            return stack;
         }
      );
   }

   public EntitySpawnItem(Supplier<? extends EntityType<?>> type) {
      this(type, IRegister.itemProperties());
   }

   public InteractionResult useOnBlock(UseOnContext context) {
      Level level = context.getLevel();
      if (!(level instanceof ServerLevel serverLevel)) {
         return InteractionResult.SUCCESS;
      }

      BlockPos clickedPos = context.getClickedPos();
      BlockState state = serverLevel.getBlockState(clickedPos);
      Player player = context.getPlayer();
      ItemStack stack = context.getItemInHand();
      EntityType<?> entityType = this.type.get();

      if (player != null
         && player.isCreative()
         && state.is(Blocks.SPAWNER)
         && serverLevel.getBlockEntity(clickedPos) instanceof SpawnerBlockEntity spawner) {
         spawner.setEntityId(entityType, serverLevel.getRandom());
         serverLevel.sendBlockUpdated(clickedPos, state, state, 3);
         serverLevel.gameEvent(player, GameEvent.BLOCK_CHANGE, clickedPos);
         return InteractionResult.CONSUME;
      }

      BlockPos spawnPos = state.getCollisionShape(serverLevel, clickedPos).isEmpty() ? clickedPos : clickedPos.relative(context.getClickedFace());
      var dimensions = entityType.getDimensions();
      HitResult hitResult = serverLevel.clip(
         new ClipContext(
            context.getClickLocation().subtract(dimensions.width() / 2.0F, 0.0, dimensions.width() / 2.0F),
            context.getClickLocation().add(dimensions.width() / 2.0F, dimensions.height(), dimensions.width() / 2.0F),
            ClipContext.Block.COLLIDER,
            ClipContext.Fluid.NONE,
            player
         )
      );

      if (hitResult.getType() == HitResult.Type.MISS) {
         Entity entity = entityType.spawn(
            serverLevel,
            stack,
            player,
            spawnPos,
            EntitySpawnReason.SPAWN_ITEM_USE,
            spawnPos.equals(clickedPos),
            spawnPos.equals(clickedPos) && context.getClickedFace() == Direction.UP
         );
         if (entity == null) {
            return InteractionResult.FAIL;
         }

         SwgcSpawnEggData.apply(entity, SwgcItemData.getOrCreate(stack));
         serverLevel.gameEvent(player, GameEvent.ENTITY_PLACE, spawnPos);
         return InteractionResult.SUCCESS;
      }

      if (player != null) {
         player.awardStat(Stats.ITEM_USED.get(this));
         if (!player.getAbilities().instabuild) {
            stack.shrink(1);
         }
      }

      return InteractionResult.FAIL;
   }

   public Component getName(ItemStack stack) {
      return this.type.get().getDescription();
   }
}
