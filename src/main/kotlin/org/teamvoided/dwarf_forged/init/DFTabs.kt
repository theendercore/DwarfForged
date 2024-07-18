package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.util.register
import org.teamvoided.dwarf_forged.util.text

object DFTabs {
    fun init() {}
    val DF_TAB = register("dwarf_forged",
        FabricItemGroup.builder()
            .icon { DFItems.BLUE_SKY_SHARD.defaultStack }
            .name("DwarfForged".text())
            .entries { _, entries -> entries.addStacks(DFItems.tabItems.map { it.defaultStack }) }
    )

    private fun register(name: String, builder: ItemGroup.Builder): ItemGroup = Registries.ITEM_GROUP.register(name, builder.build())
}