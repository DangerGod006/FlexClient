package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.CompositeMode;
import com.github.weisj.jsvg.nodes.filter.AbstractBlendComposite;
import com.github.weisj.jsvg.parser.AttributeNode;
import java.awt.AlphaComposite;
import java.awt.Composite;
import kotlin.KotlinVersion;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/CompositeModeComposite.class */
public final class CompositeModeComposite {

    @NotNull
    private final Composite composite;

    public CompositeModeComposite(@NotNull AttributeNode attributeNode) {
        this.composite = createComposite(attributeNode);
    }

    @NotNull
    public Composite composite() {
        return this.composite;
    }

    /* JADX INFO: renamed from: com.github.weisj.jsvg.nodes.filter.CompositeModeComposite$1, reason: invalid class name */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/CompositeModeComposite$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$weisj$jsvg$attributes$filter$CompositeMode = new int[CompositeMode.values().length];

        static {
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$CompositeMode[CompositeMode.Over.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$CompositeMode[CompositeMode.In.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$CompositeMode[CompositeMode.Out.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$CompositeMode[CompositeMode.Atop.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$CompositeMode[CompositeMode.Xor.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$CompositeMode[CompositeMode.Lighter.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$CompositeMode[CompositeMode.Arithmetic.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @NotNull
    private static Composite createComposite(@NotNull AttributeNode attributeNode) {
        CompositeMode compositeMode = (CompositeMode) attributeNode.getEnum("operator", CompositeMode.Over);
        switch (AnonymousClass1.$SwitchMap$com$github$weisj$jsvg$attributes$filter$CompositeMode[compositeMode.ordinal()]) {
            case 1:
                return AlphaComposite.SrcOver;
            case 2:
                return AlphaComposite.SrcIn;
            case 3:
                return AlphaComposite.SrcOut;
            case 4:
                return AlphaComposite.SrcAtop;
            case AbstractJsonLexerKt.TC_COLON /* 5 */:
                return AlphaComposite.Xor;
            case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                return new LighterComposite(null);
            case AbstractJsonLexerKt.TC_END_OBJ /* 7 */:
                return new ArithmeticComposite(attributeNode.getInt("k1", 0), attributeNode.getInt("k2", 0), attributeNode.getInt("k3", 0), attributeNode.getInt("k4", 0), null);
            default:
                throw new IllegalStateException();
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/CompositeModeComposite$ArithmeticComposite.class */
    private static final class ArithmeticComposite extends AbstractBlendComposite implements AbstractBlendComposite.Blender {
        private final int k1;
        private final int k2;
        private final int k3;
        private final int k4;

        /* synthetic */ ArithmeticComposite(int x0, int x1, int x2, int x3, AnonymousClass1 x4) {
            this(x0, x1, x2, x3);
        }

        private ArithmeticComposite(int k1, int k2, int k3, int k4) {
            this.k1 = k1;
            this.k2 = k2;
            this.k3 = k3;
            this.k4 = k4;
        }

        @Override // com.github.weisj.jsvg.nodes.filter.AbstractBlendComposite
        @NotNull
        protected AbstractBlendComposite.Blender blender() {
            return this;
        }

        @Override // com.github.weisj.jsvg.nodes.filter.AbstractBlendComposite.Blender
        public void blend(int[] src, int[] dst, int[] result) {
            result[0] = Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (this.k1 * src[0] * dst[0]) + (this.k2 * src[0]) + (this.k3 * dst[0]) + this.k4));
            result[1] = Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (this.k1 * src[1] * dst[1]) + (this.k2 * src[1]) + (this.k3 * dst[1]) + this.k4));
            result[2] = Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (this.k1 * src[2] * dst[2]) + (this.k2 * src[2]) + (this.k3 * dst[2]) + this.k4));
            result[3] = Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (this.k1 * src[3] * dst[3]) + (this.k2 * src[3]) + (this.k3 * dst[3]) + this.k4));
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/CompositeModeComposite$LighterComposite.class */
    private static final class LighterComposite extends AbstractBlendComposite implements AbstractBlendComposite.Blender {
        private LighterComposite() {
        }

        /* synthetic */ LighterComposite(AnonymousClass1 x0) {
            this();
        }

        @Override // com.github.weisj.jsvg.nodes.filter.AbstractBlendComposite
        @NotNull
        protected AbstractBlendComposite.Blender blender() {
            return this;
        }

        @Override // com.github.weisj.jsvg.nodes.filter.AbstractBlendComposite.Blender
        public void blend(int[] src, int[] dst, int[] result) {
            result[0] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, src[0] + dst[0]);
            result[1] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, src[1] + dst[1]);
            result[2] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, src[2] + dst[2]);
            result[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, src[3] + dst[3]);
        }
    }
}
