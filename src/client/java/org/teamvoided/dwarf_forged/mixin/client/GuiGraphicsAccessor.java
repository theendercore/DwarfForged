package org.teamvoided.dwarf_forged.mixin.client;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.client.gui.tooltip.TooltipPositioner;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.List;

@Mixin(GuiGraphics.class)
public interface GuiGraphicsAccessor {

    @Invoker("drawTooltip")
    void wf_invokeDrawTooltip(TextRenderer textRenderer, List<TooltipComponent> tooltip, int x, int y, TooltipPositioner positioner);
}
