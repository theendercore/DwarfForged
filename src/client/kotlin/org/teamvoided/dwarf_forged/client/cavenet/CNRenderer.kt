package org.teamvoided.dwarf_forged.client.cavenet

import com.mojang.blaze3d.systems.RenderSystem
import com.mojang.blaze3d.vertex.*
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.OverlayTexture
import net.minecraft.client.render.WorldRenderer.getLightmapCoordinates
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Vec3d
import org.joml.Matrix4f

object CNRenderer {
    fun init() {
        WorldRenderEvents.AFTER_TRANSLUCENT.register(::renderCustom)
    }

    val GLASS: Identifier = Identifier.ofDefault("textures/block/blue_stained_glass.png")
    fun renderCustom(ctx: WorldRenderContext) {
        val matrix = ctx.matrixStack() ?: return
        val profiler = ctx.profiler()
        profiler.push("DwarfForgedRenderer")

        val tessellator = Tessellator.getInstance()
        val world = ctx.world()
        matrix.push()
        // Steel this code
//        ctx.worldRenderer().renderClouds()
        if (CaveNet.nodes.isNotEmpty()) {
            RenderSystem.setShader(GameRenderer::getRenderTypeTranslucentShader)
            val tempTexture = Identifier.ofDefault("textures/block/rail_corner.png")
            RenderSystem.setShaderTexture(0, tempTexture)
            ctx.lightmapTextureManager().enable()
            RenderSystem.disableCull()

            val mtx = matrix.peek().model
            val buffer = tessellator.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR_TEXTURE_LIGHT_NORMAL)
            val camPos = ctx.camera().pos


            val color = 0xff_ff_ff_ff.toInt()
            for (node in CaveNet.nodes) {
                val light = getLightmapCoordinates(world, node)
                // Bottom
                buffer.quad(mtx, node, camPos, color, light, vec3d(0, 1, 0))

                // X
//                buffer.xyz(mtx, vec3d(node.x, node.y + 1, node.z), camPos).uv0(0.0F, 0.0F)
//                buffer.xyz(mtx, vec3d(node.x + 1, node.y + 1, node.z), camPos).uv0(1.0F, 0.0F)
//                buffer.xyz(mtx, vec3d(node.x + 1, node.y + 1, node.z + 1f), camPos).uv0(1.0F, 1.0F)
//                buffer.xyz(mtx, vec3d(node.x, node.y + 1, node.z + 1f), camPos).uv0(0.0F, 1.0F)

            }
            BufferRenderer.drawWithShader(buffer.endOrThrow())
            RenderSystem.enableCull()
        }

        matrix.pop()
        profiler.pop()
        Thread.yield()
    }

    fun VertexConsumer.quad(mtx: Matrix4f, node: BlockPos, camPos: Vec3d, color: Int, light: Int, normal: Vec3d) {
        xyz(mtx, vec3d(node.x, node.y, node.z), camPos)
            .color(color)
            .uv0(0.0F, 0.0F)
            .uv1(OverlayTexture.WHITE_V)
            .uv2(light)
            .normal(normal)
        xyz(mtx, vec3d(node.x + 1, node.y, node.z), camPos)
            .color(color)
            .uv0(1.0F, 0.0F)
            .uv1(OverlayTexture.WHITE_V)
            .uv2(light)
            .normal(normal)
        xyz(mtx, vec3d(node.x + 1, node.y, node.z + 1f), camPos)
            .color(color)
            .uv0(1.0F, 1.0F)
            .uv1(OverlayTexture.WHITE_V)
            .uv2(light)
            .normal(normal)
        xyz(mtx, vec3d(node.x, node.y, node.z + 1f), camPos)
            .color(color)
            .uv0(0.0F, 1.0F)
            .uv1(OverlayTexture.WHITE_V)
            .uv2(light)
            .normal(normal)
    }

    fun VertexConsumer.xyz(model: Matrix4f, vec: Vec3d, camera: Vec3d): VertexConsumer =
        this.xyz(model, (vec.x - camera.x).toFloat(), (vec.y - camera.y).toFloat(), (vec.z - camera.z).toFloat())

    fun VertexConsumer.normal(vec: Vec3d): VertexConsumer =
        this.normal(vec.x.toFloat(), vec.y.toFloat(), vec.z.toFloat())

    fun vec3d(num: Number) = vec3d(num, num, num)
    fun vec3d(x: Number, y: Number, z: Number) = Vec3d(x.toDouble(), y.toDouble(), z.toDouble())
}

