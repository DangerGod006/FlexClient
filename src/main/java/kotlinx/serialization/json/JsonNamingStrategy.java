package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNamingStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonNamingStrategy.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonNamingStrategy.class */
@ExperimentalSerializationApi
public interface JsonNamingStrategy {

    @NotNull
    public static final Builtins Builtins = Builtins.$$INSTANCE;

    @NotNull
    String serialNameForJson(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull String str);

    /* JADX INFO: compiled from: JsonNamingStrategy.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonNamingStrategy$Builtins.class */
    @ExperimentalSerializationApi
    public static final class Builtins {
        static final /* synthetic */ Builtins $$INSTANCE = new Builtins();

        @NotNull
        private static final JsonNamingStrategy SnakeCase = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$SnakeCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public String serialNameForJson(SerialDescriptor descriptor, int elementIndex, String serialName) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serialName, "serialName");
                return JsonNamingStrategy.Builtins.$$INSTANCE.convertCamelCase(serialName, '_');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        };

        @NotNull
        private static final JsonNamingStrategy KebabCase = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$KebabCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public String serialNameForJson(SerialDescriptor descriptor, int elementIndex, String serialName) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serialName, "serialName");
                return JsonNamingStrategy.Builtins.$$INSTANCE.convertCamelCase(serialName, '-');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        };

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSnakeCase$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getKebabCase$annotations() {
        }

        private Builtins() {
        }

        @NotNull
        public final JsonNamingStrategy getSnakeCase() {
            return SnakeCase;
        }

        @NotNull
        public final JsonNamingStrategy getKebabCase() {
            return KebabCase;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String convertCamelCase(String serialName, char delimiter) {
            StringBuilder $this$convertCamelCase_u24lambda_u241 = new StringBuilder(serialName.length() * 2);
            Character chValueOf = null;
            int previousUpperCharsCount = 0;
            String $this$forEach$iv = serialName;
            for (int i = 0; i < $this$forEach$iv.length(); i++) {
                char element$iv = $this$forEach$iv.charAt(i);
                if (Character.isUpperCase(element$iv)) {
                    if (previousUpperCharsCount == 0) {
                        if (($this$convertCamelCase_u24lambda_u241.length() > 0) && StringsKt.last($this$convertCamelCase_u24lambda_u241) != delimiter) {
                            $this$convertCamelCase_u24lambda_u241.append(delimiter);
                        }
                    }
                    Character ch = chValueOf;
                    if (ch != null) {
                        char p0 = ch.charValue();
                        $this$convertCamelCase_u24lambda_u241.append(p0);
                    }
                    previousUpperCharsCount++;
                    chValueOf = Character.valueOf(Character.toLowerCase(element$iv));
                } else {
                    if (chValueOf != null) {
                        if (previousUpperCharsCount > 1 && Character.isLetter(element$iv)) {
                            $this$convertCamelCase_u24lambda_u241.append(delimiter);
                        }
                        $this$convertCamelCase_u24lambda_u241.append(chValueOf.charValue());
                        previousUpperCharsCount = 0;
                        chValueOf = null;
                    }
                    $this$convertCamelCase_u24lambda_u241.append(element$iv);
                }
            }
            if (chValueOf != null) {
                $this$convertCamelCase_u24lambda_u241.append(chValueOf.charValue());
            }
            return $this$convertCamelCase_u24lambda_u241.toString();
        }
    }
}
