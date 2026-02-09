package org.teamvoided.dwarf_forged.client.cavenet

import com.mojang.blaze3d.vertex.Tessellator
import com.mojang.blaze3d.vertex.VertexConsumer
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents
import net.minecraft.client.render.OverlayTexture
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.WorldRenderer.getLightmapCoordinates
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.math.Vec3d
import org.joml.Matrix4f
import org.teamvoided.dwarf_forged.client.cavenet.node.DoorNode
import kotlin.math.max

object CNRenderer {
    fun init() {
        WorldRenderEvents.AFTER_TRANSLUCENT.register(::renderCustom)
    }

    val GLASS: Identifier = Identifier.ofDefault("textures/block/blue_stained_glass.png")
    fun renderCustom(ctx: WorldRenderContext) {
        val posStack = ctx.matrixStack() ?: return
        val profiler = ctx.profiler()
        profiler.push("DwarfForgedRenderer")

        val tessellator = Tessellator.getInstance()
        val world = ctx.world()
        posStack.push()
        // Steel this code
//        ctx.worldRenderer().renderClouds()
        if (CaveNet.nodes.isNotEmpty()) {

            val mtx = posStack.peek().model
            val buffer = ctx.consumers()!!.getBuffer(RenderLayer.getEntityTranslucent(GLASS))
            val camPos = ctx.camera().pos

            val color = 0xff_ff_ff_ff.toInt()

            for ((nodePos, node) in CaveNet.nodes.toList()) {
                if (node.shouldRender() && node is DoorNode) {
                    val light = max(getLightmapCoordinates(world, nodePos), 7 shl 4)
                    buffer.faceFromDir(mtx, nodePos, camPos, color, light, node.direction)
                }
            }
        }

        posStack.pop()
        profiler.pop()
    }

    fun VertexConsumer.faceFromDir(
        mtx: Matrix4f,
        nodePos: BlockPos,
        camPos: Vec3d,
        color: Int,
        light: Int,
        dir: Direction,
    ) {
        val x1 = nodePos.x  + (dir.vector.x * 0.5)
        val y1 = nodePos.y
        val z1 = nodePos.z + (dir.vector.z * 0.5)

        val x2 = x1 + 1
        val y2 = y1 + 1
        val z2 = z1 + 1
        when (dir) {
            Direction.DOWN -> {}
            Direction.UP -> {}
            Direction.SOUTH,
                -> face(mtx, x2, y2, z1, x1, y1, z1, camPos, color, light, vec3d(0, 1, 0))

            Direction.NORTH,
                -> face(mtx, x1, y2, z2, x2, y1, z2, camPos, color, light, vec3d(0, 1, 0))

            Direction.EAST,
                -> face(mtx, x1, y2, z1, x1, y1, z2, camPos, color, light, vec3d(0, 1, 0))

            Direction.WEST,
                -> face(mtx, x2, y2, z2, x2, y1, z1, camPos, color, light, vec3d(0, 1, 0))
        }
    }

    fun VertexConsumer.face(
        mtx: Matrix4f, x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number,
        camPos: Vec3d, color: Int, light: Int, normal: Vec3d,
    ) {

        xyz(mtx, vec3d(x1, y1, z1), camPos)
            .color(color)
            .uv0(0.0F, 0.0F)
            .uv1(OverlayTexture.DEFAULT_UV)
            .uv2(light)
            .normal(normal)

        xyz(mtx, vec3d(x1, y2, z1), camPos)
            .color(color)
            .uv0(1.0F, 0.0F)
            .uv1(OverlayTexture.DEFAULT_UV)
            .uv2(light)
            .normal(normal)

        xyz(mtx, vec3d(x2, y2, z2), camPos)
            .color(color)
            .uv0(1.0F, 1.0F)
            .uv1(OverlayTexture.DEFAULT_UV)
            .uv2(light)
            .normal(normal)

        xyz(mtx, vec3d(x2, y1, z2), camPos)
            .color(color)
            .uv0(0.0F, 1.0F)
            .uv1(OverlayTexture.DEFAULT_UV)
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

