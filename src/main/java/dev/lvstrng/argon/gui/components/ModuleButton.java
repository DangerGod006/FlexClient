package dev.lvstrng.argon.gui.components;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.gui.Window;
import dev.lvstrng.argon.gui.components.settings.CheckBox;
import dev.lvstrng.argon.gui.components.settings.KeybindBox;
import dev.lvstrng.argon.gui.components.settings.MinMaxSlider;
import dev.lvstrng.argon.gui.components.settings.ModeBox;
import dev.lvstrng.argon.gui.components.settings.RenderableSetting;
import dev.lvstrng.argon.gui.components.settings.Slider;
import dev.lvstrng.argon.gui.components.settings.StringBox;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.modules.client.ClickGUI;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.KeybindSetting;
import dev.lvstrng.argon.module.setting.MinMaxSetting;
import dev.lvstrng.argon.module.setting.ModeSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.module.setting.Setting;
import dev.lvstrng.argon.module.setting.StringSetting;
import dev.lvstrng.argon.utils.AnimationUtils;
import dev.lvstrng.argon.utils.ColorUtils;
import dev.lvstrng.argon.utils.RenderUtils;
import dev.lvstrng.argon.utils.TextRenderer;
import dev.lvstrng.argon.utils.Utils;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_310;
import net.minecraft.class_332;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/gui/components/ModuleButton.class */
public final class ModuleButton {
    public Window parent;
    public Module module;
    public int offset;
    public int settingOffset;
    public Color currentColor;
    public Color currentAlpha;
    public List<RenderableSetting> settings = new ArrayList();
    public Color defaultColor = Color.WHITE;
    public AnimationUtils animation = new AnimationUtils(0.0d);
    public boolean extended = false;

    public ModuleButton(Window parent, Module module, int offset) {
        this.parent = parent;
        this.module = module;
        this.offset = offset;
        this.settingOffset = parent.getHeight();
        for (Setting<?> setting : module.getSettings()) {
            if (setting instanceof BooleanSetting) {
                BooleanSetting booleanSetting = (BooleanSetting) setting;
                this.settings.add(new CheckBox(this, booleanSetting, this.settingOffset));
            } else if (setting instanceof NumberSetting) {
                NumberSetting numberSetting = (NumberSetting) setting;
                this.settings.add(new Slider(this, numberSetting, this.settingOffset));
            } else if (setting instanceof ModeSetting) {
                ModeSetting<?> modeSetting = (ModeSetting) setting;
                this.settings.add(new ModeBox(this, modeSetting, this.settingOffset));
            } else if (setting instanceof KeybindSetting) {
                KeybindSetting keybindSetting = (KeybindSetting) setting;
                this.settings.add(new KeybindBox(this, keybindSetting, this.settingOffset));
            } else if (setting instanceof StringSetting) {
                StringSetting stringSetting = (StringSetting) setting;
                this.settings.add(new StringBox(this, stringSetting, this.settingOffset));
            } else if (setting instanceof MinMaxSetting) {
                MinMaxSetting minMaxSetting = (MinMaxSetting) setting;
                this.settings.add(new MinMaxSlider(this, minMaxSetting, this.settingOffset));
            }
            this.settingOffset += parent.getHeight();
        }
    }

