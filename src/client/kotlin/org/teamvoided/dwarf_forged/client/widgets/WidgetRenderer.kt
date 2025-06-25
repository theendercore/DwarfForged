package org.teamvoided.dwarf_forged.client.widgets

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.GuiGraphics
import net.minecraft.client.render.DeltaTracker
import net.minecraft.entity.ItemEntity
import net.minecraft.util.hit.EntityHitResult
import org.teamvoided.dwarf_forged.client.gui.tooltip.CenteredTooltipPositioner
import org.teamvoided.dwarf_forged.client.gui.tooltip.drawTooltip
import org.teamvoided.dwarf_forged.client.util.getPlayerHit

object WidgetRenderer {
    fun init() = HudRenderCallback.EVENT.register(::renderWidgetLayer)
    fun renderWidgetLayer(gui: GuiGraphics, delta: DeltaTracker) {
        val client = MinecraftClient.getInstance()

        val font = client.textRenderer
        val screen = client.currentScreen

        val player = client.player ?: return
        val world = client.world ?: return

        val width = gui.scaledWindowWidth
        val height = gui.scaledWindowHeight
        val matrices = gui.matrices


        if (Settings.onGroundItem) {
            val scan = getPlayerHit(player, delta.getTickDelta(true))
            val target = if (scan is EntityHitResult) scan.entity else null
            if (target is ItemEntity) {
                matrices.push()
                matrices.translate(0f, 0f, -100f)
                gui.drawTooltip(font, target.stack, width / 2, height / 2 + 20, CenteredTooltipPositioner.INSTANCE)
                matrices.pop()
            }
        }
    }

    object Settings {
        var onGroundItem = true
        var chiseledMonocle = true
    }
}