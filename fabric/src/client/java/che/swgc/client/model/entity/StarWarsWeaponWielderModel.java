package che.swgc.client.model.entity;

import che.swgc.client.SwgcClientUtils;
import che.swgc.client.animation.AmbanSniperRifleAnimation;
import che.swgc.client.animation.BlasterPistolAnimation;
import che.swgc.client.animation.BlasterRifleAnimation;
import che.swgc.client.animation.LightsaberDualWielderAnimation;
import che.swgc.client.animation.LightsaberWielderAnimation;
import che.swgc.force.ForcePossessor;
import che.swgc.force.ForceSecondaryAction;
import che.swgc.force.LightsaberAttack;
import che.swgc.force.StarWarsWeaponWielder;
import che.swgc.item.BlasterItem;
import che.swgc.item.LightsaberItem;
import che.swgc.reg.SwgcItems;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.world.level.Level;
import net.minecraft.resources.Identifier;
import net.minecraft.client.Minecraft;
import com.mojang.blaze3d.vertex.PoseStack;
import che.swgc.client.compat.model.SinglePartEntityModel;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import javax.annotation.ParametersAreNonnullByDefault;
import che.swgc.client.compat.animation.Animation;
import org.joml.Matrix4f;
import org.joml.Vector3f;

@javax.annotation.ParametersAreNonnullByDefault
public class StarWarsWeaponWielderModel<T extends net.minecraft.world.entity.LivingEntity> extends che.swgc.client.compat.model.SinglePartEntityModel<T> {
   private static final HashMap<net.minecraft.world.item.Item, StarWarsWeaponWielderModel.Animations> ANIMATIONS_PER_ITEM = new HashMap<>();
   private final net.minecraft.client.model.geom.ModelPart root;
   private final net.minecraft.client.model.geom.ModelPart body;
   private final net.minecraft.client.model.geom.ModelPart head;
   private final net.minecraft.client.model.geom.ModelPart rightArm;
   private final net.minecraft.client.model.geom.ModelPart leftArm;
   private final net.minecraft.client.model.geom.ModelPart rightLeg;
   private final net.minecraft.client.model.geom.ModelPart leftLeg;
   private final net.minecraft.client.model.geom.ModelPart rightItem;
   private final net.minecraft.client.model.geom.ModelPart leftItem;
   public boolean customRightItemPos;
   public boolean customLeftItemPos;

   public StarWarsWeaponWielderModel(net.minecraft.client.model.geom.ModelPart root, Function<net.minecraft.resources.Identifier, net.minecraft.client.renderer.rendertype.RenderType> renderType) {
      super(renderType);
      this.root = root;
      this.body = root.getChild("body");
      this.head = this.body.getChild("head");
      this.rightArm = this.body.getChild("rightArm");
      this.rightItem = this.rightArm.getChild("rightItem");
      this.leftArm = this.body.getChild("leftArm");
      this.leftItem = this.leftArm.getChild("leftItem");
      this.rightLeg = root.getChild("rightLeg");
      this.leftLeg = root.getChild("leftLeg");
   }

   public StarWarsWeaponWielderModel(net.minecraft.client.model.geom.ModelPart root) {
      this(root, net.minecraft.client.renderer.rendertype.RenderType::getEntityCutoutNoCull);
   }

