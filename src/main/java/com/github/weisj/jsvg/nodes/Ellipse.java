package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.geometry.SVGEllipse;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/Ellipse.class */
@PermittedContent(categories = {Category.Animation, Category.Descriptive})
@ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
public final class Ellipse extends ShapeNode {
    public static final String TAG = "ellipse";

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.ShapeNode
    @NotNull
    protected MeasurableShape buildShape(@NotNull AttributeNode attributeNode) {
        return new SVGEllipse(attributeNode.getLength("cx", 0.0f), attributeNode.getLength("cy", 0.0f), attributeNode.getLength("rx", 0.0f), attributeNode.getLength("ry", 0.0f));
    }
}
