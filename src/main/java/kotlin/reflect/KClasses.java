package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KClasses.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KClasses.class */
@JvmName(name = "KClasses")
public final class KClasses {
    /* JADX WARN: Multi-variable type inference failed */
    @LowPriorityInOverloadResolution
    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> T cast(@NotNull KClass<T> $this$cast, @Nullable Object value) {
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        if (!$this$cast.isInstance(value)) {
            throw new ClassCastException("Value cannot be cast to " + $this$cast.getQualifiedName());
        }
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
        return value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @LowPriorityInOverloadResolution
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T safeCast(@NotNull KClass<T> $this$safeCast, @Nullable Object value) {
        Intrinsics.checkNotNullParameter($this$safeCast, "<this>");
        if (!$this$safeCast.isInstance(value)) {
            return null;
        }
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return value;
    }
}
