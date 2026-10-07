package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.nodes.SVGNode;
import com.github.weisj.jsvg.nodes.prototype.Container;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/ParsedElement.class */
public final class ParsedElement {

    @Nullable
    private final String id;

    @NotNull
    private final AttributeNode attributeNode;

    @NotNull
    private final SVGNode node;
    final CharacterDataParser characterDataParser;

    @NotNull
    private final List<ParsedElement> children = new ArrayList();

    @NotNull
    private BuildStatus buildStatus = BuildStatus.NOT_BUILT;

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/ParsedElement$BuildStatus.class */
    private enum BuildStatus {
        NOT_BUILT,
        IN_PROGRESS,
        FINISHED
    }

    ParsedElement(@Nullable String id, @NotNull AttributeNode element, @NotNull SVGNode node) {
        this.attributeNode = element;
        this.node = node;
        this.id = id;
        PermittedContent permittedContent = (PermittedContent) node.getClass().getAnnotation(PermittedContent.class);
        if (permittedContent == null) {
            throw new IllegalStateException("Element <" + node.tagName() + "> doesn't specify permitted content");
        }
        if (permittedContent.charData()) {
            this.characterDataParser = new CharacterDataParser();
        } else {
            this.characterDataParser = null;
        }
    }

    public void registerNamedElement(@NotNull String name, @NotNull Object element) {
        this.attributeNode.namedElements().put(name, element);
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @NotNull
    public List<ParsedElement> children() {
        return this.children;
    }

    @NotNull
    public SVGNode node() {
        return this.node;
    }

    @NotNull
    public SVGNode nodeEnsuringBuildStatus() {
        if (this.buildStatus == BuildStatus.IN_PROGRESS) {
            cyclicDependencyDetected();
        } else if (this.buildStatus == BuildStatus.NOT_BUILT) {
            build();
        }
        return this.node;
    }

    @NotNull
    public AttributeNode attributeNode() {
        return this.attributeNode;
    }

    void addChild(ParsedElement parsedElement) {
        this.children.add(parsedElement);
        if (this.node instanceof Container) {
            ((Container) this.node).addChild(parsedElement.id, parsedElement.node);
        }
    }

    void build() {
        if (this.buildStatus == BuildStatus.FINISHED) {
            return;
        }
        if (this.buildStatus == BuildStatus.IN_PROGRESS) {
            cyclicDependencyDetected();
            return;
        }
        this.buildStatus = BuildStatus.IN_PROGRESS;
        this.attributeNode.prepareForNodeBuilding(this);
        for (ParsedElement child : this.children) {
            child.build();
        }
        this.node.build(this.attributeNode);
        this.buildStatus = BuildStatus.FINISHED;
    }

    public String toString() {
        return "ParsedElement{node=" + this.node + '}';
    }

    private void cyclicDependencyDetected() {
        throw new IllegalStateException("Cyclic dependency involving node '" + this.id + "' detected.");
    }
}
