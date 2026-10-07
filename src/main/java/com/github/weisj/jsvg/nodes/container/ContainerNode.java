package com.github.weisj.jsvg.nodes.container;

import com.github.weisj.jsvg.nodes.SVGNode;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/container/ContainerNode.class */
public abstract class ContainerNode extends BaseContainerNode<SVGNode> {
    private final List<SVGNode> children = new ArrayList();

    @Override // com.github.weisj.jsvg.nodes.container.BaseContainerNode
    protected void doAdd(@NotNull SVGNode node) {
        this.children.add(node);
    }

    @Override // com.github.weisj.jsvg.nodes.prototype.Container
    public List<? extends SVGNode> children() {
        return this.children;
    }
}
