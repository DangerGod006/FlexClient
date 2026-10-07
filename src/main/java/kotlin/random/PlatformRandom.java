package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/random/PlatformRandom.class */
final class PlatformRandom extends AbstractPlatformRandom implements Serializable {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final java.util.Random impl;
    private static final long serialVersionUID = 0;

    /* JADX INFO: compiled from: PlatformRandom.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/random/PlatformRandom$Companion.class */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }

    public PlatformRandom(@NotNull java.util.Random impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @Override // kotlin.random.AbstractPlatformRandom
    @NotNull
    public java.util.Random getImpl() {
        return this.impl;
    }
}
