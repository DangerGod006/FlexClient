package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.AttackListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.InventoryUtils;
import dev.lvstrng.argon.utils.MouseSimulation;
import dev.lvstrng.argon.utils.WorldUtils;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1802;
import net.minecraft.class_3966;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/ShieldDisabler.class */
public final class ShieldDisabler extends Module implements TickListener, AttackListener {
    private final NumberSetting hitDelay;
    private final NumberSetting switchDelay;
    private final BooleanSetting switchBack;
    private final BooleanSetting stun;
    private final NumberSetting stunTiming;
    private final BooleanSetting clickSimulate;
    private final BooleanSetting requireHoldAxe;
    public static boolean isStunning = false;
    int previousSlot;
    int hitClock;
    int switchClock;
    int stunClock;
    private boolean didMainHit;

    public ShieldDisabler() {
        super(EncryptedString.of("Shield Disabler"), EncryptedString.of("Automatically disables your opponents shield"), -1, Category.COMBAT);
        this.hitDelay = new NumberSetting(EncryptedString.of("Hit Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.switchDelay = new NumberSetting(EncryptedString.of("Switch Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.switchBack = new BooleanSetting(EncryptedString.of("Switch Back"), true);
        this.stun = new BooleanSetting(EncryptedString.of("Stun"), false);
        this.stunTiming = new NumberSetting(EncryptedString.of("Stun Timing"), 0.0d, 100.0d, 10.0d, 1.0d).setDescription(EncryptedString.of("Timing for stun hits (lower = faster)"));
        this.clickSimulate = new BooleanSetting(EncryptedString.of("Click Simulation"), false);
        this.requireHoldAxe = new BooleanSetting(EncryptedString.of("Hold Axe"), false);
        addSettings(this.switchDelay, this.hitDelay, this.switchBack, this.stun, this.stunTiming, this.clickSimulate, this.requireHoldAxe);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.eventManager.add(AttackListener.class, this);
        this.hitClock = this.hitDelay.getValueInt();
        this.switchClock = this.switchDelay.getValueInt();
        this.stunClock = 0;
        this.previousSlot = -1;
        isStunning = false;
        this.didMainHit = false;
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        this.eventManager.remove(AttackListener.class, this);
        isStunning = false;
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1755 != null) {
            return;
        }
        if (this.requireHoldAxe.getValue() && !(this.mc.field_1724.method_6047().method_7909() instanceof class_1743)) {
            return;
        }
        isStunning = false;
        class_3966 class_3966Var = this.mc.field_1765;
        if (class_3966Var instanceof class_3966) {
            class_3966 entityHit = class_3966Var;
            class_1657 class_1657VarMethod_17782 = entityHit.method_17782();
            if (!this.mc.field_1724.method_6115() && (class_1657VarMethod_17782 instanceof class_1657)) {
                class_1657 player = class_1657VarMethod_17782;
                if (WorldUtils.isShieldFacingAway(player)) {
                    return;
                }
                if (player.method_24518(class_1802.field_8255) && player.method_6039()) {
                    if (this.switchClock > 0) {
                        if (this.previousSlot == -1) {
                            this.previousSlot = this.mc.field_1724.method_31548().method_67532();
                        }
                        this.switchClock--;
                        return;
                    }
                    if (InventoryUtils.selectAxe()) {
                        this.mc.field_1761.syncSlot();
                        if (this.stun.getValue() && this.didMainHit) {
                            if (this.stunClock <= 0) {
                                isStunning = true;
                                if (this.clickSimulate.getValue()) {
                                    MouseSimulation.mouseClick(0);
                                }
                                WorldUtils.hitEntity(player, true);
                                this.stunClock = this.stunTiming.getValueInt();
                            } else {
                                this.stunClock--;
                            }
                            this.didMainHit = false;
                            return;
                        }
                        if (this.hitClock > 0) {
                            this.hitClock--;
                            return;
                        }
                        if (this.clickSimulate.getValue()) {
                            MouseSimulation.mouseClick(0);
                        }
                        WorldUtils.hitEntity(player, true);
                        this.didMainHit = true;
                        this.hitClock = this.hitDelay.getValueInt();
                        this.switchClock = this.switchDelay.getValueInt();
                        return;
                    }
                    return;
                }
                if (this.previousSlot != -1) {
                    if (this.switchBack.getValue()) {
                        InventoryUtils.setInvSlot(this.previousSlot);
                    }
                    this.previousSlot = -1;
                    this.stunClock = 0;
                    this.didMainHit = false;
                    isStunning = false;
                }
            }
        }
    }

    @Override // dev.lvstrng.argon.event.events.AttackListener
    public void onAttack(AttackListener.AttackEvent event) {
        if (GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 0) != 1 && this.hitClock > 0) {
            event.cancel();
        }
    }
}
