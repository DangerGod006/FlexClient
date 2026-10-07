package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.jvm.JvmName;

/* JADX INFO: compiled from: Metadata.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/Metadata.class */
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(AnnotationRetention.RUNTIME)
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface Metadata {

    /* JADX INFO: compiled from: Metadata.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/Metadata$DefaultImpls.class */
    public static final class DefaultImpls {
        @Deprecated(message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.", level = DeprecationLevel.WARNING)
        public static /* synthetic */ void bv$annotations() {
        }

        @SinceKotlin(version = "1.2")
        public static /* synthetic */ void pn$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void xi$annotations() {
        }
    }

    @JvmName(name = "k")
    int k() default 1;

    @JvmName(name = "mv")
    int[] mv() default {};

    @JvmName(name = "bv")
    int[] bv() default {1, 0, 3};

    @JvmName(name = "d1")
    String[] d1() default {};

    @JvmName(name = "d2")
    String[] d2() default {};

    @JvmName(name = "xs")
    String xs() default "";

    @JvmName(name = "pn")
    String pn() default "";

    @JvmName(name = "xi")
    int xi() default 0;
}
