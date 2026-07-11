package che.swgc.client.render;

import javax.annotation.Nullable;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.world.entity.Entity;

/** Render state for simple SWGC entities that still need entity access during extraction. */
public class SwgcEntityRenderState extends EntityRenderState {
   @Nullable
   public Entity entity;
}
