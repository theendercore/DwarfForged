package org.teamvoided.dwarf_forged.util

import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider

fun <T> FabricTagProvider<T>.FabricTagBuilder.addAll(list: Iterable<T>): FabricTagProvider<T>.FabricTagBuilder {
    list.forEach{this.add(it)}
    return this
}
