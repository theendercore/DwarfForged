package org.teamvoided.dwarf_forged.data.gen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags
import net.minecraft.registry.HolderLookup
import net.minecraft.registry.tag.BlockTags
import org.teamvoided.dwarf_forged.data.tags.DFBlockTags
import org.teamvoided.dwarf_forged.init.DFBlocks
import java.util.concurrent.CompletableFuture

class BlockTagProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider.BlockTagProvider(o, r) {
    override fun configure(wrapperLookup: HolderLookup.Provider) {
        metaTags()

        gems()
        metals()
        humanOres()
        rocks()
        crystals()

        mineable()
        conventionalTags()
    }

    private fun metaTags() {
        getOrCreateTagBuilder(DFBlockTags.DWARF_FORGED_ORES)
            .forceAddTag(DFBlockTags.GEM_ORES)
            .forceAddTag(DFBlockTags.METAL_ORES)
            .forceAddTag(DFBlockTags.HUMAN_ORES)
        getOrCreateTagBuilder(DFBlockTags.DWARF_FORGED_STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.GEM_BLOCKS)
            .forceAddTag(DFBlockTags.RAW_METAL_STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.RAW_HUMAN_STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.METAL_BLOCKS)
            .forceAddTag(DFBlockTags.HUMAN_BLOCKS)
    }

    private fun gems() {
        getOrCreateTagBuilder(DFBlockTags.GEM_ORES)
            .forceAddTag(DFBlockTags.RUBY_ORES)
            .forceAddTag(DFBlockTags.SAPPHIRE_ORES)
            .forceAddTag(DFBlockTags.KYANITE_ORES)
            .forceAddTag(DFBlockTags.MOONSTONE_ORES)
            .forceAddTag(DFBlockTags.JADE_ORES)
            .forceAddTag(DFBlockTags.SMOKY_QUARTZ_ORES)
            .forceAddTag(DFBlockTags.EUCLASE_ORES)
            .forceAddTag(DFBlockTags.BORACITE_ORES)
            .forceAddTag(DFBlockTags.TOPAZ_ORES)
            .forceAddTag(DFBlockTags.TOURMALINE_ORES)
            .forceAddTag(DFBlockTags.SPINEL_ORES)
            .forceAddTag(DFBlockTags.HEMATITE_ORES)
            .forceAddTag(DFBlockTags.CARNELIAN_ORES)

        getOrCreateTagBuilder(DFBlockTags.RUBY_ORES).add(DFBlocks.RUBY_ORE, DFBlocks.DEEPSLATE_RUBY_ORE)
        getOrCreateTagBuilder(DFBlockTags.SAPPHIRE_ORES).add(DFBlocks.SAPPHIRE_ORE, DFBlocks.DEEPSLATE_SAPPHIRE_ORE)
        getOrCreateTagBuilder(DFBlockTags.KYANITE_ORES).add(DFBlocks.KYANITE_ORE, DFBlocks.DEEPSLATE_KYANITE_ORE)
        getOrCreateTagBuilder(DFBlockTags.MOONSTONE_ORES).add(DFBlocks.MOONSTONE_ORE, DFBlocks.DEEPSLATE_MOONSTONE_ORE)
        getOrCreateTagBuilder(DFBlockTags.JADE_ORES).add(DFBlocks.JADE_ORE, DFBlocks.DEEPSLATE_JADE_ORE)
        getOrCreateTagBuilder(DFBlockTags.SMOKY_QUARTZ_ORES).add(DFBlocks.NETHER_SMOKY_QUARTZ_ORE)
        getOrCreateTagBuilder(DFBlockTags.EUCLASE_ORES).add(DFBlocks.EUCLASE_ORE, DFBlocks.DEEPSLATE_EUCLASE_ORE)
        getOrCreateTagBuilder(DFBlockTags.BORACITE_ORES).add(DFBlocks.BORACITE_ORE, DFBlocks.DEEPSLATE_BORACITE_ORE)
        getOrCreateTagBuilder(DFBlockTags.TOPAZ_ORES).add(DFBlocks.TOPAZ_ORE, DFBlocks.DEEPSLATE_TOPAZ_ORE)
        getOrCreateTagBuilder(DFBlockTags.TOURMALINE_ORES)
            .add(DFBlocks.TOURMALINE_ORE, DFBlocks.DEEPSLATE_TOURMALINE_ORE)
        getOrCreateTagBuilder(DFBlockTags.SPINEL_ORES).add(DFBlocks.SPINEL_ORE, DFBlocks.DEEPSLATE_SPINEL_ORE)
        getOrCreateTagBuilder(DFBlockTags.HEMATITE_ORES).add(DFBlocks.HEMATITE_ORE, DFBlocks.DEEPSLATE_HEMATITE_ORE)
        getOrCreateTagBuilder(DFBlockTags.CARNELIAN_ORES).add(DFBlocks.CARNELIAN_ORE, DFBlocks.DEEPSLATE_CARNELIAN_ORE)

        getOrCreateTagBuilder(DFBlockTags.GEM_BLOCKS)
            .forceAddTag(DFBlockTags.RUBY_BLOCK)
            .forceAddTag(DFBlockTags.SAPPHIRE_BLOCK)
            .forceAddTag(DFBlockTags.KYANITE_BLOCK)
            .forceAddTag(DFBlockTags.MOONSTONE_BLOCK)
            .forceAddTag(DFBlockTags.JADE_BLOCK)
            .forceAddTag(DFBlockTags.SMOKY_QUARTZ_BLOCK)
            .forceAddTag(DFBlockTags.EUCLASE_BLOCK)
            .forceAddTag(DFBlockTags.BORACITE_BLOCK)
            .forceAddTag(DFBlockTags.TOPAZ_BLOCK)
            .forceAddTag(DFBlockTags.TOURMALINE_BLOCK)
            .forceAddTag(DFBlockTags.SPINEL_BLOCK)
            .forceAddTag(DFBlockTags.HEMATITE_BLOCK)
            .forceAddTag(DFBlockTags.CARNELIAN_BLOCK)

        getOrCreateTagBuilder(DFBlockTags.RUBY_BLOCK).add(DFBlocks.RUBY_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.SAPPHIRE_BLOCK).add(DFBlocks.SAPPHIRE_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.KYANITE_BLOCK).add(DFBlocks.KYANITE_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.MOONSTONE_BLOCK).add(DFBlocks.MOONSTONE_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.JADE_BLOCK).add(DFBlocks.JADE_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.SMOKY_QUARTZ_BLOCK).add(DFBlocks.SMOKY_QUARTZ_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.EUCLASE_BLOCK).add(DFBlocks.EUCLASE_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.BORACITE_BLOCK).add(DFBlocks.BORACITE_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.TOPAZ_BLOCK).add(DFBlocks.TOPAZ_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.TOURMALINE_BLOCK).add(DFBlocks.TOURMALINE_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.SPINEL_BLOCK).add(DFBlocks.SPINEL_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.HEMATITE_BLOCK).add(DFBlocks.HEMATITE_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.CARNELIAN_BLOCK).add(DFBlocks.CARNELIAN_BLOCK)
    }

