package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _ArraysJvm.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArraysKt___ArraysJvmKt.class */
public class ArraysKt___ArraysJvmKt extends ArraysKt__ArraysKt {
    @InlineOnly
    private static final <T> T elementAt(T[] $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt[index];
    }

    @InlineOnly
    private static final byte elementAt(byte[] $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt[index];
    }

    @InlineOnly
    private static final short elementAt(short[] $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt[index];
    }

    @InlineOnly
    private static final int elementAt(int[] $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt[index];
    }

    @InlineOnly
    private static final long elementAt(long[] $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt[index];
    }

    @InlineOnly
    private static final float elementAt(float[] $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt[index];
    }

    @InlineOnly
    private static final double elementAt(double[] $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt[index];
    }

    @InlineOnly
    private static final boolean elementAt(boolean[] $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt[index];
    }

    @InlineOnly
    private static final char elementAt(char[] $this$elementAt, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt, "<this>");
        return $this$elementAt[index];
    }

    @NotNull
    public static final <R> List<R> filterIsInstance(@NotNull Object[] $this$filterIsInstance, @NotNull Class<R> klass) {
        Intrinsics.checkNotNullParameter($this$filterIsInstance, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (List) ArraysKt.filterIsInstanceTo($this$filterIsInstance, new ArrayList(), klass);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Object[] $this$filterIsInstanceTo, @NotNull C destination, @NotNull Class<R> klass) {
        Intrinsics.checkNotNullParameter($this$filterIsInstanceTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object element : $this$filterIsInstanceTo) {
            if (klass.isInstance(element)) {
                destination.add(element);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T> List<T> asList(@NotNull T[] $this$asList) {
        Intrinsics.checkNotNullParameter($this$asList, "<this>");
        List<T> listAsList = ArraysUtilJVM.asList($this$asList);
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$1, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArraysKt___ArraysJvmKt$asList$1.class */
    public static final class AnonymousClass1 extends AbstractList<Byte> implements RandomAccess {
        final /* synthetic */ byte[] $this_asList;

        AnonymousClass1(byte[] $receiver) {
            this.$this_asList = $receiver;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object element) {
            if (element instanceof Byte) {
                return contains(((Number) element).byteValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object element) {
            if (element instanceof Byte) {
                return indexOf(((Number) element).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object element) {
            if (element instanceof Byte) {
                return lastIndexOf(((Number) element).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        public boolean contains(byte element) {
            return ArraysKt.contains(this.$this_asList, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Byte get(int index) {
            return Byte.valueOf(this.$this_asList[index]);
        }

        public int indexOf(byte element) {
            return ArraysKt.indexOf(this.$this_asList, element);
        }

        public int lastIndexOf(byte element) {
            return ArraysKt.lastIndexOf(this.$this_asList, element);
        }
    }

    @NotNull
    public static final List<Byte> asList(@NotNull byte[] $this$asList) {
        Intrinsics.checkNotNullParameter($this$asList, "<this>");
        return new AnonymousClass1($this$asList);
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$2, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArraysKt___ArraysJvmKt$asList$2.class */
    public static final class AnonymousClass2 extends AbstractList<Short> implements RandomAccess {
        final /* synthetic */ short[] $this_asList;

        AnonymousClass2(short[] $receiver) {
            this.$this_asList = $receiver;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object element) {
            if (element instanceof Short) {
                return contains(((Number) element).shortValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object element) {
            if (element instanceof Short) {
                return indexOf(((Number) element).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object element) {
            if (element instanceof Short) {
                return lastIndexOf(((Number) element).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        public boolean contains(short element) {
            return ArraysKt.contains(this.$this_asList, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Short get(int index) {
            return Short.valueOf(this.$this_asList[index]);
        }

        public int indexOf(short element) {
            return ArraysKt.indexOf(this.$this_asList, element);
        }

        public int lastIndexOf(short element) {
            return ArraysKt.lastIndexOf(this.$this_asList, element);
        }
    }

    @NotNull
    public static final List<Short> asList(@NotNull short[] $this$asList) {
        Intrinsics.checkNotNullParameter($this$asList, "<this>");
        return new AnonymousClass2($this$asList);
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$3, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArraysKt___ArraysJvmKt$asList$3.class */
    public static final class AnonymousClass3 extends AbstractList<Integer> implements RandomAccess {
        final /* synthetic */ int[] $this_asList;

        AnonymousClass3(int[] $receiver) {
            this.$this_asList = $receiver;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object element) {
            if (element instanceof Integer) {
                return contains(((Number) element).intValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object element) {
            if (element instanceof Integer) {
                return indexOf(((Number) element).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object element) {
            if (element instanceof Integer) {
                return lastIndexOf(((Number) element).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        public boolean contains(int element) {
            return ArraysKt.contains(this.$this_asList, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Integer get(int index) {
            return Integer.valueOf(this.$this_asList[index]);
        }

        public int indexOf(int element) {
            return ArraysKt.indexOf(this.$this_asList, element);
        }

        public int lastIndexOf(int element) {
            return ArraysKt.lastIndexOf(this.$this_asList, element);
        }
    }

    @NotNull
    public static final List<Integer> asList(@NotNull int[] $this$asList) {
        Intrinsics.checkNotNullParameter($this$asList, "<this>");
        return new AnonymousClass3($this$asList);
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$4, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArraysKt___ArraysJvmKt$asList$4.class */
    public static final class AnonymousClass4 extends AbstractList<Long> implements RandomAccess {
        final /* synthetic */ long[] $this_asList;

        AnonymousClass4(long[] $receiver) {
            this.$this_asList = $receiver;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object element) {
            if (element instanceof Long) {
                return contains(((Number) element).longValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object element) {
            if (element instanceof Long) {
                return indexOf(((Number) element).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object element) {
            if (element instanceof Long) {
                return lastIndexOf(((Number) element).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        public boolean contains(long element) {
            return ArraysKt.contains(this.$this_asList, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Long get(int index) {
            return Long.valueOf(this.$this_asList[index]);
        }

        public int indexOf(long element) {
            return ArraysKt.indexOf(this.$this_asList, element);
        }

        public int lastIndexOf(long element) {
            return ArraysKt.lastIndexOf(this.$this_asList, element);
        }
    }

    @NotNull
    public static final List<Long> asList(@NotNull long[] $this$asList) {
        Intrinsics.checkNotNullParameter($this$asList, "<this>");
        return new AnonymousClass4($this$asList);
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$5, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArraysKt___ArraysJvmKt$asList$5.class */
    public static final class AnonymousClass5 extends AbstractList<Float> implements RandomAccess {
        final /* synthetic */ float[] $this_asList;

        AnonymousClass5(float[] $receiver) {
            this.$this_asList = $receiver;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object element) {
            if (element instanceof Float) {
                return contains(((Number) element).floatValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object element) {
            if (element instanceof Float) {
                return indexOf(((Number) element).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object element) {
            if (element instanceof Float) {
                return lastIndexOf(((Number) element).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        public boolean contains(float element) {
            float[] $this$any$iv = this.$this_asList;
            for (float element$iv : $this$any$iv) {
                if (Float.floatToIntBits(element$iv) == Float.floatToIntBits(element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Float get(int index) {
            return Float.valueOf(this.$this_asList[index]);
        }

        public int indexOf(float element) {
            float[] $this$indexOfFirst$iv = this.$this_asList;
            int length = $this$indexOfFirst$iv.length;
            for (int index$iv = 0; index$iv < length; index$iv++) {
                float it = $this$indexOfFirst$iv[index$iv];
                if (Float.floatToIntBits(it) == Float.floatToIntBits(element)) {
                    return index$iv;
                }
            }
            return -1;
        }

        public int lastIndexOf(float element) {
            float[] $this$indexOfLast$iv = this.$this_asList;
            int length = $this$indexOfLast$iv.length - 1;
            if (0 <= length) {
                do {
                    int index$iv = length;
                    length--;
                    float it = $this$indexOfLast$iv[index$iv];
                    if (Float.floatToIntBits(it) == Float.floatToIntBits(element)) {
                        return index$iv;
                    }
                } while (0 <= length);
            }
            return -1;
        }
    }

    @NotNull
    public static final List<Float> asList(@NotNull float[] $this$asList) {
        Intrinsics.checkNotNullParameter($this$asList, "<this>");
        return new AnonymousClass5($this$asList);
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$6, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArraysKt___ArraysJvmKt$asList$6.class */
    public static final class AnonymousClass6 extends AbstractList<Double> implements RandomAccess {
        final /* synthetic */ double[] $this_asList;

        AnonymousClass6(double[] $receiver) {
            this.$this_asList = $receiver;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object element) {
            if (element instanceof Double) {
                return contains(((Number) element).doubleValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object element) {
            if (element instanceof Double) {
                return indexOf(((Number) element).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object element) {
            if (element instanceof Double) {
                return lastIndexOf(((Number) element).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        public boolean contains(double element) {
            double[] $this$any$iv = this.$this_asList;
            for (double element$iv : $this$any$iv) {
                if (Double.doubleToLongBits(element$iv) == Double.doubleToLongBits(element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Double get(int index) {
            return Double.valueOf(this.$this_asList[index]);
        }

        public int indexOf(double element) {
            double[] $this$indexOfFirst$iv = this.$this_asList;
            int length = $this$indexOfFirst$iv.length;
            for (int index$iv = 0; index$iv < length; index$iv++) {
                double it = $this$indexOfFirst$iv[index$iv];
                if (Double.doubleToLongBits(it) == Double.doubleToLongBits(element)) {
                    return index$iv;
                }
            }
            return -1;
        }

        public int lastIndexOf(double element) {
            double[] $this$indexOfLast$iv = this.$this_asList;
            int length = $this$indexOfLast$iv.length - 1;
            if (0 <= length) {
                do {
                    int index$iv = length;
                    length--;
                    double it = $this$indexOfLast$iv[index$iv];
                    if (Double.doubleToLongBits(it) == Double.doubleToLongBits(element)) {
                        return index$iv;
                    }
                } while (0 <= length);
            }
            return -1;
        }
    }

    @NotNull
    public static final List<Double> asList(@NotNull double[] $this$asList) {
        Intrinsics.checkNotNullParameter($this$asList, "<this>");
        return new AnonymousClass6($this$asList);
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$7, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArraysKt___ArraysJvmKt$asList$7.class */
    public static final class AnonymousClass7 extends AbstractList<Boolean> implements RandomAccess {
        final /* synthetic */ boolean[] $this_asList;

        AnonymousClass7(boolean[] $receiver) {
            this.$this_asList = $receiver;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object element) {
            if (element instanceof Boolean) {
                return contains(((Boolean) element).booleanValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object element) {
            if (element instanceof Boolean) {
                return indexOf(((Boolean) element).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object element) {
            if (element instanceof Boolean) {
                return lastIndexOf(((Boolean) element).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        public boolean contains(boolean element) {
            return ArraysKt.contains(this.$this_asList, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Boolean get(int index) {
            return Boolean.valueOf(this.$this_asList[index]);
        }

        public int indexOf(boolean element) {
            return ArraysKt.indexOf(this.$this_asList, element);
        }

        public int lastIndexOf(boolean element) {
            return ArraysKt.lastIndexOf(this.$this_asList, element);
        }
    }

    @NotNull
    public static final List<Boolean> asList(@NotNull boolean[] $this$asList) {
        Intrinsics.checkNotNullParameter($this$asList, "<this>");
        return new AnonymousClass7($this$asList);
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$8, reason: invalid class name */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArraysKt___ArraysJvmKt$asList$8.class */
    public static final class AnonymousClass8 extends AbstractList<Character> implements RandomAccess {
        final /* synthetic */ char[] $this_asList;

        AnonymousClass8(char[] $receiver) {
            this.$this_asList = $receiver;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object element) {
            if (element instanceof Character) {
                return contains(((Character) element).charValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object element) {
            if (element instanceof Character) {
                return indexOf(((Character) element).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object element) {
            if (element instanceof Character) {
                return lastIndexOf(((Character) element).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        public boolean contains(char element) {
            return ArraysKt.contains(this.$this_asList, element);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Character get(int index) {
            return Character.valueOf(this.$this_asList[index]);
        }

        public int indexOf(char element) {
            return ArraysKt.indexOf(this.$this_asList, element);
        }

        public int lastIndexOf(char element) {
            return ArraysKt.lastIndexOf(this.$this_asList, element);
        }
    }

    @NotNull
    public static final List<Character> asList(@NotNull char[] $this$asList) {
        Intrinsics.checkNotNullParameter($this$asList, "<this>");
        return new AnonymousClass8($this$asList);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return ArraysKt.binarySearch(objArr, obj, comparator, i, i2);
    }

    public static final <T> int binarySearch(@NotNull T[] $this$binarySearch, T element, @NotNull Comparator<? super T> comparator, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element, comparator);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        return ArraysKt.binarySearch(objArr, obj, i, i2);
    }

    public static final <T> int binarySearch(@NotNull T[] $this$binarySearch, T element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return ArraysKt.binarySearch(bArr, b, i, i2);
    }

    public static final int binarySearch(@NotNull byte[] $this$binarySearch, byte element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return ArraysKt.binarySearch(sArr, s, i, i2);
    }

    public static final int binarySearch(@NotNull short[] $this$binarySearch, short element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return ArraysKt.binarySearch(iArr, i, i2, i3);
    }

    public static final int binarySearch(@NotNull int[] $this$binarySearch, int element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return ArraysKt.binarySearch(jArr, j, i, i2);
    }

    public static final int binarySearch(@NotNull long[] $this$binarySearch, long element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        return ArraysKt.binarySearch(fArr, f, i, i2);
    }

    public static final int binarySearch(@NotNull float[] $this$binarySearch, float element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        return ArraysKt.binarySearch(dArr, d, i, i2);
    }

    public static final int binarySearch(@NotNull double[] $this$binarySearch, double element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return ArraysKt.binarySearch(cArr, c, i, i2);
    }

    public static final int binarySearch(@NotNull char[] $this$binarySearch, char element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
        return Arrays.binarySearch($this$binarySearch, fromIndex, toIndex, element);
    }

    @SinceKotlin(version = "1.1")
    @JvmName(name = "contentDeepEqualsInline")
    @InlineOnly
    @LowPriorityInOverloadResolution
    private static final <T> boolean contentDeepEqualsInline(T[] $this$contentDeepEquals, T[] other) {
        Intrinsics.checkNotNullParameter($this$contentDeepEquals, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ArraysKt.contentDeepEquals($this$contentDeepEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "contentDeepEqualsNullable")
    @InlineOnly
    private static final <T> boolean contentDeepEqualsNullable(T[] $this$contentDeepEquals, T[] other) {
        return ArraysKt.contentDeepEquals($this$contentDeepEquals, other);
    }

    @SinceKotlin(version = "1.1")
    @JvmName(name = "contentDeepHashCodeInline")
    @InlineOnly
    @LowPriorityInOverloadResolution
    private static final <T> int contentDeepHashCodeInline(T[] $this$contentDeepHashCode) {
        Intrinsics.checkNotNullParameter($this$contentDeepHashCode, "<this>");
        return ArraysKt.contentDeepHashCode($this$contentDeepHashCode);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "contentDeepHashCodeNullable")
    @InlineOnly
    private static final <T> int contentDeepHashCodeNullable(T[] $this$contentDeepHashCode) {
        return ArraysKt.contentDeepHashCode($this$contentDeepHashCode);
    }

    @SinceKotlin(version = "1.1")
    @JvmName(name = "contentDeepToStringInline")
    @InlineOnly
    @LowPriorityInOverloadResolution
    private static final <T> String contentDeepToStringInline(T[] $this$contentDeepToString) {
        Intrinsics.checkNotNullParameter($this$contentDeepToString, "<this>");
        return ArraysKt.contentDeepToString($this$contentDeepToString);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "contentDeepToStringNullable")
    @InlineOnly
    private static final <T> String contentDeepToStringNullable(T[] $this$contentDeepToString) {
        return ArraysKt.contentDeepToString($this$contentDeepToString);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T> boolean contentEquals(T[] $this$contentEquals, T[] other) {
        return Arrays.equals($this$contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean contentEquals(byte[] $this$contentEquals, byte[] other) {
        return Arrays.equals($this$contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean contentEquals(short[] $this$contentEquals, short[] other) {
        return Arrays.equals($this$contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean contentEquals(int[] $this$contentEquals, int[] other) {
        return Arrays.equals($this$contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean contentEquals(long[] $this$contentEquals, long[] other) {
        return Arrays.equals($this$contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean contentEquals(float[] $this$contentEquals, float[] other) {
        return Arrays.equals($this$contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean contentEquals(double[] $this$contentEquals, double[] other) {
        return Arrays.equals($this$contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean contentEquals(boolean[] $this$contentEquals, boolean[] other) {
        return Arrays.equals($this$contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean contentEquals(char[] $this$contentEquals, char[] other) {
        return Arrays.equals($this$contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T> int contentHashCode(T[] $this$contentHashCode) {
        return Arrays.hashCode($this$contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int contentHashCode(byte[] $this$contentHashCode) {
        return Arrays.hashCode($this$contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int contentHashCode(short[] $this$contentHashCode) {
        return Arrays.hashCode($this$contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int contentHashCode(int[] $this$contentHashCode) {
        return Arrays.hashCode($this$contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int contentHashCode(long[] $this$contentHashCode) {
        return Arrays.hashCode($this$contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int contentHashCode(float[] $this$contentHashCode) {
        return Arrays.hashCode($this$contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int contentHashCode(double[] $this$contentHashCode) {
        return Arrays.hashCode($this$contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int contentHashCode(boolean[] $this$contentHashCode) {
        return Arrays.hashCode($this$contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int contentHashCode(char[] $this$contentHashCode) {
        return Arrays.hashCode($this$contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T> String contentToString(T[] $this$contentToString) {
        String string = Arrays.toString($this$contentToString);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String contentToString(byte[] $this$contentToString) {
        String string = Arrays.toString($this$contentToString);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String contentToString(short[] $this$contentToString) {
        String string = Arrays.toString($this$contentToString);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String contentToString(int[] $this$contentToString) {
        String string = Arrays.toString($this$contentToString);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String contentToString(long[] $this$contentToString) {
        String string = Arrays.toString($this$contentToString);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String contentToString(float[] $this$contentToString) {
        String string = Arrays.toString($this$contentToString);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String contentToString(double[] $this$contentToString) {
        String string = Arrays.toString($this$contentToString);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String contentToString(boolean[] $this$contentToString) {
        String string = Arrays.toString($this$contentToString);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String contentToString(char[] $this$contentToString) {
        String string = Arrays.toString($this$contentToString);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return ArraysKt.copyInto(objArr, objArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> T[] copyInto(@NotNull T[] $this$copyInto, @NotNull T[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
        return destination;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return ArraysKt.copyInto(bArr, bArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] copyInto(@NotNull byte[] $this$copyInto, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
        return destination;
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length;
        }
        return ArraysKt.copyInto(sArr, sArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final short[] copyInto(@NotNull short[] $this$copyInto, @NotNull short[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
        return destination;
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return ArraysKt.copyInto(iArr, iArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final int[] copyInto(@NotNull int[] $this$copyInto, @NotNull int[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
        return destination;
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return ArraysKt.copyInto(jArr, jArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final long[] copyInto(@NotNull long[] $this$copyInto, @NotNull long[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
        return destination;
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return ArraysKt.copyInto(fArr, fArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final float[] copyInto(@NotNull float[] $this$copyInto, @NotNull float[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
        return destination;
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length;
        }
        return ArraysKt.copyInto(dArr, dArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final double[] copyInto(@NotNull double[] $this$copyInto, @NotNull double[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
        return destination;
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = zArr.length;
        }
        return ArraysKt.copyInto(zArr, zArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final boolean[] copyInto(@NotNull boolean[] $this$copyInto, @NotNull boolean[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
        return destination;
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = cArr.length;
        }
        return ArraysKt.copyInto(cArr, cArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final char[] copyInto(@NotNull char[] $this$copyInto, @NotNull char[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$copyInto, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy($this$copyInto, startIndex, destination, destinationOffset, endIndex - startIndex);
        return destination;
    }

    @InlineOnly
    private static final <T> T[] copyOf(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    @InlineOnly
    private static final byte[] copyOf(byte[] $this$copyOf) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf($this$copyOf, $this$copyOf.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @InlineOnly
    private static final short[] copyOf(short[] $this$copyOf) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        short[] sArrCopyOf = Arrays.copyOf($this$copyOf, $this$copyOf.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @InlineOnly
    private static final int[] copyOf(int[] $this$copyOf) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        int[] iArrCopyOf = Arrays.copyOf($this$copyOf, $this$copyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @InlineOnly
    private static final long[] copyOf(long[] $this$copyOf) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        long[] jArrCopyOf = Arrays.copyOf($this$copyOf, $this$copyOf.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @InlineOnly
    private static final float[] copyOf(float[] $this$copyOf) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        float[] fArrCopyOf = Arrays.copyOf($this$copyOf, $this$copyOf.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @InlineOnly
    private static final double[] copyOf(double[] $this$copyOf) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        double[] dArrCopyOf = Arrays.copyOf($this$copyOf, $this$copyOf.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @InlineOnly
    private static final boolean[] copyOf(boolean[] $this$copyOf) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf($this$copyOf, $this$copyOf.length);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @InlineOnly
    private static final char[] copyOf(char[] $this$copyOf) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        char[] cArrCopyOf = Arrays.copyOf($this$copyOf, $this$copyOf.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @InlineOnly
    private static final byte[] copyOf(byte[] $this$copyOf, int newSize) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf($this$copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @InlineOnly
    private static final short[] copyOf(short[] $this$copyOf, int newSize) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        short[] sArrCopyOf = Arrays.copyOf($this$copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @InlineOnly
    private static final int[] copyOf(int[] $this$copyOf, int newSize) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        int[] iArrCopyOf = Arrays.copyOf($this$copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @InlineOnly
    private static final long[] copyOf(long[] $this$copyOf, int newSize) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        long[] jArrCopyOf = Arrays.copyOf($this$copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @InlineOnly
    private static final float[] copyOf(float[] $this$copyOf, int newSize) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        float[] fArrCopyOf = Arrays.copyOf($this$copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @InlineOnly
    private static final double[] copyOf(double[] $this$copyOf, int newSize) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        double[] dArrCopyOf = Arrays.copyOf($this$copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @InlineOnly
    private static final boolean[] copyOf(boolean[] $this$copyOf, int newSize) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf($this$copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @InlineOnly
    private static final char[] copyOf(char[] $this$copyOf, int newSize) {
        Intrinsics.checkNotNullParameter($this$copyOf, "<this>");
        char[] cArrCopyOf = Arrays.copyOf($this$copyOf, newSize);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @InlineOnly
    private static final <T> T[] copyOf(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    @JvmName(name = "copyOfRangeInline")
    @InlineOnly
    private static final <T> T[] copyOfRangeInline(T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T[]) ArraysKt.copyOfRange(tArr, i, i2);
    }

    @JvmName(name = "copyOfRangeInline")
    @InlineOnly
    private static final byte[] copyOfRangeInline(byte[] $this$copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
        return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
    }

    @JvmName(name = "copyOfRangeInline")
    @InlineOnly
    private static final short[] copyOfRangeInline(short[] $this$copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
        return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
    }

    @JvmName(name = "copyOfRangeInline")
    @InlineOnly
    private static final int[] copyOfRangeInline(int[] $this$copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
        return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
    }

    @JvmName(name = "copyOfRangeInline")
    @InlineOnly
    private static final long[] copyOfRangeInline(long[] $this$copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
        return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
    }

    @JvmName(name = "copyOfRangeInline")
    @InlineOnly
    private static final float[] copyOfRangeInline(float[] $this$copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
        return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
    }

    @JvmName(name = "copyOfRangeInline")
    @InlineOnly
    private static final double[] copyOfRangeInline(double[] $this$copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
        return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
    }

    @JvmName(name = "copyOfRangeInline")
    @InlineOnly
    private static final boolean[] copyOfRangeInline(boolean[] $this$copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
        return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
    }

    @JvmName(name = "copyOfRangeInline")
    @InlineOnly
    private static final char[] copyOfRangeInline(char[] $this$copyOfRange, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRange, "<this>");
        return ArraysKt.copyOfRange($this$copyOfRange, fromIndex, toIndex);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final <T> T[] copyOfRange(@NotNull T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysKt.copyOfRangeToIndexCheck(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final byte[] copyOfRange(@NotNull byte[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
        ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final short[] copyOfRange(@NotNull short[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
        ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOfRange, "copyOfRange(...)");
        return sArrCopyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final int[] copyOfRange(@NotNull int[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
        ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOfRange, "copyOfRange(...)");
        return iArrCopyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final long[] copyOfRange(@NotNull long[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
        ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOfRange, "copyOfRange(...)");
        return jArrCopyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final float[] copyOfRange(@NotNull float[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
        ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final double[] copyOfRange(@NotNull double[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
        ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOfRange, "copyOfRange(...)");
        return dArrCopyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final boolean[] copyOfRange(@NotNull boolean[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
        ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOfRange, "copyOfRange(...)");
        return zArrCopyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final char[] copyOfRange(@NotNull char[] $this$copyOfRangeImpl, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$copyOfRangeImpl, "<this>");
        ArraysKt.copyOfRangeToIndexCheck(toIndex, $this$copyOfRangeImpl.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange($this$copyOfRangeImpl, fromIndex, toIndex);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOfRange, "copyOfRange(...)");
        return cArrCopyOfRange;
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        ArraysKt.fill(objArr, obj, i, i2);
    }

    public static final <T> void fill(@NotNull T[] $this$fill, T element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$fill, "<this>");
        Arrays.fill($this$fill, fromIndex, toIndex, element);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        ArraysKt.fill(bArr, b, i, i2);
    }

    public static final void fill(@NotNull byte[] $this$fill, byte element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$fill, "<this>");
        Arrays.fill($this$fill, fromIndex, toIndex, element);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        ArraysKt.fill(sArr, s, i, i2);
    }

    public static final void fill(@NotNull short[] $this$fill, short element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$fill, "<this>");
        Arrays.fill($this$fill, fromIndex, toIndex, element);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        ArraysKt.fill(iArr, i, i2, i3);
    }

    public static final void fill(@NotNull int[] $this$fill, int element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$fill, "<this>");
        Arrays.fill($this$fill, fromIndex, toIndex, element);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        ArraysKt.fill(jArr, j, i, i2);
    }

    public static final void fill(@NotNull long[] $this$fill, long element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$fill, "<this>");
        Arrays.fill($this$fill, fromIndex, toIndex, element);
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        ArraysKt.fill(fArr, f, i, i2);
    }

    public static final void fill(@NotNull float[] $this$fill, float element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$fill, "<this>");
        Arrays.fill($this$fill, fromIndex, toIndex, element);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        ArraysKt.fill(dArr, d, i, i2);
    }

    public static final void fill(@NotNull double[] $this$fill, double element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$fill, "<this>");
        Arrays.fill($this$fill, fromIndex, toIndex, element);
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        ArraysKt.fill(zArr, z, i, i2);
    }

    public static final void fill(@NotNull boolean[] $this$fill, boolean element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$fill, "<this>");
        Arrays.fill($this$fill, fromIndex, toIndex, element);
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        ArraysKt.fill(cArr, c, i, i2);
    }

    public static final void fill(@NotNull char[] $this$fill, char element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$fill, "<this>");
        Arrays.fill($this$fill, fromIndex, toIndex, element);
    }

    @NotNull
    public static final <T> T[] plus(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    @NotNull
    public static final byte[] plus(@NotNull byte[] $this$plus, byte element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        int index = $this$plus.length;
        byte[] result = Arrays.copyOf($this$plus, index + 1);
        result[index] = element;
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] $this$plus, short element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        int index = $this$plus.length;
        short[] result = Arrays.copyOf($this$plus, index + 1);
        result[index] = element;
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final int[] plus(@NotNull int[] $this$plus, int element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        int index = $this$plus.length;
        int[] result = Arrays.copyOf($this$plus, index + 1);
        result[index] = element;
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final long[] plus(@NotNull long[] $this$plus, long element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        int index = $this$plus.length;
        long[] result = Arrays.copyOf($this$plus, index + 1);
        result[index] = element;
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] $this$plus, float element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        int index = $this$plus.length;
        float[] result = Arrays.copyOf($this$plus, index + 1);
        result[index] = element;
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] $this$plus, double element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        int index = $this$plus.length;
        double[] result = Arrays.copyOf($this$plus, index + 1);
        result[index] = element;
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] $this$plus, boolean element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        int index = $this$plus.length;
        boolean[] result = Arrays.copyOf($this$plus, index + 1);
        result[index] = element;
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] $this$plus, char element) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        int index = $this$plus.length;
        char[] result = Arrays.copyOf($this$plus, index + 1);
        result[index] = element;
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final <T> T[] plus(@NotNull T[] tArr, @NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + elements.size());
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            int i = length;
            length++;
            tArr2[i] = it.next();
        }
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    @NotNull
    public static final byte[] plus(@NotNull byte[] $this$plus, @NotNull Collection<Byte> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = $this$plus.length;
        byte[] result = Arrays.copyOf($this$plus, index + elements.size());
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            byte element = it.next().byteValue();
            int i = index;
            index++;
            result[i] = element;
        }
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] $this$plus, @NotNull Collection<Short> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = $this$plus.length;
        short[] result = Arrays.copyOf($this$plus, index + elements.size());
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            short element = it.next().shortValue();
            int i = index;
            index++;
            result[i] = element;
        }
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final int[] plus(@NotNull int[] $this$plus, @NotNull Collection<Integer> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = $this$plus.length;
        int[] result = Arrays.copyOf($this$plus, index + elements.size());
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            int element = it.next().intValue();
            int i = index;
            index++;
            result[i] = element;
        }
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final long[] plus(@NotNull long[] $this$plus, @NotNull Collection<Long> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = $this$plus.length;
        long[] result = Arrays.copyOf($this$plus, index + elements.size());
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            long element = it.next().longValue();
            int i = index;
            index++;
            result[i] = element;
        }
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] $this$plus, @NotNull Collection<Float> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = $this$plus.length;
        float[] result = Arrays.copyOf($this$plus, index + elements.size());
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            float element = it.next().floatValue();
            int i = index;
            index++;
            result[i] = element;
        }
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] $this$plus, @NotNull Collection<Double> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = $this$plus.length;
        double[] result = Arrays.copyOf($this$plus, index + elements.size());
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            double element = it.next().doubleValue();
            int i = index;
            index++;
            result[i] = element;
        }
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] $this$plus, @NotNull Collection<Boolean> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = $this$plus.length;
        boolean[] result = Arrays.copyOf($this$plus, index + elements.size());
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            boolean element = it.next().booleanValue();
            int i = index;
            index++;
            result[i] = element;
        }
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] $this$plus, @NotNull Collection<Character> elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int index = $this$plus.length;
        char[] result = Arrays.copyOf($this$plus, index + elements.size());
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            char element = it.next().charValue();
            int i = index;
            index++;
            result[i] = element;
        }
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final <T> T[] plus(@NotNull T[] tArr, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    @NotNull
    public static final byte[] plus(@NotNull byte[] $this$plus, @NotNull byte[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int thisSize = $this$plus.length;
        int arraySize = elements.length;
        byte[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] $this$plus, @NotNull short[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int thisSize = $this$plus.length;
        int arraySize = elements.length;
        short[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final int[] plus(@NotNull int[] $this$plus, @NotNull int[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int thisSize = $this$plus.length;
        int arraySize = elements.length;
        int[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final long[] plus(@NotNull long[] $this$plus, @NotNull long[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int thisSize = $this$plus.length;
        int arraySize = elements.length;
        long[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] $this$plus, @NotNull float[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int thisSize = $this$plus.length;
        int arraySize = elements.length;
        float[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] $this$plus, @NotNull double[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int thisSize = $this$plus.length;
        int arraySize = elements.length;
        double[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] $this$plus, @NotNull boolean[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int thisSize = $this$plus.length;
        int arraySize = elements.length;
        boolean[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        Intrinsics.checkNotNull(result);
        return result;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] $this$plus, @NotNull char[] elements) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int thisSize = $this$plus.length;
        int arraySize = elements.length;
        char[] result = Arrays.copyOf($this$plus, thisSize + arraySize);
        System.arraycopy(elements, 0, result, thisSize, arraySize);
        Intrinsics.checkNotNull(result);
        return result;
    }

    @InlineOnly
    private static final <T> T[] plusElement(T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T[]) ArraysKt.plus(tArr, t);
    }

    public static final void sort(@NotNull int[] $this$sort) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        if ($this$sort.length > 1) {
            Arrays.sort($this$sort);
        }
    }

    public static final void sort(@NotNull long[] $this$sort) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        if ($this$sort.length > 1) {
            Arrays.sort($this$sort);
        }
    }

    public static final void sort(@NotNull byte[] $this$sort) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        if ($this$sort.length > 1) {
            Arrays.sort($this$sort);
        }
    }

    public static final void sort(@NotNull short[] $this$sort) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        if ($this$sort.length > 1) {
            Arrays.sort($this$sort);
        }
    }

    public static final void sort(@NotNull double[] $this$sort) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        if ($this$sort.length > 1) {
            Arrays.sort($this$sort);
        }
    }

    public static final void sort(@NotNull float[] $this$sort) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        if ($this$sort.length > 1) {
            Arrays.sort($this$sort);
        }
    }

    public static final void sort(@NotNull char[] $this$sort) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        if ($this$sort.length > 1) {
            Arrays.sort($this$sort);
        }
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> void sort(T[] $this$sort) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        ArraysKt.sort((Object[]) $this$sort);
    }

    public static final <T> void sort(@NotNull T[] $this$sort) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        if ($this$sort.length > 1) {
            Arrays.sort($this$sort);
        }
    }

    public static /* synthetic */ void sort$default(Comparable[] comparableArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = comparableArr.length;
        }
        ArraysKt.sort(comparableArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> void sort(@NotNull T[] $this$sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Arrays.sort($this$sort, fromIndex, toIndex);
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        ArraysKt.sort(bArr, i, i2);
    }

    public static final void sort(@NotNull byte[] $this$sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Arrays.sort($this$sort, fromIndex, toIndex);
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = sArr.length;
        }
        ArraysKt.sort(sArr, i, i2);
    }

    public static final void sort(@NotNull short[] $this$sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Arrays.sort($this$sort, fromIndex, toIndex);
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iArr.length;
        }
        ArraysKt.sort(iArr, i, i2);
    }

    public static final void sort(@NotNull int[] $this$sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Arrays.sort($this$sort, fromIndex, toIndex);
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jArr.length;
        }
        ArraysKt.sort(jArr, i, i2);
    }

    public static final void sort(@NotNull long[] $this$sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Arrays.sort($this$sort, fromIndex, toIndex);
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fArr.length;
        }
        ArraysKt.sort(fArr, i, i2);
    }

    public static final void sort(@NotNull float[] $this$sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Arrays.sort($this$sort, fromIndex, toIndex);
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dArr.length;
        }
        ArraysKt.sort(dArr, i, i2);
    }

    public static final void sort(@NotNull double[] $this$sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Arrays.sort($this$sort, fromIndex, toIndex);
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        ArraysKt.sort(cArr, i, i2);
    }

    public static final void sort(@NotNull char[] $this$sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Arrays.sort($this$sort, fromIndex, toIndex);
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = objArr.length;
        }
        ArraysKt.sort(objArr, i, i2);
    }

    public static final <T> void sort(@NotNull T[] $this$sort, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$sort, "<this>");
        Arrays.sort($this$sort, fromIndex, toIndex);
    }

    public static final <T> void sortWith(@NotNull T[] $this$sortWith, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$sortWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if ($this$sortWith.length > 1) {
            Arrays.sort($this$sortWith, comparator);
        }
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        ArraysKt.sortWith(objArr, comparator, i, i2);
    }

    public static final <T> void sortWith(@NotNull T[] $this$sortWith, @NotNull Comparator<? super T> comparator, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter($this$sortWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort($this$sortWith, fromIndex, toIndex, comparator);
    }

    @NotNull
    public static final Byte[] toTypedArray(@NotNull byte[] $this$toTypedArray) {
        Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
        Byte[] result = new Byte[$this$toTypedArray.length];
        int length = $this$toTypedArray.length;
        for (int index = 0; index < length; index++) {
            result[index] = Byte.valueOf($this$toTypedArray[index]);
        }
        return result;
    }

    @NotNull
    public static final Short[] toTypedArray(@NotNull short[] $this$toTypedArray) {
        Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
        Short[] result = new Short[$this$toTypedArray.length];
        int length = $this$toTypedArray.length;
        for (int index = 0; index < length; index++) {
            result[index] = Short.valueOf($this$toTypedArray[index]);
        }
        return result;
    }

    @NotNull
    public static final Integer[] toTypedArray(@NotNull int[] $this$toTypedArray) {
        Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
        Integer[] result = new Integer[$this$toTypedArray.length];
        int length = $this$toTypedArray.length;
        for (int index = 0; index < length; index++) {
            result[index] = Integer.valueOf($this$toTypedArray[index]);
        }
        return result;
    }

    @NotNull
    public static final Long[] toTypedArray(@NotNull long[] $this$toTypedArray) {
        Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
        Long[] result = new Long[$this$toTypedArray.length];
        int length = $this$toTypedArray.length;
        for (int index = 0; index < length; index++) {
            result[index] = Long.valueOf($this$toTypedArray[index]);
        }
        return result;
    }

    @NotNull
    public static final Float[] toTypedArray(@NotNull float[] $this$toTypedArray) {
        Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
        Float[] result = new Float[$this$toTypedArray.length];
        int length = $this$toTypedArray.length;
        for (int index = 0; index < length; index++) {
            result[index] = Float.valueOf($this$toTypedArray[index]);
        }
        return result;
    }

    @NotNull
    public static final Double[] toTypedArray(@NotNull double[] $this$toTypedArray) {
        Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
        Double[] result = new Double[$this$toTypedArray.length];
        int length = $this$toTypedArray.length;
        for (int index = 0; index < length; index++) {
            result[index] = Double.valueOf($this$toTypedArray[index]);
        }
        return result;
    }

    @NotNull
    public static final Boolean[] toTypedArray(@NotNull boolean[] $this$toTypedArray) {
        Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
        Boolean[] result = new Boolean[$this$toTypedArray.length];
        int length = $this$toTypedArray.length;
        for (int index = 0; index < length; index++) {
            result[index] = Boolean.valueOf($this$toTypedArray[index]);
        }
        return result;
    }

    @NotNull
    public static final Character[] toTypedArray(@NotNull char[] $this$toTypedArray) {
        Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
        Character[] result = new Character[$this$toTypedArray.length];
        int length = $this$toTypedArray.length;
        for (int index = 0; index < length; index++) {
            result[index] = Character.valueOf($this$toTypedArray[index]);
        }
        return result;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull T[] $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet) ArraysKt.toCollection($this$toSortedSet, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Byte> toSortedSet(@NotNull byte[] $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet) ArraysKt.toCollection($this$toSortedSet, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Short> toSortedSet(@NotNull short[] $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet) ArraysKt.toCollection($this$toSortedSet, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Integer> toSortedSet(@NotNull int[] $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet) ArraysKt.toCollection($this$toSortedSet, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Long> toSortedSet(@NotNull long[] $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet) ArraysKt.toCollection($this$toSortedSet, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Float> toSortedSet(@NotNull float[] $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet) ArraysKt.toCollection($this$toSortedSet, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Double> toSortedSet(@NotNull double[] $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet) ArraysKt.toCollection($this$toSortedSet, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Boolean> toSortedSet(@NotNull boolean[] $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet) ArraysKt.toCollection($this$toSortedSet, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Character> toSortedSet(@NotNull char[] $this$toSortedSet) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        return (SortedSet) ArraysKt.toCollection($this$toSortedSet, new TreeSet());
    }

    @NotNull
    public static final <T> SortedSet<T> toSortedSet(@NotNull T[] $this$toSortedSet, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter($this$toSortedSet, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) ArraysKt.toCollection($this$toSortedSet, new TreeSet(comparator));
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Double max(Double[] $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return ArraysKt.maxOrNull($this$max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Float max(Float[] $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return ArraysKt.maxOrNull($this$max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Comparable max(Comparable[] $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return ArraysKt.maxOrNull($this$max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Byte max(byte[] $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return ArraysKt.maxOrNull($this$max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Short max(short[] $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return ArraysKt.maxOrNull($this$max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Integer max(int[] $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return ArraysKt.maxOrNull($this$max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Long max(long[] $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return ArraysKt.maxOrNull($this$max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Float max(float[] $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return ArraysKt.maxOrNull($this$max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Double max(double[] $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return ArraysKt.maxOrNull($this$max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Character max(char[] $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        return ArraysKt.maxOrNull($this$max);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(T[] $this$maxBy, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxBy.length == 0) {
            return null;
        }
        T t = $this$maxBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
        if (lastIndex$iv == 0) {
            return t;
        }
        Comparable maxValue$iv = selector.invoke(t);
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                T t2 = $this$maxBy[i$iv];
                R rInvoke = selector.invoke(t2);
                if (maxValue$iv.compareTo(rInvoke) < 0) {
                    t = t2;
                    maxValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return t;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte maxBy(byte[] $this$maxBy, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxBy.length == 0) {
            return null;
        }
        byte maxElem$iv = $this$maxBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
        if (lastIndex$iv == 0) {
            return Byte.valueOf(maxElem$iv);
        }
        Comparable maxValue$iv = selector.invoke(Byte.valueOf(maxElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                byte e$iv = $this$maxBy[i$iv];
                R rInvoke = selector.invoke(Byte.valueOf(e$iv));
                if (maxValue$iv.compareTo(rInvoke) < 0) {
                    maxElem$iv = e$iv;
                    maxValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Byte.valueOf(maxElem$iv);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short maxBy(short[] $this$maxBy, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxBy.length == 0) {
            return null;
        }
        short maxElem$iv = $this$maxBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
        if (lastIndex$iv == 0) {
            return Short.valueOf(maxElem$iv);
        }
        Comparable maxValue$iv = selector.invoke(Short.valueOf(maxElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                short e$iv = $this$maxBy[i$iv];
                R rInvoke = selector.invoke(Short.valueOf(e$iv));
                if (maxValue$iv.compareTo(rInvoke) < 0) {
                    maxElem$iv = e$iv;
                    maxValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Short.valueOf(maxElem$iv);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer maxBy(int[] $this$maxBy, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxBy.length == 0) {
            return null;
        }
        int maxElem$iv = $this$maxBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
        if (lastIndex$iv == 0) {
            return Integer.valueOf(maxElem$iv);
        }
        Comparable maxValue$iv = selector.invoke(Integer.valueOf(maxElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                int e$iv = $this$maxBy[i$iv];
                R rInvoke = selector.invoke(Integer.valueOf(e$iv));
                if (maxValue$iv.compareTo(rInvoke) < 0) {
                    maxElem$iv = e$iv;
                    maxValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Integer.valueOf(maxElem$iv);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long maxBy(long[] $this$maxBy, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxBy.length == 0) {
            return null;
        }
        long maxElem$iv = $this$maxBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
        if (lastIndex$iv == 0) {
            return Long.valueOf(maxElem$iv);
        }
        Comparable maxValue$iv = selector.invoke(Long.valueOf(maxElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                long e$iv = $this$maxBy[i$iv];
                R rInvoke = selector.invoke(Long.valueOf(e$iv));
                if (maxValue$iv.compareTo(rInvoke) < 0) {
                    maxElem$iv = e$iv;
                    maxValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Long.valueOf(maxElem$iv);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float maxBy(float[] $this$maxBy, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxBy.length == 0) {
            return null;
        }
        float maxElem$iv = $this$maxBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
        if (lastIndex$iv == 0) {
            return Float.valueOf(maxElem$iv);
        }
        Comparable maxValue$iv = selector.invoke(Float.valueOf(maxElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                float e$iv = $this$maxBy[i$iv];
                R rInvoke = selector.invoke(Float.valueOf(e$iv));
                if (maxValue$iv.compareTo(rInvoke) < 0) {
                    maxElem$iv = e$iv;
                    maxValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Float.valueOf(maxElem$iv);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double maxBy(double[] $this$maxBy, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxBy.length == 0) {
            return null;
        }
        double maxElem$iv = $this$maxBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
        if (lastIndex$iv == 0) {
            return Double.valueOf(maxElem$iv);
        }
        Comparable maxValue$iv = selector.invoke(Double.valueOf(maxElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                double e$iv = $this$maxBy[i$iv];
                R rInvoke = selector.invoke(Double.valueOf(e$iv));
                if (maxValue$iv.compareTo(rInvoke) < 0) {
                    maxElem$iv = e$iv;
                    maxValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Double.valueOf(maxElem$iv);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean maxBy(boolean[] $this$maxBy, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxBy.length == 0) {
            return null;
        }
        boolean maxElem$iv = $this$maxBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
        if (lastIndex$iv == 0) {
            return Boolean.valueOf(maxElem$iv);
        }
        Comparable maxValue$iv = selector.invoke(Boolean.valueOf(maxElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                boolean e$iv = $this$maxBy[i$iv];
                R rInvoke = selector.invoke(Boolean.valueOf(e$iv));
                if (maxValue$iv.compareTo(rInvoke) < 0) {
                    maxElem$iv = e$iv;
                    maxValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Boolean.valueOf(maxElem$iv);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(char[] $this$maxBy, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxBy.length == 0) {
            return null;
        }
        char maxElem$iv = $this$maxBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$maxBy);
        if (lastIndex$iv == 0) {
            return Character.valueOf(maxElem$iv);
        }
        Comparable maxValue$iv = selector.invoke(Character.valueOf(maxElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                char e$iv = $this$maxBy[i$iv];
                R rInvoke = selector.invoke(Character.valueOf(e$iv));
                if (maxValue$iv.compareTo(rInvoke) < 0) {
                    maxElem$iv = e$iv;
                    maxValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Character.valueOf(maxElem$iv);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Object maxWith(Object[] $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.maxWithOrNull($this$maxWith, comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Byte maxWith(byte[] $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.maxWithOrNull($this$maxWith, (Comparator<? super Byte>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Short maxWith(short[] $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.maxWithOrNull($this$maxWith, (Comparator<? super Short>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Integer maxWith(int[] $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.maxWithOrNull($this$maxWith, (Comparator<? super Integer>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Long maxWith(long[] $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.maxWithOrNull($this$maxWith, (Comparator<? super Long>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Float maxWith(float[] $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.maxWithOrNull($this$maxWith, (Comparator<? super Float>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Double maxWith(double[] $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.maxWithOrNull($this$maxWith, (Comparator<? super Double>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Boolean maxWith(boolean[] $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.maxWithOrNull($this$maxWith, (Comparator<? super Boolean>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Character maxWith(char[] $this$maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.maxWithOrNull($this$maxWith, (Comparator<? super Character>) comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Double min(Double[] $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return ArraysKt.minOrNull($this$min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Float min(Float[] $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return ArraysKt.minOrNull($this$min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Comparable min(Comparable[] $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return ArraysKt.minOrNull($this$min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Byte min(byte[] $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return ArraysKt.minOrNull($this$min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Short min(short[] $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return ArraysKt.minOrNull($this$min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Integer min(int[] $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return ArraysKt.minOrNull($this$min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Long min(long[] $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return ArraysKt.minOrNull($this$min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Float min(float[] $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return ArraysKt.minOrNull($this$min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Double min(double[] $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return ArraysKt.minOrNull($this$min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Character min(char[] $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        return ArraysKt.minOrNull($this$min);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(T[] $this$minBy, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minBy.length == 0) {
            return null;
        }
        T t = $this$minBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
        if (lastIndex$iv == 0) {
            return t;
        }
        Comparable minValue$iv = selector.invoke(t);
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                T t2 = $this$minBy[i$iv];
                R rInvoke = selector.invoke(t2);
                if (minValue$iv.compareTo(rInvoke) > 0) {
                    t = t2;
                    minValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return t;
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte minBy(byte[] $this$minBy, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minBy.length == 0) {
            return null;
        }
        byte minElem$iv = $this$minBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
        if (lastIndex$iv == 0) {
            return Byte.valueOf(minElem$iv);
        }
        Comparable minValue$iv = selector.invoke(Byte.valueOf(minElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                byte e$iv = $this$minBy[i$iv];
                R rInvoke = selector.invoke(Byte.valueOf(e$iv));
                if (minValue$iv.compareTo(rInvoke) > 0) {
                    minElem$iv = e$iv;
                    minValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Byte.valueOf(minElem$iv);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short minBy(short[] $this$minBy, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minBy.length == 0) {
            return null;
        }
        short minElem$iv = $this$minBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
        if (lastIndex$iv == 0) {
            return Short.valueOf(minElem$iv);
        }
        Comparable minValue$iv = selector.invoke(Short.valueOf(minElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                short e$iv = $this$minBy[i$iv];
                R rInvoke = selector.invoke(Short.valueOf(e$iv));
                if (minValue$iv.compareTo(rInvoke) > 0) {
                    minElem$iv = e$iv;
                    minValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Short.valueOf(minElem$iv);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer minBy(int[] $this$minBy, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minBy.length == 0) {
            return null;
        }
        int minElem$iv = $this$minBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
        if (lastIndex$iv == 0) {
            return Integer.valueOf(minElem$iv);
        }
        Comparable minValue$iv = selector.invoke(Integer.valueOf(minElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                int e$iv = $this$minBy[i$iv];
                R rInvoke = selector.invoke(Integer.valueOf(e$iv));
                if (minValue$iv.compareTo(rInvoke) > 0) {
                    minElem$iv = e$iv;
                    minValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Integer.valueOf(minElem$iv);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long minBy(long[] $this$minBy, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minBy.length == 0) {
            return null;
        }
        long minElem$iv = $this$minBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
        if (lastIndex$iv == 0) {
            return Long.valueOf(minElem$iv);
        }
        Comparable minValue$iv = selector.invoke(Long.valueOf(minElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                long e$iv = $this$minBy[i$iv];
                R rInvoke = selector.invoke(Long.valueOf(e$iv));
                if (minValue$iv.compareTo(rInvoke) > 0) {
                    minElem$iv = e$iv;
                    minValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Long.valueOf(minElem$iv);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float minBy(float[] $this$minBy, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minBy.length == 0) {
            return null;
        }
        float minElem$iv = $this$minBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
        if (lastIndex$iv == 0) {
            return Float.valueOf(minElem$iv);
        }
        Comparable minValue$iv = selector.invoke(Float.valueOf(minElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                float e$iv = $this$minBy[i$iv];
                R rInvoke = selector.invoke(Float.valueOf(e$iv));
                if (minValue$iv.compareTo(rInvoke) > 0) {
                    minElem$iv = e$iv;
                    minValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Float.valueOf(minElem$iv);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double minBy(double[] $this$minBy, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minBy.length == 0) {
            return null;
        }
        double minElem$iv = $this$minBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
        if (lastIndex$iv == 0) {
            return Double.valueOf(minElem$iv);
        }
        Comparable minValue$iv = selector.invoke(Double.valueOf(minElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                double e$iv = $this$minBy[i$iv];
                R rInvoke = selector.invoke(Double.valueOf(e$iv));
                if (minValue$iv.compareTo(rInvoke) > 0) {
                    minElem$iv = e$iv;
                    minValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Double.valueOf(minElem$iv);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean minBy(boolean[] $this$minBy, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minBy.length == 0) {
            return null;
        }
        boolean minElem$iv = $this$minBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
        if (lastIndex$iv == 0) {
            return Boolean.valueOf(minElem$iv);
        }
        Comparable minValue$iv = selector.invoke(Boolean.valueOf(minElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                boolean e$iv = $this$minBy[i$iv];
                R rInvoke = selector.invoke(Boolean.valueOf(e$iv));
                if (minValue$iv.compareTo(rInvoke) > 0) {
                    minElem$iv = e$iv;
                    minValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Boolean.valueOf(minElem$iv);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(char[] $this$minBy, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minBy.length == 0) {
            return null;
        }
        char minElem$iv = $this$minBy[0];
        int lastIndex$iv = ArraysKt.getLastIndex($this$minBy);
        if (lastIndex$iv == 0) {
            return Character.valueOf(minElem$iv);
        }
        Comparable minValue$iv = selector.invoke(Character.valueOf(minElem$iv));
        int i$iv = 1;
        if (1 <= lastIndex$iv) {
            while (true) {
                char e$iv = $this$minBy[i$iv];
                R rInvoke = selector.invoke(Character.valueOf(e$iv));
                if (minValue$iv.compareTo(rInvoke) > 0) {
                    minElem$iv = e$iv;
                    minValue$iv = rInvoke;
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return Character.valueOf(minElem$iv);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Object minWith(Object[] $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.minWithOrNull($this$minWith, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Byte minWith(byte[] $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.minWithOrNull($this$minWith, (Comparator<? super Byte>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Short minWith(short[] $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.minWithOrNull($this$minWith, (Comparator<? super Short>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Integer minWith(int[] $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.minWithOrNull($this$minWith, (Comparator<? super Integer>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Long minWith(long[] $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.minWithOrNull($this$minWith, (Comparator<? super Long>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Float minWith(float[] $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.minWithOrNull($this$minWith, (Comparator<? super Float>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Double minWith(double[] $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.minWithOrNull($this$minWith, (Comparator<? super Double>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Boolean minWith(boolean[] $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.minWithOrNull($this$minWith, (Comparator<? super Boolean>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public static final /* synthetic */ Character minWith(char[] $this$minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt.minWithOrNull($this$minWith, (Comparator<? super Character>) comparator);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigDecimal")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigDecimal sumOfBigDecimal(T[] $this$sumOf, Function1<? super T, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal sum = bigDecimalValueOf;
        for (T t : $this$sumOf) {
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(t));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigDecimal")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(byte[] $this$sumOf, Function1<? super Byte, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal sum = bigDecimalValueOf;
        for (byte element : $this$sumOf) {
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(Byte.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigDecimal")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(short[] $this$sumOf, Function1<? super Short, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal sum = bigDecimalValueOf;
        for (short element : $this$sumOf) {
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(Short.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigDecimal")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(int[] $this$sumOf, Function1<? super Integer, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal sum = bigDecimalValueOf;
        for (int element : $this$sumOf) {
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(Integer.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigDecimal")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(long[] $this$sumOf, Function1<? super Long, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal sum = bigDecimalValueOf;
        for (long element : $this$sumOf) {
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(Long.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigDecimal")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(float[] $this$sumOf, Function1<? super Float, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal sum = bigDecimalValueOf;
        for (float element : $this$sumOf) {
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(Float.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigDecimal")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(double[] $this$sumOf, Function1<? super Double, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal sum = bigDecimalValueOf;
        for (double element : $this$sumOf) {
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(Double.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigDecimal")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(boolean[] $this$sumOf, Function1<? super Boolean, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal sum = bigDecimalValueOf;
        for (boolean element : $this$sumOf) {
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(Boolean.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigDecimal")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(char[] $this$sumOf, Function1<? super Character, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal sum = bigDecimalValueOf;
        for (char element : $this$sumOf) {
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(Character.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigInteger")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigInteger sumOfBigInteger(T[] $this$sumOf, Function1<? super T, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger sum = bigIntegerValueOf;
        for (T t : $this$sumOf) {
            BigInteger bigIntegerAdd = sum.add(selector.invoke(t));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigInteger")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(byte[] $this$sumOf, Function1<? super Byte, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger sum = bigIntegerValueOf;
        for (byte element : $this$sumOf) {
            BigInteger bigIntegerAdd = sum.add(selector.invoke(Byte.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigInteger")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(short[] $this$sumOf, Function1<? super Short, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger sum = bigIntegerValueOf;
        for (short element : $this$sumOf) {
            BigInteger bigIntegerAdd = sum.add(selector.invoke(Short.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigInteger")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(int[] $this$sumOf, Function1<? super Integer, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger sum = bigIntegerValueOf;
        for (int element : $this$sumOf) {
            BigInteger bigIntegerAdd = sum.add(selector.invoke(Integer.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigInteger")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(long[] $this$sumOf, Function1<? super Long, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger sum = bigIntegerValueOf;
        for (long element : $this$sumOf) {
            BigInteger bigIntegerAdd = sum.add(selector.invoke(Long.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigInteger")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(float[] $this$sumOf, Function1<? super Float, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger sum = bigIntegerValueOf;
        for (float element : $this$sumOf) {
            BigInteger bigIntegerAdd = sum.add(selector.invoke(Float.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigInteger")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(double[] $this$sumOf, Function1<? super Double, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger sum = bigIntegerValueOf;
        for (double element : $this$sumOf) {
            BigInteger bigIntegerAdd = sum.add(selector.invoke(Double.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigInteger")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(boolean[] $this$sumOf, Function1<? super Boolean, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger sum = bigIntegerValueOf;
        for (boolean element : $this$sumOf) {
            BigInteger bigIntegerAdd = sum.add(selector.invoke(Boolean.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfBigInteger")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(char[] $this$sumOf, Function1<? super Character, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger sum = bigIntegerValueOf;
        for (char element : $this$sumOf) {
            BigInteger bigIntegerAdd = sum.add(selector.invoke(Character.valueOf(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }
}
