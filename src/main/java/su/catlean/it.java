package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1304;
import net.minecraft.class_1322;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/it.class */
public final /* synthetic */ class it {
    public static final int[] C;
    public static final int[] l;
    private static int[] t;

    static {
        long jA = yz.a(-5274999213636242509L, -1873037450010107066L, MethodHandles.lookup().lookupClass()).a(205484714076169L) ^ 22775655167498L;
        int[] iArr = new int[class_1304.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 5620884583187413771L, jA) /* invoke-custom */;
        try {
            iArr[class_1304.field_6169.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[class_1304.field_48824.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[class_1304.field_6172.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[class_1304.field_6166.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        C = iArr;
        int[] iArr2 = new int[class_1322.class_1323.values().length];
        try {
            iArr2[class_1322.class_1323.field_6328.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            iArr2[class_1322.class_1323.field_6330.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
        try {
            iArr2[class_1322.class_1323.field_6331.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
        }
        l = iArr2;
    }

    public static void I(int[] iArr) {
        t = iArr;
    }

    public static int[] U() {
        return t;
    }
}
