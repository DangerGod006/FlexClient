package com.github.weisj.jsvg.geometry.size;

import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/size/Length.class */
@Immutable
public final class Length {
    public static final float UNSPECIFIED_RAW = Float.NaN;

    @NotNull
    public static final Length UNSPECIFIED;

    @NotNull
    public static final Length ZERO;

    @NotNull
    private final Unit unit;
    private final float value;
    private static final float pixelsPerInch = 96.0f;
    private static final float inchesPerCm = 0.3936f;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !Length.class.desiredAssertionStatus();
        UNSPECIFIED = new Length(Unit.Raw, Float.NaN);
        ZERO = new Length(Unit.Raw, 0.0f);
    }

    public Length(@NotNull Unit unit, float value) {
        this.unit = unit;
        this.value = value;
    }

    public static boolean isUnspecified(float value) {
        return Float.isNaN(value);
    }

    public static boolean isSpecified(float value) {
        return !isUnspecified(value);
    }

    private float resolveNonPercentage(@NotNull MeasureContext context) {
        if (isUnspecified()) {
            throw new IllegalStateException("Can't resolve size of unspecified length");
        }
        if (this.unit == Unit.Raw) {
            return this.value;
        }
        if (!$assertionsDisabled && this.unit == Unit.PERCENTAGE) {
            throw new AssertionError();
        }
        switch (AnonymousClass1.$SwitchMap$com$github$weisj$jsvg$geometry$size$Unit[this.unit.ordinal()]) {
            case 1:
                return this.value;
            case 2:
                return pixelsPerInch * this.value;
            case 3:
                return 37.7856f * this.value;
            case 4:
                return 3.7785597f * this.value;
            case AbstractJsonLexerKt.TC_COLON /* 5 */:
                return 1.3333334f * this.value;
            case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                return 16.0f * this.value;
            case AbstractJsonLexerKt.TC_END_OBJ /* 7 */:
                return context.em() * this.value;
            case 8:
                return context.rem() * this.value;
            case AbstractJsonLexerKt.TC_END_LIST /* 9 */:
                return context.ex() * this.value;
            default:
                throw new UnsupportedOperationException("Not implemented: Can't convert " + this.unit + " to pixel");
        }
    }

    /* JADX INFO: renamed from: com.github.weisj.jsvg.geometry.size.Length$1, reason: invalid class name */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/size/Length$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$weisj$jsvg$geometry$size$Unit = new int[Unit.values().length];

        static {
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$Unit[Unit.PX.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$Unit[Unit.IN.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$Unit[Unit.CM.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$Unit[Unit.MM.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$Unit[Unit.PT.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$Unit[Unit.PC.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$Unit[Unit.EM.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$Unit[Unit.REM.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$geometry$size$Unit[Unit.EX.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    public float resolveWidth(@NotNull MeasureContext context) {
        if (this.unit == Unit.PERCENTAGE) {
            return (this.value * context.viewWidth()) / 100.0f;
        }
        return resolveNonPercentage(context);
    }

    public float resolveHeight(@NotNull MeasureContext context) {
        if (this.unit == Unit.PERCENTAGE) {
            return (this.value * context.viewHeight()) / 100.0f;
        }
        return resolveNonPercentage(context);
    }

    public float resolveLength(@NotNull MeasureContext context) {
        if (this.unit == Unit.PERCENTAGE) {
            return (this.value / 100.0f) * context.normedDiagonalLength();
        }
        return resolveNonPercentage(context);
    }

    public float resolveFontSize(@NotNull MeasureContext context) {
        if (this.unit == Unit.PERCENTAGE) {
            return (this.value / 100.0f) * context.em();
        }
        return resolveNonPercentage(context);
    }

    public String toString() {
        return this.value + this.unit.suffix();
    }

    public boolean isZero() {
        return this.value == 0.0f;
    }

    public float raw() {
        return this.value;
    }

    @NotNull
    public Unit unit() {
        return this.unit;
    }

    public boolean isUnspecified() {
        return isUnspecified(raw());
    }

    public boolean isSpecified() {
        return !isUnspecified();
    }

    @NotNull
    public Length coerceNonNegative() {
        return (!isSpecified() || raw() > 0.0f) ? this : ZERO;
    }

    public Length orElseIfUnspecified(float value) {
        return isUnspecified() ? Unit.Raw.valueOf(value) : this;
    }

    public Length multiply(float scalingFactor) {
        return scalingFactor == 0.0f ? ZERO : new Length(unit(), scalingFactor * raw());
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Length)) {
            return false;
        }
        Length length = (Length) o;
        return this.unit == length.unit && Float.compare(length.value, this.value) == 0;
    }

    public int hashCode() {
        return Objects.hash(this.unit, Float.valueOf(this.value));
    }
}
