package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.utils.EncryptedString;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/misc/NoBreakDelay.class */
public final class NoBreakDelay extends Module {
    public NoBreakDelay() {
        super(EncryptedString.of("No Break Delay"), EncryptedString.of("Removes the break delay from mining blocks"), -1, Category.MISC);
    }
}
