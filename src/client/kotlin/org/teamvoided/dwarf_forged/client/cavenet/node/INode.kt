package org.teamvoided.dwarf_forged.client.cavenet.node

import net.minecraft.client.world.ClientWorld
import net.minecraft.util.math.BlockPos

interface INode {
    fun shouldRender(): Boolean = true
    fun shouldTick(): Boolean
    fun tick(world: ClientWorld, pos: BlockPos)
}