   public StarWarsWeaponWielderModel() {
      this(
         modelPart(
            0.0F,
            24.0F,
            Map.of(
               "body",
               modelPart(
                  0.0F,
                  -11.0F,
                  Map.of(
                     "head",
                     modelPart(0.0F, -13.0F, Map.of()),
                     "rightArm",
                     modelPart(-5.0F, -11.0F, Map.of("rightItem", modelPart(-1.0F, 8.0F, Map.of()))),
                     "leftArm",
                     modelPart(5.0F, -11.0F, Map.of("leftItem", modelPart(1.0F, 8.0F, Map.of())))
                  )
               ),
               "rightLeg",
               modelPart(-2.0F, -12.0F, Map.of()),
               "leftLeg",
               modelPart(2.0F, -12.0F, Map.of())
            )
         )
      );
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.root.traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
      net.minecraft.world.item.ItemStack stack = entity.getMainHandItem();
      if (stack.getItem() instanceof LightsaberItem && entity instanceof ForcePossessor forcePossessor) {
         boolean dualWielding = false;
         if (dualWielding) {
            this.customRightItemPos = this.customLeftItemPos = true;
         } else {
            this.customLeftItemPos = entity.getMainArm() == net.minecraft.world.entity.HumanoidArm.LEFT;
            this.customRightItemPos = !this.customLeftItemPos;
         }

         float partialTick = ageInTicks % 1.0F;
         net.minecraft.world.level.Level lvl = net.minecraft.client.Minecraft.getInstance().world;
         float animTicks = lvl != null ? (float)(lvl.getTime() - LightsaberItem.getActivatedTick(stack)) + partialTick : 25.0F;
         if (!LightsaberItem.isActive(stack)) {
            animTicks = 25.0F - animTicks;
         }

         float sprint = forcePossessor.swgc$getSprint(partialTick);
         if (!entity.isSprinting()) {
            sprint = 1.0F - sprint;
         }

         if (sprint < 1.0F) {
            this.animateMovement(
               dualWielding ? LightsaberDualWielderAnimation.WALK : LightsaberWielderAnimation.WALK, limbSwing, limbSwingAmount, 1.4F, 1.0F - sprint
            );
         }

         if (sprint > 0.0F) {
            this.animateMovement(dualWielding ? LightsaberDualWielderAnimation.RUN : LightsaberWielderAnimation.RUN, limbSwing, limbSwingAmount, 1.0F, sprint);
         }

         if (forcePossessor.isLightsaberAttacking() && forcePossessor.swgc$getLightsaberAttack() == LightsaberAttack.OBI_ANI) {
            this.animateMovement(LightsaberWielderAnimation.ACTIVATION, Float.MAX_VALUE, limbSwingAmount, 1.0F, -1.0F);
            this.rightArm.resetTransform();
            this.leftArm.resetTransform();
            this.animateMovement(
               dualWielding ? LightsaberDualWielderAnimation.OBI_ANI : LightsaberWielderAnimation.OBI_ANI,
               (float)forcePossessor.swgc$getForceTicks() + partialTick,
               1.0F,
               1.0F,
               1.0F
            );
         } else if (forcePossessor.isUsingForce()) {
            this.animateMovement(LightsaberWielderAnimation.ACTIVATION, Float.MAX_VALUE, limbSwingAmount, 1.0F, -1.0F);
            this.rightArm.resetTransform();
            this.leftArm.resetTransform();
            this.animateMovement(
               forcePossessor.swgc$getForceSecondaryAction() == ForceSecondaryAction.BLOCK
                  ? (dualWielding ? LightsaberDualWielderAnimation.BLOCK : LightsaberWielderAnimation.BLOCK)
                  : LightsaberWielderAnimation.FORCE,
               0.0F,
               1.0F,
               0.0F,
               1.0F
            );
         } else {
            if (animTicks < 25.0F) {
               this.animateMovement(
                  LightsaberWielderAnimation.ACTIVATION, animTicks, this.handSwingProgress > 0.0F ? -limbSwingAmount : 1.0F - limbSwingAmount, 1.0F, 1.0F
               );
            } else if (this.handSwingProgress > 0.0F) {
               this.animateMovement(LightsaberWielderAnimation.ACTIVATION, animTicks, limbSwingAmount, 1.0F, -1.0F);
            } else {
               this.animateMovement(
                  dualWielding ? LightsaberDualWielderAnimation.IDLE : LightsaberWielderAnimation.IDLE, animTicks, 1.0F - limbSwingAmount, 1.0F, 1.0F
               );
            }

            if (this.handSwingProgress > 0.0F) {
               this.rightArm.resetTransform();
               this.leftArm.resetTransform();
               che.swgc.client.compat.animation.Animation[] anims = dualWielding ? LightsaberDualWielderAnimation.ATTACKS : LightsaberWielderAnimation.ATTACKS;
               che.swgc.client.compat.animation.Animation anim = anims[forcePossessor.swgc$getBaseAttack() >= 0
                  ? forcePossessor.swgc$getBaseAttack() % anims.length
                  : (forcePossessor.swgc$getBaseAttack() + 256) % anims.length];
               this.animateMovement(anim, this.handSwingProgress, 1.0F, anim.comp_597() * 20.0F, 1.0F);
            }
         }
      } else {
         StarWarsWeaponWielderModel.Animations animations;
         if (entity instanceof StarWarsWeaponWielder wielder && (animations = ANIMATIONS_PER_ITEM.get(stack.getItem())) != null) {
            if (animations.customItemPosition) {
               this.customLeftItemPos = entity.getMainArm() == net.minecraft.world.entity.HumanoidArm.LEFT;
               this.customRightItemPos = !this.customLeftItemPos;
            }

            boolean var10000;
            label212: {
               label181:
               if (!(this.handSwingProgress > 0.0F)) {
                  if (stack.getItem() instanceof BlasterItem blaster && blaster.isAiming(stack)) {
                     break label181;
                  }

                  var10000 = false;
                  break label212;
               }

               var10000 = true;
            }

            boolean attacking = var10000;
            float walk = 1.0F;
            if (entity.onGround()) {
               wielder.swgc$getJumpAnimState().stop();
            } else {
               wielder.swgc$getJumpAnimState().startIfStopped(entity.age);
               this.updateAnimation(wielder.swgc$getJumpAnimState(), animations.jump(), ageInTicks);
               walk -= (float)wielder.swgc$getJumpAnimState().getTimeRunning() / 250.0F;
            }

            if (walk > 0.0F) {
               float walkAnimScale = (entity.onGround() ? 1.0F - limbSwingAmount : -limbSwingAmount) * walk;
               if (attacking) {
                  walkAnimScale--;
               }

               this.animateMovement(animations.idle, ageInTicks, 1.0F, 1.0F, walkAnimScale);
               float sprintx = wielder.swgc$getSprint(ageInTicks % 1.0F);
               if (!entity.isSprinting()) {
                  sprintx = 1.0F - sprintx;
               }

               if (sprintx < 1.0F) {
                  this.animateMovement(animations.walk, limbSwing, limbSwingAmount, 1.0F, walk * (1.0F - sprintx));
               }

               if (sprintx > 0.0F) {
                  this.animateMovement(animations.run, limbSwing, limbSwingAmount, 1.0F, walk * sprintx);
               }
            } else if (attacking) {
               this.animateMovement(animations.idle, ageInTicks, 1.0F, 1.0F, -1.0F);
            }

            if (attacking) {
               this.animateMovement(animations.attack, this.handSwingProgress, 1.0F, animations.attack.comp_597() * 20.0F, 1.0F);
            }
         }
      }

      if (entity.getMainArm() == net.minecraft.world.entity.HumanoidArm.LEFT) {
         SwgcClientUtils.mirrorModel(
            Set.of(this.root, this.body, this.head), this.rightArm, this.leftArm, this.rightItem, this.leftItem, this.rightLeg, this.leftLeg
         );
      }

      float yRot = netHeadYaw * (float) Math.PI / 180.0F;
      float xRot = entity.getRoll() > 4 ? (float) (-Math.PI / 4) : headPitch * (float) Math.PI / 180.0F;
      this.head.yRot += yRot;
      this.head.xRot += xRot;
      if (entity.isInSneakingPose()) {
         this.body.xRot += 0.5F;
         this.head.xRot -= 0.5F;
         this.rightArm.xRot -= 0.5F;
         this.leftArm.xRot -= 0.5F;
      }
   }

