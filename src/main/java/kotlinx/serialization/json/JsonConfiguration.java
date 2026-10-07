package kotlinx.serialization.json;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.json.internal.ReaderJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonConfiguration.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonConfiguration.class */
public final class JsonConfiguration {
    private final boolean encodeDefaults;
    private final boolean ignoreUnknownKeys;
    private final boolean isLenient;
    private final boolean allowStructuredMapKeys;
    private final boolean prettyPrint;
    private final boolean explicitNulls;

    @NotNull
    private final String prettyPrintIndent;
    private final boolean coerceInputValues;
    private final boolean useArrayPolymorphism;

    @NotNull
    private final String classDiscriminator;
    private final boolean allowSpecialFloatingPointValues;
    private final boolean useAlternativeNames;

    @Nullable
    private final JsonNamingStrategy namingStrategy;
    private final boolean decodeEnumsCaseInsensitive;
    private final boolean allowTrailingComma;
    private final boolean allowComments;

    @NotNull
    private ClassDiscriminatorMode classDiscriminatorMode;

    @ExperimentalSerializationApi
    public static /* synthetic */ void getPrettyPrintIndent$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getNamingStrategy$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getDecodeEnumsCaseInsensitive$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAllowTrailingComma$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAllowComments$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
    }

    public JsonConfiguration() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
    }

    public JsonConfiguration(boolean encodeDefaults, boolean ignoreUnknownKeys, boolean isLenient, boolean allowStructuredMapKeys, boolean prettyPrint, boolean explicitNulls, @NotNull String prettyPrintIndent, boolean coerceInputValues, boolean useArrayPolymorphism, @NotNull String classDiscriminator, boolean allowSpecialFloatingPointValues, boolean useAlternativeNames, @Nullable JsonNamingStrategy namingStrategy, boolean decodeEnumsCaseInsensitive, boolean allowTrailingComma, boolean allowComments, @NotNull ClassDiscriminatorMode classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.encodeDefaults = encodeDefaults;
        this.ignoreUnknownKeys = ignoreUnknownKeys;
        this.isLenient = isLenient;
        this.allowStructuredMapKeys = allowStructuredMapKeys;
        this.prettyPrint = prettyPrint;
        this.explicitNulls = explicitNulls;
        this.prettyPrintIndent = prettyPrintIndent;
        this.coerceInputValues = coerceInputValues;
        this.useArrayPolymorphism = useArrayPolymorphism;
        this.classDiscriminator = classDiscriminator;
        this.allowSpecialFloatingPointValues = allowSpecialFloatingPointValues;
        this.useAlternativeNames = useAlternativeNames;
        this.namingStrategy = namingStrategy;
        this.decodeEnumsCaseInsensitive = decodeEnumsCaseInsensitive;
        this.allowTrailingComma = allowTrailingComma;
        this.allowComments = allowComments;
        this.classDiscriminatorMode = classDiscriminatorMode;
    }

    public /* synthetic */ JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, JsonNamingStrategy jsonNamingStrategy, boolean z11, boolean z12, boolean z13, ClassDiscriminatorMode classDiscriminatorMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & Uuid.SIZE_BITS) != 0 ? false : z7, (i & 256) != 0 ? false : z8, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "type" : str2, (i & 1024) != 0 ? false : z9, (i & 2048) != 0 ? true : z10, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : jsonNamingStrategy, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? false : z11, (i & ReaderJsonLexerKt.BATCH_SIZE) != 0 ? false : z12, (i & 32768) != 0 ? false : z13, (i & 65536) != 0 ? ClassDiscriminatorMode.POLYMORPHIC : classDiscriminatorMode);
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.ignoreUnknownKeys;
    }

    public final boolean isLenient() {
        return this.isLenient;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.allowStructuredMapKeys;
    }

    public final boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    public final boolean getExplicitNulls() {
        return this.explicitNulls;
    }

    @NotNull
    public final String getPrettyPrintIndent() {
        return this.prettyPrintIndent;
    }

    public final boolean getCoerceInputValues() {
        return this.coerceInputValues;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.useArrayPolymorphism;
    }

    @NotNull
    public final String getClassDiscriminator() {
        return this.classDiscriminator;
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.allowSpecialFloatingPointValues;
    }

    public final boolean getUseAlternativeNames() {
        return this.useAlternativeNames;
    }

    @Nullable
    public final JsonNamingStrategy getNamingStrategy() {
        return this.namingStrategy;
    }

    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.decodeEnumsCaseInsensitive;
    }

    public final boolean getAllowTrailingComma() {
        return this.allowTrailingComma;
    }

    public final boolean getAllowComments() {
        return this.allowComments;
    }

    @NotNull
    public final ClassDiscriminatorMode getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    @Deprecated(message = "JsonConfiguration is not meant to be mutable, and will be made read-only in a future release. The `Json(from = ...) {}` copy builder should be used instead.", level = DeprecationLevel.ERROR)
    public final void setClassDiscriminatorMode(@NotNull ClassDiscriminatorMode classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "<set-?>");
        this.classDiscriminatorMode = classDiscriminatorMode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsonConfiguration(encodeDefaults=").append(this.encodeDefaults).append(", ignoreUnknownKeys=").append(this.ignoreUnknownKeys).append(", isLenient=").append(this.isLenient).append(", allowStructuredMapKeys=").append(this.allowStructuredMapKeys).append(", prettyPrint=").append(this.prettyPrint).append(", explicitNulls=").append(this.explicitNulls).append(", prettyPrintIndent='").append(this.prettyPrintIndent).append("', coerceInputValues=").append(this.coerceInputValues).append(", useArrayPolymorphism=").append(this.useArrayPolymorphism).append(", classDiscriminator='").append(this.classDiscriminator).append("', allowSpecialFloatingPointValues=").append(this.allowSpecialFloatingPointValues).append(", useAlternativeNames=");
        sb.append(this.useAlternativeNames).append(", namingStrategy=").append(this.namingStrategy).append(", decodeEnumsCaseInsensitive=").append(this.decodeEnumsCaseInsensitive).append(", allowTrailingComma=").append(this.allowTrailingComma).append(", allowComments=").append(this.allowComments).append(", classDiscriminatorMode=").append(this.classDiscriminatorMode).append(')');
        return sb.toString();
    }
}
