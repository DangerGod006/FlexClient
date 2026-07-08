package dev.lvstrng.argon.mixin;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.imixin.IKeyBinding;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/KeyBindingMixin.class */
@Mixin({class_304.class})
public abstract class KeyBindingMixin implements IKeyBinding {

    @Shadow
    private class_3675.class_306 field_1655;

    @Shadow
    public abstract void method_23481(boolean z);

    @Override // dev.lvstrng.argon.imixin.IKeyBinding
    public boolean isActuallyPressed() {
        int code = this.field_1655.method_1444();
        return class_3675.method_15987(Argon.mc.method_22683(), code);
    }

    @Override // dev.lvstrng.argon.imixin.IKeyBinding
    public void resetPressed() {
        method_23481(isActuallyPressed());
    }
}
