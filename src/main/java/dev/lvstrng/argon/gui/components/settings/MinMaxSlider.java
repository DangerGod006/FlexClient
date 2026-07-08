package dev.lvstrng.argon.gui.components.settings;

import dev.lvstrng.argon.gui.components.ModuleButton;
import dev.lvstrng.argon.module.setting.MinMaxSetting;
import dev.lvstrng.argon.module.setting.Setting;
import dev.lvstrng.argon.utils.ColorUtils;
import dev.lvstrng.argon.utils.MathUtils;
import dev.lvstrng.argon.utils.TextRenderer;
import dev.lvstrng.argon.utils.Utils;
import java.awt.Color;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import org.joml.Matrix3x2fStack;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/gui/components/settings/MinMaxSlider.class */
public final class MinMaxSlider extends RenderableSetting {
    public boolean draggingMin;
    public boolean draggingMax;
    public double offsetMinX;
    public double offsetMaxX;
    public double lerpedOffsetMinX;
    public double lerpedOffsetMaxX;
    public MinMaxSetting setting;
    public Color currentColor1;
    public Color currentColor2;
    private Color currentAlpha;

    public MinMaxSlider(ModuleButton parent, Setting<?> setting, int offset) {
        super(parent, setting, offset);
        this.lerpedOffsetMinX = parentX();
        this.lerpedOffsetMaxX = parentX() + parentWidth();
        this.setting = (MinMaxSetting) setting;
    }

    @Override // dev.lvstrng.argon.gui.components.settings.RenderableSetting
    public void render(class_332 context, int mouseX, int mouseY, float delta) {
        Object objValueOf;
        super.render(context, mouseX, mouseY, delta);
        Matrix3x2fStack matrices = context.method_51448();
        this.offsetMinX = ((this.setting.getMinValue() - this.setting.getMin()) / (this.setting.getMax() - this.setting.getMin())) * ((double) parentWidth());
        this.offsetMaxX = ((this.setting.getMaxValue() - this.setting.getMin()) / (this.setting.getMax() - this.setting.getMin())) * ((double) parentWidth());
        this.lerpedOffsetMinX = MathUtils.goodLerp((float) (0.5d * ((double) delta)), this.lerpedOffsetMinX, this.offsetMinX);
        this.lerpedOffsetMaxX = MathUtils.goodLerp((float) (0.5d * ((double) delta)), this.lerpedOffsetMaxX, this.offsetMaxX);
        String strValueOf = String.valueOf(this.setting.getName());
        if (this.setting.getMinValue() == this.setting.getMaxValue()) {
            objValueOf = Double.valueOf(this.setting.getMinValue());
        } else {
            double minValue = this.setting.getMinValue();
            this.setting.getMaxValue();
            objValueOf = minValue + " - " + strValueOf;
        }
        CharSequence str = strValueOf + ": " + String.valueOf(objValueOf);
        context.method_25296((int) (((double) parentX()) + this.lerpedOffsetMinX), parentY() + this.offset + parentOffset() + 25, (int) (((double) parentX()) + this.lerpedOffsetMinX + getLength()), parentY() + this.offset + parentOffset() + parentHeight(), this.currentColor1.getRGB(), this.currentColor2.getRGB());
        matrices.pushMatrix();
        matrices.scale(0.8f, 0.8f);
        TextRenderer.drawString(str, context, (int) ((parentX() + 5) / 0.8f), (int) ((((parentY() + parentOffset()) + this.offset) + 9) / 0.8f), new Color(245, 245, 245, 255).getRGB());
        matrices.popMatrix();
        if (!this.parent.parent.dragging) {
            int toHoverAlpha = isHovered((double) mouseX, (double) mouseY) ? 15 : 0;
            if (this.currentAlpha == null) {
                this.currentAlpha = new Color(255, 255, 255, toHoverAlpha);
            } else {
                this.currentAlpha = new Color(255, 255, 255, this.currentAlpha.getAlpha());
            }
            if (this.currentAlpha.getAlpha() != toHoverAlpha) {
                this.currentAlpha = ColorUtils.smoothAlphaTransition(0.05f, toHoverAlpha, this.currentAlpha);
            }
            context.method_25294(parentX(), parentY() + parentOffset() + this.offset, parentX() + parentWidth(), parentY() + parentOffset() + this.offset + parentHeight(), this.currentAlpha.getRGB());
        }
    }

