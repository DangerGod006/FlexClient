package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.BlendMode;
import com.github.weisj.jsvg.nodes.filter.AbstractBlendComposite;
import com.github.weisj.jsvg.util.ColorUtil;
import java.awt.AlphaComposite;
import java.awt.Composite;
import kotlin.KotlinVersion;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/BlendModeComposite.class */
public final class BlendModeComposite extends AbstractBlendComposite {

    @NotNull
    private final AbstractBlendComposite.Blender blender;

    private BlendModeComposite(BlendMode blendMode) {
        this.blender = createBlender(blendMode);
    }

    @NotNull
    public static Composite create(BlendMode mode) {
        return mode == BlendMode.Normal ? AlphaComposite.SrcOver : new BlendModeComposite(mode);
    }

    @Override // com.github.weisj.jsvg.nodes.filter.AbstractBlendComposite
    @NotNull
    protected AbstractBlendComposite.Blender blender() {
        return this.blender;
    }

    /* JADX INFO: renamed from: com.github.weisj.jsvg.nodes.filter.BlendModeComposite$1, reason: invalid class name */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/BlendModeComposite$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode = new int[BlendMode.values().length];

        static {
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Multiply.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Screen.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Overlay.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Darken.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Lighten.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.ColorDodge.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.ColorBurn.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.HardLight.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.SoftLight.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Difference.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Exclusion.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Hue.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Saturation.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Color.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[BlendMode.Luminosity.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
        }
    }

