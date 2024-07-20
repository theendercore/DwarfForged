package org.teamvoided.dwarf_forged.init

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.block.*
import org.teamvoided.dwarf_forged.util.register

object DFBlocks {
    fun init() {}

    // --- --- --- GEMS --- --- ---

    val RUBY_ORE = register("ruby_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_RUBY_ORE = register("deepslate_ruby_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val SAPPHIRE_ORE = register("sapphire_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_SAPPHIRE_ORE = register("deepslate_sapphire_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val KYANITE_ORE = register("kyanite_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_KYANITE_ORE = register("deepslate_kyanite_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val MOONSTONE_ORE = register("moonstone_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_MOONSTONE_ORE = register("deepslate_moonstone_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val JADE_ORE = register("jade_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_JADE_ORE = register("deepslate_jade_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val NETHER_SMOKY_QUARTZ_ORE = register("nether_smoky_quartz_ore", Block(copy(Blocks.NETHER_QUARTZ_ORE)))

    val EUCLASE_ORE = register("euclase_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_EUCLASE_ORE = register("deepslate_euclase_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val BORACITE_ORE = register("boracite_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_BORACITE_ORE = register("deepslate_boracite_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val TOPAZ_ORE = register("topaz_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_TOPAZ_ORE = register("deepslate_topaz_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val TOURMALINE_ORE = register("tourmaline_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_TOURMALINE_ORE = register("deepslate_tourmaline_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val SPINEL_ORE = register("spinel_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_SPINEL_ORE = register("deepslate_spinel_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val HEMATITE_ORE = register("hematite_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_HEMATITE_ORE = register("deepslate_hematite_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    val CARNELIAN_ORE = register("carnelian_ore", Block(copy(Blocks.EMERALD_ORE)))
    val DEEPSLATE_CARNELIAN_ORE = register("deepslate_carnelian_ore", Block(copy(Blocks.DEEPSLATE_EMERALD_ORE)))

    // --- --- --- METALS --- --- ---

    val SILVER_ORE = register("silver_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val COBALT_ORE = register("cobalt_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_COBALT_ORE = register("deepslate_cobalt_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val TUNGSTEN_ORE = register("tungsten_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_TUNGSTEN_ORE = register("deepslate_tungsten_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val IRIDIUM_ORE = register("iridium_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_IRIDIUM_ORE = register("deepslate_iridium_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val THALLIUM_ORE = register("thallium_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_THALLIUM_ORE = register("deepslate_thallium_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val BISMUTH_ORE = register("bismuth_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_BISMUTH_ORE = register("deepslate_bismuth_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val PLUTONIUM_ORE = register("plutonium_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_PLUTONIUM_ORE = register("deepslate_plutonium_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val URANIUM_ORE = register("uranium_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_URANIUM_ORE = register("deepslate_uranium_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val EINSTEINIUM_ORE = register("einsteinium_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_EINSTEINIUM_ORE = register("deepslate_einsteinium_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val LEAD_ORE = register("lead_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val TIN_ORE = register("tin_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val PALLADIUM_ORE = register("palladium_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_PALLADIUM_ORE = register("deepslate_palladium_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val ZINC_ORE = register("zinc_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_ZINC_ORE = register("deepslate_zinc_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val NICKEL_ORE = register("nickel_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_NICKEL_ORE = register("deepslate_nickel_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val ALUMINIUM_ORE = register("aluminium_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_ALUMINIUM_ORE = register("deepslate_aluminium_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val PLATINUM_ORE = register("platinum_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_PLATINUM_ORE = register("deepslate_platinum_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

    val TITANIUM_ORE = register("titanium_ore", Block(copy(Blocks.IRON_ORE)))
    val DEEPSLATE_TITANIUM_ORE = register("deepslate_titanium_ore", Block(copy(Blocks.DEEPSLATE_IRON_ORE)))

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
    val COBBLED_BLUE_SCHIST = register("cobbled_blue_schist", Block(copy(Blocks.STONE)))
    val VARIOLITE = register("variolite", Block(copy(Blocks.STONE)))

    // --- --- --- CRYSTALS --- --- ---

    val BLUE_SKY_BLOCK = register("blue_sky_block", Block(copy(Blocks.AMETHYST_BLOCK)))
    val BLUE_SKY_CRYSTAL = register("blue_sky_cluster", CrystalClusterBlock(copy(Blocks.AMETHYST_CLUSTER)))
    val LARGE_BLUE_SKY_BUD = register("large_blue_sky_bud", LargeCrystalBudBlock(copy(Blocks.LARGE_AMETHYST_BUD)))
    val MEDIUM_BLUE_SKY_BUD = register("medium_blue_sky_bud", MediumCrystalBudBlock(copy(Blocks.MEDIUM_AMETHYST_BUD)))
    val SMALL_BLUE_SKY_BUD = register("small_blue_sky_bud", SmallCrystalBudBlock(copy(Blocks.SMALL_AMETHYST_BUD)))
    val BUDDING_BLUE_SKY = register(
        "budding_blue_sky", BuddingCrystalBlock(
            copy(Blocks.BUDDING_AMETHYST),
            listOf(SMALL_BLUE_SKY_BUD, MEDIUM_BLUE_SKY_BUD, LARGE_BLUE_SKY_BUD, BLUE_SKY_CRYSTAL)
        )
    )

    val CITRINE_BLOCK = register("citrine_block", Block(copy(Blocks.AMETHYST_BLOCK)))
    val CITRINE_CRYSTAL = register("citrine_cluster", CrystalClusterBlock(copy(Blocks.AMETHYST_CLUSTER)))
    val LARGE_CITRINE_BUD = register("large_citrine_bud", LargeCrystalBudBlock(copy(Blocks.LARGE_AMETHYST_BUD)))
    val MEDIUM_CITRINE_BUD = register("medium_citrine_bud", MediumCrystalBudBlock(copy(Blocks.MEDIUM_AMETHYST_BUD)))
    val SMALL_CITRINE_BUD = register("small_citrine_bud", SmallCrystalBudBlock(copy(Blocks.SMALL_AMETHYST_BUD)))
    val BUDDING_CITRINE = register(
        "budding_citrine", BuddingCrystalBlock(
            copy(Blocks.BUDDING_AMETHYST),
            listOf(SMALL_CITRINE_BUD, MEDIUM_CITRINE_BUD, LARGE_CITRINE_BUD, CITRINE_CRYSTAL)
        )
    )

    fun copy(block: Block): AbstractBlock.Settings = AbstractBlock.Settings.copy(block)

    private fun <T : Block> register(name: String, block: T): Block {
        val blockReg = registerNoItem(name, block)
        DFItems.register(name, BlockItem(blockReg, Item.Settings()))
        return blockReg
    }

    private fun <T : Block> registerNoItem(name: String, item: T): Block = Registries.BLOCK.register(name, item)

}