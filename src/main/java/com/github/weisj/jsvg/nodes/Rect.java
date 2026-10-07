package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.geometry.SVGRectangle;
import com.github.weisj.jsvg.geometry.SVGRoundRectangle;
import com.github.weisj.jsvg.geometry.size.Length;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/Rect.class */
@PermittedContent(categories = {Category.Animation, Category.Descriptive})
@ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
public final class Rect extends ShapeNode {
    public static final String TAG = "rect";

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.ShapeNode
    @NotNull
    protected MeasurableShape buildShape(@NotNull AttributeNode node) {
        Length x = node.getLength("x", 0.0f);
        Length y = node.getLength("y", 0.0f);
        Length width = node.getLength("width", 0.0f);
        Length height = node.getLength("height", 0.0f);
        Length rx = node.getLength("rx", Length.UNSPECIFIED);
        Length ry = node.getLength("ry", rx);
        if (rx.isUnspecified()) {
            rx = ry;
        }
        Length rx2 = rx.coerceNonNegative().orElseIfUnspecified(0.0f);
        Length ry2 = ry.coerceNonNegative().orElseIfUnspecified(0.0f);
        if (rx2.isZero() && ry2.isZero()) {
            return new SVGRectangle(x, y, width, height);
        }
        return new SVGRoundRectangle(x, y, width, height, rx2, ry2);
    }
}
