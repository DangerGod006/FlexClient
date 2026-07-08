package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.event.events.ItemUseListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.MouseSimulation;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/FastPlace.class */
public final class FastPlace extends Module implements TickListener, ItemUseListener {
    private final NumberSetting speed;
    private final BooleanSetting blockOnly;
    private final BooleanSetting excludeCobweb;
    private final BooleanSetting excludeAnchor;
    private final BooleanSetting excludeGlowstone;
    private final BooleanSetting excludeCrystal;
    private final BooleanSetting excludeObsidian;
    private final BooleanSetting clickSimulation;
    private int clock;

    public FastPlace() {
        super(EncryptedString.of("Fast Place"), EncryptedString.of("Removes the right-click cooldown between block placements"), -1, Category.MISC);
        this.speed = new NumberSetting(EncryptedString.of("Speed"), 0.0d, 100.0d, 0.0d, 1.0d).setDescription(EncryptedString.of("0 = instant, 100 = vanilla speed"));
        this.blockOnly = new BooleanSetting(EncryptedString.of("Block Only"), false).setDescription(EncryptedString.of("Only fast place solid BlockItems. Buckets, trapdoors, frames etc. unaffected when ON"));
        this.excludeCobweb = new BooleanSetting(EncryptedString.of("Exclude Cobweb"), true).setDescription(EncryptedString.of("Don't fast place cobweb items from hotbar"));
        this.excludeAnchor = new BooleanSetting(EncryptedString.of("Exclude Anchor"), true).setDescription(EncryptedString.of("Don't fast place respawn anchor items from hotbar"));
        this.excludeGlowstone = new BooleanSetting(EncryptedString.of("Exclude Glowstone"), true).setDescription(EncryptedString.of("Don't fast place glowstone items from hotbar"));
        this.excludeCrystal = new BooleanSetting(EncryptedString.of("Exclude Crystal"), true).setDescription(EncryptedString.of("Don't fast place end crystals from hotbar"));
        this.excludeObsidian = new BooleanSetting(EncryptedString.of("Exclude Obsidian"), false).setDescription(EncryptedString.of("Don't fast place obsidian from hotbar"));
        this.clickSimulation = new BooleanSetting(EncryptedString.of("Click Simulation"), false).setDescription(EncryptedString.of("Simulates a real right-click so CPS counter sees it as legit"));
        this.clock = 0;
        addSettings(this.speed, this.blockOnly, this.excludeCobweb, this.excludeAnchor, this.excludeGlowstone, this.excludeCrystal, this.excludeObsidian, this.clickSimulation);
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
        if (this.mc.field_1724 == null || this.mc.field_1687 == null) {
            return;
        }
        if (this.mc.field_1755 != null) {
            if (this.mc.field_1724.method_6115()) {
                class_1799 class_1799VarMethod_6030 = this.mc.field_1724.method_6030();
                if (!class_1799.method_24752(class_1799VarMethod_6030) && class_1799VarMethod_6030.method_7909() == class_1802.field_8255) {
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 1) != 1) {
            return;
        }
        class_3965 class_3965Var = this.mc.field_1765;
        if (class_3965Var instanceof class_3965) {
            class_3965 hit = class_3965Var;
            if (hit.method_17783() != class_239.class_240.field_1332) {
                return;
            }
            if (this.excludeCobweb.getValue() && (this.mc.field_1724.method_6047().method_31574(class_1802.field_8786) || this.mc.field_1724.method_6079().method_31574(class_1802.field_8786))) {
                return;
            }
            if (this.excludeAnchor.getValue() && (this.mc.field_1724.method_6047().method_31574(class_1802.field_23141) || this.mc.field_1724.method_6079().method_31574(class_1802.field_23141))) {
                return;
            }
            if (this.excludeGlowstone.getValue() && (this.mc.field_1724.method_6047().method_31574(class_1802.field_8801) || this.mc.field_1724.method_6079().method_31574(class_1802.field_8801))) {
                return;
            }
            if (this.excludeCrystal.getValue() && (this.mc.field_1724.method_6047().method_31574(class_1802.field_8301) || this.mc.field_1724.method_6079().method_31574(class_1802.field_8301))) {
                return;
            }
            if (this.excludeObsidian.getValue() && (this.mc.field_1724.method_6047().method_31574(class_1802.field_8281) || this.mc.field_1724.method_6079().method_31574(class_1802.field_8281))) {
                return;
            }
            if (this.blockOnly.getValue()) {
                boolean mainIsBlock = this.mc.field_1724.method_6047().method_7909() instanceof class_1747;
                boolean offIsBlock = this.mc.field_1724.method_6079().method_7909() instanceof class_1747;
                if (!mainIsBlock && !offIsBlock) {
                    return;
                }
            }
            boolean dontPlace = this.clock != 0;
            if (dontPlace) {
                this.clock--;
                return;
            }
            if (this.clickSimulation.getValue()) {
                MouseSimulation.mouseClick(1);
            }
            class_1268 hand = this.mc.field_1724.method_6047().method_7909() instanceof class_1747 ? class_1268.field_5808 : class_1268.field_5810;
            class_1269 result = this.mc.field_1761.method_2896(this.mc.field_1724, hand, hit);
            if (result.method_23665()) {
                this.mc.field_1724.method_6104(hand);
            }
            this.clock = (int) Math.round((this.speed.getValue() * 4.0d) / 100.0d);
        }
    }

    @Override // dev.lvstrng.argon.event.events.ItemUseListener
    public void onItemUse(ItemUseListener.ItemUseEvent event) {
        if (this.mc.field_1724 == null || this.mc.field_1687 == null) {
            return;
        }
        class_3965 class_3965Var = this.mc.field_1765;
        if (class_3965Var instanceof class_3965) {
            class_3965 hit = class_3965Var;
            if (hit.method_17783() != class_239.class_240.field_1332) {
                return;
            }
            if (this.excludeCobweb.getValue() && (this.mc.field_1724.method_6047().method_31574(class_1802.field_8786) || this.mc.field_1724.method_6079().method_31574(class_1802.field_8786))) {
                return;
            }
            if (this.excludeAnchor.getValue() && (this.mc.field_1724.method_6047().method_31574(class_1802.field_23141) || this.mc.field_1724.method_6079().method_31574(class_1802.field_23141))) {
                return;
            }
            if (this.excludeGlowstone.getValue() && (this.mc.field_1724.method_6047().method_31574(class_1802.field_8801) || this.mc.field_1724.method_6079().method_31574(class_1802.field_8801))) {
                return;
            }
            if (this.excludeCrystal.getValue() && (this.mc.field_1724.method_6047().method_31574(class_1802.field_8301) || this.mc.field_1724.method_6079().method_31574(class_1802.field_8301))) {
                return;
            }
            if (this.excludeObsidian.getValue() && (this.mc.field_1724.method_6047().method_31574(class_1802.field_8281) || this.mc.field_1724.method_6079().method_31574(class_1802.field_8281))) {
                return;
            }
            if (this.blockOnly.getValue()) {
                boolean mainIsBlock = this.mc.field_1724.method_6047().method_7909() instanceof class_1747;
                boolean offIsBlock = this.mc.field_1724.method_6079().method_7909() instanceof class_1747;
                if (!mainIsBlock && !offIsBlock) {
                    return;
                }
            }
            event.cancel();
        }
    }
}
