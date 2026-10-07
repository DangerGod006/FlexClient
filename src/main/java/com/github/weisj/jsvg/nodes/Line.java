package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.geometry.SVGLine;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/Line.class */
@PermittedContent(categories = {Category.Animation, Category.Descriptive})
@ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
public final class Line extends ShapeNode {
    public static final String TAG = "line";

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.ShapeNode
    @NotNull
    protected MeasurableShape buildShape(@NotNull AttributeNode attributeNode) {
        return new SVGLine(attributeNode.getLength("x1", 0.0f), attributeNode.getLength("y1", 0.0f), attributeNode.getLength("x2", 0.0f), attributeNode.getLength("y2", 0.0f));
    }
}
