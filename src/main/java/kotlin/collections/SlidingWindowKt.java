package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/SlidingWindowKt.class */
public final class SlidingWindowKt {
    public static final void checkWindowSizeStep(int size, int step) {
        String str;
        if (!(size > 0 && step > 0)) {
            if (size != step) {
                str = "Both size " + size + " and step " + step + " must be greater than zero.";
            } else {
                str = "size " + size + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    public static final <T> Sequence<List<T>> windowedSequence(@NotNull final Sequence<? extends T> sequence, final int i, final int i2, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        checkWindowSizeStep(i, i2);
        return new Sequence<List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<List<? extends T>> iterator() {
                return SlidingWindowKt.windowedIterator(sequence.iterator(), i, i2, z, z2);
            }
        };
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.SlidingWindowKt$windowedIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/SlidingWindowKt$windowedIterator$1.class */
    static final class AnonymousClass1<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        Object L$1;
        Object L$2;
        Object L$3;
        int I$0;
        int I$1;
        int I$2;
        int label;
        private /* synthetic */ Object L$0;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        final /* synthetic */ Iterator<T> $iterator;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ boolean $partialWindows;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(int $size, int $step, Iterator<? extends T> $iterator, boolean $reuseBuffer, boolean $partialWindows, Continuation<? super AnonymousClass1> $completion) {
            super(2, $completion);
            this.$size = $size;
            this.$step = $step;
            this.$iterator = $iterator;
            this.$reuseBuffer = $reuseBuffer;
            this.$partialWindows = $partialWindows;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, $completion);
            anonymousClass1.L$0 = value;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super List<? extends T>> p1, Continuation<? super Unit> p2) {
            return ((AnonymousClass1) create(p1, p2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:109:? A[PHI: r9 r10 r11
  PHI (r9v5 'bufferInitialCapacity' int) = (r9v1 'bufferInitialCapacity' int), (r9v6 'bufferInitialCapacity' int) binds: [B:88:0x02a1, B:58:0x029e] A[DONT_GENERATE, DONT_INLINE]
  PHI (r10v5 'gap' int) = (r10v1 'gap' int), (r10v6 'gap' int) binds: [B:88:0x02a1, B:58:0x029e] A[DONT_GENERATE, DONT_INLINE]
  PHI (r11v5 'buffer' kotlin.collections.RingBuffer) = (r11v1 'buffer' kotlin.collections.RingBuffer), (r11v7 'buffer' kotlin.collections.RingBuffer) binds: [B:88:0x02a1, B:58:0x029e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x02ad  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0334  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0338  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x033c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0074  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 930
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> Iterator<List<T>> windowedIterator(@NotNull Iterator<? extends T> iterator, int size, int step, boolean partialWindows, boolean reuseBuffer) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? EmptyIterator.INSTANCE : SequencesKt.iterator(new AnonymousClass1(size, step, iterator, reuseBuffer, partialWindows, null));
    }
}
