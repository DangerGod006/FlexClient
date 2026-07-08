package dev.lvstrng.argon.utils;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.module.modules.client.ClickGUI;
import java.awt.Color;
import java.util.function.Consumer;
import net.minecraft.class_12249;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_437;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_7833;
import net.minecraft.class_9799;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/RenderUtils.class */
public final class RenderUtils {
    public static boolean rendering3D = true;
    private static int projectionDepth;

    public static class_243 getCameraPos() {
        return Argon.mc.field_1773.method_19418().method_71156();
    }

    public static float tickProgress() {
        return Argon.mc.method_61966().method_60637(true);
    }

    public static float frameDelta() {
        return Argon.mc.method_61966().method_60636();
    }

    public static double deltaTime() {
        if (Argon.mc.method_47599() > 0) {
            return 1.0d / ((double) Argon.mc.method_47599());
        }
        return 1.0d;
    }

    public static float fast(float end, float start, float multiple) {
        return ((1.0f - class_3532.method_15363((float) (deltaTime() * ((double) multiple)), 0.0f, 1.0f)) * end) + (class_3532.method_15363((float) (deltaTime() * ((double) multiple)), 0.0f, 1.0f) * start);
    }

    public static class_243 getPlayerLookVec(class_1657 player) {
        float f1 = class_3532.method_15362(((-player.method_36454()) * 0.017453292f) - 3.1415927f);
        float f2 = class_3532.method_15374(((-player.method_36454()) * 0.017453292f) - 3.1415927f);
        float f3 = -class_3532.method_15362((-player.method_36455()) * 0.017453292f);
        float f4 = class_3532.method_15374((-player.method_36455()) * 0.017453292f);
        return new class_243(f2 * f3, f4, f1 * f3).method_1029();
    }

    public static void unscaledProjection(class_332 context) {
        int i = projectionDepth;
        projectionDepth = i + 1;
        if (i == 0) {
            float scaleFactor = class_310.method_1551().method_22683().method_4495();
            context.method_51448().pushMatrix();
            context.method_51448().scale(1.0f / scaleFactor, 1.0f / scaleFactor);
        }
        rendering3D = false;
    }

    public static void scaledProjection(class_332 context) {
        if (projectionDepth == 0) {
            rendering3D = true;
            return;
        }
        int i = projectionDepth - 1;
        projectionDepth = i;
        if (i == 0) {
            context.method_51448().popMatrix();
        }
        rendering3D = true;
    }

