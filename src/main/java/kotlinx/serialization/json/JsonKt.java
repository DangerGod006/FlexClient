package kotlinx.serialization.json;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonKt.class */
public final class JsonKt {

    @NotNull
    private static final String defaultIndent = "    ";

    @NotNull
    private static final String defaultDiscriminator = "type";

    public static /* synthetic */ Json Json$default(Json json, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            json = Json.Default;
        }
        return Json(json, function1);
    }

    @NotNull
    public static final Json Json(@NotNull Json from, @NotNull Function1<? super JsonBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonBuilder builder = new JsonBuilder(from);
        builderAction.invoke(builder);
        JsonConfiguration conf = builder.build$kotlinx_serialization_json();
        return new JsonImpl(conf, builder.getSerializersModule());
    }

    public static final /* synthetic */ <T> JsonElement encodeToJsonElement(Json $this$encodeToJsonElement, T value) {
        Intrinsics.checkNotNullParameter($this$encodeToJsonElement, "<this>");
        SerializersModule serializersModule = $this$encodeToJsonElement.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return $this$encodeToJsonElement.encodeToJsonElement(SerializersKt.serializer(serializersModule, (KType) null), value);
    }

    public static final /* synthetic */ <T> T decodeFromJsonElement(Json json, JsonElement json2) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(json2, "json");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) json.decodeFromJsonElement(SerializersKt.serializer(serializersModule, (KType) null), json2);
    }
}
