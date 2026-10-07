package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

/* JADX INFO: compiled from: ReturnValue.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/IgnorableReturnValue.class */
@Target({ElementType.METHOD})
@MustBeDocumented
@SinceKotlin(version = "2.2")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnorableReturnValue {
}
