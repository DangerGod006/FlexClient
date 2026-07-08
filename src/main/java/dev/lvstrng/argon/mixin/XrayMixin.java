package dev.lvstrng.argon.mixin;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.module.modules.render.Xray;
import java.util.List;
import net.minecraft.class_10889;
import net.minecraft.class_1920;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_776;
import net.minecraft.class_7923;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/XrayMixin.class */
@Mixin({class_776.class})
public class XrayMixin {
    @Inject(method = {"method_3355"}, at = {@At("HEAD")}, cancellable = true)
    private void onRenderBlock(class_2680 state, class_2338 pos, class_1920 world, class_4587 matrices, class_4588 vertexConsumer, boolean cull, List<class_10889> parts, CallbackInfo ci) {
        Xray xray = (Xray) Argon.INSTANCE.getModuleManager().getModule(Xray.class);
        if (xray == null || !xray.isEnabled()) {
            return;
        }
        String blockId = class_7923.field_41175.method_10221(state.method_26204()).method_12832();
        if (!xray.isVisible(blockId)) {
            ci.cancel();
        }
    }
}
