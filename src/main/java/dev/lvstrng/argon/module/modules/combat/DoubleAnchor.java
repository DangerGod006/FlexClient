package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.utils.BlockUtils;
import dev.lvstrng.argon.utils.EncryptedString;
import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2885;
import net.minecraft.class_3965;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/DoubleAnchor.class */
public final class DoubleAnchor extends Module implements TickListener {
    private class_2338 pos;
    private int count;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !DoubleAnchor.class.desiredAssertionStatus();
    }

    public DoubleAnchor() {
        super(EncryptedString.of("Double Anchor"), EncryptedString.of("Helps you do the air place/double anchor"), -1, Category.COMBAT);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.pos = null;
        this.count = 0;
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1755 == null) {
            if (!$assertionsDisabled && this.mc.field_1724 == null) {
                throw new AssertionError();
            }
            if (this.mc.field_1724.method_6047().method_31574(class_1802.field_23141)) {
                if (!$assertionsDisabled && this.mc.field_1687 == null) {
                    throw new AssertionError();
                }
                class_3965 class_3965Var = this.mc.field_1765;
                if (class_3965Var instanceof class_3965) {
                    class_3965 h = class_3965Var;
                    if (BlockUtils.isAnchorCharged(h.method_17777()) && GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 1) == 1) {
                        if (h.method_17777().equals(this.pos)) {
                            if (this.count >= 1) {
                                return;
                            }
                        } else {
                            this.pos = h.method_17777();
                            this.count = 0;
                        }
                        this.mc.method_1562().method_52787(new class_2885(class_1268.field_5808, h, 0));
                        this.count++;
                    }
                }
            }
        }
    }
}
