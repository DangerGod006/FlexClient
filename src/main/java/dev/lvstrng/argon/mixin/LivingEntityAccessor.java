package dev.lvstrng.argon.mixin;

import net.minecraft.class_1282;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/LivingEntityAccessor.class */
@Mixin({class_1309.class})
public interface LivingEntityAccessor {
    @Accessor("field_6282")
    boolean getJumping();

    @Accessor("field_6276")
    class_1282 getLastDamageSource();

    @Accessor("field_6276")
    void setLastDamageSource(class_1282 class_1282Var);

    @Accessor("field_6226")
    long getLastDamageTime();

    @Accessor("field_6226")
    void setLastDamageTime(long j);

    @Accessor("field_6268")
    class_2338 getLastBlockPos();

    @Accessor("field_6268")
    void setLastBlockPos(class_2338 class_2338Var);

    @Accessor("field_6236")
    void setAttacking(class_1309 class_1309Var);
}
