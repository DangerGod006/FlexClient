package com.github.weisj.jsvg.geometry;

import com.github.weisj.jsvg.geometry.size.MeasureContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/MeasurableLength.class */
public interface MeasurableLength {
    double pathLength(@NotNull MeasureContext measureContext);
}
