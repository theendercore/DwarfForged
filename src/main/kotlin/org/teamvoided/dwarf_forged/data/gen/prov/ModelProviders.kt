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
        DFBlocks.RUBY_DEEPSLATE_ORE,
        DFBlocks.SAPPHIRE_ORE,
        DFBlocks.SAPPHIRE_DEEPSLATE_ORE,
        DFBlocks.KYANITE_ORE,
        DFBlocks.KYANITE_DEEPSLATE_ORE,
        DFBlocks.MOONSTONE_ORE,
        DFBlocks.MOONSTONE_DEEPSLATE_ORE,
        DFBlocks.JADE_ORE,
        DFBlocks.JADE_DEEPSLATE_ORE,
        DFBlocks.NETHER_SMOKY_QUARTZ_ORE,
        DFBlocks.EUCLASE_ORE,
        DFBlocks.EUCLASE_DEEPSLATE_ORE,
        DFBlocks.BORACITE_ORE,
        DFBlocks.BORACITE_DEEPSLATE_ORE,
        DFBlocks.TOPAZ_ORE,
        DFBlocks.TOPAZ_DEEPSLATE_ORE,
        DFBlocks.TOURMALINE_ORE,
        DFBlocks.TOURMALINE_DEEPSLATE_ORE,
        DFBlocks.SPINEL_ORE,
        DFBlocks.SPINEL_DEEPSLATE_ORE,
        DFBlocks.HEMATITE_ORE,
        DFBlocks.HEMATITE_DEEPSLATE_ORE,
        DFBlocks.CARNELIAN_ORE,
        DFBlocks.CARNELIAN_DEEPSLATE_ORE,
        DFBlocks.SILVER_ORE,
        DFBlocks.SILVER_DEEPSLATE_ORE,
        DFBlocks.COBALT_ORE,
        DFBlocks.COBALT_DEEPSLATE_ORE,
        DFBlocks.TUNGSTEN_ORE,
        DFBlocks.TUNGSTEN_DEEPSLATE_ORE,
        DFBlocks.IRIDIUM_ORE,
        DFBlocks.IRIDIUM_DEEPSLATE_ORE,
        DFBlocks.THALLIUM_ORE,
        DFBlocks.THALLIUM_DEEPSLATE_ORE,
        DFBlocks.BISMUTH_ORE,
        DFBlocks.BISMUTH_DEEPSLATE_ORE,
        DFBlocks.PLUTONIUM_ORE,
        DFBlocks.PLUTONIUM_DEEPSLATE_ORE,
        DFBlocks.URANIUM_ORE,
        DFBlocks.URANIUM_DEEPSLATE_ORE,
        DFBlocks.EINSTEINIUM_ORE,
        DFBlocks.EINSTEINIUM_DEEPSLATE_ORE,
        DFBlocks.LEAD_ORE,
        DFBlocks.LEAD_DEEPSLATE_ORE,
        DFBlocks.TIN_ORE,
        DFBlocks.TIN_DEEPSLATE_ORE,
        DFBlocks.PALLADIUM_ORE,
        DFBlocks.PALLADIUM_DEEPSLATE_ORE,
        DFBlocks.ZINC_ORE,
        DFBlocks.ZINC_DEEPSLATE_ORE,
        DFBlocks.NICKEL_ORE,
        DFBlocks.NICKEL_DEEPSLATE_ORE,
        DFBlocks.ALUMINIUM_ORE,
        DFBlocks.ALUMINIUM_DEEPSLATE_ORE,
        DFBlocks.PLATINUM_ORE,
        DFBlocks.PLATINUM_DEEPSLATE_ORE,
        DFBlocks.TITANIUM_ORE,
        DFBlocks.TITANIUM_DEEPSLATE_ORE,
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