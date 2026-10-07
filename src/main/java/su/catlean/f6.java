package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/f6.class */
public abstract class f6 {
    private static String A;

    public abstract void o(long j, @NotNull class_332 class_332Var, float f, float f2, float f3, float f4);

    public abstract boolean P(float f, float f2, int i, long j);

    public static void g(String str) {
        A = str;
    }

    public static String y() {
        return A;
    }

    static {
        long jA = yz.a(-2157639003040347616L, 4819509655162878365L, MethodHandles.lookup().lookupClass()).a(8263599846934L) ^ 138782447743048L;
        if ((String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8734707789718074345L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("NX38s", 8768109295696439104L, jA) /* invoke-custom */;
        }
    }
}
