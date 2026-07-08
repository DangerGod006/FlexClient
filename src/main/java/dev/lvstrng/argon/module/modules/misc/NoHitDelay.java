package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.module.setting.BooleanSetting;
import dev.lvstrng.argon.module.setting.NumberSetting;
import dev.lvstrng.argon.utils.EncryptedString;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/NoHitDelay.class */
public final class NoHitDelay extends Module {
    public final NumberSetting delay;
    public final BooleanSetting weaponsOnly;
    public final BooleanSetting onlyOnGround;

    public NoHitDelay() {
        super(EncryptedString.of("No Hit Delay (Soon)"), EncryptedString.of("Removes the attack cooldown (Temporarily disabled for bug fix)"), -1, Category.MISC);
        this.delay = new NumberSetting(EncryptedString.of("Delay (Ticks)"), 0.0d, 20.0d, 0.0d, 1.0d).setDescription(EncryptedString.of("Fake cooldown ticks to report. 0 = no delay, 20 = vanilla"));
        this.weaponsOnly = new BooleanSetting(EncryptedString.of("Weapons Only"), false).setDescription(EncryptedString.of("Only remove hit delay when holding a sword or axe"));
        this.onlyOnGround = new BooleanSetting(EncryptedString.of("Only On Ground"), false).setDescription(EncryptedString.of("Only remove hit delay when standing on the ground"));
        addSettings(this.delay, this.weaponsOnly, this.onlyOnGround);
    }

    @Override // dev.lvstrng.argon.module.Module
    public boolean isEnabled() {
        return false;
    }
}
