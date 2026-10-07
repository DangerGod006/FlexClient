package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/internal/CharSpreadBuilder.class */
public final class CharSpreadBuilder extends PrimitiveSpreadBuilder<char[]> {

    @NotNull
    private final char[] values;

    public CharSpreadBuilder(int size) {
        super(size);
        this.values = new char[size];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull char[] $this$getSize) {
        Intrinsics.checkNotNullParameter($this$getSize, "<this>");
        return $this$getSize.length;
    }

    public final void add(char value) {
        char[] cArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        cArr[position] = value;
    }

    @NotNull
    public final char[] toArray() {
        return toArray(this.values, new char[size()]);
    }
}
