package org.teamvoided.dwarf_forged.client.util

import net.minecraft.client.world.ClientWorld
import net.minecraft.particle.DustParticleEffect
import net.minecraft.particle.ParticleEffect
import net.minecraft.util.math.Vec3d


fun ClientWorld.particleCube(color: Int, x1: Int, y1: Int, z1: Int, y2: Int, x2: Int, z2: Int) {
    colorParticle(color, x1, y1, z1)
    colorParticle(color, x2, y1, z1)
    colorParticle(color, x2, y1, z2)
    colorParticle(color, x1, y1, z2)

    colorParticle(color, x1, y2, z1)
    colorParticle(color, x2, y2, z1)
    colorParticle(color, x2, y2, z2)
    colorParticle(color, x1, y2, z2)
}

fun ClientWorld.colorParticle(color: Int, x: Number, y: Number, z: Number) =
    particle(DustParticleEffect(Vec3d.unpackRgb(color).toVector3f(), 1.0F), x, y, z)

fun ClientWorld.particle(type: ParticleEffect, x: Number, y: Number, z: Number) =
    addParticle(type, x.toDouble(), y.toDouble(), z.toDouble(), 0.0, 0.0, 0.0)