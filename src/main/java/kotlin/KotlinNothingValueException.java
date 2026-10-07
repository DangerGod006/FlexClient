package kotlin;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExceptionsH.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/KotlinNothingValueException.class */
@SinceKotlin(version = "1.4")
@PublishedApi
public final class KotlinNothingValueException extends RuntimeException {
    public KotlinNothingValueException() {
    }

    public KotlinNothingValueException(@Nullable String message) {
        super(message);
    }

    public KotlinNothingValueException(@Nullable String message, @Nullable Throwable cause) {
        super(message, cause);
    }

    public KotlinNothingValueException(@Nullable Throwable cause) {
        super(cause);
    }
}
