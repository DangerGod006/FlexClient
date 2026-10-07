package kotlin;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UninitializedPropertyAccessException.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/UninitializedPropertyAccessException.class */
public final class UninitializedPropertyAccessException extends RuntimeException {
    public UninitializedPropertyAccessException() {
    }

    public UninitializedPropertyAccessException(@Nullable String message) {
        super(message);
    }

    public UninitializedPropertyAccessException(@Nullable String message, @Nullable Throwable cause) {
        super(message, cause);
    }

    public UninitializedPropertyAccessException(@Nullable Throwable cause) {
        super(cause);
    }
}
