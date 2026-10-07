package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/internal/FloatSpreadBuilder.class */
public final class FloatSpreadBuilder extends PrimitiveSpreadBuilder<float[]> {

    @NotNull
    private final float[] values;

    public FloatSpreadBuilder(int size) {
        super(size);
        this.values = new float[size];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull float[] $this$getSize) {
        Intrinsics.checkNotNullParameter($this$getSize, "<this>");
        return $this$getSize.length;
    }

    public final void add(float value) {
        float[] fArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        fArr[position] = value;
    }

    @NotNull
    public final float[] toArray() {
        return toArray(this.values, new float[size()]);
    }
}
