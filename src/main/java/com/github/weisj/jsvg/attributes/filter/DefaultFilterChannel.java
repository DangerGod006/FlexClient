package com.github.weisj.jsvg.attributes.filter;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/filter/DefaultFilterChannel.class */
public enum DefaultFilterChannel implements FilterChannelKey {
    SourceGraphic,
    SourceAlpha,
    BackgroundImage,
    BackgroundAlpha,
    FillPaint,
    StrokePaint,
    LastResult;

    @Override // com.github.weisj.jsvg.attributes.filter.FilterChannelKey
    @NotNull
    public Object key() {
        return this == LastResult ? this : toString();
    }
}
