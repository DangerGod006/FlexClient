package dev.lvstrng.argon.mixin;

import net.minecraft.class_243;
import net.minecraft.class_745;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/OtherClientPlayerEntityAccessor.class */
@Mixin({class_745.class})
public interface OtherClientPlayerEntityAccessor {
    @Accessor("field_42908")
    int getVelocityLerpDivisor();

    @Accessor("field_42908")
    void setVelocityLerpDivisor(int i);

    @Accessor("field_42907")
    class_243 getClientVelocity();

    @Accessor("field_42907")
    void setClientVelocity(class_243 class_243Var);
}
