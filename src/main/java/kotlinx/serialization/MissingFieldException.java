package kotlinx.serialization;

import java.util.List;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/MissingFieldException.class */
@ExperimentalSerializationApi
public final class MissingFieldException extends SerializationException {

    @NotNull
    private final List<String> missingFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull List<String> missingFields, @Nullable String message, @Nullable Throwable cause) {
        super(message, cause);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.missingFields = missingFields;
    }

    @NotNull
    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull List<String> missingFields, @NotNull String serialName) {
        this(missingFields, missingFields.size() == 1 ? "Field '" + missingFields.get(0) + "' is required for type with serial name '" + serialName + "', but it was missing" : "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing", null);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull String missingField, @NotNull String serialName) {
        this(CollectionsKt.listOf(missingField), "Field '" + missingField + "' is required for type with serial name '" + serialName + "', but it was missing", null);
        Intrinsics.checkNotNullParameter(missingField, "missingField");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public MissingFieldException(@NotNull String missingField) {
        this(CollectionsKt.listOf(missingField), "Field '" + missingField + "' is required, but it was missing", null);
        Intrinsics.checkNotNullParameter(missingField, "missingField");
    }
}
