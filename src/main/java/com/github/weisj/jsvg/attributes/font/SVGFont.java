package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.nodes.text.Glyph;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/SVGFont.class */
public interface SVGFont {
    @NotNull
    Glyph codepointGlyph(char c);

    @NotNull
    String family();

    int size();

    float effectiveExHeight();

    float effectiveEmHeight();

    float mathematicalBaseline();

    float hangingBaseline();

    float romanBaseline();

    float centerBaseline();

    float middleBaseline();

    float textUnderBaseline();

    float textOverBaseline();

    static float defaultFontSize() {
        return 10.0f;
    }

    static float exFromEm(float em) {
        return em / 2.0f;
    }

    static float emFromEx(float ex) {
        return 2.0f * ex;
    }
}
