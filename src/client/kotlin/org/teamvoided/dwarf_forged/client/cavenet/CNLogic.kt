package org.teamvoided.dwarf_forged.client.cavenet

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.minecraft.block.Blocks
import net.minecraft.client.world.ClientWorld
import net.minecraft.particle.BlockStateParticleEffect
import net.minecraft.particle.DustParticleEffect
import net.minecraft.particle.ParticleEffect
import net.minecraft.particle.ParticleTypes
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.MathHelper.lerp
import net.minecraft.util.math.Vec3d
import org.teamvoided.dwarf_forged.client.cavenet.CaveNet.TicksPerTick
import org.teamvoided.dwarf_forged.client.cavenet.node.DoorNode
import org.teamvoided.dwarf_forged.client.cavenet.node.ExploreNode
import org.teamvoided.dwarf_forged.client.cavenet.node.INode

object CNLogic {
    fun init() {
        ClientTickEvents.END_WORLD_TICK.register(::clientTick)
    }

    fun canNodeExplore(world: ClientWorld, pos: BlockPos): Boolean {
        return world.getBlockState(pos).isAir && !world.isSkyVisible(pos)
    }

    var tickCounter = 0

    fun clientTick(world: ClientWorld) {
        if (CaveNet.nodes.isEmpty()) return
        var ticks = true
        if (TicksPerTick > -1) {
            if (TicksPerTick == 0) ticks = false
            else {
                tickCounter++
                if (tickCounter >= TicksPerTick) tickCounter = 0
                else ticks = false
            }
        }

        for ((pos, node) in CaveNet.nodes.toList()) {
            if (node.shouldRender()) {
                renderNode(pos, node, world)
            }

            if (ticks && node.shouldTick()) {
                node.tick(world, pos)
            }
        }

    }

    private fun renderNode(
        nodePos: BlockPos,
        node: INode,
        world: ClientWorld,
    ) {
        val x1 = nodePos.x
        val y1 = nodePos.y
        val z1 = nodePos.z

        val x2 = nodePos.x + 1
        val y2 = nodePos.y + 1
        val z2 = nodePos.z + 1

        val centerColor = 0x7e_db_3e

        var nodeColor: Int? = null
        when (node) {
            is DoorNode -> {
//                nodeColor = 0x46_76_ca
                if (world.time % 80 == 0L) world.particle(
                    BlockStateParticleEffect(ParticleTypes.BLOCK_MARKER, Blocks.BLUE_STAINED_GLASS.defaultState),
                    x1 + 0.5, y1 + 0.5, z1 + 0.5
                )
                val dir = node.direction.vector
                repeat(4) {
                    val r = it / 4f
                    world.colorParticle(
                        0xff_00_00,
                        lerp(r, x1 + 0.5f, x1 + 0.5f + dir.x),
                        y1 + 0.5,
                        lerp(r, z1 + 0.5f, z1 + 0.5f + dir.z),
                    )
                }
            }

            is ExploreNode -> {
                world.colorParticle(0x7e_db_3e, x1 + 0.5, y1 + 0.5, z1 + 0.5)
            }

            else -> {
                world.particle(
                    BlockStateParticleEffect(ParticleTypes.BLOCK_MARKER, Blocks.BARRIER.defaultState),
                    x1 + 0.5, y1 + 0.5, z1 + 0.5
                )
            }

        }

        if (nodeColor != null) {
            world.particleCube(nodeColor, x1, y1, z1, y2, x2, z2)
        }
    }

    fun ClientWorld.particleCube(color: Int, x1: Int, y1: Int, z1: Int, y2: Int, x2: Int, z2: Int) {
        colorParticle(color, x1, y1, z1)
        colorParticle(color, x2, y1, z1)
        colorParticle(color, x2, y1, z2)
        colorParticle(color, x1, y1, z2)

        colorParticle(color, x1, y2, z1)
        colorParticle(color, x2, y2, z1)
        colorParticle(color, x2, y2, z2)
        colorParticle(color, x1, y2, z2)
    }

    fun ClientWorld.colorParticle(color: Int, x: Number, y: Number, z: Number) =
        particle(DustParticleEffect(Vec3d.unpackRgb(color).toVector3f(), 1.0F), x, y, z)

    fun ClientWorld.particle(type: ParticleEffect, x: Number, y: Number, z: Number) =
        addParticle(type, x.toDouble(), y.toDouble(), z.toDouble(), 0.0, 0.0, 0.0)
}
