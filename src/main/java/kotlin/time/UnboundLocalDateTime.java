package kotlin.time;

import com.github.weisj.jsvg.attributes.font.PredefinedFontWeight;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Instant.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/UnboundLocalDateTime.class */
@ExperimentalTime
final class UnboundLocalDateTime {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int year;
    private final int month;
    private final int day;
    private final int hour;
    private final int minute;
    private final int second;
    private final int nanosecond;

    public UnboundLocalDateTime(int year, int month, int day, int hour, int minute, int second, int nanosecond) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.nanosecond = nanosecond;
    }

    public final int getYear() {
        return this.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final int getSecond() {
        return this.second;
    }

    public final int getNanosecond() {
        return this.nanosecond;
    }

    public final <T> T toInstant(int offsetSeconds, @NotNull Function2<? super Long, ? super Integer, ? extends T> buildInstant) {
        long total;
        Intrinsics.checkNotNullParameter(buildInstant, "buildInstant");
        UnboundLocalDateTime $this$toInstant_u24lambda_u241 = this;
        long y = $this$toInstant_u24lambda_u241.getYear();
        long total2 = ((long) 365) * y;
        if (y >= 0) {
            total = total2 + (((y + ((long) 3)) / ((long) 4)) - ((y + ((long) 99)) / ((long) 100))) + ((y + ((long) 399)) / ((long) PredefinedFontWeight.NORMAL_WEIGHT));
        } else {
            total = total2 - (((y / ((long) (-4))) - (y / ((long) (-100)))) + (y / ((long) (-400))));
        }
        long total3 = total + ((long) (((367 * $this$toInstant_u24lambda_u241.getMonth()) - 362) / 12)) + ((long) ($this$toInstant_u24lambda_u241.getDay() - 1));
        if ($this$toInstant_u24lambda_u241.getMonth() > 2) {
            total3--;
            if (!InstantKt.isLeapYear($this$toInstant_u24lambda_u241.getYear())) {
                total3--;
            }
        }
        long epochDays = total3 - ((long) 719528);
        int daySeconds = ($this$toInstant_u24lambda_u241.getHour() * 3600) + ($this$toInstant_u24lambda_u241.getMinute() * 60) + $this$toInstant_u24lambda_u241.getSecond();
        long epochSeconds = ((epochDays * ((long) 86400)) + ((long) daySeconds)) - ((long) offsetSeconds);
        return buildInstant.invoke(Long.valueOf(epochSeconds), Integer.valueOf(getNanosecond()));
    }

    @NotNull
    public String toString() {
        return "UnboundLocalDateTime(" + this.year + '-' + this.month + '-' + this.day + ' ' + this.hour + ':' + this.minute + ':' + this.second + '.' + this.nanosecond + ')';
    }

    /* JADX INFO: compiled from: Instant.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/UnboundLocalDateTime$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final UnboundLocalDateTime fromInstant(@NotNull Instant instant) {
            Intrinsics.checkNotNullParameter(instant, "instant");
            long localSecond = instant.getEpochSeconds();
            long j = localSecond / 86400;
            if ((localSecond ^ 86400) < 0 && j * 86400 != localSecond) {
                j--;
            }
            long epochDays = j;
            long j2 = localSecond % 86400;
            int secsOfDay = (int) (j2 + (86400 & (((j2 ^ 86400) & (j2 | (-j2))) >> 63)));
            long zeroDay = (epochDays + ((long) 719528)) - ((long) 60);
            long adjust = 0;
            if (zeroDay < 0) {
                long adjustCycles = ((zeroDay + 1) / ((long) 146097)) - 1;
                adjust = adjustCycles * ((long) PredefinedFontWeight.NORMAL_WEIGHT);
                zeroDay += (-adjustCycles) * ((long) 146097);
            }
            long yearEst = ((((long) PredefinedFontWeight.NORMAL_WEIGHT) * zeroDay) + ((long) 591)) / ((long) 146097);
            long doyEst = zeroDay - ((((((long) 365) * yearEst) + (yearEst / ((long) 4))) - (yearEst / ((long) 100))) + (yearEst / ((long) PredefinedFontWeight.NORMAL_WEIGHT)));
            if (doyEst < 0) {
                yearEst--;
                doyEst = zeroDay - ((((((long) 365) * yearEst) + (yearEst / ((long) 4))) - (yearEst / ((long) 100))) + (yearEst / ((long) PredefinedFontWeight.NORMAL_WEIGHT)));
            }
            int marchDoy0 = (int) doyEst;
            int marchMonth0 = ((marchDoy0 * 5) + 2) / 153;
            int month = ((marchMonth0 + 2) % 12) + 1;
            int day = (marchDoy0 - (((marchMonth0 * 306) + 5) / 10)) + 1;
            int year = (int) (yearEst + adjust + ((long) (marchMonth0 / 10)));
            int hours = secsOfDay / 3600;
            int secondWithoutHours = secsOfDay - (hours * 3600);
            int minutes = secondWithoutHours / 60;
            int second = secondWithoutHours - (minutes * 60);
            return new UnboundLocalDateTime(year, month, day, hours, minutes, second, instant.getNanosecondsOfSecond());
        }
    }
}
