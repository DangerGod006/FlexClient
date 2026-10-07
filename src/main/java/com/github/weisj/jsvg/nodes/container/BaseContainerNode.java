package com.github.weisj.jsvg.nodes.container;

import com.github.weisj.jsvg.nodes.AbstractSVGNode;
import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.prototype.Container;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/container/BaseContainerNode.class */
public abstract class BaseContainerNode<E> extends AbstractSVGNode implements Container<E> {
    private static final boolean EXHAUSTIVE_CHECK = true;
    private static final Logger LOGGER = Logger.getLogger(BaseContainerNode.class.getName());

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/container/BaseContainerNode$CategoryCheckResult.class */
    private enum CategoryCheckResult {
        Allowed,
        Denied,
        Excluded
    }

    protected abstract void doAdd(@NotNull SVGNode sVGNode);

    @Override // com.github.weisj.jsvg.nodes.prototype.Container
    public final void addChild(@Nullable String id, @NotNull SVGNode node) {
        if (isAcceptableType(node) && acceptChild(id, node)) {
            doAdd(node);
        }
    }

    protected boolean acceptChild(@Nullable String id, @NotNull SVGNode node) {
        return true;
    }

    protected boolean isAcceptableType(@NotNull SVGNode node) {
        PermittedContent allowedNodes = (PermittedContent) getClass().getAnnotation(PermittedContent.class);
        if (allowedNodes == null) {
            throw new IllegalStateException(String.format("Element <%s> doesn't specify permitted content information", tagName()));
        }
        if (allowedNodes.any()) {
            return true;
        }
        Class<?> cls = node.getClass();
        ElementCategories categories = (ElementCategories) cls.getAnnotation(ElementCategories.class);
        if (categories == null) {
            throw new IllegalStateException("Element <" + node.tagName() + "> doesn't specify element category information");
        }
        CategoryCheckResult result = doIntersect(allowedNodes.categories(), categories.value());
        if (result == CategoryCheckResult.Allowed) {
            return true;
        }
        for (Class<? extends SVGNode> type : allowedNodes.anyOf()) {
            if (type.isAssignableFrom(cls)) {
                return true;
            }
        }
        if (result != CategoryCheckResult.Excluded) {
            LOGGER.warning(() -> {
                return String.format("Element <%s> not allowed in <%s> (or not implemented)", node.tagName(), tagName());
            });
            return false;
        }
        return false;
    }

    private CategoryCheckResult doIntersect(Category[] requested, Category[] provided) {
        CategoryCheckResult result = CategoryCheckResult.Denied;
        for (Category request : requested) {
            boolean effectivelyAllowed = request.isEffectivelyAllowed();
            if (!effectivelyAllowed) {
            }
            for (Category category : provided) {
                if (request == category) {
                    if (effectivelyAllowed) {
                        return CategoryCheckResult.Allowed;
                    }
                    result = CategoryCheckResult.Excluded;
                }
            }
        }
        return result;
    }
}