    @Override // dev.lvstrng.argon.gui.components.settings.RenderableSetting
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0) {
            if (isHoveredMin(mouseX, mouseY) || isMouseInMin(mouseX, mouseY)) {
                this.draggingMin = true;
                slideMin(mouseX);
            } else if (isHoveredMax(mouseX, mouseY) || isMouseInMax(mouseX, mouseY)) {
                this.draggingMax = true;
                slideMax(mouseX);
            }
        }
        super.mouseClicked(mouseX, mouseY, button);
    }

    @Override // dev.lvstrng.argon.gui.components.settings.RenderableSetting
    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        if (this.mouseOver && keyCode == 259) {
            this.setting.setMaxValue(this.setting.getOriginalMaxValue());
            this.setting.setMinValue(this.setting.getOriginalMinValue());
        }
        super.keyPressed(keyCode, scanCode, modifiers);
    }

    public boolean isHoveredMin(double mouseX, double mouseY) {
        return isHovered(mouseX, mouseY) && mouseX > (((double) parentX()) + this.offsetMinX) - 4.0d && mouseX < (((double) parentX()) + this.offsetMinX) + 4.0d;
    }

    public boolean isHoveredMax(double mouseX, double mouseY) {
        return isHovered(mouseX, mouseY) && mouseX > (((double) parentX()) + this.offsetMaxX) - 4.0d && mouseX < (((double) parentX()) + this.offsetMaxX) + 4.0d;
    }

    public double getLength() {
        return this.lerpedOffsetMaxX - this.lerpedOffsetMinX;
    }

    public boolean isMouseInMin(double mouseX, double mouseY) {
        return isHovered(mouseX, mouseY) && (mouseX <= ((double) parentX()) + this.offsetMinX || mouseX < (((double) parentX()) + this.offsetMinX) + (getLength() / 2.0d));
    }

    public boolean isMouseInMax(double mouseX, double mouseY) {
        return isHovered(mouseX, mouseY) && (mouseX > ((double) parentX()) + this.offsetMaxX || mouseX > (((double) parentX()) + this.offsetMinX) + (getLength() / 2.0d));
    }

    @Override // dev.lvstrng.argon.gui.components.settings.RenderableSetting
    public void mouseReleased(double mouseX, double mouseY, int button) {
        if (button == 0) {
            if (this.draggingMin) {
                this.draggingMin = false;
            }
            if (this.draggingMax) {
                this.draggingMax = false;
            }
        }
        super.mouseReleased(mouseX, mouseY, button);
    }

    @Override // dev.lvstrng.argon.gui.components.settings.RenderableSetting
    public void mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
        if (this.draggingMin) {
            slideMin(mouseX);
        }
        if (this.draggingMax && !this.draggingMin) {
            slideMax(mouseX);
        }
        super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
    }

    @Override // dev.lvstrng.argon.gui.components.settings.RenderableSetting
    public void onGuiClose() {
        this.currentColor1 = null;
        this.currentColor2 = null;
        super.onGuiClose();
    }

    private void slideMin(double mouseX) {
        double a = mouseX - ((double) parentX());
        double b = class_3532.method_15350(a / ((double) parentWidth()), 0.0d, 1.0d);
        this.setting.setMinValue(MathUtils.roundToDecimal((b * (this.setting.getMax() - this.setting.getMin())) + this.setting.getMin(), this.setting.getIncrement()));
    }

    private void slideMax(double mouseX) {
        double a = mouseX - ((double) parentX());
        double b = class_3532.method_15350(a / ((double) parentWidth()), 0.0d, 1.0d);
        this.setting.setMaxValue(MathUtils.roundToDecimal((b * (this.setting.getMax() - this.setting.getMin())) + this.setting.getMin(), this.setting.getIncrement()));
    }

    @Override // dev.lvstrng.argon.gui.components.settings.RenderableSetting
    public void onUpdate() {
        Color clr = Utils.getMainColor(0, this.parent.settings.indexOf(this)).darker();
        Color clr2 = Utils.getMainColor(0, this.parent.settings.indexOf(this) + 1).darker();
        if (this.currentColor1 == null) {
            this.currentColor1 = new Color(clr.getRed(), clr.getGreen(), clr.getBlue(), 0);
        } else {
            this.currentColor1 = new Color(clr.getRed(), clr.getGreen(), clr.getBlue(), this.currentColor1.getAlpha());
        }
        if (this.currentColor2 == null) {
            this.currentColor2 = new Color(clr2.getRed(), clr2.getGreen(), clr2.getBlue(), 0);
        } else {
            this.currentColor2 = new Color(clr2.getRed(), clr2.getGreen(), clr2.getBlue(), this.currentColor2.getAlpha());
        }
        if (this.currentColor1.getAlpha() != 255) {
            this.currentColor1 = ColorUtils.smoothAlphaTransition(0.05f, 255, this.currentColor1);
        }
        if (this.currentColor2.getAlpha() != 255) {
            this.currentColor2 = ColorUtils.smoothAlphaTransition(0.05f, 255, this.currentColor2);
        }
        if (this.draggingMin) {
            this.draggingMax = false;
        }
        if (this.setting.getMinValue() > this.setting.getMaxValue()) {
            this.setting.setMaxValue(this.setting.getMinValue());
        }
        if (this.setting.getMaxValue() < this.setting.getMinValue()) {
            this.setting.setMinValue(this.setting.getMaxValue() - this.setting.getIncrement());
        }
        super.onUpdate();
    }
}
