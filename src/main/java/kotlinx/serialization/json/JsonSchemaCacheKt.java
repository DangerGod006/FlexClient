package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonSchemaCache.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonSchemaCacheKt.class */
public final class JsonSchemaCacheKt {
    public static /* synthetic */ void getSchemaCache$annotations(Json json) {
    }

    @NotNull
    public static final DescriptorSchemaCache getSchemaCache(@NotNull Json $this$schemaCache) {
        Intrinsics.checkNotNullParameter($this$schemaCache, "<this>");
        return $this$schemaCache.get_schemaCache$kotlinx_serialization_json();
    }
}
