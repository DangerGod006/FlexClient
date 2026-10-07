package com.github.weisj.jsvg.attributes.font;

import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/NumberFontWeight.class */
@Immutable
public final class NumberFontWeight implements FontWeight {
    private final float weight;

    public NumberFontWeight(float weight) {
        this.weight = weight;
    }

    @Override // com.github.weisj.jsvg.attributes.font.FontWeight
    public int weight(int parentWeight) {
        return (int) this.weight;
    }

    public String toString() {
        return "NumberFontWeight{weight=" + this.weight + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NumberFontWeight)) {
            return false;
        }
        NumberFontWeight that = (NumberFontWeight) o;
        return this.weight == that.weight;
    }

    public int hashCode() {
        return Float.hashCode(this.weight);
    }
}
