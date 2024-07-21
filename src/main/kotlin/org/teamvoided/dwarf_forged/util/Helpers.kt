package org.teamvoided.dwarf_forged.util

import net.minecraft.item.Item
import net.minecraft.item.ItemConvertible
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Holder
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.tag.TagKey
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import org.teamvoided.dwarf_forged.DwarfForged.id

fun <T> Registry<T>.register(id: String, entry: T): T = Registry.register(this, id(id), entry)
fun <T> Registry<T>.registerHolder(id: String, entry: T): Holder<T> = Registry.registerHolder(this, id(id), entry)
fun <T> Registry<T>.register(id: Identifier, entry: T): T = Registry.register(this, id, entry)
fun <T> Registry<T>.registerHolder(id: Identifier, entry: T): Holder<T> = Registry.registerHolder(this, id, entry)

fun <T, R : Registry<T>> RegistryKey<R>.tag(id: Identifier) = TagKey.of(this, id)


fun Item.toId() = Registries.ITEM.getId(this)
val Item.path get() = Registries.ITEM.getId(this).path
fun ItemConvertible.toId() = this.asItem().toId()

val <T> TagKey<T>.path get() = this.id.path


fun String.text() = Text.translatable(this)

fun ItemGroup.ItemStackCollector.addItems(vararg items: ItemConvertible): ItemGroup.ItemStackCollector {
    items.forEach { this.addItem(it) }
    return this
}