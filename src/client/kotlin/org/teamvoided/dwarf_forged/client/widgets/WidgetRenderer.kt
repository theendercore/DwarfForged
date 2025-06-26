package org.teamvoided.dwarf_forged.client.widgets

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import net.minecraft.block.HorizontalFacingBlock
import net.minecraft.block.entity.ChiseledBookshelfBlockEntity
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.GuiGraphics
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.render.DeltaTracker
import net.minecraft.entity.ItemEntity
import net.minecraft.item.ItemStack
import net.minecraft.registry.Holder
import net.minecraft.text.Text
import net.minecraft.util.Language
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.EntityHitResult
import net.minecraft.world.biome.Biome
import org.teamvoided.creative_works.client.DebugWidgetRegistry.addButton
import org.teamvoided.creative_works.client.DebugWidgetRegistry.addFloat
import org.teamvoided.dwarf_forged.client.gui.tooltip.drawHudTooltips
import org.teamvoided.dwarf_forged.client.util.getBiomeName
import org.teamvoided.dwarf_forged.client.util.getPlayerHit
import org.teamvoided.dwarf_forged.mixin.client.ChiseledBookshelfBlockAccessor
import org.teamvoided.dwarf_forged.net.FetchBookStackPayload

object WidgetRenderer {
    fun init() = HudRenderCallback.EVENT.register(::renderWidgetLayer)
    fun renderWidgetLayer(gui: GuiGraphics, delta: DeltaTracker) {
        val client = MinecraftClient.getInstance()
        if (client.options.hudHidden) return
        if (!client.options.perspective.isFirstPerson) return

        val font = client.textRenderer
        val screen = client.currentScreen

        val player = client.player ?: return
        val world = client.world ?: return

        val width = gui.scaledWindowWidth
        val height = gui.scaledWindowHeight
        val matrices = gui.matrices

        val white = 0xff_ff_ff


        if (Settings.onGroundItem.get()) {
            val scan = getPlayerHit(player, delta.getTickDelta(true))
            val target = if (scan is EntityHitResult) scan.entity else null
            if (target is ItemEntity) {
                gui.drawHudTooltips(font, target.stack, width / 2, height / 2 + 20)
            }
        }

        if (Settings.chiseledMonocle.get()) {
            val hit = client.crosshairTarget
            if (hit is BlockHitResult) {
                val entity = world.getBlockEntity(hit.blockPos)
                val state = world.getBlockState(hit.blockPos)
                if (entity is ChiseledBookshelfBlockEntity) {
                    if (state.get(HorizontalFacingBlock.FACING) == hit.side) {
                        val slot = (state.block as ChiseledBookshelfBlockAccessor).df_invokeGetHitSlot(hit, state)
                        if (slot.isPresent) {
                            ClientPlayNetworking.send(FetchBookStackPayload(entity.pos, slot.asInt))

                            if (!Data.bookshelfStack.isEmpty) {
                                gui.drawItem(Data.bookshelfStack, width / 2 - 8, height / 2 + 8)
                                if (Screen.hasShiftDown()) {
                                    gui.drawHudTooltips(font, Data.bookshelfStack, width / 2, height / 2 + 32)
                                }
                            }
                        }
                        Data.bookshelfStack = ItemStack.EMPTY
                    }
                }
            }
        }

        if (Settings.currentBiome.get()) {
            Data.currentBiome = world.getBiome(player.blockPos)
            Data.currentBiome?.let { biome ->
                gui.drawCenteredShadowedText(font, getBiomeName(biome), width / 2, height - 80, white)
            }
        }

        if (false){

        }
    }

    object Settings {
        var onGroundItem = addButton("OnGroundItem")
        var chiseledMonocle = addButton("ChiseledMonocle")
        var currentBiome = addButton("CurrentBiome")
    }

    object Data {
        var bookshelfStack: ItemStack = ItemStack.EMPTY
        var currentBiome: Holder<Biome>? = null
    }
}