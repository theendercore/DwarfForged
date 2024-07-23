package org.teamvoided.dwarf_forged.data.gen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags
import net.minecraft.registry.HolderLookup
import org.teamvoided.dwarf_forged.data.tags.DFBlockTags
import org.teamvoided.dwarf_forged.data.tags.DFItemTags
import org.teamvoided.dwarf_forged.init.DFItems
import java.util.concurrent.CompletableFuture

class ItemTagProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>, p: BlockTagProvider) :
    FabricTagProvider.ItemTagProvider(o, r, p) {

    override fun configure(wrapperLookup: HolderLookup.Provider) {
        metaTags()
        gems()
        metals()
        humans()

        misc()

        conventionalTags()

        copyMetaTags()
        copyGemTags()
        copyMetalTags()
        copyHumanTags()

        copyConventionalTags()
    }

    private fun metaTags(){
        getOrCreateTagBuilder(DFItemTags.DWARF_FORGED_GEMS)
            .forceAddTag(DFItemTags.GEMS_RUBY)
            .forceAddTag(DFItemTags.GEMS_SAPPHIRE)
            .forceAddTag(DFItemTags.GEMS_KYANITE)
            .forceAddTag(DFItemTags.GEMS_MOONSTONE)
            .forceAddTag(DFItemTags.GEMS_JADE)
            .forceAddTag(DFItemTags.GEMS_SMOKY_QUARTZ)
            .forceAddTag(DFItemTags.GEMS_EUCLASE)
            .forceAddTag(DFItemTags.GEMS_BORACITE)
            .forceAddTag(DFItemTags.GEMS_TOPAZ)
            .forceAddTag(DFItemTags.GEMS_TOURMALINE)
            .forceAddTag(DFItemTags.GEMS_SPINEL)
            .forceAddTag(DFItemTags.GEMS_HEMATITE)
            .forceAddTag(DFItemTags.GEMS_CARNELIAN)

        getOrCreateTagBuilder(DFItemTags.DWARF_FORGED_INGOTS)
            .forceAddTag(DFItemTags.SILVER_INGOT)
            .forceAddTag(DFItemTags.ASTRALITE_INGOT)

        getOrCreateTagBuilder(DFItemTags.DWARF_FORGED_NUGGETS)
            .forceAddTag(DFItemTags.SILVER_NUGGETS)
            .forceAddTag(DFItemTags.ASTRALITE_NUGGETS)
            .forceAddTag(DFItemTags.COPPER_NUGGETS)
    }

    private fun gems() {
        getOrCreateTagBuilder(DFItemTags.GEMS_RUBY)
            .add(DFItems.RUBY)
        getOrCreateTagBuilder(DFItemTags.GEMS_SAPPHIRE)
            .add(DFItems.SAPPHIRE)
        getOrCreateTagBuilder(DFItemTags.GEMS_KYANITE)
            .add(DFItems.KYANITE)
        getOrCreateTagBuilder(DFItemTags.GEMS_MOONSTONE)
            .add(DFItems.MOONSTONE)
        getOrCreateTagBuilder(DFItemTags.GEMS_JADE)
            .add(DFItems.JADE)
        getOrCreateTagBuilder(DFItemTags.GEMS_SMOKY_QUARTZ)
            .add(DFItems.SMOKY_QUARTZ)
        getOrCreateTagBuilder(DFItemTags.GEMS_EUCLASE)
            .add(DFItems.EUCLASE)
        getOrCreateTagBuilder(DFItemTags.GEMS_BORACITE)
            .add(DFItems.BORACITE)
        getOrCreateTagBuilder(DFItemTags.GEMS_TOPAZ)
            .add(DFItems.TOPAZ)
        getOrCreateTagBuilder(DFItemTags.GEMS_TOURMALINE)
            .add(DFItems.TOURMALINE)
        getOrCreateTagBuilder(DFItemTags.GEMS_SPINEL)
            .add(DFItems.SPINEL)
        getOrCreateTagBuilder(DFItemTags.GEMS_HEMATITE)
            .add(DFItems.HEMATITE)
        getOrCreateTagBuilder(DFItemTags.GEMS_CARNELIAN)
            .add(DFItems.CARNELIAN)
    }

    private fun metals(){
        getOrCreateTagBuilder(DFItemTags.SILVER_INGOT)
            .add(DFItems.SILVER_INGOT)

        getOrCreateTagBuilder(DFItemTags.SILVER_NUGGETS)
            .add(DFItems.SILVER_NUGGET)

        getOrCreateTagBuilder(DFItemTags.COPPER_NUGGETS)
            .add(DFItems.COPPER_NUGGET)
    }

    private fun humans(){
        getOrCreateTagBuilder(DFItemTags.ASTRALITE_INGOT)
            .add(DFItems.ASTRALITE_INGOT)
        getOrCreateTagBuilder(DFItemTags.ASTRALITE_NUGGETS)
            .add(DFItems.ASTRALITE_NUGGET)

    }

    private fun misc(){
        getOrCreateTagBuilder(DFItemTags.COPPER_NUGGETS)
            .add(DFItems.COPPER_NUGGET)
    }

    private fun conventionalTags() {
        getOrCreateTagBuilder(ConventionalItemTags.GEMS)
            .forceAddTag(DFItemTags.DWARF_FORGED_ORES)
        getOrCreateTagBuilder(ConventionalItemTags.INGOTS)
            .forceAddTag(DFItemTags.DWARF_FORGED_INGOTS)
        getOrCreateTagBuilder(ConventionalItemTags.NUGGETS)
            .forceAddTag(DFItemTags.DWARF_FORGED_NUGGETS)

    }

    private fun copyMetaTags(){
        copy(DFBlockTags.DWARF_FORGED_ORES, DFItemTags.DWARF_FORGED_ORES)
        copy(DFBlockTags.DWARF_FORGED_STORAGE_BLOCKS, DFItemTags.DWARF_FORGED_STORAGE_BLOCKS)
    }

    private fun copyGemTags() {
        //Gem Ores
        copy(DFBlockTags.GEM_ORES, DFItemTags.GEM_ORES)

        copy(DFBlockTags.RUBY_ORES, DFItemTags.RUBY_ORES)
        copy(DFBlockTags.SAPPHIRE_ORES, DFItemTags.SAPPHIRE_ORES)
        copy(DFBlockTags.KYANITE_ORES, DFItemTags.KYANITE_ORES)
        copy(DFBlockTags.MOONSTONE_ORES, DFItemTags.MOONSTONE_ORES)
        copy(DFBlockTags.JADE_ORES, DFItemTags.JADE_ORES)
        copy(DFBlockTags.SMOKY_QUARTZ_ORES, DFItemTags.SMOKY_QUARTZ_ORES)
        copy(DFBlockTags.EUCLASE_ORES, DFItemTags.EUCLASE_ORES)
        copy(DFBlockTags.BORACITE_ORES, DFItemTags.BORACITE_ORES)
        copy(DFBlockTags.TOPAZ_ORES, DFItemTags.TOPAZ_ORES)
        copy(DFBlockTags.TOURMALINE_ORES, DFItemTags.TOURMALINE_ORES)
        copy(DFBlockTags.SPINEL_ORES, DFItemTags.SPINEL_ORES)
        copy(DFBlockTags.HEMATITE_ORES, DFItemTags.HEMATITE_ORES)
        copy(DFBlockTags.CARNELIAN_ORES, DFItemTags.CARNELIAN_ORES)

        // Gem Blocks
        copy(DFBlockTags.GEM_BLOCKS, DFItemTags.GEM_BLOCKS)

        copy(DFBlockTags.RUBY_BLOCK, DFItemTags.RUBY_BLOCK)
        copy(DFBlockTags.SAPPHIRE_BLOCK, DFItemTags.SAPPHIRE_BLOCK)
        copy(DFBlockTags.KYANITE_BLOCK, DFItemTags.KYANITE_BLOCK)
        copy(DFBlockTags.MOONSTONE_BLOCK, DFItemTags.MOONSTONE_BLOCK)
        copy(DFBlockTags.JADE_BLOCK, DFItemTags.JADE_BLOCK)
        copy(DFBlockTags.SMOKY_QUARTZ_BLOCK, DFItemTags.SMOKY_QUARTZ_BLOCK)
        copy(DFBlockTags.EUCLASE_BLOCK, DFItemTags.EUCLASE_BLOCK)
        copy(DFBlockTags.BORACITE_BLOCK, DFItemTags.BORACITE_BLOCK)
        copy(DFBlockTags.TOPAZ_BLOCK, DFItemTags.TOPAZ_BLOCK)
        copy(DFBlockTags.TOURMALINE_BLOCK, DFItemTags.TOURMALINE_BLOCK)
        copy(DFBlockTags.SPINEL_BLOCK, DFItemTags.SPINEL_BLOCK)
        copy(DFBlockTags.HEMATITE_BLOCK, DFItemTags.HEMATITE_BLOCK)
        copy(DFBlockTags.CARNELIAN_BLOCK, DFItemTags.CARNELIAN_BLOCK)
    }

    private fun copyMetalTags() {
        // Metal Ores
        copy(DFBlockTags.METAL_ORES, DFItemTags.METAL_ORES)

        copy(DFBlockTags.SILVER_ORES, DFItemTags.SILVER_ORES)
        copy(DFBlockTags.COBALT_ORES, DFItemTags.COBALT_ORES)
        copy(DFBlockTags.TUNGSTEN_ORES, DFItemTags.TUNGSTEN_ORES)
        copy(DFBlockTags.IRIDIUM_ORES, DFItemTags.IRIDIUM_ORES)
        copy(DFBlockTags.THALLIUM_ORES, DFItemTags.THALLIUM_ORES)
        copy(DFBlockTags.BISMUTH_ORES, DFItemTags.BISMUTH_ORES)
        copy(DFBlockTags.PLUTONIUM_ORES, DFItemTags.PLUTONIUM_ORES)
        copy(DFBlockTags.URANIUM_ORES, DFItemTags.URANIUM_ORES)
        copy(DFBlockTags.LEAD_ORES, DFItemTags.LEAD_ORES)
        copy(DFBlockTags.TIN_ORES, DFItemTags.TIN_ORES)
        copy(DFBlockTags.PALLADIUM_ORES, DFItemTags.PALLADIUM_ORES)
        copy(DFBlockTags.ZINC_ORES, DFItemTags.ZINC_ORES)
        copy(DFBlockTags.NICKEL_ORES, DFItemTags.NICKEL_ORES)
        copy(DFBlockTags.ALUMINIUM_ORES, DFItemTags.ALUMINIUM_ORES)
        copy(DFBlockTags.PLATINUM_ORES, DFItemTags.PLATINUM_ORES)
        copy(DFBlockTags.TITANIUM_ORES, DFItemTags.TITANIUM_ORES)

        // Raw Metals
        copy(DFBlockTags.RAW_SILVER_STORAGE_BLOCK, DFItemTags.RAW_SILVER_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_COBALT_STORAGE_BLOCK, DFItemTags.RAW_COBALT_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_TUNGSTEN_STORAGE_BLOCK, DFItemTags.RAW_TUNGSTEN_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_IRIDIUM_STORAGE_BLOCK, DFItemTags.RAW_IRIDIUM_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_THALLIUM_STORAGE_BLOCK, DFItemTags.RAW_THALLIUM_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_BISMUTH_STORAGE_BLOCK, DFItemTags.RAW_BISMUTH_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_PLUTONIUM_STORAGE_BLOCK, DFItemTags.RAW_PLUTONIUM_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_URANIUM_STORAGE_BLOCK, DFItemTags.RAW_URANIUM_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_LEAD_STORAGE_BLOCK, DFItemTags.RAW_LEAD_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_TIN_STORAGE_BLOCK, DFItemTags.RAW_TIN_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_PALLADIUM_STORAGE_BLOCK, DFItemTags.RAW_PALLADIUM_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_ZINC_STORAGE_BLOCK, DFItemTags.RAW_ZINC_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_NICKEL_STORAGE_BLOCK, DFItemTags.RAW_NICKEL_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_ALUMINIUM_STORAGE_BLOCK, DFItemTags.RAW_ALUMINIUM_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_PLATINUM_STORAGE_BLOCK, DFItemTags.RAW_PLATINUM_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_TITANIUM_STORAGE_BLOCK, DFItemTags.RAW_TITANIUM_STORAGE_BLOCK)
    }

    private fun copyHumanTags() {
        // Human Ores
        copy(DFBlockTags.HUMAN_ORES, DFItemTags.HUMAN_ORES)

        copy(DFBlockTags.EINSTEINIUM_ORES, DFItemTags.EINSTEINIUM_ORES)
        copy(DFBlockTags.ASTRALITE_ORES, DFItemTags.ASTRALITE_ORES)
        copy(DFBlockTags.GRASS_ORES, DFItemTags.GRASS_ORES)

        // raw
        copy(DFBlockTags.RAW_EINSTEINIUM_STORAGE_BLOCK, DFItemTags.RAW_EINSTEINIUM_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_ASTRALITE_STORAGE_BLOCK, DFItemTags.RAW_ASTRALITE_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_GRASS_STORAGE_BLOCK, DFItemTags.RAW_GRASS_STORAGE_BLOCK)
    }

    private fun copyConventionalTags() {
        // Conventional Tags
        copy(ConventionalBlockTags.ORES, ConventionalItemTags.ORES)
        copy(ConventionalBlockTags.STORAGE_BLOCKS, ConventionalItemTags.STORAGE_BLOCKS)
    }

}