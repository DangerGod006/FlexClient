package su.catlean.mixins.accessors;

import net.minecraft.class_2625;
import net.minecraft.class_7743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/SignEditScreenAccessor.class */
@Mixin({class_7743.class})
public interface SignEditScreenAccessor {
    @Accessor("field_40424")
    class_2625 getSign();

    @Accessor("field_43363")
    boolean isIsFrontText();
}
