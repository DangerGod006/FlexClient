package com.github.weisj.jsvg.parser.css;

import com.github.weisj.jsvg.parser.ParsedElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/css/StyleSheet.class */
public interface StyleSheet {

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/css/StyleSheet$RuleConsumer.class */
    public interface RuleConsumer {
        void applyRule(@NotNull StyleProperty styleProperty);
    }

    void forEachMatchingRule(@NotNull ParsedElement parsedElement, @NotNull RuleConsumer ruleConsumer);
}
