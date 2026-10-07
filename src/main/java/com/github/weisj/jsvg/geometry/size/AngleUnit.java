package com.github.weisj.jsvg.geometry.size;

import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/size/AngleUnit.class */
public enum AngleUnit {
    Deg,
    Grad,
    Rad,
    Turn,
    Raw("");

    private static final AngleUnit[] units = values();
    private static final double GRADIANS_TO_RADIANS = 0.015707962916848627d;

    @NotNull
    private final String suffix;

    public static AngleUnit[] units() {
        return units;
    }

    AngleUnit(@NotNull String suffix) {
        this.suffix = suffix;
    }

    AngleUnit() {
        this.suffix = name().toLowerCase(Locale.ENGLISH);
    }

    @NotNull
    public String suffix() {
        return this.suffix;
    }

    /* JADX INFO: renamed from: com.github.weisj.jsvg.geometry.size.AngleUnit$1, reason: invalid class name */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/size/AngleUnit$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$weisj$jsvg$geometry$size$AngleUnit = new int[AngleUnit.values().length];

        static {
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$AngleUnit[AngleUnit.Deg.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$AngleUnit[AngleUnit.Grad.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$AngleUnit[AngleUnit.Rad.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$AngleUnit[AngleUnit.Turn.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$AngleUnit[AngleUnit.Raw.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public float toRadians(float value, @NotNull AngleUnit rawReplacement) {
        if (rawReplacement == Raw) {
            throw new IllegalArgumentException("Cant replace raw unit with raw");
        }
        switch (AnonymousClass1.$SwitchMap$com$github$weisj$jsvg$geometry$size$AngleUnit[ordinal()]) {
            case 1:
                return (float) Math.toRadians(value);
            case 2:
                return (float) (((double) value) * GRADIANS_TO_RADIANS);
            case 3:
                return value;
            case 4:
                return (float) (((double) value) * 3.141592653589793d * 2.0d);
            case AbstractJsonLexerKt.TC_COLON /* 5 */:
                return rawReplacement.toRadians(value, rawReplacement);
            default:
                throw new IllegalArgumentException("Unknown angle unit " + this);
        }
    }
}
