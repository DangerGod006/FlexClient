package com.github.weisj.jsvg.attributes.stroke;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/stroke/LineCap.class */
public enum LineCap {
    Butt(0),
    Square(2),
    Round(1);

    private final int awtCode;

    LineCap(int awtCode) {
        this.awtCode = awtCode;
    }

    public int awtCode() {
        return this.awtCode;
    }
}
