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
        getOrCreateTagBuilder(DFBlockTags.DWARF_FORGED_ORES)
            .forceAddTag(DFBlockTags.GEM_ORES)
            .forceAddTag(DFBlockTags.METAL_ORES)
            .forceAddTag(DFBlockTags.HUMAN_ORES)
        getOrCreateTagBuilder(DFBlockTags.DWARF_FORGED_STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.GEM_BLOCKS)
            .forceAddTag(DFBlockTags.METAL_BLOCKS)
            .forceAddTag(DFBlockTags.HUMAN_BLOCKS)

        gems()
        metals()
        humanOres()

        mineable()
        conventionalTags()
    }

    private fun gems() {
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

        getOrCreateTagBuilder(DFBlockTags.GEM_BLOCKS).add(
            DFBlocks.RUBY_BLOCK,
            DFBlocks.SAPPHIRE_BLOCK,
            DFBlocks.KYANITE_BLOCK,
            DFBlocks.MOONSTONE_BLOCK,
            DFBlocks.JADE_BLOCK,
            DFBlocks.SMOKY_QUARTZ_BLOCK,
            DFBlocks.EUCLASE_BLOCK,
            DFBlocks.BORACITE_BLOCK,
            DFBlocks.TOPAZ_BLOCK,
            DFBlocks.TOURMALINE_BLOCK,
            DFBlocks.SPINEL_BLOCK,
            DFBlocks.HEMATITE_BLOCK,
            DFBlocks.CARNELIAN_BLOCK
        )

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
    }

    fun metals() {
        getOrCreateTagBuilder(DFBlockTags.SILVER_ORES).add(DFBlocks.SILVER_ORE, DFBlocks.DEEPSLATE_SILVER_ORE)

        getOrCreateTagBuilder(DFBlockTags.METAL_ORES)
            .forceAddTag(DFBlockTags.SILVER_ORES)

        getOrCreateTagBuilder(DFBlockTags.METAL_BLOCKS).add(
            DFBlocks.SILVER_BLOCK,
        )

        getOrCreateTagBuilder(DFBlockTags.SILVER_BLOCK).add(DFBlocks.SILVER_BLOCK)



    }

    private fun humanOres() {
        getOrCreateTagBuilder(DFBlockTags.EINSTEINIUM_ORES).add(DFBlocks.EINSTEINIUM_ORE, DFBlocks.DEEPSLATE_EINSTEINIUM_ORE)
        getOrCreateTagBuilder(DFBlockTags.ASTRALITE_ORES).add(DFBlocks.ASTRALITE_ORE, DFBlocks.DEEPSLATE_ASTRALITE_ORE)
        getOrCreateTagBuilder(DFBlockTags.GRASS_ORES).add(DFBlocks.GRASS_ORE, DFBlocks.DEEPSLATE_GRASS_ORE)

        getOrCreateTagBuilder(DFBlockTags.HUMAN_ORES)
            .forceAddTag(DFBlockTags.EINSTEINIUM_ORES)
            .forceAddTag(DFBlockTags.ASTRALITE_ORES)
            .forceAddTag(DFBlockTags.GRASS_ORES)

        getOrCreateTagBuilder(DFBlockTags.HUMAN_BLOCKS).add(
            DFBlocks.ASTRALITE_BLOCK,
        )

        getOrCreateTagBuilder(DFBlockTags.ASTRALITE_BLOCK).add(DFBlocks.ASTRALITE_BLOCK)
    }

    private fun mineable() {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .forceAddTag(DFBlockTags.DWARF_FORGED_ORES)
            .forceAddTag(DFBlockTags.GEM_BLOCKS)
            .forceAddTag(DFBlockTags.METAL_BLOCKS)
            .forceAddTag(DFBlockTags.HUMAN_BLOCKS)

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .forceAddTag(DFBlockTags.GEM_ORES)
            .forceAddTag(DFBlockTags.GEM_BLOCKS)

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
            .forceAddTag(DFBlockTags.METAL_ORES)
            .forceAddTag(DFBlockTags.HUMAN_ORES)
    }

    private fun conventionalTags() {
        getOrCreateTagBuilder(ConventionalBlockTags.ORES)
            .forceAddTag(DFBlockTags.DWARF_FORGED_ORES)
        getOrCreateTagBuilder(ConventionalBlockTags.STORAGE_BLOCKS)
            .forceAddTag(DFBlockTags.DWARF_FORGED_STORAGE_BLOCKS)

    }
}