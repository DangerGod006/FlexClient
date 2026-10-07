package kotlin.time;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InstantJvm.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/InstantSerialized.class */
@ExperimentalTime
final class InstantSerialized implements Externalizable {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long epochSeconds;
    private int nanosecondsOfSecond;
    private static final long serialVersionUID = 0;

    public InstantSerialized(long epochSeconds, int nanosecondsOfSecond) {
        this.epochSeconds = epochSeconds;
        this.nanosecondsOfSecond = nanosecondsOfSecond;
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final void setEpochSeconds(long j) {
        this.epochSeconds = j;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public final void setNanosecondsOfSecond(int i) {
        this.nanosecondsOfSecond = i;
    }

    public InstantSerialized() {
        this(0L, 0);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeLong(this.epochSeconds);
        output.writeInt(this.nanosecondsOfSecond);
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.epochSeconds = input.readLong();
        this.nanosecondsOfSecond = input.readInt();
    }

    private final Object readResolve() {
        return Instant.Companion.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
    }

    /* JADX INFO: compiled from: InstantJvm.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/InstantSerialized$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}
