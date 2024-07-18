package org.teamvoided.dwarf_forged.init

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.util.register

object DFItems {
    val tabItems = mutableListOf<Item>()
    fun init() {}

    val BLUE_SKY_SHARD = register("blue_sky_shard", Item(Item.Settings()))
    val CITRINE_SHARD = register("citrine_shard", Item(Item.Settings()))

    fun <T : Item> register(name: String, item: T): Item {
        val regItem = Registries.ITEM.register(name, item)
        tabItems.add(regItem)
        return regItem
    }

}
