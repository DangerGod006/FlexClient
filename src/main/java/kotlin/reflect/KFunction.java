package kotlin.reflect;

import kotlin.Function;
import kotlin.SinceKotlin;

/* JADX INFO: compiled from: KFunction.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KFunction.class */
public interface KFunction<R> extends KCallable<R>, Function<R> {

    /* JADX INFO: compiled from: KFunction.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KFunction$DefaultImpls.class */
    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isInline$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isExternal$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isOperator$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isInfix$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isSuspend$annotations() {
        }
    }

    boolean isInline();

    boolean isExternal();

    boolean isOperator();

    boolean isInfix();

    @Override // kotlin.reflect.KCallable
    boolean isSuspend();
}
