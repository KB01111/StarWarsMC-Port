package che.swgc.mixin;

import che.swgc.client.model.entity.StarWarsWeaponWielderModel;
import che.swgc.force.ForcePossessor;
import che.swgc.force.ForceSecondaryAction;
import che.swgc.item.LightsaberItem;
import java.util.function.Function;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.util.RandomSource;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.core.RotationAxis;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({net.minecraft.client.model.player.PlayerModel.class})
public class MixinPlayerModel<T extends net.minecraft.world.entity.LivingEntity> extends net.minecraft.client.model.HumanoidModel<T> implements StarWarsWeaponWielderModel.Wrapper {
   @Shadow
   @Final
   private net.minecraft.client.model.geom.ModelPart cloak;
   @Unique
   private final StarWarsWeaponWielderModel<T> swgc$starWarsWeaponWielderModel = new StarWarsWeaponWielderModel<>();
   @Unique
   private net.minecraft.world.entity.HumanoidArm swgc$scaleOffhand;
   @Unique
   private boolean swgc$overridden;

   private MixinPlayerModel(net.minecraft.client.model.geom.ModelPart $$0, Function<net.minecraft.resources.Identifier, net.minecraft.client.renderer.rendertype.RenderType> $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean swgc$areAnimationsOverridden() {
      return this.swgc$overridden;
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"setupAnim(Lnet/minecraft/world/entity/LivingEntity;FFFFF)V"},
      cancellable = true
   )
   public void preAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, CallbackInfo ci) {
      if (this.swgc$starWarsWeaponWielderModel.shouldOverride(entity)) {
         this.swgc$overridden = true;
         this.copyStateTo(this.swgc$starWarsWeaponWielderModel);
         this.swgc$starWarsWeaponWielderModel.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         this.swgc$starWarsWeaponWielderModel.copyTo(this);
         if (entity instanceof ForcePossessor forcePossessor
            && forcePossessor.isUsingForce()
            && forcePossessor.swgc$getForceSecondaryAction() == ForceSecondaryAction.JUMP) {
            this.swgc$starWarsWeaponWielderModel.animJediJump(entity, this, ageInTicks % 1.0F);
         }

         ci.cancel();
      } else {
         this.swgc$overridden = false;
         this.swgc$starWarsWeaponWielderModel.customRightItemPos = this.swgc$starWarsWeaponWielderModel.customLeftItemPos = false;
         this.head.resetTransform();
         this.body.resetTransform();
         this.rightLeg.resetTransform();
         this.leftLeg.resetTransform();
      }

      this.swgc$scaleOffhand = entity.getOffhandItem().getItem() instanceof LightsaberItem ? entity.getMainArm().getOpposite() : null;
   }

   @Inject(
      method = {"setupAnim(Lnet/minecraft/world/entity/LivingEntity;FFFFF)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/model/geom/ModelPart;copyFrom(Lnet/minecraft/client/model/geom/ModelPart;)V"
      )}
   )
   public void postAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, CallbackInfo ci) {
      if (entity instanceof ForcePossessor forcePossessor && forcePossessor.isUsingForce()) {
         if (forcePossessor.swgc$getForceSecondaryAction() == ForceSecondaryAction.JUMP) {
            this.swgc$starWarsWeaponWielderModel.animJediJump(entity, this, ageInTicks % 1.0F);
         } else {
            float forceTicks = (float)forcePossessor.swgc$getForceTicks() + ageInTicks % 1.0F;
            float armLifting = Math.min(forceTicks * 0.5F, 1.0F);
            net.minecraft.client.model.geom.ModelPart arm = entity.getMainHandItem().isEmpty() == (entity.getMainArm() == net.minecraft.world.entity.HumanoidArm.LEFT) ? this.leftArm : this.rightArm;
            net.minecraft.util.RandomSource random = net.minecraft.util.RandomSource.create((long)entity.getId());
            arm.xRot = armLifting * (headPitch - 90.0F) * (float) Math.PI / 180.0F
               + net.minecraft.util.Mth.sin(forceTicks * 4.0F + random.nextFloat() * (float) (Math.PI * 2)) * 0.005F;
            arm.yRot = armLifting * netHeadYaw * (float) Math.PI / 180.0F
               + net.minecraft.util.Mth.sin(forceTicks * 4.0F + random.nextFloat() * (float) (Math.PI * 2)) * 0.005F;
         }
      }
   }

   @Inject(
      method = {"translateToHand"},
      at = {@At("TAIL")}
   )
   public void translateToHand(net.minecraft.world.entity.HumanoidArm arm, com.mojang.blaze3d.vertex.PoseStack poseStack, CallbackInfo ci) {
      if (arm == net.minecraft.world.entity.HumanoidArm.LEFT ? this.swgc$starWarsWeaponWielderModel.customLeftItemPos : this.swgc$starWarsWeaponWielderModel.customRightItemPos) {
         this.swgc$starWarsWeaponWielderModel.translateToItem(poseStack, arm);
         poseStack.translate(arm == net.minecraft.world.entity.HumanoidArm.LEFT ? -0.0625F : 0.0625F, -0.125F, 0.625F);
         poseStack.multiply(net.minecraft.core.RotationAxis.POSITIVE_X.rotationDegrees(-90.0F));
      } else if (arm == this.swgc$scaleOffhand) {
         poseStack.scale(0.5F, 0.5F, 0.5F);
         poseStack.translate(0.0F, 0.5F, 0.125F);
      }
   }
}
