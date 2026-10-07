package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import net.minecraft.class_2350;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/y7.class */
public final /* synthetic */ class y7 {
    public static final EnumEntries b;
    private static String x;

    static {
        long jA = yz.a(-555114785115173781L, 5221349638151657294L, MethodHandles.lookup().lookupClass()).a(82272977165517L) ^ 99920716814214L;
        b = EnumEntriesKt.enumEntries(class_2350.values());
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 2386593419600910249L, jA) /* invoke-custom */;
    }

    public static void A(String str) {
        x = str;
    }

    public static String r() {
        return x;
    }
}
