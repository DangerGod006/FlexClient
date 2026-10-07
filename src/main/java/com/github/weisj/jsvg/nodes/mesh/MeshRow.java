package com.github.weisj.jsvg.nodes.mesh;

import com.github.weisj.jsvg.nodes.Style;
import com.github.weisj.jsvg.nodes.container.ContainerNode;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/mesh/MeshRow.class */
@PermittedContent(categories = {Category.Descriptive}, anyOf = {MeshPatch.class, Style.class})
@ElementCategories({})
public final class MeshRow extends ContainerNode {
    public static final String TAG = "meshrow";

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }
}
