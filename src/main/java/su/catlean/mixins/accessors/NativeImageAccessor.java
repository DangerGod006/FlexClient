package su.catlean.mixins.accessors;

import net.minecraft.class_1011;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/NativeImageAccessor.class */
@Mixin({class_1011.class})
public interface NativeImageAccessor {
    @Accessor("field_4988")
    long getPixels();
}
