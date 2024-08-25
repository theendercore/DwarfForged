package org.teamvoided.dwarf_forged.block.extra

import net.minecraft.block.Blocks
import net.minecraft.data.family.BlockFamily
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.util.addAndGet

object DFBlockFamilies {
    val BLOCK_FAMILIES = mutableListOf<BlockFamily>()
    val ISOLATED_BLOCK_FAMILIES = mutableListOf<BlockFamily>()

    val COPPER_BLOCK = BlockFamily.Builder(Blocks.COPPER_BLOCK)
        .slab(DFBlocks.COPPER_SLAB)
        .stairs(DFBlocks.COPPER_STAIRS)
        .wall(DFBlocks.COPPER_WALL)
        .group("fancy")
        .finalizeIsolated()


    fun init() = Unit

    private fun BlockFamily.Builder.finalize() = BLOCK_FAMILIES.addAndGet(this.build())
    private fun BlockFamily.Builder.finalizeIsolated() = ISOLATED_BLOCK_FAMILIES.addAndGet(this.build())
}
