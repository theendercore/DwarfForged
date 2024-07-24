package org.teamvoided.dwarf_forged.data.gen.worldgen

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.registry.BootstrapContext
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.tag.BlockTags
import net.minecraft.structure.rule.BlockMatchRuleTest
import net.minecraft.structure.rule.TagMatchRuleTest
import net.minecraft.util.math.int_provider.UniformIntProvider
import net.minecraft.world.gen.feature.*
import net.minecraft.world.gen.feature.Feature.ORE
import org.teamvoided.dwarf_forged.data.worldgen.DFConfiguredFeatures
import org.teamvoided.dwarf_forged.data.worldgen.ore.DFCfgOres
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.util.registerConfiguredFeature
import org.teamvoided.dwarf_forged.util.toProvider

typealias CfgFeature = ConfiguredFeature<*, *>

object ConfiguredFeaturesCreator {
    private lateinit var stoneTest: TagMatchRuleTest
    private lateinit var deepslateTest: TagMatchRuleTest

    fun boostrap(c: BootstrapContext<CfgFeature>) {
        stoneTest = TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES)
        deepslateTest = TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
        geodes(c)
        normalGems(c)
        deepGems(c)
        miscGems(c)

        metals(c)
    }

    private fun normalGems(c: BootstrapContext<CfgFeature>) {
        c.makeGemNormal(
            DFBlocks.JADE_ORE, DFBlocks.DEEPSLATE_JADE_ORE,
            DFCfgOres.ORE_JADE_SMALL, DFCfgOres.ORE_JADE_MEDIUM
        )
        c.makeGemNormal(
            DFBlocks.EUCLASE_ORE, DFBlocks.DEEPSLATE_EUCLASE_ORE,
            DFCfgOres.ORE_EUCLASE_SMALL, DFCfgOres.ORE_EUCLASE_MEDIUM
        )
        c.makeGemNormal(
            DFBlocks.BORACITE_ORE, DFBlocks.DEEPSLATE_BORACITE_ORE,
            DFCfgOres.ORE_BORACITE_SMALL, DFCfgOres.ORE_BORACITE_MEDIUM
        )
        c.makeGemNormal(
            DFBlocks.TOPAZ_ORE, DFBlocks.DEEPSLATE_TOPAZ_ORE,
            DFCfgOres.ORE_TOPAZ_SMALL, DFCfgOres.ORE_TOPAZ_MEDIUM
        )
        c.makeGemNormal(
            DFBlocks.TOURMALINE_ORE, DFBlocks.DEEPSLATE_TOURMALINE_ORE,
            DFCfgOres.ORE_TOURMALINE_SMALL, DFCfgOres.ORE_TOURMALINE_MEDIUM
        )
        c.makeGemNormal(
            DFBlocks.SPINEL_ORE, DFBlocks.DEEPSLATE_SPINEL_ORE,
            DFCfgOres.ORE_SPINEL_SMALL, DFCfgOres.ORE_SPINEL_MEDIUM
        )
        c.makeGemNormal(
            DFBlocks.HEMATITE_ORE, DFBlocks.DEEPSLATE_HEMATITE_ORE,
            DFCfgOres.ORE_HEMATITE_SMALL, DFCfgOres.ORE_HEMATITE_MEDIUM
        )
        c.makeGemNormal(
            DFBlocks.CARNELIAN_ORE, DFBlocks.DEEPSLATE_CARNELIAN_ORE,
            DFCfgOres.ORE_CARNELIAN_SMALL, DFCfgOres.ORE_CARNELIAN_MEDIUM
        )


    }

    private fun deepGems(c: BootstrapContext<CfgFeature>) {
        c.makeGemDeep(
            DFBlocks.RUBY_ORE, DFBlocks.DEEPSLATE_RUBY_ORE,
            DFCfgOres.ORE_RUBY_SMALL, DFCfgOres.ORE_RUBY_LARGE
        )
        c.makeGemDeep(
            DFBlocks.SAPPHIRE_ORE, DFBlocks.DEEPSLATE_SAPPHIRE_ORE,
            DFCfgOres.ORE_SAPPHIRE_SMALL, DFCfgOres.ORE_SAPPHIRE_LARGE
        )
        c.makeGemDeep(
            DFBlocks.KYANITE_ORE, DFBlocks.DEEPSLATE_KYANITE_ORE,
            DFCfgOres.ORE_KYANITE_SMALL, DFCfgOres.ORE_KYANITE_LARGE
        )
    }

    private fun miscGems(c: BootstrapContext<CfgFeature>) {
        c.registerConfiguredFeature(
            DFCfgOres.ORE_SMOKY_QUARTZ, ORE,
            OreFeatureConfig(BlockMatchRuleTest(Blocks.NETHERRACK), DFBlocks.SMOKY_QUARTZ_BLOCK.defaultState, 14)
        )

        val moonstone =
            listOf(stoneTest target DFBlocks.MOONSTONE_ORE, deepslateTest target DFBlocks.DEEPSLATE_MOONSTONE_ORE)
        c.registerConfiguredFeature(DFCfgOres.ORE_MOONSTONE_SMALL, ORE, OreFeatureConfig(moonstone, 4))
        c.registerConfiguredFeature(DFCfgOres.ORE_MOONSTONE_MEDIUM, ORE, OreFeatureConfig(moonstone, 8, 0.3f))
    }

    private fun metals(c: BootstrapContext<CfgFeature>) {
        // Normal Ores
        c.makeMetal(
            DFBlocks.SILVER_ORE, DFBlocks.DEEPSLATE_SILVER_ORE,
            DFCfgOres.ORE_SILVER_SMALL, DFCfgOres.ORE_SILVER
        )
        c.makeMetal(
            DFBlocks.COBALT_ORE, DFBlocks.DEEPSLATE_COBALT_ORE,
            DFCfgOres.ORE_COBALT_SMALL, DFCfgOres.ORE_COBALT
        )
        c.makeMetal(
            DFBlocks.TUNGSTEN_ORE, DFBlocks.DEEPSLATE_TUNGSTEN_ORE,
            DFCfgOres.ORE_TUNGSTEN_SMALL, DFCfgOres.ORE_TUNGSTEN
        )
        c.makeMetal(
            DFBlocks.URANIUM_ORE, DFBlocks.DEEPSLATE_URANIUM_ORE,
            DFCfgOres.ORE_URANIUM_SMALL, DFCfgOres.ORE_URANIUM
        )
        c.makeMetal(DFBlocks.LEAD_ORE, DFBlocks.DEEPSLATE_LEAD_ORE, DFCfgOres.ORE_LEAD_SMALL, DFCfgOres.ORE_LEAD)
        c.makeMetal(DFBlocks.TIN_ORE, DFBlocks.DEEPSLATE_TIN_ORE, DFCfgOres.ORE_TIN_SMALL, DFCfgOres.ORE_TIN)
        c.makeMetal(
            DFBlocks.PALLADIUM_ORE, DFBlocks.DEEPSLATE_PALLADIUM_ORE,
            DFCfgOres.ORE_PALLADIUM_SMALL, DFCfgOres.ORE_PALLADIUM
        )
        c.makeMetal(DFBlocks.ZINC_ORE, DFBlocks.DEEPSLATE_ZINC_ORE, DFCfgOres.ORE_ZINC_SMALL, DFCfgOres.ORE_ZINC)
        c.makeMetal(
            DFBlocks.NICKEL_ORE, DFBlocks.DEEPSLATE_NICKEL_ORE,
            DFCfgOres.ORE_NICKEL_SMALL, DFCfgOres.ORE_NICKEL
        )
        c.makeMetal(
            DFBlocks.ALUMINIUM_ORE, DFBlocks.DEEPSLATE_ALUMINIUM_ORE,
            DFCfgOres.ORE_ALUMINIUM_SMALL, DFCfgOres.ORE_ALUMINIUM
        )

        // Deep Ores
        c.makeMetal(
            DFBlocks.TITANIUM_ORE, DFBlocks.DEEPSLATE_TITANIUM_ORE,
            DFCfgOres.ORE_TITANIUM_SMALL, DFCfgOres.ORE_TITANIUM
        )
        c.makeMetal(
            DFBlocks.PLUTONIUM_ORE, DFBlocks.DEEPSLATE_PLUTONIUM_ORE,
            DFCfgOres.ORE_PLUTONIUM_SMALL, DFCfgOres.ORE_PLUTONIUM
        )

        // Shallow Ores
        c.makeMetal(
            DFBlocks.THALLIUM_ORE, DFBlocks.DEEPSLATE_THALLIUM_ORE,
            DFCfgOres.ORE_THALLIUM_SMALL, DFCfgOres.ORE_THALLIUM
        )
        c.makeMetal(
            DFBlocks.BISMUTH_ORE, DFBlocks.DEEPSLATE_BISMUTH_ORE,
            DFCfgOres.ORE_BISMUTH_SMALL, DFCfgOres.ORE_BISMUTH
        )

        // Rare Ores
        c.makeMetal(
            DFBlocks.PLATINUM_ORE, DFBlocks.DEEPSLATE_PLATINUM_ORE,
            DFCfgOres.ORE_PLATINUM_SMALL, DFCfgOres.ORE_PLATINUM
        )

        val iridium = listOf(stoneTest target DFBlocks.IRIDIUM_ORE, deepslateTest target DFBlocks.DEEPSLATE_IRIDIUM_ORE)
        c.registerConfiguredFeature(DFCfgOres.ORE_IRIDIUM_SMALL, ORE, OreFeatureConfig(iridium, 3))
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

    private fun BootstrapContext<CfgFeature>.makeGemDeep(
        ore: Block, deepslateOre: Block, featSmall: RegistryKey<CfgFeature>, featLarge: RegistryKey<CfgFeature>
    ) {
        val oreRules = listOf(stoneTest target ore, deepslateTest target deepslateOre)
        this.registerConfiguredFeature(featSmall, ORE, OreFeatureConfig(oreRules, 4))
        this.registerConfiguredFeature(featLarge, ORE, OreFeatureConfig(oreRules, 12, 0.5f))
    }

    private fun BootstrapContext<CfgFeature>.makeGemNormal(
        ore: Block, deepslateOre: Block, featSmall: RegistryKey<CfgFeature>, featMedium: RegistryKey<CfgFeature>
    ) {
        val oreRules = listOf(stoneTest target ore, deepslateTest target deepslateOre)
        this.registerConfiguredFeature(featSmall, ORE, OreFeatureConfig(oreRules, 4))
        this.registerConfiguredFeature(featMedium, ORE, OreFeatureConfig(oreRules, 8, 0.3f))
    }

    private fun BootstrapContext<CfgFeature>.makeMetal(
        ore: Block, deepslateOre: Block, featSmall: RegistryKey<CfgFeature>, featMedium: RegistryKey<CfgFeature>
    ) {
        val oreRules = listOf(stoneTest target ore, deepslateTest target deepslateOre)
        this.registerConfiguredFeature(featSmall, ORE, OreFeatureConfig(oreRules, 4))
        this.registerConfiguredFeature(featMedium, ORE, OreFeatureConfig(oreRules, 9))
    }

    infix fun TagMatchRuleTest.target(state: Block): OreFeatureConfig.Target =
        OreFeatureConfig.createTarget(this, state.defaultState)
}

