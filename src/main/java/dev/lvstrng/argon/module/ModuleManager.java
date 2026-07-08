package dev.lvstrng.argon.module;

import dev.lvstrng.argon.Argon;
import dev.lvstrng.argon.event.events.ButtonListener;
import dev.lvstrng.argon.gui.ClickGui;
import dev.lvstrng.argon.module.modules.client.ClickGUI;
import dev.lvstrng.argon.module.modules.client.Friends;
import dev.lvstrng.argon.module.modules.client.SelfDestruct;
import dev.lvstrng.argon.module.modules.combat.AimAssist;
import dev.lvstrng.argon.module.modules.combat.AnchorMacro;
import dev.lvstrng.argon.module.modules.combat.AutoCrystal;
import dev.lvstrng.argon.module.modules.combat.AutoDoubleHand;
import dev.lvstrng.argon.module.modules.combat.AutoHitCrystal;
import dev.lvstrng.argon.module.modules.combat.AutoInventoryTotem;
import dev.lvstrng.argon.module.modules.combat.AutoJumpReset;
import dev.lvstrng.argon.module.modules.combat.AutoPot;
import dev.lvstrng.argon.module.modules.combat.AutoPotRefill;
import dev.lvstrng.argon.module.modules.combat.AutoWTap;
import dev.lvstrng.argon.module.modules.combat.CrystalOptimizer;
import dev.lvstrng.argon.module.modules.combat.DoubleAnchor;
import dev.lvstrng.argon.module.modules.combat.HitCob;
import dev.lvstrng.argon.module.modules.combat.HoverTotem;
import dev.lvstrng.argon.module.modules.combat.MaceAssist;
import dev.lvstrng.argon.module.modules.combat.MaceSwap;
import dev.lvstrng.argon.module.modules.combat.NoMissDelay;
import dev.lvstrng.argon.module.modules.combat.ShieldDisabler;
import dev.lvstrng.argon.module.modules.combat.SpearSwap;
import dev.lvstrng.argon.module.modules.combat.TotemOffhand;
import dev.lvstrng.argon.module.modules.combat.TriggerBot;
import dev.lvstrng.argon.module.modules.misc.AutoClicker;
import dev.lvstrng.argon.module.modules.misc.AutoXP;
import dev.lvstrng.argon.module.modules.misc.BridgeAssist;
import dev.lvstrng.argon.module.modules.misc.FakeLag;
import dev.lvstrng.argon.module.modules.misc.FastPlace;
import dev.lvstrng.argon.module.modules.misc.Freecam;
import dev.lvstrng.argon.module.modules.misc.KeyPearl;
import dev.lvstrng.argon.module.modules.misc.NoBreakDelay;
import dev.lvstrng.argon.module.modules.misc.NoHitDelay;
import dev.lvstrng.argon.module.modules.misc.NoJumpDelay;
import dev.lvstrng.argon.module.modules.misc.NoShieldDelay;
import dev.lvstrng.argon.module.modules.misc.PackSpoof;
import dev.lvstrng.argon.module.modules.misc.PingSpoof;
import dev.lvstrng.argon.module.modules.misc.Prevent;
import dev.lvstrng.argon.module.modules.misc.Sprint;
import dev.lvstrng.argon.module.modules.render.BlockESP;
import dev.lvstrng.argon.module.modules.render.Fullbright;
import dev.lvstrng.argon.module.modules.render.HUD;
import dev.lvstrng.argon.module.modules.render.NoBounce;
import dev.lvstrng.argon.module.modules.render.PlayerESP;
import dev.lvstrng.argon.module.modules.render.StorageEsp;
import dev.lvstrng.argon.module.modules.render.TargetHud;
import dev.lvstrng.argon.module.modules.render.Trajectory;
import dev.lvstrng.argon.module.modules.render.Xray;
import dev.lvstrng.argon.module.setting.KeybindSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import net.minecraft.class_310;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/ModuleManager.class */
public final class ModuleManager implements ButtonListener {
    private final List<Module> modules = new ArrayList();

    public ModuleManager() {
        addModules();
        addKeybinds();
    }

    public void addModules() {
        add(new AimAssist());
        AnchorMacro anchorMacro = new AnchorMacro();
        add(anchorMacro);
        add(new AutoCrystal());
        add(new AutoDoubleHand());
        add(new AutoHitCrystal());
        add(new AutoInventoryTotem());
        add(new TriggerBot());
        add(new AutoPot());
        add(new AutoPotRefill());
        add(new AutoWTap());
        add(new CrystalOptimizer());
        add(new DoubleAnchor());
        add(new HoverTotem());
        add(new NoMissDelay());
        add(new ShieldDisabler());
        add(new TotemOffhand());
        add(new AutoJumpReset());
        add(new MaceSwap());
        add(new HitCob());
        add(new MaceAssist());
        add(new SpearSwap());
        add(new Prevent());
        add(new AutoXP());
        add(new NoJumpDelay());
        add(new PingSpoof());
        add(new FakeLag());
        add(new AutoClicker());
        add(new KeyPearl());
        add(new NoBreakDelay());
        add(new Freecam());
        add(new PackSpoof());
        add(new FastPlace());
        add(new BridgeAssist());
        add(new NoShieldDelay());
        add(new NoHitDelay());
        Sprint sprint = new Sprint();
        add(sprint);
        HUD hud = new HUD();
        add(hud);
        add(new NoBounce());
        add(new PlayerESP());
        add(new StorageEsp());
        TargetHud targetHud = new TargetHud();
        add(targetHud);
        add(new Trajectory());
        add(new Xray());
        add(new Fullbright());
        add(new BlockESP());
        add(new ClickGUI());
        add(new Friends());
        add(new SelfDestruct());
        hud.setEnabledStatus(true);
        hud.onEnable();
        targetHud.setEnabledStatus(true);
        targetHud.onEnable();
    }

    public List<Module> getEnabledModules() {
        return this.modules.stream().filter((v0) -> {
            return v0.isEnabled();
        }).toList();
    }

    public List<Module> getModules() {
        return this.modules;
    }

    public void addKeybinds() {
        Argon.INSTANCE.getEventManager().add(ButtonListener.class, this);
        for (Module module : this.modules) {
            module.addSetting(new KeybindSetting(EncryptedString.of("Keybind"), module.getKey(), true).setDescription(EncryptedString.of("Key to enabled the module")));
        }
    }

    public List<Module> getModulesInCategory(Category category) {
        return this.modules.stream().filter(module -> {
            return module.getCategory() == category;
        }).toList();
    }

    public <T extends Module> T getModule(Class<T> moduleClass) {
        Stream<Module> stream = this.modules.stream();
        Objects.requireNonNull(moduleClass);
        return (T) stream.filter((v1) -> {
            return r1.isInstance(v1);
        }).findFirst().orElse(null);
    }

    public void add(Module module) {
        this.modules.add(module);
    }

    @Override // dev.lvstrng.argon.event.events.ButtonListener
    public void onButtonPress(ButtonListener.ButtonEvent event) {
        if (!SelfDestruct.destruct && event.action == 1) {
            class_310 mc = class_310.method_1551();
            for (Module module : this.modules) {
                if (module.getKey() == event.button && (mc.field_1755 == null || (mc.field_1755 instanceof ClickGui))) {
                    module.toggle();
                }
            }
        }
    }
}
