package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.attributes.HasMatchName;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.google.errorprone.annotations.Immutable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/PredefinedFontSize.class */
@Immutable
public enum PredefinedFontSize implements HasMatchName, FontSize {
    xxSmall("xx-small", 0.6f),
    xSmall("x-small", 0.75f),
    small(0.8888889f),
    medium(1.0f),
    large(1.2f),
    xLarge("x-large", 1.5f),
    xxLarge("xx-large", 2.0f),
    xxxLarge("xxx-large", 3.0f),
    larger(1.3f),
    smaller(0.7f),
    Number(0.0f);


    @NotNull
    private final String matchName;
    private final float scalingFactor;

    PredefinedFontSize(@NotNull String matchName, float scalingFactor) {
        this.matchName = matchName;
        this.scalingFactor = scalingFactor;
    }

    PredefinedFontSize(float scalingFactor) {
        this.scalingFactor = scalingFactor;
        this.matchName = name();
    }

    @Override // com.github.weisj.jsvg.attributes.HasMatchName
    @NotNull
    public String matchName() {
        return this.matchName;
    }

    @Override // com.github.weisj.jsvg.attributes.font.FontSize
    @NotNull
    public Length size(@NotNull Length parentSize) {
        if (this == Number) {
            throw new UnsupportedOperationException("Number font-size needs to parsed explicitly");
        }
        return (this == smaller || this == larger) ? parentSize.multiply(this.scalingFactor) : Unit.Raw.valueOf(SVGFont.defaultFontSize() * this.scalingFactor);
    }
}
