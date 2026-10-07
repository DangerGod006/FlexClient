package kotlin.time;

import com.github.weisj.jsvg.attributes.font.PredefinedFontWeight;
import java.io.IOException;
import kotlin.KotlinNothingValueException;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.InstantParseResult;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Instant.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/InstantKt.class */
public final class InstantKt {
    private static final long DISTANT_PAST_SECONDS = -3217862419201L;
    private static final long DISTANT_FUTURE_SECONDS = 3093527980800L;
    private static final long MIN_SECOND = -31557014167219200L;
    private static final long MAX_SECOND = 31556889864403199L;
    private static final int DAYS_PER_CYCLE = 146097;
    private static final int DAYS_0000_TO_1970 = 719528;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int NANOS_PER_MILLI = 1000000;
    private static final int MILLIS_PER_SECOND = 1000;
    public static final int NANOS_PER_SECOND = 1000000000;

    @NotNull
    private static final int[] POWERS_OF_TEN = {1, 10, 100, MILLIS_PER_SECOND, 10000, 100000, 1000000, 10000000, 100000000, NANOS_PER_SECOND};

    @NotNull
    private static final int[] asciiDigitPositionsInIsoStringAfterYear = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    @NotNull
    private static final int[] colonsInIsoOffsetString = {3, 6};

    @NotNull
    private static final int[] asciiDigitsInIsoOffsetString = {1, 2, 4, 5, 7, 8};

    @SinceKotlin(version = "2.1")
    @ExperimentalTime
    @InlineOnly
    public static /* synthetic */ void isDistantPast$annotations(Instant instant) {
    }

    @SinceKotlin(version = "2.1")
    @ExperimentalTime
    @InlineOnly
    public static /* synthetic */ void isDistantFuture$annotations(Instant instant) {
    }

    private static final boolean isDistantPast(Instant $this$isDistantPast) {
        Intrinsics.checkNotNullParameter($this$isDistantPast, "<this>");
        return $this$isDistantPast.compareTo(Instant.Companion.getDISTANT_PAST()) <= 0;
    }

    private static final boolean isDistantFuture(Instant $this$isDistantFuture) {
        Intrinsics.checkNotNullParameter($this$isDistantFuture, "<this>");
        return $this$isDistantFuture.compareTo(Instant.Companion.getDISTANT_FUTURE()) >= 0;
    }

    private static final InstantParseResult.Failure parseIso$parseFailure(CharSequence $isoString, String error) {
        return new InstantParseResult.Failure(error + " when parsing an Instant from \"" + truncateForErrorMessage($isoString, 64) + '\"', $isoString);
    }

