package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/internal/PrimitiveSpreadBuilder.class */
public abstract class PrimitiveSpreadBuilder<T> {
    private final int size;
    private int position;

    @NotNull
    private final T[] spreads;

    protected abstract int getSize(@NotNull T t);

    private static /* synthetic */ void getSpreads$annotations() {
    }

    public PrimitiveSpreadBuilder(int i) {
        this.size = i;
        this.spreads = (T[]) new Object[this.size];
    }

    protected final int getPosition() {
        return this.position;
    }

    protected final void setPosition(int i) {
        this.position = i;
    }

    public final void addSpread(@NotNull T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i = this.position;
        this.position = i + 1;
        tArr[i] = spreadArgument;
    }

    protected final int size() {
        int totalLength = 0;
        int i = 0;
        int i2 = this.size - 1;
        if (0 <= i2) {
            while (true) {
                int i3 = totalLength;
                T t = this.spreads[i];
                totalLength = i3 + (t != null ? getSize(t) : 1);
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        return totalLength;
    }

    @NotNull
    protected final T toArray(@NotNull T values, @NotNull T result) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        int dstIndex = 0;
        int copyValuesFrom = 0;
        int i = 0;
        int i2 = this.size - 1;
        if (0 <= i2) {
            while (true) {
                T t = this.spreads[i];
                if (t != null) {
                    if (copyValuesFrom < i) {
                        System.arraycopy(values, copyValuesFrom, result, dstIndex, i - copyValuesFrom);
                        dstIndex += i - copyValuesFrom;
                    }
                    int spreadSize = getSize(t);
                    System.arraycopy(t, 0, result, dstIndex, spreadSize);
                    dstIndex += spreadSize;
                    copyValuesFrom = i + 1;
                }
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        if (copyValuesFrom < this.size) {
            System.arraycopy(values, copyValuesFrom, result, dstIndex, this.size - copyValuesFrom);
        }
        return result;
    }
}
