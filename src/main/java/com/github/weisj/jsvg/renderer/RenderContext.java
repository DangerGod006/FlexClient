package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.attributes.font.FontResolver;
import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
import com.github.weisj.jsvg.attributes.font.SVGFont;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.attributes.stroke.StrokeResolver;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.prototype.Mutator;
import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/RenderContext.class */
public final class RenderContext {

    @NotNull
    private final PlatformSupport awtSupport;

    @NotNull
    private final MeasureContext measureContext;

    @NotNull
    private final PaintContext paintContext;

    @NotNull
    private final FontRenderContext fontRenderContext;

    @NotNull
    private final MeasurableFontSpec fontSpec;

    @NotNull
    private final FillRule fillRule;

    @Nullable
    private final ContextElementAttributes contextElementAttributes;

    @NotNull
    private final AffineTransform rootTransform;

    @NotNull
    private final AffineTransform userSpaceTransform;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !RenderContext.class.desiredAssertionStatus();
    }

    @NotNull
    public static RenderContext createInitial(@Nullable PlatformSupport awtSupport, @NotNull MeasureContext measureContext) {
        return new RenderContext(awtSupport, new AffineTransform(), new AffineTransform(), PaintContext.createDefault(), measureContext, FontRenderContext.createDefault(), MeasurableFontSpec.createDefault(), FillRule.Nonzero, null);
    }

    RenderContext(@NotNull PlatformSupport platformSupport, @NotNull AffineTransform rootTransform, @NotNull AffineTransform userSpaceTransform, @NotNull PaintContext paintContext, @NotNull MeasureContext measureContext, @NotNull FontRenderContext fontRenderContext, @NotNull MeasurableFontSpec fontSpec, @NotNull FillRule fillRule, @Nullable ContextElementAttributes contextElementAttributes) {
        this.awtSupport = platformSupport;
        this.rootTransform = rootTransform;
        this.userSpaceTransform = userSpaceTransform;
        this.paintContext = paintContext;
        this.measureContext = measureContext;
        this.fontRenderContext = fontRenderContext;
        this.fontSpec = fontSpec;
        this.fillRule = fillRule;
        this.contextElementAttributes = contextElementAttributes;
    }

    @NotNull
    RenderContext derive(@Nullable Mutator<PaintContext> context, @Nullable Mutator<MeasurableFontSpec> attributeFontSpec, @Nullable ViewBox viewBox, @Nullable FontRenderContext frc, @Nullable FillRule fillRule, @Nullable ContextElementAttributes contextAttributes) {
        if (context == null && viewBox == null && attributeFontSpec == null && frc == null) {
            return this;
        }
        PaintContext newPaintContext = this.paintContext;
        MeasurableFontSpec newFontSpec = this.fontSpec;
        FillRule newFillRule = (fillRule == null || fillRule == FillRule.Inherit) ? this.fillRule : fillRule;
        if (context != null) {
            newPaintContext = context.mutate(this.paintContext);
        }
        if (attributeFontSpec != null) {
            newFontSpec = attributeFontSpec.mutate(newFontSpec);
        }
        ContextElementAttributes newContextAttributes = this.contextElementAttributes;
        if (contextAttributes != null) {
            newContextAttributes = contextAttributes;
        }
        float em = newFontSpec.effectiveSize(this.measureContext);
        float ex = SVGFont.exFromEm(em);
        MeasureContext newMeasureContext = this.measureContext.derive(viewBox, em, ex);
        FontRenderContext effectiveFrc = this.fontRenderContext.derive(frc);
        return new RenderContext(this.awtSupport, this.rootTransform, new AffineTransform(this.userSpaceTransform), newPaintContext, newMeasureContext, effectiveFrc, newFontSpec, newFillRule, newContextAttributes);
    }

    @NotNull
    public RenderContext deriveForChildGraphics() {
        return derive(t -> {
            return t;
        }, null, null, null, null, null);
    }

    @NotNull
    public StrokeContext strokeContext() {
        if ($assertionsDisabled || this.paintContext.strokeContext != null) {
            return this.paintContext.strokeContext;
        }
        throw new AssertionError();
    }

    @Nullable
    ContextElementAttributes contextElementAttributes() {
        return this.contextElementAttributes;
    }

    @NotNull
    public AffineTransform rootTransform() {
        return this.rootTransform;
    }

    @NotNull
    public AffineTransform userSpaceTransform() {
        return this.userSpaceTransform;
    }

    public void setRootTransform(@NotNull AffineTransform rootTransform) {
        this.rootTransform.setTransform(rootTransform);
        this.userSpaceTransform.setToIdentity();
    }

    public void setRootTransform(@NotNull AffineTransform rootTransform, @NotNull AffineTransform userSpaceTransform) {
        this.rootTransform.setTransform(rootTransform);
        this.userSpaceTransform.setTransform(userSpaceTransform);
    }

    public void translate(@NotNull Output output, @NotNull Point2D dp) {
        translate(output, dp.getX(), dp.getY());
    }

    public void translate(@NotNull Output output, double dx, double dy) {
        output.translate(dx, dy);
        this.userSpaceTransform.translate(dx, dy);
    }

    public void scale(@NotNull Output output, double sx, double sy) {
        output.scale(sx, sy);
        this.userSpaceTransform.scale(sx, sy);
    }

    public void rotate(@NotNull Output output, double angle) {
        output.rotate(angle);
        this.userSpaceTransform.rotate(angle);
    }

    public void transform(@NotNull Output output, @NotNull AffineTransform at) {
        output.applyTransform(at);
        this.userSpaceTransform.concatenate(at);
    }

    @NotNull
    public PlatformSupport platformSupport() {
        return this.awtSupport;
    }

    @NotNull
    public MeasureContext measureContext() {
        return this.measureContext;
    }

    @NotNull
    public FontRenderContext fontRenderContext() {
        return this.fontRenderContext;
    }

    @NotNull
    public FillRule fillRule() {
        return this.fillRule;
    }

    @NotNull
    public SVGPaint strokePaint() {
        return resolvePaint(this.paintContext.strokePaint);
    }

    @NotNull
    public SVGPaint fillPaint() {
        return resolvePaint(this.paintContext.fillPaint);
    }

    @NotNull
    private SVGPaint resolvePaint(@Nullable SVGPaint p) {
        if (p == SVGPaint.DEFAULT_PAINT || p == SVGPaint.CURRENT_COLOR) {
            return coerceNonNull(this.paintContext.color);
        }
        if (p == SVGPaint.CONTEXT_STROKE) {
            return this.contextElementAttributes == null ? SVGPaint.NONE : this.contextElementAttributes.strokePaint;
        }
        if (p == SVGPaint.CONTEXT_FILL) {
            return this.contextElementAttributes == null ? SVGPaint.NONE : this.contextElementAttributes.fillPaint;
        }
        return coerceNonNull(p);
    }

    @NotNull
    private SVGPaint coerceNonNull(@Nullable SVGPaint p) {
        return p != null ? p : SVGPaint.DEFAULT_PAINT;
    }

    public float rawOpacity() {
        return this.paintContext.opacity;
    }

    public float fillOpacity() {
        return this.paintContext.fillOpacity * this.paintContext.opacity;
    }

    public float strokeOpacity() {
        return this.paintContext.strokeOpacity * this.paintContext.opacity;
    }

    @NotNull
    public Stroke stroke(float pathLengthFactor) {
        return StrokeResolver.resolve(pathLengthFactor, this.measureContext, strokeContext());
    }

    @NotNull
    public SVGFont font() {
        return FontResolver.resolve(this.fontSpec, this.measureContext);
    }

    public String toString() {
        return "RenderContext{\n  measureContext=" + this.measureContext + ",\n paintContext=" + this.paintContext + ",\n fontSpec=" + this.fontSpec + ",\n awtSupport=" + this.awtSupport + ",\n contextElementAttributes=" + this.contextElementAttributes + ",\n fillRule=" + this.fillRule + ",\n baseTransform=" + this.rootTransform + ",\n userSpaceTransform=" + this.userSpaceTransform + "\n}";
    }
}
