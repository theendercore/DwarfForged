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
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.item.ItemStack
import net.minecraft.registry.Holder
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.EntityHitResult
import net.minecraft.util.math.MathHelper
import net.minecraft.util.math.MathHelper.lengthSquared
import net.minecraft.world.biome.Biome
import org.teamvoided.creative_works.client.DebugWidgetRegistry.addInt
import org.teamvoided.creative_works.client.DebugWidgetRegistry.addString
import org.teamvoided.dwarf_forged.client.gui.tooltip.drawHudTooltips
import org.teamvoided.dwarf_forged.client.util.getBiomeName
import org.teamvoided.dwarf_forged.client.util.getPlayerHit
import org.teamvoided.dwarf_forged.client.util.renderArmorBar
import org.teamvoided.dwarf_forged.mixin.client.ChiseledBookshelfBlockAccessor
import org.teamvoided.dwarf_forged.net.FetchBookStackPayload
import kotlin.math.abs
import kotlin.math.max

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

        val isCreative = player.isCreative

        val white = 0xff_ff_ff


        if (Settings.onGroundItem.get() > 0) {
            val scan = getPlayerHit(player, delta.getTickDelta(true))
            val target = if (scan is EntityHitResult) scan.entity else null
            if (target is ItemEntity) {
                gui.drawHudTooltips(font, target.stack, width / 2, height / 2 + 20)
            }
        }

        if (Settings.chiseledMonocle.get() > 0) {
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

        if (Settings.currentBiome.get() > 0) {
            Data.currentBiome = world.getBiome(player.blockPos)
            Data.currentBiome?.let { biome ->
                gui.drawCenteredShadowedText(font, getBiomeName(biome), width / 2, height - 80, white)
            }
        }

        if (Settings.redstoneInfo.get() > 0) {
            val hit = client.crosshairTarget
            if (hit is BlockHitResult) {
                val pos = hit.blockPos
                val state = world.getBlockState(pos)

                val isPowerSource = state.isRedstonePowerSource
                val received = world.getReceivedRedstonePower(pos)
                val emitted = world.getEmittedRedstonePower(pos, hit.side)
                val isPowered = world.isReceivingRedstonePower(pos)
                if (isPowerSource)
                    gui.drawCenteredShadowedText(font, "Power Source", width / 2, 16, white)
                if (isPowered)
                    gui.drawCenteredShadowedText(font, "Is Being powered", width / 2, 32, white)
                if (isPowerSource || received > 0)
                    gui.drawCenteredShadowedText(font, "Received: $received", width / 2, 48, white)
                if (isPowerSource || emitted > 0)
                    gui.drawCenteredShadowedText(font, "Emitted: $emitted", width / 2, 64, white)
            }
        }

        if (Settings.speedometer.get() > 0) {
            val x = player.x - player.lastRenderX
            val y = player.y - player.lastRenderY
            val z = player.z - player.lastRenderZ
            val text =
                if (Data.speedType.get() == "ALL") String.format("Speed: %.3f b/s", lengthSquared(x, y, z) * 20)
                else String.format("Speed: x: %.3f y: %.3f z: %.3f b/s", abs(x * 20), abs(y * 20), abs(z * 20))
            gui.drawShadowedText(font, text, 10, 10, white)
        }

        if (Settings.armorToughness.get() > 0 && !isCreative) {
            val health =
                max(
                    player.getAttributeValue(EntityAttributes.GENERIC_MAX_HEALTH).toInt(),
                    MathHelper.ceil(player.health)
                )
            val absorption = MathHelper.ceil(player.absorptionAmount).toFloat()
            val uncappedMaxHealth = MathHelper.ceil((health + absorption) / 2.0f / 10.0f)
            val cappedMaxHealth = max(10 - (uncappedMaxHealth - 2), 3)
            gui.renderArmorBar(player, height - 49, width / 2 - 91, uncappedMaxHealth, cappedMaxHealth)
        }

        if (Settings.xzCoords.get() > 0) {
            gui.drawShadowedText(font, String.format("X: %.2f Z: %.2f", player.x, player.z), 10, height - 16, white)
        }

        if (Settings.yCoords.get() > 0) {
            gui.drawShadowedText(
                font, String.format("Y: %.2f", player.y), 10, height - (16 + font.fontHeight + 1), white
            )
        }

        if (Settings.barometer.get() > 0) {
            val biome = world.getBiome(player.blockPos).value()
            val tickDelta = delta.getTickDelta(false)
            val isThunder = world.getThunderGradient(tickDelta) > 0f
            val text = if (world.getRainGradient(tickDelta) > 0f)
                when (biome.getPrecipitationAt(player.blockPos)) {
                    Biome.Precipitation.NONE -> {
                        if (isThunder) "Thunderous Gloom" else "Gloom"
                    }

                    Biome.Precipitation.SNOW -> {
                        if (isThunder) "Snow Storm" else "Snow"
                    }

                    Biome.Precipitation.RAIN -> {
                        if (isThunder) "Storm" else "Rain"
                    }
                }
            else "Sunny"
            gui.drawShadowedText(font, "Weather: $text", 10, height - 16, white)
        }
    }

    object Settings {
        var onGroundItem = addInt("OnGroundItem")
        var chiseledMonocle = addInt("ChiseledMonocle")
        var currentBiome = addInt("CurrentBiome")
        var redstoneInfo = addInt("RedstoneInfo")
        var paciFist = addInt("PaciFist")
        var speedometer = addInt("Speedometer")
        var armorToughness = addInt("ArmorToughness")
        var spawnerInfo = addInt("SpawnerInfo")
        var lavaGoogles = addInt("LavaGoogles")
        var xzCoords = addInt("XZCoords")
        var yCoords = addInt("YCoords")
        var barometer = addInt("Barometer")
    }

    object Data {
        var bookshelfStack: ItemStack = ItemStack.EMPTY
        var currentBiome: Holder<Biome>? = null
        var speedType = addString("SpeedType", "ALL")
    }
}