    private fun metals() {
        getOrCreateTagBuilder(DFBlockTags.METAL_ORES)
            .forceAddTag(DFBlockTags.SILVER_ORES)
            .forceAddTag(DFBlockTags.COBALT_ORES)
            .forceAddTag(DFBlockTags.TUNGSTEN_ORES)
            .forceAddTag(DFBlockTags.IRIDIUM_ORES)
            .forceAddTag(DFBlockTags.THALLIUM_ORES)
            .forceAddTag(DFBlockTags.BISMUTH_ORES)
            .forceAddTag(DFBlockTags.PLUTONIUM_ORES)
            .forceAddTag(DFBlockTags.URANIUM_ORES)
            .forceAddTag(DFBlockTags.LEAD_ORES)
            .forceAddTag(DFBlockTags.TIN_ORES)
            .forceAddTag(DFBlockTags.PALLADIUM_ORES)
            .forceAddTag(DFBlockTags.ZINC_ORES)
            .forceAddTag(DFBlockTags.NICKEL_ORES)
            .forceAddTag(DFBlockTags.ALUMINIUM_ORES)
            .forceAddTag(DFBlockTags.PLATINUM_ORES)
            .forceAddTag(DFBlockTags.TITANIUM_ORES)

        getOrCreateTagBuilder(DFBlockTags.SILVER_ORES).add(DFBlocks.SILVER_ORE, DFBlocks.DEEPSLATE_SILVER_ORE)
        getOrCreateTagBuilder(DFBlockTags.COBALT_ORES).add(DFBlocks.COBALT_ORE, DFBlocks.DEEPSLATE_COBALT_ORE)
        getOrCreateTagBuilder(DFBlockTags.TUNGSTEN_ORES).add(DFBlocks.TUNGSTEN_ORE, DFBlocks.DEEPSLATE_TUNGSTEN_ORE)
        getOrCreateTagBuilder(DFBlockTags.IRIDIUM_ORES).add(DFBlocks.IRIDIUM_ORE, DFBlocks.DEEPSLATE_IRIDIUM_ORE)
        getOrCreateTagBuilder(DFBlockTags.THALLIUM_ORES).add(DFBlocks.THALLIUM_ORE, DFBlocks.DEEPSLATE_THALLIUM_ORE)
        getOrCreateTagBuilder(DFBlockTags.BISMUTH_ORES).add(DFBlocks.BISMUTH_ORE, DFBlocks.DEEPSLATE_BISMUTH_ORE)
        getOrCreateTagBuilder(DFBlockTags.PLUTONIUM_ORES).add(DFBlocks.PLUTONIUM_ORE, DFBlocks.DEEPSLATE_PLUTONIUM_ORE)
        getOrCreateTagBuilder(DFBlockTags.URANIUM_ORES).add(DFBlocks.URANIUM_ORE, DFBlocks.DEEPSLATE_URANIUM_ORE)
        getOrCreateTagBuilder(DFBlockTags.LEAD_ORES).add(DFBlocks.LEAD_ORE, DFBlocks.DEEPSLATE_LEAD_ORE)
        getOrCreateTagBuilder(DFBlockTags.TIN_ORES).add(DFBlocks.TIN_ORE, DFBlocks.DEEPSLATE_TIN_ORE)
        getOrCreateTagBuilder(DFBlockTags.PALLADIUM_ORES).add(DFBlocks.PALLADIUM_ORE, DFBlocks.DEEPSLATE_PALLADIUM_ORE)
        getOrCreateTagBuilder(DFBlockTags.ZINC_ORES).add(DFBlocks.ZINC_ORE, DFBlocks.DEEPSLATE_ZINC_ORE)
        getOrCreateTagBuilder(DFBlockTags.NICKEL_ORES).add(DFBlocks.NICKEL_ORE, DFBlocks.DEEPSLATE_NICKEL_ORE)
        getOrCreateTagBuilder(DFBlockTags.ALUMINIUM_ORES).add(DFBlocks.ALUMINIUM_ORE, DFBlocks.DEEPSLATE_ALUMINIUM_ORE)
        getOrCreateTagBuilder(DFBlockTags.PLATINUM_ORES).add(DFBlocks.PLATINUM_ORE, DFBlocks.DEEPSLATE_PLATINUM_ORE)
        getOrCreateTagBuilder(DFBlockTags.TITANIUM_ORES).add(DFBlocks.TITANIUM_ORE, DFBlocks.DEEPSLATE_TITANIUM_ORE)


        getOrCreateTagBuilder(DFBlockTags.RAW_METAL_STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.RAW_SILVER_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_COBALT_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_TUNGSTEN_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_IRIDIUM_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_THALLIUM_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_BISMUTH_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_PLUTONIUM_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_URANIUM_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_LEAD_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_TIN_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_PALLADIUM_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_ZINC_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_NICKEL_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_ALUMINIUM_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_PLATINUM_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_TITANIUM_STORAGE_BLOCK)

        getOrCreateTagBuilder(DFBlockTags.RAW_SILVER_STORAGE_BLOCK).add(DFBlocks.RAW_SILVER_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_COBALT_STORAGE_BLOCK).add(DFBlocks.RAW_COBALT_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_TUNGSTEN_STORAGE_BLOCK).add(DFBlocks.RAW_TUNGSTEN_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_IRIDIUM_STORAGE_BLOCK).add(DFBlocks.RAW_IRIDIUM_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_THALLIUM_STORAGE_BLOCK).add(DFBlocks.RAW_THALLIUM_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_BISMUTH_STORAGE_BLOCK).add(DFBlocks.RAW_BISMUTH_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_PLUTONIUM_STORAGE_BLOCK).add(DFBlocks.RAW_PLUTONIUM_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_URANIUM_STORAGE_BLOCK).add(DFBlocks.RAW_URANIUM_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_LEAD_STORAGE_BLOCK).add(DFBlocks.RAW_LEAD_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_TIN_STORAGE_BLOCK).add(DFBlocks.RAW_TIN_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_PALLADIUM_STORAGE_BLOCK).add(DFBlocks.RAW_PALLADIUM_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_ZINC_STORAGE_BLOCK).add(DFBlocks.RAW_ZINC_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_NICKEL_STORAGE_BLOCK).add(DFBlocks.RAW_NICKEL_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_ALUMINIUM_STORAGE_BLOCK).add(DFBlocks.RAW_ALUMINIUM_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_PLATINUM_STORAGE_BLOCK).add(DFBlocks.RAW_PLATINUM_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_TITANIUM_STORAGE_BLOCK).add(DFBlocks.RAW_TITANIUM_BLOCK)


        getOrCreateTagBuilder(DFBlockTags.METAL_BLOCKS)
            .forceAddTag(DFBlockTags.SILVER_BLOCK)

        getOrCreateTagBuilder(DFBlockTags.SILVER_BLOCK).add(DFBlocks.SILVER_BLOCK)
    }

