@file:Suppress("unused")

package org.teamvoided.dwarf_forged.util.datage

import net.minecraft.block.Block
import net.minecraft.registry.BootstrapContext
import net.minecraft.registry.Holder
import net.minecraft.registry.RegistryKey
import net.minecraft.structure.rule.TagMatchRuleTest
import net.minecraft.world.gen.decorator.BiomePlacementModifier
import net.minecraft.world.gen.decorator.CountPlacementModifier
import net.minecraft.world.gen.decorator.InSquarePlacementModifier
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier
import net.minecraft.world.gen.feature.*
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil


fun <FC : FeatureConfig, F : Feature<FC>> BootstrapContext<ConfiguredFeature<*, *>>.registerConfiguredFeature(
    registryKey: RegistryKey<ConfiguredFeature<*, *>>,
    feature: F,
    featureConfig: FC
): Holder.Reference<ConfiguredFeature<*, *>> = this.register(registryKey, ConfiguredFeature(feature, featureConfig))

fun BootstrapContext<ConfiguredFeature<*, *>>.registerConfiguredFeature(
    registryKey: RegistryKey<ConfiguredFeature<*, *>>, feature: Feature<DefaultFeatureConfig>
) = this.registerConfiguredFeature(registryKey, feature, FeatureConfig.DEFAULT)

private fun BootstrapContext<PlacedFeature>.register(
    registryKey: RegistryKey<PlacedFeature>, feature: Holder<ConfiguredFeature<*, *>>, coll: List<PlacementModifier>
) = PlacedFeatureUtil.register(this, registryKey, feature, coll)

fun rareOrePlacementModifiers(chance: Int, modifier: PlacementModifier): List<PlacementModifier> = listOf(
    RarityFilterPlacementModifier.create(chance),
    InSquarePlacementModifier.getInstance(),
    modifier,
    BiomePlacementModifier.getInstance()
)

fun commonOrePlacementModifiers(count: Int, modifier: PlacementModifier): List<PlacementModifier> = listOf(
    CountPlacementModifier.create(count),
    InSquarePlacementModifier.getInstance(),
    modifier,
    BiomePlacementModifier.getInstance()
)

infix fun TagMatchRuleTest.target(state: Block): OreFeatureConfig.Target =
    OreFeatureConfig.createTarget(this, state.defaultState)
