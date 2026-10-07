package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/CharProgressionIterator.class */
public final class CharProgressionIterator extends CharIterator {
    private final int step;
    private final int finalElement;
    private boolean hasNext;
    private int next;

    public CharProgressionIterator(char first, char last, int step) {
        this.step = step;
        this.finalElement = last;
        this.hasNext = this.step > 0 ? Intrinsics.compare((int) first, (int) last) <= 0 : Intrinsics.compare((int) first, (int) last) >= 0;
        this.next = this.hasNext ? first : this.finalElement;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        int value = this.next;
        if (value == this.finalElement) {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        } else {
            this.next += this.step;
        }
        return (char) value;
    }
}
