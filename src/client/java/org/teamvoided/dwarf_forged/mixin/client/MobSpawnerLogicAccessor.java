package org.teamvoided.dwarf_forged.mixin.client;

import net.minecraft.world.MobSpawnerLogic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MobSpawnerLogic.class)
public interface MobSpawnerLogicAccessor {
    @Accessor("spawnDelay")
    int df_getSpawnDelay();


    @Accessor("minSpawnDelay")
    int df_getMinSpawnDelay();

    @Accessor("maxSpawnDelay")
    int df_getMaxSpawnDelay();

    @Accessor("spawnCount")
    int df_getSpawnCount();


    @Accessor("maxNearbyEntities")
    int df_getMaxNearbyEntities();

    @Accessor("requiredPlayerRange")
    int df_getRequiredPlayerRange();

    @Accessor("spawnRange")
    int df_getSpawnRange();
}
