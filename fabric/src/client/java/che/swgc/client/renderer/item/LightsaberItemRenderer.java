package che.swgc.client.renderer.item;

import che.swgc.client.model.PlasmaRodModel;
import che.swgc.client.model.item.FrogSaberModel;
import che.swgc.client.model.item.LightsaberModel;
import che.swgc.client.model.item.ObeewanSaberModel;
import che.swgc.item.LightsaberItem;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.util.ARGB;
import che.swgc.client.render.SwgcMobRenderState;
import net.minecraft.util.Unit;

@javax.annotation.ParametersAreNonnullByDefault
public class LightsaberItemRenderer implements ItemRenderer {
   private static final Identifier EZRA_HILT = Identifier.fromNamespaceAndPath("swgc", "ezra");
   private static final Identifier KI_ADI_HILT = Identifier.fromNamespaceAndPath("swgc", "ki_adi");
   private static final HashMap<Identifier, Properties> PROPS = new HashMap<>();
   private static final SwgcMobRenderState ITEM_RENDER_STATE = new SwgcMobRenderState();
   protected final PlasmaRodModel bladeModel;
   private final EntityModelSet models;

   public LightsaberItemRenderer(EntityModelSet models) {
      this.models = models;
      this.bladeModel = new PlasmaRodModel(models.bakeLayer(PlasmaRodModel.LAYER_LOCATION), false, 1.5F, 3.0F);
   }

   @Override
   public void render(ItemStack stack, ItemDisplayContext ctx, PoseStack poseStack, SubmitNodeCollector src, float partialTick, int packedLight, int packedOverlay) {
      boolean active = LightsaberItem.isActive(stack);
      float anim = this.getAnim(stack, active, partialTick);
      poseStack.pushPose();
      Identifier id = LightsaberItem.getHilt(stack);
      float downscale;
      if (id.equals(EZRA_HILT)) {
         poseStack.translate(0.5F, 0.601F, 0.5F);
         poseStack.scale(-0.4F, -0.4F, 0.4F);
         downscale = 2.5F;
      } else if (id.equals(KI_ADI_HILT)) {
         poseStack.translate(0.5F, 0.751F, 0.5F);
         poseStack.scale(-0.75F, -0.75F, 0.75F);
         downscale = 1.333F;
      } else {
         poseStack.translate(0.5F, 1.501F, 0.5F);
         poseStack.scale(-1.0F, -1.0F, 1.0F);
         downscale = 1.0F;
      }

      Properties props = getProps(id, this.models);
      props.model.stack = stack;
      props.model.activation = anim;
      props.model.ctx = ctx;
      Identifier baseTexture = props.getTexture(anim, false);
      src.submitModel(props.model, ITEM_RENDER_STATE, poseStack, baseTexture, packedLight, packedOverlay, 0, null);
      int color = LightsaberItem.getColor(stack);
      int color1 = props.getGlowing(anim, color);
      if (color1 != 0) {
         float a = (float)ARGB.alpha(color1) / 255.0F;
         float r = (float)ARGB.red(color1) / 255.0F;
         float g = (float)ARGB.green(color1) / 255.0F;
         float b = (float)ARGB.blue(color1) / 255.0F;
         int tinted = ARGB.color((int)(a * 255.0F), (int)(r * 255.0F), (int)(g * 255.0F), (int)(b * 255.0F));
         src.submitModel(
            props.model,
            ITEM_RENDER_STATE,
            poseStack,
            RenderTypes.entityTranslucentEmissive(props.getTexture(anim, true)),
            packedLight,
            packedOverlay,
            tinted,
            null,
            0,
            null
         );
      }

      if (ctx != ItemDisplayContext.GUI && anim > 0.0F) {
         props.model.translateToBlade(poseStack);
         poseStack.scale(-downscale, -downscale * anim, downscale);
         float rodScale = Math.max(poseStack.last().pose().m32() * -0.1F + 0.5F, 1.0F);
         this.bladeModel.rod.xScale = this.bladeModel.rod.zScale = rodScale;
         this.bladeModel.outlineThickness = 1.5F * rodScale;
         src.submitModel(this.bladeModel, Unit.INSTANCE, poseStack, PlasmaRodModel.DEFAULT_TEXTURE, 15728640, packedOverlay, 0, null);
         src.submitModel(
            this.bladeModel,
            Unit.INSTANCE,
            poseStack,
            RenderTypes.beaconBeam(PlasmaRodModel.DEFAULT_TEXTURE, false),
            15728640,
            packedOverlay,
            0,
            null
         );
         this.bladeModel.setupAndRenderOutline(
            poseStack,
            src,
            RenderTypes.beaconBeam(PlasmaRodModel.DEFAULT_TEXTURE, true),
            15728640,
            packedOverlay,
            (float)ARGB.red(color) / 255.0F,
            (float)ARGB.green(color) / 255.0F,
            (float)ARGB.blue(color) / 255.0F,
            1.0F
         );
      }

      poseStack.popPose();
   }

