package org.teamvoided.dwarf_forged.client.cavenet

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.minecraft.client.world.ClientWorld
import net.minecraft.util.math.BlockPos
import org.teamvoided.dwarf_forged.client.cavenet.CaveNet.TicksPerTick

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
            if (ticks && node.shouldTick()) {
                node.tick(world, pos)
            }
        }

    }
}
