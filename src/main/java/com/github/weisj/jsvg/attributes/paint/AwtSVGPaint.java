package com.github.weisj.jsvg.attributes.paint;

import java.awt.Color;
import java.awt.Paint;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/paint/AwtSVGPaint.class */
public final class AwtSVGPaint implements SimplePaintSVGPaint {

    @NotNull
    private final Paint paint;

    public AwtSVGPaint(@NotNull Paint paint) {
        this.paint = paint;
    }

    @Override // com.github.weisj.jsvg.attributes.paint.SimplePaintSVGPaint
    @NotNull
    public Paint paint() {
        return this.paint;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwtSVGPaint)) {
            return false;
        }
        AwtSVGPaint that = (AwtSVGPaint) o;
        return this.paint.equals(that.paint);
    }

    public int hashCode() {
        return Objects.hash(this.paint);
    }

    public String toString() {
        return "AwtSVGPaint{paint=" + formatPaint() + '}';
    }

    @NotNull
    private String formatPaint() {
        if (this.paint instanceof Color) {
            Color c = this.paint;
            return "Color{r=" + c.getRed() + ",g=" + c.getGreen() + ",b=" + c.getBlue() + ",a=" + c.getAlpha() + "}";
        }
        return this.paint.toString();
    }
}
