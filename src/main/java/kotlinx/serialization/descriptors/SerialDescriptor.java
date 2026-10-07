package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.SubclassOptInRequired;
import kotlin.collections.CollectionsKt;
import kotlinx.serialization.SealedSerializationApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/SerialDescriptor.class */
@SubclassOptInRequired(markerClass = {SealedSerializationApi.class})
public interface SerialDescriptor {
    @NotNull
    String getSerialName();

    @NotNull
    SerialKind getKind();

    int getElementsCount();

    @NotNull
    String getElementName(int i);

    int getElementIndex(@NotNull String str);

    @NotNull
    List<Annotation> getElementAnnotations(int i);

    @NotNull
    SerialDescriptor getElementDescriptor(int i);

    boolean isElementOptional(int i);

    /* JADX INFO: compiled from: SerialDescriptor.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/SerialDescriptor$DefaultImpls.class */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isNullable(@NotNull SerialDescriptor $this) {
            return $this.isNullable();
        }

        @Deprecated
        public static boolean isInline(@NotNull SerialDescriptor $this) {
            return $this.isInline();
        }

        @Deprecated
        @NotNull
        public static List<Annotation> getAnnotations(@NotNull SerialDescriptor $this) {
            return $this.getAnnotations();
        }
    }

    default boolean isNullable() {
        return false;
    }

    default boolean isInline() {
        return false;
    }

    @NotNull
    default List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }
}
