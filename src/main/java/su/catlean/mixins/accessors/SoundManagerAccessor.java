package su.catlean.mixins.accessors;

import net.minecraft.class_1140;
import net.minecraft.class_1144;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/SoundManagerAccessor.class */
@Mixin({class_1144.class})
public interface SoundManagerAccessor {
    @Accessor("field_5590")
    class_1140 getSoundEngine();
}
