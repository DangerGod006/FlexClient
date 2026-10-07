package com.github.weisj.jsvg.attributes;

import java.awt.MultipleGradientPaint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/SpreadMethod.class */
public enum SpreadMethod {
    Pad(MultipleGradientPaint.CycleMethod.NO_CYCLE),
    Reflect(MultipleGradientPaint.CycleMethod.REFLECT),
    Repeat(MultipleGradientPaint.CycleMethod.REPEAT);

    private final MultipleGradientPaint.CycleMethod cycleMethod;

    SpreadMethod(MultipleGradientPaint.CycleMethod cycleMethod) {
        this.cycleMethod = cycleMethod;
    }

    @NotNull
    public MultipleGradientPaint.CycleMethod cycleMethod() {
        return this.cycleMethod;
    }
}
