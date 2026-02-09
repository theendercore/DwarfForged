package org.teamvoided.dwarf_forged.client.cavenet.node

import net.minecraft.client.world.ClientWorld
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import org.teamvoided.dwarf_forged.client.cavenet.CNLogic.canNodeExplore
import org.teamvoided.dwarf_forged.client.cavenet.CaveNet

class DoorNode(val direction: Direction) : INode {
    var isActive = true

    override fun shouldTick(): Boolean = isActive

    override fun tick(world: ClientWorld, pos: BlockPos) {
        if (!canNodeExplore(world, pos)) {
            CaveNet.nodes.remove(pos)
            return
        }

        for (dir in Direction.entries) {
            if (dir == direction || dir == direction.opposite) continue

            val sidePos = pos.offset(dir)
            if (!canNodeExplore(world, sidePos)) continue
            if (CaveNet.nodes.contains(sidePos)) continue

            CaveNet.nodes[sidePos] = DoorNode(direction)
            return
        }

        // add ExploreNode
        val pointPos = pos.offset(direction)
        if (!canNodeExplore(world, pointPos)) return
        if (CaveNet.nodes.contains(pointPos)) return
        CaveNet.nodes[pointPos] = ExploreNode()
        isActive = false
    }
}