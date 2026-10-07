package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DurationJvm.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/DurationJvmKt.class */
public final class DurationJvmKt {
    private static final boolean durationAssertionsEnabled = Duration.class.desiredAssertionStatus();

    @NotNull
    private static final ThreadLocal<DecimalFormat>[] precisionFormats;

    public static final boolean getDurationAssertionsEnabled() {
        return durationAssertionsEnabled;
    }

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        precisionFormats = threadLocalArr;
    }

    private static final DecimalFormat createFormatForDecimals(int decimals) {
        DecimalFormat $this$createFormatForDecimals_u24lambda_u240 = new DecimalFormat("0");
        if (decimals > 0) {
            $this$createFormatForDecimals_u24lambda_u240.setMinimumFractionDigits(decimals);
        }
        $this$createFormatForDecimals_u24lambda_u240.setRoundingMode(RoundingMode.HALF_UP);
        return $this$createFormatForDecimals_u24lambda_u240;
    }

    @NotNull
    public static final String formatToExactDecimals(double value, int decimals) {
        DecimalFormat decimalFormatCreateFormatForDecimals;
        if (decimals < precisionFormats.length) {
            ThreadLocal<DecimalFormat> threadLocal = precisionFormats[decimals];
            DecimalFormat decimalFormat = threadLocal.get();
            if (decimalFormat == null) {
                DecimalFormat decimalFormatCreateFormatForDecimals2 = createFormatForDecimals(decimals);
                threadLocal.set(decimalFormatCreateFormatForDecimals2);
                decimalFormat = decimalFormatCreateFormatForDecimals2;
            }
            decimalFormatCreateFormatForDecimals = decimalFormat;
        } else {
            decimalFormatCreateFormatForDecimals = createFormatForDecimals(decimals);
        }
        DecimalFormat format = decimalFormatCreateFormatForDecimals;
        String str = format.format(value);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
