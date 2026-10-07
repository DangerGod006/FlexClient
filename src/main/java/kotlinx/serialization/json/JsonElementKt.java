package kotlinx.serialization.json;

import kotlin.KotlinNothingValueException;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringOpsKt;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonElementKt.class */
public final class JsonElementKt {

    @NotNull
    private static final SerialDescriptor jsonUnquotedLiteralDescriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable Boolean value) {
        return value == null ? JsonNull.INSTANCE : new JsonLiteral(value, false, null, 4, null);
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable Number value) {
        return value == null ? JsonNull.INSTANCE : new JsonLiteral(value, false, null, 4, null);
    }

    @ExperimentalSerializationApi
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-7apg3OU, reason: not valid java name */
    public static final JsonPrimitive m1895JsonPrimitive7apg3OU(byte value) {
        return m1898JsonPrimitiveVKZWuLQ(ULong.m406constructorimpl(((long) value) & 255));
    }

    @ExperimentalSerializationApi
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-xj2QHRw, reason: not valid java name */
    public static final JsonPrimitive m1896JsonPrimitivexj2QHRw(short value) {
        return m1898JsonPrimitiveVKZWuLQ(ULong.m406constructorimpl(((long) value) & 65535));
    }

    @ExperimentalSerializationApi
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-WZ4Q5Ns, reason: not valid java name */
    public static final JsonPrimitive m1897JsonPrimitiveWZ4Q5Ns(int value) {
        return m1898JsonPrimitiveVKZWuLQ(ULong.m406constructorimpl(((long) value) & 4294967295L));
    }

    @ExperimentalSerializationApi
    @SuppressAnimalSniffer
    @NotNull
    /* JADX INFO: renamed from: JsonPrimitive-VKZWuLQ, reason: not valid java name */
    public static final JsonPrimitive m1898JsonPrimitiveVKZWuLQ(long value) {
        return JsonUnquotedLiteral(Long.toUnsignedString(value));
    }

    @NotNull
    public static final JsonPrimitive JsonPrimitive(@Nullable String value) {
        return value == null ? JsonNull.INSTANCE : new JsonLiteral(value, true, null, 4, null);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final JsonNull JsonPrimitive(@Nullable Void value) {
        return JsonNull.INSTANCE;
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final JsonPrimitive JsonUnquotedLiteral(@Nullable String value) {
        if (value == null) {
            return JsonNull.INSTANCE;
        }
        if (Intrinsics.areEqual(value, JsonNull.INSTANCE.getContent())) {
            throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new JsonLiteral(value, false, jsonUnquotedLiteralDescriptor);
    }

    @NotNull
    public static final SerialDescriptor getJsonUnquotedLiteralDescriptor() {
        return jsonUnquotedLiteralDescriptor;
    }

    @NotNull
    public static final JsonPrimitive getJsonPrimitive(@NotNull JsonElement $this$jsonPrimitive) {
        Intrinsics.checkNotNullParameter($this$jsonPrimitive, "<this>");
        JsonPrimitive jsonPrimitive = $this$jsonPrimitive instanceof JsonPrimitive ? (JsonPrimitive) $this$jsonPrimitive : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        error($this$jsonPrimitive, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonObject getJsonObject(@NotNull JsonElement $this$jsonObject) {
        Intrinsics.checkNotNullParameter($this$jsonObject, "<this>");
        JsonObject jsonObject = $this$jsonObject instanceof JsonObject ? (JsonObject) $this$jsonObject : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        error($this$jsonObject, "JsonObject");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonArray getJsonArray(@NotNull JsonElement $this$jsonArray) {
        Intrinsics.checkNotNullParameter($this$jsonArray, "<this>");
        JsonArray jsonArray = $this$jsonArray instanceof JsonArray ? (JsonArray) $this$jsonArray : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        error($this$jsonArray, "JsonArray");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final JsonNull getJsonNull(@NotNull JsonElement $this$jsonNull) {
        Intrinsics.checkNotNullParameter($this$jsonNull, "<this>");
        JsonNull jsonNull = $this$jsonNull instanceof JsonNull ? (JsonNull) $this$jsonNull : null;
        if (jsonNull != null) {
            return jsonNull;
        }
        error($this$jsonNull, "JsonNull");
        throw new KotlinNothingValueException();
    }

    public static final int getInt(@NotNull JsonPrimitive $this$int) {
        Intrinsics.checkNotNullParameter($this$int, "<this>");
        try {
            long result = parseLongImpl($this$int);
            boolean z = -2147483648L <= result && result <= 2147483647L;
            if (z) {
                return (int) result;
            }
            throw new NumberFormatException($this$int.getContent() + " is not an Int");
        } catch (JsonDecodingException e$iv) {
            throw new NumberFormatException(e$iv.getMessage());
        }
    }

    @Nullable
    public static final Integer getIntOrNull(@NotNull JsonPrimitive $this$intOrNull) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter($this$intOrNull, "<this>");
        try {
            lValueOf = Long.valueOf(parseLongImpl($this$intOrNull));
        } catch (JsonDecodingException e) {
            lValueOf = null;
        }
        Long l = lValueOf;
        if (l == null) {
            return null;
        }
        long result = l.longValue();
        boolean z = -2147483648L <= result && result <= 2147483647L;
        if (z) {
            return Integer.valueOf((int) result);
        }
        return null;
    }

    public static final long getLong(@NotNull JsonPrimitive $this$long) {
        Intrinsics.checkNotNullParameter($this$long, "<this>");
        try {
            return parseLongImpl($this$long);
        } catch (JsonDecodingException e$iv) {
            throw new NumberFormatException(e$iv.getMessage());
        }
    }

    @Nullable
    public static final Long getLongOrNull(@NotNull JsonPrimitive $this$longOrNull) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter($this$longOrNull, "<this>");
        try {
            lValueOf = Long.valueOf(parseLongImpl($this$longOrNull));
        } catch (JsonDecodingException e) {
            lValueOf = null;
        }
        return lValueOf;
    }

    public static final double getDouble(@NotNull JsonPrimitive $this$double) {
        Intrinsics.checkNotNullParameter($this$double, "<this>");
        return Double.parseDouble($this$double.getContent());
    }

    @Nullable
    public static final Double getDoubleOrNull(@NotNull JsonPrimitive $this$doubleOrNull) {
        Intrinsics.checkNotNullParameter($this$doubleOrNull, "<this>");
        return StringsKt.toDoubleOrNull($this$doubleOrNull.getContent());
    }

    public static final float getFloat(@NotNull JsonPrimitive $this$float) {
        Intrinsics.checkNotNullParameter($this$float, "<this>");
        return Float.parseFloat($this$float.getContent());
    }

    @Nullable
    public static final Float getFloatOrNull(@NotNull JsonPrimitive $this$floatOrNull) {
        Intrinsics.checkNotNullParameter($this$floatOrNull, "<this>");
        return StringsKt.toFloatOrNull($this$floatOrNull.getContent());
    }

    public static final boolean getBoolean(@NotNull JsonPrimitive $this$boolean) {
        Intrinsics.checkNotNullParameter($this$boolean, "<this>");
        Boolean booleanStrictOrNull = StringOpsKt.toBooleanStrictOrNull($this$boolean.getContent());
        if (booleanStrictOrNull != null) {
            return booleanStrictOrNull.booleanValue();
        }
        throw new IllegalStateException($this$boolean + " does not represent a Boolean");
    }

    @Nullable
    public static final Boolean getBooleanOrNull(@NotNull JsonPrimitive $this$booleanOrNull) {
        Intrinsics.checkNotNullParameter($this$booleanOrNull, "<this>");
        return StringOpsKt.toBooleanStrictOrNull($this$booleanOrNull.getContent());
    }

    @Nullable
    public static final String getContentOrNull(@NotNull JsonPrimitive $this$contentOrNull) {
        Intrinsics.checkNotNullParameter($this$contentOrNull, "<this>");
        if ($this$contentOrNull instanceof JsonNull) {
            return null;
        }
        return $this$contentOrNull.getContent();
    }

    private static final Void error(JsonElement $this$error, String element) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass($this$error.getClass()) + " is not a " + element);
    }

    private static final <T> T exceptionToNull(Function0<? extends T> f) {
        T tInvoke;
        try {
            tInvoke = f.invoke();
        } catch (JsonDecodingException e) {
            tInvoke = null;
        }
        return tInvoke;
    }

    private static final <T> T exceptionToNumberFormatException(Function0<? extends T> f) {
        try {
            return f.invoke();
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    @PublishedApi
    @NotNull
    public static final Void unexpectedJson(@NotNull String key, @NotNull String expected) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(expected, "expected");
        throw new IllegalArgumentException("Element " + key + " is not a " + expected);
    }

    public static final long parseLongImpl(@NotNull JsonPrimitive $this$parseLongImpl) {
        Intrinsics.checkNotNullParameter($this$parseLongImpl, "<this>");
        return new StringJsonLexer($this$parseLongImpl.getContent()).consumeNumericLiteralFully();
    }
}
