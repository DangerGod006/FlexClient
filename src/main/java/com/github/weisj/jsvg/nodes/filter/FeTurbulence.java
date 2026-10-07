package com.github.weisj.jsvg.nodes.filter;

import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
import com.github.weisj.jsvg.geometry.noise.PerlinTurbulence;
import com.github.weisj.jsvg.geometry.size.FloatInsets;
import com.github.weisj.jsvg.nodes.animation.Animate;
import com.github.weisj.jsvg.nodes.animation.Set;
import com.github.weisj.jsvg.nodes.filter.Filter;
import com.github.weisj.jsvg.nodes.prototype.spec.Category;
import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
import com.github.weisj.jsvg.parser.AttributeNode;
import com.github.weisj.jsvg.renderer.RenderContext;
import com.github.weisj.jsvg.util.ImageUtil;
import java.awt.color.ColorSpace;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeTurbulence.class */
@PermittedContent(anyOf = {Animate.class, Set.class})
@ElementCategories({Category.FilterPrimitive})
public final class FeTurbulence extends AbstractFilterPrimitive {
    public static final String TAG = "feturbulence";
    private float seed;
    private float[] baseFrequency;
    private int numOctaves;
    private Type type;

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeTurbulence$Type.class */
    public enum Type {
        fractalNoise,
        Turbulence
    }

    @Override // com.github.weisj.jsvg.nodes.SVGNode
    @NotNull
    public String tagName() {
        return TAG;
    }

    @Override // com.github.weisj.jsvg.nodes.filter.AbstractFilterPrimitive, com.github.weisj.jsvg.nodes.AbstractSVGNode, com.github.weisj.jsvg.nodes.SVGNode
    public void build(@NotNull AttributeNode attributeNode) {
        super.build(attributeNode);
        this.seed = attributeNode.getFloat("seed", 0.0f);
        this.baseFrequency = attributeNode.getFloatList("baseFrequency");
        if (this.baseFrequency.length == 0) {
            this.baseFrequency = new float[]{0.0f};
        }
        this.numOctaves = attributeNode.getInt("numOctaves", 1);
        this.numOctaves = Math.min(this.numOctaves, 8);
        this.type = (Type) attributeNode.getEnum("type", Type.fractalNoise);
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
        impl().saveLayoutResult(new LayoutBounds(filterLayoutContext.filterPrimitiveRegion(context.measureContext(), this), new FloatInsets()), filterLayoutContext);
    }

    @Override // com.github.weisj.jsvg.nodes.filter.FilterPrimitive
    public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
        Filter.FilterInfo info = filterContext.info();
        Channel turbulenceChannel = new TurbulenceChannel(info.imageBounds(), info.imageWidth, info.imageHeight, this.seed, this.numOctaves, this.baseFrequency[0], this.baseFrequency.length > 1 ? this.baseFrequency[1] : this.baseFrequency[0], this.type);
        impl().saveResult(turbulenceChannel, filterContext);
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/FeTurbulence$TurbulenceChannel.class */
    public static final class TurbulenceChannel implements Channel, PixelProvider {
        private final PerlinTurbulence perlinTurbulence;
        private final double[] channels = new double[4];
        private final int imageWidth;
        private final int imageHeight;
        private final Type type;
        private final Rectangle2D tileBounds;
        private BufferedImage bufferedImage;

        public TurbulenceChannel(@NotNull Rectangle2D tileBounds, int imageWidth, int imageHeight, float seed, int octaves, double xFrequency, double yFrequency, Type type) {
            this.tileBounds = tileBounds;
            this.imageWidth = imageWidth;
            this.imageHeight = imageHeight;
            this.type = type;
            this.perlinTurbulence = new PerlinTurbulence((int) seed, octaves, xFrequency, yFrequency);
        }

