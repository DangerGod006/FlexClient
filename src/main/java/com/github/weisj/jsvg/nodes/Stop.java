package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.paint.PaintParser;
import com.github.weisj.jsvg.geometry.path.BezierPathCommand;
import com.github.weisj.jsvg.geometry.path.PathParser;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.util.ColorUtil;
import java.awt.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/Stop.class */
@PermittedContent(anyOf = {Animate.class, Set.class})
@ElementCategories({Category.Gradient})
public final class Stop extends AbstractSVGNode {
    public static final String TAG = "stop";

    @NotNull
    private Color color = PaintParser.DEFAULT_COLOR;
    private float offset;

    @Nullable
    private BezierPathCommand path;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @NotNull
    public Color color() {
        return this.color;
    }

    public float offset() {
        return this.offset;
    }

    @Nullable
    public BezierPathCommand bezierCommand() {
        return this.path;
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        Color c = attributeNode.getColor("stop-color");
        float opacity = attributeNode.getPercentage("stop-opacity", c.getAlpha() / 255.0f);
        this.color = ColorUtil.withAlpha(c, opacity);
        this.offset = attributeNode.getPercentage("offset", 0.0f);
        String pathData = attributeNode.getValue(Path.TAG);
        this.path = pathData != null ? new PathParser(pathData).parseMeshCommand() : null;
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode
    public String toString() {
        return "Stop{color=" + this.color + ", offset=" + this.offset + '}';
    }
}
