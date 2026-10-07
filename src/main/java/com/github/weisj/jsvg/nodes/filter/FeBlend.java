package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.BlendMode;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Composite;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeBlend.class */
@PermittedContent(anyOf = {Animate.class, Set.class})
@ElementCategories({Category.FilterPrimitive})
public final class FeBlend extends AbstractCompositeFilterPrimitive {
    public static final String TAG = "feblend";
    private Composite composite;

    @Override // com.github.weisj.jsvg.nodes.filter.AbstractCompositeFilterPrimitive, com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public /* bridge */ /* synthetic */ void applyFilter(@NotNull RenderContext renderContext, @NotNull FilterContext filterContext) {
        super.applyFilter(renderContext, filterContext);
    }

    @Override // com.github.weisj.jsvg.nodes.filter.AbstractCompositeFilterPrimitive, com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public /* bridge */ /* synthetic */ void layoutFilter(@NotNull RenderContext renderContext, @NotNull FilterLayoutContext filterLayoutContext) {
        super.layoutFilter(renderContext, filterLayoutContext);
    }

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.AbstractCompositeFilterPrimitive, com.github.weisj.jsvg.nodes.filter.AbstractFilterPrimitive, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        BlendMode blendMode = (BlendMode) attributeNode.getEnum("mode", BlendMode.Normal);
        this.composite = BlendModeComposite.create(blendMode);
    }

    @Override // com.github.weisj.jsvg.nodes.filter.AbstractCompositeFilterPrimitive
    @NotNull
    protected Composite composite() {
        return this.composite;
    }
}
