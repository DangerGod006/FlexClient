package kotlin.time;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Clock.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/Clock.class */
@SinceKotlin(version = "2.1")
@ExperimentalTime
public interface Clock {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    Instant now();

    /* JADX INFO: compiled from: Clock.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/Clock$System.class */
    public static final class System implements Clock {

        @NotNull
        public static final System INSTANCE = new System();

        private System() {
        }

        @Override // kotlin.time.Clock
        @NotNull
        public Instant now() {
            return InstantJvmKt.systemClockNow();
        }
    }

    /* JADX INFO: compiled from: Clock.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/Clock$Companion.class */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
