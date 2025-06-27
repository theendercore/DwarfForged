package org.teamvoided.dwarf_forged.client.util

import com.mojang.blaze3d.systems.RenderSystem
import net.minecraft.block.entity.MobSpawnerBlockEntity
import net.minecraft.client.MinecraftClient
import net.minecraft.client.font.TextRenderer
import net.minecraft.client.gui.GuiGraphics
import net.minecraft.client.render.Camera
import net.minecraft.client.render.CameraSubmersionType
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.registry.Holder
import net.minecraft.text.Text
import net.minecraft.util.Formatting
import net.minecraft.util.Language
import net.minecraft.util.math.MathHelper
import net.minecraft.world.MobSpawnerLogic
import net.minecraft.world.biome.Biome
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.client.widgets.WidgetRenderer
import org.teamvoided.dwarf_forged.mixin.client.MobSpawnerLogicAccessor

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

fun renderSpawnerInfo(
    be: MobSpawnerBlockEntity, mobSpawnerLogic: MobSpawnerLogic,
    delta: Float, matrices: MatrixStack, vertexConsumers: VertexConsumerProvider,
) {
    if (WidgetRenderer.Settings.spawnerInfo.get() != 1) return

    val access = mobSpawnerLogic as MobSpawnerLogicAccessor
    val client = MinecraftClient.getInstance()

    val textList = mapOf(
        "Spawn Delay: " to access.df_getSpawnDelay(),
        "Min Spawn Dealy: " to access.df_getMinSpawnDelay(),
        "Max Spawn Dealy: " to access.df_getMaxSpawnDelay(),
        "Spawn Count: " to access.df_getSpawnCount(),
        "Max Nearby Entities: " to access.df_getMaxNearbyEntities(),
        "Required Player Range: " to access.df_getRequiredPlayerRange(),
        "Spawn Range: " to access.df_getSpawnRange(),
    )
    matrices.push()
    matrices.translate(.5f, 1.3f, .5f)
    matrices.rotate(client.entityRenderDispatcher.rotation)
    matrices.scale(0.025f, -0.025f, 0.025f)


    val color = 0xff_ff_ff_ff.toInt()
    val font = client.textRenderer
    for ((idx, rawText) in textList.toList().withIndex()) {
        val text = Text.literal(rawText.first)
            .append(Text.literal("${rawText.second}").formatted(Formatting.GREEN))
        font.draw(
            text, font.getWidth(text) / -2f, idx * -(1f + font.fontHeight), color,
            true, matrices.peek().model, vertexConsumers,
            TextRenderer.TextLayerType.NORMAL, 0, 15728880
        )
    }

    matrices.pop()
}

fun getCustomFogStart(original: Float, camera: Camera, viewDistance: Float, cameraType: CameraSubmersionType): Float? {
    if (WidgetRenderer.Settings.lavaGoogles.get() > 0 && cameraType == CameraSubmersionType.LAVA) {
        val entity = camera.focusedEntity
        if (entity.isSpectator) return null
        if (entity is LivingEntity && entity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) {
            return -1f
        }
        return 0f
    }
    return null
}

fun getCustomFogEnd(original: Float, camera: Camera, viewDistance: Float, cameraType: CameraSubmersionType): Float? {
    if (WidgetRenderer.Settings.lavaGoogles.get() > 0 && cameraType == CameraSubmersionType.LAVA) {
        val entity = camera.focusedEntity
        if (entity.isSpectator) return null
        if (entity is LivingEntity && entity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) {
            return (viewDistance / 3.5f)
        }
        return 16f
    }
    return null
}