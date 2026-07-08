package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/BridgeAssist.class */
public final class BridgeAssist extends Module implements TickListener {
    private final BooleanSetting onlyShift;

    public BridgeAssist() {
        super(EncryptedString.of("Bridge Assist"), EncryptedString.of("Automatically sneaks when on edge to help fast bridging"), -1, Category.MISC);
        this.onlyShift = new BooleanSetting(EncryptedString.of("Only While Shift"), false).setDescription(EncryptedString.of("Only activates when you hold shift"));
        addSettings(this.onlyShift);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        if (this.mc.field_1724 != null) {
            this.mc.field_1690.field_1832.method_23481(false);
        }
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1724 == null || this.mc.field_1687 == null || this.mc.field_1755 != null) {
            return;
        }
        if (!this.mc.field_1724.method_24828()) {
            this.mc.field_1690.field_1832.method_23481(false);
            return;
        }
        if (this.onlyShift.getValue() && GLFW.glfwGetKey(this.mc.method_22683().method_4490(), 340) != 1) {
            this.mc.field_1690.field_1832.method_23481(false);
            return;
        }
        double x = this.mc.field_1724.method_23317();
        double y = this.mc.field_1724.method_23318() - 0.1d;
        double z = this.mc.field_1724.method_23321();
        boolean onEdge = isAir(x + 0.29d, y, z + 0.29d) || isAir(x - 0.29d, y, z + 0.29d) || isAir(x + 0.29d, y, z - 0.29d) || isAir(x - 0.29d, y, z - 0.29d);
        this.mc.field_1690.field_1832.method_23481(onEdge);
    }

    private boolean isAir(double x, double y, double z) {
        class_2338 pos = new class_2338((int) Math.floor(x), (int) Math.floor(y), (int) Math.floor(z));
        return this.mc.field_1687.method_8320(pos).method_26204() == class_2246.field_10124;
    }
}