    private fun humanOres() {
        getOrCreateTagBuilder(DFBlockTags.HUMAN_ORES)
            .forceAddTag(DFBlockTags.EINSTEINIUM_ORES)
            .forceAddTag(DFBlockTags.ASTRALITE_ORES)
            .forceAddTag(DFBlockTags.GRASS_ORES)

        getOrCreateTagBuilder(DFBlockTags.EINSTEINIUM_ORES)
            .add(DFBlocks.EINSTEINIUM_ORE, DFBlocks.DEEPSLATE_EINSTEINIUM_ORE)
        getOrCreateTagBuilder(DFBlockTags.ASTRALITE_ORES).add(DFBlocks.ASTRALITE_ORE, DFBlocks.DEEPSLATE_ASTRALITE_ORE)
        getOrCreateTagBuilder(DFBlockTags.GRASS_ORES).add(DFBlocks.DEATHL_ORE, DFBlocks.DEEPSLATE_DEATHL_ORE)


        getOrCreateTagBuilder(DFBlockTags.RAW_HUMAN_STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.RAW_EINSTEINIUM_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_ASTRALITE_STORAGE_BLOCK)
            .forceAddTag(DFBlockTags.RAW_GRASS_STORAGE_BLOCK)

        getOrCreateTagBuilder(DFBlockTags.RAW_EINSTEINIUM_STORAGE_BLOCK).add(DFBlocks.RAW_EINSTEINIUM_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_ASTRALITE_STORAGE_BLOCK).add(DFBlocks.RAW_ASTRALITE_BLOCK)
        getOrCreateTagBuilder(DFBlockTags.RAW_GRASS_STORAGE_BLOCK).add(DFBlocks.RAW_DEATHL_BLOCK)

        getOrCreateTagBuilder(DFBlockTags.HUMAN_BLOCKS)
            .forceAddTag(DFBlockTags.ASTRALITE_BLOCK)

        getOrCreateTagBuilder(DFBlockTags.ASTRALITE_BLOCK).add(DFBlocks.ASTRALITE_BLOCK)
    }

