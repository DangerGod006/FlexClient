package kotlinx.serialization;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/UseContextualSerialization.class */
@Target({})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FILE})
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface UseContextualSerialization {
    Class<?>[] forClasses();
}
