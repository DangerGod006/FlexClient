package su.catlean.mixins.accessors;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/CooldownInstanceAccessor.class */
@Pseudo
@Mixin(targets = {"net/minecraft/class_1796$class_1797"})
public interface CooldownInstanceAccessor {
    @Accessor("comp_3084")
    int getEndTime();
}
