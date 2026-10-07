package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonArrayBuilder.class */
@JsonDslMarker
public final class JsonArrayBuilder {

    @NotNull
    private final List<JsonElement> content = new ArrayList();

    @PublishedApi
    public JsonArrayBuilder() {
    }

    public final boolean add(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.content.add(element);
        return true;
    }

    @ExperimentalSerializationApi
    public final boolean addAll(@NotNull Collection<? extends JsonElement> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.content.addAll(elements);
    }

    @PublishedApi
    @NotNull
    public final JsonArray build() {
        return new JsonArray(this.content);
    }
}
