package org.teamvoided.dwarf_forged.block

import net.minecraft.block.AmethystClusterBlock
import net.minecraft.block.AmethystClusterBlock.FACING
import net.minecraft.block.AmethystClusterBlock.WATERLOGGED
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.BuddingAmethystBlock
import net.minecraft.fluid.Fluids
import net.minecraft.server.world.ServerWorld
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.random.RandomGenerator
import kotlin.jvm.optionals.getOrNull

class CrystalClusterBlock(settings: Settings) : AmethystClusterBlock(7.0f, 3.0f, settings)
class LargeCrystalBudBlock(settings: Settings) : AmethystClusterBlock(5.0f, 3.0f, settings)
class MediumCrystalBudBlock(settings: Settings) : AmethystClusterBlock(4.0f, 3.0f, settings)
class SmallCrystalBudBlock(settings: Settings) : AmethystClusterBlock(3.0f, 4.0f, settings)


open class BuddingCrystalBlock(settings: Settings, val budList: List<Block>, private val growthChance: Int = 5) :
    BuddingAmethystBlock(settings) {
    override fun randomTick(state: BlockState, world: ServerWorld, pos: BlockPos, random: RandomGenerator) {
        if (random.nextInt(growthChance) != 0) return

        val direction = Direction.random(random)
        val offsetPos = pos.offset(direction)
        val existingState = world.getBlockState(offsetPos)
        val block = getState(existingState, direction) ?: return

        val newState = block.defaultState
            .with(FACING, direction)
            .with(WATERLOGGED, existingState.fluidState.fluid == Fluids.WATER)
        world.setBlockState(offsetPos, newState)
    }

    open fun getState(existingState: BlockState, direction: Direction): Block? {
        if (canGrowIn(existingState)) return budList[0]
        if (existingState.getOrEmpty(FACING).getOrNull() != direction) return null
        if (!budList.contains(existingState.block)) return null

        val idx = budList.indexOf(existingState.block)
        if (idx != budList.lastIndex) {
            return budList[idx + 1]
        }

        return null
    }
}