package com.github.weisj.jsvg;

import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.attributes.font.SVGFont;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.SVG;
import com.github.weisj.jsvg.renderer.Graphics2DOutput;
import com.github.weisj.jsvg.renderer.NodeRenderer;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.renderer.ShapeOutput;
import com.github.weisj.jsvg.renderer.awt.JComponentPlatformSupport;
import com.github.weisj.jsvg.renderer.awt.NullPlatformSupport;
import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Path2D;
import java.util.Objects;
import java.util.Optional;
import javax.swing.JComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/SVGDocument.class */
public final class SVGDocument {
    private static final boolean DEBUG = false;

    @NotNull
    private final SVG root;

    @NotNull
    private final FloatSize size;

    public SVGDocument(@NotNull SVG root) {
        this.root = root;
        float em = SVGFont.defaultFontSize();
        this.size = root.sizeForTopLevel(em, SVGFont.exFromEm(em));
    }

    @NotNull
    public FloatSize size() {
        return this.size;
    }

    @NotNull
    public Shape computeShape() {
        return computeShape(null);
    }

    @NotNull
    public Shape computeShape(@Nullable ViewBox viewBox) {
        Area accumulator = new Area(new Path2D.Float());
        renderWithPlatform(new NullPlatformSupport(), new ShapeOutput(accumulator), viewBox);
        return accumulator;
    }

    public void render(@Nullable JComponent component, @NotNull Graphics2D g) {
        render(component, g, null);
    }

    public void render(@Nullable JComponent component, @NotNull Graphics2D graphics2D, @Nullable ViewBox bounds) {
        PlatformSupport nullPlatformSupport;
        if (component != null) {
            nullPlatformSupport = new JComponentPlatformSupport(component);
        } else {
            nullPlatformSupport = new NullPlatformSupport();
        }
        PlatformSupport platformSupport = nullPlatformSupport;
        Graphics2D g = (Graphics2D) graphics2D.create();
        setupSVGRenderingHints(g);
        Output output = new Graphics2DOutput(g);
        renderWithPlatform(platformSupport, output, bounds);
        output.dispose();
    }

    private float computePlatformFontSize(@NotNull PlatformSupport platformSupport, @NotNull Output output) {
        Optional<Float> optionalContextFontSize = output.contextFontSize();
        Objects.requireNonNull(platformSupport);
        return optionalContextFontSize.orElseGet(platformSupport::fontSize).floatValue();
    }

    public void renderWithPlatform(@NotNull PlatformSupport platformSupport, @NotNull Output output, @Nullable ViewBox bounds) {
        RenderContext context = prepareRenderContext(platformSupport, output, bounds);
        if (bounds == null) {
            bounds = new ViewBox(this.root.size(context));
        }
        output.applyClip(bounds);
        output.translate(bounds.x, bounds.y);
        NodeRenderer.Info info = NodeRenderer.createRenderInfo(this.root, context, output, null);
        try {
            Objects.requireNonNull(info);
            this.root.renderWithSize(bounds.size(), this.root.viewBox(context), info.context, info.output);
            if (info != null) {
                info.close();
            }
        } catch (Throwable th) {
            if (info != null) {
                try {
                    info.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static /* synthetic */ void lambda$renderWithPlatform$0(ViewBox finalBounds, Graphics2D g) {
        g.setColor(Color.RED);
        g.draw(finalBounds);
    }

    @NotNull
    private RenderContext prepareRenderContext(@NotNull PlatformSupport platformSupport, @NotNull Output output, @Nullable ViewBox bounds) {
        MeasureContext measureContextCreateInitial;
        float defaultEm = computePlatformFontSize(platformSupport, output);
        float defaultEx = SVGFont.exFromEm(defaultEm);
        if (bounds != null) {
            measureContextCreateInitial = MeasureContext.createInitial(bounds.size(), defaultEm, defaultEx);
        } else {
            measureContextCreateInitial = MeasureContext.createInitial(this.root.sizeForTopLevel(defaultEm, defaultEx), defaultEm, defaultEx);
        }
        MeasureContext initialMeasure = measureContextCreateInitial;
        RenderContext context = RenderContext.createInitial(platformSupport, initialMeasure);
        this.root.applyTransform(output, context);
        return context;
    }

    private void setupSVGRenderingHints(@NotNull Graphics2D g) {
        Object obj;
        Object aaHint = g.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        if (aaHint != RenderingHints.VALUE_ANTIALIAS_DEFAULT) {
            RenderingHints.Key key = SVGRenderingHints.KEY_IMAGE_ANTIALIASING;
            if (aaHint == RenderingHints.VALUE_ANTIALIAS_ON) {
                obj = SVGRenderingHints.VALUE_IMAGE_ANTIALIASING_ON;
            } else {
                obj = SVGRenderingHints.VALUE_IMAGE_ANTIALIASING_OFF;
            }
            setSVGRenderingHint(g, key, obj);
        } else {
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        if (g.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL) == RenderingHints.VALUE_STROKE_DEFAULT) {
            g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        }
    }

    private void setSVGRenderingHint(@NotNull Graphics2D g, @NotNull RenderingHints.Key key, @NotNull Object o) {
        if (g.getRenderingHint(key) == null) {
            g.setRenderingHint(key, o);
        }
    }
}
