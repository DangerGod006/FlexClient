package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/StringsKt__StringNumberConversionsJVMKt.class */
public class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(byte $this$toString, int radix) {
        String string = Integer.toString($this$toString, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(short $this$toString, int radix) {
        String string = Integer.toString($this$toString, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(int $this$toString, int radix) {
        String string = Integer.toString($this$toString, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(long $this$toString, int radix) {
        String string = Long.toString($this$toString, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean toBoolean(String $this$toBoolean) {
        return Boolean.parseBoolean($this$toBoolean);
    }

    @InlineOnly
    private static final byte toByte(String $this$toByte) {
        Intrinsics.checkNotNullParameter($this$toByte, "<this>");
        return Byte.parseByte($this$toByte);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte toByte(String $this$toByte, int radix) {
        Intrinsics.checkNotNullParameter($this$toByte, "<this>");
        return Byte.parseByte($this$toByte, CharsKt.checkRadix(radix));
    }

    @InlineOnly
    private static final short toShort(String $this$toShort) {
        Intrinsics.checkNotNullParameter($this$toShort, "<this>");
        return Short.parseShort($this$toShort);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short toShort(String $this$toShort, int radix) {
        Intrinsics.checkNotNullParameter($this$toShort, "<this>");
        return Short.parseShort($this$toShort, CharsKt.checkRadix(radix));
    }

    @InlineOnly
    private static final int toInt(String $this$toInt) {
        Intrinsics.checkNotNullParameter($this$toInt, "<this>");
        return Integer.parseInt($this$toInt);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int toInt(String $this$toInt, int radix) {
        Intrinsics.checkNotNullParameter($this$toInt, "<this>");
        return Integer.parseInt($this$toInt, CharsKt.checkRadix(radix));
    }

    @InlineOnly
    private static final long toLong(String $this$toLong) {
        Intrinsics.checkNotNullParameter($this$toLong, "<this>");
        return Long.parseLong($this$toLong);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long toLong(String $this$toLong, int radix) {
        Intrinsics.checkNotNullParameter($this$toLong, "<this>");
        return Long.parseLong($this$toLong, CharsKt.checkRadix(radix));
    }

    @InlineOnly
    private static final float toFloat(String $this$toFloat) {
        Intrinsics.checkNotNullParameter($this$toFloat, "<this>");
        return Float.parseFloat($this$toFloat);
    }

    @InlineOnly
    private static final double toDouble(String $this$toDouble) {
        Intrinsics.checkNotNullParameter($this$toDouble, "<this>");
        return Double.parseDouble($this$toDouble);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Float toFloatOrNull(@NotNull String $this$toFloatOrNull) {
        Float f;
        Float fValueOf;
        Intrinsics.checkNotNullParameter($this$toFloatOrNull, "<this>");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toFloatOrNull)) {
                fValueOf = Float.valueOf(Float.parseFloat($this$toFloatOrNull));
            } else {
                fValueOf = null;
            }
            f = fValueOf;
        } catch (NumberFormatException e) {
            f = null;
        }
        return f;
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Double toDoubleOrNull(@NotNull String $this$toDoubleOrNull) {
        Double d;
        Double dValueOf;
        Intrinsics.checkNotNullParameter($this$toDoubleOrNull, "<this>");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toDoubleOrNull)) {
                dValueOf = Double.valueOf(Double.parseDouble($this$toDoubleOrNull));
            } else {
                dValueOf = null;
            }
            d = dValueOf;
        } catch (NumberFormatException e) {
            d = null;
        }
        return d;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(String $this$toBigInteger) {
        Intrinsics.checkNotNullParameter($this$toBigInteger, "<this>");
        return new BigInteger($this$toBigInteger);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(String $this$toBigInteger, int radix) {
        Intrinsics.checkNotNullParameter($this$toBigInteger, "<this>");
        return new BigInteger($this$toBigInteger, CharsKt.checkRadix(radix));
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull String $this$toBigIntegerOrNull) {
        Intrinsics.checkNotNullParameter($this$toBigIntegerOrNull, "<this>");
        return StringsKt.toBigIntegerOrNull($this$toBigIntegerOrNull, 10);
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigInteger toBigIntegerOrNull(@NotNull String $this$toBigIntegerOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toBigIntegerOrNull, "<this>");
        CharsKt.checkRadix(radix);
        int length = $this$toBigIntegerOrNull.length();
        switch (length) {
            case 0:
                return null;
            case 1:
                if (CharsKt.digitOf($this$toBigIntegerOrNull.charAt(0), radix) < 0) {
                    return null;
                }
                break;
            default:
                int start = $this$toBigIntegerOrNull.charAt(0) == '-' ? 1 : 0;
                for (int index = start; index < length; index++) {
                    if (CharsKt.digitOf($this$toBigIntegerOrNull.charAt(index), radix) < 0) {
                        return null;
                    }
                }
                break;
        }
        return new BigInteger($this$toBigIntegerOrNull, CharsKt.checkRadix(radix));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(String $this$toBigDecimal) {
        Intrinsics.checkNotNullParameter($this$toBigDecimal, "<this>");
        return new BigDecimal($this$toBigDecimal);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(String $this$toBigDecimal, MathContext mathContext) {
        Intrinsics.checkNotNullParameter($this$toBigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal($this$toBigDecimal, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull String $this$toBigDecimalOrNull) {
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter($this$toBigDecimalOrNull, "<this>");
        try {
            bigDecimal = isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toBigDecimalOrNull) ? new BigDecimal($this$toBigDecimalOrNull) : null;
        } catch (NumberFormatException e) {
            bigDecimal = null;
        }
        return bigDecimal;
    }

    @SinceKotlin(version = "1.2")
    @Nullable
    public static final BigDecimal toBigDecimalOrNull(@NotNull String $this$toBigDecimalOrNull, @NotNull MathContext mathContext) {
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter($this$toBigDecimalOrNull, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        try {
            bigDecimal = isValidFloat$StringsKt__StringNumberConversionsJVMKt($this$toBigDecimalOrNull) ? new BigDecimal($this$toBigDecimalOrNull, mathContext) : null;
        } catch (NumberFormatException e) {
            bigDecimal = null;
        }
        return bigDecimal;
    }

    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> parse) {
        T t;
        T tInvoke;
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                tInvoke = parse.invoke(str);
            } else {
                tInvoke = null;
            }
            t = tInvoke;
        } catch (NumberFormatException e) {
            t = null;
        }
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x010f A[EDGE_INSN: B:224:0x010f->B:58:0x010f BREAK  A[LOOP:2: B:42:0x00c2->B:57:0x0109], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0196 A[EDGE_INSN: B:226:0x0196->B:84:0x0196 BREAK  A[LOOP:3: B:68:0x0149->B:83:0x0190], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109 A[LOOP:2: B:42:0x00c2->B:57:0x0109, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190 A[LOOP:3: B:68:0x0149->B:83:0x0190, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean isValidFloat$StringsKt__StringNumberConversionsJVMKt(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 951
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__StringNumberConversionsJVMKt.isValidFloat$StringsKt__StringNumberConversionsJVMKt(java.lang.String):boolean");
    }

    @InlineOnly
    private static final String guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt(int start, int endInclusive) {
        if (endInclusive == (start + 3) - 1) {
            return "NaN";
        }
        if (endInclusive == (start + 8) - 1) {
            return "Infinity";
        }
        return null;
    }

    @InlineOnly
    private static final boolean isAsciiDigit$StringsKt__StringNumberConversionsJVMKt(char $this$isAsciiDigit) {
        return (($this$isAsciiDigit - '0') & CharCompanionObject.MAX_VALUE) < 10;
    }

    @InlineOnly
    private static final boolean isHexLetter$StringsKt__StringNumberConversionsJVMKt(char $this$isHexLetter) {
        return ((($this$isHexLetter | ' ') - 97) & CharCompanionObject.MAX_VALUE) < 6;
    }

    @InlineOnly
    private static final int asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt(char $this$asciiLetterToLowerCaseCode) {
        return $this$asciiLetterToLowerCaseCode | ' ';
    }

    @InlineOnly
    private static final int advanceWhile$StringsKt__StringNumberConversionsJVMKt(String $this$advanceWhile, int start, int endInclusive, Function1<? super Character, Boolean> predicate) {
        int start2 = start;
        while (start2 <= endInclusive && predicate.invoke(Character.valueOf($this$advanceWhile.charAt(start2))).booleanValue()) {
            start2++;
        }
        return start2;
    }

    @InlineOnly
    private static final int backtrackWhile$StringsKt__StringNumberConversionsJVMKt(String $this$backtrackWhile, int start, int endInclusive, Function1<? super Character, Boolean> predicate) {
        int endInclusive2 = endInclusive;
        while (endInclusive2 > start && predicate.invoke(Character.valueOf($this$backtrackWhile.charAt(endInclusive2))).booleanValue()) {
            endInclusive2--;
        }
        return endInclusive2;
    }

    @InlineOnly
    private static final int advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt(String $this$advanceAndValidateMantissa, int start, int endInclusive, boolean hexFormat, Function1<? super Character, Boolean> predicate) {
        String str;
        int i = start;
        while (i <= endInclusive && predicate.invoke(Character.valueOf($this$advanceAndValidateMantissa.charAt(i))).booleanValue()) {
            i++;
        }
        int start2 = i;
        boolean hasIntegerPart = start != start2;
        if (start2 > endInclusive) {
            if (hexFormat) {
                return -1;
            }
            return start2;
        }
        boolean hasFractionalPart = false;
        if ($this$advanceAndValidateMantissa.charAt(start2) == '.') {
            int start3 = start2 + 1;
            int i2 = start3;
            while (i2 <= endInclusive && predicate.invoke(Character.valueOf($this$advanceAndValidateMantissa.charAt(i2))).booleanValue()) {
                i2++;
            }
            start2 = i2;
            hasFractionalPart = start3 != start2;
        }
        if (!hasIntegerPart && !hasFractionalPart) {
            if (hexFormat) {
                return -1;
            }
            if (endInclusive == (start2 + 3) - 1) {
                str = "NaN";
            } else {
                str = endInclusive == (start2 + 8) - 1 ? "Infinity" : null;
            }
            String constant = str;
            if (constant != null && StringsKt.indexOf((CharSequence) $this$advanceAndValidateMantissa, constant, start2, false) == start2) {
                return endInclusive + 1;
            }
            return -1;
        }
        return start2;
    }
}
