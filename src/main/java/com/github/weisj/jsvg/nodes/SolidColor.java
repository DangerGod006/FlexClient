package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.paint.SimplePaintSVGPaint;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.util.ColorUtil;
import java.awt.Color;
import java.awt.Paint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/SolidColor.class */
@PermittedContent(categories = {Category.Animation, Category.Descriptive})
@ElementCategories({Category.Gradient})
public final class SolidColor extends AbstractSVGNode implements SimplePaintSVGPaint {
    public static final String TAG = "solidcolor";
    private Color color;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.attributes.paint.SimplePaintSVGPaint
    @NotNull
    public Paint paint() {
        return this.color;
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        Color c = attributeNode.getColor("solid-color");
        float opacity = attributeNode.getPercentage("solid-opacity", c.getAlpha() / 255.0f);
        this.color = ColorUtil.withAlpha(c, opacity);
    }
}
