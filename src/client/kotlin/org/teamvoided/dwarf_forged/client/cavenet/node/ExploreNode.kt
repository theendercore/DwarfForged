package org.teamvoided.dwarf_forged.client.cavenet.node

import net.minecraft.client.world.ClientWorld
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import org.teamvoided.dwarf_forged.client.cavenet.CNLogic.canNodeExplore
import org.teamvoided.dwarf_forged.client.cavenet.CaveNet

class ExploreNode(var state: ExploreState = ExploreState.EXPLORING) : INode {
    override fun shouldTick(): Boolean = state != ExploreState.INACTIVE
    override fun tick(world: ClientWorld, pos: BlockPos) {
        if (!canNodeExplore(world, pos)) {
            CaveNet.nodes.remove(pos)
            return
        }
        when (state) {
            ExploreState.EXPLORING -> {
                for (dir in Direction.entries) {
                    val sidePos = pos.offset(dir)
                    if (!canNodeExplore(world, sidePos)) continue
                    val node = CaveNet.nodes[sidePos]
                    if (node is DoorNode && node.direction == dir.opposite) continue
                    if (node is ExploreNode) continue

                    CaveNet.nodes[sidePos] = ExploreNode()
                    return
                }
                state = ExploreState.INACTIVE
            }

            ExploreState.DELETING -> {
            }

            ExploreState.INACTIVE -> Unit
        }
    }

//    override fun shouldRender(): Boolean = false

    companion object {
        enum class ExploreState {
            EXPLORING,
            INACTIVE,
            DELETING
        }
    }
}