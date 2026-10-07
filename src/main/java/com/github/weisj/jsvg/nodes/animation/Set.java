package com.github.weisj.jsvg.nodes.animation;

import com.github.weisj.jsvg.nodes.MetaSVGNode;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/animation/Set.class */
@PermittedContent(categories = {Category.Descriptive})
@ElementCategories({Category.Animation})
public final class Set extends MetaSVGNode {
    public static final String TAG = "set";

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }
}
