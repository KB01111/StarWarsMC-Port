package che.swgc.mixin;

import org.spongepowered.asm.mixin.Mixin;

/** Title screen custom background deferred to Phase 4 after extractRenderState port. */
@Mixin(net.minecraft.client.gui.screens.TitleScreen.class)
public abstract class MixinTitleScreen {
}
