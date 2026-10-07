package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/MeasurableFontSpec.class */
@Immutable
public final class MeasurableFontSpec extends FontSpec {

    @NotNull
    public static final String DEFAULT_FONT_FAMILY_NAME = "Default";
    private final int currentWeight;

    @NotNull
    private final Length currentSize;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !MeasurableFontSpec.class.desiredAssertionStatus();
    }

    MeasurableFontSpec(@NotNull String[] families, @Nullable FontStyle style, @Nullable Length sizeAdjust, float stretch, int currentWeight, @NotNull Length currentSize) {
        super(families, style, sizeAdjust, stretch);
        this.currentWeight = currentWeight;
        this.currentSize = currentSize;
    }

    @NotNull
    public static MeasurableFontSpec createDefault() {
        return new MeasurableFontSpec(new String[]{DEFAULT_FONT_FAMILY_NAME}, FontStyle.normal(), null, FontStretch.Normal.percentage(), PredefinedFontWeight.NORMAL_WEIGHT, Unit.Raw.valueOf(SVGFont.defaultFontSize()));
    }

    @NotNull
    public String[] families() {
        return this.families;
    }

    @NotNull
    public FontStyle style() {
        if ($assertionsDisabled || this.style != null) {
            return this.style;
        }
        throw new AssertionError();
    }

    public float stretch() {
        return this.stretch;
    }

    public int currentWeight() {
        return this.currentWeight;
    }

    @NotNull
    public Length currentSize() {
        return this.currentSize;
    }

    public float effectiveSize(@NotNull MeasureContext context) {
        float emSize = currentSize().resolveFontSize(context);
        if (this.sizeAdjust != null) {
            return SVGFont.emFromEx(emSize * this.sizeAdjust.resolveFontSize(context));
        }
        return emSize;
    }

    @NotNull
    public MeasurableFontSpec withFontSize(@Nullable FontSize size, @Nullable Length sizeAdjust) {
        if (size == null && sizeAdjust == null) {
            return this;
        }
        return new MeasurableFontSpec(this.families, this.style, sizeAdjust != null ? sizeAdjust : this.sizeAdjust, this.stretch, this.currentWeight, size != null ? size.size(this.currentSize) : this.currentSize);
    }

    @NotNull
    public MeasurableFontSpec derive(@Nullable AttributeFontSpec other) {
        String[] strArr;
        FontStyle fontStyle;
        int iWeight;
        Length size;
        Length length;
        float f;
        if (other == null) {
            return this;
        }
        if (other.families != null && other.families.length > 0) {
            strArr = other.families;
        } else {
            strArr = this.families;
        }
        String[] newFamilies = strArr;
        if (other.style != null) {
            fontStyle = other.style;
        } else {
            fontStyle = this.style;
        }
        FontStyle newStyle = fontStyle;
        if (other.weight() != null) {
            iWeight = other.weight().weight(this.currentWeight);
        } else {
            iWeight = this.currentWeight;
        }
        int newWeight = iWeight;
        if (other.size() != null) {
            size = other.size().size(this.currentSize);
        } else {
            size = this.currentSize;
        }
        Length newSize = size;
        if (other.sizeAdjust != null) {
            length = other.sizeAdjust;
        } else {
            length = this.sizeAdjust;
        }
        Length newSizeAdjust = length;
        if (Length.isSpecified(other.stretch)) {
            f = other.stretch;
        } else {
            f = this.stretch;
        }
        float newStretch = f;
        return new MeasurableFontSpec(newFamilies, newStyle, newSizeAdjust, newStretch, newWeight, newSize);
    }

    @Override // com.github.weisj.jsvg.attributes.font.FontSpec
    public String toString() {
        return "MeasurableFontSpec{families=" + Arrays.toString(this.families) + ", style=" + this.style + ", sizeAdjust=" + this.sizeAdjust + ", stretch=" + this.stretch + ", currentWeight=" + this.currentWeight + ", currentSize=" + this.currentSize + '}';
    }

    @Override // com.github.weisj.jsvg.attributes.font.FontSpec
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MeasurableFontSpec) || !super.equals(o)) {
            return false;
        }
        MeasurableFontSpec fontSpec = (MeasurableFontSpec) o;
        return this.currentWeight == fontSpec.currentWeight && this.currentSize.equals(fontSpec.currentSize);
    }

    @Override // com.github.weisj.jsvg.attributes.font.FontSpec
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.currentWeight), this.currentSize);
    }
}
