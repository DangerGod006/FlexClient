package com.github.weisj.jsvg.attributes.stroke;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/stroke/LineJoin.class */
public enum LineJoin {
    Miter(0),
    Round(1),
    Bevel(2);

    private final int awtCode;

    LineJoin(int awtCode) {
        this.awtCode = awtCode;
    }

    public int awtCode() {
        return this.awtCode;
    }
}
