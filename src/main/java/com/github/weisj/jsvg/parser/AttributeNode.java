package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.attributes.AttributeParser;
import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.nodes.ClipPath;
import com.github.weisj.jsvg.nodes.Mask;
import com.github.weisj.jsvg.nodes.Style;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.parser.css.StyleSheet;
import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/AttributeNode.class */
public final class AttributeNode {
    private static final Length TopOrLeft = new Length(Unit.PERCENTAGE, 0.0f);
    private static final Length Center = new Length(Unit.PERCENTAGE, 50.0f);
    private static final Length BottomOrRight = new Length(Unit.PERCENTAGE, 100.0f);

    @NotNull
    private final String tagName;

    @NotNull
    private final Map<String, String> attributes;

    @Nullable
    private final AttributeNode parent;

    @NotNull
    private final Map<String, Object> namedElements;

    @NotNull
    private final List<StyleSheet> styleSheets;

    @NotNull
    private final LoadHelper loadHelper;

    public AttributeNode(@NotNull String tagName, @NotNull Map<String, String> attributes, @Nullable AttributeNode parent, @NotNull Map<String, Object> namedElements, @NotNull List<StyleSheet> styleSheets, @NotNull LoadHelper loadHelper) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.parent = parent;
        this.namedElements = namedElements;
        this.styleSheets = styleSheets;
        this.loadHelper = loadHelper;
    }

    void prepareForNodeBuilding(@NotNull ParsedElement parsedElement) {
        Map<String, String> styleSheetAttributes = new HashMap<>();
        preprocessAttributes(this.attributes, styleSheetAttributes);
        List<StyleSheet> sheets = styleSheets();
        for (int i = sheets.size() - 1; i >= 0; i--) {
            StyleSheet sheet = sheets.get(i);
            sheet.forEachMatchingRule(parsedElement, p -> {
                if (!styleSheetAttributes.containsKey(p.name())) {
                    styleSheetAttributes.put(p.name(), p.value());
                }
            });
        }
        this.attributes.putAll(styleSheetAttributes);
    }

    private static boolean isBlank(@NotNull String s) {
        return s.trim().isEmpty();
    }

    private static void preprocessAttributes(@NotNull Map<String, String> attributes, @NotNull Map<String, String> styleAttributes) {
        String styleStr = attributes.get(Style.TAG);
        if (styleStr != null && !isBlank(styleStr)) {
            String[] styles = styleStr.split(";");
            for (String style : styles) {
                if (!isBlank(style)) {
                    String[] styleDef = style.split(":", 2);
                    styleAttributes.put(styleDef[0].trim().toLowerCase(Locale.ENGLISH), styleDef[1].trim());
                }
            }
        }
    }

    @NotNull
    Map<String, Object> namedElements() {
        return this.namedElements;
    }

    @NotNull
    List<StyleSheet> styleSheets() {
        return this.styleSheets;
    }

    @Nullable
    private <T> T getElementById(@NotNull Class<T> type, @Nullable String id) {
        if (id == null) {
            return null;
        }
        Object node = this.namedElements.get(id);
        if (node instanceof ParsedElement) {
            node = ((ParsedElement) node).nodeEnsuringBuildStatus();
        }
        if (type.isInstance(node)) {
            return type.cast(node);
        }
        return null;
    }

    @Nullable
    private <T> T getElementByUrl(@NotNull Class<T> cls, @Nullable String str) {
        String url = this.loadHelper.attributeParser().parseUrl(str);
        if (url != null && url.startsWith("#")) {
            url = url.substring(1);
        }
        return (T) getElementById(cls, url);
    }

    @Nullable
    public <T> T getElementByHref(@NotNull Class<T> cls, @Nullable String str) {
        if (str == null) {
            return null;
        }
        return (T) getElementByUrl(cls, str);
    }

    @Nullable
    public <T> T getElementByHref(@NotNull Class<T> cls, @NotNull Category category, @Nullable String str) {
        T t = (T) getElementByHref(cls, str);
        if (t == null) {
            return null;
        }
        for (Category category2 : ((ElementCategories) t.getClass().getAnnotation(ElementCategories.class)).value()) {
            if (category2 == category) {
                return t;
            }
        }
        return null;
    }

    @NotNull
    public Map<String, String> attributes() {
        return this.attributes;
    }

    @NotNull
    public String tagName() {
        return this.tagName;
    }

    public boolean tagIsOneOf(@NotNull String... tags) {
        for (String tag : tags) {
            if (this.tagName.equals(tag)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public AttributeNode parent() {
        return this.parent;
    }

    @Nullable
    public String getValue(@NotNull String key) {
        return this.attributes.get(key);
    }

    @NotNull
    public Color getColor(@NotNull String key) {
        return getColor(key, PaintParser.DEFAULT_COLOR);
    }

    @Contract("_,!null -> !null")
    @Nullable
    public Color getColor(@NotNull String key, @Nullable Color fallback) {
        Color c;
        String value = getValue(key);
        if (value != null && (c = this.loadHelper.attributeParser().paintParser().parseColor(value.toLowerCase(Locale.ENGLISH), this)) != null) {
            return c;
        }
        return fallback;
    }

    @NotNull
    public SVGPaint getPaint(@NotNull String key, @NotNull SVGPaint fallback) {
        SVGPaint paint = getPaint(key);
        return paint != null ? paint : fallback;
    }

    @Nullable
    public SVGPaint getPaint(@NotNull String key) {
        String value = getValue(key);
        SVGPaint paint = (SVGPaint) getElementByUrl(SVGPaint.class, value);
        return paint != null ? paint : this.loadHelper.attributeParser().parsePaint(value, this);
    }

    @Nullable
    public Length getLength(@NotNull String key) {
        return getLengthInternal(key, null);
    }

    @NotNull
    public Length getLength(@NotNull String key, float fallback) {
        return getLength(key, Unit.Raw.valueOf(fallback));
    }

    @NotNull
    public Length getLength(@NotNull String key, @NotNull Length fallback) {
        return getLengthInternal(key, fallback);
    }

    @Contract("_,!null -> !null")
    @Nullable
    private Length getLengthInternal(@NotNull String key, @Nullable Length fallback) {
        return this.loadHelper.attributeParser().parseLength(getValue(key), fallback);
    }

    @NotNull
    public Length getHorizontalReferenceLength(@NotNull String key) {
        return parseReferenceLength(key, "left", "right");
    }

    @NotNull
    public Length getVerticalReferenceLength(@NotNull String key) {
        return parseReferenceLength(key, "top", "bottom");
    }

    @NotNull
    private Length parseReferenceLength(@NotNull String key, @NotNull String topLeft, @NotNull String bottomRight) {
        String value = getValue(key);
        if (topLeft.equals(value)) {
            return TopOrLeft;
        }
        if ("center".equals(value)) {
            return Center;
        }
        if (bottomRight.equals(value)) {
            return BottomOrRight;
        }
        return this.loadHelper.attributeParser().parseLength(value, Length.ZERO);
    }

    public float getPercentage(@NotNull String key, float fallback) {
        return this.loadHelper.attributeParser().parsePercentage(getValue(key), fallback);
    }

    @NotNull
    public Length[] getLengthList(@NotNull String key) {
        return this.loadHelper.attributeParser().parseLengthList(getValue(key));
    }

    public float[] getFloatList(@NotNull String key) {
        return this.loadHelper.attributeParser().parseFloatList(getValue(key));
    }

    public double[] getDoubleList(@NotNull String key) {
        return this.loadHelper.attributeParser().parseDoubleList(getValue(key));
    }

    @NotNull
    public <E extends Enum<E>> E getEnum(@NotNull String str, @NotNull E e) {
        return (E) this.loadHelper.attributeParser().parseEnum(getValue(str), e);
    }

    @Nullable
    public <E extends Enum<E>> E getEnumNullable(@NotNull String str, @NotNull Class<E> cls) {
        return (E) this.loadHelper.attributeParser().parseEnum(getValue(str), cls);
    }

    @Nullable
    public ClipPath getClipPath() {
        return (ClipPath) getElementByUrl(ClipPath.class, getValue("clip-path"));
    }

    @Nullable
    public Mask getMask() {
        return (Mask) getElementByUrl(Mask.class, getValue(Mask.TAG));
    }

    @Nullable
    public Filter getFilter() {
        return (Filter) getElementByUrl(Filter.class, getValue(Filter.TAG));
    }

    @NotNull
    public FilterChannelKey getFilterChannelKey(@NotNull String key, @NotNull DefaultFilterChannel fallback) {
        String in = getValue(key);
        return in == null ? fallback : new FilterChannelKey.StringKey(in);
    }

    @Nullable
    public AffineTransform parseTransform(@NotNull String key) {
        return this.loadHelper.attributeParser().parseTransform(getValue(key));
    }

    public boolean hasAttribute(@NotNull String name) {
        return this.attributes.containsKey(name);
    }

    @NotNull
    public String[] getStringList(@NotNull String name) {
        return getStringList(name, SeparatorMode.COMMA_AND_WHITESPACE);
    }

    @NotNull
    public String[] getStringList(@NotNull String name, SeparatorMode separatorMode) {
        return this.loadHelper.attributeParser().parseStringList(getValue(name), separatorMode);
    }

    public float getFloat(@NotNull String name, float fallback) {
        return this.loadHelper.attributeParser().parseFloat(getValue(name), fallback);
    }

    public float getNonNegativeFloat(@NotNull String name, float fallback) {
        float value = getFloat(name, fallback);
        return (!Float.isFinite(value) || value >= 0.0f) ? value : fallback;
    }

    public int getInt(@NotNull String key, int fallback) {
        return this.loadHelper.attributeParser().parseInt(getValue(key), fallback);
    }

    @Nullable
    public String getHref() {
        String href = getValue("href");
        return href == null ? getValue("xlink:href") : href;
    }

    @Nullable
    public ViewBox getViewBox() {
        float[] viewBoxCords = getFloatList("viewBox");
        if (viewBoxCords.length == 4) {
            return new ViewBox(viewBoxCords);
        }
        return null;
    }

    @NotNull
    public AttributeParser parser() {
        return this.loadHelper.attributeParser();
    }

    @NotNull
    public ResourceLoader resourceLoader() {
        return this.loadHelper.resourceLoader();
    }
}
