package su.catlean.mixins.accessors;

import net.minecraft.class_2589;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/BrewingStandBlockEntityAccessor.class */
@Mixin({class_2589.class})
public interface BrewingStandBlockEntityAccessor {
    @Accessor("field_11878")
    int getBrewTime();
}
