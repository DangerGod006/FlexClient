package dev.lvstrng.argon.font;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import javax.imageio.ImageIO;
import lombok.Generated;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_10799;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import org.joml.Matrix3x2fStack;
import org.lwjgl.BufferUtils;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/font/GlyphPage.class */
public final class GlyphPage {
    private static final AtomicInteger TEXTURE_COUNTER = new AtomicInteger();
    private int imgSize;
    private final Font font;
    private final boolean antiAliasing;
    private final boolean fractionalMetrics;
    private BufferedImage bufferedImage;
    private class_1044 loadedTexture;
    private class_2960 textureId;
    private int maxFontHeight = -1;
    private final HashMap<Character, Glyph> glyphCharacterMap = new HashMap<>();

    @Generated
    public int getMaxFontHeight() {
        return this.maxFontHeight;
    }

    public GlyphPage(Font font, boolean antiAliasing, boolean fractionalMetrics) {
        this.font = font;
        this.antiAliasing = antiAliasing;
        this.fractionalMetrics = fractionalMetrics;
    }

    public void generateGlyphPage(char[] chars) {
        double maxWidth = -1.0d;
        double maxHeight = -1.0d;
        AffineTransform affineTransform = new AffineTransform();
        FontRenderContext fontRenderContext = new FontRenderContext(affineTransform, this.antiAliasing, this.fractionalMetrics);
        for (char c : chars) {
            Rectangle2D bounds = this.font.getStringBounds(Character.toString(c), fontRenderContext);
            if (maxWidth < bounds.getWidth()) {
                maxWidth = bounds.getWidth();
            }
            if (maxHeight < bounds.getHeight()) {
                maxHeight = bounds.getHeight();
            }
        }
        double maxWidth2 = maxWidth + 2.0d;
        double maxHeight2 = maxHeight + 2.0d;
        this.imgSize = ((int) Math.ceil(Math.max(Math.ceil(Math.sqrt((maxWidth2 * maxWidth2) * ((double) chars.length)) / maxWidth2), Math.ceil(Math.sqrt((maxHeight2 * maxHeight2) * ((double) chars.length)) / maxHeight2)) * Math.max(maxWidth2, maxHeight2))) + 1;
        this.bufferedImage = new BufferedImage(this.imgSize, this.imgSize, 2);
        Graphics2D g = this.bufferedImage.createGraphics();
        g.setFont(this.font);
        g.setColor(new Color(255, 255, 255, 0));
        g.fillRect(0, 0, this.imgSize, this.imgSize);
        g.setColor(Color.white);
        g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, this.fractionalMetrics ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, this.antiAliasing ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, this.antiAliasing ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        FontMetrics fontMetrics = g.getFontMetrics();
        int currentCharHeight = 0;
        int posX = 0;
        int posY = 1;
        for (char ch : chars) {
            Glyph glyph = new Glyph();
            Rectangle2D bounds2 = fontMetrics.getStringBounds(Character.toString(ch), g);
            glyph.width = bounds2.getBounds().width + 8;
            glyph.height = bounds2.getBounds().height;
            if (posX + glyph.width >= this.imgSize) {
                posX = 0;
                posY += currentCharHeight;
                currentCharHeight = 0;
            }
            glyph.x = posX;
            glyph.y = posY;
            if (glyph.height > this.maxFontHeight) {
                this.maxFontHeight = glyph.height;
            }
            if (glyph.height > currentCharHeight) {
                currentCharHeight = glyph.height;
            }
            g.drawString(Character.toString(ch), posX + 2, posY + fontMetrics.getAscent());
            posX += glyph.width;
            this.glyphCharacterMap.put(Character.valueOf(ch), glyph);
        }
    }

    public void setupTexture() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(this.bufferedImage, "png", baos);
            byte[] bytes = baos.toByteArray();
            ByteBuffer data = BufferUtils.createByteBuffer(bytes.length).put(bytes);
            data.flip();
            int textureIndex = TEXTURE_COUNTER.incrementAndGet();
            class_1043 texture = new LinearFontTexture(() -> {
                return "argon_font_" + textureIndex;
            }, class_1011.method_4324(data));
            texture.method_4524();
            this.loadedTexture = texture;
            this.textureId = class_2960.method_60655("argon", "font/" + textureIndex);
            class_310.method_1551().method_1531().method_4616(this.textureId, this.loadedTexture);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public float drawChar(class_332 context, char ch, float x, float y, int color) {
        Glyph glyph = this.glyphCharacterMap.get(Character.valueOf(ch));
        if (glyph == null || this.textureId == null) {
            return 0.0f;
        }
        Matrix3x2fStack matrices = context.method_51448();
        matrices.pushMatrix();
        matrices.translate(x, y);
        context.method_25291(class_10799.field_56883, this.textureId, 0, 0, glyph.x, glyph.y, glyph.width, glyph.height, this.imgSize, this.imgSize, color);
        matrices.popMatrix();
        return glyph.width - 8;
    }

    public float getWidth(char ch) {
        Glyph glyph = this.glyphCharacterMap.get(Character.valueOf(ch));
        if (glyph == null) {
            return 0.0f;
        }
        return glyph.width;
    }

    public boolean isAntiAliasingEnabled() {
        return this.antiAliasing;
    }

    public boolean isFractionalMetricsEnabled() {
        return this.fractionalMetrics;
    }

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/font/GlyphPage$Glyph.class */
    static class Glyph {
        private int x;
        private int y;
        private int width;
        private int height;

        @Generated
        public int getX() {
            return this.x;
        }

        @Generated
        public int getY() {
            return this.y;
        }

        @Generated
        public int getWidth() {
            return this.width;
        }

        @Generated
        public int getHeight() {
            return this.height;
        }

        Glyph(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        Glyph() {
        }
    }

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/font/GlyphPage$LinearFontTexture.class */
    private static final class LinearFontTexture extends class_1043 {
        private LinearFontTexture(Supplier<String> label, class_1011 image) {
            super(label, image);
            this.field_63613 = RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR);
        }
    }
}
