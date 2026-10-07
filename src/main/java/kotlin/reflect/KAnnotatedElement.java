package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KAnnotatedElement.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KAnnotatedElement.class */
public interface KAnnotatedElement {
    @NotNull
    List<Annotation> getAnnotations();
}
