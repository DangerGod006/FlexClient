package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/builders/SerializedMap.class */
final class SerializedMap implements Externalizable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private Map<?, ?> map;
    private static final long serialVersionUID = 0;

    public SerializedMap(@NotNull Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    public SerializedMap() {
        this(MapsKt.emptyMap());
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) throws ClassNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        int flags = input.readByte();
        if (flags != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + flags);
        }
        int size = input.readInt();
        if (size < 0) {
            throw new InvalidObjectException("Illegal size value: " + size + '.');
        }
        Map $this$readExternal_u24lambda_u241 = MapsKt.createMapBuilder(size);
        for (int i = 0; i < size; i++) {
            Object key = input.readObject();
            Object value = input.readObject();
            $this$readExternal_u24lambda_u241.put(key, value);
        }
        this.map = MapsKt.build($this$readExternal_u24lambda_u241);
    }

    private final Object readResolve() {
        return this.map;
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/builders/SerializedMap$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}
