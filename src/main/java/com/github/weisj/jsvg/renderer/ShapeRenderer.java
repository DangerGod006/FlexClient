package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.attributes.MarkerOrientation;
import com.github.weisj.jsvg.attributes.PaintOrder;
import com.github.weisj.jsvg.attributes.VectorEffect;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.FloatSize;
import com.github.weisj.jsvg.nodes.Marker;
import com.github.weisj.jsvg.nodes.ShapeNode;
import com.github.weisj.jsvg.renderer.NodeRenderer;
import com.github.weisj.jsvg.renderer.Output;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/ShapeRenderer.class */
public final class ShapeRenderer {
    private static final boolean DEBUG_MARKERS = false;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !ShapeRenderer.class.desiredAssertionStatus();
    }

    private ShapeRenderer() {
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/ShapeRenderer$PaintWithOpacity.class */
    private static final class PaintWithOpacity {

        @NotNull
        private final SVGPaint paint;
        private final float opacity;

        private PaintWithOpacity(@NotNull SVGPaint paint, float opacity) {
            this.paint = paint;
            this.opacity = opacity;
        }

        boolean isVisible() {
            return this.opacity > 0.0f && this.paint.isVisible();
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/ShapeRenderer$PaintShape.class */
    public static final class PaintShape {

        @NotNull
        private final Shape shape;

        @Nullable
        private final Rectangle2D bounds;

        public PaintShape(@NotNull Shape shape, @Nullable Rectangle2D bounds) {
            this.shape = shape;
            this.bounds = bounds;
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/ShapeRenderer$ShapePaintContext.class */
    public static final class ShapePaintContext {

        @NotNull
        private final RenderContext context;

        @NotNull
        private final Set<VectorEffect> vectorEffects;

        @NotNull
        private final Stroke stroke;

        @Nullable
        private final AffineTransform transform;

        public ShapePaintContext(@NotNull RenderContext context, @NotNull Set<VectorEffect> vectorEffects, @NotNull Stroke stroke, @Nullable AffineTransform transform) {
            this.context = context;
            this.vectorEffects = vectorEffects;
            this.stroke = stroke;
            this.transform = transform;
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/ShapeRenderer$ShapeMarkerInfo.class */
    public static final class ShapeMarkerInfo {

        @NotNull
        private final ShapeNode node;

        @Nullable
        private final Marker markerStart;

        @Nullable
        private final Marker markerMid;

        @Nullable
        private final Marker markerEnd;
        private final boolean shouldPaintStartEndMarkersInMiddle;

        public ShapeMarkerInfo(@NotNull ShapeNode node, @Nullable Marker markerStart, @Nullable Marker markerMid, @Nullable Marker markerEnd, boolean shouldPaintStartEndMarkersInMiddle) {
            this.node = node;
            this.markerStart = markerStart;
            this.markerMid = markerMid;
            this.markerEnd = markerEnd;
            this.shouldPaintStartEndMarkersInMiddle = shouldPaintStartEndMarkersInMiddle;
        }
    }

    public static void renderWithPaintOrder(@NotNull Output output, boolean canBeFilledHint, @NotNull PaintOrder paintOrder, @NotNull ShapePaintContext shapePaintContext, @NotNull PaintShape paintShape, @Nullable ShapeMarkerInfo markerInfo) {
        Set<VectorEffect> vectorEffects = shapePaintContext.vectorEffects;
        VectorEffect.applyEffects(shapePaintContext.vectorEffects, output, shapePaintContext.context, shapePaintContext.transform);
        Output.SafeState safeState = output.safeState();
        for (PaintOrder.Phase phase : paintOrder.phases()) {
            RenderContext phaseContext = shapePaintContext.context.deriveForChildGraphics();
            switch (phase) {
                case FILL:
                    if (canBeFilledHint) {
                        renderShapeFill(phaseContext, output, paintShape);
                    }
                    break;
                case STROKE:
                    Shape strokeShape = paintShape.shape;
                    if (vectorEffects.contains(VectorEffect.NonScalingStroke) && !vectorEffects.contains(VectorEffect.NonScalingSize)) {
                        strokeShape = VectorEffect.applyNonScalingStroke(output, phaseContext, strokeShape);
                    }
                    renderShapeStroke(phaseContext, output, new PaintShape(strokeShape, paintShape.bounds), shapePaintContext.stroke);
                    break;
                case MARKERS:
                    if (markerInfo != null) {
                        renderMarkers(output, phaseContext, paintShape, markerInfo);
                    }
                    break;
            }
            safeState.restore();
        }
    }

    private static void renderMarkers(@NotNull Output output, @NotNull RenderContext context, @NotNull PaintShape paintShape, @NotNull ShapeMarkerInfo markerInfo) {
        if (markerInfo.markerStart == null && markerInfo.markerMid == null && markerInfo.markerEnd == null) {
            return;
        }
        renderMarkersImpl(output, context, paintShape.shape.getPathIterator((AffineTransform) null), markerInfo);
    }

    private static void renderShapeStroke(@NotNull RenderContext context, @NotNull Output output, @NotNull PaintShape paintShape, @Nullable Stroke stroke) {
        PaintWithOpacity paintWithOpacity = new PaintWithOpacity(context.strokePaint(), context.strokeOpacity());
        if (stroke == null || !paintWithOpacity.isVisible()) {
            return;
        }
        output.applyOpacity(paintWithOpacity.opacity);
        output.setStroke(stroke);
        paintWithOpacity.paint.drawShape(output, context, paintShape.shape, paintShape.bounds);
    }

    private static void renderShapeFill(@NotNull RenderContext context, @NotNull Output output, @NotNull PaintShape paintShape) {
        PaintWithOpacity paintWithOpacity = new PaintWithOpacity(context.fillPaint(), context.fillOpacity());
        if (paintWithOpacity.isVisible()) {
            output.applyOpacity(paintWithOpacity.opacity);
            paintWithOpacity.paint.fillShape(output, context, paintShape.shape, paintShape.bounds);
        }
    }

    private static void renderMarkersImpl(@NotNull Output output, @NotNull RenderContext context, @NotNull PathIterator iterator, @NotNull ShapeMarkerInfo markerInfo) {
        Marker marker;
        MarkerOrientation.MarkerType markerType;
        float dxOut;
        float dyOut;
        float[] args = new float[6];
        float x = 0.0f;
        float y = 0.0f;
        float xStart = 0.0f;
        float yStart = 0.0f;
        float dxIn = 0.0f;
        float dyIn = 0.0f;
        Marker start = markerInfo.markerStart;
        Marker mid = markerInfo.markerMid;
        Marker end = markerInfo.markerEnd;
        boolean onlyFirst = mid == null && end == null;
        Marker markerToPaint = null;
        MarkerOrientation.MarkerType markerType2 = null;
        while (true) {
            MarkerOrientation.MarkerType markerToPaintType = markerType2;
            if (iterator.isDone()) {
                paintSingleMarker(markerInfo.node, context, output, markerToPaintType, markerToPaint, x, y, dxIn, dyIn, 0.0f, 0.0f);
                return;
            }
            int type = iterator.currentSegment(args);
            iterator.next();
            if (iterator.isDone()) {
                marker = end;
            } else {
                marker = mid;
            }
            Marker nextMarker = marker;
            if (iterator.isDone()) {
                markerType = MarkerOrientation.MarkerType.END;
            } else {
                markerType = MarkerOrientation.MarkerType.MID;
            }
            MarkerOrientation.MarkerType nextMarkerType = markerType;
            float xPaint = x;
            float yPaint = y;
            float dx = dxIn;
            float dy = dyIn;
            switch (type) {
                case 0:
                    dxIn = 0.0f;
                    dyIn = 0.0f;
                    float f = args[0];
                    xStart = f;
                    x = f;
                    float f2 = args[1];
                    yStart = f2;
                    y = f2;
                    if (markerInfo.shouldPaintStartEndMarkersInMiddle || markerToPaint == null) {
                        nextMarker = start;
                        nextMarkerType = MarkerOrientation.MarkerType.START;
                    }
                    if (markerToPaint != null) {
                        paintSingleMarker(markerInfo.node, context, output, markerToPaintType, markerToPaint, xPaint, yPaint, 0.0f, 0.0f, dx, dy);
                        if (onlyFirst) {
                            return;
                        }
                    }
                    markerToPaint = nextMarker;
                    markerType2 = nextMarkerType;
                    continue;
                case 1:
                    float f3 = args[0] - x;
                    dxIn = f3;
                    dxOut = f3;
                    float f4 = args[1] - y;
                    dyIn = f4;
                    dyOut = f4;
                    x = args[0];
                    y = args[1];
                    break;
                case 2:
                    dxOut = args[0] - x;
                    dyOut = args[1] - y;
                    dxIn = args[2] - args[0];
                    dyIn = args[3] - args[1];
                    x = args[2];
                    y = args[3];
                    break;
                case 3:
                    dxOut = args[0] - x;
                    dyOut = args[1] - y;
                    dxIn = args[4] - args[2];
                    dyIn = args[5] - args[3];
                    x = args[4];
                    y = args[5];
                    break;
                case 4:
                    float f5 = xStart - x;
                    dxIn = f5;
                    dxOut = f5;
                    float f6 = yStart - y;
                    dyIn = f6;
                    dyOut = f6;
                    x = xStart;
                    y = yStart;
                    if (markerInfo.shouldPaintStartEndMarkersInMiddle) {
                        nextMarker = end;
                        nextMarkerType = MarkerOrientation.MarkerType.END;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
            paintSingleMarker(markerInfo.node, context, output, markerToPaintType, markerToPaint, xPaint, yPaint, dx, dy, dxOut, dyOut);
            if (onlyFirst) {
                return;
            }
            markerToPaint = nextMarker;
            markerType2 = nextMarkerType;
        }
    }

    public static void paintSingleMarker(@NotNull ShapeNode shapeNode, @NotNull RenderContext context, @NotNull Output output, @Nullable MarkerOrientation.MarkerType type, @Nullable Marker marker, float x, float y, float dxIn, float dyIn, float dxOut, float dyOut) {
        if (marker == null) {
            return;
        }
        if (!$assertionsDisabled && type == null) {
            throw new AssertionError();
        }
        MarkerOrientation orientation = marker.orientation();
        float rotation = orientation.orientationFor(type, dxIn, dyIn, dxOut, dyOut);
        Output markerOutput = output.createChild();
        RenderContext markerContext = context.deriveForChildGraphics();
        markerContext.translate(markerOutput, x, y);
        markerContext.rotate(markerOutput, rotation);
        NodeRenderer.Info info = NodeRenderer.createRenderInfo(marker, markerContext, markerOutput, shapeNode);
        if (info != null) {
            try {
                info.renderable.render(info.context, info.output());
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
        if (info != null) {
            info.close();
        }
        markerOutput.dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void paintDebugMarker(@NotNull RenderContext context, @NotNull Graphics2D g, @NotNull Marker marker, float rotation) {
        FloatSize size = marker.size(context);
        Path2D.Float r0 = new Path2D.Float();
        r0.moveTo(0.0d, size.height / 2.0f);
        r0.lineTo(size.width, size.height / 2.0f);
        r0.moveTo(0.8d * ((double) size.width), 0.35f * size.height);
        r0.lineTo(size.width, size.height / 2.0f);
        r0.lineTo(0.8d * ((double) size.width), 0.65f * size.height);
        g.setStroke(new BasicStroke(0.5f));
        g.setColor(Color.MAGENTA.darker().darker());
        g.draw(new Rectangle2D.Float(0.0f, 0.0f, size.width, size.height));
        g.draw(r0);
        g.rotate(rotation);
        g.setColor(Color.MAGENTA);
        g.draw(new Rectangle2D.Float(0.0f, 0.0f, size.width, size.height));
        g.draw(r0);
    }
}
