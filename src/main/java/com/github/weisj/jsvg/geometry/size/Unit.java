package com.github.weisj.jsvg.geometry.size;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/size/Unit.class */
public enum Unit {
    PX,
    CM,
    MM,
    IN,
    EM,
    REM,
    EX,
    PT,
    PC,
    PERCENTAGE("%"),
    Raw("");

    private static final Unit[] units = values();

    @NotNull
    private final String suffix;

    public static Unit[] units() {
        return units;
    }

    Unit(@NotNull String suffix) {
        this.suffix = suffix;
    }

    Unit() {
        this.suffix = name().toLowerCase(Locale.ENGLISH);
    }

    @NotNull
    public Length valueOf(float value) {
        return value == 0.0f ? Length.ZERO : new Length(this, value);
    }

    @NotNull
    public String suffix() {
        return this.suffix;
    }
}