    private static AbstractBlendComposite.Blender createBlender(BlendMode blendMode) {
        switch (AnonymousClass1.$SwitchMap$com$github$weisj$jsvg$attributes$filter$BlendMode[blendMode.ordinal()]) {
            case 1:
                throw new IllegalStateException("Use AlphaComposite.SrcOver instead");
            case 2:
                return (src, dst, result) -> {
                    result[0] = (src[0] * dst[0]) >> 8;
                    result[1] = (src[1] * dst[1]) >> 8;
                    result[2] = (src[2] * dst[2]) >> 8;
                    result[3] = (src[3] * dst[3]) >> 8;
                };
            case 3:
                return (src2, dst2, result2) -> {
                    result2[0] = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src2[0]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst2[0])) >> 8);
                    result2[1] = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src2[1]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst2[1])) >> 8);
                    result2[2] = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src2[2]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst2[2])) >> 8);
                    result2[3] = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src2[3]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst2[3])) >> 8);
                };
            case 4:
                return (src3, dst3, result3) -> {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    if (dst3[0] < 128) {
                        i = (dst3[0] * src3[0]) >> 7;
                    } else {
                        i = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - dst3[0]) * (KotlinVersion.MAX_COMPONENT_VALUE - src3[0])) >> 7);
                    }
                    result3[0] = i;
                    if (dst3[1] < 128) {
                        i2 = (dst3[1] * src3[1]) >> 7;
                    } else {
                        i2 = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - dst3[1]) * (KotlinVersion.MAX_COMPONENT_VALUE - src3[1])) >> 7);
                    }
                    result3[1] = i2;
                    if (dst3[2] < 128) {
                        i3 = (dst3[2] * src3[2]) >> 7;
                    } else {
                        i3 = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - dst3[2]) * (KotlinVersion.MAX_COMPONENT_VALUE - src3[2])) >> 7);
                    }
                    result3[2] = i3;
                    if (dst3[3] < 128) {
                        i4 = (dst3[3] * src3[3]) >> 7;
                    } else {
                        i4 = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - dst3[3]) * (KotlinVersion.MAX_COMPONENT_VALUE - src3[3])) >> 7);
                    }
                    result3[3] = i4;
                };
            case AbstractJsonLexerKt.TC_COLON /* 5 */:
                return (src4, dst4, result4) -> {
                    result4[0] = Math.min(src4[0], dst4[0]);
                    result4[1] = Math.min(src4[1], dst4[1]);
                    result4[2] = Math.min(src4[2], dst4[2]);
                    result4[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src4[3] + dst4[3]) - ((src4[3] * dst4[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                return (src5, dst5, result5) -> {
                    result5[0] = Math.max(src5[0], dst5[0]);
                    result5[1] = Math.max(src5[1], dst5[1]);
                    result5[2] = Math.max(src5[2], dst5[2]);
                    result5[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src5[3] + dst5[3]) - ((src5[3] * dst5[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            case AbstractJsonLexerKt.TC_END_OBJ /* 7 */:
                return (src6, dst6, result6) -> {
                    result6[0] = src6[0] == 255 ? KotlinVersion.MAX_COMPONENT_VALUE : Math.min((dst6[0] << 8) / (KotlinVersion.MAX_COMPONENT_VALUE - src6[0]), KotlinVersion.MAX_COMPONENT_VALUE);
                    result6[1] = src6[1] == 255 ? KotlinVersion.MAX_COMPONENT_VALUE : Math.min((dst6[1] << 8) / (KotlinVersion.MAX_COMPONENT_VALUE - src6[1]), KotlinVersion.MAX_COMPONENT_VALUE);
                    result6[2] = src6[2] == 255 ? KotlinVersion.MAX_COMPONENT_VALUE : Math.min((dst6[2] << 8) / (KotlinVersion.MAX_COMPONENT_VALUE - src6[2]), KotlinVersion.MAX_COMPONENT_VALUE);
                    result6[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src6[3] + dst6[3]) - ((src6[3] * dst6[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            case 8:
                return (src7, dst7, result7) -> {
                    result7[0] = src7[0] == 0 ? 0 : Math.max(0, KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - dst7[0]) << 8) / src7[0]));
                    result7[1] = src7[1] == 0 ? 0 : Math.max(0, KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - dst7[1]) << 8) / src7[1]));
                    result7[2] = src7[2] == 0 ? 0 : Math.max(0, KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - dst7[2]) << 8) / src7[2]));
                    result7[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src7[3] + dst7[3]) - ((src7[3] * dst7[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            case AbstractJsonLexerKt.TC_END_LIST /* 9 */:
                return (src8, dst8, result8) -> {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    if (src8[0] < 128) {
                        i = (dst8[0] * src8[0]) >> 7;
                    } else {
                        i = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src8[0]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst8[0])) >> 7);
                    }
                    result8[0] = i;
                    if (src8[1] < 128) {
                        i2 = (dst8[1] * src8[1]) >> 7;
                    } else {
                        i2 = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src8[1]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst8[1])) >> 7);
                    }
                    result8[1] = i2;
                    if (src8[2] < 128) {
                        i3 = (dst8[2] * src8[2]) >> 7;
                    } else {
                        i3 = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src8[2]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst8[2])) >> 7);
                    }
                    result8[2] = i3;
                    if (src8[3] < 128) {
                        i4 = (dst8[3] * src8[3]) >> 7;
                    } else {
                        i4 = KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src8[3]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst8[3])) >> 7);
                    }
                    result8[3] = i4;
                };
            case 10:
                return (src9, dst9, result9) -> {
                    int mRed = (src9[0] * dst9[0]) / KotlinVersion.MAX_COMPONENT_VALUE;
                    int mGreen = (src9[1] * dst9[1]) / KotlinVersion.MAX_COMPONENT_VALUE;
                    int mBlue = (src9[2] * dst9[2]) / KotlinVersion.MAX_COMPONENT_VALUE;
                    result9[0] = mRed + ((src9[0] * ((KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src9[0]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst9[0])) / KotlinVersion.MAX_COMPONENT_VALUE)) - mRed)) / KotlinVersion.MAX_COMPONENT_VALUE);
                    result9[1] = mGreen + ((src9[1] * ((KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src9[1]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst9[1])) / KotlinVersion.MAX_COMPONENT_VALUE)) - mGreen)) / KotlinVersion.MAX_COMPONENT_VALUE);
                    result9[2] = mBlue + ((src9[2] * ((KotlinVersion.MAX_COMPONENT_VALUE - (((KotlinVersion.MAX_COMPONENT_VALUE - src9[2]) * (KotlinVersion.MAX_COMPONENT_VALUE - dst9[2])) / KotlinVersion.MAX_COMPONENT_VALUE)) - mBlue)) / KotlinVersion.MAX_COMPONENT_VALUE);
                    result9[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src9[3] + dst9[3]) - ((src9[3] * dst9[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            case 11:
                return (src10, dst10, result10) -> {
                    result10[0] = Math.abs(dst10[0] - src10[0]);
                    result10[1] = Math.abs(dst10[1] - src10[1]);
                    result10[2] = Math.abs(dst10[2] - src10[2]);
                    result10[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src10[3] + dst10[3]) - ((src10[3] * dst10[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            case 12:
                return (src11, dst11, result11) -> {
                    result11[0] = (dst11[0] + src11[0]) - ((dst11[0] * src11[0]) >> 7);
                    result11[1] = (dst11[1] + src11[1]) - ((dst11[1] * src11[1]) >> 7);
                    result11[2] = (dst11[2] + src11[2]) - ((dst11[2] * src11[2]) >> 7);
                    result11[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src11[3] + dst11[3]) - ((src11[3] * dst11[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            case 13:
                return (src12, dst12, result12) -> {
                    float[] srcHSL = new float[3];
                    ColorUtil.RGBtoHSL(src12[0], src12[1], src12[2], srcHSL);
                    float[] dstHSL = new float[3];
                    ColorUtil.RGBtoHSL(dst12[0], dst12[1], dst12[2], dstHSL);
                    ColorUtil.HSLtoRGB(srcHSL[0], dstHSL[1], dstHSL[2], result12);
                    result12[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src12[3] + dst12[3]) - ((src12[3] * dst12[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            case 14:
                return (src13, dst13, result13) -> {
                    float[] srcHSL = new float[3];
                    ColorUtil.RGBtoHSL(src13[0], src13[1], src13[2], srcHSL);
                    float[] dstHSL = new float[3];
                    ColorUtil.RGBtoHSL(dst13[0], dst13[1], dst13[2], dstHSL);
                    ColorUtil.HSLtoRGB(dstHSL[0], srcHSL[1], dstHSL[2], result13);
                    result13[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src13[3] + dst13[3]) - ((src13[3] * dst13[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            case 15:
                return (src14, dst14, result14) -> {
                    float[] srcHSL = new float[3];
                    ColorUtil.RGBtoHSL(src14[0], src14[1], src14[2], srcHSL);
                    float[] dstHSL = new float[3];
                    ColorUtil.RGBtoHSL(dst14[0], dst14[1], dst14[2], dstHSL);
                    ColorUtil.HSLtoRGB(srcHSL[0], srcHSL[1], dstHSL[2], result14);
                    result14[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src14[3] + dst14[3]) - ((src14[3] * dst14[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            case 16:
                return (src15, dst15, result15) -> {
                    float[] srcHSL = new float[3];
                    ColorUtil.RGBtoHSL(src15[0], src15[1], src15[2], srcHSL);
                    float[] dstHSL = new float[3];
                    ColorUtil.RGBtoHSL(dst15[0], dst15[1], dst15[2], dstHSL);
                    ColorUtil.HSLtoRGB(dstHSL[0], dstHSL[1], srcHSL[2], result15);
                    result15[3] = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (src15[3] + dst15[3]) - ((src15[3] * dst15[3]) / KotlinVersion.MAX_COMPONENT_VALUE));
                };
            default:
                throw new IllegalStateException("Mode not recognized " + blendMode);
        }
    }
}
