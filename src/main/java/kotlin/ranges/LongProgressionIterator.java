package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/LongProgressionIterator.class */
public final class LongProgressionIterator extends LongIterator {
    private final long step;
    private final long finalElement;
    private boolean hasNext;
    private long next;

    public LongProgressionIterator(long first, long last, long step) {
        this.step = step;
        this.finalElement = last;
        this.hasNext = this.step > 0 ? first <= last : first >= last;
        this.next = this.hasNext ? first : this.finalElement;
    }

    public final long getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long value = this.next;
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
