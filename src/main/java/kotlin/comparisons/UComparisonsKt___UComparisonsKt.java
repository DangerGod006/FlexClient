package kotlin.comparisons;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _UComparisons.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/comparisons/UComparisonsKt___UComparisonsKt.class */
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static final int m1386maxOfJ1ME1BU(int a, int b) {
        return Integer.compareUnsigned(a, b) >= 0 ? a : b;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static final long m1387maxOfeb3DHEI(long a, long b) {
        return Long.compareUnsigned(a, b) >= 0 ? a : b;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m1388maxOfKr8caGY(byte a, byte b) {
        return Intrinsics.compare(a & 255, b & 255) >= 0 ? a : b;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m1389maxOf5PvTz6A(short a, short b) {
        return Intrinsics.compare(a & 65535, b & 65535) >= 0 ? a : b;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m1390maxOfWZ9TVnA(int a, int b, int c) {
        return UComparisonsKt.m1386maxOfJ1ME1BU(a, UComparisonsKt.m1386maxOfJ1ME1BU(b, c));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m1391maxOfsambcqE(long a, long b, long c) {
        return UComparisonsKt.m1387maxOfeb3DHEI(a, UComparisonsKt.m1387maxOfeb3DHEI(b, c));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m1392maxOfb33U2AM(byte a, byte b, byte c) {
        return UComparisonsKt.m1388maxOfKr8caGY(a, UComparisonsKt.m1388maxOfKr8caGY(b, c));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m1393maxOfVKSA0NQ(short a, short b, short c) {
        return UComparisonsKt.m1389maxOf5PvTz6A(a, UComparisonsKt.m1389maxOf5PvTz6A(b, c));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m1394maxOfMd2H83M(int a, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int max = a;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(other);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int e = UIntArray.m332getpVg5ArA(other, i);
            max = UComparisonsKt.m1386maxOfJ1ME1BU(max, e);
        }
        return max;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m1395maxOfR03FKyM(long a, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        long max = a;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(other);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long e = ULongArray.m412getsVKNKU(other, i);
            max = UComparisonsKt.m1387maxOfeb3DHEI(max, e);
        }
        return max;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m1396maxOfWr6uiD8(byte a, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte max = a;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(other);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte e = UByteArray.m252getw2LRezQ(other, i);
            max = UComparisonsKt.m1388maxOfKr8caGY(max, e);
        }
        return max;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m1397maxOft1qELG4(short a, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        short max = a;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(other);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short e = UShortArray.m519getMh2AYeg(other, i);
            max = UComparisonsKt.m1389maxOf5PvTz6A(max, e);
        }
        return max;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static final int m1398minOfJ1ME1BU(int a, int b) {
        return Integer.compareUnsigned(a, b) <= 0 ? a : b;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static final long m1399minOfeb3DHEI(long a, long b) {
        return Long.compareUnsigned(a, b) <= 0 ? a : b;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m1400minOfKr8caGY(byte a, byte b) {
        return Intrinsics.compare(a & 255, b & 255) <= 0 ? a : b;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m1401minOf5PvTz6A(short a, short b) {
        return Intrinsics.compare(a & 65535, b & 65535) <= 0 ? a : b;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m1402minOfWZ9TVnA(int a, int b, int c) {
        return UComparisonsKt.m1398minOfJ1ME1BU(a, UComparisonsKt.m1398minOfJ1ME1BU(b, c));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m1403minOfsambcqE(long a, long b, long c) {
        return UComparisonsKt.m1399minOfeb3DHEI(a, UComparisonsKt.m1399minOfeb3DHEI(b, c));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m1404minOfb33U2AM(byte a, byte b, byte c) {
        return UComparisonsKt.m1400minOfKr8caGY(a, UComparisonsKt.m1400minOfKr8caGY(b, c));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m1405minOfVKSA0NQ(short a, short b, short c) {
        return UComparisonsKt.m1401minOf5PvTz6A(a, UComparisonsKt.m1401minOf5PvTz6A(b, c));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m1406minOfMd2H83M(int a, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int min = a;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(other);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int e = UIntArray.m332getpVg5ArA(other, i);
            min = UComparisonsKt.m1398minOfJ1ME1BU(min, e);
        }
        return min;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m1407minOfR03FKyM(long a, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        long min = a;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(other);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long e = ULongArray.m412getsVKNKU(other, i);
            min = UComparisonsKt.m1399minOfeb3DHEI(min, e);
        }
        return min;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m1408minOfWr6uiD8(byte a, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte min = a;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(other);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte e = UByteArray.m252getw2LRezQ(other, i);
            min = UComparisonsKt.m1400minOfKr8caGY(min, e);
        }
        return min;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m1409minOft1qELG4(short a, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        short min = a;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(other);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short e = UShortArray.m519getMh2AYeg(other, i);
            min = UComparisonsKt.m1401minOf5PvTz6A(min, e);
        }
        return min;
    }
}
