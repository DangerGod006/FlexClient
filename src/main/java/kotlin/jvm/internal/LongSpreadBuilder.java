package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/internal/LongSpreadBuilder.class */
public final class LongSpreadBuilder extends PrimitiveSpreadBuilder<long[]> {

    @NotNull
    private final long[] values;

    public LongSpreadBuilder(int size) {
        super(size);
        this.values = new long[size];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull long[] $this$getSize) {
        Intrinsics.checkNotNullParameter($this$getSize, "<this>");
        return $this$getSize.length;
    }

    public final void add(long value) {
        long[] jArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        jArr[position] = value;
    }

    @NotNull
    public final long[] toArray() {
        return toArray(this.values, new long[size()]);
    }
}
