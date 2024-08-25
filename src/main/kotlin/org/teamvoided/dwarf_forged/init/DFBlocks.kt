package org.teamvoided.dwarf_forged.init

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.block.*
import org.teamvoided.dwarf_forged.util.BlockItem
import org.teamvoided.dwarf_forged.util.addAndGet
import org.teamvoided.dwarf_forged.util.datage.cutout
import org.teamvoided.dwarf_forged.util.datage.pickaxe
import org.teamvoided.dwarf_forged.util.datage.silkTouchOrNothing
import org.teamvoided.dwarf_forged.util.register

object DFBlocks {
    val BLOCKS = mutableSetOf<Block>()

    // Rocks
    val ORBITAL_GRANITE = register("orbital_granite", Block(copy(Blocks.STONE))).pickaxe()
    val MUDROCK = register("mudrock", Block(copy(Blocks.STONE))).pickaxe()

    // Blue Sky
    val BLUE_SKY_BLOCK = register("blue_sky_block", Block(copy(Blocks.AMETHYST_BLOCK))).pickaxe()
    val BLUE_SKY_CLUSTER = register("blue_sky_cluster", CrystalClusterBlock(copy(Blocks.AMETHYST_CLUSTER)))
        .pickaxe().cutout()
    val LARGE_BLUE_SKY_BUD = register("large_blue_sky_bud", LargeCrystalBudBlock(copy(Blocks.LARGE_AMETHYST_BUD)))
        .pickaxe().silkTouchOrNothing().cutout()
    val MEDIUM_BLUE_SKY_BUD = register("medium_blue_sky_bud", MediumCrystalBudBlock(copy(Blocks.MEDIUM_AMETHYST_BUD)))
        .pickaxe().silkTouchOrNothing().cutout()
    val SMALL_BLUE_SKY_BUD = register("small_blue_sky_bud", SmallCrystalBudBlock(copy(Blocks.SMALL_AMETHYST_BUD)))
        .pickaxe().silkTouchOrNothing().cutout()
    val BUDDING_BLUE_SKY = register(
        "budding_blue_sky", BuddingCrystalBlock(
            copy(Blocks.BUDDING_AMETHYST),
            listOf(SMALL_BLUE_SKY_BUD, MEDIUM_BLUE_SKY_BUD, LARGE_BLUE_SKY_BUD, BLUE_SKY_CLUSTER)
        )
    ).pickaxe()

    fun init() = Unit


    fun copy(block: Block): AbstractBlock.Settings = AbstractBlock.Settings.copy(block)

    fun <T : Block> register(name: String, block: T): Block {
        val blockReg = registerNoItem(name, block)
        DFItems.register(name, BlockItem(blockReg))
        return blockReg
    }

    private fun <T : Block> registerNoItem(name: String, item: T): Block =
        BLOCKS.addAndGet(Registries.BLOCK.register(name, item))

}