    private fun mineable() {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .forceAddTag(DFBlockTags.DWARF_FORGED_ORES)
            .forceAddTag(DFBlockTags.GEM_BLOCKS)
            .forceAddTag(DFBlockTags.RAW_METAL_STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.RAW_HUMAN_STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.METAL_BLOCKS)
            .forceAddTag(DFBlockTags.HUMAN_BLOCKS)
            .forceAddTag(DFBlockTags.ROCKS)
            .forceAddTag(DFBlockTags.CRYSTALS)

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .forceAddTag(DFBlockTags.GEM_ORES)
            .forceAddTag(DFBlockTags.GEM_BLOCKS)

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
            .forceAddTag(DFBlockTags.METAL_ORES)
            .forceAddTag(DFBlockTags.HUMAN_ORES)
            .forceAddTag(DFBlockTags.RAW_METAL_STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.RAW_HUMAN_STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.METAL_BLOCKS)
            .forceAddTag(DFBlockTags.HUMAN_BLOCKS)
    }

    private fun rocks() {
        getOrCreateTagBuilder(DFBlockTags.ROCKS)
            .forceAddTag(DFBlockTags.STONES)
            .forceAddTag(DFBlockTags.COBBLESTONES)

        getOrCreateTagBuilder(DFBlockTags.STONES)
            .forceAddTag(DFBlockTags.STONES_OVERWORLD)
            .forceAddTag(DFBlockTags.STONES_NETHER)

        getOrCreateTagBuilder(DFBlockTags.COBBLESTONES)
            .add(DFBlocks.COBBLED_BLUE_SCHIST)

        getOrCreateTagBuilder(DFBlockTags.STONES_OVERWORLD)
            .add(DFBlocks.MARBLE)
            .add(DFBlocks.ORBITAL_GRANITE)
            .add(DFBlocks.BLAIRMORITE)
            .add(DFBlocks.PYROXENITE)
            .add(DFBlocks.ARGILLITE)
            .add(DFBlocks.MUDROCK)
            .add(DFBlocks.BLUE_SCHIST)
            .add(DFBlocks.VARIOLITE)

        getOrCreateTagBuilder(DFBlockTags.STONES_NETHER)
            .add(DFBlocks.PUMICE)


        getOrCreateTagBuilder(BlockTags.BASE_STONE_NETHER)
            .forceAddTag(DFBlockTags.STONES_NETHER)
        getOrCreateTagBuilder(BlockTags.BASE_STONE_OVERWORLD)
            .forceAddTag(DFBlockTags.STONES_OVERWORLD)

        getOrCreateTagBuilder(BlockTags.STONE_ORE_REPLACEABLES)
            .forceAddTag(DFBlockTags.STONES)
    }

