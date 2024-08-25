package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.item.Items
import net.minecraft.recipe.RecipeCategory
import net.minecraft.registry.HolderLookup
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.init.DFItems
import org.teamvoided.dwarf_forged.util.datage.compact9To1
import org.teamvoided.dwarf_forged.util.datage.compacting2x2
import org.teamvoided.dwarf_forged.util.datage.from
import org.teamvoided.dwarf_forged.util.datage.uncompact1To9
import org.teamvoided.dwarf_forged.util.toId
import java.util.concurrent.CompletableFuture

class RecipeProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) : FabricRecipeProvider(o, r) {
    override fun generateRecipes(gen: RecipeExporter) {
        //Copper Nugget
        gen.uncompact1To9(RecipeCategory.MISC, DFItems.COPPER_NUGGET, Items.COPPER_INGOT)
        gen.compact9To1(
            RecipeCategory.MISC, Items.COPPER_INGOT, DFItems.COPPER_NUGGET,
            Items.COPPER_INGOT.toId().path, Items.COPPER_INGOT from DFItems.COPPER_NUGGET
        )
        //Blue Sky
        gen.compacting2x2(DFItems.BLUE_SKY_SHARD, DFBlocks.BLUE_SKY_BLOCK)
    }
}
