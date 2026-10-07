package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/CharArrayPool.class */
public final class CharArrayPool extends CharArrayPoolBase {

    @NotNull
    public static final CharArrayPool INSTANCE = new CharArrayPool();

    private CharArrayPool() {
    }

    @NotNull
    public final char[] take() {
        return super.take(Uuid.SIZE_BITS);
    }

    public final void release(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        releaseImpl(array);
    }
}
