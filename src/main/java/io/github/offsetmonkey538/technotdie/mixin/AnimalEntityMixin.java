package io.github.offsetmonkey538.technotdie.mixin;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.AnimalEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static io.github.offsetmonkey538.technotdie.TechnotDieUtils.isTechnoPig;

@Mixin(AnimalEntity.class)
public class AnimalEntityMixin {

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    public void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if (isTechnoPig(this)) {
            cir.setReturnValue(false);
        }
    }
}
