package com.github.weisj.jsvg.nodes.filter;

import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.RasterFormatException;
import java.awt.image.WritableRaster;
import kotlin.KotlinVersion;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/AbstractBlendComposite.class */
public abstract class AbstractBlendComposite implements Composite {

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/AbstractBlendComposite$Blender.class */
    @FunctionalInterface
    interface Blender {
        void blend(int[] iArr, int[] iArr2, int[] iArr3);
    }

    @NotNull
    protected abstract Blender blender();

    private static boolean isColorModelInvalid(ColorModel cm) {
        if ((cm instanceof DirectColorModel) && cm.getTransferType() == 3) {
            DirectColorModel directCM = (DirectColorModel) cm;
            return (directCM.getRedMask() == 16711680 && directCM.getGreenMask() == 65280 && directCM.getBlueMask() == 255 && (directCM.getNumComponents() != 4 || directCM.getAlphaMask() == -16777216)) ? false : true;
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: java.awt.image.RasterFormatException */
    public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel, RenderingHints hints) throws RasterFormatException {
        if (isColorModelInvalid(srcColorModel) || isColorModelInvalid(dstColorModel)) {
            throw new RasterFormatException("Incompatible color models");
        }
        return new BlendingContext(blender());
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/filter/AbstractBlendComposite$BlendingContext.class */
    private static final class BlendingContext implements CompositeContext {

        @NotNull
        private final Blender blender;

        private BlendingContext(@NotNull Blender blender) {
            this.blender = blender;
        }

        public void dispose() {
        }

        public void compose(@NotNull Raster src, @NotNull Raster dstIn, @NotNull WritableRaster dstOut) {
            int width = Math.min(src.getWidth(), dstIn.getWidth());
            int height = Math.min(src.getHeight(), dstIn.getHeight());
            int[] result = new int[4];
            int[] srcPixel = new int[4];
            int[] dstPixel = new int[4];
            int[] srcPixels = new int[width];
            int[] dstPixels = new int[width];
            for (int y = 0; y < height; y++) {
                src.getDataElements(0, y, width, 1, srcPixels);
                dstIn.getDataElements(0, y, width, 1, dstPixels);
                for (int x = 0; x < width; x++) {
                    int pixel = srcPixels[x];
                    srcPixel[0] = (pixel >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                    srcPixel[1] = (pixel >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                    srcPixel[2] = pixel & KotlinVersion.MAX_COMPONENT_VALUE;
                    srcPixel[3] = (pixel >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                    int pixel2 = dstPixels[x];
                    dstPixel[0] = (pixel2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                    dstPixel[1] = (pixel2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                    dstPixel[2] = pixel2 & KotlinVersion.MAX_COMPONENT_VALUE;
                    dstPixel[3] = (pixel2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                    this.blender.blend(srcPixel, dstPixel, result);
                    dstPixels[x] = ((result[3] & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | ((result[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | ((result[1] & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (result[2] & KotlinVersion.MAX_COMPONENT_VALUE);
                }
                dstOut.setDataElements(0, y, width, 1, dstPixels);
            }
        }
    }
}
