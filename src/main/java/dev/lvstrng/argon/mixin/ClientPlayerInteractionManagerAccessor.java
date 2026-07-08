package dev.lvstrng.argon.mixin;

import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/ClientPlayerInteractionManagerAccessor.class */
@Mixin({class_636.class})
public interface ClientPlayerInteractionManagerAccessor {
    @Invoker("method_2911")
    void syncSlot();
}
