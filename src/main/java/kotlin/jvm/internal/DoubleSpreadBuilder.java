package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/internal/DoubleSpreadBuilder.class */
public final class DoubleSpreadBuilder extends PrimitiveSpreadBuilder<double[]> {

    @NotNull
    private final double[] values;

    public DoubleSpreadBuilder(int size) {
        super(size);
        this.values = new double[size];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull double[] $this$getSize) {
        Intrinsics.checkNotNullParameter($this$getSize, "<this>");
        return $this$getSize.length;
    }

    public final void add(double value) {
        double[] dArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        dArr[position] = value;
    }

    @NotNull
    public final double[] toArray() {
        return toArray(this.values, new double[size()]);
    }
}