   protected float getAnim(ItemStack stack, boolean active, float partialTick) {
      net.minecraft.world.level.Level lvl = Minecraft.getInstance().level;
      float anim = lvl != null ? (float)(lvl.getGameTime() - LightsaberItem.getActivatedTick(stack)) : 25.0F;
      if (anim >= 4.0F) {
         anim = active ? 1.0F : 0.0F;
      } else {
         anim += partialTick;
         anim = active ? Mth.sqrt(anim * 0.25F) : Mth.sqrt((4.0F - anim) * 0.25F);
      }

      return anim;
   }

   protected static Properties getProps(Identifier id, EntityModelSet models) {
      return PROPS.computeIfAbsent(id, key -> new Properties(key)).ensureModel(models);
   }

   public static void addProps(Identifier id, Function<EntityModelSet, LightsaberModel> model, UnaryOperator<Properties> props) {
      PROPS.put(id, props.apply(new Properties(model, id)));
   }

   public static void addProps(Identifier id, Function<EntityModelSet, LightsaberModel> model) {
      PROPS.put(id, new Properties(model, id));
   }

   public static void addPropsNoModel(Identifier id, UnaryOperator<Properties> props) {
      PROPS.put(id, props.apply(new Properties(id)));
   }

   static {
      addPropsNoModel(Identifier.fromNamespaceAndPath("swgc", "mastiff"), props -> props.glowing((anim, color) -> (color & 16777215) + ((int)(anim * 255.0F) << 24)));
      addProps(
         LightsaberItem.OBEEWAN_ID,
         models -> new ObeewanSaberModel(models.bakeLayer(ObeewanSaberModel.LAYER_LOCATION)),
         props -> props.glowing((anim, color) -> ARGB.srgbLerp(anim, -8599087, -1834984))
      );
      addProps(
         Identifier.fromNamespaceAndPath("swgc", "frog"),
         models -> new FrogSaberModel(models.bakeLayer(FrogSaberModel.LAYER_LOCATION)),
         props -> props.texture(
               (activation, glowing) -> Identifier.fromNamespaceAndPath("swgc", "textures/entity/item/lightsaber/frog" + (activation > 0.0F ? "_active.png" : ".png"))
            )
      );
   }

   public static class Properties {
      public final Identifier id;
      public LightsaberModel model;
      private final Function<EntityModelSet, LightsaberModel> modelFactory;
      private BiFunction<Float, Boolean, Identifier> texture = null;
      private BiFunction<Float, Integer, Integer> glowing = null;

      public Properties(Function<EntityModelSet, LightsaberModel> model, Identifier id) {
         this.id = id;
         this.modelFactory = model;
         this.model = null;
      }

      public Properties(Identifier id) {
         this(models -> new LightsaberModel(models.bakeLayer(new ModelLayerLocation(id, "lightsaber"))), id);
      }

      Properties ensureModel(EntityModelSet models) {
         if (this.model == null) {
            this.model = this.modelFactory.apply(models);
         }

         return this;
      }

      Properties texture(BiFunction<Float, Boolean, Identifier> texture) {
         this.texture = texture;
         return this;
      }

      Properties glowing(BiFunction<Float, Integer, Integer> glowing) {
         this.glowing = glowing;
         return this;
      }

      public Identifier getTexture(float activation, boolean glowing) {
         return this.texture != null
            ? this.texture.apply(activation, glowing)
            : this.id.withPath(path -> "textures/entity/item/lightsaber/" + path + (glowing ? "_glowmask.png" : ".png"));
      }

      public Integer getGlowing(float anim, int color) {
         return this.glowing != null ? this.glowing.apply(anim, color) : 0;
      }
   }
}
