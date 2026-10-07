package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/AbstractJsonTreeDecoder.class */
abstract class AbstractJsonTreeDecoder extends NamedValueDecoder implements JsonDecoder {

    @NotNull
    private final Json json;

    @NotNull
    private final JsonElement value;

    @Nullable
    private final String polymorphicDiscriminator;

    @JvmField
    @NotNull
    protected final JsonConfiguration configuration;

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public abstract JsonElement currentElement(@NotNull String str);

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement value, String polymorphicDiscriminator, DefaultConstructorMarker $constructor_marker) {
        this(json, value, polymorphicDiscriminator);
    }

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, (i & 4) != 0 ? null : str, null);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public Json getJson() {
        return this.json;
    }

    @NotNull
    public JsonElement getValue() {
        return this.value;
    }

    @Nullable
    protected final String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    private AbstractJsonTreeDecoder(Json json, JsonElement value, String polymorphicDiscriminator) {
        this.json = json;
        this.value = value;
        this.polymorphicDiscriminator = polymorphicDiscriminator;
        this.configuration = getJson().getConfiguration();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return getJson().getSerializersModule();
    }

    @NotNull
    protected final JsonElement currentObject() {
        String it = getCurrentTagOrNull();
        if (it != null) {
            JsonElement jsonElementCurrentElement = currentElement(it);
            if (jsonElementCurrentElement != null) {
                return jsonElementCurrentElement;
            }
        }
        return getValue();
    }

    @NotNull
    public final String renderTagStack(@NotNull String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return renderTagStack() + '.' + currentTag;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public JsonElement decodeJsonElement() {
        return currentObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb  */
    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T decodeSerializableValue(@org.jetbrains.annotations.NotNull kotlinx.serialization.DeserializationStrategy<? extends T> r6) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonTreeDecoder.decodeSerializableValue(kotlinx.serialization.DeserializationStrategy):java.lang.Object");
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    @NotNull
    protected String composeName(@NotNull String parentName, @NotNull String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
        CompositeDecoder jsonTreeMapDecoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement currentObject = currentObject();
        SerialKind kind = descriptor.getKind();
        if (!Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) && !(kind instanceof PolymorphicKind)) {
            if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
                Json $this$selectMapMode$iv = getJson();
                SerialDescriptor keyDescriptor$iv = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), $this$selectMapMode$iv.getSerializersModule());
                SerialKind keyKind$iv = keyDescriptor$iv.getKind();
                if ((keyKind$iv instanceof PrimitiveKind) || Intrinsics.areEqual(keyKind$iv, SerialKind.ENUM.INSTANCE)) {
                    Json json = getJson();
                    String serialName$iv$iv = descriptor.getSerialName();
                    if (currentObject instanceof JsonObject) {
                        jsonTreeMapDecoder = new JsonTreeMapDecoder(json, (JsonObject) currentObject);
                    } else {
                        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName$iv$iv + " at element: " + renderTagStack(), currentObject.toString());
                    }
                } else if ($this$selectMapMode$iv.getConfiguration().getAllowStructuredMapKeys()) {
                    Json json2 = getJson();
                    String serialName$iv$iv2 = descriptor.getSerialName();
                    if (currentObject instanceof JsonArray) {
                        jsonTreeMapDecoder = new JsonTreeListDecoder(json2, (JsonArray) currentObject);
                    } else {
                        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName$iv$iv2 + " at element: " + renderTagStack(), currentObject.toString());
                    }
                } else {
                    throw JsonExceptionsKt.InvalidKeyKindException(keyDescriptor$iv);
                }
                return jsonTreeMapDecoder;
            }
            Json json3 = getJson();
            String serialName$iv$iv3 = descriptor.getSerialName();
            if (currentObject instanceof JsonObject) {
                return new JsonTreeDecoder(json3, (JsonObject) currentObject, this.polymorphicDiscriminator, null, 8, null);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName$iv$iv3 + " at element: " + renderTagStack(), currentObject.toString());
        }
        Json json4 = getJson();
        String serialName$iv$iv4 = descriptor.getSerialName();
        if (currentObject instanceof JsonArray) {
            return new JsonTreeListDecoder(json4, (JsonArray) currentObject);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName$iv$iv4 + " at element: " + renderTagStack(), currentObject.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String serialName$iv = descriptor.getSerialName();
        Intrinsics.reifiedOperationMarker(3, "T");
        if (!(value instanceof JsonElement)) {
            StringBuilder sbAppend = new StringBuilder().append("Expected ");
            Intrinsics.reifiedOperationMarker(4, "T");
            throw JsonExceptionsKt.JsonDecodingException(-1, sbAppend.append(Reflection.getOrCreateKotlinClass(JsonElement.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv).append(" at element: ").append(renderTagStack()).toString(), value.toString());
        }
        return value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, String serialName, String tag) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.reifiedOperationMarker(3, "T");
        if (!(value instanceof JsonElement)) {
            StringBuilder sbAppend = new StringBuilder().append("Expected ");
            Intrinsics.reifiedOperationMarker(4, "T");
            throw JsonExceptionsKt.JsonDecodingException(-1, sbAppend.append(Reflection.getOrCreateKotlinClass(JsonElement.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName).append(" at element: ").append(renderTagStack(tag)).toString(), value.toString());
        }
        return value;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(currentObject() instanceof JsonNull);
    }

    @NotNull
    protected final JsonPrimitive getPrimitiveValue(@NotNull String tag, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement value$iv = currentElement(tag);
        String serialName$iv = descriptor.getSerialName();
        if (!(value$iv instanceof JsonPrimitive)) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv.getClass()).getSimpleName() + " as the serialized body of " + serialName$iv + " at element: " + renderTagStack(tag), value$iv.toString());
        }
        return (JsonPrimitive) value$iv;
    }

    private final <T> T getPrimitiveValue(String tag, String primitiveName, Function1<? super JsonPrimitive, ? extends T> convert) {
        JsonElement value$iv = currentElement(tag);
        if (value$iv instanceof JsonPrimitive) {
            JsonPrimitive literal = (JsonPrimitive) value$iv;
            try {
                T tInvoke = convert.invoke(literal);
                if (tInvoke != null) {
                    return tInvoke;
                }
                unparsedPrimitive(literal, primitiveName, tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException e) {
                unparsedPrimitive(literal, primitiveName, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv.getClass()).getSimpleName() + " as the serialized body of " + primitiveName + " at element: " + renderTagStack(tag), value$iv.toString());
    }

    private final Void unparsedPrimitive(JsonPrimitive literal, String primitive, String tag) {
        String type = StringsKt.startsWith$default(primitive, "i", false, 2, (Object) null) ? "an " + primitive : "a " + primitive;
        throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse literal '" + literal + "' as " + type + " value at element: " + renderTagStack(tag), currentObject().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedEnum(@NotNull String tag, @NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Json json = getJson();
        JsonElement value$iv$iv = currentElement(tag);
        String serialName$iv$iv = enumDescriptor.getSerialName();
        if (value$iv$iv instanceof JsonPrimitive) {
            return JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, json, ((JsonPrimitive) value$iv$iv).getContent(), null, 4, null);
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName() + " as the serialized body of " + serialName$iv$iv + " at element: " + renderTagStack(tag), value$iv$iv.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    @Nullable
    public Void decodeTaggedNull(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedNotNullMark(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return currentElement(tag) != JsonNull.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedBoolean(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement value$iv$iv = currentElement(tag);
        if (value$iv$iv instanceof JsonPrimitive) {
            JsonPrimitive literal$iv = (JsonPrimitive) value$iv$iv;
            try {
                Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(literal$iv);
                if (booleanOrNull != null) {
                    return booleanOrNull.booleanValue();
                }
                unparsedPrimitive(literal$iv, "boolean", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException e) {
                unparsedPrimitive(literal$iv, "boolean", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName() + " as the serialized body of boolean at element: " + renderTagStack(tag), value$iv$iv.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public byte decodeTaggedByte(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement value$iv$iv = currentElement(tag);
        if (value$iv$iv instanceof JsonPrimitive) {
            JsonPrimitive literal$iv = (JsonPrimitive) value$iv$iv;
            try {
                long result = JsonElementKt.parseLongImpl(literal$iv);
                boolean z = -128 <= result && result <= 127;
                Byte bValueOf = z ? Byte.valueOf((byte) result) : null;
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                unparsedPrimitive(literal$iv, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException e) {
                unparsedPrimitive(literal$iv, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName() + " as the serialized body of byte at element: " + renderTagStack(tag), value$iv$iv.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public short decodeTaggedShort(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement value$iv$iv = currentElement(tag);
        if (value$iv$iv instanceof JsonPrimitive) {
            JsonPrimitive literal$iv = (JsonPrimitive) value$iv$iv;
            try {
                long result = JsonElementKt.parseLongImpl(literal$iv);
                boolean z = -32768 <= result && result <= 32767;
                Short shValueOf = z ? Short.valueOf((short) result) : null;
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                unparsedPrimitive(literal$iv, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException e) {
                unparsedPrimitive(literal$iv, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName() + " as the serialized body of short at element: " + renderTagStack(tag), value$iv$iv.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedInt(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement value$iv$iv = currentElement(tag);
        if (value$iv$iv instanceof JsonPrimitive) {
            JsonPrimitive literal$iv = (JsonPrimitive) value$iv$iv;
            try {
                long result = JsonElementKt.parseLongImpl(literal$iv);
                boolean z = -2147483648L <= result && result <= 2147483647L;
                Integer numValueOf = z ? Integer.valueOf((int) result) : null;
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                unparsedPrimitive(literal$iv, "int", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException e) {
                unparsedPrimitive(literal$iv, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName() + " as the serialized body of int at element: " + renderTagStack(tag), value$iv$iv.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public long decodeTaggedLong(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement value$iv$iv = currentElement(tag);
        if (value$iv$iv instanceof JsonPrimitive) {
            JsonPrimitive literal$iv = (JsonPrimitive) value$iv$iv;
            try {
                return JsonElementKt.parseLongImpl(literal$iv);
            } catch (IllegalArgumentException e) {
                unparsedPrimitive(literal$iv, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName() + " as the serialized body of long at element: " + renderTagStack(tag), value$iv$iv.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public float decodeTaggedFloat(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement value$iv$iv = currentElement(tag);
        if (value$iv$iv instanceof JsonPrimitive) {
            JsonPrimitive literal$iv = (JsonPrimitive) value$iv$iv;
            try {
                float result = JsonElementKt.getFloat(literal$iv);
                boolean specialFp = getJson().getConfiguration().getAllowSpecialFloatingPointValues();
                if (!specialFp) {
                    if (!(Math.abs(result) <= Float.MAX_VALUE)) {
                        throw JsonExceptionsKt.InvalidFloatingPointDecoded(Float.valueOf(result), tag, currentObject().toString());
                    }
                }
                return result;
            } catch (IllegalArgumentException e) {
                unparsedPrimitive(literal$iv, "float", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName() + " as the serialized body of float at element: " + renderTagStack(tag), value$iv$iv.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public double decodeTaggedDouble(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement value$iv$iv = currentElement(tag);
        if (value$iv$iv instanceof JsonPrimitive) {
            JsonPrimitive literal$iv = (JsonPrimitive) value$iv$iv;
            try {
                double result = JsonElementKt.getDouble(literal$iv);
                boolean specialFp = getJson().getConfiguration().getAllowSpecialFloatingPointValues();
                if (!specialFp) {
                    if (!(Math.abs(result) <= Double.MAX_VALUE)) {
                        throw JsonExceptionsKt.InvalidFloatingPointDecoded(Double.valueOf(result), tag, currentObject().toString());
                    }
                }
                return result;
            } catch (IllegalArgumentException e) {
                unparsedPrimitive(literal$iv, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName() + " as the serialized body of double at element: " + renderTagStack(tag), value$iv$iv.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public char decodeTaggedChar(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement value$iv$iv = currentElement(tag);
        if (value$iv$iv instanceof JsonPrimitive) {
            JsonPrimitive literal$iv = (JsonPrimitive) value$iv$iv;
            try {
                return StringsKt.single(literal$iv.getContent());
            } catch (IllegalArgumentException e) {
                unparsedPrimitive(literal$iv, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName() + " as the serialized body of char at element: " + renderTagStack(tag), value$iv$iv.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    @NotNull
    public String decodeTaggedString(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement value$iv = currentElement(tag);
        if (value$iv instanceof JsonPrimitive) {
            JsonPrimitive value = (JsonPrimitive) value$iv;
            if (!(value instanceof JsonLiteral)) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + renderTagStack(tag), currentObject().toString());
            }
            if (!((JsonLiteral) value).isString() && !getJson().getConfiguration().isLenient()) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "String literal for key '" + tag + "' should be quoted at element: " + renderTagStack(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", currentObject().toString());
            }
            return ((JsonLiteral) value).getContent();
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv.getClass()).getSimpleName() + " as the serialized body of string at element: " + renderTagStack(tag), value$iv.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    @NotNull
    public Decoder decodeTaggedInline(@NotNull String tag, @NotNull SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            Json json = getJson();
            JsonElement value$iv$iv = currentElement(tag);
            String serialName$iv$iv = inlineDescriptor.getSerialName();
            if (value$iv$iv instanceof JsonPrimitive) {
                StringJsonLexer lexer = StringJsonLexerKt.StringJsonLexer(json, ((JsonPrimitive) value$iv$iv).getContent());
                return new JsonDecoderForUnsignedTypes(lexer, getJson());
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(value$iv$iv.getClass()).getSimpleName() + " as the serialized body of " + serialName$iv$iv + " at element: " + renderTagStack(tag), value$iv$iv.toString());
        }
        return super.decodeTaggedInline(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return getCurrentTagOrNull() != null ? super.decodeInline(descriptor) : new JsonPrimitiveDecoder(getJson(), getValue(), this.polymorphicDiscriminator).decodeInline(descriptor);
    }
}
