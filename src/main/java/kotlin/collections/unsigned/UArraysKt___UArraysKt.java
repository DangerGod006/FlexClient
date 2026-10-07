package kotlin.collections.unsigned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt;
import kotlin.collections.UArraySortingKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _UArrays.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/unsigned/UArraysKt___UArraysKt.class */
public class UArraysKt___UArraysKt extends UArraysKt___UArraysJvmKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m1013getIndicesajY9A$annotations(int[] iArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m1015getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m1017getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m1019getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m1021getLastIndexajY9A$annotations(int[] iArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m1023getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m1025getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m1027getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component1--ajY-9A, reason: not valid java name */
    private static final int m728component1ajY9A(int[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UIntArray.m332getpVg5ArA(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component1-QwZRm1k, reason: not valid java name */
    private static final long m729component1QwZRm1k(long[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return ULongArray.m412getsVKNKU(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component1-GBYM_sE, reason: not valid java name */
    private static final byte m730component1GBYM_sE(byte[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UByteArray.m252getw2LRezQ(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component1-rL5Bavg, reason: not valid java name */
    private static final short m731component1rL5Bavg(short[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UShortArray.m519getMh2AYeg(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component2--ajY-9A, reason: not valid java name */
    private static final int m732component2ajY9A(int[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UIntArray.m332getpVg5ArA(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component2-QwZRm1k, reason: not valid java name */
    private static final long m733component2QwZRm1k(long[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return ULongArray.m412getsVKNKU(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component2-GBYM_sE, reason: not valid java name */
    private static final byte m734component2GBYM_sE(byte[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UByteArray.m252getw2LRezQ(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component2-rL5Bavg, reason: not valid java name */
    private static final short m735component2rL5Bavg(short[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UShortArray.m519getMh2AYeg(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component3--ajY-9A, reason: not valid java name */
    private static final int m736component3ajY9A(int[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UIntArray.m332getpVg5ArA(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component3-QwZRm1k, reason: not valid java name */
    private static final long m737component3QwZRm1k(long[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return ULongArray.m412getsVKNKU(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component3-GBYM_sE, reason: not valid java name */
    private static final byte m738component3GBYM_sE(byte[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UByteArray.m252getw2LRezQ(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component3-rL5Bavg, reason: not valid java name */
    private static final short m739component3rL5Bavg(short[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UShortArray.m519getMh2AYeg(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component4--ajY-9A, reason: not valid java name */
    private static final int m740component4ajY9A(int[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UIntArray.m332getpVg5ArA(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component4-QwZRm1k, reason: not valid java name */
    private static final long m741component4QwZRm1k(long[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return ULongArray.m412getsVKNKU(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component4-GBYM_sE, reason: not valid java name */
    private static final byte m742component4GBYM_sE(byte[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UByteArray.m252getw2LRezQ(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component4-rL5Bavg, reason: not valid java name */
    private static final short m743component4rL5Bavg(short[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UShortArray.m519getMh2AYeg(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component5--ajY-9A, reason: not valid java name */
    private static final int m744component5ajY9A(int[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UIntArray.m332getpVg5ArA(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component5-QwZRm1k, reason: not valid java name */
    private static final long m745component5QwZRm1k(long[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return ULongArray.m412getsVKNKU(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component5-GBYM_sE, reason: not valid java name */
    private static final byte m746component5GBYM_sE(byte[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UByteArray.m252getw2LRezQ(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: component5-rL5Bavg, reason: not valid java name */
    private static final short m747component5rL5Bavg(short[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UShortArray.m519getMh2AYeg(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrElse-QxvSvLU, reason: not valid java name */
    private static final int m748elementAtOrElseQxvSvLU(int[] elementAtOrElse, int index, Function1<? super Integer, UInt> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < UIntArray.m334getSizeimpl(elementAtOrElse);
        return z ? UIntArray.m332getpVg5ArA(elementAtOrElse, index) : defaultValue.invoke(Integer.valueOf(index)).m328unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m749elementAtOrElseXw8i6dc(long[] elementAtOrElse, int index, Function1<? super Integer, ULong> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < ULongArray.m414getSizeimpl(elementAtOrElse);
        return z ? ULongArray.m412getsVKNKU(elementAtOrElse, index) : defaultValue.invoke(Integer.valueOf(index)).m408unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m750elementAtOrElsecOVybQ(byte[] elementAtOrElse, int index, Function1<? super Integer, UByte> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < UByteArray.m254getSizeimpl(elementAtOrElse);
        return z ? UByteArray.m252getw2LRezQ(elementAtOrElse, index) : defaultValue.invoke(Integer.valueOf(index)).m248unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrElse-CVVdw08, reason: not valid java name */
    private static final short m751elementAtOrElseCVVdw08(short[] elementAtOrElse, int index, Function1<? super Integer, UShort> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < UShortArray.m521getSizeimpl(elementAtOrElse);
        return z ? UShortArray.m519getMh2AYeg(elementAtOrElse, index) : defaultValue.invoke(Integer.valueOf(index)).m515unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrNull-qFRl0hI, reason: not valid java name */
    private static final UInt m752elementAtOrNullqFRl0hI(int[] elementAtOrNull, int index) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return UArraysKt.m784getOrNullqFRl0hI(elementAtOrNull, index);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrNull-r7IrZao, reason: not valid java name */
    private static final ULong m753elementAtOrNullr7IrZao(long[] elementAtOrNull, int index) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return UArraysKt.m785getOrNullr7IrZao(elementAtOrNull, index);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrNull-PpDY95g, reason: not valid java name */
    private static final UByte m754elementAtOrNullPpDY95g(byte[] elementAtOrNull, int index) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return UArraysKt.m786getOrNullPpDY95g(elementAtOrNull, index);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAtOrNull-nggk6HY, reason: not valid java name */
    private static final UShort m755elementAtOrNullnggk6HY(short[] elementAtOrNull, int index) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return UArraysKt.m787getOrNullnggk6HY(elementAtOrNull, index);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: find-jgv0xPQ, reason: not valid java name */
    private static final UInt m756findjgv0xPQ(int[] find, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(find);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int iM332getpVg5ArA = UIntArray.m332getpVg5ArA(find, i);
            if (predicate.invoke(UInt.m327boximpl(iM332getpVg5ArA)).booleanValue()) {
                return UInt.m327boximpl(iM332getpVg5ArA);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: find-MShoTSo, reason: not valid java name */
    private static final ULong m757findMShoTSo(long[] find, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(find);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long jM412getsVKNKU = ULongArray.m412getsVKNKU(find, i);
            if (predicate.invoke(ULong.m407boximpl(jM412getsVKNKU)).booleanValue()) {
                return ULong.m407boximpl(jM412getsVKNKU);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: find-JOV_ifY, reason: not valid java name */
    private static final UByte m758findJOV_ifY(byte[] find, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(find);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte bM252getw2LRezQ = UByteArray.m252getw2LRezQ(find, i);
            if (predicate.invoke(UByte.m247boximpl(bM252getw2LRezQ)).booleanValue()) {
                return UByte.m247boximpl(bM252getw2LRezQ);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: find-xTcfx_M, reason: not valid java name */
    private static final UShort m759findxTcfx_M(short[] find, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(find);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short sM519getMh2AYeg = UShortArray.m519getMh2AYeg(find, i);
            if (predicate.invoke(UShort.m514boximpl(sM519getMh2AYeg)).booleanValue()) {
                return UShort.m514boximpl(sM519getMh2AYeg);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: findLast-jgv0xPQ, reason: not valid java name */
    private static final UInt m760findLastjgv0xPQ(int[] findLast, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(findLast) - 1;
        if (0 <= iM334getSizeimpl) {
            do {
                int i = iM334getSizeimpl;
                iM334getSizeimpl--;
                int iM332getpVg5ArA = UIntArray.m332getpVg5ArA(findLast, i);
                if (predicate.invoke(UInt.m327boximpl(iM332getpVg5ArA)).booleanValue()) {
                    return UInt.m327boximpl(iM332getpVg5ArA);
                }
            } while (0 <= iM334getSizeimpl);
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: findLast-MShoTSo, reason: not valid java name */
    private static final ULong m761findLastMShoTSo(long[] findLast, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(findLast) - 1;
        if (0 <= iM414getSizeimpl) {
            do {
                int i = iM414getSizeimpl;
                iM414getSizeimpl--;
                long jM412getsVKNKU = ULongArray.m412getsVKNKU(findLast, i);
                if (predicate.invoke(ULong.m407boximpl(jM412getsVKNKU)).booleanValue()) {
                    return ULong.m407boximpl(jM412getsVKNKU);
                }
            } while (0 <= iM414getSizeimpl);
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: findLast-JOV_ifY, reason: not valid java name */
    private static final UByte m762findLastJOV_ifY(byte[] findLast, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(findLast) - 1;
        if (0 <= iM254getSizeimpl) {
            do {
                int i = iM254getSizeimpl;
                iM254getSizeimpl--;
                byte bM252getw2LRezQ = UByteArray.m252getw2LRezQ(findLast, i);
                if (predicate.invoke(UByte.m247boximpl(bM252getw2LRezQ)).booleanValue()) {
                    return UByte.m247boximpl(bM252getw2LRezQ);
                }
            } while (0 <= iM254getSizeimpl);
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: findLast-xTcfx_M, reason: not valid java name */
    private static final UShort m763findLastxTcfx_M(short[] findLast, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(findLast) - 1;
        if (0 <= iM521getSizeimpl) {
            do {
                int i = iM521getSizeimpl;
                iM521getSizeimpl--;
                short sM519getMh2AYeg = UShortArray.m519getMh2AYeg(findLast, i);
                if (predicate.invoke(UShort.m514boximpl(sM519getMh2AYeg)).booleanValue()) {
                    return UShort.m514boximpl(sM519getMh2AYeg);
                }
            } while (0 <= iM521getSizeimpl);
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first--ajY-9A, reason: not valid java name */
    private static final int m764firstajY9A(int[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return UInt.m326constructorimpl(ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-QwZRm1k, reason: not valid java name */
    private static final long m765firstQwZRm1k(long[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return ULong.m406constructorimpl(ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-GBYM_sE, reason: not valid java name */
    private static final byte m766firstGBYM_sE(byte[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return UByte.m246constructorimpl(ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-rL5Bavg, reason: not valid java name */
    private static final short m767firstrL5Bavg(short[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return UShort.m513constructorimpl(ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-jgv0xPQ, reason: not valid java name */
    private static final int m768firstjgv0xPQ(int[] first, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(first);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(first, i);
            if (predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                return element;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-MShoTSo, reason: not valid java name */
    private static final long m769firstMShoTSo(long[] first, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(first);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(first, i);
            if (predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                return element;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-JOV_ifY, reason: not valid java name */
    private static final byte m770firstJOV_ifY(byte[] first, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(first);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(first, i);
            if (predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                return element;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: first-xTcfx_M, reason: not valid java name */
    private static final short m771firstxTcfx_M(short[] first, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(first);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(first, i);
            if (predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                return element;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m772firstOrNullajY9A(@NotNull int[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UIntArray.m339isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UInt.m327boximpl(UIntArray.m332getpVg5ArA(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m773firstOrNullQwZRm1k(@NotNull long[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (ULongArray.m419isEmptyimpl(firstOrNull)) {
            return null;
        }
        return ULong.m407boximpl(ULongArray.m412getsVKNKU(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m774firstOrNullGBYM_sE(@NotNull byte[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UByteArray.m259isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UByte.m247boximpl(UByteArray.m252getw2LRezQ(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m775firstOrNullrL5Bavg(@NotNull short[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UShortArray.m526isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UShort.m514boximpl(UShortArray.m519getMh2AYeg(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: firstOrNull-jgv0xPQ, reason: not valid java name */
    private static final UInt m776firstOrNulljgv0xPQ(int[] firstOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(firstOrNull);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(firstOrNull, i);
            if (predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                return UInt.m327boximpl(element);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: firstOrNull-MShoTSo, reason: not valid java name */
    private static final ULong m777firstOrNullMShoTSo(long[] firstOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(firstOrNull);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(firstOrNull, i);
            if (predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                return ULong.m407boximpl(element);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: firstOrNull-JOV_ifY, reason: not valid java name */
    private static final UByte m778firstOrNullJOV_ifY(byte[] firstOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(firstOrNull);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(firstOrNull, i);
            if (predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                return UByte.m247boximpl(element);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: firstOrNull-xTcfx_M, reason: not valid java name */
    private static final UShort m779firstOrNullxTcfx_M(short[] firstOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(firstOrNull);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(firstOrNull, i);
            if (predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                return UShort.m514boximpl(element);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: getOrElse-QxvSvLU, reason: not valid java name */
    private static final int m780getOrElseQxvSvLU(int[] getOrElse, int index, Function1<? super Integer, UInt> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < UIntArray.m334getSizeimpl(getOrElse);
        return z ? UIntArray.m332getpVg5ArA(getOrElse, index) : defaultValue.invoke(Integer.valueOf(index)).m328unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: getOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m781getOrElseXw8i6dc(long[] getOrElse, int index, Function1<? super Integer, ULong> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < ULongArray.m414getSizeimpl(getOrElse);
        return z ? ULongArray.m412getsVKNKU(getOrElse, index) : defaultValue.invoke(Integer.valueOf(index)).m408unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: getOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m782getOrElsecOVybQ(byte[] getOrElse, int index, Function1<? super Integer, UByte> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < UByteArray.m254getSizeimpl(getOrElse);
        return z ? UByteArray.m252getw2LRezQ(getOrElse, index) : defaultValue.invoke(Integer.valueOf(index)).m248unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: getOrElse-CVVdw08, reason: not valid java name */
    private static final short m783getOrElseCVVdw08(short[] getOrElse, int index, Function1<? super Integer, UShort> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < UShortArray.m521getSizeimpl(getOrElse);
        return z ? UShortArray.m519getMh2AYeg(getOrElse, index) : defaultValue.invoke(Integer.valueOf(index)).m515unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-qFRl0hI, reason: not valid java name */
    public static final UInt m784getOrNullqFRl0hI(@NotNull int[] getOrNull, int index) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        boolean z = 0 <= index && index < UIntArray.m334getSizeimpl(getOrNull);
        if (z) {
            return UInt.m327boximpl(UIntArray.m332getpVg5ArA(getOrNull, index));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-r7IrZao, reason: not valid java name */
    public static final ULong m785getOrNullr7IrZao(@NotNull long[] getOrNull, int index) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        boolean z = 0 <= index && index < ULongArray.m414getSizeimpl(getOrNull);
        if (z) {
            return ULong.m407boximpl(ULongArray.m412getsVKNKU(getOrNull, index));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-PpDY95g, reason: not valid java name */
    public static final UByte m786getOrNullPpDY95g(@NotNull byte[] getOrNull, int index) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        boolean z = 0 <= index && index < UByteArray.m254getSizeimpl(getOrNull);
        if (z) {
            return UByte.m247boximpl(UByteArray.m252getw2LRezQ(getOrNull, index));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-nggk6HY, reason: not valid java name */
    public static final UShort m787getOrNullnggk6HY(@NotNull short[] getOrNull, int index) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        boolean z = 0 <= index && index < UShortArray.m521getSizeimpl(getOrNull);
        if (z) {
            return UShort.m514boximpl(UShortArray.m519getMh2AYeg(getOrNull, index));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOf-uWY9BYg, reason: not valid java name */
    private static final int m788indexOfuWY9BYg(int[] indexOf, int element) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, element);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOf-3uqUaXg, reason: not valid java name */
    private static final int m789indexOf3uqUaXg(long[] indexOf, long element) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, element);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOf-gMuBH34, reason: not valid java name */
    private static final int m790indexOfgMuBH34(byte[] indexOf, byte element) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, element);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOf-XzdR7RA, reason: not valid java name */
    private static final int m791indexOfXzdR7RA(short[] indexOf, short element) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, element);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfFirst-jgv0xPQ, reason: not valid java name */
    private static final int m792indexOfFirstjgv0xPQ(int[] indexOfFirst, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int index$iv = 0; index$iv < length; index$iv++) {
            int it = indexOfFirst[index$iv];
            if (predicate.invoke(UInt.m327boximpl(UInt.m326constructorimpl(it))).booleanValue()) {
                return index$iv;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfFirst-MShoTSo, reason: not valid java name */
    private static final int m793indexOfFirstMShoTSo(long[] indexOfFirst, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int index$iv = 0; index$iv < length; index$iv++) {
            long it = indexOfFirst[index$iv];
            if (predicate.invoke(ULong.m407boximpl(ULong.m406constructorimpl(it))).booleanValue()) {
                return index$iv;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfFirst-JOV_ifY, reason: not valid java name */
    private static final int m794indexOfFirstJOV_ifY(byte[] indexOfFirst, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int index$iv = 0; index$iv < length; index$iv++) {
            byte it = indexOfFirst[index$iv];
            if (predicate.invoke(UByte.m247boximpl(UByte.m246constructorimpl(it))).booleanValue()) {
                return index$iv;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfFirst-xTcfx_M, reason: not valid java name */
    private static final int m795indexOfFirstxTcfx_M(short[] indexOfFirst, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int index$iv = 0; index$iv < length; index$iv++) {
            short it = indexOfFirst[index$iv];
            if (predicate.invoke(UShort.m514boximpl(UShort.m513constructorimpl(it))).booleanValue()) {
                return index$iv;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfLast-jgv0xPQ, reason: not valid java name */
    private static final int m796indexOfLastjgv0xPQ(int[] indexOfLast, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (0 <= length) {
            do {
                int index$iv = length;
                length--;
                int it = indexOfLast[index$iv];
                if (predicate.invoke(UInt.m327boximpl(UInt.m326constructorimpl(it))).booleanValue()) {
                    return index$iv;
                }
            } while (0 <= length);
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfLast-MShoTSo, reason: not valid java name */
    private static final int m797indexOfLastMShoTSo(long[] indexOfLast, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (0 <= length) {
            do {
                int index$iv = length;
                length--;
                long it = indexOfLast[index$iv];
                if (predicate.invoke(ULong.m407boximpl(ULong.m406constructorimpl(it))).booleanValue()) {
                    return index$iv;
                }
            } while (0 <= length);
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfLast-JOV_ifY, reason: not valid java name */
    private static final int m798indexOfLastJOV_ifY(byte[] indexOfLast, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (0 <= length) {
            do {
                int index$iv = length;
                length--;
                byte it = indexOfLast[index$iv];
                if (predicate.invoke(UByte.m247boximpl(UByte.m246constructorimpl(it))).booleanValue()) {
                    return index$iv;
                }
            } while (0 <= length);
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: indexOfLast-xTcfx_M, reason: not valid java name */
    private static final int m799indexOfLastxTcfx_M(short[] indexOfLast, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (0 <= length) {
            do {
                int index$iv = length;
                length--;
                short it = indexOfLast[index$iv];
                if (predicate.invoke(UShort.m514boximpl(UShort.m513constructorimpl(it))).booleanValue()) {
                    return index$iv;
                }
            } while (0 <= length);
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last--ajY-9A, reason: not valid java name */
    private static final int m800lastajY9A(int[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return UInt.m326constructorimpl(ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-QwZRm1k, reason: not valid java name */
    private static final long m801lastQwZRm1k(long[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return ULong.m406constructorimpl(ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-GBYM_sE, reason: not valid java name */
    private static final byte m802lastGBYM_sE(byte[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return UByte.m246constructorimpl(ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-rL5Bavg, reason: not valid java name */
    private static final short m803lastrL5Bavg(short[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return UShort.m513constructorimpl(ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-jgv0xPQ, reason: not valid java name */
    private static final int m804lastjgv0xPQ(int[] last, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(last) - 1;
        if (0 <= iM334getSizeimpl) {
            do {
                int index = iM334getSizeimpl;
                iM334getSizeimpl--;
                int element = UIntArray.m332getpVg5ArA(last, index);
                if (predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                    return element;
                }
            } while (0 <= iM334getSizeimpl);
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-MShoTSo, reason: not valid java name */
    private static final long m805lastMShoTSo(long[] last, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(last) - 1;
        if (0 <= iM414getSizeimpl) {
            do {
                int index = iM414getSizeimpl;
                iM414getSizeimpl--;
                long element = ULongArray.m412getsVKNKU(last, index);
                if (predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                    return element;
                }
            } while (0 <= iM414getSizeimpl);
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-JOV_ifY, reason: not valid java name */
    private static final byte m806lastJOV_ifY(byte[] last, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(last) - 1;
        if (0 <= iM254getSizeimpl) {
            do {
                int index = iM254getSizeimpl;
                iM254getSizeimpl--;
                byte element = UByteArray.m252getw2LRezQ(last, index);
                if (predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                    return element;
                }
            } while (0 <= iM254getSizeimpl);
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: last-xTcfx_M, reason: not valid java name */
    private static final short m807lastxTcfx_M(short[] last, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(last) - 1;
        if (0 <= iM521getSizeimpl) {
            do {
                int index = iM521getSizeimpl;
                iM521getSizeimpl--;
                short element = UShortArray.m519getMh2AYeg(last, index);
                if (predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                    return element;
                }
            } while (0 <= iM521getSizeimpl);
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastIndexOf-uWY9BYg, reason: not valid java name */
    private static final int m808lastIndexOfuWY9BYg(int[] lastIndexOf, int element) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, element);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastIndexOf-3uqUaXg, reason: not valid java name */
    private static final int m809lastIndexOf3uqUaXg(long[] lastIndexOf, long element) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, element);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastIndexOf-gMuBH34, reason: not valid java name */
    private static final int m810lastIndexOfgMuBH34(byte[] lastIndexOf, byte element) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, element);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastIndexOf-XzdR7RA, reason: not valid java name */
    private static final int m811lastIndexOfXzdR7RA(short[] lastIndexOf, short element) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, element);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m812lastOrNullajY9A(@NotNull int[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UIntArray.m339isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UInt.m327boximpl(UIntArray.m332getpVg5ArA(lastOrNull, UIntArray.m334getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m813lastOrNullQwZRm1k(@NotNull long[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (ULongArray.m419isEmptyimpl(lastOrNull)) {
            return null;
        }
        return ULong.m407boximpl(ULongArray.m412getsVKNKU(lastOrNull, ULongArray.m414getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m814lastOrNullGBYM_sE(@NotNull byte[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UByteArray.m259isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UByte.m247boximpl(UByteArray.m252getw2LRezQ(lastOrNull, UByteArray.m254getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m815lastOrNullrL5Bavg(@NotNull short[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UShortArray.m526isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UShort.m514boximpl(UShortArray.m519getMh2AYeg(lastOrNull, UShortArray.m521getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastOrNull-jgv0xPQ, reason: not valid java name */
    private static final UInt m816lastOrNulljgv0xPQ(int[] lastOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(lastOrNull) - 1;
        if (0 <= iM334getSizeimpl) {
            do {
                int index = iM334getSizeimpl;
                iM334getSizeimpl--;
                int element = UIntArray.m332getpVg5ArA(lastOrNull, index);
                if (predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                    return UInt.m327boximpl(element);
                }
            } while (0 <= iM334getSizeimpl);
            return null;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastOrNull-MShoTSo, reason: not valid java name */
    private static final ULong m817lastOrNullMShoTSo(long[] lastOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(lastOrNull) - 1;
        if (0 <= iM414getSizeimpl) {
            do {
                int index = iM414getSizeimpl;
                iM414getSizeimpl--;
                long element = ULongArray.m412getsVKNKU(lastOrNull, index);
                if (predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                    return ULong.m407boximpl(element);
                }
            } while (0 <= iM414getSizeimpl);
            return null;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastOrNull-JOV_ifY, reason: not valid java name */
    private static final UByte m818lastOrNullJOV_ifY(byte[] lastOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(lastOrNull) - 1;
        if (0 <= iM254getSizeimpl) {
            do {
                int index = iM254getSizeimpl;
                iM254getSizeimpl--;
                byte element = UByteArray.m252getw2LRezQ(lastOrNull, index);
                if (predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                    return UByte.m247boximpl(element);
                }
            } while (0 <= iM254getSizeimpl);
            return null;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: lastOrNull-xTcfx_M, reason: not valid java name */
    private static final UShort m819lastOrNullxTcfx_M(short[] lastOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(lastOrNull) - 1;
        if (0 <= iM521getSizeimpl) {
            do {
                int index = iM521getSizeimpl;
                iM521getSizeimpl--;
                short element = UShortArray.m519getMh2AYeg(lastOrNull, index);
                if (predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                    return UShort.m514boximpl(element);
                }
            } while (0 <= iM521getSizeimpl);
            return null;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: random--ajY-9A, reason: not valid java name */
    private static final int m820randomajY9A(int[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return UArraysKt.m824random2D5oskM(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: random-QwZRm1k, reason: not valid java name */
    private static final long m821randomQwZRm1k(long[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return UArraysKt.m825randomJzugnMA(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: random-GBYM_sE, reason: not valid java name */
    private static final byte m822randomGBYM_sE(byte[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return UArraysKt.m826randomoSF2wD8(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: random-rL5Bavg, reason: not valid java name */
    private static final short m823randomrL5Bavg(short[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return UArraysKt.m827randoms5X_as8(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-2D5oskM, reason: not valid java name */
    public static final int m824random2D5oskM(@NotNull int[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UIntArray.m339isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UIntArray.m332getpVg5ArA(random, random2.nextInt(UIntArray.m334getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-JzugnMA, reason: not valid java name */
    public static final long m825randomJzugnMA(@NotNull long[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (ULongArray.m419isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return ULongArray.m412getsVKNKU(random, random2.nextInt(ULongArray.m414getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-oSF2wD8, reason: not valid java name */
    public static final byte m826randomoSF2wD8(@NotNull byte[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UByteArray.m259isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UByteArray.m252getw2LRezQ(random, random2.nextInt(UByteArray.m254getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-s5X_as8, reason: not valid java name */
    public static final short m827randoms5X_as8(@NotNull short[] random, @NotNull Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UShortArray.m526isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UShortArray.m519getMh2AYeg(random, random2.nextInt(UShortArray.m521getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: randomOrNull--ajY-9A, reason: not valid java name */
    private static final UInt m828randomOrNullajY9A(int[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return UArraysKt.m832randomOrNull2D5oskM(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: randomOrNull-QwZRm1k, reason: not valid java name */
    private static final ULong m829randomOrNullQwZRm1k(long[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return UArraysKt.m833randomOrNullJzugnMA(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: randomOrNull-GBYM_sE, reason: not valid java name */
    private static final UByte m830randomOrNullGBYM_sE(byte[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return UArraysKt.m834randomOrNulloSF2wD8(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: randomOrNull-rL5Bavg, reason: not valid java name */
    private static final UShort m831randomOrNullrL5Bavg(short[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return UArraysKt.m835randomOrNulls5X_as8(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-2D5oskM, reason: not valid java name */
    public static final UInt m832randomOrNull2D5oskM(@NotNull int[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UIntArray.m339isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UInt.m327boximpl(UIntArray.m332getpVg5ArA(randomOrNull, random.nextInt(UIntArray.m334getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-JzugnMA, reason: not valid java name */
    public static final ULong m833randomOrNullJzugnMA(@NotNull long[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (ULongArray.m419isEmptyimpl(randomOrNull)) {
            return null;
        }
        return ULong.m407boximpl(ULongArray.m412getsVKNKU(randomOrNull, random.nextInt(ULongArray.m414getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-oSF2wD8, reason: not valid java name */
    public static final UByte m834randomOrNulloSF2wD8(@NotNull byte[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UByteArray.m259isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UByte.m247boximpl(UByteArray.m252getw2LRezQ(randomOrNull, random.nextInt(UByteArray.m254getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: randomOrNull-s5X_as8, reason: not valid java name */
    public static final UShort m835randomOrNulls5X_as8(@NotNull short[] randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UShortArray.m526isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UShort.m514boximpl(UShortArray.m519getMh2AYeg(randomOrNull, random.nextInt(UShortArray.m521getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single--ajY-9A, reason: not valid java name */
    private static final int m836singleajY9A(int[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return UInt.m326constructorimpl(ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-QwZRm1k, reason: not valid java name */
    private static final long m837singleQwZRm1k(long[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return ULong.m406constructorimpl(ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-GBYM_sE, reason: not valid java name */
    private static final byte m838singleGBYM_sE(byte[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return UByte.m246constructorimpl(ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-rL5Bavg, reason: not valid java name */
    private static final short m839singlerL5Bavg(short[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return UShort.m513constructorimpl(ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-jgv0xPQ, reason: not valid java name */
    private static final int m840singlejgv0xPQ(int[] single, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        UInt single2 = null;
        boolean found = false;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(single);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(single, i);
            if (predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                if (found) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                single2 = UInt.m327boximpl(element);
                found = true;
            }
        }
        if (found) {
            return single2.m328unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-MShoTSo, reason: not valid java name */
    private static final long m841singleMShoTSo(long[] single, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ULong single2 = null;
        boolean found = false;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(single);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(single, i);
            if (predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                if (found) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                single2 = ULong.m407boximpl(element);
                found = true;
            }
        }
        if (found) {
            return single2.m408unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-JOV_ifY, reason: not valid java name */
    private static final byte m842singleJOV_ifY(byte[] single, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        UByte single2 = null;
        boolean found = false;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(single);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(single, i);
            if (predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                if (found) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                single2 = UByte.m247boximpl(element);
                found = true;
            }
        }
        if (found) {
            return single2.m248unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: single-xTcfx_M, reason: not valid java name */
    private static final short m843singlexTcfx_M(short[] single, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        UShort single2 = null;
        boolean found = false;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(single);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(single, i);
            if (predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                if (found) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                single2 = UShort.m514boximpl(element);
                found = true;
            }
        }
        if (found) {
            return single2.m515unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m844singleOrNullajY9A(@NotNull int[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UIntArray.m334getSizeimpl(singleOrNull) == 1) {
            return UInt.m327boximpl(UIntArray.m332getpVg5ArA(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m845singleOrNullQwZRm1k(@NotNull long[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (ULongArray.m414getSizeimpl(singleOrNull) == 1) {
            return ULong.m407boximpl(ULongArray.m412getsVKNKU(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m846singleOrNullGBYM_sE(@NotNull byte[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UByteArray.m254getSizeimpl(singleOrNull) == 1) {
            return UByte.m247boximpl(UByteArray.m252getw2LRezQ(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m847singleOrNullrL5Bavg(@NotNull short[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UShortArray.m521getSizeimpl(singleOrNull) == 1) {
            return UShort.m514boximpl(UShortArray.m519getMh2AYeg(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: singleOrNull-jgv0xPQ, reason: not valid java name */
    private static final UInt m848singleOrNulljgv0xPQ(int[] singleOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        UInt single = null;
        boolean found = false;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(singleOrNull);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(singleOrNull, i);
            if (predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                if (found) {
                    return null;
                }
                single = UInt.m327boximpl(element);
                found = true;
            }
        }
        if (found) {
            return single;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: singleOrNull-MShoTSo, reason: not valid java name */
    private static final ULong m849singleOrNullMShoTSo(long[] singleOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ULong single = null;
        boolean found = false;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(singleOrNull);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(singleOrNull, i);
            if (predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                if (found) {
                    return null;
                }
                single = ULong.m407boximpl(element);
                found = true;
            }
        }
        if (found) {
            return single;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: singleOrNull-JOV_ifY, reason: not valid java name */
    private static final UByte m850singleOrNullJOV_ifY(byte[] singleOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        UByte single = null;
        boolean found = false;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(singleOrNull);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(singleOrNull, i);
            if (predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                if (found) {
                    return null;
                }
                single = UByte.m247boximpl(element);
                found = true;
            }
        }
        if (found) {
            return single;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: singleOrNull-xTcfx_M, reason: not valid java name */
    private static final UShort m851singleOrNullxTcfx_M(short[] singleOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        UShort single = null;
        boolean found = false;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(singleOrNull);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(singleOrNull, i);
            if (predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                if (found) {
                    return null;
                }
                single = UShort.m514boximpl(element);
                found = true;
            }
        }
        if (found) {
            return single;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m852dropqFRl0hI(@NotNull int[] drop, int n) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        return UArraysKt.m912takeLastqFRl0hI(drop, RangesKt.coerceAtLeast(UIntArray.m334getSizeimpl(drop) - n, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-r7IrZao, reason: not valid java name */
    public static final List<ULong> m853dropr7IrZao(@NotNull long[] drop, int n) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        return UArraysKt.m913takeLastr7IrZao(drop, RangesKt.coerceAtLeast(ULongArray.m414getSizeimpl(drop) - n, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-PpDY95g, reason: not valid java name */
    public static final List<UByte> m854dropPpDY95g(@NotNull byte[] drop, int n) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        return UArraysKt.m914takeLastPpDY95g(drop, RangesKt.coerceAtLeast(UByteArray.m254getSizeimpl(drop) - n, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-nggk6HY, reason: not valid java name */
    public static final List<UShort> m855dropnggk6HY(@NotNull short[] drop, int n) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        return UArraysKt.m915takeLastnggk6HY(drop, RangesKt.coerceAtLeast(UShortArray.m521getSizeimpl(drop) - n, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m856dropLastqFRl0hI(@NotNull int[] dropLast, int n) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        return UArraysKt.m908takeqFRl0hI(dropLast, RangesKt.coerceAtLeast(UIntArray.m334getSizeimpl(dropLast) - n, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-r7IrZao, reason: not valid java name */
    public static final List<ULong> m857dropLastr7IrZao(@NotNull long[] dropLast, int n) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        return UArraysKt.m909taker7IrZao(dropLast, RangesKt.coerceAtLeast(ULongArray.m414getSizeimpl(dropLast) - n, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-PpDY95g, reason: not valid java name */
    public static final List<UByte> m858dropLastPpDY95g(@NotNull byte[] dropLast, int n) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        return UArraysKt.m910takePpDY95g(dropLast, RangesKt.coerceAtLeast(UByteArray.m254getSizeimpl(dropLast) - n, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-nggk6HY, reason: not valid java name */
    public static final List<UShort> m859dropLastnggk6HY(@NotNull short[] dropLast, int n) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        return UArraysKt.m911takenggk6HY(dropLast, RangesKt.coerceAtLeast(UShortArray.m521getSizeimpl(dropLast) - n, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m860dropLastWhilejgv0xPQ(int[] dropLastWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = ArraysKt.getLastIndex(dropLastWhile); -1 < index; index--) {
            if (!predicate.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(dropLastWhile, index))).booleanValue()) {
                return UArraysKt.m908takeqFRl0hI(dropLastWhile, index + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropLastWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m861dropLastWhileMShoTSo(long[] dropLastWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = ArraysKt.getLastIndex(dropLastWhile); -1 < index; index--) {
            if (!predicate.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(dropLastWhile, index))).booleanValue()) {
                return UArraysKt.m909taker7IrZao(dropLastWhile, index + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m862dropLastWhileJOV_ifY(byte[] dropLastWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = ArraysKt.getLastIndex(dropLastWhile); -1 < index; index--) {
            if (!predicate.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(dropLastWhile, index))).booleanValue()) {
                return UArraysKt.m910takePpDY95g(dropLastWhile, index + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m863dropLastWhilexTcfx_M(short[] dropLastWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = ArraysKt.getLastIndex(dropLastWhile); -1 < index; index--) {
            if (!predicate.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(dropLastWhile, index))).booleanValue()) {
                return UArraysKt.m911takenggk6HY(dropLastWhile, index + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m864dropWhilejgv0xPQ(int[] dropWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean yielding = false;
        ArrayList list = new ArrayList();
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(dropWhile);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int item = UIntArray.m332getpVg5ArA(dropWhile, i);
            if (yielding) {
                list.add(UInt.m327boximpl(item));
            } else if (!predicate.invoke(UInt.m327boximpl(item)).booleanValue()) {
                list.add(UInt.m327boximpl(item));
                yielding = true;
            }
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m865dropWhileMShoTSo(long[] dropWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean yielding = false;
        ArrayList list = new ArrayList();
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(dropWhile);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long item = ULongArray.m412getsVKNKU(dropWhile, i);
            if (yielding) {
                list.add(ULong.m407boximpl(item));
            } else if (!predicate.invoke(ULong.m407boximpl(item)).booleanValue()) {
                list.add(ULong.m407boximpl(item));
                yielding = true;
            }
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m866dropWhileJOV_ifY(byte[] dropWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean yielding = false;
        ArrayList list = new ArrayList();
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(dropWhile);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte item = UByteArray.m252getw2LRezQ(dropWhile, i);
            if (yielding) {
                list.add(UByte.m247boximpl(item));
            } else if (!predicate.invoke(UByte.m247boximpl(item)).booleanValue()) {
                list.add(UByte.m247boximpl(item));
                yielding = true;
            }
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: dropWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m867dropWhilexTcfx_M(short[] dropWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean yielding = false;
        ArrayList list = new ArrayList();
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(dropWhile);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short item = UShortArray.m519getMh2AYeg(dropWhile, i);
            if (yielding) {
                list.add(UShort.m514boximpl(item));
            } else if (!predicate.invoke(UShort.m514boximpl(item)).booleanValue()) {
                list.add(UShort.m514boximpl(item));
                yielding = true;
            }
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filter-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m868filterjgv0xPQ(int[] filter, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(filter);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int iM332getpVg5ArA = UIntArray.m332getpVg5ArA(filter, i);
            if (predicate.invoke(UInt.m327boximpl(iM332getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m327boximpl(iM332getpVg5ArA));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filter-MShoTSo, reason: not valid java name */
    private static final List<ULong> m869filterMShoTSo(long[] filter, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(filter);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long jM412getsVKNKU = ULongArray.m412getsVKNKU(filter, i);
            if (predicate.invoke(ULong.m407boximpl(jM412getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m407boximpl(jM412getsVKNKU));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filter-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m870filterJOV_ifY(byte[] filter, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(filter);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte bM252getw2LRezQ = UByteArray.m252getw2LRezQ(filter, i);
            if (predicate.invoke(UByte.m247boximpl(bM252getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m247boximpl(bM252getw2LRezQ));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filter-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m871filterxTcfx_M(short[] filter, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(filter);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short sM519getMh2AYeg = UShortArray.m519getMh2AYeg(filter, i);
            if (predicate.invoke(UShort.m514boximpl(sM519getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m514boximpl(sM519getMh2AYeg));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexed-WyvcNBI, reason: not valid java name */
    private static final List<UInt> m872filterIndexedWyvcNBI(int[] filterIndexed, Function2<? super Integer, ? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(filterIndexed);
        for (int i2 = 0; i2 < iM334getSizeimpl; i2++) {
            int iM332getpVg5ArA = UIntArray.m332getpVg5ArA(filterIndexed, i2);
            int i3 = i;
            i++;
            if (predicate.invoke(Integer.valueOf(i3), UInt.m327boximpl(iM332getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m327boximpl(iM332getpVg5ArA));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexed-s8dVfGU, reason: not valid java name */
    private static final List<ULong> m873filterIndexeds8dVfGU(long[] filterIndexed, Function2<? super Integer, ? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(filterIndexed);
        for (int i2 = 0; i2 < iM414getSizeimpl; i2++) {
            long jM412getsVKNKU = ULongArray.m412getsVKNKU(filterIndexed, i2);
            int i3 = i;
            i++;
            if (predicate.invoke(Integer.valueOf(i3), ULong.m407boximpl(jM412getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m407boximpl(jM412getsVKNKU));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexed-ELGow60, reason: not valid java name */
    private static final List<UByte> m874filterIndexedELGow60(byte[] filterIndexed, Function2<? super Integer, ? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(filterIndexed);
        for (int i2 = 0; i2 < iM254getSizeimpl; i2++) {
            byte bM252getw2LRezQ = UByteArray.m252getw2LRezQ(filterIndexed, i2);
            int i3 = i;
            i++;
            if (predicate.invoke(Integer.valueOf(i3), UByte.m247boximpl(bM252getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m247boximpl(bM252getw2LRezQ));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexed-xzaTVY8, reason: not valid java name */
    private static final List<UShort> m875filterIndexedxzaTVY8(short[] filterIndexed, Function2<? super Integer, ? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(filterIndexed);
        for (int i2 = 0; i2 < iM521getSizeimpl; i2++) {
            short sM519getMh2AYeg = UShortArray.m519getMh2AYeg(filterIndexed, i2);
            int i3 = i;
            i++;
            if (predicate.invoke(Integer.valueOf(i3), UShort.m514boximpl(sM519getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m514boximpl(sM519getMh2AYeg));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexedTo--6EtJGI, reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m876filterIndexedTo6EtJGI(int[] filterIndexedTo, C destination, Function2<? super Integer, ? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(filterIndexedTo);
        for (int i2 = 0; i2 < iM334getSizeimpl; i2++) {
            int element = UIntArray.m332getpVg5ArA(filterIndexedTo, i2);
            int index = i;
            i++;
            if (predicate.invoke(Integer.valueOf(index), UInt.m327boximpl(element)).booleanValue()) {
                destination.add(UInt.m327boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m877filterIndexedTope2Q0Dw(long[] filterIndexedTo, C destination, Function2<? super Integer, ? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(filterIndexedTo);
        for (int i2 = 0; i2 < iM414getSizeimpl; i2++) {
            long element = ULongArray.m412getsVKNKU(filterIndexedTo, i2);
            int index = i;
            i++;
            if (predicate.invoke(Integer.valueOf(index), ULong.m407boximpl(element)).booleanValue()) {
                destination.add(ULong.m407boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m878filterIndexedToeNpIKz8(byte[] filterIndexedTo, C destination, Function2<? super Integer, ? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(filterIndexedTo);
        for (int i2 = 0; i2 < iM254getSizeimpl; i2++) {
            byte element = UByteArray.m252getw2LRezQ(filterIndexedTo, i2);
            int index = i;
            i++;
            if (predicate.invoke(Integer.valueOf(index), UByte.m247boximpl(element)).booleanValue()) {
                destination.add(UByte.m247boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m879filterIndexedToQqktQ3k(short[] filterIndexedTo, C destination, Function2<? super Integer, ? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(filterIndexedTo);
        for (int i2 = 0; i2 < iM521getSizeimpl; i2++) {
            short element = UShortArray.m519getMh2AYeg(filterIndexedTo, i2);
            int index = i;
            i++;
            if (predicate.invoke(Integer.valueOf(index), UShort.m514boximpl(element)).booleanValue()) {
                destination.add(UShort.m514boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNot-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m880filterNotjgv0xPQ(int[] filterNot, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(filterNot);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int iM332getpVg5ArA = UIntArray.m332getpVg5ArA(filterNot, i);
            if (!predicate.invoke(UInt.m327boximpl(iM332getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m327boximpl(iM332getpVg5ArA));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNot-MShoTSo, reason: not valid java name */
    private static final List<ULong> m881filterNotMShoTSo(long[] filterNot, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(filterNot);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long jM412getsVKNKU = ULongArray.m412getsVKNKU(filterNot, i);
            if (!predicate.invoke(ULong.m407boximpl(jM412getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m407boximpl(jM412getsVKNKU));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNot-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m882filterNotJOV_ifY(byte[] filterNot, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(filterNot);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte bM252getw2LRezQ = UByteArray.m252getw2LRezQ(filterNot, i);
            if (!predicate.invoke(UByte.m247boximpl(bM252getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m247boximpl(bM252getw2LRezQ));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNot-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m883filterNotxTcfx_M(short[] filterNot, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(filterNot);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short sM519getMh2AYeg = UShortArray.m519getMh2AYeg(filterNot, i);
            if (!predicate.invoke(UShort.m514boximpl(sM519getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m514boximpl(sM519getMh2AYeg));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNotTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m884filterNotTowU5IKMo(int[] filterNotTo, C destination, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(filterNotTo);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(filterNotTo, i);
            if (!predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                destination.add(UInt.m327boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNotTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m885filterNotToHqK1JgA(long[] filterNotTo, C destination, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(filterNotTo);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(filterNotTo, i);
            if (!predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                destination.add(ULong.m407boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNotTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m886filterNotTowzUQCXU(byte[] filterNotTo, C destination, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(filterNotTo);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(filterNotTo, i);
            if (!predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                destination.add(UByte.m247boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterNotTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m887filterNotTooEOeDjA(short[] filterNotTo, C destination, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(filterNotTo);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(filterNotTo, i);
            if (!predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                destination.add(UShort.m514boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m888filterTowU5IKMo(int[] filterTo, C destination, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(filterTo);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(filterTo, i);
            if (predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                destination.add(UInt.m327boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m889filterToHqK1JgA(long[] filterTo, C destination, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(filterTo);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(filterTo, i);
            if (predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                destination.add(ULong.m407boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m890filterTowzUQCXU(byte[] filterTo, C destination, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(filterTo);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(filterTo, i);
            if (predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                destination.add(UByte.m247boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: filterTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m891filterTooEOeDjA(short[] filterTo, C destination, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(filterTo);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(filterTo, i);
            if (predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                destination.add(UShort.m514boximpl(element));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-tAntMlw, reason: not valid java name */
    public static final List<UInt> m892slicetAntMlw(@NotNull int[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt.m676asListajY9A(UIntArray.m344constructorimpl(ArraysKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static final List<ULong> m893sliceZRhS8yI(@NotNull long[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt.m677asListQwZRm1k(ULongArray.m424constructorimpl(ArraysKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-c0bezYM, reason: not valid java name */
    public static final List<UByte> m894slicec0bezYM(@NotNull byte[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt.m678asListGBYM_sE(UByteArray.m264constructorimpl(ArraysKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-Q6IL4kU, reason: not valid java name */
    public static final List<UShort> m895sliceQ6IL4kU(@NotNull short[] slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt.m679asListrL5Bavg(UShortArray.m531constructorimpl(ArraysKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-HwE9HBo, reason: not valid java name */
    public static final List<UInt> m896sliceHwE9HBo(@NotNull int[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (size == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList list = new ArrayList(size);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int index = it.next().intValue();
            list.add(UInt.m327boximpl(UIntArray.m332getpVg5ArA(slice, index)));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-F7u83W8, reason: not valid java name */
    public static final List<ULong> m897sliceF7u83W8(@NotNull long[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (size == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList list = new ArrayList(size);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int index = it.next().intValue();
            list.add(ULong.m407boximpl(ULongArray.m412getsVKNKU(slice, index)));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-JQknh5Q, reason: not valid java name */
    public static final List<UByte> m898sliceJQknh5Q(@NotNull byte[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (size == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList list = new ArrayList(size);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int index = it.next().intValue();
            list.add(UByte.m247boximpl(UByteArray.m252getw2LRezQ(slice, index)));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-JGPC0-M, reason: not valid java name */
    public static final List<UShort> m899sliceJGPC0M(@NotNull short[] slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (size == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList list = new ArrayList(size);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int index = it.next().intValue();
            list.add(UShort.m514boximpl(UShortArray.m519getMh2AYeg(slice, index)));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-CFIt9YE, reason: not valid java name */
    public static final int[] m900sliceArrayCFIt9YE(@NotNull int[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UIntArray.m344constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-kzHmqpY, reason: not valid java name */
    public static final long[] m901sliceArraykzHmqpY(@NotNull long[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return ULongArray.m424constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-xo_DsdI, reason: not valid java name */
    public static final byte[] m902sliceArrayxo_DsdI(@NotNull byte[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UByteArray.m264constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-ojwP5H8, reason: not valid java name */
    public static final short[] m903sliceArrayojwP5H8(@NotNull short[] sliceArray, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UShortArray.m531constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-tAntMlw, reason: not valid java name */
    public static final int[] m904sliceArraytAntMlw(@NotNull int[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UIntArray.m344constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-ZRhS8yI, reason: not valid java name */
    public static final long[] m905sliceArrayZRhS8yI(@NotNull long[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return ULongArray.m424constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-c0bezYM, reason: not valid java name */
    public static final byte[] m906sliceArrayc0bezYM(@NotNull byte[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UByteArray.m264constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-Q6IL4kU, reason: not valid java name */
    public static final short[] m907sliceArrayQ6IL4kU(@NotNull short[] sliceArray, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UShortArray.m531constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m908takeqFRl0hI(@NotNull int[] take, int n) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.emptyList();
        }
        if (n >= UIntArray.m334getSizeimpl(take)) {
            return CollectionsKt.toList(UIntArray.m345boximpl(take));
        }
        if (n == 1) {
            return CollectionsKt.listOf(UInt.m327boximpl(UIntArray.m332getpVg5ArA(take, 0)));
        }
        int count = 0;
        ArrayList list = new ArrayList(n);
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(take);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int item = UIntArray.m332getpVg5ArA(take, i);
            list.add(UInt.m327boximpl(item));
            count++;
            if (count == n) {
                break;
            }
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-r7IrZao, reason: not valid java name */
    public static final List<ULong> m909taker7IrZao(@NotNull long[] take, int n) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.emptyList();
        }
        if (n >= ULongArray.m414getSizeimpl(take)) {
            return CollectionsKt.toList(ULongArray.m425boximpl(take));
        }
        if (n == 1) {
            return CollectionsKt.listOf(ULong.m407boximpl(ULongArray.m412getsVKNKU(take, 0)));
        }
        int count = 0;
        ArrayList list = new ArrayList(n);
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(take);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long item = ULongArray.m412getsVKNKU(take, i);
            list.add(ULong.m407boximpl(item));
            count++;
            if (count == n) {
                break;
            }
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-PpDY95g, reason: not valid java name */
    public static final List<UByte> m910takePpDY95g(@NotNull byte[] take, int n) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.emptyList();
        }
        if (n >= UByteArray.m254getSizeimpl(take)) {
            return CollectionsKt.toList(UByteArray.m265boximpl(take));
        }
        if (n == 1) {
            return CollectionsKt.listOf(UByte.m247boximpl(UByteArray.m252getw2LRezQ(take, 0)));
        }
        int count = 0;
        ArrayList list = new ArrayList(n);
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(take);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte item = UByteArray.m252getw2LRezQ(take, i);
            list.add(UByte.m247boximpl(item));
            count++;
            if (count == n) {
                break;
            }
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-nggk6HY, reason: not valid java name */
    public static final List<UShort> m911takenggk6HY(@NotNull short[] take, int n) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.emptyList();
        }
        if (n >= UShortArray.m521getSizeimpl(take)) {
            return CollectionsKt.toList(UShortArray.m532boximpl(take));
        }
        if (n == 1) {
            return CollectionsKt.listOf(UShort.m514boximpl(UShortArray.m519getMh2AYeg(take, 0)));
        }
        int count = 0;
        ArrayList list = new ArrayList(n);
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(take);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short item = UShortArray.m519getMh2AYeg(take, i);
            list.add(UShort.m514boximpl(item));
            count++;
            if (count == n) {
                break;
            }
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m912takeLastqFRl0hI(@NotNull int[] takeLast, int n) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.emptyList();
        }
        int size = UIntArray.m334getSizeimpl(takeLast);
        if (n >= size) {
            return CollectionsKt.toList(UIntArray.m345boximpl(takeLast));
        }
        if (n == 1) {
            return CollectionsKt.listOf(UInt.m327boximpl(UIntArray.m332getpVg5ArA(takeLast, size - 1)));
        }
        ArrayList list = new ArrayList(n);
        for (int index = size - n; index < size; index++) {
            list.add(UInt.m327boximpl(UIntArray.m332getpVg5ArA(takeLast, index)));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-r7IrZao, reason: not valid java name */
    public static final List<ULong> m913takeLastr7IrZao(@NotNull long[] takeLast, int n) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.emptyList();
        }
        int size = ULongArray.m414getSizeimpl(takeLast);
        if (n >= size) {
            return CollectionsKt.toList(ULongArray.m425boximpl(takeLast));
        }
        if (n == 1) {
            return CollectionsKt.listOf(ULong.m407boximpl(ULongArray.m412getsVKNKU(takeLast, size - 1)));
        }
        ArrayList list = new ArrayList(n);
        for (int index = size - n; index < size; index++) {
            list.add(ULong.m407boximpl(ULongArray.m412getsVKNKU(takeLast, index)));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-PpDY95g, reason: not valid java name */
    public static final List<UByte> m914takeLastPpDY95g(@NotNull byte[] takeLast, int n) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.emptyList();
        }
        int size = UByteArray.m254getSizeimpl(takeLast);
        if (n >= size) {
            return CollectionsKt.toList(UByteArray.m265boximpl(takeLast));
        }
        if (n == 1) {
            return CollectionsKt.listOf(UByte.m247boximpl(UByteArray.m252getw2LRezQ(takeLast, size - 1)));
        }
        ArrayList list = new ArrayList(n);
        for (int index = size - n; index < size; index++) {
            list.add(UByte.m247boximpl(UByteArray.m252getw2LRezQ(takeLast, index)));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-nggk6HY, reason: not valid java name */
    public static final List<UShort> m915takeLastnggk6HY(@NotNull short[] takeLast, int n) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + n + " is less than zero.").toString());
        }
        if (n == 0) {
            return CollectionsKt.emptyList();
        }
        int size = UShortArray.m521getSizeimpl(takeLast);
        if (n >= size) {
            return CollectionsKt.toList(UShortArray.m532boximpl(takeLast));
        }
        if (n == 1) {
            return CollectionsKt.listOf(UShort.m514boximpl(UShortArray.m519getMh2AYeg(takeLast, size - 1)));
        }
        ArrayList list = new ArrayList(n);
        for (int index = size - n; index < size; index++) {
            list.add(UShort.m514boximpl(UShortArray.m519getMh2AYeg(takeLast, index)));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m916takeLastWhilejgv0xPQ(int[] takeLastWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = ArraysKt.getLastIndex(takeLastWhile); -1 < index; index--) {
            if (!predicate.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(takeLastWhile, index))).booleanValue()) {
                return UArraysKt.m852dropqFRl0hI(takeLastWhile, index + 1);
            }
        }
        return CollectionsKt.toList(UIntArray.m345boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeLastWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m917takeLastWhileMShoTSo(long[] takeLastWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = ArraysKt.getLastIndex(takeLastWhile); -1 < index; index--) {
            if (!predicate.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(takeLastWhile, index))).booleanValue()) {
                return UArraysKt.m853dropr7IrZao(takeLastWhile, index + 1);
            }
        }
        return CollectionsKt.toList(ULongArray.m425boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m918takeLastWhileJOV_ifY(byte[] takeLastWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = ArraysKt.getLastIndex(takeLastWhile); -1 < index; index--) {
            if (!predicate.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(takeLastWhile, index))).booleanValue()) {
                return UArraysKt.m854dropPpDY95g(takeLastWhile, index + 1);
            }
        }
        return CollectionsKt.toList(UByteArray.m265boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m919takeLastWhilexTcfx_M(short[] takeLastWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = ArraysKt.getLastIndex(takeLastWhile); -1 < index; index--) {
            if (!predicate.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(takeLastWhile, index))).booleanValue()) {
                return UArraysKt.m855dropnggk6HY(takeLastWhile, index + 1);
            }
        }
        return CollectionsKt.toList(UShortArray.m532boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m920takeWhilejgv0xPQ(int[] takeWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList list = new ArrayList();
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(takeWhile);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int item = UIntArray.m332getpVg5ArA(takeWhile, i);
            if (!predicate.invoke(UInt.m327boximpl(item)).booleanValue()) {
                break;
            }
            list.add(UInt.m327boximpl(item));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m921takeWhileMShoTSo(long[] takeWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList list = new ArrayList();
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(takeWhile);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long item = ULongArray.m412getsVKNKU(takeWhile, i);
            if (!predicate.invoke(ULong.m407boximpl(item)).booleanValue()) {
                break;
            }
            list.add(ULong.m407boximpl(item));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m922takeWhileJOV_ifY(byte[] takeWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList list = new ArrayList();
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(takeWhile);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte item = UByteArray.m252getw2LRezQ(takeWhile, i);
            if (!predicate.invoke(UByte.m247boximpl(item)).booleanValue()) {
                break;
            }
            list.add(UByte.m247boximpl(item));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: takeWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m923takeWhilexTcfx_M(short[] takeWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList list = new ArrayList();
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(takeWhile);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short item = UShortArray.m519getMh2AYeg(takeWhile, i);
            if (!predicate.invoke(UShort.m514boximpl(item)).booleanValue()) {
                break;
            }
            list.add(UShort.m514boximpl(item));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse--ajY-9A, reason: not valid java name */
    private static final void m924reverseajY9A(int[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-QwZRm1k, reason: not valid java name */
    private static final void m925reverseQwZRm1k(long[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-GBYM_sE, reason: not valid java name */
    private static final void m926reverseGBYM_sE(byte[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-rL5Bavg, reason: not valid java name */
    private static final void m927reverserL5Bavg(short[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-oBK06Vg, reason: not valid java name */
    private static final void m928reverseoBK06Vg(int[] reverse, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, fromIndex, toIndex);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse--nroSd4, reason: not valid java name */
    private static final void m929reversenroSd4(long[] reverse, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, fromIndex, toIndex);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-4UcCI2c, reason: not valid java name */
    private static final void m930reverse4UcCI2c(byte[] reverse, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, fromIndex, toIndex);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reverse-Aa5vz7o, reason: not valid java name */
    private static final void m931reverseAa5vz7o(short[] reverse, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, fromIndex, toIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed--ajY-9A, reason: not valid java name */
    public static final List<UInt> m932reversedajY9A(@NotNull int[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UIntArray.m339isEmptyimpl(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<UInt> mutableList = CollectionsKt.toMutableList((Collection) UIntArray.m345boximpl(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m933reversedQwZRm1k(@NotNull long[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (ULongArray.m419isEmptyimpl(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<ULong> mutableList = CollectionsKt.toMutableList((Collection) ULongArray.m425boximpl(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m934reversedGBYM_sE(@NotNull byte[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UByteArray.m259isEmptyimpl(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<UByte> mutableList = CollectionsKt.toMutableList((Collection) UByteArray.m265boximpl(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m935reversedrL5Bavg(@NotNull short[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UShortArray.m526isEmptyimpl(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<UShort> mutableList = CollectionsKt.toMutableList((Collection) UShortArray.m532boximpl(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reversedArray--ajY-9A, reason: not valid java name */
    private static final int[] m936reversedArrayajY9A(int[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return UIntArray.m344constructorimpl(ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reversedArray-QwZRm1k, reason: not valid java name */
    private static final long[] m937reversedArrayQwZRm1k(long[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return ULongArray.m424constructorimpl(ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reversedArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m938reversedArrayGBYM_sE(byte[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return UByteArray.m264constructorimpl(ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reversedArray-rL5Bavg, reason: not valid java name */
    private static final short[] m939reversedArrayrL5Bavg(short[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return UShortArray.m531constructorimpl(ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle--ajY-9A, reason: not valid java name */
    public static final void m940shuffleajY9A(@NotNull int[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        UArraysKt.m944shuffle2D5oskM(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-QwZRm1k, reason: not valid java name */
    public static final void m941shuffleQwZRm1k(@NotNull long[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        UArraysKt.m945shuffleJzugnMA(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-GBYM_sE, reason: not valid java name */
    public static final void m942shuffleGBYM_sE(@NotNull byte[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        UArraysKt.m946shuffleoSF2wD8(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-rL5Bavg, reason: not valid java name */
    public static final void m943shufflerL5Bavg(@NotNull short[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        UArraysKt.m947shuffles5X_as8(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-2D5oskM, reason: not valid java name */
    public static final void m944shuffle2D5oskM(@NotNull int[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int i = ArraysKt.getLastIndex(shuffle); 0 < i; i--) {
            int j = random.nextInt(i + 1);
            int copy = UIntArray.m332getpVg5ArA(shuffle, i);
            UIntArray.m333setVXSXFK8(shuffle, i, UIntArray.m332getpVg5ArA(shuffle, j));
            UIntArray.m333setVXSXFK8(shuffle, j, copy);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-JzugnMA, reason: not valid java name */
    public static final void m945shuffleJzugnMA(@NotNull long[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int i = ArraysKt.getLastIndex(shuffle); 0 < i; i--) {
            int j = random.nextInt(i + 1);
            long copy = ULongArray.m412getsVKNKU(shuffle, i);
            ULongArray.m413setk8EXiF4(shuffle, i, ULongArray.m412getsVKNKU(shuffle, j));
            ULongArray.m413setk8EXiF4(shuffle, j, copy);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-oSF2wD8, reason: not valid java name */
    public static final void m946shuffleoSF2wD8(@NotNull byte[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int i = ArraysKt.getLastIndex(shuffle); 0 < i; i--) {
            int j = random.nextInt(i + 1);
            byte copy = UByteArray.m252getw2LRezQ(shuffle, i);
            UByteArray.m253setVurrAj0(shuffle, i, UByteArray.m252getw2LRezQ(shuffle, j));
            UByteArray.m253setVurrAj0(shuffle, j, copy);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-s5X_as8, reason: not valid java name */
    public static final void m947shuffles5X_as8(@NotNull short[] shuffle, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int i = ArraysKt.getLastIndex(shuffle); 0 < i; i--) {
            int j = random.nextInt(i + 1);
            short copy = UShortArray.m519getMh2AYeg(shuffle, i);
            UShortArray.m520set01HTLdE(shuffle, i, UShortArray.m519getMh2AYeg(shuffle, j));
            UShortArray.m520set01HTLdE(shuffle, j, copy);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending--ajY-9A, reason: not valid java name */
    public static final void m948sortDescendingajY9A(@NotNull int[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UIntArray.m334getSizeimpl(sortDescending) > 1) {
            UArraysKt.m1040sortajY9A(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-QwZRm1k, reason: not valid java name */
    public static final void m949sortDescendingQwZRm1k(@NotNull long[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (ULongArray.m414getSizeimpl(sortDescending) > 1) {
            UArraysKt.m1041sortQwZRm1k(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-GBYM_sE, reason: not valid java name */
    public static final void m950sortDescendingGBYM_sE(@NotNull byte[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UByteArray.m254getSizeimpl(sortDescending) > 1) {
            UArraysKt.m1042sortGBYM_sE(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-rL5Bavg, reason: not valid java name */
    public static final void m951sortDescendingrL5Bavg(@NotNull short[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UShortArray.m521getSizeimpl(sortDescending) > 1) {
            UArraysKt.m1043sortrL5Bavg(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted--ajY-9A, reason: not valid java name */
    public static final List<UInt> m952sortedajY9A(@NotNull int[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        int[] iArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] $this$sorted__ajY_9A_u24lambda_u2428 = UIntArray.m344constructorimpl(iArrCopyOf);
        UArraysKt.m1040sortajY9A($this$sorted__ajY_9A_u24lambda_u2428);
        return UArraysKt.m676asListajY9A($this$sorted__ajY_9A_u24lambda_u2428);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m953sortedQwZRm1k(@NotNull long[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        long[] jArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] $this$sorted_QwZRm1k_u24lambda_u2429 = ULongArray.m424constructorimpl(jArrCopyOf);
        UArraysKt.m1041sortQwZRm1k($this$sorted_QwZRm1k_u24lambda_u2429);
        return UArraysKt.m677asListQwZRm1k($this$sorted_QwZRm1k_u24lambda_u2429);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m954sortedGBYM_sE(@NotNull byte[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        byte[] bArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] $this$sorted_GBYM_sE_u24lambda_u2430 = UByteArray.m264constructorimpl(bArrCopyOf);
        UArraysKt.m1042sortGBYM_sE($this$sorted_GBYM_sE_u24lambda_u2430);
        return UArraysKt.m678asListGBYM_sE($this$sorted_GBYM_sE_u24lambda_u2430);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m955sortedrL5Bavg(@NotNull short[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        short[] sArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] $this$sorted_rL5Bavg_u24lambda_u2431 = UShortArray.m531constructorimpl(sArrCopyOf);
        UArraysKt.m1043sortrL5Bavg($this$sorted_rL5Bavg_u24lambda_u2431);
        return UArraysKt.m679asListrL5Bavg($this$sorted_rL5Bavg_u24lambda_u2431);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray--ajY-9A, reason: not valid java name */
    public static final int[] m956sortedArrayajY9A(@NotNull int[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UIntArray.m339isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] $this$sortedArray__ajY_9A_u24lambda_u2432 = UIntArray.m344constructorimpl(iArrCopyOf);
        UArraysKt.m1040sortajY9A($this$sortedArray__ajY_9A_u24lambda_u2432);
        return $this$sortedArray__ajY_9A_u24lambda_u2432;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-QwZRm1k, reason: not valid java name */
    public static final long[] m957sortedArrayQwZRm1k(@NotNull long[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (ULongArray.m419isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] $this$sortedArray_QwZRm1k_u24lambda_u2433 = ULongArray.m424constructorimpl(jArrCopyOf);
        UArraysKt.m1041sortQwZRm1k($this$sortedArray_QwZRm1k_u24lambda_u2433);
        return $this$sortedArray_QwZRm1k_u24lambda_u2433;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-GBYM_sE, reason: not valid java name */
    public static final byte[] m958sortedArrayGBYM_sE(@NotNull byte[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UByteArray.m259isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] $this$sortedArray_GBYM_sE_u24lambda_u2434 = UByteArray.m264constructorimpl(bArrCopyOf);
        UArraysKt.m1042sortGBYM_sE($this$sortedArray_GBYM_sE_u24lambda_u2434);
        return $this$sortedArray_GBYM_sE_u24lambda_u2434;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-rL5Bavg, reason: not valid java name */
    public static final short[] m959sortedArrayrL5Bavg(@NotNull short[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UShortArray.m526isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] $this$sortedArray_rL5Bavg_u24lambda_u2435 = UShortArray.m531constructorimpl(sArrCopyOf);
        UArraysKt.m1043sortrL5Bavg($this$sortedArray_rL5Bavg_u24lambda_u2435);
        return $this$sortedArray_rL5Bavg_u24lambda_u2435;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending--ajY-9A, reason: not valid java name */
    public static final int[] m960sortedArrayDescendingajY9A(@NotNull int[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UIntArray.m339isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] $this$sortedArrayDescending__ajY_9A_u24lambda_u2436 = UIntArray.m344constructorimpl(iArrCopyOf);
        UArraysKt.m948sortDescendingajY9A($this$sortedArrayDescending__ajY_9A_u24lambda_u2436);
        return $this$sortedArrayDescending__ajY_9A_u24lambda_u2436;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-QwZRm1k, reason: not valid java name */
    public static final long[] m961sortedArrayDescendingQwZRm1k(@NotNull long[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (ULongArray.m419isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] $this$sortedArrayDescending_QwZRm1k_u24lambda_u2437 = ULongArray.m424constructorimpl(jArrCopyOf);
        UArraysKt.m949sortDescendingQwZRm1k($this$sortedArrayDescending_QwZRm1k_u24lambda_u2437);
        return $this$sortedArrayDescending_QwZRm1k_u24lambda_u2437;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-GBYM_sE, reason: not valid java name */
    public static final byte[] m962sortedArrayDescendingGBYM_sE(@NotNull byte[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UByteArray.m259isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] $this$sortedArrayDescending_GBYM_sE_u24lambda_u2438 = UByteArray.m264constructorimpl(bArrCopyOf);
        UArraysKt.m950sortDescendingGBYM_sE($this$sortedArrayDescending_GBYM_sE_u24lambda_u2438);
        return $this$sortedArrayDescending_GBYM_sE_u24lambda_u2438;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-rL5Bavg, reason: not valid java name */
    public static final short[] m963sortedArrayDescendingrL5Bavg(@NotNull short[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UShortArray.m526isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] $this$sortedArrayDescending_rL5Bavg_u24lambda_u2439 = UShortArray.m531constructorimpl(sArrCopyOf);
        UArraysKt.m951sortDescendingrL5Bavg($this$sortedArrayDescending_rL5Bavg_u24lambda_u2439);
        return $this$sortedArrayDescending_rL5Bavg_u24lambda_u2439;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending--ajY-9A, reason: not valid java name */
    public static final List<UInt> m964sortedDescendingajY9A(@NotNull int[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        int[] iArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] $this$sortedDescending__ajY_9A_u24lambda_u2440 = UIntArray.m344constructorimpl(iArrCopyOf);
        UArraysKt.m1040sortajY9A($this$sortedDescending__ajY_9A_u24lambda_u2440);
        return UArraysKt.m932reversedajY9A($this$sortedDescending__ajY_9A_u24lambda_u2440);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m965sortedDescendingQwZRm1k(@NotNull long[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        long[] jArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] $this$sortedDescending_QwZRm1k_u24lambda_u2441 = ULongArray.m424constructorimpl(jArrCopyOf);
        UArraysKt.m1041sortQwZRm1k($this$sortedDescending_QwZRm1k_u24lambda_u2441);
        return UArraysKt.m933reversedQwZRm1k($this$sortedDescending_QwZRm1k_u24lambda_u2441);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m966sortedDescendingGBYM_sE(@NotNull byte[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        byte[] bArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] $this$sortedDescending_GBYM_sE_u24lambda_u2442 = UByteArray.m264constructorimpl(bArrCopyOf);
        UArraysKt.m1042sortGBYM_sE($this$sortedDescending_GBYM_sE_u24lambda_u2442);
        return UArraysKt.m934reversedGBYM_sE($this$sortedDescending_GBYM_sE_u24lambda_u2442);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m967sortedDescendingrL5Bavg(@NotNull short[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        short[] sArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] $this$sortedDescending_rL5Bavg_u24lambda_u2443 = UShortArray.m531constructorimpl(sArrCopyOf);
        UArraysKt.m1043sortrL5Bavg($this$sortedDescending_rL5Bavg_u24lambda_u2443);
        return UArraysKt.m935reversedrL5Bavg($this$sortedDescending_rL5Bavg_u24lambda_u2443);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: asByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m968asByteArrayGBYM_sE(byte[] asByteArray) {
        Intrinsics.checkNotNullParameter(asByteArray, "$this$asByteArray");
        return asByteArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: asIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m969asIntArrayajY9A(int[] asIntArray) {
        Intrinsics.checkNotNullParameter(asIntArray, "$this$asIntArray");
        return asIntArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: asLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m970asLongArrayQwZRm1k(long[] asLongArray) {
        Intrinsics.checkNotNullParameter(asLongArray, "$this$asLongArray");
        return asLongArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: asShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m971asShortArrayrL5Bavg(short[] asShortArray) {
        Intrinsics.checkNotNullParameter(asShortArray, "$this$asShortArray");
        return asShortArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] asUByteArray(byte[] $this$asUByteArray) {
        Intrinsics.checkNotNullParameter($this$asUByteArray, "<this>");
        return UByteArray.m264constructorimpl($this$asUByteArray);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] asUIntArray(int[] $this$asUIntArray) {
        Intrinsics.checkNotNullParameter($this$asUIntArray, "<this>");
        return UIntArray.m344constructorimpl($this$asUIntArray);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] asULongArray(long[] $this$asULongArray) {
        Intrinsics.checkNotNullParameter($this$asULongArray, "<this>");
        return ULongArray.m424constructorimpl($this$asULongArray);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] asUShortArray(short[] $this$asUShortArray) {
        Intrinsics.checkNotNullParameter($this$asUShortArray, "<this>");
        return UShortArray.m531constructorimpl($this$asUShortArray);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static final boolean m972contentEqualsKJPZfPQ(@Nullable int[] $this$contentEquals_u2dKJPZfPQ, @Nullable int[] other) {
        int[] iArr = $this$contentEquals_u2dKJPZfPQ;
        if (iArr == null) {
            iArr = null;
        }
        int[] iArr2 = other;
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static final boolean m973contentEqualslec5QzE(@Nullable long[] $this$contentEquals_u2dlec5QzE, @Nullable long[] other) {
        long[] jArr = $this$contentEquals_u2dlec5QzE;
        if (jArr == null) {
            jArr = null;
        }
        long[] jArr2 = other;
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static final boolean m974contentEqualskV0jMPg(@Nullable byte[] $this$contentEquals_u2dkV0jMPg, @Nullable byte[] other) {
        byte[] bArr = $this$contentEquals_u2dkV0jMPg;
        if (bArr == null) {
            bArr = null;
        }
        byte[] bArr2 = other;
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static final boolean m975contentEqualsFGO6Aew(@Nullable short[] $this$contentEquals_u2dFGO6Aew, @Nullable short[] other) {
        short[] sArr = $this$contentEquals_u2dFGO6Aew;
        if (sArr == null) {
            sArr = null;
        }
        short[] sArr2 = other;
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-XUkPCBk, reason: not valid java name */
    public static final int m976contentHashCodeXUkPCBk(@Nullable int[] $this$contentHashCode_u2dXUkPCBk) {
        int[] iArr = $this$contentHashCode_u2dXUkPCBk;
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-uLth9ew, reason: not valid java name */
    public static final int m977contentHashCodeuLth9ew(@Nullable long[] $this$contentHashCode_u2duLth9ew) {
        long[] jArr = $this$contentHashCode_u2duLth9ew;
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-2csIQuQ, reason: not valid java name */
    public static final int m978contentHashCode2csIQuQ(@Nullable byte[] $this$contentHashCode_u2d2csIQuQ) {
        byte[] bArr = $this$contentHashCode_u2d2csIQuQ;
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-d-6D3K8, reason: not valid java name */
    public static final int m979contentHashCoded6D3K8(@Nullable short[] $this$contentHashCode_u2dd_u2d6D3K8) {
        short[] sArr = $this$contentHashCode_u2dd_u2d6D3K8;
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static final String m980contentToStringXUkPCBk(@Nullable int[] $this$contentToString_u2dXUkPCBk) {
        if ($this$contentToString_u2dXUkPCBk != null) {
            String strJoinToString$default = CollectionsKt.joinToString$default(UIntArray.m345boximpl($this$contentToString_u2dXUkPCBk), ", ", "[", "]", 0, null, null, 56, null);
            if (strJoinToString$default != null) {
                return strJoinToString$default;
            }
        }
        return AbstractJsonLexerKt.NULL;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static final String m981contentToStringuLth9ew(@Nullable long[] $this$contentToString_u2duLth9ew) {
        if ($this$contentToString_u2duLth9ew != null) {
            String strJoinToString$default = CollectionsKt.joinToString$default(ULongArray.m425boximpl($this$contentToString_u2duLth9ew), ", ", "[", "]", 0, null, null, 56, null);
            if (strJoinToString$default != null) {
                return strJoinToString$default;
            }
        }
        return AbstractJsonLexerKt.NULL;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static final String m982contentToString2csIQuQ(@Nullable byte[] $this$contentToString_u2d2csIQuQ) {
        if ($this$contentToString_u2d2csIQuQ != null) {
            String strJoinToString$default = CollectionsKt.joinToString$default(UByteArray.m265boximpl($this$contentToString_u2d2csIQuQ), ", ", "[", "]", 0, null, null, 56, null);
            if (strJoinToString$default != null) {
                return strJoinToString$default;
            }
        }
        return AbstractJsonLexerKt.NULL;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static final String m983contentToStringd6D3K8(@Nullable short[] $this$contentToString_u2dd_u2d6D3K8) {
        if ($this$contentToString_u2dd_u2d6D3K8 != null) {
            String strJoinToString$default = CollectionsKt.joinToString$default(UShortArray.m532boximpl($this$contentToString_u2dd_u2d6D3K8), ", ", "[", "]", 0, null, null, 56, null);
            if (strJoinToString$default != null) {
                return strJoinToString$default;
            }
        }
        return AbstractJsonLexerKt.NULL;
    }

    /* JADX INFO: renamed from: copyInto-sIZ3KeM$default, reason: not valid java name */
    static /* synthetic */ int[] m985copyIntosIZ3KeM$default(int[] copyInto, int[] destination, int destinationOffset, int startIndex, int endIndex, int i, Object obj) {
        if ((i & 2) != 0) {
            destinationOffset = 0;
        }
        if ((i & 4) != 0) {
            startIndex = 0;
        }
        if ((i & 8) != 0) {
            endIndex = UIntArray.m334getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, destinationOffset, startIndex, endIndex);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyInto-sIZ3KeM, reason: not valid java name */
    private static final int[] m984copyIntosIZ3KeM(int[] copyInto, int[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, destinationOffset, startIndex, endIndex);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto--B0-L2c$default, reason: not valid java name */
    static /* synthetic */ long[] m987copyIntoB0L2c$default(long[] copyInto, long[] destination, int destinationOffset, int startIndex, int endIndex, int i, Object obj) {
        if ((i & 2) != 0) {
            destinationOffset = 0;
        }
        if ((i & 4) != 0) {
            startIndex = 0;
        }
        if ((i & 8) != 0) {
            endIndex = ULongArray.m414getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, destinationOffset, startIndex, endIndex);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyInto--B0-L2c, reason: not valid java name */
    private static final long[] m986copyIntoB0L2c(long[] copyInto, long[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, destinationOffset, startIndex, endIndex);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto-FUQE5sA$default, reason: not valid java name */
    static /* synthetic */ byte[] m989copyIntoFUQE5sA$default(byte[] copyInto, byte[] destination, int destinationOffset, int startIndex, int endIndex, int i, Object obj) {
        if ((i & 2) != 0) {
            destinationOffset = 0;
        }
        if ((i & 4) != 0) {
            startIndex = 0;
        }
        if ((i & 8) != 0) {
            endIndex = UByteArray.m254getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, destinationOffset, startIndex, endIndex);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyInto-FUQE5sA, reason: not valid java name */
    private static final byte[] m988copyIntoFUQE5sA(byte[] copyInto, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, destinationOffset, startIndex, endIndex);
        return destination;
    }

    /* JADX INFO: renamed from: copyInto-9-ak10g$default, reason: not valid java name */
    static /* synthetic */ short[] m991copyInto9ak10g$default(short[] copyInto, short[] destination, int destinationOffset, int startIndex, int endIndex, int i, Object obj) {
        if ((i & 2) != 0) {
            destinationOffset = 0;
        }
        if ((i & 4) != 0) {
            startIndex = 0;
        }
        if ((i & 8) != 0) {
            endIndex = UShortArray.m521getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, destinationOffset, startIndex, endIndex);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyInto-9-ak10g, reason: not valid java name */
    private static final short[] m990copyInto9ak10g(short[] copyInto, short[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, destinationOffset, startIndex, endIndex);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf--ajY-9A, reason: not valid java name */
    private static final int[] m992copyOfajY9A(int[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return UIntArray.m344constructorimpl(iArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-QwZRm1k, reason: not valid java name */
    private static final long[] m993copyOfQwZRm1k(long[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return ULongArray.m424constructorimpl(jArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-GBYM_sE, reason: not valid java name */
    private static final byte[] m994copyOfGBYM_sE(byte[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return UByteArray.m264constructorimpl(bArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-rL5Bavg, reason: not valid java name */
    private static final short[] m995copyOfrL5Bavg(short[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return UShortArray.m531constructorimpl(sArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-qFRl0hI, reason: not valid java name */
    private static final int[] m996copyOfqFRl0hI(int[] copyOf, int newSize) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] iArrCopyOf = Arrays.copyOf(copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return UIntArray.m344constructorimpl(iArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-r7IrZao, reason: not valid java name */
    private static final long[] m997copyOfr7IrZao(long[] copyOf, int newSize) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] jArrCopyOf = Arrays.copyOf(copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return ULongArray.m424constructorimpl(jArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-PpDY95g, reason: not valid java name */
    private static final byte[] m998copyOfPpDY95g(byte[] copyOf, int newSize) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] bArrCopyOf = Arrays.copyOf(copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return UByteArray.m264constructorimpl(bArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOf-nggk6HY, reason: not valid java name */
    private static final short[] m999copyOfnggk6HY(short[] copyOf, int newSize) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] sArrCopyOf = Arrays.copyOf(copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return UShortArray.m531constructorimpl(sArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOfRange-oBK06Vg, reason: not valid java name */
    private static final int[] m1000copyOfRangeoBK06Vg(int[] copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return UIntArray.m344constructorimpl(ArraysKt.copyOfRange(copyOfRange, fromIndex, toIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOfRange--nroSd4, reason: not valid java name */
    private static final long[] m1001copyOfRangenroSd4(long[] copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return ULongArray.m424constructorimpl(ArraysKt.copyOfRange(copyOfRange, fromIndex, toIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOfRange-4UcCI2c, reason: not valid java name */
    private static final byte[] m1002copyOfRange4UcCI2c(byte[] copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return UByteArray.m264constructorimpl(ArraysKt.copyOfRange(copyOfRange, fromIndex, toIndex));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: copyOfRange-Aa5vz7o, reason: not valid java name */
    private static final short[] m1003copyOfRangeAa5vz7o(short[] copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return UShortArray.m531constructorimpl(ArraysKt.copyOfRange(copyOfRange, fromIndex, toIndex));
    }

    /* JADX INFO: renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m1005fill2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UIntArray.m334getSizeimpl(iArr);
        }
        UArraysKt.m1004fill2fe2U9s(iArr, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-2fe2U9s, reason: not valid java name */
    public static final void m1004fill2fe2U9s(@NotNull int[] fill, int element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, element, fromIndex, toIndex);
    }

    /* JADX INFO: renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m1007fillK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m414getSizeimpl(jArr);
        }
        UArraysKt.m1006fillK6DWlUc(jArr, j, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-K6DWlUc, reason: not valid java name */
    public static final void m1006fillK6DWlUc(@NotNull long[] fill, long element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, element, fromIndex, toIndex);
    }

    /* JADX INFO: renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m1009fillWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m254getSizeimpl(bArr);
        }
        UArraysKt.m1008fillWpHrYlw(bArr, b, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-WpHrYlw, reason: not valid java name */
    public static final void m1008fillWpHrYlw(@NotNull byte[] fill, byte element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, element, fromIndex, toIndex);
    }

    /* JADX INFO: renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m1011fillEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m521getSizeimpl(sArr);
        }
        UArraysKt.m1010fillEtDCXyQ(sArr, s, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-EtDCXyQ, reason: not valid java name */
    public static final void m1010fillEtDCXyQ(@NotNull short[] fill, short element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, element, fromIndex, toIndex);
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices--ajY-9A, reason: not valid java name */
    public static final IntRange m1012getIndicesajY9A(@NotNull int[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-QwZRm1k, reason: not valid java name */
    public static final IntRange m1014getIndicesQwZRm1k(@NotNull long[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-GBYM_sE, reason: not valid java name */
    public static final IntRange m1016getIndicesGBYM_sE(@NotNull byte[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-rL5Bavg, reason: not valid java name */
    public static final IntRange m1018getIndicesrL5Bavg(@NotNull short[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    /* JADX INFO: renamed from: getLastIndex--ajY-9A, reason: not valid java name */
    public static final int m1020getLastIndexajY9A(@NotNull int[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    /* JADX INFO: renamed from: getLastIndex-QwZRm1k, reason: not valid java name */
    public static final int m1022getLastIndexQwZRm1k(@NotNull long[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    /* JADX INFO: renamed from: getLastIndex-GBYM_sE, reason: not valid java name */
    public static final int m1024getLastIndexGBYM_sE(@NotNull byte[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    /* JADX INFO: renamed from: getLastIndex-rL5Bavg, reason: not valid java name */
    public static final int m1026getLastIndexrL5Bavg(@NotNull short[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-uWY9BYg, reason: not valid java name */
    private static final int[] m1028plusuWY9BYg(int[] plus, int element) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return UIntArray.m344constructorimpl(ArraysKt.plus(plus, element));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-3uqUaXg, reason: not valid java name */
    private static final long[] m1029plus3uqUaXg(long[] plus, long element) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return ULongArray.m424constructorimpl(ArraysKt.plus(plus, element));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-gMuBH34, reason: not valid java name */
    private static final byte[] m1030plusgMuBH34(byte[] plus, byte element) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return UByteArray.m264constructorimpl(ArraysKt.plus(plus, element));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-XzdR7RA, reason: not valid java name */
    private static final short[] m1031plusXzdR7RA(short[] plus, short element) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return UShortArray.m531constructorimpl(ArraysKt.plus(plus, element));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-CFIt9YE, reason: not valid java name */
    public static final int[] m1032plusCFIt9YE(@NotNull int[] plus, @NotNull Collection<UInt> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = UIntArray.m334getSizeimpl(plus);
        int[] result = Arrays.copyOf(plus, UIntArray.m334getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(result, "copyOf(...)");
        Iterator<UInt> it = elements.iterator();
        while (it.hasNext()) {
            int element = it.next().m328unboximpl();
            int i = index;
            index++;
            result[i] = element;
        }
        return UIntArray.m344constructorimpl(result);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-kzHmqpY, reason: not valid java name */
    public static final long[] m1033pluskzHmqpY(@NotNull long[] plus, @NotNull Collection<ULong> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = ULongArray.m414getSizeimpl(plus);
        long[] result = Arrays.copyOf(plus, ULongArray.m414getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(result, "copyOf(...)");
        Iterator<ULong> it = elements.iterator();
        while (it.hasNext()) {
            long element = it.next().m408unboximpl();
            int i = index;
            index++;
            result[i] = element;
        }
        return ULongArray.m424constructorimpl(result);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-xo_DsdI, reason: not valid java name */
    public static final byte[] m1034plusxo_DsdI(@NotNull byte[] plus, @NotNull Collection<UByte> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = UByteArray.m254getSizeimpl(plus);
        byte[] result = Arrays.copyOf(plus, UByteArray.m254getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(result, "copyOf(...)");
        Iterator<UByte> it = elements.iterator();
        while (it.hasNext()) {
            byte element = it.next().m248unboximpl();
            int i = index;
            index++;
            result[i] = element;
        }
        return UByteArray.m264constructorimpl(result);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-ojwP5H8, reason: not valid java name */
    public static final short[] m1035plusojwP5H8(@NotNull short[] plus, @NotNull Collection<UShort> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = UShortArray.m521getSizeimpl(plus);
        short[] result = Arrays.copyOf(plus, UShortArray.m521getSizeimpl(plus) + elements.size());
        Intrinsics.checkNotNullExpressionValue(result, "copyOf(...)");
        Iterator<UShort> it = elements.iterator();
        while (it.hasNext()) {
            short element = it.next().m515unboximpl();
            int i = index;
            index++;
            result[i] = element;
        }
        return UShortArray.m531constructorimpl(result);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-ctEhBpI, reason: not valid java name */
    private static final int[] m1036plusctEhBpI(int[] plus, int[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UIntArray.m344constructorimpl(ArraysKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-us8wMrg, reason: not valid java name */
    private static final long[] m1037plusus8wMrg(long[] plus, long[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ULongArray.m424constructorimpl(ArraysKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-kdPth3s, reason: not valid java name */
    private static final byte[] m1038pluskdPth3s(byte[] plus, byte[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UByteArray.m264constructorimpl(ArraysKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: plus-mazbYpA, reason: not valid java name */
    private static final short[] m1039plusmazbYpA(short[] plus, short[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UShortArray.m531constructorimpl(ArraysKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort--ajY-9A, reason: not valid java name */
    public static final void m1040sortajY9A(@NotNull int[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UIntArray.m334getSizeimpl(sort) > 1) {
            UArraySortingKt.m664sortArrayoBK06Vg(sort, 0, UIntArray.m334getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-QwZRm1k, reason: not valid java name */
    public static final void m1041sortQwZRm1k(@NotNull long[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (ULongArray.m414getSizeimpl(sort) > 1) {
            UArraySortingKt.m665sortArraynroSd4(sort, 0, ULongArray.m414getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-GBYM_sE, reason: not valid java name */
    public static final void m1042sortGBYM_sE(@NotNull byte[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UByteArray.m254getSizeimpl(sort) > 1) {
            UArraySortingKt.m662sortArray4UcCI2c(sort, 0, UByteArray.m254getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-rL5Bavg, reason: not valid java name */
    public static final void m1043sortrL5Bavg(@NotNull short[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UShortArray.m521getSizeimpl(sort) > 1) {
            UArraySortingKt.m663sortArrayAa5vz7o(sort, 0, UShortArray.m521getSizeimpl(sort));
        }
    }

    /* JADX INFO: renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m1045sortoBK06Vg$default(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UIntArray.m334getSizeimpl(iArr);
        }
        UArraysKt.m1044sortoBK06Vg(iArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-oBK06Vg, reason: not valid java name */
    public static final void m1044sortoBK06Vg(@NotNull int[] sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UIntArray.m334getSizeimpl(sort));
        if (fromIndex < toIndex - 1) {
            UArraySortingKt.m664sortArrayoBK06Vg(sort, fromIndex, toIndex);
        }
    }

    /* JADX INFO: renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m1047sortnroSd4$default(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = ULongArray.m414getSizeimpl(jArr);
        }
        UArraysKt.m1046sortnroSd4(jArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort--nroSd4, reason: not valid java name */
    public static final void m1046sortnroSd4(@NotNull long[] sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, ULongArray.m414getSizeimpl(sort));
        if (fromIndex < toIndex - 1) {
            UArraySortingKt.m665sortArraynroSd4(sort, fromIndex, toIndex);
        }
    }

    /* JADX INFO: renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m1049sort4UcCI2c$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UByteArray.m254getSizeimpl(bArr);
        }
        UArraysKt.m1048sort4UcCI2c(bArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-4UcCI2c, reason: not valid java name */
    public static final void m1048sort4UcCI2c(@NotNull byte[] sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UByteArray.m254getSizeimpl(sort));
        if (fromIndex < toIndex - 1) {
            UArraySortingKt.m662sortArray4UcCI2c(sort, fromIndex, toIndex);
        }
    }

    /* JADX INFO: renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m1051sortAa5vz7o$default(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UShortArray.m521getSizeimpl(sArr);
        }
        UArraysKt.m1050sortAa5vz7o(sArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-Aa5vz7o, reason: not valid java name */
    public static final void m1050sortAa5vz7o(@NotNull short[] sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UShortArray.m521getSizeimpl(sort));
        if (fromIndex < toIndex - 1) {
            UArraySortingKt.m663sortArrayAa5vz7o(sort, fromIndex, toIndex);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-oBK06Vg, reason: not valid java name */
    public static final void m1052sortDescendingoBK06Vg(@NotNull int[] sortDescending, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        UArraysKt.m1044sortoBK06Vg(sortDescending, fromIndex, toIndex);
        ArraysKt.reverse(sortDescending, fromIndex, toIndex);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending--nroSd4, reason: not valid java name */
    public static final void m1053sortDescendingnroSd4(@NotNull long[] sortDescending, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        UArraysKt.m1046sortnroSd4(sortDescending, fromIndex, toIndex);
        ArraysKt.reverse(sortDescending, fromIndex, toIndex);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-4UcCI2c, reason: not valid java name */
    public static final void m1054sortDescending4UcCI2c(@NotNull byte[] sortDescending, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        UArraysKt.m1048sort4UcCI2c(sortDescending, fromIndex, toIndex);
        ArraysKt.reverse(sortDescending, fromIndex, toIndex);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-Aa5vz7o, reason: not valid java name */
    public static final void m1055sortDescendingAa5vz7o(@NotNull short[] sortDescending, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        UArraysKt.m1050sortAa5vz7o(sortDescending, fromIndex, toIndex);
        ArraysKt.reverse(sortDescending, fromIndex, toIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: toByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m1056toByteArrayGBYM_sE(byte[] toByteArray) {
        Intrinsics.checkNotNullParameter(toByteArray, "$this$toByteArray");
        byte[] bArrCopyOf = Arrays.copyOf(toByteArray, toByteArray.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: toIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m1057toIntArrayajY9A(int[] toIntArray) {
        Intrinsics.checkNotNullParameter(toIntArray, "$this$toIntArray");
        int[] iArrCopyOf = Arrays.copyOf(toIntArray, toIntArray.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: toLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m1058toLongArrayQwZRm1k(long[] toLongArray) {
        Intrinsics.checkNotNullParameter(toLongArray, "$this$toLongArray");
        long[] jArrCopyOf = Arrays.copyOf(toLongArray, toLongArray.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: toShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m1059toShortArrayrL5Bavg(short[] toShortArray) {
        Intrinsics.checkNotNullParameter(toShortArray, "$this$toShortArray");
        short[] sArrCopyOf = Arrays.copyOf(toShortArray, toShortArray.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray--ajY-9A, reason: not valid java name */
    public static final UInt[] m1060toTypedArrayajY9A(@NotNull int[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(toTypedArray);
        UInt[] uIntArr = new UInt[iM334getSizeimpl];
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int i2 = i;
            uIntArr[i2] = UInt.m327boximpl(UIntArray.m332getpVg5ArA(toTypedArray, i2));
        }
        return uIntArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-QwZRm1k, reason: not valid java name */
    public static final ULong[] m1061toTypedArrayQwZRm1k(@NotNull long[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(toTypedArray);
        ULong[] uLongArr = new ULong[iM414getSizeimpl];
        for (int i = 0; i < iM414getSizeimpl; i++) {
            int i2 = i;
            uLongArr[i2] = ULong.m407boximpl(ULongArray.m412getsVKNKU(toTypedArray, i2));
        }
        return uLongArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-GBYM_sE, reason: not valid java name */
    public static final UByte[] m1062toTypedArrayGBYM_sE(@NotNull byte[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(toTypedArray);
        UByte[] uByteArr = new UByte[iM254getSizeimpl];
        for (int i = 0; i < iM254getSizeimpl; i++) {
            int i2 = i;
            uByteArr[i2] = UByte.m247boximpl(UByteArray.m252getw2LRezQ(toTypedArray, i2));
        }
        return uByteArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-rL5Bavg, reason: not valid java name */
    public static final UShort[] m1063toTypedArrayrL5Bavg(@NotNull short[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(toTypedArray);
        UShort[] uShortArr = new UShort[iM521getSizeimpl];
        for (int i = 0; i < iM521getSizeimpl; i++) {
            int i2 = i;
            uShortArr[i2] = UShort.m514boximpl(UShortArray.m519getMh2AYeg(toTypedArray, i2));
        }
        return uShortArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull UByte[] $this$toUByteArray) {
        Intrinsics.checkNotNullParameter($this$toUByteArray, "<this>");
        int length = $this$toUByteArray.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int index = i;
            bArr[index] = $this$toUByteArray[index].m248unboximpl();
        }
        return UByteArray.m264constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] toUByteArray(byte[] $this$toUByteArray) {
        Intrinsics.checkNotNullParameter($this$toUByteArray, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf($this$toUByteArray, $this$toUByteArray.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return UByteArray.m264constructorimpl(bArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull UInt[] $this$toUIntArray) {
        Intrinsics.checkNotNullParameter($this$toUIntArray, "<this>");
        int length = $this$toUIntArray.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            int index = i;
            iArr[index] = $this$toUIntArray[index].m328unboximpl();
        }
        return UIntArray.m344constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] toUIntArray(int[] $this$toUIntArray) {
        Intrinsics.checkNotNullParameter($this$toUIntArray, "<this>");
        int[] iArrCopyOf = Arrays.copyOf($this$toUIntArray, $this$toUIntArray.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return UIntArray.m344constructorimpl(iArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull ULong[] $this$toULongArray) {
        Intrinsics.checkNotNullParameter($this$toULongArray, "<this>");
        int length = $this$toULongArray.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            int index = i;
            jArr[index] = $this$toULongArray[index].m408unboximpl();
        }
        return ULongArray.m424constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] toULongArray(long[] $this$toULongArray) {
        Intrinsics.checkNotNullParameter($this$toULongArray, "<this>");
        long[] jArrCopyOf = Arrays.copyOf($this$toULongArray, $this$toULongArray.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return ULongArray.m424constructorimpl(jArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull UShort[] $this$toUShortArray) {
        Intrinsics.checkNotNullParameter($this$toUShortArray, "<this>");
        int length = $this$toUShortArray.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            int index = i;
            sArr[index] = $this$toUShortArray[index].m515unboximpl();
        }
        return UShortArray.m531constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] toUShortArray(short[] $this$toUShortArray) {
        Intrinsics.checkNotNullParameter($this$toUShortArray, "<this>");
        short[] sArrCopyOf = Arrays.copyOf($this$toUShortArray, $this$toUShortArray.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return UShortArray.m531constructorimpl(sArrCopyOf);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWith-jgv0xPQ, reason: not valid java name */
    private static final <V> Map<UInt, V> m1064associateWithjgv0xPQ(int[] associateWith, Function1<? super UInt, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(UIntArray.m334getSizeimpl(associateWith)), 16));
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(associateWith);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int iM332getpVg5ArA = UIntArray.m332getpVg5ArA(associateWith, i);
            result.put(UInt.m327boximpl(iM332getpVg5ArA), valueSelector.invoke(UInt.m327boximpl(iM332getpVg5ArA)));
        }
        return result;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWith-MShoTSo, reason: not valid java name */
    private static final <V> Map<ULong, V> m1065associateWithMShoTSo(long[] associateWith, Function1<? super ULong, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(ULongArray.m414getSizeimpl(associateWith)), 16));
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(associateWith);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long jM412getsVKNKU = ULongArray.m412getsVKNKU(associateWith, i);
            result.put(ULong.m407boximpl(jM412getsVKNKU), valueSelector.invoke(ULong.m407boximpl(jM412getsVKNKU)));
        }
        return result;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWith-JOV_ifY, reason: not valid java name */
    private static final <V> Map<UByte, V> m1066associateWithJOV_ifY(byte[] associateWith, Function1<? super UByte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(UByteArray.m254getSizeimpl(associateWith)), 16));
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(associateWith);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte bM252getw2LRezQ = UByteArray.m252getw2LRezQ(associateWith, i);
            result.put(UByte.m247boximpl(bM252getw2LRezQ), valueSelector.invoke(UByte.m247boximpl(bM252getw2LRezQ)));
        }
        return result;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWith-xTcfx_M, reason: not valid java name */
    private static final <V> Map<UShort, V> m1067associateWithxTcfx_M(short[] associateWith, Function1<? super UShort, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(UShortArray.m521getSizeimpl(associateWith)), 16));
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(associateWith);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short sM519getMh2AYeg = UShortArray.m519getMh2AYeg(associateWith, i);
            result.put(UShort.m514boximpl(sM519getMh2AYeg), valueSelector.invoke(UShort.m514boximpl(sM519getMh2AYeg)));
        }
        return result;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWithTo-4D70W2E, reason: not valid java name */
    private static final <V, M extends Map<? super UInt, ? super V>> M m1068associateWithTo4D70W2E(int[] associateWithTo, M destination, Function1<? super UInt, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(associateWithTo);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(associateWithTo, i);
            destination.put(UInt.m327boximpl(element), valueSelector.invoke(UInt.m327boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWithTo-X6OPwNk, reason: not valid java name */
    private static final <V, M extends Map<? super ULong, ? super V>> M m1069associateWithToX6OPwNk(long[] associateWithTo, M destination, Function1<? super ULong, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(associateWithTo);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(associateWithTo, i);
            destination.put(ULong.m407boximpl(element), valueSelector.invoke(ULong.m407boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWithTo-H21X9dk, reason: not valid java name */
    private static final <V, M extends Map<? super UByte, ? super V>> M m1070associateWithToH21X9dk(byte[] associateWithTo, M destination, Function1<? super UByte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(associateWithTo);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(associateWithTo, i);
            destination.put(UByte.m247boximpl(element), valueSelector.invoke(UByte.m247boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: associateWithTo-ciTST-8, reason: not valid java name */
    private static final <V, M extends Map<? super UShort, ? super V>> M m1071associateWithTociTST8(short[] associateWithTo, M destination, Function1<? super UShort, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(associateWithTo);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(associateWithTo, i);
            destination.put(UShort.m514boximpl(element), valueSelector.invoke(UShort.m514boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMap-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m1072flatMapjgv0xPQ(int[] flatMap, Function1<? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(flatMap);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            CollectionsKt.addAll(arrayList, transform.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(flatMap, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMap-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m1073flatMapMShoTSo(long[] flatMap, Function1<? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(flatMap);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            CollectionsKt.addAll(arrayList, transform.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(flatMap, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMap-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m1074flatMapJOV_ifY(byte[] flatMap, Function1<? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(flatMap);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            CollectionsKt.addAll(arrayList, transform.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(flatMap, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMap-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m1075flatMapxTcfx_M(short[] flatMap, Function1<? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(flatMap);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            CollectionsKt.addAll(arrayList, transform.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(flatMap, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m1076flatMapIndexedWyvcNBI(int[] flatMapIndexed, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(flatMapIndexed);
        for (int i2 = 0; i2 < iM334getSizeimpl; i2++) {
            int i3 = i;
            i++;
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i3), UInt.m327boximpl(UIntArray.m332getpVg5ArA(flatMapIndexed, i2))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m1077flatMapIndexeds8dVfGU(long[] flatMapIndexed, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(flatMapIndexed);
        for (int i2 = 0; i2 < iM414getSizeimpl; i2++) {
            int i3 = i;
            i++;
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i3), ULong.m407boximpl(ULongArray.m412getsVKNKU(flatMapIndexed, i2))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m1078flatMapIndexedELGow60(byte[] flatMapIndexed, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(flatMapIndexed);
        for (int i2 = 0; i2 < iM254getSizeimpl; i2++) {
            int i3 = i;
            i++;
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i3), UByte.m247boximpl(UByteArray.m252getw2LRezQ(flatMapIndexed, i2))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m1079flatMapIndexedxzaTVY8(short[] flatMapIndexed, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(flatMapIndexed);
        for (int i2 = 0; i2 < iM521getSizeimpl; i2++) {
            int i3 = i;
            i++;
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i3), UShort.m514boximpl(UShortArray.m519getMh2AYeg(flatMapIndexed, i2))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1080flatMapIndexedTo6EtJGI(int[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(flatMapIndexedTo);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(flatMapIndexedTo, i);
            int i2 = index;
            index++;
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), UInt.m327boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1081flatMapIndexedTope2Q0Dw(long[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(flatMapIndexedTo);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(flatMapIndexedTo, i);
            int i2 = index;
            index++;
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), ULong.m407boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1082flatMapIndexedToeNpIKz8(byte[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(flatMapIndexedTo);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(flatMapIndexedTo, i);
            int i2 = index;
            index++;
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), UByte.m247boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: flatMapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1083flatMapIndexedToQqktQ3k(short[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(flatMapIndexedTo);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(flatMapIndexedTo, i);
            int i2 = index;
            index++;
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), UShort.m514boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1084flatMapTowU5IKMo(int[] flatMapTo, C destination, Function1<? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(flatMapTo);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(flatMapTo, i);
            CollectionsKt.addAll(destination, transform.invoke(UInt.m327boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1085flatMapToHqK1JgA(long[] flatMapTo, C destination, Function1<? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(flatMapTo);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(flatMapTo, i);
            CollectionsKt.addAll(destination, transform.invoke(ULong.m407boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1086flatMapTowzUQCXU(byte[] flatMapTo, C destination, Function1<? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(flatMapTo);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(flatMapTo, i);
            CollectionsKt.addAll(destination, transform.invoke(UByte.m247boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: flatMapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1087flatMapTooEOeDjA(short[] flatMapTo, C destination, Function1<? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(flatMapTo);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(flatMapTo, i);
            CollectionsKt.addAll(destination, transform.invoke(UShort.m514boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-jgv0xPQ, reason: not valid java name */
    private static final <K> Map<K, List<UInt>> m1088groupByjgv0xPQ(int[] groupBy, Function1<? super UInt, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(groupBy);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int iM332getpVg5ArA = UIntArray.m332getpVg5ArA(groupBy, i);
            K kInvoke = keySelector.invoke(UInt.m327boximpl(iM332getpVg5ArA));
            Object obj = linkedHashMap.get(kInvoke);
            if (obj == null) {
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
                obj = arrayList;
            }
            ((List) obj).add(UInt.m327boximpl(iM332getpVg5ArA));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-MShoTSo, reason: not valid java name */
    private static final <K> Map<K, List<ULong>> m1089groupByMShoTSo(long[] groupBy, Function1<? super ULong, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(groupBy);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long jM412getsVKNKU = ULongArray.m412getsVKNKU(groupBy, i);
            K kInvoke = keySelector.invoke(ULong.m407boximpl(jM412getsVKNKU));
            Object obj = linkedHashMap.get(kInvoke);
            if (obj == null) {
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
                obj = arrayList;
            }
            ((List) obj).add(ULong.m407boximpl(jM412getsVKNKU));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-JOV_ifY, reason: not valid java name */
    private static final <K> Map<K, List<UByte>> m1090groupByJOV_ifY(byte[] groupBy, Function1<? super UByte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(groupBy);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte bM252getw2LRezQ = UByteArray.m252getw2LRezQ(groupBy, i);
            K kInvoke = keySelector.invoke(UByte.m247boximpl(bM252getw2LRezQ));
            Object obj = linkedHashMap.get(kInvoke);
            if (obj == null) {
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
                obj = arrayList;
            }
            ((List) obj).add(UByte.m247boximpl(bM252getw2LRezQ));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-xTcfx_M, reason: not valid java name */
    private static final <K> Map<K, List<UShort>> m1091groupByxTcfx_M(short[] groupBy, Function1<? super UShort, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(groupBy);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short sM519getMh2AYeg = UShortArray.m519getMh2AYeg(groupBy, i);
            K kInvoke = keySelector.invoke(UShort.m514boximpl(sM519getMh2AYeg));
            Object obj = linkedHashMap.get(kInvoke);
            if (obj == null) {
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
                obj = arrayList;
            }
            ((List) obj).add(UShort.m514boximpl(sM519getMh2AYeg));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-L4rlFek, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1092groupByL4rlFek(int[] groupBy, Function1<? super UInt, ? extends K> keySelector, Function1<? super UInt, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(groupBy);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int iM332getpVg5ArA = UIntArray.m332getpVg5ArA(groupBy, i);
            K kInvoke = keySelector.invoke(UInt.m327boximpl(iM332getpVg5ArA));
            List<V> list = linkedHashMap.get(kInvoke);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
                list = arrayList;
            }
            list.add(valueTransform.invoke(UInt.m327boximpl(iM332getpVg5ArA)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy--_j2Y-Q, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1093groupBy_j2YQ(long[] groupBy, Function1<? super ULong, ? extends K> keySelector, Function1<? super ULong, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(groupBy);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long jM412getsVKNKU = ULongArray.m412getsVKNKU(groupBy, i);
            K kInvoke = keySelector.invoke(ULong.m407boximpl(jM412getsVKNKU));
            List<V> list = linkedHashMap.get(kInvoke);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
                list = arrayList;
            }
            list.add(valueTransform.invoke(ULong.m407boximpl(jM412getsVKNKU)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-bBsjw1Y, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1094groupBybBsjw1Y(byte[] groupBy, Function1<? super UByte, ? extends K> keySelector, Function1<? super UByte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(groupBy);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte bM252getw2LRezQ = UByteArray.m252getw2LRezQ(groupBy, i);
            K kInvoke = keySelector.invoke(UByte.m247boximpl(bM252getw2LRezQ));
            List<V> list = linkedHashMap.get(kInvoke);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
                list = arrayList;
            }
            list.add(valueTransform.invoke(UByte.m247boximpl(bM252getw2LRezQ)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupBy-3bBvP4M, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m1095groupBy3bBvP4M(short[] groupBy, Function1<? super UShort, ? extends K> keySelector, Function1<? super UShort, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(groupBy);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short sM519getMh2AYeg = UShortArray.m519getMh2AYeg(groupBy, i);
            K kInvoke = keySelector.invoke(UShort.m514boximpl(sM519getMh2AYeg));
            List<V> list = linkedHashMap.get(kInvoke);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
                list = arrayList;
            }
            list.add(valueTransform.invoke(UShort.m514boximpl(sM519getMh2AYeg)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-4D70W2E, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UInt>>> M m1096groupByTo4D70W2E(int[] groupByTo, M destination, Function1<? super UInt, ? extends K> keySelector) {
        Object obj;
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(groupByTo);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(groupByTo, i);
            K kInvoke = keySelector.invoke(UInt.m327boximpl(element));
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(UInt.m327boximpl(element));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-X6OPwNk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<ULong>>> M m1097groupByToX6OPwNk(long[] groupByTo, M destination, Function1<? super ULong, ? extends K> keySelector) {
        Object obj;
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(groupByTo);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(groupByTo, i);
            K kInvoke = keySelector.invoke(ULong.m407boximpl(element));
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(ULong.m407boximpl(element));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-H21X9dk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UByte>>> M m1098groupByToH21X9dk(byte[] groupByTo, M destination, Function1<? super UByte, ? extends K> keySelector) {
        Object obj;
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(groupByTo);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(groupByTo, i);
            K kInvoke = keySelector.invoke(UByte.m247boximpl(element));
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(UByte.m247boximpl(element));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-ciTST-8, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UShort>>> M m1099groupByTociTST8(short[] groupByTo, M destination, Function1<? super UShort, ? extends K> keySelector) {
        Object obj;
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(groupByTo);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(groupByTo, i);
            K kInvoke = keySelector.invoke(UShort.m514boximpl(element));
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(UShort.m514boximpl(element));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-JM6gNCM, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1100groupByToJM6gNCM(int[] groupByTo, M destination, Function1<? super UInt, ? extends K> keySelector, Function1<? super UInt, ? extends V> valueTransform) {
        Object obj;
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(groupByTo);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(groupByTo, i);
            K kInvoke = keySelector.invoke(UInt.m327boximpl(element));
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(valueTransform.invoke(UInt.m327boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-QxgOkWg, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1101groupByToQxgOkWg(long[] groupByTo, M destination, Function1<? super ULong, ? extends K> keySelector, Function1<? super ULong, ? extends V> valueTransform) {
        Object obj;
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(groupByTo);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(groupByTo, i);
            K kInvoke = keySelector.invoke(ULong.m407boximpl(element));
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(valueTransform.invoke(ULong.m407boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-qOZmbk8, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1102groupByToqOZmbk8(byte[] groupByTo, M destination, Function1<? super UByte, ? extends K> keySelector, Function1<? super UByte, ? extends V> valueTransform) {
        Object obj;
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(groupByTo);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(groupByTo, i);
            K kInvoke = keySelector.invoke(UByte.m247boximpl(element));
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(valueTransform.invoke(UByte.m247boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: groupByTo-q8RuPII, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m1103groupByToq8RuPII(short[] groupByTo, M destination, Function1<? super UShort, ? extends K> keySelector, Function1<? super UShort, ? extends V> valueTransform) {
        Object obj;
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(groupByTo);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(groupByTo, i);
            K kInvoke = keySelector.invoke(UShort.m514boximpl(element));
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(valueTransform.invoke(UShort.m514boximpl(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: map-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m1104mapjgv0xPQ(int[] map, Function1<? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UIntArray.m334getSizeimpl(map));
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(map);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            arrayList.add(transform.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(map, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: map-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m1105mapMShoTSo(long[] map, Function1<? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(ULongArray.m414getSizeimpl(map));
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(map);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            arrayList.add(transform.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(map, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: map-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m1106mapJOV_ifY(byte[] map, Function1<? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UByteArray.m254getSizeimpl(map));
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(map);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            arrayList.add(transform.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(map, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: map-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m1107mapxTcfx_M(short[] map, Function1<? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UShortArray.m521getSizeimpl(map));
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(map);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            arrayList.add(transform.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(map, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m1108mapIndexedWyvcNBI(int[] mapIndexed, Function2<? super Integer, ? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UIntArray.m334getSizeimpl(mapIndexed));
        int i = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(mapIndexed);
        for (int i2 = 0; i2 < iM334getSizeimpl; i2++) {
            int i3 = i;
            i++;
            arrayList.add(transform.invoke(Integer.valueOf(i3), UInt.m327boximpl(UIntArray.m332getpVg5ArA(mapIndexed, i2))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m1109mapIndexeds8dVfGU(long[] mapIndexed, Function2<? super Integer, ? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(ULongArray.m414getSizeimpl(mapIndexed));
        int i = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(mapIndexed);
        for (int i2 = 0; i2 < iM414getSizeimpl; i2++) {
            int i3 = i;
            i++;
            arrayList.add(transform.invoke(Integer.valueOf(i3), ULong.m407boximpl(ULongArray.m412getsVKNKU(mapIndexed, i2))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m1110mapIndexedELGow60(byte[] mapIndexed, Function2<? super Integer, ? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UByteArray.m254getSizeimpl(mapIndexed));
        int i = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(mapIndexed);
        for (int i2 = 0; i2 < iM254getSizeimpl; i2++) {
            int i3 = i;
            i++;
            arrayList.add(transform.invoke(Integer.valueOf(i3), UByte.m247boximpl(UByteArray.m252getw2LRezQ(mapIndexed, i2))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m1111mapIndexedxzaTVY8(short[] mapIndexed, Function2<? super Integer, ? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UShortArray.m521getSizeimpl(mapIndexed));
        int i = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(mapIndexed);
        for (int i2 = 0; i2 < iM521getSizeimpl; i2++) {
            int i3 = i;
            i++;
            arrayList.add(transform.invoke(Integer.valueOf(i3), UShort.m514boximpl(UShortArray.m519getMh2AYeg(mapIndexed, i2))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1112mapIndexedTo6EtJGI(int[] mapIndexedTo, C destination, Function2<? super Integer, ? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(mapIndexedTo);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int item = UIntArray.m332getpVg5ArA(mapIndexedTo, i);
            int i2 = index;
            index++;
            destination.add(transform.invoke(Integer.valueOf(i2), UInt.m327boximpl(item)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1113mapIndexedTope2Q0Dw(long[] mapIndexedTo, C destination, Function2<? super Integer, ? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(mapIndexedTo);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long item = ULongArray.m412getsVKNKU(mapIndexedTo, i);
            int i2 = index;
            index++;
            destination.add(transform.invoke(Integer.valueOf(i2), ULong.m407boximpl(item)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1114mapIndexedToeNpIKz8(byte[] mapIndexedTo, C destination, Function2<? super Integer, ? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(mapIndexedTo);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte item = UByteArray.m252getw2LRezQ(mapIndexedTo, i);
            int i2 = index;
            index++;
            destination.add(transform.invoke(Integer.valueOf(i2), UByte.m247boximpl(item)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1115mapIndexedToQqktQ3k(short[] mapIndexedTo, C destination, Function2<? super Integer, ? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(mapIndexedTo);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short item = UShortArray.m519getMh2AYeg(mapIndexedTo, i);
            int i2 = index;
            index++;
            destination.add(transform.invoke(Integer.valueOf(i2), UShort.m514boximpl(item)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1116mapTowU5IKMo(int[] mapTo, C destination, Function1<? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(mapTo);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int item = UIntArray.m332getpVg5ArA(mapTo, i);
            destination.add(transform.invoke(UInt.m327boximpl(item)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1117mapToHqK1JgA(long[] mapTo, C destination, Function1<? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(mapTo);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long item = ULongArray.m412getsVKNKU(mapTo, i);
            destination.add(transform.invoke(ULong.m407boximpl(item)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1118mapTowzUQCXU(byte[] mapTo, C destination, Function1<? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(mapTo);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte item = UByteArray.m252getw2LRezQ(mapTo, i);
            destination.add(transform.invoke(UByte.m247boximpl(item)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: mapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m1119mapTooEOeDjA(short[] mapTo, C destination, Function1<? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(mapTo);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short item = UShortArray.m519getMh2AYeg(mapTo, i);
            destination.add(transform.invoke(UShort.m514boximpl(item)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex--ajY-9A, reason: not valid java name */
    public static final Iterable<IndexedValue<UInt>> m1120withIndexajY9A(@NotNull int[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(() -> {
            return withIndex__ajY_9A$lambda$56$UArraysKt___UArraysKt(r2);
        });
    }

    private static final Iterator withIndex__ajY_9A$lambda$56$UArraysKt___UArraysKt(int[] $this_withIndex) {
        return UIntArray.m335iteratorimpl($this_withIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-QwZRm1k, reason: not valid java name */
    public static final Iterable<IndexedValue<ULong>> m1121withIndexQwZRm1k(@NotNull long[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(() -> {
            return withIndex_QwZRm1k$lambda$57$UArraysKt___UArraysKt(r2);
        });
    }

    private static final Iterator withIndex_QwZRm1k$lambda$57$UArraysKt___UArraysKt(long[] $this_withIndex) {
        return ULongArray.m415iteratorimpl($this_withIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-GBYM_sE, reason: not valid java name */
    public static final Iterable<IndexedValue<UByte>> m1122withIndexGBYM_sE(@NotNull byte[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(() -> {
            return withIndex_GBYM_sE$lambda$58$UArraysKt___UArraysKt(r2);
        });
    }

    private static final Iterator withIndex_GBYM_sE$lambda$58$UArraysKt___UArraysKt(byte[] $this_withIndex) {
        return UByteArray.m255iteratorimpl($this_withIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-rL5Bavg, reason: not valid java name */
    public static final Iterable<IndexedValue<UShort>> m1123withIndexrL5Bavg(@NotNull short[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(() -> {
            return withIndex_rL5Bavg$lambda$59$UArraysKt___UArraysKt(r2);
        });
    }

    private static final Iterator withIndex_rL5Bavg$lambda$59$UArraysKt___UArraysKt(short[] $this_withIndex) {
        return UShortArray.m522iteratorimpl($this_withIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: all-jgv0xPQ, reason: not valid java name */
    private static final boolean m1124alljgv0xPQ(int[] all, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(all);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(all, i);
            if (!predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: all-MShoTSo, reason: not valid java name */
    private static final boolean m1125allMShoTSo(long[] all, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(all);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(all, i);
            if (!predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: all-JOV_ifY, reason: not valid java name */
    private static final boolean m1126allJOV_ifY(byte[] all, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(all);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(all, i);
            if (!predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: all-xTcfx_M, reason: not valid java name */
    private static final boolean m1127allxTcfx_M(short[] all, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(all);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(all, i);
            if (!predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any--ajY-9A, reason: not valid java name */
    private static final boolean m1128anyajY9A(int[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-QwZRm1k, reason: not valid java name */
    private static final boolean m1129anyQwZRm1k(long[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-GBYM_sE, reason: not valid java name */
    private static final boolean m1130anyGBYM_sE(byte[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-rL5Bavg, reason: not valid java name */
    private static final boolean m1131anyrL5Bavg(short[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-jgv0xPQ, reason: not valid java name */
    private static final boolean m1132anyjgv0xPQ(int[] any, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(any);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(any, i);
            if (predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-MShoTSo, reason: not valid java name */
    private static final boolean m1133anyMShoTSo(long[] any, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(any);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(any, i);
            if (predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-JOV_ifY, reason: not valid java name */
    private static final boolean m1134anyJOV_ifY(byte[] any, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(any);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(any, i);
            if (predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: any-xTcfx_M, reason: not valid java name */
    private static final boolean m1135anyxTcfx_M(short[] any, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(any);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(any, i);
            if (predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: count-jgv0xPQ, reason: not valid java name */
    private static final int m1136countjgv0xPQ(int[] count, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int count2 = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(count);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(count, i);
            if (predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                count2++;
            }
        }
        return count2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: count-MShoTSo, reason: not valid java name */
    private static final int m1137countMShoTSo(long[] count, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int count2 = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(count);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(count, i);
            if (predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                count2++;
            }
        }
        return count2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: count-JOV_ifY, reason: not valid java name */
    private static final int m1138countJOV_ifY(byte[] count, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int count2 = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(count);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(count, i);
            if (predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                count2++;
            }
        }
        return count2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: count-xTcfx_M, reason: not valid java name */
    private static final int m1139countxTcfx_M(short[] count, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int count2 = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(count);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(count, i);
            if (predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                count2++;
            }
        }
        return count2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: fold-zi1B2BA, reason: not valid java name */
    private static final <R> R m1140foldzi1B2BA(int[] fold, R r, Function2<? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(fold);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, UInt.m327boximpl(UIntArray.m332getpVg5ArA(fold, i)));
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: fold-A8wKCXQ, reason: not valid java name */
    private static final <R> R m1141foldA8wKCXQ(long[] fold, R r, Function2<? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(fold);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, ULong.m407boximpl(ULongArray.m412getsVKNKU(fold, i)));
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: fold-yXmHNn8, reason: not valid java name */
    private static final <R> R m1142foldyXmHNn8(byte[] fold, R r, Function2<? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(fold);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, UByte.m247boximpl(UByteArray.m252getw2LRezQ(fold, i)));
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: fold-zww5nb8, reason: not valid java name */
    private static final <R> R m1143foldzww5nb8(short[] fold, R r, Function2<? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(fold);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, UShort.m514boximpl(UShortArray.m519getMh2AYeg(fold, i)));
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m1144foldIndexedyVwIW0Q(int[] foldIndexed, R r, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i = 0;
        R rInvoke = r;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(foldIndexed);
        for (int i2 = 0; i2 < iM334getSizeimpl; i2++) {
            int i3 = i;
            i++;
            rInvoke = operation.invoke(Integer.valueOf(i3), (Object) rInvoke, UInt.m327boximpl(UIntArray.m332getpVg5ArA(foldIndexed, i2)));
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m1145foldIndexedmwnnOCs(long[] foldIndexed, R r, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i = 0;
        R rInvoke = r;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(foldIndexed);
        for (int i2 = 0; i2 < iM414getSizeimpl; i2++) {
            int i3 = i;
            i++;
            rInvoke = operation.invoke(Integer.valueOf(i3), (Object) rInvoke, ULong.m407boximpl(ULongArray.m412getsVKNKU(foldIndexed, i2)));
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m1146foldIndexed3iWJZGE(byte[] foldIndexed, R r, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i = 0;
        R rInvoke = r;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(foldIndexed);
        for (int i2 = 0; i2 < iM254getSizeimpl; i2++) {
            int i3 = i;
            i++;
            rInvoke = operation.invoke(Integer.valueOf(i3), (Object) rInvoke, UByte.m247boximpl(UByteArray.m252getw2LRezQ(foldIndexed, i2)));
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m1147foldIndexedbzxtMww(short[] foldIndexed, R r, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i = 0;
        R rInvoke = r;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(foldIndexed);
        for (int i2 = 0; i2 < iM521getSizeimpl; i2++) {
            int i3 = i;
            i++;
            rInvoke = operation.invoke(Integer.valueOf(i3), (Object) rInvoke, UShort.m514boximpl(UShortArray.m519getMh2AYeg(foldIndexed, i2)));
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRight-zi1B2BA, reason: not valid java name */
    private static final <R> R m1148foldRightzi1B2BA(int[] foldRight, R r, Function2<? super UInt, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(foldRight);
        R rInvoke = r;
        while (true) {
            ?? r8 = (Object) rInvoke;
            if (lastIndex >= 0) {
                int i = lastIndex;
                lastIndex--;
                rInvoke = operation.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(foldRight, i)), r8);
            } else {
                return r8;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRight-A8wKCXQ, reason: not valid java name */
    private static final <R> R m1149foldRightA8wKCXQ(long[] foldRight, R r, Function2<? super ULong, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(foldRight);
        R rInvoke = r;
        while (true) {
            ?? r8 = (Object) rInvoke;
            if (lastIndex >= 0) {
                int i = lastIndex;
                lastIndex--;
                rInvoke = operation.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(foldRight, i)), r8);
            } else {
                return r8;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRight-yXmHNn8, reason: not valid java name */
    private static final <R> R m1150foldRightyXmHNn8(byte[] foldRight, R r, Function2<? super UByte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(foldRight);
        R rInvoke = r;
        while (true) {
            ?? r8 = (Object) rInvoke;
            if (lastIndex >= 0) {
                int i = lastIndex;
                lastIndex--;
                rInvoke = operation.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(foldRight, i)), r8);
            } else {
                return r8;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRight-zww5nb8, reason: not valid java name */
    private static final <R> R m1151foldRightzww5nb8(short[] foldRight, R r, Function2<? super UShort, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(foldRight);
        R rInvoke = r;
        while (true) {
            ?? r8 = (Object) rInvoke;
            if (lastIndex >= 0) {
                int i = lastIndex;
                lastIndex--;
                rInvoke = operation.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(foldRight, i)), r8);
            } else {
                return r8;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRightIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m1152foldRightIndexedyVwIW0Q(int[] foldRightIndexed, R r, Function3<? super Integer, ? super UInt, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            rInvoke = operation.invoke(Integer.valueOf(lastIndex), UInt.m327boximpl(UIntArray.m332getpVg5ArA(foldRightIndexed, lastIndex)), (Object) rInvoke);
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRightIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m1153foldRightIndexedmwnnOCs(long[] foldRightIndexed, R r, Function3<? super Integer, ? super ULong, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            rInvoke = operation.invoke(Integer.valueOf(lastIndex), ULong.m407boximpl(ULongArray.m412getsVKNKU(foldRightIndexed, lastIndex)), (Object) rInvoke);
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRightIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m1154foldRightIndexed3iWJZGE(byte[] foldRightIndexed, R r, Function3<? super Integer, ? super UByte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            rInvoke = operation.invoke(Integer.valueOf(lastIndex), UByte.m247boximpl(UByteArray.m252getw2LRezQ(foldRightIndexed, lastIndex)), (Object) rInvoke);
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: foldRightIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m1155foldRightIndexedbzxtMww(short[] foldRightIndexed, R r, Function3<? super Integer, ? super UShort, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            rInvoke = operation.invoke(Integer.valueOf(lastIndex), UShort.m514boximpl(UShortArray.m519getMh2AYeg(foldRightIndexed, lastIndex)), (Object) rInvoke);
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEach-jgv0xPQ, reason: not valid java name */
    private static final void m1156forEachjgv0xPQ(int[] forEach, Function1<? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(forEach);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(forEach, i);
            action.invoke(UInt.m327boximpl(element));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEach-MShoTSo, reason: not valid java name */
    private static final void m1157forEachMShoTSo(long[] forEach, Function1<? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(forEach);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(forEach, i);
            action.invoke(ULong.m407boximpl(element));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEach-JOV_ifY, reason: not valid java name */
    private static final void m1158forEachJOV_ifY(byte[] forEach, Function1<? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(forEach);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(forEach, i);
            action.invoke(UByte.m247boximpl(element));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEach-xTcfx_M, reason: not valid java name */
    private static final void m1159forEachxTcfx_M(short[] forEach, Function1<? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(forEach);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(forEach, i);
            action.invoke(UShort.m514boximpl(element));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEachIndexed-WyvcNBI, reason: not valid java name */
    private static final void m1160forEachIndexedWyvcNBI(int[] forEachIndexed, Function2<? super Integer, ? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int index = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(forEachIndexed);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int item = UIntArray.m332getpVg5ArA(forEachIndexed, i);
            int i2 = index;
            index++;
            action.invoke(Integer.valueOf(i2), UInt.m327boximpl(item));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEachIndexed-s8dVfGU, reason: not valid java name */
    private static final void m1161forEachIndexeds8dVfGU(long[] forEachIndexed, Function2<? super Integer, ? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int index = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(forEachIndexed);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long item = ULongArray.m412getsVKNKU(forEachIndexed, i);
            int i2 = index;
            index++;
            action.invoke(Integer.valueOf(i2), ULong.m407boximpl(item));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEachIndexed-ELGow60, reason: not valid java name */
    private static final void m1162forEachIndexedELGow60(byte[] forEachIndexed, Function2<? super Integer, ? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int index = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(forEachIndexed);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte item = UByteArray.m252getw2LRezQ(forEachIndexed, i);
            int i2 = index;
            index++;
            action.invoke(Integer.valueOf(i2), UByte.m247boximpl(item));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: forEachIndexed-xzaTVY8, reason: not valid java name */
    private static final void m1163forEachIndexedxzaTVY8(short[] forEachIndexed, Function2<? super Integer, ? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int index = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(forEachIndexed);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short item = UShortArray.m519getMh2AYeg(forEachIndexed, i);
            int i2 = index;
            index++;
            action.invoke(Integer.valueOf(i2), UShort.m514boximpl(item));
        }
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final int m1164maxOrThrowU(@NotNull int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (UIntArray.m339isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        int max2 = UIntArray.m332getpVg5ArA(max, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(max);
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(max, i);
                if (Integer.compareUnsigned(max2, e) < 0) {
                    max2 = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return max2;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final long m1165maxOrThrowU(@NotNull long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (ULongArray.m419isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        long max2 = ULongArray.m412getsVKNKU(max, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(max);
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(max, i);
                if (Long.compareUnsigned(max2, e) < 0) {
                    max2 = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return max2;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final byte m1166maxOrThrowU(@NotNull byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (UByteArray.m259isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        byte max2 = UByteArray.m252getw2LRezQ(max, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(max);
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(max, i);
                if (Intrinsics.compare(max2 & 255, e & 255) < 0) {
                    max2 = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return max2;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOrThrow-U, reason: not valid java name */
    public static final short m1167maxOrThrowU(@NotNull short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (UShortArray.m526isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        short max2 = UShortArray.m519getMh2AYeg(max, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(max);
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(max, i);
                if (Intrinsics.compare(max2 & 65535, e & 65535) < 0) {
                    max2 = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return max2;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow-U")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m1168maxByOrThrowU(int[] maxBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(maxBy)) {
            throw new NoSuchElementException();
        }
        int maxElem = UIntArray.m332getpVg5ArA(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return maxElem;
        }
        Comparable maxValue = selector.invoke(UInt.m327boximpl(maxElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(maxBy, i);
                R rInvoke = selector.invoke(UInt.m327boximpl(e));
                if (maxValue.compareTo(rInvoke) < 0) {
                    maxElem = e;
                    maxValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxElem;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow-U")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m1169maxByOrThrowU(long[] maxBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(maxBy)) {
            throw new NoSuchElementException();
        }
        long maxElem = ULongArray.m412getsVKNKU(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return maxElem;
        }
        Comparable maxValue = selector.invoke(ULong.m407boximpl(maxElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(maxBy, i);
                R rInvoke = selector.invoke(ULong.m407boximpl(e));
                if (maxValue.compareTo(rInvoke) < 0) {
                    maxElem = e;
                    maxValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxElem;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow-U")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m1170maxByOrThrowU(byte[] maxBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(maxBy)) {
            throw new NoSuchElementException();
        }
        byte maxElem = UByteArray.m252getw2LRezQ(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return maxElem;
        }
        Comparable maxValue = selector.invoke(UByte.m247boximpl(maxElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(maxBy, i);
                R rInvoke = selector.invoke(UByte.m247boximpl(e));
                if (maxValue.compareTo(rInvoke) < 0) {
                    maxElem = e;
                    maxValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxElem;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow-U")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m1171maxByOrThrowU(short[] maxBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(maxBy)) {
            throw new NoSuchElementException();
        }
        short maxElem = UShortArray.m519getMh2AYeg(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return maxElem;
        }
        Comparable maxValue = selector.invoke(UShort.m514boximpl(maxElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(maxBy, i);
                R rInvoke = selector.invoke(UShort.m514boximpl(e));
                if (maxValue.compareTo(rInvoke) < 0) {
                    maxElem = e;
                    maxValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxElem;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UInt m1172maxByOrNulljgv0xPQ(int[] maxByOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(maxByOrNull)) {
            return null;
        }
        int maxElem = UIntArray.m332getpVg5ArA(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UInt.m327boximpl(maxElem);
        }
        Comparable maxValue = selector.invoke(UInt.m327boximpl(maxElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(maxByOrNull, i);
                R rInvoke = selector.invoke(UInt.m327boximpl(e));
                if (maxValue.compareTo(rInvoke) < 0) {
                    maxElem = e;
                    maxValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m327boximpl(maxElem);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> ULong m1173maxByOrNullMShoTSo(long[] maxByOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(maxByOrNull)) {
            return null;
        }
        long maxElem = ULongArray.m412getsVKNKU(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return ULong.m407boximpl(maxElem);
        }
        Comparable maxValue = selector.invoke(ULong.m407boximpl(maxElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(maxByOrNull, i);
                R rInvoke = selector.invoke(ULong.m407boximpl(e));
                if (maxValue.compareTo(rInvoke) < 0) {
                    maxElem = e;
                    maxValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m407boximpl(maxElem);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UByte m1174maxByOrNullJOV_ifY(byte[] maxByOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(maxByOrNull)) {
            return null;
        }
        byte maxElem = UByteArray.m252getw2LRezQ(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UByte.m247boximpl(maxElem);
        }
        Comparable maxValue = selector.invoke(UByte.m247boximpl(maxElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(maxByOrNull, i);
                R rInvoke = selector.invoke(UByte.m247boximpl(e));
                if (maxValue.compareTo(rInvoke) < 0) {
                    maxElem = e;
                    maxValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m247boximpl(maxElem);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: maxByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UShort m1175maxByOrNullxTcfx_M(short[] maxByOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(maxByOrNull)) {
            return null;
        }
        short maxElem = UShortArray.m519getMh2AYeg(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UShort.m514boximpl(maxElem);
        }
        Comparable maxValue = selector.invoke(UShort.m514boximpl(maxElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(maxByOrNull, i);
                R rInvoke = selector.invoke(UShort.m514boximpl(e));
                if (maxValue.compareTo(rInvoke) < 0) {
                    maxElem = e;
                    maxValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m514boximpl(maxElem);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final double m1176maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double maxValue = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOf, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOf, i))).doubleValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final double m1177maxOfMShoTSo(long[] maxOf, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double maxValue = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOf, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOf, i))).doubleValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final double m1178maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double maxValue = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOf, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOf, i))).doubleValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final double m1179maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double maxValue = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOf, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOf, i))).doubleValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final float m1180maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        float maxValue = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOf, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOf, i))).floatValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final float m1181maxOfMShoTSo(long[] maxOf, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        float maxValue = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOf, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOf, i))).floatValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final float m1182maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        float maxValue = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOf, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOf, i))).floatValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final float m1183maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        float maxValue = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOf, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOf, i))).floatValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return maxValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1184maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOf, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOf, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1185maxOfMShoTSo(long[] maxOf, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOf, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOf, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1186maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOf, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOf, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1187maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOf, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOf);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOf, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m1188maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double maxValue = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOfOrNull, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOfOrNull, i))).doubleValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(maxValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m1189maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double maxValue = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOfOrNull, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOfOrNull, i))).doubleValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(maxValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m1190maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double maxValue = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOfOrNull, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOfOrNull, i))).doubleValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(maxValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m1191maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double maxValue = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOfOrNull, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOfOrNull, i))).doubleValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(maxValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m1192maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float maxValue = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOfOrNull, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOfOrNull, i))).floatValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(maxValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m1193maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float maxValue = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOfOrNull, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOfOrNull, i))).floatValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(maxValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m1194maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float maxValue = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOfOrNull, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOfOrNull, i))).floatValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(maxValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m1195maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float maxValue = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOfOrNull, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOfOrNull, i))).floatValue();
                maxValue = Math.max(maxValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(maxValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1196maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOfOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOfOrNull, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1197maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOfOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOfOrNull, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1198maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOfOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOfOrNull, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1199maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOfOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOfOrNull, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m1200maxOfWithmyNOsp4(int[] maxOfWith, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOfWith, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfWith);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOfWith, i)));
                if (comparator.compare(objInvoke, objInvoke2) < 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m1201maxOfWith5NtCtWE(long[] maxOfWith, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOfWith, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfWith);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOfWith, i)));
                if (comparator.compare(objInvoke, objInvoke2) < 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m1202maxOfWithLTi4i_s(byte[] maxOfWith, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOfWith, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfWith);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOfWith, i)));
                if (comparator.compare(objInvoke, objInvoke2) < 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1203maxOfWithl8EHGbQ(short[] maxOfWith, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOfWith, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfWith);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOfWith, i)));
                if (comparator.compare(objInvoke, objInvoke2) < 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m1204maxOfWithOrNullmyNOsp4(int[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object objInvoke = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOfWithOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(maxOfWithOrNull, i)));
                if (comparator.compare(objInvoke, objInvoke2) < 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m1205maxOfWithOrNull5NtCtWE(long[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object objInvoke = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOfWithOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(maxOfWithOrNull, i)));
                if (comparator.compare(objInvoke, objInvoke2) < 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m1206maxOfWithOrNullLTi4i_s(byte[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object objInvoke = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOfWithOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(maxOfWithOrNull, i)));
                if (comparator.compare(objInvoke, objInvoke2) < 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: maxOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1207maxOfWithOrNulll8EHGbQ(short[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object objInvoke = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOfWithOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOfWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(maxOfWithOrNull, i)));
                if (comparator.compare(objInvoke, objInvoke2) < 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m1208maxOrNullajY9A(@NotNull int[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UIntArray.m339isEmptyimpl(maxOrNull)) {
            return null;
        }
        int max = UIntArray.m332getpVg5ArA(maxOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOrNull);
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(maxOrNull, i);
                if (Integer.compareUnsigned(max, e) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m327boximpl(max);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m1209maxOrNullQwZRm1k(@NotNull long[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (ULongArray.m419isEmptyimpl(maxOrNull)) {
            return null;
        }
        long max = ULongArray.m412getsVKNKU(maxOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOrNull);
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(maxOrNull, i);
                if (Long.compareUnsigned(max, e) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m407boximpl(max);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m1210maxOrNullGBYM_sE(@NotNull byte[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UByteArray.m259isEmptyimpl(maxOrNull)) {
            return null;
        }
        byte max = UByteArray.m252getw2LRezQ(maxOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOrNull);
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(maxOrNull, i);
                if (Intrinsics.compare(max & 255, e & 255) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m247boximpl(max);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m1211maxOrNullrL5Bavg(@NotNull short[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UShortArray.m526isEmptyimpl(maxOrNull)) {
            return null;
        }
        short max = UShortArray.m519getMh2AYeg(maxOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxOrNull);
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(maxOrNull, i);
                if (Intrinsics.compare(max & 65535, e & 65535) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m514boximpl(max);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final int m1212maxWithOrThrowU(@NotNull int[] maxWith, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m339isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        int max = UIntArray.m332getpVg5ArA(maxWith, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxWith);
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(maxWith, i);
                if (comparator.compare(UInt.m327boximpl(max), UInt.m327boximpl(e)) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return max;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final long m1213maxWithOrThrowU(@NotNull long[] maxWith, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m419isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        long max = ULongArray.m412getsVKNKU(maxWith, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxWith);
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(maxWith, i);
                if (comparator.compare(ULong.m407boximpl(max), ULong.m407boximpl(e)) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return max;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final byte m1214maxWithOrThrowU(@NotNull byte[] maxWith, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m259isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        byte max = UByteArray.m252getw2LRezQ(maxWith, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxWith);
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(maxWith, i);
                if (comparator.compare(UByte.m247boximpl(max), UByte.m247boximpl(e)) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return max;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final short m1215maxWithOrThrowU(@NotNull short[] maxWith, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m526isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        short max = UShortArray.m519getMh2AYeg(maxWith, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxWith);
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(maxWith, i);
                if (comparator.compare(UShort.m514boximpl(max), UShort.m514boximpl(e)) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return max;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final UInt m1216maxWithOrNullYmdZ_VM(@NotNull int[] maxWithOrNull, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m339isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        int max = UIntArray.m332getpVg5ArA(maxWithOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(maxWithOrNull, i);
                if (comparator.compare(UInt.m327boximpl(max), UInt.m327boximpl(e)) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m327boximpl(max);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-zrEWJaI, reason: not valid java name */
    public static final ULong m1217maxWithOrNullzrEWJaI(@NotNull long[] maxWithOrNull, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m419isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        long max = ULongArray.m412getsVKNKU(maxWithOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(maxWithOrNull, i);
                if (comparator.compare(ULong.m407boximpl(max), ULong.m407boximpl(e)) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m407boximpl(max);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-XMRcp5o, reason: not valid java name */
    public static final UByte m1218maxWithOrNullXMRcp5o(@NotNull byte[] maxWithOrNull, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m259isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        byte max = UByteArray.m252getw2LRezQ(maxWithOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(maxWithOrNull, i);
                if (comparator.compare(UByte.m247boximpl(max), UByte.m247boximpl(e)) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m247boximpl(max);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-eOHTfZs, reason: not valid java name */
    public static final UShort m1219maxWithOrNulleOHTfZs(@NotNull short[] maxWithOrNull, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m526isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        short max = UShortArray.m519getMh2AYeg(maxWithOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(maxWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(maxWithOrNull, i);
                if (comparator.compare(UShort.m514boximpl(max), UShort.m514boximpl(e)) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m514boximpl(max);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final int m1220minOrThrowU(@NotNull int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (UIntArray.m339isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        int min2 = UIntArray.m332getpVg5ArA(min, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(min);
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(min, i);
                if (Integer.compareUnsigned(min2, e) > 0) {
                    min2 = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return min2;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final long m1221minOrThrowU(@NotNull long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (ULongArray.m419isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        long min2 = ULongArray.m412getsVKNKU(min, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(min);
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(min, i);
                if (Long.compareUnsigned(min2, e) > 0) {
                    min2 = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return min2;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final byte m1222minOrThrowU(@NotNull byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (UByteArray.m259isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        byte min2 = UByteArray.m252getw2LRezQ(min, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(min);
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(min, i);
                if (Intrinsics.compare(min2 & 255, e & 255) > 0) {
                    min2 = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return min2;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOrThrow-U, reason: not valid java name */
    public static final short m1223minOrThrowU(@NotNull short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (UShortArray.m526isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        short min2 = UShortArray.m519getMh2AYeg(min, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(min);
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(min, i);
                if (Intrinsics.compare(min2 & 65535, e & 65535) > 0) {
                    min2 = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return min2;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow-U")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m1224minByOrThrowU(int[] minBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(minBy)) {
            throw new NoSuchElementException();
        }
        int minElem = UIntArray.m332getpVg5ArA(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return minElem;
        }
        Comparable minValue = selector.invoke(UInt.m327boximpl(minElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(minBy, i);
                R rInvoke = selector.invoke(UInt.m327boximpl(e));
                if (minValue.compareTo(rInvoke) > 0) {
                    minElem = e;
                    minValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minElem;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow-U")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m1225minByOrThrowU(long[] minBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(minBy)) {
            throw new NoSuchElementException();
        }
        long minElem = ULongArray.m412getsVKNKU(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return minElem;
        }
        Comparable minValue = selector.invoke(ULong.m407boximpl(minElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(minBy, i);
                R rInvoke = selector.invoke(ULong.m407boximpl(e));
                if (minValue.compareTo(rInvoke) > 0) {
                    minElem = e;
                    minValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minElem;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow-U")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m1226minByOrThrowU(byte[] minBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(minBy)) {
            throw new NoSuchElementException();
        }
        byte minElem = UByteArray.m252getw2LRezQ(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return minElem;
        }
        Comparable minValue = selector.invoke(UByte.m247boximpl(minElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(minBy, i);
                R rInvoke = selector.invoke(UByte.m247boximpl(e));
                if (minValue.compareTo(rInvoke) > 0) {
                    minElem = e;
                    minValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minElem;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow-U")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m1227minByOrThrowU(short[] minBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(minBy)) {
            throw new NoSuchElementException();
        }
        short minElem = UShortArray.m519getMh2AYeg(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return minElem;
        }
        Comparable minValue = selector.invoke(UShort.m514boximpl(minElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(minBy, i);
                R rInvoke = selector.invoke(UShort.m514boximpl(e));
                if (minValue.compareTo(rInvoke) > 0) {
                    minElem = e;
                    minValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minElem;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UInt m1228minByOrNulljgv0xPQ(int[] minByOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(minByOrNull)) {
            return null;
        }
        int minElem = UIntArray.m332getpVg5ArA(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UInt.m327boximpl(minElem);
        }
        Comparable minValue = selector.invoke(UInt.m327boximpl(minElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(minByOrNull, i);
                R rInvoke = selector.invoke(UInt.m327boximpl(e));
                if (minValue.compareTo(rInvoke) > 0) {
                    minElem = e;
                    minValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m327boximpl(minElem);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> ULong m1229minByOrNullMShoTSo(long[] minByOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(minByOrNull)) {
            return null;
        }
        long minElem = ULongArray.m412getsVKNKU(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return ULong.m407boximpl(minElem);
        }
        Comparable minValue = selector.invoke(ULong.m407boximpl(minElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(minByOrNull, i);
                R rInvoke = selector.invoke(ULong.m407boximpl(e));
                if (minValue.compareTo(rInvoke) > 0) {
                    minElem = e;
                    minValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m407boximpl(minElem);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UByte m1230minByOrNullJOV_ifY(byte[] minByOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(minByOrNull)) {
            return null;
        }
        byte minElem = UByteArray.m252getw2LRezQ(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UByte.m247boximpl(minElem);
        }
        Comparable minValue = selector.invoke(UByte.m247boximpl(minElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(minByOrNull, i);
                R rInvoke = selector.invoke(UByte.m247boximpl(e));
                if (minValue.compareTo(rInvoke) > 0) {
                    minElem = e;
                    minValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m247boximpl(minElem);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: minByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UShort m1231minByOrNullxTcfx_M(short[] minByOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(minByOrNull)) {
            return null;
        }
        short minElem = UShortArray.m519getMh2AYeg(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UShort.m514boximpl(minElem);
        }
        Comparable minValue = selector.invoke(UShort.m514boximpl(minElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(minByOrNull, i);
                R rInvoke = selector.invoke(UShort.m514boximpl(e));
                if (minValue.compareTo(rInvoke) > 0) {
                    minElem = e;
                    minValue = rInvoke;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m514boximpl(minElem);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final double m1232minOfjgv0xPQ(int[] minOf, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double minValue = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOf, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOf, i))).doubleValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final double m1233minOfMShoTSo(long[] minOf, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double minValue = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOf, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOf, i))).doubleValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final double m1234minOfJOV_ifY(byte[] minOf, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double minValue = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOf, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOf, i))).doubleValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final double m1235minOfxTcfx_M(short[] minOf, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double minValue = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOf, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOf, i))).doubleValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final float m1236minOfjgv0xPQ(int[] minOf, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        float minValue = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOf, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOf, i))).floatValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final float m1237minOfMShoTSo(long[] minOf, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        float minValue = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOf, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOf, i))).floatValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final float m1238minOfJOV_ifY(byte[] minOf, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        float minValue = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOf, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOf, i))).floatValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final float m1239minOfxTcfx_M(short[] minOf, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        float minValue = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOf, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOf, i))).floatValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return minValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1240minOfjgv0xPQ(int[] minOf, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOf, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOf, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1241minOfMShoTSo(long[] minOf, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOf, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOf, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1242minOfJOV_ifY(byte[] minOf, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOf, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOf, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1243minOfxTcfx_M(short[] minOf, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOf, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOf);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOf, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m1244minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double minValue = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOfOrNull, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOfOrNull, i))).doubleValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(minValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m1245minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double minValue = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOfOrNull, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOfOrNull, i))).doubleValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(minValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m1246minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double minValue = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOfOrNull, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOfOrNull, i))).doubleValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(minValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m1247minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double minValue = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOfOrNull, 0))).doubleValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOfOrNull, i))).doubleValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(minValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m1248minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float minValue = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOfOrNull, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOfOrNull, i))).floatValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(minValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m1249minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float minValue = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOfOrNull, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOfOrNull, i))).floatValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(minValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m1250minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float minValue = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOfOrNull, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOfOrNull, i))).floatValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(minValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m1251minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float minValue = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOfOrNull, 0))).floatValue();
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOfOrNull, i))).floatValue();
                minValue = Math.min(minValue, v);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(minValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1252minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOfOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOfOrNull, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1253minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOfOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOfOrNull, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1254minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOfOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOfOrNull, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m1255minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R rInvoke = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOfOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOfOrNull, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m1256minOfWithmyNOsp4(int[] minOfWith, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOfWith, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfWith);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOfWith, i)));
                if (comparator.compare(objInvoke, objInvoke2) > 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m1257minOfWith5NtCtWE(long[] minOfWith, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOfWith, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfWith);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOfWith, i)));
                if (comparator.compare(objInvoke, objInvoke2) > 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m1258minOfWithLTi4i_s(byte[] minOfWith, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOfWith, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfWith);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOfWith, i)));
                if (comparator.compare(objInvoke, objInvoke2) > 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1259minOfWithl8EHGbQ(short[] minOfWith, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOfWith, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfWith);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOfWith, i)));
                if (comparator.compare(objInvoke, objInvoke2) > 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m1260minOfWithOrNullmyNOsp4(int[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m339isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object objInvoke = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOfWithOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(minOfWithOrNull, i)));
                if (comparator.compare(objInvoke, objInvoke2) > 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m1261minOfWithOrNull5NtCtWE(long[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m419isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object objInvoke = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOfWithOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(minOfWithOrNull, i)));
                if (comparator.compare(objInvoke, objInvoke2) > 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m1262minOfWithOrNullLTi4i_s(byte[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m259isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object objInvoke = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOfWithOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(minOfWithOrNull, i)));
                if (comparator.compare(objInvoke, objInvoke2) > 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* JADX INFO: renamed from: minOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m1263minOfWithOrNulll8EHGbQ(short[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m526isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object objInvoke = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOfWithOrNull, 0)));
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOfWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(minOfWithOrNull, i)));
                if (comparator.compare(objInvoke, objInvoke2) > 0) {
                    objInvoke = objInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (R) objInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m1264minOrNullajY9A(@NotNull int[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UIntArray.m339isEmptyimpl(minOrNull)) {
            return null;
        }
        int min = UIntArray.m332getpVg5ArA(minOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOrNull);
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(minOrNull, i);
                if (Integer.compareUnsigned(min, e) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m327boximpl(min);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m1265minOrNullQwZRm1k(@NotNull long[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (ULongArray.m419isEmptyimpl(minOrNull)) {
            return null;
        }
        long min = ULongArray.m412getsVKNKU(minOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOrNull);
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(minOrNull, i);
                if (Long.compareUnsigned(min, e) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m407boximpl(min);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m1266minOrNullGBYM_sE(@NotNull byte[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UByteArray.m259isEmptyimpl(minOrNull)) {
            return null;
        }
        byte min = UByteArray.m252getw2LRezQ(minOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOrNull);
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(minOrNull, i);
                if (Intrinsics.compare(min & 255, e & 255) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m247boximpl(min);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m1267minOrNullrL5Bavg(@NotNull short[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UShortArray.m526isEmptyimpl(minOrNull)) {
            return null;
        }
        short min = UShortArray.m519getMh2AYeg(minOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minOrNull);
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(minOrNull, i);
                if (Intrinsics.compare(min & 65535, e & 65535) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m514boximpl(min);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final int m1268minWithOrThrowU(@NotNull int[] minWith, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m339isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        int min = UIntArray.m332getpVg5ArA(minWith, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minWith);
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(minWith, i);
                if (comparator.compare(UInt.m327boximpl(min), UInt.m327boximpl(e)) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return min;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final long m1269minWithOrThrowU(@NotNull long[] minWith, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m419isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        long min = ULongArray.m412getsVKNKU(minWith, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minWith);
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(minWith, i);
                if (comparator.compare(ULong.m407boximpl(min), ULong.m407boximpl(e)) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return min;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final byte m1270minWithOrThrowU(@NotNull byte[] minWith, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m259isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        byte min = UByteArray.m252getw2LRezQ(minWith, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minWith);
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(minWith, i);
                if (comparator.compare(UByte.m247boximpl(min), UByte.m247boximpl(e)) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return min;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow-U")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final short m1271minWithOrThrowU(@NotNull short[] minWith, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m526isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        short min = UShortArray.m519getMh2AYeg(minWith, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minWith);
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(minWith, i);
                if (comparator.compare(UShort.m514boximpl(min), UShort.m514boximpl(e)) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return min;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final UInt m1272minWithOrNullYmdZ_VM(@NotNull int[] minWithOrNull, @NotNull Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m339isEmptyimpl(minWithOrNull)) {
            return null;
        }
        int min = UIntArray.m332getpVg5ArA(minWithOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                int e = UIntArray.m332getpVg5ArA(minWithOrNull, i);
                if (comparator.compare(UInt.m327boximpl(min), UInt.m327boximpl(e)) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m327boximpl(min);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-zrEWJaI, reason: not valid java name */
    public static final ULong m1273minWithOrNullzrEWJaI(@NotNull long[] minWithOrNull, @NotNull Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m419isEmptyimpl(minWithOrNull)) {
            return null;
        }
        long min = ULongArray.m412getsVKNKU(minWithOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                long e = ULongArray.m412getsVKNKU(minWithOrNull, i);
                if (comparator.compare(ULong.m407boximpl(min), ULong.m407boximpl(e)) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m407boximpl(min);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-XMRcp5o, reason: not valid java name */
    public static final UByte m1274minWithOrNullXMRcp5o(@NotNull byte[] minWithOrNull, @NotNull Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m259isEmptyimpl(minWithOrNull)) {
            return null;
        }
        byte min = UByteArray.m252getw2LRezQ(minWithOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                byte e = UByteArray.m252getw2LRezQ(minWithOrNull, i);
                if (comparator.compare(UByte.m247boximpl(min), UByte.m247boximpl(e)) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m247boximpl(min);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-eOHTfZs, reason: not valid java name */
    public static final UShort m1275minWithOrNulleOHTfZs(@NotNull short[] minWithOrNull, @NotNull Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m526isEmptyimpl(minWithOrNull)) {
            return null;
        }
        short min = UShortArray.m519getMh2AYeg(minWithOrNull, 0);
        int i = 1;
        int lastIndex = ArraysKt.getLastIndex(minWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                short e = UShortArray.m519getMh2AYeg(minWithOrNull, i);
                if (comparator.compare(UShort.m514boximpl(min), UShort.m514boximpl(e)) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m514boximpl(min);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none--ajY-9A, reason: not valid java name */
    private static final boolean m1276noneajY9A(int[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UIntArray.m339isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-QwZRm1k, reason: not valid java name */
    private static final boolean m1277noneQwZRm1k(long[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return ULongArray.m419isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-GBYM_sE, reason: not valid java name */
    private static final boolean m1278noneGBYM_sE(byte[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UByteArray.m259isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-rL5Bavg, reason: not valid java name */
    private static final boolean m1279nonerL5Bavg(short[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UShortArray.m526isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-jgv0xPQ, reason: not valid java name */
    private static final boolean m1280nonejgv0xPQ(int[] none, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(none);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(none, i);
            if (predicate.invoke(UInt.m327boximpl(element)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-MShoTSo, reason: not valid java name */
    private static final boolean m1281noneMShoTSo(long[] none, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(none);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(none, i);
            if (predicate.invoke(ULong.m407boximpl(element)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-JOV_ifY, reason: not valid java name */
    private static final boolean m1282noneJOV_ifY(byte[] none, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(none);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(none, i);
            if (predicate.invoke(UByte.m247boximpl(element)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: none-xTcfx_M, reason: not valid java name */
    private static final boolean m1283nonexTcfx_M(short[] none, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(none);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(none, i);
            if (predicate.invoke(UShort.m514boximpl(element)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEach-jgv0xPQ, reason: not valid java name */
    private static final int[] m1284onEachjgv0xPQ(int[] onEach, Function1<? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(onEach);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(onEach, i);
            action.invoke(UInt.m327boximpl(element));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEach-MShoTSo, reason: not valid java name */
    private static final long[] m1285onEachMShoTSo(long[] onEach, Function1<? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(onEach);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(onEach, i);
            action.invoke(ULong.m407boximpl(element));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEach-JOV_ifY, reason: not valid java name */
    private static final byte[] m1286onEachJOV_ifY(byte[] onEach, Function1<? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(onEach);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(onEach, i);
            action.invoke(UByte.m247boximpl(element));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEach-xTcfx_M, reason: not valid java name */
    private static final short[] m1287onEachxTcfx_M(short[] onEach, Function1<? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(onEach);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(onEach, i);
            action.invoke(UShort.m514boximpl(element));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEachIndexed-WyvcNBI, reason: not valid java name */
    private static final int[] m1288onEachIndexedWyvcNBI(int[] onEachIndexed, Function2<? super Integer, ? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int i = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(onEachIndexed);
        for (int i2 = 0; i2 < iM334getSizeimpl; i2++) {
            int i3 = i;
            i++;
            action.invoke(Integer.valueOf(i3), UInt.m327boximpl(UIntArray.m332getpVg5ArA(onEachIndexed, i2)));
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEachIndexed-s8dVfGU, reason: not valid java name */
    private static final long[] m1289onEachIndexeds8dVfGU(long[] onEachIndexed, Function2<? super Integer, ? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int i = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(onEachIndexed);
        for (int i2 = 0; i2 < iM414getSizeimpl; i2++) {
            int i3 = i;
            i++;
            action.invoke(Integer.valueOf(i3), ULong.m407boximpl(ULongArray.m412getsVKNKU(onEachIndexed, i2)));
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEachIndexed-ELGow60, reason: not valid java name */
    private static final byte[] m1290onEachIndexedELGow60(byte[] onEachIndexed, Function2<? super Integer, ? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int i = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(onEachIndexed);
        for (int i2 = 0; i2 < iM254getSizeimpl; i2++) {
            int i3 = i;
            i++;
            action.invoke(Integer.valueOf(i3), UByte.m247boximpl(UByteArray.m252getw2LRezQ(onEachIndexed, i2)));
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: onEachIndexed-xzaTVY8, reason: not valid java name */
    private static final short[] m1291onEachIndexedxzaTVY8(short[] onEachIndexed, Function2<? super Integer, ? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int i = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(onEachIndexed);
        for (int i2 = 0; i2 < iM521getSizeimpl; i2++) {
            int i3 = i;
            i++;
            action.invoke(Integer.valueOf(i3), UShort.m514boximpl(UShortArray.m519getMh2AYeg(onEachIndexed, i2)));
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduce-WyvcNBI, reason: not valid java name */
    private static final int m1292reduceWyvcNBI(int[] reduce, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m339isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int accumulator = UIntArray.m332getpVg5ArA(reduce, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduce);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(UInt.m327boximpl(accumulator), UInt.m327boximpl(UIntArray.m332getpVg5ArA(reduce, index))).m328unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduce-s8dVfGU, reason: not valid java name */
    private static final long m1293reduces8dVfGU(long[] reduce, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m419isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long accumulator = ULongArray.m412getsVKNKU(reduce, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduce);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(ULong.m407boximpl(accumulator), ULong.m407boximpl(ULongArray.m412getsVKNKU(reduce, index))).m408unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduce-ELGow60, reason: not valid java name */
    private static final byte m1294reduceELGow60(byte[] reduce, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m259isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte accumulator = UByteArray.m252getw2LRezQ(reduce, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduce);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(UByte.m247boximpl(accumulator), UByte.m247boximpl(UByteArray.m252getw2LRezQ(reduce, index))).m248unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduce-xzaTVY8, reason: not valid java name */
    private static final short m1295reducexzaTVY8(short[] reduce, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m526isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short accumulator = UShortArray.m519getMh2AYeg(reduce, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduce);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(UShort.m514boximpl(accumulator), UShort.m514boximpl(UShortArray.m519getMh2AYeg(reduce, index))).m515unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexed-D40WMg8, reason: not valid java name */
    private static final int m1296reduceIndexedD40WMg8(int[] reduceIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m339isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int accumulator = UIntArray.m332getpVg5ArA(reduceIndexed, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceIndexed);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Integer.valueOf(index), UInt.m327boximpl(accumulator), UInt.m327boximpl(UIntArray.m332getpVg5ArA(reduceIndexed, index))).m328unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexed-z1zDJgo, reason: not valid java name */
    private static final long m1297reduceIndexedz1zDJgo(long[] reduceIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m419isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long accumulator = ULongArray.m412getsVKNKU(reduceIndexed, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceIndexed);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Integer.valueOf(index), ULong.m407boximpl(accumulator), ULong.m407boximpl(ULongArray.m412getsVKNKU(reduceIndexed, index))).m408unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m1298reduceIndexedEOyYB1Y(byte[] reduceIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m259isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte accumulator = UByteArray.m252getw2LRezQ(reduceIndexed, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceIndexed);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Integer.valueOf(index), UByte.m247boximpl(accumulator), UByte.m247boximpl(UByteArray.m252getw2LRezQ(reduceIndexed, index))).m248unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m1299reduceIndexedaLgx1Fo(short[] reduceIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m526isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short accumulator = UShortArray.m519getMh2AYeg(reduceIndexed, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceIndexed);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Integer.valueOf(index), UShort.m514boximpl(accumulator), UShort.m514boximpl(UShortArray.m519getMh2AYeg(reduceIndexed, index))).m515unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final UInt m1300reduceIndexedOrNullD40WMg8(int[] reduceIndexedOrNull, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m339isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        int accumulator = UIntArray.m332getpVg5ArA(reduceIndexedOrNull, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceIndexedOrNull);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Integer.valueOf(index), UInt.m327boximpl(accumulator), UInt.m327boximpl(UIntArray.m332getpVg5ArA(reduceIndexedOrNull, index))).m328unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return UInt.m327boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final ULong m1301reduceIndexedOrNullz1zDJgo(long[] reduceIndexedOrNull, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m419isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        long accumulator = ULongArray.m412getsVKNKU(reduceIndexedOrNull, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceIndexedOrNull);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Integer.valueOf(index), ULong.m407boximpl(accumulator), ULong.m407boximpl(ULongArray.m412getsVKNKU(reduceIndexedOrNull, index))).m408unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return ULong.m407boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final UByte m1302reduceIndexedOrNullEOyYB1Y(byte[] reduceIndexedOrNull, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m259isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        byte accumulator = UByteArray.m252getw2LRezQ(reduceIndexedOrNull, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceIndexedOrNull);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Integer.valueOf(index), UByte.m247boximpl(accumulator), UByte.m247boximpl(UByteArray.m252getw2LRezQ(reduceIndexedOrNull, index))).m248unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return UByte.m247boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final UShort m1303reduceIndexedOrNullaLgx1Fo(short[] reduceIndexedOrNull, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m526isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        short accumulator = UShortArray.m519getMh2AYeg(reduceIndexedOrNull, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceIndexedOrNull);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Integer.valueOf(index), UShort.m514boximpl(accumulator), UShort.m514boximpl(UShortArray.m519getMh2AYeg(reduceIndexedOrNull, index))).m515unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return UShort.m514boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceOrNull-WyvcNBI, reason: not valid java name */
    private static final UInt m1304reduceOrNullWyvcNBI(int[] reduceOrNull, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m339isEmptyimpl(reduceOrNull)) {
            return null;
        }
        int accumulator = UIntArray.m332getpVg5ArA(reduceOrNull, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceOrNull);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(UInt.m327boximpl(accumulator), UInt.m327boximpl(UIntArray.m332getpVg5ArA(reduceOrNull, index))).m328unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return UInt.m327boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceOrNull-s8dVfGU, reason: not valid java name */
    private static final ULong m1305reduceOrNulls8dVfGU(long[] reduceOrNull, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m419isEmptyimpl(reduceOrNull)) {
            return null;
        }
        long accumulator = ULongArray.m412getsVKNKU(reduceOrNull, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceOrNull);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(ULong.m407boximpl(accumulator), ULong.m407boximpl(ULongArray.m412getsVKNKU(reduceOrNull, index))).m408unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return ULong.m407boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceOrNull-ELGow60, reason: not valid java name */
    private static final UByte m1306reduceOrNullELGow60(byte[] reduceOrNull, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m259isEmptyimpl(reduceOrNull)) {
            return null;
        }
        byte accumulator = UByteArray.m252getw2LRezQ(reduceOrNull, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceOrNull);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(UByte.m247boximpl(accumulator), UByte.m247boximpl(UByteArray.m252getw2LRezQ(reduceOrNull, index))).m248unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return UByte.m247boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceOrNull-xzaTVY8, reason: not valid java name */
    private static final UShort m1307reduceOrNullxzaTVY8(short[] reduceOrNull, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m526isEmptyimpl(reduceOrNull)) {
            return null;
        }
        short accumulator = UShortArray.m519getMh2AYeg(reduceOrNull, 0);
        int index = 1;
        int lastIndex = ArraysKt.getLastIndex(reduceOrNull);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(UShort.m514boximpl(accumulator), UShort.m514boximpl(UShortArray.m519getMh2AYeg(reduceOrNull, index))).m515unboximpl();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return UShort.m514boximpl(accumulator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRight-WyvcNBI, reason: not valid java name */
    private static final int m1308reduceRightWyvcNBI(int[] reduceRight, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRight);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int index2 = index - 1;
        int iM332getpVg5ArA = UIntArray.m332getpVg5ArA(reduceRight, index);
        while (true) {
            int accumulator = iM332getpVg5ArA;
            if (index2 >= 0) {
                int i = index2;
                index2--;
                iM332getpVg5ArA = operation.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(reduceRight, i)), UInt.m327boximpl(accumulator)).m328unboximpl();
            } else {
                return accumulator;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRight-s8dVfGU, reason: not valid java name */
    private static final long m1309reduceRights8dVfGU(long[] reduceRight, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRight);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int index2 = index - 1;
        long jM412getsVKNKU = ULongArray.m412getsVKNKU(reduceRight, index);
        while (true) {
            long accumulator = jM412getsVKNKU;
            if (index2 >= 0) {
                int i = index2;
                index2--;
                jM412getsVKNKU = operation.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(reduceRight, i)), ULong.m407boximpl(accumulator)).m408unboximpl();
            } else {
                return accumulator;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRight-ELGow60, reason: not valid java name */
    private static final byte m1310reduceRightELGow60(byte[] reduceRight, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRight);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int index2 = index - 1;
        byte bM252getw2LRezQ = UByteArray.m252getw2LRezQ(reduceRight, index);
        while (true) {
            byte accumulator = bM252getw2LRezQ;
            if (index2 >= 0) {
                int i = index2;
                index2--;
                bM252getw2LRezQ = operation.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(reduceRight, i)), UByte.m247boximpl(accumulator)).m248unboximpl();
            } else {
                return accumulator;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRight-xzaTVY8, reason: not valid java name */
    private static final short m1311reduceRightxzaTVY8(short[] reduceRight, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRight);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int index2 = index - 1;
        short sM519getMh2AYeg = UShortArray.m519getMh2AYeg(reduceRight, index);
        while (true) {
            short accumulator = sM519getMh2AYeg;
            if (index2 >= 0) {
                int i = index2;
                index2--;
                sM519getMh2AYeg = operation.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(reduceRight, i)), UShort.m514boximpl(accumulator)).m515unboximpl();
            } else {
                return accumulator;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexed-D40WMg8, reason: not valid java name */
    private static final int m1312reduceRightIndexedD40WMg8(int[] reduceRightIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightIndexed);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int accumulator = UIntArray.m332getpVg5ArA(reduceRightIndexed, index);
        for (int index2 = index - 1; index2 >= 0; index2--) {
            accumulator = operation.invoke(Integer.valueOf(index2), UInt.m327boximpl(UIntArray.m332getpVg5ArA(reduceRightIndexed, index2)), UInt.m327boximpl(accumulator)).m328unboximpl();
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexed-z1zDJgo, reason: not valid java name */
    private static final long m1313reduceRightIndexedz1zDJgo(long[] reduceRightIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightIndexed);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long accumulator = ULongArray.m412getsVKNKU(reduceRightIndexed, index);
        for (int index2 = index - 1; index2 >= 0; index2--) {
            accumulator = operation.invoke(Integer.valueOf(index2), ULong.m407boximpl(ULongArray.m412getsVKNKU(reduceRightIndexed, index2)), ULong.m407boximpl(accumulator)).m408unboximpl();
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m1314reduceRightIndexedEOyYB1Y(byte[] reduceRightIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightIndexed);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte accumulator = UByteArray.m252getw2LRezQ(reduceRightIndexed, index);
        for (int index2 = index - 1; index2 >= 0; index2--) {
            accumulator = operation.invoke(Integer.valueOf(index2), UByte.m247boximpl(UByteArray.m252getw2LRezQ(reduceRightIndexed, index2)), UByte.m247boximpl(accumulator)).m248unboximpl();
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m1315reduceRightIndexedaLgx1Fo(short[] reduceRightIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightIndexed);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short accumulator = UShortArray.m519getMh2AYeg(reduceRightIndexed, index);
        for (int index2 = index - 1; index2 >= 0; index2--) {
            accumulator = operation.invoke(Integer.valueOf(index2), UShort.m514boximpl(UShortArray.m519getMh2AYeg(reduceRightIndexed, index2)), UShort.m514boximpl(accumulator)).m515unboximpl();
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final UInt m1316reduceRightIndexedOrNullD40WMg8(int[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (index < 0) {
            return null;
        }
        int accumulator = UIntArray.m332getpVg5ArA(reduceRightIndexedOrNull, index);
        for (int index2 = index - 1; index2 >= 0; index2--) {
            accumulator = operation.invoke(Integer.valueOf(index2), UInt.m327boximpl(UIntArray.m332getpVg5ArA(reduceRightIndexedOrNull, index2)), UInt.m327boximpl(accumulator)).m328unboximpl();
        }
        return UInt.m327boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final ULong m1317reduceRightIndexedOrNullz1zDJgo(long[] reduceRightIndexedOrNull, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (index < 0) {
            return null;
        }
        long accumulator = ULongArray.m412getsVKNKU(reduceRightIndexedOrNull, index);
        for (int index2 = index - 1; index2 >= 0; index2--) {
            accumulator = operation.invoke(Integer.valueOf(index2), ULong.m407boximpl(ULongArray.m412getsVKNKU(reduceRightIndexedOrNull, index2)), ULong.m407boximpl(accumulator)).m408unboximpl();
        }
        return ULong.m407boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final UByte m1318reduceRightIndexedOrNullEOyYB1Y(byte[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (index < 0) {
            return null;
        }
        byte accumulator = UByteArray.m252getw2LRezQ(reduceRightIndexedOrNull, index);
        for (int index2 = index - 1; index2 >= 0; index2--) {
            accumulator = operation.invoke(Integer.valueOf(index2), UByte.m247boximpl(UByteArray.m252getw2LRezQ(reduceRightIndexedOrNull, index2)), UByte.m247boximpl(accumulator)).m248unboximpl();
        }
        return UByte.m247boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final UShort m1319reduceRightIndexedOrNullaLgx1Fo(short[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (index < 0) {
            return null;
        }
        short accumulator = UShortArray.m519getMh2AYeg(reduceRightIndexedOrNull, index);
        for (int index2 = index - 1; index2 >= 0; index2--) {
            accumulator = operation.invoke(Integer.valueOf(index2), UShort.m514boximpl(UShortArray.m519getMh2AYeg(reduceRightIndexedOrNull, index2)), UShort.m514boximpl(accumulator)).m515unboximpl();
        }
        return UShort.m514boximpl(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightOrNull-WyvcNBI, reason: not valid java name */
    private static final UInt m1320reduceRightOrNullWyvcNBI(int[] reduceRightOrNull, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightOrNull);
        if (index < 0) {
            return null;
        }
        int index2 = index - 1;
        int iM332getpVg5ArA = UIntArray.m332getpVg5ArA(reduceRightOrNull, index);
        while (true) {
            int accumulator = iM332getpVg5ArA;
            if (index2 >= 0) {
                int i = index2;
                index2--;
                iM332getpVg5ArA = operation.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(reduceRightOrNull, i)), UInt.m327boximpl(accumulator)).m328unboximpl();
            } else {
                return UInt.m327boximpl(accumulator);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightOrNull-s8dVfGU, reason: not valid java name */
    private static final ULong m1321reduceRightOrNulls8dVfGU(long[] reduceRightOrNull, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightOrNull);
        if (index < 0) {
            return null;
        }
        int index2 = index - 1;
        long jM412getsVKNKU = ULongArray.m412getsVKNKU(reduceRightOrNull, index);
        while (true) {
            long accumulator = jM412getsVKNKU;
            if (index2 >= 0) {
                int i = index2;
                index2--;
                jM412getsVKNKU = operation.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(reduceRightOrNull, i)), ULong.m407boximpl(accumulator)).m408unboximpl();
            } else {
                return ULong.m407boximpl(accumulator);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightOrNull-ELGow60, reason: not valid java name */
    private static final UByte m1322reduceRightOrNullELGow60(byte[] reduceRightOrNull, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightOrNull);
        if (index < 0) {
            return null;
        }
        int index2 = index - 1;
        byte bM252getw2LRezQ = UByteArray.m252getw2LRezQ(reduceRightOrNull, index);
        while (true) {
            byte accumulator = bM252getw2LRezQ;
            if (index2 >= 0) {
                int i = index2;
                index2--;
                bM252getw2LRezQ = operation.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(reduceRightOrNull, i)), UByte.m247boximpl(accumulator)).m248unboximpl();
            } else {
                return UByte.m247boximpl(accumulator);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: reduceRightOrNull-xzaTVY8, reason: not valid java name */
    private static final UShort m1323reduceRightOrNullxzaTVY8(short[] reduceRightOrNull, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = ArraysKt.getLastIndex(reduceRightOrNull);
        if (index < 0) {
            return null;
        }
        int index2 = index - 1;
        short sM519getMh2AYeg = UShortArray.m519getMh2AYeg(reduceRightOrNull, index);
        while (true) {
            short accumulator = sM519getMh2AYeg;
            if (index2 >= 0) {
                int i = index2;
                index2--;
                sM519getMh2AYeg = operation.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(reduceRightOrNull, i)), UShort.m514boximpl(accumulator)).m515unboximpl();
            } else {
                return UShort.m514boximpl(accumulator);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFold-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m1324runningFoldzi1B2BA(int[] runningFold, R r, Function2<? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m339isEmptyimpl(runningFold)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m334getSizeimpl(runningFold) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(runningFold);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, UInt.m327boximpl(UIntArray.m332getpVg5ArA(runningFold, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFold-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m1325runningFoldA8wKCXQ(long[] runningFold, R r, Function2<? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m419isEmptyimpl(runningFold)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m414getSizeimpl(runningFold) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(runningFold);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, ULong.m407boximpl(ULongArray.m412getsVKNKU(runningFold, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFold-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m1326runningFoldyXmHNn8(byte[] runningFold, R r, Function2<? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m259isEmptyimpl(runningFold)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m254getSizeimpl(runningFold) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(runningFold);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, UByte.m247boximpl(UByteArray.m252getw2LRezQ(runningFold, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFold-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m1327runningFoldzww5nb8(short[] runningFold, R r, Function2<? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m526isEmptyimpl(runningFold)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m521getSizeimpl(runningFold) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(runningFold);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, UShort.m514boximpl(UShortArray.m519getMh2AYeg(runningFold, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFoldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m1328runningFoldIndexedyVwIW0Q(int[] runningFoldIndexed, R r, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m339isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m334getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(runningFoldIndexed);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            rInvoke = operation.invoke(Integer.valueOf(i), (Object) rInvoke, UInt.m327boximpl(UIntArray.m332getpVg5ArA(runningFoldIndexed, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFoldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m1329runningFoldIndexedmwnnOCs(long[] runningFoldIndexed, R r, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m419isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m414getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(runningFoldIndexed);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            rInvoke = operation.invoke(Integer.valueOf(i), (Object) rInvoke, ULong.m407boximpl(ULongArray.m412getsVKNKU(runningFoldIndexed, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFoldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m1330runningFoldIndexed3iWJZGE(byte[] runningFoldIndexed, R r, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m259isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m254getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(runningFoldIndexed);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            rInvoke = operation.invoke(Integer.valueOf(i), (Object) rInvoke, UByte.m247boximpl(UByteArray.m252getw2LRezQ(runningFoldIndexed, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningFoldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m1331runningFoldIndexedbzxtMww(short[] runningFoldIndexed, R r, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m526isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m521getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(runningFoldIndexed);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            rInvoke = operation.invoke(Integer.valueOf(i), (Object) rInvoke, UShort.m514boximpl(UShortArray.m519getMh2AYeg(runningFoldIndexed, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduce-WyvcNBI, reason: not valid java name */
    private static final List<UInt> m1332runningReduceWyvcNBI(int[] runningReduce, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m339isEmptyimpl(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        int accumulator = UIntArray.m332getpVg5ArA(runningReduce, 0);
        ArrayList $this$runningReduce_WyvcNBI_u24lambda_u2476 = new ArrayList(UIntArray.m334getSizeimpl(runningReduce));
        $this$runningReduce_WyvcNBI_u24lambda_u2476.add(UInt.m327boximpl(accumulator));
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(runningReduce);
        for (int index = 1; index < iM334getSizeimpl; index++) {
            accumulator = operation.invoke(UInt.m327boximpl(accumulator), UInt.m327boximpl(UIntArray.m332getpVg5ArA(runningReduce, index))).m328unboximpl();
            $this$runningReduce_WyvcNBI_u24lambda_u2476.add(UInt.m327boximpl(accumulator));
        }
        return $this$runningReduce_WyvcNBI_u24lambda_u2476;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduce-s8dVfGU, reason: not valid java name */
    private static final List<ULong> m1333runningReduces8dVfGU(long[] runningReduce, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m419isEmptyimpl(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        long accumulator = ULongArray.m412getsVKNKU(runningReduce, 0);
        ArrayList $this$runningReduce_s8dVfGU_u24lambda_u2477 = new ArrayList(ULongArray.m414getSizeimpl(runningReduce));
        $this$runningReduce_s8dVfGU_u24lambda_u2477.add(ULong.m407boximpl(accumulator));
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(runningReduce);
        for (int index = 1; index < iM414getSizeimpl; index++) {
            accumulator = operation.invoke(ULong.m407boximpl(accumulator), ULong.m407boximpl(ULongArray.m412getsVKNKU(runningReduce, index))).m408unboximpl();
            $this$runningReduce_s8dVfGU_u24lambda_u2477.add(ULong.m407boximpl(accumulator));
        }
        return $this$runningReduce_s8dVfGU_u24lambda_u2477;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduce-ELGow60, reason: not valid java name */
    private static final List<UByte> m1334runningReduceELGow60(byte[] runningReduce, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m259isEmptyimpl(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        byte accumulator = UByteArray.m252getw2LRezQ(runningReduce, 0);
        ArrayList $this$runningReduce_ELGow60_u24lambda_u2478 = new ArrayList(UByteArray.m254getSizeimpl(runningReduce));
        $this$runningReduce_ELGow60_u24lambda_u2478.add(UByte.m247boximpl(accumulator));
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(runningReduce);
        for (int index = 1; index < iM254getSizeimpl; index++) {
            accumulator = operation.invoke(UByte.m247boximpl(accumulator), UByte.m247boximpl(UByteArray.m252getw2LRezQ(runningReduce, index))).m248unboximpl();
            $this$runningReduce_ELGow60_u24lambda_u2478.add(UByte.m247boximpl(accumulator));
        }
        return $this$runningReduce_ELGow60_u24lambda_u2478;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduce-xzaTVY8, reason: not valid java name */
    private static final List<UShort> m1335runningReducexzaTVY8(short[] runningReduce, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m526isEmptyimpl(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        short accumulator = UShortArray.m519getMh2AYeg(runningReduce, 0);
        ArrayList $this$runningReduce_xzaTVY8_u24lambda_u2479 = new ArrayList(UShortArray.m521getSizeimpl(runningReduce));
        $this$runningReduce_xzaTVY8_u24lambda_u2479.add(UShort.m514boximpl(accumulator));
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(runningReduce);
        for (int index = 1; index < iM521getSizeimpl; index++) {
            accumulator = operation.invoke(UShort.m514boximpl(accumulator), UShort.m514boximpl(UShortArray.m519getMh2AYeg(runningReduce, index))).m515unboximpl();
            $this$runningReduce_xzaTVY8_u24lambda_u2479.add(UShort.m514boximpl(accumulator));
        }
        return $this$runningReduce_xzaTVY8_u24lambda_u2479;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduceIndexed-D40WMg8, reason: not valid java name */
    private static final List<UInt> m1336runningReduceIndexedD40WMg8(int[] runningReduceIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m339isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        int accumulator = UIntArray.m332getpVg5ArA(runningReduceIndexed, 0);
        ArrayList $this$runningReduceIndexed_D40WMg8_u24lambda_u2480 = new ArrayList(UIntArray.m334getSizeimpl(runningReduceIndexed));
        $this$runningReduceIndexed_D40WMg8_u24lambda_u2480.add(UInt.m327boximpl(accumulator));
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(runningReduceIndexed);
        for (int index = 1; index < iM334getSizeimpl; index++) {
            accumulator = operation.invoke(Integer.valueOf(index), UInt.m327boximpl(accumulator), UInt.m327boximpl(UIntArray.m332getpVg5ArA(runningReduceIndexed, index))).m328unboximpl();
            $this$runningReduceIndexed_D40WMg8_u24lambda_u2480.add(UInt.m327boximpl(accumulator));
        }
        return $this$runningReduceIndexed_D40WMg8_u24lambda_u2480;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduceIndexed-z1zDJgo, reason: not valid java name */
    private static final List<ULong> m1337runningReduceIndexedz1zDJgo(long[] runningReduceIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m419isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        long accumulator = ULongArray.m412getsVKNKU(runningReduceIndexed, 0);
        ArrayList $this$runningReduceIndexed_z1zDJgo_u24lambda_u2481 = new ArrayList(ULongArray.m414getSizeimpl(runningReduceIndexed));
        $this$runningReduceIndexed_z1zDJgo_u24lambda_u2481.add(ULong.m407boximpl(accumulator));
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(runningReduceIndexed);
        for (int index = 1; index < iM414getSizeimpl; index++) {
            accumulator = operation.invoke(Integer.valueOf(index), ULong.m407boximpl(accumulator), ULong.m407boximpl(ULongArray.m412getsVKNKU(runningReduceIndexed, index))).m408unboximpl();
            $this$runningReduceIndexed_z1zDJgo_u24lambda_u2481.add(ULong.m407boximpl(accumulator));
        }
        return $this$runningReduceIndexed_z1zDJgo_u24lambda_u2481;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final List<UByte> m1338runningReduceIndexedEOyYB1Y(byte[] runningReduceIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m259isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        byte accumulator = UByteArray.m252getw2LRezQ(runningReduceIndexed, 0);
        ArrayList $this$runningReduceIndexed_EOyYB1Y_u24lambda_u2482 = new ArrayList(UByteArray.m254getSizeimpl(runningReduceIndexed));
        $this$runningReduceIndexed_EOyYB1Y_u24lambda_u2482.add(UByte.m247boximpl(accumulator));
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(runningReduceIndexed);
        for (int index = 1; index < iM254getSizeimpl; index++) {
            accumulator = operation.invoke(Integer.valueOf(index), UByte.m247boximpl(accumulator), UByte.m247boximpl(UByteArray.m252getw2LRezQ(runningReduceIndexed, index))).m248unboximpl();
            $this$runningReduceIndexed_EOyYB1Y_u24lambda_u2482.add(UByte.m247boximpl(accumulator));
        }
        return $this$runningReduceIndexed_EOyYB1Y_u24lambda_u2482;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: runningReduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final List<UShort> m1339runningReduceIndexedaLgx1Fo(short[] runningReduceIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m526isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        short accumulator = UShortArray.m519getMh2AYeg(runningReduceIndexed, 0);
        ArrayList $this$runningReduceIndexed_aLgx1Fo_u24lambda_u2483 = new ArrayList(UShortArray.m521getSizeimpl(runningReduceIndexed));
        $this$runningReduceIndexed_aLgx1Fo_u24lambda_u2483.add(UShort.m514boximpl(accumulator));
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(runningReduceIndexed);
        for (int index = 1; index < iM521getSizeimpl; index++) {
            accumulator = operation.invoke(Integer.valueOf(index), UShort.m514boximpl(accumulator), UShort.m514boximpl(UShortArray.m519getMh2AYeg(runningReduceIndexed, index))).m515unboximpl();
            $this$runningReduceIndexed_aLgx1Fo_u24lambda_u2483.add(UShort.m514boximpl(accumulator));
        }
        return $this$runningReduceIndexed_aLgx1Fo_u24lambda_u2483;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scan-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m1340scanzi1B2BA(int[] scan, R r, Function2<? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m339isEmptyimpl(scan)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m334getSizeimpl(scan) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(scan);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, UInt.m327boximpl(UIntArray.m332getpVg5ArA(scan, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scan-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m1341scanA8wKCXQ(long[] scan, R r, Function2<? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m419isEmptyimpl(scan)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m414getSizeimpl(scan) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(scan);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, ULong.m407boximpl(ULongArray.m412getsVKNKU(scan, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scan-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m1342scanyXmHNn8(byte[] scan, R r, Function2<? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m259isEmptyimpl(scan)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m254getSizeimpl(scan) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(scan);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, UByte.m247boximpl(UByteArray.m252getw2LRezQ(scan, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scan-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m1343scanzww5nb8(short[] scan, R r, Function2<? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m526isEmptyimpl(scan)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m521getSizeimpl(scan) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(scan);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            rInvoke = operation.invoke((Object) rInvoke, UShort.m514boximpl(UShortArray.m519getMh2AYeg(scan, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scanIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m1344scanIndexedyVwIW0Q(int[] scanIndexed, R r, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m339isEmptyimpl(scanIndexed)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m334getSizeimpl(scanIndexed) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(scanIndexed);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            rInvoke = operation.invoke(Integer.valueOf(i), (Object) rInvoke, UInt.m327boximpl(UIntArray.m332getpVg5ArA(scanIndexed, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scanIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m1345scanIndexedmwnnOCs(long[] scanIndexed, R r, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m419isEmptyimpl(scanIndexed)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m414getSizeimpl(scanIndexed) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(scanIndexed);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            rInvoke = operation.invoke(Integer.valueOf(i), (Object) rInvoke, ULong.m407boximpl(ULongArray.m412getsVKNKU(scanIndexed, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scanIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m1346scanIndexed3iWJZGE(byte[] scanIndexed, R r, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m259isEmptyimpl(scanIndexed)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m254getSizeimpl(scanIndexed) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(scanIndexed);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            rInvoke = operation.invoke(Integer.valueOf(i), (Object) rInvoke, UByte.m247boximpl(UByteArray.m252getw2LRezQ(scanIndexed, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: scanIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m1347scanIndexedbzxtMww(short[] scanIndexed, R r, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m526isEmptyimpl(scanIndexed)) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m521getSizeimpl(scanIndexed) + 1);
        arrayList.add(r);
        R rInvoke = r;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(scanIndexed);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            rInvoke = operation.invoke(Integer.valueOf(i), (Object) rInvoke, UShort.m514boximpl(UShortArray.m519getMh2AYeg(scanIndexed, i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumBy-jgv0xPQ, reason: not valid java name */
    private static final int m1348sumByjgv0xPQ(int[] sumBy, Function1<? super UInt, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(sumBy);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(sumBy, i);
            sum = UInt.m326constructorimpl(sum + selector.invoke(UInt.m327boximpl(element)).m328unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumBy-MShoTSo, reason: not valid java name */
    private static final int m1349sumByMShoTSo(long[] sumBy, Function1<? super ULong, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(sumBy);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(sumBy, i);
            sum = UInt.m326constructorimpl(sum + selector.invoke(ULong.m407boximpl(element)).m328unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumBy-JOV_ifY, reason: not valid java name */
    private static final int m1350sumByJOV_ifY(byte[] sumBy, Function1<? super UByte, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(sumBy);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(sumBy, i);
            sum = UInt.m326constructorimpl(sum + selector.invoke(UByte.m247boximpl(element)).m328unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumBy-xTcfx_M, reason: not valid java name */
    private static final int m1351sumByxTcfx_M(short[] sumBy, Function1<? super UShort, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(sumBy);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(sumBy, i);
            sum = UInt.m326constructorimpl(sum + selector.invoke(UShort.m514boximpl(element)).m328unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumByDouble-jgv0xPQ, reason: not valid java name */
    private static final double m1352sumByDoublejgv0xPQ(int[] sumByDouble, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(sumByDouble);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(sumByDouble, i);
            sum += selector.invoke(UInt.m327boximpl(element)).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumByDouble-MShoTSo, reason: not valid java name */
    private static final double m1353sumByDoubleMShoTSo(long[] sumByDouble, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(sumByDouble);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(sumByDouble, i);
            sum += selector.invoke(ULong.m407boximpl(element)).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumByDouble-JOV_ifY, reason: not valid java name */
    private static final double m1354sumByDoubleJOV_ifY(byte[] sumByDouble, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(sumByDouble);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(sumByDouble, i);
            sum += selector.invoke(UByte.m247boximpl(element)).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* JADX INFO: renamed from: sumByDouble-xTcfx_M, reason: not valid java name */
    private static final double m1355sumByDoublexTcfx_M(short[] sumByDouble, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(sumByDouble);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(sumByDouble, i);
            sum += selector.invoke(UShort.m514boximpl(element)).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfDouble")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(int[] sumOf, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(sumOf);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(sumOf, i);
            sum += selector.invoke(UInt.m327boximpl(element)).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfDouble")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(long[] sumOf, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(sumOf);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(sumOf, i);
            sum += selector.invoke(ULong.m407boximpl(element)).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfDouble")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(byte[] sumOf, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(sumOf);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(sumOf, i);
            sum += selector.invoke(UByte.m247boximpl(element)).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfDouble")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(short[] sumOf, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(sumOf);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(sumOf, i);
            sum += selector.invoke(UShort.m514boximpl(element)).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfInt")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int sumOfInt(int[] sumOf, Function1<? super UInt, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(sumOf);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(sumOf, i);
            sum += selector.invoke(UInt.m327boximpl(element)).intValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfInt")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int sumOfInt(long[] sumOf, Function1<? super ULong, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(sumOf);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(sumOf, i);
            sum += selector.invoke(ULong.m407boximpl(element)).intValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfInt")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int sumOfInt(byte[] sumOf, Function1<? super UByte, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(sumOf);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(sumOf, i);
            sum += selector.invoke(UByte.m247boximpl(element)).intValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfInt")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int sumOfInt(short[] sumOf, Function1<? super UShort, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(sumOf);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(sumOf, i);
            sum += selector.invoke(UShort.m514boximpl(element)).intValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfLong")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(int[] sumOf, Function1<? super UInt, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = 0;
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(sumOf);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(sumOf, i);
            sum += selector.invoke(UInt.m327boximpl(element)).longValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfLong")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(long[] sumOf, Function1<? super ULong, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = 0;
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(sumOf);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(sumOf, i);
            sum += selector.invoke(ULong.m407boximpl(element)).longValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfLong")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(byte[] sumOf, Function1<? super UByte, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = 0;
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(sumOf);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(sumOf, i);
            sum += selector.invoke(UByte.m247boximpl(element)).longValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfLong")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(short[] sumOf, Function1<? super UShort, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = 0;
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(sumOf);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(sumOf, i);
            sum += selector.invoke(UShort.m514boximpl(element)).longValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int sumOfUInt(int[] sumOf, Function1<? super UInt, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = UInt.m326constructorimpl(0);
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(sumOf);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(sumOf, i);
            sum = UInt.m326constructorimpl(sum + selector.invoke(UInt.m327boximpl(element)).m328unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int sumOfUInt(long[] sumOf, Function1<? super ULong, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = UInt.m326constructorimpl(0);
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(sumOf);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(sumOf, i);
            sum = UInt.m326constructorimpl(sum + selector.invoke(ULong.m407boximpl(element)).m328unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int sumOfUInt(byte[] sumOf, Function1<? super UByte, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = UInt.m326constructorimpl(0);
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(sumOf);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(sumOf, i);
            sum = UInt.m326constructorimpl(sum + selector.invoke(UByte.m247boximpl(element)).m328unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int sumOfUInt(short[] sumOf, Function1<? super UShort, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = UInt.m326constructorimpl(0);
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(sumOf);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(sumOf, i);
            sum = UInt.m326constructorimpl(sum + selector.invoke(UShort.m514boximpl(element)).m328unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfULong(int[] sumOf, Function1<? super UInt, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = ULong.m406constructorimpl(0L);
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(sumOf);
        for (int i = 0; i < iM334getSizeimpl; i++) {
            int element = UIntArray.m332getpVg5ArA(sumOf, i);
            sum = ULong.m406constructorimpl(sum + selector.invoke(UInt.m327boximpl(element)).m408unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfULong(long[] sumOf, Function1<? super ULong, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = ULong.m406constructorimpl(0L);
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(sumOf);
        for (int i = 0; i < iM414getSizeimpl; i++) {
            long element = ULongArray.m412getsVKNKU(sumOf, i);
            sum = ULong.m406constructorimpl(sum + selector.invoke(ULong.m407boximpl(element)).m408unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfULong(byte[] sumOf, Function1<? super UByte, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = ULong.m406constructorimpl(0L);
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(sumOf);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte element = UByteArray.m252getw2LRezQ(sumOf, i);
            sum = ULong.m406constructorimpl(sum + selector.invoke(UByte.m247boximpl(element)).m408unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfULong(short[] sumOf, Function1<? super UShort, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = ULong.m406constructorimpl(0L);
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(sumOf);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short element = UShortArray.m519getMh2AYeg(sumOf, i);
            sum = ULong.m406constructorimpl(sum + selector.invoke(UShort.m514boximpl(element)).m408unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-C-E_24M, reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m1356zipCE_24M(@NotNull int[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UIntArray.m334getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            int t1 = UIntArray.m332getpVg5ArA(zip, i);
            arrayList.add(TuplesKt.to(UInt.m327boximpl(t1), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-f7H3mmw, reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m1357zipf7H3mmw(@NotNull long[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(ULongArray.m414getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            long t1 = ULongArray.m412getsVKNKU(zip, i);
            arrayList.add(TuplesKt.to(ULong.m407boximpl(t1), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-nl983wc, reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m1358zipnl983wc(@NotNull byte[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UByteArray.m254getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            byte t1 = UByteArray.m252getw2LRezQ(zip, i);
            arrayList.add(TuplesKt.to(UByte.m247boximpl(t1), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-uaTIQ5s, reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m1359zipuaTIQ5s(@NotNull short[] zip, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UShortArray.m521getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            short t1 = UShortArray.m519getMh2AYeg(zip, i);
            arrayList.add(TuplesKt.to(UShort.m514boximpl(t1), other[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-ZjwqOic, reason: not valid java name */
    private static final <R, V> List<V> m1360zipZjwqOic(int[] zip, R[] other, Function2<? super UInt, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = Math.min(UIntArray.m334getSizeimpl(zip), other.length);
        ArrayList list = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            list.add(transform.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(zip, i)), other[i]));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-8LME4QE, reason: not valid java name */
    private static final <R, V> List<V> m1361zip8LME4QE(long[] zip, R[] other, Function2<? super ULong, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = Math.min(ULongArray.m414getSizeimpl(zip), other.length);
        ArrayList list = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            list.add(transform.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(zip, i)), other[i]));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-LuipOMY, reason: not valid java name */
    private static final <R, V> List<V> m1362zipLuipOMY(byte[] zip, R[] other, Function2<? super UByte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = Math.min(UByteArray.m254getSizeimpl(zip), other.length);
        ArrayList list = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            list.add(transform.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(zip, i)), other[i]));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-ePBmRWY, reason: not valid java name */
    private static final <R, V> List<V> m1363zipePBmRWY(short[] zip, R[] other, Function2<? super UShort, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = Math.min(UShortArray.m521getSizeimpl(zip), other.length);
        ArrayList list = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            list.add(transform.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(zip, i)), other[i]));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-HwE9HBo, reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m1364zipHwE9HBo(@NotNull int[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM334getSizeimpl = UIntArray.m334getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iM334getSizeimpl));
        int i = 0;
        for (Object t2 : other) {
            if (i >= iM334getSizeimpl) {
                break;
            }
            int i2 = i;
            i++;
            int t1 = UIntArray.m332getpVg5ArA(zip, i2);
            arrayList.add(TuplesKt.to(UInt.m327boximpl(t1), t2));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-F7u83W8, reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m1365zipF7u83W8(@NotNull long[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM414getSizeimpl = ULongArray.m414getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iM414getSizeimpl));
        int i = 0;
        for (Object t2 : other) {
            if (i >= iM414getSizeimpl) {
                break;
            }
            int i2 = i;
            i++;
            long t1 = ULongArray.m412getsVKNKU(zip, i2);
            arrayList.add(TuplesKt.to(ULong.m407boximpl(t1), t2));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-JQknh5Q, reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m1366zipJQknh5Q(@NotNull byte[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iM254getSizeimpl));
        int i = 0;
        for (Object t2 : other) {
            if (i >= iM254getSizeimpl) {
                break;
            }
            int i2 = i;
            i++;
            byte t1 = UByteArray.m252getw2LRezQ(zip, i2);
            arrayList.add(TuplesKt.to(UByte.m247boximpl(t1), t2));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-JGPC0-M, reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m1367zipJGPC0M(@NotNull short[] zip, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), iM521getSizeimpl));
        int i = 0;
        for (Object t2 : other) {
            if (i >= iM521getSizeimpl) {
                break;
            }
            int i2 = i;
            i++;
            short t1 = UShortArray.m519getMh2AYeg(zip, i2);
            arrayList.add(TuplesKt.to(UShort.m514boximpl(t1), t2));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-7znnbtw, reason: not valid java name */
    private static final <R, V> List<V> m1368zip7znnbtw(int[] zip, Iterable<? extends R> other, Function2<? super UInt, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int arraySize = UIntArray.m334getSizeimpl(zip);
        ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize));
        int i = 0;
        for (Object element : other) {
            if (i >= arraySize) {
                break;
            }
            int i2 = i;
            i++;
            list.add(transform.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(zip, i2)), element));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-TUPTUsU, reason: not valid java name */
    private static final <R, V> List<V> m1369zipTUPTUsU(long[] zip, Iterable<? extends R> other, Function2<? super ULong, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int arraySize = ULongArray.m414getSizeimpl(zip);
        ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize));
        int i = 0;
        for (Object element : other) {
            if (i >= arraySize) {
                break;
            }
            int i2 = i;
            i++;
            list.add(transform.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(zip, i2)), element));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-UCnP4_w, reason: not valid java name */
    private static final <R, V> List<V> m1370zipUCnP4_w(byte[] zip, Iterable<? extends R> other, Function2<? super UByte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int arraySize = UByteArray.m254getSizeimpl(zip);
        ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize));
        int i = 0;
        for (Object element : other) {
            if (i >= arraySize) {
                break;
            }
            int i2 = i;
            i++;
            list.add(transform.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(zip, i2)), element));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-kBb4a-s, reason: not valid java name */
    private static final <R, V> List<V> m1371zipkBb4as(short[] zip, Iterable<? extends R> other, Function2<? super UShort, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int arraySize = UShortArray.m521getSizeimpl(zip);
        ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(other, 10), arraySize));
        int i = 0;
        for (Object element : other) {
            if (i >= arraySize) {
                break;
            }
            int i2 = i;
            i++;
            list.add(transform.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(zip, i2)), element));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-ctEhBpI, reason: not valid java name */
    public static final List<Pair<UInt, UInt>> m1372zipctEhBpI(@NotNull int[] zip, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UIntArray.m334getSizeimpl(zip), UIntArray.m334getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            int t1 = UIntArray.m332getpVg5ArA(zip, i);
            int t2 = UIntArray.m332getpVg5ArA(other, i);
            arrayList.add(TuplesKt.to(UInt.m327boximpl(t1), UInt.m327boximpl(t2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-us8wMrg, reason: not valid java name */
    public static final List<Pair<ULong, ULong>> m1373zipus8wMrg(@NotNull long[] zip, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(ULongArray.m414getSizeimpl(zip), ULongArray.m414getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            long t1 = ULongArray.m412getsVKNKU(zip, i);
            long t2 = ULongArray.m412getsVKNKU(other, i);
            arrayList.add(TuplesKt.to(ULong.m407boximpl(t1), ULong.m407boximpl(t2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-kdPth3s, reason: not valid java name */
    public static final List<Pair<UByte, UByte>> m1374zipkdPth3s(@NotNull byte[] zip, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UByteArray.m254getSizeimpl(zip), UByteArray.m254getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            byte t1 = UByteArray.m252getw2LRezQ(zip, i);
            byte t2 = UByteArray.m252getw2LRezQ(other, i);
            arrayList.add(TuplesKt.to(UByte.m247boximpl(t1), UByte.m247boximpl(t2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-mazbYpA, reason: not valid java name */
    public static final List<Pair<UShort, UShort>> m1375zipmazbYpA(@NotNull short[] zip, @NotNull short[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(UShortArray.m521getSizeimpl(zip), UShortArray.m521getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            short t1 = UShortArray.m519getMh2AYeg(zip, i);
            short t2 = UShortArray.m519getMh2AYeg(other, i);
            arrayList.add(TuplesKt.to(UShort.m514boximpl(t1), UShort.m514boximpl(t2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-L83TJbI, reason: not valid java name */
    private static final <V> List<V> m1376zipL83TJbI(int[] zip, int[] other, Function2<? super UInt, ? super UInt, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = Math.min(UIntArray.m334getSizeimpl(zip), UIntArray.m334getSizeimpl(other));
        ArrayList list = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            list.add(transform.invoke(UInt.m327boximpl(UIntArray.m332getpVg5ArA(zip, i)), UInt.m327boximpl(UIntArray.m332getpVg5ArA(other, i))));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-PabeH-Q, reason: not valid java name */
    private static final <V> List<V> m1377zipPabeHQ(long[] zip, long[] other, Function2<? super ULong, ? super ULong, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = Math.min(ULongArray.m414getSizeimpl(zip), ULongArray.m414getSizeimpl(other));
        ArrayList list = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            list.add(transform.invoke(ULong.m407boximpl(ULongArray.m412getsVKNKU(zip, i)), ULong.m407boximpl(ULongArray.m412getsVKNKU(other, i))));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-JAKpvQM, reason: not valid java name */
    private static final <V> List<V> m1378zipJAKpvQM(byte[] zip, byte[] other, Function2<? super UByte, ? super UByte, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = Math.min(UByteArray.m254getSizeimpl(zip), UByteArray.m254getSizeimpl(other));
        ArrayList list = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            list.add(transform.invoke(UByte.m247boximpl(UByteArray.m252getw2LRezQ(zip, i)), UByte.m247boximpl(UByteArray.m252getw2LRezQ(other, i))));
        }
        return list;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: zip-gVVukQo, reason: not valid java name */
    private static final <V> List<V> m1379zipgVVukQo(short[] zip, short[] other, Function2<? super UShort, ? super UShort, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = Math.min(UShortArray.m521getSizeimpl(zip), UShortArray.m521getSizeimpl(other));
        ArrayList list = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            list.add(transform.invoke(UShort.m514boximpl(UShortArray.m519getMh2AYeg(zip, i)), UShort.m514boximpl(UShortArray.m519getMh2AYeg(other, i))));
        }
        return list;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull UInt[] $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        for (UInt uInt : $this$sum) {
            int element = uInt.m328unboximpl();
            sum = UInt.m326constructorimpl(sum + element);
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull ULong[] $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        long sum = 0;
        for (ULong uLong : $this$sum) {
            long element = uLong.m408unboximpl();
            sum = ULong.m406constructorimpl(sum + element);
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull UByte[] $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        for (UByte uByte : $this$sum) {
            byte element = uByte.m248unboximpl();
            sum = UInt.m326constructorimpl(sum + UInt.m326constructorimpl(element & 255));
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull UShort[] $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        for (UShort uShort : $this$sum) {
            short element = uShort.m515unboximpl();
            sum = UInt.m326constructorimpl(sum + UInt.m326constructorimpl(element & 65535));
        }
        return sum;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: sum--ajY-9A, reason: not valid java name */
    private static final int m1380sumajY9A(int[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        return UInt.m326constructorimpl(ArraysKt.sum(sum));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: sum-QwZRm1k, reason: not valid java name */
    private static final long m1381sumQwZRm1k(long[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        return ULong.m406constructorimpl(ArraysKt.sum(sum));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: sum-GBYM_sE, reason: not valid java name */
    private static final int m1382sumGBYM_sE(byte[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        int iM326constructorimpl = UInt.m326constructorimpl(0);
        int iM254getSizeimpl = UByteArray.m254getSizeimpl(sum);
        for (int i = 0; i < iM254getSizeimpl; i++) {
            byte it = UByteArray.m252getw2LRezQ(sum, i);
            iM326constructorimpl = UInt.m326constructorimpl(iM326constructorimpl + UInt.m326constructorimpl(it & 255));
        }
        return iM326constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: sum-rL5Bavg, reason: not valid java name */
    private static final int m1383sumrL5Bavg(short[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        int iM326constructorimpl = UInt.m326constructorimpl(0);
        int iM521getSizeimpl = UShortArray.m521getSizeimpl(sum);
        for (int i = 0; i < iM521getSizeimpl; i++) {
            short it = UShortArray.m519getMh2AYeg(sum, i);
            iM326constructorimpl = UInt.m326constructorimpl(iM326constructorimpl + UInt.m326constructorimpl(it & 65535));
        }
        return iM326constructorimpl;
    }
}
