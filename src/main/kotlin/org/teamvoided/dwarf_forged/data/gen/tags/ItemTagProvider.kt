package org.teamvoided.dwarf_forged.data.gen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.registry.HolderLookup
import org.teamvoided.dwarf_forged.data.tags.DFBlockTags
import org.teamvoided.dwarf_forged.data.tags.DFItemTags
import java.util.concurrent.CompletableFuture

class ItemTagProvider(
    o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>, p: FabricTagProvider.BlockTagProvider
) : FabricTagProvider.ItemTagProvider(o, r, p) {

    override fun configure(wrapperLookup: HolderLookup.Provider) {
        copyBlockTags()
    }

    fun copyBlockTags() {
        //Gem Ores
        copy(DFBlockTags.RUBY_ORE, DFItemTags.RUBY_ORES)
        copy(DFBlockTags.SAPPHIRE_ORE, DFItemTags.SAPPHIRE_ORES)
        copy(DFBlockTags.KYANITE_ORE, DFItemTags.KYANITE_ORES)
        copy(DFBlockTags.MOONSTONE_ORE, DFItemTags.MOONSTONE_ORES)
        copy(DFBlockTags.JADE_ORE, DFItemTags.JADE_ORES)
        copy(DFBlockTags.SMOKY_QUARTZ_ORE, DFItemTags.SMOKY_QUARTZ_ORES)
        copy(DFBlockTags.EUCLASE_ORE, DFItemTags.EUCLASE_ORES)
        copy(DFBlockTags.BORACITE_ORE, DFItemTags.BORACITE_ORES)
        copy(DFBlockTags.TOPAZ_ORE, DFItemTags.TOPAZ_ORES)
        copy(DFBlockTags.TOURMALINE_ORE, DFItemTags.TOURMALINE_ORES)
        copy(DFBlockTags.SPINEL_ORE, DFItemTags.SPINEL_ORES)
        copy(DFBlockTags.HEMATITE_ORE, DFItemTags.HEMATITE_ORES)
        copy(DFBlockTags.CARNELIAN_ORE, DFItemTags.CARNELIAN_ORES)
    }
}
