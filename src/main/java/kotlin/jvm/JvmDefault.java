package kotlin.jvm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: JvmDefault.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/JvmDefault.class */
@Target({ElementType.METHOD})
@SinceKotlin(version = "1.2")
@Deprecated(message = "Switch to new -jvm-default modes: `enable` or `no-compatibility`", level = DeprecationLevel.HIDDEN)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Retention(RetentionPolicy.RUNTIME)
public @interface JvmDefault {
}
