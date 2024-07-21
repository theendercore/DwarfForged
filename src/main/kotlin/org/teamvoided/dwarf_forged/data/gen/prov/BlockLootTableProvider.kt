package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.registry.HolderLookup
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.init.DFItems
import org.teamvoided.dwarf_forged.util.DFBlockLists
import java.util.concurrent.CompletableFuture

class BlockLootTableProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) :
    FabricBlockLootTableProvider(o, r) {
    private val dropSelf = DFBlockLists.GEM_BLOCKS + DFBlockLists.GEM_BLOCKS

    private val ores = mapOf(
        DFBlocks.RUBY_ORE to DFItems.RUBY,
        DFBlocks.DEEPSLATE_RUBY_ORE to DFItems.RUBY,

        DFBlocks.SAPPHIRE_ORE to DFItems.SAPPHIRE,
        DFBlocks.DEEPSLATE_SAPPHIRE_ORE to DFItems.SAPPHIRE,

        DFBlocks.KYANITE_ORE to DFItems.KYANITE,
        DFBlocks.DEEPSLATE_KYANITE_ORE to DFItems.KYANITE,

        DFBlocks.MOONSTONE_ORE to DFItems.MOONSTONE,
        DFBlocks.DEEPSLATE_MOONSTONE_ORE to DFItems.MOONSTONE,

        DFBlocks.JADE_ORE to DFItems.JADE,
        DFBlocks.DEEPSLATE_JADE_ORE to DFItems.JADE,

        DFBlocks.NETHER_SMOKY_QUARTZ_ORE to DFItems.SMOKY_QUARTZ,

        DFBlocks.EUCLASE_ORE to DFItems.EUCLASE,
        DFBlocks.DEEPSLATE_EUCLASE_ORE to DFItems.EUCLASE,

        DFBlocks.BORACITE_ORE to DFItems.BORACITE,
        DFBlocks.DEEPSLATE_BORACITE_ORE to DFItems.BORACITE,

        DFBlocks.TOPAZ_ORE to DFItems.TOPAZ,
        DFBlocks.DEEPSLATE_TOPAZ_ORE to DFItems.TOPAZ,

        DFBlocks.TOURMALINE_ORE to DFItems.TOURMALINE,
        DFBlocks.DEEPSLATE_TOURMALINE_ORE to DFItems.TOURMALINE,

        DFBlocks.SPINEL_ORE to DFItems.SPINEL,
        DFBlocks.DEEPSLATE_SPINEL_ORE to DFItems.SPINEL,

        DFBlocks.HEMATITE_ORE to DFItems.HEMATITE,
        DFBlocks.DEEPSLATE_HEMATITE_ORE to DFItems.HEMATITE,

        DFBlocks.CARNELIAN_ORE to DFItems.CARNELIAN,
        DFBlocks.DEEPSLATE_CARNELIAN_ORE to DFItems.CARNELIAN,
    )

    override fun generate() {
        dropSelf.forEach(::addDrop)
        ores.forEach { (block, item) -> add(block) { oreDrops(block, item) } }
    }
}