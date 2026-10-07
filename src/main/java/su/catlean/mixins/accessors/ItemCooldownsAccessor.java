package su.catlean.mixins.accessors;

import java.util.Map;
import net.minecraft.class_1796;
import net.minecraft.class_2960;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/ItemCooldownsAccessor.class */
@Mixin({class_1796.class})
public interface ItemCooldownsAccessor {
    @Accessor("field_8024")
    Map<class_2960, ?> getCooldowns();

    @Accessor("field_8025")
    int getTickCount();
}
