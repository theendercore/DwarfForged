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
        copyBlockTags()
        gems()
        conventionalTags()
    }

    private fun copyBlockTags() {
        // Meta Tags
        copy(DFBlockTags.DWARF_FORGED_ORES, DFItemTags.DWARF_FORGED_ORES)
        copy(DFBlockTags.DWARF_FORGED_STORAGE_BLOCKS, DFItemTags.DWARF_FORGED_STORAGE_BLOCKS)

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

        // Conventional Tags
        copy(ConventionalBlockTags.ORES, ConventionalItemTags.ORES)
        copy(ConventionalBlockTags.STORAGE_BLOCKS, ConventionalItemTags.STORAGE_BLOCKS)
    }

    private fun gems() {
        getOrCreateTagBuilder(DFItemTags.GEMS).add(
            DFItems.RUBY,
            DFItems.SAPPHIRE,
            DFItems.KYANITE,
            DFItems.MOONSTONE,
            DFItems.JADE,
            DFItems.SMOKY_QUARTZ,
            DFItems.EUCLASE,
            DFItems.BORACITE,
            DFItems.TOPAZ,
            DFItems.TOURMALINE,
            DFItems.SPINEL,
            DFItems.HEMATITE,
            DFItems.CARNELIAN
        )

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

    private fun conventionalTags() {
        getOrCreateTagBuilder(ConventionalItemTags.GEMS)
            .forceAddTag(DFItemTags.GEMS)
    }
}
