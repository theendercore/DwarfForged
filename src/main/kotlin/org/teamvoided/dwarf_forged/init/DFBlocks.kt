package org.teamvoided.dwarf_forged.init

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.util.register

object DFBlocks {
    fun init() {}

    // --- --- --- GEMS --- --- ---

    val RUBY_ORE = register("ruby_ore", Block(copy(Blocks.EMERALD_ORE)))
    val RUBY_DEEPSLATE_ORE = register("ruby_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val SAPPHIRE_ORE = register("sapphire_ore", Block(copy(Blocks.EMERALD_ORE)))
    val SAPPHIRE_DEEPSLATE_ORE = register("sapphire_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val KYANITE_ORE = register("kyanite_ore", Block(copy(Blocks.EMERALD_ORE)))
    val KYANITE_DEEPSLATE_ORE = register("kyanite_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val MOONSTONE_ORE = register("moonstone_ore", Block(copy(Blocks.EMERALD_ORE)))
    val MOONSTONE_DEEPSLATE_ORE = register("moonstone_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val JADE_ORE = register("jade_ore", Block(copy(Blocks.EMERALD_ORE)))
    val JADE_DEEPSLATE_ORE = register("jade_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val NETHER_SMOKY_QUARTZ_ORE = register("nether_smoky_quartz_ore", Block(copy(Blocks.NETHER_QUARTZ_ORE)))

    val EUCLASE_ORE = register("euclase_ore", Block(copy(Blocks.EMERALD_ORE)))
    val EUCLASE_DEEPSLATE_ORE = register("euclase_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val BORACITE_ORE = register("boracite_ore", Block(copy(Blocks.EMERALD_ORE)))
    val BORACITE_DEEPSLATE_ORE = register("boracite_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val TOPAZ_ORE = register("topaz_ore", Block(copy(Blocks.EMERALD_ORE)))
    val TOPAZ_DEEPSLATE_ORE = register("topaz_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val TOURMALINE_ORE = register("tourmaline_ore", Block(copy(Blocks.EMERALD_ORE)))
    val TOURMALINE_DEEPSLATE_ORE = register("tourmaline_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val SPINEL_ORE = register("spinel_ore", Block(copy(Blocks.EMERALD_ORE)))
    val SPINEL_DEEPSLATE_ORE = register("spinel_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val HEMATITE_ORE = register("hematite_ore", Block(copy(Blocks.EMERALD_ORE)))
    val HEMATITE_DEEPSLATE_ORE = register("hematite_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val CARNELIAN_ORE = register("carnelian_ore", Block(copy(Blocks.EMERALD_ORE)))
    val CARNELIAN_DEEPSLATE_ORE = register("carnelian_deepslate_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    // --- --- --- METALS --- --- ---

    val SILVER_ORE = register("silver_ore", Block(copy(Blocks.IRON_ORE)))
    val SILVER_DEEPSLATE_ORE = register("silver_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val COBALT_ORE = register("cobalt_ore", Block(copy(Blocks.IRON_ORE)))
    val COBALT_DEEPSLATE_ORE = register("cobalt_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val TUNGSTEN_ORE = register("tungsten_ore", Block(copy(Blocks.IRON_ORE)))
    val TUNGSTEN_DEEPSLATE_ORE = register("tungsten_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val IRIDIUM_ORE = register("iridium_ore", Block(copy(Blocks.IRON_ORE)))
    val IRIDIUM_DEEPSLATE_ORE = register("iridium_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val THALLIUM_ORE = register("thallium_ore", Block(copy(Blocks.IRON_ORE)))
    val THALLIUM_DEEPSLATE_ORE = register("thallium_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val BISMUTH_ORE = register("bismuth_ore", Block(copy(Blocks.IRON_ORE)))
    val BISMUTH_DEEPSLATE_ORE = register("bismuth_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val PLUTONIUM_ORE = register("plutonium_ore", Block(copy(Blocks.IRON_ORE)))
    val PLUTONIUM_DEEPSLATE_ORE = register("plutonium_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val URANIUM_ORE = register("uranium_ore", Block(copy(Blocks.IRON_ORE)))
    val URANIUM_DEEPSLATE_ORE = register("uranium_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val EINSTEINIUM_ORE = register("einsteinium_ore", Block(copy(Blocks.IRON_ORE)))
    val EINSTEINIUM_DEEPSLATE_ORE = register("einsteinium_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val LEAD_ORE = register("lead_ore", Block(copy(Blocks.IRON_ORE)))
    val LEAD_DEEPSLATE_ORE = register("lead_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val TIN_ORE = register("tin_ore", Block(copy(Blocks.IRON_ORE)))
    val TIN_DEEPSLATE_ORE = register("tin_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val PALLADIUM_ORE = register("palladium_ore", Block(copy(Blocks.IRON_ORE)))
    val PALLADIUM_DEEPSLATE_ORE = register("palladium_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val ZINC_ORE = register("zinc_ore", Block(copy(Blocks.IRON_ORE)))
    val ZINC_DEEPSLATE_ORE = register("zinc_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val NICKEL_ORE = register("nickel_ore", Block(copy(Blocks.IRON_ORE)))
    val NICKEL_DEEPSLATE_ORE = register("nickel_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val ALUMINIUM_ORE = register("aluminium_ore", Block(copy(Blocks.IRON_ORE)))
    val ALUMINIUM_DEEPSLATE_ORE = register("aluminium_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val PLATINUM_ORE = register("platinum_ore", Block(copy(Blocks.IRON_ORE)))
    val PLATINUM_DEEPSLATE_ORE = register("platinum_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val TITANIUM_ORE = register("titanium_ore", Block(copy(Blocks.IRON_ORE)))
    val TITANIUM_DEEPSLATE_ORE = register("titanium_deepslate_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    // --- --- --- ROCKS --- --- ---

    val PUMICE = register("pumice", Block(copy(Blocks.STONE)))
    val MARBLE = register("marble", Block(copy(Blocks.STONE)))
    val TEKTITE = register("tektite", Block(copy(Blocks.STONE)))
    val TERRARIA_BLUE_GRANITE = register("terraria_blue_granite", Block(copy(Blocks.STONE)))
    val BLAIRMORITE = register("blairmorite", Block(copy(Blocks.STONE)))
    val PYROXENITE = register("pyroxenite", Block(copy(Blocks.STONE)))
    val ARGILLITE = register("argillite", Block(copy(Blocks.STONE)))
    val CLAYSTONE = register("claystone", Block(copy(Blocks.STONE)))
    val BLUE_SCHIST = register("blue_schist", Block(copy(Blocks.STONE)))
    val VARIOLITE = register("variolite", Block(copy(Blocks.STONE)))

    // --- --- --- CRYSTALS --- --- ---

    val BLUE_SKY_BLOCK = register("blue_sky_block", Block(copy(Blocks.AMETHYST_BLOCK)))
    val BUDDING_BLUE_SKY = register("budding_blue_sky", Block(copy(Blocks.BUDDING_AMETHYST)))
    val BLUE_SKY_CRYSTAL = register("blue_sky_cluster", Block(copy(Blocks.AMETHYST_CLUSTER)))
    val LARGE_BLUE_SKY_BUD = register("large_blue_sky_bud", Block(copy(Blocks.LARGE_AMETHYST_BUD)))
    val MEDIUM_BLUE_SKY_BUD = register("medium_blue_sky_bud", Block(copy(Blocks.MEDIUM_AMETHYST_BUD)))
    val SMALL_BLUE_SKY_BUD = register("small_blue_sky_bud", Block(copy(Blocks.SMALL_AMETHYST_BUD)))

    val citrine_block = register("citrine_block", Block(copy(Blocks.AMETHYST_BLOCK)))
    val budding_citrine = register("budding_citrine", Block(copy(Blocks.BUDDING_AMETHYST)))
    val citrine_crystal = register("citrine_cluster", Block(copy(Blocks.AMETHYST_CLUSTER)))
    val large_citrine_bud = register("large_citrine_bud", Block(copy(Blocks.LARGE_AMETHYST_BUD)))
    val medium_citrine_bud = register("medium_citrine_bud", Block(copy(Blocks.MEDIUM_AMETHYST_BUD)))
    val small_citrine_bud = register("small_citrine_bud", Block(copy(Blocks.SMALL_AMETHYST_BUD)))


    fun copy(block: Block): AbstractBlock.Settings = AbstractBlock.Settings.copy(block)

    private fun <T : Block> register(name: String, block: T): Block {
        val blockReg = registerNoItem(name, block)
        DFItems.register(name, BlockItem(blockReg, Item.Settings()))
        return blockReg
    }

    private fun <T : Block> registerNoItem(name: String, item: T): Block = Registries.BLOCK.register(name, item)

}