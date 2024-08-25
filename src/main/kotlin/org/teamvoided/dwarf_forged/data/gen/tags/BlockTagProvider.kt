package org.teamvoided.dwarf_forged.data.gen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags
import net.minecraft.registry.HolderLookup
import net.minecraft.registry.tag.BlockTags
import org.teamvoided.dwarf_forged.data.tags.DFBlockTags
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.util.addAll
import org.teamvoided.dwarf_forged.util.datage.*
import java.util.concurrent.CompletableFuture

class BlockTagProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider.BlockTagProvider(o, r) {
    override fun configure(wrapperLookup: HolderLookup.Provider) {
        metaTags()
        vanillaTags()
        worldgenTags()
        conventionalTags()
        mineableTags()

        blueSky()
        modTags()
    }

    private fun metaTags() {
        getOrCreateTagBuilder(DFBlockTags.ROCKS)
            .forceAddTag(DFBlockTags.STONES)
    }

    private fun vanillaTags() {
        getOrCreateTagBuilder(BlockTags.STAIRS).addAll(STAIRS)
        getOrCreateTagBuilder(BlockTags.SLABS).addAll(SLABS)
        getOrCreateTagBuilder(BlockTags.WALLS).addAll(WALLS)
    }

    private fun worldgenTags() {
        getOrCreateTagBuilder(BlockTags.BASE_STONE_OVERWORLD)
            .forceAddTag(DFBlockTags.STONES)

        getOrCreateTagBuilder(BlockTags.STONE_ORE_REPLACEABLES)
            .forceAddTag(DFBlockTags.STONES)
    }

    private fun conventionalTags() {
        getOrCreateTagBuilder(ConventionalBlockTags.STONES).forceAddTag(DFBlockTags.STONES)

        getOrCreateTagBuilder(ConventionalBlockTags.BUDDING_BLOCKS).add(DFBlocks.BUDDING_BLUE_SKY)
        getOrCreateTagBuilder(ConventionalBlockTags.CLUSTERS).add(DFBlocks.BLUE_SKY_CLUSTER)
        getOrCreateTagBuilder(ConventionalBlockTags.BUDS)
            .add(DFBlocks.LARGE_BLUE_SKY_BUD, DFBlocks.MEDIUM_BLUE_SKY_BUD, DFBlocks.SMALL_BLUE_SKY_BUD)

    }

    private fun mineableTags() {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .addAll(PICKAXE_MINEABLE)
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .addAll(AXE_MINEABLE)
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
            .addAll(SHOVEL_MINEABLE)
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
            .addAll(HOE_MINEABLE)

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
            .addAll(NEEDS_STONE)
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .addAll(NEEDS_IRON)
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .addAll(NEEDS_DIAMOND)
    }

    private fun blueSky() {
        getOrCreateTagBuilder(DFBlockTags.BLUE_SKY).add(
            DFBlocks.BLUE_SKY_BLOCK,
            DFBlocks.BLUE_SKY_CLUSTER,
            DFBlocks.LARGE_BLUE_SKY_BUD,
            DFBlocks.MEDIUM_BLUE_SKY_BUD,
            DFBlocks.SMALL_BLUE_SKY_BUD,
            DFBlocks.BUDDING_BLUE_SKY,
        )
        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS).add(DFBlocks.BLUE_SKY_BLOCK, DFBlocks.BUDDING_BLUE_SKY)
        getOrCreateTagBuilder(BlockTags.VIBRATION_RESONATORS).add(DFBlocks.BLUE_SKY_BLOCK)
        getOrCreateTagBuilder(BlockTags.INSIDE_STEP_SOUND_BLOCKS).add(DFBlocks.SMALL_BLUE_SKY_BUD)
    }

    private fun modTags() {
        getOrCreateTagBuilder(DFBlockTags.STONES)
            .add(DFBlocks.ORBITAL_GRANITE)
            .add(DFBlocks.MUDROCK)
    }
}
