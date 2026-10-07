package kotlin.reflect;

import java.util.List;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KType.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KType.class */
public interface KType extends KAnnotatedElement {

    /* JADX INFO: compiled from: KType.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KType$DefaultImpls.class */
    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void getClassifier$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void getArguments$annotations() {
        }
    }

    @Nullable
    KClassifier getClassifier();

    @NotNull
    List<KTypeProjection> getArguments();

    boolean isMarkedNullable();
}
