package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.builders.ListBuilder;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/CollectionsKt__CollectionsJVMKt.class */
public class CollectionsKt__CollectionsJVMKt {
    @NotNull
    public static final <T> List<T> listOf(T element) {
        List<T> listSingletonList = Collections.singletonList(element);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @InlineOnly
    private static final <T> ArrayList<T> asArrayList(T[] $this$asArrayList) {
        Intrinsics.checkNotNullParameter($this$asArrayList, "<this>");
        return new ArrayList<>(CollectionsKt.asCollection($this$asArrayList, true));
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> List<E> buildListInternal(Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        builderAction.invoke(listCreateListBuilder);
        return CollectionsKt.build(listCreateListBuilder);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> List<E> buildListInternal(int capacity, Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = CollectionsKt.createListBuilder(capacity);
        builderAction.invoke(listCreateListBuilder);
        return CollectionsKt.build(listCreateListBuilder);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final <E> List<E> createListBuilder() {
        return new ListBuilder(0, 1, null);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final <E> List<E> createListBuilder(int capacity) {
        return new ListBuilder(capacity);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final <E> List<E> build(@NotNull List<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((ListBuilder) builder).build();
    }

    @InlineOnly
    private static final <T> List<T> toList(Enumeration<T> $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        ArrayList list = Collections.list($this$toList);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        return list;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> $this$shuffled) {
        Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
        List<T> mutableList = CollectionsKt.toMutableList($this$shuffled);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> $this$shuffled, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$shuffled, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> mutableList = CollectionsKt.toMutableList($this$shuffled);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }

    @InlineOnly
    private static final Object[] collectionToArray(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        return CollectionToArray.toArray(collection);
    }

    @InlineOnly
    private static final <T> T[] collectionToArray(Collection<?> collection, T[] array) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(collection, array);
    }

    @NotNull
    public static final <T> T[] terminateCollectionToArray(int collectionSize, @NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (collectionSize < array.length) {
            array[collectionSize] = null;
        }
        return array;
    }

    @NotNull
    public static final <T> Object[] copyToArrayOfAny(@NotNull T[] $this$copyToArrayOfAny, boolean isVarargs) {
        Intrinsics.checkNotNullParameter($this$copyToArrayOfAny, "<this>");
        if (isVarargs && Intrinsics.areEqual($this$copyToArrayOfAny.getClass(), Object[].class)) {
            return $this$copyToArrayOfAny;
        }
        Object[] objArrCopyOf = Arrays.copyOf($this$copyToArrayOfAny, $this$copyToArrayOfAny.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final int checkIndexOverflow(int index) {
        if (index < 0) {
            CollectionsKt.throwIndexOverflow();
        }
        return index;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final int checkCountOverflow(int count) {
        if (count < 0) {
            CollectionsKt.throwCountOverflow();
        }
        return count;
    }
}
