package com.github.weisj.jsvg.attributes.stroke;

import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.geometry.size.Unit;
import com.github.weisj.jsvg.renderer.StrokeContext;
import java.awt.BasicStroke;
import java.awt.Stroke;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/stroke/StrokeResolver.class */
public final class StrokeResolver {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !StrokeResolver.class.desiredAssertionStatus();
    }

    private StrokeResolver() {
    }

    @NotNull
    public static Stroke resolve(float pathLengthFactor, @NotNull MeasureContext measureContext, @NotNull StrokeContext context) {
        Length strokeWidth = context.strokeWidth;
        LineCap lineCap = context.lineCap;
        LineJoin lineJoin = context.lineJoin;
        float miterLimit = context.miterLimit;
        Length[] dashPattern = context.dashPattern;
        Length dashOffset = context.dashOffset;
        if (!$assertionsDisabled && strokeWidth == null) {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && lineCap == null) {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && lineJoin == null) {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && !Length.isSpecified(miterLimit)) {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && dashOffset == null) {
            throw new AssertionError();
        }
        float miterLimit2 = Math.max(1.0f, miterLimit);
        float[] dashes = new float[dashPattern.length];
        float offsetLength = 0.0f;
        for (int i = 0; i < dashes.length; i++) {
            float dash = dashPattern[i].resolveLength(measureContext);
            if (dashPattern[i].unit() != Unit.PERCENTAGE) {
                dash *= pathLengthFactor;
            }
            offsetLength += dash;
            dashes[i] = dash;
        }
        float phase = dashOffset.resolveLength(measureContext);
        if (dashOffset.unit() != Unit.PERCENTAGE) {
            phase *= pathLengthFactor;
        }
        if (phase < 0.0f) {
            phase += offsetLength;
        }
        if (dashes.length == 0) {
            return new BasicStroke(strokeWidth.resolveLength(measureContext), lineCap.awtCode(), lineJoin.awtCode(), miterLimit2);
        }
        return new BasicStroke(strokeWidth.resolveLength(measureContext), lineCap.awtCode(), lineJoin.awtCode(), miterLimit2, dashes, phase);
    }
}
