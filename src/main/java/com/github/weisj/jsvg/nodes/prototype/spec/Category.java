package com.github.weisj.jsvg.nodes.prototype.spec;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/spec/Category.class */
public enum Category {
    Animation(false),
    BasicShape,
    Container,
    Descriptive(false),
    FilterPrimitive,
    Gradient,
    Graphic,
    GraphicsReferencing,
    Shape,
    Structural,
    TextContent,
    TextContentChild,
    None;

    private final boolean effectivelyAllowed;

    Category() {
        this(true);
    }

    Category(boolean effectivelyAllowed) {
        this.effectivelyAllowed = effectivelyAllowed;
    }

    public boolean isEffectivelyAllowed() {
        return this.effectivelyAllowed;
    }
}
