package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.AttackListener;
import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.ModeSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import net.minecraft.class_1268;
import net.minecraft.class_1296;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1887;
import net.minecraft.class_2824;
import net.minecraft.class_2868;
import net.minecraft.class_3966;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9362;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/MaceSwap.class */
public final class MaceSwap extends Module implements TickListener, AttackListener {
    private final ModeSetting<SwapMode> swapMode;
    private final NumberSetting minFallDistance;
    private final NumberSetting densityThreshold;
    private final BooleanSetting targetPlayers;
    private final BooleanSetting targetMobs;
    private final BooleanSetting noPassive;
    private final BooleanSetting autoSwitchBack;
    private final BooleanSetting stayOnMace;
    private final BooleanSetting breachSwap;
    private final BooleanSetting stunLink;
    private double fallStartY;
    private boolean isFalling;
    private boolean maceHit;
    private boolean needsSwapBack;
    private int originalSlot;
    private int ticksWaited;

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/MaceSwap$SwapMode.class */
    public enum SwapMode {
        Silent,
        Normal
    }

    public MaceSwap() {
        super(EncryptedString.of("Mace Swap"), EncryptedString.of("Auto swaps to mace on fall/hit for maximum damage"), -1, Category.COMBAT);
        this.swapMode = (ModeSetting) new ModeSetting(EncryptedString.of("Mode"), SwapMode.Silent, SwapMode.class).setDescription(EncryptedString.of("Silent: Packet based (fastest), Normal: Client side swap"));
        this.minFallDistance = new NumberSetting(EncryptedString.of("Min Fall Distance"), 0.1d, 10.0d, 1.5d, 0.1d).setDescription(EncryptedString.of("Minimum fall distance to trigger auto mace swap"));
        this.densityThreshold = new NumberSetting(EncryptedString.of("Density Threshold"), 1.0d, 20.0d, 7.0d, 0.5d).setDescription(EncryptedString.of("Fall distance to switch from Breach to Density Mace"));
        this.targetPlayers = new BooleanSetting(EncryptedString.of("Target Players"), true);
        this.targetMobs = new BooleanSetting(EncryptedString.of("Target Mobs"), false);
        this.noPassive = new BooleanSetting(EncryptedString.of("No Passive Mobs"), true);
        this.autoSwitchBack = new BooleanSetting(EncryptedString.of("Auto Switch Back"), true);
        this.stayOnMace = new BooleanSetting(EncryptedString.of("Stay On Mace"), false);
        this.breachSwap = new BooleanSetting(EncryptedString.of("Smart Swap"), true).setDescription(EncryptedString.of("Specifically targets Mace with Breach/Density enchantment on hit"));
        this.stunLink = new BooleanSetting(EncryptedString.of("Shield Stun Link"), true).setDescription(EncryptedString.of("Automatically swap and hit with mace when Shield Disabler stuns a target"));
        this.fallStartY = -1.0d;
        this.isFalling = false;
        this.maceHit = false;
        this.needsSwapBack = false;
        this.originalSlot = -1;
        this.ticksWaited = 0;
        addSettings(this.swapMode, this.minFallDistance, this.densityThreshold, this.targetPlayers, this.targetMobs, this.noPassive, this.autoSwitchBack, this.stayOnMace, this.breachSwap, this.stunLink);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        this.eventManager.add(AttackListener.class, this);
        reset();
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        this.eventManager.remove(AttackListener.class, this);
        if (this.needsSwapBack && this.mc.field_1724 != null && this.originalSlot != -1) {
            forceSwap(this.originalSlot);
        }
        reset();
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        int mace;
        if (this.mc.field_1724 == null || this.mc.field_1755 != null) {
            return;
        }
        if (this.needsSwapBack) {
            this.ticksWaited++;
            if (this.ticksWaited >= 1) {
                if (!this.stayOnMace.getValue()) {
                    forceSwap(this.originalSlot);
                }
                this.needsSwapBack = false;
                this.originalSlot = -1;
                return;
            }
            return;
        }
        updateFall();
        if (!this.isFalling || this.mc.field_1724.method_18798().field_1351 >= -0.1d) {
            return;
        }
        double fallDist = this.fallStartY == -1.0d ? 0.0d : Math.max(0.0d, this.fallStartY - this.mc.field_1724.method_23318());
        class_3966 class_3966Var = this.mc.field_1765;
        if (class_3966Var instanceof class_3966) {
            class_3966 eHit = class_3966Var;
            class_1297 class_1297VarMethod_17782 = eHit.method_17782();
            if (class_1297VarMethod_17782 instanceof class_1309) {
                class_1309 target = (class_1309) class_1297VarMethod_17782;
                if (hasValidTarget(target)) {
                    boolean shouldMace = fallDist >= this.minFallDistance.getValue() || (this.stunLink.getValue() && ShieldDisabler.isStunning);
                    if (shouldMace && !this.maceHit && (mace = getAppropriateMace(fallDist)) != -1 && this.mc.field_1724.method_31548().method_67532() != mace) {
                        if (this.originalSlot == -1) {
                            this.originalSlot = this.mc.field_1724.method_31548().method_67532();
                        }
                        forceSwap(mace);
                        if (this.swapMode.isMode(SwapMode.Silent)) {
                            this.mc.method_1562().method_52787(class_2824.method_34206(target, this.mc.field_1724.method_5715()));
                            this.mc.field_1724.method_6104(class_1268.field_5808);
                        } else {
                            this.mc.invokeDoAttack();
                        }
                        this.maceHit = true;
                        this.needsSwapBack = true;
                        this.ticksWaited = 0;
                    }
                }
            }
        }
    }

