package com.github.weisj.jsvg.geometry.size;

import java.awt.geom.Dimension2D;
import java.util.Objects;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/size/FloatSize.class */
public final class FloatSize extends Dimension2D {
    public float width;
    public float height;

    public FloatSize(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setSize(double width, double height) {
        this.width = (float) width;
        this.height = (float) height;
    }

    public String toString() {
        return "FloatSize{width=" + this.width + ", height=" + this.height + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FloatSize)) {
            return false;
        }
        FloatSize floatSize = (FloatSize) o;
        return Float.compare(floatSize.width, this.width) == 0 && Float.compare(floatSize.height, this.height) == 0;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.width), Float.valueOf(this.height));
    }
}
