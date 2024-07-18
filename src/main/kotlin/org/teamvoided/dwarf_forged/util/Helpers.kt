package org.teamvoided.dwarf_forged.util

import net.minecraft.registry.Holder
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import org.teamvoided.dwarf_forged.DwarfForged.id

fun <T> Registry<T>.register(id: String, entry: T): T = Registry.register(this, id(id), entry)
fun <T> Registry<T>.register(id: Identifier, entry: T): T = Registry.register(this, id, entry)
fun <T> Registry<T>.registerHolder(id: Identifier, entry: T): Holder<T> = Registry.registerHolder(this, id, entry)


fun String.text() = Text.translatable(this)