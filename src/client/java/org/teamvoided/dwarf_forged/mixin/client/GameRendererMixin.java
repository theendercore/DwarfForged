package org.teamvoided.dwarf_forged.mixin.client;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.teamvoided.dwarf_forged.client.widgets.WidgetRenderer;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

    @ModifyExpressionValue(method = "updateCrosshairTarget", at= @At(value = "INVOKE", target = "Lnet/minecraft/util/hit/EntityHitResult;getEntity()Lnet/minecraft/entity/Entity;"))
    Entity preventCrosshairEntity(Entity original){
        if (WidgetRenderer.Settings.INSTANCE.getPaciFist().get() > 0) {
            return null;
        }
        return original;
    }
}
