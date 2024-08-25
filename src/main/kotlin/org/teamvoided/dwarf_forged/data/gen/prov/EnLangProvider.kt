@file:Suppress("DEPRECATION")

package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.HolderLookup
import net.minecraft.util.Identifier
import org.apache.commons.lang3.text.WordUtils
import org.teamvoided.dwarf_forged.data.tags.DFItemTags
import org.teamvoided.dwarf_forged.init.DFItems
import org.teamvoided.dwarf_forged.init.DFTabs
import org.teamvoided.dwarf_forged.util.toId
import java.util.concurrent.CompletableFuture

class EnLangProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) : FabricLanguageProvider(o, r) {
    override fun generateTranslations(lookup: HolderLookup.Provider, gen: TranslationBuilder) {
        DFItems.ITEMS.forEach { gen.add(it.translationKey, it.toId().lang()) }
        DFTabs.DF_TAB.key.ifPresent { gen.add(it, "Dwarf Forged") }

        DFItemTags.ALL_TAGS.forEach { gen.add(it, it.id.lang()) }

        gen.add("dwarf_forged", "Dwarf Forged")
    }

    private fun Identifier.lang(): String =
        WordUtils.capitalize(this.path.replace("_", " ").replace("/", " "))
}
