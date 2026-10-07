package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonIgnoreUnknownKeys;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonNamesMap.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonNamesMapKt.class */
public final class JsonNamesMapKt {

    @NotNull
    private static final DescriptorSchemaCache.Key<Map<String, Integer>> JsonDeserializationNamesKey = new DescriptorSchemaCache.Key<>();

    @NotNull
    private static final DescriptorSchemaCache.Key<String[]> JsonSerializationNamesKey = new DescriptorSchemaCache.Key<>();

    @NotNull
    public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonDeserializationNamesKey() {
        return JsonDeserializationNamesKey;
    }

    @NotNull
    public static final DescriptorSchemaCache.Key<String[]> getJsonSerializationNamesKey() {
        return JsonSerializationNamesKey;
    }

    private static final void buildDeserializationNamesMap$putOrThrow(Map<String, Integer> $this$buildDeserializationNamesMap_u24putOrThrow, SerialDescriptor $this_buildDeserializationNamesMap, String name, int index) {
        String entity = Intrinsics.areEqual($this_buildDeserializationNamesMap.getKind(), SerialKind.ENUM.INSTANCE) ? "enum value" : "property";
        if ($this$buildDeserializationNamesMap_u24putOrThrow.containsKey(name)) {
            throw new JsonException("The suggested name '" + name + "' for " + entity + ' ' + $this_buildDeserializationNamesMap.getElementName(index) + " is already one of the names for " + entity + ' ' + $this_buildDeserializationNamesMap.getElementName(((Number) MapsKt.getValue($this$buildDeserializationNamesMap_u24putOrThrow, name)).intValue()) + " in " + $this_buildDeserializationNamesMap);
        }
        $this$buildDeserializationNamesMap_u24putOrThrow.put(name, Integer.valueOf(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Integer> buildDeserializationNamesMap(SerialDescriptor $this$buildDeserializationNamesMap, Json json) {
        String strSerialNameForJson;
        String[] strArrNames;
        String lowerCase;
        Map builder = new LinkedHashMap();
        boolean useLowercaseEnums = decodeCaseInsensitive(json, $this$buildDeserializationNamesMap);
        JsonNamingStrategy strategyForClasses = namingStrategy($this$buildDeserializationNamesMap, json);
        int elementsCount = $this$buildDeserializationNamesMap.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            Iterable $this$filterIsInstance$iv = $this$buildDeserializationNamesMap.getElementAnnotations(i);
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filterIsInstance$iv) {
                if (element$iv$iv instanceof JsonNames) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            JsonNames jsonNames = (JsonNames) CollectionsKt.singleOrNull((List) destination$iv$iv);
            if (jsonNames != null && (strArrNames = jsonNames.names()) != null) {
                for (String str : strArrNames) {
                    if (useLowercaseEnums) {
                        lowerCase = str.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = str;
                    }
                    buildDeserializationNamesMap$putOrThrow(builder, $this$buildDeserializationNamesMap, lowerCase, i);
                }
            }
            if (useLowercaseEnums) {
                strSerialNameForJson = $this$buildDeserializationNamesMap.getElementName(i).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(strSerialNameForJson, "toLowerCase(...)");
            } else {
                strSerialNameForJson = strategyForClasses != null ? strategyForClasses.serialNameForJson($this$buildDeserializationNamesMap, i, $this$buildDeserializationNamesMap.getElementName(i)) : null;
            }
            String nameToPut = strSerialNameForJson;
            if (nameToPut != null) {
                buildDeserializationNamesMap$putOrThrow(builder, $this$buildDeserializationNamesMap, nameToPut, i);
            }
        }
        return builder.isEmpty() ? MapsKt.emptyMap() : builder;
    }

    @NotNull
    public static final Map<String, Integer> deserializationNamesMap(@NotNull Json $this$deserializationNamesMap, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter($this$deserializationNamesMap, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) JsonSchemaCacheKt.getSchemaCache($this$deserializationNamesMap).getOrPut(descriptor, JsonDeserializationNamesKey, () -> {
            return deserializationNamesMap$lambda$3(r3, r4);
        });
    }

    private static final Map deserializationNamesMap$lambda$3(SerialDescriptor $descriptor, Json $this_deserializationNamesMap) {
        return buildDeserializationNamesMap($descriptor, $this_deserializationNamesMap);
    }

    @NotNull
    public static final String[] serializationNamesIndices(@NotNull SerialDescriptor $this$serializationNamesIndices, @NotNull Json json, @NotNull JsonNamingStrategy strategy) {
        Intrinsics.checkNotNullParameter($this$serializationNamesIndices, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return (String[]) JsonSchemaCacheKt.getSchemaCache(json).getOrPut($this$serializationNamesIndices, JsonSerializationNamesKey, () -> {
            return serializationNamesIndices$lambda$4(r3, r4);
        });
    }

    private static final String[] serializationNamesIndices$lambda$4(SerialDescriptor $this_serializationNamesIndices, JsonNamingStrategy $strategy) {
        int elementsCount = $this_serializationNamesIndices.getElementsCount();
        String[] strArr = new String[elementsCount];
        for (int i = 0; i < elementsCount; i++) {
            int i2 = i;
            String baseName = $this_serializationNamesIndices.getElementName(i2);
            strArr[i2] = $strategy.serialNameForJson($this_serializationNamesIndices, i2, baseName);
        }
        return strArr;
    }

    @NotNull
    public static final String getJsonElementName(@NotNull SerialDescriptor $this$getJsonElementName, @NotNull Json json, int index) {
        Intrinsics.checkNotNullParameter($this$getJsonElementName, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        JsonNamingStrategy strategy = namingStrategy($this$getJsonElementName, json);
        return strategy == null ? $this$getJsonElementName.getElementName(index) : serializationNamesIndices($this$getJsonElementName, json, strategy)[index];
    }

    @Nullable
    public static final JsonNamingStrategy namingStrategy(@NotNull SerialDescriptor $this$namingStrategy, @NotNull Json json) {
        Intrinsics.checkNotNullParameter($this$namingStrategy, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual($this$namingStrategy.getKind(), StructureKind.CLASS.INSTANCE)) {
            return json.getConfiguration().getNamingStrategy();
        }
        return null;
    }

    private static final int getJsonNameIndexSlowPath(SerialDescriptor $this$getJsonNameIndexSlowPath, Json json, String name) {
        Integer num = deserializationNamesMap(json, $this$getJsonNameIndexSlowPath).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private static final boolean decodeCaseInsensitive(Json $this$decodeCaseInsensitive, SerialDescriptor descriptor) {
        return $this$decodeCaseInsensitive.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.areEqual(descriptor.getKind(), SerialKind.ENUM.INSTANCE);
    }

    public static final int getJsonNameIndex(@NotNull SerialDescriptor $this$getJsonNameIndex, @NotNull Json json, @NotNull String name) {
        Intrinsics.checkNotNullParameter($this$getJsonNameIndex, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        if (decodeCaseInsensitive(json, $this$getJsonNameIndex)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return getJsonNameIndexSlowPath($this$getJsonNameIndex, json, lowerCase);
        }
        JsonNamingStrategy strategy = namingStrategy($this$getJsonNameIndex, json);
        if (strategy != null) {
            return getJsonNameIndexSlowPath($this$getJsonNameIndex, json, name);
        }
        int index = $this$getJsonNameIndex.getElementIndex(name);
        if (index == -3 && json.getConfiguration().getUseAlternativeNames()) {
            return getJsonNameIndexSlowPath($this$getJsonNameIndex, json, name);
        }
        return index;
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(serialDescriptor, json, str, str2);
    }

    public static final int getJsonNameIndexOrThrow(@NotNull SerialDescriptor $this$getJsonNameIndexOrThrow, @NotNull Json json, @NotNull String name, @NotNull String suffix) {
        Intrinsics.checkNotNullParameter($this$getJsonNameIndexOrThrow, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int index = getJsonNameIndex($this$getJsonNameIndexOrThrow, json, name);
        if (index == -3) {
            throw new SerializationException($this$getJsonNameIndexOrThrow.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
        }
        return index;
    }

    public static /* synthetic */ boolean tryCoerceValue$default(Json $this$tryCoerceValue_u24default, SerialDescriptor descriptor, int index, Function1 peekNull, Function0 peekString, Function0 onEnumCoercing, int $i$f$tryCoerceValue, Object isOptional) {
        String enumValue;
        if (($i$f$tryCoerceValue & 16) != 0) {
            onEnumCoercing = new Function0<Unit>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter($this$tryCoerceValue_u24default, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        Intrinsics.checkNotNullParameter(peekString, "peekString");
        Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        boolean isOptional2 = descriptor.isElementOptional(index);
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
        if (isOptional2 && !elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(true)).booleanValue()) {
            return true;
        }
        if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
            if ((elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(false)).booleanValue()) || (enumValue = (String) peekString.invoke()) == null) {
                return false;
            }
            int enumIndex = getJsonNameIndex(elementDescriptor, $this$tryCoerceValue_u24default, enumValue);
            boolean coerceToNull = !$this$tryCoerceValue_u24default.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
            if (enumIndex != -3) {
                return false;
            }
            if (isOptional2 || coerceToNull) {
                onEnumCoercing.invoke();
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean tryCoerceValue(@NotNull Json $this$tryCoerceValue, @NotNull SerialDescriptor descriptor, int index, @NotNull Function1<? super Boolean, Boolean> peekNull, @NotNull Function0<String> peekString, @NotNull Function0<Unit> onEnumCoercing) {
        String enumValue;
        Intrinsics.checkNotNullParameter($this$tryCoerceValue, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        Intrinsics.checkNotNullParameter(peekString, "peekString");
        Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        boolean isOptional = descriptor.isElementOptional(index);
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
        if (isOptional && !elementDescriptor.isNullable() && peekNull.invoke(true).booleanValue()) {
            return true;
        }
        if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
            if ((elementDescriptor.isNullable() && peekNull.invoke(false).booleanValue()) || (enumValue = peekString.invoke()) == null) {
                return false;
            }
            int enumIndex = getJsonNameIndex(elementDescriptor, $this$tryCoerceValue, enumValue);
            boolean coerceToNull = !$this$tryCoerceValue.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
            if (enumIndex != -3) {
                return false;
            }
            if (isOptional || coerceToNull) {
                onEnumCoercing.invoke();
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean ignoreUnknownKeys(@NotNull SerialDescriptor $this$ignoreUnknownKeys, @NotNull Json json) {
        boolean z;
        Intrinsics.checkNotNullParameter($this$ignoreUnknownKeys, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (!json.getConfiguration().getIgnoreUnknownKeys()) {
            Iterable $this$any$iv = $this$ignoreUnknownKeys.getAnnotations();
            if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
                Iterator it = $this$any$iv.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object element$iv = it.next();
                        Annotation it2 = (Annotation) element$iv;
                        if (it2 instanceof JsonIgnoreUnknownKeys) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
