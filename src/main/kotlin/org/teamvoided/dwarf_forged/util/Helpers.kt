package org.teamvoided.dwarf_forged.util

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.ItemConvertible
import net.minecraft.item.ItemGroup
import net.minecraft.registry.*
import net.minecraft.registry.tag.TagKey
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import net.minecraft.world.gen.decorator.BiomePlacementModifier
import net.minecraft.world.gen.decorator.CountPlacementModifier
import net.minecraft.world.gen.decorator.InSquarePlacementModifier
import net.minecraft.world.gen.feature.*
import net.minecraft.world.gen.stateprovider.BlockStateProvider
import org.teamvoided.dwarf_forged.DwarfForged.id

fun <T> Registry<T>.register(id: String, entry: T): T = Registry.register(this, id(id), entry)
fun <T> Registry<T>.registerHolder(id: String, entry: T): Holder<T> = Registry.registerHolder(this, id(id), entry)
fun <T> Registry<T>.register(id: Identifier, entry: T): T = Registry.register(this, id, entry)
fun <T> Registry<T>.registerHolder(id: Identifier, entry: T): Holder<T> = Registry.registerHolder(this, id, entry)

fun <T, R : Registry<T>> RegistryKey<R>.tag(id: Identifier): TagKey<T> = TagKey.of(this, id)
fun <T, R : Registry<T>> RegistryKey<R>.key(id: Identifier): RegistryKey<T> = RegistryKey.of(this, id)

fun Block.toProvider(): BlockStateProvider = BlockStateProvider.of(this)

fun Item.toId() = Registries.ITEM.getId(this)
val Item.path get() = Registries.ITEM.getId(this).path
fun ItemConvertible.toId() = this.asItem().toId()

val <T> TagKey<T>.path get() = this.id.path


fun String.text() = Text.translatable(this)

fun ItemGroup.ItemStackCollector.addItems(vararg items: ItemConvertible): ItemGroup.ItemStackCollector {
    items.forEach { this.addItem(it) }
    return this
}

fun <FC : FeatureConfig, F : Feature<FC>> BootstrapContext<ConfiguredFeature<*, *>>.registerConfiguredFeature(
    registryKey: RegistryKey<ConfiguredFeature<*, *>>,
    feature: F,
    featureConfig: FC
): Holder.Reference<ConfiguredFeature<*, *>> = this.register(registryKey, ConfiguredFeature(feature, featureConfig))

fun BootstrapContext<ConfiguredFeature<*, *>>.registerConfiguredFeature(
    registryKey: RegistryKey<ConfiguredFeature<*, *>>, feature: Feature<DefaultFeatureConfig>
) = this.registerConfiguredFeature(registryKey, feature, FeatureConfig.DEFAULT)

fun commonOrePlacementModifiers(count: Int, modifier: PlacementModifier): List<PlacementModifier> {
    return listOf(
        CountPlacementModifier.create(count),
        InSquarePlacementModifier.getInstance(),
        modifier,
        BiomePlacementModifier.getInstance()
    )
}