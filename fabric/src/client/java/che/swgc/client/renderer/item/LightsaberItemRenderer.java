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
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.util.Util;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.world.level.Level;
import net.minecraft.resources.Identifier;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.render.MultiBufferSource;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.core.ColorHelper.Argb;

@javax.annotation.ParametersAreNonnullByDefault
public class LightsaberItemRenderer implements ItemRenderer {
   private static final net.minecraft.resources.Identifier EZRA_HILT = Identifier.fromNamespaceAndPath("swgc", "ezra");
   private static final net.minecraft.resources.Identifier KI_ADI_HILT = Identifier.fromNamespaceAndPath("swgc", "ki_adi");
   private static final HashMap<net.minecraft.resources.Identifier, LightsaberItemRenderer.Properties> PROPS = new HashMap<>();
   protected final PlasmaRodModel bladeModel;

   public LightsaberItemRenderer(net.minecraft.client.model.geom.EntityModelSet models) {
      this.bladeModel = new PlasmaRodModel(models.bakeLayer(PlasmaRodModel.LAYER_LOCATION), false, 1.5F, 3.0F);
   }

   @Override
   public void render(net.minecraft.world.item.ItemStack stack, net.minecraft.world.item.ItemDisplayContext ctx, com.mojang.blaze3d.vertex.PoseStack poseStack, che.swgc.client.compat.render.MultiBufferSource src, float partialTick, int packedLight, int packedOverlay) {
      boolean active = LightsaberItem.isActive(stack);
      float anim = this.getAnim(stack, active, partialTick);
      poseStack.push();
      net.minecraft.resources.Identifier id = LightsaberItem.getHilt(stack);
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

      LightsaberItemRenderer.Properties props = getProps(id);
      props.model.stack = stack;
      props.model.activation = anim;
      props.model.ctx = ctx;
      props.model
         .setupAnim(
            !ctx.isFirstPerson() && ctx != net.minecraft.world.item.ItemDisplayContext.GUI ? null : net.minecraft.client.Minecraft.getInstance().player,
            0.0F,
            0.0F,
            (float)net.minecraft.util.Util.getMeasuringTimeNano() * 2.0E-8F,
            0.0F,
            0.0F
         );
      props.model
         .render(poseStack, src.getBuffer(props.model.getLayer(props.getTexture(anim, false))), packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);
      int color = LightsaberItem.getColor(stack);
      int color1 = props.getGlowing(anim, color);
      if (color1 != 0) {
         float a = (float)net.minecraft.core.ColorHelper.Argb.getAlpha(color1) / 255.0F;
         float r = (float)net.minecraft.core.ColorHelper.Argb.getRed(color1) / 255.0F;
         float g = (float)net.minecraft.core.ColorHelper.Argb.getGreen(color1) / 255.0F;
         float b = (float)net.minecraft.core.ColorHelper.Argb.getBlue(color1) / 255.0F;
         props.model.render(poseStack, src.getBuffer(net.minecraft.client.renderer.rendertype.RenderType.getEntityTranslucentEmissive(props.getTexture(anim, true))), packedLight, packedOverlay, r, g, b, a);
      }

      if (ctx != net.minecraft.world.item.ItemDisplayContext.GUI && anim > 0.0F) {
         props.model.translateToBlade(poseStack);
         poseStack.scale(-downscale, -downscale * anim, downscale);
         float rodScale = Math.max(poseStack.peek().getPositionMatrix().m32() * -0.1F + 0.5F, 1.0F);
         this.bladeModel.rod.xScale = this.bladeModel.rod.zScale = rodScale;
         this.bladeModel.outlineThickness = 1.5F * rodScale;
         this.bladeModel
            .render(
               poseStack, src.getBuffer(this.bladeModel.getLayer(PlasmaRodModel.DEFAULT_TEXTURE)), 15728640, packedOverlay, 1.0F, 1.0F, 1.0F, 1.0F
            );
         this.bladeModel
            .render(
               poseStack, src.getBuffer(net.minecraft.client.renderer.rendertype.RenderType.getBeaconBeam(PlasmaRodModel.DEFAULT_TEXTURE, false)), 15728640, packedOverlay, 1.0F, 1.0F, 1.0F, 1.0F
            );
         this.bladeModel
            .setupAndRenderOutline(
               poseStack,
               src.getBuffer(net.minecraft.client.renderer.rendertype.RenderType.getBeaconBeam(PlasmaRodModel.DEFAULT_TEXTURE, true)),
               15728640,
               packedOverlay,
               (float)net.minecraft.core.ColorHelper.Argb.getRed(color) / 255.0F,
               (float)net.minecraft.core.ColorHelper.Argb.getGreen(color) / 255.0F,
               (float)net.minecraft.core.ColorHelper.Argb.getBlue(color) / 255.0F,
               1.0F
            );
      }

      poseStack.pop();
   }

