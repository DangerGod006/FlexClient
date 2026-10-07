package kotlinx.serialization.json.internal;

import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/ByteArrayPool.class */
public final class ByteArrayPool extends ByteArrayPoolBase {

    @NotNull
    public static final ByteArrayPool INSTANCE = new ByteArrayPool();

    private ByteArrayPool() {
    }

    @NotNull
    public final byte[] take() {
        return super.take(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    public final void release(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        releaseImpl(array);
    }
}
