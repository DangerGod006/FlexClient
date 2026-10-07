package com.github.weisj.jsvg.nodes.mesh;

import com.github.weisj.jsvg.geometry.mesh.CoonPatch;
import com.github.weisj.jsvg.geometry.mesh.CoonValues;
import com.github.weisj.jsvg.geometry.mesh.Subdivided;
import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.nodes.Stop;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.renderer.Output;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import kotlin.KotlinVersion;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/mesh/MeshPatch.class */
@PermittedContent(categories = {Category.Descriptive}, anyOf = {Stop.class})
@ElementCategories({})
public final class MeshPatch extends ContainerNode {
    public static final String TAG = "meshpatch";
    private static final int MAX_DEPTH = 10;
    Color north;
    Color east;
    Color south;
    Color west;

    @NotNull
    final CoonPatch coonPatch = CoonPatch.createUninitialized();

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    public void renderPath(@NotNull Output output) {
        if (!output.supportsColors()) {
            output.fillShape(this.coonPatch.toShape());
            return;
        }
        AffineTransform at = output.transform();
        float scaleX = (float) GeometryUtil.scaleYOfTransform(at);
        float scaleY = (float) GeometryUtil.scaleYOfTransform(at);
        int depth = Math.max(Math.max(this.coonPatch.north.estimateStepCount(scaleX, scaleY), this.coonPatch.east.estimateStepCount(scaleX, scaleY)), Math.max(this.coonPatch.south.estimateStepCount(scaleX, scaleY), this.coonPatch.west.estimateStepCount(scaleX, scaleY)));
        renderPath(output, this.coonPatch, scaleX, scaleY, Math.min(10, depth));
    }

    private void renderPath(@NotNull Output output, @NotNull CoonPatch patch, float scaleX, float scaleY, int depth) {
        CoonValues weights = patch.coonValues;
        if (depth == 0 || GeometryUtil.distanceSquared(weights.north, weights.south, scaleX, scaleY) * GeometryUtil.distanceSquared(weights.east, weights.west, scaleX, scaleY) < 1.0E-6d) {
            float u = (((weights.north.x + weights.east.x) + weights.south.x) + weights.west.x) / 4.0f;
            float v = (((weights.north.y + weights.east.y) + weights.south.y) + weights.west.y) / 4.0f;
            output.setPaint((Paint) bilinearInterpolation(u, v));
            Shape s = patch.toShape();
            output.fillShape(s.getBounds2D());
            return;
        }
        Subdivided<CoonPatch> patchSubdivided = patch.subdivide();
        renderPath(output, patchSubdivided.northWest, scaleX, scaleY, depth - 1);
        renderPath(output, patchSubdivided.northEast, scaleX, scaleY, depth - 1);
        renderPath(output, patchSubdivided.southEast, scaleX, scaleY, depth - 1);
        renderPath(output, patchSubdivided.southWest, scaleX, scaleY, depth - 1);
    }

    @NotNull
    private Color bilinearInterpolation(float dx, float dy) {
        float r = GeometryUtil.lerp(dy, GeometryUtil.lerp(dx, this.north.getRed(), this.east.getRed()), GeometryUtil.lerp(dx, this.west.getRed(), this.south.getRed()));
        float g = GeometryUtil.lerp(dy, GeometryUtil.lerp(dx, this.north.getGreen(), this.east.getGreen()), GeometryUtil.lerp(dx, this.west.getGreen(), this.south.getGreen()));
        float b = GeometryUtil.lerp(dy, GeometryUtil.lerp(dx, this.north.getBlue(), this.east.getBlue()), GeometryUtil.lerp(dx, this.west.getBlue(), this.south.getBlue()));
        float a = GeometryUtil.lerp(dy, GeometryUtil.lerp(dx, this.north.getAlpha(), this.east.getAlpha()), GeometryUtil.lerp(dx, this.west.getAlpha(), this.south.getAlpha()));
        return new Color(clampColor(r), clampColor(g), clampColor(b), clampColor(a));
    }

    private int clampColor(float v) {
        return Math.max(Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (int) v), 0);
    }
}
