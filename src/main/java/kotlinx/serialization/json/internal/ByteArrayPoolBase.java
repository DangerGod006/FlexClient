package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/ByteArrayPoolBase.class */
public class ByteArrayPoolBase {

    @NotNull
    private final ArrayDeque<byte[]> arrays = new ArrayDeque<>();
    private int bytesTotal;

    @NotNull
    protected final byte[] take(int size) {
        byte[] bArr;
        byte[] candidate;
        synchronized (this) {
            byte[] it = this.arrays.removeLastOrNull();
            if (it != null) {
                this.bytesTotal -= it.length / 2;
                bArr = it;
            } else {
                bArr = null;
            }
            candidate = bArr;
        }
        return candidate == null ? new byte[size] : candidate;
    }

    protected final void releaseImpl(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            if (this.bytesTotal + array.length < ArrayPoolsKt.MAX_CHARS_IN_POOL) {
                this.bytesTotal += array.length / 2;
                this.arrays.addLast(array);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
