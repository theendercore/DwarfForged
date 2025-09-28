@file:Suppress("DEPRECATION")

package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.HolderLookup
import net.minecraft.util.Identifier
import org.apache.commons.lang3.text.WordUtils
import java.util.concurrent.CompletableFuture

class EnLangProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) : FabricLanguageProvider(o, r) {
    override fun generateTranslations(lookup: HolderLookup.Provider, gen: TranslationBuilder) {
        gen.add("dwarf_forged", "Dwarf Forged")
    }

    private fun Identifier.lang(): String =
        WordUtils.capitalize(this.path.replace("_", " ").replace("/", " "))
}