    private void updateFall() {
        boolean onGround = this.mc.field_1724.method_24828();
        boolean falling = this.mc.field_1724.method_18798().field_1351 < -0.1d;
        boolean rising = this.mc.field_1724.method_18798().field_1351 > 0.1d;
        double currentY = this.mc.field_1724.method_23318();
        if (onGround) {
            if (this.isFalling) {
                this.isFalling = false;
                this.fallStartY = -1.0d;
                this.maceHit = false;
            }
            if (this.originalSlot != -1 && !this.stayOnMace.getValue() && !this.needsSwapBack) {
                forceSwap(this.originalSlot);
                this.originalSlot = -1;
                return;
            }
            return;
        }
        if (rising && this.maceHit) {
            this.maceHit = false;
            this.fallStartY = currentY;
        }
        if (!this.isFalling) {
            this.isFalling = true;
            this.fallStartY = currentY;
            this.maceHit = false;
        } else if (falling && this.fallStartY != -1.0d && currentY > this.fallStartY) {
            this.fallStartY = currentY;
        }
    }

    @Override // dev.lvstrng.argon.event.events.AttackListener
    public void onAttack(AttackListener.AttackEvent event) {
        if (!this.breachSwap.getValue() || this.mc.field_1724 == null || this.mc.field_1765 == null || this.needsSwapBack) {
            return;
        }
        class_3966 class_3966Var = this.mc.field_1765;
        if (class_3966Var instanceof class_3966) {
            class_3966 eHit = class_3966Var;
            class_1297 class_1297VarMethod_17782 = eHit.method_17782();
            if (class_1297VarMethod_17782 instanceof class_1309) {
                class_1309 target = (class_1309) class_1297VarMethod_17782;
                if (hasValidTarget(target)) {
                    double fallDist = this.fallStartY == -1.0d ? 0.0d : Math.max(0.0d, this.fallStartY - this.mc.field_1724.method_23318());
                    int mace = getAppropriateMace(fallDist);
                    if (mace != -1 && this.mc.field_1724.method_31548().method_67532() != mace) {
                        this.originalSlot = this.mc.field_1724.method_31548().method_67532();
                        if (this.swapMode.isMode(SwapMode.Silent)) {
                            this.mc.method_1562().method_52787(new class_2868(mace));
                            this.mc.method_1562().method_52787(class_2824.method_34206(target, this.mc.field_1724.method_5715()));
                            this.mc.field_1724.method_6104(class_1268.field_5808);
                            this.needsSwapBack = true;
                            this.ticksWaited = 0;
                            event.cancel();
                            return;
                        }
                        this.mc.field_1724.method_31548().method_61496(mace);
                        syncOnce();
                        this.needsSwapBack = true;
                        this.ticksWaited = 0;
                    }
                }
            }
        }
    }

    private int getAppropriateMace(double fallDistance) {
        boolean useDensity = fallDistance >= this.densityThreshold.getValue();
        int targetSlot = useDensity ? findMaceWithEnchant("density") : findMaceWithEnchant("breach");
        if (targetSlot == -1) {
            targetSlot = findAnyMaceSlot();
        }
        return targetSlot;
    }

    private int findMaceWithEnchant(String name) {
        for (int i = 0; i < 9; i++) {
            class_1799 stack = this.mc.field_1724.method_31548().method_5438(i);
            if (stack.method_7909() instanceof class_9362) {
                class_9304 enchants = stack.method_58657();
                for (class_6880<class_1887> entry : enchants.method_57534()) {
                    if (entry.method_40230().isPresent() && ((class_5321) entry.method_40230().get()).method_29177().method_12832().contains(name)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    private int findAnyMaceSlot() {
        for (int i = 0; i < 9; i++) {
            if (this.mc.field_1724.method_31548().method_5438(i).method_7909() instanceof class_9362) {
                return i;
            }
        }
        return -1;
    }

    private void forceSwap(int slot) {
        this.mc.field_1724.method_31548().method_61496(slot);
        if (this.mc.method_1562() != null) {
            this.mc.method_1562().method_52787(new class_2868(slot));
        }
        syncOnce();
    }

    private boolean hasValidTarget(class_1309 e) {
        if (e == this.mc.field_1724 || !e.method_5805() || e.method_7325()) {
            return false;
        }
        if (e instanceof class_1657) {
            return this.targetPlayers.getValue();
        }
        if (this.targetMobs.getValue()) {
            return (this.noPassive.getValue() && (e instanceof class_1296)) ? false : true;
        }
        return false;
    }

    private void syncOnce() {
        if (this.mc.field_1761 != null) {
            this.mc.field_1761.syncSlot();
        }
    }

    private void reset() {
        this.fallStartY = -1.0d;
        this.isFalling = false;
        this.maceHit = false;
        this.needsSwapBack = false;
        this.originalSlot = -1;
        this.ticksWaited = 0;
    }
}
