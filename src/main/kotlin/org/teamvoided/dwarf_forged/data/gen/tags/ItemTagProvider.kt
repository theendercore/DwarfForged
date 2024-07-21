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
    }
}
