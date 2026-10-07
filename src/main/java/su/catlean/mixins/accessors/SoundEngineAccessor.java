package su.catlean.mixins.accessors;

import net.minecraft.class_1140;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/SoundEngineAccessor.class */
@Mixin({class_1140.class})
public interface SoundEngineAccessor {
    @Accessor("field_5563")
    boolean isLoaded();
}
