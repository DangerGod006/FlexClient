package kotlin.text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.uuid.Uuid;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Strings.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/StringsKt___StringsKt.class */
public class StringsKt___StringsKt extends StringsKt___StringsJvmKt {
    @InlineOnly
    private static final char elementAtOrElse(CharSequence $this$elementAtOrElse, int index, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter($this$elementAtOrElse, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < $this$elementAtOrElse.length();
        return z ? $this$elementAtOrElse.charAt(index) : defaultValue.invoke(Integer.valueOf(index)).charValue();
    }

    @InlineOnly
    private static final Character elementAtOrNull(CharSequence $this$elementAtOrNull, int index) {
        Intrinsics.checkNotNullParameter($this$elementAtOrNull, "<this>");
        return StringsKt.getOrNull($this$elementAtOrNull, index);
    }

    @InlineOnly
    private static final Character find(CharSequence $this$find, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$find, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < $this$find.length(); i++) {
            char element$iv = $this$find.charAt(i);
            if (predicate.invoke(Character.valueOf(element$iv)).booleanValue()) {
                return Character.valueOf(element$iv);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Character findLast(CharSequence $this$findLast, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$findLast, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = $this$findLast.length() - 1;
        if (0 <= length) {
            do {
                int index$iv = length;
                length--;
                char element$iv = $this$findLast.charAt(index$iv);
                if (predicate.invoke(Character.valueOf(element$iv)).booleanValue()) {
                    return Character.valueOf(element$iv);
                }
            } while (0 <= length);
        }
        return null;
    }

    public static final char first(@NotNull CharSequence $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return $this$first.charAt(0);
    }

    public static final char first(@NotNull CharSequence $this$first, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < $this$first.length(); i++) {
            char element = $this$first.charAt(i);
            if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                return element;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <R> R firstNotNullOf(CharSequence $this$firstNotNullOf, Function1<? super Character, ? extends R> transform) {
        R rInvoke;
        Intrinsics.checkNotNullParameter($this$firstNotNullOf, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i = 0;
        while (true) {
            if (i >= $this$firstNotNullOf.length()) {
                rInvoke = null;
                break;
            }
            rInvoke = transform.invoke(Character.valueOf($this$firstNotNullOf.charAt(i)));
            if (rInvoke != null) {
                break;
            }
            i++;
        }
        if (rInvoke == null) {
            throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <R> R firstNotNullOfOrNull(CharSequence $this$firstNotNullOfOrNull, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$firstNotNullOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < $this$firstNotNullOfOrNull.length(); i++) {
            char element = $this$firstNotNullOfOrNull.charAt(i);
            R rInvoke = transform.invoke(Character.valueOf(element));
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        if ($this$firstOrNull.length() == 0) {
            return null;
        }
        return Character.valueOf($this$firstOrNull.charAt(0));
    }

    @Nullable
    public static final Character firstOrNull(@NotNull CharSequence $this$firstOrNull, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < $this$firstOrNull.length(); i++) {
            char element = $this$firstOrNull.charAt(i);
            if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                return Character.valueOf(element);
            }
        }
        return null;
    }

    @InlineOnly
    private static final char getOrElse(CharSequence $this$getOrElse, int index, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrElse, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = 0 <= index && index < $this$getOrElse.length();
        return z ? $this$getOrElse.charAt(index) : defaultValue.invoke(Integer.valueOf(index)).charValue();
    }

    @Nullable
    public static final Character getOrNull(@NotNull CharSequence $this$getOrNull, int index) {
        Intrinsics.checkNotNullParameter($this$getOrNull, "<this>");
        boolean z = 0 <= index && index < $this$getOrNull.length();
        if (z) {
            return Character.valueOf($this$getOrNull.charAt(index));
        }
        return null;
    }

    public static final int indexOfFirst(@NotNull CharSequence $this$indexOfFirst, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$indexOfFirst, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = $this$indexOfFirst.length();
        for (int index = 0; index < length; index++) {
            if (predicate.invoke(Character.valueOf($this$indexOfFirst.charAt(index))).booleanValue()) {
                return index;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull CharSequence $this$indexOfLast, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$indexOfLast, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = $this$indexOfLast.length() - 1;
        if (0 <= length) {
            do {
                int index = length;
                length--;
                if (predicate.invoke(Character.valueOf($this$indexOfLast.charAt(index))).booleanValue()) {
                    return index;
                }
            } while (0 <= length);
            return -1;
        }
        return -1;
    }

    public static final char last(@NotNull CharSequence $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return $this$last.charAt(StringsKt.getLastIndex($this$last));
    }

    public static final char last(@NotNull CharSequence $this$last, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = $this$last.length() - 1;
        if (0 <= length) {
            do {
                int index = length;
                length--;
                char element = $this$last.charAt(index);
                if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                    return element;
                }
            } while (0 <= length);
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        if ($this$lastOrNull.length() == 0) {
            return null;
        }
        return Character.valueOf($this$lastOrNull.charAt($this$lastOrNull.length() - 1));
    }

    @Nullable
    public static final Character lastOrNull(@NotNull CharSequence $this$lastOrNull, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = $this$lastOrNull.length() - 1;
        if (0 <= length) {
            do {
                int index = length;
                length--;
                char element = $this$lastOrNull.charAt(index);
                if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                    return Character.valueOf(element);
                }
            } while (0 <= length);
            return null;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharSequence $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return StringsKt.random($this$random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull CharSequence $this$random, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$random.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return $this$random.charAt(random.nextInt($this$random.length()));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Character randomOrNull(CharSequence $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return StringsKt.randomOrNull($this$randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character randomOrNull(@NotNull CharSequence $this$randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.length() == 0) {
            return null;
        }
        return Character.valueOf($this$randomOrNull.charAt(random.nextInt($this$randomOrNull.length())));
    }

    public static final char single(@NotNull CharSequence $this$single) {
        Intrinsics.checkNotNullParameter($this$single, "<this>");
        switch ($this$single.length()) {
            case 0:
                throw new NoSuchElementException("Char sequence is empty.");
            case 1:
                return $this$single.charAt(0);
            default:
                throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    public static final char single(@NotNull CharSequence $this$single, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$single, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character single = null;
        boolean found = false;
        for (int i = 0; i < $this$single.length(); i++) {
            char element = $this$single.charAt(i);
            if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                if (found) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                single = Character.valueOf(element);
                found = true;
            }
        }
        if (!found) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        Character ch = single;
        Intrinsics.checkNotNull(ch, "null cannot be cast to non-null type kotlin.Char");
        return ch.charValue();
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence $this$singleOrNull) {
        Intrinsics.checkNotNullParameter($this$singleOrNull, "<this>");
        if ($this$singleOrNull.length() == 1) {
            return Character.valueOf($this$singleOrNull.charAt(0));
        }
        return null;
    }

    @Nullable
    public static final Character singleOrNull(@NotNull CharSequence $this$singleOrNull, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$singleOrNull, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character single = null;
        boolean found = false;
        for (int i = 0; i < $this$singleOrNull.length(); i++) {
            char element = $this$singleOrNull.charAt(i);
            if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                if (found) {
                    return null;
                }
                single = Character.valueOf(element);
                found = true;
            }
        }
        if (found) {
            return single;
        }
        return null;
    }

    @NotNull
    public static final CharSequence drop(@NotNull CharSequence $this$drop, int n) {
        Intrinsics.checkNotNullParameter($this$drop, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        return $this$drop.subSequence(RangesKt.coerceAtMost(n, $this$drop.length()), $this$drop.length());
    }

    @NotNull
    public static final String drop(@NotNull String $this$drop, int n) {
        Intrinsics.checkNotNullParameter($this$drop, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        String strSubstring = $this$drop.substring(RangesKt.coerceAtMost(n, $this$drop.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final CharSequence dropLast(@NotNull CharSequence $this$dropLast, int n) {
        Intrinsics.checkNotNullParameter($this$dropLast, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        return StringsKt.take($this$dropLast, RangesKt.coerceAtLeast($this$dropLast.length() - n, 0));
    }

    @NotNull
    public static final String dropLast(@NotNull String $this$dropLast, int n) {
        Intrinsics.checkNotNullParameter($this$dropLast, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        return StringsKt.take($this$dropLast, RangesKt.coerceAtLeast($this$dropLast.length() - n, 0));
    }

    @NotNull
    public static final CharSequence dropLastWhile(@NotNull CharSequence $this$dropLastWhile, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$dropLastWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = StringsKt.getLastIndex($this$dropLastWhile); -1 < index; index--) {
            if (!predicate.invoke(Character.valueOf($this$dropLastWhile.charAt(index))).booleanValue()) {
                return $this$dropLastWhile.subSequence(0, index + 1);
            }
        }
        return "";
    }

    @NotNull
    public static final String dropLastWhile(@NotNull String $this$dropLastWhile, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$dropLastWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = StringsKt.getLastIndex($this$dropLastWhile); -1 < index; index--) {
            if (!predicate.invoke(Character.valueOf($this$dropLastWhile.charAt(index))).booleanValue()) {
                String strSubstring = $this$dropLastWhile.substring(0, index + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence dropWhile(@NotNull CharSequence $this$dropWhile, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$dropWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = $this$dropWhile.length();
        for (int index = 0; index < length; index++) {
            if (!predicate.invoke(Character.valueOf($this$dropWhile.charAt(index))).booleanValue()) {
                return $this$dropWhile.subSequence(index, $this$dropWhile.length());
            }
        }
        return "";
    }

    @NotNull
    public static final String dropWhile(@NotNull String $this$dropWhile, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$dropWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = $this$dropWhile.length();
        for (int index = 0; index < length; index++) {
            if (!predicate.invoke(Character.valueOf($this$dropWhile.charAt(index))).booleanValue()) {
                String strSubstring = $this$dropWhile.substring(index);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence filter(@NotNull CharSequence $this$filter, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter($this$filter, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Appendable destination$iv = new StringBuilder();
        int length = $this$filter.length();
        for (int index$iv = 0; index$iv < length; index$iv++) {
            char element$iv = $this$filter.charAt(index$iv);
            if (predicate.invoke(Character.valueOf(element$iv)).booleanValue()) {
                destination$iv.append(element$iv);
            }
        }
        return (CharSequence) destination$iv;
    }

    @NotNull
    public static final String filter(@NotNull String $this$filter, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter($this$filter, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String $this$filterTo$iv = $this$filter;
        Appendable destination$iv = new StringBuilder();
        int length = $this$filterTo$iv.length();
        for (int index$iv = 0; index$iv < length; index$iv++) {
            char element$iv = $this$filterTo$iv.charAt(index$iv);
            if (predicate.invoke(Character.valueOf(element$iv)).booleanValue()) {
                destination$iv.append(element$iv);
            }
        }
        return ((StringBuilder) destination$iv).toString();
    }

    @NotNull
    public static final CharSequence filterIndexed(@NotNull CharSequence $this$filterIndexed, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter($this$filterIndexed, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Appendable destination$iv = new StringBuilder();
        int index$iv$iv = 0;
        for (int i = 0; i < $this$filterIndexed.length(); i++) {
            char item$iv$iv = $this$filterIndexed.charAt(i);
            int index$iv = index$iv$iv;
            index$iv$iv++;
            if (predicate.invoke(Integer.valueOf(index$iv), Character.valueOf(item$iv$iv)).booleanValue()) {
                destination$iv.append(item$iv$iv);
            }
        }
        return (CharSequence) destination$iv;
    }

    @NotNull
    public static final String filterIndexed(@NotNull String $this$filterIndexed, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter($this$filterIndexed, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String $this$filterIndexedTo$iv = $this$filterIndexed;
        Appendable destination$iv = new StringBuilder();
        int index$iv$iv = 0;
        for (int i = 0; i < $this$filterIndexedTo$iv.length(); i++) {
            char item$iv$iv = $this$filterIndexedTo$iv.charAt(i);
            int index$iv = index$iv$iv;
            index$iv$iv++;
            if (predicate.invoke(Integer.valueOf(index$iv), Character.valueOf(item$iv$iv)).booleanValue()) {
                destination$iv.append(item$iv$iv);
            }
        }
        return ((StringBuilder) destination$iv).toString();
    }

    @NotNull
    public static final <C extends Appendable> C filterIndexedTo(@NotNull CharSequence $this$filterIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter($this$filterIndexedTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int index$iv = 0;
        for (int i = 0; i < $this$filterIndexedTo.length(); i++) {
            char item$iv = $this$filterIndexedTo.charAt(i);
            int index = index$iv;
            index$iv++;
            if (predicate.invoke(Integer.valueOf(index), Character.valueOf(item$iv)).booleanValue()) {
                destination.append(item$iv);
            }
        }
        return destination;
    }

    @NotNull
    public static final CharSequence filterNot(@NotNull CharSequence $this$filterNot, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Appendable destination$iv = new StringBuilder();
        for (int i = 0; i < $this$filterNot.length(); i++) {
            char element$iv = $this$filterNot.charAt(i);
            if (!predicate.invoke(Character.valueOf(element$iv)).booleanValue()) {
                destination$iv.append(element$iv);
            }
        }
        return (CharSequence) destination$iv;
    }

    @NotNull
    public static final String filterNot(@NotNull String $this$filterNot, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        String $this$filterNotTo$iv = $this$filterNot;
        Appendable destination$iv = new StringBuilder();
        for (int i = 0; i < $this$filterNotTo$iv.length(); i++) {
            char element$iv = $this$filterNotTo$iv.charAt(i);
            if (!predicate.invoke(Character.valueOf(element$iv)).booleanValue()) {
                destination$iv.append(element$iv);
            }
        }
        return ((StringBuilder) destination$iv).toString();
    }

    @NotNull
    public static final <C extends Appendable> C filterNotTo(@NotNull CharSequence $this$filterNotTo, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter($this$filterNotTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < $this$filterNotTo.length(); i++) {
            char element = $this$filterNotTo.charAt(i);
            if (!predicate.invoke(Character.valueOf(element)).booleanValue()) {
                destination.append(element);
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Appendable> C filterTo(@NotNull CharSequence $this$filterTo, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter($this$filterTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = $this$filterTo.length();
        for (int index = 0; index < length; index++) {
            char element = $this$filterTo.charAt(index);
            if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                destination.append(element);
            }
        }
        return destination;
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence $this$slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter($this$slice, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt.subSequence($this$slice, indices);
    }

    @NotNull
    public static final String slice(@NotNull String $this$slice, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter($this$slice, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt.substring($this$slice, indices);
    }

    @NotNull
    public static final CharSequence slice(@NotNull CharSequence $this$slice, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter($this$slice, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if (size == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder(size);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int i = it.next().intValue();
            result.append($this$slice.charAt(i));
        }
        return result;
    }

    @InlineOnly
    private static final String slice(String $this$slice, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter($this$slice, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return StringsKt.slice((CharSequence) $this$slice, indices).toString();
    }

    @NotNull
    public static final CharSequence take(@NotNull CharSequence $this$take, int n) {
        Intrinsics.checkNotNullParameter($this$take, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        return $this$take.subSequence(0, RangesKt.coerceAtMost(n, $this$take.length()));
    }

    @NotNull
    public static final String take(@NotNull String $this$take, int n) {
        Intrinsics.checkNotNullParameter($this$take, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        String strSubstring = $this$take.substring(0, RangesKt.coerceAtMost(n, $this$take.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final CharSequence takeLast(@NotNull CharSequence $this$takeLast, int n) {
        Intrinsics.checkNotNullParameter($this$takeLast, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        int length = $this$takeLast.length();
        return $this$takeLast.subSequence(length - RangesKt.coerceAtMost(n, length), length);
    }

    @NotNull
    public static final String takeLast(@NotNull String $this$takeLast, int n) {
        Intrinsics.checkNotNullParameter($this$takeLast, "<this>");
        if (!(n >= 0)) {
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        int length = $this$takeLast.length();
        String strSubstring = $this$takeLast.substring(length - RangesKt.coerceAtMost(n, length));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final CharSequence takeLastWhile(@NotNull CharSequence $this$takeLastWhile, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$takeLastWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = StringsKt.getLastIndex($this$takeLastWhile); -1 < index; index--) {
            if (!predicate.invoke(Character.valueOf($this$takeLastWhile.charAt(index))).booleanValue()) {
                return $this$takeLastWhile.subSequence(index + 1, $this$takeLastWhile.length());
            }
        }
        return $this$takeLastWhile.subSequence(0, $this$takeLastWhile.length());
    }

    @NotNull
    public static final String takeLastWhile(@NotNull String $this$takeLastWhile, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$takeLastWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int index = StringsKt.getLastIndex($this$takeLastWhile); -1 < index; index--) {
            if (!predicate.invoke(Character.valueOf($this$takeLastWhile.charAt(index))).booleanValue()) {
                String strSubstring = $this$takeLastWhile.substring(index + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return $this$takeLastWhile;
    }

    @NotNull
    public static final CharSequence takeWhile(@NotNull CharSequence $this$takeWhile, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$takeWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = $this$takeWhile.length();
        for (int index = 0; index < length; index++) {
            if (!predicate.invoke(Character.valueOf($this$takeWhile.charAt(index))).booleanValue()) {
                return $this$takeWhile.subSequence(0, index);
            }
        }
        return $this$takeWhile.subSequence(0, $this$takeWhile.length());
    }

    @NotNull
    public static final String takeWhile(@NotNull String $this$takeWhile, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$takeWhile, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = $this$takeWhile.length();
        for (int index = 0; index < length; index++) {
            if (!predicate.invoke(Character.valueOf($this$takeWhile.charAt(index))).booleanValue()) {
                String strSubstring = $this$takeWhile.substring(0, index);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return $this$takeWhile;
    }

    @NotNull
    public static final CharSequence reversed(@NotNull CharSequence $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return new StringBuilder($this$reversed).reverse();
    }

    @InlineOnly
    private static final String reversed(String $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return StringsKt.reversed((CharSequence) $this$reversed).toString();
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull CharSequence $this$associate, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter($this$associate, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity($this$associate.length()), 16);
        Map destination$iv = new LinkedHashMap(capacity);
        for (int i = 0; i < $this$associate.length(); i++) {
            char element$iv = $this$associate.charAt(i);
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(element$iv));
            destination$iv.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination$iv;
    }

    @NotNull
    public static final <K> Map<K, Character> associateBy(@NotNull CharSequence $this$associateBy, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity($this$associateBy.length()), 16);
        Map destination$iv = new LinkedHashMap(capacity);
        for (int i = 0; i < $this$associateBy.length(); i++) {
            char element$iv = $this$associateBy.charAt(i);
            destination$iv.put(keySelector.invoke(Character.valueOf(element$iv)), Character.valueOf(element$iv));
        }
        return destination$iv;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull CharSequence $this$associateBy, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter($this$associateBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity($this$associateBy.length()), 16);
        Map destination$iv = new LinkedHashMap(capacity);
        for (int i = 0; i < $this$associateBy.length(); i++) {
            char element$iv = $this$associateBy.charAt(i);
            destination$iv.put(keySelector.invoke(Character.valueOf(element$iv)), valueTransform.invoke(Character.valueOf(element$iv)));
        }
        return destination$iv;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull CharSequence $this$associateByTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter($this$associateByTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i = 0; i < $this$associateByTo.length(); i++) {
            char element = $this$associateByTo.charAt(i);
            destination.put(keySelector.invoke(Character.valueOf(element)), Character.valueOf(element));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull CharSequence $this$associateByTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter($this$associateByTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i = 0; i < $this$associateByTo.length(); i++) {
            char element = $this$associateByTo.charAt(i);
            destination.put(keySelector.invoke(Character.valueOf(element)), valueTransform.invoke(Character.valueOf(element)));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull CharSequence $this$associateTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter($this$associateTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < $this$associateTo.length(); i++) {
            char element = $this$associateTo.charAt(i);
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(element));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V> Map<Character, V> associateWith(@NotNull CharSequence $this$associateWith, @NotNull Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter($this$associateWith, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap result = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(RangesKt.coerceAtMost($this$associateWith.length(), Uuid.SIZE_BITS)), 16));
        for (int i = 0; i < $this$associateWith.length(); i++) {
            char element$iv = $this$associateWith.charAt(i);
            result.put(Character.valueOf(element$iv), valueSelector.invoke(Character.valueOf(element$iv)));
        }
        return result;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(@NotNull CharSequence $this$associateWithTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter($this$associateWithTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i = 0; i < $this$associateWithTo.length(); i++) {
            char element = $this$associateWithTo.charAt(i);
            destination.put(Character.valueOf(element), valueSelector.invoke(Character.valueOf(element)));
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C toCollection(@NotNull CharSequence $this$toCollection, @NotNull C destination) {
        Intrinsics.checkNotNullParameter($this$toCollection, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i = 0; i < $this$toCollection.length(); i++) {
            char item = $this$toCollection.charAt(i);
            destination.add(Character.valueOf(item));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Character> toHashSet(@NotNull CharSequence $this$toHashSet) {
        Intrinsics.checkNotNullParameter($this$toHashSet, "<this>");
        return (HashSet) StringsKt.toCollection($this$toHashSet, new HashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost($this$toHashSet.length(), Uuid.SIZE_BITS))));
    }

    @NotNull
    public static final List<Character> toList(@NotNull CharSequence $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        switch ($this$toList.length()) {
            case 0:
                return CollectionsKt.emptyList();
            case 1:
                return CollectionsKt.listOf(Character.valueOf($this$toList.charAt(0)));
            default:
                return StringsKt.toMutableList($this$toList);
        }
    }

    @NotNull
    public static final List<Character> toMutableList(@NotNull CharSequence $this$toMutableList) {
        Intrinsics.checkNotNullParameter($this$toMutableList, "<this>");
        return (List) StringsKt.toCollection($this$toMutableList, new ArrayList($this$toMutableList.length()));
    }

    @NotNull
    public static final Set<Character> toSet(@NotNull CharSequence $this$toSet) {
        Intrinsics.checkNotNullParameter($this$toSet, "<this>");
        switch ($this$toSet.length()) {
            case 0:
                return SetsKt.emptySet();
            case 1:
                return SetsKt.setOf(Character.valueOf($this$toSet.charAt(0)));
            default:
                return (Set) StringsKt.toCollection($this$toSet, new LinkedHashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost($this$toSet.length(), Uuid.SIZE_BITS))));
        }
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull CharSequence $this$flatMap, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList();
        for (int i = 0; i < $this$flatMap.length(); i++) {
            char element$iv = $this$flatMap.charAt(i);
            CollectionsKt.addAll(destination$iv, transform.invoke(Character.valueOf(element$iv)));
        }
        return (List) destination$iv;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedIterable")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(CharSequence $this$flatMapIndexed, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapIndexed, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < $this$flatMapIndexed.length(); i2++) {
            int i3 = i;
            i++;
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i3), Character.valueOf($this$flatMapIndexed.charAt(i2))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedIterableTo")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(CharSequence $this$flatMapIndexedTo, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapIndexedTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        for (int i = 0; i < $this$flatMapIndexedTo.length(); i++) {
            char element = $this$flatMapIndexedTo.charAt(i);
            int i2 = index;
            index++;
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i2), Character.valueOf(element)));
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull CharSequence $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < $this$flatMapTo.length(); i++) {
            char element = $this$flatMapTo.charAt(i);
            CollectionsKt.addAll(destination, transform.invoke(Character.valueOf(element)));
        }
        return destination;
    }

    @NotNull
    public static final <K> Map<K, List<Character>> groupBy(@NotNull CharSequence $this$groupBy, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Object obj;
        Intrinsics.checkNotNullParameter($this$groupBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Map destination$iv = new LinkedHashMap();
        for (int i = 0; i < $this$groupBy.length(); i++) {
            char element$iv = $this$groupBy.charAt(i);
            K kInvoke = keySelector.invoke(Character.valueOf(element$iv));
            Object value$iv$iv = destination$iv.get(kInvoke);
            if (value$iv$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination$iv.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv$iv;
            }
            List list$iv = (List) obj;
            list$iv.add(Character.valueOf(element$iv));
        }
        return destination$iv;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull CharSequence $this$groupBy, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Object obj;
        Intrinsics.checkNotNullParameter($this$groupBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        Map destination$iv = new LinkedHashMap();
        for (int i = 0; i < $this$groupBy.length(); i++) {
            char element$iv = $this$groupBy.charAt(i);
            K kInvoke = keySelector.invoke(Character.valueOf(element$iv));
            Object value$iv$iv = destination$iv.get(kInvoke);
            if (value$iv$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination$iv.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv$iv;
            }
            List list$iv = (List) obj;
            list$iv.add(valueTransform.invoke(Character.valueOf(element$iv)));
        }
        return destination$iv;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull CharSequence $this$groupByTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Object obj;
        Intrinsics.checkNotNullParameter($this$groupByTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i = 0; i < $this$groupByTo.length(); i++) {
            char element = $this$groupByTo.charAt(i);
            K kInvoke = keySelector.invoke(Character.valueOf(element));
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(Character.valueOf(element));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull CharSequence $this$groupByTo, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Object obj;
        Intrinsics.checkNotNullParameter($this$groupByTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i = 0; i < $this$groupByTo.length(); i++) {
            char element = $this$groupByTo.charAt(i);
            K kInvoke = keySelector.invoke(Character.valueOf(element));
            Object value$iv = destination.get(kInvoke);
            if (value$iv == null) {
                ArrayList arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
                obj = arrayList;
            } else {
                obj = value$iv;
            }
            List list = (List) obj;
            list.add(valueTransform.invoke(Character.valueOf(element)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K> Grouping<Character, K> groupingBy(@NotNull final CharSequence $this$groupingBy, @NotNull final Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter($this$groupingBy, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<Character, K>() { // from class: kotlin.text.StringsKt___StringsKt.groupingBy.1
            @Override // kotlin.collections.Grouping
            public /* bridge */ /* synthetic */ Object keyOf(Character element) {
                return keyOf(element.charValue());
            }

            @Override // kotlin.collections.Grouping
            public Iterator<Character> sourceIterator() {
                return StringsKt.iterator($this$groupingBy);
            }

            public K keyOf(char element) {
                return keySelector.invoke(Character.valueOf(element));
            }
        };
    }

    @NotNull
    public static final <R> List<R> map(@NotNull CharSequence $this$map, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList($this$map.length());
        for (int i = 0; i < $this$map.length(); i++) {
            char item$iv = $this$map.charAt(i);
            destination$iv.add(transform.invoke(Character.valueOf(item$iv)));
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull CharSequence $this$mapIndexed, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapIndexed, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList($this$mapIndexed.length());
        int index$iv = 0;
        for (int i = 0; i < $this$mapIndexed.length(); i++) {
            char item$iv = $this$mapIndexed.charAt(i);
            int i2 = index$iv;
            index$iv++;
            destination$iv.add(transform.invoke(Integer.valueOf(i2), Character.valueOf(item$iv)));
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <R> List<R> mapIndexedNotNull(@NotNull CharSequence $this$mapIndexedNotNull, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapIndexedNotNull, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList();
        int index$iv$iv = 0;
        for (int i = 0; i < $this$mapIndexedNotNull.length(); i++) {
            char item$iv$iv = $this$mapIndexedNotNull.charAt(i);
            int index$iv = index$iv$iv;
            index$iv$iv++;
            R rInvoke = transform.invoke(Integer.valueOf(index$iv), Character.valueOf(item$iv$iv));
            if (rInvoke != null) {
                destination$iv.add(rInvoke);
            }
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull CharSequence $this$mapIndexedNotNullTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapIndexedNotNullTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index$iv = 0;
        for (int i = 0; i < $this$mapIndexedNotNullTo.length(); i++) {
            char item$iv = $this$mapIndexedNotNullTo.charAt(i);
            int index = index$iv;
            index$iv++;
            R rInvoke = transform.invoke(Integer.valueOf(index), Character.valueOf(item$iv));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull CharSequence $this$mapIndexedTo, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapIndexedTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int index = 0;
        for (int i = 0; i < $this$mapIndexedTo.length(); i++) {
            char item = $this$mapIndexedTo.charAt(i);
            int i2 = index;
            index++;
            destination.add(transform.invoke(Integer.valueOf(i2), Character.valueOf(item)));
        }
        return destination;
    }

    @NotNull
    public static final <R> List<R> mapNotNull(@NotNull CharSequence $this$mapNotNull, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapNotNull, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Collection destination$iv = new ArrayList();
        for (int i = 0; i < $this$mapNotNull.length(); i++) {
            char element$iv$iv = $this$mapNotNull.charAt(i);
            R rInvoke = transform.invoke(Character.valueOf(element$iv$iv));
            if (rInvoke != null) {
                destination$iv.add(rInvoke);
            }
        }
        return (List) destination$iv;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapNotNullTo(@NotNull CharSequence $this$mapNotNullTo, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapNotNullTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < $this$mapNotNullTo.length(); i++) {
            char element$iv = $this$mapNotNullTo.charAt(i);
            R rInvoke = transform.invoke(Character.valueOf(element$iv));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull CharSequence $this$mapTo, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$mapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i = 0; i < $this$mapTo.length(); i++) {
            char item = $this$mapTo.charAt(i);
            destination.add(transform.invoke(Character.valueOf(item)));
        }
        return destination;
    }

    @NotNull
    public static final Iterable<IndexedValue<Character>> withIndex(@NotNull CharSequence $this$withIndex) {
        Intrinsics.checkNotNullParameter($this$withIndex, "<this>");
        return new IndexingIterable(() -> {
            return withIndex$lambda$15$StringsKt___StringsKt(r2);
        });
    }

    private static final Iterator withIndex$lambda$15$StringsKt___StringsKt(CharSequence $this_withIndex) {
        return StringsKt.iterator($this_withIndex);
    }

    public static final boolean all(@NotNull CharSequence $this$all, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$all, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < $this$all.length(); i++) {
            char element = $this$all.charAt(i);
            if (!predicate.invoke(Character.valueOf(element)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull CharSequence $this$any) {
        Intrinsics.checkNotNullParameter($this$any, "<this>");
        return !($this$any.length() == 0);
    }

    public static final boolean any(@NotNull CharSequence $this$any, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$any, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < $this$any.length(); i++) {
            char element = $this$any.charAt(i);
            if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InlineOnly
    private static final int count(CharSequence $this$count) {
        Intrinsics.checkNotNullParameter($this$count, "<this>");
        return $this$count.length();
    }

    public static final int count(@NotNull CharSequence $this$count, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$count, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int count = 0;
        for (int i = 0; i < $this$count.length(); i++) {
            char element = $this$count.charAt(i);
            if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                count++;
            }
        }
        return count;
    }

    public static final <R> R fold(@NotNull CharSequence charSequence, R r, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        for (int i = 0; i < charSequence.length(); i++) {
            rInvoke = operation.invoke((Object) rInvoke, Character.valueOf(charSequence.charAt(i)));
        }
        return rInvoke;
    }

    public static final <R> R foldIndexed(@NotNull CharSequence charSequence, R r, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i = 0;
        R rInvoke = r;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int i3 = i;
            i++;
            rInvoke = operation.invoke(Integer.valueOf(i3), (Object) rInvoke, Character.valueOf(charSequence.charAt(i2)));
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [R, java.lang.Object] */
    public static final <R> R foldRight(@NotNull CharSequence charSequence, R r, @NotNull Function2<? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt.getLastIndex(charSequence);
        R rInvoke = r;
        while (true) {
            ?? r9 = (Object) rInvoke;
            if (lastIndex >= 0) {
                int i = lastIndex;
                lastIndex--;
                rInvoke = operation.invoke(Character.valueOf(charSequence.charAt(i)), r9);
            } else {
                return r9;
            }
        }
    }

    public static final <R> R foldRightIndexed(@NotNull CharSequence charSequence, R r, @NotNull Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        R rInvoke = r;
        for (int lastIndex = StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            rInvoke = operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), (Object) rInvoke);
        }
        return rInvoke;
    }

    public static final void forEach(@NotNull CharSequence $this$forEach, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEach, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i = 0; i < $this$forEach.length(); i++) {
            char element = $this$forEach.charAt(i);
            action.invoke(Character.valueOf(element));
        }
    }

    public static final void forEachIndexed(@NotNull CharSequence $this$forEachIndexed, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEachIndexed, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int index = 0;
        for (int i = 0; i < $this$forEachIndexed.length(); i++) {
            char item = $this$forEachIndexed.charAt(i);
            int i2 = index;
            index++;
            action.invoke(Integer.valueOf(i2), Character.valueOf(item));
        }
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final char maxOrThrow(@NotNull CharSequence $this$max) {
        Intrinsics.checkNotNullParameter($this$max, "<this>");
        if ($this$max.length() == 0) {
            throw new NoSuchElementException();
        }
        char max = $this$max.charAt(0);
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$max);
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$max.charAt(i);
                if (Intrinsics.compare((int) max, (int) e) < 0) {
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
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(@NotNull CharSequence $this$maxBy, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxBy.length() == 0) {
            throw new NoSuchElementException();
        }
        char maxElem = $this$maxBy.charAt(0);
        int lastIndex = StringsKt.getLastIndex($this$maxBy);
        if (lastIndex == 0) {
            return maxElem;
        }
        Comparable maxValue = selector.invoke(Character.valueOf(maxElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$maxBy.charAt(i);
                R rInvoke = selector.invoke(Character.valueOf(e));
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
    @Nullable
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@NotNull CharSequence $this$maxByOrNull, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxByOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxByOrNull.length() == 0) {
            return null;
        }
        char maxElem = $this$maxByOrNull.charAt(0);
        int lastIndex = StringsKt.getLastIndex($this$maxByOrNull);
        if (lastIndex == 0) {
            return Character.valueOf(maxElem);
        }
        Comparable maxValue = selector.invoke(Character.valueOf(maxElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$maxByOrNull.charAt(i);
                R rInvoke = selector.invoke(Character.valueOf(e));
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
        return Character.valueOf(maxElem);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(CharSequence $this$maxOf, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxOf.length() == 0) {
            throw new NoSuchElementException();
        }
        double maxValue = selector.invoke(Character.valueOf($this$maxOf.charAt(0))).doubleValue();
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$maxOf);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(Character.valueOf($this$maxOf.charAt(i))).doubleValue();
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m1592maxOf(CharSequence $this$maxOf, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxOf.length() == 0) {
            throw new NoSuchElementException();
        }
        float maxValue = selector.invoke(Character.valueOf($this$maxOf.charAt(0))).floatValue();
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$maxOf);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(Character.valueOf($this$maxOf.charAt(i))).floatValue();
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m1593maxOf(CharSequence $this$maxOf, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxOf.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf($this$maxOf.charAt(0)));
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$maxOf);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf($this$maxOf.charAt(i)));
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double maxOfOrNull(CharSequence $this$maxOfOrNull, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxOfOrNull.length() == 0) {
            return null;
        }
        double maxValue = selector.invoke(Character.valueOf($this$maxOfOrNull.charAt(0))).doubleValue();
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(Character.valueOf($this$maxOfOrNull.charAt(i))).doubleValue();
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m1594maxOfOrNull(CharSequence $this$maxOfOrNull, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxOfOrNull.length() == 0) {
            return null;
        }
        float maxValue = selector.invoke(Character.valueOf($this$maxOfOrNull.charAt(0))).floatValue();
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(Character.valueOf($this$maxOfOrNull.charAt(i))).floatValue();
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m1595maxOfOrNull(CharSequence $this$maxOfOrNull, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$maxOfOrNull.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf($this$maxOfOrNull.charAt(0)));
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$maxOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf($this$maxOfOrNull.charAt(i)));
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int i = 1;
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i)));
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object objInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int i = 1;
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i)));
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
    @Nullable
    public static final Character maxOrNull(@NotNull CharSequence $this$maxOrNull) {
        Intrinsics.checkNotNullParameter($this$maxOrNull, "<this>");
        if ($this$maxOrNull.length() == 0) {
            return null;
        }
        char max = $this$maxOrNull.charAt(0);
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$maxOrNull);
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$maxOrNull.charAt(i);
                if (Intrinsics.compare((int) max, (int) e) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(max);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@NotNull CharSequence $this$maxWith, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if ($this$maxWith.length() == 0) {
            throw new NoSuchElementException();
        }
        char max = $this$maxWith.charAt(0);
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$maxWith);
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$maxWith.charAt(i);
                if (comparator.compare(Character.valueOf(max), Character.valueOf(e)) < 0) {
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
    @Nullable
    public static final Character maxWithOrNull(@NotNull CharSequence $this$maxWithOrNull, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter($this$maxWithOrNull, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if ($this$maxWithOrNull.length() == 0) {
            return null;
        }
        char max = $this$maxWithOrNull.charAt(0);
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$maxWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$maxWithOrNull.charAt(i);
                if (comparator.compare(Character.valueOf(max), Character.valueOf(e)) < 0) {
                    max = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(max);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final char minOrThrow(@NotNull CharSequence $this$min) {
        Intrinsics.checkNotNullParameter($this$min, "<this>");
        if ($this$min.length() == 0) {
            throw new NoSuchElementException();
        }
        char min = $this$min.charAt(0);
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$min);
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$min.charAt(i);
                if (Intrinsics.compare((int) min, (int) e) > 0) {
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
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(@NotNull CharSequence $this$minBy, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minBy.length() == 0) {
            throw new NoSuchElementException();
        }
        char minElem = $this$minBy.charAt(0);
        int lastIndex = StringsKt.getLastIndex($this$minBy);
        if (lastIndex == 0) {
            return minElem;
        }
        Comparable minValue = selector.invoke(Character.valueOf(minElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$minBy.charAt(i);
                R rInvoke = selector.invoke(Character.valueOf(e));
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
    @Nullable
    public static final <R extends Comparable<? super R>> Character minByOrNull(@NotNull CharSequence $this$minByOrNull, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minByOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minByOrNull.length() == 0) {
            return null;
        }
        char minElem = $this$minByOrNull.charAt(0);
        int lastIndex = StringsKt.getLastIndex($this$minByOrNull);
        if (lastIndex == 0) {
            return Character.valueOf(minElem);
        }
        Comparable minValue = selector.invoke(Character.valueOf(minElem));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$minByOrNull.charAt(i);
                R rInvoke = selector.invoke(Character.valueOf(e));
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
        return Character.valueOf(minElem);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(CharSequence $this$minOf, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter($this$minOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minOf.length() == 0) {
            throw new NoSuchElementException();
        }
        double minValue = selector.invoke(Character.valueOf($this$minOf.charAt(0))).doubleValue();
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$minOf);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(Character.valueOf($this$minOf.charAt(i))).doubleValue();
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m1596minOf(CharSequence $this$minOf, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter($this$minOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minOf.length() == 0) {
            throw new NoSuchElementException();
        }
        float minValue = selector.invoke(Character.valueOf($this$minOf.charAt(0))).floatValue();
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$minOf);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(Character.valueOf($this$minOf.charAt(i))).floatValue();
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m1597minOf(CharSequence $this$minOf, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minOf.length() == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf($this$minOf.charAt(0)));
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$minOf);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf($this$minOf.charAt(i)));
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double minOfOrNull(CharSequence $this$minOfOrNull, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minOfOrNull.length() == 0) {
            return null;
        }
        double minValue = selector.invoke(Character.valueOf($this$minOfOrNull.charAt(0))).doubleValue();
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                double v = selector.invoke(Character.valueOf($this$minOfOrNull.charAt(i))).doubleValue();
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m1598minOfOrNull(CharSequence $this$minOfOrNull, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minOfOrNull.length() == 0) {
            return null;
        }
        float minValue = selector.invoke(Character.valueOf($this$minOfOrNull.charAt(0))).floatValue();
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                float v = selector.invoke(Character.valueOf($this$minOfOrNull.charAt(i))).floatValue();
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m1599minOfOrNull(CharSequence $this$minOfOrNull, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if ($this$minOfOrNull.length() == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf($this$minOfOrNull.charAt(0)));
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$minOfOrNull);
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf($this$minOfOrNull.charAt(i)));
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Object objInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int i = 1;
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i)));
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
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object objInvoke = selector.invoke(Character.valueOf(charSequence.charAt(0)));
        int i = 1;
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                Object objInvoke2 = selector.invoke(Character.valueOf(charSequence.charAt(i)));
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
    @Nullable
    public static final Character minOrNull(@NotNull CharSequence $this$minOrNull) {
        Intrinsics.checkNotNullParameter($this$minOrNull, "<this>");
        if ($this$minOrNull.length() == 0) {
            return null;
        }
        char min = $this$minOrNull.charAt(0);
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$minOrNull);
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$minOrNull.charAt(i);
                if (Intrinsics.compare((int) min, (int) e) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(min);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final char minWithOrThrow(@NotNull CharSequence $this$minWith, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if ($this$minWith.length() == 0) {
            throw new NoSuchElementException();
        }
        char min = $this$minWith.charAt(0);
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$minWith);
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$minWith.charAt(i);
                if (comparator.compare(Character.valueOf(min), Character.valueOf(e)) > 0) {
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
    @Nullable
    public static final Character minWithOrNull(@NotNull CharSequence $this$minWithOrNull, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter($this$minWithOrNull, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if ($this$minWithOrNull.length() == 0) {
            return null;
        }
        char min = $this$minWithOrNull.charAt(0);
        int i = 1;
        int lastIndex = StringsKt.getLastIndex($this$minWithOrNull);
        if (1 <= lastIndex) {
            while (true) {
                char e = $this$minWithOrNull.charAt(i);
                if (comparator.compare(Character.valueOf(min), Character.valueOf(e)) > 0) {
                    min = e;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(min);
    }

    public static final boolean none(@NotNull CharSequence $this$none) {
        Intrinsics.checkNotNullParameter($this$none, "<this>");
        return $this$none.length() == 0;
    }

    public static final boolean none(@NotNull CharSequence $this$none, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$none, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i = 0; i < $this$none.length(); i++) {
            char element = $this$none.charAt(i);
            if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S extends CharSequence> S onEach(@NotNull S $this$onEach, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter($this$onEach, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i = 0; i < $this$onEach.length(); i++) {
            char element = $this$onEach.charAt(i);
            action.invoke(Character.valueOf(element));
        }
        return $this$onEach;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S extends CharSequence> S onEachIndexed(@NotNull S $this$onEachIndexed, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter($this$onEachIndexed, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int index$iv = 0;
        for (int i = 0; i < $this$onEachIndexed.length(); i++) {
            char item$iv = $this$onEachIndexed.charAt(i);
            int i2 = index$iv;
            index$iv++;
            action.invoke(Integer.valueOf(i2), Character.valueOf(item$iv));
        }
        return $this$onEachIndexed;
    }

    public static final char reduce(@NotNull CharSequence $this$reduce, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter($this$reduce, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if ($this$reduce.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char accumulator = $this$reduce.charAt(0);
        int index = 1;
        int lastIndex = StringsKt.getLastIndex($this$reduce);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Character.valueOf(accumulator), Character.valueOf($this$reduce.charAt(index))).charValue();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return accumulator;
    }

    public static final char reduceIndexed(@NotNull CharSequence $this$reduceIndexed, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter($this$reduceIndexed, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if ($this$reduceIndexed.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char accumulator = $this$reduceIndexed.charAt(0);
        int index = 1;
        int lastIndex = StringsKt.getLastIndex($this$reduceIndexed);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Integer.valueOf(index), Character.valueOf(accumulator), Character.valueOf($this$reduceIndexed.charAt(index))).charValue();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull CharSequence $this$reduceIndexedOrNull, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter($this$reduceIndexedOrNull, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if ($this$reduceIndexedOrNull.length() == 0) {
            return null;
        }
        char accumulator = $this$reduceIndexedOrNull.charAt(0);
        int index = 1;
        int lastIndex = StringsKt.getLastIndex($this$reduceIndexedOrNull);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Integer.valueOf(index), Character.valueOf(accumulator), Character.valueOf($this$reduceIndexedOrNull.charAt(index))).charValue();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return Character.valueOf(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceOrNull(@NotNull CharSequence $this$reduceOrNull, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter($this$reduceOrNull, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if ($this$reduceOrNull.length() == 0) {
            return null;
        }
        char accumulator = $this$reduceOrNull.charAt(0);
        int index = 1;
        int lastIndex = StringsKt.getLastIndex($this$reduceOrNull);
        if (1 <= lastIndex) {
            while (true) {
                accumulator = operation.invoke(Character.valueOf(accumulator), Character.valueOf($this$reduceOrNull.charAt(index))).charValue();
                if (index == lastIndex) {
                    break;
                }
                index++;
            }
        }
        return Character.valueOf(accumulator);
    }

    public static final char reduceRight(@NotNull CharSequence $this$reduceRight, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter($this$reduceRight, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = StringsKt.getLastIndex($this$reduceRight);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        int index2 = index - 1;
        char cCharAt = $this$reduceRight.charAt(index);
        while (true) {
            char accumulator = cCharAt;
            if (index2 >= 0) {
                int i = index2;
                index2--;
                cCharAt = operation.invoke(Character.valueOf($this$reduceRight.charAt(i)), Character.valueOf(accumulator)).charValue();
            } else {
                return accumulator;
            }
        }
    }

    public static final char reduceRightIndexed(@NotNull CharSequence $this$reduceRightIndexed, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter($this$reduceRightIndexed, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = StringsKt.getLastIndex($this$reduceRightIndexed);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char accumulator = $this$reduceRightIndexed.charAt(index);
        for (int index2 = index - 1; index2 >= 0; index2--) {
            accumulator = operation.invoke(Integer.valueOf(index2), Character.valueOf($this$reduceRightIndexed.charAt(index2)), Character.valueOf(accumulator)).charValue();
        }
        return accumulator;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull CharSequence $this$reduceRightIndexedOrNull, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter($this$reduceRightIndexedOrNull, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = StringsKt.getLastIndex($this$reduceRightIndexedOrNull);
        if (index < 0) {
            return null;
        }
        char accumulator = $this$reduceRightIndexedOrNull.charAt(index);
        for (int index2 = index - 1; index2 >= 0; index2--) {
            accumulator = operation.invoke(Integer.valueOf(index2), Character.valueOf($this$reduceRightIndexedOrNull.charAt(index2)), Character.valueOf(accumulator)).charValue();
        }
        return Character.valueOf(accumulator);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightOrNull(@NotNull CharSequence $this$reduceRightOrNull, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter($this$reduceRightOrNull, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int index = StringsKt.getLastIndex($this$reduceRightOrNull);
        if (index < 0) {
            return null;
        }
        int index2 = index - 1;
        char cCharAt = $this$reduceRightOrNull.charAt(index);
        while (true) {
            char accumulator = cCharAt;
            if (index2 >= 0) {
                int i = index2;
                index2--;
                cCharAt = operation.invoke(Character.valueOf($this$reduceRightOrNull.charAt(i)), Character.valueOf(accumulator)).charValue();
            } else {
                return Character.valueOf(accumulator);
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> runningFold(@NotNull CharSequence charSequence, R r, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        R rInvoke = r;
        for (int i = 0; i < charSequence.length(); i++) {
            rInvoke = operation.invoke((Object) rInvoke, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> runningFoldIndexed(@NotNull CharSequence charSequence, R r, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        R rInvoke = r;
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            rInvoke = operation.invoke(Integer.valueOf(i), (Object) rInvoke, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List<Character> runningReduce(@NotNull CharSequence $this$runningReduce, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter($this$runningReduce, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if ($this$runningReduce.length() == 0) {
            return CollectionsKt.emptyList();
        }
        char accumulator = $this$runningReduce.charAt(0);
        ArrayList $this$runningReduce_u24lambda_u2420 = new ArrayList($this$runningReduce.length());
        $this$runningReduce_u24lambda_u2420.add(Character.valueOf(accumulator));
        int length = $this$runningReduce.length();
        for (int index = 1; index < length; index++) {
            accumulator = operation.invoke(Character.valueOf(accumulator), Character.valueOf($this$runningReduce.charAt(index))).charValue();
            $this$runningReduce_u24lambda_u2420.add(Character.valueOf(accumulator));
        }
        return $this$runningReduce_u24lambda_u2420;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final List<Character> runningReduceIndexed(@NotNull CharSequence $this$runningReduceIndexed, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter($this$runningReduceIndexed, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if ($this$runningReduceIndexed.length() == 0) {
            return CollectionsKt.emptyList();
        }
        char accumulator = $this$runningReduceIndexed.charAt(0);
        ArrayList $this$runningReduceIndexed_u24lambda_u2421 = new ArrayList($this$runningReduceIndexed.length());
        $this$runningReduceIndexed_u24lambda_u2421.add(Character.valueOf(accumulator));
        int length = $this$runningReduceIndexed.length();
        for (int index = 1; index < length; index++) {
            accumulator = operation.invoke(Integer.valueOf(index), Character.valueOf(accumulator), Character.valueOf($this$runningReduceIndexed.charAt(index))).charValue();
            $this$runningReduceIndexed_u24lambda_u2421.add(Character.valueOf(accumulator));
        }
        return $this$runningReduceIndexed_u24lambda_u2421;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> scan(@NotNull CharSequence charSequence, R r, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        R rInvoke = r;
        for (int i = 0; i < charSequence.length(); i++) {
            rInvoke = operation.invoke((Object) rInvoke, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <R> List<R> scanIndexed(@NotNull CharSequence charSequence, R r, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        R rInvoke = r;
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            rInvoke = operation.invoke(Integer.valueOf(i), (Object) rInvoke, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(rInvoke);
        }
        return arrayList;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull CharSequence $this$sumBy, @NotNull Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter($this$sumBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        for (int i = 0; i < $this$sumBy.length(); i++) {
            char element = $this$sumBy.charAt(i);
            sum += selector.invoke(Character.valueOf(element)).intValue();
        }
        return sum;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull CharSequence $this$sumByDouble, @NotNull Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter($this$sumByDouble, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        for (int i = 0; i < $this$sumByDouble.length(); i++) {
            char element = $this$sumByDouble.charAt(i);
            sum += selector.invoke(Character.valueOf(element)).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfDouble")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(CharSequence $this$sumOf, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double sum = 0.0d;
        for (int i = 0; i < $this$sumOf.length(); i++) {
            char element = $this$sumOf.charAt(i);
            sum += selector.invoke(Character.valueOf(element)).doubleValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfInt")
    @InlineOnly
    private static final int sumOfInt(CharSequence $this$sumOf, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = 0;
        for (int i = 0; i < $this$sumOf.length(); i++) {
            char element = $this$sumOf.charAt(i);
            sum += selector.invoke(Character.valueOf(element)).intValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "sumOfLong")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(CharSequence $this$sumOf, Function1<? super Character, Long> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = 0;
        for (int i = 0; i < $this$sumOf.length(); i++) {
            char element = $this$sumOf.charAt(i);
            sum += selector.invoke(Character.valueOf(element)).longValue();
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    @InlineOnly
    private static final int sumOfUInt(CharSequence $this$sumOf, Function1<? super Character, UInt> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int sum = UInt.m326constructorimpl(0);
        for (int i = 0; i < $this$sumOf.length(); i++) {
            char element = $this$sumOf.charAt(i);
            sum = UInt.m326constructorimpl(sum + selector.invoke(Character.valueOf(element)).m328unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfULong(CharSequence $this$sumOf, Function1<? super Character, ULong> selector) {
        Intrinsics.checkNotNullParameter($this$sumOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long sum = ULong.m406constructorimpl(0L);
        for (int i = 0; i < $this$sumOf.length(); i++) {
            char element = $this$sumOf.charAt(i);
            sum = ULong.m406constructorimpl(sum + selector.invoke(Character.valueOf(element)).m408unboximpl());
        }
        return sum;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<String> chunked(@NotNull CharSequence $this$chunked, int size) {
        Intrinsics.checkNotNullParameter($this$chunked, "<this>");
        return StringsKt.windowed($this$chunked, size, size, true);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> chunked(@NotNull CharSequence $this$chunked, int size, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$chunked, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return StringsKt.windowed($this$chunked, size, size, true, transform);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<String> chunkedSequence(@NotNull CharSequence $this$chunkedSequence, int size) {
        Intrinsics.checkNotNullParameter($this$chunkedSequence, "<this>");
        return StringsKt.chunkedSequence($this$chunkedSequence, size, StringsKt___StringsKt::chunkedSequence$lambda$22$StringsKt___StringsKt);
    }

    private static final String chunkedSequence$lambda$22$StringsKt___StringsKt(CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> chunkedSequence(@NotNull CharSequence $this$chunkedSequence, int size, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$chunkedSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return StringsKt.windowedSequence($this$chunkedSequence, size, size, true, transform);
    }

    @NotNull
    public static final Pair<CharSequence, CharSequence> partition(@NotNull CharSequence $this$partition, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$partition, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for (int i = 0; i < $this$partition.length(); i++) {
            char element = $this$partition.charAt(i);
            if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                first.append(element);
            } else {
                second.append(element);
            }
        }
        return new Pair<>(first, second);
    }

    @NotNull
    public static final Pair<String, String> partition(@NotNull String $this$partition, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$partition, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        int length = $this$partition.length();
        for (int i = 0; i < length; i++) {
            char element = $this$partition.charAt(i);
            if (predicate.invoke(Character.valueOf(element)).booleanValue()) {
                first.append(element);
            } else {
                second.append(element);
            }
        }
        return new Pair<>(first.toString(), second.toString());
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt.windowed(charSequence, i, i2, z);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<String> windowed(@NotNull CharSequence $this$windowed, int size, int step, boolean partialWindows) {
        Intrinsics.checkNotNullParameter($this$windowed, "<this>");
        return StringsKt.windowed($this$windowed, size, step, partialWindows, StringsKt___StringsKt::windowed$lambda$23$StringsKt___StringsKt);
    }

    private static final String windowed$lambda$23$StringsKt___StringsKt(CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt.windowed(charSequence, i, i2, z, function1);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> windowed(@NotNull CharSequence $this$windowed, int size, int step, boolean partialWindows, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        int i;
        Intrinsics.checkNotNullParameter($this$windowed, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(size, step);
        int thisSize = $this$windowed.length();
        int resultCapacity = (thisSize / step) + (thisSize % step == 0 ? 0 : 1);
        ArrayList result = new ArrayList(resultCapacity);
        int i2 = 0;
        while (true) {
            int index = i2;
            boolean z = 0 <= index && index < thisSize;
            if (!z) {
                break;
            }
            int end = index + size;
            if (end >= 0 && end <= thisSize) {
                i = end;
            } else {
                if (!partialWindows) {
                    break;
                }
                i = thisSize;
            }
            int coercedEnd = i;
            result.add(transform.invoke($this$windowed.subSequence(index, coercedEnd)));
            i2 = index + step;
        }
        return result;
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt.windowedSequence(charSequence, i, i2, z);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<String> windowedSequence(@NotNull CharSequence $this$windowedSequence, int size, int step, boolean partialWindows) {
        Intrinsics.checkNotNullParameter($this$windowedSequence, "<this>");
        return StringsKt.windowedSequence($this$windowedSequence, size, step, partialWindows, StringsKt___StringsKt::windowedSequence$lambda$24$StringsKt___StringsKt);
    }

    private static final String windowedSequence$lambda$24$StringsKt___StringsKt(CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt.windowedSequence(charSequence, i, i2, z, function1);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> windowedSequence(@NotNull CharSequence $this$windowedSequence, int size, int step, boolean partialWindows, @NotNull Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$windowedSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(size, step);
        IntProgression windows = RangesKt.step(partialWindows ? StringsKt.getIndices($this$windowedSequence) : RangesKt.until(0, ($this$windowedSequence.length() - size) + 1), step);
        return SequencesKt.map(CollectionsKt.asSequence(windows), (v3) -> {
            return windowedSequence$lambda$25$StringsKt___StringsKt(r1, r2, r3, v3);
        });
    }

    private static final Object windowedSequence$lambda$25$StringsKt___StringsKt(int $size, CharSequence $this_windowedSequence, Function1 $transform, int index) {
        int end = index + $size;
        int coercedEnd = (end < 0 || end > $this_windowedSequence.length()) ? $this_windowedSequence.length() : end;
        return $transform.invoke($this_windowedSequence.subSequence(index, coercedEnd));
    }

    @NotNull
    public static final List<Pair<Character, Character>> zip(@NotNull CharSequence $this$zip, @NotNull CharSequence other) {
        Intrinsics.checkNotNullParameter($this$zip, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length$iv = Math.min($this$zip.length(), other.length());
        ArrayList list$iv = new ArrayList(length$iv);
        for (int i$iv = 0; i$iv < length$iv; i$iv++) {
            char c1 = $this$zip.charAt(i$iv);
            char c2 = other.charAt(i$iv);
            list$iv.add(TuplesKt.to(Character.valueOf(c1), Character.valueOf(c2)));
        }
        return list$iv;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull CharSequence $this$zip, @NotNull CharSequence other, @NotNull Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter($this$zip, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = Math.min($this$zip.length(), other.length());
        ArrayList list = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            list.add(transform.invoke(Character.valueOf($this$zip.charAt(i)), Character.valueOf(other.charAt(i))));
        }
        return list;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Pair<Character, Character>> zipWithNext(@NotNull CharSequence $this$zipWithNext) {
        Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
        int size$iv = $this$zipWithNext.length() - 1;
        if (size$iv < 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList result$iv = new ArrayList(size$iv);
        for (int index$iv = 0; index$iv < size$iv; index$iv++) {
            char a = $this$zipWithNext.charAt(index$iv);
            char b = $this$zipWithNext.charAt(index$iv + 1);
            result$iv.add(TuplesKt.to(Character.valueOf(a), Character.valueOf(b)));
        }
        return result$iv;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> zipWithNext(@NotNull CharSequence $this$zipWithNext, @NotNull Function2<? super Character, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$zipWithNext, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = $this$zipWithNext.length() - 1;
        if (size < 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList result = new ArrayList(size);
        for (int index = 0; index < size; index++) {
            result.add(transform.invoke(Character.valueOf($this$zipWithNext.charAt(index)), Character.valueOf($this$zipWithNext.charAt(index + 1))));
        }
        return result;
    }

    @NotNull
    public static final Iterable<Character> asIterable(@NotNull CharSequence $this$asIterable) {
        Intrinsics.checkNotNullParameter($this$asIterable, "<this>");
        if ($this$asIterable instanceof String) {
            if ($this$asIterable.length() == 0) {
                return CollectionsKt.emptyList();
            }
        }
        return new StringsKt___StringsKt$asIterable$$inlined$Iterable$1($this$asIterable);
    }

    @NotNull
    public static final Sequence<Character> asSequence(@NotNull final CharSequence $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        if ($this$asSequence instanceof String) {
            if ($this$asSequence.length() == 0) {
                return SequencesKt.emptySequence();
            }
        }
        return new Sequence<Character>() { // from class: kotlin.text.StringsKt___StringsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<Character> iterator() {
                return StringsKt.iterator($this$asSequence);
            }
        };
    }
}
