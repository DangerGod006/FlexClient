package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonElementBuildersKt.class */
public final class JsonElementBuildersKt {
    @NotNull
    public static final JsonObject buildJsonObject(@NotNull Function1<? super JsonObjectBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonObjectBuilder builder = new JsonObjectBuilder();
        builderAction.invoke(builder);
        return builder.build();
    }

    @NotNull
    public static final JsonArray buildJsonArray(@NotNull Function1<? super JsonArrayBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonArrayBuilder builder = new JsonArrayBuilder();
        builderAction.invoke(builder);
        return builder.build();
    }

    @Nullable
    public static final JsonElement putJsonObject(@NotNull JsonObjectBuilder $this$putJsonObject, @NotNull String key, @NotNull Function1<? super JsonObjectBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter($this$putJsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonObjectBuilder builder$iv = new JsonObjectBuilder();
        builderAction.invoke(builder$iv);
        return $this$putJsonObject.put(key, builder$iv.build());
    }

    @Nullable
    public static final JsonElement putJsonArray(@NotNull JsonObjectBuilder $this$putJsonArray, @NotNull String key, @NotNull Function1<? super JsonArrayBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter($this$putJsonArray, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonArrayBuilder builder$iv = new JsonArrayBuilder();
        builderAction.invoke(builder$iv);
        return $this$putJsonArray.put(key, builder$iv.build());
    }

    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder $this$put, @NotNull String key, @Nullable Boolean value) {
        Intrinsics.checkNotNullParameter($this$put, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return $this$put.put(key, JsonElementKt.JsonPrimitive(value));
    }

    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder $this$put, @NotNull String key, @Nullable Number value) {
        Intrinsics.checkNotNullParameter($this$put, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return $this$put.put(key, JsonElementKt.JsonPrimitive(value));
    }

    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder $this$put, @NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter($this$put, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return $this$put.put(key, JsonElementKt.JsonPrimitive(value));
    }

    @ExperimentalSerializationApi
    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder $this$put, @NotNull String key, @Nullable Void value) {
        Intrinsics.checkNotNullParameter($this$put, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return $this$put.put(key, JsonNull.INSTANCE);
    }

    public static final boolean add(@NotNull JsonArrayBuilder $this$add, @Nullable Boolean value) {
        Intrinsics.checkNotNullParameter($this$add, "<this>");
        return $this$add.add(JsonElementKt.JsonPrimitive(value));
    }

    public static final boolean add(@NotNull JsonArrayBuilder $this$add, @Nullable Number value) {
        Intrinsics.checkNotNullParameter($this$add, "<this>");
        return $this$add.add(JsonElementKt.JsonPrimitive(value));
    }

    public static final boolean add(@NotNull JsonArrayBuilder $this$add, @Nullable String value) {
        Intrinsics.checkNotNullParameter($this$add, "<this>");
        return $this$add.add(JsonElementKt.JsonPrimitive(value));
    }

    @ExperimentalSerializationApi
    public static final boolean add(@NotNull JsonArrayBuilder $this$add, @Nullable Void value) {
        Intrinsics.checkNotNullParameter($this$add, "<this>");
        return $this$add.add(JsonNull.INSTANCE);
    }

    public static final boolean addJsonObject(@NotNull JsonArrayBuilder $this$addJsonObject, @NotNull Function1<? super JsonObjectBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter($this$addJsonObject, "<this>");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonObjectBuilder builder$iv = new JsonObjectBuilder();
        builderAction.invoke(builder$iv);
        return $this$addJsonObject.add(builder$iv.build());
    }

    public static final boolean addJsonArray(@NotNull JsonArrayBuilder $this$addJsonArray, @NotNull Function1<? super JsonArrayBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter($this$addJsonArray, "<this>");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonArrayBuilder builder$iv = new JsonArrayBuilder();
        builderAction.invoke(builder$iv);
        return $this$addJsonArray.add(builder$iv.build());
    }

    @ExperimentalSerializationApi
    @JvmName(name = "addAllStrings")
    public static final boolean addAllStrings(@NotNull JsonArrayBuilder $this$addAll, @NotNull Collection<String> values) {
        Intrinsics.checkNotNullParameter($this$addAll, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        Collection<String> $this$map$iv = values;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String p0 = (String) item$iv$iv;
            destination$iv$iv.add(JsonElementKt.JsonPrimitive(p0));
        }
        return $this$addAll.addAll((List) destination$iv$iv);
    }

    @ExperimentalSerializationApi
    @JvmName(name = "addAllBooleans")
    public static final boolean addAllBooleans(@NotNull JsonArrayBuilder $this$addAll, @NotNull Collection<Boolean> values) {
        Intrinsics.checkNotNullParameter($this$addAll, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        Collection<Boolean> $this$map$iv = values;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Boolean p0 = (Boolean) item$iv$iv;
            destination$iv$iv.add(JsonElementKt.JsonPrimitive(p0));
        }
        return $this$addAll.addAll((List) destination$iv$iv);
    }

    @ExperimentalSerializationApi
    @JvmName(name = "addAllNumbers")
    public static final boolean addAllNumbers(@NotNull JsonArrayBuilder $this$addAll, @NotNull Collection<? extends Number> values) {
        Intrinsics.checkNotNullParameter($this$addAll, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        Collection<? extends Number> $this$map$iv = values;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Number p0 = (Number) item$iv$iv;
            destination$iv$iv.add(JsonElementKt.JsonPrimitive(p0));
        }
        return $this$addAll.addAll((List) destination$iv$iv);
    }
}
