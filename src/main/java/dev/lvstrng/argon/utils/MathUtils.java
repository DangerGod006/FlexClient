package dev.lvstrng.argon.utils;

import java.util.Random;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/MathUtils.class */
public final class MathUtils {
    public static Random random = new Random(System.currentTimeMillis());

    public static double roundToDecimal(double n, double point) {
        return point * Math.round(n / point);
    }

    public static int randomInt(int start, int bound) {
        return random.nextInt(start, bound);
    }

    public static double smoothStepLerp(double delta, double start, double end) {
        double delta2 = Math.max(0.0d, Math.min(1.0d, delta));
        double t = delta2 * delta2 * (3.0d - (2.0d * delta2));
        double value = start + ((end - start) * t);
        return value;
    }

    public static double goodLerp(float delta, double start, double end) {
        int step = (int) Math.ceil(Math.abs(end - start) * ((double) delta));
        return start < end ? Math.min(start + ((double) step), end) : Math.max(start - ((double) step), end);
    }
}
