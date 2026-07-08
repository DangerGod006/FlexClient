package dev.lvstrng.argon.mixin;

import net.minecraft.class_304;
import net.minecraft.class_3675;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/KeyBindingAccessor.class */
@Mixin({class_304.class})
public interface KeyBindingAccessor {
    @Accessor("field_1655")
    class_3675.class_306 getBoundKey();
}
