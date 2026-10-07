package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/CoroutineContext.class */
@SinceKotlin(version = "1.3")
public interface CoroutineContext {

    /* JADX INFO: compiled from: CoroutineContext.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/CoroutineContext$Key.class */
    public interface Key<E extends Element> {
    }

    @Nullable
    <E extends Element> E get(@NotNull Key<E> key);

    <R> R fold(R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

    @NotNull
    CoroutineContext plus(@NotNull CoroutineContext coroutineContext);

    @NotNull
    CoroutineContext minusKey(@NotNull Key<?> key);

    /* JADX INFO: compiled from: CoroutineContext.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/CoroutineContext$DefaultImpls.class */
    public static final class DefaultImpls {
        @NotNull
        public static CoroutineContext plus(@NotNull CoroutineContext $this, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == EmptyCoroutineContext.INSTANCE ? $this : (CoroutineContext) context.fold($this, DefaultImpls::plus$lambda$0);
        }

        private static CoroutineContext plus$lambda$0(CoroutineContext acc, Element element) {
            CombinedContext combinedContext;
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            CoroutineContext removed = acc.minusKey(element.getKey());
            if (removed == EmptyCoroutineContext.INSTANCE) {
                return element;
            }
            ContinuationInterceptor interceptor = (ContinuationInterceptor) removed.get(ContinuationInterceptor.Key);
            if (interceptor == null) {
                combinedContext = new CombinedContext(removed, element);
            } else {
                CoroutineContext left = removed.minusKey(ContinuationInterceptor.Key);
                combinedContext = left == EmptyCoroutineContext.INSTANCE ? new CombinedContext(element, interceptor) : new CombinedContext(new CombinedContext(left, element), interceptor);
            }
            return combinedContext;
        }
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/CoroutineContext$Element.class */
    public interface Element extends CoroutineContext {
        @NotNull
        Key<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        @Nullable
        <E extends Element> E get(@NotNull Key<E> key);

        @Override // kotlin.coroutines.CoroutineContext
        <R> R fold(R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        CoroutineContext minusKey(@NotNull Key<?> key);

        /* JADX INFO: compiled from: CoroutineContext.kt */
        /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/CoroutineContext$Element$DefaultImpls.class */
        public static final class DefaultImpls {
            @NotNull
            public static CoroutineContext plus(@NotNull Element $this, @NotNull CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return DefaultImpls.plus($this, context);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public static <E extends Element> E get(@NotNull Element $this, @NotNull Key<E> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.areEqual($this.getKey(), key)) {
                    return null;
                }
                Intrinsics.checkNotNull($this, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return $this;
            }

            public static <R> R fold(@NotNull Element $this, R initial, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(initial, $this);
            }

            @NotNull
            public static CoroutineContext minusKey(@NotNull Element $this, @NotNull Key<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.areEqual($this.getKey(), key) ? EmptyCoroutineContext.INSTANCE : $this;
            }
        }
    }
}
