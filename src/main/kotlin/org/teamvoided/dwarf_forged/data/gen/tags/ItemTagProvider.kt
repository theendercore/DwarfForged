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
        copy(DFBlockTags.RUBY_ORE, DFItemTags.RUBY_ORE)
        copy(DFBlockTags.SAPPHIRE_ORE, DFItemTags.SAPPHIRE_ORE)
        copy(DFBlockTags.KYANITE_ORE, DFItemTags.KYANITE_ORE)
        copy(DFBlockTags.MOONSTONE_ORE, DFItemTags.MOONSTONE_ORE)
        copy(DFBlockTags.JADE_ORE, DFItemTags.JADE_ORE)
        copy(DFBlockTags.SMOKY_QUARTZ_ORE, DFItemTags.SMOKY_QUARTZ_ORE)
        copy(DFBlockTags.EUCLASE_ORE, DFItemTags.EUCLASE_ORE)
        copy(DFBlockTags.BORACITE_ORE, DFItemTags.BORACITE_ORE)
        copy(DFBlockTags.TOPAZ_ORE, DFItemTags.TOPAZ_ORE)
        copy(DFBlockTags.TOURMALINE_ORE, DFItemTags.TOURMALINE_ORE)
        copy(DFBlockTags.SPINEL_ORE, DFItemTags.SPINEL_ORE)
        copy(DFBlockTags.HEMATITE_ORE, DFItemTags.HEMATITE_ORE)
        copy(DFBlockTags.CARNELIAN_ORE, DFItemTags.CARNELIAN_ORE)
    }
}