   public net.minecraft.client.model.geom.ModelPart getPart() {
      return this.root;
   }

   public boolean shouldOverride(T entity) {
      return !entity.isInSwimmingPose() && entity instanceof ForcePossessor && entity.getMainHandItem().getItem() instanceof LightsaberItem
         || entity instanceof StarWarsWeaponWielder && ANIMATIONS_PER_ITEM.containsKey(entity.getMainHandItem().getItem());
   }

   public void translateToItem(com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.world.entity.HumanoidArm arm) {
      (arm == net.minecraft.world.entity.HumanoidArm.LEFT ? this.leftItem : this.rightItem).rotate(poseStack);
   }

   public void animJediJump(net.minecraft.world.entity.Entity entity, net.minecraft.client.model.HumanoidModel<?> model, float partialTick) {
      if (!entity.onGround()) {
         Queue values = new ArrayDeque<>();

         for (net.minecraft.client.model.geom.ModelPart modelPart : new net.minecraft.client.model.geom.ModelPart[]{
            model.head, model.hat, model.rightArm, model.leftArm, model.rightLeg, model.leftLeg
         }) {
            values.add(new Vector3f(modelPart.pivotX, modelPart.pivotY, modelPart.pivotZ));
            values.add(new Vector3f(modelPart.xRot, modelPart.yRot, modelPart.zRot));
         }

         for (net.minecraft.client.model.geom.ModelPart modelPart : new net.minecraft.client.model.geom.ModelPart[]{this.root, this.head, this.body, this.rightArm, this.leftArm, this.rightLeg, this.leftLeg}) {
            modelPart.resetTransform();
         }

         float ticks = (float)((ForcePossessor)entity).swgc$getForceTicks() + partialTick;
         this.animateMovement(LightsaberWielderAnimation.JEDI_JUMP, ticks, 1.0F, 1.0F, 1.0F);
         this.copyTo(model);
         float scale = Math.min(ticks * 0.2F, 1.0F);

         for (net.minecraft.client.model.geom.ModelPart modelPart : new net.minecraft.client.model.geom.ModelPart[]{
            model.head, model.hat, model.rightArm, model.leftArm, model.rightLeg, model.leftLeg
         }) {
            Vector3f vector3f = values.remove().lerp(new Vector3f(modelPart.pivotX, modelPart.pivotY, modelPart.pivotZ), scale);
            modelPart.setPivot(vector3f.x, vector3f.y, vector3f.z);
            vector3f = values.remove().lerp(new Vector3f(modelPart.xRot, modelPart.yRot, modelPart.zRot), scale);
            modelPart.setAngles(vector3f.x, vector3f.y, vector3f.z);
         }
      }
   }

