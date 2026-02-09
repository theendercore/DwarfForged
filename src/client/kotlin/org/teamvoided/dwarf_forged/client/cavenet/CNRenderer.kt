package org.teamvoided.dwarf_forged.client.cavenet

import com.mojang.blaze3d.systems.RenderSystem
import com.mojang.blaze3d.vertex.*
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.OverlayTexture
import net.minecraft.client.render.WorldRenderer.getLightmapCoordinates
import net.minecraft.client.world.ClientWorld
import net.minecraft.particle.ParticleTypes.*
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Vec3d
import org.joml.Matrix4f
import kotlin.math.max

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
            RenderSystem.setShader(GameRenderer::getRenderTypeEntityTranslucentCullShader)
            val tempTexture = GLASS
//            tempTexture = Identifier.ofDefault("textures/block/bookshelf.png")
            RenderSystem.setShaderTexture(0, tempTexture)
            ctx.lightmapTextureManager().enable()
//            RenderSystem.disableCull()
            RenderSystem.enableBlend()

            val mtx = matrix.peek().model
            val buffer = tessellator.begin(
                VertexFormat.DrawMode.QUADS,
                VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL
            )
            val camPos = ctx.camera().pos


            val color = 0xff_ff_ff_ff.toInt()
            for (nodePos in CaveNet.nodes.keys) {
                val light = max(getLightmapCoordinates(world, nodePos), 7 shl 4)
                // Bottom
                buffer.cube(mtx, nodePos, camPos, color, light, world)
            }
            BufferRenderer.drawWithShader(buffer.endOrThrow())
            RenderSystem.disableBlend()
            RenderSystem.enableCull()
        }

        matrix.pop()
        profiler.pop()
        Thread.yield()
    }

    private fun BufferBuilder.cube(
        mtx: Matrix4f,
        nodePos: BlockPos,
        camPos: Vec3d,
        color: Int,
        light: Int,
        world: ClientWorld,
    ) {
        val x1 = nodePos.x
        val y1 = nodePos.y
        val z1 = nodePos.z

        val x2 = nodePos.x + 1
        val y2 = nodePos.y + 1
        val z2 = nodePos.z + 1

        world.addParticle(VAULT_CONNECTION, x1 + 0.5, y1 + 0.5, z1 + 0.5, 0.0, 0.0, 0.0)


//        face(
//            mtx,
//            x2, y1, z2, x1, y1, z1,
//            camPos, color, light, vec3d(0, 1, 0),world
//        )
//        face(
//            mtx,
//             x2, y2, z2, x1, y2, z1,
//            camPos, color, light, vec3d(0, 1, 0),world
//        )

        face(
            mtx,
            x1, y2, z1, x1, y1, z2,
            camPos, color, light, vec3d(0, 1, 0), world
        )
        face(
            mtx,
            x2, y2, z2, x2, y1, z1,
            camPos, color, light, vec3d(0, 1, 0), world
        )
        face(
            mtx,
            x2, y2, z1, x1, y1, z1,
            camPos, color, light, vec3d(0, 1, 0), world
        )
        face(
            mtx,
            x1, y2, z2, x2, y1, z2,
            camPos, color, light, vec3d(0, 1, 0), world
        )
    }

    fun VertexConsumer.face(
        mtx: Matrix4f,
        x1: Int,
        y1: Int,
        z1: Int,
        x2: Int,
        y2: Int,
        z2: Int,
        camPos: Vec3d, color: Int, light: Int, normal: Vec3d, world: ClientWorld,
    ) {

        xyz(mtx, vec3d(x1, y1, z1), camPos)
            .color(color)
            .uv0(0.0F, 0.0F)
            .uv1(OverlayTexture.WHITE_V)
            .uv2(light)
            .normal(normal)
//        world.addParticle(WAX_OFF, x1.toDouble(), y1.toDouble(), z1.toDouble(), 0.0, 0.0, 0.0)

        xyz(mtx, vec3d(x1, y2, z1), camPos)
            .color(color)
            .uv0(1.0F, 0.0F)
            .uv1(OverlayTexture.WHITE_V)
            .uv2(light)
            .normal(normal)
//        if (world.random.nextInt(60) == 0) {
//            world.addParticle(OMINOUS_SPAWNING, x1.toDouble(), y2.toDouble(), z1.toDouble(), 0.0, 0.0, 0.0)
//        }

        xyz(mtx, vec3d(x2, y2, z2), camPos)
            .color(color)
            .uv0(1.0F, 1.0F)
            .uv1(OverlayTexture.WHITE_V)
            .uv2(light)
            .normal(normal)
//        world.addParticle(WAX_ON, x2.toDouble(), y2.toDouble(), z2.toDouble(), 0.0, 0.0, 0.0)

        xyz(mtx, vec3d(x2, y1, z2), camPos)
            .color(color)
            .uv0(0.0F, 1.0F)
            .uv1(OverlayTexture.WHITE_V)
            .uv2(light)
            .normal(normal)
//        if (world.random.nextInt(60) == 0) {
//            world.addParticle(MYCELIUM, x2.toDouble(), y1.toDouble(), z2.toDouble(), 0.0, 0.0, 0.0)
//        }
    }

    fun VertexConsumer.xyz(model: Matrix4f, vec: Vec3d, camera: Vec3d): VertexConsumer =
        this.xyz(model, (vec.x - camera.x).toFloat(), (vec.y - camera.y).toFloat(), (vec.z - camera.z).toFloat())

    fun VertexConsumer.normal(vec: Vec3d): VertexConsumer =
        this.normal(vec.x.toFloat(), vec.y.toFloat(), vec.z.toFloat())

    fun vec3d(num: Number) = vec3d(num, num, num)
    fun vec3d(x: Number, y: Number, z: Number) = Vec3d(x.toDouble(), y.toDouble(), z.toDouble())
}

