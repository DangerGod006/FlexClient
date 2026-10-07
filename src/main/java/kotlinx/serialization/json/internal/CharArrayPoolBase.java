package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/CharArrayPoolBase.class */
public class CharArrayPoolBase {

    @NotNull
    private final ArrayDeque<char[]> arrays = new ArrayDeque<>();
    private int charsTotal;

    @NotNull
    protected final char[] take(int size) {
        char[] cArr;
        char[] candidate;
        synchronized (this) {
            char[] it = this.arrays.removeLastOrNull();
            if (it != null) {
                this.charsTotal -= it.length;
                cArr = it;
            } else {
                cArr = null;
            }
            candidate = cArr;
        }
        return candidate == null ? new char[size] : candidate;
    }

    protected final void releaseImpl(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            if (this.charsTotal + array.length < ArrayPoolsKt.MAX_CHARS_IN_POOL) {
                this.charsTotal += array.length;
                this.arrays.addLast(array);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
