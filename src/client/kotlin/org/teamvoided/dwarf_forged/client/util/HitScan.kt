package org.teamvoided.dwarf_forged.client.util

import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.projectile.ProjectileUtil
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.HitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.math.MathHelper
import net.minecraft.util.math.Vec3d
import kotlin.math.max
import kotlin.math.sqrt

fun getPlayerHit(player: PlayerEntity, tickDelta: Float): HitResult =
    getPotentialHit(player, player.blockInteractionRange, player.entityInteractionRange, tickDelta)

fun getPotentialHit(entity: Entity, blockRange: Double, entityRange: Double, tickDelta: Float): HitResult {
    var maxRange = max(blockRange, entityRange)
    var distance = MathHelper.square(maxRange)
    val eyePos = entity.getLerpedEyePos(tickDelta)
    val raycastResult = entity.raycast(maxRange, tickDelta, false)
    val rayDist = raycastResult.getPos().squaredDistanceTo(eyePos)
    if (raycastResult.type != HitResult.Type.MISS) {
        distance = rayDist
        maxRange = sqrt(rayDist)
    }

    val rotVec = entity.getRotationVec(tickDelta)
    val maxPos = eyePos.add(rotVec.x * maxRange, rotVec.y * maxRange, rotVec.z * maxRange)
    val box = entity.bounds.stretch(rotVec.multiply(maxRange)).expand(1.0, 1.0, 1.0)
    val entityHitResult = ProjectileUtil.raycast(entity, eyePos, maxPos, box, { !it.isSpectator }, distance)
    return if (entityHitResult != null && entityHitResult.getPos().squaredDistanceTo(eyePos) < rayDist)
        ensureHitInRange(entityHitResult, eyePos, entityRange)
    else ensureHitInRange(raycastResult, eyePos, blockRange)
}

fun ensureHitInRange(hit: HitResult, pos: Vec3d, range: Double): HitResult {
    val hitPos = hit.getPos()
    if (hitPos.withinRange(pos, range)) {
        return hit
    }

    val direction = Direction.getFacing(hitPos.x - pos.x, hitPos.y - pos.y, hitPos.z - pos.z)
    return BlockHitResult.createMissed(hitPos, direction, BlockPos.fromPosition(hitPos))
}