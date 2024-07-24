package org.teamvoided.dwarf_forged.data.gen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags
import net.minecraft.registry.HolderLookup
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.BiomeTags
import net.minecraft.world.biome.Biome
import net.minecraft.world.biome.Biomes
import org.teamvoided.dwarf_forged.data.tags.DFBiomeTags
import java.util.concurrent.CompletableFuture

class BiomeTagProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider<Biome>(o, RegistryKeys.BIOME, r) {
    override fun configure(wrapperLookup: HolderLookup.Provider) {

        normalOres()
        deepOres()
    }

    private fun normalOres() {
        getOrCreateTagBuilder(DFBiomeTags.HAS_JADE)
            .forceAddTag(ConventionalBiomeTags.IS_JUNGLE)
            .forceAddTag(BiomeTags.JUNGLE)
            .add(Biomes.LUSH_CAVES)

        getOrCreateTagBuilder(DFBiomeTags.HAS_EUCLASE)
            .forceAddTag(ConventionalBiomeTags.IS_TAIGA)
            .forceAddTag(BiomeTags.TAIGA)


        getOrCreateTagBuilder(DFBiomeTags.HAS_BORACITE)
            .forceAddTag(ConventionalBiomeTags.IS_PLAINS)
            .forceAddTag(ConventionalBiomeTags.IS_FOREST)
            .forceAddTag(BiomeTags.FOREST)

        getOrCreateTagBuilder(DFBiomeTags.HAS_TOPAZ)
            .forceAddTag(ConventionalBiomeTags.IS_HOT_OVERWORLD)

        getOrCreateTagBuilder(DFBiomeTags.HAS_TOURMALINE)
            .forceAddTag(ConventionalBiomeTags.IS_COLD_OVERWORLD)

        getOrCreateTagBuilder(DFBiomeTags.HAS_SPINEL)
            .forceAddTag(ConventionalBiomeTags.IS_MUSHROOM)
            .add(Biomes.CHERRY_GROVE)

        getOrCreateTagBuilder(DFBiomeTags.HAS_HEMATITE)
            .forceAddTag(ConventionalBiomeTags.IS_DEEP_OCEAN)
            .add(Biomes.DEEP_DARK)

        getOrCreateTagBuilder(DFBiomeTags.HAS_CARNELIAN)
            .add(Biomes.DRIPSTONE_CAVES)

    }

    private fun deepOres() {
        getOrCreateTagBuilder(DFBiomeTags.HAS_RUBY)
            .forceAddTag(ConventionalBiomeTags.IS_DRY)

        getOrCreateTagBuilder(DFBiomeTags.HAS_SAPPHIRE)
            .forceAddTag(ConventionalBiomeTags.IS_COLD)

        getOrCreateTagBuilder(DFBiomeTags.HAS_KYANITE)
            .forceAddTag(ConventionalBiomeTags.IS_MOUNTAIN)
    }
}