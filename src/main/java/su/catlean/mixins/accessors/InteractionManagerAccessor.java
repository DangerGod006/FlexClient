package su.catlean.mixins.accessors;

import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/InteractionManagerAccessor.class */
@Mixin({class_636.class})
public interface InteractionManagerAccessor {
    @Invoker("method_2911")
    void syncSlot();

    @Accessor("field_3715")
    float getCurBlockDamageMP();

    @Accessor("field_3715")
    void setCurBlockDamageMP(float f);

    @Accessor("field_3721")
    void setCarriedIndex(int i);
}
