package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.item.Items
import net.minecraft.recipe.RecipeCategory
import net.minecraft.registry.HolderLookup
import org.teamvoided.dwarf_forged.data.tags.DFItemTags
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.init.DFItems
import org.teamvoided.dwarf_forged.util.*
import java.util.concurrent.CompletableFuture

class RecipeProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) : FabricRecipeProvider(o, r) {
    override fun generateRecipes(gen: RecipeExporter) {
        gems(gen)
        metals(gen)
    }

    fun gems(gen: RecipeExporter) {
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

    fun metals(gen: RecipeExporter) {
        // copper nug
        gen.uncompact1To9(RecipeCategory.MISC, DFItems.COPPER_NUGGET, Items.COPPER_INGOT)
        gen.compact9To1(
            RecipeCategory.MISC, Items.COPPER_INGOT, DFItems.COPPER_NUGGET,
            Items.COPPER_INGOT.toId().path, Items.COPPER_INGOT from DFItems.COPPER_NUGGET
        )

        // raw metals
        gen.revCompacting3x3(DFItems.RAW_SILVER, DFBlocks.RAW_SILVER_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_COBALT, DFBlocks.RAW_COBALT_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_TUNGSTEN, DFBlocks.RAW_TUNGSTEN_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_IRIDIUM, DFBlocks.RAW_IRIDIUM_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_THALLIUM, DFBlocks.RAW_THALLIUM_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_BISMUTH, DFBlocks.RAW_BISMUTH_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_PLUTONIUM, DFBlocks.RAW_PLUTONIUM_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_URANIUM, DFBlocks.RAW_URANIUM_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_LEAD, DFBlocks.RAW_LEAD_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_TIN, DFBlocks.RAW_TIN_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_PALLADIUM, DFBlocks.RAW_PALLADIUM_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_ZINC, DFBlocks.RAW_ZINC_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_NICKEL, DFBlocks.RAW_NICKEL_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_ALUMINIUM, DFBlocks.RAW_ALUMINIUM_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_PLATINUM, DFBlocks.RAW_PLATINUM_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_TITANIUM, DFBlocks.RAW_TITANIUM_BLOCK)
        // raw human ores
        gen.revCompacting3x3(DFItems.RAW_EINSTEINIUM, DFBlocks.RAW_EINSTEINIUM_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_ASTRALITE, DFBlocks.RAW_ASTRALITE_BLOCK)
        gen.revCompacting3x3(DFItems.RAW_GRASS, DFBlocks.RAW_GRASS_BLOCK)

        // metals
        gen.metalCompacting(DFItems.SILVER_NUGGET, DFItems.SILVER_INGOT, DFBlocks.SILVER_BLOCK)
        // humans
        gen.metalCompacting(DFItems.ASTRALITE_NUGGET, DFItems.ASTRALITE_INGOT, DFBlocks.ASTRALITE_BLOCK)
    }

}
