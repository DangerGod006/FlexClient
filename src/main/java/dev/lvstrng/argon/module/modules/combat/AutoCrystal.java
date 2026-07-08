package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.ItemUseListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.KeybindSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.BlockUtils;
import dev.lvstrng.argon.utils.CrystalUtils;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.InventoryUtils;
import dev.lvstrng.argon.utils.KeyUtils;
import dev.lvstrng.argon.utils.MathUtils;
import dev.lvstrng.argon.utils.MouseSimulation;
import dev.lvstrng.argon.utils.WorldUtils;
import net.minecraft.class_1268;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1621;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AutoCrystal.class */
public final class AutoCrystal extends Module implements TickListener, ItemUseListener {
    private final KeybindSetting activateKey;
    private final NumberSetting placeDelay;
    private final NumberSetting breakDelay;
    private final NumberSetting placeChance;
    private final NumberSetting breakChance;
    private final BooleanSetting stopOnKill;
    private final BooleanSetting fakePunch;
    private final BooleanSetting clickSimulation;
    private final BooleanSetting damageTick;
    private final BooleanSetting antiWeakness;
    private final NumberSetting particleChance;
    private int placeClock;
    private int breakClock;
    public boolean crystalling;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !AutoCrystal.class.desiredAssertionStatus();
    }

    public AutoCrystal() {
        super(EncryptedString.of("Auto Crystal"), EncryptedString.of("Automatically crystals fast for you"), -1, Category.COMBAT);
        this.activateKey = new KeybindSetting(EncryptedString.of("Activate Key"), 1, false).setDescription(EncryptedString.of("Key that does the crystalling"));
        this.placeDelay = new NumberSetting(EncryptedString.of("Place Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.breakDelay = new NumberSetting(EncryptedString.of("Break Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.placeChance = new NumberSetting(EncryptedString.of("Place Chance"), 0.0d, 100.0d, 100.0d, 1.0d).setDescription(EncryptedString.of("Randomization"));
        this.breakChance = new NumberSetting(EncryptedString.of("Break Chance"), 0.0d, 100.0d, 100.0d, 1.0d).setDescription(EncryptedString.of("Randomization"));
        this.stopOnKill = new BooleanSetting(EncryptedString.of("Stop on Kill"), false).setDescription(EncryptedString.of("Won't crystal if a dead player is nearby"));
        this.fakePunch = new BooleanSetting(EncryptedString.of("Fake Punch"), false).setDescription(EncryptedString.of("Will hit every entity and block if you miss a hitcrystal"));
        this.clickSimulation = new BooleanSetting(EncryptedString.of("Click Simulation"), false).setDescription(EncryptedString.of("Makes the CPS hud think you're legit"));
        this.damageTick = new BooleanSetting(EncryptedString.of("Damage Tick"), false).setDescription(EncryptedString.of("Times your crystals for a perfect d-tap"));
        this.antiWeakness = new BooleanSetting(EncryptedString.of("Anti-Weakness"), false).setDescription(EncryptedString.of("Silently switches to a sword and then hits the crystal if you have weakness"));
        this.particleChance = new NumberSetting(EncryptedString.of("Particle Chance"), 0.0d, 100.0d, 20.0d, 1.0d).setDescription(EncryptedString.of("Adds block breaking particles to make it seem more legit from your POV (Only works with fake punch)"));
        addSettings(this.activateKey, this.placeDelay, this.breakDelay, this.placeChance, this.breakChance, this.stopOnKill, this.fakePunch, this.clickSimulation, this.damageTick, this.antiWeakness, this.particleChance);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.eventManager.add(ItemUseListener.class, this);
        this.placeClock = 0;
        this.breakClock = 0;
        this.crystalling = false;
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
        boolean dontPlace = this.placeClock != 0;
        boolean dontBreak = this.breakClock != 0;
        if (this.stopOnKill.getValue() && WorldUtils.isDeadBodyNearby()) {
            return;
        }
        int randomInt = MathUtils.randomInt(1, 100);
        if (dontPlace) {
            this.placeClock--;
        }
        if (dontBreak) {
            this.breakClock--;
        }
        if (this.mc.field_1724.method_6115()) {
            return;
        }
        if (this.damageTick.getValue() && damageTickCheck()) {
            return;
        }
        if (this.activateKey.getKey() != -1 && !KeyUtils.isKeyPressed(this.activateKey.getKey())) {
            this.placeClock = 0;
            this.breakClock = 0;
            this.crystalling = false;
            return;
        }
        this.crystalling = true;
        if (this.mc.field_1724.method_6047().method_7909() != class_1802.field_8301) {
            return;
        }
        class_3965 class_3965Var = this.mc.field_1765;
        if (class_3965Var instanceof class_3965) {
            class_3965 hit = class_3965Var;
            if (this.mc.field_1765.method_17783() == class_239.class_240.field_1332) {
                if (!dontPlace && randomInt <= this.placeChance.getValueInt() && (BlockUtils.isBlock(hit.method_17777(), class_2246.field_10540) || (BlockUtils.isBlock(hit.method_17777(), class_2246.field_9987) && CrystalUtils.canPlaceCrystalClientAssumeObsidian(hit.method_17777())))) {
                    if (this.clickSimulation.getValue()) {
                        MouseSimulation.mouseClick(1);
                    }
                    WorldUtils.placeBlock(hit, true);
                    if (this.fakePunch.getValue() && randomInt <= this.particleChance.getValue() && CrystalUtils.canPlaceCrystalClientAssumeObsidian(hit.method_17777()) && hit.method_17780() == class_2350.field_11036) {
                        this.mc.field_1724.method_6104(class_1268.field_5808);
                    }
                    this.placeClock = this.placeDelay.getValueInt();
                }
                if (this.fakePunch.getValue()) {
                    if (!dontBreak && randomInt <= this.breakChance.getValueInt()) {
                        if (BlockUtils.isBlock(hit.method_17777(), class_2246.field_10540) || BlockUtils.isBlock(hit.method_17777(), class_2246.field_9987)) {
                            return;
                        }
                        if (this.clickSimulation.getValue() && ((!BlockUtils.isBlock(hit.method_17777(), class_2246.field_10540) && !BlockUtils.isBlock(hit.method_17777(), class_2246.field_9987)) || CrystalUtils.canPlaceCrystalClientAssumeObsidian(hit.method_17777()))) {
                            MouseSimulation.mouseClick(0);
                        }
                        this.mc.field_1761.method_2910(hit.method_17777(), hit.method_17780());
                        this.mc.field_1724.method_6104(class_1268.field_5808);
                        this.mc.field_1761.method_2902(hit.method_17777(), hit.method_17780());
                        this.breakClock = this.breakDelay.getValueInt();
                    }
                    if (!dontPlace && randomInt <= this.placeChance.getValueInt() && dontBreak && this.clickSimulation.getValue()) {
                        MouseSimulation.mouseClick(1);
                    }
                }
            }
            if (this.mc.field_1765.method_17783() == class_239.class_240.field_1333 && this.fakePunch.getValue()) {
                if (!dontBreak && randomInt <= this.breakChance.getValueInt()) {
                    if (this.mc.field_1761.method_2924()) {
                        this.mc.field_1771 = 10;
                    }
                    if (this.clickSimulation.getValue()) {
                        MouseSimulation.mouseClick(0);
                    }
                    this.mc.field_1724.method_6104(class_1268.field_5808);
                    this.breakClock = this.breakDelay.getValueInt();
                }
                if (!dontPlace && randomInt <= this.placeChance.getValueInt() && dontBreak && this.clickSimulation.getValue()) {
                    MouseSimulation.mouseClick(1);
                }
            }
        }
        int randomInt2 = MathUtils.randomInt(1, 100);
        class_3966 class_3966Var = this.mc.field_1765;
        if (class_3966Var instanceof class_3966) {
            class_3966 hit2 = class_3966Var;
            if (!dontBreak && randomInt2 <= this.breakChance.getValueInt()) {
                class_1297 entity = hit2.method_17782();
                if (!this.fakePunch.getValue() && !(entity instanceof class_1511) && !(entity instanceof class_1621)) {
                    return;
                }
                int previousSlot = this.mc.field_1724.method_31548().method_67532();
                if (((entity instanceof class_1511) || (entity instanceof class_1621)) && this.antiWeakness.getValue() && cantBreakCrystal()) {
                    InventoryUtils.selectSword();
                }
                if (this.clickSimulation.getValue()) {
                    MouseSimulation.mouseClick(0);
                }
                WorldUtils.hitEntity(entity, true);
                this.breakClock = this.breakDelay.getValueInt();
                if (this.antiWeakness.getValue()) {
                    InventoryUtils.setInvSlot(previousSlot);
                }
            }
        }
    }

    @Override // dev.lvstrng.argon.event.events.ItemUseListener
    public void onItemUse(ItemUseListener.ItemUseEvent event) {
        if (this.mc.field_1724.method_6047().method_7909() == class_1802.field_8301) {
            class_3965 class_3965Var = this.mc.field_1765;
            if (class_3965Var instanceof class_3965) {
                class_3965 h = class_3965Var;
                if (this.mc.field_1765.method_17783() == class_239.class_240.field_1332) {
                    if (BlockUtils.isBlock(h.method_17777(), class_2246.field_10540) || BlockUtils.isBlock(h.method_17777(), class_2246.field_9987)) {
                        event.cancel();
                    }
                }
            }
        }
    }

    private boolean cantBreakCrystal() {
        if (!$assertionsDisabled && this.mc.field_1724 == null) {
            throw new AssertionError();
        }
        class_1293 weakness = this.mc.field_1724.method_6112(class_1294.field_5911);
        class_1293 strength = this.mc.field_1724.method_6112(class_1294.field_5910);
        return weakness != null && (strength == null || strength.method_5578() <= weakness.method_5578()) && !WorldUtils.isTool(this.mc.field_1724.method_6047());
    }

    private boolean damageTickCheck() {
        return this.mc.field_1687.method_18456().parallelStream().filter(e -> {
            return e != this.mc.field_1724;
        }).filter(e2 -> {
            return e2.method_5858(this.mc.field_1724) < 36.0d;
        }).filter(e3 -> {
            return e3.method_49107() == null;
        }).filter(e4 -> {
            return !e4.method_24828();
        }).anyMatch(e5 -> {
            return e5.field_6235 >= 2;
        }) && !(this.mc.field_1724.method_6052() instanceof class_1657);
    }
}
