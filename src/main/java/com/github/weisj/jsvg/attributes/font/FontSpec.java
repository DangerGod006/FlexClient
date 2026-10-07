package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.Length;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/FontSpec.class */
@Immutable
public class FontSpec {

    @NotNull
    protected final String[] families;

    @Nullable
    protected final FontStyle style;

    @Nullable
    protected final Length sizeAdjust;
    protected final float stretch;

    FontSpec(@NotNull String[] families, @Nullable FontStyle style, @Nullable Length sizeAdjust, float stretch) {
        this.families = families;
        this.style = style;
        this.sizeAdjust = sizeAdjust;
        this.stretch = stretch;
    }

    public String toString() {
        return "FontSpec{families=" + Arrays.toString(this.families) + ", style=" + this.style + ", sizeAdjust=" + this.sizeAdjust + ", stretch=" + this.stretch + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FontSpec)) {
            return false;
        }
        FontSpec fontSpec = (FontSpec) o;
        return Float.compare(fontSpec.stretch, this.stretch) == 0 && Arrays.equals(this.families, fontSpec.families) && Objects.equals(this.style, fontSpec.style) && Objects.equals(this.sizeAdjust, fontSpec.sizeAdjust);
    }

    public int hashCode() {
        int result = Objects.hash(this.style, this.sizeAdjust, Float.valueOf(this.stretch));
        return (31 * result) + Arrays.hashCode(this.families);
    }
}
