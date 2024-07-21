package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Holder
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.DwarfForged.MODID
import org.teamvoided.dwarf_forged.DwarfForged.isDev
import org.teamvoided.dwarf_forged.util.addItems
import org.teamvoided.dwarf_forged.util.registerHolder
import org.teamvoided.dwarf_forged.util.text

object DFTabs {
    fun init() {}
    val DF_TAB = register("dwarf_forged",
        FabricItemGroup.builder()
            .icon { DFItems.BLUE_SKY_SHARD.defaultStack }
            .name("itemGroup.$MODID.dwarfForged".text())
            .entries { _, entries ->
                if (isDev()) {
                    entries.addStacks(DFItems.tabItems.map { it.defaultStack })
                } else {
                    entries.addItems(
                        // Gems
                        DFBlocks.RUBY_ORE,
                        DFBlocks.DEEPSLATE_RUBY_ORE,
                        DFBlocks.RUBY_BLOCK,
                        DFItems.RUBY,

                        DFBlocks.SAPPHIRE_ORE,
                        DFBlocks.DEEPSLATE_SAPPHIRE_ORE,
                        DFBlocks.SAPPHIRE_BLOCK,
                        DFItems.SAPPHIRE,

                        DFBlocks.KYANITE_ORE,
                        DFBlocks.DEEPSLATE_KYANITE_ORE,
                        DFBlocks.KYANITE_BLOCK,
                        DFItems.KYANITE,

                        DFBlocks.MOONSTONE_ORE,
                        DFBlocks.DEEPSLATE_MOONSTONE_ORE,
                        DFBlocks.MOONSTONE_BLOCK,
                        DFItems.MOONSTONE,

                        DFBlocks.JADE_ORE,
                        DFBlocks.DEEPSLATE_JADE_ORE,
                        DFBlocks.JADE_BLOCK,
                        DFItems.JADE,

                        DFBlocks.EUCLASE_ORE,
                        DFBlocks.DEEPSLATE_EUCLASE_ORE,
                        DFBlocks.EUCLASE_BLOCK,
                        DFItems.EUCLASE,

                        DFBlocks.BORACITE_ORE,
                        DFBlocks.DEEPSLATE_BORACITE_ORE,
                        DFBlocks.BORACITE_BLOCK,
                        DFItems.BORACITE,

                        DFBlocks.TOPAZ_ORE,
                        DFBlocks.DEEPSLATE_TOPAZ_ORE,
                        DFBlocks.TOPAZ_BLOCK,
                        DFItems.TOPAZ,

                        DFBlocks.TOURMALINE_ORE,
                        DFBlocks.DEEPSLATE_TOURMALINE_ORE,
                        DFBlocks.TOURMALINE_BLOCK,
                        DFItems.TOURMALINE,

                        DFBlocks.SPINEL_ORE,
                        DFBlocks.DEEPSLATE_SPINEL_ORE,
                        DFBlocks.SPINEL_BLOCK,
                        DFItems.SPINEL,

                        DFBlocks.HEMATITE_ORE,
                        DFBlocks.DEEPSLATE_HEMATITE_ORE,
                        DFBlocks.HEMATITE_BLOCK,
                        DFItems.HEMATITE,

                        DFBlocks.CARNELIAN_ORE,
                        DFBlocks.DEEPSLATE_CARNELIAN_ORE,
                        DFBlocks.CARNELIAN_BLOCK,
                        DFItems.CARNELIAN,

                        DFBlocks.NETHER_SMOKY_QUARTZ_ORE,
                        DFBlocks.SMOKY_QUARTZ_BLOCK,
                        DFItems.SMOKY_QUARTZ,

                        // Crystals
                        DFBlocks.BLUE_SKY_BLOCK,
                        DFBlocks.BUDDING_BLUE_SKY,
                        DFBlocks.BLUE_SKY_CRYSTAL,
                        DFBlocks.LARGE_BLUE_SKY_BUD,
                        DFBlocks.MEDIUM_BLUE_SKY_BUD,
                        DFBlocks.SMALL_BLUE_SKY_BUD,
                        DFItems.BLUE_SKY_SHARD,

                        DFBlocks.CITRINE_BLOCK,
                        DFBlocks.BUDDING_CITRINE,
                        DFBlocks.CITRINE_CRYSTAL,
                        DFBlocks.LARGE_CITRINE_BUD,
                        DFBlocks.MEDIUM_CITRINE_BUD,
                        DFBlocks.SMALL_CITRINE_BUD,
                        DFItems.CITRINE_SHARD,

                        // Metals
                        DFBlocks.SILVER_ORE,
                        DFBlocks.DEEPSLATE_SILVER_ORE,
                        DFBlocks.RAW_SILVER_BLOCK,
                        DFItems.RAW_SILVER,
                        DFBlocks.SILVER_BLOCK,
                        DFItems.SILVER_INGOT,

                        DFBlocks.COBALT_ORE,
                        DFBlocks.DEEPSLATE_COBALT_ORE,
                        DFBlocks.RAW_COBALT_BLOCK,
                        DFItems.RAW_COBALT,

                        DFBlocks.TUNGSTEN_ORE,
                        DFBlocks.DEEPSLATE_TUNGSTEN_ORE,
                        DFBlocks.RAW_TUNGSTEN_BLOCK,
                        DFItems.RAW_TUNGSTEN,

                        DFBlocks.IRIDIUM_ORE,
                        DFBlocks.DEEPSLATE_IRIDIUM_ORE,
                        DFBlocks.RAW_IRIDIUM_BLOCK,
                        DFItems.RAW_IRIDIUM,

                        DFBlocks.THALLIUM_ORE,
                        DFBlocks.DEEPSLATE_THALLIUM_ORE,
                        DFBlocks.RAW_THALLIUM_BLOCK,
                        DFItems.RAW_THALLIUM,

                        DFBlocks.BISMUTH_ORE,
                        DFBlocks.DEEPSLATE_BISMUTH_ORE,
                        DFBlocks.RAW_BISMUTH_BLOCK,
                        DFItems.RAW_BISMUTH,

                        DFBlocks.PLUTONIUM_ORE,
                        DFBlocks.DEEPSLATE_PLUTONIUM_ORE,
                        DFBlocks.RAW_PLUTONIUM_BLOCK,
                        DFItems.RAW_PLUTONIUM,

                        DFBlocks.URANIUM_ORE,
                        DFBlocks.DEEPSLATE_URANIUM_ORE,
                        DFBlocks.RAW_URANIUM_BLOCK,
                        DFItems.RAW_URANIUM,

                        DFBlocks.LEAD_ORE,
                        DFBlocks.DEEPSLATE_LEAD_ORE,
                        DFBlocks.RAW_LEAD_BLOCK,
                        DFItems.RAW_LEAD,

                        DFBlocks.TIN_ORE,
                        DFBlocks.DEEPSLATE_TIN_ORE,
                        DFBlocks.RAW_TIN_BLOCK,
                        DFItems.RAW_TIN,

                        DFBlocks.PALLADIUM_ORE,
                        DFBlocks.DEEPSLATE_PALLADIUM_ORE,
                        DFBlocks.RAW_PALLADIUM_BLOCK,
                        DFItems.RAW_PALLADIUM,

                        DFBlocks.ZINC_ORE,
                        DFBlocks.DEEPSLATE_ZINC_ORE,
                        DFBlocks.RAW_ZINC_BLOCK,
                        DFItems.RAW_ZINC,

                        DFBlocks.NICKEL_ORE,
                        DFBlocks.DEEPSLATE_NICKEL_ORE,
                        DFBlocks.RAW_NICKEL_BLOCK,
                        DFItems.RAW_NICKEL,

                        DFBlocks.ALUMINIUM_ORE,
                        DFBlocks.DEEPSLATE_ALUMINIUM_ORE,
                        DFBlocks.RAW_ALUMINIUM_BLOCK,
                        DFItems.RAW_ALUMINIUM,

                        DFBlocks.PLATINUM_ORE,
                        DFBlocks.DEEPSLATE_PLATINUM_ORE,
                        DFBlocks.RAW_PLATINUM_BLOCK,
                        DFItems.RAW_PLATINUM,

                        DFBlocks.TITANIUM_ORE,
                        DFBlocks.DEEPSLATE_TITANIUM_ORE,
                        DFBlocks.RAW_TITANIUM_BLOCK,
                        DFItems.RAW_TITANIUM,

                        // Human ores
                        DFBlocks.EINSTEINIUM_ORE,
                        DFBlocks.DEEPSLATE_EINSTEINIUM_ORE,
                        DFBlocks.RAW_EINSTEINIUM_BLOCK,
                        DFItems.RAW_EINSTEINIUM,

                        DFBlocks.ASTRALITE_ORE,
                        DFBlocks.DEEPSLATE_ASTRALITE_ORE,
                        DFBlocks.RAW_ASTRALITE_BLOCK,
                        DFItems.RAW_ASTRALITE,
                        DFBlocks.ASTRALITE_BLOCK,
                        DFItems.ASTRALITE_INGOT,

                        DFBlocks.GRASS_ORE,
                        DFBlocks.DEEPSLATE_GRASS_ORE,
                        DFBlocks.RAW_GRASS_BLOCK,
                        DFItems.RAW_GRASS,
                    )
                }
            }
    )

    private fun register(name: String, builder: ItemGroup.Builder): Holder<ItemGroup> =
        Registries.ITEM_GROUP.registerHolder(name, builder.build())

}
