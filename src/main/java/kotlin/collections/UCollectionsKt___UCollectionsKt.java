package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _UCollections.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/UCollectionsKt___UCollectionsKt.class */
class UCollectionsKt___UCollectionsKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<UByte> $this$toUByteArray) {
        Intrinsics.checkNotNullParameter($this$toUByteArray, "<this>");
        byte[] result = UByteArray.m251constructorimpl($this$toUByteArray.size());
        int index = 0;
        Iterator<UByte> it = $this$toUByteArray.iterator();
        while (it.hasNext()) {
            byte element = it.next().m248unboximpl();
            int i = index;
            index++;
            UByteArray.m253setVurrAj0(result, i, element);
        }
        return result;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<UInt> $this$toUIntArray) {
        Intrinsics.checkNotNullParameter($this$toUIntArray, "<this>");
        int[] result = UIntArray.m331constructorimpl($this$toUIntArray.size());
        int index = 0;
        Iterator<UInt> it = $this$toUIntArray.iterator();
        while (it.hasNext()) {
            int element = it.next().m328unboximpl();
            int i = index;
            index++;
            UIntArray.m333setVXSXFK8(result, i, element);
        }
        return result;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull Collection<ULong> $this$toULongArray) {
        Intrinsics.checkNotNullParameter($this$toULongArray, "<this>");
        long[] result = ULongArray.m411constructorimpl($this$toULongArray.size());
        int index = 0;
        Iterator<ULong> it = $this$toULongArray.iterator();
        while (it.hasNext()) {
            long element = it.next().m408unboximpl();
            int i = index;
            index++;
            ULongArray.m413setk8EXiF4(result, i, element);
        }
        return result;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> $this$toUShortArray) {
        Intrinsics.checkNotNullParameter($this$toUShortArray, "<this>");
        short[] result = UShortArray.m518constructorimpl($this$toUShortArray.size());
        int index = 0;
        Iterator<UShort> it = $this$toUShortArray.iterator();
        while (it.hasNext()) {
            short element = it.next().m515unboximpl();
            int i = index;
            index++;
            UShortArray.m520set01HTLdE(result, i, element);
        }
        return result;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable<UInt> $this$sum) {
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
    public static final long sumOfULong(@NotNull Iterable<ULong> $this$sum) {
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
    public static final int sumOfUByte(@NotNull Iterable<UByte> $this$sum) {
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
    public static final int sumOfUShort(@NotNull Iterable<UShort> $this$sum) {
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
