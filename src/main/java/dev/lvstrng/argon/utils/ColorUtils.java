package dev.lvstrng.argon.utils;

import java.awt.Color;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/ColorUtils.class */
public final class ColorUtils {
    public static Color getBreathingRGBColor(int increment, int alpha) {
        Color color = Color.getHSBColor((((System.currentTimeMillis() * 3) + ((long) (increment * 175))) % 7200) / 7200.0f, 0.6f, 1.0f);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
    }

    public static Color getMainColor(Color color, int n, int n2) {
        float[] fArray = {0.0f, 0.0f, 0.25f + ((0.75f * f) % 2.0f)};
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), fArray);
        float f = Math.abs(((((System.currentTimeMillis() % 2000) / 1000.0f) + ((n / n2) * 2.0f)) % 2.0f) - 1.0f);
        int rgb = Color.HSBtoRGB(fArray[0], fArray[1], fArray[2]);
        return new Color((rgb >> 16) & 255, (rgb >> 8) & 255, rgb & 255, color.getAlpha());
    }

    public static Color smoothColorTransition(float speed, Color toColor, Color fromColor) {
        return new Color((int) MathUtils.goodLerp(speed, fromColor.getRed(), toColor.getRed()), (int) MathUtils.goodLerp(speed, fromColor.getGreen(), toColor.getGreen()), (int) MathUtils.goodLerp(speed, fromColor.getBlue(), toColor.getBlue()));
    }

    public static Color smoothAlphaTransition(float speed, int toAlpha, Color fromColor) {
        return new Color(fromColor.getRed(), fromColor.getGreen(), fromColor.getBlue(), (int) MathUtils.goodLerp(speed, fromColor.getAlpha(), toAlpha));
    }
}
