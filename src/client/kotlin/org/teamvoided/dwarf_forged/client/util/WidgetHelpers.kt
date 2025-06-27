package org.teamvoided.dwarf_forged.client.util

import com.mojang.blaze3d.systems.RenderSystem
import net.minecraft.client.gui.GuiGraphics
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.registry.Holder
import net.minecraft.text.Text
import net.minecraft.util.Language
import net.minecraft.util.math.MathHelper
import net.minecraft.world.biome.Biome
import org.teamvoided.dwarf_forged.DwarfForged.id

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

val ARMOR_EMPTY = id("hud/toughness_empty")
val ARMOR_HALF = id("hud/toughness_half")
val ARMOR_FULL = id("hud/toughness_full")

fun GuiGraphics.renderArmorBar(player: PlayerEntity, y: Int, x: Int, uncappedMaxHealth: Int, cappedMaxHealth: Int) {
    val toughness = MathHelper.floor(player.getAttributeValue(EntityAttributes.GENERIC_ARMOR_TOUGHNESS))
    if (toughness > 0) {
        RenderSystem.enableBlend()
        val yOffset = y - (uncappedMaxHealth - 1) * cappedMaxHealth - 10
        for (i in 0..9) {
            val xOffset = x + i * 8
            if (i * 2 + 1 < toughness) drawGuiTexture(ARMOR_FULL, xOffset, yOffset, 9, 9)
            if (i * 2 + 1 == toughness) drawGuiTexture(ARMOR_HALF, xOffset, yOffset, 9, 9)
            if (i * 2 + 1 > toughness) drawGuiTexture(ARMOR_EMPTY, xOffset, yOffset, 9, 9)
        }
        RenderSystem.disableBlend()
    }
}