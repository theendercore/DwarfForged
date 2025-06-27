package org.teamvoided.dwarf_forged.mixin.client;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.block.entity.MobSpawnerBlockEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.MobSpawnerBlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.world.MobSpawnerLogic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static org.teamvoided.dwarf_forged.client.util.WidgetHelpersKt.renderSpawnerInfo;

@Mixin(MobSpawnerBlockEntityRenderer.class)
public abstract class MobSpawnerBlockEntityRendererMixin {
    @Inject(method = "render(Lnet/minecraft/block/entity/MobSpawnerBlockEntity;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;II)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/MobSpawnerLogic;getRenderedEntity(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/entity/Entity;", shift = At.Shift.AFTER))
    void renderText(MobSpawnerBlockEntity mobSpawnerBlockEntity, float delta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int i, int j,
                    CallbackInfo ci, @Local MobSpawnerLogic mobSpawnerLogic) {
        renderSpawnerInfo(mobSpawnerBlockEntity, mobSpawnerLogic, delta, matrices, vertexConsumers);
    }
}
