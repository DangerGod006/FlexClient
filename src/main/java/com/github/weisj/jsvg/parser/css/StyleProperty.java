package com.github.weisj.jsvg.parser.css;

import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/css/StyleProperty.class */
@Immutable
public final class StyleProperty {

    @NotNull
    private final String name;

    @NotNull
    private final String value;

    public StyleProperty(@NotNull String name, @NotNull String value) {
        this.name = name;
        this.value = value;
    }

    @NotNull
    public String name() {
        return this.name;
    }

    @NotNull
    public String value() {
        return this.value;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StyleProperty that = (StyleProperty) o;
        return this.name.equals(that.name) && this.value.equals(that.value);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.value);
    }

    public String toString() {
        return "StyleProperty{name='" + this.name + "', value='" + this.value + "'}";
    }
}
