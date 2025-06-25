package org.teamvoided.dwarf_forged.client.gui.tooltip

import net.minecraft.client.gui.tooltip.TooltipPositioner
import org.joml.Vector2i
import org.joml.Vector2ic
import kotlin.math.max

open class CenteredTooltipPositioner() : TooltipPositioner {
    override fun position(screenWidth: Int, screenHeight: Int, x: Int, y: Int, width: Int, height: Int): Vector2ic {
        val vector2i = Vector2i(x, y)
            .add(-(width / 2), 0)
        this.preventOverflow(screenWidth, screenHeight, vector2i, width, height)
        return vector2i
    }

    open fun preventOverflow(maxWidth: Int, maxHeight: Int, pos: Vector2i, width: Int, height: Int) {
        if (pos.x + width > maxWidth) {
            pos.x = max(pos.x - 24 - width, 4)
        }

        val i = height + 3
        if (pos.y + i > maxHeight) {
            pos.y = maxHeight - i
        }
    }

    companion object {
        val INSTANCE = CenteredTooltipPositioner()
    }
}