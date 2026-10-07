package com.github.weisj.jsvg.nodes.mesh;

import com.github.weisj.jsvg.geometry.mesh.Bezier;
import com.github.weisj.jsvg.geometry.mesh.CoonPatch;
import com.github.weisj.jsvg.geometry.path.BezierPathCommand;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.Stop;
import java.awt.geom.Point2D;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/mesh/MeshBuilder.class */
final class MeshBuilder {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !MeshBuilder.class.desiredAssertionStatus();
    }

    private MeshBuilder() {
    }

    static void buildMesh(@NotNull MeshGradient meshGradient, @NotNull Point2D.Float origin) {
        Point2D.Float start = origin;
        int patchCount = -1;
        List<? extends SVGNode> rows = meshGradient.children();
        int rowCount = rows.size();
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            SVGNode child = rows.get(rowIndex);
            MeshRow row = (MeshRow) child;
            int rowPatchCount = row.children().size();
            if (patchCount == -1) {
                patchCount = rowPatchCount;
            }
            if (rowPatchCount != patchCount) {
                throw new IllegalStateException("Every mesh row needs to specify the same amount of patched");
            }
            List<? extends SVGNode> patchesInRow = row.children();
            int patchIndex = 0;
            while (patchIndex < rowPatchCount) {
                SVGNode node = patchesInRow.get(patchIndex);
                MeshPatch patch = (MeshPatch) node;
                List<? extends SVGNode> stops = patch.children();
                int stopCount = stops.size();
                int requiredStops = stopsForPatchPosition(rowIndex, patchIndex);
                if (stopCount < requiredStops) {
                    throw new IllegalStateException("Not enough stops specified");
                }
                int offset = offsetForPatchPosition(rowIndex);
                MeshPatch patchAbove = null;
                if (offset == 1) {
                    patchAbove = (MeshPatch) ((MeshRow) rows.get(rowIndex - 1)).children().get(patchIndex);
                    patch.coonPatch.north = patchAbove.coonPatch.south.inverse();
                    patch.north = patchAbove.west;
                }
                MeshPatch patchLeft = null;
                if (offset + requiredStops < 4) {
                    patchLeft = (MeshPatch) patchesInRow.get(patchIndex - 1);
                    patch.coonPatch.west = patchLeft.coonPatch.east.inverse();
                    patch.west = patchLeft.south;
                } else if (patchIndex > 0) {
                    patchLeft = (MeshPatch) patchesInRow.get(patchIndex - 1);
                }
                for (int stopIndex = 0; stopIndex < requiredStops; stopIndex++) {
                    Stop stop = (Stop) stops.get(stopIndex);
                    switch (stopIndex + offset) {
                        case 0:
                            patch.coonPatch.north = ((BezierPathCommand) Objects.requireNonNull(stop.bezierCommand())).createBezier(start);
                            start = patch.coonPatch.north.d;
                            patch.north = patchIndex > 0 ? ((MeshPatch) Objects.requireNonNull(patchLeft)).east : stop.color();
                            break;
                        case 1:
                            patch.coonPatch.east = ((BezierPathCommand) Objects.requireNonNull(stop.bezierCommand())).createBezier(patch.coonPatch.north.d);
                            patch.east = offset == 1 ? ((MeshPatch) Objects.requireNonNull(patchAbove)).south : stop.color();
                            break;
                        case 2:
                            patch.coonPatch.south = ((BezierPathCommand) Objects.requireNonNull(stop.bezierCommand())).createBezier(patch.coonPatch.east.d);
                            patch.south = stop.color();
                            break;
                        case 3:
                            patch.coonPatch.west = ((BezierPathCommand) Objects.requireNonNull(stop.bezierCommand())).createBezier(patch.coonPatch.south.d);
                            patch.coonPatch.west.d.setLocation(patch.coonPatch.north.a);
                            patch.west = stop.color();
                            break;
                        default:
                            if (!$assertionsDisabled) {
                                throw new AssertionError();
                            }
                            break;
                            break;
                    }
                }
                if (offset + requiredStops < 4) {
                    if (!$assertionsDisabled && patchLeft == null) {
                        throw new AssertionError();
                    }
                    patch.coonPatch.south.d.setLocation(patchLeft.coonPatch.east.d);
                }
                try {
                    assertPatchDefined(patch.coonPatch);
                    patchIndex++;
                } catch (IllegalStateException e) {
                    throw new IllegalStateException(rowIndex + "," + patchIndex + " " + patch.coonPatch, e);
                }
            }
        }
    }

    private static int stopsForPatchPosition(int rowIndex, int patchIndex) {
        if (rowIndex > 0) {
            if (patchIndex > 0) {
                return 2;
            }
            return 3;
        }
        if (patchIndex > 0) {
            return 3;
        }
        return 4;
    }

    private static int offsetForPatchPosition(int rowIndex) {
        if (rowIndex > 0) {
            return 1;
        }
        return 0;
    }

    private static void assertPatchDefined(@NotNull CoonPatch coonPatch) {
        if (coonPatch.north == null) {
            throw new IllegalStateException("North path is null");
        }
        if (coonPatch.east == null) {
            throw new IllegalStateException("East path is null");
        }
        if (coonPatch.south == null) {
            throw new IllegalStateException("South path is null");
        }
        if (coonPatch.west == null) {
            throw new IllegalStateException("West path is null");
        }
        if (hasUnspecifiedPoint(coonPatch.north)) {
            throw new IllegalStateException("North path has unspecified point");
        }
        if (hasUnspecifiedPoint(coonPatch.east)) {
            throw new IllegalStateException("East path has unspecified point");
        }
        if (hasUnspecifiedPoint(coonPatch.south)) {
            throw new IllegalStateException("South path has unspecified point");
        }
        if (hasUnspecifiedPoint(coonPatch.west)) {
            throw new IllegalStateException("West path has unspecified point");
        }
    }

    private static boolean hasUnspecifiedPoint(Bezier bezier) {
        if (isUnspecified(bezier.a) || isUnspecified(bezier.b) || isUnspecified(bezier.c)) {
            return true;
        }
        return isUnspecified(bezier.d);
    }

    private static boolean isUnspecified(@NotNull Point2D.Float p) {
        return (Length.isSpecified(p.x) && Length.isSpecified(p.y)) ? false : true;
    }
}
