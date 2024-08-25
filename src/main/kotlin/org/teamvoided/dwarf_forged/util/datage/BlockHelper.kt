@file:Suppress("unused")

package org.teamvoided.dwarf_forged.util.datage

import net.minecraft.block.AbstractBlock.Settings.copy
import net.minecraft.block.Block
import net.minecraft.block.SlabBlock
import net.minecraft.block.StairsBlock
import net.minecraft.block.WallBlock

val CUTOUT_BLOCKS = mutableSetOf<Block>()

val SWORD_MINEABLE = mutableSetOf<Block>()
val PICKAXE_MINEABLE = mutableSetOf<Block>()
val AXE_MINEABLE = mutableSetOf<Block>()
val SHOVEL_MINEABLE = mutableSetOf<Block>()
val HOE_MINEABLE = mutableSetOf<Block>()

val STAIRS = mutableSetOf<Block>()
val SLABS = mutableSetOf<Block>()
val WALLS = mutableSetOf<Block>()

val NEEDS_STONE = mutableSetOf<Block>()
val NEEDS_IRON = mutableSetOf<Block>()
val NEEDS_DIAMOND = mutableSetOf<Block>()

val SILK_TOUCH_OR_NOTHING = mutableSetOf<Block>()

fun Block.cutout(): Block {
    CUTOUT_BLOCKS.add(this)
    return this
}

fun Block.sword(): Block {
    SWORD_MINEABLE.add(this)
    return this
}

fun Block.pickaxe(): Block {
    PICKAXE_MINEABLE.add(this)
    return this
}

fun Block.axe(): Block {
    AXE_MINEABLE.add(this)
    return this
}

fun Block.shovel(): Block {
    SHOVEL_MINEABLE.add(this)
    return this
}

fun Block.hoe(): Block {
    HOE_MINEABLE.add(this)
    return this
}

fun Block.needsStone(): Block {
    NEEDS_STONE.add(this)
    return this
}

fun Block.needsIron(): Block {
    NEEDS_IRON.add(this)
    return this
}

fun Block.needsDiamond(): Block {
    NEEDS_DIAMOND.add(this)
    return this
}

fun Block.silkTouchOrNothing(): Block {
    SILK_TOUCH_OR_NOTHING.add(this)
    return this
}

fun Block.toStair(): Block {
    val block = StairsBlock(this.defaultState, copy(this))
    STAIRS.add(block)
    return block
}

fun Block.toSlab(): Block {
    val block = SlabBlock(copy(this))
    SLABS.add(block)
    return block
}

fun Block.toWall(): Block {
    val block = WallBlock(copy(this))
    WALLS.add(block)
    return block
}