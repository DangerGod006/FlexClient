package dev.lvstrng.argon.module.modules.combat;

import dev.lvstrng.argon.event.events.TickListener;
import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;
import dev.lvstrng.argon.utils.MathUtils;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/combat/AutoJumpReset.class */
public final class AutoJumpReset extends Module implements TickListener {
    private final NumberSetting chance;

    public AutoJumpReset() {
        super(EncryptedString.of("Auto Jump Reset"), EncryptedString.of("Automatically jumps for you when you get hit so you take less knockback (not good for crystal pvp)"), -1, Category.COMBAT);
        this.chance = new NumberSetting(EncryptedString.of("Chance"), 0.0d, 100.0d, 100.0d, 1.0d);
        addSettings(this.chance);
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onEnable() {
        this.eventManager.add(TickListener.class, this);
        super.onEnable();
    }

    @Override // dev.lvstrng.argon.module.Module
    public void onDisable() {
        this.eventManager.remove(TickListener.class, this);
        super.onDisable();
    }

    @Override // dev.lvstrng.argon.event.events.TickListener
    public void onTick() {
        if (MathUtils.randomInt(1, 100) <= this.chance.getValueInt() && this.mc.field_1755 == null && !this.mc.field_1724.method_6115() && this.mc.field_1724.field_6235 != 0 && this.mc.field_1724.field_6235 != this.mc.field_1724.field_6254 && this.mc.field_1724.method_24828() && this.mc.field_1724.field_6235 == 9 && MathUtils.randomInt(1, 100) <= this.chance.getValueInt()) {
            this.mc.field_1724.method_6043();
        }
    }
}