    public void render(class_332 context, int mouseX, int mouseY, float delta) {
        if (this.parent.getY() + this.offset > class_310.method_1551().method_22683().method_4507()) {
            return;
        }
        for (RenderableSetting renderableSetting : this.settings) {
            renderableSetting.onUpdate();
        }
        if (this.currentColor == null) {
            this.currentColor = new Color(0, 0, 0, 0);
        } else {
            this.currentColor = new Color(0, 0, 0, this.currentColor.getAlpha());
        }
        this.currentColor = ColorUtils.smoothAlphaTransition(0.05f, 170, this.currentColor);
        Color toColor = this.module.isEnabled() ? Utils.getMainColor(255, Argon.INSTANCE.getModuleManager().getModulesInCategory(this.module.getCategory()).indexOf(this.module)) : Color.WHITE;
        if (this.defaultColor != toColor) {
            this.defaultColor = ColorUtils.smoothColorTransition(0.1f, toColor, this.defaultColor);
        }
        if (this.parent.moduleButtons.get(this.parent.moduleButtons.size() - 1) != this) {
            context.method_25294(this.parent.getX(), this.parent.getY() + this.offset, this.parent.getX() + this.parent.getWidth(), this.parent.getY() + this.parent.getHeight() + this.offset, this.currentColor.getRGB());
            context.method_25296(this.parent.getX(), this.parent.getY() + this.offset, this.parent.getX() + 2, this.parent.getY() + this.parent.getHeight() + this.offset, Utils.getMainColor(255, Argon.INSTANCE.getModuleManager().getModulesInCategory(this.module.getCategory()).indexOf(this.module)).getRGB(), Utils.getMainColor(255, Argon.INSTANCE.getModuleManager().getModulesInCategory(this.module.getCategory()).indexOf(this.module) + 1).getRGB());
        } else {
            RenderUtils.renderRoundedQuad(context, this.currentColor, this.parent.getX(), this.parent.getY() + this.offset, this.parent.getX() + this.parent.getWidth(), this.parent.getY() + this.parent.getHeight() + this.offset, 0.0d, 0.0d, 3.0d, this.animation.getValue() > 30.0d ? 0.0d : ClickGUI.roundQuads.getValueInt(), 50.0d);
            RenderUtils.renderRoundedQuad(context, Utils.getMainColor(255, Argon.INSTANCE.getModuleManager().getModulesInCategory(this.module.getCategory()).indexOf(this.module)), this.parent.getX(), this.parent.getY() + this.offset, this.parent.getX() + 2, this.parent.getY() + (this.parent.getHeight() - 1) + this.offset, 0.0d, 0.0d, this.extended ? 0.0d : 2.0d, 0.0d, 50.0d);
        }
        CharSequence nameChars = this.module.getName();
        int totalWidth = TextRenderer.getWidth(nameChars);
        int parentCenterX = this.parent.getX() + (this.parent.getWidth() / 2);
        int textCenterX = parentCenterX - (totalWidth / 2);
        TextRenderer.drawString(nameChars, context, textCenterX, this.parent.getY() + this.offset + 8, this.defaultColor.getRGB());
        renderHover(context, mouseX, mouseY, delta);
        renderSettings(context, mouseX, mouseY, delta);
        for (RenderableSetting renderableSetting2 : this.settings) {
            if (this.extended) {
                renderableSetting2.renderDescription(context, mouseX, mouseY, delta);
            }
        }
        if (isHovered(mouseX, mouseY) && !this.parent.dragging) {
            CharSequence chars = this.module.getDescription();
            int tw = TextRenderer.getWidth(chars);
            int parentCenter = Argon.mc.method_22683().method_4489() / 2;
            int textCenter = parentCenter - (tw / 2);
            RenderUtils.renderRoundedQuad(context, new Color(100, 100, 100, 100), textCenter - 5, (((double) Argon.mc.method_22683().method_4506()) / 2.0d) + 294.0d, textCenter + tw + 5, (((double) Argon.mc.method_22683().method_4506()) / 2.0d) + 318.0d, 3.0d, 10.0d);
            TextRenderer.drawString(chars, context, textCenter, (Argon.mc.method_22683().method_4506() / 2) + 300, Color.WHITE.getRGB());
        }
    }

    private void renderHover(class_332 context, int mouseX, int mouseY, float delta) {
        if (!this.parent.dragging) {
            int toHoverAlpha = isHovered((double) mouseX, (double) mouseY) ? 15 : 0;
            if (this.currentAlpha == null) {
                this.currentAlpha = new Color(255, 255, 255, toHoverAlpha);
            } else {
                this.currentAlpha = new Color(255, 255, 255, this.currentAlpha.getAlpha());
            }
            if (this.currentAlpha.getAlpha() != toHoverAlpha) {
                this.currentAlpha = ColorUtils.smoothAlphaTransition(0.05f, toHoverAlpha, this.currentAlpha);
            }
            context.method_25294(this.parent.getX(), this.parent.getY() + this.offset, this.parent.getX() + this.parent.getWidth(), this.parent.getY() + this.parent.getHeight() + this.offset, this.currentAlpha.getRGB());
        }
    }

