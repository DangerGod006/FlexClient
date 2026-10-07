package kotlin.jvm;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;

/* JADX INFO: compiled from: JvmFlagAnnotations.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/JvmSerializableLambda.class */
@Target({})
@SinceKotlin(version = "1.8")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.EXPRESSION})
@Retention(AnnotationRetention.SOURCE)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface JvmSerializableLambda {
}
