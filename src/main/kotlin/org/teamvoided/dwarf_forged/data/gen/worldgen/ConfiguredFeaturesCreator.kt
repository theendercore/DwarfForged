package org.teamvoided.dwarf_forged.data.gen.worldgen

import net.minecraft.block.Blocks
import net.minecraft.registry.BootstrapContext
import net.minecraft.registry.tag.BlockTags
import net.minecraft.structure.rule.TagMatchRuleTest
import net.minecraft.util.math.int_provider.UniformIntProvider
import net.minecraft.world.gen.feature.*
import org.teamvoided.dwarf_forged.data.worldgen.DFConfiguredFeatures
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.util.registerConfiguredFeature
import org.teamvoided.dwarf_forged.util.toProvider

object ConfiguredFeaturesCreator {

    fun boostrap(c: BootstrapContext<ConfiguredFeature<*, *>>) {
        geodes(c)
        val stoneOre = TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES)
        val deepslateOre = TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES)

        val rubyOre = listOf(
            OreFeatureConfig.createTarget(stoneOre, DFBlocks.RUBY_ORE.defaultState),
            OreFeatureConfig.createTarget(deepslateOre, DFBlocks.DEEPSLATE_RUBY_ORE.defaultState)
        )

        c.registerConfiguredFeature(
            DFConfiguredFeatures.ORE_RUBY_MEDIUM, Feature.ORE,
            OreFeatureConfig(rubyOre, 8, 0.5f)
        )


    }

    private fun geodes(c: BootstrapContext<ConfiguredFeature<*, *>>) {
        c.registerConfiguredFeature(
            DFConfiguredFeatures.BLUE_SKY_GEODE, Feature.GEODE,
            GeodeFeatureConfig(
                GeodeLayerConfig(
                    Blocks.AIR.toProvider(),
                    DFBlocks.BLUE_SKY_BLOCK.toProvider(),
                    DFBlocks.BUDDING_BLUE_SKY.toProvider(),
                    Blocks.CALCITE.toProvider(),
                    Blocks.SMOOTH_BASALT.toProvider(),
                    listOf(
                        DFBlocks.SMALL_BLUE_SKY_BUD.defaultState,
                        DFBlocks.MEDIUM_BLUE_SKY_BUD.defaultState,
                        DFBlocks.LARGE_BLUE_SKY_BUD.defaultState,
                        DFBlocks.BLUE_SKY_CLUSTER.defaultState
                    ),
                    BlockTags.FEATURES_CANNOT_REPLACE,
                    BlockTags.GEODE_INVALID_BLOCKS
                ),
                GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                GeodeCrackConfig(0.95, 2.0, 2),
                0.35,
                0.083,
                true,
                UniformIntProvider.create(4, 6),
                UniformIntProvider.create(3, 4),
                UniformIntProvider.create(1, 2),
                -16,
                16,
                0.05,
                1
            )
        )

        c.registerConfiguredFeature(
            DFConfiguredFeatures.CITRINE_GEODE, Feature.GEODE,
            GeodeFeatureConfig(
                GeodeLayerConfig(
                    Blocks.AIR.toProvider(),
                    DFBlocks.CITRINE_BLOCK.toProvider(),
                    DFBlocks.BUDDING_CITRINE.toProvider(),
                    Blocks.CALCITE.toProvider(),
                    Blocks.SMOOTH_BASALT.toProvider(),
                    listOf(
                        DFBlocks.SMALL_CITRINE_BUD.defaultState,
                        DFBlocks.MEDIUM_CITRINE_BUD.defaultState,
                        DFBlocks.LARGE_CITRINE_BUD.defaultState,
                        DFBlocks.CITRINE_CLUSTER.defaultState
                    ),
                    BlockTags.FEATURES_CANNOT_REPLACE,
                    BlockTags.GEODE_INVALID_BLOCKS
                ),
                GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                GeodeCrackConfig(0.95, 2.0, 2),
                0.35,
                0.083,
                true,
                UniformIntProvider.create(4, 6),
                UniformIntProvider.create(3, 4),
                UniformIntProvider.create(1, 2),
                -16,
                16,
                0.05,
                1
            )
        )
    }

}