   protected float getAnim(net.minecraft.world.item.ItemStack stack, boolean active, float partialTick) {
      net.minecraft.world.level.Level lvl = net.minecraft.client.Minecraft.getInstance().world;
      float anim = lvl != null ? (float)(lvl.getTime() - LightsaberItem.getActivatedTick(stack)) : 25.0F;
      if (anim >= 4.0F) {
         anim = active ? 1.0F : 0.0F;
      } else {
         anim += partialTick;
         anim = active ? net.minecraft.util.Mth.sqrt(anim * 0.25F) : net.minecraft.util.Mth.sqrt((4.0F - anim) * 0.25F);
      }

      return anim;
   }

   protected static LightsaberItemRenderer.Properties getProps(net.minecraft.resources.Identifier id) {
      return PROPS.computeIfAbsent(id, LightsaberItemRenderer.Properties::new);
   }

   public static void addProps(net.minecraft.resources.Identifier id, Function<net.minecraft.client.model.geom.EntityModelSet, LightsaberModel> model, UnaryOperator<LightsaberItemRenderer.Properties> props) {
      PROPS.put(id, props.apply(new LightsaberItemRenderer.Properties(model, id)));
   }

   public static void addProps(net.minecraft.resources.Identifier id, Function<net.minecraft.client.model.geom.EntityModelSet, LightsaberModel> model) {
      PROPS.put(id, new LightsaberItemRenderer.Properties(model, id));
   }

   public static void addPropsNoModel(net.minecraft.resources.Identifier id, UnaryOperator<LightsaberItemRenderer.Properties> props) {
      PROPS.put(id, props.apply(new LightsaberItemRenderer.Properties(id)));
   }

   static {
      addPropsNoModel(Identifier.fromNamespaceAndPath("swgc", "mastiff"), props -> props.glowing((anim, color) -> color & 16777215 + ((int)(anim * 255.0F) << 24)));
      addProps(
         LightsaberItem.OBEEWAN_ID,
         models -> new ObeewanSaberModel(models.bakeLayer(ObeewanSaberModel.LAYER_LOCATION)),
         props -> props.glowing((anim, color) -> net.minecraft.core.ColorHelper.Argb.lerp(anim, -8599087, -1834984))
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
      public final net.minecraft.resources.Identifier id;
      public final LightsaberModel model;
      private BiFunction<Float, Boolean, net.minecraft.resources.Identifier> texture = null;
      private BiFunction<Float, Integer, Integer> glowing = null;

      public Properties(Function<net.minecraft.client.model.geom.EntityModelSet, LightsaberModel> model, net.minecraft.resources.Identifier id) {
         this.id = id;
         this.model = model.apply(net.minecraft.client.Minecraft.getInstance().getEntityModelSet());
      }

      public Properties(net.minecraft.resources.Identifier id) {
         this(models -> new LightsaberModel(models.bakeLayer(new net.minecraft.client.model.geom.ModelLayerLocation(id, "lightsaber"))), id);
      }

      LightsaberItemRenderer.Properties texture(BiFunction<Float, Boolean, net.minecraft.resources.Identifier> texture) {
         this.texture = texture;
         return this;
      }

      LightsaberItemRenderer.Properties glowing(BiFunction<Float, Integer, Integer> glowing) {
         this.glowing = glowing;
         return this;
      }

      public net.minecraft.resources.Identifier getTexture(float activation, boolean glowing) {
         return this.texture != null
            ? this.texture.apply(activation, glowing)
            : this.id.withPath(path -> "textures/entity/item/lightsaber/" + path + (glowing ? "_glowmask.png" : ".png"));
      }

      public Integer getGlowing(float anim, int color) {
         return this.glowing != null ? this.glowing.apply(anim, color) : 0;
      }
   }
}
