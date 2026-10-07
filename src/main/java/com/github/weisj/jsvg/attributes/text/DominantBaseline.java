package com.github.weisj.jsvg.attributes.text;

import com.github.weisj.jsvg.attributes.HasMatchName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/text/DominantBaseline.class */
public enum DominantBaseline implements HasMatchName {
    Auto,
    Ideographic,
    Alphabetic,
    Hanging,
    Mathematical,
    Central,
    Middle,
    TextAfterEdge("text-after-edge"),
    TextBottom("text-bottom"),
    TextBeforeEdge("text-before-edge"),
    TextTop("text-top");


    @NotNull
    private final String matchName;

    DominantBaseline(@NotNull String matchName) {
        this.matchName = matchName;
    }

    DominantBaseline() {
        this.matchName = name();
    }

    @Override // com.github.weisj.jsvg.attributes.HasMatchName
    @NotNull
    public String matchName() {
        return this.matchName;
    }
}
