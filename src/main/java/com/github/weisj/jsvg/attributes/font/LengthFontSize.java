package com.github.weisj.jsvg.attributes.font;

import com.github.weisj.jsvg.geometry.size.Length;
import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/LengthFontSize.class */
@Immutable
public final class LengthFontSize implements FontSize {

    @NotNull
    private final Length size;

    public LengthFontSize(@NotNull Length size) {
        this.size = size;
    }

    @Override // com.github.weisj.jsvg.attributes.font.FontSize
    @NotNull
    public Length size(@NotNull Length parentSize) {
        return this.size;
    }

    public String toString() {
        return "LengthFontSize{size=" + this.size + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LengthFontSize)) {
            return false;
        }
        LengthFontSize that = (LengthFontSize) o;
        return this.size.equals(that.size);
    }

    public int hashCode() {
        return Objects.hashCode(this.size);
    }
}
