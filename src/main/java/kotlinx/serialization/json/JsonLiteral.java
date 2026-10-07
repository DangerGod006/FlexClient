package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.StringOpsKt;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonLiteral.class */
public final class JsonLiteral extends JsonPrimitive {
    private final boolean isString;

    @Nullable
    private final SerialDescriptor coerceToInlineType;

    @NotNull
    private final String content;

    public /* synthetic */ JsonLiteral(Object obj, boolean z, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean isString() {
        return this.isString;
    }

    @Nullable
    public final SerialDescriptor getCoerceToInlineType$kotlinx_serialization_json() {
        return this.coerceToInlineType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonLiteral(@NotNull Object body, boolean isString, @Nullable SerialDescriptor coerceToInlineType) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.isString = isString;
        this.coerceToInlineType = coerceToInlineType;
        this.content = body.toString();
        if (this.coerceToInlineType != null && !this.coerceToInlineType.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String getContent() {
        return this.content;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String toString() {
        if (isString()) {
            StringBuilder $this$toString_u24lambda_u240 = new StringBuilder();
            StringOpsKt.printQuoted($this$toString_u24lambda_u240, getContent());
            return $this$toString_u24lambda_u240.toString();
        }
        return getContent();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return isString() == ((JsonLiteral) other).isString() && Intrinsics.areEqual(getContent(), ((JsonLiteral) other).getContent());
    }

    @SuppressAnimalSniffer
    public int hashCode() {
        int result = Boolean.hashCode(isString());
        return (31 * result) + getContent().hashCode();
    }
}
