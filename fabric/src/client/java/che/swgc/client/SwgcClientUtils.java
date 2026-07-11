package che.swgc.client;

import che.swgc.client.gui.DroidCommandScreen;
import che.swgc.client.sound.LightsaberSoundInstance;
import che.swgc.client.sound.StarFighterEngineSoundInstance;
import che.swgc.entity.CommandableMob;
import che.swgc.entity.StarFighter;
import che.swgc.reg.SwgcSounds;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.Identifier;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvent;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.AnimationState;
import che.swgc.client.compat.animation.Transformation;
import che.swgc.client.compat.animation.Animation;
import net.minecraft.client.animation.Keyframe;
import che.swgc.client.compat.animation.Animation.Builder;
import org.apache.logging.log4j.util.TriConsumer;
import org.joml.Vector3f;

public class SwgcClientUtils {
   public SwgcClientUtils() {
   }

   public static void mirrorModel(Set<net.minecraft.client.model.geom.ModelPart> single, net.minecraft.client.model.geom.ModelPart... couples) {
      single.forEach(modelPart -> {
         modelPart.pivotX = -modelPart.pivotX;
         modelPart.yRot = -modelPart.yRot;
         modelPart.zRot = -modelPart.zRot;
      });

      for (int i = 1; i < couples.length; i += 2) {
         net.minecraft.client.model.geom.ModelPart part = couples[i - 1];
         net.minecraft.client.model.geom.ModelPart part1 = couples[i];
         net.minecraft.client.model.geom.PartPose pose = part.getTransform();
         float xScale = part.xScale;
         float yScale = part.yScale;
         float zScale = part.zScale;
         part.setPivot(-part1.pivotX, part1.pivotY, part1.pivotZ);
         part.setAngles(part1.xRot, -part1.yRot, -part1.zRot);
         part.xScale = part1.xScale;
         part.yScale = part1.yScale;
         part.zScale = part1.zScale;
         part1.setPivot(-pose.pivotX, pose.pivotY, pose.pivotZ);
         part1.setAngles(pose.xRot, -pose.yRot, -pose.zRot);
         part1.xScale = xScale;
         part1.yScale = yScale;
         part1.zScale = zScale;
      }
   }

   public static che.swgc.client.compat.animation.Animation removePose(che.swgc.client.compat.animation.Animation original, che.swgc.client.compat.animation.Animation pose, IntUnaryOperator index) {
      che.swgc.client.compat.animation.Animation.Builder builder = che.swgc.client.compat.animation.Animation.Builder.create(original.comp_597());
      if (original.comp_598()) {
         builder.looping();
      }

      HashMap anims = new HashMap<>(original.comp_599());
      pose.comp_599()
         .forEach(
            (bone, poseChannels) -> {
               List channels = anims.remove(bone);
               if (channels == null) {
                  channels = List.of();
               }

               for (che.swgc.client.compat.animation.Transformation poseChannel : poseChannels) {
                  Vector3f vector3f = poseChannel.comp_596()[index.applyAsInt(poseChannel.comp_596().length)].comp_601();
                  boolean flag = true;

                  for (che.swgc.client.compat.animation.Transformation channel : channels) {
                     if (channel.comp_595() == poseChannel.comp_595()) {
                        builder.addBoneAnimation(
                           bone,
                           new che.swgc.client.compat.animation.Transformation(
                              channel.comp_595(),
                              Arrays.stream(channel.comp_596())
                                 .map(keyframe -> new net.minecraft.client.animation.Keyframe(keyframe.comp_600(), new Vector3f(keyframe.comp_601()).sub(vector3f), keyframe.comp_602()))
                                 .toArray(net.minecraft.client.animation.Keyframe[]::new)
                           )
                        );
                        flag = false;
                        break;
                     }
                  }

                  if (flag) {
                     builder.addBoneAnimation(
                        bone,
                        new che.swgc.client.compat.animation.Transformation(
                           poseChannel.comp_595(),
                           Arrays.stream(poseChannel.comp_596())
                              .map(keyframe -> new net.minecraft.client.animation.Keyframe(keyframe.comp_600(), new Vector3f(keyframe.comp_601()).mul(-1.0F), keyframe.comp_602()))
                              .toArray(net.minecraft.client.animation.Keyframe[]::new)
                        )
                     );
                  }
               }
            }
         );
      anims.forEach((bone, channels) -> channels.forEach(channel -> builder.addBoneAnimation(bone, channel)));
      return builder.build();
   }

   public static net.minecraft.resources.Identifier entityTex(String path) {
      return Identifier.fromNamespaceAndPath("swgc", "textures/entity/" + path + ".png");
   }

   public static void tracePart(
      Class<?> animations,
      net.minecraft.client.model.geom.ModelPart root,
      TriConsumer<net.minecraft.world.entity.AnimationState, che.swgc.client.compat.animation.Animation, Float> animator,
      Consumer<com.mojang.blaze3d.vertex.PoseStack> translator,
      boolean firstFrameAsZero,
      float... frames
   ) {
      che.swgc.Constants.LOG.debug("MODEL PART TRACING\n");
      net.minecraft.world.entity.AnimationState state = new net.minecraft.world.entity.AnimationState();
      state.start(0);
      com.mojang.blaze3d.vertex.PoseStack poseStack = new com.mojang.blaze3d.vertex.PoseStack();

      for (Field field : animations.getFields()) {
         try {
            che.swgc.client.compat.animation.Animation anim = (che.swgc.client.compat.animation.Animation)field.get(null);
            che.swgc.Constants.LOG.debug("Animation {}", field.getName());
            Vector3f vector3f = null;

            for (float frame : frames) {
               root.traverse().forEach(net.minecraft.client.model.geom.ModelPart::resetTransform);
               animator.accept(state, anim, frame);
               poseStack.push();
               translator.accept(poseStack);
               Vector3f vector3f1 = poseStack.peek().getPositionMatrix().transformPosition(new Vector3f());
               if (firstFrameAsZero) {
                  if (vector3f != null) {
                     vector3f1.sub(vector3f);
                  } else {
                     vector3f = new Vector3f(vector3f1);
                     vector3f1 = new Vector3f();
                  }
               }

               poseStack.pop();
               che.swgc.Constants.LOG.debug("Frame {}: {}", frame, vector3f1);
            }

            che.swgc.Constants.LOG.debug("");
         } catch (NullPointerException | ClassCastException | IllegalAccessException var19) {
         }
      }
   }

   public static void tryStartLightsaberHum(net.minecraft.world.entity.LivingEntity entity, net.minecraft.sounds.SoundEvent sound) {
      if (!LightsaberSoundInstance.isHeard(entity)) {
         net.minecraft.client.Minecraft.getInstance().getSoundManager().play(new LightsaberSoundInstance(entity, sound));
      }
   }

   public static void startStarFighterNoise(StarFighter entity) {
      net.minecraft.client.Minecraft.getInstance().getSoundManager().play(new StarFighterEngineSoundInstance(entity, SwgcSounds.STARFIGHTER_ENGINE.get()));
   }

   public static void openDroidScreen(CommandableMob mob) {
      net.minecraft.client.Minecraft.getInstance().setScreen(new DroidCommandScreen(mob));
   }
}
