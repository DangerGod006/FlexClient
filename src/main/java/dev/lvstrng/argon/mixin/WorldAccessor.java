package dev.lvstrng.argon.mixin;

import java.util.List;
import net.minecraft.class_1937;
import net.minecraft.class_5562;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/mixin/WorldAccessor.class */
@Mixin({class_1937.class})
public interface WorldAccessor {
    @Accessor("field_27082")
    List<class_5562> getBlockEntityTickers();
}
