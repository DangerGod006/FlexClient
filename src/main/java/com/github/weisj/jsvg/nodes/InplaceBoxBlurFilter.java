package com.github.weisj.jsvg.nodes;

import com.github.weisj.jsvg.util.ImageUtil;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import kotlin.KotlinVersion;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/nodes/InplaceBoxBlurFilter.class */
public final class InplaceBoxBlurFilter {
    private InplaceBoxBlurFilter() {
    }

    public static void horizontalPass(@NotNull Raster src, @NotNull WritableRaster dst, int skipX, int skipY, int boxSize, int loc) {
        int width = src.getWidth();
        int height = src.getHeight();
        if (width >= (2 * skipX) + boxSize && height >= 2 * skipY) {
            int srcScanStride = ImageUtil.getINT_RGBA_ScanlineStride(src);
            int dstScanStride = ImageUtil.getINT_RGBA_ScanlineStride(dst);
            int srcOff = ImageUtil.getINT_RGBA_DataOffset(src);
            int dstOff = ImageUtil.getINT_RGBA_DataOffset(dst);
            int[] srcPixels = ImageUtil.getINT_RGBA_DataBank(src);
            int[] dstPixels = ImageUtil.getINT_RGBA_DataBank(dst);
            int[] buffer = new int[boxSize];
            int scale = 16777216 / boxSize;
            for (int y = skipY; y < height - skipY; y++) {
                int sp = srcOff + (y * srcScanStride);
                int dp = dstOff + (y * dstScanStride);
                int rowEnd = sp + (width - skipX);
                int k = 0;
                int sumA = 0;
                int sumR = 0;
                int sumG = 0;
                int sumB = 0;
                int sp2 = sp + skipX;
                int end = sp2 + boxSize;
                while (sp2 < end) {
                    int curr = srcPixels[sp2];
                    buffer[k] = curr;
                    sumA += curr >>> 24;
                    sumR += (curr >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                    sumG += (curr >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                    sumB += curr & KotlinVersion.MAX_COMPONENT_VALUE;
                    k++;
                    sp2++;
                }
                int dp2 = dp + skipX + loc;
                int i = ((sumA * scale) & (-16777216)) | (((sumR * scale) & (-16777216)) >>> 8) | (((sumG * scale) & (-16777216)) >>> 16) | (((sumB * scale) & (-16777216)) >>> 24);
                dstPixels[dp2] = i;
                int prev = i;
                int dp3 = dp2 + 1;
                int k2 = 0;
                while (sp2 < rowEnd) {
                    int curr2 = buffer[k2];
                    if (curr2 == srcPixels[sp2]) {
                        dstPixels[dp3] = prev;
                    } else {
                        int sumA2 = sumA - (curr2 >>> 24);
                        int sumR2 = sumR - ((curr2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        int sumG2 = sumG - ((curr2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        int sumB2 = sumB - (curr2 & KotlinVersion.MAX_COMPONENT_VALUE);
                        int curr3 = srcPixels[sp2];
                        buffer[k2] = curr3;
                        sumA = sumA2 + (curr3 >>> 24);
                        sumR = sumR2 + ((curr3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        sumG = sumG2 + ((curr3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        sumB = sumB2 + (curr3 & KotlinVersion.MAX_COMPONENT_VALUE);
                        int i2 = ((sumA * scale) & (-16777216)) | (((sumR * scale) & (-16777216)) >>> 8) | (((sumG * scale) & (-16777216)) >>> 16) | (((sumB * scale) & (-16777216)) >>> 24);
                        dstPixels[dp3] = i2;
                        prev = i2;
                    }
                    k2 = (k2 + 1) % boxSize;
                    sp2++;
                    dp3++;
                }
            }
        }
    }

    public static void verticalPass(@NotNull Raster src, @NotNull WritableRaster dst, int skipX, int skipY, int boxSize, int loc) {
        int w = src.getWidth();
        int h = src.getHeight();
        if (w >= 2 * skipX && h >= (2 * skipY) + boxSize) {
            int srcScanStride = ImageUtil.getINT_RGBA_ScanlineStride(src);
            int dstScanStride = ImageUtil.getINT_RGBA_ScanlineStride(dst);
            int srcOff = ImageUtil.getINT_RGBA_DataOffset(src);
            int dstOff = ImageUtil.getINT_RGBA_DataOffset(dst);
            int[] srcPixels = ImageUtil.getINT_RGBA_DataBank(src);
            int[] dstPixels = ImageUtil.getINT_RGBA_DataBank(dst);
            int[] buffer = new int[boxSize];
            int scale = 16777216 / boxSize;
            for (int x = skipX; x < w - skipX; x++) {
                int sp = srcOff + x;
                int dp = dstOff + x;
                int colEnd = sp + ((h - skipY) * srcScanStride);
                int k = 0;
                int sumA = 0;
                int sumR = 0;
                int sumG = 0;
                int sumB = 0;
                int sp2 = sp + (skipY * srcScanStride);
                int end = sp2 + (boxSize * srcScanStride);
                while (sp2 < end) {
                    int curr = srcPixels[sp2];
                    buffer[k] = curr;
                    sumA += curr >>> 24;
                    sumR += (curr >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                    sumG += (curr >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                    sumB += curr & KotlinVersion.MAX_COMPONENT_VALUE;
                    k++;
                    sp2 += srcScanStride;
                }
                int dp2 = dp + ((skipY + loc) * dstScanStride);
                int i = ((sumA * scale) & (-16777216)) | (((sumR * scale) & (-16777216)) >>> 8) | (((sumG * scale) & (-16777216)) >>> 16) | (((sumB * scale) & (-16777216)) >>> 24);
                dstPixels[dp2] = i;
                int prev = i;
                int dp3 = dp2 + dstScanStride;
                int k2 = 0;
                while (sp2 < colEnd) {
                    int curr2 = buffer[k2];
                    if (curr2 == srcPixels[sp2]) {
                        dstPixels[dp3] = prev;
                    } else {
                        int sumA2 = sumA - (curr2 >>> 24);
                        int sumR2 = sumR - ((curr2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        int sumG2 = sumG - ((curr2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        int sumB2 = sumB - (curr2 & KotlinVersion.MAX_COMPONENT_VALUE);
                        int curr3 = srcPixels[sp2];
                        buffer[k2] = curr3;
                        sumA = sumA2 + (curr3 >>> 24);
                        sumR = sumR2 + ((curr3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        sumG = sumG2 + ((curr3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        sumB = sumB2 + (curr3 & KotlinVersion.MAX_COMPONENT_VALUE);
                        int i2 = ((sumA * scale) & (-16777216)) | (((sumR * scale) & (-16777216)) >>> 8) | (((sumG * scale) & (-16777216)) >>> 16) | (((sumB * scale) & (-16777216)) >>> 24);
                        dstPixels[dp3] = i2;
                        prev = i2;
                    }
                    k2 = (k2 + 1) % boxSize;
                    sp2 += srcScanStride;
                    dp3 += dstScanStride;
                }
            }
        }
    }
}
