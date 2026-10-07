package com.github.weisj.jsvg.attributes;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/Overflow.class */
public enum Overflow {
    Auto(false),
    Visible(false),
    Hidden(true),
    Scroll(true);

    private final boolean establishesClip;

    Overflow(boolean establishesClip) {
        this.establishesClip = establishesClip;
    }

    public boolean establishesClip() {
        return this.establishesClip;
    }
}
