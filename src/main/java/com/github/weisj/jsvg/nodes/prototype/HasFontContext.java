package com.github.weisj.jsvg.nodes.prototype;

import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/prototype/HasFontContext.class */
public interface HasFontContext {
    @NotNull
    Mutator<MeasurableFontSpec> fontSpec();
}
