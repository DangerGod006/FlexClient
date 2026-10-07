package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: ReturnValue.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/MustUseReturnValue.class */
@Target({ElementType.TYPE})
@SinceKotlin(version = "2.2")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FILE, AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface MustUseReturnValue {
}
