package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.event.events.AttackListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.modules.client.Friends;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.MinMaxSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.MouseSimulation;
import dev.lvstrng.argon.utils.TimerUtils;
import dev.lvstrng.argon.utils.WorldUtils;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1642;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_239;
import net.minecraft.class_3966;
import net.minecraft.class_9334;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/TriggerBot.class */
public final class TriggerBot extends Module implements TickListener, AttackListener {
    private final BooleanSetting inScreen;
    private final BooleanSetting whileUse;
    private final BooleanSetting onLeftClick;
    private final BooleanSetting allItems;
    private final BooleanSetting weaponsOnly;
    private final MinMaxSetting swordDelay;
    private final MinMaxSetting axeDelay;
    private final BooleanSetting checkShield;
    private final BooleanSetting onlyCritSword;
    private final BooleanSetting onlyCritAxe;
    private final BooleanSetting critSync;
    private final BooleanSetting comboSync;
    private final NumberSetting comboThreshold;
    private final BooleanSetting swing;
    private final BooleanSetting whileAscend;
    private final BooleanSetting clickSimulation;
    private final BooleanSetting strayBypass;
    private final BooleanSetting allEntities;
    private final BooleanSetting useShield;
    private final NumberSetting shieldTime;
    private final BooleanSetting sticky;
    private final BooleanSetting antiBot;
    private final TimerUtils timer;
    private int currentSwordDelay;
    private int currentAxeDelay;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !TriggerBot.class.desiredAssertionStatus();
    }

    public TriggerBot() {
        super(EncryptedString.of("Trigger Bot"), EncryptedString.of("Automatically hits players for you"), -1, Category.COMBAT);
        this.inScreen = new BooleanSetting(EncryptedString.of("Work In Screen"), false).setDescription(EncryptedString.of("Will trigger even if youre inside a screen"));
        this.whileUse = new BooleanSetting(EncryptedString.of("While Use"), false).setDescription(EncryptedString.of("Will hit the player no matter if you're eating or blocking with a shield"));
        this.onLeftClick = new BooleanSetting(EncryptedString.of("On Left Click"), false).setDescription(EncryptedString.of("Only gets triggered if holding down left click"));
        this.allItems = new BooleanSetting(EncryptedString.of("All Items"), false).setDescription(EncryptedString.of("Works with all Items /THIS USES SWORD DELAY AS THE DELAY/"));
        this.weaponsOnly = new BooleanSetting(EncryptedString.of("Weapons Only"), false).setDescription(EncryptedString.of("Only triggers when holding a sword or axe"));
        this.swordDelay = new MinMaxSetting(EncryptedString.of("Sword Delay"), 0.0d, 1000.0d, 1.0d, 540.0d, 550.0d).setDescription(EncryptedString.of("Delay for swords"));
        this.axeDelay = new MinMaxSetting(EncryptedString.of("Axe Delay"), 0.0d, 1000.0d, 1.0d, 780.0d, 800.0d).setDescription(EncryptedString.of("Delay for axes"));
        this.checkShield = new BooleanSetting(EncryptedString.of("Check Shield"), false).setDescription(EncryptedString.of("Checks if the player is blocking your hits with a shield (Recommended with Shield Disabler)"));
        this.onlyCritSword = new BooleanSetting(EncryptedString.of("Only Crit Sword"), false).setDescription(EncryptedString.of("Only does critical hits with a sword"));
        this.onlyCritAxe = new BooleanSetting(EncryptedString.of("Only Crit Axe"), false).setDescription(EncryptedString.of("Only does critical hits with an axe"));
        this.critSync = new BooleanSetting(EncryptedString.of("Crit Sync"), false).setDescription(EncryptedString.of("Waits for real crit conditions (falling, not on ground) before hitting"));
        this.comboSync = new BooleanSetting(EncryptedString.of("Combo Sync"), false).setDescription(EncryptedString.of("Waits for full attack cooldown before hitting to ensure max damage"));
        this.comboThreshold = new NumberSetting(EncryptedString.of("Combo Threshold"), 0.5d, 1.0d, 0.9d, 0.05d).setDescription(EncryptedString.of("Minimum attack cooldown progress required to hit (0.9 = 90%)"));
        this.swing = new BooleanSetting(EncryptedString.of("Swing Hand"), true).setDescription(EncryptedString.of("Whether to swing the hand or not"));
        this.whileAscend = new BooleanSetting(EncryptedString.of("While Ascending"), false).setDescription(EncryptedString.of("Wont hit if you're ascending from a jump, only if on ground or falling"));
        this.clickSimulation = new BooleanSetting(EncryptedString.of("Click Simulation"), false).setDescription(EncryptedString.of("Makes the CPS hud think you're legit"));
        this.strayBypass = new BooleanSetting(EncryptedString.of("Stray Bypass"), false).setDescription(EncryptedString.of("Bypasses stray's Anti-TriggerBot"));
        this.allEntities = new BooleanSetting(EncryptedString.of("All Entities"), false).setDescription(EncryptedString.of("Will attack all entities"));
        this.useShield = new BooleanSetting(EncryptedString.of("Use Shield"), false).setDescription(EncryptedString.of("Uses shield if it's in your offhand"));
        this.shieldTime = new NumberSetting(EncryptedString.of("Shield Time"), 100.0d, 1000.0d, 350.0d, 1.0d);
        this.sticky = new BooleanSetting(EncryptedString.of("Same Player"), false).setDescription(EncryptedString.of("Hits the player that was recently attacked, good for FFA"));
        this.antiBot = new BooleanSetting(EncryptedString.of("Anti Bot"), false).setDescription(EncryptedString.of("Prevents targeting server bots/NPCs"));
        this.timer = new TimerUtils();
        addSettings(this.inScreen, this.whileUse, this.onLeftClick, this.allItems, this.weaponsOnly, this.swordDelay, this.axeDelay, this.checkShield, this.whileAscend, this.sticky, this.onlyCritSword, this.onlyCritAxe, this.critSync, this.comboSync, this.comboThreshold, this.swing, this.clickSimulation, this.strayBypass, this.allEntities, this.useShield, this.shieldTime, this.antiBot);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.currentSwordDelay = this.swordDelay.getRandomValueInt();
        this.currentAxeDelay = this.axeDelay.getRandomValueInt();
        this.eventManager.add(TickListener.class, this);
        this.eventManager.add(AttackListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        this.eventManager.remove(AttackListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        try {
            if (this.inScreen.getValue() || this.mc.field_1755 == null) {
                if (((Friends) Argon.INSTANCE.getModuleManager().getModule(Friends.class)).antiAttack.getValue() && Argon.INSTANCE.getFriendManager().isAimingOverFriend()) {
                    return;
                }
                class_1799 mainHandStack = this.mc.field_1724.method_6047();
                if (this.onLeftClick.getValue() && GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 0) != 1) {
                    return;
                }
                if ((this.mc.field_1724.method_6079().method_7909().method_57347().method_57832(class_9334.field_50075) || (this.mc.field_1724.method_6079().method_7909() instanceof class_1819)) && GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 1) == 1 && !this.whileUse.getValue()) {
                    return;
                }
                if (!this.whileAscend.getValue()) {
                    if (!this.mc.field_1724.method_24828() && this.mc.field_1724.method_18798().field_1351 > 0.0d) {
                        return;
                    }
                    if (!this.mc.field_1724.method_24828() && this.mc.field_1724.field_6017 <= 0.0d) {
                        return;
                    }
                }
                if (!this.weaponsOnly.getValue() || WorldUtils.isWeapon(mainHandStack)) {
                    if (!this.allItems.getValue()) {
                        if (WorldUtils.isSword(mainHandStack)) {
                            class_3966 class_3966Var = this.mc.field_1765;
                            if (class_3966Var instanceof class_3966) {
                                class_3966 hit = class_3966Var;
                                class_1309 class_1309VarMethod_17782 = hit.method_17782();
                                if (!$assertionsDisabled && this.mc.field_1724.method_6052() == null) {
                                    throw new AssertionError();
                                }
                                if (this.sticky.getValue() && class_1309VarMethod_17782 != this.mc.field_1724.method_6052()) {
                                    return;
                                }
                                if ((class_1309VarMethod_17782 instanceof class_1657) || ((this.strayBypass.getValue() && (class_1309VarMethod_17782 instanceof class_1642)) || (this.allEntities.getValue() && class_1309VarMethod_17782 != null))) {
                                    if (class_1309VarMethod_17782 instanceof class_1657) {
                                        class_1657 player = (class_1657) class_1309VarMethod_17782;
                                        if (this.antiBot.getValue() && isBot(player)) {
                                            return;
                                        }
                                        if (this.checkShield.getValue() && player.method_6039() && !WorldUtils.isShieldFacingAway(player)) {
                                            return;
                                        }
                                    }
                                    if (this.onlyCritSword.getValue() && this.mc.field_1724.field_6017 <= 0.0d) {
                                        return;
                                    }
                                    if (this.critSync.getValue() && !WorldUtils.isCrit(this.mc.field_1724, class_1309VarMethod_17782)) {
                                        return;
                                    }
                                    if (this.comboSync.getValue() && this.mc.field_1724.method_7261(0.5f) < this.comboThreshold.getValue()) {
                                        return;
                                    }
                                    if (this.timer.delay(this.currentSwordDelay)) {
                                        if (this.useShield.getValue() && this.mc.field_1724.method_6079().method_7909() == class_1802.field_8255 && this.mc.field_1724.method_6039()) {
                                            MouseSimulation.mouseRelease(1);
                                        }
                                        WorldUtils.hitEntity(class_1309VarMethod_17782, this.swing.getValue());
                                        if (this.clickSimulation.getValue()) {
                                            MouseSimulation.mouseClick(0);
                                        }
                                        this.currentSwordDelay = this.swordDelay.getRandomValueInt();
                                        this.timer.reset();
                                    } else if (this.useShield.getValue() && this.mc.field_1724.method_6079().method_7909() == class_1802.field_8255) {
                                        MouseSimulation.mouseClick(1, this.shieldTime.getValueInt());
                                    }
                                }
                            }
                        } else if (WorldUtils.isAxe(mainHandStack)) {
                            class_3966 class_3966Var2 = this.mc.field_1765;
                            if (class_3966Var2 instanceof class_3966) {
                                class_3966 hit2 = class_3966Var2;
                                class_1297 entity = hit2.method_17782();
                                if ((entity instanceof class_1657) || ((this.strayBypass.getValue() && (entity instanceof class_1642)) || (this.allEntities.getValue() && entity != null))) {
                                    if (entity instanceof class_1657) {
                                        class_1657 player2 = (class_1657) entity;
                                        if (this.antiBot.getValue() && isBot(player2)) {
                                            return;
                                        }
                                        if (this.checkShield.getValue() && player2.method_6039() && !WorldUtils.isShieldFacingAway(player2)) {
                                            return;
                                        }
                                    }
                                    if (this.onlyCritAxe.getValue() && this.mc.field_1724.field_6017 <= 0.0d) {
                                        return;
                                    }
                                    if (this.critSync.getValue() && !WorldUtils.isCrit(this.mc.field_1724, entity)) {
                                        return;
                                    }
                                    if (this.comboSync.getValue() && this.mc.field_1724.method_7261(0.5f) < this.comboThreshold.getValue()) {
                                        return;
                                    }
                                    if (this.timer.delay(this.currentAxeDelay)) {
                                        WorldUtils.hitEntity(entity, this.swing.getValue());
                                        if (this.clickSimulation.getValue()) {
                                            MouseSimulation.mouseClick(0);
                                        }
                                        this.currentAxeDelay = this.axeDelay.getRandomValueInt();
                                        this.timer.reset();
                                    } else if (this.useShield.getValue() && this.mc.field_1724.method_6079().method_7909() == class_1802.field_8255) {
                                        MouseSimulation.mouseClick(1, this.shieldTime.getValueInt());
                                    }
                                }
                            }
                        }
                    } else {
                        class_3966 class_3966Var3 = this.mc.field_1765;
                        if (class_3966Var3 instanceof class_3966) {
                            class_3966 entityHit = class_3966Var3;
                            if (this.mc.field_1765.method_17783() == class_239.class_240.field_1331) {
                                class_1309 class_1309VarMethod_177822 = entityHit.method_17782();
                                if (!$assertionsDisabled && this.mc.field_1724.method_6052() == null) {
                                    throw new AssertionError();
                                }
                                if (this.sticky.getValue() && class_1309VarMethod_177822 != this.mc.field_1724.method_6052()) {
                                    return;
                                }
                                if ((class_1309VarMethod_177822 instanceof class_1657) || ((this.strayBypass.getValue() && (class_1309VarMethod_177822 instanceof class_1642)) || (this.allEntities.getValue() && class_1309VarMethod_177822 != null))) {
                                    if (class_1309VarMethod_177822 instanceof class_1657) {
                                        class_1657 player3 = (class_1657) class_1309VarMethod_177822;
                                        if (this.antiBot.getValue() && isBot(player3)) {
                                            return;
                                        }
                                        if (this.checkShield.getValue() && player3.method_6039() && !WorldUtils.isShieldFacingAway(player3)) {
                                            return;
                                        }
                                    }
                                    if (this.onlyCritSword.getValue() && this.mc.field_1724.field_6017 <= 0.0d) {
                                        return;
                                    }
                                    if (this.critSync.getValue() && !WorldUtils.isCrit(this.mc.field_1724, class_1309VarMethod_177822)) {
                                        return;
                                    }
                                    if (this.comboSync.getValue() && this.mc.field_1724.method_7261(0.5f) < this.comboThreshold.getValue()) {
                                        return;
                                    }
                                    if (this.timer.delay(this.currentSwordDelay)) {
                                        WorldUtils.hitEntity(class_1309VarMethod_177822, this.swing.getValue());
                                        if (this.clickSimulation.getValue()) {
                                            MouseSimulation.mouseClick(0);
                                        }
                                        this.currentSwordDelay = this.swordDelay.getRandomValueInt();
                                        this.timer.reset();
                                    } else if (this.useShield.getValue() && this.mc.field_1724.method_6079().method_7909() == class_1802.field_8255) {
                                        MouseSimulation.mouseClick(1, this.shieldTime.getValueInt());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    private boolean isBot(class_1657 player) {
        String name = player.method_5477().getString();
        if (name.matches("^[a-zA-Z0-9_]{3,16}$")) {
            return this.mc.method_1562() != null && this.mc.method_1562().method_2871(player.method_5667()) == null;
        }
        return true;
    }

    @Override // dev.lvstrng.argon.event.events.AttackListener
    public void onAttack(AttackListener.AttackEvent event) {
        if (GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 0) != 1) {
            event.cancel();
        }
    }
}
