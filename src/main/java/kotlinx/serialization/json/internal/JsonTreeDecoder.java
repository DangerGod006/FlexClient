package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonTreeDecoder.class */
class JsonTreeDecoder extends AbstractJsonTreeDecoder {

    @NotNull
    private final JsonObject value;

    @Nullable
    private final SerialDescriptor polyDescriptor;
    private int position;
    private boolean forceNull;

    public /* synthetic */ JsonTreeDecoder(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    @NotNull
    public JsonObject getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(@NotNull Json json, @NotNull JsonObject value, @Nullable String polymorphicDiscriminator, @Nullable SerialDescriptor polyDescriptor) {
        super(json, value, polymorphicDiscriminator, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.polyDescriptor = polyDescriptor;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        boolean z;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.position < descriptor.getElementsCount()) {
            int i = this.position;
            this.position = i + 1;
            String name = getTag(descriptor, i);
            int index = this.position - 1;
            this.forceNull = false;
            if (getValue().containsKey((Object) name) || setForceNull(descriptor, index)) {
                if (!this.configuration.getCoerceInputValues()) {
                    return index;
                }
                Json $this$tryCoerceValue$iv = getJson();
                boolean isOptional$iv = descriptor.isElementOptional(index);
                SerialDescriptor elementDescriptor$iv = descriptor.getElementDescriptor(index);
                if (isOptional$iv && !elementDescriptor$iv.isNullable() && (currentElementOrNull(name) instanceof JsonNull)) {
                    z = true;
                } else if (Intrinsics.areEqual(elementDescriptor$iv.getKind(), SerialKind.ENUM.INSTANCE) && (!elementDescriptor$iv.isNullable() || !(currentElementOrNull(name) instanceof JsonNull))) {
                    JsonElement jsonElementCurrentElementOrNull = currentElementOrNull(name);
                    JsonPrimitive jsonPrimitive = jsonElementCurrentElementOrNull instanceof JsonPrimitive ? (JsonPrimitive) jsonElementCurrentElementOrNull : null;
                    String contentOrNull = jsonPrimitive != null ? JsonElementKt.getContentOrNull(jsonPrimitive) : null;
                    if (contentOrNull != null) {
                        String enumValue$iv = contentOrNull;
                        int enumIndex$iv = JsonNamesMapKt.getJsonNameIndex(elementDescriptor$iv, $this$tryCoerceValue$iv, enumValue$iv);
                        boolean coerceToNull$iv = !$this$tryCoerceValue$iv.getConfiguration().getExplicitNulls() && elementDescriptor$iv.isNullable();
                        if (enumIndex$iv == -3 && (isOptional$iv || coerceToNull$iv)) {
                            if (setForceNull(descriptor, index)) {
                                return index;
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return index;
                }
            }
        }
        return -1;
    }

    private final boolean setForceNull(SerialDescriptor descriptor, int index) {
        this.forceNull = (getJson().getConfiguration().getExplicitNulls() || descriptor.isElementOptional(index) || !descriptor.getElementDescriptor(index).isNullable()) ? false : true;
        return this.forceNull;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !this.forceNull && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    @NotNull
    protected String elementName(@NotNull SerialDescriptor descriptor, int index) {
        Object obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonNamingStrategy strategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
        String baseName = descriptor.getElementName(index);
        if (strategy != null || (this.configuration.getUseAlternativeNames() && !getValue().keySet().contains(baseName))) {
            Map<String, Integer> mapDeserializationNamesMap = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor);
            Iterator<T> it = getValue().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it.next();
                Integer num = mapDeserializationNamesMap.get((String) next);
                if (num != null && num.intValue() == index) {
                    obj = next;
                    break;
                }
            }
            String it2 = (String) obj;
            if (it2 != null) {
                return it2;
            }
            String fallbackName = strategy != null ? strategy.serialNameForJson(descriptor, index, baseName) : null;
            return fallbackName == null ? baseName : fallbackName;
        }
        return baseName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    @NotNull
    public JsonElement currentElement(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) MapsKt.getValue(getValue(), tag);
    }

    @Nullable
    public final JsonElement currentElementOrNull(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) getValue().get((Object) tag);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor == this.polyDescriptor) {
            Json json = getJson();
            JsonTreeDecoder this_$iv = this;
            JsonElement value$iv = currentObject();
            SerialDescriptor descriptor$iv = this.polyDescriptor;
            String serialName$iv$iv = descriptor$iv.getSerialName();
            if (value$iv instanceof JsonObject) {
                return new JsonTreeDecoder(json, (JsonObject) value$iv, getPolymorphicDiscriminator(), this.polyDescriptor);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv.getClass()).getSimpleName() + " as the serialized body of " + serialName$iv$iv + " at element: " + this_$iv.renderTagStack(), value$iv.toString());
        }
        return super.beginStructure(descriptor);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Set<String> setPlus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (JsonNamesMapKt.ignoreUnknownKeys(descriptor, getJson()) || (descriptor.getKind() instanceof PolymorphicKind)) {
            return;
        }
        JsonNamingStrategy strategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
        if (strategy == null && !this.configuration.getUseAlternativeNames()) {
            setPlus = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
        } else if (strategy != null) {
            setPlus = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor).keySet();
        } else {
            Set<String> setJsonCachedSerialNames = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
            Map map = (Map) JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, JsonNamesMapKt.getJsonDeserializationNamesKey());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = SetsKt.emptySet();
            }
            setPlus = SetsKt.plus((Set) setJsonCachedSerialNames, (Iterable) setKeySet);
        }
        Set<String> set = setPlus;
        for (String key : getValue().keySet()) {
            if (!set.contains(key) && !Intrinsics.areEqual(key, getPolymorphicDiscriminator())) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Encountered an unknown key '" + key + "' at element: " + renderTagStack() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) JsonExceptionsKt.minify$default(getValue().toString(), 0, 1, null)));
            }
        }
    }
}