   public void copyTo(net.minecraft.client.model.HumanoidModel<?> model) {
      Matrix4f pose = new Matrix4f()
         .translate(this.root.pivotX, this.root.pivotY, this.root.pivotZ)
         .rotateZYX(this.root.zRot, this.root.yRot, this.root.xRot);
      translateAndRotate(pose, this.rightLeg, model.rightLeg, new Vector3f());
      translateAndRotate(pose, this.leftLeg, model.leftLeg, new Vector3f());
      pose = translateAndRotate(pose, this.body, model.body, new Vector3f(0.0F, -13.0F, 0.0F));
      translateAndRotate(pose, this.head, model.head, new Vector3f());
      model.hat.copyTransform(model.head);
      translateAndRotate(pose, this.rightArm, model.rightArm, new Vector3f());
      translateAndRotate(pose, this.leftArm, model.leftArm, new Vector3f());
      if (model instanceof net.minecraft.client.model.player.PlayerModel<?> playerModel) {
         playerModel.leftPants.copyTransform(playerModel.leftLeg);
         playerModel.rightPants.copyTransform(playerModel.rightLeg);
         playerModel.leftSleeve.copyTransform(playerModel.leftArm);
         playerModel.rightSleeve.copyTransform(playerModel.rightArm);
         playerModel.jacket.copyTransform(playerModel.body);
      }
   }

   private static Matrix4f translateAndRotate(Matrix4f pose, net.minecraft.client.model.geom.ModelPart modelPart, net.minecraft.client.model.geom.ModelPart modelPart1, Vector3f offset) {
      Matrix4f output = new Matrix4f(pose)
         .translate(modelPart.pivotX, modelPart.pivotY, modelPart.pivotZ)
         .rotateZYX(modelPart.zRot, modelPart.yRot, modelPart.xRot);
      Vector3f vector3f = output.transformPosition(offset);
      modelPart1.setPivot(vector3f.x, vector3f.y, vector3f.z);
      output.getEulerAnglesZYX(vector3f);
      modelPart1.setAngles(vector3f.x, vector3f.y, vector3f.z);
      return output;
   }

