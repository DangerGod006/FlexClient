package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.prototype.Mutator;
import java.util.Arrays;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/AttributeFontSpec.class */
public final class AttributeFontSpec extends FontSpec implements Mutator<MeasurableFontSpec> {

    @Nullable
    private final FontSize size;

    @Nullable
    private final FontWeight weight;

    AttributeFontSpec(@NotNull String[] families, @Nullable FontStyle style, @Nullable Length sizeAdjust, float stretch, @Nullable FontSize size, @Nullable FontWeight weight) {
        super(families, style, sizeAdjust, stretch);
        this.size = size;
        this.weight = weight;
    }

    @Nullable
    public FontWeight weight() {
        return this.weight;
    }

    @Nullable
    public FontSize size() {
        return this.size;
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.Mutator
    @NotNull
    public MeasurableFontSpec mutate(@NotNull MeasurableFontSpec element) {
        return element.derive(this);
    }

    @Override // com.github.weisj.jsvg.attributes.font.FontSpec
    public String toString() {
        return "AttributeFontSpec{families=" + Arrays.toString(this.families) + ", style=" + this.style + ", weight=" + this.weight + ", size=" + this.size + ", sizeAdjust=" + this.sizeAdjust + ", stretch=" + this.stretch + '}';
    }

    @Override // com.github.weisj.jsvg.attributes.font.FontSpec
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttributeFontSpec) || !super.equals(o)) {
            return false;
        }
        AttributeFontSpec fontSpec = (AttributeFontSpec) o;
        return Objects.equals(this.size, fontSpec.size) && Objects.equals(this.weight, fontSpec.weight);
    }

    @Override // com.github.weisj.jsvg.attributes.font.FontSpec
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.size, this.weight);
    }
}
