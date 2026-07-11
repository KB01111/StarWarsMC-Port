package che.swgc.client;

import che.swgc.client.gui.DroidCommandScreen;
import che.swgc.client.sound.LightsaberSoundInstance;
import che.swgc.client.sound.StarFighterEngineSoundInstance;
import che.swgc.entity.CommandableMob;
import che.swgc.entity.StarFighter;
import che.swgc.reg.SwgcSounds;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import che.swgc.client.compat.animation.Animation;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import org.apache.logging.log4j.util.TriConsumer;
import org.joml.Vector3f;

public class SwgcClientUtils {
   public SwgcClientUtils() {
   }

   public static void mirrorModel(Set<net.minecraft.client.model.geom.ModelPart> single, net.minecraft.client.model.geom.ModelPart... couples) {
      single.forEach(modelPart -> {
         modelPart.x = -modelPart.x;
         modelPart.yRot = -modelPart.yRot;
         modelPart.zRot = -modelPart.zRot;
      });

      for (int i = 1; i < couples.length; i += 2) {
         net.minecraft.client.model.geom.ModelPart part = couples[i - 1];
         net.minecraft.client.model.geom.ModelPart part1 = couples[i];
         PartPose pose = part.storePose();
         float xScale = part.xScale;
         float yScale = part.yScale;
         float zScale = part.zScale;
         part.setPos(-part1.x, part1.y, part1.z);
         part.setRotation(part1.xRot, -part1.yRot, -part1.zRot);
         part.xScale = part1.xScale;
         part.yScale = part1.yScale;
         part.zScale = part1.zScale;
         part1.setPos(-pose.x(), pose.y(), pose.z());
         part1.setRotation(pose.xRot(), -pose.yRot(), -pose.zRot());
         part1.xScale = xScale;
         part1.yScale = yScale;
         part1.zScale = zScale;
      }
   }

   public static Animation removePose(Animation original, Animation pose, IntUnaryOperator index) {
      AnimationDefinition originalDef = original.definition();
      AnimationDefinition poseDef = pose.definition();
      AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(originalDef.lengthInSeconds());
      if (originalDef.looping()) {
         builder.looping();
      }

      Map<String, List<AnimationChannel>> anims = new HashMap<>(originalDef.boneAnimations());
      poseDef.boneAnimations()
         .forEach(
            (bone, poseChannels) -> {
               List<AnimationChannel> channels = anims.remove(bone);
               if (channels == null) {
                  channels = List.of();
               }

               for (AnimationChannel poseChannel : poseChannels) {
                  Keyframe[] poseKeyframes = poseChannel.keyframes();
                  Vector3f vector3f = new Vector3f(poseKeyframes[index.applyAsInt(poseKeyframes.length)].postTarget());
                  boolean flag = true;

                  for (AnimationChannel channel : channels) {
                     if (channel.target() == poseChannel.target()) {
                        builder.addAnimation(
                           bone,
                           new AnimationChannel(
                              channel.target(),
                              Arrays.stream(channel.keyframes())
                                 .map(keyframe -> new Keyframe(keyframe.timestamp(), new Vector3f(keyframe.postTarget()).sub(vector3f), keyframe.interpolation()))
                                 .toArray(Keyframe[]::new)
                           )
                        );
                        flag = false;
                        break;
                     }
                  }

                  if (flag) {
                     builder.addAnimation(
                        bone,
                        new AnimationChannel(
                           poseChannel.target(),
                           Arrays.stream(poseKeyframes)
                              .map(keyframe -> new Keyframe(keyframe.timestamp(), new Vector3f(keyframe.postTarget()).mul(-1.0F), keyframe.interpolation()))
                              .toArray(Keyframe[]::new)
                        )
                     );
                  }
               }
            }
         );
      anims.forEach((bone, channels) -> channels.forEach(channel -> builder.addAnimation(bone, channel)));
      return Animation.fromDefinition(builder.build(), originalDef.lengthInSeconds());
   }

   public static net.minecraft.resources.Identifier entityTex(String path) {
      return Identifier.fromNamespaceAndPath("swgc", "textures/entity/" + path + ".png");
   }

   public static void tracePart(
      Class<?> animations,
      net.minecraft.client.model.geom.ModelPart root,
      TriConsumer<net.minecraft.world.entity.AnimationState, Animation, Float> animator,
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
            Animation anim = (Animation)field.get(null);
            che.swgc.Constants.LOG.debug("Animation {}", field.getName());
            Vector3f vector3f = null;

            for (float frame : frames) {
               root.getAllParts().forEach(net.minecraft.client.model.geom.ModelPart::resetPose);
               animator.accept(state, anim, frame);
               poseStack.pushPose();
               translator.accept(poseStack);
               Vector3f vector3f1 = poseStack.last().pose().transformPosition(new Vector3f());
               if (firstFrameAsZero) {
                  if (vector3f != null) {
                     vector3f1.sub(vector3f);
                  } else {
                     vector3f = new Vector3f(vector3f1);
                     vector3f1 = new Vector3f();
                  }
               }

               poseStack.popPose();
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
      net.minecraft.client.Minecraft.getInstance().gui.setScreen(new DroidCommandScreen(mob));
   }
}
