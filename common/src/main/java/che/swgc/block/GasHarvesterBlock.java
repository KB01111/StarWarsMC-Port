package che.swgc.block;

import che.swgc.block.entity.GasHarvesterBlockEntity;
import che.swgc.reg.IRegister;
import che.swgc.reg.SwgcBlockEntities;
import che.swgc.reg.SwgcItems;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

@javax.annotation.ParametersAreNonnullByDefault
public class GasHarvesterBlock extends net.minecraft.world.level.block.BaseEntityBlock {
   public static final net.minecraft.world.level.block.state.properties.EnumProperty<net.minecraft.core.Direction> FACING = net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_FACING;
   public static final net.minecraft.world.level.block.state.properties.EnumProperty<GasHarvesterBlock.VesselState> VESSEL_STATE = net.minecraft.world.level.block.state.properties.EnumProperty.create("vessel_state", GasHarvesterBlock.VesselState.class);
   private static final net.minecraft.world.phys.shapes.VoxelShape NORTH_AABB = net.minecraft.world.phys.shapes.Shapes.or(
      net.minecraft.world.level.block.Block.box(0.9, 0.0, 2.7, 15.1, 14.6, 11.0), net.minecraft.world.level.block.Block.box(0.0, 0.0, 11.0, 16.0, 23.4, 16.0)
   );
   private static final net.minecraft.world.phys.shapes.VoxelShape EAST_AABB = net.minecraft.world.phys.shapes.Shapes.or(net.minecraft.world.level.block.Block.box(5.0, 0.0, 0.9, 13.3, 14.6, 15.1), net.minecraft.world.level.block.Block.box(0.0, 0.0, 0.0, 5.0, 23.4, 16.0));
   private static final net.minecraft.world.phys.shapes.VoxelShape SOUTH_AABB = net.minecraft.world.phys.shapes.Shapes.or(net.minecraft.world.level.block.Block.box(0.9, 0.0, 5.0, 15.1, 14.6, 13.3), net.minecraft.world.level.block.Block.box(0.0, 0.0, 0.0, 16.0, 23.4, 5.0));
   private static final net.minecraft.world.phys.shapes.VoxelShape WEST_AABB = net.minecraft.world.phys.shapes.Shapes.or(net.minecraft.world.level.block.Block.box(2.7, 0.0, 0.9, 11.0, 14.6, 15.1), net.minecraft.world.level.block.Block.box(11.0, 0.0, 0.0, 16.0, 23.4, 16.0));

   public GasHarvesterBlock(net.minecraft.world.level.block.state.BlockBehaviour.Properties props) {
      super(props);
      this.registerDefaultState(this.stateDefinition.any().setValue(FACING, net.minecraft.core.Direction.NORTH));
   }

   public GasHarvesterBlock() {
      this(IRegister.blockProperties().strength(5.0F, 1200.0F).sound(net.minecraft.world.level.block.SoundType.METAL).noOcclusion());
   }

   protected void createBlockStateDefinition(net.minecraft.world.level.block.state.StateDefinition.Builder<net.minecraft.world.level.block.Block, net.minecraft.world.level.block.state.BlockState> builder) {
      builder.add(FACING, VESSEL_STATE);
   }

   @Override
   public net.minecraft.world.level.block.state.BlockState getStateForPlacement(net.minecraft.world.item.context.BlockPlaceContext ctx) {
      return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
   }

   @Override
   protected net.minecraft.world.InteractionResult useWithoutItem(net.minecraft.world.level.block.state.BlockState state, net.minecraft.world.level.Level lvl, net.minecraft.core.BlockPos pos, net.minecraft.world.entity.player.Player user, net.minecraft.world.phys.BlockHitResult hitResult) {
      return switch ((GasHarvesterBlock.VesselState)state.getValue(VESSEL_STATE)) {
         case ABSENT -> {
            net.minecraft.world.item.ItemStack stack = user.getItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND);
            if (stack.is(SwgcItems.EMPTY_GAS_VESSEL.get())) {
               lvl.setBlock(pos, state.setValue(VESSEL_STATE, GasHarvesterBlock.VesselState.EMPTY), 3);
               if (!user.getAbilities().instabuild) {
                  stack.shrink(1);
               }

               yield net.minecraft.world.InteractionResult.SUCCESS;
            } else {
               yield net.minecraft.world.InteractionResult.PASS;
            }
         }
         case EMPTY -> net.minecraft.world.InteractionResult.PASS;
         case FILLED -> {
            if (user.addItem(SwgcItems.TIBANNA_VESSEL.get().getDefaultInstance())) {
               lvl.setBlock(pos, state.setValue(VESSEL_STATE, GasHarvesterBlock.VesselState.ABSENT), 3);
               yield net.minecraft.world.InteractionResult.SUCCESS;
            } else {
               yield net.minecraft.world.InteractionResult.FAIL;
            }
         }
      };
   }

   @Override
   protected net.minecraft.world.phys.shapes.VoxelShape getShape(net.minecraft.world.level.block.state.BlockState state, net.minecraft.world.level.BlockGetter lvl, net.minecraft.core.BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext ctx) {
      return switch (state.getValue(FACING)) {
         case net.minecraft.core.Direction.EAST -> EAST_AABB;
         case net.minecraft.core.Direction.SOUTH -> SOUTH_AABB;
         case net.minecraft.core.Direction.WEST -> WEST_AABB;
         default -> NORTH_AABB;
      };
   }

   @Override
   protected net.minecraft.world.level.block.state.BlockState rotate(net.minecraft.world.level.block.state.BlockState state, net.minecraft.world.level.block.Rotation rotation) {
      return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
   }

   @Override
   protected com.mojang.serialization.MapCodec<GasHarvesterBlock> codec() {
      return simpleCodec(GasHarvesterBlock::new);
   }

   public net.minecraft.world.level.block.RenderShape getRenderShape(net.minecraft.world.level.block.state.BlockState $$0) {
      return net.minecraft.world.level.block.RenderShape.MODEL;
   }

   public net.minecraft.world.level.block.entity.BlockEntity newBlockEntity(net.minecraft.core.BlockPos blockPos, net.minecraft.world.level.block.state.BlockState blockState) {
      return new GasHarvesterBlockEntity(blockPos, blockState);
   }

   @Nullable
   public <T extends net.minecraft.world.level.block.entity.BlockEntity> net.minecraft.world.level.block.entity.BlockEntityTicker<T> getTicker(net.minecraft.world.level.Level lvl, net.minecraft.world.level.block.state.BlockState state, net.minecraft.world.level.block.entity.BlockEntityType<T> type) {
      return createTickerHelper(type, SwgcBlockEntities.GAS_HARVESTER.get(), GasHarvesterBlockEntity::tick);
   }

   public static enum VesselState implements net.minecraft.util.StringRepresentable {
      ABSENT("absent", () -> net.minecraft.world.item.ItemStack.EMPTY),
      EMPTY("empty", () -> SwgcItems.EMPTY_GAS_VESSEL.get().getDefaultInstance()),
      FILLED("filled", () -> SwgcItems.TIBANNA_VESSEL.get().getDefaultInstance());

      public final String name;
      private final Supplier<net.minecraft.world.item.ItemStack> item;

      private VesselState(String name, Supplier<net.minecraft.world.item.ItemStack> item) {
         this.name = name;
         this.item = item;
      }

      public String getSerializedName() {
         return this.name;
      }

      public net.minecraft.world.item.ItemStack getItem() {
         return this.item.get();
      }
   }
}
