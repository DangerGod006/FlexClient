package com.github.weisj.jsvg.parser.css.impl;

import com.github.weisj.jsvg.parser.ParsedElement;
import com.github.weisj.jsvg.parser.SeparatorMode;
import com.github.weisj.jsvg.parser.css.StyleProperty;
import com.github.weisj.jsvg.parser.css.StyleSheet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/css/impl/SimpleStyleSheet.class */
public final class SimpleStyleSheet implements StyleSheet {

    @NotNull
    private final Map<String, List<StyleProperty>> classRules = new HashMap();

    @NotNull
    private final Map<String, List<StyleProperty>> idRules = new HashMap();

    @NotNull
    private final Map<String, List<StyleProperty>> tagNameRules = new HashMap();

    @NotNull
    public Map<String, List<StyleProperty>> classRules() {
        return this.classRules;
    }

    @NotNull
    public Map<String, List<StyleProperty>> idRules() {
        return this.idRules;
    }

    @NotNull
    public Map<String, List<StyleProperty>> tagNameRules() {
        return this.tagNameRules;
    }

    void addTagNameRules(@NotNull String tagName, @NotNull List<StyleProperty> rule) {
        this.tagNameRules.computeIfAbsent(tagName, k -> {
            return new ArrayList();
        }).addAll(rule);
    }

    void addClassRules(@NotNull String className, @NotNull List<StyleProperty> rule) {
        this.classRules.computeIfAbsent(className, k -> {
            return new ArrayList();
        }).addAll(rule);
    }

    void addIdRules(@NotNull String id, @NotNull List<StyleProperty> rule) {
        this.idRules.computeIfAbsent(id, k -> {
            return new ArrayList();
        }).addAll(rule);
    }

    @Override // com.github.weisj.jsvg.parser.css.StyleSheet
    public void forEachMatchingRule(@NotNull ParsedElement element, @NotNull StyleSheet.RuleConsumer ruleConsumer) {
        List<StyleProperty> rules;
        List<StyleProperty> rules2 = this.tagNameRules.get(element.node().tagName());
        if (rules2 != null) {
            Objects.requireNonNull(ruleConsumer);
            rules2.forEach(ruleConsumer::applyRule);
        }
        if (element.id() != null && (rules = this.idRules.get(element.id())) != null) {
            Objects.requireNonNull(ruleConsumer);
            rules.forEach(ruleConsumer::applyRule);
        }
        for (String className : element.attributeNode().getStringList("class", SeparatorMode.WHITESPACE_ONLY)) {
            List<StyleProperty> rules3 = this.classRules.get(className);
            if (rules3 != null) {
                Objects.requireNonNull(ruleConsumer);
                rules3.forEach(ruleConsumer::applyRule);
            }
        }
    }
}
