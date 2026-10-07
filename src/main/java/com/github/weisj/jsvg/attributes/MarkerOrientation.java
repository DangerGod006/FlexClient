package com.github.weisj.jsvg.attributes;

import com.github.weisj.jsvg.geometry.size.Length;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/MarkerOrientation.class */
public abstract class MarkerOrientation {

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/MarkerOrientation$MarkerType.class */
    public enum MarkerType {
        START,
        MID,
        END
    }

    public abstract float orientationFor(@NotNull MarkerType markerType, float f, float f2, float f3, float f4);

    private MarkerOrientation() {
    }

    @NotNull
    public static MarkerOrientation parse(@Nullable String value, @NotNull AttributeParser parser) {
        if (value != null) {
            if (!"auto".equals(value)) {
                if (!"auto-start-reverse".equals(value)) {
                    float angle = parser.parseAngle(value, Float.NaN);
                    return Length.isSpecified(angle) ? new AngleOrientation(angle) : AngleOrientation.DEFAULT;
                }
                return AutoStartReverseOrientation.INSTANCE;
            }
            return AutoOrientation.INSTANCE;
        }
        return AngleOrientation.DEFAULT;
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/MarkerOrientation$AutoOrientation.class */
    private static final class AutoOrientation extends MarkerOrientation {

        @NotNull
        private static final AutoOrientation INSTANCE = new AutoOrientation();

        private AutoOrientation() {
            super();
        }

        @Override // com.github.weisj.jsvg.attributes.MarkerOrientation
        public float orientationFor(@NotNull MarkerType type, float dxIn, float dyIn, float dxOut, float dyOut) {
            switch (type) {
                case START:
                    return (float) Math.atan2(dyOut, dxOut);
                case END:
                    return (float) Math.atan2(dyIn, dxIn);
                case MID:
                    return (float) Math.atan2((dyIn + dyOut) / 2.0f, (dxIn + dxOut) / 2.0f);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/MarkerOrientation$AutoStartReverseOrientation.class */
    private static final class AutoStartReverseOrientation extends MarkerOrientation {

        @NotNull
        private static final AutoStartReverseOrientation INSTANCE = new AutoStartReverseOrientation();

        private AutoStartReverseOrientation() {
            super();
        }

        @Override // com.github.weisj.jsvg.attributes.MarkerOrientation
        public float orientationFor(@NotNull MarkerType type, float dxIn, float dyIn, float dxOut, float dyOut) {
            switch (type) {
                case START:
                    return (float) Math.atan2(-dyOut, -dxOut);
                case END:
                    return (float) Math.atan2(dyIn, dxIn);
                case MID:
                    return (float) Math.atan2((dyIn + dyOut) / 2.0f, (dxIn + dxOut) / 2.0f);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/attributes/MarkerOrientation$AngleOrientation.class */
    private static final class AngleOrientation extends MarkerOrientation {

        @NotNull
        private static final AngleOrientation DEFAULT = new AngleOrientation(0.0f);
        private final float angle;

        private AngleOrientation(float angle) {
            super();
            this.angle = angle;
        }

        @Override // com.github.weisj.jsvg.attributes.MarkerOrientation
        public float orientationFor(@NotNull MarkerType type, float dxIn, float dyIn, float dxOut, float dyOut) {
            return this.angle;
        }
    }
}
