package dev.lvstrng.argon.gui.components.settings;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.gui.components.ModuleButton;
import dev.lvstrng.argon.module.modules.client.ClickGUI;
import dev.lvstrng.argon.module.setting.Setting;
import dev.lvstrng.argon.module.setting.StringSetting;
import dev.lvstrng.argon.utils.ColorUtils;
import dev.lvstrng.argon.utils.RenderUtils;
import dev.lvstrng.argon.utils.TextRenderer;
import dev.lvstrng.argon.utils.Utils;
import java.awt.Color;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/gui/components/settings/StringBox.class */
public final class StringBox extends RenderableSetting {
    private final StringSetting setting;
    private Color currentAlpha;

    public StringBox(ModuleButton parent, Setting<?> setting, int offset) {
        super(parent, setting, offset);
        this.setting = (StringSetting) setting;
    }

    @Override // dev.lvstrng.argon.gui.components.settings.RenderableSetting
    public void render(class_332 context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        TextRenderer.drawString(String.valueOf(this.setting.getName()) + ": " + (this.setting.getValue().length() <= 9 ? this.setting.getValue() : this.setting.getValue().substring(0, 9) + "..."), context, parentX() + 9, parentY() + parentOffset() + this.offset + 9, new Color(245, 245, 245, 255).getRGB());
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
        if (isHovered(mouseX, mouseY) && button == 0) {
            this.mc.method_1507(new class_437(class_2561.method_43473()) { // from class: dev.lvstrng.argon.gui.components.settings.StringBox.1
                private String content;

                {
                    this.content = StringBox.this.setting.getValue();
                }

                public void method_25394(class_332 context, int mouseX2, int mouseY2, float delta) {
                    RenderUtils.unscaledProjection(context);
                    super.method_25394(context, mouseX2 * class_310.method_1551().method_22683().method_4495(), mouseY2 * class_310.method_1551().method_22683().method_4495(), delta);
                    context.method_25294(0, 0, StringBox.this.mc.method_22683().method_4480(), StringBox.this.mc.method_22683().method_4507(), new Color(0, 0, 0, ClickGUI.background.getValue() ? 200 : 0).getRGB());
                    int screenMidX = StringBox.this.mc.method_22683().method_4480() / 2;
                    int screenMidY = StringBox.this.mc.method_22683().method_4507() / 2;
                    int contentWidth = Math.max(TextRenderer.getWidth(this.content), 600);
                    int width = contentWidth + 30;
                    int startX = screenMidX - (width / 2);
                    int startY = screenMidY - 30;
                    RenderUtils.renderRoundedQuad(context, new Color(0, 0, 0, ClickGUI.alphaWindow.getValueInt()), startX, startY, startX + width, screenMidY + 30, 5.0d, 5.0d, 0.0d, 0.0d, 20.0d);
                    TextRenderer.drawCenteredString(StringBox.this.setting.getName(), context, screenMidX, startY + 10, new Color(245, 245, 245, 255).getRGB());
                    context.method_25294(startX, screenMidY, startX + width, screenMidY + 30, new Color(0, 0, 0, 120).getRGB());
                    RenderUtils.renderRoundedOutline(context, new Color(50, 50, 50, 255), startX + 10, screenMidY + 5, startX + (width - 10), screenMidY + 25, 5.0d, 5.0d, 5.0d, 5.0d, 2.0d, 20.0d);
                    TextRenderer.drawString(this.content, context, startX + 15, screenMidY + 8, new Color(245, 245, 245, 255).getRGB());
                    context.method_25294(startX, screenMidY, startX + width, screenMidY + 1, Utils.getMainColor(255, 1).getRGB());
                    RenderUtils.scaledProjection(context);
                }

                public boolean method_25404(class_11908 keyInput) {
                    int keyCode = keyInput.comp_4795();
                    keyInput.comp_4797();
                    if (keyCode == 256) {
                        StringBox.this.setting.setValue(this.content.strip());
                        StringBox.this.mc.method_1507(Argon.INSTANCE.clickGui);
                        return true;
                    }
                    if (isPasteShortcut(keyInput)) {
                        this.content += StringBox.this.mc.field_1774.method_1460();
                        return true;
                    }
                    if (isCopyShortcut(keyInput)) {
                        StringBox.this.mc.field_1774.method_1455(this.content);
                        return true;
                    }
                    if (keyCode == 259) {
                        if (!this.content.isEmpty()) {
                            this.content = this.content.substring(0, this.content.length() - 1);
                            return true;
                        }
                        return true;
                    }
                    return super.method_25404(keyInput);
                }

                public void method_25420(class_332 context, int mouseX2, int mouseY2, float delta) {
                }

                public boolean method_25400(class_11905 charInput) {
                    if (!charInput.method_74227()) {
                        return super.method_25400(charInput);
                    }
                    this.content += charInput.method_74226();
                    return true;
                }

                public boolean method_25422() {
                    return false;
                }

                private boolean isCopyShortcut(class_11908 keyInput) {
                    return keyInput.comp_4795() == 67 && (keyInput.comp_4797() & 2) != 0;
                }

                private boolean isPasteShortcut(class_11908 keyInput) {
                    return keyInput.comp_4795() == 86 && (keyInput.comp_4797() & 2) != 0;
                }
            });
        }
        super.mouseClicked(mouseX, mouseY, button);
    }
}
