package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.PlayerTickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import java.util.Comparator;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/MaceAssist.class */
public final class MaceAssist extends Module implements PlayerTickListener {
    private final NumberSetting activationHeight;
    private final NumberSetting targetRange;
    private final BooleanSetting attackMobs;
    private final BooleanSetting requireHoldMace;
    private final BooleanSetting requireClick;
    private boolean hasAttacked;

    public MaceAssist() {
        super(EncryptedString.of("Mace Assist"), EncryptedString.of("Automatically aims and times your mace smash attack"), -1, Category.COMBAT);
        this.activationHeight = new NumberSetting(EncryptedString.of("Activation Height"), 0.5d, 5.0d, 2.5d, 0.1d).setDescription(EncryptedString.of("Max distance to ground to trigger mace smash"));
        this.targetRange = new NumberSetting(EncryptedString.of("Target Range"), 3.0d, 15.0d, 8.0d, 0.5d).setDescription(EncryptedString.of("Max range to find a target"));
        this.attackMobs = new BooleanSetting(EncryptedString.of("Attack Mobs"), true).setDescription(EncryptedString.of("Also target mobs, not just players"));
        this.requireHoldMace = new BooleanSetting(EncryptedString.of("Require Mace"), true).setDescription(EncryptedString.of("Only activate when mace is in main hand"));
        this.requireClick = new BooleanSetting(EncryptedString.of("Require Click"), false).setDescription(EncryptedString.of("Only trigger when holding left click"));
        this.hasAttacked = false;
        addSettings(this.activationHeight, this.targetRange, this.attackMobs, this.requireHoldMace, this.requireClick);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(PlayerTickListener.class, this);
        this.hasAttacked = false;
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(PlayerTickListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.PlayerTickListener
    public void onPlayerTick() {
        class_1309 target;
        if (this.mc.field_1724 == null || this.mc.field_1687 == null) {
            return;
        }
        if (this.mc.field_1724.method_24828() || this.mc.field_1724.method_5799()) {
            this.hasAttacked = false;
            return;
        }
        if (this.hasAttacked) {
            return;
        }
        if ((!this.requireHoldMace.getValue() || this.mc.field_1724.method_6047().method_31574(class_1802.field_49814)) && this.mc.field_1724.method_18798().field_1351 < 0.0d) {
            if (!this.requireClick.getValue() || GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 0) == 1) {
                double distToGround = getDistanceToGround();
                if (distToGround < 0.0d || distToGround > this.activationHeight.getValue() || (target = findTarget()) == null) {
                    return;
                }
                rotateTowards(target);
                this.mc.field_1761.method_2918(this.mc.field_1724, target);
                this.mc.field_1724.method_6104(class_1268.field_5808);
                this.hasAttacked = true;
            }
        }
    }

    private class_1309 findTarget() {
        List<class_1309> entities;
        if (this.attackMobs.getValue()) {
            entities = this.mc.field_1687.method_8390(class_1309.class, this.mc.field_1724.method_5829().method_1014(this.targetRange.getValue()), this::isValid);
        } else {
            entities = this.mc.field_1687.method_8390(class_1657.class, this.mc.field_1724.method_5829().method_1014(this.targetRange.getValue()), (v1) -> {
                return isValid(v1);
            }).stream().map(e -> {
                return e;
            }).toList();
        }
        return entities.stream().min(Comparator.comparingDouble(e2 -> {
            return this.mc.field_1724.method_5858(e2);
        })).orElse(null);
    }

    private boolean isValid(class_1309 e) {
        if (e == this.mc.field_1724 || !e.method_5805() || e.method_7325() || this.mc.field_1724.method_5739(e) > this.targetRange.getValueFloat()) {
            return false;
        }
        if (!this.attackMobs.getValue() && !(e instanceof class_1657)) {
            return false;
        }
        if (!(e instanceof class_1657)) {
            return true;
        }
        class_1657 p = (class_1657) e;
        return (p.method_68878() || p.method_7325()) ? false : true;
    }

    private void rotateTowards(class_1309 target) {
        class_243 aimPos = target.method_73189().method_1031(0.0d, ((double) target.method_17682()) * 0.5d, 0.0d);
        class_243 camera = this.mc.field_1724.method_5836(1.0f);
        double dX = aimPos.field_1352 - camera.field_1352;
        double dY = aimPos.field_1351 - camera.field_1351;
        double dZ = aimPos.field_1350 - camera.field_1350;
        float yaw = ((float) Math.toDegrees(Math.atan2(dZ, dX))) - 90.0f;
        float pitch = (float) (-Math.toDegrees(Math.atan2(dY, Math.sqrt((dX * dX) + (dZ * dZ)))));
        this.mc.field_1724.method_36456(yaw);
        this.mc.field_1724.method_36457(class_3532.method_15363(pitch, -89.0f, 89.0f));
    }

    private double getDistanceToGround() {
        class_243 pos = this.mc.field_1724.method_73189();
        class_3965 hit = this.mc.field_1687.method_17742(new class_3959(pos, new class_243(pos.field_1352, pos.field_1351 - 256.0d, pos.field_1350), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, this.mc.field_1724));
        if (hit == null) {
            return -1.0d;
        }
        return pos.field_1351 - hit.method_17784().field_1351;
    }
}
