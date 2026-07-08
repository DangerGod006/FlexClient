package dev.lvstrng.argon.module;

import dev.lvstrng.argon.utils.EncryptedString;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/Category.class */
public enum Category {
    COMBAT(EncryptedString.of("Combat")),
    MISC(EncryptedString.of("Misc")),
    RENDER(EncryptedString.of("Render")),
    CLIENT(EncryptedString.of("Client"));

    public final CharSequence name;

    Category(CharSequence name) {
        this.name = name;
    }
}
