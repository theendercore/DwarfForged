package org.teamvoided.dwarf_forged.client.util

import net.minecraft.registry.Holder
import net.minecraft.text.Text
import net.minecraft.util.Language
import net.minecraft.world.biome.Biome

fun getBiomeName(biome: Holder<Biome>): Text {
    val possibleId = biome.getKey()
    if (possibleId.isEmpty) {
        return Text.literal("Biome not Registered! ${biome.value()}")
    }
    val id = possibleId.get()
    val string = id.value.toTranslationKey("biome")
    return if (Language.getInstance().hasTranslation(string)) Text.translatable(string)
    else Text.literal(id.toString())
}