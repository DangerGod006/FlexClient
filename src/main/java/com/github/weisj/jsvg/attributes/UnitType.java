package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/UnitType.class */
public enum UnitType {
    UserSpaceOnUse,
    ObjectBoundingBox;

    @NotNull
    public MeasureContext deriveMeasure(@NotNull MeasureContext measure) {
        return deriveMeasure(measure, 1.0d, 1.0d);
    }

    @NotNull
    public MeasureContext deriveMeasure(@NotNull MeasureContext measure, double objectWidth, double objectHeight) {
        if (this == ObjectBoundingBox) {
            return measure.derive((float) objectWidth, (float) objectHeight);
        }
        return measure;
    }

    @NotNull
    public AffineTransform viewTransform(@NotNull Rectangle2D bounds) {
        if (this == ObjectBoundingBox) {
            AffineTransform at = AffineTransform.getTranslateInstance(bounds.getX(), bounds.getY());
            at.scale(bounds.getWidth(), bounds.getHeight());
            return at;
        }
        return new AffineTransform();
    }

    @NotNull
    public Rectangle2D.Double computeViewBounds(@NotNull MeasureContext measure, @NotNull Rectangle2D elementBounds, @NotNull Length x, @NotNull Length y, @NotNull Length width, @NotNull Length height) {
        MeasureContext patternMeasure = deriveMeasure(measure, elementBounds.getWidth(), elementBounds.getHeight());
        Rectangle2D.Double viewBounds = new Rectangle2D.Double(x.resolveWidth(patternMeasure), y.resolveHeight(patternMeasure), width.resolveWidth(patternMeasure), height.resolveHeight(patternMeasure));
        if (this == ObjectBoundingBox) {
            viewBounds.x += elementBounds.getX();
            viewBounds.y += elementBounds.getY();
        }
        return viewBounds;
    }
}