   protected static net.minecraft.client.model.geom.ModelPart modelPart(float x, float y, Map<String, net.minecraft.client.model.geom.ModelPart> children) {
      net.minecraft.client.model.geom.ModelPart modelPart = new net.minecraft.client.model.geom.ModelPart(List.of(), children);
      modelPart.setDefaultTransform(net.minecraft.client.model.geom.PartPose.pivot(x, y, 0.0F));
      modelPart.resetTransform();
      return modelPart;
   }

   public static void addAnimations(
      net.minecraft.world.item.Item item, che.swgc.client.compat.animation.Animation idle, che.swgc.client.compat.animation.Animation walk, che.swgc.client.compat.animation.Animation run, che.swgc.client.compat.animation.Animation jump, che.swgc.client.compat.animation.Animation attack, boolean customItemPosition
   ) {
      ANIMATIONS_PER_ITEM.putIfAbsent(item, new StarWarsWeaponWielderModel.Animations(idle, walk, run, jump, attack, customItemPosition));
   }

   static {
      addAnimations(
         SwgcItems.DC15A.get(),
         BlasterRifleAnimation.IDLE,
         BlasterRifleAnimation.WALK,
         BlasterRifleAnimation.RUNNING,
         BlasterRifleAnimation.JUMP,
         BlasterRifleAnimation.SHOT,
         false
      );
      addAnimations(
         SwgcItems.DC15S.get(),
         BlasterRifleAnimation.IDLE,
         BlasterRifleAnimation.WALK,
         BlasterRifleAnimation.RUNNING,
         BlasterRifleAnimation.JUMP,
         BlasterRifleAnimation.SHOT,
         false
      );
      addAnimations(
         SwgcItems.DC17.get(),
         BlasterPistolAnimation.IDLE,
         BlasterPistolAnimation.WALK,
         BlasterPistolAnimation.RUNNING,
         BlasterPistolAnimation.JUMP,
         BlasterPistolAnimation.SHOT,
         false
      );
      addAnimations(
         SwgcItems.DH17.get(),
         BlasterPistolAnimation.IDLE,
         BlasterPistolAnimation.WALK,
         BlasterPistolAnimation.RUNNING,
         BlasterPistolAnimation.JUMP,
         BlasterPistolAnimation.SHOT,
         false
      );
      addAnimations(
         SwgcItems.E5.get(),
         BlasterRifleAnimation.IDLE,
         BlasterRifleAnimation.WALK,
         BlasterRifleAnimation.RUNNING,
         BlasterRifleAnimation.JUMP,
         BlasterRifleAnimation.SHOT,
         false
      );
      addAnimations(
         SwgcItems.TL50.get(),
         BlasterRifleAnimation.IDLE,
         BlasterRifleAnimation.WALK,
         BlasterRifleAnimation.RUNNING,
         BlasterRifleAnimation.JUMP,
         BlasterRifleAnimation.SHOT,
         false
      );
      addAnimations(
         SwgcItems.JAWA_BLASTER.get(),
         BlasterRifleAnimation.IDLE,
         BlasterRifleAnimation.WALK,
         BlasterRifleAnimation.RUNNING,
         BlasterRifleAnimation.JUMP,
         BlasterRifleAnimation.SHOT,
         false
      );
      addAnimations(
         SwgcItems.AMBAN_SNIPER_RIFLE.get(),
         AmbanSniperRifleAnimation.IDLE,
         AmbanSniperRifleAnimation.WALK,
         AmbanSniperRifleAnimation.RUNNING,
         AmbanSniperRifleAnimation.JUMP,
         AmbanSniperRifleAnimation.SHOT,
         true
      );
   }

   private static record Animations(che.swgc.client.compat.animation.Animation idle, che.swgc.client.compat.animation.Animation walk, che.swgc.client.compat.animation.Animation run, che.swgc.client.compat.animation.Animation jump, che.swgc.client.compat.animation.Animation attack, boolean customItemPosition) {
   }

   public interface Wrapper {
      boolean swgc$areAnimationsOverridden();
   }
}