    public static void drawLayer(class_1921 layer, Consumer<class_4588> runner) {
        int bufferSize = Math.max(256, Math.min(layer.method_22722(), 8192));
        class_9799 allocator = new class_9799(bufferSize);
        try {
            class_4597.class_4598 immediate = class_4597.method_22991(allocator);
            runner.accept(immediate.method_73477(layer));
            immediate.method_22994(layer);
            allocator.close();
        } catch (Throwable th) {
            try {
                allocator.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void emitLine(class_4588 buffer, Matrix4f matrix, float x1, float y1, float z1, float x2, float y2, float z2, float red, float green, float blue, float alpha, float lineWidth) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float dz = z2 - z1;
        float length = Math.max(1.0E-4f, class_3532.method_15355((dx * dx) + (dy * dy) + (dz * dz)));
        float nx = dx / length;
        float ny = dy / length;
        float nz = dz / length;
        buffer.method_22918(matrix, x1, y1, z1).method_22915(red, green, blue, alpha).method_22914(nx, ny, nz).method_75298(lineWidth);
        buffer.method_22918(matrix, x2, y2, z2).method_22915(red, green, blue, alpha).method_22914(nx, ny, nz).method_75298(lineWidth);
    }

    private static void addQuad(class_4588 buffer, Matrix4f matrix, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, float red, float green, float blue, float alpha) {
        buffer.method_22918(matrix, x1, y1, z1).method_22915(red, green, blue, alpha);
        buffer.method_22918(matrix, x2, y2, z2).method_22915(red, green, blue, alpha);
        buffer.method_22918(matrix, x3, y3, z3).method_22915(red, green, blue, alpha);
        buffer.method_22918(matrix, x4, y4, z4).method_22915(red, green, blue, alpha);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addQuad(class_4588 buffer, Matrix3x2fc matrix, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4, float red, float green, float blue, float alpha) {
        buffer.method_70815(matrix, x1, y1).method_22915(red, green, blue, alpha);
        buffer.method_70815(matrix, x2, y2).method_22915(red, green, blue, alpha);
        buffer.method_70815(matrix, x3, y3).method_22915(red, green, blue, alpha);
        buffer.method_70815(matrix, x4, y4).method_22915(red, green, blue, alpha);
    }

    public static void renderRoundedQuad(class_332 context, Color color, double x, double y, double x2, double y2, double corner1, double corner2, double corner3, double corner4, double samples) {
        int left = (int) Math.floor(Math.min(x, x2));
        int top = (int) Math.floor(Math.min(y, y2));
        int right = (int) Math.ceil(Math.max(x, x2));
        int bottom = (int) Math.ceil(Math.max(y, y2));
        int width = right - left;
        int height = bottom - top;
        if (width <= 0 || height <= 0) {
            return;
        }
        int radiusTopLeft = clampRadius(corner1, width, height);
        int radiusTopRight = clampRadius(corner2, width, height);
        int radiusBottomLeft = clampRadius(corner3, width, height);
        int radiusBottomRight = clampRadius(corner4, width, height);
        int packedColor = color.getRGB();
        for (int row = 0; row < height; row++) {
            int leftInset = getLeftInsetForRow(row, height, radiusTopLeft, radiusBottomLeft);
            int rightInset = getRightInsetForRow(row, height, radiusTopRight, radiusBottomRight);
            fillRow(context, left + leftInset, right - rightInset, top + row, packedColor);
        }
    }

    public static void renderRoundedQuad(class_332 context, Color color, double x, double y, double x1, double y1, double rad, double samples) {
        renderRoundedQuad(context, color, x, y, x1, y1, rad, rad, rad, rad, samples);
    }

    public static void renderRoundedOutlineInternal(Matrix3x2fc matrix, float cr, float cg, float cb, float ca, double fromX, double fromY, double toX, double toY, double radC1, double radC2, double radC3, double radC4, double width, double samples) {
        drawLayer(class_12249.method_76023(), buffer -> {
            double[] dArr = {new double[]{toX - radC4, toY - radC4, radC4}, new double[]{toX - radC2, fromY + radC2, radC2}, new double[]{fromX + radC1, fromY + radC1, radC1}, new double[]{fromX + radC3, toY - radC3, radC3}};
            for (int i = 0; i < 4; i++) {
                long j = dArr[i][2];
                double start = ((double) i) * 90.0d;
                double end = start + 90.0d;
                double step = 90.0d / samples;
                double d = start;
                while (true) {
                    double angle = d;
                    if (angle < end) {
                        double nextAngle = Math.min(angle + step, end);
                        float rad1 = (float) Math.toRadians(angle);
                        float rad2 = (float) Math.toRadians(nextAngle);
                        float sin1 = (float) Math.sin(rad1);
                        float cos1 = (float) Math.cos(rad1);
                        float sin2 = (float) Math.sin(rad2);
                        float cos2 = (float) Math.cos(rad2);
                        float innerX1 = r0[0] + (sin1 * j);
                        float innerY1 = r0[1] + (cos1 * j);
                        float innerX2 = r0[0] + (sin2 * j);
                        float innerY2 = r0[1] + (cos2 * j);
                        float outerRadius = (float) (j + width);
                        float outerX1 = r0[0] + (sin1 * outerRadius);
                        float outerY1 = r0[1] + (cos1 * outerRadius);
                        float outerX2 = r0[0] + (sin2 * outerRadius);
                        float outerY2 = r0[1] + (cos2 * outerRadius);
                        addQuad(buffer, matrix, innerX1, innerY1, outerX1, outerY1, outerX2, outerY2, innerX2, innerY2, cr, cg, cb, ca);
                        d = angle + step;
                    }
                }
            }
        });
    }

    public static void setScissorRegion(int x, int y, int width, int height) {
        int screenHeight;
        class_437 currentScreen = class_310.method_1551().field_1755;
        if (currentScreen == null) {
            screenHeight = 0;
        } else {
            screenHeight = currentScreen.field_22790 - height;
        }
        double scaleFactor = class_310.method_1551().method_22683().method_4495();
        GL11.glScissor((int) (((double) x) * scaleFactor), (int) (((double) screenHeight) * scaleFactor), (int) (((double) (width - x)) * scaleFactor), (int) (((double) (height - y)) * scaleFactor));
        GL11.glEnable(3089);
    }

    public static void renderCircle(class_332 context, Color color, double originX, double originY, double radius, int segments) {
        int top = (int) Math.floor(originY - radius);
        int bottom = (int) Math.ceil(originY + radius);
        int packedColor = color.getRGB();
        for (int y = top; y < bottom; y++) {
            double distanceY = (((double) y) + 0.5d) - originY;
            double radiusSquared = radius * radius;
            double inner = radiusSquared - (distanceY * distanceY);
            if (inner > 0.0d) {
                double distanceX = Math.sqrt(inner);
                int left = (int) Math.floor(originX - distanceX);
                int right = (int) Math.ceil(originX + distanceX);
                fillRow(context, left, right, y, packedColor);
            }
        }
    }

    public static void renderShaderRect(Matrix3x2fStack matrixStack, Color color, Color color2, Color color3, Color color4, float f, float f2, float f3, float f4, float f5, float f6) {
        float alpha = color.getAlpha() / 255.0f;
        float red = color.getRed() / 255.0f;
        float green = color.getGreen() / 255.0f;
        float blue = color.getBlue() / 255.0f;
        drawLayer(class_12249.method_76023(), buffer -> {
            addQuad(buffer, matrixStack, f - 10.0f, f2 - 10.0f, f - 10.0f, f2 + f4 + 20.0f, f + f3 + 20.0f, f2 + f4 + 20.0f, f + f3 + 20.0f, f2 - 10.0f, red, green, blue, alpha);
        });
    }

    public static void renderRoundedOutline(class_332 poses, Color c, double fromX, double fromY, double toX, double toY, double rad1, double rad2, double rad3, double rad4, double width, double samples) {
        int left = (int) Math.floor(Math.min(fromX, toX));
        int top = (int) Math.floor(Math.min(fromY, toY));
        int right = (int) Math.ceil(Math.max(fromX, toX));
        int bottom = (int) Math.ceil(Math.max(fromY, toY));
        int outerWidth = right - left;
        int outerHeight = bottom - top;
        if (outerWidth <= 0 || outerHeight <= 0) {
            return;
        }
        int thickness = Math.max(1, (int) Math.round(width));
        if (thickness * 2 >= outerWidth || thickness * 2 >= outerHeight) {
            renderRoundedQuad(poses, c, fromX, fromY, toX, toY, rad1, rad2, rad3, rad4, samples);
            return;
        }
        int radiusTopLeft = clampRadius(rad1, outerWidth, outerHeight);
        int radiusTopRight = clampRadius(rad2, outerWidth, outerHeight);
        int radiusBottomLeft = clampRadius(rad3, outerWidth, outerHeight);
        int radiusBottomRight = clampRadius(rad4, outerWidth, outerHeight);
        int innerLeft = left + thickness;
        int innerTop = top + thickness;
        int innerRight = right - thickness;
        int innerBottom = bottom - thickness;
        int i = innerRight - innerLeft;
        int innerHeight = innerBottom - innerTop;
        int innerRadiusTopLeft = Math.max(0, radiusTopLeft - thickness);
        int innerRadiusTopRight = Math.max(0, radiusTopRight - thickness);
        int innerRadiusBottomLeft = Math.max(0, radiusBottomLeft - thickness);
        int innerRadiusBottomRight = Math.max(0, radiusBottomRight - thickness);
        int packedColor = c.getRGB();
        for (int row = 0; row < outerHeight; row++) {
            int outerLeft = left + getLeftInsetForRow(row, outerHeight, radiusTopLeft, radiusBottomLeft);
            int outerRight = right - getRightInsetForRow(row, outerHeight, radiusTopRight, radiusBottomRight);
            int y = top + row;
            if (y < innerTop || y >= innerBottom) {
                fillRow(poses, outerLeft, outerRight, y, packedColor);
            } else {
                int innerRow = y - innerTop;
                int innerRowLeft = innerLeft + getLeftInsetForRow(innerRow, innerHeight, innerRadiusTopLeft, innerRadiusBottomLeft);
                int innerRowRight = innerRight - getRightInsetForRow(innerRow, innerHeight, innerRadiusTopRight, innerRadiusBottomRight);
                fillRow(poses, outerLeft, innerRowLeft, y, packedColor);
                fillRow(poses, innerRowRight, outerRight, y, packedColor);
            }
        }
    }

    public static class_4587 matrixFrom(double x, double y, double z) {
        class_4587 matrices = new class_4587();
        class_4184 camera = class_310.method_1551().field_1773.method_19418();
        matrices.method_22907(class_7833.field_40714.rotationDegrees(camera.method_19329()));
        matrices.method_22907(class_7833.field_40716.rotationDegrees(camera.method_19330() + 180.0f));
        class_243 cameraPos = camera.method_71156();
        matrices.method_22904(x - cameraPos.field_1352, y - cameraPos.field_1351, z - cameraPos.field_1350);
        return matrices;
    }

    public static void renderQuad(Matrix3x2fStack matrices, float x, float y, float width, float height, int color) {
        float alpha = ((color >> 24) & 255) / 255.0f;
        float red = ((color >> 16) & 255) / 255.0f;
        float green = ((color >> 8) & 255) / 255.0f;
        float blue = (color & 255) / 255.0f;
        matrices.pushMatrix();
        matrices.scale(0.5f, 0.5f);
        matrices.translate(x, y);
        drawLayer(class_12249.method_76023(), buffer -> {
            addQuad(buffer, matrices, 0.0f, 0.0f, 0.0f, height, width, height, width, 0.0f, red, green, blue, alpha);
        });
        matrices.popMatrix();
    }

    public static void renderRoundedQuadInternal(Matrix3x2fc matrix, float cr, float cg, float cb, float ca, double fromX, double fromY, double toX, double toY, double corner1, double corner2, double corner3, double corner4, double samples) {
        drawLayer(class_12249.method_76025(), buffer -> {
            buffer.method_70815(matrix, (float) ((fromX + toX) / 2.0d), (float) ((fromY + toY) / 2.0d)).method_22915(cr, cg, cb, ca);
            double[] dArr = {new double[]{toX - corner4, toY - corner4, corner4}, new double[]{toX - corner2, fromY + corner2, corner2}, new double[]{fromX + corner1, fromY + corner1, corner1}, new double[]{fromX + corner3, toY - corner3, corner3}};
            for (int i = 0; i < 4; i++) {
                long j = dArr[i][2];
                double start = ((double) i) * 90.0d;
                double end = start + 90.0d;
                double step = 90.0d / samples;
                double d = start;
                while (true) {
                    double angle = d;
                    if (angle <= end) {
                        float radians = (float) Math.toRadians(Math.min(angle, end));
                        float sin = (float) (Math.sin(radians) * j);
                        float cos = (float) (Math.cos(radians) * j);
                        buffer.method_70815(matrix, r0[0] + sin, r0[1] + cos).method_22915(cr, cg, cb, ca);
                        d = angle + step;
                    }
                }
            }
            float cos2 = dArr[0][2];
            buffer.method_70815(matrix, r0[0] + 0.0f, r0[1] + cos2).method_22915(cr, cg, cb, ca);
        });
    }

    private static int clampRadius(double radius, int width, int height) {
        return Math.max(0, Math.min((int) Math.round(radius), Math.min(width, height) / 2));
    }

    private static int getLeftInsetForRow(int row, int height, int radiusTop, int radiusBottom) {
        int inset = 0;
        if (radiusTop > 0 && row < radiusTop) {
            inset = Math.max(0, getCornerInset(radiusTop, row));
        }
        if (radiusBottom > 0 && row >= height - radiusBottom) {
            inset = Math.max(inset, getCornerInset(radiusBottom, (height - 1) - row));
        }
        return inset;
    }

    private static int getRightInsetForRow(int row, int height, int radiusTop, int radiusBottom) {
        int inset = 0;
        if (radiusTop > 0 && row < radiusTop) {
            inset = Math.max(0, getCornerInset(radiusTop, row));
        }
        if (radiusBottom > 0 && row >= height - radiusBottom) {
            inset = Math.max(inset, getCornerInset(radiusBottom, (height - 1) - row));
        }
        return inset;
    }

    private static int getCornerInset(int radius, int offsetFromEdge) {
        double distance = ((double) radius) - (((double) offsetFromEdge) + 0.5d);
        double inside = ((double) (radius * radius)) - (distance * distance);
        if (inside <= 0.0d) {
            return radius;
        }
        return Math.max(0, (int) Math.ceil(((double) radius) - Math.sqrt(inside)));
    }

    private static void fillRow(class_332 context, int left, int right, int y, int color) {
        if (right <= left) {
            return;
        }
        context.method_25294(left, y, right, y + 1, color);
    }

    public static void renderFilledBox(class_4587 matrices, float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        float red = color.getRed() / 255.0f;
        float green = color.getGreen() / 255.0f;
        float blue = color.getBlue() / 255.0f;
        float alpha = color.getAlpha() / 255.0f;
        Matrix4f matrix = matrices.method_23760().method_23761();
        GL11.glDepthFunc(519);
        drawLayer(class_12249.method_76019(), buffer -> {
            addQuad(buffer, matrix, f, f2, f3, f4, f2, f3, f4, f2, f6, f, f2, f6, red, green, blue, alpha);
            addQuad(buffer, matrix, f, f5, f3, f, f5, f6, f4, f5, f6, f4, f5, f3, red, green, blue, alpha);
            addQuad(buffer, matrix, f, f2, f3, f, f5, f3, f4, f5, f3, f4, f2, f3, red, green, blue, alpha);
            addQuad(buffer, matrix, f, f2, f6, f4, f2, f6, f4, f5, f6, f, f5, f6, red, green, blue, alpha);
            addQuad(buffer, matrix, f, f2, f3, f, f2, f6, f, f5, f6, f, f5, f3, red, green, blue, alpha);
            addQuad(buffer, matrix, f4, f2, f3, f4, f5, f3, f4, f5, f6, f4, f2, f6, red, green, blue, alpha);
        });
        GL11.glDepthFunc(515);
    }

    public static void renderBoxOutline(class_4587 matrices, class_238 box, Color color, float lineWidth) {
        Matrix4f matrix = matrices.method_23760().method_23761();
        float red = color.getRed() / 255.0f;
        float green = color.getGreen() / 255.0f;
        float blue = color.getBlue() / 255.0f;
        float alpha = color.getAlpha() / 255.0f;
        if (ClickGUI.antiAliasing.getValue()) {
            GL11.glEnable(32925);
            GL11.glEnable(2848);
            GL11.glHint(3154, 4354);
        }
        GL11.glDepthFunc(519);
        drawLayer(class_12249.method_76015(), buffer -> {
            float minX = (float) box.field_1323;
            float minY = (float) box.field_1322;
            float minZ = (float) box.field_1321;
            float maxX = (float) box.field_1320;
            float maxY = (float) box.field_1325;
            float maxZ = (float) box.field_1324;
            emitLine(buffer, matrix, minX, minY, minZ, maxX, minY, minZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, maxX, minY, minZ, maxX, minY, maxZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, maxX, minY, maxZ, minX, minY, maxZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, minX, minY, maxZ, minX, minY, minZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, minX, maxY, minZ, maxX, maxY, minZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, maxX, maxY, minZ, maxX, maxY, maxZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, maxX, maxY, maxZ, minX, maxY, maxZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, minX, maxY, maxZ, minX, maxY, minZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, minX, minY, minZ, minX, maxY, minZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, maxX, minY, minZ, maxX, maxY, minZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, maxX, minY, maxZ, maxX, maxY, maxZ, red, green, blue, alpha, lineWidth);
            emitLine(buffer, matrix, minX, minY, maxZ, minX, maxY, maxZ, red, green, blue, alpha, lineWidth);
        });
        GL11.glDepthFunc(515);
        if (ClickGUI.antiAliasing.getValue()) {
            GL11.glDisable(2848);
            GL11.glDisable(32925);
        }
    }

    public static void renderLine(class_4587 matrices, Color color, class_243 start, class_243 end) {
        matrices.method_22903();
        Matrix4f matrix = matrices.method_23760().method_23761();
        if (ClickGUI.antiAliasing.getValue()) {
            GL11.glEnable(32925);
            GL11.glEnable(2848);
            GL11.glHint(3154, 4354);
        }
        GL11.glDepthFunc(519);
        float red = color.getRed() / 255.0f;
        float green = color.getGreen() / 255.0f;
        float blue = color.getBlue() / 255.0f;
        float alpha = color.getAlpha() / 255.0f;
        drawLayer(class_12249.method_76015(), buffer -> {
            emitLine(buffer, matrix, (float) start.field_1352, (float) start.field_1351, (float) start.field_1350, (float) end.field_1352, (float) end.field_1351, (float) end.field_1350, red, green, blue, alpha, 1.0f);
        });
        GL11.glDepthFunc(515);
        if (ClickGUI.antiAliasing.getValue()) {
            GL11.glDisable(2848);
            GL11.glDisable(32925);
        }
        matrices.method_22909();
    }
}
