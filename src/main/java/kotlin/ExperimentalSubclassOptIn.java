package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;

/* JADX INFO: compiled from: OptIn.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ExperimentalSubclassOptIn.class */
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.8")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@RequiresOptIn
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface ExperimentalSubclassOptIn {
}
