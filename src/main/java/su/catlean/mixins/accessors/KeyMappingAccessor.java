package su.catlean.mixins.accessors;

import net.minecraft.class_304;
import net.minecraft.class_3675;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/KeyMappingAccessor.class */
@Mixin({class_304.class})
public interface KeyMappingAccessor {
    @Accessor("field_1655")
    class_3675.class_306 getKey();
}
