package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KClass.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KClass.class */
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {

    /* JADX INFO: compiled from: KClass.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KClass$DefaultImpls.class */
    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void getTypeParameters$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void getSupertypes$annotations() {
        }

        @SinceKotlin(version = "1.3")
        public static /* synthetic */ void getSealedSubclasses$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void getVisibility$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isFinal$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isOpen$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isAbstract$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isSealed$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isData$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isInner$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isCompanion$annotations() {
        }

        @SinceKotlin(version = "1.4")
        public static /* synthetic */ void isFun$annotations() {
        }

        @SinceKotlin(version = "1.5")
        public static /* synthetic */ void isValue$annotations() {
        }
    }

    @Nullable
    String getSimpleName();

    @Nullable
    String getQualifiedName();

    @Override // kotlin.reflect.KDeclarationContainer
    @NotNull
    Collection<KCallable<?>> getMembers();

    @NotNull
    Collection<KFunction<T>> getConstructors();

    @NotNull
    Collection<KClass<?>> getNestedClasses();

    @Nullable
    T getObjectInstance();

    @SinceKotlin(version = "1.1")
    boolean isInstance(@Nullable Object obj);

    @NotNull
    List<KTypeParameter> getTypeParameters();

    @NotNull
    List<KType> getSupertypes();

    @NotNull
    List<KClass<? extends T>> getSealedSubclasses();

    @Nullable
    KVisibility getVisibility();

    boolean isFinal();

    boolean isOpen();

    boolean isAbstract();

    boolean isSealed();

    boolean isData();

    boolean isInner();

    boolean isCompanion();

    boolean isFun();

    boolean isValue();

    boolean equals(@Nullable Object obj);

    int hashCode();
}
