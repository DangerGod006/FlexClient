package dev.lvstrng.argon.gui;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.modules.client.ClickGUI;
import dev.lvstrng.argon.utils.ColorUtils;
import dev.lvstrng.argon.utils.RenderUtils;
import java.awt.Color;
import java.lang.StackWalker;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/gui/ClickGui.class */
public final class ClickGui extends class_437 {
    public List<Window> windows;
    public Color currentColor;
    private static final StackWalker sw = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);

    public ClickGui() {
        super(class_2561.method_43473());
        this.windows = new ArrayList();
        int offsetX = 50;
        for (Category category : Category.values()) {
            this.windows.add(new Window(offsetX, 50, 230, 30, category, this));
            offsetX += 250;
        }
    }

    public boolean isDraggingAlready() {
        for (Window window : this.windows) {
            if (window.dragging) {
                return true;
            }
        }
        return false;
    }

    protected void method_56131() {
        if (this.field_22787 == null) {
            return;
        }
        super.method_56131();
    }

    public void method_25394(class_332 context, int mouseX, int mouseY, float delta) {
        if (Argon.mc.field_1755 == this) {
            if (Argon.INSTANCE.previousScreen != null) {
                Argon.INSTANCE.previousScreen.method_25394(context, 0, 0, delta);
            }
            if (this.currentColor == null) {
                this.currentColor = new Color(0, 0, 0, 0);
            } else {
                this.currentColor = new Color(0, 0, 0, this.currentColor.getAlpha());
            }
            if (this.currentColor.getAlpha() != (ClickGUI.background.getValue() ? 200 : 0)) {
                this.currentColor = ColorUtils.smoothAlphaTransition(0.05f, ClickGUI.background.getValue() ? 200 : 0, this.currentColor);
            }
            if (Argon.mc.field_1755 instanceof ClickGui) {
                context.method_25294(0, 0, Argon.mc.method_22683().method_4480(), Argon.mc.method_22683().method_4507(), this.currentColor.getRGB());
            }
            RenderUtils.unscaledProjection(context);
            int mouseX2 = mouseX * class_310.method_1551().method_22683().method_4495();
            int mouseY2 = mouseY * class_310.method_1551().method_22683().method_4495();
            super.method_25394(context, mouseX2, mouseY2, delta);
            for (Window window : this.windows) {
                window.render(context, mouseX2, mouseY2, delta);
                window.updatePosition(mouseX2, mouseY2, delta);
            }
            RenderUtils.scaledProjection(context);
        }
    }

    public boolean method_25404(class_11908 keyInput) {
        int keyCode = keyInput.comp_4795();
        int scanCode = keyInput.comp_4796();
        int modifiers = keyInput.comp_4797();
        for (Window window : this.windows) {
            window.keyPressed(keyCode, scanCode, modifiers);
        }
        return super.method_25404(keyInput);
    }

    public boolean method_25402(class_11909 click, boolean doubled) {
        double mouseX = click.comp_4798();
        double mouseY = click.comp_4799();
        int button = click.method_74245();
        double mouseX2 = mouseX * ((double) class_310.method_1551().method_22683().method_4495());
        double mouseY2 = mouseY * ((double) class_310.method_1551().method_22683().method_4495());
        for (Window window : this.windows) {
            window.mouseClicked(mouseX2, mouseY2, button);
        }
        return super.method_25402(click, doubled);
    }

    public boolean method_25403(class_11909 click, double deltaX, double deltaY) {
        double mouseX = click.comp_4798();
        double mouseY = click.comp_4799();
        int button = click.method_74245();
        double mouseX2 = mouseX * ((double) class_310.method_1551().method_22683().method_4495());
        double mouseY2 = mouseY * ((double) class_310.method_1551().method_22683().method_4495());
        for (Window window : this.windows) {
            window.mouseDragged(mouseX2, mouseY2, button, deltaX, deltaY);
        }
        return super.method_25403(click, deltaX, deltaY);
    }

    public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        class_310 mc = class_310.method_1551();
        double mouseY2 = mouseY * ((double) mc.method_22683().method_4495());
        for (Window window : this.windows) {
            window.mouseScrolled(mouseX, mouseY2, horizontalAmount, verticalAmount);
        }
        return super.method_25401(mouseX, mouseY2, horizontalAmount, verticalAmount);
    }

    public boolean method_25421() {
        return false;
    }

    public void method_25419() {
        ((ClickGUI) Argon.INSTANCE.getModuleManager().getModule(ClickGUI.class)).toggle();
    }

    public void onGuiClose() {
        Argon.mc.method_1507(Argon.INSTANCE.previousScreen);
        this.currentColor = null;
        for (Window window : this.windows) {
            window.onGuiClose();
        }
    }

    public boolean method_25406(class_11909 click) {
        double mouseX = click.comp_4798();
        double mouseY = click.comp_4799();
        int button = click.method_74245();
        double mouseX2 = mouseX * ((double) class_310.method_1551().method_22683().method_4495());
        double mouseY2 = mouseY * ((double) class_310.method_1551().method_22683().method_4495());
        for (Window window : this.windows) {
            window.mouseReleased(mouseX2, mouseY2, button);
        }
        return super.method_25406(click);
    }
}
