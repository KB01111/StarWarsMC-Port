package che.swgc.client.compat.render;



import com.mojang.blaze3d.PrimitiveTopology;

import com.mojang.blaze3d.vertex.BufferBuilder;

import com.mojang.blaze3d.vertex.ByteBufferBuilder;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;

import com.mojang.blaze3d.vertex.MeshData;

import com.mojang.blaze3d.vertex.PoseStack;

import com.mojang.blaze3d.vertex.VertexConsumer;

import com.mojang.blaze3d.vertex.VertexFormat;

import com.mojang.blaze3d.vertex.VertexFormatElement;

import java.util.LinkedHashMap;

import java.util.List;

import java.util.Map;

import net.minecraft.client.renderer.OrderedSubmitNodeCollector;

import net.minecraft.client.renderer.rendertype.RenderType;



public final class DeferredItemBuffers implements MultiBufferSource {

   private final Map<RenderType, BufferBuilder> builders = new LinkedHashMap<>();

   private final ByteBufferBuilder byteBufferBuilder = new ByteBufferBuilder(256);



   @Override

   public VertexConsumer getBuffer(RenderType renderType) {

      return this.builders

         .computeIfAbsent(

            renderType,

            type -> new BufferBuilder(this.byteBufferBuilder, PrimitiveTopology.QUADS, DefaultVertexFormat.ENTITY)

         );

   }



   public void flush(PoseStack poseStack, OrderedSubmitNodeCollector collector) {

      for (Map.Entry<RenderType, BufferBuilder> entry : this.builders.entrySet()) {

         MeshData mesh = entry.getValue().build();

         if (mesh == null) {

            continue;

         }



         RenderType renderType = entry.getKey();

         collector.submitCustomGeometry(

            poseStack,

            renderType,

            (pose, consumer) -> MeshReplay.replay(mesh, consumer)

         );

         mesh.close();

      }



      this.builders.clear();

   }



   private static final class MeshReplay {

      private MeshReplay() {

      }



      private static void replay(MeshData mesh, VertexConsumer consumer) {

         MeshData.DrawState state = mesh.drawState();

         VertexFormat format = state.format();

         List<VertexFormatElement> elements = format.getElements();

         int stride = format.getVertexSize();

         var vertices = mesh.vertexBuffer();

         int vertexCount = state.vertexCount();



         for (int vertex = 0; vertex < vertexCount; vertex++) {

            int offset = vertex * stride;

            float x = 0.0F;

            float y = 0.0F;

            float z = 0.0F;

            int color = -1;

            float u = 0.0F;

            float v = 0.0F;

            int overlay = 0;

            int light = 15728880;

            int normal = 0;



            for (VertexFormatElement element : elements) {

               int elementOffset = offset + element.offset();

               switch (element.name()) {

                  case DefaultVertexFormat.POSITION_SEMANTIC_NAME:

                     x = vertices.getFloat(elementOffset);

                     y = vertices.getFloat(elementOffset + 4);

                     z = vertices.getFloat(elementOffset + 8);

                     break;

                  case DefaultVertexFormat.COLOR_SEMANTIC_NAME:

                     color = vertices.getInt(elementOffset);

                     break;

                  case DefaultVertexFormat.UV0_SEMANTIC_NAME:

                     u = vertices.getFloat(elementOffset);

                     v = vertices.getFloat(elementOffset + 4);

                     break;

                  case DefaultVertexFormat.UV1_SEMANTIC_NAME:

                     overlay = vertices.getInt(elementOffset);

                     break;

                  case DefaultVertexFormat.UV2_SEMANTIC_NAME:

                     light = vertices.getInt(elementOffset);

                     break;

                  case DefaultVertexFormat.NORMAL_SEMANTIC_NAME:

                     normal = vertices.getInt(elementOffset);

                     break;

                  default:

                     break;

               }

            }



            consumer.addVertex(x, y, z)

               .setColor(color)

               .setUv(u, v)

               .setOverlay(overlay)

               .setLight(light)

               .setNormal((byte)(normal & 0xFF), (byte)((normal >> 8) & 0xFF), (byte)((normal >> 16) & 0xFF));

         }

      }

   }

}

