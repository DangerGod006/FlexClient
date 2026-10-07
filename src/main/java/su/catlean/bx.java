package su.catlean;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_3675;
import net.minecraft.class_408;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bx.class */
public final class bx {
    private static _g[] O;
    private static final long a = 0;
    private static final long b = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    public static final boolean k(short s, int i, char c, int i2) {
        long j = (((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) c) << 48) >>> 48)) ^ a;
        long j2 = j ^ 59609358565514L;
        ?? IsOnRenderThread = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6714778102093030859L, j) /* invoke-custom */;
        try {
            try {
                try {
                    IsOnRenderThread = RenderSystem.isOnRenderThread();
                    try {
                        try {
                            if (IsOnRenderThread != 0) {
                                return IsOnRenderThread;
                            }
                            if (IsOnRenderThread != 0) {
                                if (IsOnRenderThread != 0) {
                                    return i2;
                                }
                                if (i2 != -1) {
                                    boolean z = zf.F(j2).field_1755 instanceof class_408;
                                    ?? r1 = IsOnRenderThread;
                                    ?? r0 = z;
                                    ?? r02 = z;
                                    ?? r12 = r1;
                                    if (c >= 0) {
                                        if (r1 == 0) {
                                            if (!z) {
                                                r0 = i2;
                                            }
                                        }
                                        r12 = IsOnRenderThread;
                                        r02 = r0;
                                    }
                                    if (r12 != 0) {
                                        return r02;
                                    }
                                    try {
                                        try {
                                            return r02 < ((int) b) ? iq.a.u().contains(Integer.valueOf((int) i2)) : class_3675.method_15987(zf.F(j2).method_22683(), (int) i2);
                                        } catch (NumberFormatException unused) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 6686920410364382699L, j) /* invoke-custom */;
                                        }
                                    } catch (NumberFormatException unused2) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 6686920410364382699L, j) /* invoke-custom */;
                                    }
                                }
                            }
                            return false;
                        } catch (NumberFormatException unused3) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsOnRenderThread, 6686920410364382699L, j) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused4) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsOnRenderThread, 6686920410364382699L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused5) {
                    IsOnRenderThread = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsOnRenderThread, 6686920410364382699L, j) /* invoke-custom */;
                    throw IsOnRenderThread;
                }
            } catch (NumberFormatException unused6) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsOnRenderThread, 6686920410364382699L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused7) {
            IsOnRenderThread = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsOnRenderThread, 6686920410364382699L, j) /* invoke-custom */;
            throw IsOnRenderThread;
        }
    }

    public static void t(_g[] _gVarArr) {
        O = _gVarArr;
    }

    public static _g[] O() {
        return O;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
