package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.HudListener;
import dev.lvstrng.argon.event.events.PacketSendListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.MinMaxSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.TimerUtils;
import net.minecraft.class_1268;
import net.minecraft.class_243;
import net.minecraft.class_2824;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AutoWTap.class */
public final class AutoWTap extends Module implements PacketSendListener, HudListener {
    private final MinMaxSetting delay;
    private final BooleanSetting inAir;
    private final TimerUtils sprintTimer;
    private final TimerUtils tapTimer;
    private boolean holdingForward;
    private boolean sprinting;
    private int currentDelay;
    private boolean jumpedWhileHitting;

    public AutoWTap() {
        super(EncryptedString.of("Auto WTap"), EncryptedString.of("Automatically W Taps for you so the opponent takes more knockback"), -1, Category.COMBAT);
        this.delay = new MinMaxSetting(EncryptedString.of("Delay"), 0.0d, 1000.0d, 1.0d, 230.0d, 270.0d);
        this.inAir = new BooleanSetting(EncryptedString.of("In Air"), false).setDescription(EncryptedString.of("Whether it should W tap in air"));
        this.sprintTimer = new TimerUtils();
        this.tapTimer = new TimerUtils();
        addSettings(this.delay, this.inAir);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(PacketSendListener.class, this);
        this.eventManager.add(HudListener.class, this);
        this.currentDelay = this.delay.getRandomValueInt();
        this.jumpedWhileHitting = false;
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(PacketSendListener.class, this);
        this.eventManager.remove(HudListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.HudListener
    public void onRenderHud(HudListener.HudEvent event) {
        if (GLFW.glfwGetKey(this.mc.method_22683().method_4490(), 87) != 1) {
            this.sprinting = false;
            this.holdingForward = false;
            return;
        }
        if (!this.inAir.getValue() && !this.mc.field_1724.method_24828()) {
            return;
        }
        if (this.mc.field_1724.method_24828()) {
            this.jumpedWhileHitting = false;
        }
        if (GLFW.glfwGetKey(this.mc.method_22683().method_4490(), 32) == 1 && !this.inAir.getValue() && (this.holdingForward || this.sprinting)) {
            this.mc.field_1690.field_1894.method_23481(true);
            this.holdingForward = false;
            this.sprinting = false;
            return;
        }
        if (this.holdingForward && this.tapTimer.delay(1.0f)) {
            this.mc.field_1690.field_1894.method_23481(false);
            this.sprintTimer.reset();
            this.sprinting = true;
            this.holdingForward = false;
        }
        if (this.sprinting && this.sprintTimer.delay(this.currentDelay)) {
            this.mc.field_1690.field_1894.method_23481(true);
            this.sprinting = false;
            this.currentDelay = this.delay.getRandomValueInt();
        }
    }

    @Override // dev.lvstrng.argon.event.events.PacketSendListener
    public void onPacketSend(PacketSendListener.PacketSendEvent event) {
        class_2824 class_2824Var = event.packet;
        if (!(class_2824Var instanceof class_2824)) {
            return;
        }
        class_2824 packet = class_2824Var;
        packet.method_34209(new class_2824.class_5908() { // from class: dev.lvstrng.argon.module.modules.combat.AutoWTap.1
            public void method_34219(class_1268 hand) {
            }

            public void method_34220(class_1268 hand, class_243 pos) {
            }

            public void method_34218() {
                if (GLFW.glfwGetKey(AutoWTap.this.mc.method_22683().method_4490(), 32) == 1 && !AutoWTap.this.inAir.getValue()) {
                    AutoWTap.this.jumpedWhileHitting = true;
                }
                if ((AutoWTap.this.inAir.getValue() || AutoWTap.this.mc.field_1724.method_24828()) && !AutoWTap.this.jumpedWhileHitting && AutoWTap.this.mc.field_1690.field_1894.method_1434() && AutoWTap.this.mc.field_1724.method_5624()) {
                    AutoWTap.this.sprintTimer.reset();
                    AutoWTap.this.holdingForward = true;
                }
            }
        });
    }
}
