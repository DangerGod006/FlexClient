package com.github.weisj.jsvg.attributes.font;

import java.awt.geom.AffineTransform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/FontStyle.class */
abstract class FontStyle {
    private FontStyle() {
    }

    @Nullable
    public AffineTransform transform() {
        return null;
    }

    @NotNull
    public static FontStyle normal() {
        return Normal.INSTANCE;
    }

    @NotNull
    public static FontStyle italic() {
        return Italic.INSTANCE;
    }

    @NotNull
    public static FontStyle oblique() {
        return Oblique.DEFAULT;
    }

    @NotNull
    public static FontStyle oblique(float angle) {
        return new Oblique(angle);
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/FontStyle$Normal.class */
    static final class Normal extends FontStyle {

        @NotNull
        private static final Normal INSTANCE = new Normal();

        Normal() {
            super();
        }

        public String toString() {
            return "Normal";
        }

        public boolean equals(Object obj) {
            return obj instanceof Normal;
        }

        public int hashCode() {
            return Normal.class.hashCode();
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/FontStyle$Italic.class */
    static final class Italic extends FontStyle {

        @NotNull
        private static final Italic INSTANCE = new Italic();

        Italic() {
            super();
        }

        public String toString() {
            return "Italic";
        }

        public boolean equals(Object obj) {
            return obj instanceof Italic;
        }

        public int hashCode() {
            return Italic.class.hashCode();
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/font/FontStyle$Oblique.class */
    static final class Oblique extends FontStyle {
        public static final float DEFAULT_ANGLE = (float) Math.toRadians(14.0d);

        @NotNull
        public static final Oblique DEFAULT = new Oblique(DEFAULT_ANGLE);
        private final float angle;

        public Oblique(float angle) {
            super();
            this.angle = angle;
        }

        @Override // com.github.weisj.jsvg.attributes.font.FontStyle
        @NotNull
        public AffineTransform transform() {
            return AffineTransform.getShearInstance(-this.angle, 0.0d);
        }

        public String toString() {
            return "Oblique{" + this.angle + '}';
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Oblique)) {
                return false;
            }
            Oblique that = (Oblique) o;
            return Float.compare(that.angle, this.angle) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.angle);
        }
    }
}
