package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
import com.github.weisj.jsvg.nodes.AbstractSVGNode;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeMergeNode.class */
@PermittedContent(anyOf = {Animate.class, Set.class})
@ElementCategories({Category.None})
public final class FeMergeNode extends AbstractSVGNode {
    public static final String TAG = "feMergeNode";
    private FilterChannelKey inputChannel;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @NotNull
    public FilterChannelKey inputChannel() {
        return this.inputChannel;
    }

    @Override // com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.inputChannel = attributeNode.getFilterChannelKey("in", DefaultFilterChannel.LastResult);
    }
}
