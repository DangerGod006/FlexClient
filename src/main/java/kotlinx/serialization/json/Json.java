package kotlinx.serialization.json;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToStringWriter;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringJsonLexerKt;
import kotlinx.serialization.json.internal.TreeJsonDecoderKt;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/Json.class */
public abstract class Json implements StringFormat {

    @NotNull
    public static final Default Default = new Default(null);

    @NotNull
    private final JsonConfiguration configuration;

    @NotNull
    private final SerializersModule serializersModule;

    @NotNull
    private final DescriptorSchemaCache _schemaCache;

    @Deprecated(message = "Should not be accessed directly, use Json.schemaCache accessor instead", replaceWith = @ReplaceWith(expression = "schemaCache", imports = {}), level = DeprecationLevel.ERROR)
    public static /* synthetic */ void get_schemaCache$kotlinx_serialization_json$annotations() {
    }

    public /* synthetic */ Json(JsonConfiguration configuration, SerializersModule serializersModule, DefaultConstructorMarker $constructor_marker) {
        this(configuration, serializersModule);
    }

    private Json(JsonConfiguration configuration, SerializersModule serializersModule) {
        this.configuration = configuration;
        this.serializersModule = serializersModule;
        this._schemaCache = new DescriptorSchemaCache();
    }

    @NotNull
    public final JsonConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // kotlinx.serialization.SerialFormat
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @NotNull
    public final DescriptorSchemaCache get_schemaCache$kotlinx_serialization_json() {
        return this._schemaCache;
    }

    /* JADX INFO: compiled from: Json.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/Json$Default.class */
    public static final class Default extends Json {
        public /* synthetic */ Default(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Default() {
            super(new JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), SerializersModuleBuildersKt.EmptySerializersModule(), null);
        }
    }

    @Override // kotlinx.serialization.StringFormat
    @NotNull
    public final <T> String encodeToString(@NotNull SerializationStrategy<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        JsonToStringWriter result = new JsonToStringWriter();
        try {
            JsonStreamsKt.encodeByWriter(this, result, serializer, value);
            String string = result.toString();
            result.release();
            return string;
        } catch (Throwable th) {
            result.release();
            throw th;
        }
    }

    @Override // kotlinx.serialization.StringFormat
    public final <T> T decodeFromString(@NotNull DeserializationStrategy<? extends T> deserializer, @Language(value = "json", prefix = "", suffix = "") @NotNull String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        StringJsonLexer StringJsonLexer = StringJsonLexerKt.StringJsonLexer(this, string);
        T t = (T) new StreamingJsonDecoder(this, WriteMode.OBJ, StringJsonLexer, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        StringJsonLexer.expectEof();
        return t;
    }

    @NotNull
    public final <T> JsonElement encodeToJsonElement(@NotNull SerializationStrategy<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return TreeJsonEncoderKt.writeJson(this, value, serializer);
    }

    public final <T> T decodeFromJsonElement(@NotNull DeserializationStrategy<? extends T> deserializer, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        return (T) TreeJsonDecoderKt.readJson(this, element, deserializer);
    }

    @NotNull
    public final JsonElement parseToJsonElement(@Language(value = "json", prefix = "", suffix = "") @NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return (JsonElement) decodeFromString(JsonElementSerializer.INSTANCE, string);
    }

    public final /* synthetic */ <T> String encodeToString(T value) {
        SerializersModule serializersModule = getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToString(SerializersKt.serializer(serializersModule, (KType) null), value);
    }

    public final /* synthetic */ <T> T decodeFromString(@Language(value = "json", prefix = "", suffix = "") String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        SerializersModule serializersModule = getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), string);
    }
}
