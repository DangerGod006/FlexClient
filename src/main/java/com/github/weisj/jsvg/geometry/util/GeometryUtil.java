package com.github.weisj.jsvg.geometry.util;

import com.github.weisj.jsvg.geometry.size.FloatInsets;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/util/GeometryUtil.class */
public final class GeometryUtil {
    private static final float EPS = 1.0E-4f;

    private GeometryUtil() {
    }

    public static boolean approximatelyEqual(double a, double b) {
        return Math.abs(a - b) < 9.999999747378752E-5d;
    }

    public static boolean approximatelyZero(double a) {
        return approximatelyEqual(a, 0.0d);
    }

    public static boolean notablyGreater(double a, double b) {
        return a - b > 9.999999747378752E-5d;
    }

    public static boolean approximatelyNegative(double a) {
        return a < 9.999999747378752E-5d;
    }

    public static double scaleXOfTransform(@Nullable AffineTransform at) {
        if (at == null) {
            return 1.0d;
        }
        double sx = at.getScaleX();
        double shy = at.getShearY();
        return Math.sqrt((sx * sx) + (shy * shy));
    }

    public static double scaleYOfTransform(@Nullable AffineTransform at) {
        if (at == null) {
            return 1.0d;
        }
        double sy = at.getScaleY();
        double shx = at.getShearX();
        return Math.sqrt((sy * sy) + (shx * shx));
    }

    @NotNull
    public static Point2D.Float midPoint(@NotNull Point2D.Float x, @NotNull Point2D.Float y) {
        return new Point2D.Float((x.x + y.x) / 2.0f, (x.y + y.y) / 2.0f);
    }

    @NotNull
    public static Point2D.Float lerp(float t, @NotNull Point2D.Float a, @NotNull Point2D.Float b) {
        return new Point2D.Float(lerp(t, b.x, a.x), lerp(t, b.y, a.y));
    }

    public static float lerp(float t, float a, float b) {
        return ((1.0f - t) * a) + (t * b);
    }

    public static double distanceSquared(@NotNull Point2D.Float p1, @NotNull Point2D.Float p2, float scaleX, float scaleY) {
        return distanceSquared(scaleX * p1.x, scaleY * p1.y, scaleX * p2.x, scaleY * p2.y);
    }

    public static double distanceSquared(@NotNull Point2D.Float p1, @NotNull Point2D.Float p2) {
        return distanceSquared(p1.x, p1.y, p2.x, p2.y);
    }

    public static double distanceSquared(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return (dx * dx) + (dy * dy);
    }

    public static double pathLength(@NotNull Shape shape) {
        PathLengthCalculator pathLengthCalculator = new PathLengthCalculator();
        PathIterator pathIterator = shape.getPathIterator((AffineTransform) null);
        double length = 0.0d;
        double[] args = new double[6];
        while (!pathIterator.isDone()) {
            length += pathLengthCalculator.segmentLength(pathIterator.currentSegment(args), args);
            pathIterator.next();
        }
        return length;
    }

    public static double lineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(distanceSquared(x1, y1, x2, y2));
    }

    @NotNull
    public static Rectangle2D containingBoundsAfterTransform(@NotNull AffineTransform transform, @NotNull Rectangle2D rect) {
        Point2D.Double p1 = new Point2D.Double(rect.getX(), rect.getY());
        Point2D.Double p2 = new Point2D.Double(rect.getX() + rect.getWidth(), rect.getY());
        Point2D.Double p3 = new Point2D.Double(rect.getX(), rect.getY() + rect.getHeight());
        Point2D.Double p4 = new Point2D.Double(rect.getX() + rect.getWidth(), rect.getY() + rect.getHeight());
        Rectangle2D r1 = rect.getBounds2D();
        r1.setFrameFromDiagonal(transform.transform(p1, p1), transform.transform(p2, p2));
        Rectangle2D r2 = rect.getBounds2D();
        r2.setFrameFromDiagonal(transform.transform(p3, p3), transform.transform(p4, p4));
        Rectangle2D.union(r1, r2, r1);
        return r1;
    }

    public static float left(@NotNull Rectangle2D rect) {
        return (float) rect.getX();
    }

    public static float top(@NotNull Rectangle2D rect) {
        return (float) rect.getY();
    }

    public static float right(@NotNull Rectangle2D rect) {
        return (float) (rect.getX() + rect.getWidth());
    }

    public static float bottom(@NotNull Rectangle2D rect) {
        return (float) (rect.getY() + rect.getHeight());
    }

    @NotNull
    public static Rectangle2D grow(@NotNull Rectangle2D bounds, FloatInsets grow) {
        return new Rectangle2D.Double(bounds.getX() - ((double) grow.left()), bounds.getY() - ((double) grow.top()), bounds.getWidth() + ((double) grow.left()) + ((double) grow.right()), bounds.getHeight() + ((double) grow.top()) + ((double) grow.bottom()));
    }

    @NotNull
    public static FloatInsets max(@NotNull FloatInsets in1, @NotNull FloatInsets in2) {
        return new FloatInsets(Math.max(in1.top(), in2.top()), Math.max(in1.left(), in2.left()), Math.max(in1.bottom(), in2.bottom()), Math.max(in1.right(), in2.right()));
    }

    @NotNull
    public static FloatInsets min(@NotNull FloatInsets in1, @NotNull FloatInsets in2) {
        return new FloatInsets(Math.min(in1.top(), in2.top()), Math.min(in1.left(), in2.left()), Math.min(in1.bottom(), in2.bottom()), Math.min(in1.right(), in2.right()));
    }

    @NotNull
    public static FloatInsets overhangInsets(@NotNull Rectangle2D reference, @NotNull Rectangle2D bounds) {
        return new FloatInsets(Math.max(0.0f, top(reference) - top(bounds)), Math.max(0.0f, left(reference) - left(bounds)), Math.max(0.0f, bottom(bounds) - bottom(reference)), Math.max(0.0f, right(bounds) - right(reference)));
    }

    @NotNull
    public static String compactRepresentation(@NotNull Rectangle2D rect) {
        return "[" + rect.getX() + ", " + rect.getY() + ", " + rect.getWidth() + "x" + rect.getHeight() + "]";
    }
}
