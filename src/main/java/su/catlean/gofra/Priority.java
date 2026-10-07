package su.catlean.gofra;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Priority.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gofra/Priority.class */
public final class Priority {

    @NotNull
    public static final Priority INSTANCE = new Priority();
    public static final byte HIGHEST = 20;
    public static final byte HIGH = 10;
    public static final byte DEFAULT = 0;
    public static final byte LOW = -10;
    public static final byte LOWEST = -20;

    private Priority() {
    }
}
