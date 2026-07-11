package che.swgc.client.compat.model;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.world.entity.HumanoidArm;

public interface ModelWithArms {
   void setArmAngle(HumanoidArm arm, PoseStack poseStack);
}
