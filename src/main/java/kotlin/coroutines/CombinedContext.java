package kotlin.coroutines;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/CombinedContext.class */
@SinceKotlin(version = "1.3")
public final class CombinedContext implements CoroutineContext, Serializable {

    @NotNull
    private final CoroutineContext left;

    @NotNull
    private final CoroutineContext.Element element;

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext context) {
        return CoroutineContext.DefaultImpls.plus(this, context);
    }

    public CombinedContext(@NotNull CoroutineContext left, @NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.left = left;
        this.element = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            CombinedContext combinedContext2 = combinedContext;
            E e = (E) combinedContext2.element.get(key);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = combinedContext2.left;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else {
                return (E) coroutineContext.get(key);
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke((Object) this.left.fold(r, operation), this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        CoroutineContext newLeft = this.left.minusKey(key);
        return newLeft == this.left ? this : newLeft == EmptyCoroutineContext.INSTANCE ? this.element : new CombinedContext(newLeft, this.element);
    }

    private final int size() {
        CombinedContext cur = this;
        int size = 2;
        while (true) {
            CoroutineContext coroutineContext = cur.left;
            CombinedContext combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return size;
            }
            cur = combinedContext;
            size++;
        }
    }

    private final boolean contains(CoroutineContext.Element element) {
        return Intrinsics.areEqual(get(element.getKey()), element);
    }

    private final boolean containsAll(CombinedContext context) {
        CombinedContext combinedContext = context;
        while (true) {
            CombinedContext cur = combinedContext;
            if (!contains(cur.element)) {
                return false;
            }
            CoroutineContext next = cur.left;
            if (next instanceof CombinedContext) {
                combinedContext = (CombinedContext) next;
            } else {
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return contains((CoroutineContext.Element) next);
            }
        }
    }

    public boolean equals(@Nullable Object other) {
        return this == other || ((other instanceof CombinedContext) && ((CombinedContext) other).size() == size() && ((CombinedContext) other).containsAll(this));
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @NotNull
    public String toString() {
        return '[' + ((String) fold("", CombinedContext::toString$lambda$2)) + ']';
    }

    private static final String toString$lambda$2(String acc, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        return acc.length() == 0 ? element.toString() : acc + ", " + element;
    }

    private final Object writeReplace() {
        int n = size();
        CoroutineContext[] elements = new CoroutineContext[n];
        Ref.IntRef index = new Ref.IntRef();
        fold(Unit.INSTANCE, (v2, v3) -> {
            return writeReplace$lambda$3(r2, r3, v2, v3);
        });
        if (index.element == n) {
            return new Serialized(elements);
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final Unit writeReplace$lambda$3(CoroutineContext[] $elements, Ref.IntRef $index, Unit unit, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        Intrinsics.checkNotNullParameter(element, "element");
        int i = $index.element;
        $index.element = i + 1;
        $elements[i] = element;
        return Unit.INSTANCE;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/CombinedContext$Serialized.class */
    private static final class Serialized implements Serializable {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final CoroutineContext[] elements;
        private static final long serialVersionUID = 0;

        /* JADX INFO: compiled from: CoroutineContextImpl.kt */
        /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/CombinedContext$Serialized$Companion.class */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
                this();
            }

            private Companion() {
            }
        }

        public Serialized(@NotNull CoroutineContext[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
        }

        @NotNull
        public final CoroutineContext[] getElements() {
            return this.elements;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            Object initial$iv = EmptyCoroutineContext.INSTANCE;
            Object accumulator$iv = initial$iv;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                CoroutineContext p0 = (CoroutineContext) accumulator$iv;
                accumulator$iv = p0.plus(coroutineContext);
            }
            return accumulator$iv;
        }
    }
}
