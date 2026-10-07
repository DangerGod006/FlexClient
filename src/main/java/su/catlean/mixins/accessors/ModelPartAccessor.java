package su.catlean.mixins.accessors;

import java.util.List;
import net.minecraft.class_630;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/ModelPartAccessor.class */
@Mixin({class_630.class})
public interface ModelPartAccessor {
    @Accessor("field_3663")
    List<class_630.class_628> getCuboidsList();
}
