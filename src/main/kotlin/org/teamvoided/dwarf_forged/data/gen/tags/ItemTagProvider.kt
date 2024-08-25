package org.teamvoided.dwarf_forged.data.gen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags
import net.minecraft.registry.HolderLookup
import net.minecraft.registry.tag.BlockTags
import net.minecraft.registry.tag.ItemTags
import org.teamvoided.dwarf_forged.data.tags.DFBlockTags
import org.teamvoided.dwarf_forged.data.tags.DFItemTags
import org.teamvoided.dwarf_forged.init.DFItems
import java.util.concurrent.CompletableFuture

class ItemTagProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>, p: BlockTagProvider) :
    FabricTagProvider.ItemTagProvider(o, r, p) {

    override fun configure(wrapperLookup: HolderLookup.Provider) {
        conventionalTags()

        copyMetaTags()
        copyVanillaTags()
        copyConventionalTags()
    }

    private fun conventionalTags() {
        getOrCreateTagBuilder(DFItemTags.GEMS_BLUE_SKY).add(DFItems.BLUE_SKY_SHARD)
        getOrCreateTagBuilder(DFItemTags.COPPER_NUGGETS).add(DFItems.COPPER_NUGGET)
        getOrCreateTagBuilder(ConventionalItemTags.NUGGETS).forceAddTag(DFItemTags.COPPER_NUGGETS)
    }


    private fun copyMetaTags() {
        copy(DFBlockTags.ROCKS, DFItemTags.ROCKS)
        copy(DFBlockTags.STONES, DFItemTags.STONES)
    }

    private fun copyVanillaTags() {
        copy(BlockTags.STAIRS, ItemTags.STAIRS)
        copy(BlockTags.SLABS, ItemTags.SLABS)
        copy(BlockTags.WALLS, ItemTags.WALLS)
    }

    private fun copyConventionalTags() {
        copy(ConventionalBlockTags.STONES, ConventionalItemTags.STONES)

        copy(DFBlockTags.BLUE_SKY, DFItemTags.BLUE_SKY)

        copy(ConventionalBlockTags.BUDDING_BLOCKS, ConventionalItemTags.BUDDING_BLOCKS)
        copy(ConventionalBlockTags.CLUSTERS, ConventionalItemTags.CLUSTERS)
        copy(ConventionalBlockTags.BUDS, ConventionalItemTags.BUDS)
    }

}