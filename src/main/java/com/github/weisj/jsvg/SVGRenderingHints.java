package com.github.weisj.jsvg;

import java.awt.RenderingHints;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/SVGRenderingHints.class */
public final class SVGRenderingHints {
    private static final int P_KEY_IMAGE_ANTIALIASING = 1;
    private static final int P_KEY_SOFT_CLIPPING = 2;
    public static final RenderingHints.Key KEY_IMAGE_ANTIALIASING = new Key(1);
    public static final Object VALUE_IMAGE_ANTIALIASING_ON = Value.ON;
    public static final Object VALUE_IMAGE_ANTIALIASING_OFF = Value.OFF;
    public static final RenderingHints.Key KEY_SOFT_CLIPPING = new Key(2);
    public static final Object VALUE_SOFT_CLIPPING_ON = Value.ON;
    public static final Object VALUE_SOFT_CLIPPING_OFF = Value.OFF;

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/SVGRenderingHints$Value.class */
    private enum Value {
        ON,
        OFF
    }

    private SVGRenderingHints() {
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/SVGRenderingHints$Key.class */
    private static final class Key extends RenderingHints.Key {
        private Key(int privateKey) {
            super(privateKey);
        }

        public boolean isCompatibleValue(@Nullable Object val) {
            return val instanceof Value;
        }
    }
}
