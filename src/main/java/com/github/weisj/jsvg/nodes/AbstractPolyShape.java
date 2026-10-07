package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.geometry.AWTSVGShape;
import com.github.weisj.jsvg.geometry.FillRuleAwareAWTSVGShape;
import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.nodes.prototype.HasFillRule;
import com.github.weisj.jsvg.parser.AttributeNode;
import java.awt.Rectangle;
import java.awt.geom.Path2D;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/AbstractPolyShape.class */
public abstract class AbstractPolyShape extends ShapeNode implements HasFillRule {
    private FillRule fillRule;

    protected abstract boolean doClose();

    @Override // com.github.weisj.jsvg.nodes.prototype.HasFillRule
    @NotNull
    public FillRule fillRule() {
        return this.fillRule;
    }

    @Override // com.github.weisj.jsvg.nodes.ShapeNode
    @NotNull
    protected final MeasurableShape buildShape(@NotNull AttributeNode attributeNode) {
        this.fillRule = FillRule.parse(attributeNode);
        float[] points = attributeNode.getFloatList("points");
        if (points.length > 0) {
            Path2D.Float r0 = new Path2D.Float(0, points.length / 2);
            r0.moveTo(points[0], points[1]);
            for (int i = 2; i < points.length; i += 2) {
                r0.lineTo(points[i], points[i + 1]);
            }
            if (doClose()) {
                r0.closePath();
            }
            return new FillRuleAwareAWTSVGShape(r0);
        }
        return new AWTSVGShape(new Rectangle());
    }
}
