package org.teamvoided.dwarf_forged.block.extra

import net.minecraft.block.Blocks
import net.minecraft.data.family.BlockFamily
import org.teamvoided.dwarf_forged.block.extra.FamilyType.BASE_BLOCK
import org.teamvoided.dwarf_forged.block.extra.FamilyType.CUT_BLOCK
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.util.addAndGet

object DFBlockFamilies {
    val BLOCK_FAMILIES = mutableListOf<BlockFamily>()
    val ISOLATED_BLOCK_FAMILIES = mutableListOf<BlockFamily>()

    val COPPER_BLOCK = BlockFamily.Builder(Blocks.COPPER_BLOCK)
        .slab(DFBlocks.COPPER_SLAB)
        .stairs(DFBlocks.COPPER_STAIRS)
        .wall(DFBlocks.COPPER_WALL)
        .group(BASE_BLOCK)
        .finalizeIsolated()

    val IRON_BLOCK = BlockFamily.Builder(Blocks.IRON_BLOCK)
        .slab(DFBlocks.IRON_SLAB)
        .stairs(DFBlocks.IRON_STAIRS)
        .wall(DFBlocks.IRON_WALL)
        .group(BASE_BLOCK)
        .finalizeIsolated()

    val CUT_IRON_BLOCK = BlockFamily.Builder(DFBlocks.CUT_IRON)
        .slab(DFBlocks.CUT_IRON_SLAB)
        .stairs(DFBlocks.CUT_IRON_STAIRS)
        .wall(DFBlocks.CUT_IRON_WALL)
        .group(CUT_BLOCK)
        .finalizeIsolated()

    fun init() = Unit

    private fun BlockFamily.Builder.finalize() = BLOCK_FAMILIES.addAndGet(this.build())
    private fun BlockFamily.Builder.finalizeIsolated() = ISOLATED_BLOCK_FAMILIES.addAndGet(this.build())

}

object FamilyType {
    val BASE_BLOCK = "base_block"
    val CUT_BLOCK = "cut_block"
}
