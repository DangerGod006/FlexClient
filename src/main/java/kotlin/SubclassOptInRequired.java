package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;

/* JADX INFO: compiled from: OptIn.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/SubclassOptInRequired.class */
@Target({ElementType.TYPE})
@SinceKotlin(version = "2.1")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@WasExperimental(markerClass = {ExperimentalSubclassOptIn.class})
public @interface SubclassOptInRequired {
    Class<? extends Annotation>[] markerClass();
}
