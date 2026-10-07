package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.internal.StringOpsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonObject.class */
@Serializable(with = JsonObjectSerializer.class)
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, KMappedMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Map<String, JsonElement> content;

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    public boolean containsKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.content.containsKey(key);
    }

    public boolean containsValue(@NotNull JsonElement value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.content.containsValue(value);
    }

    @Nullable
    public JsonElement get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.content.get(key);
    }

    public int getSize() {
        return this.content.size();
    }

    @NotNull
    public Set<String> getKeys() {
        return this.content.keySet();
    }

    @NotNull
    public Collection<JsonElement> getValues() {
        return this.content.values();
    }

    @NotNull
    public Set<Map.Entry<String, JsonElement>> getEntries() {
        return this.content.entrySet();
    }

    /* JADX INFO: renamed from: put, reason: avoid collision after fix types in other method */
    public JsonElement put2(String key, JsonElement value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public JsonElement remove(Object key) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object key, Object value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends JsonElement> from) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> p0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public JsonElement putIfAbsent2(String p0, JsonElement p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(String p0, JsonElement p1, JsonElement p2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: replace, reason: avoid collision after fix types in other method */
    public JsonElement replace2(String p0, JsonElement p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public JsonElement computeIfAbsent2(String p0, Function<? super String, ? extends JsonElement> p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public JsonElement computeIfPresent2(String p0, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: compute, reason: avoid collision after fix types in other method */
    public JsonElement compute2(String p0, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: merge, reason: avoid collision after fix types in other method */
    public JsonElement merge2(String p0, JsonElement p1, BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> p2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement put(String key, JsonElement value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement putIfAbsent(String p0, JsonElement p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String p0, JsonElement p1, JsonElement p2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement replace(String p0, JsonElement p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement computeIfAbsent(String p0, Function<? super String, ? extends JsonElement> p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement computeIfPresent(String p0, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement compute(String p0, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement merge(String p0, JsonElement p1, BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> p2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: compiled from: JsonElement.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonObject$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        @NotNull
        public final KSerializer<JsonObject> serializer() {
            return JsonObjectSerializer.INSTANCE;
        }
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object key) {
        if (key instanceof String) {
            return containsKey((String) key);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object value) {
        if (value instanceof JsonElement) {
            return containsValue((JsonElement) value);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement get(Object key) {
        if (key instanceof String) {
            return get((String) key);
        }
        return null;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
    public final /* bridge */ JsonElement get2(Object key) {
        if (key instanceof String) {
            return get((String) key);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<JsonElement> values() {
        return getValues();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, JsonElement>> entrySet() {
        return getEntries();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(@NotNull Map<String, ? extends JsonElement> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        return Intrinsics.areEqual(this.content, other);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(this.content.entrySet(), ",", "{", "}", 0, null, JsonObject::toString$lambda$1, 24, null);
    }

    private static final CharSequence toString$lambda$1(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String k = (String) entry.getKey();
        JsonElement v = (JsonElement) entry.getValue();
        StringBuilder $this$toString_u24lambda_u241_u24lambda_u240 = new StringBuilder();
        StringOpsKt.printQuoted($this$toString_u24lambda_u241_u24lambda_u240, k);
        $this$toString_u24lambda_u241_u24lambda_u240.append(':');
        $this$toString_u24lambda_u241_u24lambda_u240.append(v);
        return $this$toString_u24lambda_u241_u24lambda_u240.toString();
    }
}
