package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.block.Blocks
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.model.BlockStateModelGenerator
import net.minecraft.data.client.model.Models
import net.minecraft.data.family.BlockFamily
import org.teamvoided.dwarf_forged.block.extra.DFBlockFamilies.BLOCK_FAMILIES
import org.teamvoided.dwarf_forged.block.extra.DFBlockFamilies.ISOLATED_BLOCK_FAMILIES
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.init.DFItems
import org.teamvoided.dwarf_forged.util.datage.registerIsolatedBlockFamily
import org.teamvoided.dwarf_forged.util.datage.wallOffset

class ModelProviders(o: FabricDataOutput) : FabricModelProvider(o) {
    private val crystals = listOf(
        DFBlocks.BLUE_SKY_CLUSTER,
        DFBlocks.LARGE_BLUE_SKY_BUD,
        DFBlocks.MEDIUM_BLUE_SKY_BUD,
        DFBlocks.SMALL_BLUE_SKY_BUD
    )

    val offsetWalls = listOf(
        DFBlocks.CUT_COPPER_WALL to Blocks.CUT_COPPER
    )

    val exclude =
        crystals + offsetWalls.map { it.first } + (ISOLATED_BLOCK_FAMILIES + BLOCK_FAMILIES).flatMap { fam -> fam.variants.values }

    override fun generateBlockStateModels(gen: BlockStateModelGenerator) {
//        BLOCK_FAMILIES.forEach(gen::registerCubeAllModelTexturePool)
        ISOLATED_BLOCK_FAMILIES.filter(BlockFamily::shouldGenerateModels).forEach(gen::registerIsolatedBlockFamily)

        offsetWalls.forEach { (block, base) -> gen.wallOffset(block, base) }

        DFBlocks.BLOCKS.filter { !exclude.contains(it) }.forEach(gen::registerSimpleCubeAll)

        crystals.forEach { gen.registerAmethyst(it); gen.registerItemModel(it) }
    }

    private val SINGLE_LAYER = listOf(
        DFItems.BLUE_SKY_SHARD,
        DFItems.COPPER_NUGGET
    )

    override fun generateItemModels(gen: ItemModelGenerator) {
        SINGLE_LAYER.forEach { gen.register(it, Models.SINGLE_LAYER_ITEM) }
    }
}