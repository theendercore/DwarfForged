package org.teamvoided.dwarf_forged.init

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.util.Item
import org.teamvoided.dwarf_forged.util.addAndGet
import org.teamvoided.dwarf_forged.util.register

object DFItems {
    val ITEMS = mutableSetOf<Item>()
    fun init() = Unit

    val COPPER_NUGGET = register("copper_nugget", Item())
    val BLUE_SKY_SHARD = register("blue_sky_shard", Item())

    fun <T : Item> register(name: String, item: T): Item = ITEMS.addAndGet(registerNoTab(name, item))
    private fun <T : Item> registerNoTab(name: String, item: T): Item = Registries.ITEM.register(name, item)
}