    private void renderSettings(class_332 context, int mouseX, int mouseY, float delta) {
        int scissorX1 = this.parent.getX();
        int scissorY1 = this.parent.getY() + this.offset;
        int scissorX2 = scissorX1 + this.parent.getWidth();
        int scissorY2 = scissorY1 + ((int) this.animation.getValue());
        context.method_44379(scissorX1, scissorY1, scissorX2, scissorY2);
        for (RenderableSetting renderableSetting : this.settings) {
            if (this.animation.getValue() > this.parent.getHeight()) {
                renderableSetting.render(context, mouseX, mouseY, delta);
            }
        }
        for (RenderableSetting renderableSetting2 : this.settings) {
            if (this.animation.getValue() > this.parent.getHeight()) {
                if (renderableSetting2 instanceof Slider) {
                    Slider slider = (Slider) renderableSetting2;
                    RenderUtils.renderCircle(context, new Color(0, 0, 0, 170), ((double) slider.parentX()) + Math.max(slider.lerpedOffsetX, 2.5d), ((double) (slider.parentY() + slider.offset + slider.parentOffset())) + 27.5d, 6.0d, 15);
                    RenderUtils.renderCircle(context, slider.currentColor1.brighter(), ((double) slider.parentX()) + Math.max(slider.lerpedOffsetX, 2.5d), ((double) (slider.parentY() + slider.offset + slider.parentOffset())) + 27.5d, 5.0d, 15);
                } else if (renderableSetting2 instanceof MinMaxSlider) {
                    MinMaxSlider slider2 = (MinMaxSlider) renderableSetting2;
                    RenderUtils.renderCircle(context, new Color(0, 0, 0, 170), ((double) slider2.parentX()) + Math.max(slider2.lerpedOffsetMinX, 2.5d), ((double) (slider2.parentY() + slider2.offset + slider2.parentOffset())) + 27.5d, 6.0d, 15);
                    RenderUtils.renderCircle(context, slider2.currentColor1.brighter(), ((double) slider2.parentX()) + Math.max(slider2.lerpedOffsetMinX, 2.5d), ((double) (slider2.parentY() + slider2.offset + slider2.parentOffset())) + 27.5d, 5.0d, 15);
                    RenderUtils.renderCircle(context, new Color(0, 0, 0, 170), ((double) slider2.parentX()) + Math.max(slider2.lerpedOffsetMaxX, 2.5d), ((double) (slider2.parentY() + slider2.offset + slider2.parentOffset())) + 27.5d, 6.0d, 15);
                    RenderUtils.renderCircle(context, slider2.currentColor1.brighter(), ((double) slider2.parentX()) + Math.max(slider2.lerpedOffsetMaxX, 2.5d), ((double) (slider2.parentY() + slider2.offset + slider2.parentOffset())) + 27.5d, 5.0d, 15);
                }
            }
        }
        context.method_44380();
    }

    public void onExtend() {
        for (ModuleButton moduleButton : this.parent.moduleButtons) {
            moduleButton.extended = false;
        }
    }

    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        for (RenderableSetting setting : this.settings) {
            setting.keyPressed(keyCode, scanCode, modifiers);
        }
    }

    public void mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
        if (this.extended) {
            for (RenderableSetting renderableSetting : this.settings) {
                renderableSetting.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
            }
        }
    }

    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (isHovered(mouseX, mouseY)) {
            if (button == 0) {
                this.module.toggle();
            }
            if (button == 1) {
                if (this.module.getSettings().isEmpty()) {
                    return;
                }
                if (!this.extended) {
                    onExtend();
                }
                this.extended = !this.extended;
            }
        }
        if (this.extended) {
            for (RenderableSetting renderableSetting : this.settings) {
                renderableSetting.mouseClicked(mouseX, mouseY, button);
            }
        }
    }

    public void onGuiClose() {
        this.currentAlpha = null;
        this.currentColor = null;
        for (RenderableSetting renderableSetting : this.settings) {
            renderableSetting.onGuiClose();
        }
    }

    public void mouseReleased(double mouseX, double mouseY, int button) {
        for (RenderableSetting renderableSetting : this.settings) {
            renderableSetting.mouseReleased(mouseX, mouseY, button);
        }
    }

    public boolean isHovered(double mouseX, double mouseY) {
        return mouseX > ((double) this.parent.getX()) && mouseX < ((double) (this.parent.getX() + this.parent.getWidth())) && mouseY > ((double) (this.parent.getY() + this.offset)) && mouseY < ((double) ((this.parent.getY() + this.offset) + this.parent.getHeight()));
    }
}
