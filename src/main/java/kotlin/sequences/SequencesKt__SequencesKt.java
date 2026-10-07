package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt__SequencesKt.class */
public class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
    @InlineOnly
    private static final <T> Sequence<T> Sequence(final Function0<? extends Iterator<? extends T>> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt.Sequence.1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return iterator.invoke();
            }
        };
    }

    @NotNull
    public static final <T> Sequence<T> asSequence(@NotNull final Iterator<? extends T> $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return SequencesKt.constrainOnce(new Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return $this$asSequence;
            }
        });
    }

    @NotNull
    public static final <T> Sequence<T> sequenceOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ArraysKt.asSequence(elements);
    }

    @SinceKotlin(version = "2.2")
    @NotNull
    public static final <T> Sequence<T> sequenceOf(final T element) {
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$sequenceOf$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return new SequencesKt__SequencesKt$sequenceOf$1$1(element);
            }
        };
    }

    @SinceKotlin(version = "2.2")
    @InlineOnly
    private static final <T> Sequence<T> sequenceOf() {
        return SequencesKt.emptySequence();
    }

    @NotNull
    public static final <T> Sequence<T> emptySequence() {
        return EmptySequence.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Sequence<T> orEmpty(Sequence<? extends T> $this$orEmpty) {
        return $this$orEmpty == 0 ? SequencesKt.emptySequence() : $this$orEmpty;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1.class */
    static final class C00091<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {
        Object L$1;
        int label;
        private /* synthetic */ Object L$0;
        final /* synthetic */ Sequence<T> $this_ifEmpty;
        final /* synthetic */ Function0<Sequence<T>> $defaultValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C00091(Sequence<? extends T> $receiver, Function0<? extends Sequence<? extends T>> $defaultValue, Continuation<? super C00091> $completion) {
            super(2, $completion);
            this.$this_ifEmpty = $receiver;
            this.$defaultValue = $defaultValue;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            C00091 c00091 = new C00091(this.$this_ifEmpty, this.$defaultValue, $completion);
            c00091.L$0 = value;
            return c00091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super T> p1, Continuation<? super Unit> p2) {
            return ((C00091) create(p1, p2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SequenceScope sequenceScope = (SequenceScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    Iterator<? extends T> it = this.$this_ifEmpty.iterator();
                    if (it.hasNext()) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(sequenceScope);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(it);
                        this.label = 1;
                        if (sequenceScope.yieldAll(it, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(sequenceScope);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(it);
                        this.label = 2;
                        if (sequenceScope.yieldAll(this.$defaultValue.invoke(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                case 1:
                    ResultKt.throwOnFailure(obj);
                    break;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> Sequence<T> ifEmpty(@NotNull Sequence<? extends T> $this$ifEmpty, @NotNull Function0<? extends Sequence<? extends T>> defaultValue) {
        Intrinsics.checkNotNullParameter($this$ifEmpty, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return SequencesKt.sequence(new C00091($this$ifEmpty, defaultValue, null));
    }

    @NotNull
    public static final <T> Sequence<T> flatten(@NotNull Sequence<? extends Sequence<? extends T>> $this$flatten) {
        Intrinsics.checkNotNullParameter($this$flatten, "<this>");
        return flatten$SequencesKt__SequencesKt($this$flatten, SequencesKt__SequencesKt::flatten$lambda$2$SequencesKt__SequencesKt);
    }

    private static final Iterator flatten$lambda$2$SequencesKt__SequencesKt(Sequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    @JvmName(name = "flattenSequenceOfIterable")
    @NotNull
    public static final <T> Sequence<T> flattenSequenceOfIterable(@NotNull Sequence<? extends Iterable<? extends T>> $this$flatten) {
        Intrinsics.checkNotNullParameter($this$flatten, "<this>");
        return flatten$SequencesKt__SequencesKt($this$flatten, SequencesKt__SequencesKt::flatten$lambda$3$SequencesKt__SequencesKt);
    }

    private static final Iterator flatten$lambda$3$SequencesKt__SequencesKt(Iterable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.iterator();
    }

    private static final <T, R> Sequence<R> flatten$SequencesKt__SequencesKt(Sequence<? extends T> $this$flatten, Function1<? super T, ? extends Iterator<? extends R>> iterator) {
        if ($this$flatten instanceof TransformingSequence) {
            return ((TransformingSequence) $this$flatten).flatten$kotlin_stdlib(iterator);
        }
        return new FlatteningSequence($this$flatten, SequencesKt__SequencesKt::flatten$lambda$4$SequencesKt__SequencesKt, iterator);
    }

    private static final Object flatten$lambda$4$SequencesKt__SequencesKt(Object it) {
        return it;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Sequence<? extends Pair<? extends T, ? extends R>> $this$unzip) {
        Intrinsics.checkNotNullParameter($this$unzip, "<this>");
        ArrayList listT = new ArrayList();
        ArrayList listR = new ArrayList();
        for (Pair<? extends T, ? extends R> pair : $this$unzip) {
            listT.add(pair.getFirst());
            listR.add(pair.getSecond());
        }
        return TuplesKt.to(listT, listR);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Sequence<T> shuffled(@NotNull Sequence<? extends T> $this$shuffled) {
        Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
        return SequencesKt.shuffled($this$shuffled, Random.Default);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$shuffled$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt__SequencesKt$shuffled$1.class */
    static final class C00101<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {
        Object L$1;
        Object L$2;
        Object L$3;
        int I$0;
        int label;
        private /* synthetic */ Object L$0;
        final /* synthetic */ Sequence<T> $this_shuffled;
        final /* synthetic */ Random $random;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C00101(Sequence<? extends T> $receiver, Random $random, Continuation<? super C00101> $completion) {
            super(2, $completion);
            this.$this_shuffled = $receiver;
            this.$random = $random;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            C00101 c00101 = new C00101(this.$this_shuffled, this.$random, $completion);
            c00101.L$0 = value;
            return c00101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super T> p1, Continuation<? super Unit> p2) {
            return ((C00101) create(p1, p2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            List buffer;
            Object value;
            SequenceScope sequenceScope = (SequenceScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    buffer = SequencesKt.toMutableList(this.$this_shuffled);
                    break;
                case 1:
                    int i = this.I$0;
                    Object obj = this.L$3;
                    Object obj2 = this.L$2;
                    buffer = (List) this.L$1;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            do {
                if (!buffer.isEmpty()) {
                    int j = this.$random.nextInt(buffer.size());
                    Object last = CollectionsKt.removeLast(buffer);
                    value = j < buffer.size() ? buffer.set(j, last) : last;
                    this.L$0 = sequenceScope;
                    this.L$1 = buffer;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(last);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(value);
                    this.I$0 = j;
                    this.label = 1;
                } else {
                    return Unit.INSTANCE;
                }
            } while (sequenceScope.yield(value, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Sequence<T> shuffled(@NotNull Sequence<? extends T> $this$shuffled, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return SequencesKt.sequence(new C00101($this$shuffled, random, null));
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt__SequencesKt$flatMapIndexed$1.class */
    static final class C00081<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
        Object L$1;
        Object L$2;
        Object L$3;
        int I$0;
        int label;
        private /* synthetic */ Object L$0;
        final /* synthetic */ Sequence<T> $source;
        final /* synthetic */ Function2<Integer, T, C> $transform;
        final /* synthetic */ Function1<C, Iterator<R>> $iterator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C00081(Sequence<? extends T> $source, Function2<? super Integer, ? super T, ? extends C> $transform, Function1<? super C, ? extends Iterator<? extends R>> $iterator, Continuation<? super C00081> $completion) {
            super(2, $completion);
            this.$source = $source;
            this.$transform = $transform;
            this.$iterator = $iterator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            C00081 c00081 = new C00081(this.$source, this.$transform, this.$iterator, $completion);
            c00081.L$0 = value;
            return c00081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super R> p1, Continuation<? super Unit> p2) {
            return ((C00081) create(p1, p2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            Iterator it;
            SequenceScope sequenceScope = (SequenceScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    i = 0;
                    it = this.$source.iterator();
                    break;
                case 1:
                    i = this.I$0;
                    Object obj2 = this.L$3;
                    Object obj3 = this.L$2;
                    it = (Iterator) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                Object next = it.next();
                Function2<Integer, T, C> function2 = this.$transform;
                int i2 = i;
                i++;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object objInvoke = function2.invoke(Boxing.boxInt(i2), (T) next);
                this.L$0 = sequenceScope;
                this.L$1 = it;
                this.L$2 = SpillingKt.nullOutSpilledVariable(next);
                this.L$3 = SpillingKt.nullOutSpilledVariable(objInvoke);
                this.I$0 = i;
                this.label = 1;
                if (sequenceScope.yieldAll(this.$iterator.invoke((C) objInvoke), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T, C, R> Sequence<R> flatMapIndexed(@NotNull Sequence<? extends T> source, @NotNull Function2<? super Integer, ? super T, ? extends C> transform, @NotNull Function1<? super C, ? extends Iterator<? extends R>> iterator) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return SequencesKt.sequence(new C00081(source, transform, iterator, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Sequence<T> constrainOnce(@NotNull Sequence<? extends T> $this$constrainOnce) {
        Intrinsics.checkNotNullParameter($this$constrainOnce, "<this>");
        return $this$constrainOnce instanceof ConstrainedOnceSequence ? $this$constrainOnce : new ConstrainedOnceSequence($this$constrainOnce);
    }

    @NotNull
    public static final <T> Sequence<T> generateSequence(@NotNull Function0<? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return SequencesKt.constrainOnce(new GeneratorSequence(nextFunction, (v1) -> {
            return generateSequence$lambda$5$SequencesKt__SequencesKt(r3, v1);
        }));
    }

    private static final Object generateSequence$lambda$5$SequencesKt__SequencesKt(Function0 $nextFunction, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $nextFunction.invoke();
    }

    @LowPriorityInOverloadResolution
    @NotNull
    public static final <T> Sequence<T> generateSequence(@Nullable T seed, @NotNull Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        if (seed == null) {
            return EmptySequence.INSTANCE;
        }
        return new GeneratorSequence(() -> {
            return generateSequence$lambda$6$SequencesKt__SequencesKt(r2);
        }, nextFunction);
    }

    private static final Object generateSequence$lambda$6$SequencesKt__SequencesKt(Object $seed) {
        return $seed;
    }

    @NotNull
    public static final <T> Sequence<T> generateSequence(@NotNull Function0<? extends T> seedFunction, @NotNull Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return new GeneratorSequence(seedFunction, nextFunction);
    }
}
