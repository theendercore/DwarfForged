package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Holder
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.DwarfForged.MODID
import org.teamvoided.dwarf_forged.util.registerHolder
import org.teamvoided.dwarf_forged.util.text

object DFTabs {
    fun init() {}
    val DF_TAB = register("dwarf_forged",
        FabricItemGroup.builder()
            .icon { DFItems.BLUE_SKY_SHARD.defaultStack }
            .name("itemGroup.$MODID.dwarfForged".text())
            .entries { _, entries -> entries.addStacks(DFItems.tabItems.map { it.defaultStack }) }
    )

    private fun register(name: String, builder: ItemGroup.Builder): Holder<ItemGroup> = Registries.ITEM_GROUP.registerHolder(name, builder.build())
}