package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/AbstractIterator.class */
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {
    private int state;

    @Nullable
    private T nextValue;

    protected abstract void computeNext();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        switch (this.state) {
            case 0:
                return tryToComputeNext();
            case 1:
                return true;
            case 2:
                return false;
            default:
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.state == 1) {
            this.state = 0;
            return this.nextValue;
        }
        if (this.state == 2 || !tryToComputeNext()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        return this.nextValue;
    }

    private final boolean tryToComputeNext() {
        this.state = 3;
        computeNext();
        return this.state == 1;
    }

    protected final void setNext(T value) {
        this.nextValue = value;
        this.state = 1;
    }

    protected final void done() {
        this.state = 2;
    }
}
