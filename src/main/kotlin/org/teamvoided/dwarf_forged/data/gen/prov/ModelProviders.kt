package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.model.BlockStateModelGenerator
import net.minecraft.data.client.model.Models
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.init.DFItems
import org.teamvoided.dwarf_forged.util.DFBlockLists.CRYSTALS

class ModelProviders(o: FabricDataOutput) : FabricModelProvider(o) {
    private val CUBE_ALL = listOf(
        DFBlocks.RUBY_ORE,
        DFBlocks.DEEPSLATE_RUBY_ORE,
        DFBlocks.SAPPHIRE_ORE,
        DFBlocks.DEEPSLATE_SAPPHIRE_ORE,
        DFBlocks.KYANITE_ORE,
        DFBlocks.DEEPSLATE_KYANITE_ORE,
        DFBlocks.MOONSTONE_ORE,
        DFBlocks.DEEPSLATE_MOONSTONE_ORE,
        DFBlocks.JADE_ORE,
        DFBlocks.DEEPSLATE_JADE_ORE,
        DFBlocks.NETHER_SMOKY_QUARTZ_ORE,
        DFBlocks.EUCLASE_ORE,
        DFBlocks.DEEPSLATE_EUCLASE_ORE,
        DFBlocks.BORACITE_ORE,
        DFBlocks.DEEPSLATE_BORACITE_ORE,
        DFBlocks.TOPAZ_ORE,
        DFBlocks.DEEPSLATE_TOPAZ_ORE,
        DFBlocks.TOURMALINE_ORE,
        DFBlocks.DEEPSLATE_TOURMALINE_ORE,
        DFBlocks.SPINEL_ORE,
        DFBlocks.DEEPSLATE_SPINEL_ORE,
        DFBlocks.HEMATITE_ORE,
        DFBlocks.DEEPSLATE_HEMATITE_ORE,
        DFBlocks.CARNELIAN_ORE,
        DFBlocks.DEEPSLATE_CARNELIAN_ORE,
        DFBlocks.SILVER_ORE,
        DFBlocks.DEEPSLATE_SILVER_ORE,
        DFBlocks.COBALT_ORE,
        DFBlocks.DEEPSLATE_COBALT_ORE,
        DFBlocks.TUNGSTEN_ORE,
        DFBlocks.DEEPSLATE_TUNGSTEN_ORE,
        DFBlocks.IRIDIUM_ORE,
        DFBlocks.DEEPSLATE_IRIDIUM_ORE,
        DFBlocks.THALLIUM_ORE,
        DFBlocks.DEEPSLATE_THALLIUM_ORE,
        DFBlocks.BISMUTH_ORE,
        DFBlocks.DEEPSLATE_BISMUTH_ORE,
        DFBlocks.PLUTONIUM_ORE,
        DFBlocks.DEEPSLATE_PLUTONIUM_ORE,
        DFBlocks.URANIUM_ORE,
        DFBlocks.DEEPSLATE_URANIUM_ORE,
        DFBlocks.EINSTEINIUM_ORE,
        DFBlocks.DEEPSLATE_EINSTEINIUM_ORE,
        DFBlocks.LEAD_ORE,
        DFBlocks.DEEPSLATE_LEAD_ORE,
        DFBlocks.TIN_ORE,
        DFBlocks.DEEPSLATE_TIN_ORE,
        DFBlocks.PALLADIUM_ORE,
        DFBlocks.DEEPSLATE_PALLADIUM_ORE,
        DFBlocks.ZINC_ORE,
        DFBlocks.DEEPSLATE_ZINC_ORE,
        DFBlocks.NICKEL_ORE,
        DFBlocks.DEEPSLATE_NICKEL_ORE,
        DFBlocks.ALUMINIUM_ORE,
        DFBlocks.DEEPSLATE_ALUMINIUM_ORE,
        DFBlocks.PLATINUM_ORE,
        DFBlocks.DEEPSLATE_PLATINUM_ORE,
        DFBlocks.TITANIUM_ORE,
        DFBlocks.DEEPSLATE_TITANIUM_ORE,
        DFBlocks.PUMICE,
        DFBlocks.MARBLE,
        DFBlocks.TEKTITE,
        DFBlocks.TERRARIA_BLUE_GRANITE,
        DFBlocks.BLAIRMORITE,
        DFBlocks.PYROXENITE,
        DFBlocks.ARGILLITE,
        DFBlocks.CLAYSTONE,
        DFBlocks.BLUE_SCHIST,
        DFBlocks.VARIOLITE,
        DFBlocks.BLUE_SKY_BLOCK,
        DFBlocks.BUDDING_BLUE_SKY,
        DFBlocks.CITRINE_BLOCK,
        DFBlocks.BUDDING_CITRINE
    )

    override fun generateBlockStateModels(gen: BlockStateModelGenerator) {
        CUBE_ALL.forEach { gen.registerSimpleCubeAll(it) }
        CRYSTALS.forEach {
            gen.registerAmethyst(it)
            gen.registerItemModel(it)
        }
    }

    private val SINGLE_LAYER = listOf(
        DFItems.BLUE_SKY_SHARD,
        DFItems.CITRINE_SHARD,
    )

    override fun generateItemModels(gen: ItemModelGenerator) {
        SINGLE_LAYER.forEach { gen.register(it, Models.SINGLE_LAYER_ITEM) }
    }
}