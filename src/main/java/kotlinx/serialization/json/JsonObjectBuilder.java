package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonObjectBuilder.class */
@JsonDslMarker
public final class JsonObjectBuilder {

    @NotNull
    private final Map<String, JsonElement> content = new LinkedHashMap();

    @PublishedApi
    public JsonObjectBuilder() {
    }

    @Nullable
    public final JsonElement put(@NotNull String key, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return this.content.put(key, element);
    }

    @PublishedApi
    @NotNull
    public final JsonObject build() {
        return new JsonObject(this.content);
    }
}
