package com.github.weisj.jsvg.renderer;

import com.github.weisj.jsvg.renderer.GraphicsUtil;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import kotlin.KotlinVersion;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/MaskedPaint.class */
public final class MaskedPaint implements Paint, GraphicsUtil.WrappingPaint {

    @NotNull
    private Paint paint;

    @NotNull
    private final Raster maskRaster;

    @NotNull
    private final Point maskOffset;

    public MaskedPaint(@NotNull Paint paint, @NotNull Raster maskRaster, @NotNull Point2D maskOffset) {
        this.paint = paint;
        this.maskRaster = maskRaster;
        this.maskOffset = new Point((int) Math.floor(maskOffset.getX()), (int) Math.floor(maskOffset.getY()));
    }

    @Override // com.github.weisj.jsvg.renderer.GraphicsUtil.WrappingPaint
    public void setPaint(@NotNull Paint paint) {
        this.paint = GraphicsUtil.setupPaint(this.paint, paint);
    }

    public java.awt.PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
        java.awt.PaintContext parentContext = this.paint.createContext((ColorModel) null, deviceBounds, userBounds, xform, hints);
        return new MaskPaintContext(parentContext, this.maskRaster, this.maskOffset);
    }

    public int getTransparency() {
        return 3;
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/renderer/MaskedPaint$MaskPaintContext.class */
    private static final class MaskPaintContext implements java.awt.PaintContext {

        @NotNull
        private final java.awt.PaintContext parentContext;

        @NotNull
        private final ColorModel colorModel;
        private final int numColorComponents;

        @NotNull
        private final ColorModel parentColorModel;

        @NotNull
        private final Raster maskRaster;

        @NotNull
        private final Point offset;

        MaskPaintContext(@NotNull java.awt.PaintContext parentContext, @NotNull Raster maskRaster, @NotNull Point offset) {
            this.parentContext = parentContext;
            this.parentColorModel = parentContext.getColorModel();
            this.maskRaster = maskRaster;
            this.offset = offset;
            if (parentContext.getColorModel().hasAlpha()) {
                this.colorModel = this.parentColorModel;
            } else {
                this.colorModel = new ComponentColorModel(parentContext.getColorModel().getColorSpace(), true, false, 1, 0);
            }
            this.numColorComponents = this.colorModel.getNumColorComponents();
        }

        @NotNull
        public ColorModel getColorModel() {
            return this.colorModel;
        }

        public void dispose() {
            this.parentContext.dispose();
        }

        public Raster getRaster(int x, int y, int w, int h) {
            WritableRaster result;
            int sample;
            WritableRaster raster = this.parentContext.getRaster(x, y, w, h);
            int parentMinX = raster.getMinX();
            int parentMinY = raster.getMinY();
            if (raster instanceof WritableRaster) {
                if (this.parentColorModel.equals(this.colorModel)) {
                    result = raster.createCompatibleWritableRaster();
                    result.setDataElements(-parentMinX, -parentMinY, raster);
                } else {
                    BufferedImage parentImage = new BufferedImage(this.parentColorModel, raster, this.parentColorModel.isAlphaPremultiplied(), (Hashtable) null);
                    result = Raster.createWritableRaster(this.colorModel.createCompatibleSampleModel(w, h), new Point(0, 0));
                    BufferedImage resultImage = new BufferedImage(this.colorModel, result, false, (Hashtable) null);
                    Graphics graphics = resultImage.getGraphics();
                    graphics.drawImage(parentImage, 0, 0, (ImageObserver) null);
                    graphics.dispose();
                }
            } else {
                result = Raster.createInterleavedRaster(0, w, h, getColorModel().getNumComponents(), new Point(0, 0));
                ColorConvertOp colorConvertOp = new ColorConvertOp(this.parentColorModel.getColorSpace(), this.colorModel.getColorSpace(), (RenderingHints) null);
                colorConvertOp.filter(raster, result);
            }
            int softMaskMinX = this.maskRaster.getMinX();
            int softMaskMinY = this.maskRaster.getMinY();
            int softMaskMaxX = softMaskMinX + this.maskRaster.getWidth();
            int softMaskMaxY = softMaskMinY + this.maskRaster.getHeight();
            for (int j = 0; j < h; j++) {
                for (int i = 0; i < w; i++) {
                    int rx = (x + i) - this.offset.x;
                    int ry = (y + j) - this.offset.y;
                    if (rx >= softMaskMinX && rx < softMaskMaxX && ry >= softMaskMinY && ry < softMaskMaxY) {
                        sample = this.maskRaster.getSample(rx, ry, 0);
                    } else {
                        sample = 0;
                    }
                    int alpha = sample;
                    result.setSample(i, j, this.numColorComponents, (alpha * result.getSample(i, j, this.numColorComponents)) / KotlinVersion.MAX_COMPONENT_VALUE);
                }
            }
            return result;
        }
    }
}
