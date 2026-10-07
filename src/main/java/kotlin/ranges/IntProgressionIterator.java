package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/IntProgressionIterator.class */
public final class IntProgressionIterator extends IntIterator {
    private final int step;
    private final int finalElement;
    private boolean hasNext;
    private int next;

    public IntProgressionIterator(int first, int last, int step) {
        this.step = step;
        this.finalElement = last;
        this.hasNext = this.step > 0 ? first <= last : first >= last;
        this.next = this.hasNext ? first : this.finalElement;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int value = this.next;
        if (value == this.finalElement) {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        } else {
            this.next += this.step;
        }
        return value;
    }
}
