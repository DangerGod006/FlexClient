package kotlin.sequences;

import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _USequences.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/USequencesKt___USequencesKt.class */
class USequencesKt___USequencesKt {
    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Sequence<UInt> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        Iterator<UInt> it = $this$sum.iterator();
        while (it.hasNext()) {
            int element = it.next().m328unboximpl();
            sum = UInt.m326constructorimpl(sum + element);
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Sequence<ULong> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        long sum = 0;
        Iterator<ULong> it = $this$sum.iterator();
        while (it.hasNext()) {
            long element = it.next().m408unboximpl();
            sum = ULong.m406constructorimpl(sum + element);
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Sequence<UByte> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        Iterator<UByte> it = $this$sum.iterator();
        while (it.hasNext()) {
            byte element = it.next().m248unboximpl();
            sum = UInt.m326constructorimpl(sum + UInt.m326constructorimpl(element & 255));
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Sequence<UShort> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        Iterator<UShort> it = $this$sum.iterator();
        while (it.hasNext()) {
            short element = it.next().m515unboximpl();
            sum = UInt.m326constructorimpl(sum + UInt.m326constructorimpl(element & 65535));
        }
        return sum;
    }
}
