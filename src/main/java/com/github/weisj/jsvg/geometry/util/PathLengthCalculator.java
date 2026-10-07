package com.github.weisj.jsvg.geometry.util;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/util/PathLengthCalculator.class */
public final class PathLengthCalculator {
    private double x = 0.0d;
    private double y = 0.0d;
    private double xStart = this.x;
    private double yStart = this.y;

    public double segmentLength(int segmentType, double[] coords) {
        double segmentLength = 0.0d;
        switch (segmentType) {
            case 0:
                this.x = coords[0];
                this.y = coords[1];
                this.xStart = this.x;
                this.yStart = this.y;
                break;
            case 1:
                segmentLength = lineLength(this.x, this.y, coords[0], coords[1]);
                this.x = coords[0];
                this.y = coords[1];
                break;
            case 2:
                segmentLength = quadraticParametricLength(this.x, this.y, coords[0], coords[1], coords[2], coords[3]);
                this.x = coords[2];
                this.y = coords[3];
                break;
            case 3:
                segmentLength = cubicParametricLength(this.x, this.y, coords[0], coords[1], coords[2], coords[3], coords[4], coords[5]);
                this.x = coords[4];
                this.y = coords[5];
                break;
            case 4:
                segmentLength = lineLength(this.x, this.y, coords[0], coords[1]);
                this.x = this.xStart;
                this.y = this.yStart;
                break;
            default:
                throw new IllegalStateException();
        }
        return segmentLength;
    }

    private double lineLength(double x1, double y1, double x2, double y2) {
        return GeometryUtil.lineLength(x1, y1, x2, y2);
    }

    private double quadraticParametricLength(double ax, double ay, double bx, double by, double cx, double cy) {
        if (ax == cx && ay == cy) {
            if (ax == bx && ay == by) {
                return 0.0d;
            }
            return lineLength(ax, ay, bx, by);
        }
        if ((ax == bx && ay == by) || (cx == bx && cy == by)) {
            return lineLength(ax, ay, cx, cy);
        }
        double ax0 = bx - ax;
        double ay0 = by - ay;
        double ax1 = (ax - (2.0d * bx)) + cx;
        double ay1 = (ay - (2.0d * by)) + cy;
        if (ax1 != 0.0d || ay1 != 0.0d) {
            double c = 4.0d * dot2D(ax1, ay1, ax1, ay1);
            double b = 8.0d * dot2D(ax0, ay0, ax1, ay1);
            double a = 8.0d * dot2D(ax0, ay0, ax0, ay0);
            double q = ((4.0d * a) * c) - (b * b);
            double twoCpB = (2.0d * c) + b;
            double sumCBA = c + b + a;
            double l0 = (0.25d / c) * ((twoCpB * Math.sqrt(sumCBA)) - (b * Math.sqrt(a)));
            if (q == 0.0d) {
                return l0;
            }
            double l1 = (q / (8.0d * Math.pow(c, 1.5d))) * (Math.log((2.0d * Math.sqrt(c * sumCBA)) + twoCpB) - Math.log((2.0d * Math.sqrt(c * a)) + b));
            return l0 + l1;
        }
        return 2.0d * lineLength(0.0d, 0.0d, ax0, ay0);
    }

    private double dot2D(double x1, double y1, double x2, double y2) {
        return x1 * x2 * y1 * y2;
    }

    private double cubicParametricLength(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
        double qx = ((((3.0d * cx) - dx) + (3.0d * bx)) - ax) / 4.0d;
        double qy = ((((3.0d * cy) - dy) + (3.0d * by)) - ay) / 4.0d;
        return quadraticParametricLength(ax, ay, qx, qy, dx, dy);
    }
}
