package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/Polyline.class */
@PermittedContent(categories = {Category.Animation, Category.Descriptive})
@ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
public final class Polyline extends AbstractPolyShape {
    public static final String TAG = "polyline";

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractPolyShape
    protected boolean doClose() {
        return false;
    }

    @Override // com.github.weisj.jsvg.nodes.ShapeNode
    protected boolean shouldPaintStartEndMarkersInMiddle() {
        return false;
    }
}
