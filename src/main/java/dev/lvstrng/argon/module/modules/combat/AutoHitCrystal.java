package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.event.events.AttackListener;
import dev.lvstrng.argon.event.events.ItemUseListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.KeybindSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.BlockUtils;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.InventoryUtils;
import dev.lvstrng.argon.utils.KeyUtils;
import dev.lvstrng.argon.utils.MathUtils;
import dev.lvstrng.argon.utils.MouseSimulation;
import dev.lvstrng.argon.utils.WorldUtils;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AutoHitCrystal.class */
public final class AutoHitCrystal extends Module implements TickListener, ItemUseListener, AttackListener {
    private final KeybindSetting activateKey;
    private final BooleanSetting checkPlace;
    private final NumberSetting switchDelay;
    private final NumberSetting switchChance;
    private final NumberSetting placeDelay;
    private final NumberSetting placeChance;
    private final BooleanSetting workWithTotem;
    private final BooleanSetting workWithCrystal;
    private final BooleanSetting clickSimulation;
    private final BooleanSetting swordSwap;
    private int placeClock;
    private int switchClock;
    private boolean active;
    private boolean crystalling;
    private boolean crystalSelected;

    public AutoHitCrystal() {
        super(EncryptedString.of("Auto Hit Crystal"), EncryptedString.of("Automatically hit-crystals for you"), -1, Category.COMBAT);
        this.activateKey = new KeybindSetting(EncryptedString.of("Activate Key"), 1, false).setDescription(EncryptedString.of("Key that does hit crystalling"));
        this.checkPlace = new BooleanSetting(EncryptedString.of("Check Place"), false).setDescription(EncryptedString.of("Checks if you can place the obsidian on that block"));
        this.switchDelay = new NumberSetting(EncryptedString.of("Switch Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.switchChance = new NumberSetting(EncryptedString.of("Switch Chance"), 0.0d, 100.0d, 100.0d, 1.0d);
        this.placeDelay = new NumberSetting(EncryptedString.of("Place Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.placeChance = new NumberSetting(EncryptedString.of("Place Chance"), 0.0d, 100.0d, 100.0d, 1.0d).setDescription(EncryptedString.of("Randomization"));
        this.workWithTotem = new BooleanSetting(EncryptedString.of("Work With Totem"), false);
        this.workWithCrystal = new BooleanSetting(EncryptedString.of("Work With Crystal"), false);
        this.clickSimulation = new BooleanSetting(EncryptedString.of("Click Simulation"), false).setDescription(EncryptedString.of("Makes the CPS hud think you're legit"));
        this.swordSwap = new BooleanSetting(EncryptedString.of("Sword Swap"), true);
        this.placeClock = 0;
        this.switchClock = 0;
        addSettings(this.activateKey, this.checkPlace, this.switchDelay, this.switchChance, this.placeDelay, this.placeChance, this.workWithTotem, this.workWithCrystal, this.clickSimulation, this.swordSwap);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.eventManager.add(ItemUseListener.class, this);
        this.eventManager.add(AttackListener.class, this);
        reset();
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        this.eventManager.remove(ItemUseListener.class, this);
        this.eventManager.remove(AttackListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        int randomNum = MathUtils.randomInt(1, 100);
        if (this.mc.field_1755 != null) {
            return;
        }
        if (KeyUtils.isKeyPressed(this.activateKey.getKey())) {
            class_3965 class_3965Var = this.mc.field_1765;
            if (class_3965Var instanceof class_3965) {
                class_3965 hitResult = class_3965Var;
                if (this.mc.field_1765.method_17783() == class_239.class_240.field_1332 && !this.active && !BlockUtils.canPlaceBlockClient(hitResult.method_17777()) && this.checkPlace.getValue()) {
                    return;
                }
            }
            class_1799 mainHandStack = this.mc.field_1724.method_6047();
            if (!WorldUtils.isSword(mainHandStack) && ((!this.workWithTotem.getValue() || !mainHandStack.method_31574(class_1802.field_8288)) && ((!this.workWithCrystal.getValue() || !mainHandStack.method_31574(class_1802.field_8301)) && !this.active))) {
                return;
            }
            class_3965 class_3965Var2 = this.mc.field_1765;
            if (class_3965Var2 instanceof class_3965) {
                class_3965 hitResult2 = class_3965Var2;
                if (!this.active && this.swordSwap.getValue() && this.mc.field_1765.method_17783() == class_239.class_240.field_1332) {
                    class_2248 block = this.mc.field_1687.method_8320(hitResult2.method_17777()).method_26204();
                    this.crystalling = block == class_2246.field_10540 || block == class_2246.field_9987;
                }
            }
            this.active = true;
            if (!this.crystalling) {
                class_3965 class_3965Var3 = this.mc.field_1765;
                if (class_3965Var3 instanceof class_3965) {
                    class_3965 hit = class_3965Var3;
                    if (hit.method_17783() == class_239.class_240.field_1333) {
                        return;
                    }
                    if (!BlockUtils.isBlock(hit.method_17777(), class_2246.field_10540)) {
                        if (BlockUtils.isBlock(hit.method_17777(), class_2246.field_23152) && BlockUtils.isAnchorCharged(hit.method_17777())) {
                            return;
                        }
                        this.mc.field_1690.field_1904.method_23481(false);
                        if (!this.mc.field_1724.method_24518(class_1802.field_8281)) {
                            if (this.switchClock > 0) {
                                this.switchClock--;
                                return;
                            } else if (randomNum <= this.switchChance.getValueInt()) {
                                this.switchClock = this.switchDelay.getValueInt();
                                InventoryUtils.selectItemFromHotbar(class_1802.field_8281);
                            }
                        }
                        if (this.mc.field_1724.method_24518(class_1802.field_8281)) {
                            if (this.placeClock > 0) {
                                this.placeClock--;
                                return;
                            }
                            if (this.clickSimulation.getValue()) {
                                MouseSimulation.mouseClick(1);
                            }
                            int randomNum2 = MathUtils.randomInt(1, 100);
                            if (randomNum2 <= this.placeChance.getValueInt()) {
                                WorldUtils.placeBlock(hit, true);
                                this.placeClock = this.placeDelay.getValueInt();
                                this.crystalling = true;
                            }
                        }
                    }
                }
            }
            if (this.crystalling) {
                if (!this.mc.field_1724.method_24518(class_1802.field_8301) && !this.crystalSelected) {
                    if (this.switchClock > 0) {
                        this.switchClock--;
                        return;
                    }
                    int randomNum3 = MathUtils.randomInt(1, 100);
                    if (randomNum3 <= this.switchChance.getValueInt()) {
                        this.crystalSelected = InventoryUtils.selectItemFromHotbar(class_1802.field_8301);
                        this.switchClock = this.switchDelay.getValueInt();
                    }
                }
                if (this.mc.field_1724.method_24518(class_1802.field_8301)) {
                    AutoCrystal autoCrystal = (AutoCrystal) Argon.INSTANCE.getModuleManager().getModule(AutoCrystal.class);
                    if (!autoCrystal.isEnabled()) {
                        autoCrystal.onTick();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        reset();
    }

    @Override // dev.lvstrng.argon.event.events.ItemUseListener
    public void onItemUse(ItemUseListener.ItemUseEvent event) {
        class_1799 mainHandStack = this.mc.field_1724.method_6047();
        if ((mainHandStack.method_31574(class_1802.field_8301) || mainHandStack.method_31574(class_1802.field_8281)) && GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 1) != 1) {
            event.cancel();
        }
    }

    public void reset() {
        this.placeClock = this.placeDelay.getValueInt();
        this.switchClock = this.switchDelay.getValueInt();
        this.active = false;
        this.crystalling = false;
        this.crystalSelected = false;
    }

    @Override // dev.lvstrng.argon.event.events.AttackListener
    public void onAttack(AttackListener.AttackEvent event) {
        if (this.mc.field_1724.method_6047().method_31574(class_1802.field_8301) && GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 0) != 1) {
            event.cancel();
        }
    }
}
