package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.ModeSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.MathUtils;
import dev.lvstrng.argon.utils.MouseSimulation;
import dev.lvstrng.argon.utils.TimerUtils;
import dev.lvstrng.argon.utils.WorldUtils;
import net.minecraft.class_1792;
import net.minecraft.class_1811;
import net.minecraft.class_239;
import net.minecraft.class_9334;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/AutoClicker.class */
public final class AutoClicker extends Module implements TickListener {
    private final BooleanSetting onlyWeapon;
    private final BooleanSetting onlyBlocks;
    private final BooleanSetting onClick;
    private final NumberSetting delay;
    private final NumberSetting chance;
    private final ModeSetting<Mode> mode;
    private final TimerUtils timer;

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/AutoClicker$Mode.class */
    public enum Mode {
        All,
        Left,
        Right
    }

    public AutoClicker() {
        super(EncryptedString.of("Auto Clicker"), EncryptedString.of("Automatically clicks for you"), -1, Category.MISC);
        this.onlyWeapon = new BooleanSetting(EncryptedString.of("Only Weapon"), true).setDescription(EncryptedString.of("Only left clicks with weapon in hand"));
        this.onlyBlocks = new BooleanSetting(EncryptedString.of("Only Blocks"), true).setDescription(EncryptedString.of("Only right clicks blocks"));
        this.onClick = new BooleanSetting(EncryptedString.of("On Click"), true);
        this.delay = new NumberSetting(EncryptedString.of("Delay"), 0.0d, 1000.0d, 0.0d, 1.0d);
        this.chance = new NumberSetting(EncryptedString.of("Chance"), 0.0d, 100.0d, 100.0d, 1.0d);
        this.mode = new ModeSetting<>(EncryptedString.of("Actions"), Mode.All, Mode.class);
        this.timer = new TimerUtils();
        addSettings(this.onlyWeapon, this.onClick, this.delay, this.chance, this.mode);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.timer.reset();
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1724 != null && this.mc.field_1755 == null && this.mc.field_1765 != null && this.timer.delay(this.delay.getValueFloat()) && this.chance.getValueInt() >= MathUtils.randomInt(1, 100)) {
            if (this.mode.isMode(Mode.Left)) {
                performLeftClick();
            }
            if (this.mode.isMode(Mode.Right)) {
                performRightClick();
            }
            if (this.mode.isMode(Mode.All)) {
                performLeftClick();
                performRightClick();
            }
        }
    }

    private void performRightClick() {
        class_1792 mainhand = this.mc.field_1724.method_6047().method_7909();
        class_1792 offhand = this.mc.field_1724.method_6079().method_7909();
        if (mainhand.method_57347().method_57832(class_9334.field_50075) || offhand.method_57347().method_57832(class_9334.field_50075) || (mainhand instanceof class_1811) || (offhand instanceof class_1811)) {
            return;
        }
        if (this.onClick.getValue() && GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 1) != 1) {
            return;
        }
        MouseSimulation.mouseClick(1);
        this.mc.invokeDoItemUse();
        this.timer.reset();
    }

    private void performLeftClick() {
        this.mc.field_1724.method_6047().method_7909();
        this.mc.field_1724.method_6079().method_7909();
        if (this.mc.field_1765.method_17783() == class_239.class_240.field_1332 || this.mc.field_1724.method_6115()) {
            return;
        }
        if (this.onlyWeapon.getValue() && !WorldUtils.isWeapon(this.mc.field_1724.method_6047())) {
            return;
        }
        if (this.onClick.getValue() && GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 0) != 1) {
            return;
        }
        MouseSimulation.mouseClick(0);
        this.mc.invokeDoAttack();
        this.timer.reset();
    }
}
