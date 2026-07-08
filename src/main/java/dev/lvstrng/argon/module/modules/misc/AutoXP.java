package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.ItemUseListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.MathUtils;
import dev.lvstrng.argon.utils.MouseSimulation;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1802;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/AutoXP.class */
public final class AutoXP extends Module implements TickListener, ItemUseListener {
    private final NumberSetting delay;
    private final NumberSetting chance;
    private final BooleanSetting clickSimulation;
    int clock;

    public AutoXP() {
        super(EncryptedString.of("Auto XP"), EncryptedString.of("Automatically throws XP bottles for you"), -1, Category.MISC);
        this.delay = new NumberSetting(EncryptedString.of("Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.chance = new NumberSetting(EncryptedString.of("Chance"), 0.0d, 100.0d, 100.0d, 1.0d).setDescription(EncryptedString.of("Randomization"));
        this.clickSimulation = new BooleanSetting(EncryptedString.of("Click Simulation"), false).setDescription(EncryptedString.of("Makes the CPS hud think you're legit"));
        addSettings(this.delay, this.chance, this.clickSimulation);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.eventManager.add(ItemUseListener.class, this);
        this.clock = 0;
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        this.eventManager.remove(ItemUseListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1755 != null) {
            return;
        }
        boolean dontThrow = this.clock != 0;
        int randomInt = MathUtils.randomInt(1, 100);
        if (this.mc.field_1724.method_6047().method_7909() != class_1802.field_8287 || GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 1) != 1) {
            return;
        }
        if (dontThrow) {
            this.clock--;
        }
        if (!dontThrow && randomInt <= this.chance.getValueInt()) {
            if (this.clickSimulation.getValue()) {
                MouseSimulation.mouseClick(1);
            }
            class_1269 result = this.mc.field_1761.method_2919(this.mc.field_1724, class_1268.field_5808);
            if (result.method_23665()) {
                this.mc.field_1724.method_6104(class_1268.field_5808);
            }
            this.clock = this.delay.getValueInt();
        }
    }

    @Override // dev.lvstrng.argon.event.events.ItemUseListener
    public void onItemUse(ItemUseListener.ItemUseEvent event) {
        if (this.mc.field_1724.method_6047().method_7909() == class_1802.field_8287) {
            event.cancel();
        }
    }
}
