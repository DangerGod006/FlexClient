package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.image.RGBImageFilter;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeColorMatrix.class */
@PermittedContent(anyOf = {Animate.class, Set.class})
@ElementCategories({Category.FilterPrimitive})
public final class FeColorMatrix extends AbstractFilterPrimitive {
    public static final String TAG = "fecolormatrix";
    private static final String KEY_VALUES = "values";

    @Nullable
    private AffineRGBImageFilter filter;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.AbstractFilterPrimitive, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        String type = attributeNode.getValue("type");
        if (type == null) {
            type = "matrix";
        }
        this.filter = null;
        switch (type.toLowerCase(Locale.ENGLISH)) {
            case "matrix":
                double[] colorTransform = attributeNode.getDoubleList(KEY_VALUES);
                if (colorTransform.length == 20) {
                    boolean isIdentity = Arrays.equals(colorTransform, new double[]{1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d});
                    if (!isIdentity) {
                        this.filter = new MatrixRGBFilter(colorTransform);
                    }
                    break;
                }
                break;
            case "saturate":
                float s = attributeNode.getFloat(KEY_VALUES, 1.0f);
                if (s != 1.0f) {
                    this.filter = new LinearRGBFilter(0.213d + (0.787d * ((double) s)), 0.715d * ((double) (1.0f - s)), 0.072d * ((double) (1.0f - s)), 0.213d * ((double) (1.0f - s)), 0.715d + (0.285d * ((double) s)), 0.072d * ((double) (1.0f - s)), 0.213d * ((double) (1.0f - s)), 0.715d * ((double) (1.0f - s)), 0.072d + (0.928d * ((double) s)));
                    break;
                }
                break;
            case "huerotate":
                float hueRotate = attributeNode.getFloat(KEY_VALUES, 0.0f);
                if (hueRotate != 1.0f) {
                    double radians = Math.toRadians(hueRotate);
                    double sin = Math.sin(radians);
                    double cos = Math.cos(radians);
                    this.filter = new LinearRGBFilter((0.213d + (cos * 0.787d)) - (sin * 0.2127d), (0.715d - (0.715d * cos)) - (0.715d * sin), (0.072d - (0.072d * cos)) + (0.982d * sin), (0.213d - (cos * 0.213d)) + (sin * 0.143d), 0.715d + (0.285d * cos) + (0.14d * sin), (0.072d - (0.072d * cos)) - (0.283d * sin), (0.213d - (cos * 0.213d)) - (sin * 0.787d), (0.715d - (0.715d * cos)) + (0.715d * sin), 0.072d + (0.982d * cos) + (0.072d * sin));
                    break;
                }
                break;
            case "luminancetoalpha":
                this.filter = new LuminanceToAlphaFilter();
                break;
        }
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
        LayoutBounds bounds = impl().layoutInput(filterLayoutContext).withFlags(new LayoutBounds.ComputeFlags((this.filter == null || this.filter.isLinear()) ? false : true));
        impl().saveLayoutResult(bounds, filterLayoutContext);
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
        RGBImageFilter f = this.filter;
        if (f == null) {
            impl().noop(filterContext);
        } else {
            impl().saveResult(impl().inputChannel(filterContext).applyFilter(f), filterContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toRgbRange(double value) {
        return (int) Math.max(Math.min(Math.round(value), 255L), 0L);
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeColorMatrix$AffineRGBImageFilter.class */
    private static abstract class AffineRGBImageFilter extends RGBImageFilter {
        abstract boolean isLinear();

        private AffineRGBImageFilter() {
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeColorMatrix$MatrixRGBFilter.class */
    private static final class MatrixRGBFilter extends AffineRGBImageFilter {
        private final double r1;
        private final double r2;
        private final double r3;
        private final double r4;
        private final double r5;
        private final double g1;
        private final double g2;
        private final double g3;
        private final double g4;
        private final double g5;
        private final double b1;
        private final double b2;
        private final double b3;
        private final double b4;
        private final double b5;
        private final double a1;
        private final double a2;
        private final double a3;
        private final double a4;
        private final double a5;

        private MatrixRGBFilter(double[] values) {
            super();
            this.r1 = values[0];
            this.r2 = values[1];
            this.r3 = values[2];
            this.r4 = values[3];
            this.r5 = values[4];
            this.g1 = values[5];
            this.g2 = values[6];
            this.g3 = values[7];
            this.g4 = values[8];
            this.g5 = values[9];
            this.b1 = values[10];
            this.b2 = values[11];
            this.b3 = values[12];
            this.b4 = values[13];
            this.b5 = values[14];
            this.a1 = values[15];
            this.a2 = values[16];
            this.a3 = values[17];
            this.a4 = values[18];
            this.a5 = values[19];
        }

        @Override // com.github.weisj.jsvg.nodes.filter.FeColorMatrix.AffineRGBImageFilter
        boolean isLinear() {
            return this.r5 == 0.0d && this.g5 == 0.0d && this.b5 == 0.0d && this.a5 == 0.0d;
        }

        public int filterRGB(int x, int y, int rgb) {
            int a = (rgb >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
            int r = (rgb >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
            int g = (rgb >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
            int b = rgb & KotlinVersion.MAX_COMPONENT_VALUE;
            int nr = FeColorMatrix.toRgbRange((this.r1 * ((double) r)) + (this.r2 * ((double) g)) + (this.r3 * ((double) b)) + (this.r4 * ((double) a)) + (this.r5 * 255.0d));
            int ng = FeColorMatrix.toRgbRange((this.g1 * ((double) r)) + (this.g2 * ((double) g)) + (this.g3 * ((double) b)) + (this.g4 * ((double) a)) + (this.g5 * 255.0d));
            int nb = FeColorMatrix.toRgbRange((this.b1 * ((double) r)) + (this.b2 * ((double) g)) + (this.b3 * ((double) b)) + (this.b4 * ((double) a)) + (this.b5 * 255.0d));
            int na = FeColorMatrix.toRgbRange((this.a1 * ((double) r)) + (this.a2 * ((double) g)) + (this.a3 * ((double) b)) + (this.a4 * ((double) a)) + (this.a5 * 255.0d));
            return ((na & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | ((nr & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | ((ng & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (nb & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeColorMatrix$LinearRGBFilter.class */
    private static final class LinearRGBFilter extends AffineRGBImageFilter {
        private final double r1;
        private final double r2;
        private final double r3;
        private final double g1;
        private final double g2;
        private final double g3;
        private final double b1;
        private final double b2;
        private final double b3;

        private LinearRGBFilter(double r1, double r2, double r3, double g1, double g2, double g3, double b1, double b2, double b3) {
            super();
            this.r1 = r1;
            this.r2 = r2;
            this.r3 = r3;
            this.g1 = g1;
            this.g2 = g2;
            this.g3 = g3;
            this.b1 = b1;
            this.b2 = b2;
            this.b3 = b3;
        }

        @Override // com.github.weisj.jsvg.nodes.filter.FeColorMatrix.AffineRGBImageFilter
        boolean isLinear() {
            return true;
        }

        public int filterRGB(int x, int y, int rgb) {
            int a = (rgb >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
            int r = (rgb >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
            int g = (rgb >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
            int b = rgb & KotlinVersion.MAX_COMPONENT_VALUE;
            int nr = FeColorMatrix.toRgbRange((this.r1 * ((double) r)) + (this.r2 * ((double) g)) + (this.r3 * ((double) b)));
            int ng = FeColorMatrix.toRgbRange((this.g1 * ((double) r)) + (this.g2 * ((double) g)) + (this.g3 * ((double) b)));
            int nb = FeColorMatrix.toRgbRange((this.b1 * ((double) r)) + (this.b2 * ((double) g)) + (this.b3 * ((double) b)));
            return (a << 24) | ((nr & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | ((ng & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (nb & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeColorMatrix$LuminanceToAlphaFilter.class */
    private static final class LuminanceToAlphaFilter extends AffineRGBImageFilter {
        private LuminanceToAlphaFilter() {
            super();
        }

        @Override // com.github.weisj.jsvg.nodes.filter.FeColorMatrix.AffineRGBImageFilter
        boolean isLinear() {
            return true;
        }

        public int filterRGB(int x, int y, int rgb) {
            int r = (rgb >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
            int g = (rgb >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
            int b = rgb & KotlinVersion.MAX_COMPONENT_VALUE;
            int na = FeColorMatrix.toRgbRange((0.2125d * ((double) r)) + (0.7164d * ((double) g)) + (0.0712d * ((double) b)));
            return (na & KotlinVersion.MAX_COMPONENT_VALUE) << 24;
        }
    }
}
