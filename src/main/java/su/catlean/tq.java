package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickFactorEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/tq.class */
public final class tq implements ym {

    @NotNull
    public static final tq I;
    private static float x;
    private static int[] Z;
    private static final long a = yz.a(5900562588817714538L, 1933864321093250690L, MethodHandles.lookup().lookupClass()).a(258707700523382L);

    private tq() {
    }

    public final float C() {
        return x;
    }

    public final void h(float f) {
        x = f;
    }

    public final void x(float t) {
        x = t;
    }

    @Flow(priority = 20)
    private final void G(PlayerUpdateEvent playerUpdateEvent) {
        x(1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Flow
    private final void P(TickFactorEvent tickFactorEvent) {
        long j = a ^ 67935419293951L;
        ?? r0 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7899775687742140041L, j) /* invoke-custom */;
        try {
            r0 = (x > 1.0f ? 1 : (x == 1.0f ? 0 : -1));
            ?? r02 = r0;
            if (r0 != 0) {
                r02 = r0 == 0 ? 1 : 0;
            }
            if (r02 != 0) {
                return;
            }
            tickFactorEvent.setFactor(x);
            tickFactorEvent.cancel();
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -7842505503459493723L, j) /* invoke-custom */;
        }
    }

    static {
        long j = a ^ 132243420625537L;
        I = new tq();
        x = 1.0f;
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[5], 5282891642635682769L, j) /* invoke-custom */;
    }

    public static void t(int[] iArr) {
        Z = iArr;
    }

    public static int[] b() {
        return Z;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
