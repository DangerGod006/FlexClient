package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.ItemUseListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.BlockUtils;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.InventoryUtils;
import dev.lvstrng.argon.utils.KeyUtils;
import dev.lvstrng.argon.utils.MathUtils;
import dev.lvstrng.argon.utils.MouseSimulation;
import dev.lvstrng.argon.utils.WorldUtils;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import net.minecraft.class_9334;
import org.lwjgl.glfw.GLFW;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AnchorMacro.class */
public final class AnchorMacro extends Module implements TickListener, ItemUseListener {
    private final BooleanSetting whileUse;
    private final BooleanSetting stopOnKill;
    private final BooleanSetting clickSimulation;
    private final NumberSetting switchDelay;
    private final NumberSetting switchChance;
    private final NumberSetting placeChance;
    private final NumberSetting glowstoneDelay;
    private final NumberSetting glowstoneChance;
    private final NumberSetting explodeDelay;
    private final NumberSetting explodeChance;
    private final NumberSetting explodeSlot;
    private final BooleanSetting onlyOwn;
    private final BooleanSetting onlyCharge;
    private int switchClock;
    private int glowstoneClock;
    private int explodeClock;
    private final Set<class_2338> ownedAnchors;

    public AnchorMacro() {
        super(EncryptedString.of("Anchor Macro"), EncryptedString.of("Automatically blows up respawn anchors for you"), -1, Category.COMBAT);
        this.whileUse = new BooleanSetting(EncryptedString.of("While Use"), true).setDescription(EncryptedString.of("If it should trigger while eating/using shield"));
        this.stopOnKill = new BooleanSetting(EncryptedString.of("Stop on Kill"), false).setDescription(EncryptedString.of("Doesn't anchor if body nearby"));
        this.clickSimulation = new BooleanSetting(EncryptedString.of("Click Simulation"), false).setDescription(EncryptedString.of("Makes the CPS hud think you're legit"));
        this.switchDelay = new NumberSetting(EncryptedString.of("Switch Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.switchChance = new NumberSetting(EncryptedString.of("Switch Chance"), 0.0d, 100.0d, 100.0d, 1.0d);
        this.placeChance = new NumberSetting(EncryptedString.of("Place Chance"), 0.0d, 100.0d, 100.0d, 1.0d).setDescription(EncryptedString.of("Randomization"));
        this.glowstoneDelay = new NumberSetting(EncryptedString.of("Glowstone Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.glowstoneChance = new NumberSetting(EncryptedString.of("Glowstone Chance"), 0.0d, 100.0d, 100.0d, 1.0d);
        this.explodeDelay = new NumberSetting(EncryptedString.of("Explode Delay"), 0.0d, 20.0d, 0.0d, 1.0d);
        this.explodeChance = new NumberSetting(EncryptedString.of("Explode Chance"), 0.0d, 100.0d, 100.0d, 1.0d);
        this.explodeSlot = new NumberSetting(EncryptedString.of("Explode Slot"), 1.0d, 9.0d, 1.0d, 1.0d);
        this.onlyOwn = new BooleanSetting(EncryptedString.of("Only Own"), false);
        this.onlyCharge = new BooleanSetting(EncryptedString.of("Only Charge"), false);
        this.switchClock = 0;
        this.glowstoneClock = 0;
        this.explodeClock = 0;
        this.ownedAnchors = new HashSet();
        addSettings(this.whileUse, this.stopOnKill, this.clickSimulation, this.placeChance, this.switchDelay, this.switchChance, this.glowstoneDelay, this.glowstoneChance, this.explodeDelay, this.explodeChance, this.explodeSlot, this.onlyOwn, this.onlyCharge);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.eventManager.add(ItemUseListener.class, this);
        this.switchClock = 0;
        this.glowstoneClock = 0;
        this.explodeClock = 0;
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
        if ((this.mc.field_1724.method_6047().method_7909().method_57347().method_57832(class_9334.field_50075) || (this.mc.field_1724.method_6047().method_7909() instanceof class_1819) || (this.mc.field_1724.method_6079().method_7909() instanceof class_1819) || this.mc.field_1724.method_6079().method_7909().method_57347().method_57832(class_9334.field_50075)) && GLFW.glfwGetMouseButton(this.mc.method_22683().method_4490(), 1) == 1 && this.whileUse.getValue()) {
            return;
        }
        if (this.stopOnKill.getValue() && WorldUtils.isDeadBodyNearby()) {
            return;
        }
        int randomInt = MathUtils.randomInt(1, 100);
        if (KeyUtils.isKeyPressed(1)) {
            class_3965 class_3965Var = this.mc.field_1765;
            if (class_3965Var instanceof class_3965) {
                class_3965 hit = class_3965Var;
                if (BlockUtils.isBlock(hit.method_17777(), class_2246.field_23152)) {
                    if (this.onlyOwn.getValue() && !this.ownedAnchors.contains(hit.method_17777())) {
                        return;
                    }
                    this.mc.field_1690.field_1904.method_23481(false);
                    if (BlockUtils.isAnchorNotCharged(hit.method_17777())) {
                        randomInt = MathUtils.randomInt(1, 100);
                        if (randomInt <= this.placeChance.getValueInt()) {
                            if (!this.mc.field_1724.method_6047().method_31574(class_1802.field_8801)) {
                                if (this.switchClock != this.switchDelay.getValueInt()) {
                                    this.switchClock++;
                                    return;
                                }
                                randomInt = MathUtils.randomInt(1, 100);
                                if (randomInt <= this.switchChance.getValueInt()) {
                                    this.switchClock = 0;
                                    InventoryUtils.selectItemFromHotbar(class_1802.field_8801);
                                }
                            }
                            if (this.mc.field_1724.method_6047().method_31574(class_1802.field_8801)) {
                                if (this.glowstoneClock != this.glowstoneDelay.getValueInt()) {
                                    this.glowstoneClock++;
                                    return;
                                }
                                randomInt = MathUtils.randomInt(1, 100);
                                if (randomInt <= this.glowstoneChance.getValueInt()) {
                                    this.glowstoneClock = 0;
                                    if (this.clickSimulation.getValue()) {
                                        MouseSimulation.mouseClick(1);
                                    }
                                    WorldUtils.placeBlock(hit, true);
                                }
                            }
                        }
                    }
                    if (BlockUtils.isAnchorCharged(hit.method_17777())) {
                        int slot = this.explodeSlot.getValueInt() - 1;
                        if (this.mc.field_1724.method_31548().method_67532() != slot) {
                            if (this.switchClock != this.switchDelay.getValueInt()) {
                                this.switchClock++;
                                return;
                            } else if (randomInt <= this.switchChance.getValueInt()) {
                                this.switchClock = 0;
                                this.mc.field_1724.method_31548().method_61496(slot);
                            }
                        }
                        if (this.mc.field_1724.method_31548().method_67532() == slot) {
                            if (this.explodeClock != this.explodeDelay.getValueInt()) {
                                this.explodeClock++;
                                return;
                            }
                            int randomInt2 = MathUtils.randomInt(1, 100);
                            if (randomInt2 <= this.explodeChance.getValueInt()) {
                                this.explodeClock = 0;
                                if (!this.onlyCharge.getValue()) {
                                    if (this.clickSimulation.getValue()) {
                                        MouseSimulation.mouseClick(1);
                                    }
                                    WorldUtils.placeBlock(hit, true);
                                    this.ownedAnchors.remove(hit.method_17777());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // dev.lvstrng.argon.event.events.ItemUseListener
    public void onItemUse(ItemUseListener.ItemUseEvent event) {
        class_3965 class_3965Var = this.mc.field_1765;
        if (class_3965Var instanceof class_3965) {
            class_3965 hitResult = class_3965Var;
            if (hitResult.method_17783() == class_239.class_240.field_1332) {
                if (this.mc.field_1724.method_6047().method_7909() == class_1802.field_23141) {
                    class_2350 dir = hitResult.method_17780();
                    class_2338 pos = hitResult.method_17777();
                    if (!this.mc.field_1687.method_8320(pos).method_45474()) {
                        switch (AnonymousClass1.$SwitchMap$net$minecraft$util$math$Direction[dir.ordinal()]) {
                            case 1:
                                this.ownedAnchors.add(pos.method_10069(0, 1, 0));
                                break;
                            case 2:
                                this.ownedAnchors.add(pos.method_10069(0, -1, 0));
                                break;
                            case 3:
                                this.ownedAnchors.add(pos.method_10069(1, 0, 0));
                                break;
                            case 4:
                                this.ownedAnchors.add(pos.method_10069(-1, 0, 0));
                                break;
                            case 5:
                                this.ownedAnchors.add(pos.method_10069(0, 0, -1));
                                break;
                            case 6:
                                this.ownedAnchors.add(pos.method_10069(0, 0, 1));
                                break;
                        }
                    } else {
                        this.ownedAnchors.add(pos);
                    }
                }
                class_2338 bp = hitResult.method_17777();
                if (BlockUtils.isAnchorCharged(bp)) {
                    this.ownedAnchors.remove(bp);
                }
            }
        }
    }

    /* JADX INFO: renamed from: dev.lvstrng.argon.module.modules.combat.AnchorMacro$1, reason: invalid class name */
    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AnchorMacro$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$minecraft$util$math$Direction = new int[class_2350.values().length];

        static {
            try {
                $SwitchMap$net$minecraft$util$math$Direction[class_2350.field_11036.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$net$minecraft$util$math$Direction[class_2350.field_11033.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$net$minecraft$util$math$Direction[class_2350.field_11034.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$net$minecraft$util$math$Direction[class_2350.field_11039.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$net$minecraft$util$math$Direction[class_2350.field_11043.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$net$minecraft$util$math$Direction[class_2350.field_11035.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
        }
    }
}
