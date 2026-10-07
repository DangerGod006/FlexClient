package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UArraySorting.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/UArraySortingKt.class */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m654partition4UcCI2c(byte[] array, int left, int right) {
        int i = left;
        int j = right;
        byte pivot = UByteArray.m252getw2LRezQ(array, (left + right) / 2);
        while (i <= j) {
            while (Intrinsics.compare(UByteArray.m252getw2LRezQ(array, i) & 255, pivot & 255) < 0) {
                i++;
            }
            while (Intrinsics.compare(UByteArray.m252getw2LRezQ(array, j) & 255, pivot & 255) > 0) {
                j--;
            }
            if (i <= j) {
                byte tmp = UByteArray.m252getw2LRezQ(array, i);
                UByteArray.m253setVurrAj0(array, i, UByteArray.m252getw2LRezQ(array, j));
                UByteArray.m253setVurrAj0(array, j, tmp);
                i++;
                j--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m655quickSort4UcCI2c(byte[] array, int left, int right) {
        int index = m654partition4UcCI2c(array, left, right);
        if (left < index - 1) {
            m655quickSort4UcCI2c(array, left, index - 1);
        }
        if (index < right) {
            m655quickSort4UcCI2c(array, index, right);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m656partitionAa5vz7o(short[] array, int left, int right) {
        int i = left;
        int j = right;
        short pivot = UShortArray.m519getMh2AYeg(array, (left + right) / 2);
        while (i <= j) {
            while (Intrinsics.compare(UShortArray.m519getMh2AYeg(array, i) & 65535, pivot & 65535) < 0) {
                i++;
            }
            while (Intrinsics.compare(UShortArray.m519getMh2AYeg(array, j) & 65535, pivot & 65535) > 0) {
                j--;
            }
            if (i <= j) {
                short tmp = UShortArray.m519getMh2AYeg(array, i);
                UShortArray.m520set01HTLdE(array, i, UShortArray.m519getMh2AYeg(array, j));
                UShortArray.m520set01HTLdE(array, j, tmp);
                i++;
                j--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m657quickSortAa5vz7o(short[] array, int left, int right) {
        int index = m656partitionAa5vz7o(array, left, right);
        if (left < index - 1) {
            m657quickSortAa5vz7o(array, left, index - 1);
        }
        if (index < right) {
            m657quickSortAa5vz7o(array, index, right);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m658partitionoBK06Vg(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = UIntArray.m332getpVg5ArA(array, (left + right) / 2);
        while (i <= j) {
            while (Integer.compareUnsigned(UIntArray.m332getpVg5ArA(array, i), pivot) < 0) {
                i++;
            }
            while (Integer.compareUnsigned(UIntArray.m332getpVg5ArA(array, j), pivot) > 0) {
                j--;
            }
            if (i <= j) {
                int tmp = UIntArray.m332getpVg5ArA(array, i);
                UIntArray.m333setVXSXFK8(array, i, UIntArray.m332getpVg5ArA(array, j));
                UIntArray.m333setVXSXFK8(array, j, tmp);
                i++;
                j--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m659quickSortoBK06Vg(int[] array, int left, int right) {
        int index = m658partitionoBK06Vg(array, left, right);
        if (left < index - 1) {
            m659quickSortoBK06Vg(array, left, index - 1);
        }
        if (index < right) {
            m659quickSortoBK06Vg(array, index, right);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m660partitionnroSd4(long[] array, int left, int right) {
        int i = left;
        int j = right;
        long pivot = ULongArray.m412getsVKNKU(array, (left + right) / 2);
        while (i <= j) {
            while (Long.compareUnsigned(ULongArray.m412getsVKNKU(array, i), pivot) < 0) {
                i++;
            }
            while (Long.compareUnsigned(ULongArray.m412getsVKNKU(array, j), pivot) > 0) {
                j--;
            }
            if (i <= j) {
                long tmp = ULongArray.m412getsVKNKU(array, i);
                ULongArray.m413setk8EXiF4(array, i, ULongArray.m412getsVKNKU(array, j));
                ULongArray.m413setk8EXiF4(array, j, tmp);
                i++;
                j--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m661quickSortnroSd4(long[] array, int left, int right) {
        int index = m660partitionnroSd4(array, left, right);
        if (left < index - 1) {
            m661quickSortnroSd4(array, left, index - 1);
        }
        if (index < right) {
            m661quickSortnroSd4(array, index, right);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m662sortArray4UcCI2c(@NotNull byte[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        m655quickSort4UcCI2c(array, fromIndex, toIndex - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m663sortArrayAa5vz7o(@NotNull short[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        m657quickSortAa5vz7o(array, fromIndex, toIndex - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m664sortArrayoBK06Vg(@NotNull int[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        m659quickSortoBK06Vg(array, fromIndex, toIndex - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m665sortArraynroSd4(@NotNull long[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        m661quickSortnroSd4(array, fromIndex, toIndex - 1);
    }
}
