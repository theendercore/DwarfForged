package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.registry.HolderLookup
import org.teamvoided.dwarf_forged.data.tags.DFItemTags
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.init.DFItems
import org.teamvoided.dwarf_forged.util.compacting2x2
import org.teamvoided.dwarf_forged.util.revCompacting3x3
import org.teamvoided.dwarf_forged.util.smeltAndBlastOre
import java.util.concurrent.CompletableFuture

class RecipeProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) : FabricRecipeProvider(o, r) {
    override fun generateRecipes(gen: RecipeExporter) {
       gemOres(gen)
    }

    fun gemOres(gen: RecipeExporter) {
        gen.revCompacting3x3(DFItems.RUBY, DFBlocks.RUBY_BLOCK)
        gen.revCompacting3x3(DFItems.SAPPHIRE, DFBlocks.SAPPHIRE_BLOCK)
        gen.revCompacting3x3(DFItems.KYANITE, DFBlocks.KYANITE_BLOCK)
        gen.revCompacting3x3(DFItems.MOONSTONE, DFBlocks.MOONSTONE_BLOCK)
        gen.revCompacting3x3(DFItems.JADE, DFBlocks.JADE_BLOCK)
        gen.compacting2x2(DFItems.SMOKY_QUARTZ, DFBlocks.SMOKY_QUARTZ_BLOCK)
        gen.revCompacting3x3(DFItems.EUCLASE, DFBlocks.EUCLASE_BLOCK)
        gen.revCompacting3x3(DFItems.BORACITE, DFBlocks.BORACITE_BLOCK)
        gen.revCompacting3x3(DFItems.TOPAZ, DFBlocks.TOPAZ_BLOCK)
        gen.revCompacting3x3(DFItems.TOURMALINE, DFBlocks.TOURMALINE_BLOCK)
        gen.revCompacting3x3(DFItems.SPINEL, DFBlocks.SPINEL_BLOCK)
        gen.revCompacting3x3(DFItems.HEMATITE, DFBlocks.HEMATITE_BLOCK)
        gen.revCompacting3x3(DFItems.CARNELIAN, DFBlocks.CARNELIAN_BLOCK)

        gen.smeltAndBlastOre(DFItemTags.RUBY_ORES, DFItems.RUBY)
        gen.smeltAndBlastOre(DFItemTags.SAPPHIRE_ORES, DFItems.SAPPHIRE)
        gen.smeltAndBlastOre(DFItemTags.KYANITE_ORES, DFItems.KYANITE)
        gen.smeltAndBlastOre(DFItemTags.MOONSTONE_ORES, DFItems.MOONSTONE)
        gen.smeltAndBlastOre(DFItemTags.JADE_ORES, DFItems.JADE)
        gen.smeltAndBlastOre(DFItemTags.SMOKY_QUARTZ_ORES, DFItems.SMOKY_QUARTZ)
        gen.smeltAndBlastOre(DFItemTags.EUCLASE_ORES, DFItems.EUCLASE)
        gen.smeltAndBlastOre(DFItemTags.BORACITE_ORES, DFItems.BORACITE)
        gen.smeltAndBlastOre(DFItemTags.TOPAZ_ORES, DFItems.TOPAZ)
        gen.smeltAndBlastOre(DFItemTags.TOURMALINE_ORES, DFItems.TOURMALINE)
        gen.smeltAndBlastOre(DFItemTags.SPINEL_ORES, DFItems.SPINEL)
        gen.smeltAndBlastOre(DFItemTags.HEMATITE_ORES, DFItems.HEMATITE)
        gen.smeltAndBlastOre(DFItemTags.CARNELIAN_ORES, DFItems.CARNELIAN)
    }
}