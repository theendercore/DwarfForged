package org.teamvoided.dwarf_forged.data.gen.worldgen

import net.minecraft.block.Blocks
import net.minecraft.registry.BootstrapContext
import net.minecraft.registry.tag.BlockTags
import net.minecraft.util.math.int_provider.UniformIntProvider
import net.minecraft.world.gen.feature.*
import org.teamvoided.dwarf_forged.data.worldgen.DFConfiguredFeatures
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.util.datage.registerConfiguredFeature
import org.teamvoided.dwarf_forged.util.toProvider

typealias CfgFeature = ConfiguredFeature<*, *>

object ConfiguredFeaturesCreator {
    fun boostrap(c: BootstrapContext<CfgFeature>) {
        geodes(c)
    }

    private fun geodes(c: BootstrapContext<CfgFeature>) {
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
    }


}

