package kotlin.uuid;

import java.security.SecureRandom;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UuidJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/uuid/SecureRandomHolder.class */
final class SecureRandomHolder {

    @NotNull
    public static final SecureRandomHolder INSTANCE = new SecureRandomHolder();

    @NotNull
    private static final SecureRandom instance = new SecureRandom();

    private SecureRandomHolder() {
    }

    @NotNull
    public final SecureRandom getInstance() {
        return instance;
    }
}
