package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/builders/SerializedCollection.class */
public final class SerializedCollection implements Externalizable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private Collection<?> collection;
    private final int tag;
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;

    public SerializedCollection(@NotNull Collection<?> collection, int tag) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.collection = collection;
        this.tag = tag;
    }

    public SerializedCollection() {
        this(CollectionsKt.emptyList(), 0);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        for (Object element : this.collection) {
            output.writeObject(element);
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) throws InvalidObjectException {
        SerializedCollection serializedCollection;
        Set setBuild;
        Intrinsics.checkNotNullParameter(input, "input");
        int flags = input.readByte();
        int tag = flags & 1;
        int other = flags & (-2);
        if (other != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + flags + '.');
        }
        int size = input.readInt();
        if (size < 0) {
            throw new InvalidObjectException("Illegal size value: " + size + '.');
        }
        switch (tag) {
            case 0:
                List $this$readExternal_u24lambda_u241 = CollectionsKt.createListBuilder(size);
                for (int i = 0; i < size; i++) {
                    $this$readExternal_u24lambda_u241.add(input.readObject());
                }
                serializedCollection = this;
                setBuild = CollectionsKt.build($this$readExternal_u24lambda_u241);
                break;
            case 1:
                Set $this$readExternal_u24lambda_u243 = SetsKt.createSetBuilder(size);
                for (int i2 = 0; i2 < size; i2++) {
                    $this$readExternal_u24lambda_u243.add(input.readObject());
                }
                serializedCollection = this;
                setBuild = SetsKt.build($this$readExternal_u24lambda_u243);
                break;
            default:
                throw new InvalidObjectException("Unsupported collection type tag: " + tag + '.');
        }
        serializedCollection.collection = setBuild;
    }

    private final Object readResolve() {
        return this.collection;
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/builders/SerializedCollection$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}
