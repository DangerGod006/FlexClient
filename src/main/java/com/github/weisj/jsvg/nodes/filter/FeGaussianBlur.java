package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.EdgeMode;
import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.geometry.util.GeometryUtil;
import com.github.weisj.jsvg.nodes.InplaceBoxBlurFilter;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import java.awt.Dimension;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.Kernel;
import java.awt.image.WritableRaster;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeGaussianBlur.class */
@PermittedContent(anyOf = {Animate.class, Set.class})
@ElementCategories({Category.FilterPrimitive})
public final class FeGaussianBlur extends AbstractFilterPrimitive {
    public static final String TAG = "fegaussianblur";
    private static final double SQRT_2_PI = Math.sqrt(6.283185307179586d);
    private static final double THREE_QUARTER_SQRT_2_PI = (SQRT_2_PI * 3.0d) / 4.0d;
    private static final float KERNEL_PRECISION = 0.001f;
    private static final double BOX_BLUR_APPROXIMATION_THRESHOLD = 2.0d;
    private float[] stdDeviation;
    private EdgeMode edgeMode;
    private double xCurrent;
    private double yCurrent;
    private Kernel xBlur;
    private Kernel yBlur;

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.AbstractFilterPrimitive, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.stdDeviation = attributeNode.getFloatList("stdDeviation");
        this.edgeMode = (EdgeMode) attributeNode.getEnum("edgeMode", EdgeMode.Duplicate);
    }

    private double[] computeAbsoluteStdDeviation(@Nullable AffineTransform at) {
        if (this.stdDeviation.length == 0) {
            return new double[]{0.0d, 0.0d};
        }
        double xSigma = this.stdDeviation[0];
        double ySigma = this.stdDeviation[Math.min(this.stdDeviation.length - 1, 1)];
        if (at != null) {
            xSigma *= GeometryUtil.scaleXOfTransform(at);
            ySigma *= GeometryUtil.scaleYOfTransform(at);
        }
        return new double[]{xSigma, ySigma};
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
        LayoutBounds input = impl().layoutInput(filterLayoutContext);
        double[] sigma = computeAbsoluteStdDeviation(null);
        int hExtend = kernelDiameterForStandardDeviation(sigma[0]);
        int vExtend = kernelDiameterForStandardDeviation(sigma[1]);
        impl().saveLayoutResult(input.grow(hExtend, vExtend, filterLayoutContext), filterLayoutContext);
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
        if (this.stdDeviation.length == 0) {
            impl().noop(filterContext);
            return;
        }
        double[] sigma = computeAbsoluteStdDeviation(filterContext.info().output().transform());
        double xSigma = sigma[0];
        double ySigma = sigma[1];
        if (xSigma <= 0.0d && ySigma <= 0.0d) {
            impl().noop(filterContext);
            return;
        }
        ImageProducer input = impl().inputChannel(filterContext).producer();
        Kernel xBlurKernel = null;
        Kernel yBlurKernel = null;
        int dX = kernelDiameterForStandardDeviation(xSigma);
        int dY = kernelDiameterForStandardDeviation(ySigma);
        if (xSigma > 0.0d && xSigma < BOX_BLUR_APPROXIMATION_THRESHOLD) {
            xBlurKernel = createConvolveKernel(dX, xSigma, true);
        }
        if (ySigma > 0.0d && ySigma < BOX_BLUR_APPROXIMATION_THRESHOLD) {
            yBlurKernel = createConvolveKernel(dX, ySigma, false);
        }
        ImageProducer output = this.edgeMode.convolve(context, filterContext, input, new MixedQualityConvolveOperation(xBlurKernel, yBlurKernel, dX, dY));
        impl().saveResult(new ImageProducerChannel(output), filterContext);
    }

    @NotNull
    private Kernel createConvolveKernel(int diameter, double sigma, boolean horizontal) {
        if (horizontal && this.xBlur != null && this.xCurrent == sigma) {
            return this.xBlur;
        }
        if (!horizontal && this.yBlur != null && this.yCurrent == sigma) {
            return this.yBlur;
        }
        if (horizontal) {
            this.xCurrent = sigma;
        } else {
            this.yCurrent = sigma;
        }
        float[] data = computeGaussianKernelData(diameter, sigma);
        if (horizontal) {
            this.xBlur = new Kernel(diameter, 1, data);
        } else {
            this.yBlur = new Kernel(1, diameter, data);
        }
        return horizontal ? this.xBlur : this.yBlur;
    }

    private static float normalConvolve(float x, double standardDeviation) {
        return (float) (Math.pow(2.718281828459045d, ((double) ((-x) * x)) / ((BOX_BLUR_APPROXIMATION_THRESHOLD * standardDeviation) * standardDeviation)) / (standardDeviation * SQRT_2_PI));
    }

    private static float[] computeGaussianKernelData(int diameter, double standardDeviation) {
        float[] data = new float[diameter];
        int mid = diameter / 2;
        float total = 0.0f;
        for (int i = 0; i < diameter; i++) {
            data[i] = normalConvolve(i - mid, standardDeviation);
            total += data[i];
        }
        if (total > 0.0f) {
            for (int i2 = 0; i2 < diameter; i2++) {
                int i3 = i2;
                data[i3] = data[i3] / total;
            }
        }
        return data;
    }

    public static int kernelDiameterForStandardDeviation(double standardDeviation) {
        if (standardDeviation < BOX_BLUR_APPROXIMATION_THRESHOLD) {
            float areaSum = (float) (0.5d / (standardDeviation * SQRT_2_PI));
            int i = 0;
            while (areaSum < 0.49899999995250255d) {
                areaSum += normalConvolve(i, standardDeviation);
                i++;
            }
            return (i * 2) + 1;
        }
        return (int) Math.floor((THREE_QUARTER_SQRT_2_PI * standardDeviation) + 0.5d);
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeGaussianBlur$MixedQualityConvolveOperation.class */
    private static final class MixedQualityConvolveOperation implements EdgeMode.ConvolveOperation {

        @Nullable
        private final Kernel xKernel;

        @Nullable
        private final Kernel yKernel;
        private final int dX;
        private final int dY;

        private MixedQualityConvolveOperation(@Nullable Kernel xKernel, @Nullable Kernel yKernel, int dX, int dY) {
            this.xKernel = xKernel;
            this.yKernel = yKernel;
            this.dX = dX;
            this.dY = dY;
        }

        @Override // com.github.weisj.jsvg.attributes.filter.EdgeMode.ConvolveOperation
        @NotNull
        public Dimension maximumKernelSize() {
            return new Dimension(this.xKernel != null ? this.xKernel.getXOrigin() : this.dX, this.yKernel != null ? this.yKernel.getXOrigin() : this.dY);
        }

        @Override // com.github.weisj.jsvg.attributes.filter.EdgeMode.ConvolveOperation
        @NotNull
        public ImageProducer convolve(@NotNull BufferedImage image, @NotNull RenderingHints hints, int awtEdgeMode) {
            WritableRaster raster = image.getRaster();
            if (this.xKernel != null && this.yKernel != null) {
                BufferedImageOp op = new MultiConvolveOp(new ConvolveOp[]{new ConvolveOp(this.xKernel, awtEdgeMode, hints), new ConvolveOp(this.yKernel, awtEdgeMode, hints)});
                return new FilteredImageSource(image.getSource(), new BufferedImageFilter(op));
            }
            if (this.xKernel != null) {
                verticalBoxBlur(raster);
                return new FilteredImageSource(image.getSource(), new BufferedImageFilter(new ConvolveOp(this.xKernel, awtEdgeMode, hints)));
            }
            if (this.yKernel != null) {
                horizontalBoxBlur(raster);
                return new FilteredImageSource(image.getSource(), new BufferedImageFilter(new ConvolveOp(this.yKernel, awtEdgeMode, hints)));
            }
            horizontalBoxBlur(raster);
            verticalBoxBlur(raster);
            return image.getSource();
        }

        private void horizontalBoxBlur(@NotNull WritableRaster raster) {
            if ((this.dX & 1) == 0) {
                InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
                InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, (this.dX / 2) - 1);
                InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX + 1, this.dX / 2);
            } else {
                InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
                InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
                InplaceBoxBlurFilter.horizontalPass(raster, raster, 0, 0, this.dX, this.dX / 2);
            }
        }

        private void verticalBoxBlur(@NotNull WritableRaster raster) {
            if ((this.dY & 1) == 0) {
                InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
                InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, (this.dY / 2) - 1);
                InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY + 1, this.dY / 2);
            } else {
                InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
                InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
                InplaceBoxBlurFilter.verticalPass(raster, raster, 0, 0, this.dY, this.dY / 2);
            }
        }
    }
}
