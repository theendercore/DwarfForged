package org.teamvoided.dwarf_forged.client.widgets

import net.fabricmc.fabric.api.event.player.AttackEntityCallback
import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.EntityHitResult
import net.minecraft.world.World
import org.teamvoided.dwarf_forged.DwarfForgedClient.config

object WidgetEvents {
    fun init() {
        AttackEntityCallback.EVENT.register(::attackEntity)
    }


    @Suppress("unused")
    fun attackEntity(
        player: PlayerEntity, world: World, hand: Hand, entity: Entity, hitResult: EntityHitResult?,
    ): ActionResult {
        if (config.paciFist) {
            return ActionResult.FAIL
        }
        return ActionResult.PASS
    }

}