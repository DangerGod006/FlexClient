package dev.lvstrng.argon.utils;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.font.Fonts;
import dev.lvstrng.argon.module.modules.client.ClickGUI;
import net.minecraft.class_332;
import org.joml.Matrix3x2fStack;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/TextRenderer.class */
public final class TextRenderer {
    public static void drawString(CharSequence string, class_332 context, int x, int y, int color) {
        boolean custom = ClickGUI.customFont.getValue();
        if (custom) {
            Fonts.QUICKSAND.drawString(context, string, x, y - 8, color);
        } else {
            drawMinecraftText(string, context, x, y, color);
        }
    }

    public static int getWidth(CharSequence string) {
        boolean custom = ClickGUI.customFont.getValue();
        if (custom) {
            return Fonts.QUICKSAND.getStringWidth(string);
        }
        return Argon.mc.field_1772.method_1727(string.toString()) * 2;
    }

    public static void drawCenteredString(CharSequence string, class_332 context, int x, int y, int color) {
        boolean custom = ClickGUI.customFont.getValue();
        if (custom) {
            Fonts.QUICKSAND.drawString(context, string, x - (Fonts.QUICKSAND.getStringWidth(string) / 2), y - 8, color);
        } else {
            drawCenteredMinecraftText(string, context, x, y, color);
        }
    }

    public static void drawLargeString(CharSequence string, class_332 context, int x, int y, int color) {
        boolean custom = ClickGUI.customFont.getValue();
        if (custom) {
            Matrix3x2fStack matrices = context.method_51448();
            matrices.pushMatrix();
            matrices.scale(1.4f, 1.4f);
            Fonts.QUICKSAND.drawString(context, string, x, y - 8, color);
            matrices.popMatrix();
            return;
        }
        drawLargerMinecraftText(string, context, x, y, color);
    }

    public static void drawMinecraftText(CharSequence string, class_332 context, int x, int y, int color) {
        Matrix3x2fStack matrices = context.method_51448();
        matrices.pushMatrix();
        matrices.scale(2.0f, 2.0f);
        context.method_51433(Argon.mc.field_1772, string.toString(), x / 2, y / 2, color, false);
        matrices.popMatrix();
    }

    public static void drawLargerMinecraftText(CharSequence string, class_332 context, int x, int y, int color) {
        Matrix3x2fStack matrices = context.method_51448();
        matrices.pushMatrix();
        matrices.scale(3.0f, 3.0f);
        context.method_51433(Argon.mc.field_1772, string.toString(), x / 3, y / 3, color, false);
        matrices.popMatrix();
    }

    public static void drawCenteredMinecraftText(CharSequence string, class_332 context, int x, int y, int color) {
        Matrix3x2fStack matrices = context.method_51448();
        matrices.pushMatrix();
        matrices.scale(2.0f, 2.0f);
        context.method_51433(Argon.mc.field_1772, string.toString(), (x / 2) - (Argon.mc.field_1772.method_1727(string.toString()) / 2), y / 2, color, false);
        matrices.popMatrix();
    }
}
