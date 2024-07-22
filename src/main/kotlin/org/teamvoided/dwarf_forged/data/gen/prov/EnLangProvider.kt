package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.item.Item
import net.minecraft.registry.HolderLookup
import net.minecraft.registry.Registries
import net.minecraft.util.Identifier
import org.apache.commons.lang3.text.WordUtils
import org.teamvoided.dwarf_forged.data.tags.DFItemTags
import org.teamvoided.dwarf_forged.init.DFItems
import org.teamvoided.dwarf_forged.init.DFTabs
import org.teamvoided.dwarf_forged.util.DFBlockLists
import java.util.concurrent.CompletableFuture

class EnLangProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) : FabricLanguageProvider(o, r) {
    private val blockOfList = (DFBlockLists.METAL_BLOCKS + DFBlockLists.RAW_BLOCKS +
            DFBlockLists.RAW_HUMAN_ORES + DFBlockLists.HUMAN_BLOCKS).map { it.asItem() }

    override fun generateTranslations(lookup: HolderLookup.Provider, gen: TranslationBuilder) {
        blockOfList.forEach { gen.add(it.translationKey, blockOf(it)) }

        DFItems.tabItems.filter { !blockOfList.contains(it) }.forEach { gen.add(it.translationKey, lang(it.id)) }

        DFTabs.DF_TAB.key.ifPresent { gen.add(it, "Dwarf Forged") }

        DFItemTags.ALL_TAGS.forEach { gen.add(it, lang(it.id)) }
        gen.add("dwarf_forged", "Dwarf Forged")
    }

    private fun lang(item: Identifier): String = WordUtils.capitalize(item.path.replace("_", " "))

    private val Item.id get() = Registries.ITEM.getId(this)

    private fun blockOf(block: Item): String = "Block of ${lang(block.asItem().id).replace(" Block", "")}"
}