package dev.lvstrng.argon.module.modules.render;

import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.utils.EncryptedString;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/modules/render/NoBounce.class */
public final class NoBounce extends Module {
    public NoBounce() {
        super(EncryptedString.of("No Bounce"), EncryptedString.of("Removes the crystal bounce"), -1, Category.RENDER);
    }
}
