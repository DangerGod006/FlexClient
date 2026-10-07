package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/FlatteningSequence.class */
public final class FlatteningSequence<T, R, E> implements Sequence<E> {

    @NotNull
    private final Sequence<T> sequence;

    @NotNull
    private final Function1<T, R> transformer;

    @NotNull
    private final Function1<R, Iterator<E>> iterator;

    /* JADX WARN: Multi-variable type inference failed */
    public FlatteningSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer, @NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.sequence = sequence;
        this.transformer = transformer;
        this.iterator = iterator;
    }

    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/FlatteningSequence$State.class */
    private static final class State {

        @NotNull
        public static final State INSTANCE = new State();
        public static final int UNDEFINED = 0;
        public static final int READY = 1;
        public static final int DONE = 2;

        private State() {
        }
    }

    /* JADX INFO: renamed from: kotlin.sequences.FlatteningSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/FlatteningSequence$iterator$1.class */
    public static final class AnonymousClass1 implements Iterator<E>, KMappedMarker {
        private final Iterator<T> iterator;
        private Iterator<? extends E> itemIterator;
        private int state;
        final /* synthetic */ FlatteningSequence<T, R, E> this$0;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(FlatteningSequence<T, R, E> $receiver) {
            this.this$0 = $receiver;
            this.iterator = ((FlatteningSequence) $receiver).sequence.iterator();
        }

        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        public final Iterator<E> getItemIterator() {
            return this.itemIterator;
        }

        public final void setItemIterator(Iterator<? extends E> it) {
            this.itemIterator = it;
        }

        public final int getState() {
            return this.state;
        }

        public final void setState(int i) {
            this.state = i;
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.state == 2) {
                throw new NoSuchElementException();
            }
            if (this.state == 0 && !ensureItemIterator()) {
                throw new NoSuchElementException();
            }
            this.state = 0;
            Iterator<? extends E> it = this.itemIterator;
            Intrinsics.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.state == 1) {
                return true;
            }
            if (this.state == 2) {
                return false;
            }
            return ensureItemIterator();
        }

        private final boolean ensureItemIterator() {
            Iterator<? extends E> it = this.itemIterator;
            if (it != null && it.hasNext()) {
                this.state = 1;
                return true;
            }
            while (this.iterator.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) ((FlatteningSequence) this.this$0).iterator.invoke(((FlatteningSequence) this.this$0).transformer.invoke(this.iterator.next()));
                if (it2.hasNext()) {
                    this.itemIterator = it2;
                    this.state = 1;
                    return true;
                }
            }
            this.state = 2;
            this.itemIterator = null;
            return false;
        }
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<E> iterator() {
        return new AnonymousClass1(this);
    }
}