    private fun crystals() {
        getOrCreateTagBuilder(DFBlockTags.CRYSTALS).forceAddTag(DFBlockTags.BLUE_SKY).forceAddTag(DFBlockTags.CITRINE)

        getOrCreateTagBuilder(DFBlockTags.BLUE_SKY).add(
            DFBlocks.BLUE_SKY_BLOCK,
            DFBlocks.BLUE_SKY_CLUSTER,
            DFBlocks.LARGE_BLUE_SKY_BUD,
            DFBlocks.MEDIUM_BLUE_SKY_BUD,
            DFBlocks.SMALL_BLUE_SKY_BUD,
            DFBlocks.BUDDING_BLUE_SKY,
        )
        getOrCreateTagBuilder(DFBlockTags.CITRINE).add(
            DFBlocks.CITRINE_BLOCK,
            DFBlocks.CITRINE_CLUSTER,
            DFBlocks.LARGE_CITRINE_BUD,
            DFBlocks.MEDIUM_CITRINE_BUD,
            DFBlocks.SMALL_CITRINE_BUD,
            DFBlocks.BUDDING_CITRINE,
        )

        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS).add(
            DFBlocks.BLUE_SKY_BLOCK,
            DFBlocks.BUDDING_BLUE_SKY,
            DFBlocks.CITRINE_BLOCK,
            DFBlocks.BUDDING_CITRINE,
        )

        getOrCreateTagBuilder(BlockTags.VIBRATION_RESONATORS).add(
            DFBlocks.BLUE_SKY_BLOCK,
            DFBlocks.CITRINE_BLOCK,
        )
        getOrCreateTagBuilder(BlockTags.INSIDE_STEP_SOUND_BLOCKS).add(
            DFBlocks.SMALL_BLUE_SKY_BUD,
            DFBlocks.SMALL_CITRINE_BUD,
        )
    }

    private fun conventionalTags() {
        getOrCreateTagBuilder(ConventionalBlockTags.ORES)
            .forceAddTag(DFBlockTags.DWARF_FORGED_ORES)
        getOrCreateTagBuilder(ConventionalBlockTags.STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.DWARF_FORGED_STORAGE_BLOCKS)

        // Stones
        getOrCreateTagBuilder(ConventionalBlockTags.STONES)
            .forceAddTag(DFBlockTags.STONES_OVERWORLD)
        getOrCreateTagBuilder(ConventionalBlockTags.COBBLESTONES)
            .forceAddTag(DFBlockTags.COBBLESTONES)

        // Crystals
        getOrCreateTagBuilder(ConventionalBlockTags.BUDDING_BLOCKS)
            .add(DFBlocks.BUDDING_BLUE_SKY, DFBlocks.BUDDING_CITRINE)
        getOrCreateTagBuilder(ConventionalBlockTags.CLUSTERS)
            .add(DFBlocks.BLUE_SKY_CLUSTER, DFBlocks.CITRINE_CLUSTER)
        getOrCreateTagBuilder(ConventionalBlockTags.BUDS)
            .add(DFBlocks.LARGE_BLUE_SKY_BUD, DFBlocks.MEDIUM_BLUE_SKY_BUD, DFBlocks.SMALL_BLUE_SKY_BUD)
            .add(DFBlocks.LARGE_CITRINE_BUD, DFBlocks.MEDIUM_CITRINE_BUD, DFBlocks.SMALL_CITRINE_BUD)

    }
}