    private static final InstantParseResult.Failure parseIso$expect(CharSequence $isoString, String what, int where, Function1<? super Character, Boolean> predicate) {
        char c = $isoString.charAt(where);
        if (predicate.invoke(Character.valueOf(c)).booleanValue()) {
            return null;
        }
        return parseIso$parseFailure($isoString, "Expected " + what + ", but got '" + c + "' at position " + where);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    @kotlin.time.ExperimentalTime
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.time.InstantParseResult parseIso(java.lang.CharSequence r10) {
        /*
            Method dump skipped, instruction units count: 2171
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.InstantKt.parseIso(java.lang.CharSequence):kotlin.time.InstantParseResult");
    }

    private static final boolean parseIso$lambda$0(char it) {
        return it == '-';
    }

    private static final boolean parseIso$lambda$2(char it) {
        return it == '-';
    }

    private static final boolean parseIso$lambda$4(char it) {
        return it == 'T' || it == 't';
    }

    private static final boolean parseIso$lambda$6(char it) {
        return it == ':';
    }

    private static final boolean parseIso$lambda$8(char it) {
        return it == ':';
    }

    private static final boolean parseIso$lambda$10(char it) {
        return '0' <= it && it < ':';
    }

    private static final int parseIso$twoDigitNumber(CharSequence s, int index) {
        return ((s.charAt(index) - '0') * 10) + (s.charAt(index + 1) - '0');
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalTime
    public static final String formatIso(Instant instant) throws IOException {
        StringBuilder $this$formatIso_u24lambda_u2413 = new StringBuilder();
        UnboundLocalDateTime ldt = UnboundLocalDateTime.Companion.fromInstant(instant);
        int number = ldt.getYear();
        if (Math.abs(number) < MILLIS_PER_SECOND) {
            StringBuilder innerBuilder = new StringBuilder();
            if (number >= 0) {
                Intrinsics.checkNotNullExpressionValue(innerBuilder.append(number + 10000).deleteCharAt(0), "deleteCharAt(...)");
            } else {
                Intrinsics.checkNotNullExpressionValue(innerBuilder.append(number - 10000).deleteCharAt(1), "deleteCharAt(...)");
            }
            $this$formatIso_u24lambda_u2413.append((CharSequence) innerBuilder);
        } else {
            if (number >= 10000) {
                $this$formatIso_u24lambda_u2413.append('+');
            }
            $this$formatIso_u24lambda_u2413.append(number);
        }
        $this$formatIso_u24lambda_u2413.append('-');
        formatIso$lambda$13$appendTwoDigits($this$formatIso_u24lambda_u2413, $this$formatIso_u24lambda_u2413, ldt.getMonth());
        $this$formatIso_u24lambda_u2413.append('-');
        formatIso$lambda$13$appendTwoDigits($this$formatIso_u24lambda_u2413, $this$formatIso_u24lambda_u2413, ldt.getDay());
        $this$formatIso_u24lambda_u2413.append('T');
        formatIso$lambda$13$appendTwoDigits($this$formatIso_u24lambda_u2413, $this$formatIso_u24lambda_u2413, ldt.getHour());
        $this$formatIso_u24lambda_u2413.append(':');
        formatIso$lambda$13$appendTwoDigits($this$formatIso_u24lambda_u2413, $this$formatIso_u24lambda_u2413, ldt.getMinute());
        $this$formatIso_u24lambda_u2413.append(':');
        formatIso$lambda$13$appendTwoDigits($this$formatIso_u24lambda_u2413, $this$formatIso_u24lambda_u2413, ldt.getSecond());
        if (ldt.getNanosecond() != 0) {
            $this$formatIso_u24lambda_u2413.append('.');
            int zerosToStrip = 0;
            while (ldt.getNanosecond() % POWERS_OF_TEN[zerosToStrip + 1] == 0) {
                zerosToStrip++;
            }
            int zerosToStrip2 = zerosToStrip - (zerosToStrip % 3);
            int numberToOutput = ldt.getNanosecond() / POWERS_OF_TEN[zerosToStrip2];
            String strValueOf = String.valueOf(numberToOutput + POWERS_OF_TEN[9 - zerosToStrip2]);
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            $this$formatIso_u24lambda_u2413.append(strSubstring);
        }
        $this$formatIso_u24lambda_u2413.append('Z');
        return $this$formatIso_u24lambda_u2413.toString();
    }

    private static final void formatIso$lambda$13$appendTwoDigits(Appendable $this$formatIso_u24lambda_u2413_u24appendTwoDigits, StringBuilder $this_buildString, int number) throws IOException {
        if (number < 10) {
            $this$formatIso_u24lambda_u2413_u24appendTwoDigits.append('0');
        }
        $this_buildString.append(number);
    }

    private static final long safeAddOrElse(long a, long b, Function0 action) {
        long sum = a + b;
        if ((a ^ sum) < 0 && (a ^ b) >= 0) {
            action.invoke();
            throw new KotlinNothingValueException();
        }
        return sum;
    }

    private static final long safeMultiplyOrElse(long a, long b, Function0 action) {
        if (b == 1) {
            return a;
        }
        if (a == 1) {
            return b;
        }
        if (a == 0 || b == 0) {
            return 0L;
        }
        long total = a * b;
        if (total / b != a || ((a == Long.MIN_VALUE && b == -1) || (b == Long.MIN_VALUE && a == -1))) {
            action.invoke();
            throw new KotlinNothingValueException();
        }
        return total;
    }

    public static final boolean isLeapYear(int year) {
        return (year & 3) == 0 && (year % 100 != 0 || year % PredefinedFontWeight.NORMAL_WEIGHT == 0);
    }

    private static final int monthLength(int $this$monthLength, boolean isLeapYear) {
        switch ($this$monthLength) {
            case 2:
                return isLeapYear ? 29 : 28;
            case 3:
            case AbstractJsonLexerKt.TC_COLON /* 5 */:
            case AbstractJsonLexerKt.TC_END_OBJ /* 7 */:
            case 8:
            case 10:
            default:
                return 31;
            case 4:
            case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
            case AbstractJsonLexerKt.TC_END_LIST /* 9 */:
            case 11:
                return 30;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage(CharSequence $this$truncateForErrorMessage, int maxLength) {
        return $this$truncateForErrorMessage.length() <= maxLength ? $this$truncateForErrorMessage.toString() : $this$truncateForErrorMessage.subSequence(0, maxLength).toString() + "...";
    }
}
