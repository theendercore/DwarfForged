package org.teamvoided.dwarf_forged.data.gen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags
import net.minecraft.registry.HolderLookup
import net.minecraft.registry.tag.ItemTags
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
        rockTags()
        crystalTags()

        misc()

        conventionalTags()

        copyMetaTags()
        copyGemTags()
        copyMetalTags()
        copyHumanTags()
        copyRocksTags()
        copyCrystalsTags()

        copyConventionalTags()
    }

    private fun metaTags() {
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
            // Human Gems
            .forceAddTag(DFItemTags.GEMS_PETALITATE)
            .forceAddTag(DFItemTags.GEMS_BLORE)
            .forceAddTag(DFItemTags.GEMS_STORMSTONE)
            .forceAddTag(DFItemTags.GEMS_JAZIUM)
            .forceAddTag(DFItemTags.GEMS_REPOOKITE)
            .forceAddTag(DFItemTags.GEMS_CACTALINE)

        getOrCreateTagBuilder(DFItemTags.DWARF_FORGED_RAW_MATERIALS)
            .forceAddTag(DFItemTags.RAW_METAL_MATERIALS)
            .forceAddTag(DFItemTags.RAW_HUMAN_MATERIALS)

        getOrCreateTagBuilder(DFItemTags.DWARF_FORGED_INGOTS)
            .forceAddTag(DFItemTags.SILVER_INGOT)
            .forceAddTag(DFItemTags.ASTRALITE_INGOT)

        getOrCreateTagBuilder(DFItemTags.DWARF_FORGED_NUGGETS)
            .forceAddTag(DFItemTags.SILVER_NUGGETS)
            .forceAddTag(DFItemTags.ASTRALITE_NUGGETS)
            .forceAddTag(DFItemTags.COPPER_NUGGETS)
    }

    private fun gems() {
        getOrCreateTagBuilder(DFItemTags.GEMS_RUBY).add(DFItems.RUBY)
        getOrCreateTagBuilder(DFItemTags.GEMS_SAPPHIRE).add(DFItems.SAPPHIRE)
        getOrCreateTagBuilder(DFItemTags.GEMS_KYANITE).add(DFItems.KYANITE)
        getOrCreateTagBuilder(DFItemTags.GEMS_MOONSTONE).add(DFItems.MOONSTONE)
        getOrCreateTagBuilder(DFItemTags.GEMS_JADE).add(DFItems.JADE)
        getOrCreateTagBuilder(DFItemTags.GEMS_SMOKY_QUARTZ).add(DFItems.SMOKY_QUARTZ)
        getOrCreateTagBuilder(DFItemTags.GEMS_EUCLASE).add(DFItems.EUCLASE)
        getOrCreateTagBuilder(DFItemTags.GEMS_BORACITE).add(DFItems.BORACITE)
        getOrCreateTagBuilder(DFItemTags.GEMS_TOPAZ).add(DFItems.TOPAZ)
        getOrCreateTagBuilder(DFItemTags.GEMS_TOURMALINE).add(DFItems.TOURMALINE)
        getOrCreateTagBuilder(DFItemTags.GEMS_SPINEL).add(DFItems.SPINEL)
        getOrCreateTagBuilder(DFItemTags.GEMS_HEMATITE).add(DFItems.HEMATITE)
        getOrCreateTagBuilder(DFItemTags.GEMS_CARNELIAN).add(DFItems.CARNELIAN)
    }

    private fun metals() {
        getOrCreateTagBuilder(DFItemTags.RAW_METAL_MATERIALS)
            .forceAddTag(DFItemTags.RAW_SILVER_MATERIALS)
            .forceAddTag(DFItemTags.RAW_COBALT_MATERIALS)
            .forceAddTag(DFItemTags.RAW_TUNGSTEN_MATERIALS)
            .forceAddTag(DFItemTags.RAW_IRIDIUM_MATERIALS)
            .forceAddTag(DFItemTags.RAW_THALLIUM_MATERIALS)
            .forceAddTag(DFItemTags.RAW_BISMUTH_MATERIALS)
            .forceAddTag(DFItemTags.RAW_PLUTONIUM_MATERIALS)
            .forceAddTag(DFItemTags.RAW_URANIUM_MATERIALS)
            .forceAddTag(DFItemTags.RAW_LEAD_MATERIALS)
            .forceAddTag(DFItemTags.RAW_TIN_MATERIALS)
            .forceAddTag(DFItemTags.RAW_PALLADIUM_MATERIALS)
            .forceAddTag(DFItemTags.RAW_ZINC_MATERIALS)
            .forceAddTag(DFItemTags.RAW_NICKEL_MATERIALS)
            .forceAddTag(DFItemTags.RAW_ALUMINIUM_MATERIALS)

        getOrCreateTagBuilder(DFItemTags.RAW_SILVER_MATERIALS).add(DFItems.RAW_SILVER)
        getOrCreateTagBuilder(DFItemTags.RAW_COBALT_MATERIALS).add(DFItems.RAW_COBALT)
        getOrCreateTagBuilder(DFItemTags.RAW_TUNGSTEN_MATERIALS).add(DFItems.RAW_TUNGSTEN)
        getOrCreateTagBuilder(DFItemTags.RAW_IRIDIUM_MATERIALS).add(DFItems.RAW_IRIDIUM)
        getOrCreateTagBuilder(DFItemTags.RAW_THALLIUM_MATERIALS).add(DFItems.RAW_THALLIUM)
        getOrCreateTagBuilder(DFItemTags.RAW_BISMUTH_MATERIALS).add(DFItems.RAW_BISMUTH)
        getOrCreateTagBuilder(DFItemTags.RAW_PLUTONIUM_MATERIALS).add(DFItems.RAW_PLUTONIUM)
        getOrCreateTagBuilder(DFItemTags.RAW_URANIUM_MATERIALS).add(DFItems.RAW_URANIUM)
        getOrCreateTagBuilder(DFItemTags.RAW_LEAD_MATERIALS).add(DFItems.RAW_LEAD)
        getOrCreateTagBuilder(DFItemTags.RAW_TIN_MATERIALS).add(DFItems.RAW_TIN)
        getOrCreateTagBuilder(DFItemTags.RAW_PALLADIUM_MATERIALS).add(DFItems.RAW_PALLADIUM)
        getOrCreateTagBuilder(DFItemTags.RAW_ZINC_MATERIALS).add(DFItems.RAW_ZINC)
        getOrCreateTagBuilder(DFItemTags.RAW_NICKEL_MATERIALS).add(DFItems.RAW_NICKEL)
        getOrCreateTagBuilder(DFItemTags.RAW_ALUMINIUM_MATERIALS).add(DFItems.RAW_ALUMINIUM)
        getOrCreateTagBuilder(DFItemTags.RAW_PLATINUM_MATERIALS).add(DFItems.RAW_PLATINUM)
        getOrCreateTagBuilder(DFItemTags.RAW_TITANIUM_MATERIALS).add(DFItems.RAW_TITANIUM)

        getOrCreateTagBuilder(DFItemTags.SILVER_INGOT).add(DFItems.SILVER_INGOT)

        getOrCreateTagBuilder(DFItemTags.SILVER_NUGGETS).add(DFItems.SILVER_NUGGET)
    }

    private fun humans() {
        getOrCreateTagBuilder(DFItemTags.RAW_HUMAN_MATERIALS)
            .forceAddTag(DFItemTags.RAW_EINSTEINIUM_MATERIALS)
            .forceAddTag(DFItemTags.RAW_ASTRALITE_MATERIALS)
            .forceAddTag(DFItemTags.RAW_GRASS_MATERIALS)

        getOrCreateTagBuilder(DFItemTags.RAW_EINSTEINIUM_MATERIALS).add(DFItems.RAW_EINSTEINIUM)
        getOrCreateTagBuilder(DFItemTags.RAW_ASTRALITE_MATERIALS).add(DFItems.RAW_ASTRALITE)
        getOrCreateTagBuilder(DFItemTags.RAW_GRASS_MATERIALS).add(DFItems.RAW_DEATHL)

        getOrCreateTagBuilder(DFItemTags.ASTRALITE_INGOT).add(DFItems.ASTRALITE_INGOT)

        getOrCreateTagBuilder(DFItemTags.VOILIT_INGOT).add(DFItems.VOILIT_INGOT)

        getOrCreateTagBuilder(DFItemTags.ASTRALITE_NUGGETS).add(DFItems.ASTRALITE_NUGGET)

        getOrCreateTagBuilder(DFItemTags.GEMS_PETALITATE).add(DFItems.PETALITATE)
        getOrCreateTagBuilder(DFItemTags.GEMS_BLORE).add(DFItems.BLORE)
        getOrCreateTagBuilder(DFItemTags.GEMS_STORMSTONE).add(DFItems.STORMSTONE)
        getOrCreateTagBuilder(DFItemTags.GEMS_JAZIUM).add(DFItems.JAZIUM)
        getOrCreateTagBuilder(DFItemTags.GEMS_REPOOKITE).add(DFItems.REPOOKITE)
        getOrCreateTagBuilder(DFItemTags.GEMS_CACTALINE).add(DFItems.CACTALINE)
    }

    private fun rockTags() {
        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
            .forceAddTag(DFItemTags.COBBLESTONES)
        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
            .forceAddTag(DFItemTags.COBBLESTONES)
    }

    private fun crystalTags() {
        getOrCreateTagBuilder(DFItemTags.CRYSTALS)
            .forceAddTag(DFItemTags.GEMS_BLUE_SKY).forceAddTag(DFItemTags.GEMS_CITRINE)
        getOrCreateTagBuilder(DFItemTags.GEMS_BLUE_SKY).add(DFItems.BLUE_SKY_SHARD)
        getOrCreateTagBuilder(DFItemTags.GEMS_CITRINE).add(DFItems.CITRINE_SHARD)
    }

    private fun misc() {
        getOrCreateTagBuilder(DFItemTags.COPPER_NUGGETS).add(DFItems.COPPER_NUGGET)
    }

    private fun conventionalTags() {
        getOrCreateTagBuilder(ConventionalItemTags.GEMS)
            .forceAddTag(DFItemTags.DWARF_FORGED_GEMS)
            .forceAddTag(DFItemTags.CRYSTALS)
        getOrCreateTagBuilder(ConventionalItemTags.RAW_MATERIALS)
            .forceAddTag(DFItemTags.DWARF_FORGED_RAW_MATERIALS)
        getOrCreateTagBuilder(ConventionalItemTags.INGOTS)
            .forceAddTag(DFItemTags.DWARF_FORGED_INGOTS)
        getOrCreateTagBuilder(ConventionalItemTags.NUGGETS)
            .forceAddTag(DFItemTags.DWARF_FORGED_NUGGETS)
    }

    private fun copyMetaTags() {
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
        // Ores
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

        // Raw
        copy(DFBlockTags.RAW_METAL_STORAGE_BLOCKS, DFItemTags.RAW_METAL_STORAGE_BLOCKS)

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

        // Processed
        copy(DFBlockTags.METAL_BLOCKS, DFItemTags.METAL_BLOCKS)

        copy(DFBlockTags.SILVER_BLOCK, DFItemTags.SILVER_BLOCK)
    }

    private fun copyHumanTags() {
        // Ores
        copy(DFBlockTags.HUMAN_ORES, DFItemTags.HUMAN_ORES)

        copy(DFBlockTags.EINSTEINIUM_ORES, DFItemTags.EINSTEINIUM_ORES)
        copy(DFBlockTags.ASTRALITE_ORES, DFItemTags.ASTRALITE_ORES)
        copy(DFBlockTags.DEATHL_ORES, DFItemTags.DEATHL_ORES)
        copy(DFBlockTags.PETALITATE_ORES, DFItemTags.PETALITATE_ORES)
        copy(DFBlockTags.BLORE_ORES, DFItemTags.BLORE_ORES)
        copy(DFBlockTags.STORMSTONE_ORES, DFItemTags.STORMSTONE_ORES)
        copy(DFBlockTags.VOILIT_ORES, DFItemTags.VOILIT_ORES)
        copy(DFBlockTags.JAZIUM_ORES, DFItemTags.JAZIUM_ORES)
        copy(DFBlockTags.REPOOKITE_ORES, DFItemTags.REPOOKITE_ORES)
        copy(DFBlockTags.CACTALINE_ORES, DFItemTags.CACTALINE_ORES)

        // Raw
        copy(DFBlockTags.RAW_HUMAN_STORAGE_BLOCKS, DFItemTags.RAW_HUMAN_STORAGE_BLOCKS)

        copy(DFBlockTags.RAW_EINSTEINIUM_STORAGE_BLOCK, DFItemTags.RAW_EINSTEINIUM_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_ASTRALITE_STORAGE_BLOCK, DFItemTags.RAW_ASTRALITE_STORAGE_BLOCK)
        copy(DFBlockTags.RAW_GRASS_STORAGE_BLOCK, DFItemTags.RAW_GRASS_STORAGE_BLOCK)

        // Processed
        copy(DFBlockTags.HUMAN_BLOCKS, DFItemTags.HUMAN_BLOCKS)

        copy(DFBlockTags.ASTRALITE_BLOCK, DFItemTags.ASTRALITE_BLOCK)
        copy(DFBlockTags.PETALITATE_BLOCK, DFItemTags.PETALITATE_BLOCK)
        copy(DFBlockTags.BLORE_BLOCK, DFItemTags.BLORE_BLOCK)
        copy(DFBlockTags.STORMSTONE_BLOCK, DFItemTags.STORMSTONE_BLOCK)
        copy(DFBlockTags.VOILIT_BLOCK, DFItemTags.VOILIT_BLOCK)
        copy(DFBlockTags.JAZIUM_BLOCK, DFItemTags.JAZIUM_BLOCK)
        copy(DFBlockTags.REPOOKITE_BLOCK, DFItemTags.REPOOKITE_BLOCK)
        copy(DFBlockTags.CACTALINE_BLOCK, DFItemTags.CACTALINE_BLOCK)

    }

    private fun copyRocksTags() {
        copy(DFBlockTags.ROCKS, DFItemTags.ROCKS)
        copy(DFBlockTags.STONES, DFItemTags.STONES)
        copy(DFBlockTags.STONES_NETHER, DFItemTags.STONES_NETHER)

        copy(DFBlockTags.COBBLESTONES, DFItemTags.COBBLESTONES)

        copy(DFBlockTags.STONES_OVERWORLD, DFItemTags.STONES_OVERWORLD)
        copy(DFBlockTags.STONES_NETHER, DFItemTags.STONES_NETHER)
    }

    private fun copyCrystalsTags() {
        copy(DFBlockTags.CRYSTALS, DFItemTags.CRYSTAL_BLOCKS)

        copy(DFBlockTags.BLUE_SKY, DFItemTags.BLUE_SKY)
        copy(DFBlockTags.CITRINE, DFItemTags.CITRINE)
    }

    private fun copyConventionalTags() {
        // Conventional Tags
        copy(ConventionalBlockTags.ORES, ConventionalItemTags.ORES)
        copy(ConventionalBlockTags.STORAGE_BLOCKS, ConventionalItemTags.STORAGE_BLOCKS)

        // Rocks
        copy(ConventionalBlockTags.STONES, ConventionalItemTags.STONES)
        copy(ConventionalBlockTags.COBBLESTONES, ConventionalItemTags.COBBLESTONES)

        // Crystals
        copy(ConventionalBlockTags.BUDDING_BLOCKS, ConventionalItemTags.BUDDING_BLOCKS)
        copy(ConventionalBlockTags.CLUSTERS, ConventionalItemTags.CLUSTERS)
        copy(ConventionalBlockTags.BUDS, ConventionalItemTags.BUDS)
    }

}