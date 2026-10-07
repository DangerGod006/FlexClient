package com.github.weisj.jsvg.geometry.path;

import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/Arc.class */
final class Arc extends PathCommand {
    private final float rx;
    private final float ry;
    private final float xAxisRot;
    private final boolean largeArc;
    private final boolean sweep;
    private final float x;
    private final float y;

    public Arc(boolean isRelative, float rx, float ry, float xAxisRot, boolean largeArc, boolean sweep, float x, float y) {
        super(isRelative, 6);
        this.rx = rx;
        this.ry = ry;
        this.xAxisRot = xAxisRot;
        this.largeArc = largeArc;
        this.sweep = sweep;
        this.x = x;
        this.y = y;
    }

    @Override // com.github.weisj.jsvg.geometry.path.PathCommand
    public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
        Point2D.Float offset = offset(hist);
        arcTo(path, this.rx, this.ry, this.xAxisRot, this.largeArc, this.sweep, this.x + offset.x, this.y + offset.y, hist.lastPoint.x, hist.lastPoint.y);
        hist.setLastPoint(path.getCurrentPoint());
        hist.setLastKnot(path.getCurrentPoint());
    }

    private void arcTo(@NotNull Path2D path, float rx, float ry, float angle, boolean largeArcFlag, boolean sweepFlag, float x, float y, float x0, float y0) {
        if (rx == 0.0f || ry == 0.0f) {
            path.lineTo(x, y);
            return;
        }
        if (x0 == x && y0 == y) {
            return;
        }
        Arc2D arc = computeRawArc(x0, y0, rx, ry, angle, largeArcFlag, sweepFlag, x, y);
        AffineTransform t = AffineTransform.getRotateInstance(Math.toRadians(angle), arc.getCenterX(), arc.getCenterY());
        Shape s = t.createTransformedShape(arc);
        path.append(s, true);
    }

    @NotNull
    private static Arc2D computeRawArc(double x0, double y0, double rx, double ry, double angle, boolean largeArcFlag, boolean sweepFlag, double x, double y) {
        double dx2 = (x0 - x) / 2.0d;
        double dy2 = (y0 - y) / 2.0d;
        double angle2 = Math.toRadians(angle % 360.0d);
        double cosAngle = Math.cos(angle2);
        double sinAngle = Math.sin(angle2);
        double x1 = (cosAngle * dx2) + (sinAngle * dy2);
        double y1 = ((-sinAngle) * dx2) + (cosAngle * dy2);
        double rx2 = Math.abs(rx);
        double ry2 = Math.abs(ry);
        double Prx = rx2 * rx2;
        double Pry = ry2 * ry2;
        double Px1 = x1 * x1;
        double Py1 = y1 * y1;
        double radiiCheck = (Px1 / Prx) + (Py1 / Pry);
        if (radiiCheck > 1.0d) {
            rx2 = Math.sqrt(radiiCheck) * rx2;
            ry2 = Math.sqrt(radiiCheck) * ry2;
            Prx = rx2 * rx2;
            Pry = ry2 * ry2;
        }
        double sign = largeArcFlag == sweepFlag ? -1.0d : 1.0d;
        double sq = (((Prx * Pry) - (Prx * Py1)) - (Pry * Px1)) / ((Prx * Py1) + (Pry * Px1));
        double coefficient = sign * Math.sqrt(sq < 0.0d ? 0.0d : sq);
        double cx1 = coefficient * ((rx2 * y1) / ry2);
        double cy1 = coefficient * (-((ry2 * x1) / rx2));
        double sx2 = (x0 + x) / 2.0d;
        double sy2 = (y0 + y) / 2.0d;
        double cx = sx2 + ((cosAngle * cx1) - (sinAngle * cy1));
        double cy = sy2 + (sinAngle * cx1) + (cosAngle * cy1);
        double ux = (x1 - cx1) / rx2;
        double uy = (y1 - cy1) / ry2;
        double vx = ((-x1) - cx1) / rx2;
        double vy = ((-y1) - cy1) / ry2;
        double n = Math.sqrt((ux * ux) + (uy * uy));
        double sign2 = uy < 0.0d ? -1.0d : 1.0d;
        double angleStart = Math.toDegrees(sign2 * Math.acos(ux / n));
        double n2 = Math.sqrt(((ux * ux) + (uy * uy)) * ((vx * vx) + (vy * vy)));
        double p = (ux * vx) + (uy * vy);
        double sign3 = (ux * vy) - (uy * vx) < 0.0d ? -1.0d : 1.0d;
        double angleExtent = Math.toDegrees(sign3 * Math.acos(p / n2));
        if (!sweepFlag && angleExtent > 0.0d) {
            angleExtent -= 360.0d;
        } else if (sweepFlag && angleExtent < 0.0d) {
            angleExtent += 360.0d;
        }
        double angleStart2 = angleStart % 360.0d;
        Arc2D.Double arc = new Arc2D.Double();
        arc.x = cx - rx2;
        arc.y = cy - ry2;
        arc.width = rx2 * 2.0d;
        arc.height = ry2 * 2.0d;
        arc.start = -angleStart2;
        arc.extent = -(angleExtent % 360.0d);
        return arc;
    }

    public String toString() {
        return "A " + this.rx + " " + this.ry + " " + this.xAxisRot + " " + this.largeArc + " " + this.sweep + " " + this.x + " " + this.y;
    }
}
