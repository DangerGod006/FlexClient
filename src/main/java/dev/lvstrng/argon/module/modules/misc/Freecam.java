package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.CameraUpdateListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/Freecam.class */
public final class Freecam extends Module implements TickListener, CameraUpdateListener {
    private final NumberSetting speed;
    public class_243 oldPos;
    public class_243 pos;

    public Freecam() {
        super(EncryptedString.of("Freecam"), EncryptedString.of("Lets you move freely around the world without actually moving"), -1, Category.MISC);
        this.speed = new NumberSetting(EncryptedString.of("Speed"), 1.0d, 10.0d, 1.0d, 1.0d);
        addSettings(this.speed);
        this.oldPos = class_243.field_1353;
        this.pos = class_243.field_1353;
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.eventManager.add(CameraUpdateListener.class, this);
        if (this.mc.field_1687 != null) {
            class_243 class_243VarMethod_33571 = this.mc.field_1724.method_33571();
            this.pos = class_243VarMethod_33571;
            this.oldPos = class_243VarMethod_33571;
        }
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        this.eventManager.remove(CameraUpdateListener.class, this);
        if (this.mc.field_1687 != null) {
            this.mc.field_1724.method_18799(class_243.field_1353);
            this.mc.field_1769.method_3279();
        }
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (this.mc.field_1755 != null) {
            return;
        }
        this.mc.field_1690.field_1904.method_23481(false);
        this.mc.field_1690.field_1886.method_23481(false);
        this.mc.field_1690.field_1894.method_23481(false);
        this.mc.field_1690.field_1881.method_23481(false);
        this.mc.field_1690.field_1913.method_23481(false);
        this.mc.field_1690.field_1849.method_23481(false);
        this.mc.field_1690.field_1903.method_23481(false);
        this.mc.field_1690.field_1832.method_23481(false);
        class_243 vec3d = new class_243(-class_3532.method_15374(((-this.mc.field_1724.method_36454()) * 0.017453292f) - 3.1415927f), 0.0d, -class_3532.method_15362(((-this.mc.field_1724.method_36454()) * 0.017453292f) - 3.1415927f));
        class_243 vec3d2 = new class_243(0.0d, 1.0d, 0.0d);
        class_243 vec3d3 = vec3d2.method_1036(vec3d);
        class_243 vec3d4 = vec3d.method_1036(vec3d2);
        class_243 vec3d5 = class_243.field_1353;
        if (GLFW.glfwGetKey(this.mc.method_22683().method_4490(), this.mc.field_1690.field_1894.getBoundKey().method_1444()) == 1) {
            vec3d5 = vec3d5.method_1019(vec3d);
        }
        if (GLFW.glfwGetKey(this.mc.method_22683().method_4490(), this.mc.field_1690.field_1881.getBoundKey().method_1444()) == 1) {
            vec3d5 = vec3d5.method_1020(vec3d);
        }
        if (GLFW.glfwGetKey(this.mc.method_22683().method_4490(), this.mc.field_1690.field_1913.getBoundKey().method_1444()) == 1) {
            vec3d5 = vec3d5.method_1019(vec3d3);
        }
        if (GLFW.glfwGetKey(this.mc.method_22683().method_4490(), this.mc.field_1690.field_1849.getBoundKey().method_1444()) == 1) {
            vec3d5 = vec3d5.method_1019(vec3d4);
        }
        if (GLFW.glfwGetKey(this.mc.method_22683().method_4490(), this.mc.field_1690.field_1903.getBoundKey().method_1444()) == 1) {
            vec3d5 = vec3d5.method_1031(0.0d, this.speed.getValue(), 0.0d);
        }
        if (GLFW.glfwGetKey(this.mc.method_22683().method_4490(), this.mc.field_1690.field_1832.getBoundKey().method_1444()) == 1) {
            vec3d5 = vec3d5.method_1031(0.0d, -this.speed.getValue(), 0.0d);
        }
        class_243 vec3d52 = vec3d5.method_1029().method_1021(this.speed.getValue() * ((double) (GLFW.glfwGetKey(this.mc.method_22683().method_4490(), this.mc.field_1690.field_1867.getBoundKey().method_1444()) == 1 ? 2 : 1)));
        this.oldPos = this.pos;
        this.pos = this.pos.method_1019(vec3d52);
    }

    @Override // dev.lvstrng.argon.event.events.CameraUpdateListener
    public void onCameraUpdate(CameraUpdateListener.CameraUpdateEvent event) {
        float tickDelta = this.mc.method_61966().method_60637(true);
        if (this.mc.field_1755 != null) {
            return;
        }
        event.setX(class_3532.method_16436(tickDelta, this.oldPos.field_1352, this.pos.field_1352));
        event.setY(class_3532.method_16436(tickDelta, this.oldPos.field_1351, this.pos.field_1351));
        event.setZ(class_3532.method_16436(tickDelta, this.oldPos.field_1350, this.pos.field_1350));
    }
}
