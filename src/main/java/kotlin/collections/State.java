package kotlin.collections;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/State.class */
final class State {

    @NotNull
    public static final State INSTANCE = new State();
    public static final int NOT_READY = 0;
    public static final int READY = 1;
    public static final int DONE = 2;
    public static final int FAILED = 3;

    private State() {
    }
}