        @NotNull
        private BufferedImage ensureImageBackingStore() {
            if (this.bufferedImage == null) {
                ColorSpace cs = ColorSpace.getInstance(1004);
                DirectColorModel directColorModel = new DirectColorModel(cs, 32, 16711680, 65280, KotlinVersion.MAX_COMPONENT_VALUE, -16777216, false, 3);
                WritableRaster dest = directColorModel.createCompatibleWritableRaster(this.imageWidth, this.imageHeight);
                this.bufferedImage = new BufferedImage(directColorModel, dest, false, (Hashtable) null);
                int w = dest.getWidth();
                int h = dest.getHeight();
                double scaleX = this.tileBounds.getWidth() / ((double) w);
                double scaleY = this.tileBounds.getHeight() / ((double) h);
                double startX = this.tileBounds.getX();
                double startY = this.tileBounds.getY();
                boolean fractalNoise = this.type == Type.fractalNoise;
                int[] destPixels = ImageUtil.getINT_RGBA_DataBank(dest);
                int dstAdjust = ImageUtil.getINT_RGBA_DataAdjust(dest);
                int dp = ImageUtil.getINT_RGBA_DataOffset(dest);
                double point_1 = startY;
                for (int i = 0; i < h; i++) {
                    double point_0 = startX;
                    int end = dp + w;
                    while (dp < end) {
                        this.perlinTurbulence.turbulence(this.channels, point_0, point_1, fractalNoise, null, null);
                        destPixels[dp] = directColorModel.getRGB(channelsToRGB(this.channels));
                        point_0 += scaleX;
                        dp++;
                    }
                    point_1 += scaleY;
                    dp += dstAdjust;
                }
            }
            return this.bufferedImage;
        }

        @Override // com.github.weisj.jsvg.nodes.filter.Channel
        @NotNull
        public ImageProducer producer() {
            return ensureImageBackingStore().getSource();
        }

        @Override // com.github.weisj.jsvg.nodes.filter.Channel
        @NotNull
        public BufferedImage toBufferedImageNonAliased(@NotNull RenderContext context) {
            BufferedImage img = ensureImageBackingStore();
            ColorModel cm = img.getColorModel();
            WritableRaster raster = img.copyData((WritableRaster) null);
            return new BufferedImage(cm, raster, cm.isAlphaPremultiplied(), (Hashtable) null);
        }

        @Override // com.github.weisj.jsvg.nodes.filter.Channel
        @NotNull
        public Channel applyFilter(@NotNull ImageFilter filter) {
            return new ImageProducerChannel(new FilteredImageSource(producer(), filter));
        }

        @Override // com.github.weisj.jsvg.nodes.filter.Channel
        @NotNull
        public PixelProvider pixels(@NotNull RenderContext context) {
            return this;
        }

        @Override // com.github.weisj.jsvg.nodes.filter.PixelProvider
        public int pixelAt(double x, double y) {
            this.perlinTurbulence.turbulence(this.channels, x, y, this.type == Type.fractalNoise, null, null);
            return channelsToRGB(this.channels);
        }

        private static int channelsToRGB(double[] channels) {
            int j;
            int j2;
            int j3;
            int j4;
            int i = (int) channels[0];
            if ((i & (-256)) == 0) {
                j = i << 16;
            } else {
                j = (i & IntCompanionObject.MIN_VALUE) != 0 ? 0 : 16711680;
            }
            int i2 = (int) channels[1];
            if ((i2 & (-256)) == 0) {
                j2 = j | (i2 << 8);
            } else {
                j2 = j | ((i2 & IntCompanionObject.MIN_VALUE) != 0 ? 0 : 65280);
            }
            int i3 = (int) channels[2];
            if ((i3 & (-256)) == 0) {
                j3 = j2 | i3;
            } else {
                j3 = j2 | ((i3 & IntCompanionObject.MIN_VALUE) != 0 ? 0 : KotlinVersion.MAX_COMPONENT_VALUE);
            }
            int i4 = (int) channels[3];
            if ((i4 & (-256)) == 0) {
                j4 = j3 | (i4 << 24);
            } else {
                j4 = j3 | ((i4 & IntCompanionObject.MIN_VALUE) != 0 ? 0 : -16777216);
            }
            return j4;
        }
    }
}
