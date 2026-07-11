package che.swgc.mixin;

import che.swgc.client.SwgcSplashManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Random;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexFormats;
import net.minecraft.resources.Identifier;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.resource.SplashTextResourceSupplier;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.gui.RotatingCubeMapRenderer;
import net.minecraft.client.gui.LogoDrawer;
import net.minecraft.client.renderer.VertexFormat.DrawMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({net.minecraft.client.gui.screens.TitleScreen.class})
public abstract class MixinTitleScreen extends net.minecraft.client.gui.screens.Screen {
   @Unique
   private static final net.minecraft.resources.Identifier SWGC_BG = Identifier.fromNamespaceAndPath("swgc", "textures/gui/title/background.png");
   @Unique
   private static final net.minecraft.resources.Identifier SWGC_FG = Identifier.fromNamespaceAndPath("swgc", "textures/gui/title/foreground.png");
   @Unique
   private static final net.minecraft.resources.Identifier SWGC_LOGO = Identifier.fromNamespaceAndPath("swgc", "textures/gui/title/logo.png");
   @Unique
   private double sw$bgXOffset;
   @Unique
   private double sw$bgYOffset;

   private MixinTitleScreen(net.minecraft.network.chat.Component title) {
      super(title);
   }

   @Redirect(
      method = {"init"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/Minecraft;getSplashManager()Lnet/minecraft/client/resources/SplashManager;"
      )
   )
   private net.minecraft.client.resource.SplashTextResourceSupplier swgcSplashes(net.minecraft.client.Minecraft instance) {
      return (net.minecraft.client.resource.SplashTextResourceSupplier)(new Random().nextBoolean() ? SwgcSplashManager.INSTANCE : instance.getSplashTextLoader());
   }

   @Redirect(
      method = {"render"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/PanoramaRenderer;render(FF)V"
      )
   )
   public void renderSpace(net.minecraft.client.gui.RotatingCubeMapRenderer instance, float deltaT, float alpha) {
      net.minecraft.client.renderer.Tessellator tesselator = net.minecraft.client.renderer.Tessellator.getInstance();
      net.minecraft.client.renderer.BufferBuilder bufferbuilder = tesselator.getBuffer();
      RenderSystem.setShader(net.minecraft.client.renderer.GameRenderer::getRenderTypeGuiProgram);
      RenderSystem.enableBlend();
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
      int alphaI = Math.round(alpha * 255.0F);
      bufferbuilder.begin(net.minecraft.client.renderer.VertexFormat.DrawMode.QUADS, net.minecraft.client.renderer.VertexFormats.POSITION);
      bufferbuilder.vertex(0.0, 0.0, 0.0).next();
      bufferbuilder.vertex(0.0, (double)this.height, 0.0).next();
      bufferbuilder.vertex((double)this.width, (double)this.height, 0.0).next();
      bufferbuilder.vertex((double)this.width, 0.0, 0.0).next();
      tesselator.draw();
      RenderSystem.setShader(net.minecraft.client.renderer.GameRenderer::getPositionTexColorProgram);
      RenderSystem.setShaderTexture(0, SWGC_BG);
      bufferbuilder.begin(net.minecraft.client.renderer.VertexFormat.DrawMode.QUADS, net.minecraft.client.renderer.VertexFormats.POSITION_TEXTURE_COLOR);
      bufferbuilder.vertex(this.sw$bgXOffset * 0.5, this.sw$bgYOffset * 0.5, 0.0)
         .texture(0.0F, 0.0F)
         .color(255, 255, 255, alphaI)
         .next();
      bufferbuilder.vertex(this.sw$bgXOffset * 0.5, this.sw$bgYOffset * 0.5 + (double)this.height, 0.0)
         .texture(0.0F, 1.0F)
         .color(255, 255, 255, alphaI)
         .next();
      bufferbuilder.vertex(this.sw$bgXOffset * 0.5 + (double)this.width, this.sw$bgYOffset * 0.5 + (double)this.height, 0.0)
         .texture(1.0F, 1.0F)
         .color(255, 255, 255, alphaI)
         .next();
      bufferbuilder.vertex(this.sw$bgXOffset * 0.5 + (double)this.width, this.sw$bgYOffset * 0.5, 0.0)
         .texture(1.0F, 0.0F)
         .color(255, 255, 255, alphaI)
         .next();
      tesselator.draw();
      RenderSystem.setShaderTexture(0, SWGC_FG);
      bufferbuilder.begin(net.minecraft.client.renderer.VertexFormat.DrawMode.QUADS, net.minecraft.client.renderer.VertexFormats.POSITION_TEXTURE_COLOR);
      bufferbuilder.vertex(this.sw$bgXOffset, this.sw$bgYOffset, 0.0).texture(0.0F, 0.0F).color(255, 255, 255, alphaI).next();
      bufferbuilder.vertex(this.sw$bgXOffset, this.sw$bgYOffset + (double)this.height, 0.0)
         .texture(0.0F, 1.0F)
         .color(255, 255, 255, alphaI)
         .next();
      bufferbuilder.vertex(this.sw$bgXOffset + (double)this.width, this.sw$bgYOffset + (double)this.height, 0.0)
         .texture(1.0F, 1.0F)
         .color(255, 255, 255, alphaI)
         .next();
      bufferbuilder.vertex(this.sw$bgXOffset + (double)this.width, this.sw$bgYOffset, 0.0)
         .texture(1.0F, 0.0F)
         .color(255, 255, 255, alphaI)
         .next();
      tesselator.draw();
      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.enableDepthTest();
   }

   @Redirect(
      method = {"render"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/components/LogoRenderer;renderLogo(Lnet/minecraft/client/gui/GuiGraphics;IF)V"
      )
   )
   public void renderLogo(net.minecraft.client.gui.LogoDrawer instance, net.minecraft.client.gui.GuiGraphics guiGraphics, int screenWidth, float transparency) {
      guiGraphics.setShaderColor(1.0F, 1.0F, 1.0F, transparency);
      guiGraphics.drawTexture(SWGC_LOGO, screenWidth / 2 - 192, 30, 0.0F, 0.0F, 384, 71, 384, 96);
      guiGraphics.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void mouseMoved(double mouseX, double mouseY) {
      super.mouseMoved(mouseX, mouseY);
      this.sw$bgXOffset = (mouseX - (double)this.width / 2.0) * -0.25;
      this.sw$bgYOffset = (mouseY - (double)this.height / 2.0) * -0.25;
   }
}
