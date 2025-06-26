package org.teamvoided.dwarf_forged.client.gui.tooltip

import net.minecraft.client.MinecraftClient
import net.minecraft.client.font.TextRenderer
import net.minecraft.client.gui.GuiGraphics
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.tooltip.DefaultTooltipPositioner
import net.minecraft.client.gui.tooltip.TooltipComponent
import net.minecraft.client.gui.tooltip.TooltipPositioner
import net.minecraft.item.ItemStack
import net.minecraft.util.Util
import org.teamvoided.dwarf_forged.mixin.client.GuiGraphicsAccessor

fun GuiGraphics.drawTooltip(
    textRenderer: TextRenderer, stack: ItemStack, x: Int, y: Int,
    positioner: TooltipPositioner = DefaultTooltipPositioner.INSTANCE,
) {
    val list = Screen.getTooltipFromItem(MinecraftClient.getInstance(), stack).stream()
        .map { TooltipComponent.of(it.asOrderedText()) }
        .collect(Util.toArrayList())
    stack.tooltipData.ifPresent { list.add(if (list.isEmpty()) 0 else 1, TooltipComponent.of(it)) }
    (this as GuiGraphicsAccessor).wf_invokeDrawTooltip(textRenderer, list, x, y, positioner)
}

fun GuiGraphics.drawHudTooltips(
    textRenderer: TextRenderer, stack: ItemStack, x: Int, y: Int,
    positioner: TooltipPositioner = CenteredTooltipPositioner.INSTANCE,
){
    matrices.push()
    matrices.translate(0f, 0f, -1000f)
    drawTooltip(textRenderer, stack, x, y, positioner)
    matrices.pop()

}