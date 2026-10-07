package com.github.weisj.jsvg.util;

import java.awt.Color;
import kotlin.KotlinVersion;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/util/ColorUtil.class */
public final class ColorUtil {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !ColorUtil.class.desiredAssertionStatus();
    }

    private ColorUtil() {
    }

    public static Color withAlpha(@NotNull Color c, float alpha) {
        int a = Math.max(Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (int) (alpha * 255.0f)), 0);
        return new Color(c.getRed(), c.getGreen(), c.getBlue(), a);
    }

    public static String toString(@Nullable Color c) {
        return c == null ? AbstractJsonLexerKt.NULL : String.format("Color[%d,%d,%d,%d]", Integer.valueOf(c.getRed()), Integer.valueOf(c.getGreen()), Integer.valueOf(c.getBlue()), Integer.valueOf(c.getAlpha()));
    }

    public static void RGBtoHSL(int r, int g, int b, float[] hsl) {
        float minComponent;
        float maxComponent;
        float s;
        float h;
        if (r < 0) {
            r = 0;
        } else if (r > 255) {
            r = 255;
        }
        if (g < 0) {
            g = 0;
        } else if (g > 255) {
            g = 255;
        }
        if (b < 0) {
            b = 0;
        } else if (b > 255) {
            b = 255;
        }
        float componentR = r / 255.0f;
        float componentG = g / 255.0f;
        float componentB = b / 255.0f;
        if (componentR > componentG) {
            minComponent = componentG;
            maxComponent = componentR;
        } else {
            minComponent = componentR;
            maxComponent = componentG;
        }
        if (componentB > maxComponent) {
            maxComponent = componentB;
        }
        if (componentB < minComponent) {
            minComponent = componentB;
        }
        float deltaMax = maxComponent - minComponent;
        float l = (maxComponent + minComponent) / 2.0f;
        if (deltaMax - 0.01f <= 0.0f) {
            h = 0.0f;
            s = 0.0f;
        } else {
            if (l < 0.5f) {
                if (!$assertionsDisabled && maxComponent + minComponent == 0.0f) {
                    throw new AssertionError();
                }
                s = deltaMax / (maxComponent + minComponent);
            } else {
                s = deltaMax / ((2.0f - maxComponent) - minComponent);
            }
            if (!$assertionsDisabled && deltaMax <= 0.0f) {
                throw new AssertionError();
            }
            float deltaR = (((maxComponent - componentR) / 6.0f) + (deltaMax / 2.0f)) / deltaMax;
            float deltaG = (((maxComponent - componentG) / 6.0f) + (deltaMax / 2.0f)) / deltaMax;
            float deltaB = (((maxComponent - componentB) / 6.0f) + (deltaMax / 2.0f)) / deltaMax;
            if (componentR == maxComponent) {
                h = deltaB - deltaG;
            } else if (componentG == maxComponent) {
                h = (0.33333334f + deltaR) - deltaB;
            } else {
                h = (0.6666667f + deltaG) - deltaR;
            }
            if (h < 0.0f) {
                h += 1.0f;
            }
            if (h > 1.0f) {
                h -= 1.0f;
            }
        }
        hsl[0] = h;
        hsl[1] = s;
        hsl[2] = l;
    }

    public static void HSLtoRGB(float h, float s, float l, int[] rgb) {
        float y;
        int r;
        int g;
        int b;
        if (h < 0.0f) {
            h = 0.0f;
        } else if (h > 1.0f) {
            h = 1.0f;
        }
        if (s < 0.0f) {
            s = 0.0f;
        } else if (s > 1.0f) {
            s = 1.0f;
        }
        if (l < 0.0f) {
            l = 0.0f;
        } else if (l > 1.0f) {
            l = 1.0f;
        }
        if (s - 0.01f <= 0.0f) {
            r = (int) (l * 255.0f);
            g = (int) (l * 255.0f);
            b = (int) (l * 255.0f);
        } else {
            if (l < 0.5f) {
                y = l * (1.0f + s);
            } else {
                y = (l + s) - (s * l);
            }
            float x = (2.0f * l) - y;
            r = (int) (255.0f * hue2RGB(x, y, h + 0.33333334f));
            g = (int) (255.0f * hue2RGB(x, y, h));
            b = (int) (255.0f * hue2RGB(x, y, h - 0.33333334f));
        }
        rgb[0] = r;
        rgb[1] = g;
        rgb[2] = b;
    }

    private static float hue2RGB(float v1, float v2, float vH) {
        if (vH < 0.0f) {
            vH += 1.0f;
        }
        if (vH > 1.0f) {
            vH -= 1.0f;
        }
        if (6.0f * vH < 1.0f) {
            return v1 + ((v2 - v1) * 6.0f * vH);
        }
        if (2.0f * vH < 1.0f) {
            return v2;
        }
        if (3.0f * vH < 2.0f) {
            return v1 + ((v2 - v1) * (0.6666667f - vH) * 6.0f);
        }
        return v1;
    }
}
