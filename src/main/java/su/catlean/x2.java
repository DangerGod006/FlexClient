package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/x2.class */
public final /* synthetic */ class x2 {
    public static final int[] N;
    public static final int[] V;
    private static int[] W;

    static {
        long jA = yz.a(-5754272858510067567L, 7660310438428181429L, MethodHandles.lookup().lookupClass()).a(62896063864868L) ^ 13098108270956L;
        int[] iArr = new int[fb.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[2], -8750728167761357216L, jA) /* invoke-custom */;
        try {
            iArr[fb.SEQUENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[fb.VANILLA.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[fb.GRIM.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        N = iArr;
        int[] iArr2 = new int[mq.values().length];
        try {
            iArr2[mq.Inventory.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr2[mq.Normal.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
        }
        try {
            iArr2[mq.Silent.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
        }
        V = iArr2;
    }

    public static void o(int[] iArr) {
        W = iArr;
    }

    public static int[] U() {
        return W;
    }
}
