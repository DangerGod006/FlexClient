package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.attributes.HasMatchName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/FontStretch.class */
public enum FontStretch implements HasMatchName {
    Normal(1.0f),
    UltraCondensed(0.5f, "ultra-condensed"),
    ExtraCondensed(0.625f, "extra-condensed"),
    Condensed(0.75f, "condensed"),
    SemiCondensed(0.875f, "semi-condensed"),
    SemiExpanded(1.125f, "semi-expanded"),
    Expanded(1.25f),
    ExtraExpanded(1.5f, "extra-expanded"),
    UltraExpanded(2.0f, "ultra-expanded"),
    Percentage(-1.0f);

    private final float percentage;

    @NotNull
    private final String matchName;

    FontStretch(float percentage, @NotNull String matchName) {
        this.percentage = percentage;
        this.matchName = matchName;
    }

    FontStretch(float percentage) {
        this.percentage = percentage;
        this.matchName = name();
    }

    @Override // com.github.weisj.jsvg.attributes.HasMatchName
    @NotNull
    public String matchName() {
        return this.matchName;
    }

    public float percentage() {
        if (this == Percentage) {
            throw new UnsupportedOperationException("Percentage needs to be computed manually");
        }
        return this.percentage;
    }
}
