package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.utils.EncryptedString;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/NoJumpDelay.class */
public final class NoJumpDelay extends Module implements TickListener {
    public NoJumpDelay() {
        super(EncryptedString.of("No Jump Delay"), EncryptedString.of("Lets you jump faster, removing the delay"), -1, Category.MISC);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1755 != null || !this.mc.field_1724.method_24828() || GLFW.glfwGetKey(this.mc.method_22683().method_4490(), 32) != 1) {
            return;
        }
        this.mc.field_1690.field_1903.method_23481(false);
        this.mc.field_1724.method_6043();
    }
}
