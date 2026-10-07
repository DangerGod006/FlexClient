package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.attributes.font.FontStyle;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.google.errorprone.annotations.Immutable;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.text.AttributedCharacterIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/FontResolver.class */
public final class FontResolver {
    private FontResolver() {
    }

    public static void clearFontCache() {
        FontCache.INSTANCE.cache.clear();
    }

    @NotNull
    public static SVGFont resolve(@NotNull MeasurableFontSpec fontSpec, @NotNull MeasureContext measureContext) {
        FontCache.CacheKey key = new FontCache.CacheKey(fontSpec, measureContext);
        SVGFont cachedFont = (SVGFont) FontCache.INSTANCE.cache.get(key);
        if (cachedFont != null) {
            return cachedFont;
        }
        SVGFont resolvedFont = resolveWithoutCache(fontSpec, measureContext);
        FontCache.INSTANCE.cache.put(key, resolvedFont);
        return resolvedFont;
    }

    @NotNull
    public static SVGFont resolveWithoutCache(@NotNull MeasurableFontSpec fontSpec, @NotNull MeasureContext measureContext) {
        Object family = findSupportedFontFamily(fontSpec);
        FontStyle style = fontSpec.style();
        float weight = cssWeightToAwtWeight(fontSpec.currentWeight());
        float size = fontSpec.effectiveSize(measureContext);
        float stretch = fontSpec.stretch();
        Map<AttributedCharacterIterator.Attribute, Object> attributes = new HashMap<>(5, 1.0f);
        attributes.put(TextAttribute.FAMILY, family);
        attributes.put(TextAttribute.SIZE, Float.valueOf(size));
        attributes.put(TextAttribute.WEIGHT, Float.valueOf(weight));
        attributes.put(TextAttribute.WIDTH, Float.valueOf(stretch));
        if (style instanceof FontStyle.Normal) {
            attributes.put(TextAttribute.POSTURE, TextAttribute.POSTURE_REGULAR);
        } else if (style instanceof FontStyle.Italic) {
            attributes.put(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE);
        } else {
            AffineTransform transform = style.transform();
            if (transform != null) {
                attributes.put(TextAttribute.TRANSFORM, transform);
            }
        }
        Font font = new Font(attributes);
        return new AWTSVGFont(font);
    }

    private static float cssWeightToAwtWeight(float weight) {
        float currentWeight = weight;
        if (currentWeight > PredefinedFontWeight.NORMAL_WEIGHT) {
            float awtWeightCompensationFactor = (TextAttribute.WEIGHT_BOLD.floatValue() * PredefinedFontWeight.NORMAL_WEIGHT) / 700.0f;
            currentWeight *= awtWeightCompensationFactor;
        }
        return currentWeight / PredefinedFontWeight.NORMAL_WEIGHT;
    }

    @NotNull
    private static String findSupportedFontFamily(@NotNull MeasurableFontSpec fontSpec) {
        String[] families = fontSpec.families();
        for (String family : families) {
            if (FontFamiliesCache.INSTANCE.isSupportedFontFamily(family)) {
                return family;
            }
        }
        return MeasurableFontSpec.DEFAULT_FONT_FAMILY_NAME;
    }

    @NotNull
    public static List<String> supportedFonts() {
        return Collections.unmodifiableList(Arrays.asList(FontFamiliesCache.INSTANCE.supportedFonts));
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/FontResolver$FontFamiliesCache.class */
    private enum FontFamiliesCache {
        INSTANCE;


        @NotNull
        private final String[] supportedFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        FontFamiliesCache() {
        }

        boolean isSupportedFontFamily(@NotNull String fontName) {
            for (String supportedFont : this.supportedFonts) {
                if (supportedFont.equalsIgnoreCase(fontName)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/FontResolver$FontCache.class */
    private enum FontCache {
        INSTANCE;

        private final HashMap<CacheKey, SVGFont> cache = new HashMap<>();

        FontCache() {
        }

        /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/FontResolver$FontCache$CacheKey.class */
        @Immutable
        private static final class CacheKey {

            @NotNull
            private final MeasurableFontSpec spec;

            @NotNull
            private final MeasureContext context;

            private CacheKey(@NotNull MeasurableFontSpec spec, @NotNull MeasureContext context) {
                this.spec = spec;
                this.context = context;
            }

            public String toString() {
                return "CacheKey{spec=" + this.spec + ", context=" + this.context + '}';
            }

            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof CacheKey)) {
                    return false;
                }
                CacheKey cacheKey = (CacheKey) o;
                return this.spec.equals(cacheKey.spec) && this.context.equals(cacheKey.context);
            }

            public int hashCode() {
                return Objects.hash(this.spec, this.context);
            }
        }
    }
}
