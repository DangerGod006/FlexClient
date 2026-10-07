package com.github.weisj.jsvg.geometry.mesh;

import java.awt.geom.Point2D;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/mesh/CoonValues.class */
public final class CoonValues {
    public final Point2D.Float north;
    public final Point2D.Float east;
    public final Point2D.Float south;
    public final Point2D.Float west;

    public CoonValues(Point2D.Float north, Point2D.Float east, Point2D.Float south, Point2D.Float west) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    public String toString() {
        return "CoonValues{north=" + this.north + ", east=" + this.east + ", south=" + this.south + ", west=" + this.west + '}';
    }
}
