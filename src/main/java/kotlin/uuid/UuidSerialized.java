package kotlin.uuid;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UuidJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/uuid/UuidSerialized.class */
@ExperimentalUuidApi
final class UuidSerialized implements Externalizable {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long mostSignificantBits;
    private long leastSignificantBits;
    private static final long serialVersionUID = 0;

    public UuidSerialized(long mostSignificantBits, long leastSignificantBits) {
        this.mostSignificantBits = mostSignificantBits;
        this.leastSignificantBits = leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public final void setMostSignificantBits(long j) {
        this.mostSignificantBits = j;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final void setLeastSignificantBits(long j) {
        this.leastSignificantBits = j;
    }

    public UuidSerialized() {
        this(0L, 0L);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeLong(this.mostSignificantBits);
        output.writeLong(this.leastSignificantBits);
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.mostSignificantBits = input.readLong();
        this.leastSignificantBits = input.readLong();
    }

    private final Object readResolve() {
        return Uuid.Companion.fromLongs(this.mostSignificantBits, this.leastSignificantBits);
    }

    /* JADX INFO: compiled from: UuidJVM.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/uuid/UuidSerialized$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}
