package com.github.weisj.jsvg.attributes.filter;

import com.github.weisj.jsvg.attributes.HasMatchName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/filter/BlendMode.class */
public enum BlendMode implements HasMatchName {
    Normal,
    Multiply,
    Screen,
    Overlay,
    Darken,
    Lighten,
    ColorDodge("color-dodge"),
    ColorBurn("color-burn"),
    HardLight("hard-light"),
    SoftLight("soft-light"),
    Difference,
    Exclusion,
    Hue,
    Saturation,
    Color,
    Luminosity;


    @NotNull
    private final String matchName;

    BlendMode(@NotNull String matchName) {
        this.matchName = matchName;
    }

    BlendMode() {
        this.matchName = name();
    }

    @Override // com.github.weisj.jsvg.attributes.HasMatchName
    @NotNull
    public String matchName() {
        return this.matchName;
    }
}
