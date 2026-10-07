package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/m5.class */
public final class m5 {
    private static int[] T;

    private m5() {
    }

    @NotNull
    public final mp G() {
        return new mp();
    }

    public m5(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    public static void S(int[] iArr) {
        T = iArr;
    }

    public static int[] Q() {
        return T;
    }

    static {
        long jA = yz.a(-6996991034192595003L, -5070519483118889662L, MethodHandles.lookup().lookupClass()).a(239622729392465L) ^ 8800590876568L;
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(9034819512191048151L, jA) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[1], 9041089309347127259L, jA) /* invoke-custom */;
        }
    }
}
