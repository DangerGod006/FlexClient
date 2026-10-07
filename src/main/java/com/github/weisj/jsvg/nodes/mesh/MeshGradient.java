package com.github.weisj.jsvg.nodes.mesh;

import com.github.weisj.jsvg.attributes.UnitType;
import com.github.weisj.jsvg.attributes.paint.SVGPaint;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.geometry.size.MeasureContext;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.Output;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/mesh/MeshGradient.class */
@PermittedContent(categories = {Category.Descriptive}, anyOf = {MeshRow.class, Animate.class, AnimateTransform.class, Set.class})
@ElementCategories({Category.Gradient})
public final class MeshGradient extends ContainerNode implements SVGPaint {
    public static final String TAG = "meshgradient";
    private Length x;
    private Length y;
    private UnitType gradientUnits;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.x = attributeNode.getLength("x", 0.0f);
        this.y = attributeNode.getLength("y", 0.0f);
        this.gradientUnits = (UnitType) attributeNode.getEnum("gradientUnits", UnitType.ObjectBoundingBox);
        MeshBuilder.buildMesh(this, new Point2D.Float(this.x.raw(), this.y.raw()));
    }

    public void renderMesh(@NotNull MeasureContext measure, @NotNull Output output) {
        Output meshOutput = output.createChild();
        meshOutput.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        for (SVGNode child : children()) {
            MeshRow row = (MeshRow) child;
            for (SVGNode node : row.children()) {
                MeshPatch patch = (MeshPatch) node;
                patch.renderPath(meshOutput);
            }
        }
        meshOutput.dispose();
    }

    @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
    public void fillShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
        Output.SafeState safeState = output.safeState();
        Rectangle2D b = bounds != null ? bounds : shape.getBounds2D();
        output.setClip(shape);
        output.translate(b.getX(), b.getY());
        renderMesh(context.measureContext(), output);
        safeState.restore();
    }

    @Override // com.github.weisj.jsvg.attributes.paint.SVGPaint
    public void drawShape(@NotNull Output output, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
        Output.SafeState safeState = output.safeState();
        Rectangle2D b = bounds != null ? bounds : shape.getBounds2D();
        output.setClip(output.stroke().createStrokedShape(shape));
        output.translate(b.getX(), b.getY());
        renderMesh(context.measureContext(), output);
        safeState.restore();
    }
}
