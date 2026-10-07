package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.AngleUnit;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.parser.SeparatorMode;
import com.github.weisj.jsvg.util.ParserBase;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/AttributeParser.class */
public final class AttributeParser {

    @NotNull
    private final PaintParser paintParser;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s");
    private static final Pattern TRANSFORM_PATTERN = Pattern.compile("\\w+\\([^)]*\\)");

    public AttributeParser(@NotNull PaintParser paintParser) {
        this.paintParser = paintParser;
    }

    @Contract("_,!null -> !null")
    @Nullable
    public Length parseLength(@Nullable String value, @Nullable Length fallback) {
        if (value == null) {
            return fallback;
        }
        Unit unit = Unit.Raw;
        String lower = value.toLowerCase(Locale.ENGLISH);
        Unit[] unitArrUnits = Unit.units();
        int length = unitArrUnits.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Unit u = unitArrUnits[i];
            if (!lower.endsWith(u.suffix())) {
                i++;
            } else {
                unit = u;
                break;
            }
        }
        String str = lower.substring(0, lower.length() - unit.suffix().length());
        try {
            return unit.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException e) {
            return fallback;
        }
    }

    public float parsePercentage(@Nullable String value, float fallback) {
        return parsePercentage(value, fallback, 0.0f, 1.0f);
    }

    public float parsePercentage(@Nullable String value, float fallback, float min, float max) {
        float parsed;
        if (value == null) {
            return fallback;
        }
        try {
            if (value.endsWith("%")) {
                parsed = Float.parseFloat(value.substring(0, value.length() - 1)) / 100.0f;
            } else {
                parsed = Float.parseFloat(value);
            }
            return Math.max(min, Math.min(max, parsed));
        } catch (NumberFormatException e) {
            return fallback;
        }
    }

    public int parseInt(@Nullable String value, int fallback) {
        if (value == null) {
            return fallback;
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return fallback;
        }
    }

    public float parseFloat(@Nullable String value, float fallback) {
        if (value == null) {
            return fallback;
        }
        try {
            return Float.parseFloat(value);
        } catch (NumberFormatException e) {
            return fallback;
        }
    }

    public double parseDouble(@Nullable String value, double fallback) {
        if (value == null) {
            return fallback;
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return fallback;
        }
    }

    public float parseAngle(@Nullable String value, float fallback) {
        if (value == null) {
            return fallback;
        }
        AngleUnit unit = AngleUnit.Raw;
        String lower = value.toLowerCase(Locale.ENGLISH);
        AngleUnit[] angleUnitArrUnits = AngleUnit.units();
        int length = angleUnitArrUnits.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AngleUnit u = angleUnitArrUnits[i];
            if (!lower.endsWith(u.suffix())) {
                i++;
            } else {
                unit = u;
                break;
            }
        }
        String str = lower.substring(0, lower.length() - unit.suffix().length());
        try {
            return unit.toRadians(Float.parseFloat(str), AngleUnit.Deg);
        } catch (NumberFormatException e) {
            return fallback;
        }
    }

    public Length[] parseLengthList(@Nullable String value) {
        if (value != null && value.equalsIgnoreCase("none")) {
            return new Length[0];
        }
        String[] values = parseStringList(value, SeparatorMode.COMMA_AND_WHITESPACE);
        Length[] ret = new Length[values.length];
        for (int i = 0; i < ret.length; i++) {
            Length length = parseLength(values[i], null);
            if (length == null) {
                return new Length[0];
            }
            ret[i] = length;
        }
        return ret;
    }

    public float[] parseFloatList(@Nullable String value) {
        String[] values = parseStringList(value, SeparatorMode.COMMA_AND_WHITESPACE);
        float[] ret = new float[values.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = parseFloat(values[i], 0.0f);
        }
        return ret;
    }

    public double[] parseDoubleList(@Nullable String value) {
        if (value == null || value.isEmpty()) {
            return new double[0];
        }
        List<Double> list = new ArrayList<>();
        ParserBase base = new ParserBase(value, 0);
        while (base.hasNext()) {
            list.add(Double.valueOf(base.nextDouble()));
            base.consumeWhiteSpaceOrSeparator();
        }
        return list.stream().mapToDouble((v0) -> {
            return v0.doubleValue();
        }).toArray();
    }

    @NotNull
    public String[] parseStringList(@Nullable String value, SeparatorMode separatorMode) {
        if (value == null || value.isEmpty()) {
            return new String[0];
        }
        List<String> list = new ArrayList<>();
        int max = value.length();
        int start = 0;
        int i = 0;
        boolean inWhiteSpace = false;
        while (i < max) {
            char c = value.charAt(i);
            if (Character.isWhitespace(c)) {
                if (!inWhiteSpace && separatorMode != SeparatorMode.COMMA_ONLY && i - start > 0) {
                    list.add(value.substring(start, i));
                    start = i + 1;
                }
                inWhiteSpace = true;
            } else {
                inWhiteSpace = false;
                if (c == ',' && separatorMode != SeparatorMode.WHITESPACE_ONLY) {
                    list.add(value.substring(start, i));
                    start = i + 1;
                }
            }
            i++;
        }
        if (i - start > 0) {
            list.add(value.substring(start, i));
        }
        return (String[]) list.toArray(new String[0]);
    }

    @Nullable
    public SVGPaint parsePaint(@Nullable String value, @NotNull AttributeNode attributeNode) {
        return this.paintParser.parsePaint(value, attributeNode);
    }

    @NotNull
    public <E extends Enum<E>> E parseEnum(@Nullable String str, @NotNull E e) {
        E e2 = (E) parseEnum(str, e.getDeclaringClass());
        return e2 == null ? e : e2;
    }

    @Nullable
    public <E extends Enum<E>> E parseEnum(@Nullable String value, @NotNull Class<E> enumType) {
        String strName;
        if (value == null) {
            return null;
        }
        for (E enumConstant : enumType.getEnumConstants()) {
            if (enumConstant instanceof HasMatchName) {
                strName = ((HasMatchName) enumConstant).matchName();
            } else {
                strName = enumConstant.name();
            }
            String name = strName;
            if (name.equalsIgnoreCase(value)) {
                return enumConstant;
            }
        }
        return null;
    }

    @NotNull
    private String removeWhiteSpace(@NotNull String value) {
        return WHITESPACE_PATTERN.matcher(value).replaceAll("");
    }

    @Nullable
    public String parseUrl(@Nullable String value) {
        if (value == null) {
            return null;
        }
        return (value.startsWith("url(") && value.endsWith(")")) ? removeWhiteSpace(value.substring(4, value.length() - 1)) : removeWhiteSpace(value);
    }

    @Nullable
    public AffineTransform parseTransform(@Nullable String value) {
        if (value == null) {
            return null;
        }
        Matcher transformMatcher = TRANSFORM_PATTERN.matcher(value);
        AffineTransform transform = new AffineTransform();
        while (transformMatcher.find()) {
            String group = transformMatcher.group();
            try {
                parseSingleTransform(group, transform);
            } catch (Exception e) {
                throw new IllegalArgumentException("Illegal transform definition '" + value + "' encountered error while parsing '" + group + "'", e);
            }
        }
        return transform;
    }

    private void parseSingleTransform(@NotNull String value, @NotNull AffineTransform tx) {
        String command;
        double[] values;
        int first = value.indexOf(40);
        int last = value.lastIndexOf(41);
        command = value.substring(0, value.indexOf(40)).toLowerCase(Locale.ENGLISH);
        values = parseDoubleList(value.substring(first + 1, last));
        switch (command) {
            case "matrix":
                tx.concatenate(new AffineTransform(values));
                return;
            case "translate":
                if (values.length == 1) {
                    tx.translate(values[0], 0.0d);
                    return;
                } else {
                    tx.translate(values[0], values[1]);
                    return;
                }
            case "translatex":
                tx.translate(values[0], 0.0d);
                return;
            case "translatey":
                tx.translate(0.0d, values[0]);
                return;
            case "scale":
                if (values.length == 1) {
                    tx.scale(values[0], values[0]);
                    return;
                } else {
                    tx.scale(values[0], values[1]);
                    return;
                }
            case "scalex":
                tx.scale(values[0], 1.0d);
                return;
            case "scaley":
                tx.scale(1.0d, values[0]);
                return;
            case "rotate":
                if (values.length > 2) {
                    tx.rotate(Math.toRadians(values[0]), values[1], values[2]);
                    return;
                } else {
                    tx.rotate(Math.toRadians(values[0]));
                    return;
                }
            case "skewx":
                tx.shear(Math.tan(Math.toRadians(values[0])), 0.0d);
                return;
            case "skewy":
                tx.shear(0.0d, Math.tan(Math.toRadians(values[0])));
                return;
            default:
                throw new IllegalArgumentException("Unknown transform type: " + command);
        }
    }

    @NotNull
    public PaintParser paintParser() {
        return this.paintParser;
    }
}
