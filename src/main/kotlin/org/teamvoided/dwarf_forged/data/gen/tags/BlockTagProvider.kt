package org.teamvoided.dwarf_forged.data.gen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.registry.HolderLookup
import net.minecraft.registry.tag.BlockTags
import org.teamvoided.dwarf_forged.data.tags.DFBlockTags
import org.teamvoided.dwarf_forged.init.DFBlocks
import java.util.concurrent.CompletableFuture

class BlockTagProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider.BlockTagProvider(o, r) {
    override fun configure(wrapperLookup: HolderLookup.Provider) {
        gemOres()

        getOrCreateTagBuilder(DFBlockTags.DWARF_FORGED_ORES)
            .forceAddTag(DFBlockTags.GEM_ORES)


        mineable()
    }

    private fun gemOres() {
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
    }

    fun mineable() {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .forceAddTag(DFBlockTags.DWARF_FORGED_ORES)

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .forceAddTag(DFBlockTags.GEM_ORES)
    }
}