package com.github.weisj.jsvg.attributes.filter;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/filter/ColorChannel.class */
public enum ColorChannel {
    R(2),
    G(1),
    B(0),
    A(3);

    private final int index;

    ColorChannel(int index) {
        this.index = index;
    }

    public int value(int pixelData) {
        return (pixelData >> (this.index * 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
    }
}
