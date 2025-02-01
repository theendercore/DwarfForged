package org.teamvoided.dwarf_forged.util

import net.fabricmc.loader.api.FabricLoader
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import net.minecraft.world.gen.stateprovider.BlockStateProvider

fun isDev() = FabricLoader.getInstance().isDevelopmentEnvironment

fun Block.toProvider(): BlockStateProvider = BlockStateProvider.of(this)

val Item.path get() = this.toId().path

val <T> TagKey<T>.path get() = this.id.path


fun Item() = Item(Item.Settings())
fun BlockItem(block: Block) = BlockItem(block, Item.Settings())

fun itemTag(id: Identifier) = RegistryKeys.ITEM.tag(id)

fun String.text() = Text.translatable(this)

fun <T> MutableCollection<T>.addAndGet(entry: T): T {
    this.add(entry)
    return entry
}

fun <K, V> Map<K, V>.putAllAndGet(vararg pairs: Pair<K, V>): Map<K, V> {
    val modifiedMap = this.toMutableMap()
    modifiedMap.putAll(pairs)
    return modifiedMap
}
