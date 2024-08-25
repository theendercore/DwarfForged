package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.model.BlockStateModelGenerator
import net.minecraft.data.client.model.Models
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.init.DFItems

class ModelProviders(o: FabricDataOutput) : FabricModelProvider(o) {
    private val crystals = listOf(
        DFBlocks.BLUE_SKY_CLUSTER,
        DFBlocks.LARGE_BLUE_SKY_BUD,
        DFBlocks.MEDIUM_BLUE_SKY_BUD,
        DFBlocks.SMALL_BLUE_SKY_BUD
    )

    override fun generateBlockStateModels(gen: BlockStateModelGenerator) {
        DFBlocks.BLOCKS.forEach { gen.registerSimpleCubeAll(it) }
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